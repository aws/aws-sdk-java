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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating for—or connecting
     * to—your Amazon Q Business application.
     * </p>
     */
    private String identityCenterInstanceArn;
    /**
     * <p>
     * A name for the Amazon Q Business application.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * A description for the Amazon Q Business application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An Amazon Web Services Identity and Access Management (IAM) role that gives Amazon Q Business permission to
     * access Amazon CloudWatch logs and metrics.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An option to allow end users to upload files directly during chat.
     * </p>
     */
    private AttachmentsConfiguration attachmentsConfiguration;

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
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

    public UpdateApplicationRequest withIdentityCenterInstanceArn(String identityCenterInstanceArn) {
        setIdentityCenterInstanceArn(identityCenterInstanceArn);
        return this;
    }

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

    public UpdateApplicationRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
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

    public UpdateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An Amazon Web Services Identity and Access Management (IAM) role that gives Amazon Q Business permission to
     * access Amazon CloudWatch logs and metrics.
     * </p>
     * 
     * @param roleArn
     *        An Amazon Web Services Identity and Access Management (IAM) role that gives Amazon Q Business permission
     *        to access Amazon CloudWatch logs and metrics.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An Amazon Web Services Identity and Access Management (IAM) role that gives Amazon Q Business permission to
     * access Amazon CloudWatch logs and metrics.
     * </p>
     * 
     * @return An Amazon Web Services Identity and Access Management (IAM) role that gives Amazon Q Business permission
     *         to access Amazon CloudWatch logs and metrics.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * An Amazon Web Services Identity and Access Management (IAM) role that gives Amazon Q Business permission to
     * access Amazon CloudWatch logs and metrics.
     * </p>
     * 
     * @param roleArn
     *        An Amazon Web Services Identity and Access Management (IAM) role that gives Amazon Q Business permission
     *        to access Amazon CloudWatch logs and metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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

    public UpdateApplicationRequest withAttachmentsConfiguration(AttachmentsConfiguration attachmentsConfiguration) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIdentityCenterInstanceArn() != null)
            sb.append("IdentityCenterInstanceArn: ").append(getIdentityCenterInstanceArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof UpdateApplicationRequest == false)
            return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIdentityCenterInstanceArn() == null ^ this.getIdentityCenterInstanceArn() == null)
            return false;
        if (other.getIdentityCenterInstanceArn() != null && other.getIdentityCenterInstanceArn().equals(this.getIdentityCenterInstanceArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIdentityCenterInstanceArn() == null) ? 0 : getIdentityCenterInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAttachmentsConfiguration() == null) ? 0 : getAttachmentsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
