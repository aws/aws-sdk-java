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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UpdateSecretVersionStage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecretVersionStageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the secret with the version whose list of staging labels you want to modify. You can specify either the
     * Amazon Resource Name (ARN) or the friendly name of the secret.
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
     * The staging label to add to this version.
     * </p>
     */
    private String versionStage;
    /**
     * <p>
     * Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label
     * you are trying to attach to one version is already attached to a different version, then you must include this
     * parameter and specify the version that the label is to be removed from. If the label is attached and you either
     * do not specify this parameter, or the version ID does not match, then the operation fails.
     * </p>
     */
    private String removeFromVersionId;
    /**
     * <p>
     * (Optional) The secret version ID that you want to add the staging label to. If you want to remove a label from a
     * version, then do not specify this parameter.
     * </p>
     * <p>
     * If the staging label is already attached to a different version of the secret, then you must also specify the
     * <code>RemoveFromVersionId</code> parameter.
     * </p>
     */
    private String moveToVersionId;

    /**
     * <p>
     * Specifies the secret with the version whose list of staging labels you want to modify. You can specify either the
     * Amazon Resource Name (ARN) or the friendly name of the secret.
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
     *        Specifies the secret with the version whose list of staging labels you want to modify. You can specify
     *        either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note>
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
     * Specifies the secret with the version whose list of staging labels you want to modify. You can specify either the
     * Amazon Resource Name (ARN) or the friendly name of the secret.
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
     * @return Specifies the secret with the version whose list of staging labels you want to modify. You can specify
     *         either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note>
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
     * Specifies the secret with the version whose list of staging labels you want to modify. You can specify either the
     * Amazon Resource Name (ARN) or the friendly name of the secret.
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
     *        Specifies the secret with the version whose list of staging labels you want to modify. You can specify
     *        either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note>
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

    public UpdateSecretVersionStageRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * The staging label to add to this version.
     * </p>
     * 
     * @param versionStage
     *        The staging label to add to this version.
     */

    public void setVersionStage(String versionStage) {
        this.versionStage = versionStage;
    }

    /**
     * <p>
     * The staging label to add to this version.
     * </p>
     * 
     * @return The staging label to add to this version.
     */

    public String getVersionStage() {
        return this.versionStage;
    }

    /**
     * <p>
     * The staging label to add to this version.
     * </p>
     * 
     * @param versionStage
     *        The staging label to add to this version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretVersionStageRequest withVersionStage(String versionStage) {
        setVersionStage(versionStage);
        return this;
    }

    /**
     * <p>
     * Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label
     * you are trying to attach to one version is already attached to a different version, then you must include this
     * parameter and specify the version that the label is to be removed from. If the label is attached and you either
     * do not specify this parameter, or the version ID does not match, then the operation fails.
     * </p>
     * 
     * @param removeFromVersionId
     *        Specifies the secret version ID of the version that the staging label is to be removed from. If the
     *        staging label you are trying to attach to one version is already attached to a different version, then you
     *        must include this parameter and specify the version that the label is to be removed from. If the label is
     *        attached and you either do not specify this parameter, or the version ID does not match, then the
     *        operation fails.
     */

    public void setRemoveFromVersionId(String removeFromVersionId) {
        this.removeFromVersionId = removeFromVersionId;
    }

    /**
     * <p>
     * Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label
     * you are trying to attach to one version is already attached to a different version, then you must include this
     * parameter and specify the version that the label is to be removed from. If the label is attached and you either
     * do not specify this parameter, or the version ID does not match, then the operation fails.
     * </p>
     * 
     * @return Specifies the secret version ID of the version that the staging label is to be removed from. If the
     *         staging label you are trying to attach to one version is already attached to a different version, then
     *         you must include this parameter and specify the version that the label is to be removed from. If the
     *         label is attached and you either do not specify this parameter, or the version ID does not match, then
     *         the operation fails.
     */

    public String getRemoveFromVersionId() {
        return this.removeFromVersionId;
    }

    /**
     * <p>
     * Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label
     * you are trying to attach to one version is already attached to a different version, then you must include this
     * parameter and specify the version that the label is to be removed from. If the label is attached and you either
     * do not specify this parameter, or the version ID does not match, then the operation fails.
     * </p>
     * 
     * @param removeFromVersionId
     *        Specifies the secret version ID of the version that the staging label is to be removed from. If the
     *        staging label you are trying to attach to one version is already attached to a different version, then you
     *        must include this parameter and specify the version that the label is to be removed from. If the label is
     *        attached and you either do not specify this parameter, or the version ID does not match, then the
     *        operation fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretVersionStageRequest withRemoveFromVersionId(String removeFromVersionId) {
        setRemoveFromVersionId(removeFromVersionId);
        return this;
    }

    /**
     * <p>
     * (Optional) The secret version ID that you want to add the staging label to. If you want to remove a label from a
     * version, then do not specify this parameter.
     * </p>
     * <p>
     * If the staging label is already attached to a different version of the secret, then you must also specify the
     * <code>RemoveFromVersionId</code> parameter.
     * </p>
     * 
     * @param moveToVersionId
     *        (Optional) The secret version ID that you want to add the staging label to. If you want to remove a label
     *        from a version, then do not specify this parameter.</p>
     *        <p>
     *        If the staging label is already attached to a different version of the secret, then you must also specify
     *        the <code>RemoveFromVersionId</code> parameter.
     */

    public void setMoveToVersionId(String moveToVersionId) {
        this.moveToVersionId = moveToVersionId;
    }

    /**
     * <p>
     * (Optional) The secret version ID that you want to add the staging label to. If you want to remove a label from a
     * version, then do not specify this parameter.
     * </p>
     * <p>
     * If the staging label is already attached to a different version of the secret, then you must also specify the
     * <code>RemoveFromVersionId</code> parameter.
     * </p>
     * 
     * @return (Optional) The secret version ID that you want to add the staging label to. If you want to remove a label
     *         from a version, then do not specify this parameter.</p>
     *         <p>
     *         If the staging label is already attached to a different version of the secret, then you must also specify
     *         the <code>RemoveFromVersionId</code> parameter.
     */

    public String getMoveToVersionId() {
        return this.moveToVersionId;
    }

    /**
     * <p>
     * (Optional) The secret version ID that you want to add the staging label to. If you want to remove a label from a
     * version, then do not specify this parameter.
     * </p>
     * <p>
     * If the staging label is already attached to a different version of the secret, then you must also specify the
     * <code>RemoveFromVersionId</code> parameter.
     * </p>
     * 
     * @param moveToVersionId
     *        (Optional) The secret version ID that you want to add the staging label to. If you want to remove a label
     *        from a version, then do not specify this parameter.</p>
     *        <p>
     *        If the staging label is already attached to a different version of the secret, then you must also specify
     *        the <code>RemoveFromVersionId</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretVersionStageRequest withMoveToVersionId(String moveToVersionId) {
        setMoveToVersionId(moveToVersionId);
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
        if (getVersionStage() != null)
            sb.append("VersionStage: ").append(getVersionStage()).append(",");
        if (getRemoveFromVersionId() != null)
            sb.append("RemoveFromVersionId: ").append(getRemoveFromVersionId()).append(",");
        if (getMoveToVersionId() != null)
            sb.append("MoveToVersionId: ").append(getMoveToVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecretVersionStageRequest == false)
            return false;
        UpdateSecretVersionStageRequest other = (UpdateSecretVersionStageRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getVersionStage() == null ^ this.getVersionStage() == null)
            return false;
        if (other.getVersionStage() != null && other.getVersionStage().equals(this.getVersionStage()) == false)
            return false;
        if (other.getRemoveFromVersionId() == null ^ this.getRemoveFromVersionId() == null)
            return false;
        if (other.getRemoveFromVersionId() != null && other.getRemoveFromVersionId().equals(this.getRemoveFromVersionId()) == false)
            return false;
        if (other.getMoveToVersionId() == null ^ this.getMoveToVersionId() == null)
            return false;
        if (other.getMoveToVersionId() != null && other.getMoveToVersionId().equals(this.getMoveToVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getVersionStage() == null) ? 0 : getVersionStage().hashCode());
        hashCode = prime * hashCode + ((getRemoveFromVersionId() == null) ? 0 : getRemoveFromVersionId().hashCode());
        hashCode = prime * hashCode + ((getMoveToVersionId() == null) ? 0 : getMoveToVersionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecretVersionStageRequest clone() {
        return (UpdateSecretVersionStageRequest) super.clone();
    }

}
