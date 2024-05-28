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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The login credentials to use to import a data source resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobDataSourceCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobDataSourceCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A username and password credential pair to be used to create the imported data source. Keep this field blank if
     * you are using a Secrets Manager secret to provide credentials.
     * </p>
     */
    private AssetBundleImportJobDataSourceCredentialPair credentialPair;
    /**
     * <p>
     * The ARN of the Secrets Manager secret that's used to create the imported data source. Keep this field blank,
     * unless you are using a secret in place of a credential pair.
     * </p>
     */
    private String secretArn;

    /**
     * <p>
     * A username and password credential pair to be used to create the imported data source. Keep this field blank if
     * you are using a Secrets Manager secret to provide credentials.
     * </p>
     * 
     * @param credentialPair
     *        A username and password credential pair to be used to create the imported data source. Keep this field
     *        blank if you are using a Secrets Manager secret to provide credentials.
     */

    public void setCredentialPair(AssetBundleImportJobDataSourceCredentialPair credentialPair) {
        this.credentialPair = credentialPair;
    }

    /**
     * <p>
     * A username and password credential pair to be used to create the imported data source. Keep this field blank if
     * you are using a Secrets Manager secret to provide credentials.
     * </p>
     * 
     * @return A username and password credential pair to be used to create the imported data source. Keep this field
     *         blank if you are using a Secrets Manager secret to provide credentials.
     */

    public AssetBundleImportJobDataSourceCredentialPair getCredentialPair() {
        return this.credentialPair;
    }

    /**
     * <p>
     * A username and password credential pair to be used to create the imported data source. Keep this field blank if
     * you are using a Secrets Manager secret to provide credentials.
     * </p>
     * 
     * @param credentialPair
     *        A username and password credential pair to be used to create the imported data source. Keep this field
     *        blank if you are using a Secrets Manager secret to provide credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceCredentials withCredentialPair(AssetBundleImportJobDataSourceCredentialPair credentialPair) {
        setCredentialPair(credentialPair);
        return this;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret that's used to create the imported data source. Keep this field blank,
     * unless you are using a secret in place of a credential pair.
     * </p>
     * 
     * @param secretArn
     *        The ARN of the Secrets Manager secret that's used to create the imported data source. Keep this field
     *        blank, unless you are using a secret in place of a credential pair.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret that's used to create the imported data source. Keep this field blank,
     * unless you are using a secret in place of a credential pair.
     * </p>
     * 
     * @return The ARN of the Secrets Manager secret that's used to create the imported data source. Keep this field
     *         blank, unless you are using a secret in place of a credential pair.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret that's used to create the imported data source. Keep this field blank,
     * unless you are using a secret in place of a credential pair.
     * </p>
     * 
     * @param secretArn
     *        The ARN of the Secrets Manager secret that's used to create the imported data source. Keep this field
     *        blank, unless you are using a secret in place of a credential pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSourceCredentials withSecretArn(String secretArn) {
        setSecretArn(secretArn);
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
        if (getCredentialPair() != null)
            sb.append("CredentialPair: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportJobDataSourceCredentials == false)
            return false;
        AssetBundleImportJobDataSourceCredentials other = (AssetBundleImportJobDataSourceCredentials) obj;
        if (other.getCredentialPair() == null ^ this.getCredentialPair() == null)
            return false;
        if (other.getCredentialPair() != null && other.getCredentialPair().equals(this.getCredentialPair()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentialPair() == null) ? 0 : getCredentialPair().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobDataSourceCredentials clone() {
        try {
            return (AssetBundleImportJobDataSourceCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobDataSourceCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
