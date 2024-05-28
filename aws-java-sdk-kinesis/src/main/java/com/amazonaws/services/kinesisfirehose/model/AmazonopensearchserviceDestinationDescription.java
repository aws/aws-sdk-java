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
 * The destination description in Amazon OpenSearch Service.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/AmazonopensearchserviceDestinationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonopensearchserviceDestinationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ARN of the Amazon OpenSearch Service domain.
     * </p>
     */
    private String domainARN;
    /**
     * <p>
     * The endpoint to use when communicating with the cluster. Firehose uses either this ClusterEndpoint or the
     * DomainARN field to send data to Amazon OpenSearch Service.
     * </p>
     */
    private String clusterEndpoint;
    /**
     * <p>
     * The Amazon OpenSearch Service index name.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The Amazon OpenSearch Service type name. This applies to Elasticsearch 6.x and lower versions. For Elasticsearch
     * 7.x and OpenSearch Service 1.x, there's no value for TypeName.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The Amazon OpenSearch Service index rotation period
     * </p>
     */
    private String indexRotationPeriod;
    /**
     * <p>
     * The buffering options.
     * </p>
     */
    private AmazonopensearchserviceBufferingHints bufferingHints;
    /**
     * <p>
     * The Amazon OpenSearch Service retry options.
     * </p>
     */
    private AmazonopensearchserviceRetryOptions retryOptions;
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
     * Indicates the method for setting up document ID. The supported methods are Firehose generated document ID and
     * OpenSearch Service generated document ID.
     * </p>
     */
    private DocumentIdOptions documentIdOptions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the Amazon Web Services credentials.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services credentials.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the Amazon Web Services credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationDescription withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon OpenSearch Service domain.
     */

    public void setDomainARN(String domainARN) {
        this.domainARN = domainARN;
    }

    /**
     * <p>
     * The ARN of the Amazon OpenSearch Service domain.
     * </p>
     * 
     * @return The ARN of the Amazon OpenSearch Service domain.
     */

    public String getDomainARN() {
        return this.domainARN;
    }

    /**
     * <p>
     * The ARN of the Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon OpenSearch Service domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationDescription withDomainARN(String domainARN) {
        setDomainARN(domainARN);
        return this;
    }

    /**
     * <p>
     * The endpoint to use when communicating with the cluster. Firehose uses either this ClusterEndpoint or the
     * DomainARN field to send data to Amazon OpenSearch Service.
     * </p>
     * 
     * @param clusterEndpoint
     *        The endpoint to use when communicating with the cluster. Firehose uses either this ClusterEndpoint or the
     *        DomainARN field to send data to Amazon OpenSearch Service.
     */

    public void setClusterEndpoint(String clusterEndpoint) {
        this.clusterEndpoint = clusterEndpoint;
    }

    /**
     * <p>
     * The endpoint to use when communicating with the cluster. Firehose uses either this ClusterEndpoint or the
     * DomainARN field to send data to Amazon OpenSearch Service.
     * </p>
     * 
     * @return The endpoint to use when communicating with the cluster. Firehose uses either this ClusterEndpoint or the
     *         DomainARN field to send data to Amazon OpenSearch Service.
     */

    public String getClusterEndpoint() {
        return this.clusterEndpoint;
    }

    /**
     * <p>
     * The endpoint to use when communicating with the cluster. Firehose uses either this ClusterEndpoint or the
     * DomainARN field to send data to Amazon OpenSearch Service.
     * </p>
     * 
     * @param clusterEndpoint
     *        The endpoint to use when communicating with the cluster. Firehose uses either this ClusterEndpoint or the
     *        DomainARN field to send data to Amazon OpenSearch Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationDescription withClusterEndpoint(String clusterEndpoint) {
        setClusterEndpoint(clusterEndpoint);
        return this;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index name.
     * </p>
     * 
     * @param indexName
     *        The Amazon OpenSearch Service index name.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index name.
     * </p>
     * 
     * @return The Amazon OpenSearch Service index name.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index name.
     * </p>
     * 
     * @param indexName
     *        The Amazon OpenSearch Service index name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationDescription withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service type name. This applies to Elasticsearch 6.x and lower versions. For Elasticsearch
     * 7.x and OpenSearch Service 1.x, there's no value for TypeName.
     * </p>
     * 
     * @param typeName
     *        The Amazon OpenSearch Service type name. This applies to Elasticsearch 6.x and lower versions. For
     *        Elasticsearch 7.x and OpenSearch Service 1.x, there's no value for TypeName.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service type name. This applies to Elasticsearch 6.x and lower versions. For Elasticsearch
     * 7.x and OpenSearch Service 1.x, there's no value for TypeName.
     * </p>
     * 
     * @return The Amazon OpenSearch Service type name. This applies to Elasticsearch 6.x and lower versions. For
     *         Elasticsearch 7.x and OpenSearch Service 1.x, there's no value for TypeName.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service type name. This applies to Elasticsearch 6.x and lower versions. For Elasticsearch
     * 7.x and OpenSearch Service 1.x, there's no value for TypeName.
     * </p>
     * 
     * @param typeName
     *        The Amazon OpenSearch Service type name. This applies to Elasticsearch 6.x and lower versions. For
     *        Elasticsearch 7.x and OpenSearch Service 1.x, there's no value for TypeName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationDescription withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index rotation period
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Amazon OpenSearch Service index rotation period
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public void setIndexRotationPeriod(String indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index rotation period
     * </p>
     * 
     * @return The Amazon OpenSearch Service index rotation period
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public String getIndexRotationPeriod() {
        return this.indexRotationPeriod;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index rotation period
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Amazon OpenSearch Service index rotation period
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public AmazonopensearchserviceDestinationDescription withIndexRotationPeriod(String indexRotationPeriod) {
        setIndexRotationPeriod(indexRotationPeriod);
        return this;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index rotation period
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Amazon OpenSearch Service index rotation period
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public AmazonopensearchserviceDestinationDescription withIndexRotationPeriod(AmazonopensearchserviceIndexRotationPeriod indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod.toString();
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

    public void setBufferingHints(AmazonopensearchserviceBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * The buffering options.
     * </p>
     * 
     * @return The buffering options.
     */

    public AmazonopensearchserviceBufferingHints getBufferingHints() {
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

    public AmazonopensearchserviceDestinationDescription withBufferingHints(AmazonopensearchserviceBufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service retry options.
     * </p>
     * 
     * @param retryOptions
     *        The Amazon OpenSearch Service retry options.
     */

    public void setRetryOptions(AmazonopensearchserviceRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service retry options.
     * </p>
     * 
     * @return The Amazon OpenSearch Service retry options.
     */

    public AmazonopensearchserviceRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service retry options.
     * </p>
     * 
     * @param retryOptions
     *        The Amazon OpenSearch Service retry options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationDescription withRetryOptions(AmazonopensearchserviceRetryOptions retryOptions) {
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
     * @see AmazonopensearchserviceS3BackupMode
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
     * @see AmazonopensearchserviceS3BackupMode
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
     * @see AmazonopensearchserviceS3BackupMode
     */

    public AmazonopensearchserviceDestinationDescription withS3BackupMode(String s3BackupMode) {
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
     * @see AmazonopensearchserviceS3BackupMode
     */

    public AmazonopensearchserviceDestinationDescription withS3BackupMode(AmazonopensearchserviceS3BackupMode s3BackupMode) {
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

    public AmazonopensearchserviceDestinationDescription withS3DestinationDescription(S3DestinationDescription s3DestinationDescription) {
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

    public AmazonopensearchserviceDestinationDescription withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
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

    public AmazonopensearchserviceDestinationDescription withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
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

    public AmazonopensearchserviceDestinationDescription withVpcConfigurationDescription(VpcConfigurationDescription vpcConfigurationDescription) {
        setVpcConfigurationDescription(vpcConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * Indicates the method for setting up document ID. The supported methods are Firehose generated document ID and
     * OpenSearch Service generated document ID.
     * </p>
     * 
     * @param documentIdOptions
     *        Indicates the method for setting up document ID. The supported methods are Firehose generated document ID
     *        and OpenSearch Service generated document ID.
     */

    public void setDocumentIdOptions(DocumentIdOptions documentIdOptions) {
        this.documentIdOptions = documentIdOptions;
    }

    /**
     * <p>
     * Indicates the method for setting up document ID. The supported methods are Firehose generated document ID and
     * OpenSearch Service generated document ID.
     * </p>
     * 
     * @return Indicates the method for setting up document ID. The supported methods are Firehose generated document ID
     *         and OpenSearch Service generated document ID.
     */

    public DocumentIdOptions getDocumentIdOptions() {
        return this.documentIdOptions;
    }

    /**
     * <p>
     * Indicates the method for setting up document ID. The supported methods are Firehose generated document ID and
     * OpenSearch Service generated document ID.
     * </p>
     * 
     * @param documentIdOptions
     *        Indicates the method for setting up document ID. The supported methods are Firehose generated document ID
     *        and OpenSearch Service generated document ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationDescription withDocumentIdOptions(DocumentIdOptions documentIdOptions) {
        setDocumentIdOptions(documentIdOptions);
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
        if (getDomainARN() != null)
            sb.append("DomainARN: ").append(getDomainARN()).append(",");
        if (getClusterEndpoint() != null)
            sb.append("ClusterEndpoint: ").append(getClusterEndpoint()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getIndexRotationPeriod() != null)
            sb.append("IndexRotationPeriod: ").append(getIndexRotationPeriod()).append(",");
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
            sb.append("VpcConfigurationDescription: ").append(getVpcConfigurationDescription()).append(",");
        if (getDocumentIdOptions() != null)
            sb.append("DocumentIdOptions: ").append(getDocumentIdOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonopensearchserviceDestinationDescription == false)
            return false;
        AmazonopensearchserviceDestinationDescription other = (AmazonopensearchserviceDestinationDescription) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getDomainARN() == null ^ this.getDomainARN() == null)
            return false;
        if (other.getDomainARN() != null && other.getDomainARN().equals(this.getDomainARN()) == false)
            return false;
        if (other.getClusterEndpoint() == null ^ this.getClusterEndpoint() == null)
            return false;
        if (other.getClusterEndpoint() != null && other.getClusterEndpoint().equals(this.getClusterEndpoint()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getIndexRotationPeriod() == null ^ this.getIndexRotationPeriod() == null)
            return false;
        if (other.getIndexRotationPeriod() != null && other.getIndexRotationPeriod().equals(this.getIndexRotationPeriod()) == false)
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
        if (other.getDocumentIdOptions() == null ^ this.getDocumentIdOptions() == null)
            return false;
        if (other.getDocumentIdOptions() != null && other.getDocumentIdOptions().equals(this.getDocumentIdOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getDomainARN() == null) ? 0 : getDomainARN().hashCode());
        hashCode = prime * hashCode + ((getClusterEndpoint() == null) ? 0 : getClusterEndpoint().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getIndexRotationPeriod() == null) ? 0 : getIndexRotationPeriod().hashCode());
        hashCode = prime * hashCode + ((getBufferingHints() == null) ? 0 : getBufferingHints().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationDescription() == null) ? 0 : getS3DestinationDescription().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getVpcConfigurationDescription() == null) ? 0 : getVpcConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getDocumentIdOptions() == null) ? 0 : getDocumentIdOptions().hashCode());
        return hashCode;
    }

    @Override
    public AmazonopensearchserviceDestinationDescription clone() {
        try {
            return (AmazonopensearchserviceDestinationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.AmazonopensearchserviceDestinationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
