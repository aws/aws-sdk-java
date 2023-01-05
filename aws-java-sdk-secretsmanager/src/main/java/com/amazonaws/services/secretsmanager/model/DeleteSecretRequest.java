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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSecretRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the secret to delete.
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
     * The number of days from 7 to 30 that Secrets Manager waits before permanently deleting the secret. You can't use
     * both this parameter and <code>ForceDeleteWithoutRecovery</code> in the same call. If you don't use either, then
     * Secrets Manager defaults to a 30 day recovery window.
     * </p>
     */
    private Long recoveryWindowInDays;
    /**
     * <p>
     * Specifies whether to delete the secret without any recovery window. You can't use both this parameter and
     * <code>RecoveryWindowInDays</code> in the same call. If you don't use either, then Secrets Manager defaults to a
     * 30 day recovery window.
     * </p>
     * <p>
     * Secrets Manager performs the actual deletion with an asynchronous background process, so there might be a short
     * delay before the secret is permanently deleted. If you delete a secret and then immediately create a secret with
     * the same name, use appropriate back off and retry logic.
     * </p>
     * <important>
     * <p>
     * Use this parameter with caution. This parameter causes the operation to skip the normal recovery window before
     * the permanent deletion that Secrets Manager would normally impose with the <code>RecoveryWindowInDays</code>
     * parameter. If you delete a secret with the <code>ForceDeleteWithoutRecovery</code> parameter, then you have no
     * opportunity to recover the secret. You lose the secret permanently.
     * </p>
     * </important>
     */
    private Boolean forceDeleteWithoutRecovery;

    /**
     * <p>
     * The ARN or name of the secret to delete.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to delete.</p>
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
     * The ARN or name of the secret to delete.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @return The ARN or name of the secret to delete.</p>
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
     * The ARN or name of the secret to delete.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret to delete.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * The number of days from 7 to 30 that Secrets Manager waits before permanently deleting the secret. You can't use
     * both this parameter and <code>ForceDeleteWithoutRecovery</code> in the same call. If you don't use either, then
     * Secrets Manager defaults to a 30 day recovery window.
     * </p>
     * 
     * @param recoveryWindowInDays
     *        The number of days from 7 to 30 that Secrets Manager waits before permanently deleting the secret. You
     *        can't use both this parameter and <code>ForceDeleteWithoutRecovery</code> in the same call. If you don't
     *        use either, then Secrets Manager defaults to a 30 day recovery window.
     */

    public void setRecoveryWindowInDays(Long recoveryWindowInDays) {
        this.recoveryWindowInDays = recoveryWindowInDays;
    }

    /**
     * <p>
     * The number of days from 7 to 30 that Secrets Manager waits before permanently deleting the secret. You can't use
     * both this parameter and <code>ForceDeleteWithoutRecovery</code> in the same call. If you don't use either, then
     * Secrets Manager defaults to a 30 day recovery window.
     * </p>
     * 
     * @return The number of days from 7 to 30 that Secrets Manager waits before permanently deleting the secret. You
     *         can't use both this parameter and <code>ForceDeleteWithoutRecovery</code> in the same call. If you don't
     *         use either, then Secrets Manager defaults to a 30 day recovery window.
     */

    public Long getRecoveryWindowInDays() {
        return this.recoveryWindowInDays;
    }

    /**
     * <p>
     * The number of days from 7 to 30 that Secrets Manager waits before permanently deleting the secret. You can't use
     * both this parameter and <code>ForceDeleteWithoutRecovery</code> in the same call. If you don't use either, then
     * Secrets Manager defaults to a 30 day recovery window.
     * </p>
     * 
     * @param recoveryWindowInDays
     *        The number of days from 7 to 30 that Secrets Manager waits before permanently deleting the secret. You
     *        can't use both this parameter and <code>ForceDeleteWithoutRecovery</code> in the same call. If you don't
     *        use either, then Secrets Manager defaults to a 30 day recovery window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretRequest withRecoveryWindowInDays(Long recoveryWindowInDays) {
        setRecoveryWindowInDays(recoveryWindowInDays);
        return this;
    }

    /**
     * <p>
     * Specifies whether to delete the secret without any recovery window. You can't use both this parameter and
     * <code>RecoveryWindowInDays</code> in the same call. If you don't use either, then Secrets Manager defaults to a
     * 30 day recovery window.
     * </p>
     * <p>
     * Secrets Manager performs the actual deletion with an asynchronous background process, so there might be a short
     * delay before the secret is permanently deleted. If you delete a secret and then immediately create a secret with
     * the same name, use appropriate back off and retry logic.
     * </p>
     * <important>
     * <p>
     * Use this parameter with caution. This parameter causes the operation to skip the normal recovery window before
     * the permanent deletion that Secrets Manager would normally impose with the <code>RecoveryWindowInDays</code>
     * parameter. If you delete a secret with the <code>ForceDeleteWithoutRecovery</code> parameter, then you have no
     * opportunity to recover the secret. You lose the secret permanently.
     * </p>
     * </important>
     * 
     * @param forceDeleteWithoutRecovery
     *        Specifies whether to delete the secret without any recovery window. You can't use both this parameter and
     *        <code>RecoveryWindowInDays</code> in the same call. If you don't use either, then Secrets Manager defaults
     *        to a 30 day recovery window.</p>
     *        <p>
     *        Secrets Manager performs the actual deletion with an asynchronous background process, so there might be a
     *        short delay before the secret is permanently deleted. If you delete a secret and then immediately create a
     *        secret with the same name, use appropriate back off and retry logic.
     *        </p>
     *        <important>
     *        <p>
     *        Use this parameter with caution. This parameter causes the operation to skip the normal recovery window
     *        before the permanent deletion that Secrets Manager would normally impose with the
     *        <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the
     *        <code>ForceDeleteWithoutRecovery</code> parameter, then you have no opportunity to recover the secret. You
     *        lose the secret permanently.
     *        </p>
     */

    public void setForceDeleteWithoutRecovery(Boolean forceDeleteWithoutRecovery) {
        this.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
    }

    /**
     * <p>
     * Specifies whether to delete the secret without any recovery window. You can't use both this parameter and
     * <code>RecoveryWindowInDays</code> in the same call. If you don't use either, then Secrets Manager defaults to a
     * 30 day recovery window.
     * </p>
     * <p>
     * Secrets Manager performs the actual deletion with an asynchronous background process, so there might be a short
     * delay before the secret is permanently deleted. If you delete a secret and then immediately create a secret with
     * the same name, use appropriate back off and retry logic.
     * </p>
     * <important>
     * <p>
     * Use this parameter with caution. This parameter causes the operation to skip the normal recovery window before
     * the permanent deletion that Secrets Manager would normally impose with the <code>RecoveryWindowInDays</code>
     * parameter. If you delete a secret with the <code>ForceDeleteWithoutRecovery</code> parameter, then you have no
     * opportunity to recover the secret. You lose the secret permanently.
     * </p>
     * </important>
     * 
     * @return Specifies whether to delete the secret without any recovery window. You can't use both this parameter and
     *         <code>RecoveryWindowInDays</code> in the same call. If you don't use either, then Secrets Manager
     *         defaults to a 30 day recovery window.</p>
     *         <p>
     *         Secrets Manager performs the actual deletion with an asynchronous background process, so there might be a
     *         short delay before the secret is permanently deleted. If you delete a secret and then immediately create
     *         a secret with the same name, use appropriate back off and retry logic.
     *         </p>
     *         <important>
     *         <p>
     *         Use this parameter with caution. This parameter causes the operation to skip the normal recovery window
     *         before the permanent deletion that Secrets Manager would normally impose with the
     *         <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the
     *         <code>ForceDeleteWithoutRecovery</code> parameter, then you have no opportunity to recover the secret.
     *         You lose the secret permanently.
     *         </p>
     */

    public Boolean getForceDeleteWithoutRecovery() {
        return this.forceDeleteWithoutRecovery;
    }

    /**
     * <p>
     * Specifies whether to delete the secret without any recovery window. You can't use both this parameter and
     * <code>RecoveryWindowInDays</code> in the same call. If you don't use either, then Secrets Manager defaults to a
     * 30 day recovery window.
     * </p>
     * <p>
     * Secrets Manager performs the actual deletion with an asynchronous background process, so there might be a short
     * delay before the secret is permanently deleted. If you delete a secret and then immediately create a secret with
     * the same name, use appropriate back off and retry logic.
     * </p>
     * <important>
     * <p>
     * Use this parameter with caution. This parameter causes the operation to skip the normal recovery window before
     * the permanent deletion that Secrets Manager would normally impose with the <code>RecoveryWindowInDays</code>
     * parameter. If you delete a secret with the <code>ForceDeleteWithoutRecovery</code> parameter, then you have no
     * opportunity to recover the secret. You lose the secret permanently.
     * </p>
     * </important>
     * 
     * @param forceDeleteWithoutRecovery
     *        Specifies whether to delete the secret without any recovery window. You can't use both this parameter and
     *        <code>RecoveryWindowInDays</code> in the same call. If you don't use either, then Secrets Manager defaults
     *        to a 30 day recovery window.</p>
     *        <p>
     *        Secrets Manager performs the actual deletion with an asynchronous background process, so there might be a
     *        short delay before the secret is permanently deleted. If you delete a secret and then immediately create a
     *        secret with the same name, use appropriate back off and retry logic.
     *        </p>
     *        <important>
     *        <p>
     *        Use this parameter with caution. This parameter causes the operation to skip the normal recovery window
     *        before the permanent deletion that Secrets Manager would normally impose with the
     *        <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the
     *        <code>ForceDeleteWithoutRecovery</code> parameter, then you have no opportunity to recover the secret. You
     *        lose the secret permanently.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretRequest withForceDeleteWithoutRecovery(Boolean forceDeleteWithoutRecovery) {
        setForceDeleteWithoutRecovery(forceDeleteWithoutRecovery);
        return this;
    }

    /**
     * <p>
     * Specifies whether to delete the secret without any recovery window. You can't use both this parameter and
     * <code>RecoveryWindowInDays</code> in the same call. If you don't use either, then Secrets Manager defaults to a
     * 30 day recovery window.
     * </p>
     * <p>
     * Secrets Manager performs the actual deletion with an asynchronous background process, so there might be a short
     * delay before the secret is permanently deleted. If you delete a secret and then immediately create a secret with
     * the same name, use appropriate back off and retry logic.
     * </p>
     * <important>
     * <p>
     * Use this parameter with caution. This parameter causes the operation to skip the normal recovery window before
     * the permanent deletion that Secrets Manager would normally impose with the <code>RecoveryWindowInDays</code>
     * parameter. If you delete a secret with the <code>ForceDeleteWithoutRecovery</code> parameter, then you have no
     * opportunity to recover the secret. You lose the secret permanently.
     * </p>
     * </important>
     * 
     * @return Specifies whether to delete the secret without any recovery window. You can't use both this parameter and
     *         <code>RecoveryWindowInDays</code> in the same call. If you don't use either, then Secrets Manager
     *         defaults to a 30 day recovery window.</p>
     *         <p>
     *         Secrets Manager performs the actual deletion with an asynchronous background process, so there might be a
     *         short delay before the secret is permanently deleted. If you delete a secret and then immediately create
     *         a secret with the same name, use appropriate back off and retry logic.
     *         </p>
     *         <important>
     *         <p>
     *         Use this parameter with caution. This parameter causes the operation to skip the normal recovery window
     *         before the permanent deletion that Secrets Manager would normally impose with the
     *         <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the
     *         <code>ForceDeleteWithoutRecovery</code> parameter, then you have no opportunity to recover the secret.
     *         You lose the secret permanently.
     *         </p>
     */

    public Boolean isForceDeleteWithoutRecovery() {
        return this.forceDeleteWithoutRecovery;
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
        if (getRecoveryWindowInDays() != null)
            sb.append("RecoveryWindowInDays: ").append(getRecoveryWindowInDays()).append(",");
        if (getForceDeleteWithoutRecovery() != null)
            sb.append("ForceDeleteWithoutRecovery: ").append(getForceDeleteWithoutRecovery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSecretRequest == false)
            return false;
        DeleteSecretRequest other = (DeleteSecretRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getRecoveryWindowInDays() == null ^ this.getRecoveryWindowInDays() == null)
            return false;
        if (other.getRecoveryWindowInDays() != null && other.getRecoveryWindowInDays().equals(this.getRecoveryWindowInDays()) == false)
            return false;
        if (other.getForceDeleteWithoutRecovery() == null ^ this.getForceDeleteWithoutRecovery() == null)
            return false;
        if (other.getForceDeleteWithoutRecovery() != null && other.getForceDeleteWithoutRecovery().equals(this.getForceDeleteWithoutRecovery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getRecoveryWindowInDays() == null) ? 0 : getRecoveryWindowInDays().hashCode());
        hashCode = prime * hashCode + ((getForceDeleteWithoutRecovery() == null) ? 0 : getForceDeleteWithoutRecovery().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSecretRequest clone() {
        return (DeleteSecretRequest) super.clone();
    }

}
