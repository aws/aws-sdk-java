/*
 * Copyright 2014-2019 Amazon Technologies, Inc.
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
package com.amazonaws.services.s3.event;

import java.util.List;

import com.amazonaws.util.SdkHttpUtils;
import org.joda.time.DateTime;

import com.amazonaws.internal.DateTimeJsonSerializer;
import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
* A helper class that represents a strongly typed S3 EventNotification item sent
* to SQS, SNS, or Lambda.
*/
public class S3EventNotification {

    private final List<S3EventNotificationRecord> records;

    @JsonCreator
    public S3EventNotification(
            @JsonProperty(value = "Records") List<S3EventNotificationRecord> records)
    {
        this.records = records;
    }

    /**
     * <p>
     * Parse the JSON string into a S3EventNotification object.
     * </p>
     * <p>
     * The function will try its best to parse input JSON string as best as it can.
     * It will not fail even if the JSON string contains unknown properties.
     * The function will throw SdkClientException if the input JSON string is
     * not valid JSON.
     * </p>
     * @param json
     *         JSON string to parse. Typically this is the body of your SQS
     *         notification message body.
     *
     * @return The resulting S3EventNotification object.
     */
    public static S3EventNotification parseJson(String json) {
        return Jackson.fromJsonString(json, S3EventNotification.class);
    }

    /**
     * @return the records in this notification
     */
    @JsonProperty(value = "Records")
    public List<S3EventNotificationRecord> getRecords() {
        return records;
    }

    /**
     * @return a JSON representation of this object
     */
    public String toJson() {
        return Jackson.toJsonString(this);
    }

    public static class UserIdentityEntity {

        private final String principalId;

        @JsonCreator
        public UserIdentityEntity(
                @JsonProperty(value = "principalId") String principalId) {
            this.principalId = principalId;
        }

        public String getPrincipalId() {
            return principalId;
        }
    }

    public static class S3BucketEntity {

        private final String name;
        private final UserIdentityEntity ownerIdentity;
        private final String arn;

        @JsonCreator
        public S3BucketEntity(
                @JsonProperty(value = "name") String name,
                @JsonProperty(value = "ownerIdentity") UserIdentityEntity ownerIdentity,
                @JsonProperty(value = "arn") String arn)
        {
            this.name = name;
            this.ownerIdentity = ownerIdentity;
            this.arn = arn;
        }

        public String getName() {
            return name;
        }

        public UserIdentityEntity getOwnerIdentity() {
            return ownerIdentity;
        }

        public String getArn() {
            return arn;
        }
    }

    public static class S3ObjectEntity {

        private final String key;
        private final Long size;
        private final String eTag;
        private final String versionId;
        private final String sequencer;

        @Deprecated
        public S3ObjectEntity(
                String key,
                Integer size,
                String eTag,
                String versionId)
        {
            this.key = key;
            this.size = size == null ? null : size.longValue();
            this.eTag = eTag;
            this.versionId = versionId;
            this.sequencer = null;
        }

        @Deprecated
        public S3ObjectEntity(
                String key,
                Long size,
                String eTag,
                String versionId)
        {
            this(key, size, eTag, versionId, null);
        }

        @JsonCreator
        public S3ObjectEntity(
                @JsonProperty(value = "key") String key,
                @JsonProperty(value = "size") Long size,
                @JsonProperty(value = "eTag") String eTag,
                @JsonProperty(value = "versionId") String versionId,
                @JsonProperty(value = "sequencer") String sequencer)
        {
            this.key = key;
            this.size = size;
            this.eTag = eTag;
            this.versionId = versionId;
            this.sequencer = sequencer;
        }

        public String getKey() {
            return key;
        }

        /**
         * S3 URL encodes the key of the object involved in the event. This is
         * a convenience method to automatically URL decode the key.
         * @return The URL decoded object key.
         */
        public String getUrlDecodedKey() {
            return SdkHttpUtils.urlDecode(getKey());
        }

        /**
         * @deprecated use {@link #getSizeAsLong()} instead.
         */
        @Deprecated
        @JsonIgnore
        public Integer getSize() {
            return size == null ? null : size.intValue();
        }

        @JsonProperty(value = "size")
        public Long getSizeAsLong() {
            return size;
        }

        public String geteTag() {
            return eTag;
        }

        public String getVersionId() {
            return versionId;
        }

        public String getSequencer() {
            return sequencer;
        }
    }

    public static class S3Entity {

        private final String configurationId;
        private final S3BucketEntity bucket;
        private final S3ObjectEntity object;
        private final String s3SchemaVersion;

        @JsonCreator
        public S3Entity(
                @JsonProperty(value = "configurationId") String configurationId,
                @JsonProperty(value = "bucket") S3BucketEntity bucket,
                @JsonProperty(value = "object") S3ObjectEntity object,
                @JsonProperty(value = "s3SchemaVersion") String s3SchemaVersion)
        {
            this.configurationId = configurationId;
            this.bucket = bucket;
            this.object = object;
            this.s3SchemaVersion = s3SchemaVersion;
        }

        public String getConfigurationId() {
            return configurationId;
        }

        public S3BucketEntity getBucket() {
            return bucket;
        }

        public S3ObjectEntity getObject() {
            return object;
        }

        public String getS3SchemaVersion() {
            return s3SchemaVersion;
        }
    }

    public static class RequestParametersEntity {

