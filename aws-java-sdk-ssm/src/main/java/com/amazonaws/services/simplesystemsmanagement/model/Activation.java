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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An activation registers one or more on-premises servers or virtual machines (VMs) with AWS so that you can configure
 * those servers or VMs using Run Command. A server or VM that has been registered with AWS is called a managed
 * instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/Activation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Activation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID created by Systems Manager when you submitted the activation.
     * </p>
     */
    private String activationId;
    /**
     * <p>
     * A user defined description of the activation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A name for the managed instance when it is created.
     * </p>
     */
    private String defaultInstanceName;
    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * The maximum number of managed instances that can be registered using this activation.
     * </p>
     */
    private Integer registrationLimit;
    /**
     * <p>
     * The number of managed instances already registered with this activation.
     * </p>
     */
    private Integer registrationsCount;
    /**
     * <p>
     * The date when this activation can no longer be used to register managed instances.
     * </p>
     */
    private java.util.Date expirationDate;
    /**
     * <p>
     * Whether or not the activation is expired.
     * </p>
     */
    private Boolean expired;
    /**
     * <p>
     * The date the activation was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * Tags assigned to the activation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID created by Systems Manager when you submitted the activation.
     * </p>
     * 
     * @param activationId
     *        The ID created by Systems Manager when you submitted the activation.
     */

    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

    /**
     * <p>
     * The ID created by Systems Manager when you submitted the activation.
     * </p>
     * 
     * @return The ID created by Systems Manager when you submitted the activation.
     */

    public String getActivationId() {
        return this.activationId;
    }

    /**
     * <p>
     * The ID created by Systems Manager when you submitted the activation.
     * </p>
     * 
     * @param activationId
     *        The ID created by Systems Manager when you submitted the activation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withActivationId(String activationId) {
        setActivationId(activationId);
        return this;
    }

    /**
     * <p>
     * A user defined description of the activation.
     * </p>
     * 
     * @param description
     *        A user defined description of the activation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user defined description of the activation.
     * </p>
     * 
     * @return A user defined description of the activation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user defined description of the activation.
     * </p>
     * 
     * @param description
     *        A user defined description of the activation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A name for the managed instance when it is created.
     * </p>
     * 
     * @param defaultInstanceName
     *        A name for the managed instance when it is created.
     */

    public void setDefaultInstanceName(String defaultInstanceName) {
        this.defaultInstanceName = defaultInstanceName;
    }

    /**
     * <p>
     * A name for the managed instance when it is created.
     * </p>
     * 
     * @return A name for the managed instance when it is created.
     */

    public String getDefaultInstanceName() {
        return this.defaultInstanceName;
    }

    /**
     * <p>
     * A name for the managed instance when it is created.
     * </p>
     * 
     * @param defaultInstanceName
     *        A name for the managed instance when it is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withDefaultInstanceName(String defaultInstanceName) {
        setDefaultInstanceName(defaultInstanceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
     * </p>
     * 
     * @param iamRole
     *        The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
     * </p>
     * 
     * @return The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
     * </p>
     * 
     * @param iamRole
     *        The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * The maximum number of managed instances that can be registered using this activation.
     * </p>
     * 
     * @param registrationLimit
     *        The maximum number of managed instances that can be registered using this activation.
     */

    public void setRegistrationLimit(Integer registrationLimit) {
        this.registrationLimit = registrationLimit;
    }

    /**
     * <p>
     * The maximum number of managed instances that can be registered using this activation.
     * </p>
     * 
     * @return The maximum number of managed instances that can be registered using this activation.
     */

    public Integer getRegistrationLimit() {
        return this.registrationLimit;
    }

    /**
     * <p>
     * The maximum number of managed instances that can be registered using this activation.
     * </p>
     * 
     * @param registrationLimit
     *        The maximum number of managed instances that can be registered using this activation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withRegistrationLimit(Integer registrationLimit) {
        setRegistrationLimit(registrationLimit);
        return this;
    }

    /**
     * <p>
     * The number of managed instances already registered with this activation.
     * </p>
     * 
     * @param registrationsCount
     *        The number of managed instances already registered with this activation.
     */

    public void setRegistrationsCount(Integer registrationsCount) {
        this.registrationsCount = registrationsCount;
    }

    /**
     * <p>
     * The number of managed instances already registered with this activation.
     * </p>
     * 
     * @return The number of managed instances already registered with this activation.
     */

    public Integer getRegistrationsCount() {
        return this.registrationsCount;
    }

    /**
     * <p>
     * The number of managed instances already registered with this activation.
     * </p>
     * 
     * @param registrationsCount
     *        The number of managed instances already registered with this activation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withRegistrationsCount(Integer registrationsCount) {
        setRegistrationsCount(registrationsCount);
        return this;
    }

    /**
     * <p>
     * The date when this activation can no longer be used to register managed instances.
     * </p>
     * 
     * @param expirationDate
     *        The date when this activation can no longer be used to register managed instances.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date when this activation can no longer be used to register managed instances.
     * </p>
     * 
     * @return The date when this activation can no longer be used to register managed instances.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date when this activation can no longer be used to register managed instances.
     * </p>
     * 
     * @param expirationDate
     *        The date when this activation can no longer be used to register managed instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * <p>
     * Whether or not the activation is expired.
     * </p>
     * 
     * @param expired
     *        Whether or not the activation is expired.
     */

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    /**
     * <p>
     * Whether or not the activation is expired.
     * </p>
     * 
     * @return Whether or not the activation is expired.
     */

    public Boolean getExpired() {
        return this.expired;
    }

    /**
     * <p>
     * Whether or not the activation is expired.
     * </p>
     * 
     * @param expired
     *        Whether or not the activation is expired.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withExpired(Boolean expired) {
        setExpired(expired);
        return this;
    }

    /**
     * <p>
     * Whether or not the activation is expired.
     * </p>
     * 
     * @return Whether or not the activation is expired.
     */

    public Boolean isExpired() {
        return this.expired;
    }

    /**
     * <p>
     * The date the activation was created.
     * </p>
     * 
     * @param createdDate
     *        The date the activation was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the activation was created.
     * </p>
     * 
     * @return The date the activation was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the activation was created.
     * </p>
     * 
     * @param createdDate
     *        The date the activation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * Tags assigned to the activation.
     * </p>
     * 
     * @return Tags assigned to the activation.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Tags assigned to the activation.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the activation.
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
     * Tags assigned to the activation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the activation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withTags(Tag... tags) {
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
     * Tags assigned to the activation.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the activation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activation withTags(java.util.Collection<Tag> tags) {
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
        if (getActivationId() != null)
            sb.append("ActivationId: ").append(getActivationId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultInstanceName() != null)
            sb.append("DefaultInstanceName: ").append(getDefaultInstanceName()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getRegistrationLimit() != null)
            sb.append("RegistrationLimit: ").append(getRegistrationLimit()).append(",");
        if (getRegistrationsCount() != null)
            sb.append("RegistrationsCount: ").append(getRegistrationsCount()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate()).append(",");
        if (getExpired() != null)
            sb.append("Expired: ").append(getExpired()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
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

        if (obj instanceof Activation == false)
            return false;
        Activation other = (Activation) obj;
        if (other.getActivationId() == null ^ this.getActivationId() == null)
            return false;
        if (other.getActivationId() != null && other.getActivationId().equals(this.getActivationId()) == false)
            return false;
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
        if (other.getRegistrationsCount() == null ^ this.getRegistrationsCount() == null)
            return false;
        if (other.getRegistrationsCount() != null && other.getRegistrationsCount().equals(this.getRegistrationsCount()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getExpired() == null ^ this.getExpired() == null)
            return false;
        if (other.getExpired() != null && other.getExpired().equals(this.getExpired()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
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

        hashCode = prime * hashCode + ((getActivationId() == null) ? 0 : getActivationId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultInstanceName() == null) ? 0 : getDefaultInstanceName().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getRegistrationLimit() == null) ? 0 : getRegistrationLimit().hashCode());
        hashCode = prime * hashCode + ((getRegistrationsCount() == null) ? 0 : getRegistrationsCount().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getExpired() == null) ? 0 : getExpired().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Activation clone() {
        try {
            return (Activation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ActivationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
