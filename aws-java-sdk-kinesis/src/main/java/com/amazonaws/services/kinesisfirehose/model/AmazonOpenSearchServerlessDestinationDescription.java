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
 * The destination description in the Serverless offering for Amazon OpenSearch Service.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/AmazonOpenSearchServerlessDestinationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOpenSearchServerlessDestinationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials.
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
     * The buffering options.
     * </p>
     */
    private AmazonOpenSearchServerlessBufferingHints bufferingHints;
    /**
     * <p>
     * The Serverless offering for Amazon OpenSearch Service retry options.
     * </p>
     */
    private AmazonOpenSearchServerlessRetryOptions retryOptions;
    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     */
    private String s3BackupMode;

    private S3DestinationDescription s3DestinationDescription;

    private ProcessingConfiguration processingConfiguration;

    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    private VpcConfigurationDescription vpcConfigurationDescription;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the AWS credentials.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS credentials.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationDescription withRoleARN(String roleARN) {
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

    public AmazonOpenSearchServerlessDestinationDescription withCollectionEndpoint(String collectionEndpoint) {
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

    public AmazonOpenSearchServerlessDestinationDescription withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The buffering options.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options.
     */

    public void setBufferingHints(AmazonOpenSearchServerlessBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * The buffering options.
     * </p>
     * 
     * @return The buffering options.
     */

    public AmazonOpenSearchServerlessBufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * The buffering options.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationDescription withBufferingHints(AmazonOpenSearchServerlessBufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * The Serverless offering for Amazon OpenSearch Service retry options.
     * </p>
     * 
     * @param retryOptions
     *        The Serverless offering for Amazon OpenSearch Service retry options.
     */

    public void setRetryOptions(AmazonOpenSearchServerlessRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * The Serverless offering for Amazon OpenSearch Service retry options.
     * </p>
     * 
     * @return The Serverless offering for Amazon OpenSearch Service retry options.
     */

    public AmazonOpenSearchServerlessRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * The Serverless offering for Amazon OpenSearch Service retry options.
     * </p>
     * 
     * @param retryOptions
     *        The Serverless offering for Amazon OpenSearch Service retry options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationDescription withRetryOptions(AmazonOpenSearchServerlessRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @see AmazonOpenSearchServerlessS3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @return The Amazon S3 backup mode.
     * @see AmazonOpenSearchServerlessS3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonOpenSearchServerlessS3BackupMode
     */

    public AmazonOpenSearchServerlessDestinationDescription withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonOpenSearchServerlessS3BackupMode
     */

    public AmazonOpenSearchServerlessDestinationDescription withS3BackupMode(AmazonOpenSearchServerlessS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * @param s3DestinationDescription
     */

    public void setS3DestinationDescription(S3DestinationDescription s3DestinationDescription) {
        this.s3DestinationDescription = s3DestinationDescription;
    }

    /**
     * @return
     */

    public S3DestinationDescription getS3DestinationDescription() {
        return this.s3DestinationDescription;
    }

    /**
     * @param s3DestinationDescription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationDescription withS3DestinationDescription(S3DestinationDescription s3DestinationDescription) {
        setS3DestinationDescription(s3DestinationDescription);
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

    public AmazonOpenSearchServerlessDestinationDescription withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
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

    public AmazonOpenSearchServerlessDestinationDescription withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * @param vpcConfigurationDescription
     */

    public void setVpcConfigurationDescription(VpcConfigurationDescription vpcConfigurationDescription) {
        this.vpcConfigurationDescription = vpcConfigurationDescription;
    }

    /**
     * @return
     */

    public VpcConfigurationDescription getVpcConfigurationDescription() {
        return this.vpcConfigurationDescription;
    }

    /**
     * @param vpcConfigurationDescription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonOpenSearchServerlessDestinationDescription withVpcConfigurationDescription(VpcConfigurationDescription vpcConfigurationDescription) {
        setVpcConfigurationDescription(vpcConfigurationDescription);
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
        if (getS3DestinationDescription() != null)
            sb.append("S3DestinationDescription: ").append(getS3DestinationDescription()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions()).append(",");
        if (getVpcConfigurationDescription() != null)
            sb.append("VpcConfigurationDescription: ").append(getVpcConfigurationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonOpenSearchServerlessDestinationDescription == false)
            return false;
        AmazonOpenSearchServerlessDestinationDescription other = (AmazonOpenSearchServerlessDestinationDescription) obj;
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
        if (other.getS3DestinationDescription() == null ^ this.getS3DestinationDescription() == null)
            return false;
        if (other.getS3DestinationDescription() != null && other.getS3DestinationDescription().equals(this.getS3DestinationDescription()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        if (other.getVpcConfigurationDescription() == null ^ this.getVpcConfigurationDescription() == null)
            return false;
        if (other.getVpcConfigurationDescription() != null && other.getVpcConfigurationDescription().equals(this.getVpcConfigurationDescription()) == false)
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
        hashCode = prime * hashCode + ((getS3DestinationDescription() == null) ? 0 : getS3DestinationDescription().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getVpcConfigurationDescription() == null) ? 0 : getVpcConfigurationDescription().hashCode());
        return hashCode;
    }

    @Override
    public AmazonOpenSearchServerlessDestinationDescription clone() {
        try {
            return (AmazonOpenSearchServerlessDestinationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.AmazonOpenSearchServerlessDestinationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
