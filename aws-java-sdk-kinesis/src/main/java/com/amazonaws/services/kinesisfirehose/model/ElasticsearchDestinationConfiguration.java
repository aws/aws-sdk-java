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
 * Describes the configuration of a destination in Amazon ES.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ElasticsearchDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticsearchDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

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
     * role specified in <b>RoleARN</b>. For more information, see <a
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
     * new type for an existing index that already has another type, Kinesis Data Firehose returns an error during run
     * time.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * </p>
     */
    private String indexRotationPeriod;
    /**
     * <p>
     * The buffering options. If no value is specified, the default values for <code>ElasticsearchBufferingHints</code>
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
     * Defines how documents should be delivered to Amazon S3. When it is set to <code>FailedDocumentsOnly</code>,
     * Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination,
     * with <code>elasticsearch-failed/</code> appended to the key prefix. When set to <code>AllDocuments</code>,
     * Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents with
     * <code>elasticsearch-failed/</code> appended to the prefix. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup for the
     * Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     */
    private String s3BackupMode;
    /**
     * <p>
     * The configuration for the backup Amazon S3 location.
     * </p>
     */
    private S3DestinationConfiguration s3Configuration;
    /**
     * <p>
     * The data processing configuration.
     * </p>
     */
    private ProcessingConfiguration processingConfiguration;
    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
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

    public ElasticsearchDestinationConfiguration withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon ES domain. The IAM role must have permissions for <code>DescribeElasticsearchDomain</code>,
     * <code>DescribeElasticsearchDomains</code>, and <code>DescribeElasticsearchDomainConfig</code> after assuming the
     * role specified in <b>RoleARN</b>. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon ES domain. The IAM role must have permissions for 
     *        <code>DescribeElasticsearchDomain</code>, <code>DescribeElasticsearchDomains</code>, and
     *        <code>DescribeElasticsearchDomainConfig</code> after assuming the role specified in <b>RoleARN</b>. For
     *        more information, see <a
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
     * role specified in <b>RoleARN</b>. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The ARN of the Amazon ES domain. The IAM role must have permissions for 
     *         <code>DescribeElasticsearchDomain</code>, <code>DescribeElasticsearchDomains</code>, and
     *         <code>DescribeElasticsearchDomainConfig</code> after assuming the role specified in <b>RoleARN</b>. For
     *         more information, see <a
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
     * role specified in <b>RoleARN</b>. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon ES domain. The IAM role must have permissions for 
     *        <code>DescribeElasticsearchDomain</code>, <code>DescribeElasticsearchDomains</code>, and
     *        <code>DescribeElasticsearchDomainConfig</code> after assuming the role specified in <b>RoleARN</b>. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationConfiguration withDomainARN(String domainARN) {
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

    public ElasticsearchDestinationConfiguration withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a
     * new type for an existing index that already has another type, Kinesis Data Firehose returns an error during run
     * time.
     * </p>
     * 
     * @param typeName
     *        The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to
     *        specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an
     *        error during run time.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a
     * new type for an existing index that already has another type, Kinesis Data Firehose returns an error during run
     * time.
     * </p>
     * 
     * @return The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to
     *         specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an
     *         error during run time.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a
     * new type for an existing index that already has another type, Kinesis Data Firehose returns an error during run
     * time.
     * </p>
     * 
     * @param typeName
     *        The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to
     *        specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an
     *        error during run time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationConfiguration withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code>
     *        to facilitate the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for the Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * @see ElasticsearchIndexRotationPeriod
     */

    public void setIndexRotationPeriod(String indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * </p>
     * 
     * @return The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code>
     *         to facilitate the expiration of old data. For more information, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *         for the Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * @see ElasticsearchIndexRotationPeriod
     */

    public String getIndexRotationPeriod() {
        return this.indexRotationPeriod;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code>
     *        to facilitate the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for the Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchIndexRotationPeriod
     */

    public ElasticsearchDestinationConfiguration withIndexRotationPeriod(String indexRotationPeriod) {
        setIndexRotationPeriod(indexRotationPeriod);
        return this;
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code>
     *        to facilitate the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for the Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * @see ElasticsearchIndexRotationPeriod
     */

    public void setIndexRotationPeriod(ElasticsearchIndexRotationPeriod indexRotationPeriod) {
        withIndexRotationPeriod(indexRotationPeriod);
    }

    /**
     * <p>
     * The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code> to
     * facilitate the expiration of old data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation for the
     * Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Elasticsearch index rotation period. Index rotation appends a timestamp to the <code>IndexName</code>
     *        to facilitate the expiration of old data. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-index-rotation">Index Rotation
     *        for the Amazon ES Destination</a>. The default value is <code>OneDay</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchIndexRotationPeriod
     */

    public ElasticsearchDestinationConfiguration withIndexRotationPeriod(ElasticsearchIndexRotationPeriod indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod.toString();
        return this;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, the default values for <code>ElasticsearchBufferingHints</code>
     * are used.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options. If no value is specified, the default values for
     *        <code>ElasticsearchBufferingHints</code> are used.
     */

    public void setBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, the default values for <code>ElasticsearchBufferingHints</code>
     * are used.
     * </p>
     * 
     * @return The buffering options. If no value is specified, the default values for
     *         <code>ElasticsearchBufferingHints</code> are used.
     */

    public ElasticsearchBufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * The buffering options. If no value is specified, the default values for <code>ElasticsearchBufferingHints</code>
     * are used.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options. If no value is specified, the default values for
     *        <code>ElasticsearchBufferingHints</code> are used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationConfiguration withBufferingHints(ElasticsearchBufferingHints bufferingHints) {
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

    public ElasticsearchDestinationConfiguration withRetryOptions(ElasticsearchRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When it is set to <code>FailedDocumentsOnly</code>,
     * Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination,
     * with <code>elasticsearch-failed/</code> appended to the key prefix. When set to <code>AllDocuments</code>,
     * Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents with
     * <code>elasticsearch-failed/</code> appended to the prefix. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup for the
     * Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     * 
     * @param s3BackupMode
     *        Defines how documents should be delivered to Amazon S3. When it is set to <code>FailedDocumentsOnly</code>
     *        , Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3
     *        destination, with <code>elasticsearch-failed/</code> appended to the key prefix. When set to
     *        <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also
     *        writes failed documents with <code>elasticsearch-failed/</code> appended to the prefix. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup for
     *        the Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * @see ElasticsearchS3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When it is set to <code>FailedDocumentsOnly</code>,
     * Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination,
     * with <code>elasticsearch-failed/</code> appended to the key prefix. When set to <code>AllDocuments</code>,
     * Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents with
     * <code>elasticsearch-failed/</code> appended to the prefix. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup for the
     * Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     * 
     * @return Defines how documents should be delivered to Amazon S3. When it is set to
     *         <code>FailedDocumentsOnly</code>, Kinesis Data Firehose writes any documents that could not be indexed to
     *         the configured Amazon S3 destination, with <code>elasticsearch-failed/</code> appended to the key prefix.
     *         When set to <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3,
     *         and also writes failed documents with <code>elasticsearch-failed/</code> appended to the prefix. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup
     *         for the Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * @see ElasticsearchS3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When it is set to <code>FailedDocumentsOnly</code>,
     * Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination,
     * with <code>elasticsearch-failed/</code> appended to the key prefix. When set to <code>AllDocuments</code>,
     * Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents with
     * <code>elasticsearch-failed/</code> appended to the prefix. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup for the
     * Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     * 
     * @param s3BackupMode
     *        Defines how documents should be delivered to Amazon S3. When it is set to <code>FailedDocumentsOnly</code>
     *        , Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3
     *        destination, with <code>elasticsearch-failed/</code> appended to the key prefix. When set to
     *        <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also
     *        writes failed documents with <code>elasticsearch-failed/</code> appended to the prefix. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup for
     *        the Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchS3BackupMode
     */

    public ElasticsearchDestinationConfiguration withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When it is set to <code>FailedDocumentsOnly</code>,
     * Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination,
     * with <code>elasticsearch-failed/</code> appended to the key prefix. When set to <code>AllDocuments</code>,
     * Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents with
     * <code>elasticsearch-failed/</code> appended to the prefix. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup for the
     * Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     * 
     * @param s3BackupMode
     *        Defines how documents should be delivered to Amazon S3. When it is set to <code>FailedDocumentsOnly</code>
     *        , Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3
     *        destination, with <code>elasticsearch-failed/</code> appended to the key prefix. When set to
     *        <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also
     *        writes failed documents with <code>elasticsearch-failed/</code> appended to the prefix. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup for
     *        the Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * @see ElasticsearchS3BackupMode
     */

    public void setS3BackupMode(ElasticsearchS3BackupMode s3BackupMode) {
        withS3BackupMode(s3BackupMode);
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When it is set to <code>FailedDocumentsOnly</code>,
     * Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination,
     * with <code>elasticsearch-failed/</code> appended to the key prefix. When set to <code>AllDocuments</code>,
     * Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents with
     * <code>elasticsearch-failed/</code> appended to the prefix. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup for the
     * Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     * 
     * @param s3BackupMode
     *        Defines how documents should be delivered to Amazon S3. When it is set to <code>FailedDocumentsOnly</code>
     *        , Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3
     *        destination, with <code>elasticsearch-failed/</code> appended to the key prefix. When set to
     *        <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also
     *        writes failed documents with <code>elasticsearch-failed/</code> appended to the prefix. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#es-s3-backup">Amazon S3 Backup for
     *        the Amazon ES Destination</a>. Default value is <code>FailedDocumentsOnly</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElasticsearchS3BackupMode
     */

    public ElasticsearchDestinationConfiguration withS3BackupMode(ElasticsearchS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * <p>
     * The configuration for the backup Amazon S3 location.
     * </p>
     * 
     * @param s3Configuration
     *        The configuration for the backup Amazon S3 location.
     */

    public void setS3Configuration(S3DestinationConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * The configuration for the backup Amazon S3 location.
     * </p>
     * 
     * @return The configuration for the backup Amazon S3 location.
     */

    public S3DestinationConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * The configuration for the backup Amazon S3 location.
     * </p>
     * 
     * @param s3Configuration
     *        The configuration for the backup Amazon S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationConfiguration withS3Configuration(S3DestinationConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
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

    public ElasticsearchDestinationConfiguration withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The Amazon CloudWatch logging options for your delivery stream.
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @return The Amazon CloudWatch logging options for your delivery stream.
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The Amazon CloudWatch logging options for your delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDestinationConfiguration withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
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
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: ").append(getS3BackupMode()).append(",");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
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

        if (obj instanceof ElasticsearchDestinationConfiguration == false)
            return false;
        ElasticsearchDestinationConfiguration other = (ElasticsearchDestinationConfiguration) obj;
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
        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        return hashCode;
    }

    @Override
    public ElasticsearchDestinationConfiguration clone() {
        try {
            return (ElasticsearchDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.ElasticsearchDestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
