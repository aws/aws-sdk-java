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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an update for a destination in Amazon ES.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ElasticsearchDestinationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticsearchDestinationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon ES
     * Configuration API and for indexing documents. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Grant Kinesis Data
     * Firehose Access to an Amazon S3 Destination</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ARN of the Amazon ES domain. The IAM role must have permissions for <code>DescribeElasticsearchDomain</code>,
     * <code>DescribeElasticsearchDomains</code>, and <code>DescribeElasticsearchDomainConfig</code> after assuming the
     * IAM role specified in <code>RoleARN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
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
     * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a
     * new type for an existing index that already has another type, Kinesis Data Firehose returns an error during
     * runtime.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     */
    private String indexRotationPeriod;
    /**
     * <p>
     * The buffering options. If no value is specified, <code>ElasticsearchBufferingHints</code> object default values
     * are used.
     * </p>
     */
    private ElasticsearchBufferingHints bufferingHints;
    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default value
     * is 300 (5 minutes).
     * </p>
     */
    private ElasticsearchRetryOptions retryOptions;
    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     */
    private S3DestinationUpdate s3Update;
    /**
     * <p>
     * The data processing configuration.
     * </p>
     */
    private ProcessingConfiguration processingConfiguration;
    /**
     * <p>
     * The CloudWatch logging options for your delivery stream.
     * </p>
     */
    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon ES
     * Configuration API and for indexing documents. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Grant Kinesis Data
     * Firehose Access to an Amazon S3 Destination</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the
     *        Amazon ES Configuration API and for indexing documents. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Grant Kinesis
     *        Data Firehose Access to an Amazon S3 Destination</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon ES
     * Configuration API and for indexing documents. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Grant Kinesis Data
     * Firehose Access to an Amazon S3 Destination</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the
     *         Amazon ES Configuration API and for indexing documents. For more information, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Grant Kinesis
     *         Data Firehose Access to an Amazon S3 Destination</a> and <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon ES
     * Configuration API and for indexing documents. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Grant Kinesis Data
     * Firehose Access to an Amazon S3 Destination</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the
     *        Amazon ES Configuration API and for indexing documents. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Grant Kinesis
     *        Data Firehose Access to an Amazon S3 Destination</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon ES domain. The IAM role must have permissions for <code>DescribeElasticsearchDomain</code>,
     * <code>DescribeElasticsearchDomains</code>, and <code>DescribeElasticsearchDomainConfig</code> after assuming the
     * IAM role specified in <code>RoleARN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon ES domain. The IAM role must have permissions for 
     *        <code>DescribeElasticsearchDomain</code>, <code>DescribeElasticsearchDomains</code>, and
     *        <code>DescribeElasticsearchDomainConfig</code> after assuming the IAM role specified in
     *        <code>RoleARN</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     */

    public void setDomainARN(String domainARN) {
        this.domainARN = domainARN;
    }

    /**
     * <p>
     * The ARN of the Amazon ES domain. The IAM role must have permissions for <code>DescribeElasticsearchDomain</code>,
     * <code>DescribeElasticsearchDomains</code>, and <code>DescribeElasticsearchDomainConfig</code> after assuming the
     * IAM role specified in <code>RoleARN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The ARN of the Amazon ES domain. The IAM role must have permissions for 
     *         <code>DescribeElasticsearchDomain</code>, <code>DescribeElasticsearchDomains</code>, and
     *         <code>DescribeElasticsearchDomainConfig</code> after assuming the IAM role specified in
     *         <code>RoleARN</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     */

    public String getDomainARN() {
        return this.domainARN;
    }

    /**
     * <p>
     * The ARN of the Amazon ES domain. The IAM role must have permissions for <code>DescribeElasticsearchDomain</code>,
     * <code>DescribeElasticsearchDomains</code>, and <code>DescribeElasticsearchDomainConfig</code> after assuming the
     * IAM role specified in <code>RoleARN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon ES domain. The IAM role must have permissions for 
     *        <code>DescribeElasticsearchDomain</code>, <code>DescribeElasticsearchDomains</code>, and
     *        <code>DescribeElasticsearchDomainConfig</code> after assuming the IAM role specified in
     *        <code>RoleARN</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
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
     * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a
     * new type for an existing index that already has another type, Kinesis Data Firehose returns an error during
     * runtime.
     * </p>
     * 
     * @param typeName
     *        The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to
     *        specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an
     *        error during runtime.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a
     * new type for an existing index that already has another type, Kinesis Data Firehose returns an error during
     * runtime.
     * </p>
     * 
     * @return The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to
     *         specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an
     *         error during runtime.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a
     * new type for an existing index that already has another type, Kinesis Data Firehose returns an error during
     * runtime.
     * </p>
     * 
     * @param typeName
     *        The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to
     *        specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an
     *        error during runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     *        facilitate the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for the Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * @see ElasticsearchIndexRotationPeriod
     */

    public void setIndexRotationPeriod(String indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     * 
     * @return The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     *         facilitate the expiration of old data. For more information, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *         for the Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * @see ElasticsearchIndexRotationPeriod
     */

    public String getIndexRotationPeriod() {
        return this.indexRotationPeriod;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     *        facilitate the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for the Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchIndexRotationPeriod
     */

    public ElasticsearchDestinationUpdate withIndexRotationPeriod(String indexRotationPeriod) {
        setIndexRotationPeriod(indexRotationPeriod);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     *        facilitate the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for the Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * @see ElasticsearchIndexRotationPeriod
     */

    public void setIndexRotationPeriod(ElasticsearchIndexRotationPeriod indexRotationPeriod) {
        withIndexRotationPeriod(indexRotationPeriod);
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to <code>IndexName</code> to
     *        facilitate the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for the Amazon ES Destination</a>. Default value is <code>OneDay</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchIndexRotationPeriod
     */

    public ElasticsearchDestinationUpdate withIndexRotationPeriod(ElasticsearchIndexRotationPeriod indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod.toString();
        return this;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, <code>ElasticsearchBufferingHints</code> object default values
     * are used.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options. If no value is specified, <code>ElasticsearchBufferingHints</code> object default
     *        values are used.
     */

    public void setBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, <code>ElasticsearchBufferingHints</code> object default values
     * are used.
     * </p>
     * 
     * @return The buffering options. If no value is specified, <code>ElasticsearchBufferingHints</code> object default
     *         values are used.
     */

    public ElasticsearchBufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, <code>ElasticsearchBufferingHints</code> object default values
     * are used.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options. If no value is specified, <code>ElasticsearchBufferingHints</code> object default
     *        values are used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default value
     * is 300 (5 minutes).
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default
     *        value is 300 (5 minutes).
     */

    public void setRetryOptions(ElasticsearchRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default value
     * is 300 (5 minutes).
     * </p>
     * 
     * @return The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default
     *         value is 300 (5 minutes).
     */

    public ElasticsearchRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default value
     * is 300 (5 minutes).
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default
     *        value is 300 (5 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withRetryOptions(ElasticsearchRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * 
     * @param s3Update
     *        The Amazon S3 destination.
     */

    public void setS3Update(S3DestinationUpdate s3Update) {
        this.s3Update = s3Update;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * 
     * @return The Amazon S3 destination.
     */

    public S3DestinationUpdate getS3Update() {
        return this.s3Update;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * 
     * @param s3Update
     *        The Amazon S3 destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withS3Update(S3DestinationUpdate s3Update) {
        setS3Update(s3Update);
        return this;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @param processingConfiguration
     *        The data processing configuration.
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @return The data processing configuration.
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @param processingConfiguration
     *        The data processing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * <p>
     * The CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The CloudWatch logging options for your delivery stream.
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @return The CloudWatch logging options for your delivery stream.
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The CloudWatch logging options for your delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationUpdate withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
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
        if (getDomainARN() != null)
            sb.append("DomainARN: ").append(getDomainARN()).append(",");
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
        hashCode = prime * hashCode + ((getDomainARN() == null) ? 0 : getDomainARN().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getIndexRotationPeriod() == null) ? 0 : getIndexRotationPeriod().hashCode());
        hashCode = prime * hashCode + ((getBufferingHints() == null) ? 0 : getBufferingHints().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getS3Update() == null) ? 0 : getS3Update().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.ElasticsearchDestinationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
