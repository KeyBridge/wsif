//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity.enumerated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumWaiverTvrxPK complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="enumWaiverTvrxPK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="callSignRx" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callSignTx" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enumWaiverTvrxPK")
public class EnumWaiverTvrxPK {

    @XmlAttribute(name = "callSignRx", required = true)
    protected String callSignRx;
    @XmlAttribute(name = "callSignTx", required = true)
    protected String callSignTx;

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

    /**
     * Gets the value of the callSignTx property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCallSignTx() {
        return callSignTx;
    }

    /**
     * Sets the value of the callSignTx property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCallSignTx(String value) {
        this.callSignTx = value;
    }

}
