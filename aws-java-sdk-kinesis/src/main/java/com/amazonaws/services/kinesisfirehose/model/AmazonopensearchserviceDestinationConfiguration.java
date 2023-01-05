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
 * Describes the configuration of a destination in Amazon OpenSearch Service
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/AmazonopensearchserviceDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonopensearchserviceDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon
     * OpenSearch Service Configuration API and for indexing documents.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ARN of the Amazon OpenSearch Service domain. The IAM role must have permissions for
     * DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after assuming
     * the role specified in RoleARN.
     * </p>
     */
    private String domainARN;
    /**
     * <p>
     * The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the DomainARN
     * field.
     * </p>
     */
    private String clusterEndpoint;
    /**
     * <p>
     * The ElasticsearAmazon OpenSearch Service index name.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The Amazon OpenSearch Service type name. For Elasticsearch 6.x, there can be only one type per index. If you try
     * to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error
     * during run time.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The Amazon OpenSearch Service index rotation period. Index rotation appends a timestamp to the IndexName to
     * facilitate the expiration of old data.
     * </p>
     */
    private String indexRotationPeriod;
    /**
     * <p>
     * The buffering options. If no value is specified, the default values for AmazonopensearchserviceBufferingHints are
     * used.
     * </p>
     */
    private AmazonopensearchserviceBufferingHints bufferingHints;
    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon OpenSearch Service. The
     * default value is 300 (5 minutes).
     * </p>
     */
    private AmazonopensearchserviceRetryOptions retryOptions;
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
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon
     * OpenSearch Service Configuration API and for indexing documents.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the
     *        Amazon OpenSearch Service Configuration API and for indexing documents.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon
     * OpenSearch Service Configuration API and for indexing documents.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the
     *         Amazon OpenSearch Service Configuration API and for indexing documents.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon
     * OpenSearch Service Configuration API and for indexing documents.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the
     *        Amazon OpenSearch Service Configuration API and for indexing documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon OpenSearch Service domain. The IAM role must have permissions for
     * DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after assuming
     * the role specified in RoleARN.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon OpenSearch Service domain. The IAM role must have permissions for
     *        DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after
     *        assuming the role specified in RoleARN.
     */

    public void setDomainARN(String domainARN) {
        this.domainARN = domainARN;
    }

    /**
     * <p>
     * The ARN of the Amazon OpenSearch Service domain. The IAM role must have permissions for
     * DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after assuming
     * the role specified in RoleARN.
     * </p>
     * 
     * @return The ARN of the Amazon OpenSearch Service domain. The IAM role must have permissions for
     *         DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after
     *         assuming the role specified in RoleARN.
     */

    public String getDomainARN() {
        return this.domainARN;
    }

    /**
     * <p>
     * The ARN of the Amazon OpenSearch Service domain. The IAM role must have permissions for
     * DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after assuming
     * the role specified in RoleARN.
     * </p>
     * 
     * @param domainARN
     *        The ARN of the Amazon OpenSearch Service domain. The IAM role must have permissions for
     *        DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after
     *        assuming the role specified in RoleARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withDomainARN(String domainARN) {
        setDomainARN(domainARN);
        return this;
    }

    /**
     * <p>
     * The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the DomainARN
     * field.
     * </p>
     * 
     * @param clusterEndpoint
     *        The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the
     *        DomainARN field.
     */

    public void setClusterEndpoint(String clusterEndpoint) {
        this.clusterEndpoint = clusterEndpoint;
    }

    /**
     * <p>
     * The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the DomainARN
     * field.
     * </p>
     * 
     * @return The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the
     *         DomainARN field.
     */

    public String getClusterEndpoint() {
        return this.clusterEndpoint;
    }

    /**
     * <p>
     * The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the DomainARN
     * field.
     * </p>
     * 
     * @param clusterEndpoint
     *        The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the
     *        DomainARN field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withClusterEndpoint(String clusterEndpoint) {
        setClusterEndpoint(clusterEndpoint);
        return this;
    }

    /**
     * <p>
     * The ElasticsearAmazon OpenSearch Service index name.
     * </p>
     * 
     * @param indexName
     *        The ElasticsearAmazon OpenSearch Service index name.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The ElasticsearAmazon OpenSearch Service index name.
     * </p>
     * 
     * @return The ElasticsearAmazon OpenSearch Service index name.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The ElasticsearAmazon OpenSearch Service index name.
     * </p>
     * 
     * @param indexName
     *        The ElasticsearAmazon OpenSearch Service index name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service type name. For Elasticsearch 6.x, there can be only one type per index. If you try
     * to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error
     * during run time.
     * </p>
     * 
     * @param typeName
     *        The Amazon OpenSearch Service type name. For Elasticsearch 6.x, there can be only one type per index. If
     *        you try to specify a new type for an existing index that already has another type, Kinesis Data Firehose
     *        returns an error during run time.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service type name. For Elasticsearch 6.x, there can be only one type per index. If you try
     * to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error
     * during run time.
     * </p>
     * 
     * @return The Amazon OpenSearch Service type name. For Elasticsearch 6.x, there can be only one type per index. If
     *         you try to specify a new type for an existing index that already has another type, Kinesis Data Firehose
     *         returns an error during run time.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service type name. For Elasticsearch 6.x, there can be only one type per index. If you try
     * to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error
     * during run time.
     * </p>
     * 
     * @param typeName
     *        The Amazon OpenSearch Service type name. For Elasticsearch 6.x, there can be only one type per index. If
     *        you try to specify a new type for an existing index that already has another type, Kinesis Data Firehose
     *        returns an error during run time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index rotation period. Index rotation appends a timestamp to the IndexName to
     * facilitate the expiration of old data.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Amazon OpenSearch Service index rotation period. Index rotation appends a timestamp to the IndexName
     *        to facilitate the expiration of old data.
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public void setIndexRotationPeriod(String indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index rotation period. Index rotation appends a timestamp to the IndexName to
     * facilitate the expiration of old data.
     * </p>
     * 
     * @return The Amazon OpenSearch Service index rotation period. Index rotation appends a timestamp to the IndexName
     *         to facilitate the expiration of old data.
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public String getIndexRotationPeriod() {
        return this.indexRotationPeriod;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index rotation period. Index rotation appends a timestamp to the IndexName to
     * facilitate the expiration of old data.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Amazon OpenSearch Service index rotation period. Index rotation appends a timestamp to the IndexName
     *        to facilitate the expiration of old data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public AmazonopensearchserviceDestinationConfiguration withIndexRotationPeriod(String indexRotationPeriod) {
        setIndexRotationPeriod(indexRotationPeriod);
        return this;
    }

    /**
     * <p>
     * The Amazon OpenSearch Service index rotation period. Index rotation appends a timestamp to the IndexName to
     * facilitate the expiration of old data.
     * </p>
     * 
     * @param indexRotationPeriod
     *        The Amazon OpenSearch Service index rotation period. Index rotation appends a timestamp to the IndexName
     *        to facilitate the expiration of old data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public AmazonopensearchserviceDestinationConfiguration withIndexRotationPeriod(AmazonopensearchserviceIndexRotationPeriod indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod.toString();
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

    public void setBufferingHints(AmazonopensearchserviceBufferingHints bufferingHints) {
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

    public AmazonopensearchserviceBufferingHints getBufferingHints() {
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

    public AmazonopensearchserviceDestinationConfiguration withBufferingHints(AmazonopensearchserviceBufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon OpenSearch Service. The
     * default value is 300 (5 minutes).
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon OpenSearch
     *        Service. The default value is 300 (5 minutes).
     */

    public void setRetryOptions(AmazonopensearchserviceRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon OpenSearch Service. The
     * default value is 300 (5 minutes).
     * </p>
     * 
     * @return The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon OpenSearch
     *         Service. The default value is 300 (5 minutes).
     */

    public AmazonopensearchserviceRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon OpenSearch Service. The
     * default value is 300 (5 minutes).
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon OpenSearch
     *        Service. The default value is 300 (5 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withRetryOptions(AmazonopensearchserviceRetryOptions retryOptions) {
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
     * @see AmazonopensearchserviceS3BackupMode
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
     * @see AmazonopensearchserviceS3BackupMode
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
     * @see AmazonopensearchserviceS3BackupMode
     */

    public AmazonopensearchserviceDestinationConfiguration withS3BackupMode(String s3BackupMode) {
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
     * @see AmazonopensearchserviceS3BackupMode
     */

    public AmazonopensearchserviceDestinationConfiguration withS3BackupMode(AmazonopensearchserviceS3BackupMode s3BackupMode) {
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

    public AmazonopensearchserviceDestinationConfiguration withS3Configuration(S3DestinationConfiguration s3Configuration) {
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

    public AmazonopensearchserviceDestinationConfiguration withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
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

    public AmazonopensearchserviceDestinationConfiguration withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
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

    public AmazonopensearchserviceDestinationConfiguration withVpcConfiguration(VpcConfiguration vpcConfiguration) {
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

        if (obj instanceof AmazonopensearchserviceDestinationConfiguration == false)
            return false;
        AmazonopensearchserviceDestinationConfiguration other = (AmazonopensearchserviceDestinationConfiguration) obj;
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
        hashCode = prime * hashCode + ((getDomainARN() == null) ? 0 : getDomainARN().hashCode());
        hashCode = prime * hashCode + ((getClusterEndpoint() == null) ? 0 : getClusterEndpoint().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getIndexRotationPeriod() == null) ? 0 : getIndexRotationPeriod().hashCode());
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
    public AmazonopensearchserviceDestinationConfiguration clone() {
        try {
            return (AmazonopensearchserviceDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.AmazonopensearchserviceDestinationConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
