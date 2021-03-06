//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity;

import com.keybridgeglobal.wsif.enumerated.EnumWsifGeocode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for location complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}address" minOccurs="0"/>
 *         &lt;element ref="{}coordinate" minOccurs="0"/>
 *         &lt;element name="geometry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="geocode" use="required" type="{}enumWsifGeocode" />
 *       &lt;attribute name="locationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "location", propOrder = {
    "address",
    "coordinate",
    "geometry"
})
public class Location {

    protected Address address;
    protected Coordinate coordinate;
    protected String geometry;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "geocode", required = true)
    protected EnumWsifGeocode geocode;
    @XmlAttribute(name = "locationType")
    protected String locationType;
    @XmlAttribute(name = "timeZone")
    protected String timeZone;

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link Address }
     *
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link Address }
     *
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the coordinate property.
     *
     * @return
     *     possible object is
     *     {@link Coordinate }
     *
     */
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * Sets the value of the coordinate property.
     *
     * @param value
     *     allowed object is
     *     {@link Coordinate }
     *
     */
    public void setCoordinate(Coordinate value) {
        this.coordinate = value;
    }

    /**
     * Gets the value of the geometry property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGeometry(String value) {
        this.geometry = value;
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
     * Gets the value of the geocode property.
     *
     * @return
     *     possible object is
     *     {@link EnumWsifGeocode }
     *
     */
    public EnumWsifGeocode getGeocode() {
        return geocode;
    }

    /**
     * Sets the value of the geocode property.
     *
     * @param value
     *     allowed object is
     *     {@link EnumWsifGeocode }
     *
     */
    public void setGeocode(EnumWsifGeocode value) {
        this.geocode = value;
    }

    /**
     * Gets the value of the locationType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the timeZone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

}
