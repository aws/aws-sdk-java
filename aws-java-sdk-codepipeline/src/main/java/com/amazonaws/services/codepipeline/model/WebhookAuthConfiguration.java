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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authentication applied to incoming webhook trigger requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/WebhookAuthConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebhookAuthConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The property used to configure acceptance of webhooks within a specific IP range. For IP, only the AllowedIPRange
     * property must be set, and this property must be set to a valid CIDR range.
     * </p>
     */
    private String allowedIPRange;
    /**
     * <p>
     * The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must be set.
     * </p>
     */
    private String secretToken;

    /**
     * <p>
     * The property used to configure acceptance of webhooks within a specific IP range. For IP, only the AllowedIPRange
     * property must be set, and this property must be set to a valid CIDR range.
     * </p>
     * 
     * @param allowedIPRange
     *        The property used to configure acceptance of webhooks within a specific IP range. For IP, only the
     *        AllowedIPRange property must be set, and this property must be set to a valid CIDR range.
     */

    public void setAllowedIPRange(String allowedIPRange) {
        this.allowedIPRange = allowedIPRange;
    }

    /**
     * <p>
     * The property used to configure acceptance of webhooks within a specific IP range. For IP, only the AllowedIPRange
     * property must be set, and this property must be set to a valid CIDR range.
     * </p>
     * 
     * @return The property used to configure acceptance of webhooks within a specific IP range. For IP, only the
     *         AllowedIPRange property must be set, and this property must be set to a valid CIDR range.
     */

    public String getAllowedIPRange() {
        return this.allowedIPRange;
    }

    /**
     * <p>
     * The property used to configure acceptance of webhooks within a specific IP range. For IP, only the AllowedIPRange
     * property must be set, and this property must be set to a valid CIDR range.
     * </p>
     * 
     * @param allowedIPRange
     *        The property used to configure acceptance of webhooks within a specific IP range. For IP, only the
     *        AllowedIPRange property must be set, and this property must be set to a valid CIDR range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookAuthConfiguration withAllowedIPRange(String allowedIPRange) {
        setAllowedIPRange(allowedIPRange);
        return this;
    }

    /**
     * <p>
     * The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must be set.
     * </p>
     * 
     * @param secretToken
     *        The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must
     *        be set.
     */

    public void setSecretToken(String secretToken) {
        this.secretToken = secretToken;
    }

    /**
     * <p>
     * The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must be set.
     * </p>
     * 
     * @return The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must
     *         be set.
     */

    public String getSecretToken() {
        return this.secretToken;
    }

    /**
     * <p>
     * The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must be set.
     * </p>
     * 
     * @param secretToken
     *        The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must
     *        be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookAuthConfiguration withSecretToken(String secretToken) {
        setSecretToken(secretToken);
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
        if (getAllowedIPRange() != null)
            sb.append("AllowedIPRange: ").append(getAllowedIPRange()).append(",");
        if (getSecretToken() != null)
            sb.append("SecretToken: ").append(getSecretToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebhookAuthConfiguration == false)
            return false;
        WebhookAuthConfiguration other = (WebhookAuthConfiguration) obj;
        if (other.getAllowedIPRange() == null ^ this.getAllowedIPRange() == null)
            return false;
        if (other.getAllowedIPRange() != null && other.getAllowedIPRange().equals(this.getAllowedIPRange()) == false)
            return false;
        if (other.getSecretToken() == null ^ this.getSecretToken() == null)
            return false;
        if (other.getSecretToken() != null && other.getSecretToken().equals(this.getSecretToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedIPRange() == null) ? 0 : getAllowedIPRange().hashCode());
        hashCode = prime * hashCode + ((getSecretToken() == null) ? 0 : getSecretToken().hashCode());
        return hashCode;
    }

    @Override
    public WebhookAuthConfiguration clone() {
        try {
            return (WebhookAuthConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.WebhookAuthConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
