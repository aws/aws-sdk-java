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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdatePrimaryEmailAddress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePrimaryEmailAddressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The organization that contains the user, group, or resource to update.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The user, group, or resource to update.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The value of the email to be updated as primary.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The organization that contains the user, group, or resource to update.
     * </p>
     * 
     * @param organizationId
     *        The organization that contains the user, group, or resource to update.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The organization that contains the user, group, or resource to update.
     * </p>
     * 
     * @return The organization that contains the user, group, or resource to update.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The organization that contains the user, group, or resource to update.
     * </p>
     * 
     * @param organizationId
     *        The organization that contains the user, group, or resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePrimaryEmailAddressRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The user, group, or resource to update.
     * </p>
     * 
     * @param entityId
     *        The user, group, or resource to update.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The user, group, or resource to update.
     * </p>
     * 
     * @return The user, group, or resource to update.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The user, group, or resource to update.
     * </p>
     * 
     * @param entityId
     *        The user, group, or resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePrimaryEmailAddressRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The value of the email to be updated as primary.
     * </p>
     * 
     * @param email
     *        The value of the email to be updated as primary.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The value of the email to be updated as primary.
     * </p>
     * 
     * @return The value of the email to be updated as primary.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The value of the email to be updated as primary.
     * </p>
     * 
     * @param email
     *        The value of the email to be updated as primary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePrimaryEmailAddressRequest withEmail(String email) {
        setEmail(email);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePrimaryEmailAddressRequest == false)
            return false;
        UpdatePrimaryEmailAddressRequest other = (UpdatePrimaryEmailAddressRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePrimaryEmailAddressRequest clone() {
        return (UpdatePrimaryEmailAddressRequest) super.clone();
    }

}
