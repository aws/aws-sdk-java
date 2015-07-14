/*
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.regions.Region;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.BucketPolicy;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
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
import com.amazonaws.services.s3.model.DeleteBucketCrossOriginConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketLifecycleConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketPolicyRequest;
import com.amazonaws.services.s3.model.DeleteBucketRequest;
import com.amazonaws.services.s3.model.DeleteBucketTaggingConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.DeleteVersionRequest;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.GetBucketAclRequest;
import com.amazonaws.services.s3.model.GetBucketLocationRequest;
import com.amazonaws.services.s3.model.GetBucketNotificationConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketPolicyRequest;
import com.amazonaws.services.s3.model.GetBucketReplicationConfigurationRequest;
import com.amazonaws.services.s3.model.GetBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListBucketsRequest;
import com.amazonaws.services.s3.model.ListMultipartUploadsRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ListPartsRequest;
import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.RestoreObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.SetBucketAclRequest;
import com.amazonaws.services.s3.model.SetBucketCrossOriginConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketLifecycleConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketNotificationConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketPolicyRequest;
import com.amazonaws.services.s3.model.SetBucketReplicationConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketTaggingConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.SetBucketWebsiteConfigurationRequest;
import com.amazonaws.services.s3.model.SetObjectAclRequest;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.services.s3.model.VersionListing;

/**
 * An Abstract class that users needs to extend instead of {@link AmazonS3}
 * interface. This abstract class is provided so we don't break any customers
 * when we introduce new methods in {@link AmazonS3} interface.
 */
public abstract class AbstractAmazonS3 implements AmazonS3 {

