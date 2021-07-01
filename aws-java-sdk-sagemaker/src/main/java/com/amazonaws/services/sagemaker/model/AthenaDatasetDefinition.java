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
 * Configuration for Athena Dataset Definition input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AthenaDatasetDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AthenaDatasetDefinition implements Serializable, Cloneable, StructuredPojo {

    private String catalog;

    private String database;

    private String queryString;

    private String workGroup;
    /**
     * <p>
     * The location in Amazon S3 where Athena query results are stored.
     * </p>
     */
    private String outputS3Uri;
    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data generated from an Athena query execution.
     * </p>
     */
    private String kmsKeyId;

    private String outputFormat;

    private String outputCompression;

    /**
     * @param catalog
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * @return
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @param catalog
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaDatasetDefinition withCatalog(String catalog) {
        setCatalog(catalog);
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

    public AthenaDatasetDefinition withDatabase(String database) {
        setDatabase(database);
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

    public AthenaDatasetDefinition withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * @param workGroup
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * @return
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * @param workGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaDatasetDefinition withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where Athena query results are stored.
     * </p>
     * 
     * @param outputS3Uri
     *        The location in Amazon S3 where Athena query results are stored.
     */

    public void setOutputS3Uri(String outputS3Uri) {
        this.outputS3Uri = outputS3Uri;
    }

    /**
     * <p>
     * The location in Amazon S3 where Athena query results are stored.
     * </p>
     * 
     * @return The location in Amazon S3 where Athena query results are stored.
     */

    public String getOutputS3Uri() {
        return this.outputS3Uri;
    }

    /**
     * <p>
     * The location in Amazon S3 where Athena query results are stored.
     * </p>
     * 
     * @param outputS3Uri
     *        The location in Amazon S3 where Athena query results are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaDatasetDefinition withOutputS3Uri(String outputS3Uri) {
        setOutputS3Uri(outputS3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data generated from an Athena query execution.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     *        encrypt data generated from an Athena query execution.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data generated from an Athena query execution.
     * </p>
     * 
     * @return The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses
     *         to encrypt data generated from an Athena query execution.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data generated from an Athena query execution.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     *        encrypt data generated from an Athena query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaDatasetDefinition withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * @param outputFormat
     * @see AthenaResultFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * @return
     * @see AthenaResultFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @param outputFormat
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AthenaResultFormat
     */

    public AthenaDatasetDefinition withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * @param outputFormat
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AthenaResultFormat
     */

    public AthenaDatasetDefinition withOutputFormat(AthenaResultFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
        return this;
    }

    /**
     * @param outputCompression
     * @see AthenaResultCompressionType
     */

    public void setOutputCompression(String outputCompression) {
        this.outputCompression = outputCompression;
    }

    /**
     * @return
     * @see AthenaResultCompressionType
     */

    public String getOutputCompression() {
        return this.outputCompression;
    }

    /**
     * @param outputCompression
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AthenaResultCompressionType
     */

    public AthenaDatasetDefinition withOutputCompression(String outputCompression) {
        setOutputCompression(outputCompression);
        return this;
    }

    /**
     * @param outputCompression
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AthenaResultCompressionType
     */

    public AthenaDatasetDefinition withOutputCompression(AthenaResultCompressionType outputCompression) {
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
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup()).append(",");
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

        if (obj instanceof AthenaDatasetDefinition == false)
            return false;
        AthenaDatasetDefinition other = (AthenaDatasetDefinition) obj;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
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

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Uri() == null) ? 0 : getOutputS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getOutputCompression() == null) ? 0 : getOutputCompression().hashCode());
        return hashCode;
    }

    @Override
    public AthenaDatasetDefinition clone() {
        try {
            return (AthenaDatasetDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AthenaDatasetDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
