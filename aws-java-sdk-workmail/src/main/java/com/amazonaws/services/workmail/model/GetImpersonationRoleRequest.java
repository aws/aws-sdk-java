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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetImpersonationRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImpersonationRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkMail organization from which to retrieve the impersonation role.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The impersonation role ID to retrieve.
     * </p>
     */
    private String impersonationRoleId;

    /**
     * <p>
     * The WorkMail organization from which to retrieve the impersonation role.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization from which to retrieve the impersonation role.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization from which to retrieve the impersonation role.
     * </p>
     * 
     * @return The WorkMail organization from which to retrieve the impersonation role.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization from which to retrieve the impersonation role.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization from which to retrieve the impersonation role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImpersonationRoleRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The impersonation role ID to retrieve.
     * </p>
     * 
     * @param impersonationRoleId
     *        The impersonation role ID to retrieve.
     */

    public void setImpersonationRoleId(String impersonationRoleId) {
        this.impersonationRoleId = impersonationRoleId;
    }

    /**
     * <p>
     * The impersonation role ID to retrieve.
     * </p>
     * 
     * @return The impersonation role ID to retrieve.
     */

    public String getImpersonationRoleId() {
        return this.impersonationRoleId;
    }

    /**
     * <p>
     * The impersonation role ID to retrieve.
     * </p>
     * 
     * @param impersonationRoleId
     *        The impersonation role ID to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImpersonationRoleRequest withImpersonationRoleId(String impersonationRoleId) {
        setImpersonationRoleId(impersonationRoleId);
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
        if (getImpersonationRoleId() != null)
            sb.append("ImpersonationRoleId: ").append(getImpersonationRoleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImpersonationRoleRequest == false)
            return false;
        GetImpersonationRoleRequest other = (GetImpersonationRoleRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getImpersonationRoleId() == null ^ this.getImpersonationRoleId() == null)
            return false;
        if (other.getImpersonationRoleId() != null && other.getImpersonationRoleId().equals(this.getImpersonationRoleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getImpersonationRoleId() == null) ? 0 : getImpersonationRoleId().hashCode());
        return hashCode;
    }

    @Override
    public GetImpersonationRoleRequest clone() {
        return (GetImpersonationRoleRequest) super.clone();
    }

}
