/*
 * XML Type:  RelatedEntityCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts;


/**
 * An XML RelatedEntityCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface RelatedEntityCollection extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedEntityCollection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s89F572913020FF22DE00DBDBAAFD31DF").resolveHandle("relatedentitycollection2c8btype");
    
    /**
     * Gets array of all "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" elements
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN[] getKeyValuePairOfRelationshipEntityCollectionXPsK4FkNArray();
    
    /**
     * Gets ith "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN getKeyValuePairOfRelationshipEntityCollectionXPsK4FkNArray(int i);
    
    /**
     * Returns number of "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    int sizeOfKeyValuePairOfRelationshipEntityCollectionXPsK4FkNArray();
    
    /**
     * Sets array of all "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    void setKeyValuePairOfRelationshipEntityCollectionXPsK4FkNArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN[] keyValuePairOfRelationshipEntityCollectionXPsK4FkNArray);
    
    /**
     * Sets ith "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    void setKeyValuePairOfRelationshipEntityCollectionXPsK4FkNArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN keyValuePairOfRelationshipEntityCollectionXPsK4FkN);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN insertNewKeyValuePairOfRelationshipEntityCollectionXPsK4FkN(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN addNewKeyValuePairOfRelationshipEntityCollectionXPsK4FkN();
    
    /**
     * Removes the ith "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    void removeKeyValuePairOfRelationshipEntityCollectionXPsK4FkN(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
