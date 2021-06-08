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
 * The connector-specific profile credentials required when using Salesforce.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SalesforceConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The credentials used to access protected Salesforce resources.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The credentials used to acquire new access tokens.
     * </p>
     */
    private String refreshToken;
    /**
     * <p>
     * The OAuth requirement needed to request security tokens from the connector endpoint.
     * </p>
     */
    private ConnectorOAuthRequest oAuthRequest;
    /**
     * <p>
     * The secret manager ARN, which contains the client ID and client secret of the connected app.
     * </p>
     */
    private String clientCredentialsArn;

    /**
     * <p>
     * The credentials used to access protected Salesforce resources.
     * </p>
     * 
     * @param accessToken
     *        The credentials used to access protected Salesforce resources.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The credentials used to access protected Salesforce resources.
     * </p>
     * 
     * @return The credentials used to access protected Salesforce resources.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The credentials used to access protected Salesforce resources.
     * </p>
     * 
     * @param accessToken
     *        The credentials used to access protected Salesforce resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConnectorProfileCredentials withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * The credentials used to acquire new access tokens.
     * </p>
     * 
     * @param refreshToken
     *        The credentials used to acquire new access tokens.
     */

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * The credentials used to acquire new access tokens.
     * </p>
     * 
     * @return The credentials used to acquire new access tokens.
     */

    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * <p>
     * The credentials used to acquire new access tokens.
     * </p>
     * 
     * @param refreshToken
     *        The credentials used to acquire new access tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConnectorProfileCredentials withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
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

    public SalesforceConnectorProfileCredentials withOAuthRequest(ConnectorOAuthRequest oAuthRequest) {
        setOAuthRequest(oAuthRequest);
        return this;
    }

    /**
     * <p>
     * The secret manager ARN, which contains the client ID and client secret of the connected app.
     * </p>
     * 
     * @param clientCredentialsArn
     *        The secret manager ARN, which contains the client ID and client secret of the connected app.
     */

    public void setClientCredentialsArn(String clientCredentialsArn) {
        this.clientCredentialsArn = clientCredentialsArn;
    }

    /**
     * <p>
     * The secret manager ARN, which contains the client ID and client secret of the connected app.
     * </p>
     * 
     * @return The secret manager ARN, which contains the client ID and client secret of the connected app.
     */

    public String getClientCredentialsArn() {
        return this.clientCredentialsArn;
    }

    /**
     * <p>
     * The secret manager ARN, which contains the client ID and client secret of the connected app.
     * </p>
     * 
     * @param clientCredentialsArn
     *        The secret manager ARN, which contains the client ID and client secret of the connected app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConnectorProfileCredentials withClientCredentialsArn(String clientCredentialsArn) {
        setClientCredentialsArn(clientCredentialsArn);
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append(getRefreshToken()).append(",");
        if (getOAuthRequest() != null)
            sb.append("OAuthRequest: ").append(getOAuthRequest()).append(",");
        if (getClientCredentialsArn() != null)
            sb.append("ClientCredentialsArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceConnectorProfileCredentials == false)
            return false;
        SalesforceConnectorProfileCredentials other = (SalesforceConnectorProfileCredentials) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getOAuthRequest() == null ^ this.getOAuthRequest() == null)
            return false;
        if (other.getOAuthRequest() != null && other.getOAuthRequest().equals(this.getOAuthRequest()) == false)
            return false;
        if (other.getClientCredentialsArn() == null ^ this.getClientCredentialsArn() == null)
            return false;
        if (other.getClientCredentialsArn() != null && other.getClientCredentialsArn().equals(this.getClientCredentialsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getOAuthRequest() == null) ? 0 : getOAuthRequest().hashCode());
        hashCode = prime * hashCode + ((getClientCredentialsArn() == null) ? 0 : getClientCredentialsArn().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceConnectorProfileCredentials clone() {
        try {
            return (SalesforceConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SalesforceConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
