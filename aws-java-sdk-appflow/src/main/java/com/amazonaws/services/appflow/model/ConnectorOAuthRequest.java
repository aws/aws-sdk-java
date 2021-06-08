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
 * Used by select connectors for which the OAuth workflow is supported, such as Salesforce, Google Analytics, Marketo,
 * Zendesk, and Slack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorOAuthRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorOAuthRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code provided by the connector when it has been authenticated via the connected app.
     * </p>
     */
    private String authCode;
    /**
     * <p>
     * The URL to which the authentication server redirects the browser after authorization has been granted.
     * </p>
     */
    private String redirectUri;

    /**
     * <p>
     * The code provided by the connector when it has been authenticated via the connected app.
     * </p>
     * 
     * @param authCode
     *        The code provided by the connector when it has been authenticated via the connected app.
     */

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * <p>
     * The code provided by the connector when it has been authenticated via the connected app.
     * </p>
     * 
     * @return The code provided by the connector when it has been authenticated via the connected app.
     */

    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * <p>
     * The code provided by the connector when it has been authenticated via the connected app.
     * </p>
     * 
     * @param authCode
     *        The code provided by the connector when it has been authenticated via the connected app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorOAuthRequest withAuthCode(String authCode) {
        setAuthCode(authCode);
        return this;
    }

    /**
     * <p>
     * The URL to which the authentication server redirects the browser after authorization has been granted.
     * </p>
     * 
     * @param redirectUri
     *        The URL to which the authentication server redirects the browser after authorization has been granted.
     */

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * <p>
     * The URL to which the authentication server redirects the browser after authorization has been granted.
     * </p>
     * 
     * @return The URL to which the authentication server redirects the browser after authorization has been granted.
     */

    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * <p>
     * The URL to which the authentication server redirects the browser after authorization has been granted.
     * </p>
     * 
     * @param redirectUri
     *        The URL to which the authentication server redirects the browser after authorization has been granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorOAuthRequest withRedirectUri(String redirectUri) {
        setRedirectUri(redirectUri);
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
        if (getAuthCode() != null)
            sb.append("AuthCode: ").append(getAuthCode()).append(",");
        if (getRedirectUri() != null)
            sb.append("RedirectUri: ").append(getRedirectUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorOAuthRequest == false)
            return false;
        ConnectorOAuthRequest other = (ConnectorOAuthRequest) obj;
        if (other.getAuthCode() == null ^ this.getAuthCode() == null)
            return false;
        if (other.getAuthCode() != null && other.getAuthCode().equals(this.getAuthCode()) == false)
            return false;
        if (other.getRedirectUri() == null ^ this.getRedirectUri() == null)
            return false;
        if (other.getRedirectUri() != null && other.getRedirectUri().equals(this.getRedirectUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthCode() == null) ? 0 : getAuthCode().hashCode());
        hashCode = prime * hashCode + ((getRedirectUri() == null) ? 0 : getRedirectUri().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorOAuthRequest clone() {
        try {
            return (ConnectorOAuthRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorOAuthRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
