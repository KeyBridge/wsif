//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity.device;

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
 * <p>Java class for rxLpaux complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="rxLpaux">
 *   &lt;complexContent>
 *     &lt;extension base="{}device">
 *       &lt;sequence>
 *         &lt;element name="channelList" type="{}channel" maxOccurs="unbounded"/>
 *         &lt;element name="transmitters" type="{}txLpaux" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sensitivity" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="subGroupId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rxLpaux", propOrder = {
    "channelList",
    "transmitters"
})
public class RxLpaux
    extends Device
{

    @XmlElement(required = true)
    protected List<Channel> channelList;
    protected List<TxLpaux> transmitters;
    @XmlAttribute(name = "groupId")
    protected String groupId;
    @XmlAttribute(name = "sensitivity")
    protected Double sensitivity;
    @XmlAttribute(name = "subGroupId")
    protected String subGroupId;

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
     * {@link TxLpaux }
     *
     *
     */
    public List<TxLpaux> getTransmitters() {
        if (transmitters == null) {
            transmitters = new ArrayList<TxLpaux>();
        }
        return this.transmitters;
    }

    /**
     * Gets the value of the groupId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the sensitivity property.
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSensitivity(Double value) {
        this.sensitivity = value;
    }

    /**
     * Gets the value of the subGroupId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubGroupId() {
        return subGroupId;
    }

    /**
     * Sets the value of the subGroupId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubGroupId(String value) {
        this.subGroupId = value;
    }

}