    @Override
    public void setEndpoint(String endpoint) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setRegion(Region region) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public void setS3ClientOptions(S3ClientOptions clientOptions) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void changeObjectStorageClass(String bucketName, String key,
            StorageClass newStorageClass) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public void setObjectRedirectLocation(String bucketName, String key,
            String newRedirectLocation) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public ObjectListing listObjects(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public ObjectListing listObjects(String bucketName, String prefix)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public ObjectListing listObjects(ListObjectsRequest listObjectsRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public ObjectListing listNextBatchOfObjects(
            ObjectListing previousObjectListing) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public VersionListing listVersions(String bucketName, String prefix)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public VersionListing listNextBatchOfVersions(
            VersionListing previousVersionListing)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public VersionListing listVersions(String bucketName, String prefix,
            String keyMarker, String versionIdMarker, String delimiter,
            Integer maxResults) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public VersionListing listVersions(ListVersionsRequest listVersionsRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public Owner getS3AccountOwner() throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public boolean doesBucketExist(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public List<Bucket> listBuckets() throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public List<Bucket> listBuckets(ListBucketsRequest listBucketsRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public String getBucketLocation(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public String getBucketLocation(
            GetBucketLocationRequest getBucketLocationRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public Bucket createBucket(CreateBucketRequest createBucketRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public Bucket createBucket(String bucketName) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public Bucket createBucket(String bucketName,
            com.amazonaws.services.s3.model.Region region)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public Bucket createBucket(String bucketName, String region)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public AccessControlList getObjectAcl(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public AccessControlList getObjectAcl(String bucketName, String key,
            String versionId) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setObjectAcl(String bucketName, String key,
            AccessControlList acl) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setObjectAcl(String bucketName, String key,
            CannedAccessControlList acl) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setObjectAcl(String bucketName, String key, String versionId,
            AccessControlList acl) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setObjectAcl(String bucketName, String key, String versionId,
            CannedAccessControlList acl) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setObjectAcl(SetObjectAclRequest setObjectAclRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public AccessControlList getBucketAcl(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketAcl(SetBucketAclRequest setBucketAclRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public AccessControlList getBucketAcl(
            GetBucketAclRequest getBucketAclRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketAcl(String bucketName, AccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketAcl(String bucketName, CannedAccessControlList acl)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public ObjectMetadata getObjectMetadata(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public ObjectMetadata getObjectMetadata(
            GetObjectMetadataRequest getObjectMetadataRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public S3Object getObject(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public S3Object getObject(GetObjectRequest getObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public ObjectMetadata getObject(GetObjectRequest getObjectRequest,
            File destinationFile) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucket(DeleteBucketRequest deleteBucketRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucket(String bucketName) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public PutObjectResult putObject(PutObjectRequest putObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public PutObjectResult putObject(String bucketName, String key, File file)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public PutObjectResult putObject(String bucketName, String key,
            InputStream input, ObjectMetadata metadata)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public CopyObjectResult copyObject(String sourceBucketName,
            String sourceKey, String destinationBucketName,
            String destinationKey) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public CopyPartResult copyPart(CopyPartRequest copyPartRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteObject(String bucketName, String key)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteObject(DeleteObjectRequest deleteObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public DeleteObjectsResult deleteObjects(
            DeleteObjectsRequest deleteObjectsRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteVersion(String bucketName, String key, String versionId)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteVersion(DeleteVersionRequest deleteVersionRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public BucketLoggingConfiguration getBucketLoggingConfiguration(
            String bucketName) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketLoggingConfiguration(
            SetBucketLoggingConfigurationRequest setBucketLoggingConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public BucketVersioningConfiguration getBucketVersioningConfiguration(
            String bucketName) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketVersioningConfiguration(
            SetBucketVersioningConfigurationRequest setBucketVersioningConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public BucketLifecycleConfiguration getBucketLifecycleConfiguration(
            String bucketName) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketLifecycleConfiguration(String bucketName,
            BucketLifecycleConfiguration bucketLifecycleConfiguration) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketLifecycleConfiguration(
            SetBucketLifecycleConfigurationRequest setBucketLifecycleConfigurationRequest) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucketLifecycleConfiguration(String bucketName) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucketLifecycleConfiguration(
            DeleteBucketLifecycleConfigurationRequest deleteBucketLifecycleConfigurationRequest) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public BucketCrossOriginConfiguration getBucketCrossOriginConfiguration(
            String bucketName) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketCrossOriginConfiguration(String bucketName,
            BucketCrossOriginConfiguration bucketCrossOriginConfiguration) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketCrossOriginConfiguration(
            SetBucketCrossOriginConfigurationRequest setBucketCrossOriginConfigurationRequest) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucketCrossOriginConfiguration(String bucketName) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucketCrossOriginConfiguration(
            DeleteBucketCrossOriginConfigurationRequest deleteBucketCrossOriginConfigurationRequest) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public BucketTaggingConfiguration getBucketTaggingConfiguration(
            String bucketName) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketTaggingConfiguration(String bucketName,
            BucketTaggingConfiguration bucketTaggingConfiguration) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketTaggingConfiguration(
            SetBucketTaggingConfigurationRequest setBucketTaggingConfigurationRequest) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucketTaggingConfiguration(String bucketName) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucketTaggingConfiguration(
            DeleteBucketTaggingConfigurationRequest deleteBucketTaggingConfigurationRequest) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public BucketNotificationConfiguration getBucketNotificationConfiguration(
            String bucketName) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public BucketNotificationConfiguration getBucketNotificationConfiguration(
            GetBucketNotificationConfigurationRequest getBucketNotificationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public void setBucketNotificationConfiguration(
            SetBucketNotificationConfigurationRequest setBucketNotificationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketNotificationConfiguration(String bucketName,
            BucketNotificationConfiguration bucketNotificationConfiguration)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(
            String bucketName) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public BucketWebsiteConfiguration getBucketWebsiteConfiguration(
            GetBucketWebsiteConfigurationRequest getBucketWebsiteConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public void setBucketWebsiteConfiguration(String bucketName,
            BucketWebsiteConfiguration configuration)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketWebsiteConfiguration(
            SetBucketWebsiteConfigurationRequest setBucketWebsiteConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucketWebsiteConfiguration(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucketWebsiteConfiguration(
            DeleteBucketWebsiteConfigurationRequest deleteBucketWebsiteConfigurationRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public BucketPolicy getBucketPolicy(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public BucketPolicy getBucketPolicy(
            GetBucketPolicyRequest getBucketPolicyRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public void setBucketPolicy(String bucketName, String policyText)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketPolicy(SetBucketPolicyRequest setBucketPolicyRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucketPolicy(String bucketName)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void deleteBucketPolicy(
            DeleteBucketPolicyRequest deleteBucketPolicyRequest)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public URL generatePresignedUrl(String bucketName, String key,
            Date expiration) throws AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public URL generatePresignedUrl(String bucketName, String key,
            Date expiration, HttpMethod method) throws AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public URL generatePresignedUrl(
            GeneratePresignedUrlRequest generatePresignedUrlRequest)
            throws AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public InitiateMultipartUploadResult initiateMultipartUpload(
            InitiateMultipartUploadRequest request)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public UploadPartResult uploadPart(UploadPartRequest request)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public PartListing listParts(ListPartsRequest request)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public void abortMultipartUpload(AbortMultipartUploadRequest request)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public CompleteMultipartUploadResult completeMultipartUpload(
            CompleteMultipartUploadRequest request)
            throws AmazonClientException, AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public MultipartUploadListing listMultipartUploads(
            ListMultipartUploadsRequest request) throws AmazonClientException,
            AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public S3ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public void restoreObject(RestoreObjectRequest request)
            throws AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void restoreObject(String bucketName, String key,
            int expirationInDays) throws AmazonServiceException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void enableRequesterPays(String bucketName)
            throws AmazonServiceException, AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void disableRequesterPays(String bucketName)
            throws AmazonServiceException, AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public boolean isRequesterPaysEnabled(String bucketName)
            throws AmazonServiceException, AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public void setBucketReplicationConfiguration(String bucketName,
            BucketReplicationConfiguration configuration)
            throws AmazonServiceException, AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public void setBucketReplicationConfiguration(
            SetBucketReplicationConfigurationRequest setBucketReplicationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");

    }

    @Override
    public BucketReplicationConfiguration getBucketReplicationConfiguration(
            String bucketName) throws AmazonServiceException,
            AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public BucketReplicationConfiguration getBucketReplicationConfiguration(
            GetBucketReplicationConfigurationRequest getBucketReplicationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

    @Override
    public void deleteBucketReplicationConfiguration(String bucketName)
            throws AmazonServiceException, AmazonClientException {
        throw new UnsupportedOperationException("Extend AbstractAmazonS3 to provide an implementation");
    }

}
