/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.CreateBucketRequest;
import com.amazonaws.services.s3.model.DeleteBucketRequest;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.DeleteVersionRequest;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;

/**
 * <p>
 * Provides the client for accessing the Amazon S3 web service.
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
     * Callers can use this method to control which AWS region they want to work with.
     * </p>
     * <p>
     * Callers can pass in the endpoint (ex: "s3.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://s3.amazonaws.com"). If the
     * protocol is not specified, the default protocol (HTTPS) from this client's
     * {@link com.amazonaws.ClientConfiguration} will be used.
     * </p>
     * @param endpoint
     *            The endpoint (ex: "s3.amazonaws.com") or the full URL,
     *            including the protocol (ex: "https://s3.amazonaws.com"), of
     *            the region-specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If the specified endpoint is not a valid URL endpoint.
     */
    public abstract void setEndpoint(String endpoint);

    /**
     * Changes the Amazon S3 storage class for a specified object. Amazon S3
     * offers multiple storage classes for customer's different needs.
     * <p>
     * Note that when changing the storage class for an object in a bucket with
     * versioning enabled, the current version of the object will persist in its
     * current storage class, and a new, latest version will be created and
     * stored in the new storage class.
     *
     * @param bucketName
     *            The name of the bucket containing the object.
     * @param key
     *            The key of the object within the specified bucket.
     * @param newStorageClass
     *            The new storage class for the specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public void changeObjectStorageClass(String bucketName, String key, StorageClass newStorageClass)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of summary information about the objects in the specified
     * buckets.
     * List results are <i>always</i> returned in lexicographic (alphabetical) order.
     * </p>
     * <p>
     * Since buckets can contain a virtually unlimited number of keys, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link ObjectListing#isTruncated()} method to see if the returned
     * listing is complete, or if additional calls are needed to get
     * more results. Alternatively, use the
     * {@link AmazonS3Client#listNextBatchOfObjects(ObjectListing)} method as
     * an easy way to get the next page of object listings.
     * </p>
     * <p>
     * List performance is not substantially affected by the total number of
     * keys in a bucket.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket to list.
     *
     * @return A listing of the objects in the specified bucket, along with any
     *         other associated information such as common prefixes (if a
     *         delimiter was specified), the original request parameters, etc.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3Client#listObjects(String bucketName, String prefix)}
     * @see {@link AmazonS3Client#listObjects(ListObjectsRequest listObjectsRequest)}
     */
    public abstract ObjectListing listObjects(String bucketName) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of summary information about the objects in the specified
     * bucket. Depending on request parameters, additional information is returned,
     * such as common prefixes if a delimiter was specified.  List
     * results are <b>always</b> returned in lexicographic (alphabetical) order.
     * </p>
     * <p>
     * Since buckets can contain a virtually unlimited number of keys, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link ObjectListing#isTruncated()} method to see if the returned
     * listing is complete, or if additional calls are needed to get
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
     * List performance is not substantially affected by the total number of
     * keys in a bucket, nor by the presence or absence of any additional
     * request parameters.
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
     *         other associated information such as common prefixes (if a
     *         delimiter was specified), the original request parameters, etc.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3Client#listObjects(String bucketName)}
     * @see {@link AmazonS3Client#listObjects(ListObjectsRequest listObjectsRequest)}
     */
    public abstract ObjectListing listObjects(String bucketName, String prefix)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of summary information about the objects in the specified
     * bucket. Depending on request parameters additional information is returned,
     * such as common prefixes if a delimiter was specified. List
     * results are <i>always</i> returned in lexicographic (alphabetical) order.
     * </p>
     * <p>
     * Since buckets can contain a virtually unlimited number of keys, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link ObjectListing#isTruncated()} method to see if the returned
     * listing is complete, or if additional calls are needed to get
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
     * List performance is not substantially affected by the total number of
     * keys in a bucket, nor by the presence or absence of any additional
     * request parameters.
     * </p>
     *
     * @param listObjectsRequest
     *            The request object containing all options for listing the
     *            objects in a specified bucket.
     *
     * @return A listing of the objects in the specified bucket, along with any
     *         other associated information such as common prefixes (if a
     *         delimiter was specified), the original request parameters, etc.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3Client#listObjects(String bucketName)}
     * @see {@link AmazonS3Client#listObjects(String bucketName, String prefix)}
     */
    public abstract ObjectListing listObjects(ListObjectsRequest listObjectsRequest)
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
     *            <code>ObjectListing</code> will be returned without ever contacting
     *            Amazon S3.
     *
     * @return The next set of <code>ObjectListing</code> results, beginning immediately
     *         after the last result in the specified previous <code>ObjectListing</code>.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#listObjects(String)
     * @see AmazonS3Client#listObjects(String, String)
     * @see AmazonS3Client#listObjects(ListObjectsRequest)
     */
    public abstract ObjectListing listNextBatchOfObjects(ObjectListing previousObjectListing)
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
     * Since buckets can contain a virtually unlimited number of versions, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link VersionListing#isTruncated()} method to determine if the
     * returned listing is complete, or if additional calls are needed to get
     * more results. Callers are
     * encouraged to use
     * {@link AmazonS3#listNextBatchOfVersions(VersionListing)} as an easy way
     * to get the next page of results.
     * </p>
     * <p>
     * See
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
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
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract VersionListing listVersions(String bucketName, String prefix)
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
     * See
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
     *
     * @param previousVersionListing
     *            The previous truncated <code>VersionListing</code>.
     *            If a
     *            non-truncated <code>VersionListing</code> is passed in, an empty
     *            <code>VersionListing</code> will be returned without ever contacting
     *            Amazon S3.
     *
     * @return The next set of <code>VersionListing</code> results, beginning immediately
     *         after the last result in the specified previous <code>VersionListing</code>.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see AmazonS3Client#listVersions(String, String)
     * @see AmazonS3Client#listVersions(ListVersionsRequest)
     */
    public abstract VersionListing listNextBatchOfVersions(VersionListing previousVersionListing)
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
     * Since buckets can contain a virtually unlimited number of versions, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Always check the
     * {@link VersionListing#isTruncated()} method to determine if the
     * returned listing is complete, or if callers additional calls are needed
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
     * See
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose versions are to be
     *            listed.
     * @param prefix
     *            An optional parameter restricting the response to keys which
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
     *            This enables pagination: to get the next page of results use
     *            the next key marker and next version ID marker (from
     *            {@link VersionListing#getNextKeyMarker()} and
     *            {@link VersionListing#getNextVersionIdMarker()}) as the
     *            markers for the next request to list versions. Or use the
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
     *            This enables pagination: to get the next page of results use
     *            the next key marker and next version ID marker (from
     *            {@link VersionListing#getNextKeyMarker()} and
     *            {@link VersionListing#getNextVersionIdMarker()}) as the
     *            markers for the next request to list versions. Or use the
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
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract VersionListing listVersions(String bucketName, String prefix,
            String keyMarker, String versionIdMarker, String delimiter, Integer maxResults)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Returns a list of summary information about the versions in the specified
     * bucket.
     * <p>
     * The returned version summaries are ordered first by key and then by
     * version. Keys are sorted lexicographically (i.e. alphabetically from a-Z)
     * and versions are sorted from most recent to least recent. Both versions
     * with data and delete markers are included in the results.
     * <p>
     * Since buckets can contain a virtually unlimited number of versions, the
     * complete results of a list query can be extremely large. To manage large
     * result sets, Amazon S3 uses pagination to split them into multiple
     * responses. Callers should always check the
     * {@link VersionListing#isTruncated()} method to determine if the
     * returned listing is complete, or if callers need to make additional calls
     * to get more results. The key and version ID marker parameters allow
     * callers to specify where to start the version listing. Callers are
     * encouraged to use
     * {@link AmazonS3#listNextBatchOfVersions(VersionListing)} as an easy way
     * to get the next page of results.
     * <p>
     * The delimiter parameter allows groups of keys that share a prefix
     * terminated by a special delimiter to be rolled-up by that common prefix
     * in the returned listing. This allows applications to organize and browse
     * their keys hierarchically, much like how you would organize your files
     * into directories in a file system. These common prefixes can be retrieved
     * through the {@link VersionListing#getCommonPrefixes()} method.
     * <p>
     * For example, consider a bucket that contains the keys:
     * <ul>
     * <li>"foo/bar/baz"</li>
     * <li>"foo/bar/bash"</li>
     * <li>"foo/bar/bang"</li>
     * <li>"foo/boo"</li>
     * </ul>
     * <p>
     * If you call listVersions with prefix="foo/" and delimiter="/" on this
     * bucket, you will get an S3VersionListing back that contains:
     * <ul>
     * <li>all the versions for one key ("foo/boo")</li>
     * <li>one entry in the common prefixes list ("foo/bar/")</li>
     * </ul>
     * <p>
     * If you want to see deeper into the virtual hierarchy, you can make
     * another call to listVersions setting the prefix parameter to any
     * interesting common prefix to list the individual versions under that
     * prefix.
     * <p>
     * See
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
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
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract VersionListing listVersions(ListVersionsRequest listVersionsRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the current owner of the AWS account being used
     * by the authenticated sender of
     * the request.
     * </p>
     * <p>
     * The caller <i>must</i> authenticate with a valid AWS Access Key ID that is registered
     * with Amazon S3.
     * </p>
     *
     * @return The account of the authenticated sender
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract Owner getS3AccountOwner() throws AmazonClientException,
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
     * @return A value of <code>true</code> if the specified bucket exists in
     * Amazon S3; a value
     * of <code>false</code> if there is no bucket in Amazon S3 with that name.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public boolean doesBucketExist(String bucketName)
        throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of all Amazon S3 buckets owned by the authenticated
     * sender of the request.
     * </p>
     * <p>
     * You must authenticate with a valid AWS Access Key ID that is registered
     * with Amazon S3. Anonymous requests cannot list buckets, and you cannot
     * list buckets that you did not create.
     * </p>
     *
     * @return A list of all of the Amazon S3 buckets owned by the authenticated
     *         sender of the request.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract List<Bucket> listBuckets() throws AmazonClientException,
            AmazonServiceException;

    /**
     * Returns the geographical region where Amazon S3 stores the specified
     * bucket.
     * <p>
     * To view the location constraint of a bucket, you must be the bucket
     * owner.
     * </p>
     * <p>
     * Callers can use {@link Region#fromValue(String)} to get the Region enum
     * value, but should be prepared to handle IllegalArgumentExceptions if the
     * passed in value is not a known region value.
     * </p>
     * <p>
     * Region enum values are not returned directly from this method for
     * forwards compatibility reasons. As new Amazon S3 regions are added, they
     * would cause runtime errors when trying to instantiate Region enum values
     * from them.
     * </p>
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket to look up. This must be a
     *            bucket that you own.
     *
     * @return The location of the specified Amazon S3 bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see Region
     */
    public abstract String getBucketLocation(String bucketName) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Creates a new Amazon S3 bucket with the specified name, in the default
     * (US) region - {@link Region#US_Standard}.
     * <p>
     * Every object stored in Amazon S3 is contained in a bucket. Buckets
     * partition the namespace of objects stored in Amazon S3 at the top level.
     * Within a bucket, you can use any names for your objects, but bucket names
     * must be unique across all of Amazon S3.
     * <p>
     * Buckets are similar to Internet domain names. Just as Amazon is the only
     * owner of the domain name Amazon.com, only one person or organization can
     * own a bucket within Amazon S3. Once you create a uniquely named bucket in
     * Amazon S3, you can organize and name the objects within the bucket in any
     * way you like and the bucket will remain yours for as long as you like and
     * as long as you have the Amazon S3 account.
     * <p>
     * The similarities between buckets and domain names is not a coincidence -
     * there is a direct mapping between Amazon S3 buckets and subdomains of
     * s3.amazonaws.com. Objects stored in Amazon S3 are addressable using the
     * REST API under the domain bucketname.s3.amazonaws.com. For example, if
     * the object homepage.html is stored in the Amazon S3 bucket mybucket its
     * address would be http://mybucket.s3.amazonaws.com/homepage.html.
     * <p>
     * To conform with DNS requirements, the following constraints apply:
     * <ul>
     * <li>Bucket names should not contain underscores (_)
     * <li>Bucket names should be between 3 and 63 characters long
     * <li>Bucket names should not end with a dash
     * <li>Bucket names cannot contain two, adjacent periods
     * <li>Bucket names cannot contain dashes next to periods (e.g.,
     * "my-.bucket.com" and "my.-bucket" are invalid)
     * <li>Bucket names cannot contain uppercase characters
     * </ul>
     * <p>
     * There is no limit to the number of objects that can be stored in a bucket
     * and no variation in performance when using many buckets or just a few.
     * You can store all of your objects in a single bucket or organize them
     * across several buckets.
     * <p>
     * Buckets cannot be nested, meaning buckets cannot be created within
     * buckets.
     * <p>
     * The high availability engineering of Amazon S3 is focused on get, put,
     * list, and delete operations. Because bucket operations work against a
     * centralized, global resource space, it is not appropriate to make bucket
     * create or delete calls on the high availability code path of your
     * application. It is better to create or delete buckets in a separate
     * initialization or setup routine that you run less often.
     * <p>
     * To create a bucket, you must authenticate with an account that has a
     * valid AWS Access Key ID and is registered with Amazon S3. Anonymous
     * requests are never allowed to create buckets.
     *
     * @param createBucketRequest
     *            The request object containing all options for creating an S3
     *            bucket.
     * @return The newly created bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract Bucket createBucket(CreateBucketRequest createBucketRequest)
            throws AmazonClientException, AmazonServiceException;


    /**
     * Creates a new Amazon S3 bucket with the specified name, in the default
     * (US) region - {@link Region#US_Standard}.
     * <p>
     * Every object stored in Amazon S3 is contained in a bucket. Buckets
     * partition the namespace of objects stored in Amazon S3 at the top level.
     * Within a bucket, you can use any names for your objects, but bucket names
     * must be unique across all of Amazon S3.
     * <p>
     * Buckets are similar to Internet domain names. Just as Amazon is the only
     * owner of the domain name Amazon.com, only one person or organization can
     * own a bucket within Amazon S3. Once you create a uniquely named bucket in
     * Amazon S3, you can organize and name the objects within the bucket in any
     * way you like and the bucket will remain yours for as long as you like and
     * as long as you have the Amazon S3 account.
     * <p>
     * The similarities between buckets and domain names is not a coincidence -
     * there is a direct mapping between Amazon S3 buckets and subdomains of
     * s3.amazonaws.com. Objects stored in Amazon S3 are addressable using the
     * REST API under the domain bucketname.s3.amazonaws.com. For example, if
     * the object homepage.html is stored in the Amazon S3 bucket mybucket its
     * address would be http://mybucket.s3.amazonaws.com/homepage.html.
     * <p>
     * To conform with DNS requirements, the following constraints apply:
     * <ul>
     * <li>Bucket names should not contain underscores (_)
     * <li>Bucket names should be between 3 and 63 characters long
     * <li>Bucket names should not end with a dash
     * <li>Bucket names cannot contain two, adjacent periods
     * <li>Bucket names cannot contain dashes next to periods (e.g.,
     * "my-.bucket.com" and "my.-bucket" are invalid)
     * <li>Bucket names cannot contain uppercase characters
     * </ul>
     * <p>
     * There is no limit to the number of objects that can be stored in a bucket
     * and no variation in performance when using many buckets or just a few.
     * You can store all of your objects in a single bucket or organize them
     * across several buckets.
     * <p>
     * Buckets cannot be nested, meaning buckets cannot be created within
     * buckets.
     * <p>
     * The high availability engineering of Amazon S3 is focused on get, put,
     * list, and delete operations. Because bucket operations work against a
     * centralized, global resource space, it is not appropriate to make bucket
     * create or delete calls on the high availability code path of your
     * application. It is better to create or delete buckets in a separate
     * initialization or setup routine that you run less often.
     * <p>
     * To create a bucket, you must authenticate with an account that has a
     * valid AWS Access Key ID and is registered with Amazon S3. Anonymous
     * requests are never allowed to create buckets.
     *
     * @param bucketName
     *            The name of the bucket to create.
     *
     * @return The newly created bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract Bucket createBucket(String bucketName)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Creates a new Amazon S3 bucket with the specified name, in the specified
     * Amazon S3 region.
     * <p>
     * Every object stored in Amazon S3 is contained in a bucket. Buckets
     * partition the namespace of objects stored in Amazon S3 at the top level.
     * Within a bucket, you can use any names for your objects, but bucket names
     * must be globally unique across all of Amazon S3.
     * <p>
     * Buckets are similar to Internet domain names. Just as Amazon is the only
     * owner of the domain name Amazon.com, only one person or organization can
     * own a bucket within Amazon S3. Once you create a uniquely named bucket in
     * Amazon S3, you can organize and name the objects within the bucket in any
     * way you like and the bucket will remain yours for as long as you like and
     * as long as you have the Amazon S3 account.
     * <p>
     * The similarities between buckets and domain names is not a coincidence -
     * there is a direct mapping between Amazon S3 buckets and subdomains of
     * s3.amazonaws.com. Objects stored in Amazon S3 are addressable using the
     * REST API under the domain bucketname.s3.amazonaws.com. For example, if
     * the object homepage.html is stored in the Amazon S3 bucket mybucket its
     * address would be http://mybucket.s3.amazonaws.com/homepage.html.
     * <p>
     * To conform with DNS requirements, the following constraints apply:
     * <ul>
     * <li>Bucket names should not contain underscores (_)
     * <li>Bucket names should be between 3 and 63 characters long
     * <li>Bucket names should not end with a dash
     * <li>Bucket names cannot contain two, adjacent periods
     * <li>Bucket names cannot contain dashes next to periods (e.g.,
     * "my-.bucket.com" and "my.-bucket" are invalid)
     * <li>Bucket names cannot contain uppercase characters
     * </ul>
     * <p>
     * There is no limit to the number of objects that can be stored in a bucket
     * and no variation in performance when using many buckets or just a few.
     * You can store all of your objects in a single bucket or organize them
     * across several buckets.
     * <p>
     * Buckets cannot be nested, meaning buckets cannot be created within
     * buckets.
     * <p>
     * The high availability engineering of Amazon S3 is focused on get, put,
     * list, and delete operations. Because bucket operations work against a
     * centralized, global resource space, it is not appropriate to make bucket
     * create or delete calls on the high availability code path of your
     * application. It is better to create or delete buckets in a separate
     * initialization or setup routine that you run less often.
     * <p>
     * To create a bucket, you must authenticate with an account that has a
     * valid AWS Access Key ID and is registered with Amazon S3. Anonymous
     * requests are never allowed to create buckets.
     *
     * @see com.amazonaws.services.s3.model.Region
     *
     * @param bucketName
     *            The name of the bucket to create. Bucket names are globally
     *            unique, so
     * @param region
     *            The Amazon S3 region in which to create the new bucket.
     *
     * @return The newly created bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public Bucket createBucket(String bucketName, Region region)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Creates a new Amazon S3 bucket with the specified name, in the specified
     * Amazon S3 region. Callers are encouraged to use
     * {@link #createBucket(String, Region)} and pass in the {@link Region}
     * enum, but this method is provided for non-standard cases.
     * <p>
     * Every object stored in Amazon S3 is contained in a bucket. Buckets
     * partition the namespace of objects stored in Amazon S3 at the top level.
     * Within a bucket, you can use any names for your objects, but bucket names
     * must be globally unique across all of Amazon S3.
     * <p>
     * Buckets are similar to Internet domain names. Just as Amazon is the only
     * owner of the domain name Amazon.com, only one person or organization can
     * own a bucket within Amazon S3. Once you create a uniquely named bucket in
     * Amazon S3, you can organize and name the objects within the bucket in any
     * way you like and the bucket will remain yours for as long as you like and
     * as long as you have the Amazon S3 account.
     * <p>
     * The similarities between buckets and domain names is not a coincidence -
     * there is a direct mapping between Amazon S3 buckets and subdomains of
     * s3.amazonaws.com. Objects stored in Amazon S3 are addressable using the
     * REST API under the domain bucketname.s3.amazonaws.com. For example, if
     * the object homepage.html is stored in the Amazon S3 bucket mybucket its
     * address would be http://mybucket.s3.amazonaws.com/homepage.html.
     * <p>
     * To conform with DNS requirements, the following constraints apply:
     * <ul>
     * <li>Bucket names should not contain underscores (_)
     * <li>Bucket names should be between 3 and 63 characters long
     * <li>Bucket names should not end with a dash
     * <li>Bucket names cannot contain two, adjacent periods
     * <li>Bucket names cannot contain dashes next to periods (e.g.,
     * "my-.bucket.com" and "my.-bucket" are invalid)
     * <li>Bucket names cannot contain uppercase characters
     * </ul>
     * <p>
     * There is no limit to the number of objects that can be stored in a bucket
     * and no variation in performance when using many buckets or just a few.
     * You can store all of your objects in a single bucket or organize them
     * across several buckets.
     * <p>
     * Buckets cannot be nested, meaning buckets cannot be created within
     * buckets.
     * <p>
     * The high availability engineering of Amazon S3 is focused on get, put,
     * list, and delete operations. Because bucket operations work against a
     * centralized, global resource space, it is not appropriate to make bucket
     * create or delete calls on the high availability code path of your
     * application. It is better to create or delete buckets in a separate
     * initialization or setup routine that you run less often.
     * <p>
     * To create a bucket, you must authenticate with an account that has a
     * valid AWS Access Key ID and is registered with Amazon S3. Anonymous
     * requests are never allowed to create buckets.
     *
     * @see com.amazonaws.services.s3.model.Region
     *
     * @param bucketName
     *            The name of the bucket to create. Bucket names are globally
     *            unique, so
     * @param region
     *            The Amazon S3 region in which to create the new bucket.
     *
     * @return The newly created bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract Bucket createBucket(String bucketName, String region)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Retrieves the AccessControlList for the specified object in Amazon S3.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being retrieved.
     * @param key
     *            The key of the object within the specified bucket whose ACL is
     *            being retrieved.
     *
     * @return The AccessControlList for the specified S3 object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract AccessControlList getObjectAcl(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Retrieves the AccessControlList for the specified object at the specified
     * version in Amazon S3. Each version of an object has its own associated
     * ACL.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * <p>
     * See
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
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
     * @return The AccessControlList for the specified S3 object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract AccessControlList getObjectAcl(String bucketName, String key, String versionId)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Set the AccessControlList for the specified object in Amazon S3.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * <p>
     * When constructing a custom AccessControlList, callers typically retrieve
     * the existing AccessControlList for an object (
     * {@link AmazonS3Client#getObjectAcl(String, String)}), modify it as
     * necessary, and then use this method to upload the new ACL.
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being set.
     * @param key
     *            The key of the object within the specified bucket whose ACL is
     *            being set.
     * @param acl
     *            The new AccessControlList for the specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void setObjectAcl(String bucketName, String key, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Set the AccessControlList for the specified object in Amazon S3 using one
     * of the pre-configured CannedAccessControlLists. CannedAccessControlLists
     * are a quick way to configure an object or bucket with commonly used
     * access control policies.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     *
     * @param bucketName
     *            The name of the bucket containing the object whose ACL is
     *            being set.
     * @param key
     *            The key of the object within the specified bucket whose ACL is
     *            being set.
     * @param acl
     *            The new pre-configured CannedAccessControlList for the
     *            specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void setObjectAcl(String bucketName, String key, CannedAccessControlList acl)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Set the AccessControlList for the specified object at the specified
     * version in Amazon S3. Each version of an object has its own associated
     * ACL.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * <p>
     * When constructing a custom AccessControlList, callers typically retrieve
     * the existing AccessControlList for an object (
     * {@link AmazonS3Client#getObjectAcl(String, String)}), modify it as
     * necessary, and then use this method to upload the new ACL.
     * <p>
     * See
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
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
     *            The new AccessControlList for the specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void setObjectAcl(String bucketName, String key, String versionId, AccessControlList acl)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Set the AccessControlList for the specified object at the specified
     * version ID in Amazon S3 using one of the pre-configured
     * CannedAccessControlLists. CannedAccessControlLists are a quick way to
     * configure an object or bucket with commonly used access control policies.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy and each version of an object has its own associated ACL.
     * When a request is made, Amazon S3 authenticates the request using its
     * standard authentication procedure and then checks the ACL to verify the
     * sender was granted access to the bucket or object. If the sender is
     * approved, the request proceeds. Otherwise, Amazon S3 returns an error.
     * <p>
     * See
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
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
     *            The new pre-configured CannedAccessControlList for the
     *            specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void setObjectAcl(String bucketName, String key, String versionId, CannedAccessControlList acl)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Retrieves the AccessControlList for the specified Amazon S3 bucket.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     *
     * @param bucketName
     *            The name of the bucket whose ACL is being retrieved.
     *
     * @return The AccessControlList for the specified S3 bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract AccessControlList getBucketAcl(String bucketName) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Set the AccessControlList for the specified Amazon S3 bucket.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     * <p>
     * When constructing a custom AccessControlList, callers typically retrieve
     * the existing AccessControlList for a bucket (
     * {@link AmazonS3Client#getBucketAcl(String)}), modify it as necessary, and
     * then use this method to upload the new ACL.
     *
     * @param bucketName
     *            The name of the bucket whose ACL is being set.
     * @param acl
     *            The new AccessControlList for the specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void setBucketAcl(String bucketName, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Set the AccessControlList for the specified Amazon S3 bucket using one of
     * the pre-configured CannedAccessControlLists. CannedAccessControlLists are
     * a quick way to configure an object or bucket with commonly used access
     * control policies.
     * <p>
     * Each bucket and object in Amazon S3 has an ACL that defines its access
     * control policy. When a request is made, Amazon S3 authenticates the
     * request using its standard authentication procedure and then checks the
     * ACL to verify the sender was granted access to the bucket or object. If
     * the sender is approved, the request proceeds. Otherwise, Amazon S3
     * returns an error.
     *
     * @param bucketName
     *            The name of the bucket whose ACL is being set.
     * @param acl
     *            The pre-configured CannedAccessControlList to set for the
     *            specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void setBucketAcl(String bucketName, CannedAccessControlList acl)
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
     * @return All S3 object metadata for the specified object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3#getObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest)}
     */
    public abstract ObjectMetadata getObjectMetadata(String bucketName, String key)
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
     * See
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
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
     * @see {@link AmazonS3#getObjectMetadata(String bucketName, String key)}
     */
    public abstract ObjectMetadata getObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the object stored in Amazon S3 under the specified bucket and
     * key.
     * </p>
     * <p>
     * Callers should be very careful when using this method; the returned
     * S3Object contains a direct stream of data from the HTTP connection.
     * The underlying HTTP connection cannot be closed until the user
     * finishes reading the data and closes the stream. Callers should
     * therefore:
     * </p>
     * <ul>
     *  <li>Use the data from the input stream in S3Object as soon as possible,</li>
     *  <li>Close the input stream in S3Object as soon as possible.</li>
     * </ul>
     * If callers do not follow these rules, the client can run out of
     * resources if allocating too many open, but unused, HTTP connections.
     * </p>
     * <p>
     * To get an object from Amazon S3, the caller must have {@link Permission#Read}
     * access to the object.
     * </p>
     * <p>
     * If the object you're fetching is publicly readable, you can also read it
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
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3#getObject(GetObjectRequest getObjectRequest)}
     * @see {@link AmazonS3#getObject(GetObjectRequest getObjectRequest, File destinationFile)}
     */
    public abstract S3Object getObject(String bucketName, String key) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the object stored in Amazon S3 under the specified bucket and
     * key.
     * Returns <code>null</code> if the specified constraints weren't met.
     * </p>
     * <p>
     * Callers should be very careful when using this method; the returned
     * S3Object contains a direct stream of data from the HTTP connection.
     * The underlying HTTP connection cannot be closed until the user
     * finishes reading the data and closes the stream. Callers should
     * therefore:
     * </p>
     * <ul>
     *  <li>Use the data from the input stream in S3Object as soon as possible,</li>
     *  <li>Close the input stream in S3Object as soon as possible.</li>
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
     * If the object you're fetching is publicly readable, you can also read it
     * by pasting its URL into a browser.
     * </p>
     * <p>
     * When specifying constraints in the request object, the client needs to be
     * prepared to handle this method returning <code>null</code>
     * if the provided constraints aren't met when Amazon S3 receives the request.
     * </p>
     * <p>
     * If the advanced options in {@link GetObjectRequest} aren't needed,
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
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     * @see {@link AmazonS3#getObject(String bucketName, String key)}
     * @see {@link AmazonS3#getObject(GetObjectRequest getObjectRequest, File destinationFile)}
     */
    public abstract S3Object getObject(GetObjectRequest getObjectRequest)
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
     * Use this method, instead of
     * {@link AmazonS3#getObject(GetObjectRequest)}, to ensure that the underlying
     * HTTP stream resources are automatically closed as soon as possible.
     * The S3 client will handle immediately storing the object
     * contents to the specified file.
     * </p>
     * <p>
     * To get an object from Amazon S3, the caller must have {@link Permission#Read}
     * access to the object.
     * </p>
     * <p>
     * If the object you're fetching is publicly readable, you can also read it
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
     *            download the S3 object content.
     * @param destinationFile
     *            The file (which may or may not already exist) indicating where
     *            to save the object content being downloading from Amazon S3.
     *
     * @return All S3 object metadata for the specified object.
     *         Returns <code>null</code> if constraints were specified but not met.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request, handling the response, or writing the incoming data
     *             from S3 to the specified destination file.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3#getObject(String bucketName, String key)}
     * @see {@link AmazonS3#getObject(GetObjectRequest getObjectRequest)}
     */
    public ObjectMetadata getObject(GetObjectRequest getObjectRequest, File destinationFile)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Deletes the specified bucket. All objects (and all versions if versioning
     * was ever enabled) in the bucket must be deleted before the bucket itself
     * can be deleted.
     * <p>
     * Only the owner of a bucket can delete it, regardless of the bucket's
     * access control policy.
     *
     * @param deleteBucketRequest
     *            The request object containing all options for delete an S3
     *            bucket.
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void deleteBucket(DeleteBucketRequest deleteBucketRequest)
            throws AmazonClientException, AmazonServiceException;


    /**
     * Deletes the specified bucket. All objects (and all versions if versioning
     * was ever enabled) in the bucket must be deleted before the bucket itself
     * can be deleted.
     * <p>
     * Only the owner of a bucket can delete it, regardless of the bucket's
     * access control policy.
     *
     * @param bucketName
     *            The name of the bucket to delete.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void deleteBucket(String bucketName)
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
     *  <li>The client automatically computes
     *  a checksum of the file. This checksum is verified against another checksum
     *  that is calculated once the data reaches Amazon S3, ensuring the data
     *  has not corrupted in transit over the network.</li>
     *  <li>The file extension is used to try and automatically determine the
     *  correct content type and content disposition to use for the object.</li>
     * </ul>
     * <p>
     * When uploading directly from an input stream:
     * </p>
     * <ul>
     *  <li>Callers should be careful to set the
     *  correct content type in the metadata object before directly sending a
     *  stream. Unlike when uploading from files, content types from input streams
     *  cannot be automatically determined.  If the caller doesn't explicitly set
     *  the content type, it will not be set in Amazon S3.
     *  </li>
     *  <li>Content length <b>must</b> be specified before data can be uploaded
     *  to Amazon S3. If the caller doesn't provide it, the library will <b>have
     *  to</b> buffer the contents of the input stream in order to calculate it
     *  since Amazon S3 explicitly requires that the content length be sent in
     *  the request headers before any of the data is sent.</li>
     * </ul>
     * <p>
     * If versioning is enabled for the specified bucket, this operation will
     * never overwrite an existing object with the same key, but instead will keep
     * the existing object as an older version until that version is
     * explicitly deleted (see
     * {@link AmazonS3#deleteVersion(String, String, String)}.
     * </p>
     * <p>
     * If versioning is not enabled,this operation will overwrite an existing object
     * with the same key; Amazon S3 will store the last write request.
     * However, Amazon S3 is a distributed system. If Amazon S3
     * receives multiple write requests for the same object nearly
     * simultaneously, all of the objects might be stored, even though only one
     * wins in the end. Amazon S3 does not provide object locking; if you need
     * this, make sure to build it into your application layer.
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
     *         returned by Amazon S3 for the new, created object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     * @see {@link AmazonS3#putObject(String bucketName, String key, File file)}
     */
    public abstract PutObjectResult putObject(PutObjectRequest putObjectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads the specified file to Amazon S3 under the specified bucket and
     * key name.
     * </p>
     * <p>
     * Amazon S3 never stores partial objects; if during this call
     * an exception wasn't thrown, the entire object was stored.
     * </p>
     * <p>
     * The client automatically computes
     * a checksum of the file. This checksum is verified against another checksum
     * that is calculated once the data reaches Amazon S3, ensuring the data
     * has not corrupted in transit over the network.
     * </p>
     * <p>
     * The file extension is used to try and automatically determine the
     * correct content type to use for the object.
     * </p>
     * <p>
     * If versioning is enabled for the specified bucket, this operation will
     * never overwrite an existing object at the same key, but instead will keep
     * the existing object around as an older version until that version is
     * explicitly deleted (see
     * {@link AmazonS3#deleteVersion(String, String, String)}.
     * </p>
     * <p>
     * If versioning is suspended or off, uploading an object to an existing key
     * will overwrite the existing object because Amazon S3 stores the last
     * write request. However, Amazon S3 is a distributed system. If Amazon S3
     * receives multiple write requests for the same object nearly
     * simultaneously, all of the objects might be stored, even though only one
     * wins in the end. Amazon S3 does not provide object locking; if you need
     * this, make sure to build it into your application layer.
     * </p>
     * <p>
     * When specifying a location constraint when creating a bucket, all objects
     * added to the bucket are stored in the bucket's region. For example, if
     * specifying a Europe (EU) region constraint for a bucket, all of that
     * bucket's objects are stored in EU region.
     * </p>
     * <p>
     * The specified bucket must already exist and you must have
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
     *         returned by Amazon S3 for the new, created object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3#putObject(PutObjectRequest putObjectRequest)}
     */
    public abstract PutObjectResult putObject(String bucketName, String key, File file)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Uploads the specified input stream and object metadata to Amazon S3 under
     * the specified bucket and key name.
     * <p>
     * Amazon S3 never stores partial objects: if you don't receive an
     * exception, then you can be confident that the entire object was stored.
     * <p>
     * Callers should set the correct content type and content length in the
     * metadata object before directly sending a stream. The library can't
     * auto-determine content type for streams like it does for files, so if the
     * caller doesn't set it, it won't be set in Amazon S3.
     * <p>
     * Content length <b>must</b> be specified before data can be uploaded to
     * Amazon S3. If the caller doesn't provide it, the library will <b>have
     * to</b> buffer the contents of the input stream in order to calculate it
     * since Amazon S3 explicitly requires that the content length be sent in
     * the request headers before any of the data is sent.
     * <p>
     * If versioning is enabled for the specified bucket, this operation will
     * never overwrite an existing object at the same key, but instead will keep
     * the existing object around as an older version until that version is
     * explicitly deleted (see
     * {@link AmazonS3#deleteVersion(String, String, String)}.
     * <p>
     * If versioning is suspended or off, uploading an object to an existing key
     * will overwrite the existing object because Amazon S3 stores the last
     * write request. However, Amazon S3 is a distributed system. If Amazon S3
     * receives multiple write requests for the same object nearly
     * simultaneously, all of the objects might be stored, even though only one
     * wins in the end. Amazon S3 does not provide object locking; if you need
     * this, make sure to build it into your application layer.
     * <p>
     * If you specify a location constraint when creating a bucket, all objects
     * added to the bucket are stored in the bucket's region. For example, if
     * you specify a region in Europe (EU) constraint for a bucket, all of that
     * bucket's objects are stored in EU.
     * <p>
     * The specified bucket must already exist and you must have
     * {@link Permission#Write} permission to the bucket to upload an object.
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
     *            uploaded data (ex: custom user metadata, hooks for specifying
     *            content type, etc.).
     *
     * @return A {@link PutObjectResult} object containing the information
     *         returned by Amazon S3 for the new, created object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract PutObjectResult putObject(
            String bucketName, String key, InputStream input, ObjectMetadata metadata)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Copies a source object to a new destination in Amazon S3.
     * </p>
     * <p>
     * By default, all object metadata for the source object will be copied to
     * the new destination object. The Amazon S3 Acccess Control List (ACL)
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
     *            created. This may be the same name as the source bucket's.
     * @param destinationKey
     *            The key in the destination bucket under which the new object
     *            will be created.
     *
     * @return A {@link CopyObjectResult} object containing the information
     *         returned by Amazon S3 for the newly created object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3Client#copyObject(CopyObjectRequest copyObjectRequest)}
     */
    public abstract CopyObjectResult copyObject(String sourceBucketName, String sourceKey,
            String destinationBucketName, String destinationKey) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Copies a source object to a new destination in Amazon S3.
     * </p>
     * <p>
     * By default, all object metadata for the source object will be copied to
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
     * (ex:
     * {@link CopyObjectRequest#setMatchingETagConstraints(List)})
     * and are not satisfied when Amazon S3 receives the
     * request, this method returns null
     * This method returns a non-null result under all other
     * circumstances.
     * </p>
     * <p>
     * This method exposes all the advanced options for copying an Amazon S3
     * object. For simple uses, use the
     * {@link AmazonS3Client#copyObject(String sourceBucketName, String sourceKey, String destinationBucketName, String destinationKey)}
     * method.
     * </p>
     *
     * @param copyObjectRequest
     *            The request object containing all the options for copying an
     *            Amazon S3 object.
     *
     * @return A {@link CopyObjectResult} object containing the information
     *         returned by Amazon S3 about the newly created object, or null if
     *         constraints were specified that weren't met when Amazon S3 went
     *         to copy the object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3Client#copyObject(String sourceBucketName, String sourceKey, String destinationBucketName, String destinationKey)}
     */
    public abstract CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified object in the specified bucket. Once deleted, the object
     * can only be restored if versioning was enabled when the object was deleted.
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
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3Client#deleteObject(DeleteObjectRequest deleteObjectRequest)}
     */
    public abstract void deleteObject(String bucketName, String key)
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
     *            The request object containing all options for deleting an S3
     *            object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     *
     * @see {@link AmazonS3Client#deleteObject(String bucketName, String key)}
     */
    public void deleteObject(DeleteObjectRequest deleteObjectRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Deletes a specific version of the specified object in the specified
     * bucket. Once deleted, there is no method to restore or undelete an object
     * version. This is the only way to permanently delete object versions that
     * are protected by versioning.
     * <p>
     * Since deleting an object version is permanent and irreversible, it is a
     * privileged operation that only the owner of the bucket containing the
     * version may perform.
     * <p>
     * You can only delete a version of an object if you've enabled versioning
     * for your bucket. See
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
     * <p>
     * Note: If you delete an object that does not exist, Amazon S3 will return
     * a success (not an error message).
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
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void deleteVersion(String bucketName, String key, String versionId)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Deletes a specific version of an object in the specified bucket. Once
     * deleted, there is no method to restore or undelete an object version.
     * This is the only way to permanently delete object versions that are
     * protected by versioning.
     * <p>
     * Since deleting an object version is permanent and irreversible, it is a
     * privileged operation that only the owner of the bucket containing the
     * version may perform.
     * <p>
     * You can only delete a version of an object if you've enabled versioning
     * for your bucket. See
     * {@link #setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest)}
     * for more information about enabling versioning for a bucket.
     * <p>
     * Note: If you delete an object that does not exist, Amazon S3 will return
     * a success (not an error message).
     *
     * @param deleteVersionRequest
     *            The request object containing all options for deleting a
     *            specific version of an S3 object.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void deleteVersion(DeleteVersionRequest deleteVersionRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Returns the logging configuration for the specified bucket. The bucket
     * logging configuration object indicates whether server access logging is
     * enabled or not for the specified bucket, and if so the destination bucket
     * where server access logs are delivered, and the optional log file prefix.
     *
     * @param bucketName
     *            The name of the bucket whose bucket logging configuration is
     *            being retrieved.
     *
     * @return The bucket logging configuration for the specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract BucketLoggingConfiguration getBucketLoggingConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Sets the logging configuration for the specified bucket. The bucket
     * logging configuration object controls whether server access logging is
     * enabled or not for the specified bucket, and if so the destination bucket
     * where server access logs are delivered (which may be the same bucket as
     * the source bucket), and the optional log file prefix.
     * <p>
     * In order to deliver server access logs, the destination bucket must have
     * log delivery write permissions. You can use the
     * {@link CannedAccessControlList#LogDeliveryWrite} ACL to quickly add the
     * correct permissions to your destination bucket, or you can modify the
     * bucket's existing ACL to grant the {@link GroupGrantee#LogDelivery} group
     * grantee the {@link Permission#Write} permission.
     * <p>
     * Changes to the logging status for a bucket are visible in the
     * configuration API immediately, but they take time to actually affect the
     * delivery of log files. For example, if you enable logging for a bucket,
     * some requests made in the following hour might be logged, while others
     * might not. Or, if you change the target bucket for logging from bucket A
     * to bucket B, some logs for the next hour might continue to be delivered
     * to bucket A, while others might be delivered to the new target bucket B.
     * In all cases, the new settings will eventually take effect without any
     * further action on your part.
     *
     * @param setBucketLoggingConfigurationRequest
     *            The request object containing all options for setting the
     *            bucket logging configuration.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void setBucketLoggingConfiguration(SetBucketLoggingConfigurationRequest setBucketLoggingConfigurationRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Returns the versioning configuration for the specified bucket.
     * <p>
     * A bucket's versioning configuration can be in one of three possible
     * states:
     * <ul>
     * <li>{@link BucketVersioningConfiguration#OFF}
     * <li>{@link BucketVersioningConfiguration#ENABLED}
     * <li>{@link BucketVersioningConfiguration#SUSPENDED}
     * </ul>
     * <p>
     * By default, new buckets are in the
     * {@link BucketVersioningConfiguration#OFF off} state. Once versioning is
     * enabled for a bucket the status can never be reverted to
     * {@link BucketVersioningConfiguration#OFF off}.
     * <p>
     * The versioning configuration of a bucket has different implications for
     * each operation performed on that bucket or for objects within that
     * bucket. For instance, when versioning is enabled, a PutObject operation
     * creates a unique object version-id for the object being uploaded. The
     * PutObject API guarantees that, if versioning is enabled for a bucket at
     * the time of the request, the new object can only be permanently deleted
     * using the DeleteVersion operation. It can never be overwritten.
     * Additionally, PutObject guarantees that, if versioning is enabled for a
     * bucket the request, no other object will be overwritten by that request.
     * Refer to the documentation sections for each API for information on how
     * versioning status affects the semantics of that particular API.
     * <p>
     * S3 is eventually consistent. It may take time for the versioning status
     * of a bucket to be propagated throughout the system.
     *
     * @param bucketName
     *            The bucket whose versioning configuration will be retrieved.
     *
     * @return The bucket versioning configuration for the specified bucket.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract BucketVersioningConfiguration getBucketVersioningConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Sets the versioning configuration for the specified bucket.
     * <p>
     * A bucket's versioning configuration can be in one of three possible
     * states:
     * <ul>
     * <li>{@link BucketVersioningConfiguration#OFF}
     * <li>{@link BucketVersioningConfiguration#ENABLED}
     * <li>{@link BucketVersioningConfiguration#SUSPENDED}
     * </ul>
     * <p>
     * By default, new buckets are in the
     * {@link BucketVersioningConfiguration#OFF off} state. Once versioning is
     * enabled for a bucket the status can never be reverted to
     * {@link BucketVersioningConfiguration#OFF off}.
     * <p>
     * Objects created before versioning was enabled or when versioning is
     * suspended will be given the default/null version ID (see
     * {@link Constants#NULL_VERSION_ID}). Note that the
     * {@link Constants#NULL_VERSION_ID} is a valid version ID and is not the
     * same as not having a version ID.
     * <p>
     * The versioning configuration of a bucket has different implications for
     * each operation performed on that bucket or for objects within that
     * bucket. For instance, when versioning is enabled, a PutObject operation
     * creates a unique object version-id for the object being uploaded. The
     * PutObject API guarantees that, if versioning is enabled for a bucket at
     * the time of the request, the new object can only be permanently deleted
     * using the DeleteVersion operation. It can never be overwritten.
     * Additionally, PutObject guarantees that, if versioning is enabled for a
     * bucket the request, no other object will be overwritten by that request.
     * Refer to the documentation sections for each API for information on how
     * versioning status affects the semantics of that particular API.
     * <p>
     * S3 is eventually consistent. It may take time for the versioning status
     * of a bucket to be propagated throughout the system.
     *
     * @param setBucketVersioningConfigurationRequest
     *            The request object containing all options for setting the
     *            bucket versioning configuration.
     *
     * @throws AmazonClientException
     *             If any errors are encountered on the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     */
    public abstract void setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest setBucketVersioningConfigurationRequest)
        throws AmazonClientException, AmazonServiceException;

    /**
     * Returns a pre-signed URL to download the S3 object in the specified
     * bucket under the specified key.
     * <p>
     * Pre-signed URLs are useful for enabling direct third-party browser access
     * to your private Amazon S3 data, without proxying the request, or exposing
     * your AWS secret access key. The pre-signed request is encoded as a URL
     * that any end-user's browser can retrieve.
     * <p>
     * Pre-signed requests are limited by the specified expiration time. Once
     * the expiration time passes, the pre-signed URL will stop working.
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
     */
    public abstract URL generatePresignedUrl(String bucketName, String key, Date expiration)
            throws AmazonClientException;

}
