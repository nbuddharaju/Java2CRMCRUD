/*
 * XML Type:  ArrayOfRelationshipMetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata;


/**
 * An XML ArrayOfRelationshipMetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public interface ArrayOfRelationshipMetadataBase extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfRelationshipMetadataBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s89F572913020FF22DE00DBDBAAFD31DF").resolveHandle("arrayofrelationshipmetadatabased889type");
    
    /**
     * Gets array of all "RelationshipMetadataBase" elements
     */
    com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase[] getRelationshipMetadataBaseArray();
    
    /**
     * Gets ith "RelationshipMetadataBase" element
     */
    com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase getRelationshipMetadataBaseArray(int i);
    
    /**
     * Tests for nil ith "RelationshipMetadataBase" element
     */
    boolean isNilRelationshipMetadataBaseArray(int i);
    
    /**
     * Returns number of "RelationshipMetadataBase" element
     */
    int sizeOfRelationshipMetadataBaseArray();
    
    /**
     * Sets array of all "RelationshipMetadataBase" element
     */
    void setRelationshipMetadataBaseArray(com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase[] relationshipMetadataBaseArray);
    
    /**
     * Sets ith "RelationshipMetadataBase" element
     */
    void setRelationshipMetadataBaseArray(int i, com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase relationshipMetadataBase);
    
    /**
     * Nils the ith "RelationshipMetadataBase" element
     */
    void setNilRelationshipMetadataBaseArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelationshipMetadataBase" element
     */
    com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase insertNewRelationshipMetadataBase(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelationshipMetadataBase" element
     */
    com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase addNewRelationshipMetadataBase();
    
    /**
     * Removes the ith "RelationshipMetadataBase" element
     */
    void removeRelationshipMetadataBase(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase newInstance() {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
