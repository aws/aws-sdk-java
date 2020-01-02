/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssooidc.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/RegisterClient" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterClientRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The friendly name of the client.
     * </p>
     */
    private String clientName;
    /**
     * <p>
     * The type of client. The service supports only <code>public</code> as a client type. Anything other than public
     * will be rejected by the service.
     * </p>
     */
    private String clientType;
    /**
     * <p>
     * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     */
    private java.util.List<String> scopes;

    /**
     * <p>
     * The friendly name of the client.
     * </p>
     * 
     * @param clientName
     *        The friendly name of the client.
     */

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The friendly name of the client.
     * </p>
     * 
     * @return The friendly name of the client.
     */

    public String getClientName() {
        return this.clientName;
    }

    /**
     * <p>
     * The friendly name of the client.
     * </p>
     * 
     * @param clientName
     *        The friendly name of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withClientName(String clientName) {
        setClientName(clientName);
        return this;
    }

    /**
     * <p>
     * The type of client. The service supports only <code>public</code> as a client type. Anything other than public
     * will be rejected by the service.
     * </p>
     * 
     * @param clientType
     *        The type of client. The service supports only <code>public</code> as a client type. Anything other than
     *        public will be rejected by the service.
     */

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    /**
     * <p>
     * The type of client. The service supports only <code>public</code> as a client type. Anything other than public
     * will be rejected by the service.
     * </p>
     * 
     * @return The type of client. The service supports only <code>public</code> as a client type. Anything other than
     *         public will be rejected by the service.
     */

    public String getClientType() {
        return this.clientType;
    }

    /**
     * <p>
     * The type of client. The service supports only <code>public</code> as a client type. Anything other than public
     * will be rejected by the service.
     * </p>
     * 
     * @param clientType
     *        The type of client. The service supports only <code>public</code> as a client type. Anything other than
     *        public will be rejected by the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withClientType(String clientType) {
        setClientType(clientType);
        return this;
    }

    /**
     * <p>
     * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * 
     * @return The list of scopes that are defined by the client. Upon authorization, this list is used to restrict
     *         permissions when granting an access token.
     */

    public java.util.List<String> getScopes() {
        return scopes;
    }

    /**
     * <p>
     * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * 
     * @param scopes
     *        The list of scopes that are defined by the client. Upon authorization, this list is used to restrict
     *        permissions when granting an access token.
     */

    public void setScopes(java.util.Collection<String> scopes) {
        if (scopes == null) {
            this.scopes = null;
            return;
        }

        this.scopes = new java.util.ArrayList<String>(scopes);
    }

    /**
     * <p>
     * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScopes(java.util.Collection)} or {@link #withScopes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scopes
     *        The list of scopes that are defined by the client. Upon authorization, this list is used to restrict
     *        permissions when granting an access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withScopes(String... scopes) {
        if (this.scopes == null) {
            setScopes(new java.util.ArrayList<String>(scopes.length));
        }
        for (String ele : scopes) {
            this.scopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * 
     * @param scopes
     *        The list of scopes that are defined by the client. Upon authorization, this list is used to restrict
     *        permissions when granting an access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withScopes(java.util.Collection<String> scopes) {
        setScopes(scopes);
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
        if (getClientName() != null)
            sb.append("ClientName: ").append(getClientName()).append(",");
        if (getClientType() != null)
            sb.append("ClientType: ").append(getClientType()).append(",");
        if (getScopes() != null)
            sb.append("Scopes: ").append(getScopes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterClientRequest == false)
            return false;
        RegisterClientRequest other = (RegisterClientRequest) obj;
        if (other.getClientName() == null ^ this.getClientName() == null)
            return false;
        if (other.getClientName() != null && other.getClientName().equals(this.getClientName()) == false)
            return false;
        if (other.getClientType() == null ^ this.getClientType() == null)
            return false;
        if (other.getClientType() != null && other.getClientType().equals(this.getClientType()) == false)
            return false;
        if (other.getScopes() == null ^ this.getScopes() == null)
            return false;
        if (other.getScopes() != null && other.getScopes().equals(this.getScopes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientName() == null) ? 0 : getClientName().hashCode());
        hashCode = prime * hashCode + ((getClientType() == null) ? 0 : getClientType().hashCode());
        hashCode = prime * hashCode + ((getScopes() == null) ? 0 : getScopes().hashCode());
        return hashCode;
    }

    @Override
    public RegisterClientRequest clone() {
        return (RegisterClientRequest) super.clone();
    }

}
