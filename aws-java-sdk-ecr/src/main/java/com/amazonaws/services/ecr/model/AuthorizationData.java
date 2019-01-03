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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing authorization data for an Amazon ECR registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/AuthorizationData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizationData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the string
     * is decoded, it is presented in the format <code>user:password</code> for private registry authentication using
     * <code>docker login</code>.
     * </p>
     */
    private String authorizationToken;
    /**
     * <p>
     * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid
     * for 12 hours.
     * </p>
     */
    private java.util.Date expiresAt;
    /**
     * <p>
     * The registry URL to use for this authorization token in a <code>docker login</code> command. The Amazon ECR
     * registry URL format is <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For example,
     * <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     * </p>
     */
    private String proxyEndpoint;

    /**
     * <p>
     * A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the string
     * is decoded, it is presented in the format <code>user:password</code> for private registry authentication using
     * <code>docker login</code>.
     * </p>
     * 
     * @param authorizationToken
     *        A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the
     *        string is decoded, it is presented in the format <code>user:password</code> for private registry
     *        authentication using <code>docker login</code>.
     */

    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    /**
     * <p>
     * A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the string
     * is decoded, it is presented in the format <code>user:password</code> for private registry authentication using
     * <code>docker login</code>.
     * </p>
     * 
     * @return A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the
     *         string is decoded, it is presented in the format <code>user:password</code> for private registry
     *         authentication using <code>docker login</code>.
     */

    public String getAuthorizationToken() {
        return this.authorizationToken;
    }

    /**
     * <p>
     * A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the string
     * is decoded, it is presented in the format <code>user:password</code> for private registry authentication using
     * <code>docker login</code>.
     * </p>
     * 
     * @param authorizationToken
     *        A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the
     *        string is decoded, it is presented in the format <code>user:password</code> for private registry
     *        authentication using <code>docker login</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationData withAuthorizationToken(String authorizationToken) {
        setAuthorizationToken(authorizationToken);
        return this;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid
     * for 12 hours.
     * </p>
     * 
     * @param expiresAt
     *        The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are
     *        valid for 12 hours.
     */

    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid
     * for 12 hours.
     * </p>
     * 
     * @return The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are
     *         valid for 12 hours.
     */

    public java.util.Date getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid
     * for 12 hours.
     * </p>
     * 
     * @param expiresAt
     *        The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are
     *        valid for 12 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationData withExpiresAt(java.util.Date expiresAt) {
        setExpiresAt(expiresAt);
        return this;
    }

    /**
     * <p>
     * The registry URL to use for this authorization token in a <code>docker login</code> command. The Amazon ECR
     * registry URL format is <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For example,
     * <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     * </p>
     * 
     * @param proxyEndpoint
     *        The registry URL to use for this authorization token in a <code>docker login</code> command. The Amazon
     *        ECR registry URL format is <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For example,
     *        <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     */

    public void setProxyEndpoint(String proxyEndpoint) {
        this.proxyEndpoint = proxyEndpoint;
    }

    /**
     * <p>
     * The registry URL to use for this authorization token in a <code>docker login</code> command. The Amazon ECR
     * registry URL format is <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For example,
     * <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     * </p>
     * 
     * @return The registry URL to use for this authorization token in a <code>docker login</code> command. The Amazon
     *         ECR registry URL format is <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For example,
     *         <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     */

    public String getProxyEndpoint() {
        return this.proxyEndpoint;
    }

    /**
     * <p>
     * The registry URL to use for this authorization token in a <code>docker login</code> command. The Amazon ECR
     * registry URL format is <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For example,
     * <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     * </p>
     * 
     * @param proxyEndpoint
     *        The registry URL to use for this authorization token in a <code>docker login</code> command. The Amazon
     *        ECR registry URL format is <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For example,
     *        <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationData withProxyEndpoint(String proxyEndpoint) {
        setProxyEndpoint(proxyEndpoint);
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
        if (getAuthorizationToken() != null)
            sb.append("AuthorizationToken: ").append(getAuthorizationToken()).append(",");
        if (getExpiresAt() != null)
            sb.append("ExpiresAt: ").append(getExpiresAt()).append(",");
        if (getProxyEndpoint() != null)
            sb.append("ProxyEndpoint: ").append(getProxyEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizationData == false)
            return false;
        AuthorizationData other = (AuthorizationData) obj;
        if (other.getAuthorizationToken() == null ^ this.getAuthorizationToken() == null)
            return false;
        if (other.getAuthorizationToken() != null && other.getAuthorizationToken().equals(this.getAuthorizationToken()) == false)
            return false;
        if (other.getExpiresAt() == null ^ this.getExpiresAt() == null)
            return false;
        if (other.getExpiresAt() != null && other.getExpiresAt().equals(this.getExpiresAt()) == false)
            return false;
        if (other.getProxyEndpoint() == null ^ this.getProxyEndpoint() == null)
            return false;
        if (other.getProxyEndpoint() != null && other.getProxyEndpoint().equals(this.getProxyEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationToken() == null) ? 0 : getAuthorizationToken().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getProxyEndpoint() == null) ? 0 : getProxyEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizationData clone() {
        try {
            return (AuthorizationData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.AuthorizationDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
