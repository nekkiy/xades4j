//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.09 at 09:56:29 PM BST 
//


package xades4j.xml.bind.xades;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OIDAsURI"/&gt;
 *     &lt;enumeration value="OIDAsURN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualifierType")
@XmlEnum
public enum XmlQualifierType {

    @XmlEnumValue("OIDAsURI")
    OID_AS_URI("OIDAsURI"),
    @XmlEnumValue("OIDAsURN")
    OID_AS_URN("OIDAsURN");
    private final String value;

    XmlQualifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmlQualifierType fromValue(String v) {
        for (XmlQualifierType c: XmlQualifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
