/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for Redshift Dataset Definition input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RedshiftDatasetDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftDatasetDefinition implements Serializable, Cloneable, StructuredPojo {

    private String clusterId;

    private String database;

    private String dbUser;

    private String queryString;
    /**
     * <p>
     * The IAM role attached to your Redshift cluster that Amazon SageMaker uses to generate datasets.
     * </p>
     */
    private String clusterRoleArn;
    /**
     * <p>
     * The location in Amazon S3 where the Redshift query results are stored.
     * </p>
     */
    private String outputS3Uri;
    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data from a Redshift execution.
     * </p>
     */
    private String kmsKeyId;

    private String outputFormat;

    private String outputCompression;

    /**
     * @param clusterId
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * @return
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @param clusterId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDatasetDefinition withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * @param database
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * @return
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * @param database
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDatasetDefinition withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * @param dbUser
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * @return
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * @param dbUser
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDatasetDefinition withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * @param queryString
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * @return
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * @param queryString
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDatasetDefinition withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The IAM role attached to your Redshift cluster that Amazon SageMaker uses to generate datasets.
     * </p>
     * 
     * @param clusterRoleArn
     *        The IAM role attached to your Redshift cluster that Amazon SageMaker uses to generate datasets.
     */

    public void setClusterRoleArn(String clusterRoleArn) {
        this.clusterRoleArn = clusterRoleArn;
    }

    /**
     * <p>
     * The IAM role attached to your Redshift cluster that Amazon SageMaker uses to generate datasets.
     * </p>
     * 
     * @return The IAM role attached to your Redshift cluster that Amazon SageMaker uses to generate datasets.
     */

    public String getClusterRoleArn() {
        return this.clusterRoleArn;
    }

    /**
     * <p>
     * The IAM role attached to your Redshift cluster that Amazon SageMaker uses to generate datasets.
     * </p>
     * 
     * @param clusterRoleArn
     *        The IAM role attached to your Redshift cluster that Amazon SageMaker uses to generate datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDatasetDefinition withClusterRoleArn(String clusterRoleArn) {
        setClusterRoleArn(clusterRoleArn);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where the Redshift query results are stored.
     * </p>
     * 
     * @param outputS3Uri
     *        The location in Amazon S3 where the Redshift query results are stored.
     */

    public void setOutputS3Uri(String outputS3Uri) {
        this.outputS3Uri = outputS3Uri;
    }

    /**
     * <p>
     * The location in Amazon S3 where the Redshift query results are stored.
     * </p>
     * 
     * @return The location in Amazon S3 where the Redshift query results are stored.
     */

    public String getOutputS3Uri() {
        return this.outputS3Uri;
    }

    /**
     * <p>
     * The location in Amazon S3 where the Redshift query results are stored.
     * </p>
     * 
     * @param outputS3Uri
     *        The location in Amazon S3 where the Redshift query results are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDatasetDefinition withOutputS3Uri(String outputS3Uri) {
        setOutputS3Uri(outputS3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data from a Redshift execution.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     *        encrypt data from a Redshift execution.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data from a Redshift execution.
     * </p>
     * 
     * @return The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses
     *         to encrypt data from a Redshift execution.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data from a Redshift execution.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     *        encrypt data from a Redshift execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDatasetDefinition withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * @param outputFormat
     * @see RedshiftResultFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * @return
     * @see RedshiftResultFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @param outputFormat
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedshiftResultFormat
     */

    public RedshiftDatasetDefinition withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * @param outputFormat
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedshiftResultFormat
     */

    public RedshiftDatasetDefinition withOutputFormat(RedshiftResultFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
        return this;
    }

    /**
     * @param outputCompression
     * @see RedshiftResultCompressionType
     */

    public void setOutputCompression(String outputCompression) {
        this.outputCompression = outputCompression;
    }

    /**
     * @return
     * @see RedshiftResultCompressionType
     */

    public String getOutputCompression() {
        return this.outputCompression;
    }

    /**
     * @param outputCompression
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedshiftResultCompressionType
     */

    public RedshiftDatasetDefinition withOutputCompression(String outputCompression) {
        setOutputCompression(outputCompression);
        return this;
    }

    /**
     * @param outputCompression
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedshiftResultCompressionType
     */

    public RedshiftDatasetDefinition withOutputCompression(RedshiftResultCompressionType outputCompression) {
        this.outputCompression = outputCompression.toString();
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getDbUser() != null)
            sb.append("DbUser: ").append(getDbUser()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getClusterRoleArn() != null)
            sb.append("ClusterRoleArn: ").append(getClusterRoleArn()).append(",");
        if (getOutputS3Uri() != null)
            sb.append("OutputS3Uri: ").append(getOutputS3Uri()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat()).append(",");
        if (getOutputCompression() != null)
            sb.append("OutputCompression: ").append(getOutputCompression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftDatasetDefinition == false)
            return false;
        RedshiftDatasetDefinition other = (RedshiftDatasetDefinition) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getClusterRoleArn() == null ^ this.getClusterRoleArn() == null)
            return false;
        if (other.getClusterRoleArn() != null && other.getClusterRoleArn().equals(this.getClusterRoleArn()) == false)
            return false;
        if (other.getOutputS3Uri() == null ^ this.getOutputS3Uri() == null)
            return false;
        if (other.getOutputS3Uri() != null && other.getOutputS3Uri().equals(this.getOutputS3Uri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getOutputCompression() == null ^ this.getOutputCompression() == null)
            return false;
        if (other.getOutputCompression() != null && other.getOutputCompression().equals(this.getOutputCompression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getClusterRoleArn() == null) ? 0 : getClusterRoleArn().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Uri() == null) ? 0 : getOutputS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getOutputCompression() == null) ? 0 : getOutputCompression().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftDatasetDefinition clone() {
        try {
            return (RedshiftDatasetDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RedshiftDatasetDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
