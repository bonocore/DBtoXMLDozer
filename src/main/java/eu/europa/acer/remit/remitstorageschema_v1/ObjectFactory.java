
package eu.europa.acer.remit.remitstorageschema_v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.acer.remit.remitstorageschema_v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.acer.remit.remitstorageschema_v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link REMITStorageReport }
     * 
     */
    public REMITStorageReport createREMITStorageReport() {
        return new REMITStorageReport();
    }

    /**
     * Create an instance of {@link REMITStorageReport.StorageFacilityReport }
     * 
     */
    public REMITStorageReport.StorageFacilityReport createREMITStorageReportStorageFacilityReport() {
        return new REMITStorageReport.StorageFacilityReport();
    }

    /**
     * Create an instance of {@link REMITStorageReport.ReportingEntityIdentifier }
     * 
     */
    public REMITStorageReport.ReportingEntityIdentifier createREMITStorageReportReportingEntityIdentifier() {
        return new REMITStorageReport.ReportingEntityIdentifier();
    }

    /**
     * Create an instance of {@link REMITStorageReport.StorageFacilityReport.Storage }
     * 
     */
    public REMITStorageReport.StorageFacilityReport.Storage createREMITStorageReportStorageFacilityReportStorage() {
        return new REMITStorageReport.StorageFacilityReport.Storage();
    }

    /**
     * Create an instance of {@link REMITStorageReport.StorageFacilityReport.Injection }
     * 
     */
    public REMITStorageReport.StorageFacilityReport.Injection createREMITStorageReportStorageFacilityReportInjection() {
        return new REMITStorageReport.StorageFacilityReport.Injection();
    }

    /**
     * Create an instance of {@link REMITStorageReport.StorageFacilityReport.Withdrawal }
     * 
     */
    public REMITStorageReport.StorageFacilityReport.Withdrawal createREMITStorageReportStorageFacilityReportWithdrawal() {
        return new REMITStorageReport.StorageFacilityReport.Withdrawal();
    }

}
