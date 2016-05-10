
package eu.europa.acer.remit.remitstorageschema_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportingEntityIdentifier">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="acerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="submissionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="storageFacilityReport">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gasDayStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="gasDayEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="reportingEntityReferenceID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="storageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="storage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="injection">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="withdrawal">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportingEntityIdentifier",
    "submissionDateTime",
    "storageFacilityReport"
})
@XmlRootElement(name = "REMITStorageReport")
public class REMITStorageReport {

    @XmlElement(required = true)
    protected REMITStorageReport.ReportingEntityIdentifier reportingEntityIdentifier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionDateTime;
    @XmlElement(required = true)
    protected REMITStorageReport.StorageFacilityReport storageFacilityReport;

    /**
     * Gets the value of the reportingEntityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link REMITStorageReport.ReportingEntityIdentifier }
     *     
     */
    public REMITStorageReport.ReportingEntityIdentifier getReportingEntityIdentifier() {
        return reportingEntityIdentifier;
    }

    /**
     * Sets the value of the reportingEntityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link REMITStorageReport.ReportingEntityIdentifier }
     *     
     */
    public void setReportingEntityIdentifier(REMITStorageReport.ReportingEntityIdentifier value) {
        this.reportingEntityIdentifier = value;
    }

    /**
     * Gets the value of the submissionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionDateTime() {
        return submissionDateTime;
    }

    /**
     * Sets the value of the submissionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionDateTime(XMLGregorianCalendar value) {
        this.submissionDateTime = value;
    }

    /**
     * Gets the value of the storageFacilityReport property.
     * 
     * @return
     *     possible object is
     *     {@link REMITStorageReport.StorageFacilityReport }
     *     
     */
    public REMITStorageReport.StorageFacilityReport getStorageFacilityReport() {
        return storageFacilityReport;
    }

    /**
     * Sets the value of the storageFacilityReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link REMITStorageReport.StorageFacilityReport }
     *     
     */
    public void setStorageFacilityReport(REMITStorageReport.StorageFacilityReport value) {
        this.storageFacilityReport = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="acerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acerCode"
    })
    public static class ReportingEntityIdentifier {

        @XmlElement(required = true)
        protected String acerCode;

        /**
         * Gets the value of the acerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcerCode() {
            return acerCode;
        }

        /**
         * Sets the value of the acerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcerCode(String value) {
            this.acerCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="gasDayStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="gasDayEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="reportingEntityReferenceID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="storageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="storage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="injection">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="withdrawal">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gasDayStart",
        "gasDayEnd",
        "reportingEntityReferenceID",
        "storageType",
        "storage",
        "injection",
        "withdrawal"
    })
    public static class StorageFacilityReport {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar gasDayStart;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar gasDayEnd;
        protected byte reportingEntityReferenceID;
        @XmlElement(required = true)
        protected String storageType;
        @XmlElement(required = true)
        protected REMITStorageReport.StorageFacilityReport.Storage storage;
        @XmlElement(required = true)
        protected REMITStorageReport.StorageFacilityReport.Injection injection;
        @XmlElement(required = true)
        protected REMITStorageReport.StorageFacilityReport.Withdrawal withdrawal;

        /**
         * Gets the value of the gasDayStart property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getGasDayStart() {
            return gasDayStart;
        }

        /**
         * Sets the value of the gasDayStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setGasDayStart(XMLGregorianCalendar value) {
            this.gasDayStart = value;
        }

        /**
         * Gets the value of the gasDayEnd property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getGasDayEnd() {
            return gasDayEnd;
        }

        /**
         * Sets the value of the gasDayEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setGasDayEnd(XMLGregorianCalendar value) {
            this.gasDayEnd = value;
        }

        /**
         * Gets the value of the reportingEntityReferenceID property.
         * 
         */
        public byte getReportingEntityReferenceID() {
            return reportingEntityReferenceID;
        }

        /**
         * Sets the value of the reportingEntityReferenceID property.
         * 
         */
        public void setReportingEntityReferenceID(byte value) {
            this.reportingEntityReferenceID = value;
        }

        /**
         * Gets the value of the storageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStorageType() {
            return storageType;
        }

        /**
         * Sets the value of the storageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStorageType(String value) {
            this.storageType = value;
        }

        /**
         * Gets the value of the storage property.
         * 
         * @return
         *     possible object is
         *     {@link REMITStorageReport.StorageFacilityReport.Storage }
         *     
         */
        public REMITStorageReport.StorageFacilityReport.Storage getStorage() {
            return storage;
        }

        /**
         * Sets the value of the storage property.
         * 
         * @param value
         *     allowed object is
         *     {@link REMITStorageReport.StorageFacilityReport.Storage }
         *     
         */
        public void setStorage(REMITStorageReport.StorageFacilityReport.Storage value) {
            this.storage = value;
        }

        /**
         * Gets the value of the injection property.
         * 
         * @return
         *     possible object is
         *     {@link REMITStorageReport.StorageFacilityReport.Injection }
         *     
         */
        public REMITStorageReport.StorageFacilityReport.Injection getInjection() {
            return injection;
        }

        /**
         * Sets the value of the injection property.
         * 
         * @param value
         *     allowed object is
         *     {@link REMITStorageReport.StorageFacilityReport.Injection }
         *     
         */
        public void setInjection(REMITStorageReport.StorageFacilityReport.Injection value) {
            this.injection = value;
        }

        /**
         * Gets the value of the withdrawal property.
         * 
         * @return
         *     possible object is
         *     {@link REMITStorageReport.StorageFacilityReport.Withdrawal }
         *     
         */
        public REMITStorageReport.StorageFacilityReport.Withdrawal getWithdrawal() {
            return withdrawal;
        }

        /**
         * Sets the value of the withdrawal property.
         * 
         * @param value
         *     allowed object is
         *     {@link REMITStorageReport.StorageFacilityReport.Withdrawal }
         *     
         */
        public void setWithdrawal(REMITStorageReport.StorageFacilityReport.Withdrawal value) {
            this.withdrawal = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value",
            "unit"
        })
        public static class Injection {

            protected byte value;
            @XmlElement(required = true)
            protected String unit;

            /**
             * Gets the value of the value property.
             * 
             */
            public byte getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(byte value) {
                this.value = value;
            }

            /**
             * Gets the value of the unit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                return unit;
            }

            /**
             * Sets the value of the unit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value",
            "unit"
        })
        public static class Storage {

            protected byte value;
            @XmlElement(required = true)
            protected String unit;

            /**
             * Gets the value of the value property.
             * 
             */
            public byte getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(byte value) {
                this.value = value;
            }

            /**
             * Gets the value of the unit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                return unit;
            }

            /**
             * Sets the value of the unit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value",
            "unit"
        })
        public static class Withdrawal {

            protected byte value;
            @XmlElement(required = true)
            protected String unit;

            /**
             * Gets the value of the value property.
             * 
             */
            public byte getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(byte value) {
                this.value = value;
            }

            /**
             * Gets the value of the unit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                return unit;
            }

            /**
             * Sets the value of the unit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

        }

    }

}
