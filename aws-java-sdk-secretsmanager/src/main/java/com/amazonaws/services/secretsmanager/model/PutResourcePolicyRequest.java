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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the secret to attach the resource-based policy.
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
     * A JSON-formatted string for an Amazon Web Services resource-based policy. For example policies, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     * policy examples</a>.
     * </p>
     */
    private String resourcePolicy;
    /**
     * <p>
     * Specifies whether to block resource-based policies that allow broad access to the secret, for example those that
     * use a wildcard for the principal.
     * </p>
     */
    private Boolean blockPublicPolicy;

    /**
     * <p>
     * The ARN or name of the secret to attach the resource-based policy.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to attach the resource-based policy.</p>
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
     * The ARN or name of the secret to attach the resource-based policy.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @return The ARN or name of the secret to attach the resource-based policy.</p>
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
     * The ARN or name of the secret to attach the resource-based policy.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to attach the resource-based policy.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * A JSON-formatted string for an Amazon Web Services resource-based policy. For example policies, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     * policy examples</a>.
     * </p>
     * 
     * @param resourcePolicy
     *        A JSON-formatted string for an Amazon Web Services resource-based policy. For example policies, see <a
     *        href
     *        ="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     *        policy examples</a>.
     */

    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * A JSON-formatted string for an Amazon Web Services resource-based policy. For example policies, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     * policy examples</a>.
     * </p>
     * 
     * @return A JSON-formatted string for an Amazon Web Services resource-based policy. For example policies, see <a
     *         href
     *         ="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     *         policy examples</a>.
     */

    public String getResourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     * <p>
     * A JSON-formatted string for an Amazon Web Services resource-based policy. For example policies, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     * policy examples</a>.
     * </p>
     * 
     * @param resourcePolicy
     *        A JSON-formatted string for an Amazon Web Services resource-based policy. For example policies, see <a
     *        href
     *        ="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     *        policy examples</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourcePolicy(String resourcePolicy) {
        setResourcePolicy(resourcePolicy);
        return this;
    }

    /**
     * <p>
     * Specifies whether to block resource-based policies that allow broad access to the secret, for example those that
     * use a wildcard for the principal.
     * </p>
     * 
     * @param blockPublicPolicy
     *        Specifies whether to block resource-based policies that allow broad access to the secret, for example
     *        those that use a wildcard for the principal.
     */

    public void setBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether to block resource-based policies that allow broad access to the secret, for example those that
     * use a wildcard for the principal.
     * </p>
     * 
     * @return Specifies whether to block resource-based policies that allow broad access to the secret, for example
     *         those that use a wildcard for the principal.
     */

    public Boolean getBlockPublicPolicy() {
        return this.blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether to block resource-based policies that allow broad access to the secret, for example those that
     * use a wildcard for the principal.
     * </p>
     * 
     * @param blockPublicPolicy
     *        Specifies whether to block resource-based policies that allow broad access to the secret, for example
     *        those that use a wildcard for the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withBlockPublicPolicy(Boolean blockPublicPolicy) {
        setBlockPublicPolicy(blockPublicPolicy);
        return this;
    }

    /**
     * <p>
     * Specifies whether to block resource-based policies that allow broad access to the secret, for example those that
     * use a wildcard for the principal.
     * </p>
     * 
     * @return Specifies whether to block resource-based policies that allow broad access to the secret, for example
     *         those that use a wildcard for the principal.
     */

    public Boolean isBlockPublicPolicy() {
        return this.blockPublicPolicy;
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
        if (getResourcePolicy() != null)
            sb.append("ResourcePolicy: ").append(getResourcePolicy()).append(",");
        if (getBlockPublicPolicy() != null)
            sb.append("BlockPublicPolicy: ").append(getBlockPublicPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null)
            return false;
        if (other.getResourcePolicy() != null && other.getResourcePolicy().equals(this.getResourcePolicy()) == false)
            return false;
        if (other.getBlockPublicPolicy() == null ^ this.getBlockPublicPolicy() == null)
            return false;
        if (other.getBlockPublicPolicy() != null && other.getBlockPublicPolicy().equals(this.getBlockPublicPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        hashCode = prime * hashCode + ((getBlockPublicPolicy() == null) ? 0 : getBlockPublicPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
