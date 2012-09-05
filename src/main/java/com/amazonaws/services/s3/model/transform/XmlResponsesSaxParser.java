/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model.transform;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.CORSRule.AllowedMethods;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration.TopicConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.DeleteObjectsResult.DeletedObject;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.MultiObjectDeleteException.DeleteError;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.MultipartUpload;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.TagSet;
import com.amazonaws.services.s3.model.VersionListing;

/**
 * XML Sax parser to read XML documents returned by S3 via the REST interface,
 * converting these documents into objects.
 */
public class XmlResponsesSaxParser {
    private static final Log log = LogFactory.getLog(XmlResponsesSaxParser.class);

    private XMLReader xr = null;

    private boolean sanitizeXmlDocument = true;

    /**
     * Constructs the XML SAX parser.
     *
     * @throws AmazonClientException
     */
    public XmlResponsesSaxParser() throws AmazonClientException {
        // Ensure we can load the XML Reader.
        try {
            xr = XMLReaderFactory.createXMLReader();
        } catch (SAXException e) {
            // oops, lets try doing this (needed in 1.4)
            System.setProperty("org.xml.sax.driver", "org.apache.crimson.parser.XMLReaderImpl");
            try {
                // Try once more...
                xr = XMLReaderFactory.createXMLReader();
            } catch (SAXException e2) {
                throw new AmazonClientException("Couldn't initialize a sax driver for the XMLReader");
            }
        }
    }

    /**
     * Parses an XML document from an input stream using a document handler.
     *
     * @param handler
     *            the handler for the XML document
     * @param inputStream
     *            an input stream containing the XML document to parse
     *
     * @throws AmazonClientException
     *             any parsing, IO or other exceptions are wrapped in an
     *             S3ServiceException.
     */
    protected void parseXmlInputStream(DefaultHandler handler, InputStream inputStream)
            throws AmazonClientException {
        try {
            if (log.isDebugEnabled()) {
                log.debug("Parsing XML response document with handler: " + handler.getClass());
            }

            BufferedReader breader = new BufferedReader(new InputStreamReader(inputStream,
                Constants.DEFAULT_ENCODING));
            xr.setContentHandler(handler);
            xr.setErrorHandler(handler);
            xr.parse(new InputSource(breader));
        } catch (Throwable t) {
            try {
                inputStream.close();
            } catch (IOException e) {
                if (log.isErrorEnabled()) {
                    log.error("Unable to close response InputStream up after XML parse failure", e);
                }
            }
            throw new AmazonClientException("Failed to parse XML document with handler "
                + handler.getClass(), t);
        }
    }

