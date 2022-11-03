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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetImpersonationRoleEffect"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImpersonationRoleEffectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkMail organization where the impersonation role is defined.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The impersonation role ID to test.
     * </p>
     */
    private String impersonationRoleId;
    /**
     * <p>
     * The WorkMail organization user chosen to test the impersonation role. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     */
    private String targetUser;

    /**
     * <p>
     * The WorkMail organization where the impersonation role is defined.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization where the impersonation role is defined.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization where the impersonation role is defined.
     * </p>
     * 
     * @return The WorkMail organization where the impersonation role is defined.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization where the impersonation role is defined.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization where the impersonation role is defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImpersonationRoleEffectRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The impersonation role ID to test.
     * </p>
     * 
     * @param impersonationRoleId
     *        The impersonation role ID to test.
     */

    public void setImpersonationRoleId(String impersonationRoleId) {
        this.impersonationRoleId = impersonationRoleId;
    }

    /**
     * <p>
     * The impersonation role ID to test.
     * </p>
     * 
     * @return The impersonation role ID to test.
     */

    public String getImpersonationRoleId() {
        return this.impersonationRoleId;
    }

    /**
     * <p>
     * The impersonation role ID to test.
     * </p>
     * 
     * @param impersonationRoleId
     *        The impersonation role ID to test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImpersonationRoleEffectRequest withImpersonationRoleId(String impersonationRoleId) {
        setImpersonationRoleId(impersonationRoleId);
        return this;
    }

    /**
     * <p>
     * The WorkMail organization user chosen to test the impersonation role. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetUser
     *        The WorkMail organization user chosen to test the impersonation role. The following identity formats are
     *        available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     *        <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: <code>user@domain.tld</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        User name: <code>user</code>
     *        </p>
     *        </li>
     */

    public void setTargetUser(String targetUser) {
        this.targetUser = targetUser;
    }

    /**
     * <p>
     * The WorkMail organization user chosen to test the impersonation role. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The WorkMail organization user chosen to test the impersonation role. The following identity formats are
     *         available:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     *         <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Email address: <code>user@domain.tld</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         User name: <code>user</code>
     *         </p>
     *         </li>
     */

    public String getTargetUser() {
        return this.targetUser;
    }

    /**
     * <p>
     * The WorkMail organization user chosen to test the impersonation role. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetUser
     *        The WorkMail organization user chosen to test the impersonation role. The following identity formats are
     *        available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     *        <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: <code>user@domain.tld</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        User name: <code>user</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImpersonationRoleEffectRequest withTargetUser(String targetUser) {
        setTargetUser(targetUser);
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
            sb.append("ImpersonationRoleId: ").append(getImpersonationRoleId()).append(",");
        if (getTargetUser() != null)
            sb.append("TargetUser: ").append(getTargetUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImpersonationRoleEffectRequest == false)
            return false;
        GetImpersonationRoleEffectRequest other = (GetImpersonationRoleEffectRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getImpersonationRoleId() == null ^ this.getImpersonationRoleId() == null)
            return false;
        if (other.getImpersonationRoleId() != null && other.getImpersonationRoleId().equals(this.getImpersonationRoleId()) == false)
            return false;
        if (other.getTargetUser() == null ^ this.getTargetUser() == null)
            return false;
        if (other.getTargetUser() != null && other.getTargetUser().equals(this.getTargetUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getImpersonationRoleId() == null) ? 0 : getImpersonationRoleId().hashCode());
        hashCode = prime * hashCode + ((getTargetUser() == null) ? 0 : getTargetUser().hashCode());
        return hashCode;
    }

    @Override
    public GetImpersonationRoleEffectRequest clone() {
        return (GetImpersonationRoleEffectRequest) super.clone();
    }

}
