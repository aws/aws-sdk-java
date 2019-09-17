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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateActivation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateActivationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-defined description of the resource that you want to register with Amazon EC2.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     */
    private String description;
    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use the AWS
     * command line tools to list EC2 resources.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     */
    private String defaultInstanceName;
    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     * </p>
     */
    private Integer registrationLimit;
    /**
     * <p>
     * The date by which this activation request should expire. The default value is 24 hours.
     * </p>
     */
    private java.util.Date expirationDate;
    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag an activation to identify which servers
     * or virtual machines (VMs) in your on-premises environment you intend to activate. In this case, you could specify
     * the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code. When you
     * specify the activation ID and code, tags assigned to the activation are automatically applied to the on-premises
     * servers or VMs.
     * </p>
     * </important>
     * <p>
     * You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and VMs
     * after they connect to Systems Manager for the first time and are assigned a managed instance ID. This means they
     * are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For information about how
     * to add tags to your managed instances, see <a>AddTagsToResource</a>. For information about how to remove tags
     * from your managed instances, see <a>RemoveTagsFromResource</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * A user-defined description of the resource that you want to register with Amazon EC2.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * 
     * @param description
     *        A user-defined description of the resource that you want to register with Amazon EC2. </p> <important>
     *        <p>
     *        Do not enter personally identifiable information in this field.
     *        </p>
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-defined description of the resource that you want to register with Amazon EC2.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * 
     * @return A user-defined description of the resource that you want to register with Amazon EC2. </p> <important>
     *         <p>
     *         Do not enter personally identifiable information in this field.
     *         </p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-defined description of the resource that you want to register with Amazon EC2.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * 
     * @param description
     *        A user-defined description of the resource that you want to register with Amazon EC2. </p> <important>
     *        <p>
     *        Do not enter personally identifiable information in this field.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use the AWS
     * command line tools to list EC2 resources.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * 
     * @param defaultInstanceName
     *        The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use
     *        the AWS command line tools to list EC2 resources.</p> <important>
     *        <p>
     *        Do not enter personally identifiable information in this field.
     *        </p>
     */

    public void setDefaultInstanceName(String defaultInstanceName) {
        this.defaultInstanceName = defaultInstanceName;
    }

    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use the AWS
     * command line tools to list EC2 resources.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * 
     * @return The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use
     *         the AWS command line tools to list EC2 resources.</p> <important>
     *         <p>
     *         Do not enter personally identifiable information in this field.
     *         </p>
     */

    public String getDefaultInstanceName() {
        return this.defaultInstanceName;
    }

    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use the AWS
     * command line tools to list EC2 resources.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * 
     * @param defaultInstanceName
     *        The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use
     *        the AWS command line tools to list EC2 resources.</p> <important>
     *        <p>
     *        Do not enter personally identifiable information in this field.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withDefaultInstanceName(String defaultInstanceName) {
        setDefaultInstanceName(defaultInstanceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     * </p>
     * 
     * @param iamRole
     *        The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     * </p>
     * 
     * @return The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     * </p>
     * 
     * @param iamRole
     *        The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     * </p>
     * 
     * @param registrationLimit
     *        Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     */

    public void setRegistrationLimit(Integer registrationLimit) {
        this.registrationLimit = registrationLimit;
    }

    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     * </p>
     * 
     * @return Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     */

    public Integer getRegistrationLimit() {
        return this.registrationLimit;
    }

    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     * </p>
     * 
     * @param registrationLimit
     *        Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withRegistrationLimit(Integer registrationLimit) {
        setRegistrationLimit(registrationLimit);
        return this;
    }

    /**
     * <p>
     * The date by which this activation request should expire. The default value is 24 hours.
     * </p>
     * 
     * @param expirationDate
     *        The date by which this activation request should expire. The default value is 24 hours.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date by which this activation request should expire. The default value is 24 hours.
     * </p>
     * 
     * @return The date by which this activation request should expire. The default value is 24 hours.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date by which this activation request should expire. The default value is 24 hours.
     * </p>
     * 
     * @param expirationDate
     *        The date by which this activation request should expire. The default value is 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag an activation to identify which servers
     * or virtual machines (VMs) in your on-premises environment you intend to activate. In this case, you could specify
     * the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code. When you
     * specify the activation ID and code, tags assigned to the activation are automatically applied to the on-premises
     * servers or VMs.
     * </p>
     * </important>
     * <p>
     * You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and VMs
     * after they connect to Systems Manager for the first time and are assigned a managed instance ID. This means they
     * are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For information about how
     * to add tags to your managed instances, see <a>AddTagsToResource</a>. For information about how to remove tags
     * from your managed instances, see <a>RemoveTagsFromResource</a>.
     * </p>
     * 
     * @return Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *         ways, such as by purpose, owner, or environment. For example, you might want to tag an activation to
     *         identify which servers or virtual machines (VMs) in your on-premises environment you intend to activate.
     *         In this case, you could specify the following key name/value pairs:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=OS,Value=Windows</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=Environment,Value=Production</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code.
     *         When you specify the activation ID and code, tags assigned to the activation are automatically applied to
     *         the on-premises servers or VMs.
     *         </p>
     *         </important>
     *         <p>
     *         You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers
     *         and VMs after they connect to Systems Manager for the first time and are assigned a managed instance ID.
     *         This means they are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For
     *         information about how to add tags to your managed instances, see <a>AddTagsToResource</a>. For
     *         information about how to remove tags from your managed instances, see <a>RemoveTagsFromResource</a>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag an activation to identify which servers
     * or virtual machines (VMs) in your on-premises environment you intend to activate. In this case, you could specify
     * the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code. When you
     * specify the activation ID and code, tags assigned to the activation are automatically applied to the on-premises
     * servers or VMs.
     * </p>
     * </important>
     * <p>
     * You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and VMs
     * after they connect to Systems Manager for the first time and are assigned a managed instance ID. This means they
     * are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For information about how
     * to add tags to your managed instances, see <a>AddTagsToResource</a>. For information about how to remove tags
     * from your managed instances, see <a>RemoveTagsFromResource</a>.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *        ways, such as by purpose, owner, or environment. For example, you might want to tag an activation to
     *        identify which servers or virtual machines (VMs) in your on-premises environment you intend to activate.
     *        In this case, you could specify the following key name/value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=OS,Value=Windows</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code.
     *        When you specify the activation ID and code, tags assigned to the activation are automatically applied to
     *        the on-premises servers or VMs.
     *        </p>
     *        </important>
     *        <p>
     *        You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and
     *        VMs after they connect to Systems Manager for the first time and are assigned a managed instance ID. This
     *        means they are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For
     *        information about how to add tags to your managed instances, see <a>AddTagsToResource</a>. For information
     *        about how to remove tags from your managed instances, see <a>RemoveTagsFromResource</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag an activation to identify which servers
     * or virtual machines (VMs) in your on-premises environment you intend to activate. In this case, you could specify
     * the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code. When you
     * specify the activation ID and code, tags assigned to the activation are automatically applied to the on-premises
     * servers or VMs.
     * </p>
     * </important>
     * <p>
     * You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and VMs
     * after they connect to Systems Manager for the first time and are assigned a managed instance ID. This means they
     * are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For information about how
     * to add tags to your managed instances, see <a>AddTagsToResource</a>. For information about how to remove tags
     * from your managed instances, see <a>RemoveTagsFromResource</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *        ways, such as by purpose, owner, or environment. For example, you might want to tag an activation to
     *        identify which servers or virtual machines (VMs) in your on-premises environment you intend to activate.
     *        In this case, you could specify the following key name/value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=OS,Value=Windows</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code.
     *        When you specify the activation ID and code, tags assigned to the activation are automatically applied to
     *        the on-premises servers or VMs.
     *        </p>
     *        </important>
     *        <p>
     *        You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and
     *        VMs after they connect to Systems Manager for the first time and are assigned a managed instance ID. This
     *        means they are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For
     *        information about how to add tags to your managed instances, see <a>AddTagsToResource</a>. For information
     *        about how to remove tags from your managed instances, see <a>RemoveTagsFromResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag an activation to identify which servers
     * or virtual machines (VMs) in your on-premises environment you intend to activate. In this case, you could specify
     * the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code. When you
     * specify the activation ID and code, tags assigned to the activation are automatically applied to the on-premises
     * servers or VMs.
     * </p>
     * </important>
     * <p>
     * You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and VMs
     * after they connect to Systems Manager for the first time and are assigned a managed instance ID. This means they
     * are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For information about how
     * to add tags to your managed instances, see <a>AddTagsToResource</a>. For information about how to remove tags
     * from your managed instances, see <a>RemoveTagsFromResource</a>.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *        ways, such as by purpose, owner, or environment. For example, you might want to tag an activation to
     *        identify which servers or virtual machines (VMs) in your on-premises environment you intend to activate.
     *        In this case, you could specify the following key name/value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=OS,Value=Windows</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code.
     *        When you specify the activation ID and code, tags assigned to the activation are automatically applied to
     *        the on-premises servers or VMs.
     *        </p>
     *        </important>
     *        <p>
     *        You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and
     *        VMs after they connect to Systems Manager for the first time and are assigned a managed instance ID. This
     *        means they are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For
     *        information about how to add tags to your managed instances, see <a>AddTagsToResource</a>. For information
     *        about how to remove tags from your managed instances, see <a>RemoveTagsFromResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultInstanceName() != null)
            sb.append("DefaultInstanceName: ").append(getDefaultInstanceName()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getRegistrationLimit() != null)
            sb.append("RegistrationLimit: ").append(getRegistrationLimit()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate()).append(",");
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

        if (obj instanceof CreateActivationRequest == false)
            return false;
        CreateActivationRequest other = (CreateActivationRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultInstanceName() == null ^ this.getDefaultInstanceName() == null)
            return false;
        if (other.getDefaultInstanceName() != null && other.getDefaultInstanceName().equals(this.getDefaultInstanceName()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getRegistrationLimit() == null ^ this.getRegistrationLimit() == null)
            return false;
        if (other.getRegistrationLimit() != null && other.getRegistrationLimit().equals(this.getRegistrationLimit()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultInstanceName() == null) ? 0 : getDefaultInstanceName().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getRegistrationLimit() == null) ? 0 : getRegistrationLimit().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateActivationRequest clone() {
        return (CreateActivationRequest) super.clone();
    }

}
