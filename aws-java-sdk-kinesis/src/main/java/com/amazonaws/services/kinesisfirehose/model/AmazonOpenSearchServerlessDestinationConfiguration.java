/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch Service.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/AmazonOpenSearchServerlessDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOpenSearchServerlessDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Serverless
     * offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The endpoint to use when communicating with the collection in the Serverless offering for Amazon OpenSearch
     * Service.
     * </p>
     */
    private String collectionEndpoint;
    /**
     * <p>
     * The Serverless offering for Amazon OpenSearch Service index name.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The buffering options. If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
     * used.
     * </p>
     */
    private AmazonOpenSearchServerlessBufferingHints bufferingHints;
    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to the Serverless offering for
     * Amazon OpenSearch Service. The default value is 300 (5 minutes).
     * </p>
     */
    private AmazonOpenSearchServerlessRetryOptions retryOptions;
    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis Data
     * Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with
     * AmazonOpenSearchService-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data Firehose
     * delivers all incoming records to Amazon S3, and also writes failed documents with AmazonOpenSearchService-failed/
     * appended to the prefix.
     * </p>
     */
    private String s3BackupMode;

    private S3DestinationConfiguration s3Configuration;

    private ProcessingConfiguration processingConfiguration;

    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    private VpcConfiguration vpcConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Serverless
     * offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the
     *        Serverless offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Serverless
     * offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the
     *         Serverless offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Serverless
     * offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the
     *        Serverless offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The endpoint to use when communicating with the collection in the Serverless offering for Amazon OpenSearch
     * Service.
     * </p>
     * 
     * @param collectionEndpoint
     *        The endpoint to use when communicating with the collection in the Serverless offering for Amazon
     *        OpenSearch Service.
     */

    public void setCollectionEndpoint(String collectionEndpoint) {
        this.collectionEndpoint = collectionEndpoint;
    }

    /**
     * <p>
     * The endpoint to use when communicating with the collection in the Serverless offering for Amazon OpenSearch
     * Service.
     * </p>
     * 
     * @return The endpoint to use when communicating with the collection in the Serverless offering for Amazon
     *         OpenSearch Service.
     */

    public String getCollectionEndpoint() {
        return this.collectionEndpoint;
    }

    /**
     * <p>
     * The endpoint to use when communicating with the collection in the Serverless offering for Amazon OpenSearch
     * Service.
     * </p>
     * 
     * @param collectionEndpoint
     *        The endpoint to use when communicating with the collection in the Serverless offering for Amazon
     *        OpenSearch Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withCollectionEndpoint(String collectionEndpoint) {
        setCollectionEndpoint(collectionEndpoint);
        return this;
    }

    /**
     * <p>
     * The Serverless offering for Amazon OpenSearch Service index name.
     * </p>
     * 
     * @param indexName
     *        The Serverless offering for Amazon OpenSearch Service index name.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The Serverless offering for Amazon OpenSearch Service index name.
     * </p>
     * 
     * @return The Serverless offering for Amazon OpenSearch Service index name.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The Serverless offering for Amazon OpenSearch Service index name.
     * </p>
     * 
     * @param indexName
     *        The Serverless offering for Amazon OpenSearch Service index name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
     * used.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options. If no value is specified, the default values for
     *        AmazonopensearchserviceBufferingHints are used.
     */

    public void setBufferingHints(AmazonOpenSearchServerlessBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
     * used.
     * </p>
     * 
     * @return The buffering options. If no value is specified, the default values for
     *         AmazonopensearchserviceBufferingHints are used.
     */

    public AmazonOpenSearchServerlessBufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
     * used.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options. If no value is specified, the default values for
     *        AmazonopensearchserviceBufferingHints are used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withBufferingHints(AmazonOpenSearchServerlessBufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to the Serverless offering for
     * Amazon OpenSearch Service. The default value is 300 (5 minutes).
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Kinesis Data Firehose is unable to deliver documents to the Serverless offering
     *        for Amazon OpenSearch Service. The default value is 300 (5 minutes).
     */

    public void setRetryOptions(AmazonOpenSearchServerlessRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to the Serverless offering for
     * Amazon OpenSearch Service. The default value is 300 (5 minutes).
     * </p>
     * 
     * @return The retry behavior in case Kinesis Data Firehose is unable to deliver documents to the Serverless
     *         offering for Amazon OpenSearch Service. The default value is 300 (5 minutes).
     */

    public AmazonOpenSearchServerlessRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to the Serverless offering for
     * Amazon OpenSearch Service. The default value is 300 (5 minutes).
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Kinesis Data Firehose is unable to deliver documents to the Serverless offering
     *        for Amazon OpenSearch Service. The default value is 300 (5 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withRetryOptions(AmazonOpenSearchServerlessRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis Data
     * Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with
     * AmazonOpenSearchService-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data Firehose
     * delivers all incoming records to Amazon S3, and also writes failed documents with AmazonOpenSearchService-failed/
     * appended to the prefix.
     * </p>
     * 
     * @param s3BackupMode
     *        Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis
     *        Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with
     *        AmazonOpenSearchService-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data
     *        Firehose delivers all incoming records to Amazon S3, and also writes failed documents with
     *        AmazonOpenSearchService-failed/ appended to the prefix.
     * @see AmazonOpenSearchServerlessS3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis Data
     * Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with
     * AmazonOpenSearchService-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data Firehose
     * delivers all incoming records to Amazon S3, and also writes failed documents with AmazonOpenSearchService-failed/
     * appended to the prefix.
     * </p>
     * 
     * @return Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis
     *         Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination,
     *         with AmazonOpenSearchService-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data
     *         Firehose delivers all incoming records to Amazon S3, and also writes failed documents with
     *         AmazonOpenSearchService-failed/ appended to the prefix.
     * @see AmazonOpenSearchServerlessS3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis Data
     * Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with
     * AmazonOpenSearchService-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data Firehose
     * delivers all incoming records to Amazon S3, and also writes failed documents with AmazonOpenSearchService-failed/
     * appended to the prefix.
     * </p>
     * 
     * @param s3BackupMode
     *        Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis
     *        Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with
     *        AmazonOpenSearchService-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data
     *        Firehose delivers all incoming records to Amazon S3, and also writes failed documents with
     *        AmazonOpenSearchService-failed/ appended to the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonOpenSearchServerlessS3BackupMode
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis Data
     * Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with
     * AmazonOpenSearchService-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data Firehose
     * delivers all incoming records to Amazon S3, and also writes failed documents with AmazonOpenSearchService-failed/
     * appended to the prefix.
     * </p>
     * 
     * @param s3BackupMode
     *        Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis
     *        Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with
     *        AmazonOpenSearchService-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data
     *        Firehose delivers all incoming records to Amazon S3, and also writes failed documents with
     *        AmazonOpenSearchService-failed/ appended to the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonOpenSearchServerlessS3BackupMode
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withS3BackupMode(AmazonOpenSearchServerlessS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * @param s3Configuration
     */

    public void setS3Configuration(S3DestinationConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * @return
     */

    public S3DestinationConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * @param s3Configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withS3Configuration(S3DestinationConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * @param processingConfiguration
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * @return
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * @param processingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * @param cloudWatchLoggingOptions
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * @return
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * @param cloudWatchLoggingOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * @param vpcConfiguration
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * @return
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * @param vpcConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationConfiguration withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
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
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getCollectionEndpoint() != null)
            sb.append("CollectionEndpoint: ").append(getCollectionEndpoint()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getBufferingHints() != null)
            sb.append("BufferingHints: ").append(getBufferingHints()).append(",");
        if (getRetryOptions() != null)
            sb.append("RetryOptions: ").append(getRetryOptions()).append(",");
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: ").append(getS3BackupMode()).append(",");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonOpenSearchServerlessDestinationConfiguration == false)
            return false;
        AmazonOpenSearchServerlessDestinationConfiguration other = (AmazonOpenSearchServerlessDestinationConfiguration) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getCollectionEndpoint() == null ^ this.getCollectionEndpoint() == null)
            return false;
        if (other.getCollectionEndpoint() != null && other.getCollectionEndpoint().equals(this.getCollectionEndpoint()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getBufferingHints() == null ^ this.getBufferingHints() == null)
            return false;
        if (other.getBufferingHints() != null && other.getBufferingHints().equals(this.getBufferingHints()) == false)
            return false;
        if (other.getRetryOptions() == null ^ this.getRetryOptions() == null)
            return false;
        if (other.getRetryOptions() != null && other.getRetryOptions().equals(this.getRetryOptions()) == false)
            return false;
        if (other.getS3BackupMode() == null ^ this.getS3BackupMode() == null)
            return false;
        if (other.getS3BackupMode() != null && other.getS3BackupMode().equals(this.getS3BackupMode()) == false)
            return false;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getCollectionEndpoint() == null) ? 0 : getCollectionEndpoint().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getBufferingHints() == null) ? 0 : getBufferingHints().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AmazonOpenSearchServerlessDestinationConfiguration clone() {
        try {
            return (AmazonOpenSearchServerlessDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.AmazonOpenSearchServerlessDestinationConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
