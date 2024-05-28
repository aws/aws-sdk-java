/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an update for a destination in the Serverless offering for Amazon OpenSearch Service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/AmazonOpenSearchServerlessDestinationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOpenSearchServerlessDestinationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for calling the Serverless offering for
     * Amazon OpenSearch Service Configuration API and for indexing documents.
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
     * The buffering options. If no value is specified, AmazonopensearchBufferingHints object default values are used.
     * </p>
     */
    private AmazonOpenSearchServerlessBufferingHints bufferingHints;
    /**
     * <p>
     * The retry behavior in case Firehose is unable to deliver documents to the Serverless offering for Amazon
     * OpenSearch Service. The default value is 300 (5 minutes).
     * </p>
     */
    private AmazonOpenSearchServerlessRetryOptions retryOptions;

    private S3DestinationUpdate s3Update;

    private ProcessingConfiguration processingConfiguration;

    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for calling the Serverless offering for
     * Amazon OpenSearch Service Configuration API and for indexing documents.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for calling the Serverless
     *        offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for calling the Serverless offering for
     * Amazon OpenSearch Service Configuration API and for indexing documents.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for calling the Serverless
     *         offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for calling the Serverless offering for
     * Amazon OpenSearch Service Configuration API and for indexing documents.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the IAM role to be assumed by Firehose for calling the Serverless
     *        offering for Amazon OpenSearch Service Configuration API and for indexing documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationUpdate withRoleARN(String roleARN) {
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

    public AmazonOpenSearchServerlessDestinationUpdate withCollectionEndpoint(String collectionEndpoint) {
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

    public AmazonOpenSearchServerlessDestinationUpdate withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, AmazonopensearchBufferingHints object default values are used.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options. If no value is specified, AmazonopensearchBufferingHints object default values are
     *        used.
     */

    public void setBufferingHints(AmazonOpenSearchServerlessBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, AmazonopensearchBufferingHints object default values are used.
     * </p>
     * 
     * @return The buffering options. If no value is specified, AmazonopensearchBufferingHints object default values are
     *         used.
     */

    public AmazonOpenSearchServerlessBufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, AmazonopensearchBufferingHints object default values are used.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options. If no value is specified, AmazonopensearchBufferingHints object default values are
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationUpdate withBufferingHints(AmazonOpenSearchServerlessBufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * The retry behavior in case Firehose is unable to deliver documents to the Serverless offering for Amazon
     * OpenSearch Service. The default value is 300 (5 minutes).
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Firehose is unable to deliver documents to the Serverless offering for Amazon
     *        OpenSearch Service. The default value is 300 (5 minutes).
     */

    public void setRetryOptions(AmazonOpenSearchServerlessRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Firehose is unable to deliver documents to the Serverless offering for Amazon
     * OpenSearch Service. The default value is 300 (5 minutes).
     * </p>
     * 
     * @return The retry behavior in case Firehose is unable to deliver documents to the Serverless offering for Amazon
     *         OpenSearch Service. The default value is 300 (5 minutes).
     */

    public AmazonOpenSearchServerlessRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Firehose is unable to deliver documents to the Serverless offering for Amazon
     * OpenSearch Service. The default value is 300 (5 minutes).
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Firehose is unable to deliver documents to the Serverless offering for Amazon
     *        OpenSearch Service. The default value is 300 (5 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationUpdate withRetryOptions(AmazonOpenSearchServerlessRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * @param s3Update
     */

    public void setS3Update(S3DestinationUpdate s3Update) {
        this.s3Update = s3Update;
    }

    /**
     * @return
     */

    public S3DestinationUpdate getS3Update() {
        return this.s3Update;
    }

    /**
     * @param s3Update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationUpdate withS3Update(S3DestinationUpdate s3Update) {
        setS3Update(s3Update);
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

    public AmazonOpenSearchServerlessDestinationUpdate withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
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

    public AmazonOpenSearchServerlessDestinationUpdate withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
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
        if (getS3Update() != null)
            sb.append("S3Update: ").append(getS3Update()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonOpenSearchServerlessDestinationUpdate == false)
            return false;
        AmazonOpenSearchServerlessDestinationUpdate other = (AmazonOpenSearchServerlessDestinationUpdate) obj;
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
        if (other.getS3Update() == null ^ this.getS3Update() == null)
            return false;
        if (other.getS3Update() != null && other.getS3Update().equals(this.getS3Update()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
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
        hashCode = prime * hashCode + ((getS3Update() == null) ? 0 : getS3Update().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        return hashCode;
    }

    @Override
    public AmazonOpenSearchServerlessDestinationUpdate clone() {
        try {
            return (AmazonOpenSearchServerlessDestinationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.AmazonOpenSearchServerlessDestinationUpdateMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
