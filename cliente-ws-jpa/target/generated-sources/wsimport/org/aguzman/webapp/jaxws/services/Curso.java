
package org.aguzman.webapp.jaxws.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de curso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="curso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duraccion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="instructor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "curso", propOrder = {
    "descripcion",
    "duraccion",
    "id",
    "instructor",
    "nombre"
})
public class Curso {

    protected String descripcion;
    protected Double duraccion;
    protected Long id;
    protected String instructor;
    protected String nombre;

    /**
     * Obtém o valor da propriedade descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define o valor da propriedade descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtém o valor da propriedade duraccion.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDuraccion() {
        return duraccion;
    }

    /**
     * Define o valor da propriedade duraccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDuraccion(Double value) {
        this.duraccion = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade instructor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * Define o valor da propriedade instructor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructor(String value) {
        this.instructor = value;
    }

    /**
     * Obtém o valor da propriedade nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define o valor da propriedade nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
