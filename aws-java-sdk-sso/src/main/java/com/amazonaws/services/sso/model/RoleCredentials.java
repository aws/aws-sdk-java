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
package com.amazonaws.services.sso.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the role credentials that are assigned to the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/RoleCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoleCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier used for the temporary security credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The key that is used to sign the request. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     */
    private String secretAccessKey;
    /**
     * <p>
     * The token used for temporary credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     */
    private String sessionToken;
    /**
     * <p>
     * The date on which temporary security credentials expire.
     * </p>
     */
    private Long expiration;

    /**
     * <p>
     * The identifier used for the temporary security credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     * 
     * @param accessKeyId
     *        The identifier used for the temporary security credentials. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using
     *        Temporary Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The identifier used for the temporary security credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     * 
     * @return The identifier used for the temporary security credentials. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using
     *         Temporary Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The identifier used for the temporary security credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     * 
     * @param accessKeyId
     *        The identifier used for the temporary security credentials. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using
     *        Temporary Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleCredentials withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The key that is used to sign the request. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     * 
     * @param secretAccessKey
     *        The key that is used to sign the request. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using
     *        Temporary Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     */

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * The key that is used to sign the request. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     * 
     * @return The key that is used to sign the request. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using
     *         Temporary Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     */

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * <p>
     * The key that is used to sign the request. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     * 
     * @param secretAccessKey
     *        The key that is used to sign the request. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using
     *        Temporary Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleCredentials withSecretAccessKey(String secretAccessKey) {
        setSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * <p>
     * The token used for temporary credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     * 
     * @param sessionToken
     *        The token used for temporary credentials. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using
     *        Temporary Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * The token used for temporary credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     * 
     * @return The token used for temporary credentials. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using
     *         Temporary Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * The token used for temporary credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using Temporary
     * Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * </p>
     * 
     * @param sessionToken
     *        The token used for temporary credentials. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_use-resources.html">Using
     *        Temporary Security Credentials to Request Access to AWS Resources</a> in the <i>AWS IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleCredentials withSessionToken(String sessionToken) {
        setSessionToken(sessionToken);
        return this;
    }

    /**
     * <p>
     * The date on which temporary security credentials expire.
     * </p>
     * 
     * @param expiration
     *        The date on which temporary security credentials expire.
     */

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The date on which temporary security credentials expire.
     * </p>
     * 
     * @return The date on which temporary security credentials expire.
     */

    public Long getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * The date on which temporary security credentials expire.
     * </p>
     * 
     * @param expiration
     *        The date on which temporary security credentials expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleCredentials withExpiration(Long expiration) {
        setExpiration(expiration);
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append(getAccessKeyId()).append(",");
        if (getSecretAccessKey() != null)
            sb.append("SecretAccessKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getSessionToken() != null)
            sb.append("SessionToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoleCredentials == false)
            return false;
        RoleCredentials other = (RoleCredentials) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null)
            return false;
        if (other.getSecretAccessKey() != null && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false)
            return false;
        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode());
        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        return hashCode;
    }

    @Override
    public RoleCredentials clone() {
        try {
            return (RoleCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sso.model.transform.RoleCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
