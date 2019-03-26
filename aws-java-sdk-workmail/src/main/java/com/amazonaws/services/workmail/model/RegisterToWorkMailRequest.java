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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterToWorkMail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterToWorkMailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the organization under which the user, group, or resource exists.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier for the user, group, or resource to be updated.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The email for the user, group, or resource to be updated.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The identifier for the organization under which the user, group, or resource exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the user, group, or resource exists.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the user, group, or resource exists.
     * </p>
     * 
     * @return The identifier for the organization under which the user, group, or resource exists.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the user, group, or resource exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the user, group, or resource exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterToWorkMailRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier for the user, group, or resource to be updated.
     * </p>
     * 
     * @param entityId
     *        The identifier for the user, group, or resource to be updated.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier for the user, group, or resource to be updated.
     * </p>
     * 
     * @return The identifier for the user, group, or resource to be updated.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier for the user, group, or resource to be updated.
     * </p>
     * 
     * @param entityId
     *        The identifier for the user, group, or resource to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterToWorkMailRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The email for the user, group, or resource to be updated.
     * </p>
     * 
     * @param email
     *        The email for the user, group, or resource to be updated.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email for the user, group, or resource to be updated.
     * </p>
     * 
     * @return The email for the user, group, or resource to be updated.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email for the user, group, or resource to be updated.
     * </p>
     * 
     * @param email
     *        The email for the user, group, or resource to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterToWorkMailRequest withEmail(String email) {
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

        if (obj instanceof RegisterToWorkMailRequest == false)
            return false;
        RegisterToWorkMailRequest other = (RegisterToWorkMailRequest) obj;
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
    public RegisterToWorkMailRequest clone() {
        return (RegisterToWorkMailRequest) super.clone();
    }

}
