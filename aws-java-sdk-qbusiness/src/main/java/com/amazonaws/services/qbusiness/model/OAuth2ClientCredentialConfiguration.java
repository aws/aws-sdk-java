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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/OAuth2ClientCredentialConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OAuth2ClientCredentialConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Secrets Manager secret that stores the OAuth 2.0 credentials/token used for plugin configuration.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0 authentication credentials stored in a
     * Secrets Manager secret.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The ARN of the Secrets Manager secret that stores the OAuth 2.0 credentials/token used for plugin configuration.
     * </p>
     * 
     * @param secretArn
     *        The ARN of the Secrets Manager secret that stores the OAuth 2.0 credentials/token used for plugin
     *        configuration.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret that stores the OAuth 2.0 credentials/token used for plugin configuration.
     * </p>
     * 
     * @return The ARN of the Secrets Manager secret that stores the OAuth 2.0 credentials/token used for plugin
     *         configuration.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret that stores the OAuth 2.0 credentials/token used for plugin configuration.
     * </p>
     * 
     * @param secretArn
     *        The ARN of the Secrets Manager secret that stores the OAuth 2.0 credentials/token used for plugin
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2ClientCredentialConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0 authentication credentials stored in a
     * Secrets Manager secret.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0 authentication credentials stored
     *        in a Secrets Manager secret.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0 authentication credentials stored in a
     * Secrets Manager secret.
     * </p>
     * 
     * @return The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0 authentication credentials
     *         stored in a Secrets Manager secret.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0 authentication credentials stored in a
     * Secrets Manager secret.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0 authentication credentials stored
     *        in a Secrets Manager secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2ClientCredentialConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OAuth2ClientCredentialConfiguration == false)
            return false;
        OAuth2ClientCredentialConfiguration other = (OAuth2ClientCredentialConfiguration) obj;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public OAuth2ClientCredentialConfiguration clone() {
        try {
            return (OAuth2ClientCredentialConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.OAuth2ClientCredentialConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
