//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.22 a las 02:56:33 PM CDT 
//


package org.example.proyectometro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="idBoleto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaPartida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estacionOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estacionDestino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elegirVagon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ingresaMetodoPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idBoleto",
    "fechaPartida",
    "estacionOrigen",
    "estacionDestino",
    "elegirVagon",
    "ingresaMetodoPago"
})
@XmlRootElement(name = "ComprarBoletoRequest")
public class ComprarBoletoRequest {

    protected int idBoleto;
    @XmlElement(required = true)
    protected String fechaPartida;
    @XmlElement(required = true)
    protected String estacionOrigen;
    @XmlElement(required = true)
    protected String estacionDestino;
    @XmlElement(required = true)
    protected String elegirVagon;
    @XmlElement(required = true)
    protected String ingresaMetodoPago;

    /**
     * Obtiene el valor de la propiedad idBoleto.
     * 
     */
    public int getIdBoleto() {
        return idBoleto;
    }

    /**
     * Define el valor de la propiedad idBoleto.
     * 
     */
    public void setIdBoleto(int value) {
        this.idBoleto = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPartida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPartida() {
        return fechaPartida;
    }

    /**
     * Define el valor de la propiedad fechaPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPartida(String value) {
        this.fechaPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad estacionOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstacionOrigen() {
        return estacionOrigen;
    }

    /**
     * Define el valor de la propiedad estacionOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstacionOrigen(String value) {
        this.estacionOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad estacionDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstacionDestino() {
        return estacionDestino;
    }

    /**
     * Define el valor de la propiedad estacionDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstacionDestino(String value) {
        this.estacionDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad elegirVagon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElegirVagon() {
        return elegirVagon;
    }

    /**
     * Define el valor de la propiedad elegirVagon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElegirVagon(String value) {
        this.elegirVagon = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresaMetodoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngresaMetodoPago() {
        return ingresaMetodoPago;
    }

    /**
     * Define el valor de la propiedad ingresaMetodoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngresaMetodoPago(String value) {
        this.ingresaMetodoPago = value;
    }

}
