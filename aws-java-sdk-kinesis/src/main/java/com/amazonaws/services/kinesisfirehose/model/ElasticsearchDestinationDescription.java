/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The destination description in Amazon ES.
 * </p>
 */
public class ElasticsearchDestinationDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ARN of the Amazon ES domain.
     * </p>
     */
    private String domainARN;
    /**
     * <p>
     * The Elasticsearch index name.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The Elasticsearch type name.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The Elasticsearch index rotation period
     * </p>
     */
    private String indexRotationPeriod;
    /**
     * <p>
     * Buffering options.
     * </p>
     */
    private ElasticsearchBufferingHints bufferingHints;
    /**
     * <p>
     * Elasticsearch retry options.
     * </p>
     */
    private ElasticsearchRetryOptions retryOptions;
    /**
     * <p>
     * Amazon S3 backup mode.
     * </p>
     */
    private String s3BackupMode;

    private S3DestinationDescription s3DestinationDescription;
    /**
     * <p>
     * CloudWatch logging options.
     * </p>
     */
    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @return The ARN of the AWS credentials.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationDescription withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon ES domain.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon ES domain.
     */

    public void setDomainARN(String domainARN) {
        this.domainARN = domainARN;
    }

    /**
     * <p>
     * The ARN of the Amazon ES domain.
     * </p>
     * 
     * @return The ARN of the Amazon ES domain.
     */

    public String getDomainARN() {
        return this.domainARN;
    }

    /**
     * <p>
     * The ARN of the Amazon ES domain.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon ES domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationDescription withDomainARN(String domainARN) {
        setDomainARN(domainARN);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch index name.
     * </p>
     * 
     * @param indexName
     *        The Elasticsearch index name.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The Elasticsearch index name.
     * </p>
     * 
     * @return The Elasticsearch index name.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The Elasticsearch index name.
     * </p>
     * 
     * @param indexName
     *        The Elasticsearch index name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationDescription withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch type name.
     * </p>
     * 
     * @param typeName
     *        The Elasticsearch type name.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The Elasticsearch type name.
     * </p>
     * 
     * @return The Elasticsearch type name.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The Elasticsearch type name.
     * </p>
     * 
     * @param typeName
     *        The Elasticsearch type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationDescription withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period
     * @see ElasticsearchIndexRotationPeriod
     */

    public void setIndexRotationPeriod(String indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period
     * </p>
     * 
     * @return The Elasticsearch index rotation period
     * @see ElasticsearchIndexRotationPeriod
     */

    public String getIndexRotationPeriod() {
        return this.indexRotationPeriod;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchIndexRotationPeriod
     */

    public ElasticsearchDestinationDescription withIndexRotationPeriod(String indexRotationPeriod) {
        setIndexRotationPeriod(indexRotationPeriod);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period
     * @see ElasticsearchIndexRotationPeriod
     */

    public void setIndexRotationPeriod(ElasticsearchIndexRotationPeriod indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod.toString();
    }

    /**
     * <p>
     * The Elasticsearch index rotation period
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchIndexRotationPeriod
     */

    public ElasticsearchDestinationDescription withIndexRotationPeriod(ElasticsearchIndexRotationPeriod indexRotationPeriod) {
        setIndexRotationPeriod(indexRotationPeriod);
        return this;
    }

    /**
     * <p>
     * Buffering options.
     * </p>
     * 
     * @param bufferingHints
     *        Buffering options.
     */

    public void setBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * Buffering options.
     * </p>
     * 
     * @return Buffering options.
     */

    public ElasticsearchBufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * Buffering options.
     * </p>
     * 
     * @param bufferingHints
     *        Buffering options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationDescription withBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * Elasticsearch retry options.
     * </p>
     * 
     * @param retryOptions
     *        Elasticsearch retry options.
     */

    public void setRetryOptions(ElasticsearchRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * Elasticsearch retry options.
     * </p>
     * 
     * @return Elasticsearch retry options.
     */

    public ElasticsearchRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * Elasticsearch retry options.
     * </p>
     * 
     * @param retryOptions
     *        Elasticsearch retry options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationDescription withRetryOptions(ElasticsearchRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        Amazon S3 backup mode.
     * @see ElasticsearchS3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * Amazon S3 backup mode.
     * </p>
     * 
     * @return Amazon S3 backup mode.
     * @see ElasticsearchS3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        Amazon S3 backup mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchS3BackupMode
     */

    public ElasticsearchDestinationDescription withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        Amazon S3 backup mode.
     * @see ElasticsearchS3BackupMode
     */

    public void setS3BackupMode(ElasticsearchS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
    }

    /**
     * <p>
     * Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        Amazon S3 backup mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchS3BackupMode
     */

    public ElasticsearchDestinationDescription withS3BackupMode(ElasticsearchS3BackupMode s3BackupMode) {
        setS3BackupMode(s3BackupMode);
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

    public ElasticsearchDestinationDescription withS3DestinationDescription(S3DestinationDescription s3DestinationDescription) {
        setS3DestinationDescription(s3DestinationDescription);
        return this;
    }

    /**
     * <p>
     * CloudWatch logging options.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        CloudWatch logging options.
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * CloudWatch logging options.
     * </p>
     * 
     * @return CloudWatch logging options.
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * CloudWatch logging options.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        CloudWatch logging options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationDescription withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getDomainARN() != null)
            sb.append("DomainARN: " + getDomainARN() + ",");
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getTypeName() != null)
            sb.append("TypeName: " + getTypeName() + ",");
        if (getIndexRotationPeriod() != null)
            sb.append("IndexRotationPeriod: " + getIndexRotationPeriod() + ",");
        if (getBufferingHints() != null)
            sb.append("BufferingHints: " + getBufferingHints() + ",");
        if (getRetryOptions() != null)
            sb.append("RetryOptions: " + getRetryOptions() + ",");
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: " + getS3BackupMode() + ",");
        if (getS3DestinationDescription() != null)
            sb.append("S3DestinationDescription: " + getS3DestinationDescription() + ",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: " + getCloudWatchLoggingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticsearchDestinationDescription == false)
            return false;
        ElasticsearchDestinationDescription other = (ElasticsearchDestinationDescription) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getDomainARN() == null ^ this.getDomainARN() == null)
            return false;
        if (other.getDomainARN() != null && other.getDomainARN().equals(this.getDomainARN()) == false)
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
        hashCode = prime * hashCode + ((getDomainARN() == null) ? 0 : getDomainARN().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getIndexRotationPeriod() == null) ? 0 : getIndexRotationPeriod().hashCode());
        hashCode = prime * hashCode + ((getBufferingHints() == null) ? 0 : getBufferingHints().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationDescription() == null) ? 0 : getS3DestinationDescription().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        return hashCode;
    }

    @Override
    public ElasticsearchDestinationDescription clone() {
        try {
            return (ElasticsearchDestinationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
