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
 * Contains credential information for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/Credential" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Credential implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains OAuth2 client credential information.
     * </p>
     */
    private Oauth2Credential oauth2Credential;
    /**
     * <p>
     * Contains API key credential information.
     * </p>
     */
    private ApiKeyCredential apiKeyCredential;

    /**
     * <p>
     * Contains OAuth2 client credential information.
     * </p>
     * 
     * @param oauth2Credential
     *        Contains OAuth2 client credential information.
     */

    public void setOauth2Credential(Oauth2Credential oauth2Credential) {
        this.oauth2Credential = oauth2Credential;
    }

    /**
     * <p>
     * Contains OAuth2 client credential information.
     * </p>
     * 
     * @return Contains OAuth2 client credential information.
     */

    public Oauth2Credential getOauth2Credential() {
        return this.oauth2Credential;
    }

    /**
     * <p>
     * Contains OAuth2 client credential information.
     * </p>
     * 
     * @param oauth2Credential
     *        Contains OAuth2 client credential information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credential withOauth2Credential(Oauth2Credential oauth2Credential) {
        setOauth2Credential(oauth2Credential);
        return this;
    }

    /**
     * <p>
     * Contains API key credential information.
     * </p>
     * 
     * @param apiKeyCredential
     *        Contains API key credential information.
     */

    public void setApiKeyCredential(ApiKeyCredential apiKeyCredential) {
        this.apiKeyCredential = apiKeyCredential;
    }

    /**
     * <p>
     * Contains API key credential information.
     * </p>
     * 
     * @return Contains API key credential information.
     */

    public ApiKeyCredential getApiKeyCredential() {
        return this.apiKeyCredential;
    }

    /**
     * <p>
     * Contains API key credential information.
     * </p>
     * 
     * @param apiKeyCredential
     *        Contains API key credential information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credential withApiKeyCredential(ApiKeyCredential apiKeyCredential) {
        setApiKeyCredential(apiKeyCredential);
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
        if (getOauth2Credential() != null)
            sb.append("Oauth2Credential: ").append(getOauth2Credential()).append(",");
        if (getApiKeyCredential() != null)
            sb.append("ApiKeyCredential: ").append(getApiKeyCredential());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Credential == false)
            return false;
        Credential other = (Credential) obj;
        if (other.getOauth2Credential() == null ^ this.getOauth2Credential() == null)
            return false;
        if (other.getOauth2Credential() != null && other.getOauth2Credential().equals(this.getOauth2Credential()) == false)
            return false;
        if (other.getApiKeyCredential() == null ^ this.getApiKeyCredential() == null)
            return false;
        if (other.getApiKeyCredential() != null && other.getApiKeyCredential().equals(this.getApiKeyCredential()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOauth2Credential() == null) ? 0 : getOauth2Credential().hashCode());
        hashCode = prime * hashCode + ((getApiKeyCredential() == null) ? 0 : getApiKeyCredential().hashCode());
        return hashCode;
    }

    @Override
    public Credential clone() {
        try {
            return (Credential) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.CredentialMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
