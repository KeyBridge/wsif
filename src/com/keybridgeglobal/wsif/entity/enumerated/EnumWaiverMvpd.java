//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity.enumerated;

import com.keybridgeglobal.wsif.entity.Channel;
import com.keybridgeglobal.wsif.entity.Coordinate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumWaiverMvpd complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="enumWaiverMvpd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}channel"/>
 *         &lt;element ref="{}coordinate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="latDeg" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="latMin" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="latSec" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="latDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="lonDeg" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="lonMin" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="lonSec" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="lonDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="callSignRx" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enumWaiverMvpd", propOrder = {
    "channel",
    "coordinate"
})
public class EnumWaiverMvpd {

    @XmlElement(required = true)
    protected Channel channel;
    protected Coordinate coordinate;
    @XmlAttribute(name = "operator", required = true)
    protected String operator;
    @XmlAttribute(name = "latDeg", required = true)
    protected int latDeg;
    @XmlAttribute(name = "latMin", required = true)
    protected int latMin;
    @XmlAttribute(name = "latSec", required = true)
    protected double latSec;
    @XmlAttribute(name = "latDir", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int latDir;
    @XmlAttribute(name = "lonDeg", required = true)
    protected int lonDeg;
    @XmlAttribute(name = "lonMin", required = true)
    protected int lonMin;
    @XmlAttribute(name = "lonSec", required = true)
    protected double lonSec;
    @XmlAttribute(name = "lonDir", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int lonDir;
    @XmlAttribute(name = "callSignRx", required = true)
    protected String callSignRx;

    /**
     * Gets the value of the channel property.
     *
     * @return
     *     possible object is
     *     {@link Channel }
     *
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     * @param value
     *     allowed object is
     *     {@link Channel }
     *
     */
    public void setChannel(Channel value) {
        this.channel = value;
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
     * Gets the value of the operator property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the latDeg property.
     *
     */
    public int getLatDeg() {
        return latDeg;
    }

    /**
     * Sets the value of the latDeg property.
     *
     */
    public void setLatDeg(int value) {
        this.latDeg = value;
    }

    /**
     * Gets the value of the latMin property.
     *
     */
    public int getLatMin() {
        return latMin;
    }

    /**
     * Sets the value of the latMin property.
     *
     */
    public void setLatMin(int value) {
        this.latMin = value;
    }

    /**
     * Gets the value of the latSec property.
     *
     */
    public double getLatSec() {
        return latSec;
    }

    /**
     * Sets the value of the latSec property.
     *
     */
    public void setLatSec(double value) {
        this.latSec = value;
    }

    /**
     * Gets the value of the latDir property.
     *
     */
    public int getLatDir() {
        return latDir;
    }

    /**
     * Sets the value of the latDir property.
     *
     */
    public void setLatDir(int value) {
        this.latDir = value;
    }

    /**
     * Gets the value of the lonDeg property.
     *
     */
    public int getLonDeg() {
        return lonDeg;
    }

    /**
     * Sets the value of the lonDeg property.
     *
     */
    public void setLonDeg(int value) {
        this.lonDeg = value;
    }

    /**
     * Gets the value of the lonMin property.
     *
     */
    public int getLonMin() {
        return lonMin;
    }

    /**
     * Sets the value of the lonMin property.
     *
     */
    public void setLonMin(int value) {
        this.lonMin = value;
    }

    /**
     * Gets the value of the lonSec property.
     *
     */
    public double getLonSec() {
        return lonSec;
    }

    /**
     * Sets the value of the lonSec property.
     *
     */
    public void setLonSec(double value) {
        this.lonSec = value;
    }

    /**
     * Gets the value of the lonDir property.
     *
     */
    public int getLonDir() {
        return lonDir;
    }

    /**
     * Sets the value of the lonDir property.
     *
     */
    public void setLonDir(int value) {
        this.lonDir = value;
    }

    /**
     * Gets the value of the callSignRx property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCallSignRx() {
        return callSignRx;
    }

    /**
     * Sets the value of the callSignRx property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCallSignRx(String value) {
        this.callSignRx = value;
    }

}
