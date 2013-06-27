//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//
package com.keybridgeglobal.wsif.transaction;

import com.keybridgeglobal.wsif.entity.Location;
import com.keybridgeglobal.wsif.entity.Schedule;
import com.keybridgeglobal.wsif.entity.device.TxRxWsd;
import com.keybridgeglobal.wsif.enumerated.EnumWsifQueryType;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Java class for whitespaceQuery complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre> &lt;complexType name="whitespaceQuery"> &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence> &lt;element ref="{}txRxWsd"/> &lt;element ref="{}location"/>
 * &lt;element ref="{}schedule" minOccurs="0"/> &lt;element name="extension"
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/sequence> &lt;attribute name="uuid" use="required"
 * type="{http://www.w3.org/2001/XMLSchema}string" /> &lt;attribute
 * name="protocolVersion" use="required"
 * type="{http://www.w3.org/2001/XMLSchema}double" /> &lt;attribute
 * name="messageType" use="required" type="{}enumWsifQueryType" /> &lt;attribute
 * name="dateCreated" use="required"
 * type="{http://www.w3.org/2001/XMLSchema}dateTime" /> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "whitespaceQuery", propOrder = {
  "txRxWsd",
  "location",
  "schedule",
  "extension"
})
public class WhitespaceQuery {

  @XmlElement(required = true)
  protected TxRxWsd txRxWsd;
  @XmlElement(required = true)
  protected Location location;
  protected Schedule schedule;
  protected String extension;
  @XmlAttribute(name = "uuid", required = true)
  protected String uuid;
  @XmlAttribute(name = "protocolVersion", required = true)
  protected double protocolVersion;
  @XmlAttribute(name = "messageType", required = true)
  protected EnumWsifQueryType messageType;
  /**
   * The Java XSD compiler translates java.util.Date to XMLGregorianCalendar.
   * This field type can be changed to a java.util.Date if desired.
   */
  @XmlAttribute(name = "dateCreated", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar dateCreated;

  /**
   * Gets the value of the txRxWsd property.
   * <p/>
   * @return possible object is {@link TxRxWsd }
   *
   */
  public TxRxWsd getTxRxWsd() {
    return txRxWsd;
  }

  /**
   * Sets the value of the txRxWsd property.
   * <p/>
   * @param value allowed object is {@link TxRxWsd }
   *
   */
  public void setTxRxWsd(TxRxWsd value) {
    this.txRxWsd = value;
  }

  /**
   * Gets the value of the location property.
   * <p/>
   * @return possible object is {@link Location }
   *
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Sets the value of the location property.
   * <p/>
   * @param value allowed object is {@link Location }
   *
   */
  public void setLocation(Location value) {
    this.location = value;
  }

  /**
   * Gets the value of the schedule property.
   * <p/>
   * @return possible object is {@link Schedule }
   *
   */
  public Schedule getSchedule() {
    return schedule;
  }

  /**
   * Sets the value of the schedule property.
   * <p/>
   * @param value allowed object is {@link Schedule }
   *
   */
  public void setSchedule(Schedule value) {
    this.schedule = value;
  }

  /**
   * Gets the value of the extension property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getExtension() {
    return extension;
  }

  /**
   * Sets the value of the extension property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setExtension(String value) {
    this.extension = value;
  }

  /**
   * Gets the value of the uuid property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getUuid() {
    return uuid;
  }

  /**
   * Sets the value of the uuid property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setUuid(String value) {
    this.uuid = value;
  }

  /**
   * Gets the value of the protocolVersion property.
   * <p/>
   */
  public double getProtocolVersion() {
    return protocolVersion;
  }

  /**
   * Sets the value of the protocolVersion property.
   * <p/>
   */
  public void setProtocolVersion(double value) {
    this.protocolVersion = value;
  }

  /**
   * Gets the value of the messageType property.
   * <p/>
   * @return possible object is {@link EnumWsifQueryType }
   *
   */
  public EnumWsifQueryType getMessageType() {
    return messageType;
  }

  /**
   * Sets the value of the messageType property.
   * <p/>
   * @param value allowed object is {@link EnumWsifQueryType }
   *
   */
  public void setMessageType(EnumWsifQueryType value) {
    this.messageType = value;
  }

  /**
   * Gets the value of the dateCreated property.
   * <p/>
   * @return possible object is {@link XMLGregorianCalendar }
   *
   */
  public XMLGregorianCalendar getDateCreated() {
    return dateCreated;
  }

  /**
   * Sets the value of the dateCreated property.
   * <p/>
   * @param value allowed object is {@link XMLGregorianCalendar }
   *
   */
  public void setDateCreated(XMLGregorianCalendar value) {
    this.dateCreated = value;
  }
}
