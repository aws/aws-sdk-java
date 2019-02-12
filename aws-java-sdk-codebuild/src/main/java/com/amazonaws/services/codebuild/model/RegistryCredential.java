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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about credentials that provide access to a private Docker registry. When this is set:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>imagePullCredentialsType</code> must be set to <code>SERVICE_ROLE</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * images cannot be curated or an Amazon ECR image.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/codebuild/latest/userguide/sample-private-registry.html">Private Registry with AWS
 * Secrets Manager Sample for AWS CodeBuild</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/RegistryCredential" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistryCredential implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.
     * </p>
     * <note>
     * <p>
     * The <code>credential</code> can use the name of the credentials only if they exist in your current region.
     * </p>
     * </note>
     */
    private String credential;
    /**
     * <p>
     * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER,
     * is for AWS Secrets Manager.
     * </p>
     */
    private String credentialProvider;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.
     * </p>
     * <note>
     * <p>
     * The <code>credential</code> can use the name of the credentials only if they exist in your current region.
     * </p>
     * </note>
     * 
     * @param credential
     *        The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager. </p> <note>
     *        <p>
     *        The <code>credential</code> can use the name of the credentials only if they exist in your current region.
     *        </p>
     */

    public void setCredential(String credential) {
        this.credential = credential;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.
     * </p>
     * <note>
     * <p>
     * The <code>credential</code> can use the name of the credentials only if they exist in your current region.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager. </p> <note>
     *         <p>
     *         The <code>credential</code> can use the name of the credentials only if they exist in your current
     *         region.
     *         </p>
     */

    public String getCredential() {
        return this.credential;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.
     * </p>
     * <note>
     * <p>
     * The <code>credential</code> can use the name of the credentials only if they exist in your current region.
     * </p>
     * </note>
     * 
     * @param credential
     *        The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager. </p> <note>
     *        <p>
     *        The <code>credential</code> can use the name of the credentials only if they exist in your current region.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryCredential withCredential(String credential) {
        setCredential(credential);
        return this;
    }

    /**
     * <p>
     * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER,
     * is for AWS Secrets Manager.
     * </p>
     * 
     * @param credentialProvider
     *        The service that created the credentials to access a private Docker registry. The valid value,
     *        SECRETS_MANAGER, is for AWS Secrets Manager.
     * @see CredentialProviderType
     */

    public void setCredentialProvider(String credentialProvider) {
        this.credentialProvider = credentialProvider;
    }

    /**
     * <p>
     * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER,
     * is for AWS Secrets Manager.
     * </p>
     * 
     * @return The service that created the credentials to access a private Docker registry. The valid value,
     *         SECRETS_MANAGER, is for AWS Secrets Manager.
     * @see CredentialProviderType
     */

    public String getCredentialProvider() {
        return this.credentialProvider;
    }

    /**
     * <p>
     * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER,
     * is for AWS Secrets Manager.
     * </p>
     * 
     * @param credentialProvider
     *        The service that created the credentials to access a private Docker registry. The valid value,
     *        SECRETS_MANAGER, is for AWS Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CredentialProviderType
     */

    public RegistryCredential withCredentialProvider(String credentialProvider) {
        setCredentialProvider(credentialProvider);
        return this;
    }

    /**
     * <p>
     * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER,
     * is for AWS Secrets Manager.
     * </p>
     * 
     * @param credentialProvider
     *        The service that created the credentials to access a private Docker registry. The valid value,
     *        SECRETS_MANAGER, is for AWS Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CredentialProviderType
     */

    public RegistryCredential withCredentialProvider(CredentialProviderType credentialProvider) {
        this.credentialProvider = credentialProvider.toString();
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
        if (getCredential() != null)
            sb.append("Credential: ").append(getCredential()).append(",");
        if (getCredentialProvider() != null)
            sb.append("CredentialProvider: ").append(getCredentialProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistryCredential == false)
            return false;
        RegistryCredential other = (RegistryCredential) obj;
        if (other.getCredential() == null ^ this.getCredential() == null)
            return false;
        if (other.getCredential() != null && other.getCredential().equals(this.getCredential()) == false)
            return false;
        if (other.getCredentialProvider() == null ^ this.getCredentialProvider() == null)
            return false;
        if (other.getCredentialProvider() != null && other.getCredentialProvider().equals(this.getCredentialProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredential() == null) ? 0 : getCredential().hashCode());
        hashCode = prime * hashCode + ((getCredentialProvider() == null) ? 0 : getCredentialProvider().hashCode());
        return hashCode;
    }

    @Override
    public RegistryCredential clone() {
        try {
            return (RegistryCredential) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.RegistryCredentialMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
