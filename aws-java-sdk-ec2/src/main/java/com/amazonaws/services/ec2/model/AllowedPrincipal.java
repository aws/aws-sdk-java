/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a principal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AllowedPrincipal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllowedPrincipal implements Serializable, Cloneable {

    /**
     * <p>
     * The type of principal.
     * </p>
     */
    private String principalType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * The ID of the service permission.
     * </p>
     */
    private String servicePermissionId;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The ID of the service.
     * </p>
     */
    private String serviceId;

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @param principalType
     *        The type of principal.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @return The type of principal.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @param principalType
     *        The type of principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AllowedPrincipal withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @param principalType
     *        The type of principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AllowedPrincipal withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     * 
     * @param principal
     *        The Amazon Resource Name (ARN) of the principal.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the principal.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     * 
     * @param principal
     *        The Amazon Resource Name (ARN) of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedPrincipal withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The ID of the service permission.
     * </p>
     * 
     * @param servicePermissionId
     *        The ID of the service permission.
     */

    public void setServicePermissionId(String servicePermissionId) {
        this.servicePermissionId = servicePermissionId;
    }

    /**
     * <p>
     * The ID of the service permission.
     * </p>
     * 
     * @return The ID of the service permission.
     */

    public String getServicePermissionId() {
        return this.servicePermissionId;
    }

    /**
     * <p>
     * The ID of the service permission.
     * </p>
     * 
     * @param servicePermissionId
     *        The ID of the service permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedPrincipal withServicePermissionId(String servicePermissionId) {
        setServicePermissionId(servicePermissionId);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
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
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedPrincipal withTags(Tag... tags) {
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
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedPrincipal withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @return The ID of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedPrincipal withServiceId(String serviceId) {
        setServiceId(serviceId);
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
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getServicePermissionId() != null)
            sb.append("ServicePermissionId: ").append(getServicePermissionId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowedPrincipal == false)
            return false;
        AllowedPrincipal other = (AllowedPrincipal) obj;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getServicePermissionId() == null ^ this.getServicePermissionId() == null)
            return false;
        if (other.getServicePermissionId() != null && other.getServicePermissionId().equals(this.getServicePermissionId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getServicePermissionId() == null) ? 0 : getServicePermissionId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        return hashCode;
    }

    @Override
    public AllowedPrincipal clone() {
        try {
            return (AllowedPrincipal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
