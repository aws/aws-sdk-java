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
     * Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     */
    private String secretId;
    /**
     * <p>
     * (Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use
     * both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.
     * </p>
     * <p>
     * This value can range from 7 to 30 days. The default value is 30.
     * </p>
     */
    private Long recoveryWindowInDays;
    /**
     * <p>
     * (Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this
     * parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.
     * </p>
     * <p>
     * An asynchronous background process performs the actual deletion, so there can be a short delay before the
     * operation completes. If you write code to delete and then immediately recreate a secret with the same name,
     * ensure that your code includes appropriate back off and retry logic.
     * </p>
     * <important>
     * <p>
     * Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the
     * permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you
     * delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to
     * recover the secret. It is permanently lost.
     * </p>
     * </important>
     */
    private Boolean forceDeleteWithoutRecovery;

    /**
     * <p>
     * Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @param secretId
     *        Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     *        friendly name of the secret.</p> <note>
     *        <p>
     *        If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *        ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *        adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *        uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six
     *        characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that
     *        as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete
     *        ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t
     *        create secret names that end with a hyphen followed by six characters.
     *        </p>
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @return Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or
     *         the friendly name of the secret.</p> <note>
     *         <p>
     *         If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *         ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *         adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *         uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by
     *         six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use
     *         that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a
     *         complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you
     *         don’t create secret names that end with a hyphen followed by six characters.
     *         </p>
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @param secretId
     *        Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     *        friendly name of the secret.</p> <note>
     *        <p>
     *        If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *        ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *        adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *        uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six
     *        characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that
     *        as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete
     *        ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t
     *        create secret names that end with a hyphen followed by six characters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use
     * both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.
     * </p>
     * <p>
     * This value can range from 7 to 30 days. The default value is 30.
     * </p>
     * 
     * @param recoveryWindowInDays
     *        (Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You
     *        can't use both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API
     *        call.</p>
     *        <p>
     *        This value can range from 7 to 30 days. The default value is 30.
     */

    public void setRecoveryWindowInDays(Long recoveryWindowInDays) {
        this.recoveryWindowInDays = recoveryWindowInDays;
    }

    /**
     * <p>
     * (Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use
     * both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.
     * </p>
     * <p>
     * This value can range from 7 to 30 days. The default value is 30.
     * </p>
     * 
     * @return (Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You
     *         can't use both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API
     *         call.</p>
     *         <p>
     *         This value can range from 7 to 30 days. The default value is 30.
     */

    public Long getRecoveryWindowInDays() {
        return this.recoveryWindowInDays;
    }

    /**
     * <p>
     * (Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use
     * both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.
     * </p>
     * <p>
     * This value can range from 7 to 30 days. The default value is 30.
     * </p>
     * 
     * @param recoveryWindowInDays
     *        (Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You
     *        can't use both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API
     *        call.</p>
     *        <p>
     *        This value can range from 7 to 30 days. The default value is 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretRequest withRecoveryWindowInDays(Long recoveryWindowInDays) {
        setRecoveryWindowInDays(recoveryWindowInDays);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this
     * parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.
     * </p>
     * <p>
     * An asynchronous background process performs the actual deletion, so there can be a short delay before the
     * operation completes. If you write code to delete and then immediately recreate a secret with the same name,
     * ensure that your code includes appropriate back off and retry logic.
     * </p>
     * <important>
     * <p>
     * Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the
     * permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you
     * delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to
     * recover the secret. It is permanently lost.
     * </p>
     * </important>
     * 
     * @param forceDeleteWithoutRecovery
     *        (Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this
     *        parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p>
     *        <p>
     *        An asynchronous background process performs the actual deletion, so there can be a short delay before the
     *        operation completes. If you write code to delete and then immediately recreate a secret with the same
     *        name, ensure that your code includes appropriate back off and retry logic.
     *        </p>
     *        <important>
     *        <p>
     *        Use this parameter with caution. This parameter causes the operation to skip the normal waiting period
     *        before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code>
     *        parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have
     *        no opportunity to recover the secret. It is permanently lost.
     *        </p>
     */

    public void setForceDeleteWithoutRecovery(Boolean forceDeleteWithoutRecovery) {
        this.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
    }

    /**
     * <p>
     * (Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this
     * parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.
     * </p>
     * <p>
     * An asynchronous background process performs the actual deletion, so there can be a short delay before the
     * operation completes. If you write code to delete and then immediately recreate a secret with the same name,
     * ensure that your code includes appropriate back off and retry logic.
     * </p>
     * <important>
     * <p>
     * Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the
     * permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you
     * delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to
     * recover the secret. It is permanently lost.
     * </p>
     * </important>
     * 
     * @return (Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both
     *         this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p>
     *         <p>
     *         An asynchronous background process performs the actual deletion, so there can be a short delay before the
     *         operation completes. If you write code to delete and then immediately recreate a secret with the same
     *         name, ensure that your code includes appropriate back off and retry logic.
     *         </p>
     *         <important>
     *         <p>
     *         Use this parameter with caution. This parameter causes the operation to skip the normal waiting period
     *         before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code>
     *         parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you
     *         have no opportunity to recover the secret. It is permanently lost.
     *         </p>
     */

    public Boolean getForceDeleteWithoutRecovery() {
        return this.forceDeleteWithoutRecovery;
    }

    /**
     * <p>
     * (Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this
     * parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.
     * </p>
     * <p>
     * An asynchronous background process performs the actual deletion, so there can be a short delay before the
     * operation completes. If you write code to delete and then immediately recreate a secret with the same name,
     * ensure that your code includes appropriate back off and retry logic.
     * </p>
     * <important>
     * <p>
     * Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the
     * permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you
     * delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to
     * recover the secret. It is permanently lost.
     * </p>
     * </important>
     * 
     * @param forceDeleteWithoutRecovery
     *        (Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this
     *        parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p>
     *        <p>
     *        An asynchronous background process performs the actual deletion, so there can be a short delay before the
     *        operation completes. If you write code to delete and then immediately recreate a secret with the same
     *        name, ensure that your code includes appropriate back off and retry logic.
     *        </p>
     *        <important>
     *        <p>
     *        Use this parameter with caution. This parameter causes the operation to skip the normal waiting period
     *        before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code>
     *        parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have
     *        no opportunity to recover the secret. It is permanently lost.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretRequest withForceDeleteWithoutRecovery(Boolean forceDeleteWithoutRecovery) {
        setForceDeleteWithoutRecovery(forceDeleteWithoutRecovery);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this
     * parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.
     * </p>
     * <p>
     * An asynchronous background process performs the actual deletion, so there can be a short delay before the
     * operation completes. If you write code to delete and then immediately recreate a secret with the same name,
     * ensure that your code includes appropriate back off and retry logic.
     * </p>
     * <important>
     * <p>
     * Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the
     * permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you
     * delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to
     * recover the secret. It is permanently lost.
     * </p>
     * </important>
     * 
     * @return (Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both
     *         this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p>
     *         <p>
     *         An asynchronous background process performs the actual deletion, so there can be a short delay before the
     *         operation completes. If you write code to delete and then immediately recreate a secret with the same
     *         name, ensure that your code includes appropriate back off and retry logic.
     *         </p>
     *         <important>
     *         <p>
     *         Use this parameter with caution. This parameter causes the operation to skip the normal waiting period
     *         before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code>
     *         parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you
     *         have no opportunity to recover the secret. It is permanently lost.
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
