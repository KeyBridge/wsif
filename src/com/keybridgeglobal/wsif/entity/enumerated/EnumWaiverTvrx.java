//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity.enumerated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumWaiverTvrx complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="enumWaiverTvrx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}enumWaiverTvrxPK"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enumWaiverTvrx", propOrder = {
    "enumWaiverTvrxPK"
})
public class EnumWaiverTvrx {

    @XmlElement(required = true)
    protected EnumWaiverTvrxPK enumWaiverTvrxPK;

    /**
     * Gets the value of the enumWaiverTvrxPK property.
     *
     * @return
     *     possible object is
     *     {@link EnumWaiverTvrxPK }
     *
     */
    public EnumWaiverTvrxPK getEnumWaiverTvrxPK() {
        return enumWaiverTvrxPK;
    }

    /**
     * Sets the value of the enumWaiverTvrxPK property.
     *
     * @param value
     *     allowed object is
     *     {@link EnumWaiverTvrxPK }
     *
     */
    public void setEnumWaiverTvrxPK(EnumWaiverTvrxPK value) {
        this.enumWaiverTvrxPK = value;
    }

}