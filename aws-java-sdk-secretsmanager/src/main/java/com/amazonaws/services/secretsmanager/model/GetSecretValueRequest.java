/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetSecretValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSecretValueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the secret to retrieve.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * The unique identifier of the version of the secret to retrieve. If you include both this parameter and
     * <code>VersionStage</code>, the two parameters must refer to the same secret version. If you don't specify either
     * a <code>VersionStage</code> or <code>VersionId</code>, then Secrets Manager returns the <code>AWSCURRENT</code>
     * version.
     * </p>
     * <p>
     * This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value
     * with 32 hexadecimal digits.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The staging label of the version of the secret to retrieve.
     * </p>
     * <p>
     * Secrets Manager uses staging labels to keep track of different versions during the rotation process. If you
     * include both this parameter and <code>VersionId</code>, the two parameters must refer to the same secret version.
     * If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, Secrets Manager returns the
     * <code>AWSCURRENT</code> version.
     * </p>
     */
    private String versionStage;

    /**
     * <p>
     * The ARN or name of the secret to retrieve.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to retrieve.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret to retrieve.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @return The ARN or name of the secret to retrieve.</p>
     *         <p>
     *         For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *         >Finding a secret from a partial ARN</a>.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret to retrieve.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to retrieve.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the version of the secret to retrieve. If you include both this parameter and
     * <code>VersionStage</code>, the two parameters must refer to the same secret version. If you don't specify either
     * a <code>VersionStage</code> or <code>VersionId</code>, then Secrets Manager returns the <code>AWSCURRENT</code>
     * version.
     * </p>
     * <p>
     * This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value
     * with 32 hexadecimal digits.
     * </p>
     * 
     * @param versionId
     *        The unique identifier of the version of the secret to retrieve. If you include both this parameter and
     *        <code>VersionStage</code>, the two parameters must refer to the same secret version. If you don't specify
     *        either a <code>VersionStage</code> or <code>VersionId</code>, then Secrets Manager returns the
     *        <code>AWSCURRENT</code> version.</p>
     *        <p>
     *        This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a>
     *        value with 32 hexadecimal digits.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The unique identifier of the version of the secret to retrieve. If you include both this parameter and
     * <code>VersionStage</code>, the two parameters must refer to the same secret version. If you don't specify either
     * a <code>VersionStage</code> or <code>VersionId</code>, then Secrets Manager returns the <code>AWSCURRENT</code>
     * version.
     * </p>
     * <p>
     * This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value
     * with 32 hexadecimal digits.
     * </p>
     * 
     * @return The unique identifier of the version of the secret to retrieve. If you include both this parameter and
     *         <code>VersionStage</code>, the two parameters must refer to the same secret version. If you don't specify
     *         either a <code>VersionStage</code> or <code>VersionId</code>, then Secrets Manager returns the
     *         <code>AWSCURRENT</code> version.</p>
     *         <p>
     *         This value is typically a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value with 32 hexadecimal
     *         digits.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The unique identifier of the version of the secret to retrieve. If you include both this parameter and
     * <code>VersionStage</code>, the two parameters must refer to the same secret version. If you don't specify either
     * a <code>VersionStage</code> or <code>VersionId</code>, then Secrets Manager returns the <code>AWSCURRENT</code>
     * version.
     * </p>
     * <p>
     * This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value
     * with 32 hexadecimal digits.
     * </p>
     * 
     * @param versionId
     *        The unique identifier of the version of the secret to retrieve. If you include both this parameter and
     *        <code>VersionStage</code>, the two parameters must refer to the same secret version. If you don't specify
     *        either a <code>VersionStage</code> or <code>VersionId</code>, then Secrets Manager returns the
     *        <code>AWSCURRENT</code> version.</p>
     *        <p>
     *        This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a>
     *        value with 32 hexadecimal digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The staging label of the version of the secret to retrieve.
     * </p>
     * <p>
     * Secrets Manager uses staging labels to keep track of different versions during the rotation process. If you
     * include both this parameter and <code>VersionId</code>, the two parameters must refer to the same secret version.
     * If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, Secrets Manager returns the
     * <code>AWSCURRENT</code> version.
     * </p>
     * 
     * @param versionStage
     *        The staging label of the version of the secret to retrieve. </p>
     *        <p>
     *        Secrets Manager uses staging labels to keep track of different versions during the rotation process. If
     *        you include both this parameter and <code>VersionId</code>, the two parameters must refer to the same
     *        secret version. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, Secrets
     *        Manager returns the <code>AWSCURRENT</code> version.
     */

    public void setVersionStage(String versionStage) {
        this.versionStage = versionStage;
    }

    /**
     * <p>
     * The staging label of the version of the secret to retrieve.
     * </p>
     * <p>
     * Secrets Manager uses staging labels to keep track of different versions during the rotation process. If you
     * include both this parameter and <code>VersionId</code>, the two parameters must refer to the same secret version.
     * If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, Secrets Manager returns the
     * <code>AWSCURRENT</code> version.
     * </p>
     * 
     * @return The staging label of the version of the secret to retrieve. </p>
     *         <p>
     *         Secrets Manager uses staging labels to keep track of different versions during the rotation process. If
     *         you include both this parameter and <code>VersionId</code>, the two parameters must refer to the same
     *         secret version. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>,
     *         Secrets Manager returns the <code>AWSCURRENT</code> version.
     */

    public String getVersionStage() {
        return this.versionStage;
    }

    /**
     * <p>
     * The staging label of the version of the secret to retrieve.
     * </p>
     * <p>
     * Secrets Manager uses staging labels to keep track of different versions during the rotation process. If you
     * include both this parameter and <code>VersionId</code>, the two parameters must refer to the same secret version.
     * If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, Secrets Manager returns the
     * <code>AWSCURRENT</code> version.
     * </p>
     * 
     * @param versionStage
     *        The staging label of the version of the secret to retrieve. </p>
     *        <p>
     *        Secrets Manager uses staging labels to keep track of different versions during the rotation process. If
     *        you include both this parameter and <code>VersionId</code>, the two parameters must refer to the same
     *        secret version. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, Secrets
     *        Manager returns the <code>AWSCURRENT</code> version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueRequest withVersionStage(String versionStage) {
        setVersionStage(versionStage);
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getVersionStage() != null)
            sb.append("VersionStage: ").append(getVersionStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSecretValueRequest == false)
            return false;
        GetSecretValueRequest other = (GetSecretValueRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getVersionStage() == null ^ this.getVersionStage() == null)
            return false;
        if (other.getVersionStage() != null && other.getVersionStage().equals(this.getVersionStage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getVersionStage() == null) ? 0 : getVersionStage().hashCode());
        return hashCode;
    }

    @Override
    public GetSecretValueRequest clone() {
        return (GetSecretValueRequest) super.clone();
    }

}
