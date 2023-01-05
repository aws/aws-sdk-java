/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connector-specific profile credentials that are required when using the custom connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CustomConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authentication type that the custom connector uses for authenticating while creating a connector profile.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The basic credentials that are required for the authentication of the user.
     * </p>
     */
    private BasicAuthCredentials basic;
    /**
     * <p>
     * The OAuth 2.0 credentials required for the authentication of the user.
     * </p>
     */
    private OAuth2Credentials oauth2;
    /**
     * <p>
     * The API keys required for the authentication of the user.
     * </p>
     */
    private ApiKeyCredentials apiKey;
    /**
     * <p>
     * If the connector uses the custom authentication mechanism, this holds the required credentials.
     * </p>
     */
    private CustomAuthCredentials custom;

    /**
     * <p>
     * The authentication type that the custom connector uses for authenticating while creating a connector profile.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type that the custom connector uses for authenticating while creating a connector
     *        profile.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication type that the custom connector uses for authenticating while creating a connector profile.
     * </p>
     * 
     * @return The authentication type that the custom connector uses for authenticating while creating a connector
     *         profile.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication type that the custom connector uses for authenticating while creating a connector profile.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type that the custom connector uses for authenticating while creating a connector
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public CustomConnectorProfileCredentials withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication type that the custom connector uses for authenticating while creating a connector profile.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type that the custom connector uses for authenticating while creating a connector
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public CustomConnectorProfileCredentials withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The basic credentials that are required for the authentication of the user.
     * </p>
     * 
     * @param basic
     *        The basic credentials that are required for the authentication of the user.
     */

    public void setBasic(BasicAuthCredentials basic) {
        this.basic = basic;
    }

    /**
     * <p>
     * The basic credentials that are required for the authentication of the user.
     * </p>
     * 
     * @return The basic credentials that are required for the authentication of the user.
     */

    public BasicAuthCredentials getBasic() {
        return this.basic;
    }

    /**
     * <p>
     * The basic credentials that are required for the authentication of the user.
     * </p>
     * 
     * @param basic
     *        The basic credentials that are required for the authentication of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorProfileCredentials withBasic(BasicAuthCredentials basic) {
        setBasic(basic);
        return this;
    }

    /**
     * <p>
     * The OAuth 2.0 credentials required for the authentication of the user.
     * </p>
     * 
     * @param oauth2
     *        The OAuth 2.0 credentials required for the authentication of the user.
     */

    public void setOauth2(OAuth2Credentials oauth2) {
        this.oauth2 = oauth2;
    }

    /**
     * <p>
     * The OAuth 2.0 credentials required for the authentication of the user.
     * </p>
     * 
     * @return The OAuth 2.0 credentials required for the authentication of the user.
     */

    public OAuth2Credentials getOauth2() {
        return this.oauth2;
    }

    /**
     * <p>
     * The OAuth 2.0 credentials required for the authentication of the user.
     * </p>
     * 
     * @param oauth2
     *        The OAuth 2.0 credentials required for the authentication of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorProfileCredentials withOauth2(OAuth2Credentials oauth2) {
        setOauth2(oauth2);
        return this;
    }

    /**
     * <p>
     * The API keys required for the authentication of the user.
     * </p>
     * 
     * @param apiKey
     *        The API keys required for the authentication of the user.
     */

    public void setApiKey(ApiKeyCredentials apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * <p>
     * The API keys required for the authentication of the user.
     * </p>
     * 
     * @return The API keys required for the authentication of the user.
     */

    public ApiKeyCredentials getApiKey() {
        return this.apiKey;
    }

    /**
     * <p>
     * The API keys required for the authentication of the user.
     * </p>
     * 
     * @param apiKey
     *        The API keys required for the authentication of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorProfileCredentials withApiKey(ApiKeyCredentials apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * <p>
     * If the connector uses the custom authentication mechanism, this holds the required credentials.
     * </p>
     * 
     * @param custom
     *        If the connector uses the custom authentication mechanism, this holds the required credentials.
     */

    public void setCustom(CustomAuthCredentials custom) {
        this.custom = custom;
    }

    /**
     * <p>
     * If the connector uses the custom authentication mechanism, this holds the required credentials.
     * </p>
     * 
     * @return If the connector uses the custom authentication mechanism, this holds the required credentials.
     */

    public CustomAuthCredentials getCustom() {
        return this.custom;
    }

    /**
     * <p>
     * If the connector uses the custom authentication mechanism, this holds the required credentials.
     * </p>
     * 
     * @param custom
     *        If the connector uses the custom authentication mechanism, this holds the required credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorProfileCredentials withCustom(CustomAuthCredentials custom) {
        setCustom(custom);
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
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getBasic() != null)
            sb.append("Basic: ").append(getBasic()).append(",");
        if (getOauth2() != null)
            sb.append("Oauth2: ").append(getOauth2()).append(",");
        if (getApiKey() != null)
            sb.append("ApiKey: ").append(getApiKey()).append(",");
        if (getCustom() != null)
            sb.append("Custom: ").append(getCustom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomConnectorProfileCredentials == false)
            return false;
        CustomConnectorProfileCredentials other = (CustomConnectorProfileCredentials) obj;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getBasic() == null ^ this.getBasic() == null)
            return false;
        if (other.getBasic() != null && other.getBasic().equals(this.getBasic()) == false)
            return false;
        if (other.getOauth2() == null ^ this.getOauth2() == null)
            return false;
        if (other.getOauth2() != null && other.getOauth2().equals(this.getOauth2()) == false)
            return false;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getCustom() == null ^ this.getCustom() == null)
            return false;
        if (other.getCustom() != null && other.getCustom().equals(this.getCustom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getBasic() == null) ? 0 : getBasic().hashCode());
        hashCode = prime * hashCode + ((getOauth2() == null) ? 0 : getOauth2().hashCode());
        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getCustom() == null) ? 0 : getCustom().hashCode());
        return hashCode;
    }

    @Override
    public CustomConnectorProfileCredentials clone() {
        try {
            return (CustomConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.CustomConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
