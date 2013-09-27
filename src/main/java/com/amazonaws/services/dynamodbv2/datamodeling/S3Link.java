/*
 * Copyright 2011-2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.io.File;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.internal.BucketNameUtils;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An S3 Link that works with {@link DynamoDBMapper}.
 * An S3 link is persisted as a JSON string in DynamoDB.
 * This link object can be used directly to upload/download files to S3.
 * Alternatively, the underlying
 * {@link AmazonS3Client} and {@link TransferManager} can be retrieved to
 * provide full access API to S3.
 * <p>
 * For example:
 * <pre><blockquote>
 * AWSCredentialsProvider s3CredentialProvider = ...;
 * DynamoDBMapper mapper = new DynamoDBMapper(..., s3CredentialProvider);
 * String username = "jamestkirk";
 *  
 * User user = new User();
 * user.setUsername(username);
 *  
 * // S3 region can be specified, but is optional
 * S3Link s3link = mapper.createS3Link("my-company-user-avatars", username + ".jpg");
 * user.setAvatar(s3link);
 *  
 * // All meta information of the S3 resource is persisted in DynamoDB, including
 * // region, bucket, and key
 * mapper.save(user);
 *  
 * // Upload file to S3 with the link saved in DynamoDB
 * s3link.uploadFrom(new File("/path/to/all/those/user/avatars/" + username + ".jpg"));
 * // Download file from S3 via an S3Link
 * s3link.downloadTo(new File("/path/to/downloads/" + username + ".jpg"));
 *  
 * // Full S3 API is available via the canonical AmazonS3Client and TransferManager API.
 * // For example:
 * AmazonS3Client s3 = s3link.getAmazonS3Client();
 * TransferManager s3m = s3link.getTransferManager();
 * // etc.
 * </blockquote></pre>The User pojo class used above:<pre><blockquote>
 * &commat;DynamoDBTable(tableName = "user-table")
 * public class User {
 *     private String username;
 *     private S3Link avatar;
 *  
 *     &commat;DynamoDBHashKey
 *     public String getUsername() {
 *         return username;
 *     }
 *  
 *     public void setUsername(String username) {
 *         this.username = username;
 *     }
 * 
 *     public S3Link getAvatar() {
 *         return avatar;
 *     }
 *  
 *     public void setAvatar(S3Link avatar) {
 *         this.avatar = avatar;
 *     }
 * }
 * </blockquote>
 * </pre>
 */
public class S3Link {
    private final S3ClientCache s3cc;
    private final ID id;

    S3Link(S3ClientCache s3cc, String bucketName, String key) {
        this(s3cc, new ID(bucketName, key));
    }

    S3Link(S3ClientCache s3cc, Region region, String bucketName, String key) {
        this(s3cc, new ID(region, bucketName, key));
    }

    private S3Link(S3ClientCache s3cc, ID id) {
        this.s3cc = s3cc;
        this.id = id;
        
        if ( s3cc == null ) {
            throw new IllegalArgumentException("S3ClientCache must be configured for use with S3Link");
        }
        if ( id == null || id.getBucket() == null || id.getKey() == null ) {
            throw new IllegalArgumentException("Bucket and key must be specified for S3Link");
        }
    }

    public String getKey() {
        return id.getKey();
    }

    public String getBucketName() {
        return id.getBucket();
    }

    public Region getS3Region() {
        return Region.fromValue(id.getRegionId());
    }

    /**
     * Serializes into a JSON string.
     *
     * @return The string representation of the link to the S3 resource.
     */
    String toJson() {
        return id.toJson();
    }

    /**
     * Deserializes from a JSON string.
     */
    static S3Link fromJson(S3ClientCache s3cc, String json) {
        ID id = Jackson.fromJsonString(json, ID.class);
        return new S3Link(s3cc, id);
    }

    public AmazonS3Client getAmazonS3Client() {
        return s3cc.getClient(getS3Region());
    }

    public TransferManager getTransferManager() {
        return s3cc.getTransferManager(getS3Region());
    }

