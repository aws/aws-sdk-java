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
 * The connector-specific credentials required when using Amazon Honeycode.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/HoneycodeConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HoneycodeConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The credentials used to access protected Amazon Honeycode resources.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The credentials used to acquire new access tokens.
     * </p>
     */
    private String refreshToken;

    private ConnectorOAuthRequest oAuthRequest;

    /**
     * <p>
     * The credentials used to access protected Amazon Honeycode resources.
     * </p>
     * 
     * @param accessToken
     *        The credentials used to access protected Amazon Honeycode resources.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The credentials used to access protected Amazon Honeycode resources.
     * </p>
     * 
     * @return The credentials used to access protected Amazon Honeycode resources.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The credentials used to access protected Amazon Honeycode resources.
     * </p>
     * 
     * @param accessToken
     *        The credentials used to access protected Amazon Honeycode resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoneycodeConnectorProfileCredentials withAccessToken(String accessToken) {
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

    public HoneycodeConnectorProfileCredentials withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
        return this;
    }

    /**
     * @param oAuthRequest
     */

    public void setOAuthRequest(ConnectorOAuthRequest oAuthRequest) {
        this.oAuthRequest = oAuthRequest;
    }

    /**
     * @return
     */

    public ConnectorOAuthRequest getOAuthRequest() {
        return this.oAuthRequest;
    }

    /**
     * @param oAuthRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoneycodeConnectorProfileCredentials withOAuthRequest(ConnectorOAuthRequest oAuthRequest) {
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append(getRefreshToken()).append(",");
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

        if (obj instanceof HoneycodeConnectorProfileCredentials == false)
            return false;
        HoneycodeConnectorProfileCredentials other = (HoneycodeConnectorProfileCredentials) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getOAuthRequest() == null) ? 0 : getOAuthRequest().hashCode());
        return hashCode;
    }

    @Override
    public HoneycodeConnectorProfileCredentials clone() {
        try {
            return (HoneycodeConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.HoneycodeConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
