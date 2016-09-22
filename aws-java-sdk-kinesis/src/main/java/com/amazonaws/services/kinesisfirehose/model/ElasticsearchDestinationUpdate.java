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
 * Describes an update for a destination in Amazon ES.
 * </p>
 */
public class ElasticsearchDestinationUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing
     * documents. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Amazon S3 Bucket
     * Access</a>.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ARN of the Amazon ES domain. The IAM role must have permission for DescribeElasticsearchDomain,
     * DescribeElasticsearchDomains , and DescribeElasticsearchDomainConfig after assuming <b>RoleARN</b>.
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
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate the
     * expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for
     * Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     */
    private String indexRotationPeriod;
    /**
     * <p>
     * Buffering options. If no value is specified, <b>ElasticsearchBufferingHints</b> object default values are used.
     * </p>
     */
    private ElasticsearchBufferingHints bufferingHints;
    /**
     * <p>
     * Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon ES. Default value
     * is 300 (5 minutes).
     * </p>
     */
    private ElasticsearchRetryOptions retryOptions;

    private S3DestinationUpdate s3Update;
    /**
     * <p>
     * Describes CloudWatch logging options for your delivery stream.
     * </p>
     */
    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    /**
     * <p>
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing
     * documents. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Amazon S3 Bucket
     * Access</a>.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for
     *        indexing documents. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Amazon S3
     *        Bucket Access</a>.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing
     * documents. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Amazon S3 Bucket
     * Access</a>.
     * </p>
     * 
     * @return The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for
     *         indexing documents. For more information, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Amazon S3
     *         Bucket Access</a>.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing
     * documents. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Amazon S3 Bucket
     * Access</a>.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for
     *        indexing documents. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Amazon S3
     *        Bucket Access</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon ES domain. The IAM role must have permission for DescribeElasticsearchDomain,
     * DescribeElasticsearchDomains , and DescribeElasticsearchDomainConfig after assuming <b>RoleARN</b>.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon ES domain. The IAM role must have permission for DescribeElasticsearchDomain,
     *        DescribeElasticsearchDomains , and DescribeElasticsearchDomainConfig after assuming <b>RoleARN</b>.
     */

    public void setDomainARN(String domainARN) {
        this.domainARN = domainARN;
    }

    /**
     * <p>
     * The ARN of the Amazon ES domain. The IAM role must have permission for DescribeElasticsearchDomain,
     * DescribeElasticsearchDomains , and DescribeElasticsearchDomainConfig after assuming <b>RoleARN</b>.
     * </p>
     * 
     * @return The ARN of the Amazon ES domain. The IAM role must have permission for DescribeElasticsearchDomain,
     *         DescribeElasticsearchDomains , and DescribeElasticsearchDomainConfig after assuming <b>RoleARN</b>.
     */

    public String getDomainARN() {
        return this.domainARN;
    }

    /**
     * <p>
     * The ARN of the Amazon ES domain. The IAM role must have permission for DescribeElasticsearchDomain,
     * DescribeElasticsearchDomains , and DescribeElasticsearchDomainConfig after assuming <b>RoleARN</b>.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon ES domain. The IAM role must have permission for DescribeElasticsearchDomain,
     *        DescribeElasticsearchDomains , and DescribeElasticsearchDomainConfig after assuming <b>RoleARN</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withDomainARN(String domainARN) {
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

    public ElasticsearchDestinationUpdate withIndexName(String indexName) {
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

    public ElasticsearchDestinationUpdate withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate the
     * expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for
     * Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate
     *        the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * @see ElasticsearchIndexRotationPeriod
     */

    public void setIndexRotationPeriod(String indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate the
     * expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for
     * Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     * 
     * @return The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to
     *         facilitate the expiration of old data. For more information, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *         for Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * @see ElasticsearchIndexRotationPeriod
     */

    public String getIndexRotationPeriod() {
        return this.indexRotationPeriod;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate the
     * expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for
     * Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate
     *        the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchIndexRotationPeriod
     */

    public ElasticsearchDestinationUpdate withIndexRotationPeriod(String indexRotationPeriod) {
        setIndexRotationPeriod(indexRotationPeriod);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate the
     * expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for
     * Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate
     *        the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * @see ElasticsearchIndexRotationPeriod
     */

    public void setIndexRotationPeriod(ElasticsearchIndexRotationPeriod indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod.toString();
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate the
     * expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for
     * Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate
     *        the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for Amazon Elasticsearch Service Destination</a>. Default value is <code>OneDay</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchIndexRotationPeriod
     */

    public ElasticsearchDestinationUpdate withIndexRotationPeriod(ElasticsearchIndexRotationPeriod indexRotationPeriod) {
        setIndexRotationPeriod(indexRotationPeriod);
        return this;
    }

    /**
     * <p>
     * Buffering options. If no value is specified, <b>ElasticsearchBufferingHints</b> object default values are used.
     * </p>
     * 
     * @param bufferingHints
     *        Buffering options. If no value is specified, <b>ElasticsearchBufferingHints</b> object default values are
     *        used.
     */

    public void setBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * Buffering options. If no value is specified, <b>ElasticsearchBufferingHints</b> object default values are used.
     * </p>
     * 
     * @return Buffering options. If no value is specified, <b>ElasticsearchBufferingHints</b> object default values are
     *         used.
     */

    public ElasticsearchBufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * Buffering options. If no value is specified, <b>ElasticsearchBufferingHints</b> object default values are used.
     * </p>
     * 
     * @param bufferingHints
     *        Buffering options. If no value is specified, <b>ElasticsearchBufferingHints</b> object default values are
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon ES. Default value
     * is 300 (5 minutes).
     * </p>
     * 
     * @param retryOptions
     *        Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon ES. Default
     *        value is 300 (5 minutes).
     */

    public void setRetryOptions(ElasticsearchRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon ES. Default value
     * is 300 (5 minutes).
     * </p>
     * 
     * @return Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon ES. Default
     *         value is 300 (5 minutes).
     */

    public ElasticsearchRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon ES. Default value
     * is 300 (5 minutes).
     * </p>
     * 
     * @param retryOptions
     *        Configures retry behavior in the event that Firehose is unable to deliver documents to Amazon ES. Default
     *        value is 300 (5 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withRetryOptions(ElasticsearchRetryOptions retryOptions) {
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

    public ElasticsearchDestinationUpdate withS3Update(S3DestinationUpdate s3Update) {
        setS3Update(s3Update);
        return this;
    }

    /**
     * <p>
     * Describes CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        Describes CloudWatch logging options for your delivery stream.
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * Describes CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @return Describes CloudWatch logging options for your delivery stream.
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * Describes CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        Describes CloudWatch logging options for your delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
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
        if (getS3Update() != null)
            sb.append("S3Update: " + getS3Update() + ",");
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

        if (obj instanceof ElasticsearchDestinationUpdate == false)
            return false;
        ElasticsearchDestinationUpdate other = (ElasticsearchDestinationUpdate) obj;
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
        if (other.getS3Update() == null ^ this.getS3Update() == null)
            return false;
        if (other.getS3Update() != null && other.getS3Update().equals(this.getS3Update()) == false)
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
        hashCode = prime * hashCode + ((getS3Update() == null) ? 0 : getS3Update().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        return hashCode;
    }

    @Override
    public ElasticsearchDestinationUpdate clone() {
        try {
            return (ElasticsearchDestinationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
