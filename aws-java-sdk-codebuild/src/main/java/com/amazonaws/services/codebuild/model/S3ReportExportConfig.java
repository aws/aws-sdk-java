/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the S3 bucket where the raw data of a report are exported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/S3ReportExportConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ReportExportConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket where the raw data of a report are exported.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The path to the exported report's raw data results.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output bucket. This is the default if packaging is
     * not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String packaging;
    /**
     * <p>
     * The encryption key for the report's encrypted raw data.
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * A boolean value that specifies if the results of a report are encrypted.
     * </p>
     */
    private Boolean encryptionDisabled;

    /**
     * <p>
     * The name of the S3 bucket where the raw data of a report are exported.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket where the raw data of a report are exported.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket where the raw data of a report are exported.
     * </p>
     * 
     * @return The name of the S3 bucket where the raw data of a report are exported.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket where the raw data of a report are exported.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket where the raw data of a report are exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReportExportConfig withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The path to the exported report's raw data results.
     * </p>
     * 
     * @param path
     *        The path to the exported report's raw data results.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the exported report's raw data results.
     * </p>
     * 
     * @return The path to the exported report's raw data results.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the exported report's raw data results.
     * </p>
     * 
     * @param path
     *        The path to the exported report's raw data results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReportExportConfig withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output bucket. This is the default if packaging is
     * not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create. Valid values include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild creates the raw data in the output bucket. This is the default if
     *        packaging is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.
     *        </p>
     *        </li>
     * @see ReportPackagingType
     */

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output bucket. This is the default if packaging is
     * not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of build output artifact to create. Valid values include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: AWS CodeBuild creates the raw data in the output bucket. This is the default if
     *         packaging is not specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.
     *         </p>
     *         </li>
     * @see ReportPackagingType
     */

    public String getPackaging() {
        return this.packaging;
    }

    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output bucket. This is the default if packaging is
     * not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create. Valid values include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild creates the raw data in the output bucket. This is the default if
     *        packaging is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportPackagingType
     */

    public S3ReportExportConfig withPackaging(String packaging) {
        setPackaging(packaging);
        return this;
    }

    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output bucket. This is the default if packaging is
     * not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param packaging
     *        The type of build output artifact to create. Valid values include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: AWS CodeBuild creates the raw data in the output bucket. This is the default if
     *        packaging is not specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportPackagingType
     */

    public S3ReportExportConfig withPackaging(ReportPackagingType packaging) {
        this.packaging = packaging.toString();
        return this;
    }

    /**
     * <p>
     * The encryption key for the report's encrypted raw data.
     * </p>
     * 
     * @param encryptionKey
     *        The encryption key for the report's encrypted raw data.
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the report's encrypted raw data.
     * </p>
     * 
     * @return The encryption key for the report's encrypted raw data.
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the report's encrypted raw data.
     * </p>
     * 
     * @param encryptionKey
     *        The encryption key for the report's encrypted raw data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReportExportConfig withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies if the results of a report are encrypted.
     * </p>
     * 
     * @param encryptionDisabled
     *        A boolean value that specifies if the results of a report are encrypted.
     */

    public void setEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    /**
     * <p>
     * A boolean value that specifies if the results of a report are encrypted.
     * </p>
     * 
     * @return A boolean value that specifies if the results of a report are encrypted.
     */

    public Boolean getEncryptionDisabled() {
        return this.encryptionDisabled;
    }

    /**
     * <p>
     * A boolean value that specifies if the results of a report are encrypted.
     * </p>
     * 
     * @param encryptionDisabled
     *        A boolean value that specifies if the results of a report are encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReportExportConfig withEncryptionDisabled(Boolean encryptionDisabled) {
        setEncryptionDisabled(encryptionDisabled);
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies if the results of a report are encrypted.
     * </p>
     * 
     * @return A boolean value that specifies if the results of a report are encrypted.
     */

    public Boolean isEncryptionDisabled() {
        return this.encryptionDisabled;
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPackaging() != null)
            sb.append("Packaging: ").append(getPackaging()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getEncryptionDisabled() != null)
            sb.append("EncryptionDisabled: ").append(getEncryptionDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ReportExportConfig == false)
            return false;
        S3ReportExportConfig other = (S3ReportExportConfig) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPackaging() == null ^ this.getPackaging() == null)
            return false;
        if (other.getPackaging() != null && other.getPackaging().equals(this.getPackaging()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getEncryptionDisabled() == null ^ this.getEncryptionDisabled() == null)
            return false;
        if (other.getEncryptionDisabled() != null && other.getEncryptionDisabled().equals(this.getEncryptionDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPackaging() == null) ? 0 : getPackaging().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getEncryptionDisabled() == null) ? 0 : getEncryptionDisabled().hashCode());
        return hashCode;
    }

    @Override
    public S3ReportExportConfig clone() {
        try {
            return (S3ReportExportConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.S3ReportExportConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
