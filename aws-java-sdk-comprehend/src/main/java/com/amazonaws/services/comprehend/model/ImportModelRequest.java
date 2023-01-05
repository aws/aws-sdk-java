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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ImportModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model to import.
     * </p>
     */
    private String sourceModelArn;
    /**
     * <p>
     * The name to assign to the custom model that is created in Amazon Comprehend by this import.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The version name given to the custom model that is created by this import. Version names can have a maximum of
     * 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The version name must be
     * unique among all models with the same classifier name in the account/AWS Region.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt trained custom models. The
     * ModelKmsKeyId can be either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String modelKmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that allows Amazon Comprehend to use
     * Amazon Key Management Service (KMS) to encrypt or decrypt the custom model.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * Tags to be associated with the custom model that is created by this import. A tag is a key-value pair that adds
     * as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added
     * to a resource to indicate its use by the sales department.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model to import.
     * </p>
     * 
     * @param sourceModelArn
     *        The Amazon Resource Name (ARN) of the custom model to import.
     */

    public void setSourceModelArn(String sourceModelArn) {
        this.sourceModelArn = sourceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model to import.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom model to import.
     */

    public String getSourceModelArn() {
        return this.sourceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model to import.
     * </p>
     * 
     * @param sourceModelArn
     *        The Amazon Resource Name (ARN) of the custom model to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelRequest withSourceModelArn(String sourceModelArn) {
        setSourceModelArn(sourceModelArn);
        return this;
    }

    /**
     * <p>
     * The name to assign to the custom model that is created in Amazon Comprehend by this import.
     * </p>
     * 
     * @param modelName
     *        The name to assign to the custom model that is created in Amazon Comprehend by this import.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name to assign to the custom model that is created in Amazon Comprehend by this import.
     * </p>
     * 
     * @return The name to assign to the custom model that is created in Amazon Comprehend by this import.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name to assign to the custom model that is created in Amazon Comprehend by this import.
     * </p>
     * 
     * @param modelName
     *        The name to assign to the custom model that is created in Amazon Comprehend by this import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The version name given to the custom model that is created by this import. Version names can have a maximum of
     * 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The version name must be
     * unique among all models with the same classifier name in the account/AWS Region.
     * </p>
     * 
     * @param versionName
     *        The version name given to the custom model that is created by this import. Version names can have a
     *        maximum of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The
     *        version name must be unique among all models with the same classifier name in the account/AWS Region.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The version name given to the custom model that is created by this import. Version names can have a maximum of
     * 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The version name must be
     * unique among all models with the same classifier name in the account/AWS Region.
     * </p>
     * 
     * @return The version name given to the custom model that is created by this import. Version names can have a
     *         maximum of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The
     *         version name must be unique among all models with the same classifier name in the account/AWS Region.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The version name given to the custom model that is created by this import. Version names can have a maximum of
     * 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The version name must be
     * unique among all models with the same classifier name in the account/AWS Region.
     * </p>
     * 
     * @param versionName
     *        The version name given to the custom model that is created by this import. Version names can have a
     *        maximum of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The
     *        version name must be unique among all models with the same classifier name in the account/AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt trained custom models. The
     * ModelKmsKeyId can be either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelKmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt trained custom
     *        models. The ModelKmsKeyId can be either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     */

    public void setModelKmsKeyId(String modelKmsKeyId) {
        this.modelKmsKeyId = modelKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt trained custom models. The
     * ModelKmsKeyId can be either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt trained custom
     *         models. The ModelKmsKeyId can be either of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     */

    public String getModelKmsKeyId() {
        return this.modelKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt trained custom models. The
     * ModelKmsKeyId can be either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelKmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt trained custom
     *        models. The ModelKmsKeyId can be either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelRequest withModelKmsKeyId(String modelKmsKeyId) {
        setModelKmsKeyId(modelKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that allows Amazon Comprehend to use
     * Amazon Key Management Service (KMS) to encrypt or decrypt the custom model.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that allows Amazon Comprehend
     *        to use Amazon Key Management Service (KMS) to encrypt or decrypt the custom model.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that allows Amazon Comprehend to use
     * Amazon Key Management Service (KMS) to encrypt or decrypt the custom model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that allows Amazon
     *         Comprehend to use Amazon Key Management Service (KMS) to encrypt or decrypt the custom model.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that allows Amazon Comprehend to use
     * Amazon Key Management Service (KMS) to encrypt or decrypt the custom model.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that allows Amazon Comprehend
     *        to use Amazon Key Management Service (KMS) to encrypt or decrypt the custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Tags to be associated with the custom model that is created by this import. A tag is a key-value pair that adds
     * as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added
     * to a resource to indicate its use by the sales department.
     * </p>
     * 
     * @return Tags to be associated with the custom model that is created by this import. A tag is a key-value pair
     *         that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the
     *         key might be added to a resource to indicate its use by the sales department.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to be associated with the custom model that is created by this import. A tag is a key-value pair that adds
     * as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added
     * to a resource to indicate its use by the sales department.
     * </p>
     * 
     * @param tags
     *        Tags to be associated with the custom model that is created by this import. A tag is a key-value pair that
     *        adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key
     *        might be added to a resource to indicate its use by the sales department.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags to be associated with the custom model that is created by this import. A tag is a key-value pair that adds
     * as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added
     * to a resource to indicate its use by the sales department.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to be associated with the custom model that is created by this import. A tag is a key-value pair that
     *        adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key
     *        might be added to a resource to indicate its use by the sales department.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to be associated with the custom model that is created by this import. A tag is a key-value pair that adds
     * as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added
     * to a resource to indicate its use by the sales department.
     * </p>
     * 
     * @param tags
     *        Tags to be associated with the custom model that is created by this import. A tag is a key-value pair that
     *        adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key
     *        might be added to a resource to indicate its use by the sales department.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportModelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSourceModelArn() != null)
            sb.append("SourceModelArn: ").append(getSourceModelArn()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getModelKmsKeyId() != null)
            sb.append("ModelKmsKeyId: ").append(getModelKmsKeyId()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportModelRequest == false)
            return false;
        ImportModelRequest other = (ImportModelRequest) obj;
        if (other.getSourceModelArn() == null ^ this.getSourceModelArn() == null)
            return false;
        if (other.getSourceModelArn() != null && other.getSourceModelArn().equals(this.getSourceModelArn()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getModelKmsKeyId() == null ^ this.getModelKmsKeyId() == null)
            return false;
        if (other.getModelKmsKeyId() != null && other.getModelKmsKeyId().equals(this.getModelKmsKeyId()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceModelArn() == null) ? 0 : getSourceModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getModelKmsKeyId() == null) ? 0 : getModelKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportModelRequest clone() {
        return (ImportModelRequest) super.clone();
    }

}
