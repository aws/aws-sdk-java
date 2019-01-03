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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/S3Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Settings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     */
    private String serviceAccessRoleArn;
    /**
     * <p>
     * The external table definition.
     * </p>
     */
    private String externalTableDefinition;
    /**
     * <p>
     * The delimiter used to separate rows in the source files. The default is a carriage return (\n).
     * </p>
     */
    private String csvRowDelimiter;
    /**
     * <p>
     * The delimiter used to separate columns in the source files. The default is a comma.
     * </p>
     */
    private String csvDelimiter;
    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     * &lt;bucketFolder&gt;/&lt;schema_name&gt;/&lt;table_name&gt;/. If this parameter is not specified, then the path
     * used is &lt;schema_name&gt;/&lt;table_name&gt;/.
     * </p>
     */
    private String bucketFolder;
    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Set to
     * NONE (the default) or do not use to leave the files uncompressed.
     * </p>
     */
    private String compressionType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) used by the service access IAM role.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) used by the service access IAM role.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) used by the service access IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * 
     * @param externalTableDefinition
     *        The external table definition.
     */

    public void setExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * 
     * @return The external table definition.
     */

    public String getExternalTableDefinition() {
        return this.externalTableDefinition;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * 
     * @param externalTableDefinition
     *        The external table definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withExternalTableDefinition(String externalTableDefinition) {
        setExternalTableDefinition(externalTableDefinition);
        return this;
    }

    /**
     * <p>
     * The delimiter used to separate rows in the source files. The default is a carriage return (\n).
     * </p>
     * 
     * @param csvRowDelimiter
     *        The delimiter used to separate rows in the source files. The default is a carriage return (\n).
     */

    public void setCsvRowDelimiter(String csvRowDelimiter) {
        this.csvRowDelimiter = csvRowDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate rows in the source files. The default is a carriage return (\n).
     * </p>
     * 
     * @return The delimiter used to separate rows in the source files. The default is a carriage return (\n).
     */

    public String getCsvRowDelimiter() {
        return this.csvRowDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate rows in the source files. The default is a carriage return (\n).
     * </p>
     * 
     * @param csvRowDelimiter
     *        The delimiter used to separate rows in the source files. The default is a carriage return (\n).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withCsvRowDelimiter(String csvRowDelimiter) {
        setCsvRowDelimiter(csvRowDelimiter);
        return this;
    }

    /**
     * <p>
     * The delimiter used to separate columns in the source files. The default is a comma.
     * </p>
     * 
     * @param csvDelimiter
     *        The delimiter used to separate columns in the source files. The default is a comma.
     */

    public void setCsvDelimiter(String csvDelimiter) {
        this.csvDelimiter = csvDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate columns in the source files. The default is a comma.
     * </p>
     * 
     * @return The delimiter used to separate columns in the source files. The default is a comma.
     */

    public String getCsvDelimiter() {
        return this.csvDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate columns in the source files. The default is a comma.
     * </p>
     * 
     * @param csvDelimiter
     *        The delimiter used to separate columns in the source files. The default is a comma.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withCsvDelimiter(String csvDelimiter) {
        setCsvDelimiter(csvDelimiter);
        return this;
    }

    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     * &lt;bucketFolder&gt;/&lt;schema_name&gt;/&lt;table_name&gt;/. If this parameter is not specified, then the path
     * used is &lt;schema_name&gt;/&lt;table_name&gt;/.
     * </p>
     * 
     * @param bucketFolder
     *        An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     *        &lt;bucketFolder&gt;/&lt;schema_name&gt;/&lt;table_name&gt;/. If this parameter is not specified, then the
     *        path used is &lt;schema_name&gt;/&lt;table_name&gt;/.
     */

    public void setBucketFolder(String bucketFolder) {
        this.bucketFolder = bucketFolder;
    }

    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     * &lt;bucketFolder&gt;/&lt;schema_name&gt;/&lt;table_name&gt;/. If this parameter is not specified, then the path
     * used is &lt;schema_name&gt;/&lt;table_name&gt;/.
     * </p>
     * 
     * @return An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     *         &lt;bucketFolder&gt;/&lt;schema_name&gt;/&lt;table_name&gt;/. If this parameter is not specified, then
     *         the path used is &lt;schema_name&gt;/&lt;table_name&gt;/.
     */

    public String getBucketFolder() {
        return this.bucketFolder;
    }

    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     * &lt;bucketFolder&gt;/&lt;schema_name&gt;/&lt;table_name&gt;/. If this parameter is not specified, then the path
     * used is &lt;schema_name&gt;/&lt;table_name&gt;/.
     * </p>
     * 
     * @param bucketFolder
     *        An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path
     *        &lt;bucketFolder&gt;/&lt;schema_name&gt;/&lt;table_name&gt;/. If this parameter is not specified, then the
     *        path used is &lt;schema_name&gt;/&lt;table_name&gt;/.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withBucketFolder(String bucketFolder) {
        setBucketFolder(bucketFolder);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @return The name of the S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Settings withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Set to
     * NONE (the default) or do not use to leave the files uncompressed.
     * </p>
     * 
     * @param compressionType
     *        An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files.
     *        Set to NONE (the default) or do not use to leave the files uncompressed.
     * @see CompressionTypeValue
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Set to
     * NONE (the default) or do not use to leave the files uncompressed.
     * </p>
     * 
     * @return An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files.
     *         Set to NONE (the default) or do not use to leave the files uncompressed.
     * @see CompressionTypeValue
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Set to
     * NONE (the default) or do not use to leave the files uncompressed.
     * </p>
     * 
     * @param compressionType
     *        An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files.
     *        Set to NONE (the default) or do not use to leave the files uncompressed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionTypeValue
     */

    public S3Settings withCompressionType(String compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Set to
     * NONE (the default) or do not use to leave the files uncompressed.
     * </p>
     * 
     * @param compressionType
     *        An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files.
     *        Set to NONE (the default) or do not use to leave the files uncompressed.
     * @see CompressionTypeValue
     */

    public void setCompressionType(CompressionTypeValue compressionType) {
        withCompressionType(compressionType);
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Set to
     * NONE (the default) or do not use to leave the files uncompressed.
     * </p>
     * 
     * @param compressionType
     *        An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files.
     *        Set to NONE (the default) or do not use to leave the files uncompressed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionTypeValue
     */

    public S3Settings withCompressionType(CompressionTypeValue compressionType) {
        this.compressionType = compressionType.toString();
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
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getExternalTableDefinition() != null)
            sb.append("ExternalTableDefinition: ").append(getExternalTableDefinition()).append(",");
        if (getCsvRowDelimiter() != null)
            sb.append("CsvRowDelimiter: ").append(getCsvRowDelimiter()).append(",");
        if (getCsvDelimiter() != null)
            sb.append("CsvDelimiter: ").append(getCsvDelimiter()).append(",");
        if (getBucketFolder() != null)
            sb.append("BucketFolder: ").append(getBucketFolder()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Settings == false)
            return false;
        S3Settings other = (S3Settings) obj;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getExternalTableDefinition() == null ^ this.getExternalTableDefinition() == null)
            return false;
        if (other.getExternalTableDefinition() != null && other.getExternalTableDefinition().equals(this.getExternalTableDefinition()) == false)
            return false;
        if (other.getCsvRowDelimiter() == null ^ this.getCsvRowDelimiter() == null)
            return false;
        if (other.getCsvRowDelimiter() != null && other.getCsvRowDelimiter().equals(this.getCsvRowDelimiter()) == false)
            return false;
        if (other.getCsvDelimiter() == null ^ this.getCsvDelimiter() == null)
            return false;
        if (other.getCsvDelimiter() != null && other.getCsvDelimiter().equals(this.getCsvDelimiter()) == false)
            return false;
        if (other.getBucketFolder() == null ^ this.getBucketFolder() == null)
            return false;
        if (other.getBucketFolder() != null && other.getBucketFolder().equals(this.getBucketFolder()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExternalTableDefinition() == null) ? 0 : getExternalTableDefinition().hashCode());
        hashCode = prime * hashCode + ((getCsvRowDelimiter() == null) ? 0 : getCsvRowDelimiter().hashCode());
        hashCode = prime * hashCode + ((getCsvDelimiter() == null) ? 0 : getCsvDelimiter().hashCode());
        hashCode = prime * hashCode + ((getBucketFolder() == null) ? 0 : getBucketFolder().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        return hashCode;
    }

    @Override
    public S3Settings clone() {
        try {
            return (S3Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.S3SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
