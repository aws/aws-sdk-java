/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of continuous export descriptions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinuousExportDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID assigned to this export.
     * </p>
     */
    private String exportId;
    /**
     * <p>
     * Describes the status of the export. Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * START_IN_PROGRESS - setting up resources to start continuous export.
     * </p>
     * </li>
     * <li>
     * <p>
     * START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export again.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - data is being exported to the customer bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and
     * start-continuous-export.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_IN_PROGRESS - stopping the export.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.
     * </p>
     * </li>
     * <li>
     * <p>
     * INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Contains information about any errors that have occurred. This data type can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED - You don’t have permission to start Data Exploration in Amazon Athena. Contact your AWS
     * administrator for help. For more information, see <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html">Setting Up AWS
     * Application Discovery Service</a> in the Application Discovery Service User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELIVERY_STREAM_LIMIT_FAILURE - You reached the limit for Amazon Kinesis Data Firehose delivery streams. Reduce
     * the number of streams or request a limit increase and try again. For more information, see <a
     * href="http://docs.aws.amazon.com/streams/latest/dev/service-sizes-and-limits.html">Kinesis Data Streams
     * Limits</a> in the Amazon Kinesis Data Streams Developer Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * FIREHOSE_ROLE_MISSING - The Data Exploration feature is in an error state because your IAM User is missing the
     * AWSApplicationDiscoveryServiceFirehose role. Turn on Data Exploration in Amazon Athena and try again. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html#setting-up-user-policy"
     * >Step 3: Provide Application Discovery Service Access to Non-Administrator Users by Attaching Policies</a> in the
     * Application Discovery Service User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * FIREHOSE_STREAM_DOES_NOT_EXIST - The Data Exploration feature is in an error state because your IAM User is
     * missing one or more of the Kinesis data delivery streams.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE - The Data Exploration feature is in an error state because of an internal failure. Try again
     * later. If this problem persists, contact AWS Support.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_LIMIT_FAILURE - You reached the limit for Amazon S3 buckets. Reduce the number of Amazon S3 buckets or
     * request a limit increase and try again. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     * Limitations</a> in the Amazon Simple Storage Service Developer Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_NOT_SIGNED_UP - Your account is not signed up for the Amazon S3 service. You must sign up before you can use
     * Amazon S3. You can sign up at the following URL: <a
     * href="https://aws.amazon.com/s3">https://aws.amazon.com/s3</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String statusDetail;
    /**
     * <p>
     * The name of the s3 bucket where the export data parquet files are stored.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The timestamp representing when the continuous export was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The timestamp that represents when this continuous export was stopped.
     * </p>
     */
    private java.util.Date stopTime;
    /**
     * <p>
     * The type of data collector used to gather this data (currently only offered for AGENT).
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * An object which describes how the data is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>databaseName</code> - the name of the Glue database used to store the schema.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> schemaStorageConfig;

    /**
     * <p>
     * The unique ID assigned to this export.
     * </p>
     * 
     * @param exportId
     *        The unique ID assigned to this export.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * The unique ID assigned to this export.
     * </p>
     * 
     * @return The unique ID assigned to this export.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * The unique ID assigned to this export.
     * </p>
     * 
     * @param exportId
     *        The unique ID assigned to this export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousExportDescription withExportId(String exportId) {
        setExportId(exportId);
        return this;
    }

    /**
     * <p>
     * Describes the status of the export. Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * START_IN_PROGRESS - setting up resources to start continuous export.
     * </p>
     * </li>
     * <li>
     * <p>
     * START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export again.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - data is being exported to the customer bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and
     * start-continuous-export.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_IN_PROGRESS - stopping the export.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.
     * </p>
     * </li>
     * <li>
     * <p>
     * INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the export. Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        START_IN_PROGRESS - setting up resources to start continuous export.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export
     *        again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE - data is being exported to the customer bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and
     *        start-continuous-export.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP_IN_PROGRESS - stopping the export.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer
     *        bucket.
     *        </p>
     *        </li>
     * @see ContinuousExportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the status of the export. Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * START_IN_PROGRESS - setting up resources to start continuous export.
     * </p>
     * </li>
     * <li>
     * <p>
     * START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export again.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - data is being exported to the customer bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and
     * start-continuous-export.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_IN_PROGRESS - stopping the export.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.
     * </p>
     * </li>
     * <li>
     * <p>
     * INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the status of the export. Can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         START_IN_PROGRESS - setting up resources to start continuous export.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export
     *         again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE - data is being exported to the customer bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and
     *         start-continuous-export.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOP_IN_PROGRESS - stopping the export.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer
     *         bucket.
     *         </p>
     *         </li>
     * @see ContinuousExportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes the status of the export. Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * START_IN_PROGRESS - setting up resources to start continuous export.
     * </p>
     * </li>
     * <li>
     * <p>
     * START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export again.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - data is being exported to the customer bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and
     * start-continuous-export.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_IN_PROGRESS - stopping the export.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.
     * </p>
     * </li>
     * <li>
     * <p>
     * INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the export. Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        START_IN_PROGRESS - setting up resources to start continuous export.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export
     *        again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE - data is being exported to the customer bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and
     *        start-continuous-export.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP_IN_PROGRESS - stopping the export.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer
     *        bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContinuousExportStatus
     */

    public ContinuousExportDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes the status of the export. Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * START_IN_PROGRESS - setting up resources to start continuous export.
     * </p>
     * </li>
     * <li>
     * <p>
     * START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export again.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE - data is being exported to the customer bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and
     * start-continuous-export.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_IN_PROGRESS - stopping the export.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.
     * </p>
     * </li>
     * <li>
     * <p>
     * INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the export. Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        START_IN_PROGRESS - setting up resources to start continuous export.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export
     *        again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE - data is being exported to the customer bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and
     *        start-continuous-export.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP_IN_PROGRESS - stopping the export.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer
     *        bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContinuousExportStatus
     */

    public ContinuousExportDescription withStatus(ContinuousExportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about any errors that have occurred. This data type can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED - You don’t have permission to start Data Exploration in Amazon Athena. Contact your AWS
     * administrator for help. For more information, see <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html">Setting Up AWS
     * Application Discovery Service</a> in the Application Discovery Service User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELIVERY_STREAM_LIMIT_FAILURE - You reached the limit for Amazon Kinesis Data Firehose delivery streams. Reduce
     * the number of streams or request a limit increase and try again. For more information, see <a
     * href="http://docs.aws.amazon.com/streams/latest/dev/service-sizes-and-limits.html">Kinesis Data Streams
     * Limits</a> in the Amazon Kinesis Data Streams Developer Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * FIREHOSE_ROLE_MISSING - The Data Exploration feature is in an error state because your IAM User is missing the
     * AWSApplicationDiscoveryServiceFirehose role. Turn on Data Exploration in Amazon Athena and try again. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html#setting-up-user-policy"
     * >Step 3: Provide Application Discovery Service Access to Non-Administrator Users by Attaching Policies</a> in the
     * Application Discovery Service User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * FIREHOSE_STREAM_DOES_NOT_EXIST - The Data Exploration feature is in an error state because your IAM User is
     * missing one or more of the Kinesis data delivery streams.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE - The Data Exploration feature is in an error state because of an internal failure. Try again
     * later. If this problem persists, contact AWS Support.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_LIMIT_FAILURE - You reached the limit for Amazon S3 buckets. Reduce the number of Amazon S3 buckets or
     * request a limit increase and try again. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     * Limitations</a> in the Amazon Simple Storage Service Developer Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_NOT_SIGNED_UP - Your account is not signed up for the Amazon S3 service. You must sign up before you can use
     * Amazon S3. You can sign up at the following URL: <a
     * href="https://aws.amazon.com/s3">https://aws.amazon.com/s3</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusDetail
     *        Contains information about any errors that have occurred. This data type can have the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCESS_DENIED - You don’t have permission to start Data Exploration in Amazon Athena. Contact your AWS
     *        administrator for help. For more information, see <a
     *        href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html">Setting Up AWS
     *        Application Discovery Service</a> in the Application Discovery Service User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELIVERY_STREAM_LIMIT_FAILURE - You reached the limit for Amazon Kinesis Data Firehose delivery streams.
     *        Reduce the number of streams or request a limit increase and try again. For more information, see <a
     *        href="http://docs.aws.amazon.com/streams/latest/dev/service-sizes-and-limits.html">Kinesis Data Streams
     *        Limits</a> in the Amazon Kinesis Data Streams Developer Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FIREHOSE_ROLE_MISSING - The Data Exploration feature is in an error state because your IAM User is missing
     *        the AWSApplicationDiscoveryServiceFirehose role. Turn on Data Exploration in Amazon Athena and try again.
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html#setting-up-user-policy"
     *        >Step 3: Provide Application Discovery Service Access to Non-Administrator Users by Attaching Policies</a>
     *        in the Application Discovery Service User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FIREHOSE_STREAM_DOES_NOT_EXIST - The Data Exploration feature is in an error state because your IAM User
     *        is missing one or more of the Kinesis data delivery streams.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL_FAILURE - The Data Exploration feature is in an error state because of an internal failure. Try
     *        again later. If this problem persists, contact AWS Support.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_LIMIT_FAILURE - You reached the limit for Amazon S3 buckets. Reduce the number of Amazon S3
     *        buckets or request a limit increase and try again. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     *        Limitations</a> in the Amazon Simple Storage Service Developer Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_NOT_SIGNED_UP - Your account is not signed up for the Amazon S3 service. You must sign up before you
     *        can use Amazon S3. You can sign up at the following URL: <a
     *        href="https://aws.amazon.com/s3">https://aws.amazon.com/s3</a>.
     *        </p>
     *        </li>
     */

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    /**
     * <p>
     * Contains information about any errors that have occurred. This data type can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED - You don’t have permission to start Data Exploration in Amazon Athena. Contact your AWS
     * administrator for help. For more information, see <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html">Setting Up AWS
     * Application Discovery Service</a> in the Application Discovery Service User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELIVERY_STREAM_LIMIT_FAILURE - You reached the limit for Amazon Kinesis Data Firehose delivery streams. Reduce
     * the number of streams or request a limit increase and try again. For more information, see <a
     * href="http://docs.aws.amazon.com/streams/latest/dev/service-sizes-and-limits.html">Kinesis Data Streams
     * Limits</a> in the Amazon Kinesis Data Streams Developer Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * FIREHOSE_ROLE_MISSING - The Data Exploration feature is in an error state because your IAM User is missing the
     * AWSApplicationDiscoveryServiceFirehose role. Turn on Data Exploration in Amazon Athena and try again. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html#setting-up-user-policy"
     * >Step 3: Provide Application Discovery Service Access to Non-Administrator Users by Attaching Policies</a> in the
     * Application Discovery Service User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * FIREHOSE_STREAM_DOES_NOT_EXIST - The Data Exploration feature is in an error state because your IAM User is
     * missing one or more of the Kinesis data delivery streams.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE - The Data Exploration feature is in an error state because of an internal failure. Try again
     * later. If this problem persists, contact AWS Support.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_LIMIT_FAILURE - You reached the limit for Amazon S3 buckets. Reduce the number of Amazon S3 buckets or
     * request a limit increase and try again. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     * Limitations</a> in the Amazon Simple Storage Service Developer Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_NOT_SIGNED_UP - Your account is not signed up for the Amazon S3 service. You must sign up before you can use
     * Amazon S3. You can sign up at the following URL: <a
     * href="https://aws.amazon.com/s3">https://aws.amazon.com/s3</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Contains information about any errors that have occurred. This data type can have the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCESS_DENIED - You don’t have permission to start Data Exploration in Amazon Athena. Contact your AWS
     *         administrator for help. For more information, see <a
     *         href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html">Setting Up AWS
     *         Application Discovery Service</a> in the Application Discovery Service User Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELIVERY_STREAM_LIMIT_FAILURE - You reached the limit for Amazon Kinesis Data Firehose delivery streams.
     *         Reduce the number of streams or request a limit increase and try again. For more information, see <a
     *         href="http://docs.aws.amazon.com/streams/latest/dev/service-sizes-and-limits.html">Kinesis Data Streams
     *         Limits</a> in the Amazon Kinesis Data Streams Developer Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FIREHOSE_ROLE_MISSING - The Data Exploration feature is in an error state because your IAM User is
     *         missing the AWSApplicationDiscoveryServiceFirehose role. Turn on Data Exploration in Amazon Athena and
     *         try again. For more information, see <a href=
     *         "http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html#setting-up-user-policy"
     *         >Step 3: Provide Application Discovery Service Access to Non-Administrator Users by Attaching
     *         Policies</a> in the Application Discovery Service User Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FIREHOSE_STREAM_DOES_NOT_EXIST - The Data Exploration feature is in an error state because your IAM User
     *         is missing one or more of the Kinesis data delivery streams.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INTERNAL_FAILURE - The Data Exploration feature is in an error state because of an internal failure. Try
     *         again later. If this problem persists, contact AWS Support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_BUCKET_LIMIT_FAILURE - You reached the limit for Amazon S3 buckets. Reduce the number of Amazon S3
     *         buckets or request a limit increase and try again. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     *         Limitations</a> in the Amazon Simple Storage Service Developer Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_NOT_SIGNED_UP - Your account is not signed up for the Amazon S3 service. You must sign up before you
     *         can use Amazon S3. You can sign up at the following URL: <a
     *         href="https://aws.amazon.com/s3">https://aws.amazon.com/s3</a>.
     *         </p>
     *         </li>
     */

    public String getStatusDetail() {
        return this.statusDetail;
    }

    /**
     * <p>
     * Contains information about any errors that have occurred. This data type can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED - You don’t have permission to start Data Exploration in Amazon Athena. Contact your AWS
     * administrator for help. For more information, see <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html">Setting Up AWS
     * Application Discovery Service</a> in the Application Discovery Service User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELIVERY_STREAM_LIMIT_FAILURE - You reached the limit for Amazon Kinesis Data Firehose delivery streams. Reduce
     * the number of streams or request a limit increase and try again. For more information, see <a
     * href="http://docs.aws.amazon.com/streams/latest/dev/service-sizes-and-limits.html">Kinesis Data Streams
     * Limits</a> in the Amazon Kinesis Data Streams Developer Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * FIREHOSE_ROLE_MISSING - The Data Exploration feature is in an error state because your IAM User is missing the
     * AWSApplicationDiscoveryServiceFirehose role. Turn on Data Exploration in Amazon Athena and try again. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html#setting-up-user-policy"
     * >Step 3: Provide Application Discovery Service Access to Non-Administrator Users by Attaching Policies</a> in the
     * Application Discovery Service User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * FIREHOSE_STREAM_DOES_NOT_EXIST - The Data Exploration feature is in an error state because your IAM User is
     * missing one or more of the Kinesis data delivery streams.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE - The Data Exploration feature is in an error state because of an internal failure. Try again
     * later. If this problem persists, contact AWS Support.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_BUCKET_LIMIT_FAILURE - You reached the limit for Amazon S3 buckets. Reduce the number of Amazon S3 buckets or
     * request a limit increase and try again. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     * Limitations</a> in the Amazon Simple Storage Service Developer Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_NOT_SIGNED_UP - Your account is not signed up for the Amazon S3 service. You must sign up before you can use
     * Amazon S3. You can sign up at the following URL: <a
     * href="https://aws.amazon.com/s3">https://aws.amazon.com/s3</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusDetail
     *        Contains information about any errors that have occurred. This data type can have the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCESS_DENIED - You don’t have permission to start Data Exploration in Amazon Athena. Contact your AWS
     *        administrator for help. For more information, see <a
     *        href="http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html">Setting Up AWS
     *        Application Discovery Service</a> in the Application Discovery Service User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELIVERY_STREAM_LIMIT_FAILURE - You reached the limit for Amazon Kinesis Data Firehose delivery streams.
     *        Reduce the number of streams or request a limit increase and try again. For more information, see <a
     *        href="http://docs.aws.amazon.com/streams/latest/dev/service-sizes-and-limits.html">Kinesis Data Streams
     *        Limits</a> in the Amazon Kinesis Data Streams Developer Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FIREHOSE_ROLE_MISSING - The Data Exploration feature is in an error state because your IAM User is missing
     *        the AWSApplicationDiscoveryServiceFirehose role. Turn on Data Exploration in Amazon Athena and try again.
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/application-discovery/latest/userguide/setting-up.html#setting-up-user-policy"
     *        >Step 3: Provide Application Discovery Service Access to Non-Administrator Users by Attaching Policies</a>
     *        in the Application Discovery Service User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FIREHOSE_STREAM_DOES_NOT_EXIST - The Data Exploration feature is in an error state because your IAM User
     *        is missing one or more of the Kinesis data delivery streams.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL_FAILURE - The Data Exploration feature is in an error state because of an internal failure. Try
     *        again later. If this problem persists, contact AWS Support.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_BUCKET_LIMIT_FAILURE - You reached the limit for Amazon S3 buckets. Reduce the number of Amazon S3
     *        buckets or request a limit increase and try again. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     *        Limitations</a> in the Amazon Simple Storage Service Developer Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_NOT_SIGNED_UP - Your account is not signed up for the Amazon S3 service. You must sign up before you
     *        can use Amazon S3. You can sign up at the following URL: <a
     *        href="https://aws.amazon.com/s3">https://aws.amazon.com/s3</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousExportDescription withStatusDetail(String statusDetail) {
        setStatusDetail(statusDetail);
        return this;
    }

    /**
     * <p>
     * The name of the s3 bucket where the export data parquet files are stored.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the s3 bucket where the export data parquet files are stored.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the s3 bucket where the export data parquet files are stored.
     * </p>
     * 
     * @return The name of the s3 bucket where the export data parquet files are stored.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The name of the s3 bucket where the export data parquet files are stored.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the s3 bucket where the export data parquet files are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousExportDescription withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The timestamp representing when the continuous export was started.
     * </p>
     * 
     * @param startTime
     *        The timestamp representing when the continuous export was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp representing when the continuous export was started.
     * </p>
     * 
     * @return The timestamp representing when the continuous export was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp representing when the continuous export was started.
     * </p>
     * 
     * @param startTime
     *        The timestamp representing when the continuous export was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousExportDescription withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp that represents when this continuous export was stopped.
     * </p>
     * 
     * @param stopTime
     *        The timestamp that represents when this continuous export was stopped.
     */

    public void setStopTime(java.util.Date stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * <p>
     * The timestamp that represents when this continuous export was stopped.
     * </p>
     * 
     * @return The timestamp that represents when this continuous export was stopped.
     */

    public java.util.Date getStopTime() {
        return this.stopTime;
    }

    /**
     * <p>
     * The timestamp that represents when this continuous export was stopped.
     * </p>
     * 
     * @param stopTime
     *        The timestamp that represents when this continuous export was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousExportDescription withStopTime(java.util.Date stopTime) {
        setStopTime(stopTime);
        return this;
    }

    /**
     * <p>
     * The type of data collector used to gather this data (currently only offered for AGENT).
     * </p>
     * 
     * @param dataSource
     *        The type of data collector used to gather this data (currently only offered for AGENT).
     * @see DataSource
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The type of data collector used to gather this data (currently only offered for AGENT).
     * </p>
     * 
     * @return The type of data collector used to gather this data (currently only offered for AGENT).
     * @see DataSource
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The type of data collector used to gather this data (currently only offered for AGENT).
     * </p>
     * 
     * @param dataSource
     *        The type of data collector used to gather this data (currently only offered for AGENT).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public ContinuousExportDescription withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The type of data collector used to gather this data (currently only offered for AGENT).
     * </p>
     * 
     * @param dataSource
     *        The type of data collector used to gather this data (currently only offered for AGENT).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public ContinuousExportDescription withDataSource(DataSource dataSource) {
        this.dataSource = dataSource.toString();
        return this;
    }

    /**
     * <p>
     * An object which describes how the data is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>databaseName</code> - the name of the Glue database used to store the schema.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An object which describes how the data is stored.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>databaseName</code> - the name of the Glue database used to store the schema.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getSchemaStorageConfig() {
        return schemaStorageConfig;
    }

    /**
     * <p>
     * An object which describes how the data is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>databaseName</code> - the name of the Glue database used to store the schema.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schemaStorageConfig
     *        An object which describes how the data is stored.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>databaseName</code> - the name of the Glue database used to store the schema.
     *        </p>
     *        </li>
     */

    public void setSchemaStorageConfig(java.util.Map<String, String> schemaStorageConfig) {
        this.schemaStorageConfig = schemaStorageConfig;
    }

    /**
     * <p>
     * An object which describes how the data is stored.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>databaseName</code> - the name of the Glue database used to store the schema.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schemaStorageConfig
     *        An object which describes how the data is stored.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>databaseName</code> - the name of the Glue database used to store the schema.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousExportDescription withSchemaStorageConfig(java.util.Map<String, String> schemaStorageConfig) {
        setSchemaStorageConfig(schemaStorageConfig);
        return this;
    }

    public ContinuousExportDescription addSchemaStorageConfigEntry(String key, String value) {
        if (null == this.schemaStorageConfig) {
            this.schemaStorageConfig = new java.util.HashMap<String, String>();
        }
        if (this.schemaStorageConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.schemaStorageConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SchemaStorageConfig.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousExportDescription clearSchemaStorageConfigEntries() {
        this.schemaStorageConfig = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getExportId() != null)
            sb.append("ExportId: ").append(getExportId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetail() != null)
            sb.append("StatusDetail: ").append(getStatusDetail()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStopTime() != null)
            sb.append("StopTime: ").append(getStopTime()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getSchemaStorageConfig() != null)
            sb.append("SchemaStorageConfig: ").append(getSchemaStorageConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinuousExportDescription == false)
            return false;
        ContinuousExportDescription other = (ContinuousExportDescription) obj;
        if (other.getExportId() == null ^ this.getExportId() == null)
            return false;
        if (other.getExportId() != null && other.getExportId().equals(this.getExportId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null)
            return false;
        if (other.getStatusDetail() != null && other.getStatusDetail().equals(this.getStatusDetail()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStopTime() == null ^ this.getStopTime() == null)
            return false;
        if (other.getStopTime() != null && other.getStopTime().equals(this.getStopTime()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getSchemaStorageConfig() == null ^ this.getSchemaStorageConfig() == null)
            return false;
        if (other.getSchemaStorageConfig() != null && other.getSchemaStorageConfig().equals(this.getSchemaStorageConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportId() == null) ? 0 : getExportId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStopTime() == null) ? 0 : getStopTime().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getSchemaStorageConfig() == null) ? 0 : getSchemaStorageConfig().hashCode());
        return hashCode;
    }

    @Override
    public ContinuousExportDescription clone() {
        try {
            return (ContinuousExportDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.ContinuousExportDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
