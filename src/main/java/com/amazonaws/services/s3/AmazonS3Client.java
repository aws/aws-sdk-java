/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.HttpMethod;
import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.s3.internal.BucketNameUtils;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.MD5DigestCalculatingInputStream;
import com.amazonaws.services.s3.internal.Mimetypes;
import com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler;
import com.amazonaws.services.s3.internal.ProgressReportingInputStream;
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.s3.internal.RepeatableInputStream;
import com.amazonaws.services.s3.internal.ResponseHeaderHandlerChain;
import com.amazonaws.services.s3.internal.S3ErrorResponseHandler;
import com.amazonaws.services.s3.internal.S3MetadataResponseHandler;
import com.amazonaws.services.s3.internal.S3ObjectResponseHandler;
import com.amazonaws.services.s3.internal.S3QueryStringSigner;
import com.amazonaws.services.s3.internal.S3Signer;
import com.amazonaws.services.s3.internal.S3StringResponseHandler;
import com.amazonaws.services.s3.internal.S3VersionHeaderHandler;
import com.amazonaws.services.s3.internal.S3XmlResponseHandler;
import com.amazonaws.services.s3.internal.ServerSideEncryptionHeaderHandler;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketPolicy;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CreateBucketRequest;
import com.amazonaws.services.s3.model.DeleteBucketPolicyRequest;
import com.amazonaws.services.s3.model.DeleteBucketRequest;
import com.amazonaws.services.s3.model.DeleteBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.DeleteVersionRequest;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.GenericBucketRequest;
import com.amazonaws.services.s3.model.GetBucketAclRequest;
import com.amazonaws.services.s3.model.GetBucketLocationRequest;
import com.amazonaws.services.s3.model.GetBucketPolicyRequest;
import com.amazonaws.services.s3.model.GetBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListBucketsRequest;
import com.amazonaws.services.s3.model.ListMultipartUploadsRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ListPartsRequest;
import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.MultiFactorAuthentication;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.ProgressEvent;
import com.amazonaws.services.s3.model.ProgressListener;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.SetBucketAclRequest;
import com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketNotificationConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketPolicyRequest;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.services.s3.model.transform.AclXmlFactory;
import com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.MultiObjectDeleteXmlFactory;
import com.amazonaws.services.s3.model.transform.RequestXmlFactory;
import com.amazonaws.services.s3.model.transform.Unmarshallers;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser.CompleteMultipartUploadHandler;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser.CopyObjectResultHandler;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.BinaryUtils;

/**
 * <p>
 * Provides the client for accessing the Amazon S3 web service.
 * </p>
 * <p>
 * Amazon S3 provides storage for the Internet,
 * and is designed to make web-scale computing easier for developers.
 * </p>
 * <p>
 * The Amazon S3 Java SDK provides a simple interface that can be
 * used to store and retrieve any amount of data, at any time,
 * from anywhere on the web. It gives any developer access to the same
 * highly scalable, reliable, secure, fast, inexpensive infrastructure
 * that Amazon uses to run its own global network of web sites.
 * The service aims to maximize benefits of scale and to pass those
 * benefits on to developers.
 * </p>
 * <p>
 * For more information about Amazon S3, please see
 * <a href="http://aws.amazon.com/s3">
 * http://aws.amazon.com/s3</a>
 * </p>
 */
public class AmazonS3Client extends AmazonWebServiceClient implements AmazonS3 {

    /** Shared logger for client events */
    private static Log log = LogFactory.getLog(AmazonS3Client.class);

    /** Responsible for handling error responses from all S3 service calls. */
    private S3ErrorResponseHandler errorResponseHandler = new S3ErrorResponseHandler();

    /** Shared response handler for operations with no response.  */
    private S3XmlResponseHandler<Void> voidResponseHandler = new S3XmlResponseHandler<Void>(null);

    /** Utilities for validating bucket names */
    private final BucketNameUtils bucketNameUtils = new BucketNameUtils();

    /** Shared factory for converting configuration objects to XML */
    private static final BucketConfigurationXmlFactory bucketConfigurationXmlFactory = new BucketConfigurationXmlFactory();

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;


    /**
     * <p>
     * Constructs a new Amazon S3 client that will make <b>anonymous</b>
     * requests to Amazon S3.
     * </p>
     * <p>
     * Only a subset of the Amazon S3 API will work with anonymous
     * (i.e. unsigned) requests, but this can prove useful in some situations.
     * For example:
     * <ul>
     * 	<li>If an Amazon S3 bucket has {@link Permission#Read} permission for the
     * 	{@link GroupGrantee#AllUsers} group, anonymous clients can call
     * 	{@link #listObjects(String)} to see what objects are stored in a bucket.</li>
     * 	<li>If an object has {@link Permission#Read} permission for the
     * 	{@link GroupGrantee#AllUsers} group, anonymous clients can call
     * 	{@link #getObject(String, String)} and
     * 	{@link #getObjectMetadata(String, String)} to pull object content and
     * 	metadata.</li>
     * 	<li>If a bucket has {@link Permission#Write} permission for the
     * 	{@link GroupGrantee#AllUsers} group, anonymous clients can upload objects
     * 	to the bucket.</li>
     * </ul>
     * </p>
     *
     * @see AmazonS3Client#AmazonS3Client(AWSCredentials)
     * @see AmazonS3Client#AmazonS3Client(AWSCredentials, ClientConfiguration)
     */
    public AmazonS3Client() {
        this((AWSCredentials)null);
    }

