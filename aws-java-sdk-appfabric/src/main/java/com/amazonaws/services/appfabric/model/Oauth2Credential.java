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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains OAuth2 client credential information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/Oauth2Credential" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Oauth2Credential implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The client ID of the client application.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The client secret of the client application.
     * </p>
     */
    private String clientSecret;

    /**
     * <p>
     * The client ID of the client application.
     * </p>
     * 
     * @param clientId
     *        The client ID of the client application.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client ID of the client application.
     * </p>
     * 
     * @return The client ID of the client application.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The client ID of the client application.
     * </p>
     * 
     * @param clientId
     *        The client ID of the client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Oauth2Credential withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The client secret of the client application.
     * </p>
     * 
     * @param clientSecret
     *        The client secret of the client application.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The client secret of the client application.
     * </p>
     * 
     * @return The client secret of the client application.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * The client secret of the client application.
     * </p>
     * 
     * @param clientSecret
     *        The client secret of the client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Oauth2Credential withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
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
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Oauth2Credential == false)
            return false;
        Oauth2Credential other = (Oauth2Credential) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        return hashCode;
    }

    @Override
    public Oauth2Credential clone() {
        try {
            return (Oauth2Credential) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.Oauth2CredentialMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