    /**
     * Convenient method to synchronously upload from the given file to the
     * S3 object represented by this S3Link.
     *
     * @param source source file to upload from
     *
     * @return A {@link PutObjectResult} object containing the information
     * returned by Amazon S3 for the newly created object.
     */
    public PutObjectResult uploadFrom(final File source) {
        return getAmazonS3Client().putObject(getBucketName(), getKey(), source);
    }

    /**
     * Convenient method to synchronously download to the specified file from
     * the S3 object represented by this S3Link.
     *
     * @param destination destination file to download to
     *
     * @return All S3 object metadata for the specified object.
     * Returns null if constraints were specified but not met.
     */
    public ObjectMetadata downloadTo(final File destination) {
        return getAmazonS3Client().getObject(new GetObjectRequest(getBucketName(), getKey()), destination);
    }

    /**
     * JASON wrapper of an {@link S3Link} identifier, 
     * which consists of the S3 region id, bucket name and key.
     * Sample JSON serialized form:
     * <pre>
     * {"s3":{"bucket":"mybucket","key":"mykey","region":"us-west-2"}}
     * {"s3":{"bucket":"mybucket","key":"mykey","region":null}}
     * </pre>
     * Note for S3 a null region means US standard.
     * <p>
     *  @see Region#US_Standard
     */
    static class ID {
        @JsonProperty("s3")
        private S3 s3;

        ID() {} // used by Jackson to unmarshall
        ID(String bucketName, String key) {
            this.s3 = new S3(bucketName, key);
        }
        ID(Region region, String bucketName, String key) {
            this.s3 = new S3(region, bucketName, key);
        }
        ID(S3 s3) {
            this.s3 = s3;
        }
        @JsonProperty("s3")
        public S3 getS3() {
            return s3;
        }
        @JsonIgnore
        public String getRegionId() {
            return s3.getRegionId();
        }
        @JsonIgnore
        public String getBucket() {
            return s3.getBucket();
        }
        @JsonIgnore
        public String getKey() {
            return s3.getKey();
        }
        String toJson() {
            return Jackson.toJsonString(this);
        }
    }

    /**
     * Internal class for JSON serialization purposes.
     * <p>
     * @see ID
     */
    private static class S3 {
        /**
         * The region id of {@link Region} where the S3 object is stored.
         */
        @JsonProperty("region")
        private String regionId;
        /**
         * The name of the S3 bucket containing the object to retrieve.
         */
        @JsonProperty("bucket")
        private String bucket;

        /**
         * The key under which the desired S3 object is stored.
         */
        @JsonProperty("key")
        private String key;

        S3() {}  // used by Jackson to unmarshall
        /**
         * Constructs a new {@link S3} with all the required parameters.
         *
         * @param bucket
         *            The name of the bucket containing the desired object.
         * @param key
         *            The key in the specified bucket under which the object is
         *            stored.
         */
        S3(String bucket, String key) {
            this(null, bucket, key);
        }

        /**
         * Constructs a new {@link S3} with all the required parameters.
         *
         * @param bucket
         *            The name of the bucket containing the desired object.
         * @param key
         *            The key in the specified bucket under which the object is
         *            stored.
         */
        S3(Region region, String bucket, String key) {
            if ( region == null ) {
                if ( BucketNameUtils.isDNSBucketName(bucket) ) {
                    this.regionId = Region.US_Standard.getFirstRegionId();
                } else {
                    throw new IllegalArgumentException("Region must be specified for bucket that cannot be addressed using virtual host style");
                }
            } else {
                this.regionId = region.getFirstRegionId();
            }
            this.bucket = bucket;
            this.key = key;
        }

        /**
         * Gets the name of the bucket containing the object to be downloaded.
         *
         * @return The name of the bucket containing the object to be downloaded.
         */
        @JsonProperty("bucket")
        public String getBucket() {
            return bucket;
        }

        /**
         * Gets the key under which the object to be downloaded is stored.
         *
         * @return The key under which the object to be downloaded is stored.
         */
        @JsonProperty("key")
        public String getKey() {
            return key;
        }

        @JsonProperty("region")
        public String getRegionId() {
            return regionId;
        }
    }
}