    protected InputStream sanitizeXmlDocument(DefaultHandler handler, InputStream inputStream)
            throws AmazonClientException {
        if (!sanitizeXmlDocument) {
            // No sanitizing will be performed, return the original input stream unchanged.
            return inputStream;
        } else {
            if (log.isDebugEnabled()) {
                log.debug("Sanitizing XML document destined for handler " + handler.getClass());
            }

            InputStream sanitizedInputStream = null;

            try {
                /*
                 * Read object listing XML document from input stream provided into a
                 * string buffer, so we can replace troublesome characters before
                 * sending the document to the XML parser.
                 */
                StringBuilder listingDocBuffer = new StringBuilder();
                BufferedReader br = new BufferedReader(
                    new InputStreamReader(inputStream, Constants.DEFAULT_ENCODING));

                char[] buf = new char[8192];
                int read = -1;
                while ((read = br.read(buf)) != -1) {
                    listingDocBuffer.append(buf, 0, read);
                }
                br.close();

                /*
                 * Replace any carriage return (\r) characters with explicit XML
                 * character entities, to prevent the SAX parser from
                 * misinterpreting 0x0D characters as 0x0A and being unable to
                 * parse the XML.
                 */
                String listingDoc = listingDocBuffer.toString().replaceAll("\r", "&#013;");

                sanitizedInputStream = new ByteArrayInputStream(
                    listingDoc.getBytes(Constants.DEFAULT_ENCODING));
            } catch (Throwable t) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    if (log.isErrorEnabled()) {
                        log.error("Unable to close response InputStream after failure sanitizing XML document", e);
                    }
                }
                throw new AmazonClientException("Failed to sanitize XML document destined for handler "
                    + handler.getClass(), t);
            }
            return sanitizedInputStream;
        }
    }

    /**
     * Checks if the specified string is empty or null and if so, returns null.
     * Otherwise simply returns the string.
     *
     * @param s
     *            The string to check.
     * @return Null if the specified string was null, or empty, otherwise
     *         returns the string the caller passed in.
     */
    private String checkForEmptyString(String s) {
        if (s == null) return null;
        if (s.length() == 0) return null;

        return s;
    }

    /**
     * Safely parses the specified string as an integer and returns the value.
     * If a NumberFormatException occurs while parsing the integer, an error is
     * logged and -1 is returned.
     *
     * @param s
     *            The string to parse and return as an integer.
     *
     * @return The integer value of the specified string, otherwise -1 if there
     *         were any problems parsing the string as an integer.
     */
    private int parseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            log.error("Unable to parse integer value '" + s + "'", nfe);
        }

        return -1;
    }

    /**
     * Safely parses the specified string as a long and returns the value. If a
     * NumberFormatException occurs while parsing the long, an error is logged
     * and -1 is returned.
     *
     * @param s
     *            The string to parse and return as a long.
     *
     * @return The long value of the specified string, otherwise -1 if there
     *         were any problems parsing the string as a long.
     */
    private long parseLong(String s) {
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException nfe) {
            log.error("Unable to parse long value '" + s + "'", nfe);
        }

        return -1;
    }

    /**
     * Parses a ListBucket response XML document from an input stream.
     *
     * @param inputStream
     *            XML data input stream.
     * @return the XML handler object populated with data parsed from the XML
     *         stream.
     * @throws AmazonClientException
     */
    public ListBucketHandler parseListBucketObjectsResponse(InputStream inputStream)
            throws AmazonClientException {
        ListBucketHandler handler = new ListBucketHandler();
        parseXmlInputStream(handler, sanitizeXmlDocument(handler, inputStream));
        return handler;
    }

    /**
     * Parses a ListVersions response XML document from an input stream.
     *
     * @param inputStream
     *            XML data input stream.
     * @return the XML handler object populated with data parsed from the XML
     *         stream.
     * @throws AmazonClientException
     */
    public ListVersionsHandler parseListVersionsResponse(InputStream inputStream)
            throws AmazonClientException {
        ListVersionsHandler handler = new ListVersionsHandler();
        parseXmlInputStream(handler, sanitizeXmlDocument(handler, inputStream));
        return handler;
    }

    /**
     * Parses a ListAllMyBuckets response XML document from an input stream.
     *
     * @param inputStream
     *            XML data input stream.
     * @return the XML handler object populated with data parsed from the XML
     *         stream.
     * @throws AmazonClientException
     */
    public ListAllMyBucketsHandler parseListMyBucketsResponse(InputStream inputStream)
            throws AmazonClientException {
        ListAllMyBucketsHandler handler = new ListAllMyBucketsHandler();
        parseXmlInputStream(handler, sanitizeXmlDocument(handler, inputStream));
        return handler;
    }

    /**
     * Parses an AccessControlListHandler response XML document from an input
     * stream.
     *
     * @param inputStream
     *            XML data input stream.
     * @return the XML handler object populated with data parsed from the XML
     *         stream.
     *
     * @throws AmazonClientException
     */
    public AccessControlListHandler parseAccessControlListResponse(InputStream inputStream)
        throws AmazonClientException
    {
        AccessControlListHandler handler = new AccessControlListHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }

    /**
     * Parses a LoggingStatus response XML document for a bucket from an input
     * stream.
     *
     * @param inputStream
     *            XML data input stream.
     * @return the XML handler object populated with data parsed from the XML
     *         stream.
     *
     * @throws AmazonClientException
     */
    public BucketLoggingConfigurationHandler parseLoggingStatusResponse(InputStream inputStream)
        throws AmazonClientException
    {
        BucketLoggingConfigurationHandler handler = new BucketLoggingConfigurationHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }

    public BucketLifecycleConfigurationHandler parseBucketLifecycleConfigurationResponse(InputStream inputStream)
    {
        BucketLifecycleConfigurationHandler handler = new BucketLifecycleConfigurationHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }
    
    public BucketCrossOriginConfigurationHandler parseBucketCrossOriginConfigurationResponse(InputStream inputStream)
    {
    	BucketCrossOriginConfigurationHandler handler = new BucketCrossOriginConfigurationHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }

    public String parseBucketLocationResponse(InputStream inputStream)
        throws AmazonClientException
    {
        BucketLocationHandler handler = new BucketLocationHandler();
        parseXmlInputStream(handler, inputStream);
        return handler.getLocation();
    }

    public BucketVersioningConfigurationHandler parseVersioningConfigurationResponse(InputStream inputStream)
        throws AmazonClientException
    {
        BucketVersioningConfigurationHandler handler = new BucketVersioningConfigurationHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }

    public BucketWebsiteConfigurationHandler parseWebsiteConfigurationResponse(InputStream inputStream)
    	throws AmazonClientException
    {
    	BucketWebsiteConfigurationHandler handler = new BucketWebsiteConfigurationHandler();
    	parseXmlInputStream(handler, inputStream);
    	return handler;
    }

    public BucketNotificationConfigurationHandler parseNotificationConfigurationResponse(InputStream inputStream)
        throws AmazonClientException
    {
        BucketNotificationConfigurationHandler handler = new BucketNotificationConfigurationHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }
    
    public BucketTaggingConfigurationHandler parseTaggingConfigurationResponse(InputStream inputStream)
            throws AmazonClientException
        {
            BucketTaggingConfigurationHandler handler = new BucketTaggingConfigurationHandler();
            parseXmlInputStream(handler, inputStream);
            return handler;
        }

    public DeleteObjectsHandler parseDeletedObjectsResult(InputStream inputStream) {
        DeleteObjectsHandler handler = new DeleteObjectsHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }

    public CopyObjectResultHandler parseCopyObjectResponse(InputStream inputStream)
        throws AmazonClientException
    {
        CopyObjectResultHandler handler = new CopyObjectResultHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }

    public CompleteMultipartUploadHandler parseCompleteMultipartUploadResponse(InputStream inputStream)
        throws AmazonClientException
    {
        CompleteMultipartUploadHandler handler = new CompleteMultipartUploadHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }

    public InitiateMultipartUploadHandler parseInitiateMultipartUploadResponse(InputStream inputStream)
        throws AmazonClientException
    {
        InitiateMultipartUploadHandler handler = new InitiateMultipartUploadHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }

    public ListMultipartUploadsHandler parseListMultipartUploadsResponse(InputStream inputStream)
        throws AmazonClientException
    {
        ListMultipartUploadsHandler handler = new ListMultipartUploadsHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }

    public ListPartsHandler parseListPartsResponse(InputStream inputStream)
        throws AmazonClientException
    {
        ListPartsHandler handler = new ListPartsHandler();
        parseXmlInputStream(handler, inputStream);
        return handler;
    }


    /**
     * @param inputStream
     *
     * @return true if the bucket's is configured as Requester Pays, false if it
     *         is configured as Owner pays.
     *
     * @throws AmazonClientException
     */
    public boolean parseRequestPaymentConfigurationResponse(InputStream inputStream)
        throws AmazonClientException
    {
        RequestPaymentConfigurationHandler handler = new RequestPaymentConfigurationHandler();
        parseXmlInputStream(handler, inputStream);
        return handler.isRequesterPays();
    }

    // ////////////
    // Handlers //
    // ////////////

    /**
     * Handler for ListBucket response XML documents. The document is parsed
     * into {@link S3Object}s available via the {@link #getObjects()} method.
     */
    public class ListBucketHandler extends DefaultHandler {
        private S3ObjectSummary currentObject = null;
        private Owner currentOwner = null;
        private StringBuilder currText = null;
        private boolean insideCommonPrefixes = false;

        private ObjectListing objectListing = new ObjectListing();
        private List<String> commonPrefixes = new ArrayList<String>();

        // Listing properties.
        private String bucketName = null;
        private String requestPrefix = null;
        private String requestMarker = null;
        private int requestMaxKeys = 0;
        private String requestDelimiter = null;
        private boolean listingTruncated = false;
        private String lastKey = null;
        private String nextMarker = null;

        public ListBucketHandler() {
            super();
            this.currText = new StringBuilder();
        }

        public ObjectListing getObjectListing() {
            objectListing.setBucketName(bucketName);
            objectListing.setCommonPrefixes(commonPrefixes);
            objectListing.setDelimiter(requestDelimiter);
            objectListing.setMarker(requestMarker);
            objectListing.setMaxKeys(requestMaxKeys);
            objectListing.setPrefix(requestPrefix);
            objectListing.setTruncated(listingTruncated);

            /*
             * S3 only includes the NextMarker XML element if the request
             * specified a delimiter, but for consistency we'd like to always
             * give easy access to the next marker if we're returning a list of
             * results that's truncated.
             */
            if (nextMarker != null) {
                objectListing.setNextMarker(nextMarker);
            } else if (listingTruncated) {
            	String nextMarker = null;
            	if (objectListing.getObjectSummaries().isEmpty() == false) {
					nextMarker = objectListing.getObjectSummaries().get(objectListing.getObjectSummaries().size() - 1).getKey();
            	} else if (objectListing.getCommonPrefixes().isEmpty() == false) {
					nextMarker = objectListing.getCommonPrefixes().get(objectListing.getCommonPrefixes().size() - 1);
            	} else {
            		log.error("S3 response indicates truncated results, but contains no object summaries or common prefixes.");
            	}

                objectListing.setNextMarker(nextMarker);
            }

            return objectListing;
        }

        /**
         * If the listing is truncated this method will return the marker that
         * should be used in subsequent bucket list calls to complete the
         * listing.
         *
         * @return null if the listing is not truncated, otherwise the next
         *         marker if it's available or the last object key seen if the
         *         next marker isn't available.
         */
        public String getMarkerForNextListing() {
            if (listingTruncated) {
                if (nextMarker != null) {
                    return nextMarker;
                } else if (lastKey != null) {
                    return lastKey;
                } else {
                    if (log.isWarnEnabled()) {
                        log.warn("Unable to find Next Marker or Last Key for truncated listing");
                    }
                    return null;
                }
            } else {
                return null;
            }
        }

        /**
         * @return true if the listing document was truncated, and therefore
         *         only contained a subset of the available S3 objects.
         */
        public boolean isListingTruncated() {
            return listingTruncated;
        }

        /**
         * @return the S3 objects contained in the listing.
         */
        public List<S3ObjectSummary> getObjects() {
            return objectListing.getObjectSummaries();
        }

        public String[] getCommonPrefixes() {
            return (String[]) commonPrefixes.toArray(new String[commonPrefixes.size()]);
        }

        public String getRequestPrefix() {
            return requestPrefix;
        }

        public String getRequestMarker() {
            return requestMarker;
        }

        public String getNextMarker() {
            return nextMarker;
        }

        public long getRequestMaxKeys() {
            return requestMaxKeys;
        }

        public void startDocument() {
        }

        public void endDocument() {
        }

        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("Contents")) {
                currentObject = new S3ObjectSummary();
                currentObject.setBucketName(bucketName);
            } else if (name.equals("Owner")) {
                currentOwner = new Owner();
                currentObject.setOwner(currentOwner);
            } else if (name.equals("CommonPrefixes")) {
                insideCommonPrefixes = true;
            }
        }

        public void endElement(String uri, String name, String qName) {
            String elementText = this.currText.toString();
            // Listing details
            if (name.equals("Name")) {
                bucketName = elementText;
                if (log.isDebugEnabled()) {
                    log.debug("Examining listing for bucket: " + bucketName);
                }
            } else if (!insideCommonPrefixes && name.equals("Prefix")) {
                requestPrefix = checkForEmptyString(elementText);
            } else if (name.equals("Marker")) {
                requestMarker = checkForEmptyString(elementText);
            } else if (name.equals("NextMarker")) {
                nextMarker = elementText;
            } else if (name.equals("MaxKeys")) {
                requestMaxKeys = parseInt(elementText);
            } else if (name.equals("Delimiter")) {
                requestDelimiter = checkForEmptyString(elementText);
            } else if (name.equals("IsTruncated")) {
                String isTruncatedStr = elementText.toLowerCase(Locale.getDefault());
                if (isTruncatedStr.startsWith("false")) {
                    listingTruncated = false;
                } else if (isTruncatedStr.startsWith("true")) {
                    listingTruncated = true;
                } else {
                    throw new RuntimeException("Invalid value for IsTruncated field: "
                        + isTruncatedStr);
                }
            }
            // Object details.
            else if (name.equals("Contents")) {
                objectListing.getObjectSummaries().add(currentObject);
            } else if (name.equals("Key")) {
                currentObject.setKey(elementText);
                lastKey = elementText;
            } else if (name.equals("LastModified")) {
                try {
                    currentObject.setLastModified(ServiceUtils.parseIso8601Date(elementText));
                } catch (ParseException e) {
                    throw new RuntimeException(
                        "Non-ISO8601 date for LastModified in bucket's object listing output: "
                        + elementText, e);
                }
            } else if (name.equals("ETag")) {
                currentObject.setETag(ServiceUtils.removeQuotes(elementText));
            } else if (name.equals("Size")) {
                currentObject.setSize(parseLong(elementText));
            } else if (name.equals("StorageClass")) {
                currentObject.setStorageClass(elementText);
            }
            // Owner details.
            else if (name.equals("ID")) {
                if (currentOwner == null) {
                    currentOwner = new Owner();
                    currentObject.setOwner(currentOwner);
                }

                currentOwner.setId(elementText);
            } else if (name.equals("DisplayName")) {
                currentOwner.setDisplayName(elementText);
            }
            // Common prefixes.
            else if (insideCommonPrefixes && name.equals("Prefix")) {
                commonPrefixes.add(elementText);
            } else if (name.equals("CommonPrefixes")) {
                insideCommonPrefixes = false;
            }

            this.currText = new StringBuilder();
        }

        public void characters(char ch[], int start, int length) {
            this.currText.append(ch, start, length);
        }
    }

    /**
     * Handler for ListAllMyBuckets response XML documents. The document is
     * parsed into {@link Bucket}s available via the {@link #getBuckets()}
     * method.
     */
    public class ListAllMyBucketsHandler extends DefaultHandler {
        private Owner bucketsOwner = null;
        private Bucket currentBucket = null;
        private StringBuilder currText = null;

        private List<Bucket> buckets = null;

        public ListAllMyBucketsHandler() {
            super();
            buckets = new ArrayList<Bucket>();
            this.currText = new StringBuilder();
        }

        /**
         * @return the buckets listed in the document.
         */
        public List<Bucket> getBuckets() {
            return buckets;
        }

        /**
         * @return the owner of the buckets.
         */
        public Owner getOwner() {
            return bucketsOwner;
        }

        public void startDocument() {
        }

        public void endDocument() {
        }

        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("Bucket")) {
                currentBucket = new Bucket();
            } else if (name.equals("Owner")) {
                bucketsOwner = new Owner();
            }
        }

        public void endElement(String uri, String name, String qName) {
            String elementText = this.currText.toString();
            // Listing details.
            if (name.equals("ID")) {
                bucketsOwner.setId(elementText);
            } else if (name.equals("DisplayName")) {
                bucketsOwner.setDisplayName(elementText);
            }
            // Bucket item details.
            else if (name.equals("Bucket")) {
                currentBucket.setOwner(bucketsOwner);
                buckets.add(currentBucket);
            } else if (name.equals("Name")) {
                currentBucket.setName(elementText);
            } else if (name.equals("CreationDate")) {
                elementText += ".000Z";
                try {
                    currentBucket.setCreationDate(ServiceUtils.parseIso8601Date(elementText));
                } catch (ParseException e) {
                    throw new RuntimeException(
                        "Non-ISO8601 date for CreationDate in list buckets output: "
                        + elementText, e);
                }
            }
            this.currText = new StringBuilder();
        }

        public void characters(char ch[], int start, int length) {
            this.currText.append(ch, start, length);
        }
    }

    /**
     * Handler for AccessControlList response XML documents. The document is
     * parsed into an {@link AccessControlList} object available via the
     * {@link #getAccessControlList()} method.
     */
    public class AccessControlListHandler extends DefaultHandler {
        private AccessControlList accessControlList = null;

        private Owner owner = null;
        private Grantee currentGrantee = null;
        private Permission currentPermission = null;
        private StringBuilder currText = null;

        private boolean insideACL = false;

        public AccessControlListHandler() {
            super();
            this.currText = new StringBuilder();
        }

        /**
         * @return an object representing the ACL document.
         */
        public AccessControlList getAccessControlList() {
            return accessControlList;
        }

        public void startDocument() {
        }

        public void endDocument() {
        }

        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("Owner")) {
                owner = new Owner();
            } else if (name.equals("AccessControlList")) {
                accessControlList = new AccessControlList();
                accessControlList.setOwner(owner);
                insideACL = true;
            } else if (name.equals("Grantee")) {
                String type = XmlResponsesSaxParser.findAttributeValue( "xsi:type", attrs );
                if ("AmazonCustomerByEmail".equals(type)) {
                    currentGrantee = new EmailAddressGrantee(null);
                } else if ("CanonicalUser".equals(type)) {
                    currentGrantee = new CanonicalGrantee(null);
                } else if ("Group".equals(type)) {
                    /*
                     * Nothing to do for GroupGrantees here since we
                     * can't construct an empty enum value early.
                     */
                }
            }
        }

        public void endElement(String uri, String name, String qName) {
            String elementText = this.currText.toString();

            // Owner details.
            if (name.equals("ID") && !insideACL) {
                owner.setId(elementText);
            } else if (name.equals("DisplayName") && !insideACL) {
                owner.setDisplayName(elementText);
            }
            // ACL details.
            else if (name.equals("ID")) {
                currentGrantee.setIdentifier(elementText);
            } else if (name.equals("EmailAddress")) {
                currentGrantee.setIdentifier(elementText);
            } else if (name.equals("URI")) {
                /*
                 * Only GroupGrantees contain an URI element in them, and we
                 * can't construct currentGrantee during startElement for a
                 * GroupGrantee since it's an enum.
                 */
                currentGrantee = GroupGrantee.parseGroupGrantee(elementText);
            } else if (name.equals("DisplayName")) {
                ((CanonicalGrantee) currentGrantee).setDisplayName(elementText);
            } else if (name.equals("Permission")) {
                currentPermission = Permission.parsePermission(elementText);
            } else if (name.equals("Grant")) {
                accessControlList.grantPermission(currentGrantee, currentPermission);
                currentGrantee = null;
                currentPermission = null;
            } else if (name.equals("AccessControlList")) {
                insideACL = false;
            }
            this.currText = new StringBuilder();
        }

        public void characters(char ch[], int start, int length) {
            this.currText.append(ch, start, length);
        }
    }

    /**
     * Handler for LoggingStatus response XML documents for a bucket. The
     * document is parsed into an {@link BucketLoggingConfiguration} object available
     * via the {@link #getBucketLoggingConfiguration()} method.
     */
    public class BucketLoggingConfigurationHandler extends DefaultHandler {
        private BucketLoggingConfiguration bucketLoggingConfiguration = null;

        private String targetBucket = null;
        private String targetPrefix = null;
        private StringBuilder currText = null;

        public BucketLoggingConfigurationHandler() {
            this.currText = new StringBuilder();
        }

        /**
         * @return
         * an object representing the bucket's LoggingStatus document.
         */
        public BucketLoggingConfiguration getBucketLoggingConfiguration() {
            return bucketLoggingConfiguration;
        }

        public void startDocument() {
        }

        public void endDocument() {
        }

        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("BucketLoggingStatus")) {
                bucketLoggingConfiguration = new BucketLoggingConfiguration();
            }
        }

        public void endElement(String uri, String name, String qName) {
            String elementText = this.currText.toString();
            if (name.equals("TargetBucket")) {
                targetBucket = elementText;
            } else if (name.equals("TargetPrefix")) {
                targetPrefix = elementText;
            } else if (name.equals("LoggingEnabled")) {
                bucketLoggingConfiguration.setDestinationBucketName(targetBucket);
                bucketLoggingConfiguration.setLogFilePrefix(targetPrefix);
            }
            this.currText = new StringBuilder();
        }

        public void characters(char ch[], int start, int length) {
            this.currText.append(ch, start, length);
        }
    }

    /**
     * Handler for CreateBucketConfiguration response XML documents for a
     * bucket. The document is parsed into a String representing the bucket's
     * location, available via the {@link #getLocation()} method.
     */
    public class BucketLocationHandler extends DefaultHandler {
        private String location = null;

        private StringBuilder currText = null;

        public BucketLocationHandler() {
            super();
            this.currText = new StringBuilder();
        }

        /**
         * @return
         * the bucket's location.
         */
        public String getLocation() {
            return location;
        }

        public void startDocument() {
        }

        public void endDocument() {
        }

        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("CreateBucketConfiguration")) {
            }
        }

        public void endElement(String uri, String name, String qName) {
            String elementText = this.currText.toString();
            if (name.equals("LocationConstraint")) {
                if (elementText.length() == 0) {
                    location = null;
                } else {
                    location = elementText;
                }
            }
            this.currText = new StringBuilder();
        }

        public void characters(char ch[], int start, int length) {
            this.currText.append(ch, start, length);
        }
    }


    public class CopyObjectResultHandler extends DefaultHandler implements ServerSideEncryptionResult, ObjectExpirationResult {

        // Data items for successful copy
        private String etag = null;
        private Date lastModified = null;
        private String versionId = null;
        private String serverSideEncryption;
        private Date expirationTime;
        private String expirationTimeRuleId;

        // Data items for failed copy
        private String errorCode = null;
        private String errorMessage = null;
        private String errorRequestId = null;
        private String errorHostId = null;
        private boolean receivedErrorResponse = false;

        private StringBuilder currText = null;

        public CopyObjectResultHandler() {
            super();
            this.currText = new StringBuilder();
        }

        public Date getLastModified() {
            return lastModified;
        }

        public String getVersionId() {
            return versionId;
        }

        public void setVersionId(String versionId) {
            this.versionId = versionId;
        }

        public String getServerSideEncryption() {
            return serverSideEncryption;
        }

        public void setServerSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
        }

        public Date getExpirationTime() {
            return expirationTime;
        }

        public void setExpirationTime(Date expirationTime) {
            this.expirationTime = expirationTime;
        }

        public String getExpirationTimeRuleId() {
            return expirationTimeRuleId;
        }

        public void setExpirationTimeRuleId(String expirationTimeRuleId) {
            this.expirationTimeRuleId = expirationTimeRuleId;
        }

        public String getETag() {
            return etag;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public String getErrorHostId() {
            return errorHostId;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public String getErrorRequestId() {
            return errorRequestId;
        }

        public boolean isErrorResponse() {
            return receivedErrorResponse;
        }


        public void startDocument() {
        }

        public void endDocument() {
        }

        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("CopyObjectResult")) {
                receivedErrorResponse = false;
            } else if (name.equals("Error")) {
                receivedErrorResponse = true;
            }
        }

        public void endElement(String uri, String name, String qName) {
            String elementText = this.currText.toString();

            if (name.equals("LastModified")) {
                try {
                    lastModified = ServiceUtils.parseIso8601Date(elementText);
                } catch (ParseException e) {
                    throw new RuntimeException(
                        "Non-ISO8601 date for LastModified in copy object output: "
                        + elementText, e);
                }
            } else if (name.equals("ETag")) {
                etag = ServiceUtils.removeQuotes(elementText);
            } else if (name.equals("Code")) {
                errorCode = elementText;
            } else if (name.equals("Message")) {
                errorMessage = elementText;
            } else if (name.equals("RequestId")) {
                errorRequestId = elementText;
            } else if (name.equals("HostId")) {
                errorHostId = elementText;
            }

            this.currText = new StringBuilder();
        }

        public void characters(char ch[], int start, int length) {
            this.currText.append(ch, start, length);
        }
    }

    /**
     * Handler for RequestPaymentConfiguration response XML documents for a
     * bucket. The document is parsed into a boolean value: true if the bucket's
     * is configured as Requester Pays, false if it is configured as Owner pays.
     * This boolean value is available via the {@link #isRequesterPays()}
     * method.
     */
    public class RequestPaymentConfigurationHandler extends DefaultHandler {
        private String payer = null;

        private StringBuilder currText = null;

        public RequestPaymentConfigurationHandler() {
            super();
            this.currText = new StringBuilder();
        }

        /**
         * @return true if the bucket's is configured as Requester Pays, false
         *         if it is configured as Owner pays.
         */
        public boolean isRequesterPays() {
            return "Requester".equals(payer);
        }

        public void startDocument() {
        }

        public void endDocument() {
        }

        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("RequestPaymentConfiguration")) {
            }
        }

        public void endElement(String uri, String name, String qName) {
            String elementText = this.currText.toString();
            if (name.equals("Payer")) {
                payer = elementText;
            }
            this.currText = new StringBuilder();
        }

        public void characters(char ch[], int start, int length) {
            this.currText.append(ch, start, length);
        }
    }

    /**
     * Handler for ListVersionsResult XML document.
     */
    public class ListVersionsHandler extends DefaultHandler {
        private VersionListing versionListing;
        private List<S3VersionSummary> versionSummaries;
        private S3VersionSummary currentVersionSummary;
        private Owner owner;
        private StringBuilder text;
        private boolean insideCommonPrefixes = false;

        public VersionListing getListing() { return versionListing; }

        @Override
        public void startDocument() {
            versionListing = new VersionListing();
            versionSummaries = new ArrayList<S3VersionSummary>();
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("ListVersionsResult")) {
            } else if (name.equals("CommonPrefixes")) {
                insideCommonPrefixes = true;
            } else if (name.equals("Name")) {
            } else if (name.equals("Prefix")) {
            } else if (name.equals("Delimiter")) {
            } else if (name.equals("KeyMarker")) {
            } else if (name.equals("VersionIdMarker")) {
            } else if (name.equals("MaxKeys")) {
            } else if (name.equals("NextKeyMarker")) {
            } else if (name.equals("NextVersionIdMarker")) {
            } else if (name.equals("IsTruncated")) {
            } else if (name.equals("Version")) {
                currentVersionSummary = new S3VersionSummary();
                currentVersionSummary.setBucketName(versionListing.getBucketName());
            } else if (name.equals("DeleteMarker")) {
                currentVersionSummary = new S3VersionSummary();
                currentVersionSummary.setBucketName(versionListing.getBucketName());
                currentVersionSummary.setIsDeleteMarker(true);
            } else if (name.equals("Key")) {
            } else if (name.equals("VersionId")) {
            } else if (name.equals("IsLatest")) {
            } else if (name.equals("LastModified")) {
            } else if (name.equals("ETag")) {
            } else if (name.equals("Size")) {
            } else if (name.equals("Owner")) {
                this.owner = new Owner();
            } else if (name.equals("StorageClass")) {
            } else if (name.equals("ID")) {
            } else if (name.equals("DisplayName")) {
            } else {
                log.warn("Ignoring unexpected tag <"+name+">");
            }
            text.setLength(0);
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if (name.equals("ListVersionsResult")) {
                versionListing.setVersionSummaries(versionSummaries);
            } else if (name.equals("Name")) {
                versionListing.setBucketName(text.toString());
            } else if (!insideCommonPrefixes && name.equals("Prefix")) {
                versionListing.setPrefix(checkForEmptyString(text.toString()));
            } else if (insideCommonPrefixes && name.equals("Prefix")) {
                versionListing.getCommonPrefixes().add(checkForEmptyString(text.toString()));
            } else if (name.equals("CommonPrefixes")) {
                insideCommonPrefixes = false;
            } else if (name.equals("KeyMarker")) {
                versionListing.setKeyMarker(checkForEmptyString(text.toString()));
            } else if (name.equals("VersionIdMarker")) {
                versionListing.setVersionIdMarker(checkForEmptyString(text.toString()));
            } else if (name.equals("MaxKeys")) {
                versionListing.setMaxKeys(Integer.parseInt(text.toString()));
            } else if (name.equals("Delimiter")) {
                versionListing.setDelimiter(checkForEmptyString(text.toString()));
            } else if (name.equals("NextKeyMarker")) {
                versionListing.setNextKeyMarker(text.toString());
            } else if (name.equals("NextVersionIdMarker")) {
                versionListing.setNextVersionIdMarker(text.toString());
            } else if (name.equals("IsTruncated")) {
                versionListing.setTruncated("true".equals(text.toString()));
            } else if (name.equals("Version")) {
                assert(currentVersionSummary != null);
                versionSummaries.add(currentVersionSummary);
                currentVersionSummary = null;
            } else if (name.equals("DeleteMarker")) {
                assert(currentVersionSummary != null);
                versionSummaries.add(currentVersionSummary);
                currentVersionSummary = null;
            } else if (name.equals("Key")) {
                assert(currentVersionSummary != null);
                currentVersionSummary.setKey(text.toString());
            } else if (name.equals("VersionId")) {
                assert(currentVersionSummary != null);
                currentVersionSummary.setVersionId(text.toString());
            } else if (name.equals("IsLatest")) {
                assert(currentVersionSummary != null);
                currentVersionSummary.setIsLatest("true".equals(text.toString()));
            } else if (name.equals("LastModified")) {
                assert(currentVersionSummary != null);
                try {
                    currentVersionSummary.setLastModified(ServiceUtils.parseIso8601Date(text.toString()));
                } catch (ParseException e) {
                    throw new SAXException(
                        "Non-ISO8601 date for LastModified in copy object output: "
                        + text.toString(), e);
                }
            } else if (name.equals("ETag")) {
                assert(currentVersionSummary != null);
                assert(!currentVersionSummary.isDeleteMarker());
                currentVersionSummary.setETag(ServiceUtils.removeQuotes(text.toString()));
            } else if (name.equals("Size")) {
                assert(currentVersionSummary != null);
                assert(!currentVersionSummary.isDeleteMarker());
                currentVersionSummary.setSize(Long.parseLong(text.toString()));
            } else if (name.equals("Owner")) {
                currentVersionSummary.setOwner(owner);
                owner = null;
            } else if (name.equals("StorageClass")) {
                assert(currentVersionSummary != null);
                assert(!currentVersionSummary.isDeleteMarker());
                currentVersionSummary.setStorageClass(text.toString());
            } else if (name.equals("ID")) {
                assert(owner != null);
                owner.setId(text.toString());
            } else if (name.equals("DisplayName")) {
                assert(owner != null);
                owner.setDisplayName(text.toString());
            } else {
                log.warn("Ignoring unexpected tag <"+name+">");
            }
            text.setLength(0);
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }

    public class BucketWebsiteConfigurationHandler extends DefaultHandler {
    	private BucketWebsiteConfiguration configuration = new BucketWebsiteConfiguration(null);
    	private StringBuilder text;

    	boolean inIndexDocumentElement = false;
    	boolean inErrorDocumentElement = false;

    	public BucketWebsiteConfiguration getConfiguration() { return configuration; }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("WebsiteConfiguration")) {
            } else if (name.equals("IndexDocument")) {
            	inIndexDocumentElement = true;
            } else if (name.equals("Suffix") && inIndexDocumentElement) {
            } else if (name.equals("ErrorDocument")) {
            	inErrorDocumentElement = true;
            } else if (name.equals("Key") && inErrorDocumentElement) {
            } else {
                log.warn("Ignoring unexpected tag <"+name+">");
            }
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if (name.equals("WebsiteConfiguration")) {
            } else if (name.equals("IndexDocument")) {
            	inIndexDocumentElement = false;
            } else if (name.equals("Suffix") && inIndexDocumentElement) {
            	configuration.setIndexDocumentSuffix(text.toString());
            } else if (name.equals("ErrorDocument")) {
            	inErrorDocumentElement = false;
            } else if (name.equals("Key") && inErrorDocumentElement) {
            	configuration.setErrorDocument(text.toString());
            }
            text.setLength(0);
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }

    public class BucketVersioningConfigurationHandler extends DefaultHandler {
        private BucketVersioningConfiguration configuration = new BucketVersioningConfiguration();
        private StringBuilder text;

        public BucketVersioningConfiguration getConfiguration() { return configuration; }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("VersioningConfiguration")) {
            } else if (name.equals("Status")) {
                text.setLength(0);
            } else if (name.equals("MfaDelete")) {
                text.setLength(0);
            } else {
                log.warn("Ignoring unexpected tag <"+name+">");
            }
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if (name.equals("Status")) {
                configuration.setStatus(text.toString());
            } else if (name.equals("MfaDelete")) {
                String mfaDeleteStatus = text.toString();
                if (mfaDeleteStatus.equals("Disabled")) {
                    configuration.setMfaDeleteEnabled(false);
                } else if (mfaDeleteStatus.equals("Enabled")) {
                    configuration.setMfaDeleteEnabled(true);
                } else {
                    configuration.setMfaDeleteEnabled(null);
                }
            }
            text.setLength(0);
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }

    /*
     * <?xml version="1.0" encoding="UTF-8"?>
     * <CompleteMultipartUploadResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
     *     <Location>http://Example-Bucket.s3.amazonaws.com/Example-Object</Location>
     *     <Bucket>Example-Bucket</Bucket>
     *     <Key>Example-Object</Key>
     *     <ETag>"3858f62230ac3c915f300c664312c11f-9"</ETag>
     * </CompleteMultipartUploadResult>
     *
     * Or if an error occurred while completing:
     *
     * <?xml version="1.0" encoding="UTF-8"?>
     * <Error>
     *     <Code>InternalError</Code>
     *     <Message>We encountered an internal error. Please try again.</Message>
     *     <RequestId>656c76696e6727732072657175657374</RequestId>
     *     <HostId>Uuag1LuByRx9e6j5Onimru9pO4ZVKnJ2Qz7/C1NPcfTWAtRPfTaOFg==</HostId>
     * </Error>
     */
    public class CompleteMultipartUploadHandler extends DefaultHandler implements ServerSideEncryptionResult,
            ObjectExpirationResult {

        private StringBuilder text;

        // Successful completion
        private CompleteMultipartUploadResult result;

        public String getServerSideEncryption() {
            if ( result != null )
                return result.getServerSideEncryption();
            else
                return null;
        }

        public void setServerSideEncryption(String serverSideEncryption) {
            if ( result != null )
                result.setServerSideEncryption(serverSideEncryption);
        }

        /**
         * @see com.amazonaws.services.s3.model.CompleteMultipartUploadResult#getExpirationTime()
         */
        public Date getExpirationTime() {
            if ( result != null )
                return result.getExpirationTime();
            return null;
        }

        /**
         * @see com.amazonaws.services.s3.model.CompleteMultipartUploadResult#setExpirationTime(java.util.Date)
         */
        public void setExpirationTime(Date expirationTime) {
            if ( result != null )
                result.setExpirationTime(expirationTime);
        }

        /**
         * @see com.amazonaws.services.s3.model.CompleteMultipartUploadResult#getExpirationTimeRuleId()
         */
        public String getExpirationTimeRuleId() {
            if ( result != null )
                return result.getExpirationTimeRuleId();
            return null;
        }

        /**
         * @see com.amazonaws.services.s3.model.CompleteMultipartUploadResult#setExpirationTimeRuleId(java.lang.String)
         */
        public void setExpirationTimeRuleId(String expirationTimeRuleId) {
            if ( result != null )
                result.setExpirationTimeRuleId(expirationTimeRuleId);
        }

        // Error during completion
        private AmazonS3Exception ase;
        private String hostId;
        private String requestId;
        private String errorCode;

        public CompleteMultipartUploadResult getCompleteMultipartUploadResult() {
            return result;
        }

        public AmazonS3Exception getAmazonS3Exception() {
            return ase;
        }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            // Success response XML elements
            if (name.equals("CompleteMultipartUploadResult")) {
                result = new CompleteMultipartUploadResult();
            } else if (name.equals("Location")) {
            } else if (name.equals("Bucket")) {
            } else if (name.equals("Key")) {
            } else if (name.equals("ETag")) {
            }

            // Error response XML elements
            if (name.equals("Error")) {
            } else if (name.equals("Code")) {
            } else if (name.equals("Message")) {
            } else if (name.equals("RequestId")) {
            } else if (name.equals("HostId")) {
            }
            text.setLength(0);
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if (result != null) {
                // Success response XML elements
                if (name.equals("CompleteMultipartUploadResult")) {
                } else if (name.equals("Location")) {
                    result.setLocation(text.toString());
                } else if (name.equals("Bucket")) {
                    result.setBucketName(text.toString());
                } else if (name.equals("Key")) {
                    result.setKey(text.toString());
                } else if (name.equals("ETag")) {
                    result.setETag(ServiceUtils.removeQuotes(text.toString()));
                }
            } else {
                // Error response XML elements
                if (name.equals("Error")) {
                    ase.setErrorCode(errorCode);
                    ase.setRequestId(requestId);
                    ase.setExtendedRequestId(hostId);
                } else if (name.equals("Code")) {
                    errorCode = text.toString();
                } else if (name.equals("Message")) {
                    ase = new AmazonS3Exception(text.toString());
                } else if (name.equals("RequestId")) {
                    requestId = text.toString();
                } else if (name.equals("HostId")) {
                    hostId = text.toString();
                }
            }
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }

    /*
     * <?xml version="1.0" encoding="UTF-8"?>
     * <InitiateMultipartUploadResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
     *     <Bucket>example-bucket</Bucket>
     *     <Key>example-object</Key>
     *     <UploadId>VXBsb2FkIElEIGZvciA2aWWpbmcncyBteS1tb3ZpZS5tMnRzIHVwbG9hZA</UploadId>
     * </InitiateMultipartUploadResult>
     */
    public class InitiateMultipartUploadHandler extends DefaultHandler {
        private StringBuilder text;

        private InitiateMultipartUploadResult result;

        public InitiateMultipartUploadResult getInitiateMultipartUploadResult() {
            return result;
        }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("InitiateMultipartUploadResult")) {
                result = new InitiateMultipartUploadResult();
            } else if (name.equals("Bucket")) {
            } else if (name.equals("Key")) {
            } else if (name.equals("UploadId")) {
            }
            text.setLength(0);
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if (name.equals("InitiateMultipartUploadResult")) {
            } else if (name.equals("Bucket")) {
                result.setBucketName(text.toString());
            } else if (name.equals("Key")) {
                result.setKey(text.toString());
            } else if (name.equals("UploadId")) {
                result.setUploadId(text.toString());
            }
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }

    /*
     * HTTP/1.1 200 OK
     * x-amz-id-2: Uuag1LuByRx9e6j5Onimru9pO4ZVKnJ2Qz7/C1NPcfTWAtRPfTaOFg==
     * x-amz-request-id: 656c76696e6727732072657175657374
     * Date: Tue, 16 Feb 2010 20:34:56 GMT
     * Content-Length: 1330
     * Connection: keep-alive
     * Server: AmazonS3
     *
     * <?xml version="1.0" encoding="UTF-8"?>
     * <ListMultipartUploadsResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
     *     <Bucket>bucket</Bucket>
     *     <KeyMarker></KeyMarker>
     *     <Delimiter>/</Delimiter>
     *     <Prefix/>
     *     <UploadIdMarker></UploadIdMarker>
     *     <NextKeyMarker>my-movie.m2ts</NextKeyMarker>
     *     <NextUploadIdMarker>YW55IGlkZWEgd2h5IGVsdmluZydzIHVwbG9hZCBmYWlsZWQ</NextUploadIdMarker>
     *     <MaxUploads>3</MaxUploads>
     *     <IsTruncated>true</IsTruncated>
     *     <Upload>
     *         <Key>my-divisor</Key>
     *         <UploadId>XMgbGlrZSBlbHZpbmcncyBub3QgaGF2aW5nIG11Y2ggbHVjaw</UploadId>
     *         <Owner>
     *             <ID>b1d16700c70b0b05597d7acd6a3f92be</ID>
     *             <DisplayName>delving</DisplayName>
     *         </Owner>
     *         <StorageClass>STANDARD</StorageClass>
     *         <Initiated>Tue, 26 Jan 2010 19:42:19 GMT</Initiated>
     *     </Upload>
     *     <Upload>
     *         <Key>my-movie.m2ts</Key>
     *         <UploadId>VXBsb2FkIElEIGZvciBlbHZpbmcncyBteS1tb3ZpZS5tMnRzIHVwbG9hZA</UploadId>
     *         <Owner>
     *             <ID>b1d16700c70b0b05597d7acd6a3f92be</ID>
     *             <DisplayName>delving</DisplayName>
     *         </Owner>
     *         <StorageClass>STANDARD</StorageClass>
     *         <Initiated>Tue, 16 Feb 2010 20:34:56 GMT</Initiated>
     *     </Upload>
     *     <Upload>
     *         <Key>my-movie.m2ts</Key>
     *         <UploadId>YW55IGlkZWEgd2h5IGVsdmluZydzIHVwbG9hZCBmYWlsZWQ</UploadId>
     *         <Owner>
     *             <ID>b1d16700c70b0b05597d7acd6a3f92be</ID>
     *             <DisplayName>delving</DisplayName>
     *         </Owner>
     *         <StorageClass>STANDARD</StorageClass>
     *         <Initiated>Wed, 27 Jan 2010 03:02:01 GMT</Initiated>
     *     </Upload>
     *    <CommonPrefixes>
     *        <Prefix>photos/</Prefix>
     *    </CommonPrefixes>
     *    <CommonPrefixes>
     *        <Prefix>videos/</Prefix>
     *    </CommonPrefixes>
     * </ListMultipartUploadsResult>
     */
    public class ListMultipartUploadsHandler extends DefaultHandler {
        private StringBuilder text;

        private MultipartUploadListing result;

        private MultipartUpload currentMultipartUpload;
        private Owner currentOwner;
        private Owner currentInitiator;

        boolean inCommonPrefixes = false;

        public MultipartUploadListing getListMultipartUploadsResult() {
            return result;
        }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("ListMultipartUploadsResult")) {
                result = new MultipartUploadListing();
            } else if (name.equals("Bucket")) {
            } else if (name.equals("KeyMarker")) {
            } else if (name.equals("Delimiter")) {
            } else if (name.equals("UploadIdMarker")) {
            } else if (name.equals("NextKeyMarker")) {
            } else if (name.equals("NextUploadIdMarker")) {
            } else if (name.equals("MaxUploads")) {
            } else if (name.equals("IsTruncated")) {
            } else if (name.equals("Upload")) {
                currentMultipartUpload = new MultipartUpload();
            } else if (name.equals("Key")) {
            } else if (name.equals("UploadId")) {
            } else if (name.equals("Owner")) {
                currentOwner = new Owner();
            } else if (name.equals("Initiator")) {
                currentInitiator = new Owner();
            } else if (name.equals("ID")) {
            } else if (name.equals("DisplayName")) {
            } else if (name.equals("StorageClass")) {
            } else if (name.equals("Initiated")) {
            } else if (name.equals("CommonPrefixes")) {
            	inCommonPrefixes = true;
            }
            text.setLength(0);
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if (name.equals("ListMultipartUploadsResult")) {
            } else if (name.equals("Bucket")) {
                result.setBucketName(text.toString());
            } else if (name.equals("KeyMarker")) {
                result.setKeyMarker(checkForEmptyString(text.toString()));
            } else if (name.equals("Delimiter")) {
                result.setDelimiter(checkForEmptyString(text.toString()));
            } else if (name.equals("Prefix") && inCommonPrefixes == false) {
            	result.setPrefix(checkForEmptyString(text.toString()));
            } else if (name.equals("Prefix") && inCommonPrefixes == true) {
            	result.getCommonPrefixes().add(text.toString());
            } else if (name.equals("UploadIdMarker")) {
                result.setUploadIdMarker(checkForEmptyString(text.toString()));
            } else if (name.equals("NextKeyMarker")) {
                result.setNextKeyMarker(checkForEmptyString(text.toString()));
            } else if (name.equals("NextUploadIdMarker")) {
                result.setNextUploadIdMarker(checkForEmptyString(text.toString()));
            } else if (name.equals("MaxUploads")) {
                result.setMaxUploads(Integer.parseInt(text.toString()));
            } else if (name.equals("IsTruncated")) {
                result.setTruncated(Boolean.parseBoolean(text.toString()));
            } else if (name.equals("Upload")) {
                result.getMultipartUploads().add(currentMultipartUpload);
            } else if (name.equals("Key")) {
                currentMultipartUpload.setKey(text.toString());
            } else if (name.equals("UploadId")) {
                currentMultipartUpload.setUploadId(text.toString());
            } else if (name.equals("Owner")) {
                currentMultipartUpload.setOwner(currentOwner);
                currentOwner = null;
            } else if (name.equals("Initiator")) {
                currentMultipartUpload.setInitiator(currentInitiator);
                currentInitiator = null;
            } else if (name.equals("ID") && currentOwner != null) {
                currentOwner.setId(checkForEmptyString(text.toString()));
            } else if (name.equals("DisplayName") && currentOwner != null) {
                currentOwner.setDisplayName(checkForEmptyString(text.toString()));
            } else if (name.equals("ID") && currentInitiator != null) {
                currentInitiator.setId(checkForEmptyString(text.toString()));
            } else if (name.equals("DisplayName") && currentInitiator != null) {
                currentInitiator.setDisplayName(checkForEmptyString(text.toString()));
            } else if (name.equals("StorageClass")) {
                currentMultipartUpload.setStorageClass(text.toString());
            } else if (name.equals("Initiated")) {
                try {
                    currentMultipartUpload.setInitiated(ServiceUtils.parseIso8601Date(text.toString()));
                } catch (ParseException e) {
                    throw new SAXException(
                            "Non-ISO8601 date for Initiated in initiate multipart upload result: "
                            + text.toString(), e);
                }
            } else if (name.equals("CommonPrefixes")) {
            	inCommonPrefixes = false;
            }
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }

    /*
     * HTTP/1.1 200 OK
     * x-amz-id-2: Uuag1LuByRx9e6j5Onimru9pO4ZVKnJ2Qz7/C1NPcfTWAtRPfTaOFg==
     * x-amz-request-id: 656c76696e6727732072657175657374
     * Date: Tue, 16 Feb 2010 20:34:56 GMT
     * Content-Length: 985
     * Connection: keep-alive
     * Server: AmazonS3
     *
     * <?xml version="1.0" encoding="UTF-8"?>
     * <ListPartsResult xmlns="http://s3.amazonaws.com/doc/2006-03-01/">
     *     <Bucket>example-bucket</Bucket>
     *     <Key>example-object</Key>
     *     <UploadId>XXBsb2FkIElEIGZvciBlbHZpbmcncyVcdS1tb3ZpZS5tMnRzEEEwbG9hZA</UploadId>
     *     <Owner>
     *         <ID>x1x16700c70b0b05597d7ecd6a3f92be</ID>
     *         <DisplayName>username</DisplayName>
     *     </Owner>
     *     <Initiator>
     *         <ID>x1x16700c70b0b05597d7ecd6a3f92be</ID>
     *         <DisplayName>username</DisplayName>
     *     </Initiator>
     *     <StorageClass>STANDARD</StorageClass>
     *     <PartNumberMarker>1</PartNumberMarker>
     *     <NextPartNumberMarker>3</NextPartNumberMarker>
     *     <MaxParts>2</MaxParts>
     *     <IsTruncated>true</IsTruncated>
     *     <Part>
     *         <PartNumber>2</PartNumber>
     *         <LastModified>Wed, 27 Jan 2010 03:02:03 GMT</LastModified>
     *         <ETag>"7778aef83f66abc1fa1e8477f296d394"</ETag>
     *         <Size>10485760</Size>
     *     </Part>
     *     <Part>
     *        <PartNumber>3</PartNumber>
     *        <LastModified>Wed, 27 Jan 2010 03:02:02 GMT</LastModified>
     *        <ETag>"aaaa18db4cc2f85cedef654fccc4a4x8"</ETag>
     *        <Size>10485760</Size>
     *     </Part>
     * </ListPartsResult>
     */
    public class ListPartsHandler extends DefaultHandler {
        private StringBuilder text;

        private PartListing result;
        private Owner currentOwner;
        private Owner currentInitiator;
        private PartSummary currentPart;

        public PartListing getListPartsResult() {
            return result;
        }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("ListPartsResult")) {
                result = new PartListing();
            } else if (name.equals("Bucket")) {
            } else if (name.equals("Key")) {
            } else if (name.equals("UploadId")) {
            } else if (name.equals("Owner")) {
                currentOwner = new Owner();
            } else if (name.equals("Initiator")) {
                currentInitiator = new Owner();
            } else if (name.equals("ID")) {
            } else if (name.equals("DisplayName")) {
            } else if (name.equals("StorageClass")) {
            } else if (name.equals("PartNumberMarker")) {
            } else if (name.equals("NextPartNumberMarker")) {
            } else if (name.equals("MaxParts")) {
            } else if (name.equals("IsTruncated")) {
            } else if (name.equals("Part")) {
                currentPart = new PartSummary();
            } else if (name.equals("PartNumber")) {
            } else if (name.equals("LastModified")) {
            } else if (name.equals("ETag")) {
            } else if (name.equals("Size")) {
            }
            text.setLength(0);
        }

        private Integer parseInteger(String text) {
            text = checkForEmptyString(text.toString());
            if (text == null) return null;
            return Integer.parseInt(text);
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if (name.equals("ListPartsResult")) {
            } else if (name.equals("Bucket")) {
                result.setBucketName(text.toString());
            } else if (name.equals("Key")) {
                result.setKey(text.toString());
            } else if (name.equals("UploadId")) {
                result.setUploadId(text.toString());
            } else if (name.equals("Owner")) {
                result.setOwner(currentOwner);
                currentOwner = null;
            } else if (name.equals("Initiator")) {
                result.setInitiator(currentInitiator);
                currentInitiator = null;
            } else if (name.equals("ID") && currentOwner != null) {
                currentOwner.setId(checkForEmptyString(text.toString()));
            } else if (name.equals("DisplayName") && currentOwner != null) {
                currentOwner.setDisplayName(checkForEmptyString(text.toString()));
            } else if (name.equals("ID") && currentInitiator != null) {
                currentInitiator.setId(checkForEmptyString(text.toString()));
            } else if (name.equals("DisplayName") && currentInitiator != null) {
                currentInitiator.setDisplayName(checkForEmptyString(text.toString()));
            } else if (name.equals("StorageClass")) {
                result.setStorageClass(text.toString());
            } else if (name.equals("PartNumberMarker")) {
                result.setPartNumberMarker(parseInteger(text.toString()));
            } else if (name.equals("NextPartNumberMarker")) {
                result.setNextPartNumberMarker(parseInteger(text.toString()));
            } else if (name.equals("MaxParts")) {
                result.setMaxParts(parseInteger(text.toString()));
            } else if (name.equals("IsTruncated")) {
                result.setTruncated(Boolean.parseBoolean(text.toString()));
            } else if (name.equals("Part")) {
                result.getParts().add(currentPart);
            } else if (name.equals("PartNumber")) {
                currentPart.setPartNumber(Integer.parseInt(text.toString()));
            } else if (name.equals("LastModified")) {
                try {
                    currentPart.setLastModified(ServiceUtils.parseIso8601Date(text.toString()));
                } catch (ParseException e) {
                    throw new SAXException(
                            "Non-ISO8601 date for LastModified in list parts result: "
                            + text.toString(), e);
                }
            } else if (name.equals("ETag")) {
                currentPart.setETag(ServiceUtils.removeQuotes(text.toString()));
            } else if (name.equals("Size")) {
                currentPart.setSize(Long.parseLong(text.toString()));
            }
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }

    public class BucketNotificationConfigurationHandler extends DefaultHandler {
        private BucketNotificationConfiguration configuration = new BucketNotificationConfiguration();
        private StringBuilder text;
        private List<TopicConfiguration> topicConfigurations;
        private String topic;
        private String event;

        public BucketNotificationConfiguration getConfiguration() { return configuration; }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("NotificationConfiguration")) {
                topicConfigurations = new ArrayList<BucketNotificationConfiguration.TopicConfiguration>(1);
            }
            else if (name.equals("TopicConfiguration")) {
                topic = null;
                event = null;
            } else if (name.equals("Topic")) {
                text.setLength(0);
            } else if (name.equals("Event")) {
                text.setLength(0);
            } else {
                log.warn("Ignoring unexpected tag <"+name+">");
            }
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if (name.equals("Topic")) {
                topic = text.toString();
            }
            else if (name.equals("Event")) {
                event = text.toString();
            }
            else if (name.equals("TopicConfiguration")) {
                if ( topic != null && event != null ) {
                    topicConfigurations.add( new TopicConfiguration( topic, event ) );
                }
            }
            else if (name.equals("NotificationConfiguration")) {
                configuration.setTopicConfigurations( topicConfigurations );
            }
            text.setLength(0);
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }
    
    public class BucketTaggingConfigurationHandler extends DefaultHandler {
        private BucketTaggingConfiguration configuration = new BucketTaggingConfiguration();
        private StringBuilder text;
        private List<TagSet> tagSets;
        private Map<String, String> tags;
        private String tagKey;
        private String tagValue;

        public BucketTaggingConfiguration getConfiguration() { return configuration; }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if (name.equals("Tagging")) {
                tagSets = new ArrayList<TagSet>(1);
            } else if (name.equals("TagSet")) {
            	tags = new HashMap<String, String>( 1 );
            } else if (name.equals("Tag")) {
                tagKey = null;
                tagValue = null;
            } else if (name.equals("Key")) {
                text.setLength(0);
            } else if (name.equals("Value")) {
                text.setLength(0);
            } else {
                log.warn("Ignoring unexpected tag <"+name+">");
            }
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if (name.equals("Key")) {
                tagKey = text.toString();
            } else if (name.equals("Value")) {
                tagValue = text.toString();
            } else if (name.equals("Tag")) {
            	if (tagKey != null && tagValue != null) {
            		tags.put(tagKey, tagValue);
            	}
            } else if (name.equals("TagSet")) {
                tagSets.add(new TagSet(tags));
            } else if (name.equals("Tagging")) {
                configuration.setTagSets(tagSets);
            }
            text.setLength(0);
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }

    /*
        HTTP/1.1 200 OK
        x-amz-id-2: Uuag1LuByRx9e6j5Onimru9pO4ZVKnJ2Qz7/C1NPcfTWAtRPfTaOFg==
        x-amz-request-id: 656c76696e6727732072657175657374
        Date: Tue, 20 Sep 2012 20:34:56 GMT
        Content-Type: application/xml
        Transfer-Encoding: chunked
        Connection: keep-alive
        Server: AmazonS3

        <?xml version="1.0" encoding="UTF-8"?>
        <DeleteResult>
            <Deleted>
               <Key>Key</Key>
               <VersionId>Version</VersionId>
            </Deleted>
            <Error>
               <Key>Key</Key>
               <VersionId>Version</VersionId>
               <Code>Code</Code>
               <Message>Message</Message>
            </Error>
            <Deleted>
               <Key>Key</Key>
               <DeleteMarker>true</DeleteMarker>
               <DeleteMarkerVersionId>Version</DeleteMarkerVersionId>
            </Deleted>
        </DeleteResult>
     */
    public class DeleteObjectsHandler extends DefaultHandler {
        private StringBuilder text;

        private DeletedObject deletedObject = null;
        private DeleteError error = null;
        private List<DeletedObject> deletedObjects = new LinkedList<DeleteObjectsResult.DeletedObject>();
        private List<DeleteError> deleteErrors = new LinkedList<MultiObjectDeleteException.DeleteError>();

        public DeleteObjectsResponse getDeleteObjectResult() {
            return new DeleteObjectsResponse(deletedObjects, deleteErrors);
        }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if ( name.equals("Deleted") ) {
                deletedObject = new DeletedObject();
            } else if ( name.equals("Error") ) {
                error = new DeleteError();
            } else if ( name.equals("Key") ) {
            } else if ( name.equals("VersionId") ) {
            } else if ( name.equals("Code") ) {
            } else if ( name.equals("Message") ) {
            } else if ( name.equals("DeleteMarker") ) {
            } else if ( name.equals("DeleteMarkerVersionId") ) {
            } else if ( name.equals("DeleteResult") ) {
            } else {
                log.warn("Unexpected tag: " + name);
            }
            text.setLength(0);
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if ( name.equals("Deleted") ) {
                deletedObjects.add(deletedObject);
                deletedObject = null;
            } else if ( name.equals("Error") ) {
                deleteErrors.add(error);
                error = null;
            } else if ( name.equals("Key") ) {
                if ( deletedObject != null ) {
                    deletedObject.setKey(text.toString());
                } else if ( error != null ) {
                    error.setKey(text.toString());
                }
            } else if ( name.equals("VersionId") ) {
                if ( deletedObject != null ) {
                    deletedObject.setVersionId(text.toString());
                } else if ( error != null ) {
                    error.setVersionId(text.toString());
                }
            } else if ( name.equals("Code") ) {
                if ( error != null ) {
                    error.setCode(text.toString());
                }
            } else if ( name.equals("Message") ) {
                if ( error != null ) {
                    error.setMessage(text.toString());
                }
            } else if ( name.equals("DeleteMarker") ) {
                if ( deletedObject != null ) {
                    deletedObject.setDeleteMarker(text.toString().equals("true"));
                }
            } else if ( name.equals("DeleteMarkerVersionId") ) {
                if ( deletedObject != null ) {
                    deletedObject.setDeleteMarkerVersionId(text.toString());
                }
            }
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }

    /*
    HTTP/1.1 200 OK
    x-amz-id-2: Uuag1LuByRx9e6j5Onimru9pO4ZVKnJ2Qz7/C1NPcfTWAtRPfTaOFg==
    x-amz-request-id: 656c76696e6727732072657175657374
    Date: Tue, 20 Sep 2012 20:34:56 GMT
    Content-Length: xxx
    Connection: keep-alive
    Server: AmazonS3

    <LifecycleConfiguration>
        <Rule>
            <ID>Expire object after 10 days</ID>
            <Prefix>prefix</Prefix>
            <Status>Enabled</Status>
            <Expiration>
                <Days>10</Days>
            </Expiration>
        </Rule>
    </LifecycleConfiguration>
    */
    public class BucketLifecycleConfigurationHandler extends DefaultHandler {
        private StringBuilder text;
        private Rule rule;
        private List<Rule> rules = new LinkedList<Rule>();

        public BucketLifecycleConfiguration getConfiguration() {
            return new BucketLifecycleConfiguration(rules);
        }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if ( name.equals("LifecycleConfiguration") ) {
            } else if ( name.equals("Rule") ) {
                rule = new Rule();
            } else if ( name.equals("ID") ) {
            } else if ( name.equals("Prefix") ) {
            } else if ( name.equals("Status") ) {
            } else if ( name.equals("Expiration") ) {
            } else if ( name.equals("Days") ) {
            } else {
                log.warn("Unexpected tag: " + name);
            }
            text.setLength(0);
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if ( name.equals("LifecycleConfiguration") ) {
            } else if ( name.equals("Rule") ) {
                rules.add(rule);
                rule = null;
            } else if ( name.equals("ID") ) {
                rule.setId(text.toString());
            } else if ( name.equals("Prefix") ) {
                rule.setPrefix(text.toString());
            } else if ( name.equals("Status") ) {
                rule.setStatus(text.toString());
            } else if ( name.equals("Expiration") ) {
            } else if ( name.equals("Days") ) {
                rule.setExpirationInDays(Integer.parseInt(text.toString()));
            } else {
                log.warn("Unexpected tag: " + name);
            }
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }
    
    /*
    HTTP/1.1 200 OK
    x-amz-id-2: Uuag1LuByRx9e6j5Onimru9pO4ZVKnJ2Qz7/C1NPcfTWAtRPfTaOFg==
    x-amz-request-id: 656c76696e6727732072657175657374
    Date: Tue, 20 Sep 2011 20:34:56 GMT
    Content-Length: Some Length
    Connection: keep-alive
    Server: AmazonS3
    <CORSConfiguration>
       <CORSRule>
         <AllowedOrigin>http://www.foobar.com</AllowedOrigin>
         <AllowedMethod>GET</AllowedMethod>
         <MaxAgeSeconds>3000</MaxAgeSec>
         <ExposeHeader>x-amz-server-side-encryption</ExposeHeader>
       </CORSRule>
    </CORSConfiguration>
    */
    public class  BucketCrossOriginConfigurationHandler extends DefaultHandler {
        private StringBuilder text;
        private CORSRule rule;
        private List<CORSRule> rules = new LinkedList<CORSRule>();
        private List<AllowedMethods> allowedMethods = null;
        private List<String> allowedOrigins = null;
        private List<String> exposedHeaders = null;
        private List<String> allowedHeaders = null;

        public BucketCrossOriginConfiguration getConfiguration() {
            return new BucketCrossOriginConfiguration(rules);
        }

        @Override
        public void startDocument() {
            text = new StringBuilder();
        }

        @Override
        public void startElement(String uri, String name, String qName, Attributes attrs) {
            if ( name.equals("CORSConfiguration") ) {
            } else if ( name.equals("CORSRule") ) {
                rule = new CORSRule();
            } else if (name.equals("ID")) {
            } else if ( name.equals("AllowedOrigin") ) {
            	if (allowedOrigins == null) {
            		allowedOrigins = new LinkedList<String>();
            	}
            } else if ( name.equals("AllowedMethod") ) {
            	if(allowedMethods == null) {
            		allowedMethods = new LinkedList<AllowedMethods>();
            	}
            } else if ( name.equals("MaxAgeSeconds") ) {
            } else if ( name.equals("ExposeHeader") ) {
            	if(exposedHeaders == null) {
            		exposedHeaders = new LinkedList<String>();
            	}
            } else if ( name.equals("AllowedHeader") ) {
            	if(allowedHeaders == null) {
            	allowedHeaders = new LinkedList<String>();
            	}
            } else {
                log.warn("Unexpected tag: " + name);
            }
            text.setLength(0);
        }

        @Override
        public void endElement(String uri, String name, String qName) throws SAXException {
            if ( name.equals("CORSConfiguration") ) {
            } else if ( name.equals("CORSRule") ) {
            	rule.setAllowedHeaders(allowedHeaders);
            	rule.setAllowedMethods(allowedMethods);
            	rule.setAllowedOrigins(allowedOrigins);
            	rule.setExposedHeaders(exposedHeaders);
            	allowedHeaders = null;
            	allowedMethods = null;
            	allowedOrigins = null;
            	exposedHeaders = null;
                rules.add(rule);
                rule = null;
            } else if ( name.equals("ID") ) {
                rule.setId(text.toString());
            } else if ( name.equals("AllowedOrigin") ) {
                allowedOrigins.add(text.toString());
            } else if ( name.equals("AllowedMethod") ) {
                 allowedMethods.add(AllowedMethods.fromValue(text.toString()));
            } else if ( name.equals("MaxAgeSeconds") ) {
            	rule.setMaxAgeSeconds(Integer.parseInt(text.toString()));
            } else if ( name.equals("ExposeHeader") ) {
                exposedHeaders.add(text.toString());
            } else if (name.equals("AllowedHeader")) {
            	allowedHeaders.add(text.toString());
            } else {
                log.warn("Unexpected tag: " + name);
            }
        }

        @Override
        public void characters(char ch[], int start, int length) {
            this.text.append(ch, start, length);
        }
    }

    private static String findAttributeValue( String qnameToFind, Attributes attrs ) {
        for ( int i = 0; i < attrs.getLength(); i++ ) {
            String qname = attrs.getQName( i );
            if ( qname.trim().equalsIgnoreCase( qnameToFind.trim() ) ) {
                return attrs.getValue( i );
            }
        }

        return null;
    }


}
