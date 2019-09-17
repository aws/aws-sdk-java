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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddLayerVersionPermission" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddLayerVersionPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     */
    private String layerName;
    /**
     * <p>
     * The version number.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * An identifier that distinguishes the policy from others on the same layer version.
     * </p>
     */
    private String statementId;
    /**
     * <p>
     * The API action that grants access to the layer. For example, <code>lambda:GetLayerVersion</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * An account ID, or <code>*</code> to grant permission to all AWS accounts.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * With the principal set to <code>*</code>, grant permission to all accounts in the specified organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy
     * that has changed since you last read it.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @param layerName
     *        The name or Amazon Resource Name (ARN) of the layer.
     */

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the layer.
     */

    public String getLayerName() {
        return this.layerName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @param layerName
     *        The name or Amazon Resource Name (ARN) of the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLayerVersionPermissionRequest withLayerName(String layerName) {
        setLayerName(layerName);
        return this;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param versionNumber
     *        The version number.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @return The version number.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param versionNumber
     *        The version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLayerVersionPermissionRequest withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * An identifier that distinguishes the policy from others on the same layer version.
     * </p>
     * 
     * @param statementId
     *        An identifier that distinguishes the policy from others on the same layer version.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * An identifier that distinguishes the policy from others on the same layer version.
     * </p>
     * 
     * @return An identifier that distinguishes the policy from others on the same layer version.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * An identifier that distinguishes the policy from others on the same layer version.
     * </p>
     * 
     * @param statementId
     *        An identifier that distinguishes the policy from others on the same layer version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLayerVersionPermissionRequest withStatementId(String statementId) {
        setStatementId(statementId);
        return this;
    }

    /**
     * <p>
     * The API action that grants access to the layer. For example, <code>lambda:GetLayerVersion</code>.
     * </p>
     * 
     * @param action
     *        The API action that grants access to the layer. For example, <code>lambda:GetLayerVersion</code>.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The API action that grants access to the layer. For example, <code>lambda:GetLayerVersion</code>.
     * </p>
     * 
     * @return The API action that grants access to the layer. For example, <code>lambda:GetLayerVersion</code>.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The API action that grants access to the layer. For example, <code>lambda:GetLayerVersion</code>.
     * </p>
     * 
     * @param action
     *        The API action that grants access to the layer. For example, <code>lambda:GetLayerVersion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLayerVersionPermissionRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * An account ID, or <code>*</code> to grant permission to all AWS accounts.
     * </p>
     * 
     * @param principal
     *        An account ID, or <code>*</code> to grant permission to all AWS accounts.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * An account ID, or <code>*</code> to grant permission to all AWS accounts.
     * </p>
     * 
     * @return An account ID, or <code>*</code> to grant permission to all AWS accounts.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * An account ID, or <code>*</code> to grant permission to all AWS accounts.
     * </p>
     * 
     * @param principal
     *        An account ID, or <code>*</code> to grant permission to all AWS accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLayerVersionPermissionRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * With the principal set to <code>*</code>, grant permission to all accounts in the specified organization.
     * </p>
     * 
     * @param organizationId
     *        With the principal set to <code>*</code>, grant permission to all accounts in the specified organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * With the principal set to <code>*</code>, grant permission to all accounts in the specified organization.
     * </p>
     * 
     * @return With the principal set to <code>*</code>, grant permission to all accounts in the specified organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * With the principal set to <code>*</code>, grant permission to all accounts in the specified organization.
     * </p>
     * 
     * @param organizationId
     *        With the principal set to <code>*</code>, grant permission to all accounts in the specified organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLayerVersionPermissionRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy
     * that has changed since you last read it.
     * </p>
     * 
     * @param revisionId
     *        Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a
     *        policy that has changed since you last read it.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy
     * that has changed since you last read it.
     * </p>
     * 
     * @return Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a
     *         policy that has changed since you last read it.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy
     * that has changed since you last read it.
     * </p>
     * 
     * @param revisionId
     *        Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a
     *        policy that has changed since you last read it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLayerVersionPermissionRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getLayerName() != null)
            sb.append("LayerName: ").append(getLayerName()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddLayerVersionPermissionRequest == false)
            return false;
        AddLayerVersionPermissionRequest other = (AddLayerVersionPermissionRequest) obj;
        if (other.getLayerName() == null ^ this.getLayerName() == null)
            return false;
        if (other.getLayerName() != null && other.getLayerName().equals(this.getLayerName()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerName() == null) ? 0 : getLayerName().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public AddLayerVersionPermissionRequest clone() {
        return (AddLayerVersionPermissionRequest) super.clone();
    }

}
