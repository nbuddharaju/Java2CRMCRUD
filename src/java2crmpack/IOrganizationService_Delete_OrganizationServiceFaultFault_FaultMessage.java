/**
 * IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.2  Built on : May 02, 2016 (05:55:18 BST)
 */
package java2crmpack;

public class IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage
    extends java.lang.Exception {
    private static final long serialVersionUID = 1464415254039L;
    private com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument faultMessage;

    public IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage() {
        super(
            "IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage");
    }

    public IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument msg) {
        faultMessage = msg;
    }

    public com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument getFaultMessage() {
        return faultMessage;
    }
}
