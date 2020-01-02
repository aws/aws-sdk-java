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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/StartDeviceAuthorization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDeviceAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier string for the client that is registered with AWS SSO. This value should come from the
     * persisted result of the <a>RegisterClient</a> API operation.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * A secret string that is generated for the client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API operation.
     * </p>
     */
    private String clientSecret;
    /**
     * <p>
     * The URL for the AWS SSO user portal. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/using-the-portal.html">Using the User Portal</a>
     * in the <i>AWS Single Sign-On User Guide</i>.
     * </p>
     */
    private String startUrl;

    /**
     * <p>
     * The unique identifier string for the client that is registered with AWS SSO. This value should come from the
     * persisted result of the <a>RegisterClient</a> API operation.
     * </p>
     * 
     * @param clientId
     *        The unique identifier string for the client that is registered with AWS SSO. This value should come from
     *        the persisted result of the <a>RegisterClient</a> API operation.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The unique identifier string for the client that is registered with AWS SSO. This value should come from the
     * persisted result of the <a>RegisterClient</a> API operation.
     * </p>
     * 
     * @return The unique identifier string for the client that is registered with AWS SSO. This value should come from
     *         the persisted result of the <a>RegisterClient</a> API operation.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The unique identifier string for the client that is registered with AWS SSO. This value should come from the
     * persisted result of the <a>RegisterClient</a> API operation.
     * </p>
     * 
     * @param clientId
     *        The unique identifier string for the client that is registered with AWS SSO. This value should come from
     *        the persisted result of the <a>RegisterClient</a> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceAuthorizationRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * A secret string that is generated for the client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API operation.
     * </p>
     * 
     * @param clientSecret
     *        A secret string that is generated for the client. This value should come from the persisted result of the
     *        <a>RegisterClient</a> API operation.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * A secret string that is generated for the client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API operation.
     * </p>
     * 
     * @return A secret string that is generated for the client. This value should come from the persisted result of the
     *         <a>RegisterClient</a> API operation.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * A secret string that is generated for the client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API operation.
     * </p>
     * 
     * @param clientSecret
     *        A secret string that is generated for the client. This value should come from the persisted result of the
     *        <a>RegisterClient</a> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceAuthorizationRequest withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * <p>
     * The URL for the AWS SSO user portal. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/using-the-portal.html">Using the User Portal</a>
     * in the <i>AWS Single Sign-On User Guide</i>.
     * </p>
     * 
     * @param startUrl
     *        The URL for the AWS SSO user portal. For more information, see <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/userguide/using-the-portal.html">Using the User
     *        Portal</a> in the <i>AWS Single Sign-On User Guide</i>.
     */

    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }

    /**
     * <p>
     * The URL for the AWS SSO user portal. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/using-the-portal.html">Using the User Portal</a>
     * in the <i>AWS Single Sign-On User Guide</i>.
     * </p>
     * 
     * @return The URL for the AWS SSO user portal. For more information, see <a
     *         href="https://docs.aws.amazon.com/singlesignon/latest/userguide/using-the-portal.html">Using the User
     *         Portal</a> in the <i>AWS Single Sign-On User Guide</i>.
     */

    public String getStartUrl() {
        return this.startUrl;
    }

    /**
     * <p>
     * The URL for the AWS SSO user portal. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/using-the-portal.html">Using the User Portal</a>
     * in the <i>AWS Single Sign-On User Guide</i>.
     * </p>
     * 
     * @param startUrl
     *        The URL for the AWS SSO user portal. For more information, see <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/userguide/using-the-portal.html">Using the User
     *        Portal</a> in the <i>AWS Single Sign-On User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceAuthorizationRequest withStartUrl(String startUrl) {
        setStartUrl(startUrl);
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
            sb.append("ClientSecret: ").append(getClientSecret()).append(",");
        if (getStartUrl() != null)
            sb.append("StartUrl: ").append(getStartUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDeviceAuthorizationRequest == false)
            return false;
        StartDeviceAuthorizationRequest other = (StartDeviceAuthorizationRequest) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getStartUrl() == null ^ this.getStartUrl() == null)
            return false;
        if (other.getStartUrl() != null && other.getStartUrl().equals(this.getStartUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode + ((getStartUrl() == null) ? 0 : getStartUrl().hashCode());
        return hashCode;
    }

    @Override
    public StartDeviceAuthorizationRequest clone() {
        return (StartDeviceAuthorizationRequest) super.clone();
    }

}
