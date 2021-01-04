/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The connector-specific profile credentials required when using Zendesk.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ZendeskConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZendeskConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the desired client.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The client secret used by the OAuth client to authenticate to the authorization server.
     * </p>
     */
    private String clientSecret;
    /**
     * <p>
     * The credentials used to access protected Zendesk resources.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The OAuth requirement needed to request security tokens from the connector endpoint.
     * </p>
     */
    private ConnectorOAuthRequest oAuthRequest;

    /**
     * <p>
     * The identifier for the desired client.
     * </p>
     * 
     * @param clientId
     *        The identifier for the desired client.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The identifier for the desired client.
     * </p>
     * 
     * @return The identifier for the desired client.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The identifier for the desired client.
     * </p>
     * 
     * @param clientId
     *        The identifier for the desired client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZendeskConnectorProfileCredentials withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The client secret used by the OAuth client to authenticate to the authorization server.
     * </p>
     * 
     * @param clientSecret
     *        The client secret used by the OAuth client to authenticate to the authorization server.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The client secret used by the OAuth client to authenticate to the authorization server.
     * </p>
     * 
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * The client secret used by the OAuth client to authenticate to the authorization server.
     * </p>
     * 
     * @param clientSecret
     *        The client secret used by the OAuth client to authenticate to the authorization server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZendeskConnectorProfileCredentials withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * <p>
     * The credentials used to access protected Zendesk resources.
     * </p>
     * 
     * @param accessToken
     *        The credentials used to access protected Zendesk resources.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The credentials used to access protected Zendesk resources.
     * </p>
     * 
     * @return The credentials used to access protected Zendesk resources.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The credentials used to access protected Zendesk resources.
     * </p>
     * 
     * @param accessToken
     *        The credentials used to access protected Zendesk resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZendeskConnectorProfileCredentials withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * The OAuth requirement needed to request security tokens from the connector endpoint.
     * </p>
     * 
     * @param oAuthRequest
     *        The OAuth requirement needed to request security tokens from the connector endpoint.
     */

    public void setOAuthRequest(ConnectorOAuthRequest oAuthRequest) {
        this.oAuthRequest = oAuthRequest;
    }

    /**
     * <p>
     * The OAuth requirement needed to request security tokens from the connector endpoint.
     * </p>
     * 
     * @return The OAuth requirement needed to request security tokens from the connector endpoint.
     */

    public ConnectorOAuthRequest getOAuthRequest() {
        return this.oAuthRequest;
    }

    /**
     * <p>
     * The OAuth requirement needed to request security tokens from the connector endpoint.
     * </p>
     * 
     * @param oAuthRequest
     *        The OAuth requirement needed to request security tokens from the connector endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZendeskConnectorProfileCredentials withOAuthRequest(ConnectorOAuthRequest oAuthRequest) {
        setOAuthRequest(oAuthRequest);
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
            sb.append("ClientSecret: ").append("***Sensitive Data Redacted***").append(",");
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getOAuthRequest() != null)
            sb.append("OAuthRequest: ").append(getOAuthRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZendeskConnectorProfileCredentials == false)
            return false;
        ZendeskConnectorProfileCredentials other = (ZendeskConnectorProfileCredentials) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getOAuthRequest() == null ^ this.getOAuthRequest() == null)
            return false;
        if (other.getOAuthRequest() != null && other.getOAuthRequest().equals(this.getOAuthRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getOAuthRequest() == null) ? 0 : getOAuthRequest().hashCode());
        return hashCode;
    }

    @Override
    public ZendeskConnectorProfileCredentials clone() {
        try {
            return (ZendeskConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ZendeskConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
