/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     */
    private String secretId;
    /**
     * <p>
     * The list of staging labels to add to this version.
     * </p>
     */
    private String versionStage;
    /**
     * <p>
     * (Optional) Specifies the secret version ID of the version that the staging labels are to be removed from.
     * </p>
     * <p>
     * If you want to move a label to a new version, you do not have to explicitly remove it with this parameter. Adding
     * a label using the <code>MoveToVersionId</code> parameter automatically removes it from the old version. However,
     * if you do include both the "MoveTo" and "RemoveFrom" parameters, then the move is successful only if the staging
     * labels are actually present on the "RemoveFrom" version. If a staging label was on a different version than
     * "RemoveFrom", then the request fails.
     * </p>
     */
    private String removeFromVersionId;
    /**
     * <p>
     * (Optional) The secret version ID that you want to add the staging labels to.
     * </p>
     * <p>
     * If any of the staging labels are already attached to a different version of the secret, then they are removed
     * from that version before adding them to this version.
     * </p>
     */
    private String moveToVersionId;

    /**
     * <p>
     * Specifies the secret with the version whose list of staging labels you want to modify. You can specify either the
     * Amazon Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * 
     * @param secretId
     *        Specifies the secret with the version whose list of staging labels you want to modify. You can specify
     *        either the Amazon Resource Name (ARN) or the friendly name of the secret.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * Specifies the secret with the version whose list of staging labels you want to modify. You can specify either the
     * Amazon Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * 
     * @return Specifies the secret with the version whose list of staging labels you want to modify. You can specify
     *         either the Amazon Resource Name (ARN) or the friendly name of the secret.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * Specifies the secret with the version whose list of staging labels you want to modify. You can specify either the
     * Amazon Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * 
     * @param secretId
     *        Specifies the secret with the version whose list of staging labels you want to modify. You can specify
     *        either the Amazon Resource Name (ARN) or the friendly name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretVersionStageRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * The list of staging labels to add to this version.
     * </p>
     * 
     * @param versionStage
     *        The list of staging labels to add to this version.
     */

    public void setVersionStage(String versionStage) {
        this.versionStage = versionStage;
    }

    /**
     * <p>
     * The list of staging labels to add to this version.
     * </p>
     * 
     * @return The list of staging labels to add to this version.
     */

    public String getVersionStage() {
        return this.versionStage;
    }

    /**
     * <p>
     * The list of staging labels to add to this version.
     * </p>
     * 
     * @param versionStage
     *        The list of staging labels to add to this version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretVersionStageRequest withVersionStage(String versionStage) {
        setVersionStage(versionStage);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies the secret version ID of the version that the staging labels are to be removed from.
     * </p>
     * <p>
     * If you want to move a label to a new version, you do not have to explicitly remove it with this parameter. Adding
     * a label using the <code>MoveToVersionId</code> parameter automatically removes it from the old version. However,
     * if you do include both the "MoveTo" and "RemoveFrom" parameters, then the move is successful only if the staging
     * labels are actually present on the "RemoveFrom" version. If a staging label was on a different version than
     * "RemoveFrom", then the request fails.
     * </p>
     * 
     * @param removeFromVersionId
     *        (Optional) Specifies the secret version ID of the version that the staging labels are to be removed
     *        from.</p>
     *        <p>
     *        If you want to move a label to a new version, you do not have to explicitly remove it with this parameter.
     *        Adding a label using the <code>MoveToVersionId</code> parameter automatically removes it from the old
     *        version. However, if you do include both the "MoveTo" and "RemoveFrom" parameters, then the move is
     *        successful only if the staging labels are actually present on the "RemoveFrom" version. If a staging label
     *        was on a different version than "RemoveFrom", then the request fails.
     */

    public void setRemoveFromVersionId(String removeFromVersionId) {
        this.removeFromVersionId = removeFromVersionId;
    }

    /**
     * <p>
     * (Optional) Specifies the secret version ID of the version that the staging labels are to be removed from.
     * </p>
     * <p>
     * If you want to move a label to a new version, you do not have to explicitly remove it with this parameter. Adding
     * a label using the <code>MoveToVersionId</code> parameter automatically removes it from the old version. However,
     * if you do include both the "MoveTo" and "RemoveFrom" parameters, then the move is successful only if the staging
     * labels are actually present on the "RemoveFrom" version. If a staging label was on a different version than
     * "RemoveFrom", then the request fails.
     * </p>
     * 
     * @return (Optional) Specifies the secret version ID of the version that the staging labels are to be removed
     *         from.</p>
     *         <p>
     *         If you want to move a label to a new version, you do not have to explicitly remove it with this
     *         parameter. Adding a label using the <code>MoveToVersionId</code> parameter automatically removes it from
     *         the old version. However, if you do include both the "MoveTo" and "RemoveFrom" parameters, then the move
     *         is successful only if the staging labels are actually present on the "RemoveFrom" version. If a staging
     *         label was on a different version than "RemoveFrom", then the request fails.
     */

    public String getRemoveFromVersionId() {
        return this.removeFromVersionId;
    }

    /**
     * <p>
     * (Optional) Specifies the secret version ID of the version that the staging labels are to be removed from.
     * </p>
     * <p>
     * If you want to move a label to a new version, you do not have to explicitly remove it with this parameter. Adding
     * a label using the <code>MoveToVersionId</code> parameter automatically removes it from the old version. However,
     * if you do include both the "MoveTo" and "RemoveFrom" parameters, then the move is successful only if the staging
     * labels are actually present on the "RemoveFrom" version. If a staging label was on a different version than
     * "RemoveFrom", then the request fails.
     * </p>
     * 
     * @param removeFromVersionId
     *        (Optional) Specifies the secret version ID of the version that the staging labels are to be removed
     *        from.</p>
     *        <p>
     *        If you want to move a label to a new version, you do not have to explicitly remove it with this parameter.
     *        Adding a label using the <code>MoveToVersionId</code> parameter automatically removes it from the old
     *        version. However, if you do include both the "MoveTo" and "RemoveFrom" parameters, then the move is
     *        successful only if the staging labels are actually present on the "RemoveFrom" version. If a staging label
     *        was on a different version than "RemoveFrom", then the request fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretVersionStageRequest withRemoveFromVersionId(String removeFromVersionId) {
        setRemoveFromVersionId(removeFromVersionId);
        return this;
    }

    /**
     * <p>
     * (Optional) The secret version ID that you want to add the staging labels to.
     * </p>
     * <p>
     * If any of the staging labels are already attached to a different version of the secret, then they are removed
     * from that version before adding them to this version.
     * </p>
     * 
     * @param moveToVersionId
     *        (Optional) The secret version ID that you want to add the staging labels to.</p>
     *        <p>
     *        If any of the staging labels are already attached to a different version of the secret, then they are
     *        removed from that version before adding them to this version.
     */

    public void setMoveToVersionId(String moveToVersionId) {
        this.moveToVersionId = moveToVersionId;
    }

    /**
     * <p>
     * (Optional) The secret version ID that you want to add the staging labels to.
     * </p>
     * <p>
     * If any of the staging labels are already attached to a different version of the secret, then they are removed
     * from that version before adding them to this version.
     * </p>
     * 
     * @return (Optional) The secret version ID that you want to add the staging labels to.</p>
     *         <p>
     *         If any of the staging labels are already attached to a different version of the secret, then they are
     *         removed from that version before adding them to this version.
     */

    public String getMoveToVersionId() {
        return this.moveToVersionId;
    }

    /**
     * <p>
     * (Optional) The secret version ID that you want to add the staging labels to.
     * </p>
     * <p>
     * If any of the staging labels are already attached to a different version of the secret, then they are removed
     * from that version before adding them to this version.
     * </p>
     * 
     * @param moveToVersionId
     *        (Optional) The secret version ID that you want to add the staging labels to.</p>
     *        <p>
     *        If any of the staging labels are already attached to a different version of the secret, then they are
     *        removed from that version before adding them to this version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecretVersionStageRequest withMoveToVersionId(String moveToVersionId) {
        setMoveToVersionId(moveToVersionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
