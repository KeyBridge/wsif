//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="channel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="allocation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="channel" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="frequencyMin" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="frequencyMax" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel")
public class Channel {

    @XmlAttribute(name = "allocation", required = true)
    protected String allocation;
    @XmlAttribute(name = "channel", required = true)
    protected double channel;
    @XmlAttribute(name = "frequencyMin", required = true)
    protected double frequencyMin;
    @XmlAttribute(name = "frequencyMax", required = true)
    protected double frequencyMax;

    /**
     * Gets the value of the allocation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAllocation() {
        return allocation;
    }

    /**
     * Sets the value of the allocation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAllocation(String value) {
        this.allocation = value;
    }

    /**
     * Gets the value of the channel property.
     *
     */
    public double getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     */
    public void setChannel(double value) {
        this.channel = value;
    }

    /**
     * Gets the value of the frequencyMin property.
     *
     */
    public double getFrequencyMin() {
        return frequencyMin;
    }

    /**
     * Sets the value of the frequencyMin property.
     *
     */
    public void setFrequencyMin(double value) {
        this.frequencyMin = value;
    }

    /**
     * Gets the value of the frequencyMax property.
     *
     */
    public double getFrequencyMax() {
        return frequencyMax;
    }

    /**
     * Sets the value of the frequencyMax property.
     *
     */
    public void setFrequencyMax(double value) {
        this.frequencyMax = value;
    }

}
