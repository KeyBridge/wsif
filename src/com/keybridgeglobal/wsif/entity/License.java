//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity;

import com.keybridgeglobal.wsif.enumerated.EnumWsifDataSource;
import com.keybridgeglobal.wsif.enumerated.EnumWsifWirelessServiceType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for license complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="license">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="callSign" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="licenseeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dateGrant" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dateExpire" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dateCreated" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dateLastUpdated" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dataSource" type="{}enumWsifDataSource" />
 *       &lt;attribute name="wirelessServiceType" use="required" type="{}enumWsifWirelessServiceType" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "license")
public class License {

    @XmlAttribute(name = "callSign", required = true)
    protected String callSign;
    @XmlAttribute(name = "licenseeName")
    protected String licenseeName;
    @XmlAttribute(name = "dateGrant", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateGrant;
    @XmlAttribute(name = "dateExpire", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExpire;
    @XmlAttribute(name = "dateCreated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlAttribute(name = "dateLastUpdated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastUpdated;
    @XmlAttribute(name = "dataSource")
    protected EnumWsifDataSource dataSource;
    @XmlAttribute(name = "wirelessServiceType", required = true)
    protected EnumWsifWirelessServiceType wirelessServiceType;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the callSign property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCallSign() {
        return callSign;
    }

    /**
     * Sets the value of the callSign property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCallSign(String value) {
        this.callSign = value;
    }

    /**
     * Gets the value of the licenseeName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLicenseeName() {
        return licenseeName;
    }

    /**
     * Sets the value of the licenseeName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLicenseeName(String value) {
        this.licenseeName = value;
    }

    /**
     * Gets the value of the dateGrant property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateGrant() {
        return dateGrant;
    }

    /**
     * Sets the value of the dateGrant property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateGrant(XMLGregorianCalendar value) {
        this.dateGrant = value;
    }

    /**
     * Gets the value of the dateExpire property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateExpire() {
        return dateExpire;
    }

    /**
     * Sets the value of the dateExpire property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateExpire(XMLGregorianCalendar value) {
        this.dateExpire = value;
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

    /**
     * Gets the value of the dataSource property.
     *
     * @return
     *     possible object is
     *     {@link EnumWsifDataSource }
     *
     */
    public EnumWsifDataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     *
     * @param value
     *     allowed object is
     *     {@link EnumWsifDataSource }
     *
     */
    public void setDataSource(EnumWsifDataSource value) {
        this.dataSource = value;
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

}
