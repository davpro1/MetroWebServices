//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.03 a las 11:24:39 PM CST 
//


package org.example.metrov2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NuevafechaPartida" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NuevaEstacionOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NuevaEstacionDestino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NuevoVagon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NuevoMetodoPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nuevafechaPartida",
    "nuevaEstacionOrigen",
    "nuevaEstacionDestino",
    "nuevoVagon",
    "nuevoMetodoPago"
})
@XmlRootElement(name = "EditarBoletoRequest")
public class EditarBoletoRequest {

    @XmlElement(name = "NuevafechaPartida", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nuevafechaPartida;
    @XmlElement(name = "NuevaEstacionOrigen", required = true)
    protected String nuevaEstacionOrigen;
    @XmlElement(name = "NuevaEstacionDestino", required = true)
    protected String nuevaEstacionDestino;
    @XmlElement(name = "NuevoVagon", required = true)
    protected String nuevoVagon;
    @XmlElement(name = "NuevoMetodoPago", required = true)
    protected String nuevoMetodoPago;

    /**
     * Obtiene el valor de la propiedad nuevafechaPartida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNuevafechaPartida() {
        return nuevafechaPartida;
    }

    /**
     * Define el valor de la propiedad nuevafechaPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNuevafechaPartida(XMLGregorianCalendar value) {
        this.nuevafechaPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevaEstacionOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaEstacionOrigen() {
        return nuevaEstacionOrigen;
    }

    /**
     * Define el valor de la propiedad nuevaEstacionOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaEstacionOrigen(String value) {
        this.nuevaEstacionOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevaEstacionDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaEstacionDestino() {
        return nuevaEstacionDestino;
    }

    /**
     * Define el valor de la propiedad nuevaEstacionDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaEstacionDestino(String value) {
        this.nuevaEstacionDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoVagon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoVagon() {
        return nuevoVagon;
    }

    /**
     * Define el valor de la propiedad nuevoVagon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoVagon(String value) {
        this.nuevoVagon = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoMetodoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoMetodoPago() {
        return nuevoMetodoPago;
    }

    /**
     * Define el valor de la propiedad nuevoMetodoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoMetodoPago(String value) {
        this.nuevoMetodoPago = value;
    }

}
