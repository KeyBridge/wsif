//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity;

import com.keybridgeglobal.wsif.enumerated.EnumRegistrar;
import com.keybridgeglobal.wsif.enumerated.EnumWsifWirelessServiceType;
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
 * <p>Java class for wirelessService complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="wirelessService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}license"/>
 *         &lt;element name="contactList" type="{}contact" maxOccurs="unbounded"/>
 *         &lt;element name="stationList" type="{}station" maxOccurs="unbounded"/>
 *         &lt;element name="whitespaceRegistrationList" type="{}whitespaceRegistration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wirelessServiceType" use="required" type="{}enumWsifWirelessServiceType" />
 *       &lt;attribute name="registrar" use="required" type="{}enumRegistrar" />
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
@XmlType(name = "wirelessService", propOrder = {
    "extension",
    "license",
    "contactList",
    "stationList",
    "whitespaceRegistrationList"
})
public class WirelessService {

    protected String extension;
    @XmlElement(required = true)
    protected License license;
    @XmlElement(required = true)
    protected List<Contact> contactList;
    @XmlElement(required = true)
    protected List<Station> stationList;
    protected List<WhitespaceRegistration> whitespaceRegistrationList;
    @XmlAttribute(name = "uuid", required = true)
    protected String uuid;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "wirelessServiceType", required = true)
    protected EnumWsifWirelessServiceType wirelessServiceType;
    @XmlAttribute(name = "registrar", required = true)
    protected EnumRegistrar registrar;
    @XmlAttribute(name = "dateCreated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlAttribute(name = "dateLastUpdated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastUpdated;

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
     * Gets the value of the license property.
     *
     * @return
     *     possible object is
     *     {@link License }
     *
     */
    public License getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     *
     * @param value
     *     allowed object is
     *     {@link License }
     *
     */
    public void setLicense(License value) {
        this.license = value;
    }

    /**
     * Gets the value of the contactList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     *
     *
     */
    public List<Contact> getContactList() {
        if (contactList == null) {
            contactList = new ArrayList<Contact>();
        }
        return this.contactList;
    }

    /**
     * Gets the value of the stationList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Station }
     *
     *
     */
    public List<Station> getStationList() {
        if (stationList == null) {
            stationList = new ArrayList<Station>();
        }
        return this.stationList;
    }

    /**
     * Gets the value of the whitespaceRegistrationList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whitespaceRegistrationList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhitespaceRegistrationList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WhitespaceRegistration }
     *
     *
     */
    public List<WhitespaceRegistration> getWhitespaceRegistrationList() {
        if (whitespaceRegistrationList == null) {
            whitespaceRegistrationList = new ArrayList<WhitespaceRegistration>();
        }
        return this.whitespaceRegistrationList;
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
     * Gets the value of the wirelessServiceType property.
     *
     * @return
     *     possible object is
     *     {@link EnumWsifWirelessServiceType }
     *
     */
    public EnumWsifWirelessServiceType getWirelessServiceType() {
        return wirelessServiceType;
    }

    /**
     * Sets the value of the wirelessServiceType property.
     *
     * @param value
     *     allowed object is
     *     {@link EnumWsifWirelessServiceType }
     *
     */
    public void setWirelessServiceType(EnumWsifWirelessServiceType value) {
        this.wirelessServiceType = value;
    }

    /**
     * Gets the value of the registrar property.
     *
     * @return
     *     possible object is
     *     {@link EnumRegistrar }
     *
     */
    public EnumRegistrar getRegistrar() {
        return registrar;
    }

    /**
     * Sets the value of the registrar property.
     *
     * @param value
     *     allowed object is
     *     {@link EnumRegistrar }
     *
     */
    public void setRegistrar(EnumRegistrar value) {
        this.registrar = value;
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
