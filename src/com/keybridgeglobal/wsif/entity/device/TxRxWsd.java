//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity.device;

import com.keybridgeglobal.wsif.enumerated.EnumWsifWsdMode;
import com.keybridgeglobal.wsif.entity.Device;
import com.keybridgeglobal.wsif.entity.Channel;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txRxWsd complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="txRxWsd">
 *   &lt;complexContent>
 *     &lt;extension base="{}device">
 *       &lt;sequence>
 *         &lt;element name="channelList" type="{}channel" maxOccurs="unbounded"/>
 *         &lt;element name="desiredChannelList" type="{}channel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receivers" type="{}txRxWsd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transmitters" type="{}txRxWsd" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="desiredFrequency" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="wsdMode" use="required" type="{}enumWsifWsdMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txRxWsd", propOrder = {
    "channelList",
    "desiredChannelList",
    "receivers",
    "transmitters"
})
public class TxRxWsd
    extends Device
{

    @XmlElement(required = true)
    protected List<Channel> channelList;
    protected List<Channel> desiredChannelList;
    protected List<TxRxWsd> receivers;
    protected List<TxRxWsd> transmitters;
    @XmlAttribute(name = "desiredFrequency")
    protected Double desiredFrequency;
    @XmlAttribute(name = "wsdMode", required = true)
    protected EnumWsifWsdMode wsdMode;

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
     * Gets the value of the desiredChannelList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desiredChannelList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesiredChannelList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Channel }
     *
     *
     */
    public List<Channel> getDesiredChannelList() {
        if (desiredChannelList == null) {
            desiredChannelList = new ArrayList<Channel>();
        }
        return this.desiredChannelList;
    }

    /**
     * Gets the value of the receivers property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivers property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivers().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxRxWsd }
     *
     *
     */
    public List<TxRxWsd> getReceivers() {
        if (receivers == null) {
            receivers = new ArrayList<TxRxWsd>();
        }
        return this.receivers;
    }

    /**
     * Gets the value of the transmitters property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transmitters property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransmitters().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxRxWsd }
     *
     *
     */
    public List<TxRxWsd> getTransmitters() {
        if (transmitters == null) {
            transmitters = new ArrayList<TxRxWsd>();
        }
        return this.transmitters;
    }

    /**
     * Gets the value of the desiredFrequency property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getDesiredFrequency() {
        return desiredFrequency;
    }

    /**
     * Sets the value of the desiredFrequency property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setDesiredFrequency(Double value) {
        this.desiredFrequency = value;
    }

    /**
     * Gets the value of the wsdMode property.
     *
     * @return
     *     possible object is
     *     {@link EnumWsifWsdMode }
     *
     */
    public EnumWsifWsdMode getWsdMode() {
        return wsdMode;
    }

    /**
     * Sets the value of the wsdMode property.
     *
     * @param value
     *     allowed object is
     *     {@link EnumWsifWsdMode }
     *
     */
    public void setWsdMode(EnumWsifWsdMode value) {
        this.wsdMode = value;
    }

}