    /**
     * Constructs a new Amazon S3 client using the specified AWS credentials to
     * access Amazon S3.
     *
     * @param awsCredentials
     *            The AWS credentials to use when making requests to Amazon S3
     *            with this client.
     *
     * @see AmazonS3Client#AmazonS3Client()
     * @see AmazonS3Client#AmazonS3Client(AWSCredentials, ClientConfiguration)
     */
    public AmazonS3Client(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new Amazon S3 client using the specified AWS credentials and
     * client configuration to access Amazon S3.
     *
     * @param awsCredentials
     *            The AWS credentials to use when making requests to Amazon S3
     *            with this client.
     * @param clientConfiguration
     *            The client configuration options controlling how this client
     *            connects to Amazon S3 (e.g. proxy settings, retry counts, etc).
     *
     * @see AmazonS3Client#AmazonS3Client()
     * @see AmazonS3Client#AmazonS3Client(AWSCredentials)
     */
    public AmazonS3Client(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new Amazon S3 client using the specified AWS credentials
     * provider to access Amazon S3.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonS3Client(AWSCredentialsProvider credentialsProvider) {
        this(credentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new Amazon S3 client using the specified AWS credentials and
     * client configuration to access Amazon S3.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            The client configuration options controlling how this client
     *            connects to Amazon S3 (e.g. proxy settings, retry counts, etc).
     */
    public AmazonS3Client(AWSCredentialsProvider credentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = credentialsProvider;
        init();
    }

    private void init() {
        setEndpoint(Constants.S3_HOSTNAME);

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/s3/request.handlers"));
    }

	/**
	 * Appends a request handler to the list of registered handlers that are run
	 * as part of a request's lifecycle.
	 *
	 * @param requestHandler
	 *            The new handler to add to the current list of request
	 *            handlers.
	 */
    public void addRequestHandler(RequestHandler requestHandler) {
    	requestHandlers.add(requestHandler);
    }


    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listNextBatchOfVersions(com.amazonaws.services.s3.model.S3VersionListing)
     */
    public VersionListing listNextBatchOfVersions(VersionListing previousVersionListing)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(previousVersionListing,
            "The previous version listing parameter must be specified when listing the next batch of versions in a bucket");

        if (!previousVersionListing.isTruncated()) {
            VersionListing emptyListing = new VersionListing();
            emptyListing.setBucketName(previousVersionListing.getBucketName());
            emptyListing.setDelimiter(previousVersionListing.getDelimiter());
            emptyListing.setKeyMarker(previousVersionListing.getNextKeyMarker());
            emptyListing.setVersionIdMarker(previousVersionListing.getNextVersionIdMarker());
            emptyListing.setMaxKeys(previousVersionListing.getMaxKeys());
            emptyListing.setPrefix(previousVersionListing.getPrefix());
            emptyListing.setTruncated(false);

            return emptyListing;
        }

        return listVersions(new ListVersionsRequest(
                previousVersionListing.getBucketName(),
                previousVersionListing.getPrefix(),
                previousVersionListing.getNextKeyMarker(),
                previousVersionListing.getNextVersionIdMarker(),
                previousVersionListing.getDelimiter(),
                new Integer( previousVersionListing.getMaxKeys() ) ));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listVersions(java.lang.String, java.lang.String)
     */
    public VersionListing listVersions(String bucketName, String prefix)
            throws AmazonClientException, AmazonServiceException {
        return listVersions(new ListVersionsRequest(bucketName, prefix, null, null, null, null));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listVersions(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer)
     */
    public VersionListing listVersions(String bucketName, String prefix, String keyMarker, String versionIdMarker, String delimiter, Integer maxKeys)
            throws AmazonClientException, AmazonServiceException {

        ListVersionsRequest request = new ListVersionsRequest()
            .withBucketName(bucketName)
            .withPrefix(prefix)
            .withDelimiter(delimiter)
            .withKeyMarker(keyMarker)
            .withVersionIdMarker(versionIdMarker)
            .withMaxResults(maxKeys);
        return listVersions(request);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listVersions(com.amazonaws.services.s3.model.ListVersionsRequest)
     */
    public VersionListing listVersions(ListVersionsRequest listVersionsRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(listVersionsRequest.getBucketName(), "The bucket name parameter must be specified when listing versions in a bucket");

        Request<ListVersionsRequest> request = createRequest(listVersionsRequest.getBucketName(), null, listVersionsRequest, HttpMethodName.GET);
        request.addParameter("versions", null);

        if (listVersionsRequest.getPrefix() != null) request.addParameter("prefix", listVersionsRequest.getPrefix());
        if (listVersionsRequest.getKeyMarker() != null) request.addParameter("key-marker", listVersionsRequest.getKeyMarker());
        if (listVersionsRequest.getVersionIdMarker() != null) request.addParameter("version-id-marker", listVersionsRequest.getVersionIdMarker());
        if (listVersionsRequest.getDelimiter() != null) request.addParameter("delimiter", listVersionsRequest.getDelimiter());
        if (listVersionsRequest.getMaxResults() != null && listVersionsRequest.getMaxResults().intValue() >= 0) request.addParameter("max-keys", listVersionsRequest.getMaxResults().toString());

        return invoke(request, new Unmarshallers.VersionListUnmarshaller(), listVersionsRequest.getBucketName(), null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listObjects(java.lang.String)
     */
    public ObjectListing listObjects(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        return listObjects(new ListObjectsRequest(bucketName, null, null, null, null));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listObjects(java.lang.String, java.lang.String)
     */
    public ObjectListing listObjects(String bucketName, String prefix)
            throws AmazonClientException, AmazonServiceException {
        return listObjects(new ListObjectsRequest(bucketName, prefix, null, null, null));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listObjects(com.amazonaws.services.s3.model.ListObjectsRequest)
     */
    public ObjectListing listObjects(ListObjectsRequest listObjectsRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(listObjectsRequest.getBucketName(), "The bucket name parameter must be specified when listing objects in a bucket");

        Request<ListObjectsRequest> request = createRequest(listObjectsRequest.getBucketName(), null, listObjectsRequest, HttpMethodName.GET);
        if (listObjectsRequest.getPrefix() != null) request.addParameter("prefix", listObjectsRequest.getPrefix());
        if (listObjectsRequest.getMarker() != null) request.addParameter("marker", listObjectsRequest.getMarker());
        if (listObjectsRequest.getDelimiter() != null) request.addParameter("delimiter", listObjectsRequest.getDelimiter());
        if (listObjectsRequest.getMaxKeys() != null && listObjectsRequest.getMaxKeys().intValue() >= 0) request.addParameter("max-keys", listObjectsRequest.getMaxKeys().toString());

        return invoke(request, new Unmarshallers.ListObjectsUnmarshaller(), listObjectsRequest.getBucketName(), null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listNextBatchOfObjects(com.amazonaws.services.s3.model.S3ObjectListing)
     */
    public ObjectListing listNextBatchOfObjects(ObjectListing previousObjectListing)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(previousObjectListing,
                "The previous object listing parameter must be specified when listing the next batch of objects in a bucket");

        if (!previousObjectListing.isTruncated()) {
            ObjectListing emptyListing = new ObjectListing();
            emptyListing.setBucketName(previousObjectListing.getBucketName());
            emptyListing.setDelimiter(previousObjectListing.getDelimiter());
            emptyListing.setMarker(previousObjectListing.getNextMarker());
            emptyListing.setMaxKeys(previousObjectListing.getMaxKeys());
            emptyListing.setPrefix(previousObjectListing.getPrefix());
            emptyListing.setTruncated(false);

            return emptyListing;
        }

        return listObjects(new ListObjectsRequest(
                previousObjectListing.getBucketName(),
                previousObjectListing.getPrefix(),
                previousObjectListing.getNextMarker(),
                previousObjectListing.getDelimiter(),
                new Integer( previousObjectListing.getMaxKeys() ) ));
    }


    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getS3AccountOwner()
     */
    public Owner getS3AccountOwner()
            throws AmazonClientException, AmazonServiceException {
        Request<ListBucketsRequest> request = createRequest(null, null, new ListBucketsRequest(), HttpMethodName.GET);
        return invoke(request, new Unmarshallers.ListBucketsOwnerUnmarshaller(), null, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listBuckets()
     */
    public List<Bucket> listBuckets(ListBucketsRequest listBucketsRequest)
            throws AmazonClientException, AmazonServiceException {
        Request<ListBucketsRequest> request = createRequest(null, null, listBucketsRequest, HttpMethodName.GET);
        return invoke(request, new Unmarshallers.ListBucketsUnmarshaller(), null, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listBuckets()
     */
    public List<Bucket> listBuckets()
            throws AmazonClientException, AmazonServiceException {
        return listBuckets(new ListBucketsRequest());
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketLocation(com.amazonaws.services.s3.AmazonS3Client.GetBucketLocationRequest)
     */
    public String getBucketLocation(GetBucketLocationRequest getBucketLocationRequest)
    		throws AmazonClientException, AmazonServiceException {
    	assertParameterNotNull(getBucketLocationRequest, "The request parameter must be specified when requesting a bucket's location");
    	String bucketName = getBucketLocationRequest.getBucketName();
        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when requesting a bucket's location");

        Request<GetBucketLocationRequest> request = createRequest(bucketName, null, getBucketLocationRequest, HttpMethodName.GET);
        request.addParameter("location", null);

        return invoke(request, new Unmarshallers.BucketLocationUnmarshaller(), bucketName, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketLocation(java.lang.String)
     */
    public String getBucketLocation(String bucketName)
            throws AmazonClientException, AmazonServiceException {
    	return getBucketLocation(new GetBucketLocationRequest(bucketName));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#createBucket(java.lang.String)
     */
    public Bucket createBucket(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        return createBucket(new CreateBucketRequest(bucketName));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#createBucket(java.lang.String, com.amazonaws.services.s3.model.Region)
     */
    public Bucket createBucket(String bucketName, Region region)
            throws AmazonClientException, AmazonServiceException {
        return createBucket(new CreateBucketRequest(bucketName, region));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#createBucket(java.lang.String, java.lang.String)
     */
    public Bucket createBucket(String bucketName, String region)
            throws AmazonClientException, AmazonServiceException {
        return createBucket(new CreateBucketRequest(bucketName, region));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#createBucket(com.amazonaws.services.s3.model.CreateBucketRequest)
     */
    public Bucket createBucket(CreateBucketRequest createBucketRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(createBucketRequest,
                "The CreateBucketRequest parameter must be specified when creating a bucket");

        String bucketName = createBucketRequest.getBucketName();
        String region = createBucketRequest.getRegion();
        CannedAccessControlList acl = createBucketRequest.getCannedAcl();

        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when creating a bucket");

        if (bucketName != null) bucketName = bucketName.trim();
        bucketNameUtils.validateBucketName(bucketName);

        Request<CreateBucketRequest> request = createRequest(bucketName, null, createBucketRequest, HttpMethodName.PUT);
        if (acl != null) request.addHeader(Headers.S3_CANNED_ACL, acl.toString());

        /*
         * We can only send the CreateBucketConfiguration if we're *not*
         * creating a bucket in the US region.
         */
        if (region != null && !region.toUpperCase().equals(Region.US_Standard.toString())) {
            XmlWriter xml = new XmlWriter();
            xml.start("CreateBucketConfiguration", "xmlns", Constants.XML_NAMESPACE);
            xml.start("LocationConstraint").value(region).end();
            xml.end();

            request.setContent(new ByteArrayInputStream(xml.getBytes()));
        }

        invoke(request, voidResponseHandler, bucketName, null);

        return new Bucket(bucketName);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObjectAcl(java.lang.String, java.lang.String)
     */
    public AccessControlList getObjectAcl(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        return getObjectAcl(bucketName, key, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObjectAcl(java.lang.String, java.lang.String, java.lang.String)
     */
    public AccessControlList getObjectAcl(String bucketName, String key, String versionId)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when requesting an object's ACL");
        assertParameterNotNull(key, "The key parameter must be specified when requesting an object's ACL");

        return getAcl(bucketName, key, versionId, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setObjectAcl(java.lang.String, java.lang.String, com.amazonaws.services.s3.model.AccessControlList)
     */
    public void setObjectAcl(String bucketName, String key, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        setObjectAcl(bucketName, key, null, acl);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setObjectAcl(java.lang.String, java.lang.String, com.amazonaws.services.s3.model.CannedAccessControlList)
     */
    public void setObjectAcl(String bucketName, String key, CannedAccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        setObjectAcl(bucketName, key, null, acl);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setObjectAcl(java.lang.String, java.lang.String, java.lang.String, com.amazonaws.services.s3.model.AccessControlList)
     */
    public void setObjectAcl(String bucketName, String key, String versionId, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when setting an object's ACL");
        assertParameterNotNull(key, "The key parameter must be specified when setting an object's ACL");
        assertParameterNotNull(acl, "The ACL parameter must be specified when setting an object's ACL");

        setAcl(bucketName, key, versionId, acl, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setObjectAcl(java.lang.String, java.lang.String, java.lang.String, com.amazonaws.services.s3.model.CannedAccessControlList)
     */
    public void setObjectAcl(String bucketName, String key, String versionId, CannedAccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when setting an object's ACL");
        assertParameterNotNull(key, "The key parameter must be specified when setting an object's ACL");
        assertParameterNotNull(acl, "The ACL parameter must be specified when setting an object's ACL");

        setAcl(bucketName, key, versionId, acl, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketAcl(java.lang.String)
     */
    public AccessControlList getBucketAcl(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when requesting a bucket's ACL");

        return getAcl(bucketName, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketAcl(com.amazonaws.services.s3.GetBucketAclRequest)
     */
    public AccessControlList getBucketAcl(GetBucketAclRequest getBucketAclRequest)
		throws AmazonClientException, AmazonServiceException {
    	String bucketName = getBucketAclRequest.getBucketName();
        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when requesting a bucket's ACL");

        return getAcl(bucketName, null, null, getBucketAclRequest);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setBucketAcl(java.lang.String, com.amazonaws.services.s3.model.AccessControlList)
     */
    public void setBucketAcl(String bucketName, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when setting a bucket's ACL");
        assertParameterNotNull(acl, "The ACL parameter must be specified when setting a bucket's ACL");

        setAcl(bucketName, null, null, acl, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setBucketAcl(com.amazonaws.services.s3.SetBucketAclRequest)
     */
    public void setBucketAcl(SetBucketAclRequest setBucketAclRequest)
    		throws AmazonClientException, AmazonServiceException {
    	String bucketName = setBucketAclRequest.getBucketName();
    	AccessControlList acl = setBucketAclRequest.getAcl();
    	CannedAccessControlList cannedAcl = setBucketAclRequest.getCannedAcl();
        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when setting a bucket's ACL");

        if (acl != null) {
        	setAcl(bucketName, null, null, acl, setBucketAclRequest);
        } else if (cannedAcl != null) {
        	setAcl(bucketName, null, null, cannedAcl, setBucketAclRequest);
        } else {
        	assertParameterNotNull(null, "The ACL parameter must be specified when setting a bucket's ACL");
        }
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setBucketAcl(java.lang.String, com.amazonaws.services.s3.model.CannedAccessControlList)
     */
    public void setBucketAcl(String bucketName, CannedAccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when setting a bucket's ACL");
        assertParameterNotNull(acl, "The ACL parameter must be specified when setting a bucket's ACL");

        setAcl(bucketName, null, null, acl, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObjectMetadata(java.lang.String, java.lang.String)
     */
    public ObjectMetadata getObjectMetadata(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        return getObjectMetadata(new GetObjectMetadataRequest(bucketName, key));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObjectMetadata(com.amazonaws.services.s3.model.GetObjectMetadataRequest)
     */
    public ObjectMetadata getObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getObjectMetadataRequest, "The GetObjectMetadataRequest parameter must be specified when requesting an object's metadata");

        String bucketName = getObjectMetadataRequest.getBucketName();
        String key = getObjectMetadataRequest.getKey();
        String versionId = getObjectMetadataRequest.getVersionId();

        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when requesting an object's metadata");
        assertParameterNotNull(key, "The key parameter must be specified when requesting an object's metadata");

        Request<GetObjectMetadataRequest> request = createRequest(bucketName, key, getObjectMetadataRequest, HttpMethodName.HEAD);
        if (versionId != null) request.addParameter("versionId", versionId);

        return invoke(request, new S3MetadataResponseHandler(), bucketName, key);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObject(java.lang.String, java.lang.String)
     */
    public S3Object getObject(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        return getObject(new GetObjectRequest(bucketName, key));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#doesBucketExist(java.lang.String)
     */
    public boolean doesBucketExist(String bucketName)
        throws AmazonClientException, AmazonServiceException {

        try {
            listObjects(new ListObjectsRequest(bucketName, null, null, null, 0));

            // it exists and the current account owns it
            return true;
        } catch (AmazonServiceException ase) {
            /*
             * If we have no credentials, or we detect a problem with the
             * credentials we used, go ahead and throw the error so we don't
             * mask that problem as thinking that the bucket does exist.
             */
            if (awsCredentialsProvider.getCredentials() == null) throw ase;
            if (ase.getErrorCode().equalsIgnoreCase("InvalidAccessKeyId") ||
                ase.getErrorCode().equalsIgnoreCase("SignatureDoesNotMatch")) {
                throw ase;
            }

            switch (ase.getStatusCode()) {
            case 403:
                /*
                 * A permissions error means the bucket exists, but is owned by
                 * another account.
                 */
                return true;
            case 404:
                return false;
            default:
                throw ase;
            }
        }
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#changeStorageClass(java.lang.String, java.lang.String, java.lang.String)
     */
    public void changeObjectStorageClass(String bucketName, String key, StorageClass newStorageClass)
        throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
            "The bucketName parameter must be specified when changing an object's storage class");
        assertParameterNotNull(key,
            "The key parameter must be specified when changing an object's storage class");
        assertParameterNotNull(newStorageClass,
            "The newStorageClass parameter must be specified when changing an object's storage class");

        copyObject(new CopyObjectRequest(bucketName, key, bucketName, key)
            .withStorageClass(newStorageClass.toString()));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObject(com.amazonaws.services.s3.model.GetObjectRequest)
     */
    public S3Object getObject(GetObjectRequest getObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getObjectRequest,
                "The GetObjectRequest parameter must be specified when requesting an object");
        assertParameterNotNull(getObjectRequest.getBucketName(),
                "The bucket name parameter must be specified when requesting an object");
        assertParameterNotNull(getObjectRequest.getKey(),
                "The key parameter must be specified when requesting an object");

        Request<GetObjectRequest> request = createRequest(getObjectRequest.getBucketName(), getObjectRequest.getKey(), getObjectRequest, HttpMethodName.GET);

        if (getObjectRequest.getVersionId() != null) {
            request.addParameter("versionId", getObjectRequest.getVersionId());
        }

        // Range
        if (getObjectRequest.getRange() != null) {
            long[] range = getObjectRequest.getRange();
            request.addHeader(Headers.RANGE, "bytes=" + Long.toString(range[0]) + "-" + Long.toString(range[1]));
        }

        addResponseHeaderParameters(request, getObjectRequest.getResponseHeaders());

        addDateHeader(request, Headers.GET_OBJECT_IF_MODIFIED_SINCE,
                getObjectRequest.getModifiedSinceConstraint());
        addDateHeader(request, Headers.GET_OBJECT_IF_UNMODIFIED_SINCE,
                getObjectRequest.getUnmodifiedSinceConstraint());
        addStringListHeader(request, Headers.GET_OBJECT_IF_MATCH,
                getObjectRequest.getMatchingETagConstraints());
        addStringListHeader(request, Headers.GET_OBJECT_IF_NONE_MATCH,
                getObjectRequest.getNonmatchingETagConstraints());

        ProgressListener progressListener = getObjectRequest.getProgressListener();
        try {
            S3Object s3Object = invoke(request, new S3ObjectResponseHandler(), getObjectRequest.getBucketName(), getObjectRequest.getKey());

            /*
             * TODO: For now, it's easiest to set there here in the client, but
             *       we could push this back into the response handler with a
             *       little more work.
             */
            s3Object.setBucketName(getObjectRequest.getBucketName());
            s3Object.setKey(getObjectRequest.getKey());

            if (progressListener != null) {
                S3ObjectInputStream input = s3Object.getObjectContent();
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(input, progressListener);
                progressReportingInputStream.setFireCompletedEvent(true);
                input = new S3ObjectInputStream(progressReportingInputStream, input.getHttpRequest());
                s3Object.setObjectContent(input);
                fireProgressEvent(progressListener, ProgressEvent.STARTED_EVENT_CODE);
            }

            /*
             * TODO: It'd be nice to check the integrity of the data was received from S3,
             *       but we'd have to read off the stream and buffer the contents somewhere
             *       in order to do that.
             *
             *       We could consider adding an option for this in the future, or wrapping
             *       the InputStream in another implementation of FilterInputStream that
             *       would calculate the checksum when the user reads the data and then
             *       notify them somehow if there was a problem.
             */
            return s3Object;
        } catch (AmazonS3Exception ase) {
            /*
             * If the request failed because one of the specified constraints
             * was not met (ex: matching ETag, modified since date, etc.), then
             * return null, so that users don't have to wrap their code in
             * try/catch blocks and check for this status code if they want to
             * use constraints.
             */
            if (ase.getStatusCode() == 412 || ase.getStatusCode() == 304) {
                fireProgressEvent(progressListener, ProgressEvent.CANCELED_EVENT_CODE);
                return null;
            }

            fireProgressEvent(progressListener, ProgressEvent.FAILED_EVENT_CODE);
            throw ase;
        }
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObject(com.amazonaws.services.s3.model.GetObjectRequest, java.io.File)
     */
    public ObjectMetadata getObject(GetObjectRequest getObjectRequest, File destinationFile)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(destinationFile,
                "The destination file parameter must be specified when downloading an object directly to a file");

        S3Object s3Object = getObject(getObjectRequest);
        // getObject can return null if constraints were specified but not met
        if (s3Object == null) return null;

        ServiceUtils.downloadObjectToFile(s3Object, destinationFile);
        return s3Object.getObjectMetadata();
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteBucket(java.lang.String)
     */
    public void deleteBucket(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        deleteBucket(new DeleteBucketRequest(bucketName));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteBucket(com.amazonaws.services.s3.model.DeleteBucketRequest)
     */
    public void deleteBucket(DeleteBucketRequest deleteBucketRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(deleteBucketRequest,
                "The DeleteBucketRequest parameter must be specified when deleting a bucket");

        String bucketName = deleteBucketRequest.getBucketName();
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when deleting a bucket");

        Request<DeleteBucketRequest> request = createRequest(bucketName, null, deleteBucketRequest, HttpMethodName.DELETE);
        invoke(request, voidResponseHandler, bucketName, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#putObject(java.lang.String, java.lang.String, java.io.File)
     */
    public PutObjectResult putObject(String bucketName, String key, File file)
            throws AmazonClientException, AmazonServiceException {
        return putObject(new PutObjectRequest(bucketName, key, file)
            .withMetadata(new ObjectMetadata()));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#putObject(java.lang.String, java.lang.String, java.io.InputStream, com.amazonaws.services.s3.model.S3ObjectMetadata)
     */
    public PutObjectResult putObject(String bucketName, String key, InputStream input, ObjectMetadata metadata)
            throws AmazonClientException, AmazonServiceException {
        return putObject(new PutObjectRequest(bucketName, key, input, metadata));
    }


    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#putObject(com.amazonaws.services.s3.model.PutObjectRequest)
     */
    public PutObjectResult putObject(PutObjectRequest putObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(putObjectRequest, "The PutObjectRequest parameter must be specified when uploading an object");

        String bucketName = putObjectRequest.getBucketName();
        String key = putObjectRequest.getKey();
        ObjectMetadata metadata = putObjectRequest.getMetadata();
        InputStream input = putObjectRequest.getInputStream();
        ProgressListener progressListener = putObjectRequest.getProgressListener();
        if (metadata == null) metadata = new ObjectMetadata();

        assertParameterNotNull(bucketName, "The bucket name parameter must be specified when uploading an object");
        assertParameterNotNull(key, "The key parameter must be specified when uploading an object");

        // If a file is specified for upload, we need to pull some additional
        // information from it to auto-configure a few options
        if (putObjectRequest.getFile() != null) {
            File file = putObjectRequest.getFile();

            // Always set the content length, even if it's already set
            metadata.setContentLength(file.length());

            // Only set the content type if it hasn't already been set
            if (metadata.getContentType() == null) {
                metadata.setContentType(Mimetypes.getInstance().getMimetype(file));
            }

            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                byte[] md5Hash = ServiceUtils.computeMD5Hash(fileInputStream);
                metadata.setContentMD5(BinaryUtils.toBase64(md5Hash));
            } catch (Exception e) {
                throw new AmazonClientException(
                        "Unable to calculate MD5 hash: " + e.getMessage(), e);
            } finally {
                try {fileInputStream.close();} catch (Exception e) {}
            }

            try {
                input = new RepeatableFileInputStream(file);
            } catch (FileNotFoundException fnfe) {
                throw new AmazonClientException("Unable to find file to upload", fnfe);
            }
        }

        Request<PutObjectRequest> request = createRequest(bucketName, key, putObjectRequest, HttpMethodName.PUT);

        if (putObjectRequest.getCannedAcl() != null) {
            request.addHeader(Headers.S3_CANNED_ACL, putObjectRequest.getCannedAcl().toString());
        }

        if (putObjectRequest.getStorageClass() != null) {
            request.addHeader(Headers.STORAGE_CLASS, putObjectRequest.getStorageClass());
        }

        // Use internal interface to differentiate 0 from unset.
        if (metadata.getRawMetadata().get(Headers.CONTENT_LENGTH) == null) {
            /*
             * There's nothing we can do except for let the HTTP client buffer
             * the input stream contents if the caller doesn't tell us how much
             * data to expect in a stream since we have to explicitly tell
             * Amazon S3 how much we're sending before we start sending any of
             * it.
             */
            log.warn("No content length specified for stream data.  " +
                     "Stream contents will be buffered in memory and could result in " +
                     "out of memory errors.");
        }

        if (progressListener != null) {
            input = new ProgressReportingInputStream(input, progressListener);
            fireProgressEvent(progressListener, ProgressEvent.STARTED_EVENT_CODE);
        }

        if (!input.markSupported()) {
            input = new RepeatableInputStream(input, Constants.DEFAULT_STREAM_BUFFER_SIZE);
        }

        MD5DigestCalculatingInputStream md5DigestStream = null;
        if (metadata.getContentMD5() == null) {
            /*
             * If the user hasn't set the content MD5, then we don't want to
             * buffer the whole stream in memory just to calculate it. Instead,
             * we can calculate it on the fly and validate it with the returned
             * ETag from the object upload.
             */
            try {
                md5DigestStream = new MD5DigestCalculatingInputStream(input);
                input = md5DigestStream;
            } catch (NoSuchAlgorithmException e) {
                log.warn("No MD5 digest algorithm available.  Unable to calculate " +
                         "checksum and verify data integrity.", e);
            }
        }

        if (metadata.getContentType() == null) {
            /*
             * Default to the "application/octet-stream" if the user hasn't
             * specified a content type.
             */
            metadata.setContentType(Mimetypes.MIMETYPE_OCTET_STREAM);
        }

        populateRequestMetadata(request, metadata);
        request.setContent(input);

        ObjectMetadata returnedMetadata = null;
        try {
            returnedMetadata = invoke(request, new S3MetadataResponseHandler(), bucketName, key);
        } catch (AmazonClientException ace) {
            fireProgressEvent(progressListener, ProgressEvent.FAILED_EVENT_CODE);
            throw ace;
        } finally {
            try {input.close();} catch (Exception e) {
                log.warn("Unable to cleanly close input stream: " + e.getMessage(), e);
            }
        }

        String contentMd5 = metadata.getContentMD5();
        if (md5DigestStream != null) {
            contentMd5 = BinaryUtils.toBase64(md5DigestStream.getMd5Digest());
        }

        if (returnedMetadata != null && contentMd5 != null) {
            byte[] clientSideHash = BinaryUtils.fromBase64(contentMd5);
            byte[] serverSideHash = BinaryUtils.fromHex(returnedMetadata.getETag());

            if (!Arrays.equals(clientSideHash, serverSideHash)) {
                fireProgressEvent(progressListener, ProgressEvent.FAILED_EVENT_CODE);
                throw new AmazonClientException("Unable to verify integrity of data upload.  " +
                        "Client calculated content hash didn't match hash calculated by Amazon S3.  " +
                        "You may need to delete the data stored in Amazon S3.");
            }
        }

        fireProgressEvent(progressListener, ProgressEvent.COMPLETED_EVENT_CODE);

        PutObjectResult result = new PutObjectResult();
        result.setETag(returnedMetadata.getETag());
        result.setVersionId(returnedMetadata.getVersionId());
        result.setServerSideEncryption(returnedMetadata.getServerSideEncryption());
        result.setExpirationTime(returnedMetadata.getExpirationTime());
        result.setExpirationTimeRuleId(returnedMetadata.getExpirationTimeRuleId());

        return result;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#copyObject(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public CopyObjectResult copyObject(String sourceBucketName, String sourceKey,
                                       String destinationBucketName, String destinationKey)
            throws AmazonClientException, AmazonServiceException {
        return copyObject(new CopyObjectRequest(sourceBucketName, sourceKey,
                                                destinationBucketName, destinationKey));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#copyObject(com.amazonaws.services.s3.model.CopyObjectRequest)
     */
    public CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(copyObjectRequest.getSourceBucketName(),
                "The source bucket name must be specified when copying an object");
        assertParameterNotNull(copyObjectRequest.getSourceKey(),
                "The source object key must be specified when copying an object");
        assertParameterNotNull(copyObjectRequest.getDestinationBucketName(),
                "The destination bucket name must be specified when copying an object");
        assertParameterNotNull(copyObjectRequest.getDestinationKey(),
                "The destination object key must be specified when copying an object");

        String destinationKey = copyObjectRequest.getDestinationKey();
        String destinationBucketName = copyObjectRequest.getDestinationBucketName();

        Request<CopyObjectRequest> request = createRequest(destinationBucketName, destinationKey, copyObjectRequest, HttpMethodName.PUT);

        populateRequestWithCopyObjectParameters(request, copyObjectRequest);
        /*
         * We can't send the Content-Length header if the user specified it,
         * otherwise it messes up the HTTP connection when the remote server
         * thinks there's more data to pull.
         */
        request.getHeaders().remove(Headers.CONTENT_LENGTH);

        CopyObjectResultHandler copyObjectResultHandler = null;
        try {
            @SuppressWarnings("unchecked")
            ResponseHeaderHandlerChain<CopyObjectResultHandler> handler = new ResponseHeaderHandlerChain<CopyObjectResultHandler>(
                    new Unmarshallers.CopyObjectUnmarshaller(),
                    new ServerSideEncryptionHeaderHandler<CopyObjectResultHandler>(), new S3VersionHeaderHandler(), new ObjectExpirationHeaderHandler<CopyObjectResultHandler>());
            copyObjectResultHandler = invoke(request, handler, destinationBucketName, destinationKey);
        } catch (AmazonS3Exception ase) {
            /*
             * If the request failed because one of the specified constraints
             * was not met (ex: matching ETag, modified since date, etc.), then
             * return null, so that users don't have to wrap their code in
             * try/catch blocks and check for this status code if they want to
             * use constraints.
             */
            if (ase.getStatusCode() == Constants.FAILED_PRECONDITION_STATUS_CODE) {
               return null;
            }

            throw ase;
        }

        /*
         * CopyObject has two failure modes:
         *  1 - An HTTP error code is returned and the error is processed like any
         *      other error response.
         *  2 - An HTTP 200 OK code is returned, but the response content contains
         *      an XML error response.
         *
         * This makes it very difficult for the client runtime to cleanly detect
         * this case and handle it like any other error response.  We could
         * extend the runtime to have a more flexible/customizable definition of
         * success/error (per request), but it's probably overkill for this
         * one special case.
         */
        if (copyObjectResultHandler.getErrorCode() != null) {
            String errorCode = copyObjectResultHandler.getErrorCode();
            String errorMessage = copyObjectResultHandler.getErrorMessage();
            String requestId = copyObjectResultHandler.getErrorRequestId();
            String hostId = copyObjectResultHandler.getErrorHostId();

            AmazonS3Exception ase = new AmazonS3Exception(errorMessage);
            ase.setErrorCode(errorCode);
            ase.setErrorType(ErrorType.Service);
            ase.setRequestId(requestId);
            ase.setExtendedRequestId(hostId);
            ase.setServiceName(request.getServiceName());
            ase.setStatusCode(200);

            throw ase;
        }

        // TODO: Might be nice to create this in our custom S3VersionHeaderHandler
        CopyObjectResult copyObjectResult = new CopyObjectResult();
        copyObjectResult.setETag(copyObjectResultHandler.getETag());
        copyObjectResult.setLastModifiedDate(copyObjectResultHandler.getLastModified());
        copyObjectResult.setVersionId(copyObjectResultHandler.getVersionId());
        copyObjectResult.setServerSideEncryption(copyObjectResultHandler.getServerSideEncryption());
        copyObjectResult.setExpirationTime(copyObjectResultHandler.getExpirationTime());
        copyObjectResult.setExpirationTimeRuleId(copyObjectResultHandler.getExpirationTimeRuleId());

        return copyObjectResult;
    }

    /**
     * Copies a source object to a part of a multipart upload.
     *
     * To copy an object, the caller's account must have read access to the source object and
     * write access to the destination bucket.
     * </p>
     * <p>
     * If constraints are specified in the <code>CopyPartRequest</code>
     * (e.g.
     * {@link CopyPartRequest#setMatchingETagConstraints(List)})
     * and are not satisfied when Amazon S3 receives the
     * request, this method returns <code>null</code>.
     * This method returns a non-null result under all other
     * circumstances.
     * </p>
     *
     * @param copyPartRequest
     *            The request object containing all the options for copying an
     *            Amazon S3 object.
     *
     * @return A {@link CopyPartResult} object containing the information
     *         returned by Amazon S3 about the newly created object, or <code>null</code> if
     *         constraints were specified that weren't met when Amazon S3 attempted
     *         to copy the object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#copyObject(CopyObjectRequest)
     * @see AmazonS3#initiateMultipartUpload(InitiateMultipartUploadRequest)
     */
    public CopyPartResult copyPart(CopyPartRequest copyPartRequest) {
        assertParameterNotNull(copyPartRequest.getSourceBucketName(),
                "The source bucket name must be specified when copying a part");
        assertParameterNotNull(copyPartRequest.getSourceKey(),
                "The source object key must be specified when copying a part");
        assertParameterNotNull(copyPartRequest.getDestinationBucketName(),
                "The destination bucket name must be specified when copying a part");
        assertParameterNotNull(copyPartRequest.getUploadId(),
                "The upload id must be specified when copying a part");
        assertParameterNotNull(copyPartRequest.getDestinationKey(),
                "The destination object key must be specified when copying a part");
        assertParameterNotNull(copyPartRequest.getPartNumber(),
                "The part number must be specified when copying a part");

        String destinationKey = copyPartRequest.getDestinationKey();
        String destinationBucketName = copyPartRequest.getDestinationBucketName();

        Request<CopyPartRequest> request = createRequest(destinationBucketName, destinationKey, copyPartRequest,
                HttpMethodName.PUT);

        populateRequestWithCopyPartParameters(request, copyPartRequest);

        request.addParameter("uploadId", copyPartRequest.getUploadId());
        request.addParameter("partNumber", Integer.toString(copyPartRequest.getPartNumber()));

        /*
         * We can't send the Content-Length header if the user specified it,
         * otherwise it messes up the HTTP connection when the remote server
         * thinks there's more data to pull.
         */
        request.getHeaders().remove(Headers.CONTENT_LENGTH);

        CopyObjectResultHandler copyObjectResultHandler = null;
        try {
            @SuppressWarnings("unchecked")
            ResponseHeaderHandlerChain<CopyObjectResultHandler> handler = new ResponseHeaderHandlerChain<CopyObjectResultHandler>(
                    new Unmarshallers.CopyObjectUnmarshaller(),
                    new ServerSideEncryptionHeaderHandler<CopyObjectResultHandler>(), new S3VersionHeaderHandler());
            copyObjectResultHandler = invoke(request, handler, destinationBucketName, destinationKey);
        } catch ( AmazonS3Exception ase ) {
            /*
             * If the request failed because one of the specified constraints
             * was not met (ex: matching ETag, modified since date, etc.), then
             * return null, so that users don't have to wrap their code in
             * try/catch blocks and check for this status code if they want to
             * use constraints.
             */
            if ( ase.getStatusCode() == Constants.FAILED_PRECONDITION_STATUS_CODE ) {
                return null;
            }

            throw ase;
        }

        /*
         * CopyPart has two failure modes: 1 - An HTTP error code is returned
         * and the error is processed like any other error response. 2 - An HTTP
         * 200 OK code is returned, but the response content contains an XML
         * error response.
         *
         * This makes it very difficult for the client runtime to cleanly detect
         * this case and handle it like any other error response. We could
         * extend the runtime to have a more flexible/customizable definition of
         * success/error (per request), but it's probably overkill for this one
         * special case.
         */
        if ( copyObjectResultHandler.getErrorCode() != null ) {
            String errorCode = copyObjectResultHandler.getErrorCode();
            String errorMessage = copyObjectResultHandler.getErrorMessage();
            String requestId = copyObjectResultHandler.getErrorRequestId();
            String hostId = copyObjectResultHandler.getErrorHostId();

            AmazonS3Exception ase = new AmazonS3Exception(errorMessage);
            ase.setErrorCode(errorCode);
            ase.setErrorType(ErrorType.Service);
            ase.setRequestId(requestId);
            ase.setExtendedRequestId(hostId);
            ase.setServiceName(request.getServiceName());
            ase.setStatusCode(200);

            throw ase;
        }

        CopyPartResult copyPartResult = new CopyPartResult();
        copyPartResult.setETag(copyObjectResultHandler.getETag());
        copyPartResult.setPartNumber(copyPartRequest.getPartNumber());
        copyPartResult.setLastModifiedDate(copyObjectResultHandler.getLastModified());
        copyPartResult.setVersionId(copyObjectResultHandler.getVersionId());
        copyPartResult.setServerSideEncryption(copyObjectResultHandler.getServerSideEncryption());

        return copyPartResult;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteObject(java.lang.String, java.lang.String)
     */
    public void deleteObject(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        deleteObject(new DeleteObjectRequest(bucketName, key));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteObject(com.amazonaws.services.s3.DeleteObjectRequest)
     */
    public void deleteObject(DeleteObjectRequest deleteObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(deleteObjectRequest,
            "The delete object request must be specified when deleting an object");

        assertParameterNotNull(deleteObjectRequest.getBucketName(), "The bucket name must be specified when deleting an object");
        assertParameterNotNull(deleteObjectRequest.getKey(), "The key must be specified when deleting an object");

        Request<DeleteObjectRequest> request = createRequest(deleteObjectRequest.getBucketName(), deleteObjectRequest.getKey(), deleteObjectRequest, HttpMethodName.DELETE);
        invoke(request, voidResponseHandler, deleteObjectRequest.getBucketName(), deleteObjectRequest.getKey());
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteObjects(com.amazonaws.services.s3.model.DeleteObjectsRequest)
     */
    public DeleteObjectsResult deleteObjects(DeleteObjectsRequest deleteObjectsRequest) {
        Request<DeleteObjectsRequest> request = createRequest(deleteObjectsRequest.getBucketName(), null, deleteObjectsRequest, HttpMethodName.POST);
        request.addParameter("delete", null);

        if ( deleteObjectsRequest.getMfa() != null ) {
            populateRequestWithMfaDetails(request, deleteObjectsRequest.getMfa());
        }

        byte[] content = new MultiObjectDeleteXmlFactory().convertToXmlByteArray(deleteObjectsRequest);
        request.addHeader("Content-Length", String.valueOf(content.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(content));
        try {
            byte[] md5 = ServiceUtils.computeMD5Hash(content);
            String md5Base64 = BinaryUtils.toBase64(md5);
            request.addHeader("Content-MD5", md5Base64);
        } catch ( Exception e ) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }

        DeleteObjectsResponse response = invoke(request, new Unmarshallers.DeleteObjectsResultUnmarshaller(), deleteObjectsRequest.getBucketName(), null);

        /*
         * If the result was only partially successful, throw an exception
         */
        if ( !response.getErrors().isEmpty() ) {
            throw new MultiObjectDeleteException(response.getErrors(), response.getDeletedObjects());
        }

        return new DeleteObjectsResult(response.getDeletedObjects());
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteObjectVersion(java.lang.String, java.lang.String, java.lang.String)
     */
    public void deleteVersion(String bucketName, String key, String versionId)
            throws AmazonClientException, AmazonServiceException {
        deleteVersion(new DeleteVersionRequest(bucketName, key, versionId));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteVersion(com.amazonaws.services.s3.model.DeleteVersionRequest)
     */
    public void deleteVersion(DeleteVersionRequest deleteVersionRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(deleteVersionRequest,
            "The delete version request object must be specified when deleting a version");

        String bucketName = deleteVersionRequest.getBucketName();
        String key = deleteVersionRequest.getKey();
        String versionId = deleteVersionRequest.getVersionId();

        assertParameterNotNull(bucketName, "The bucket name must be specified when deleting a version");
        assertParameterNotNull(key, "The key must be specified when deleting a version");
        assertParameterNotNull(versionId, "The version ID must be specified when deleting a version");

        Request<DeleteVersionRequest> request = createRequest(bucketName, key, deleteVersionRequest, HttpMethodName.DELETE);
        if (versionId != null) request.addParameter("versionId", versionId);

        if (deleteVersionRequest.getMfa() != null) {
            populateRequestWithMfaDetails(request, deleteVersionRequest.getMfa());
        }

        invoke(request, voidResponseHandler, bucketName, key);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setBucketVersioningConfiguration(com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest)
     */
    public void setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest setBucketVersioningConfigurationRequest)
        throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(setBucketVersioningConfigurationRequest,
            "The SetBucketVersioningConfigurationRequest object must be specified when setting versioning configuration");

        String bucketName = setBucketVersioningConfigurationRequest.getBucketName();
        BucketVersioningConfiguration versioningConfiguration = setBucketVersioningConfigurationRequest.getVersioningConfiguration();

        assertParameterNotNull(bucketName,
            "The bucket name parameter must be specified when setting versioning configuration");
        assertParameterNotNull(versioningConfiguration,
            "The bucket versioning parameter must be specified when setting versioning configuration");
        if (versioningConfiguration.isMfaDeleteEnabled() != null) {
            assertParameterNotNull(setBucketVersioningConfigurationRequest.getMfa(),
                "The MFA parameter must be specified when changing MFA Delete status in the versioning configuration");
        }

        Request<SetBucketVersioningConfigurationRequest> request = createRequest(bucketName, null, setBucketVersioningConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("versioning", null);

        if (versioningConfiguration.isMfaDeleteEnabled() != null) {
            if (setBucketVersioningConfigurationRequest.getMfa() != null) {
                populateRequestWithMfaDetails(request, setBucketVersioningConfigurationRequest.getMfa());
            }
        }

        byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(versioningConfiguration);
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketVersioningConfiguration(java.lang.String)
     */
    public BucketVersioningConfiguration getBucketVersioningConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when querying versioning configuration");

        Request<GenericBucketRequest> request = createRequest(bucketName, null, new GenericBucketRequest(bucketName), HttpMethodName.GET);
        request.addParameter("versioning", null);

        return invoke(request, new Unmarshallers.BucketVersioningConfigurationUnmarshaller(), bucketName, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketWebsiteConfiguration(java.lang.String)
     */
    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(String bucketName)
    		throws AmazonClientException, AmazonServiceException {
    	return getBucketWebsiteConfiguration(new GetBucketWebsiteConfigurationRequest(bucketName));
    }

	/* (non-Javadoc)
	 * @see com.amazonaws.services.s3.AmazonS3#getBucketWebsiteConfiguration(com.amazonaws.services.s3.model.GetBucketWebsiteConfigurationRequest)
	 */
	public BucketWebsiteConfiguration getBucketWebsiteConfiguration(GetBucketWebsiteConfigurationRequest getBucketWebsiteConfigurationRequest)
			throws AmazonClientException, AmazonServiceException {
		String bucketName = getBucketWebsiteConfigurationRequest.getBucketName();

        assertParameterNotNull(bucketName,
    		"The bucket name parameter must be specified when requesting a bucket's website configuration");

        Request<GetBucketWebsiteConfigurationRequest> request = createRequest(bucketName, null, getBucketWebsiteConfigurationRequest, HttpMethodName.GET);
        request.addParameter("website", null);
        request.addHeader("Content-Type", "application/xml");

        try {
        	return invoke(request, new Unmarshallers.BucketWebsiteConfigurationUnmarshaller(), bucketName, null);
        } catch (AmazonServiceException ase) {
        	if (ase.getStatusCode() == 404) return null;
        	throw ase;
        }
	}

	/* (non-Javadoc)
	 * @see com.amazonaws.services.s3.AmazonS3#getBucketLifecycleConfiguration(java.lang.String)
	 */
	public BucketLifecycleConfiguration getBucketLifecycleConfiguration(String bucketName) {
        Request<GenericBucketRequest> request = createRequest(bucketName, null, new GenericBucketRequest(bucketName), HttpMethodName.GET);
        request.addParameter("lifecycle", null);

        try {
            return invoke(request, new Unmarshallers.BucketLifecycleConfigurationUnmarshaller(), bucketName, null);
        } catch (AmazonServiceException ase) {
            switch (ase.getStatusCode()) {
            case 404:
                return null;
            default:
                throw ase;
            }
        }
	}

	/* (non-Javadoc)
	 * @see com.amazonaws.services.s3.AmazonS3#setBucketLifecycleConfiguration(java.lang.String, com.amazonaws.services.s3.model.BucketLifecycleConfiguration)
	 */
	public void setBucketLifecycleConfiguration(String bucketName, BucketLifecycleConfiguration bucketLifecycleConfiguration) {
        Request<GenericBucketRequest> request = createRequest(bucketName, null, new GenericBucketRequest(bucketName), HttpMethodName.PUT);
        request.addParameter("lifecycle", null);

        byte[] content = new BucketConfigurationXmlFactory().convertToXmlByteArray(bucketLifecycleConfiguration);
        request.addHeader("Content-Length", String.valueOf(content.length));
        request.addHeader("Content-Type", "application/xml");
        request.setContent(new ByteArrayInputStream(content));
        try {
            byte[] md5 = ServiceUtils.computeMD5Hash(content);
            String md5Base64 = BinaryUtils.toBase64(md5);
            request.addHeader("Content-MD5", md5Base64);
        } catch ( Exception e ) {
            throw new AmazonClientException("Couldn't compute md5 sum", e);
        }

        invoke(request, voidResponseHandler, bucketName, null);
	}


	/* (non-Javadoc)
	 * @see com.amazonaws.services.s3.AmazonS3#deleteBucketLifecycleConfiguration(java.lang.String)
	 */
	public void deleteBucketLifecycleConfiguration(String bucketName) {
        Request<GenericBucketRequest> request = createRequest(bucketName, null, new GenericBucketRequest(bucketName), HttpMethodName.DELETE);
        request.addParameter("lifecycle", null);

        invoke(request, voidResponseHandler, bucketName, null);
	}

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setBucketWebsiteConfiguration(java.lang.String, com.amazonaws.services.s3.model.BucketWebsiteConfiguration)
     */
    public void setBucketWebsiteConfiguration(String bucketName, BucketWebsiteConfiguration configuration)
    		throws AmazonClientException, AmazonServiceException {
    	setBucketWebsiteConfiguration(new SetBucketWebsiteConfigurationRequest(bucketName, configuration));
    }

	/* (non-Javadoc)
	 * @see com.amazonaws.services.s3.AmazonS3#setBucketWebsiteConfiguration(com.amazonaws.services.s3.model.SetBucketWebsiteConfigurationRequest)
	 */
	public void setBucketWebsiteConfiguration(SetBucketWebsiteConfigurationRequest setBucketWebsiteConfigurationRequest)
		throws AmazonClientException, AmazonServiceException {
		String bucketName = setBucketWebsiteConfigurationRequest.getBucketName();
		BucketWebsiteConfiguration configuration = setBucketWebsiteConfigurationRequest.getConfiguration();

        assertParameterNotNull(bucketName,
        	"The bucket name parameter must be specified when setting a bucket's website configuration");
        assertParameterNotNull(configuration,
        	"The bucket website configuration parameter must be specified when setting a bucket's website configuration");
        assertParameterNotNull(configuration.getIndexDocumentSuffix(),
        	"The bucket website configuration parameter must specify the index document suffix when setting a bucket's website configuration");

        Request<SetBucketWebsiteConfigurationRequest> request = createRequest(bucketName, null, setBucketWebsiteConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("website", null);
        request.addHeader("Content-Type", "application/xml");

        byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(configuration);
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
	}

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteBucketWebsiteConfiguration(java.lang.String)
     */
    public void deleteBucketWebsiteConfiguration(String bucketName)
    		throws AmazonClientException, AmazonServiceException {
    	deleteBucketWebsiteConfiguration(new DeleteBucketWebsiteConfigurationRequest(bucketName));
    }

	/* (non-Javadoc)
	 * @see com.amazonaws.services.s3.AmazonS3#deleteBucketWebsiteConfiguration(com.amazonaws.services.s3.model.DeleteBucketWebsiteConfigurationRequest)
	 */
	public void deleteBucketWebsiteConfiguration(DeleteBucketWebsiteConfigurationRequest deleteBucketWebsiteConfigurationRequest)
		throws AmazonClientException, AmazonServiceException {
		String bucketName = deleteBucketWebsiteConfigurationRequest.getBucketName();

        assertParameterNotNull(bucketName,
        	"The bucket name parameter must be specified when deleting a bucket's website configuration");

        Request<DeleteBucketWebsiteConfigurationRequest> request = createRequest(bucketName, null, deleteBucketWebsiteConfigurationRequest, HttpMethodName.DELETE);
        request.addParameter("website", null);
        request.addHeader("Content-Type", "application/xml");

        invoke(request, voidResponseHandler, bucketName, null);
	}

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setBucketNotificationConfiguration(java.lang.String,com.amazonaws.services.s3.model.BucketNotificationConfiguration)
     */
    public void setBucketNotificationConfiguration(String bucketName, BucketNotificationConfiguration bucketNotificationConfiguration)
        throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
            "The bucket name parameter must be specified when setting notification configuration");
        assertParameterNotNull(bucketNotificationConfiguration,
            "The bucket notification parameter must be specified when setting notification configuration");

        SetBucketNotificationConfigurationRequest notificationRequest = new SetBucketNotificationConfigurationRequest(bucketNotificationConfiguration, bucketName);

        Request<SetBucketNotificationConfigurationRequest> request = createRequest(bucketName, null, notificationRequest, HttpMethodName.PUT);
        request.addParameter("notification", null);

        byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(bucketNotificationConfiguration);
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketNotificationConfiguration(java.lang.String)
     */
    public BucketNotificationConfiguration getBucketNotificationConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when querying notification configuration");

        Request<GenericBucketRequest> request = createRequest(bucketName, null, new GenericBucketRequest(bucketName), HttpMethodName.GET);
        request.addParameter("notification", null);

        return invoke(request, new Unmarshallers.BucketNotificationConfigurationUnmarshaller(), bucketName, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketLoggingConfiguration(java.lang.String)
     */
    public BucketLoggingConfiguration getBucketLoggingConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
                "The bucket name parameter must be specified when requesting a bucket's logging status");

        Request<GenericBucketRequest> request = createRequest(bucketName, null, new GenericBucketRequest(bucketName), HttpMethodName.GET);
        request.addParameter("logging", null);

        return invoke(request, new Unmarshallers.BucketLoggingConfigurationnmarshaller(), bucketName, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setBucketLoggingConfiguration(com.amazonaws.services.s3.SetBucketLoggingConfigurationRequest)
     */
    public void setBucketLoggingConfiguration(SetBucketLoggingConfigurationRequest setBucketLoggingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(setBucketLoggingConfigurationRequest,
            "The set bucket logging configuration request object must be specified when enabling server access logging");

        String bucketName = setBucketLoggingConfigurationRequest.getBucketName();
        BucketLoggingConfiguration loggingConfiguration = setBucketLoggingConfigurationRequest.getLoggingConfiguration();

        assertParameterNotNull(bucketName,
            "The bucket name parameter must be specified when enabling server access logging");
        assertParameterNotNull(bucketName,
            "The logging configuration parameter must be specified when enabling server access logging");

        Request<SetBucketLoggingConfigurationRequest> request = createRequest(bucketName, null, setBucketLoggingConfigurationRequest, HttpMethodName.PUT);
        request.addParameter("logging", null);

        byte[] bytes = bucketConfigurationXmlFactory.convertToXmlByteArray(loggingConfiguration);
        request.setContent(new ByteArrayInputStream(bytes));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketPolicy(java.lang.String)
     */
    public BucketPolicy getBucketPolicy(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        return getBucketPolicy(new GetBucketPolicyRequest(bucketName));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setBucketPolicy(java.lang.String, java.lang.String)
     */
    public void setBucketPolicy(String bucketName, String policyText)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(bucketName,
            "The bucket name must be specified when setting a bucket policy");
        assertParameterNotNull(policyText,
            "The policy text must be specified when setting a bucket policy");

        Request<GenericBucketRequest> request = createRequest(bucketName, null, new GenericBucketRequest(bucketName), HttpMethodName.PUT);
        request.addParameter("policy", null);
        request.setContent(new ByteArrayInputStream(ServiceUtils.toByteArray(policyText)));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteBucketPolicy(java.lang.String)
     */
    public void deleteBucketPolicy(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        deleteBucketPolicy(new DeleteBucketPolicyRequest(bucketName));
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getBucketPolicy(com.amazonaws.services.s3.model.GetBucketPolicyRequest)
     */
    public BucketPolicy getBucketPolicy(
            GetBucketPolicyRequest getBucketPolicyRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(getBucketPolicyRequest,
            "The request object must be specified when getting a bucket policy");

        String bucketName = getBucketPolicyRequest.getBucketName();
        assertParameterNotNull(bucketName,
            "The bucket name must be specified when getting a bucket policy");

        Request<GetBucketPolicyRequest> request = createRequest(bucketName, null, getBucketPolicyRequest, HttpMethodName.GET);
        request.addParameter("policy", null);

        BucketPolicy result = new BucketPolicy();
        try {
            String policyText = invoke(request, new S3StringResponseHandler(), bucketName, null);
            result.setPolicyText(policyText);
            return result;
        } catch (AmazonServiceException ase) {
            /*
             * If we receive an error response telling us that no policy has
             * been set for this bucket, then instead of forcing the user to
             * deal with the exception, we'll just return an empty result. Any
             * other exceptions will be rethrown for the user to handle.
             */
            if (ase.getErrorCode().equals("NoSuchBucketPolicy")) return result;
            throw ase;
        }
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#setBucketPolicy(com.amazonaws.services.s3.model.SetBucketPolicyRequest)
     */
    public void setBucketPolicy(SetBucketPolicyRequest setBucketPolicyRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(setBucketPolicyRequest,
            "The request object must be specified when setting a bucket policy");

        String bucketName = setBucketPolicyRequest.getBucketName();
        String policyText = setBucketPolicyRequest.getPolicyText();

        assertParameterNotNull(bucketName,
            "The bucket name must be specified when setting a bucket policy");
        assertParameterNotNull(policyText,
            "The policy text must be specified when setting a bucket policy");

        Request<SetBucketPolicyRequest> request = createRequest(bucketName, null, setBucketPolicyRequest, HttpMethodName.PUT);
        request.addParameter("policy", null);
        request.setContent(new ByteArrayInputStream(ServiceUtils.toByteArray(policyText)));

        invoke(request, voidResponseHandler, bucketName, null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#deleteBucketPolicy(com.amazonaws.services.s3.model.DeleteBucketPolicyRequest)
     */
    public void deleteBucketPolicy(
            DeleteBucketPolicyRequest deleteBucketPolicyRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(deleteBucketPolicyRequest,
            "The request object must be specified when deleting a bucket policy");

        String bucketName = deleteBucketPolicyRequest.getBucketName();
        assertParameterNotNull(bucketName,
            "The bucket name must be specified when deleting a bucket policy");

        Request<DeleteBucketPolicyRequest> request = createRequest(bucketName, null, deleteBucketPolicyRequest, HttpMethodName.DELETE);
        request.addParameter("policy", null);

        invoke(request, voidResponseHandler, bucketName, null);
    }



    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#generatePresignedUrl(java.lang.String, java.lang.String, java.util.Date)
     */
    public URL generatePresignedUrl(String bucketName, String key, Date expiration)
            throws AmazonClientException {
        return generatePresignedUrl(bucketName, key, expiration, HttpMethod.GET);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#generatePresignedUrl(java.lang.String, java.lang.String, java.util.Date, com.amazonaws.HttpMethod)
     */
    public URL generatePresignedUrl(String bucketName, String key, Date expiration, HttpMethod method)
            throws AmazonClientException {
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, key, method);
        request.setExpiration(expiration);

        return generatePresignedUrl(request);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#generatePresignedUrl(com.amazonaws.services.s3.model.GeneratePresignedUrlRequest)
     */
    public URL generatePresignedUrl(GeneratePresignedUrlRequest generatePresignedUrlRequest)
            throws AmazonClientException {
        assertParameterNotNull(generatePresignedUrlRequest,
            "The request parameter must be specified when generating a pre-signed URL");

        String bucketName = generatePresignedUrlRequest.getBucketName();
        String key = generatePresignedUrlRequest.getKey();

        assertParameterNotNull(bucketName,
            "The bucket name parameter must be specified when generating a pre-signed URL");
        assertParameterNotNull(generatePresignedUrlRequest.getMethod(),
            "The HTTP method request parameter must be specified when generating a pre-signed URL");

        if (generatePresignedUrlRequest.getExpiration() == null) {
            generatePresignedUrlRequest.setExpiration(
                    new Date(System.currentTimeMillis() + 1000 * 60 * 15));
        }

        HttpMethodName httpMethod = HttpMethodName.valueOf(generatePresignedUrlRequest.getMethod().toString());
        Request<GeneratePresignedUrlRequest> request = createRequest(bucketName, key, generatePresignedUrlRequest, httpMethod);
        for (Entry<String, String> entry : generatePresignedUrlRequest.getRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        addResponseHeaderParameters(request, generatePresignedUrlRequest.getResponseHeaders());

        presignRequest(request, generatePresignedUrlRequest.getMethod(),
                bucketName, key, generatePresignedUrlRequest.getExpiration(), null);

        return ServiceUtils.convertRequestToUrl(request);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#abortMultipartUpload(com.amazonaws.services.s3.model.AbortMultipartUploadRequest)
     */
    public void abortMultipartUpload(AbortMultipartUploadRequest abortMultipartUploadRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(abortMultipartUploadRequest,
            "The request parameter must be specified when aborting a multipart upload");
        assertParameterNotNull(abortMultipartUploadRequest.getBucketName(),
            "The bucket name parameter must be specified when aborting a multipart upload");
        assertParameterNotNull(abortMultipartUploadRequest.getKey(),
            "The key parameter must be specified when aborting a multipart upload");
        assertParameterNotNull(abortMultipartUploadRequest.getUploadId(),
            "The upload ID parameter must be specified when aborting a multipart upload");

        String bucketName = abortMultipartUploadRequest.getBucketName();
        String key = abortMultipartUploadRequest.getKey();

        Request<AbortMultipartUploadRequest> request = createRequest(bucketName, key, abortMultipartUploadRequest, HttpMethodName.DELETE);
        request.addParameter("uploadId", abortMultipartUploadRequest.getUploadId());

        invoke(request, voidResponseHandler, bucketName, key);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#completeMultipartUpload(com.amazonaws.services.s3.model.CompleteMultipartUploadRequest)
     */
    public CompleteMultipartUploadResult completeMultipartUpload(
            CompleteMultipartUploadRequest completeMultipartUploadRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(completeMultipartUploadRequest,
            "The request parameter must be specified when completing a multipart upload");

        String bucketName = completeMultipartUploadRequest.getBucketName();
        String key = completeMultipartUploadRequest.getKey();
        String uploadId = completeMultipartUploadRequest.getUploadId();
        assertParameterNotNull(bucketName,
            "The bucket name parameter must be specified when completing a multipart upload");
        assertParameterNotNull(key,
            "The key parameter must be specified when completing a multipart upload");
        assertParameterNotNull(uploadId,
            "The upload ID parameter must be specified when completing a multipart upload");
        assertParameterNotNull(completeMultipartUploadRequest.getPartETags(),
            "The part ETags parameter must be specified when completing a multipart upload");

        Request<CompleteMultipartUploadRequest> request = createRequest(bucketName, key, completeMultipartUploadRequest, HttpMethodName.POST);
        request.addParameter("uploadId", uploadId);

        byte[] xml = RequestXmlFactory.convertToXmlByteArray(completeMultipartUploadRequest.getPartETags());
        request.addHeader("Content-Type", "text/plain");
        request.addHeader("Content-Length", String.valueOf(xml.length));

        request.setContent(new ByteArrayInputStream(xml));

        @SuppressWarnings("unchecked")
        ResponseHeaderHandlerChain<CompleteMultipartUploadHandler> responseHandler = new ResponseHeaderHandlerChain<CompleteMultipartUploadHandler>(
                new Unmarshallers.CompleteMultipartUploadResultUnmarshaller(),
                new ServerSideEncryptionHeaderHandler<CompleteMultipartUploadHandler>(),
                new ObjectExpirationHeaderHandler<CompleteMultipartUploadHandler>());
        CompleteMultipartUploadHandler handler = invoke(request, responseHandler, bucketName, key);
        if (handler.getCompleteMultipartUploadResult() != null) {
            String versionId = responseHandler.getResponseHeaders().get(Headers.S3_VERSION_ID);
            handler.getCompleteMultipartUploadResult().setVersionId(versionId);
            return handler.getCompleteMultipartUploadResult();
        } else {
            throw handler.getAmazonS3Exception();
        }
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#initiateMultipartUpload(com.amazonaws.services.s3.model.InitiateMultipartUploadRequest)
     */
    public InitiateMultipartUploadResult initiateMultipartUpload(
            InitiateMultipartUploadRequest initiateMultipartUploadRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(initiateMultipartUploadRequest,
            "The request parameter must be specified when initiating a multipart upload");

        assertParameterNotNull(initiateMultipartUploadRequest.getBucketName(),
            "The bucket name parameter must be specified when initiating a multipart upload");
        assertParameterNotNull(initiateMultipartUploadRequest.getKey(),
            "The key parameter must be specified when initiating a multipart upload");

        Request<InitiateMultipartUploadRequest> request = createRequest(initiateMultipartUploadRequest.getBucketName(), initiateMultipartUploadRequest.getKey(), initiateMultipartUploadRequest, HttpMethodName.POST);
        request.addParameter("uploads", null);

        if (initiateMultipartUploadRequest.getStorageClass() != null)
            request.addHeader(Headers.STORAGE_CLASS, initiateMultipartUploadRequest.getStorageClass().toString());

        if (initiateMultipartUploadRequest.getCannedACL() != null)
            request.addHeader(Headers.S3_CANNED_ACL, initiateMultipartUploadRequest.getCannedACL().toString());

        if (initiateMultipartUploadRequest.objectMetadata != null) populateRequestMetadata(request, initiateMultipartUploadRequest.objectMetadata);

        // Be careful that we don't send the object's total size as the content
        // length for the InitiateMultipartUpload request.
        request.getHeaders().remove(Headers.CONTENT_LENGTH);
        // Set the request content to be empty (but not null) to force the runtime to pass
        // any query params in the query string and not the request body, to keep S3 happy.
        request.setContent(new ByteArrayInputStream(new byte[0]));

        @SuppressWarnings("unchecked")
        ResponseHeaderHandlerChain<InitiateMultipartUploadResult> responseHandler = new ResponseHeaderHandlerChain<InitiateMultipartUploadResult>(
                new Unmarshallers.InitiateMultipartUploadResultUnmarshaller(),
                new ServerSideEncryptionHeaderHandler<InitiateMultipartUploadResult>());
        return invoke(request, responseHandler,
                initiateMultipartUploadRequest.getBucketName(), initiateMultipartUploadRequest.getKey());
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listMultipartUploads(com.amazonaws.services.s3.model.ListMultipartUploadsRequest)
     */
    public MultipartUploadListing listMultipartUploads(ListMultipartUploadsRequest listMultipartUploadsRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(listMultipartUploadsRequest,
            "The request parameter must be specified when listing multipart uploads");

        assertParameterNotNull(listMultipartUploadsRequest.getBucketName(),
            "The bucket name parameter must be specified when listing multipart uploads");

        Request<ListMultipartUploadsRequest> request = createRequest(listMultipartUploadsRequest.getBucketName(), null, listMultipartUploadsRequest, HttpMethodName.GET);
        request.addParameter("uploads", null);

        if (listMultipartUploadsRequest.getKeyMarker() != null) request.addParameter("key-marker", listMultipartUploadsRequest.getKeyMarker());
        if (listMultipartUploadsRequest.getMaxUploads() != null) request.addParameter("max-uploads", listMultipartUploadsRequest.getMaxUploads().toString());
        if (listMultipartUploadsRequest.getUploadIdMarker() != null) request.addParameter("upload-id-marker", listMultipartUploadsRequest.getUploadIdMarker());
        if (listMultipartUploadsRequest.getDelimiter() != null) request.addParameter("delimiter", listMultipartUploadsRequest.getDelimiter());
        if (listMultipartUploadsRequest.getPrefix() != null) request.addParameter("prefix", listMultipartUploadsRequest.getPrefix());

        return invoke(request, new Unmarshallers.ListMultipartUploadsResultUnmarshaller(), listMultipartUploadsRequest.getBucketName(), null);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#listParts(com.amazonaws.services.s3.model.ListPartsRequest)
     */
    public PartListing listParts(ListPartsRequest listPartsRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(listPartsRequest,
            "The request parameter must be specified when listing parts");

        assertParameterNotNull(listPartsRequest.getBucketName(),
            "The bucket name parameter must be specified when listing parts");
        assertParameterNotNull(listPartsRequest.getKey(),
            "The key parameter must be specified when listing parts");
        assertParameterNotNull(listPartsRequest.getUploadId(),
            "The upload ID parameter must be specified when listing parts");

        Request<ListPartsRequest> request = createRequest(listPartsRequest.getBucketName(), listPartsRequest.getKey(), listPartsRequest, HttpMethodName.GET);
        request.addParameter("uploadId", listPartsRequest.getUploadId());

        if (listPartsRequest.getMaxParts() != null) request.addParameter("max-parts", listPartsRequest.getMaxParts().toString());
        if (listPartsRequest.getPartNumberMarker() != null) request.addParameter("part-number-marker", listPartsRequest.getPartNumberMarker().toString());

        return invoke(request, new Unmarshallers.ListPartsResultUnmarshaller(), listPartsRequest.getBucketName(), listPartsRequest.getKey());
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#uploadPart(com.amazonaws.services.s3.model.UploadPartRequest)
     */
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest)
            throws AmazonClientException, AmazonServiceException {
        assertParameterNotNull(uploadPartRequest,
            "The request parameter must be specified when uploading a part");

        String bucketName = uploadPartRequest.getBucketName();
        String key        = uploadPartRequest.getKey();
        String uploadId   = uploadPartRequest.getUploadId();
        int partNumber    = uploadPartRequest.getPartNumber();
        long partSize     = uploadPartRequest.getPartSize();

        assertParameterNotNull(bucketName,
            "The bucket name parameter must be specified when uploading a part");
        assertParameterNotNull(key,
            "The key parameter must be specified when uploading a part");
        assertParameterNotNull(uploadId,
            "The upload ID parameter must be specified when uploading a part");
        assertParameterNotNull(partNumber,
            "The part number parameter must be specified when uploading a part");
        assertParameterNotNull(partSize,
            "The part size parameter must be specified when uploading a part");

        Request<UploadPartRequest> request = createRequest(bucketName, key, uploadPartRequest, HttpMethodName.PUT);
        request.addParameter("uploadId", uploadId);
        request.addParameter("partNumber", Integer.toString(partNumber));

        if (uploadPartRequest.getMd5Digest() != null)
            request.addHeader(Headers.CONTENT_MD5, uploadPartRequest.getMd5Digest());

        request.addHeader(Headers.CONTENT_LENGTH, Long.toString(partSize));

        InputStream inputStream = null;
        if (uploadPartRequest.getInputStream() != null) {
            inputStream = uploadPartRequest.getInputStream();
        } else if (uploadPartRequest.getFile() != null) {
            try {
                inputStream = new InputSubstream(new RepeatableFileInputStream(uploadPartRequest.getFile()),
                        uploadPartRequest.getFileOffset(), partSize, true);
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException("The specified file doesn't exist", e);
            }
        } else {
            throw new IllegalArgumentException("A File or InputStream must be specified when uploading part");
        }

        MD5DigestCalculatingInputStream md5DigestStream = null;
        if (uploadPartRequest.getMd5Digest() == null) {
            /*
             * If the user hasn't set the content MD5, then we don't want to
             * buffer the whole stream in memory just to calculate it. Instead,
             * we can calculate it on the fly and validate it with the returned
             * ETag from the object upload.
             */
            try {
                md5DigestStream = new MD5DigestCalculatingInputStream(inputStream);
                inputStream = md5DigestStream;
            } catch (NoSuchAlgorithmException e) {
                log.warn("No MD5 digest algorithm available.  Unable to calculate " +
                         "checksum and verify data integrity.", e);
            }
        }

        ProgressListener progressListener = uploadPartRequest.getProgressListener();
        if (progressListener != null) {
            inputStream = new ProgressReportingInputStream(inputStream, progressListener);
            fireProgressEvent(progressListener, ProgressEvent.PART_STARTED_EVENT_CODE);
        }

        try {
            request.setContent(inputStream);
            ObjectMetadata metadata = invoke(request, new S3MetadataResponseHandler(), bucketName, key);

            if (metadata != null && md5DigestStream != null) {
            	String contentMd5 = BinaryUtils.toBase64(md5DigestStream.getMd5Digest());
                byte[] clientSideHash = BinaryUtils.fromBase64(contentMd5);
                byte[] serverSideHash = BinaryUtils.fromHex(metadata.getETag());

                if (!Arrays.equals(clientSideHash, serverSideHash)) {
                    fireProgressEvent(progressListener, ProgressEvent.FAILED_EVENT_CODE);
                    throw new AmazonClientException("Unable to verify integrity of data upload.  " +
                            "Client calculated content hash didn't match hash calculated by Amazon S3.  " +
                            "You may need to delete the data stored in Amazon S3.");
                }
            }

            fireProgressEvent(progressListener, ProgressEvent.PART_COMPLETED_EVENT_CODE);

            UploadPartResult result = new UploadPartResult();
            result.setETag(metadata.getETag());
            result.setPartNumber(partNumber);
            result.setServerSideEncryption(metadata.getServerSideEncryption());
            return result;
        } catch (AmazonClientException ace) {
            fireProgressEvent(progressListener, ProgressEvent.PART_FAILED_EVENT_CODE);
            throw ace;
        } finally {
            if (inputStream != null) {
                try {inputStream.close();}
                catch (Exception e) {}
            }
        }
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getResponseMetadataForRequest(com.amazonaws.AmazonWebServiceRequest)
     */
    public S3ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return (S3ResponseMetadata)client.getResponseMetadataForRequest(request);
    }

    /*
     * Private Interface
     */

    /**
     * <p>
     * Asserts that the specified parameter value is not <code>null</code> and if it is,
     * throws an <code>IllegalArgumentException</code> with the specified error message.
     * </p>
     *
     * @param parameterValue
     *            The parameter value being checked.
     * @param errorMessage
     *            The error message to include in the IllegalArgumentException
     *            if the specified parameter is null.
     */
    private void assertParameterNotNull(Object parameterValue, String errorMessage) {
        if (parameterValue == null) throw new IllegalArgumentException(errorMessage);
    }

    /**
     * Fires a progress event with the specified event type to the specified
     * listener.
     *
     * @param listener
     *            The listener to receive the event.
     * @param eventType
     *            The type of event to fire.
     */
    private void fireProgressEvent(ProgressListener listener, int eventType) {
        if (listener == null) return;
        ProgressEvent event = new ProgressEvent(0);
        event.setEventCode(eventType);
        listener.progressChanged(event);
    }

    /**
     * <p>
     * Gets the Amazon S3 {@link AccessControlList} (ACL) for the specified resource.
     * (bucket if only the bucketName parameter is specified, otherwise the object with the
     * specified key in the bucket).
     * </p>
     *
     * @param bucketName
     *            The name of the bucket whose ACL should be returned if the key
     *            parameter is not specified, otherwise the bucket containing
     *            the specified key.
     * @param key
     *            The object key whose ACL should be retrieve. If not specified,
     *            the bucket's ACL is returned.
     * @param versionId
     *            The version ID of the object version whose ACL is being
     *            retrieved.
	 * @param originalRequest
	 *            The original, user facing request object.
	 *
     * @return The S3 ACL for the specified resource.
     */
    private AccessControlList getAcl(String bucketName, String key, String versionId, AmazonWebServiceRequest originalRequest) {
    	if (originalRequest == null) originalRequest = new GenericBucketRequest(bucketName);

        Request<AmazonWebServiceRequest> request = createRequest(bucketName, key, originalRequest, HttpMethodName.GET);
        request.addParameter("acl", null);
        if (versionId != null) request.addParameter("versionId", versionId);

        return invoke(request, new Unmarshallers.AccessControlListUnmarshaller(), bucketName, key);
    }

	/**
     * Sets the Canned ACL for the specified resource in S3. If only bucketName
     * is specified, the canned ACL will be applied to the bucket, otherwise if
     * bucketName and key are specified, the canned ACL will be applied to the
     * object.
     *
     * @param bucketName
     *            The name of the bucket containing the specified key, or if no
     *            key is listed, the bucket whose ACL will be set.
	 * @param key
     *            The optional object key within the specified bucket whose ACL
     *            will be set. If not specified, the bucket ACL will be set.
	 * @param versionId
     *            The version ID of the object version whose ACL is being set.
	 * @param cannedAcl
     *            The canned ACL to apply to the resource.
	 * @param originalRequest
	 *            The original, user facing request object.
     */
    private void setAcl(String bucketName, String key, String versionId, CannedAccessControlList cannedAcl, AmazonWebServiceRequest originalRequest) {
    	if (originalRequest == null) originalRequest = new GenericBucketRequest(bucketName);

        Request<AmazonWebServiceRequest> request = createRequest(bucketName, key, originalRequest, HttpMethodName.PUT);
        request.addParameter("acl", null);
        request.addHeader(Headers.S3_CANNED_ACL, cannedAcl.toString());
        if (versionId != null) request.addParameter("versionId", versionId);

        invoke(request, voidResponseHandler, bucketName, key);
    }

	/**
	 * Sets the ACL for the specified resource in S3. If only bucketName is
	 * specified, the ACL will be applied to the bucket, otherwise if bucketName
	 * and key are specified, the ACL will be applied to the object.
	 *
	 * @param bucketName
	 *            The name of the bucket containing the specified key, or if no
	 *            key is listed, the bucket whose ACL will be set.
	 * @param key
	 *            The optional object key within the specified bucket whose ACL
	 *            will be set. If not specified, the bucket ACL will be set.
	 * @param versionId
	 *            The version ID of the object version whose ACL is being set.
	 * @param acl
	 *            The ACL to apply to the resource.
	 * @param originalRequest
	 *            The original, user facing request object.
	 */
    private void setAcl(String bucketName, String key, String versionId, AccessControlList acl, AmazonWebServiceRequest originalRequest) {
    	if (originalRequest == null) originalRequest = new GenericBucketRequest(bucketName);

        Request<AmazonWebServiceRequest> request = createRequest(bucketName, key, originalRequest, HttpMethodName.PUT);
        request.addParameter("acl", null);
        if (versionId != null) request.addParameter("versionId", versionId);

        byte[] aclAsXml = new AclXmlFactory().convertToXmlByteArray(acl);
        request.addHeader("Content-Type", "text/plain");
        request.addHeader("Content-Length", String.valueOf(aclAsXml.length));
        request.setContent(new ByteArrayInputStream(aclAsXml));

        invoke(request, voidResponseHandler, bucketName, key);
    }

    protected Signer createSigner(Request<?> request, String bucketName, String key) {
        String resourcePath =
            "/" +
            ((bucketName != null) ? bucketName + "/" : "") +
            ((key != null) ? ServiceUtils.urlEncode(key) : "");

        return new S3Signer(request.getHttpMethod().toString(), resourcePath);
    }

    /**
     * Pre-signs the specified request, using a signature query-string
     * parameter.
     *
     * @param request
     *            The request to sign.
     * @param methodName
     *            The HTTP method (GET, PUT, DELETE, HEAD) for the specified
     *            request.
     * @param bucketName
     *            The name of the bucket involved in the request. If the request
     *            is not an operation on a bucket this parameter should be null.
     * @param key
     *            The object key involved in the request. If the request is not
     *            an operation on an object, this parameter should be null.
     * @param expiration
     *            The time at which the signed request is no longer valid, and
     *            will stop working.
     * @param subResource
     *            The optional sub-resource being requested as part of the
     *            request (e.g. "location", "acl", "logging", or "torrent").
     */
    protected <T> void presignRequest(Request<T> request, HttpMethod methodName,
            String bucketName, String key, Date expiration, String subResource) {
        // Run any additional request handlers if present
        if (requestHandlers != null) {
            for (RequestHandler requestHandler : requestHandlers) {
                requestHandler.beforeRequest(request);
            }
        }

        String resourcePath = "/" +
            ((bucketName != null) ? bucketName + "/" : "") +
            ((key != null) ? ServiceUtils.urlEncode(key) : "") +
            ((subResource != null) ? "?" + subResource : "");

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
        	credentials = originalRequest.getRequestCredentials();
        }

        new S3QueryStringSigner<T>(methodName.toString(), resourcePath, expiration).sign(request, credentials);

        // The Amazon S3 DevPay token header is a special exception and can be safely moved
        // from the request's headers into the query string to ensure that it travels along
        // with the pre-signed URL when it's sent back to Amazon S3.
        if (request.getHeaders().containsKey(Headers.SECURITY_TOKEN)) {
            String value = request.getHeaders().get(Headers.SECURITY_TOKEN);
            request.addParameter(Headers.SECURITY_TOKEN, value);
            request.getHeaders().remove(Headers.SECURITY_TOKEN);
        }
    }

    /**
     * Converts the current endpoint set for this client into virtual addressing
     * style, by placing the name of the specified bucket before the S3 service
     * endpoint.
     *
     * @param bucketName
     *            The name of the bucket to use in the virtual addressing style
     *            of the returned URI.
     *
     * @return A new URI, creating from the current service endpoint URI and the
     *         specified bucket.
     */
    private URI convertToVirtualHostEndpoint(String bucketName) {
        try {
            return new URI(endpoint.getScheme() + "://" + bucketName + "." + endpoint.getAuthority());
        } catch (URISyntaxException e) {
            throw new AmazonClientException("Can't turn bucket name into a URI: " + e.getMessage(), e);
        }
    }

    /**
     * <p>
     * Populates the specified request object with the appropriate headers from
     * the {@link ObjectMetadata} object.
     * </p>
     *
     * @param request
     *            The request to populate with headers.
     * @param metadata
     *            The metadata containing the header information to include in
     *            the request.
     */
    protected static void populateRequestMetadata(Request<?> request, ObjectMetadata metadata) {
        Map<String, Object> rawMetadata = metadata.getRawMetadata();
        if (rawMetadata != null) {
            for (Entry<String, Object> entry : rawMetadata.entrySet()) {
                request.addHeader(entry.getKey(), entry.getValue().toString());
            }
        }

        Map<String, String> userMetadata = metadata.getUserMetadata();
        if (userMetadata != null) {
            for (Entry<String, String> entry : userMetadata.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) key = key.trim();
                if (value != null) value = value.trim();
                request.addHeader(Headers.S3_USER_METADATA_PREFIX + key, value);
            }
        }
    }

    /**
     * <p>
     * Populates the specified request with the specified Multi-Factor
     * Authentication (MFA) details. This includes the MFA header with device serial
     * number and generated token. Since all requests which include the MFA
     * header must be sent over HTTPS, this operation also configures the request object to
     * use HTTPS instead of HTTP.
     * </p>
     *
     * @param request
     *            The request to populate.
     * @param mfa
     *            The Multi-Factor Authentication information.
     */
    private void populateRequestWithMfaDetails(Request<?> request, MultiFactorAuthentication mfa) {
        if (mfa == null) return;

        String endpoint = request.getEndpoint().toString();
        if (endpoint.startsWith("http://")) {
            String httpsEndpoint = endpoint.replace("http://", "https://");
            request.setEndpoint(URI.create(httpsEndpoint));
            log.info("Overriding current endpoint to use HTTPS " +
                    "as required by S3 for requests containing an MFA header");
        }

        request.addHeader(Headers.S3_MFA,
                mfa.getDeviceSerialNumber() + " " + mfa.getToken());
    }

    /**
     * <p>
     * Populates the specified request with the numerous options available in
     * <code>CopyObjectRequest</code>.
     * </p>
     *
     * @param request
     *            The request to populate with headers to represent all the
     *            options expressed in the <code>CopyObjectRequest</code> object.
     * @param copyObjectRequest
     *            The object containing all the options for copying an object in
     *            Amazon S3.
     */
    private static void populateRequestWithCopyObjectParameters(Request<?> request, CopyObjectRequest copyObjectRequest) {
        String copySourceHeader =
             "/" + ServiceUtils.urlEncode(copyObjectRequest.getSourceBucketName())
           + "/" + ServiceUtils.urlEncode(copyObjectRequest.getSourceKey());
        if (copyObjectRequest.getSourceVersionId() != null) {
            copySourceHeader += "?versionId=" + copyObjectRequest.getSourceVersionId();
        }
        request.addHeader("x-amz-copy-source", copySourceHeader);

        addDateHeader(request, Headers.COPY_SOURCE_IF_MODIFIED_SINCE,
                copyObjectRequest.getModifiedSinceConstraint());
        addDateHeader(request, Headers.COPY_SOURCE_IF_UNMODIFIED_SINCE,
                copyObjectRequest.getUnmodifiedSinceConstraint());

        addStringListHeader(request, Headers.COPY_SOURCE_IF_MATCH,
                copyObjectRequest.getMatchingETagConstraints());
        addStringListHeader(request, Headers.COPY_SOURCE_IF_NO_MATCH,
                copyObjectRequest.getNonmatchingETagConstraints());

        if (copyObjectRequest.getCannedAccessControlList() != null) {
            request.addHeader(Headers.S3_CANNED_ACL,
                    copyObjectRequest.getCannedAccessControlList().toString());
        }

        if (copyObjectRequest.getStorageClass() != null) {
            request.addHeader(Headers.STORAGE_CLASS, copyObjectRequest.getStorageClass());
        }

        ObjectMetadata newObjectMetadata = copyObjectRequest.getNewObjectMetadata();
        if (newObjectMetadata != null) {
            request.addHeader(Headers.METADATA_DIRECTIVE, "REPLACE");
            populateRequestMetadata(request, newObjectMetadata);
        }
    }

    /**
     * <p>
     * Populates the specified request with the numerous options available in
     * <code>CopyObjectRequest</code>.
     * </p>
     *
     * @param request
     *            The request to populate with headers to represent all the
     *            options expressed in the <code>CopyPartRequest</code> object.
     * @param copyPartRequest
     *            The object containing all the options for copying an object in
     *            Amazon S3.
     */
    private static void populateRequestWithCopyPartParameters(Request<?> request, CopyPartRequest copyPartRequest) {
        String copySourceHeader =
             "/" + ServiceUtils.urlEncode(copyPartRequest.getSourceBucketName())
           + "/" + ServiceUtils.urlEncode(copyPartRequest.getSourceKey());
        if (copyPartRequest.getSourceVersionId() != null) {
            copySourceHeader += "?versionId=" + copyPartRequest.getSourceVersionId();
        }
        request.addHeader("x-amz-copy-source", copySourceHeader);

        addDateHeader(request, Headers.COPY_SOURCE_IF_MODIFIED_SINCE,
                copyPartRequest.getModifiedSinceConstraint());
        addDateHeader(request, Headers.COPY_SOURCE_IF_UNMODIFIED_SINCE,
                copyPartRequest.getUnmodifiedSinceConstraint());

        addStringListHeader(request, Headers.COPY_SOURCE_IF_MATCH,
                copyPartRequest.getMatchingETagConstraints());
        addStringListHeader(request, Headers.COPY_SOURCE_IF_NO_MATCH,
                copyPartRequest.getNonmatchingETagConstraints());

        if ( copyPartRequest.getFirstByte() != null && copyPartRequest.getLastByte() != null ) {
            String range = "bytes=" + copyPartRequest.getFirstByte() + "-" + copyPartRequest.getLastByte();
            request.addHeader(Headers.COPY_PART_RANGE, range);
        }
    }

    /**
     * <p>
     * Adds the specified date header in RFC 822 date format to the specified
     * request.
     * This method will not add a date header if the specified date value is <code>null</code>.
     * </p>
     *
     * @param request
     *            The request to add the header to.
     * @param header
     *            The header name.
     * @param value
     *            The header value.
     */
    private static void addDateHeader(Request<?> request, String header, Date value) {
        if (value != null) {
            request.addHeader(header, ServiceUtils.formatRfc822Date(value));
        }
    }

    /**
     * <p>
     * Adds the specified string list header, joined together separated with
     * commas, to the specified request.
     * This method will not add a string list header if the specified values
     * are <code>null</code> or empty.
     * </p>
     *
     * @param request
     *            The request to add the header to.
     * @param header
     *            The header name.
     * @param values
     *            The list of strings to join together for the header value.
     */
    private static void addStringListHeader(Request<?> request, String header, List<String> values) {
        if (values != null && !values.isEmpty()) {
            request.addHeader(header, ServiceUtils.join(values));
        }
    }

    /**
     * <p>
     * Adds response headers parameters to the request given, if non-null.
     * </p>
     *
     * @param request
     *            The request to add the response header parameters to.
     * @param responseHeaders
     *            The full set of response headers to add, or null for none.
     */
    private static void addResponseHeaderParameters(Request<?> request, ResponseHeaderOverrides responseHeaders) {
        if ( responseHeaders != null ) {
            if ( responseHeaders.getCacheControl() != null ) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_CACHE_CONTROL, responseHeaders.getCacheControl());
            }
            if ( responseHeaders.getContentDisposition() != null ) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_DISPOSITION,
                        responseHeaders.getContentDisposition());
            }
            if ( responseHeaders.getContentEncoding() != null ) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_ENCODING,
                        responseHeaders.getContentEncoding());
            }
            if ( responseHeaders.getContentLanguage() != null ) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_LANGUAGE,
                        responseHeaders.getContentLanguage());
            }
            if ( responseHeaders.getContentType() != null ) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_TYPE, responseHeaders.getContentType());
            }
            if ( responseHeaders.getExpires() != null ) {
                request.addParameter(ResponseHeaderOverrides.RESPONSE_HEADER_EXPIRES, responseHeaders.getExpires());
            }
        }
    }

    /**
     * Creates and initializes a new request object for the specified S3
     * resource. This method is responsible for determining the right way to
     * address resources. For example, bucket names that are not DNS addressable
     * cannot be addressed in V2, virtual host, style, and instead must use V1,
     * path style. The returned request object has the service name, endpoint
     * and resource path correctly populated. Callers can take the request, add
     * any additional headers or parameters, then sign and execute the request.
     *
     * @param bucketName
     *            An optional parameter indicating the name of the bucket
     *            containing the resource involved in the request.
     * @param key
     *            An optional parameter indicating the key under which the
     *            desired resource is stored in the specified bucket.
     * @param originalRequest
     *            The original request, as created by the user.
     * @param httpMethod
     *            The HTTP method to use when sending the request.
     *
     * @return A new request object, populated with endpoint, resource path, and
     *         service name, ready for callers to populate any additional
     *         headers or parameters, and execute.
     */
    protected <X extends AmazonWebServiceRequest> Request<X> createRequest(String bucketName, String key, X originalRequest, HttpMethodName httpMethod) {
        Request<X> request = new DefaultRequest<X>(originalRequest, Constants.S3_SERVICE_NAME);
        request.setHttpMethod(httpMethod);
        if (bucketNameUtils.isDNSBucketName(bucketName)) {
            request.setEndpoint(convertToVirtualHostEndpoint(bucketName));
            request.setResourcePath(ServiceUtils.urlEncode(key));
        } else {
            request.setEndpoint(endpoint);

            if (bucketName != null) {
                /*
                 * We don't URL encode the bucket name, since it shouldn't
                 * contain any characters that need to be encoded based on
                 * Amazon S3's naming restrictions.
                 */
                request.setResourcePath(bucketName + "/"
                        + (key != null ? ServiceUtils.urlEncode(key) : ""));
            }
        }

        return request;
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request,
                                  Unmarshaller<X, InputStream> unmarshaller,
                                  String bucketName,
                                  String key) {
        return invoke(request, new S3XmlResponseHandler<X>(unmarshaller), bucketName, key);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, String bucket, String key) {
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        /*
         * The string we sign needs to include the exact headers that we
         * send with the request, but the client runtime layer adds the
         * Content-Type header before the request is sent if one isn't set, so
         * we have to set something here otherwise the request will fail.
         */
        if (request.getHeaders().get("Content-Type") == null) {
        	request.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
        	credentials = originalRequest.getRequestCredentials();
        }

        ExecutionContext executionContext = createExecutionContext();
        executionContext.setSigner(createSigner(request, bucket, key));
        executionContext.setCredentials(credentials);

        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
