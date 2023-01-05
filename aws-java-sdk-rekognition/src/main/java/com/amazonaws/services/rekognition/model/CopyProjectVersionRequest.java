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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyProjectVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the source project in the trusting AWS account.
     * </p>
     */
    private String sourceProjectArn;
    /**
     * <p>
     * The ARN of the model version in the source project that you want to copy to a destination project.
     * </p>
     */
    private String sourceProjectVersionArn;
    /**
     * <p>
     * The ARN of the project in the trusted AWS account that you want to copy the model version to.
     * </p>
     */
    private String destinationProjectArn;
    /**
     * <p>
     * A name for the version of the model that's copied to the destination project.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The S3 bucket and folder location where the training output for the source model version is placed.
     * </p>
     */
    private OutputConfig outputConfig;
    /**
     * <p>
     * The key-value tags to assign to the model version.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training results and manifest files written to the output Amazon S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The ARN of the source project in the trusting AWS account.
     * </p>
     * 
     * @param sourceProjectArn
     *        The ARN of the source project in the trusting AWS account.
     */

    public void setSourceProjectArn(String sourceProjectArn) {
        this.sourceProjectArn = sourceProjectArn;
    }

    /**
     * <p>
     * The ARN of the source project in the trusting AWS account.
     * </p>
     * 
     * @return The ARN of the source project in the trusting AWS account.
     */

    public String getSourceProjectArn() {
        return this.sourceProjectArn;
    }

    /**
     * <p>
     * The ARN of the source project in the trusting AWS account.
     * </p>
     * 
     * @param sourceProjectArn
     *        The ARN of the source project in the trusting AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProjectVersionRequest withSourceProjectArn(String sourceProjectArn) {
        setSourceProjectArn(sourceProjectArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the model version in the source project that you want to copy to a destination project.
     * </p>
     * 
     * @param sourceProjectVersionArn
     *        The ARN of the model version in the source project that you want to copy to a destination project.
     */

    public void setSourceProjectVersionArn(String sourceProjectVersionArn) {
        this.sourceProjectVersionArn = sourceProjectVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version in the source project that you want to copy to a destination project.
     * </p>
     * 
     * @return The ARN of the model version in the source project that you want to copy to a destination project.
     */

    public String getSourceProjectVersionArn() {
        return this.sourceProjectVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version in the source project that you want to copy to a destination project.
     * </p>
     * 
     * @param sourceProjectVersionArn
     *        The ARN of the model version in the source project that you want to copy to a destination project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProjectVersionRequest withSourceProjectVersionArn(String sourceProjectVersionArn) {
        setSourceProjectVersionArn(sourceProjectVersionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the project in the trusted AWS account that you want to copy the model version to.
     * </p>
     * 
     * @param destinationProjectArn
     *        The ARN of the project in the trusted AWS account that you want to copy the model version to.
     */

    public void setDestinationProjectArn(String destinationProjectArn) {
        this.destinationProjectArn = destinationProjectArn;
    }

    /**
     * <p>
     * The ARN of the project in the trusted AWS account that you want to copy the model version to.
     * </p>
     * 
     * @return The ARN of the project in the trusted AWS account that you want to copy the model version to.
     */

    public String getDestinationProjectArn() {
        return this.destinationProjectArn;
    }

    /**
     * <p>
     * The ARN of the project in the trusted AWS account that you want to copy the model version to.
     * </p>
     * 
     * @param destinationProjectArn
     *        The ARN of the project in the trusted AWS account that you want to copy the model version to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProjectVersionRequest withDestinationProjectArn(String destinationProjectArn) {
        setDestinationProjectArn(destinationProjectArn);
        return this;
    }

    /**
     * <p>
     * A name for the version of the model that's copied to the destination project.
     * </p>
     * 
     * @param versionName
     *        A name for the version of the model that's copied to the destination project.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * A name for the version of the model that's copied to the destination project.
     * </p>
     * 
     * @return A name for the version of the model that's copied to the destination project.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * A name for the version of the model that's copied to the destination project.
     * </p>
     * 
     * @param versionName
     *        A name for the version of the model that's copied to the destination project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProjectVersionRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The S3 bucket and folder location where the training output for the source model version is placed.
     * </p>
     * 
     * @param outputConfig
     *        The S3 bucket and folder location where the training output for the source model version is placed.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The S3 bucket and folder location where the training output for the source model version is placed.
     * </p>
     * 
     * @return The S3 bucket and folder location where the training output for the source model version is placed.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The S3 bucket and folder location where the training output for the source model version is placed.
     * </p>
     * 
     * @param outputConfig
     *        The S3 bucket and folder location where the training output for the source model version is placed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProjectVersionRequest withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The key-value tags to assign to the model version.
     * </p>
     * 
     * @return The key-value tags to assign to the model version.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value tags to assign to the model version.
     * </p>
     * 
     * @param tags
     *        The key-value tags to assign to the model version.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value tags to assign to the model version.
     * </p>
     * 
     * @param tags
     *        The key-value tags to assign to the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProjectVersionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CopyProjectVersionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CopyProjectVersionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProjectVersionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training results and manifest files written to the output Amazon S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource
     *        Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is
     *        used to encrypt training results and manifest files written to the output Amazon S3 bucket (
     *        <code>OutputConfig</code>).</p>
     *        <p>
     *        If you choose to use your own KMS key, you need the following permissions on the KMS key.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        kms:CreateGrant
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:DescribeKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:GenerateDataKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:Decrypt
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using
     *        a key that AWS owns and manages.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training results and manifest files written to the output Amazon S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     * 
     * @return The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource
     *         Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key
     *         is used to encrypt training results and manifest files written to the output Amazon S3 bucket (
     *         <code>OutputConfig</code>).</p>
     *         <p>
     *         If you choose to use your own KMS key, you need the following permissions on the KMS key.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         kms:CreateGrant
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:DescribeKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:GenerateDataKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:Decrypt
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted
     *         using a key that AWS owns and manages.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training results and manifest files written to the output Amazon S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource
     *        Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is
     *        used to encrypt training results and manifest files written to the output Amazon S3 bucket (
     *        <code>OutputConfig</code>).</p>
     *        <p>
     *        If you choose to use your own KMS key, you need the following permissions on the KMS key.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        kms:CreateGrant
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:DescribeKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:GenerateDataKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:Decrypt
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using
     *        a key that AWS owns and manages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyProjectVersionRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getSourceProjectArn() != null)
            sb.append("SourceProjectArn: ").append(getSourceProjectArn()).append(",");
        if (getSourceProjectVersionArn() != null)
            sb.append("SourceProjectVersionArn: ").append(getSourceProjectVersionArn()).append(",");
        if (getDestinationProjectArn() != null)
            sb.append("DestinationProjectArn: ").append(getDestinationProjectArn()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyProjectVersionRequest == false)
            return false;
        CopyProjectVersionRequest other = (CopyProjectVersionRequest) obj;
        if (other.getSourceProjectArn() == null ^ this.getSourceProjectArn() == null)
            return false;
        if (other.getSourceProjectArn() != null && other.getSourceProjectArn().equals(this.getSourceProjectArn()) == false)
            return false;
        if (other.getSourceProjectVersionArn() == null ^ this.getSourceProjectVersionArn() == null)
            return false;
        if (other.getSourceProjectVersionArn() != null && other.getSourceProjectVersionArn().equals(this.getSourceProjectVersionArn()) == false)
            return false;
        if (other.getDestinationProjectArn() == null ^ this.getDestinationProjectArn() == null)
            return false;
        if (other.getDestinationProjectArn() != null && other.getDestinationProjectArn().equals(this.getDestinationProjectArn()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceProjectArn() == null) ? 0 : getSourceProjectArn().hashCode());
        hashCode = prime * hashCode + ((getSourceProjectVersionArn() == null) ? 0 : getSourceProjectVersionArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationProjectArn() == null) ? 0 : getDestinationProjectArn().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CopyProjectVersionRequest clone() {
        return (CopyProjectVersionRequest) super.clone();
    }

}