        private final String sourceIPAddress;

        @JsonCreator
        public RequestParametersEntity(
                @JsonProperty(value = "sourceIPAddress") String sourceIPAddress)
        {
            this.sourceIPAddress = sourceIPAddress;
        }

        public String getSourceIPAddress() {
            return sourceIPAddress;
        }
    }

    public static class ResponseElementsEntity {

        private final String xAmzId2;
        private final String xAmzRequestId;

        @JsonCreator
        public ResponseElementsEntity(
                @JsonProperty(value = "x-amz-id-2") String xAmzId2,
                @JsonProperty(value = "x-amz-request-id") String xAmzRequestId)
        {
            this.xAmzId2 = xAmzId2;
            this.xAmzRequestId = xAmzRequestId;
        }

        @JsonProperty("x-amz-id-2")
        public String getxAmzId2() {
            return xAmzId2;
        }

        @JsonProperty("x-amz-request-id")
        public String getxAmzRequestId() {
            return xAmzRequestId;
        }
    }

    public static class GlacierEventDataEntity {
        private final RestoreEventDataEntity restoreEventData;

        @JsonCreator
        public GlacierEventDataEntity(
                @JsonProperty(value = "restoreEventData") RestoreEventDataEntity restoreEventData)
        {
            this.restoreEventData = restoreEventData;
        }

        public RestoreEventDataEntity getRestoreEventData() {
            return restoreEventData;
        }
    }

    public static class RestoreEventDataEntity {
        private DateTime lifecycleRestorationExpiryTime;
        private final String lifecycleRestoreStorageClass;

        @JsonCreator
        public RestoreEventDataEntity(
                @JsonProperty("lifecycleRestorationExpiryTime") String lifecycleRestorationExpiryTime,
                @JsonProperty("lifecycleRestoreStorageClass") String lifecycleRestoreStorageClass)
        {
            if (lifecycleRestorationExpiryTime != null) {
                this.lifecycleRestorationExpiryTime = DateTime.parse(lifecycleRestorationExpiryTime);
            }
            this.lifecycleRestoreStorageClass = lifecycleRestoreStorageClass;
        }

        @JsonSerialize(using=DateTimeJsonSerializer.class)
        public DateTime getLifecycleRestorationExpiryTime() {
            return lifecycleRestorationExpiryTime;
        }

        public String getLifecycleRestoreStorageClass() {
            return lifecycleRestoreStorageClass;
        }
    }

    public static class S3EventNotificationRecord {

        private final String awsRegion;
        private final String eventName;
        private final String eventSource;
        private DateTime eventTime;
        private final String eventVersion;
        private final RequestParametersEntity requestParameters;
        private final ResponseElementsEntity responseElements;
        private final S3Entity s3;
        private final UserIdentityEntity userIdentity;
        private final GlacierEventDataEntity glacierEventData;

        @Deprecated
        public S3EventNotificationRecord(
                String awsRegion,
                String eventName,
                String eventSource,
                String eventTime,
                String eventVersion,
                RequestParametersEntity requestParameters,
                ResponseElementsEntity responseElements,
                S3Entity s3,
                UserIdentityEntity userIdentity)
        {
            this(awsRegion,
                 eventName,
                 eventSource,
                 eventTime,
                 eventVersion,
                 requestParameters,
                 responseElements,
                 s3,
                 userIdentity,
                 null);
        }

        @JsonCreator
        public S3EventNotificationRecord(
                @JsonProperty(value = "awsRegion") String awsRegion,
                @JsonProperty(value = "eventName") String eventName,
                @JsonProperty(value = "eventSource") String eventSource,
                @JsonProperty(value = "eventTime") String eventTime,
                @JsonProperty(value = "eventVersion") String eventVersion,
                @JsonProperty(value = "requestParameters") RequestParametersEntity requestParameters,
                @JsonProperty(value = "responseElements") ResponseElementsEntity responseElements,
                @JsonProperty(value = "s3") S3Entity s3,
                @JsonProperty(value = "userIdentity") UserIdentityEntity userIdentity,
                @JsonProperty(value = "glacierEventData") GlacierEventDataEntity glacierEventData)
        {
            this.awsRegion = awsRegion;
            this.eventName = eventName;
            this.eventSource = eventSource;

            if (eventTime != null)
            {
                this.eventTime = DateTime.parse(eventTime);
            }

            this.eventVersion = eventVersion;
            this.requestParameters = requestParameters;
            this.responseElements = responseElements;
            this.s3 = s3;
            this.userIdentity = userIdentity;
            this.glacierEventData = glacierEventData;
        }

        public String getAwsRegion() {
            return awsRegion;
        }

        public String getEventName() {
            return eventName;
        }

        public String getEventSource() {
            return eventSource;
        }

        @JsonSerialize(using=DateTimeJsonSerializer.class)
        public DateTime getEventTime() {
            return eventTime;
        }

        public String getEventVersion() {
            return eventVersion;
        }

        public RequestParametersEntity getRequestParameters() {
            return requestParameters;
        }

        public ResponseElementsEntity getResponseElements() {
            return responseElements;
        }

        public S3Entity getS3() {
            return s3;
        }

        public UserIdentityEntity getUserIdentity() {
            return userIdentity;
        }

        public GlacierEventDataEntity getGlacierEventData() {
            return glacierEventData;
        }
    }
}
