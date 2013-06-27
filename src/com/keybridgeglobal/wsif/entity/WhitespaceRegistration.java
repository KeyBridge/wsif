//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity;

import com.keybridgeglobal.wsif.enumerated.EnumWsifWhitespaceType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for whitespaceRegistration complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="whitespaceRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channelList" type="{}channel" maxOccurs="unbounded"/>
 *         &lt;element ref="{}schedule"/>
 *         &lt;element ref="{}geometry"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="adjacent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="whitespaceType" use="required" type="{}enumWsifWhitespaceType" />
 *       &lt;attribute name="dateCreated" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dateLastUpdated" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "whitespaceRegistration", propOrder = {
    "channelList",
    "schedule",
    "geometry",
    "extension"
})
public class WhitespaceRegistration {

    @XmlElement(required = true)
    protected List<Channel> channelList;
    @XmlElement(required = true)
    protected Schedule schedule;
    @XmlElement(required = true)
    protected Geometry geometry;
    protected String extension;
    @XmlAttribute(name = "uuid", required = true)
    protected String uuid;
    @XmlAttribute(name = "adjacent", required = true)
    protected boolean adjacent;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "whitespaceType", required = true)
    protected EnumWsifWhitespaceType whitespaceType;
    @XmlAttribute(name = "dateCreated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlAttribute(name = "dateLastUpdated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastUpdated;

    /**
     * Gets the value of the channelList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Channel }
     *
     *
     */
    public List<Channel> getChannelList() {
        if (channelList == null) {
            channelList = new ArrayList<Channel>();
        }
        return this.channelList;
    }

    /**
     * Gets the value of the schedule property.
     *
     * @return
     *     possible object is
     *     {@link Schedule }
     *
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     *
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *
     */
    public void setSchedule(Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the geometry property.
     *
     * @return
     *     possible object is
     *     {@link Geometry }
     *
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     *
     * @param value
     *     allowed object is
     *     {@link Geometry }
     *
     */
    public void setGeometry(Geometry value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the uuid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the adjacent property.
     *
     */
    public boolean isAdjacent() {
        return adjacent;
    }

    /**
     * Sets the value of the adjacent property.
     *
     */
    public void setAdjacent(boolean value) {
        this.adjacent = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the whitespaceType property.
     *
     * @return
     *     possible object is
     *     {@link EnumWsifWhitespaceType }
     *
     */
    public EnumWsifWhitespaceType getWhitespaceType() {
        return whitespaceType;
    }

    /**
     * Sets the value of the whitespaceType property.
     *
     * @param value
     *     allowed object is
     *     {@link EnumWsifWhitespaceType }
     *
     */
    public void setWhitespaceType(EnumWsifWhitespaceType value) {
        this.whitespaceType = value;
    }

    /**
     * Gets the value of the dateCreated property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the dateLastUpdated property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateLastUpdated() {
        return dateLastUpdated;
    }

    /**
     * Sets the value of the dateLastUpdated property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateLastUpdated(XMLGregorianCalendar value) {
        this.dateLastUpdated = value;
    }

}