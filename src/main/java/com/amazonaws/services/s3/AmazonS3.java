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

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.HttpMethod;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketPolicy;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
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
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.SetBucketAclRequest;
import com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketPolicyRequest;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.services.s3.model.VersionListing;

/**
 * <p>
 * Provides an interface for accessing the Amazon S3 web service.
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
public interface AmazonS3 {

    /**
     * <p>
     * Overrides the default endpoint for this client.
     * Use this method to send requests to the specified AWS region.
     * </p>
     * <p>
     * Pass the endpoint (e.g. "s3.amazonaws.com") or a full
     * URL, including the protocol (e.g. "https://s3.amazonaws.com"). If the
     * protocol is not specified, the protocol  from this client's
     * {@link com.amazonaws.ClientConfiguration} is used.
     * </p>
     * @param endpoint
     *            The endpoint (e.g. "s3.amazonaws.com") or the full URL,
     *            including the protocol (e.g. "https://s3.amazonaws.com"), of
     *            the region-specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If the specified endpoint is not a valid URL endpoint.
     */
    public void setEndpoint(String endpoint);

    /**
     * <p>
     * Changes the Amazon S3 storage class for a specified object. Amazon S3
     * offers multiple storage classes for developers' different needs.
     * </p>
     * <p>
     * Note that changing the storage class of an object in a bucket
     * that has enabled versioning creates a new version of the object
     * with the new storage class. The existing version of the object persists
     * in the current storage class.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the object.
     * @param key
     *            The key of the object within the specified bucket.
     * @param newStorageClass
     *            The new storage class for the specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void changeObjectStorageClass(String bucketName, String key, StorageClass newStorageClass)
        throws AmazonClientException, AmazonServiceException;
    
    
    /**
     * <p>
     * Changes the Amazon S3 redirect location for a specific object.
     * </p>
     * @param bucketName
     *            The name of the bucket containing the object.
     * @param key
     *            The key of the object within the specified bucket.
     * @param newRedirectLocation
     *            The new redirect location for the specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void setObjectRedirectLocation(String bucketName, String key, String newRedirectLocation)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of summary information about the objects in the specified
     * buckets.
     * List results are <i>always</i> returned in lexicographic (alphabetical) order.
     * </p>
     * <p>
     * Because buckets can contain a virtually unlimited number of keys, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link ObjectListing#isTruncated()} method to see if the returned
     * listing is complete or if additional calls are needed to get
     * more results. Alternatively, use the
     * {@link AmazonS3Client#listNextBatchOfObjects(ObjectListing)} method as
     * an easy way to get the next page of object listings.
     * </p>
     * <p>
     * The total number of keys in a bucket doesn't substantially
     * affect list performance.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket to list.
     *
     * @return A listing of the objects in the specified bucket, along with any
     *         other associated information, such as common prefixes (if a
     *         delimiter was specified), the original request parameters, etc.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#listObjects(String, String)
     * @see AmazonS3Client#listObjects(ListObjectsRequest)
     */
    public ObjectListing listObjects(String bucketName) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of summary information about the objects in the specified
     * bucket. Depending on request parameters, additional information is returned,
     * such as common prefixes if a delimiter was specified.  List
     * results are <i>always</i> returned in lexicographic (alphabetical) order.
     * </p>
     * <p>
     * Because buckets can contain a virtually unlimited number of keys, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link ObjectListing#isTruncated()} method to see if the returned
     * listing is complete or if additional calls are needed to get
     * more results. Alternatively, use the
     * {@link AmazonS3Client#listNextBatchOfObjects(ObjectListing)} method as
     * an easy way to get the next page of object listings.
     * </p>
     * <p>
     * For example, consider a bucket that contains the following keys:
     * <ul>
     * 	<li>"foo/bar/baz"</li>
     * 	<li>"foo/bar/bash"</li>
     * 	<li>"foo/bar/bang"</li>
     * 	<li>"foo/boo"</li>
     * </ul>
     * If calling <code>listObjects</code> with
     * a <code>prefix</code> value of "foo/" and a <code>delimiter</code> value of "/"
     * on this bucket, an <code>ObjectListing</code> is returned that contains one key
     * ("foo/boo") and one entry in the common prefixes list ("foo/bar/").
     * To see deeper into the virtual hierarchy, make another
     * call to <code>listObjects</code> setting the prefix parameter to any interesting
     * common prefix to list the individual keys under that prefix.
     * </p>
     * <p>
     * The total number of keys in a bucket doesn't substantially
     * affect list performance.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket to list.
     * @param prefix
     *            An optional parameter restricting the response to keys
     *            beginning with the specified prefix. Use prefixes to
     *            separate a bucket into different sets of keys,
     *            similar to how a file system organizes files
     * 		      into directories.
     *
     * @return A listing of the objects in the specified bucket, along with any
     *         other associated information, such as common prefixes (if a
     *         delimiter was specified), the original request parameters, etc.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#listObjects(String)
     * @see AmazonS3Client#listObjects(ListObjectsRequest)
     */
    public ObjectListing listObjects(String bucketName, String prefix)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of summary information about the objects in the specified
     * bucket. Depending on the request parameters, additional information is returned,
     * such as common prefixes if a delimiter was specified. List
     * results are <i>always</i> returned in lexicographic (alphabetical) order.
     * </p>
     * <p>
     * Because buckets can contain a virtually unlimited number of keys, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link ObjectListing#isTruncated()} method to see if the returned
     * listing is complete or if additional calls are needed to get
     * more results. Alternatively, use the
     * {@link AmazonS3Client#listNextBatchOfObjects(ObjectListing)} method as
     * an easy way to get the next page of object listings.
     * </p>
     * <p>
     * Calling {@link ListObjectsRequest#setDelimiter(String)}
     * sets the delimiter, allowing groups of keys that share the
     * delimiter-terminated prefix to be included
     * in the returned listing. This allows applications to organize and browse
     * their keys hierarchically, similar to how a file system organizes files
     * into directories. These common prefixes can be retrieved
     * through the {@link ObjectListing#getCommonPrefixes()} method.
     * </p>
     * <p>
     * For example, consider a bucket that contains the following keys:
     * <ul>
     * 	<li>"foo/bar/baz"</li>
     * 	<li>"foo/bar/bash"</li>
     * 	<li>"foo/bar/bang"</li>
     * 	<li>"foo/boo"</li>
     * </ul>
     * If calling <code>listObjects</code> with
     * a prefix value of "foo/" and a delimiter value of "/"
     * on this bucket, an <code>ObjectListing</code> is returned that contains one key
     * ("foo/boo") and one entry in the common prefixes list ("foo/bar/").
     * To see deeper into the virtual hierarchy, make another
     * call to <code>listObjects</code> setting the prefix parameter to any interesting
     * common prefix to list the individual keys under that prefix.
     * </p>
     * <p>
     * The total number of keys in a bucket doesn't substantially
     * affect list performance.
     * </p>
     *
     * @param listObjectsRequest
     *            The request object containing all options for listing the
     *            objects in a specified bucket.
     *
     * @return A listing of the objects in the specified bucket, along with any
     *         other associated information, such as common prefixes (if a
     *         delimiter was specified), the original request parameters, etc.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#listObjects(String)
     * @see AmazonS3Client#listObjects(String, String)
     */
    public ObjectListing listObjects(ListObjectsRequest listObjectsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides an easy way to continue a truncated object listing and retrieve
     * the next page of results.
     * </p>
     * <p>
     * To continue the object listing and retrieve the next page of results,
     * call the initial {@link ObjectListing} from one of the
     * <code>listObjects</code> methods.
     * If truncated
     * (indicated when {@link ObjectListing#isTruncated()} returns <code>true</code>),
     * pass the <code>ObjectListing</code> back into this method
     * in order to retrieve the
     * next page of results. Continue using this method to
     * retrieve more results until the returned <code>ObjectListing</code> indicates that
     * it is not truncated.
     * </p>
     * @param previousObjectListing
     *            The previous truncated <code>ObjectListing</code>.
     *            If a
     *            non-truncated <code>ObjectListing</code> is passed in, an empty
     *            <code>ObjectListing</code> is returned without ever contacting
     *            Amazon S3.
     *
     * @return The next set of <code>ObjectListing</code> results, beginning immediately
     *         after the last result in the specified previous <code>ObjectListing</code>.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#listObjects(String)
     * @see AmazonS3Client#listObjects(String, String)
     * @see AmazonS3Client#listObjects(ListObjectsRequest)
     */
    public ObjectListing listNextBatchOfObjects(ObjectListing previousObjectListing)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of summary information about the versions in the specified
     * bucket.
     * </p>
     * <p>
     * The returned version summaries are ordered first by key and then by
     * version. Keys are sorted lexicographically (alphabetically)
     * while versions are sorted from most recent to least recent.
     * Both versions with data and delete markers are included in the results.
     * </p>
     * <p>
     * Because buckets can contain a virtually unlimited number of versions, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link VersionListing#isTruncated()} method to determine if the
     * returned listing is complete or if additional calls are needed to get
     * more results. Callers are
     * encouraged to use
     * {@link AmazonS3#listNextBatchOfVersions(VersionListing)} as an easy way
     * to get the next page of results.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose versions are to be
     *            listed.
     * @param prefix
     *            An optional parameter restricting the response to keys
     *            beginning with the specified prefix. Use prefixes to
     *            separate a bucket into different sets of keys,
     *            similar to how a file system organizes files
     * 		      into directories.
     *
     * @return A listing of the versions in the specified bucket, along with any
     *         other associated information and original request parameters.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#listVersions(ListVersionsRequest)
     * @see AmazonS3Client#listVersions(String, String, String, String, String, Integer)
     */
    public VersionListing listVersions(String bucketName, String prefix)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides an easy way to continue a truncated {@link VersionListing} and retrieve
     * the next page of results.
     * </p>
     * <p>
     * Obtain the initial
     * <code>VersionListing</code> from one of the <code>listVersions</code> methods. If the result
     * is truncated (indicated when {@link ObjectListing#isTruncated()} returns <code>true</code>),
     * pass the <code>VersionListing</code> back into this method in order to retrieve the
     * next page of results. From there, continue using this method to
     * retrieve more results until the returned <code>VersionListing</code> indicates that
     * it is not truncated.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param previousVersionListing
     *            The previous truncated <code>VersionListing</code>.
     *            If a
     *            non-truncated <code>VersionListing</code> is passed in, an empty
     *            <code>VersionListing</code> is returned without ever contacting
     *            Amazon S3.
     *
     * @return The next set of <code>VersionListing</code> results, beginning immediately
     *         after the last result in the specified previous <code>VersionListing</code>.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#listVersions(String, String)
     * @see AmazonS3Client#listVersions(ListVersionsRequest)
     * @see AmazonS3Client#listVersions(String, String, String, String, String, Integer)
     */
    public VersionListing listNextBatchOfVersions(VersionListing previousVersionListing)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of summary information about the versions in the specified
     * bucket.
     * </p>
     * <p>
     * The returned version summaries are ordered first by key and then by
     * version. Keys are sorted lexicographically (alphabetically)
     * and versions are sorted from most recent to least recent.
     * Versions
     * with data and delete markers are included in the results.
     * </p>
     * <p>
     * Because buckets can contain a virtually unlimited number of versions, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link VersionListing#isTruncated()} method to determine if the
     * returned listing is complete or if additional calls are needed
     * to get more results.
     * Callers are
     * encouraged to use
     * {@link AmazonS3#listNextBatchOfVersions(VersionListing)} as an easy way
     * to get the next page of results.
     * </p>
     * <p>
     * The <code>keyMarker</code> and <code>versionIdMarker</code> parameters allow
     * callers to specify where to start the version listing.
     * </p>
     * <p>
     * The <code>delimiter</code> parameter allows groups of keys that share a
     * delimiter-terminated prefix to be included
     * in the returned listing. This allows applications to organize and browse
     * their keys hierarchically, much like how a file system organizes
     * files into directories. These common prefixes can be retrieved
     * by calling the {@link VersionListing#getCommonPrefixes()} method.
     * </p>
     * <p>
     * For example, consider a bucket that contains the following keys:
     * <ul>
     * 	<li>"foo/bar/baz"</li>
     * 	<li>"foo/bar/bash"</li>
     * 	<li>"foo/bar/bang"</li>
     * 	<li>"foo/boo"</li>
     * </ul>
     * If calling <code>listVersions</code> with
     * a <code>prefix</code> value of "foo/" and a <code>delimiter</code> value of "/"
     * on this bucket, a <code>VersionListing</code> is returned that contains:
     * 	<ul>
     * 		<li>all the versions for one key ("foo/boo")</li>
     * 		<li>one entry in the common prefixes list ("foo/bar/")</li>
     * 	</ul>
     * </p>
     * <p>
     * To see deeper into the virtual hierarchy, make
     * another call to <code>listVersions</code> setting the prefix parameter to any
     * interesting common prefix to list the individual versions under that
     * prefix.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose versions are to be
     *            listed.
     * @param prefix
     *            An optional parameter restricting the response to keys that
     *            begin with the specified prefix. Use prefixes to
     *            separate a bucket into different sets of keys,
     *            similar to how a file system organizes files
     * 		      into directories.
     * @param keyMarker
     *            Optional parameter indicating where in the sorted list of all
     *            versions in the specified bucket to begin returning results.
     *            Results are always ordered first lexicographically (i.e.
     *            alphabetically) and then from most recent version to least
     *            recent version. If a keyMarker is used without a
     *            versionIdMarker, results begin immediately after that key's
     *            last version. When a keyMarker is used with a versionIdMarker,
     *            results begin immediately after the version with the specified
     *            key and version ID.
     *            <p>
     *            This enables pagination; to get the next page of results use
     *            the next key marker and next version ID marker (from
     *            {@link VersionListing#getNextKeyMarker()} and
     *            {@link VersionListing#getNextVersionIdMarker()}) as the
     *            markers for the next request to list versions, or use the
     *            convenience method
     *            {@link AmazonS3#listNextBatchOfVersions(VersionListing)}
     * @param versionIdMarker
     *            Optional parameter indicating where in the sorted list of all
     *            versions in the specified bucket to begin returning results.
     *            Results are always ordered first lexicographically (i.e.
     *            alphabetically) and then from most recent version to least
     *            recent version. A keyMarker must be specified when specifying
     *            a versionIdMarker. Results begin immediately after the version
     *            with the specified key and version ID.
     *            <p>
     *            This enables pagination; to get the next page of results use
     *            the next key marker and next version ID marker (from
     *            {@link VersionListing#getNextKeyMarker()} and
     *            {@link VersionListing#getNextVersionIdMarker()}) as the
     *            markers for the next request to list versions, or use the
     *            convenience method
     *            {@link AmazonS3#listNextBatchOfVersions(VersionListing)}
     * @param delimiter
     *            Optional parameter that causes keys that contain the same
     *            string between the prefix and the first occurrence of the
     *            delimiter to be rolled up into a single result element in the
     *            {@link VersionListing#getCommonPrefixes()} list. These
     *            rolled-up keys are not returned elsewhere in the response. The
     *            most commonly used delimiter is "/", which simulates a
     *            hierarchical organization similar to a file system directory
     *            structure.
     * @param maxResults
     *            Optional parameter indicating the maximum number of results to
     *            include in the response. Amazon S3 might return fewer than
     *            this, but will not return more. Even if maxKeys is not
     *            specified, Amazon S3 will limit the number of results in the
     *            response.
     *
     * @return A listing of the versions in the specified bucket, along with any
     *         other associated information such as common prefixes (if a
     *         delimiter was specified), the original request parameters, etc.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#listVersions(String, String)
     * @see AmazonS3Client#listVersions(ListVersionsRequest)
     * @see AmazonS3Client#listNextBatchOfVersions(VersionListing)
     */
    public VersionListing listVersions(String bucketName, String prefix,
            String keyMarker, String versionIdMarker, String delimiter, Integer maxResults)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of summary information about the versions in the specified
     * bucket.
     * </p>
     * <p>
     * The returned version summaries are ordered first by key and then by
     * version. Keys are sorted lexicographically (alphabetically)
     * and versions are sorted from most recent to least recent.
     * Versions
     * with data and delete markers are included in the results.
     * </p>
     * <p>
     * Because buckets can contain a virtually unlimited number of versions, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link VersionListing#isTruncated()} method to determine if the
     * returned listing is complete or if additional calls are needed
     * to get more results.
     * Callers are
     * encouraged to use
     * {@link AmazonS3#listNextBatchOfVersions(VersionListing)} as an easy way
     * to get the next page of results.
     * </p>
     * <p>
     * The <code>keyMarker</code> and <code>versionIdMarker</code> parameters allow
     * callers to specify where to start the version listing.
     * </p>
     * <p>
     * The <code>delimiter</code> parameter allows groups of keys that share a
     * delimiter-terminated prefix to be included
     * in the returned listing. This allows applications to organize and browse
     * their keys hierarchically, much like how a file system organizes
     * files into directories. These common prefixes can be retrieved
     * by calling the {@link VersionListing#getCommonPrefixes()} method.
     * </p>
     * <p>
     * For example, consider a bucket that contains the following keys:
     * <ul>
     *  <li>"foo/bar/baz"</li>
     *  <li>"foo/bar/bash"</li>
     *  <li>"foo/bar/bang"</li>
     *  <li>"foo/boo"</li>
     * </ul>
     * If calling <code>listVersions</code> with
     * a <code>prefix</code> value of "foo/" and a <code>delimiter</code> value of "/"
     * on this bucket, a <code>VersionListing</code> is returned that contains:
     *  <ul>
     *      <li>all the versions for one key ("foo/boo")</li>
     *      <li>one entry in the common prefixes list ("foo/bar/")</li>
     *  </ul>
     * </p>
     * <p>
     * To see deeper into the virtual hierarchy, make
     * another call to <code>listVersions</code> setting the prefix parameter to any
     * interesting common prefix to list the individual versions under that
     * prefix.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param listVersionsRequest
     *            The request object containing all options for listing the
     *            versions in a specified bucket.
     *
     * @return A listing of the versions in the specified bucket, along with any
     *         other associated information such as common prefixes (if a
     *         delimiter was specified), the original request parameters, etc.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#listVersions(String, String)
     * @see AmazonS3Client#listVersions(String, String, String, String, String, Integer)
     * @see AmazonS3Client#listNextBatchOfVersions(VersionListing)
     */
    public VersionListing listVersions(ListVersionsRequest listVersionsRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the current owner of the AWS account
     * that the authenticated sender of the request is using.
     * </p>
     * <p>
     * The caller <i>must</i> authenticate with a valid AWS Access Key ID that is registered
     * with Amazon S3.
     * </p>
     *
     * @return The account of the authenticated sender
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public Owner getS3AccountOwner() throws AmazonClientException,
            AmazonServiceException;

    /**
     * Checks if the specified bucket exists. Amazon S3 buckets are named in a
     * global namespace; use this method to determine if a specified
     * bucket name already exists, and therefore can't be used to create a new
     * bucket.
     *
     * @param bucketName
     *            The name of the bucket to check.
     *
     * @return The value <code>true</code> if the specified bucket exists in
     *         Amazon S3; the value
     *         <code>false</code> if there is no bucket in Amazon S3 with that name.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#createBucket(CreateBucketRequest)
     */
    public boolean doesBucketExist(String bucketName)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of all Amazon S3 buckets that the
     * authenticated sender of the request owns.
     * </p>
     * <p>
     * Users must authenticate with a valid AWS Access Key ID that is registered
     * with Amazon S3. Anonymous requests cannot list buckets, and users cannot
     * list buckets that they did not create.
     * </p>
     *
     * @return A list of all of the Amazon S3 buckets owned by the authenticated
     *         sender of the request.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#listBuckets(ListBucketsRequest)
     */
    public List<Bucket> listBuckets() throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of all Amazon S3 buckets that the
     * authenticated sender of the request owns.
     * </p>
     * <p>
     * Users must authenticate with a valid AWS Access Key ID that is registered
     * with Amazon S3. Anonymous requests cannot list buckets, and users cannot
     * list buckets that they did not create.
     * </p>
     *
     * @param request
     *          The request containing all of the options related to the listing
     *          of buckets.
     *
     * @return A list of all of the Amazon S3 buckets owned by the authenticated
     *         sender of the request.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#listBuckets()
     */
    public List<Bucket> listBuckets(ListBucketsRequest listBucketsRequest)
            throws AmazonClientException, AmazonServiceException;


    /**
     * <p>
     * Gets the geographical region where Amazon S3 stores the specified
     * bucket.
     * </p>
     * <p>
     * To view the location constraint of a bucket, the user must be the bucket
     * owner.
     * </p>
     * <p>
     * Use {@link Region#fromValue(String)} to get the <code>Region</code>
     * enumeration value, but be prepared to
     * handle an <code>IllegalArgumentException</code>
     * if the value passed is not a known <code>Region</code> value.
     * </p>
     * <p>
     * Note that <code>Region</code> enumeration values are not returned
     * directly from this method.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket to look up. This must be a
     *            bucket the user owns.
     *
     * @return The location of the specified Amazon S3 bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see Region
     */
    public String getBucketLocation(String bucketName) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the geographical region where Amazon S3 stores the specified
     * bucket.
     * </p>
     * <p>
     * To view the location constraint of a bucket, the user must be the bucket
     * owner.
     * </p>
     * <p>
     * Use {@link Region#fromValue(String)} to get the <code>Region</code>
     * enumeration value, but be prepared to
     * handle an <code>IllegalArgumentException</code>
     * if the value passed is not a known <code>Region</code> value.
     * </p>
     * <p>
     * Note that <code>Region</code> enumeration values are not returned
     * directly from this method.
     * </p>
     *
     * @param getBucketLocationRequest
     *            The request object containing the name of the Amazon S3
     *            bucket to look up. This must be a bucket the user owns.
     *
     * @return The location of the specified Amazon S3 bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see Region
     */
    public String getBucketLocation(GetBucketLocationRequest getBucketLocationRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Amazon S3 bucket in the default
     * region, {@link Region#US_Standard}.
     * </p>
     * <p>
     * Every object stored in Amazon S3 is contained within a bucket. Buckets
     * partition the namespace of objects stored in Amazon S3 at the top level.
     * Within a bucket, any name can be used for objects. However, bucket names
     * must be unique across all of Amazon S3.
     * </p>
     * <p>
     * Bucket ownership is similar to the ownership of Internet domain names.
     * Within Amazon S3, only a single user owns each bucket.
     * Once a uniquely named bucket is created in Amazon S3,
     * organize and name the objects within the bucket in any way.
     * Ownership of the bucket is retained as long as the owner has an Amazon S3 account.
     * </p>
     * <p>
     * To conform with DNS requirements, the following constraints apply:
     *  <ul>
     *      <li>Bucket names should not contain underscores</li>
     *      <li>Bucket names should be between 3 and 63 characters long</li>
     *      <li>Bucket names should not end with a dash</li>
     *      <li>Bucket names cannot contain adjacent periods</li>
     *      <li>Bucket names cannot contain dashes next to periods (e.g.,
     *      "my-.bucket.com" and "my.-bucket" are invalid)</li>
     *      <li>Bucket names cannot contain uppercase characters</li>
     *  </ul>
     * </p>
     * <p>
     * There are no limits to the number of objects that can be stored in a bucket.
     * Performance does not vary based on the number of buckets used. Store
     * all objects within a single bucket or organize them across several buckets.
     * </p>
     * <p>
     * Buckets cannot be nested; buckets cannot be created within
     * other buckets.
     * </p>
     * <p>
     * Do not make bucket
     * create or delete calls in the high availability code path of an
     * application. Create or delete buckets in a separate
     * initialization or setup routine that runs less often.
     * </p>
     * <p>
     * To create a bucket, authenticate with an account that has a
     * valid AWS Access Key ID and is registered with Amazon S3. Anonymous
     * requests are never allowed to create buckets.
     * </p>
     *
     * @param createBucketRequest
     *            The request object containing all options for creating an Amazon S3
     *            bucket.
     * @return The newly created bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public Bucket createBucket(CreateBucketRequest createBucketRequest)
            throws AmazonClientException, AmazonServiceException;


    /**
     * <p>
     * Creates a new Amazon S3 bucket with the specified name in the default
     * (US) region, {@link Region#US_Standard}.
     * </p>
     * <p>
     * Every object stored in Amazon S3 is contained within a bucket. Buckets
     * partition the namespace of objects stored in Amazon S3 at the top level.
     * Within a bucket, any name can be used for objects. However, bucket names
     * must be unique across all of Amazon S3.
     * </p>
     * <p>
     * Bucket ownership is similar to the ownership of Internet domain names.
     * Within Amazon S3, only a single user owns each bucket.
     * Once a uniquely named bucket is created in Amazon S3,
     * organize and name the objects within the bucket in any way.
     * Ownership of the bucket is retained as long as the owner has an Amazon S3 account.
     * </p>
     * <p>
     * To conform with DNS requirements, the following constraints apply:
     *  <ul>
     *      <li>Bucket names should not contain underscores</li>
     *      <li>Bucket names should be between 3 and 63 characters long</li>
     *      <li>Bucket names should not end with a dash</li>
     *      <li>Bucket names cannot contain adjacent periods</li>
     *      <li>Bucket names cannot contain dashes next to periods (e.g.,
     *      "my-.bucket.com" and "my.-bucket" are invalid)</li>
     *      <li>Bucket names cannot contain uppercase characters</li>
     *  </ul>
     * </p>
     * <p>
     * There are no limits to the number of objects that can be stored in a bucket.
     * Performance does not vary based on the number of buckets used. Store
     * all objects within a single bucket or organize them across several buckets.
     * </p>
     * <p>
     * Buckets cannot be nested; buckets cannot be created within
     * other buckets.
     * </p>
     * <p>
     * Do not make bucket
     * create or delete calls in the high availability code path of an
     * application. Create or delete buckets in a separate
     * initialization or setup routine that runs less often.
     * </p>
     * <p>
     * To create a bucket, authenticate with an account that has a
     * valid AWS Access Key ID and is registered with Amazon S3. Anonymous
     * requests are never allowed to create buckets.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket to create.
     *            All buckets in Amazon S3 share a single namespace;
     *            ensure the bucket is given a unique name.
     *
     * @return The newly created bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public Bucket createBucket(String bucketName)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Amazon S3 bucket with the specified name in the specified
     * Amazon S3 region.
     * </p>
     * <p>
     * Every object stored in Amazon S3 is contained within a bucket. Buckets
     * partition the namespace of objects stored in Amazon S3 at the top level.
     * Within a bucket, any name can be used for objects. However, bucket names
     * must be unique across all of Amazon S3.
     * </p>
     * <p>
     * Bucket ownership is similar to the ownership of Internet domain names.
     * Within Amazon S3, only a single user owns each bucket.
     * Once a uniquely named bucket is created in Amazon S3,
     * organize and name the objects within the bucket in any way.
     * Ownership of the bucket is retained as long as the owner has an Amazon S3 account.
     * </p>
     * <p>
     * To conform with DNS requirements, the following constraints apply:
     *  <ul>
     *      <li>Bucket names should not contain underscores</li>
     *      <li>Bucket names should be between 3 and 63 characters long</li>
     *      <li>Bucket names should not end with a dash</li>
     *      <li>Bucket names cannot contain adjacent periods</li>
     *      <li>Bucket names cannot contain dashes next to periods (e.g.,
     *      "my-.bucket.com" and "my.-bucket" are invalid)</li>
     *      <li>Bucket names cannot contain uppercase characters</li>
     *  </ul>
     * </p>
     * <p>
     * There are no limits to the number of objects that can be stored in a bucket.
     * Performance does not vary based on the number of buckets used. Store
     * all objects within a single bucket or organize them across several buckets.
     * </p>
     * <p>
     * Buckets cannot be nested; buckets cannot be created within
     * other buckets.
     * </p>
     * <p>
     * Do not make bucket
     * create or delete calls in the high availability code path of an
     * application. Create or delete buckets in a separate
     * initialization or setup routine that runs less often.
     * </p>
     * <p>
     * To create a bucket, authenticate with an account that has a
     * valid AWS Access Key ID and is registered with Amazon S3. Anonymous
     * requests are never allowed to create buckets.
     * </p>
     *
     *
     * @param bucketName
     *            The name of the bucket to create.
     * @param region
     *            The Amazon S3 region in which to create the new bucket.
     *
     * @return The newly created bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see com.amazonaws.services.s3.model.Region
     */
    public Bucket createBucket(String bucketName, Region region)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Amazon S3 bucket with the specified name in the specified
     * Amazon S3 region. This method is provided for non-standard cases;
     * use {@link #createBucket(String, Region)} and pass in a {@link Region}
     * enumeration value in standard cases.
     * </p>
     * <p>
     * Every object stored in Amazon S3 is contained within a bucket. Buckets
     * partition the namespace of objects stored in Amazon S3 at the top level.
     * Within a bucket, any name can be used for objects. However, bucket names
     * must be unique across all of Amazon S3.
     * </p>
     * <p>
     * Bucket ownership is similar to the ownership of Internet domain names.
     * Within Amazon S3, only a single user owns each bucket.
     * Once a uniquely named bucket is created in Amazon S3,
     * organize and name the objects within the bucket in any way.
     * Ownership of the bucket is retained as long as the owner has an Amazon S3 account.
     * </p>
     * <p>
     * To conform with DNS requirements, the following constraints apply:
     *  <ul>
     *      <li>Bucket names should not contain underscores</li>
     *      <li>Bucket names should be between 3 and 63 characters long</li>
     *      <li>Bucket names should not end with a dash</li>
     *      <li>Bucket names cannot contain adjacent periods</li>
     *      <li>Bucket names cannot contain dashes next to periods (e.g.,
     *      "my-.bucket.com" and "my.-bucket" are invalid)</li>
     *      <li>Bucket names cannot contain uppercase characters</li>
     *  </ul>
     * </p>
     * <p>
     * There are no limits to the number of objects that can be stored in a bucket.
     * Performance does not vary based on the number of buckets used. Store
     * all objects within a single bucket or organize them across several buckets.
     * </p>
     * <p>
     * Buckets cannot be nested; buckets cannot be created within
     * other buckets.
     * </p>
     * <p>
     * Do not make bucket
     * create or delete calls in the high availability code path of an
     * application. Create or delete buckets in a separate
     * initialization or setup routine that runs less often.
     * </p>
     * <p>
     * To create a bucket, authenticate with an account that has a
     * valid AWS Access Key ID and is registered with Amazon S3. Anonymous
     * requests are never allowed to create buckets.
     * </p>
     *
     *
     * @param bucketName
     *            The name of the bucket to create.
     * @param region
     *            The Amazon S3 region in which to create the new bucket.
     *
     * @return The newly created bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see com.amazonaws.services.s3.model.Region
     */
    public Bucket createBucket(String bucketName, String region)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the {@link AccessControlList} (ACL) for the specified object in Amazon S3.
     * </p>
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being retrieved.
     * @param key
     *            The key of the object within the specified bucket whose ACL is
     *            being retrieved.
     *
     * @return The <code>AccessControlList</code> for the specified Amazon S3 object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#getObjectAcl(String, String, String)
     */
    public AccessControlList getObjectAcl(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the {@link AccessControlList} (ACL) for the specified object
     * with the specified version in Amazon S3.
     * Each version of an object has its own associated
     * ACL.
     * </p>
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being retrieved.
     * @param key
     *            The key of the object within the specified bucket whose ACL is
     *            being retrieved.
     * @param versionId
     *            The version ID of the object version whose ACL is being
     *            retrieved.
     *
     * @return The <code>AccessControlList</code> for the specified Amazon S3 object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#getObjectAcl(String, String)
     */
    public AccessControlList getObjectAcl(String bucketName, String key, String versionId)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the {@link AccessControlList} for the specified object in Amazon S3.
     * </p>
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * </p>
     * <p>
     * When constructing a custom <code>AccessControlList</code>,
     * callers typically retrieve
     * the existing <code>AccessControlList</code> for an object (
     * {@link AmazonS3Client#getObjectAcl(String, String)}), modify it as
     * necessary, and then use this method to upload the new ACL.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being set.
     * @param key
     *            The key of the object within the specified bucket whose ACL is
     *            being set.
     * @param acl
     *            The new <code>AccessControlList</code> for the specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#setObjectAcl(String, String, CannedAccessControlList)
     * @see AmazonS3#setObjectAcl(String, String, String, AccessControlList)
     * @see AmazonS3#setObjectAcl(String, String, String, CannedAccessControlList)
     */
    public void setObjectAcl(String bucketName, String key, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the {@link CannedAccessControlList} for the specified object in
     * Amazon S3 using one
     * of the pre-configured <code>CannedAccessControlLists</code>.
     * A <code>CannedAccessControlList</code>
     * provides a quick way to configure an object or bucket with commonly used
     * access control policies.
     * </p>
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being set.
     * @param key
     *            The key of the object within the specified bucket whose ACL is
     *            being set.
     * @param acl
     *            The new pre-configured <code>CannedAccessControlList</code> for the
     *            specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#setObjectAcl(String, String, AccessControlList)
     * @see AmazonS3#setObjectAcl(String, String, String, AccessControlList)
     * @see AmazonS3#setObjectAcl(String, String, String, CannedAccessControlList)
     */
    public void setObjectAcl(String bucketName, String key, CannedAccessControlList acl)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the {@link CannedAccessControlList} for the specified object
     * with the specified version in Amazon S3.
     * Each version of an object has its own associated
     * ACL.
     * </p>
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * </p>
     * <p>
     * When constructing a custom <code>AccessControlList</code>, callers typically retrieve
     * the existing <code>AccessControlList</code> for an object (
     * {@link AmazonS3Client#getObjectAcl(String, String)}), modify it as
     * necessary, and then use this method to upload the new ACL.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being set.
     * @param key
     *            The key of the object within the specified bucket whose ACL is
     *            being set.
     * @param versionId
     *            The version ID of the object version whose ACL is being set.
     * @param acl
     *            The new <code>AccessControlList</code> for the specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#setObjectAcl(String, String, AccessControlList)
     * @see AmazonS3#setObjectAcl(String, String, CannedAccessControlList)
     * @see AmazonS3#setObjectAcl(String, String, String, CannedAccessControlList)
     */
    public void setObjectAcl(String bucketName, String key, String versionId, AccessControlList acl)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the {@link CannedAccessControlList} for the specified object with the specified
     * version ID in Amazon S3 using one of the pre-configured
     * <code>CannedAccessControlLists</code>.
     * A <code>CannedAccessControlList</code>
     * provides a quick way to configure an object or bucket with commonly used
     * access control policies.
     * </p>
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy and each version of an object has its own associated ACL.
     * When a request is made, Amazon S3 authenticates the request using its
     * standard authentication procedure and then checks the ACL to verify the
     * sender was granted access to the bucket or object. If the sender is
     * approved, the request proceeds. Otherwise, Amazon S3 returns an error.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being set.
     * @param key
     *            The key of the object within the specified bucket whose ACL is
     *            being set.
     * @param versionId
     *            The version ID of the object version whose ACL is being set.
     * @param acl
     *            The new pre-configured <code>CannedAccessControlList</code> for the
     *            specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#setObjectAcl(String, String, AccessControlList)
     * @see AmazonS3#setObjectAcl(String, String, CannedAccessControlList)
     * @see AmazonS3#setObjectAcl(String, String, String, AccessControlList)
     */
    public void setObjectAcl(String bucketName, String key, String versionId, CannedAccessControlList acl)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the {@link AccessControlList} (ACL) for the specified Amazon S3 bucket.
     * </p>
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket whose ACL is being retrieved.
     *
     * @return The <code>AccessControlList</code> for the specified S3 bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public AccessControlList getBucketAcl(String bucketName) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Sets the {@link AccessControlList} for the specified Amazon S3 bucket.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * <p>
     * When constructing a custom <code>AccessControlList</code>, callers
     * typically retrieve the existing <code>AccessControlList</code> for a
     * bucket ( {@link AmazonS3Client#getBucketAcl(String)}), modify it as
     * necessary, and then use this method to upload the new ACL.
     *
     * @param setBucketAclRequest
     *            The request object containing the bucket to modify and the ACL
     *            to set.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void setBucketAcl(SetBucketAclRequest setBucketAclRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Gets the {@link AccessControlList} (ACL) for the specified Amazon S3
     * bucket.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     *
     * @param getBucketAclRequest
     *            The request containing the name of the bucket whose ACL is
     *            being retrieved.
     *
     * @return The <code>AccessControlList</code> for the specified S3 bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public AccessControlList getBucketAcl(GetBucketAclRequest getBucketAclRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the {@link AccessControlList} for the specified Amazon S3 bucket.
     * </p>
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * </p>
     * <p>
     * When constructing a custom <code>AccessControlList</code>, callers typically retrieve
     * the existing <code>AccessControlList</code> for a bucket (
     * {@link AmazonS3Client#getBucketAcl(String)}), modify it as necessary, and
     * then use this method to upload the new ACL.
     *
     * @param bucketName
     *            The name of the bucket whose ACL is being set.
     * @param acl
     *            The new AccessControlList for the specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#setBucketAcl(String, CannedAccessControlList)
     */
    public void setBucketAcl(String bucketName, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the {@link CannedAccessControlList} for the specified Amazon S3 bucket using one of
     * the pre-configured <code>CannedAccessControlLists</code>.
     * A <code>CannedAccessControlList</code>
     * provides a quick way to configure an object or bucket with commonly used
     * access control policies.
     * </p>
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket whose ACL is being set.
     * @param acl
     *            The pre-configured <code>CannedAccessControlLists</code> to set for the
     *            specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#setBucketAcl(String, AccessControlList)
     */
    public void setBucketAcl(String bucketName, CannedAccessControlList acl)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the metadata for the specified Amazon S3 object without
     * actually fetching the object itself.
     * This is useful in obtaining only the object metadata,
     * and avoids wasting bandwidth on fetching
     * the object data.
     * </p>
     * <p>
     * The object metadata contains information such as content type, content
     * disposition, etc., as well as custom user metadata that can be associated
     * with an object in Amazon S3.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the object's whose metadata
     *            is being retrieved.
     * @param key
     *            The key of the object whose metadata is being retrieved.
     *
     * @return All Amazon S3 object metadata for the specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#getObjectMetadata(GetObjectMetadataRequest)
     */
    public ObjectMetadata getObjectMetadata(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the metadata for the specified Amazon S3 object without
     * actually fetching the object itself.
     * This is useful in obtaining only the object metadata,
     * and avoids wasting bandwidth on fetching
     * the object data.
     * </p>
     * <p>
     * The object metadata contains information such as content type, content
     * disposition, etc., as well as custom user metadata that can be associated
     * with an object in Amazon S3.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     *
     * @param getObjectMetadataRequest
     *            The request object specifying the bucket, key and optional
     *            version ID of the object whose metadata is being retrieved.
     *
     * @return All S3 object metadata for the specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#getObjectMetadata(String, String)
     */
    public ObjectMetadata getObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the object stored in Amazon S3 under the specified bucket and
     * key.
     * </p>
     * <p>
     * Be extremely careful when using this method; the returned
     * Amazon S3 object contains a direct stream of data from the HTTP connection.
     * The underlying HTTP connection cannot be closed until the user
     * finishes reading the data and closes the stream.
     * Therefore:
     * </p>
     * <ul>
     *  <li>Use the data from the input stream in Amazon S3 object as soon as possible</li>
     *  <li>Close the input stream in Amazon S3 object as soon as possible</li>
     * </ul>
     * If these rules are not followed, the client can run out of
     * resources by allocating too many open, but unused, HTTP connections.
     * </p>
     * <p>
     * To get an object from Amazon S3, the caller must have {@link Permission#Read}
     * access to the object.
     * </p>
     * <p>
     * If the object fetched is publicly readable, it can also read it
     * by pasting its URL into a browser.
     * </p>
     * <p>
     * For more advanced options (such as downloading only a range of an
     * object's content, or placing constraints on when the object should be downloaded)
     * callers can use {@link #getObject(GetObjectRequest)}.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the desired object.
     * @param key
     *            The key under which the desired object is stored.
     *
     * @return The object stored in Amazon S3 in the specified bucket and key.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#getObject(GetObjectRequest)
     * @see AmazonS3#getObject(GetObjectRequest, File)
     */
    public S3Object getObject(String bucketName, String key) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the object stored in Amazon S3 under the specified bucket and
     * key.
     * Returns <code>null</code> if the specified constraints weren't met.
     * </p>
     * <p>
     * Callers should be very careful when using this method; the returned
     * Amazon S3 object contains a direct stream of data from the HTTP connection.
     * The underlying HTTP connection cannot be closed until the user
     * finishes reading the data and closes the stream. Callers should
     * therefore:
     * </p>
     * <ul>
     *  <li>Use the data from the input stream in Amazon S3 object as soon as possible,</li>
     *  <li>Close the input stream in Amazon S3 object as soon as possible.</li>
     * </ul>
     * <p>
     * If callers do not follow those rules, then the client can run out of
     * resources if allocating too many open, but unused, HTTP connections.
     * </p>
     * <p>
     * To get an object from Amazon S3, the caller must have {@link Permission#Read}
     * access to the object.
     * </p>
     * <p>
     * If the object fetched is publicly readable, it can also read it
     * by pasting its URL into a browser.
     * </p>
     * <p>
     * When specifying constraints in the request object, the client needs to be
     * prepared to handle this method returning <code>null</code>
     * if the provided constraints aren't met when Amazon S3 receives the request.
     * </p>
     * <p>
     * If the advanced options provided in {@link GetObjectRequest} aren't needed,
     * use the simpler {@link AmazonS3#getObject(String bucketName, String key)} method.
     * </p>
     *
     * @param getObjectRequest
     *            The request object containing all the options on how to
     *            download the object.
     *
     * @return The object stored in Amazon S3 in the specified bucket and key.
     *         Returns <code>null</code> if constraints were specified but not met.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     * @see AmazonS3#getObject(String, String)
     * @see AmazonS3#getObject(GetObjectRequest, File)
     */
    public S3Object getObject(GetObjectRequest getObjectRequest)
            throws AmazonClientException, AmazonServiceException;


    /**
     * <p>
     * Gets the object metadata for the object stored
     * in Amazon S3 under the specified bucket and key,
     * and saves the object contents to the
     * specified file.
     * Returns <code>null</code> if the specified constraints weren't met.
     * </p>
     * <p>
     * Instead of
     * using {@link AmazonS3#getObject(GetObjectRequest)},
     * use this method to ensure that the underlying
     * HTTP stream resources are automatically closed as soon as possible.
     * The Amazon S3 clients handles immediate storage of the object
     * contents to the specified file.
     * </p>
     * <p>
     * To get an object from Amazon S3, the caller must have {@link Permission#Read}
     * access to the object.
     * </p>
     * <p>
     * If the object fetched is publicly readable, it can also read it
     * by pasting its URL into a browser.
     * </p>
     * <p>
     * When specifying constraints in the request object, the client needs to be
     * prepared to handle this method returning <code>null</code>
     * if the provided constraints aren't met when Amazon S3 receives the request.
     * </p>
     *
     * @param getObjectRequest
     *            The request object containing all the options on how to
     *            download the Amazon S3 object content.
     * @param destinationFile
     *            Indicates the file (which might already exist) where
     *            to save the object content being downloading from Amazon S3.
     *
     * @return All S3 object metadata for the specified object.
     *         Returns <code>null</code> if constraints were specified but not met.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request, handling the response, or writing the incoming data
     *             from S3 to the specified destination file.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#getObject(String, String)
     * @see AmazonS3#getObject(GetObjectRequest)
     */
    public ObjectMetadata getObject(GetObjectRequest getObjectRequest, File destinationFile)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified bucket. All objects (and all object versions, if versioning
     * was ever enabled) in the bucket must be deleted before the bucket itself
     * can be deleted.
     * </p>
     * <p>
     * Only the owner of a bucket can delete it, regardless of the bucket's
     * access control policy (ACL).
     * </p>
     *
     * @param deleteBucketRequest
     *            The request object containing all options for deleting an Amazon S3
     *            bucket.
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#deleteBucket(String)
     */
    public void deleteBucket(DeleteBucketRequest deleteBucketRequest)
            throws AmazonClientException, AmazonServiceException;


    /**
     * <p>
     * Deletes the specified bucket. All objects (and all object versions, if versioning
     * was ever enabled) in the bucket must be deleted before the bucket itself
     * can be deleted.
     * </p>
     * <p>
     * Only the owner of a bucket can delete it, regardless of the bucket's
     * access control policy.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket to delete.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#deleteBucket(String)
     */
    public void deleteBucket(String bucketName)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads a new object to the specified Amazon S3 bucket.
     * The <code>PutObjectRequest</code> contains all the
     * details of the request, including the bucket to upload to, the key the
     * object will be uploaded under, and the file or input stream containing the data
     * to upload.
     * </p>
     * <p>
     * Amazon S3 never stores partial objects; if during this call
     * an exception wasn't thrown, the entire object was stored.
     * </p>
     * <p>
     * Depending on whether a file or input stream is being uploaded, this
     * method has slightly different behavior.
     * </p>
     * <p>
     * When uploading a file:
     * </p>
     * <ul>
     *  <li>
     *  The client automatically computes
     *  a checksum of the file.
     *  Amazon S3 uses checksums to validate the data in each file.
     *  </li>
     *  <li>
     *  Using the file extension, Amazon S3 attempts to determine
     *  the correct content type and content disposition to use
     *  for the object.
     *  </li>
     * </ul>
     * <p>
     * When uploading directly from an input stream:
     * </p>
     * <ul>
     *  <li>Be careful to set the
     *  correct content type in the metadata object before directly sending a
     *  stream. Unlike file uploads, content types from input streams
     *  cannot be automatically determined.  If the caller doesn't explicitly set
     *  the content type, it will not be set in Amazon S3.
     *  </li>
     *  <li>Content length <b>must</b> be specified before data can be uploaded
     *  to Amazon S3. Amazon S3 explicitly requires that the
     *  content length be sent in the request headers before it
     *  will accept any of the data. If the caller doesn't provide
     *  the length, the library must buffer the contents of the
     *  input stream in order to calculate it.
     * </ul>
     * <p>
     * If versioning is enabled for the specified bucket,
     * this operation will never overwrite an existing object
     * with the same key, but will keep the existing object as
     * an older version
     * until that version is
     * explicitly deleted (see
     * {@link AmazonS3#deleteVersion(String, String, String)}.
     * </p>

     * <p>
     * If versioning is not enabled, this operation will overwrite an existing object
     * with the same key; Amazon S3 will store the last write request.
     * Amazon S3 does not provide object locking.
     * If Amazon S3 receives multiple write requests for the same object nearly
     * simultaneously, all of the objects might be stored.  However, a single
     * object will be stored with the final write request.
     * </p>

     * <p>
     * When specifying a location constraint when creating a bucket, all objects
     * added to the bucket are stored in the bucket's region. For example, if
     * specifying a Europe (EU) region constraint for a bucket, all of that
     * bucket's objects are stored in the EU region.
     * </p>
     * <p>
     * The specified bucket must already exist and the caller must have
     * {@link Permission#Write} permission to the bucket to upload an object.
     * </p>
     *
     * @param putObjectRequest
     *            The request object containing all the parameters to upload a
     *            new object to Amazon S3.
     *
     * @return A {@link PutObjectResult} object containing the information
     *         returned by Amazon S3 for the newly created object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#putObject(String, String, File)
     * @see AmazonS3#putObject(String, String, InputStream, ObjectMetadata)
     */
    public PutObjectResult putObject(PutObjectRequest putObjectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads the specified file to Amazon S3 under the specified bucket and
     * key name.
     * </p>
     * <p>
     * Amazon S3 never stores partial objects;
     * if during this call an exception wasn't thrown,
     * the entire object was stored.
     * </p>
     * <p>
     * The client automatically computes
     * a checksum of the file.
     * Amazon S3 uses checksums to validate the data in each file.
     * </p>
     * <p>
     *  Using the file extension, Amazon S3 attempts to determine
     *  the correct content type and content disposition to use
     *  for the object.
     * </p>
     * <p>
     * If versioning is enabled for the specified bucket,
     * this operation will
     * this operation will never overwrite an existing object
     * with the same key, but will keep the existing object as an
     * older version
     * until that version is
     * explicitly deleted (see
     * {@link AmazonS3#deleteVersion(String, String, String)}.
     * </p>
     * <p>
     * If versioning is not enabled, this operation will overwrite an existing object
     * with the same key; Amazon S3 will store the last write request.
     * Amazon S3 does not provide object locking.
     * If Amazon S3 receives multiple write requests for the same object nearly
     * simultaneously, all of the objects might be stored.  However, a single
     * object will be stored with the final write request.
     * </p>

     * <p>
     * When specifying a location constraint when creating a bucket, all objects
     * added to the bucket are stored in the bucket's region. For example, if
     * specifying a Europe (EU) region constraint for a bucket, all of that
     * bucket's objects are stored in EU region.
     * </p>
     * <p>
     * The specified bucket must already exist and the caller must have
     * {@link Permission#Write} permission to the bucket to upload an object.
     * </p>
     *
     * @param bucketName
     *            The name of an existing bucket, to which you have
     *            {@link Permission#Write} permission.
     * @param key
     *            The key under which to store the specified file.
     * @param file
     *            The file containing the data to be uploaded to Amazon S3.
     *
     * @return A {@link PutObjectResult} object containing the information
     *         returned by Amazon S3 for the newly created object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#putObject(PutObjectRequest)
     * @see AmazonS3#putObject(String, String, InputStream, ObjectMetadata)
     */
    public PutObjectResult putObject(String bucketName, String key, File file)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads the specified input stream and object metadata to Amazon S3 under
     * the specified bucket and key name.
     * </p>
     * <p>
     * Amazon S3 never stores partial objects;
     * if during this call an exception wasn't thrown,
     * the entire object was stored.
     * </p>
     * <p>
     * The client automatically computes
     * a checksum of the file. This checksum is verified against another checksum
     * that is calculated once the data reaches Amazon S3, ensuring the data
     * has not corrupted in transit over the network.
     * </p>
     * <p>
     * Using the file extension, Amazon S3 attempts to determine
     * the correct content type and content disposition to use
     * for the object.
     * </p>
     * <p>
     * Content length <b>must</b> be specified before data can be uploaded to
     * Amazon S3. If the caller doesn't provide it, the library will <b>have
     * to</b> buffer the contents of the input stream in order to calculate it
     * because Amazon S3 explicitly requires that the content length be sent in
     * the request headers before any of the data is sent.
     * </p>
     * <p>
     * If versioning is enabled for the specified bucket, this operation will
     * never overwrite an existing object at the same key, but instead will keep
     * the existing object around as an older version until that version is
     * explicitly deleted (see
     * {@link AmazonS3#deleteVersion(String, String, String)}.
     * </p>

     * <p>
     * If versioning is not enabled,
     * this operation will overwrite an existing object
     * with the same key; Amazon S3 will store the last write request.
     * Amazon S3 does not provide object locking.
     * If Amazon S3 receives multiple write requests for the same object nearly
     * simultaneously, all of the objects might be stored.  However, a single
     * object will be stored with the final write request.
     * </p>

     * <p>
     * When specifying a location constraint when creating a bucket, all objects
     * added to the bucket are stored in the bucket's region. For example, if
     * specifying a Europe (EU) region constraint for a bucket, all of that
     * bucket's objects are stored in EU region.
     * </p>
     * <p>
     * The specified bucket must already exist and the caller must have
     * {@link Permission#Write} permission to the bucket to upload an object.
     * </p>
     *
     * @param bucketName
     *            The name of an existing bucket, to which you have
     *            {@link Permission#Write} permission.
     * @param key
     *            The key under which to store the specified file.
     * @param input
     *            The input stream containing the data to be uploaded to Amazon
     *            S3.
     * @param metadata
     *            Additional metadata instructing Amazon S3 how to handle the
     *            uploaded data (e.g. custom user metadata, hooks for specifying
     *            content type, etc.).
     *
     * @return A {@link PutObjectResult} object containing the information
     *         returned by Amazon S3 for the newly created object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#putObject(String, String, File)
     * @see AmazonS3#putObject(PutObjectRequest)
     */
    public PutObjectResult putObject(
            String bucketName, String key, InputStream input, ObjectMetadata metadata)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Copies a source object to a new destination in Amazon S3.
     * </p>
     * <p>
     * By default, all object metadata for the source object are copied to
     * the new destination object. The Amazon S3 <code>AcccessControlList</code> (ACL)
     * is <b>not</b> copied to the new
     * object; the new object will have the default Amazon S3 ACL,
     * {@link CannedAccessControlList#Private}.
     * </p>
     * <p>
     * To copy an object, the caller's account must have read access to the source object and
     * write access to the destination bucket
     * </p>
     * <p>
     * This method only exposes the basic options for copying an Amazon S3
     * object. Additional options are available by calling the
     * {@link AmazonS3Client#copyObject(CopyObjectRequest)} method, including
     * conditional constraints for copying objects, setting ACLs, overwriting
     * object metadata, etc.
     * </p>
     *
     * @param sourceBucketName
     *            The name of the bucket containing the source object to copy.
     * @param sourceKey
     *            The key in the source bucket under which the source object is stored.
     * @param destinationBucketName
     *            The name of the bucket in which the new object will be
     *            created. This can be the same name as the source bucket's.
     * @param destinationKey
     *            The key in the destination bucket under which the new object
     *            will be created.
     *
     * @return A {@link CopyObjectResult} object containing the information
     *         returned by Amazon S3 for the newly created object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#copyObject(CopyObjectRequest)
     */
    public CopyObjectResult copyObject(String sourceBucketName, String sourceKey,
            String destinationBucketName, String destinationKey) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Copies a source object to a new destination in Amazon S3.
     * </p>
     * <p>
     * By default, all object metadata for the source object are copied to
     * the new destination object, unless new object metadata in the
     * specified {@link CopyObjectRequest} is provided.
     * </p>
     * <p>
     * The Amazon S3 Acccess Control List (ACL)
     * is <b>not</b> copied to the new object. The new object will have
     * the default Amazon S3 ACL, {@link CannedAccessControlList#Private},
     * unless one is explicitly provided in the specified
     * {@link CopyObjectRequest}.
     * </p>
     * <p>
     * To copy an object, the caller's account must have read access to the source object and
     * write access to the destination bucket.
     * </p>
     * <p>
     * If constraints are specified in the <code>CopyObjectRequest</code>
     * (e.g.
     * {@link CopyObjectRequest#setMatchingETagConstraints(List)})
     * and are not satisfied when Amazon S3 receives the
     * request, this method returns <code>null</code>.
     * This method returns a non-null result under all other
     * circumstances.
     * </p>
     * <p>
     * This method exposes all the advanced options for copying an Amazon S3
     * object. For simple needs, use the
     * {@link AmazonS3Client#copyObject(String, String, String, String)}
     * method.
     * </p>
     *
     * @param copyObjectRequest
     *            The request object containing all the options for copying an
     *            Amazon S3 object.
     *
     * @return A {@link CopyObjectResult} object containing the information
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
     * @see AmazonS3Client#copyObject(String, String, String, String)
     */
    public CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @see AmazonS3Client#copyObject(CopyObjectRequest)
     * @see AmazonS3Client#initiateMultipartUpload(InitiateMultipartUploadRequest)
     */
    public CopyPartResult copyPart(CopyPartRequest copyPartRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified object in the specified bucket. Once deleted, the object
     * can only be restored if versioning was enabled when the object was deleted.
     * </p>
     * <p>
     * If attempting to delete an object that does not exist,
     * Amazon S3 returns
     * a success message instead of an error message.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object to
     *            delete.
     * @param key
     *            The key of the object to delete.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#deleteObject(DeleteObjectRequest)
     */
    public void deleteObject(String bucketName, String key)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified object in the specified bucket. Once deleted, the
     * object can only be restored if versioning was enabled when the object was
     * deleted.
     * </p>
     * <p>
     * If attempting to delete an object that does not exist,
     * Amazon S3 will return
     * a success message instead of an error message.
     * </p>
     *
     * @param deleteObjectRequest
     *            The request object containing all options for deleting an Amazon S3
     *            object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#deleteObject(String, String)
     */
    public void deleteObject(DeleteObjectRequest deleteObjectRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Deletes multiple objects in a single bucket from S3.
     * <p>
     * In some cases, some objects will be successfully deleted, while some
     * attempts will cause an error. If any object in the request cannot be
     * deleted, this method throws a {@link MultiObjectDeleteException} with
     * details of the error.
     * 
     * @param deleteObjectsRequest
     *            The request object containing all options for deleting
     *            multiple objects.
     * @throws MultiObjectDeleteException
     *             if one or more of the objects couldn't be deleted.
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public DeleteObjectsResult deleteObjects(DeleteObjectsRequest deleteObjectsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a specific version of the specified object in the specified
     * bucket. Once deleted, there is no method to restore or undelete an object
     * version. This is the only way to permanently delete object versions that
     * are protected by versioning.
     * </p>
     * <p>
     * Deleting an object version is permanent and irreversible.
     * It is a
     * privileged operation that only the owner of the bucket containing the
     * version can perform.
     * </p>
     * <p>
     * Users can only delete a version of an object if versioning is enabled
     * for the bucket.
     * For more information about enabling versioning for a bucket, see
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     * <p>
     * If attempting to delete an object that does not exist,
     * Amazon S3 will return
     * a success message instead of an error message.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket containing the object to
     *            delete.
     * @param key
     *            The key of the object to delete.
     * @param versionId
     *            The version of the object to delete.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void deleteVersion(String bucketName, String key, String versionId)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specific version of an object in the specified bucket. Once
     * deleted, there is no method to restore or undelete an object version.
     * This is the only way to permanently delete object versions that are
     * protected by versioning.
     * </p>
     * <p>
     * Deleting an object version is permanent and irreversible.
     * It is a
     * privileged operation that only the owner of the bucket containing the
     * version can perform.
     * </p>
     * <p>
     * Users can only delete a version of an object if versioning is enabled
     * for the bucket.
     * For more information about enabling versioning for a bucket, see
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}.
     * </p>
     * <p>
     * If attempting to delete an object that does not exist,
     * Amazon S3 will return
     * a success message instead of an error message.
     * </p>
     *
     * @param deleteVersionRequest
     *            The request object containing all options for deleting a
     *            specific version of an Amazon S3 object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void deleteVersion(DeleteVersionRequest deleteVersionRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the logging configuration for the specified bucket.
     * The bucket
     * logging configuration object indicates if server access logging is
     * enabled the specified bucket, the destination bucket
     * where server access logs are delivered, and the optional log file prefix.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket whose bucket logging configuration is
     *            being retrieved.
     *
     * @return The bucket logging configuration for the specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#setBucketLoggingConfiguration(SetBucketLoggingConfigurationRequest)
     */
    public BucketLoggingConfiguration getBucketLoggingConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the logging configuration for the specified bucket.
     * The bucket
     * logging configuration object indicates whether server access logging is
     * enabled or not for the specified bucket, the destination bucket
     * where server access logs are delivered, and the optional log file prefix.
     * </p>
     * <p>
     * In order to deliver server access logs, the destination bucket must have
     * log delivery write permissions. You can use the
     * {@link CannedAccessControlList#LogDeliveryWrite} ACL to quickly add the
     * correct permissions to your destination bucket, or you can modify the
     * bucket's existing ACL to grant the {@link GroupGrantee#LogDelivery} group
     * grantee the {@link Permission#Write} permission.
     * </p>
     * <p>
     * Changes to the logging status for a bucket are visible in the
     * configuration API immediately, but they take time to actually affect the
     * delivery of log files. For example, if logging is enabled for a bucket,
     * some requests made in the following hour might be logged, while others
     * might not. Or, if you change the target bucket for logging from bucket A
     * to bucket B, some logs for the next hour might continue to be delivered
     * to bucket A, while others might be delivered to the new target bucket B.
     * In all cases, the new settings will eventually take effect without any
     * further action on your part.
     * </p>
     *
     * @param setBucketLoggingConfigurationRequest
     *            The request object containing all options for setting the
     *            bucket logging configuration.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#getBucketLoggingConfiguration(String)
     */
    public void setBucketLoggingConfiguration(SetBucketLoggingConfigurationRequest setBucketLoggingConfigurationRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the versioning configuration for the specified bucket.
     * </p>
     * <p>
     * A bucket's versioning configuration can be in one of three possible
     * states:
     *  <ul>
     *      <li>{@link BucketVersioningConfiguration#OFF}
     *      <li>{@link BucketVersioningConfiguration#ENABLED}
     *      <li>{@link BucketVersioningConfiguration#SUSPENDED}
     *  </ul>
     * </p>
     * <p>
     * By default, new buckets are in the
     * {@link BucketVersioningConfiguration#OFF off} state. Once versioning is
     * enabled for a bucket the status can never be reverted to
     * {@link BucketVersioningConfiguration#OFF off}.
     * </p>
     * <p>
     * The versioning configuration of a bucket has different implications for
     * each operation performed on that bucket or for objects within that
     * bucket. For example, when versioning is enabled a <code>PutObject</code>
     * operation creates a unique object version-id for the object being uploaded. The
     * The <code>PutObject</code> API guarantees that, if versioning is enabled for a bucket at
     * the time of the request, the new object can only be permanently deleted
     * using a <code>DeleteVersion</code> operation. It can never be overwritten.
     * Additionally, the <code>PutObject</code> API guarantees that,
     * if versioning is enabled for a bucket the request,
     * no other object will be overwritten by that request.
     * Refer to the documentation sections for each API for information on how
     * versioning status affects the semantics of that particular API.
     * </p>
     * <p>
     * Amazon S3 is eventually consistent. It can take time for the versioning status
     * of a bucket to be propagated throughout the system.
     * </p>
     *
     * @param bucketName
     *            The bucket whose versioning configuration will be retrieved.
     *
     * @return The bucket versioning configuration for the specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)
     */
    public BucketVersioningConfiguration getBucketVersioningConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the versioning configuration for the specified bucket.
     * </p>
     * <p>
     * A bucket's versioning configuration can be in one of three possible
     * states:
     *  <ul>
     *      <li>{@link BucketVersioningConfiguration#OFF}
     *      <li>{@link BucketVersioningConfiguration#ENABLED}
     *      <li>{@link BucketVersioningConfiguration#SUSPENDED}
     *  </ul>
     * </p>
     * <p>
     * By default, new buckets are in the
     * {@link BucketVersioningConfiguration#OFF off} state. Once versioning is
     * enabled for a bucket the status can never be reverted to
     * {@link BucketVersioningConfiguration#OFF off}.
     * </p>
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended will be given the default <code>null</code> version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * <code>null</code> version ID is a valid version ID and is not the
     * same as not having a version ID.
     * </p>
     * <p>
     * The versioning configuration of a bucket has different implications for
     * each operation performed on that bucket or for objects within that
     * bucket. For example, when versioning is enabled a <code>PutObject</code>
     * operation creates a unique object version-id for the object being uploaded. The
     * The <code>PutObject</code> API guarantees that, if versioning is enabled for a bucket at
     * the time of the request, the new object can only be permanently deleted
     * using a <code>DeleteVersion</code> operation. It can never be overwritten.
     * Additionally, the <code>PutObject</code> API guarantees that,
     * if versioning is enabled for a bucket the request,
     * no other object will be overwritten by that request.
     * Refer to the documentation sections for each API for information on how
     * versioning status affects the semantics of that particular API.
     * </p>
     * <p>
     * Amazon S3 is eventually consistent. It can take time for the versioning status
     * of a bucket to be propagated throughout the system.
     * </p>
     *
     * @param setBucketVersioningConfigurationRequest
     *            The request object containing all options for setting the
     *            bucket versioning configuration.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#getBucketVersioningConfiguration(String)
     */
    public void setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest setBucketVersioningConfigurationRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Gets the lifecycle configuration for the specified bucket, or null if no
     * configuration has been established.
     * 
     * @param bucketName
     *            The name of the bucket for which to retrieve lifecycle
     *            configuration.
     */
    public BucketLifecycleConfiguration getBucketLifecycleConfiguration(String bucketName);

    /**
     * Sets the lifecycle configuration for the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket for which to set the lifecycle
     *            configuration.
     * @param bucketLifecycleConfiguration
     *            The new lifecycle configuration for this bucket, which
     *            completely replaces any existing configuration.
     */
    public void setBucketLifecycleConfiguration(String bucketName, BucketLifecycleConfiguration bucketLifecycleConfiguration);

    /**
     * Removes the lifecycle configuration for the bucket specified.
     * 
     * @param bucketName
     *            The name of the bucket for which to remove the lifecycle
     *            configuration.
     */
    public void deleteBucketLifecycleConfiguration(String bucketName);
    
    /**
     * Gets the cross origin configuration for the specified bucket, or null if no
     * configuration has been established.
     * 
     * @param bucketName
     *            The name of the bucket for which to retrieve cross origin
     *            configuration.
     */
    public BucketCrossOriginConfiguration getBucketCrossOriginConfiguration(String bucketName);
    
    /**
     * Sets the cross origin configuration for the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket for which to retrieve cross origin
     *            configuration.
     * @param bucketCrossOriginConfiguration    
     * 			  The new cross origin configuration for this bucket, which
     *            completely replaces any existing configuration.
     */
    public void setBucketCrossOriginConfiguration(String bucketName, BucketCrossOriginConfiguration bucketCrossOriginConfiguration);
    
    /**
     * Delete the cross origin configuration for the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket for which to retrieve cross origin
     *            configuration.
     */
    public void deleteBucketCrossOriginConfiguration(String bucketName);
    
    /**
     * Gets the tagging configuration for the specified bucket, or null if no
     * configuration has been established.
     * 
     * @param bucketName
     *            The name of the bucket for which to retrieve tagging
     *            configuration.
     */
    public BucketTaggingConfiguration getBucketTaggingConfiguration(String bucketName);

    /**
     * Sets the tagging configuration for the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket for which to set the tagging
     *            configuration.
     * @param bucketTaggingConfiguration
     *            The new tagging configuration for this bucket, which
     *            completely replaces any existing configuration.
     */
    public void setBucketTaggingConfiguration(String bucketName, BucketTaggingConfiguration bucketTaggingConfiguration);

    /**
     * Removes the Tagging configuration for the bucket specified.
     * 
     * @param bucketName
     *            The name of the bucket for which to remove the tagging
     *            configuration.
     */
    public void deleteBucketTaggingConfiguration(String bucketName);
    
    /**
     * Gets the notification configuration for the specified bucket.
     * <p>
     * By default, new buckets have no notification configuration.
     * <p>
     * The notification configuration of a bucket provides near realtime notifications
     * of events the user is interested in, using SNS as the delivery service.
     * Notification is turned on by enabling configuration on a bucket, specifying
     * the events and the SNS topic. This configuration can only be turned
     * on by the bucket owner. If a notification configuration already exists for the
     * specified bucket, the new notification configuration will replace the existing
     * notification configuration.  To remove the notification configuration pass in
     * an empty request.  Currently, buckets may only have a single event and topic
     * configuration.
     * <p>
     * S3 is eventually consistent. It may take time for the notification status
     * of a bucket to be propagated throughout the system.
     *
     * @param bucketName
     *            The bucket whose notification configuration will be retrieved.
     *
     * @return The bucket notification configuration for the specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public BucketNotificationConfiguration getBucketNotificationConfiguration(String bucketName)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Sets the notification configuration for the specified bucket.
     * <p>
     * By default, new buckets have no notification configuration set.
     * <p>
     * The notification configuration of a bucket provides near realtime notifications
     * of events the user is interested in, using SNS as the delivery service.
     * Notification is turned on by enabling configuration on a bucket, specifying
     * the events and the SNS topic. This configuration can only be turned
     * on by the bucket owner. If a notification configuration already exists for the
     * specified bucket, the new notification configuration will replace the existing
     * notification configuration.  To remove the notification configuration pass in
     * an empty request.  Currently, buckets may only have a single event and topic
     * configuration.
     * <p>
     * S3 is eventually consistent. It may take time for the notification status
     * of a bucket to be propagated throughout the system.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose notification configuration is being set.
     *
     * @param bucketNotificationConfiguration
     *            The request object containing all options for setting the
     *            bucket notification configuration.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void setBucketNotificationConfiguration(String bucketName, BucketNotificationConfiguration bucketNotificationConfiguration)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Returns the website configuration for the specified bucket. Bucket
     * website configuration allows you to host your static websites entirely
     * out of Amazon S3. To host your website in Amazon S3, create a bucket,
     * upload your files, and configure it as a website. Once your bucket has
     * been configured as a website, you can access all your content via the
     * Amazon S3 website endpoint. To ensure that the existing Amazon S3 REST
     * API will continue to behave the same, regardless of whether or not your
     * bucket has been configured to host a website, a new HTTP endpoint has
     * been introduced where you can access your content. The bucket content you
     * want to make available via the website must be publicly readable.
     * <p>
     * For more information on how to host a website on Amazon S3, see:
     * <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html">http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html</a>.
     * <p>
     * This operation requires the <code>S3:GetBucketWebsite</code> permission.
     * By default, only the bucket owner can read the bucket website
     * configuration. However, bucket owners can allow other users to read the
     * website configuration by writing a bucket policy granting them the
     * <code>S3:GetBucketWebsite</code> permission.
     *
     * @param bucketName
     *            The name of the bucket whose website configuration is being
     *            retrieved.
     *
     * @return The bucket website configuration for the specified bucket,
     *         otherwise null if there is no website configuration set for the
     *         specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(String bucketName)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Returns the website configuration for the specified bucket. Bucket
     * website configuration allows you to host your static websites entirely
     * out of Amazon S3. To host your website in Amazon S3, create a bucket,
     * upload your files, and configure it as a website. Once your bucket has
     * been configured as a website, you can access all your content via the
     * Amazon S3 website endpoint. To ensure that the existing Amazon S3 REST
     * API will continue to behave the same, regardless of whether or not your
     * bucket has been configured to host a website, a new HTTP endpoint has
     * been introduced where you can access your content. The bucket content you
     * want to make available via the website must be publicly readable.
     * <p>
     * For more information on how to host a website on Amazon S3, see: <a href=
     * "http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.
     * html</a>.
     * <p>
     * This operation requires the <code>S3:GetBucketWebsite</code> permission.
     * By default, only the bucket owner can read the bucket website
     * configuration. However, bucket owners can allow other users to read the
     * website configuration by writing a bucket policy granting them the
     * <code>S3:GetBucketWebsite</code> permission.
     *
     * @param getBucketWebsiteConfigurationRequest
     *            The request object containing all the information on the
     *            specific bucket whose website configuration is to be
     *            retrieved.
     *
     * @return The bucket website configuration for the specified bucket,
     *         otherwise null if there is no website configuration set for the
     *         specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(GetBucketWebsiteConfigurationRequest getBucketWebsiteConfigurationRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Sets the website configuration for the specified bucket. Bucket
     * website configuration allows you to host your static websites entirely
     * out of Amazon S3. To host your website in Amazon S3, create a bucket,
     * upload your files, and configure it as a website. Once your bucket has
     * been configured as a website, you can access all your content via the
     * Amazon S3 website endpoint. To ensure that the existing Amazon S3 REST
     * API will continue to behave the same, regardless of whether or not your
     * bucket has been configured to host a website, a new HTTP endpoint has
     * been introduced where you can access your content. The bucket content you
     * want to make available via the website must be publicly readable.
     * <p>
     * For more information on how to host a website on Amazon S3, see:
     * <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html">http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html</a>.
     * <p>
     * This operation requires the <code>S3:PutBucketWebsite</code> permission.
     * By default, only the bucket owner can configure the website attached to a
     * bucket. However, bucket owners can allow other users to set the website
     * configuration by writing a bucket policy granting them the
     * <code>S3:PutBucketWebsite</code> permission.
     *
     * @param bucketName
     *            The name of the bucket whose website configuration is being
     *            set.
     * @param configuration
     *            The configuration describing how the specified bucket will
     *            serve web requests (i.e. default index page, error page).
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void setBucketWebsiteConfiguration(String bucketName, BucketWebsiteConfiguration configuration)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Sets the website configuration for the specified bucket. Bucket website
     * configuration allows you to host your static websites entirely out of
     * Amazon S3. To host your website in Amazon S3, create a bucket, upload
     * your files, and configure it as a website. Once your bucket has been
     * configured as a website, you can access all your content via the Amazon
     * S3 website endpoint. To ensure that the existing Amazon S3 REST API will
     * continue to behave the same, regardless of whether or not your bucket has
     * been configured to host a website, a new HTTP endpoint has been
     * introduced where you can access your content. The bucket content you want
     * to make available via the website must be publicly readable.
     * <p>
     * For more information on how to host a website on Amazon S3, see: <a href=
     * "http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.
     * html</a>.
     * <p>
     * This operation requires the <code>S3:PutBucketWebsite</code> permission.
     * By default, only the bucket owner can configure the website attached to a
     * bucket. However, bucket owners can allow other users to set the website
     * configuration by writing a bucket policy granting them the
     * <code>S3:PutBucketWebsite</code> permission.
     *
     * @param setBucketWebsiteConfigurationRequest
     *            The request object containing the name of the bucket whose
     *            website configuration is being updated, and the new website
     *            configuration values.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void setBucketWebsiteConfiguration(SetBucketWebsiteConfigurationRequest setBucketWebsiteConfigurationRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * This operation removes the website configuration for a bucket. Calling
     * this operation on a bucket with no website configuration does <b>not</b>
     * throw an exception. Calling this operation a bucket that does not exist
     * <b>will</b> throw an exception.
     * <p>
     * For more information on how to host a website on Amazon S3, see:
     * <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html">http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html</a>.
     * <p>
     * This operation requires the <code>S3:DeleteBucketWebsite</code>
     * permission. By default, only the bucket owner can delete the website
     * configuration attached to a bucket. However, bucket owners can grant
     * other users permission to delete the website configuration by writing a
     * bucket policy granting them the <code>S3:DeleteBucketWebsite</code>
     * permission.
     *
     * @param bucketName
     *            The name of the bucket whose website configuration is being
     *            deleted.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void deleteBucketWebsiteConfiguration(String bucketName)
        throws AmazonClientException, AmazonServiceException;

    /**
     * This operation removes the website configuration for a bucket. Calling
     * this operation on a bucket with no website configuration does <b>not</b>
     * throw an exception. Calling this operation a bucket that does not exist
     * <b>will</b> throw an exception.
     * <p>
     * For more information on how to host a website on Amazon S3, see: <a href=
     * "http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.
     * html</a>.
     * <p>
     * This operation requires the <code>S3:DeleteBucketWebsite</code>
     * permission. By default, only the bucket owner can delete the website
     * configuration attached to a bucket. However, bucket owners can grant
     * other users permission to delete the website configuration by writing a
     * bucket policy granting them the <code>S3:DeleteBucketWebsite</code>
     * permission.
     *
     * @param deleteBucketWebsiteConfigurationRequest
     *            The request object specifying the name of the bucket whose
     *            website configuration is to be deleted.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void deleteBucketWebsiteConfiguration(DeleteBucketWebsiteConfigurationRequest deleteBucketWebsiteConfigurationRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the policy for the specified bucket. Only the owner of the
     * bucket can retrieve the policy. If no policy has been set for the bucket,
     * then an empty result object with a <code>null</code> policy text field will be
     * returned.
     * </p>
     * <p>
     * Bucket policies provide access control management at the bucket level for
     * both the bucket resource and contained object resources. Only one policy
     * can be specified per-bucket.
     * </p>
     * <p>
     * See the <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/">
     * Amazon S3 developer guide</a> for more information on forming bucket
     * polices.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose policy is being
     *            retrieved.
     *
     * @return The Amazon S3 bucket policy for the specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#setBucketPolicy(String, String)
     */
    public BucketPolicy getBucketPolicy(String bucketName)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the policy for the specified bucket. Only the owner of the bucket
     * can retrieve the policy. If no policy has been set for the bucket, then
     * an empty result object with a <code>null</code> policy text field will be
     * returned.
     * </p>
     * <p>
     * Bucket policies provide access control management at the bucket level for
     * both the bucket resource and contained object resources. Only one policy
     * can be specified per-bucket.
     * </p>
     * <p>
     * See the <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/">
     * Amazon S3 developer guide</a> for more information on forming bucket
     * polices.
     * </p>
     *
     * @param getBucketPolicyRequest
     *            The request object containing all of the details for
     *            retreiving a bucket's policy.
     *
     * @return The Amazon S3 bucket policy for the specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3#setBucketPolicy(String, String)
     */
    public BucketPolicy getBucketPolicy(GetBucketPolicyRequest getBucketPolicyRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the policy associated with the specified bucket. Only the owner of
     * the bucket can set a bucket policy. If a policy already exists for the
     * specified bucket, the new policy replaces the existing policy.
     * </p>
     * <p>
     * Bucket policies provide access control management at the bucket level for
     * both the bucket resource and contained object resources. Only one policy
     * can be specified per-bucket.
     * </p>
     * <p>
     * See the <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/">
     * Amazon S3 developer guide</a> for more information on forming bucket
     * polices.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose policy is being set.
     * @param policyText
     *            The policy to apply to the specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void setBucketPolicy(String bucketName, String policyText)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the policy associated with the specified bucket. Only the owner of
     * the bucket can set a bucket policy. If a policy already exists for the
     * specified bucket, the new policy replaces the existing policy.
     * </p>
     * <p>
     * Bucket policies provide access control management at the bucket level for
     * both the bucket resource and contained object resources. Only one policy
     * can be specified per-bucket.
     * </p>
     * <p>
     * See the <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/">
     * Amazon S3 developer guide</a> for more information on forming bucket
     * polices.
     * </p>
     *
     * @param setBucketPolicyRequest
     *            The request object containing the details of the bucket and
     *            policy to update.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void setBucketPolicy(SetBucketPolicyRequest setBucketPolicyRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the policy associated with the specified bucket. Only the owner
     * of the bucket can delete the bucket policy.
     * </p>
     * <p>
     * Bucket policies provide access control management at the bucket level for
     * both the bucket resource and contained object resources. Only one policy
     * can be specified per-bucket.
     * </p>
     * <p>
     * See the <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/">
     * Amazon S3 developer guide</a> for more information on forming bucket
     * polices.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose policy is being
     *            deleted.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void deleteBucketPolicy(String bucketName)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the policy associated with the specified bucket. Only the owner
     * of the bucket can delete the bucket policy.
     * </p>
     * <p>
     * Bucket policies provide access control management at the bucket level for
     * both the bucket resource and contained object resources. Only one policy
     * can be specified per-bucket.
     * </p>
     * <p>
     * See the <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/">
     * Amazon S3 developer guide</a> for more information on forming bucket
     * polices.
     * </p>
     *
     * @param deleteBucketPolicyRequest
     *            The request object containing all the details for deleting a
     *            bucket's policy.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void deleteBucketPolicy(DeleteBucketPolicyRequest deleteBucketPolicyRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a pre-signed URL for accessing an Amazon S3 resource.
     * </p>
     * <p>
     * Pre-signed URLs allow clients to form a URL for an Amazon S3 resource,
     * and then sign it with the current AWS security credentials.
     * The pre-signed URL
     * can be shared to other users, allowing access to the resource without
     * providing an account's AWS security credentials.
     * </p>
     * <p>
     * Pre-signed URLs are useful in many situations where AWS security
     * credentials aren't available from the client that needs to make the
     * actual request to Amazon S3.
     * </p>
     * <p>
     * For example, an application may need remote users to upload files to the
     * application owner's Amazon S3 bucket, but doesn't need to ship the
     * AWS security credentials with the application. A pre-signed URL
     * to PUT an object into the owner's bucket can be generated from a remote
     * location with the owner's AWS security credentials, then the pre-signed
     * URL can be passed to the end user's application to use.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the desired object.
     * @param key
     *            The key in the specified bucket under which the desired object
     *            is stored.
     * @param expiration
     *            The time at which the returned pre-signed URL will expire.
     *
     * @return A pre-signed URL which expires at the specified time, and can be
     *         used to allow anyone to download the specified object from S3,
     *         without exposing the owner's AWS secret access key.
     *
     * @throws AmazonClientException
     *             If there were any problems pre-signing the request for the
     *             specified S3 object.
     *
     * @see AmazonS3#generatePresignedUrl(String, String, Date, HttpMethod)
     * @see AmazonS3#generatePresignedUrl(GeneratePresignedUrlRequest)
     */
    public URL generatePresignedUrl(String bucketName, String key, Date expiration)
            throws AmazonClientException;

    /**
     * <p>
     * Returns a pre-signed URL for accessing an Amazon S3 resource.
     * </p>
     * <p>
     * Pre-signed URLs allow clients to form a URL for an Amazon S3 resource,
     * and then sign it with the current AWS security credentials.
     * The pre-signed URL
     * can be shared to other users, allowing access to the resource without
     * providing an account's AWS security credentials.
     * </p>
     * <p>
     * Pre-signed URLs are useful in many situations where AWS security
     * credentials aren't available from the client that needs to make the
     * actual request to Amazon S3.
     * </p>
     * <p>
     * For example, an application may need remote users to upload files to the
     * application owner's Amazon S3 bucket, but doesn't need to ship the
     * AWS security credentials with the application. A pre-signed URL
     * to PUT an object into the owner's bucket can be generated from a remote
     * location with the owner's AWS security credentials, then the pre-signed
     * URL can be passed to the end user's application to use.
     * </p>
     *
     * @param bucketName
     *            The name of the bucket containing the desired object.
     * @param key
     *            The key in the specified bucket under which the desired object
     *            is stored.
     * @param expiration
     *            The time at which the returned pre-signed URL will expire.
     * @param method
     *            The HTTP method verb to use for this URL
     *
     * @return A pre-signed URL which expires at the specified time, and can be
     *         used to allow anyone to download the specified object from S3,
     *         without exposing the owner's AWS secret access key.
     *
     * @throws AmazonClientException
     *             If there were any problems pre-signing the request for the
     *             specified S3 object.
     *
     * @see AmazonS3#generatePresignedUrl(String, String, Date)
     * @see AmazonS3#generatePresignedUrl(GeneratePresignedUrlRequest)
     */
    public URL generatePresignedUrl(String bucketName, String key, Date expiration, HttpMethod method)
            throws AmazonClientException;


    /**
     * <p>
     * Returns a pre-signed URL for accessing an Amazon S3 resource.
     * </p>
     * <p>
     * Pre-signed URLs allow clients to form a URL for an Amazon S3 resource,
     * and then sign it with the current AWS security credentials. The
     * pre-signed URL can be shared to other users, allowing access to the
     * resource without providing an account's AWS security credentials.
     * </p>
     * <p>
     * Pre-signed URLs are useful in many situations where AWS security
     * credentials aren't available from the client that needs to make the
     * actual request to Amazon S3.
     * </p>
     * <p>
     * For example, an application may need remote users to upload files to the
     * application owner's Amazon S3 bucket, but doesn't need to ship the AWS
     * security credentials with the application. A pre-signed URL to PUT an
     * object into the owner's bucket can be generated from a remote location
     * with the owner's AWS security credentials, then the pre-signed URL can be
     * passed to the end user's application to use.
     * </p>
     * <p>
     * Note that presigned URLs cannot be used to upload an object with an
     * attached policy, as described in <a href=
     * "https://aws.amazon.com/articles/1434?_encoding=UTF8&queryArg=searchQuery&x=0&fromSearch=1&y=0&searchPath=all"
     * >this blog post</a>. That method is only suitable for POSTs from HTML
     * forms by browsers.
     * </p>
     * 
     * @param generatePresignedUrlRequest
     *            The request object containing all the options for generating a
     *            pre-signed URL (bucket name, key, expiration date, etc).
     * @return A pre-signed URL that can be used to access an Amazon S3 resource
     *         without requiring the user of the URL to know the account's AWS
     *         security credentials.
     * @throws AmazonClientException
     *             If there were any problems pre-signing the request for the
     *             Amazon S3 resource.
     * @see AmazonS3#generatePresignedUrl(String, String, Date)
     * @see AmazonS3#generatePresignedUrl(String, String, Date, HttpMethod)
     */
    public URL generatePresignedUrl(GeneratePresignedUrlRequest generatePresignedUrlRequest)
            throws AmazonClientException;

    /**
     * Initiates a multipart upload and returns an InitiateMultipartUploadResult
     * which contains an upload ID. This upload ID associates all the parts in
     * the specific upload and is used in each of your subsequent
     * {@link #uploadPart(UploadPartRequest)} requests. You also include this
     * upload ID in the final request to either complete, or abort the multipart
     * upload request.
     *
     * @param request
     *            The InitiateMultipartUploadRequest object that specifies all
     *            the parameters of this operation.
     *
     * @return An InitiateMultipartUploadResult from Amazon S3.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public InitiateMultipartUploadResult initiateMultipartUpload(InitiateMultipartUploadRequest request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Uploads a part in a multipart upload. You must initiate a multipart
     * upload before you can upload any part.
     * <p>
     * Your UploadPart request must include an upload ID and a part number. The
     * upload ID is the ID returned by Amazon S3 in response to your Initiate
     * Multipart Upload request. Part number can be any number between 1 and
     * 10,000, inclusive. A part number uniquely identifies a part and also
     * defines its position within the object being uploaded. If you upload a
     * new part using the same part number that was specified in uploading a
     * previous part, the previously uploaded part is overwritten.
     * <p>
     * To ensure data is not corrupted traversing the network, specify the
     * Content-MD5 header in the Upload Part request. Amazon S3 checks the part
     * data against the provided MD5 value. If they do not match, Amazon S3
     * returns an error.
     * <p>
     * When you upload a part, the returned UploadPartResult contains an ETag
     * property. You should record this ETag property value and the part number.
     * After uploading all parts, you must send a CompleteMultipartUpload
     * request. At that time Amazon S3 constructs a complete object by
     * concatenating all the parts you uploaded, in ascending order based on the
     * part numbers. The CompleteMultipartUpload request requires you to send
     * all the part numbers and the corresponding ETag values.
     *
     * @param request
     *            The UploadPartRequest object that specifies all the parameters
     *            of this operation.
     *
     * @return An UploadPartResult from Amazon S3 containing the part number and
     *         ETag of the new part.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public UploadPartResult uploadPart(UploadPartRequest request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Lists the parts that have been uploaded for a specific multipart upload.
     * <p>
     * This method must include the upload ID, returned by the
     * {@link #initiateMultipartUpload(InitiateMultipartUploadRequest)}
     * operation. This request returns a maximum of 1000 uploaded parts by
     * default. You can restrict the number of parts returned by specifying the
     * MaxParts property on the ListPartsRequest. If your multipart upload
     * consists of more parts than allowed in the ListParts response, the
     * response returns a IsTruncated field with value true, and a
     * NextPartNumberMarker property. In subsequent ListParts request you can
     * include the PartNumberMarker property and set its value to the
     * NextPartNumberMarker property value from the previous response.
     *
     * @param request
     *            The ListPartsRequest object that specifies all the parameters
     *            of this operation.
     *
     * @return Returns a PartListing from Amazon S3.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public PartListing listParts(ListPartsRequest request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Aborts a multipart upload. After a multipart upload is aborted, no
     * additional parts can be uploaded using that upload ID. The storage
     * consumed by any previously uploaded parts will be freed. However, if any
     * part uploads are currently in progress, those part uploads may or may not
     * succeed. As a result, it may be necessary to abort a given multipart
     * upload multiple times in order to completely free all storage consumed by
     * all parts.
     *
     * @param request
     *            The AbortMultipartUploadRequest object that specifies all the
     *            parameters of this operation.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void abortMultipartUpload(AbortMultipartUploadRequest request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Completes a multipart upload by assembling previously uploaded parts.
     * <p>
     * You first upload all parts using the
     * {@link #uploadPart(UploadPartRequest)} method. After successfully
     * uploading all individual parts of an upload, you call this operation to
     * complete the upload. Upon receiving this request, Amazon S3 concatenates
     * all the parts in ascending order by part number to create a new object.
     * In the CompleteMultipartUpload request, you must provide the parts list.
     * For each part in the list, you provide the part number and the ETag
     * header value, returned after that part was uploaded.
     * <p>
     * Processing of a CompleteMultipartUpload request may take several minutes
     * to complete.
     *
     * @param request
     *            The CompleteMultipartUploadRequest object that specifies all
     *            the parameters of this operation.
     *
     * @return A CompleteMultipartUploadResult from S3 containing the ETag for
     *         the new object composed of the individual parts.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public CompleteMultipartUploadResult completeMultipartUpload(CompleteMultipartUploadRequest request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Lists in-progress multipart uploads. An in-progress multipart upload is a
     * multipart upload that has been initiated, using the
     * InitiateMultipartUpload request, but has not yet been completed or
     * aborted.
     * <p>
     * This operation returns at most 1,000 multipart uploads in the response by
     * default. The number of multipart uploads can be further limited using the
     * MaxUploads property on the request parameter. If there are additional
     * multipart uploads that satisfy the list criteria, the response will
     * contain an IsTruncated property with the value set to true. To list the
     * additional multipart uploads use the KeyMarker and UploadIdMarker
     * properties on the request parameters.
     *
     * @param request
     *            The ListMultipartUploadsRequest object that specifies all the
     *            parameters of this operation.
     *
     * @return A MultipartUploadListing from Amazon S3.
     *
     * @throws AmazonClientException
     *             If any errors are encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public MultipartUploadListing listMultipartUploads(ListMultipartUploadsRequest request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Gets additional metadata for a previously executed successful request.
     * The returned metadata is typically used for debugging issues when a
     * service isn't acting as expected. This data isn't considered part of the
     * result data returned by an operation; as so, it's available through this
     * separate diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time. Use this
     * method to retrieve the response metadata as soon as possible after
     * executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or
     *         <code>null</code> if none is available.
     */
    public S3ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
