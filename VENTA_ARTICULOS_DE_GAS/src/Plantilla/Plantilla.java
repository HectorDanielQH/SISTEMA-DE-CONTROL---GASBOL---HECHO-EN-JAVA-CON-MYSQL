
package Plantilla;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import model.Conexion;

/**
 *
 * @author Navi
 */
public class Plantilla extends Conexion
{
    String SQL="select *  from VENTAS_HECHAS_IMPRIMIR_PDF where NUM_VENTA = ";
    String nombreDirector;
    String fecha;
    String rutaImagen;
    int parametro_entero=0;
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public Plantilla(int Parametro)
    {
        super();
        this.rutaImagen ="C:\\users\\hp\\documents\\NO_BORRAR\\LOGO.jpg";
        //this.rutaImagen ="C:\\users\\hdani\\desktop\\LOGO.jpg";
        documento = new Document();
        parametro_entero=Parametro;
        SQL+= Parametro+";";
    }
    
    public void crearPlantilla(){
        int numero_proforma=1;
        try 
        {
            archivo = new FileOutputStream("ReporteProforma.pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();

            Image image = null;
            try {
                image =  Image.getInstance(rutaImagen);//carga imagen
                image.scaleAbsolute(560, 100);//cambia tamaño
                image.setAbsolutePosition(25,730);//coloca imagen en la posicion
                
            } catch (Exception e) {
            }
            
            documento.add(image);//agrega la imagen al documento
            documento.add(new Paragraph(" "));    
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph(" \n"));
            documento.add(Chunk.NEWLINE);
            
            String CI="",NOMBRE="",FECHA="";
            try
            {
                Statement st=this.Conexion.createStatement();
                ResultSet resultado=st.executeQuery(SQL);
                while(resultado.next())
                {
                    CI=resultado.getString(7);
                    NOMBRE=resultado.getString(8);
                    FECHA=resultado.getString(9);
                }
                
                String SQL2="select max(NUMERACION_VENTA.id) from NUMERACION_VENTA;";
                
                Statement st2=this.Conexion.createStatement();
                ResultSet resultado2=st2.executeQuery(SQL2);
                while(resultado2.next())
                {
                    numero_proforma=resultado2.getInt(1);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
            }
            
            
            documento.add(new Paragraph("C.I. / NIT : " + CI+"                                                                                N°0000"+numero_proforma));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("SEÑOR(ES) : " + NOMBRE));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("FECHA DE VENTA : " + FECHA));
            documento.add(Chunk.NEWLINE);
            String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
            documento.add(new Paragraph("FECHA DE EMISIÓN DE LA PROFORMA : " + timeStamp));
            documento.add(Chunk.NEWLINE);
            
            
            
            PdfPTable tabla = new PdfPTable(6);
            float[] medidaCeldas = {0.70f, 2.50f, 0.7f, 0.7f, 0.7f, 0.8f};
            tabla.setWidths(medidaCeldas);
            tabla.setWidthPercentage(100);
            PdfPCell COD_PROD = new PdfPCell(new Phrase("COD. PROD."));
            COD_PROD.setBackgroundColor(BaseColor.ORANGE);
            COD_PROD.setHorizontalAlignment(1);
            PdfPCell DESCRIPCION = new PdfPCell(new Phrase("DESCRIPCION"));           
            DESCRIPCION.setBackgroundColor(BaseColor.ORANGE);
            DESCRIPCION.setHorizontalAlignment(1);
            PdfPCell PRECIO = new PdfPCell(new Phrase("PRECIO"));
            PRECIO.setBackgroundColor(BaseColor.ORANGE);
            PRECIO.setHorizontalAlignment(1);
            PdfPCell CANTIDAD = new PdfPCell(new Phrase("CANT."));
            CANTIDAD.setBackgroundColor(BaseColor.ORANGE);
            CANTIDAD.setHorizontalAlignment(1);
            PdfPCell DESCUENTO = new PdfPCell(new Phrase("DESC."));
            DESCUENTO.setBackgroundColor(BaseColor.ORANGE);
            DESCUENTO.setHorizontalAlignment(1);
            PdfPCell TOTAL = new PdfPCell(new Phrase("SUB. TOTAL"));
            TOTAL.setBackgroundColor(BaseColor.ORANGE);
            TOTAL.setHorizontalAlignment(1);
            
            tabla.addCell(COD_PROD);
            tabla.addCell(DESCRIPCION);
            tabla.addCell(PRECIO);
            tabla.addCell(CANTIDAD);
            tabla.addCell(DESCUENTO);
            tabla.addCell(TOTAL);
            try
            {
                Statement st=this.Conexion.createStatement();
                ResultSet resultado=st.executeQuery(SQL);
                while(resultado.next())
                {
                    tabla.addCell(resultado.getString(1));
                    tabla.addCell(resultado.getString(2));
                    tabla.addCell(resultado.getString(3));
                    tabla.addCell(resultado.getString(4));
                    tabla.addCell(resultado.getString(5));
                    tabla.addCell(resultado.getString(6));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
            }
            
            try
            {
                SQL="select SUM(TOTAL) as FINAL from VENTAS_HECHAS_IMPRIMIR_PDF where NUM_VENTA = "+parametro_entero+";";
                Statement st=this.Conexion.createStatement();
                ResultSet resultado=st.executeQuery(SQL);
                while(resultado.next())
                {
                    tabla.addCell("");
                    tabla.addCell("");
                    tabla.addCell("");
                    tabla.addCell("");
                    tabla.addCell("TOTAL .- ");
                    tabla.addCell(resultado.getString(1));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
            }
            
            
            documento.add(tabla);          
            documento.add(Chunk.NEWLINE);
            
            
            
            
            
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo PDF se a creado correctamente!");
            
            try
            {
                File objetoFile=new File("ReporteProforma.pdf");
                Desktop.getDesktop().open(objetoFile);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch(DocumentException e){
            System.err.println(e.getMessage());
        }
        
    }
    
    
    
    
}
