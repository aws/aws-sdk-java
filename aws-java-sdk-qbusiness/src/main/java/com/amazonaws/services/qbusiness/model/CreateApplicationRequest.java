/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the Amazon Q Business application.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch logs and metrics.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating for—or connecting
     * to—your Amazon Q Business application.
     * </p>
     */
    private String identityCenterInstanceArn;
    /**
     * <p>
     * A description for the Amazon Q Business application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the KMS key that is used to encrypt your data. Amazon Q Business doesn't support asymmetric
     * keys.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * A list of key-value pairs that identify or categorize your Amazon Q Business application. You can also use tags
     * to help control access to the application. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business application.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * An option to allow end users to upload files directly during chat.
     * </p>
     */
    private AttachmentsConfiguration attachmentsConfiguration;

    /**
     * <p>
     * A name for the Amazon Q Business application.
     * </p>
     * 
     * @param displayName
     *        A name for the Amazon Q Business application.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * A name for the Amazon Q Business application.
     * </p>
     * 
     * @return A name for the Amazon Q Business application.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * A name for the Amazon Q Business application.
     * </p>
     * 
     * @param displayName
     *        A name for the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch logs and metrics.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch logs and
     *        metrics.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch logs and metrics.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch logs and
     *         metrics.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch logs and metrics.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch logs and
     *        metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating for—or connecting
     * to—your Amazon Q Business application.
     * </p>
     * 
     * @param identityCenterInstanceArn
     *        The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating for—or
     *        connecting to—your Amazon Q Business application.
     */

    public void setIdentityCenterInstanceArn(String identityCenterInstanceArn) {
        this.identityCenterInstanceArn = identityCenterInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating for—or connecting
     * to—your Amazon Q Business application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating for—or
     *         connecting to—your Amazon Q Business application.
     */

    public String getIdentityCenterInstanceArn() {
        return this.identityCenterInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating for—or connecting
     * to—your Amazon Q Business application.
     * </p>
     * 
     * @param identityCenterInstanceArn
     *        The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating for—or
     *        connecting to—your Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withIdentityCenterInstanceArn(String identityCenterInstanceArn) {
        setIdentityCenterInstanceArn(identityCenterInstanceArn);
        return this;
    }

    /**
     * <p>
     * A description for the Amazon Q Business application.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Q Business application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the Amazon Q Business application.
     * </p>
     * 
     * @return A description for the Amazon Q Business application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the Amazon Q Business application.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the KMS key that is used to encrypt your data. Amazon Q Business doesn't support asymmetric
     * keys.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The identifier of the KMS key that is used to encrypt your data. Amazon Q Business doesn't support
     *        asymmetric keys.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the KMS key that is used to encrypt your data. Amazon Q Business doesn't support asymmetric
     * keys.
     * </p>
     * 
     * @return The identifier of the KMS key that is used to encrypt your data. Amazon Q Business doesn't support
     *         asymmetric keys.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the KMS key that is used to encrypt your data. Amazon Q Business doesn't support asymmetric
     * keys.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The identifier of the KMS key that is used to encrypt your data. Amazon Q Business doesn't support
     *        asymmetric keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize your Amazon Q Business application. You can also use tags
     * to help control access to the application. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @return A list of key-value pairs that identify or categorize your Amazon Q Business application. You can also
     *         use tags to help control access to the application. Tag keys and values can consist of Unicode letters,
     *         digits, white space, and any of the following symbols: _ . : / = + - @.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize your Amazon Q Business application. You can also use tags
     * to help control access to the application. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize your Amazon Q Business application. You can also use
     *        tags to help control access to the application. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
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
     * A list of key-value pairs that identify or categorize your Amazon Q Business application. You can also use tags
     * to help control access to the application. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize your Amazon Q Business application. You can also use
     *        tags to help control access to the application. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(Tag... tags) {
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
     * A list of key-value pairs that identify or categorize your Amazon Q Business application. You can also use tags
     * to help control access to the application. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize your Amazon Q Business application. You can also use
     *        tags to help control access to the application. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business application.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create your Amazon Q Business application.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business application.
     * </p>
     * 
     * @return A token that you provide to identify the request to create your Amazon Q Business application.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business application.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create your Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * An option to allow end users to upload files directly during chat.
     * </p>
     * 
     * @param attachmentsConfiguration
     *        An option to allow end users to upload files directly during chat.
     */

    public void setAttachmentsConfiguration(AttachmentsConfiguration attachmentsConfiguration) {
        this.attachmentsConfiguration = attachmentsConfiguration;
    }

    /**
     * <p>
     * An option to allow end users to upload files directly during chat.
     * </p>
     * 
     * @return An option to allow end users to upload files directly during chat.
     */

    public AttachmentsConfiguration getAttachmentsConfiguration() {
        return this.attachmentsConfiguration;
    }

    /**
     * <p>
     * An option to allow end users to upload files directly during chat.
     * </p>
     * 
     * @param attachmentsConfiguration
     *        An option to allow end users to upload files directly during chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withAttachmentsConfiguration(AttachmentsConfiguration attachmentsConfiguration) {
        setAttachmentsConfiguration(attachmentsConfiguration);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getIdentityCenterInstanceArn() != null)
            sb.append("IdentityCenterInstanceArn: ").append(getIdentityCenterInstanceArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getAttachmentsConfiguration() != null)
            sb.append("AttachmentsConfiguration: ").append(getAttachmentsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getIdentityCenterInstanceArn() == null ^ this.getIdentityCenterInstanceArn() == null)
            return false;
        if (other.getIdentityCenterInstanceArn() != null && other.getIdentityCenterInstanceArn().equals(this.getIdentityCenterInstanceArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getAttachmentsConfiguration() == null ^ this.getAttachmentsConfiguration() == null)
            return false;
        if (other.getAttachmentsConfiguration() != null && other.getAttachmentsConfiguration().equals(this.getAttachmentsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIdentityCenterInstanceArn() == null) ? 0 : getIdentityCenterInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getAttachmentsConfiguration() == null) ? 0 : getAttachmentsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
