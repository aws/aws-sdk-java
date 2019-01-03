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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information related to the type of user authentication that is in use for a server's users. A server can only
 * have one method of authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/IdentityProviderDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityProviderDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>IdentityProviderDetail</code> parameter contains the location of the service endpoint used to
     * authenticate users.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The <code>Role</code> parameter provides the type of <code>InvocationRole</code> used to authenticate the user
     * account.
     * </p>
     */
    private String invocationRole;

    /**
     * <p>
     * The <code>IdentityProviderDetail</code> parameter contains the location of the service endpoint used to
     * authenticate users.
     * </p>
     * 
     * @param url
     *        The <code>IdentityProviderDetail</code> parameter contains the location of the service endpoint used to
     *        authenticate users.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The <code>IdentityProviderDetail</code> parameter contains the location of the service endpoint used to
     * authenticate users.
     * </p>
     * 
     * @return The <code>IdentityProviderDetail</code> parameter contains the location of the service endpoint used to
     *         authenticate users.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The <code>IdentityProviderDetail</code> parameter contains the location of the service endpoint used to
     * authenticate users.
     * </p>
     * 
     * @param url
     *        The <code>IdentityProviderDetail</code> parameter contains the location of the service endpoint used to
     *        authenticate users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderDetails withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The <code>Role</code> parameter provides the type of <code>InvocationRole</code> used to authenticate the user
     * account.
     * </p>
     * 
     * @param invocationRole
     *        The <code>Role</code> parameter provides the type of <code>InvocationRole</code> used to authenticate the
     *        user account.
     */

    public void setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
    }

    /**
     * <p>
     * The <code>Role</code> parameter provides the type of <code>InvocationRole</code> used to authenticate the user
     * account.
     * </p>
     * 
     * @return The <code>Role</code> parameter provides the type of <code>InvocationRole</code> used to authenticate the
     *         user account.
     */

    public String getInvocationRole() {
        return this.invocationRole;
    }

    /**
     * <p>
     * The <code>Role</code> parameter provides the type of <code>InvocationRole</code> used to authenticate the user
     * account.
     * </p>
     * 
     * @param invocationRole
     *        The <code>Role</code> parameter provides the type of <code>InvocationRole</code> used to authenticate the
     *        user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderDetails withInvocationRole(String invocationRole) {
        setInvocationRole(invocationRole);
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getInvocationRole() != null)
            sb.append("InvocationRole: ").append(getInvocationRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProviderDetails == false)
            return false;
        IdentityProviderDetails other = (IdentityProviderDetails) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getInvocationRole() == null ^ this.getInvocationRole() == null)
            return false;
        if (other.getInvocationRole() != null && other.getInvocationRole().equals(this.getInvocationRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getInvocationRole() == null) ? 0 : getInvocationRole().hashCode());
        return hashCode;
    }

    @Override
    public IdentityProviderDetails clone() {
        try {
            return (IdentityProviderDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.IdentityProviderDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
