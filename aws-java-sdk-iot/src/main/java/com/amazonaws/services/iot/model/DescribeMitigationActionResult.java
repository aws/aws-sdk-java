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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMitigationActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The type of mitigation action.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The ARN that identifies this migration action.
     * </p>
     */
    private String actionArn;
    /**
     * <p>
     * A unique identifier for this action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The ARN of the IAM role used to apply this action.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
     * </p>
     */
    private MitigationActionParams actionParams;
    /**
     * <p>
     * The date and time when the mitigation action was added to your AWS account.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time when the mitigation action was last changed.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * 
     * @param actionName
     *        The friendly name that uniquely identifies the mitigation action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * 
     * @return The friendly name that uniquely identifies the mitigation action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * 
     * @param actionName
     *        The friendly name that uniquely identifies the mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMitigationActionResult withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The type of mitigation action.
     * </p>
     * 
     * @param actionType
     *        The type of mitigation action.
     * @see MitigationActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of mitigation action.
     * </p>
     * 
     * @return The type of mitigation action.
     * @see MitigationActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of mitigation action.
     * </p>
     * 
     * @param actionType
     *        The type of mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MitigationActionType
     */

    public DescribeMitigationActionResult withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The type of mitigation action.
     * </p>
     * 
     * @param actionType
     *        The type of mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MitigationActionType
     */

    public DescribeMitigationActionResult withActionType(MitigationActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN that identifies this migration action.
     * </p>
     * 
     * @param actionArn
     *        The ARN that identifies this migration action.
     */

    public void setActionArn(String actionArn) {
        this.actionArn = actionArn;
    }

    /**
     * <p>
     * The ARN that identifies this migration action.
     * </p>
     * 
     * @return The ARN that identifies this migration action.
     */

    public String getActionArn() {
        return this.actionArn;
    }

    /**
     * <p>
     * The ARN that identifies this migration action.
     * </p>
     * 
     * @param actionArn
     *        The ARN that identifies this migration action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMitigationActionResult withActionArn(String actionArn) {
        setActionArn(actionArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this action.
     * </p>
     * 
     * @param actionId
     *        A unique identifier for this action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * A unique identifier for this action.
     * </p>
     * 
     * @return A unique identifier for this action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * A unique identifier for this action.
     * </p>
     * 
     * @param actionId
     *        A unique identifier for this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMitigationActionResult withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role used to apply this action.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role used to apply this action.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role used to apply this action.
     * </p>
     * 
     * @return The ARN of the IAM role used to apply this action.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role used to apply this action.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role used to apply this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMitigationActionResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
     * </p>
     * 
     * @param actionParams
     *        Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
     */

    public void setActionParams(MitigationActionParams actionParams) {
        this.actionParams = actionParams;
    }

    /**
     * <p>
     * Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
     * </p>
     * 
     * @return Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
     */

    public MitigationActionParams getActionParams() {
        return this.actionParams;
    }

    /**
     * <p>
     * Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
     * </p>
     * 
     * @param actionParams
     *        Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMitigationActionResult withActionParams(MitigationActionParams actionParams) {
        setActionParams(actionParams);
        return this;
    }

    /**
     * <p>
     * The date and time when the mitigation action was added to your AWS account.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the mitigation action was added to your AWS account.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the mitigation action was added to your AWS account.
     * </p>
     * 
     * @return The date and time when the mitigation action was added to your AWS account.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the mitigation action was added to your AWS account.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the mitigation action was added to your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMitigationActionResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time when the mitigation action was last changed.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time when the mitigation action was last changed.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the mitigation action was last changed.
     * </p>
     * 
     * @return The date and time when the mitigation action was last changed.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the mitigation action was last changed.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time when the mitigation action was last changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMitigationActionResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getActionArn() != null)
            sb.append("ActionArn: ").append(getActionArn()).append(",");
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getActionParams() != null)
            sb.append("ActionParams: ").append(getActionParams()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMitigationActionResult == false)
            return false;
        DescribeMitigationActionResult other = (DescribeMitigationActionResult) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getActionArn() == null ^ this.getActionArn() == null)
            return false;
        if (other.getActionArn() != null && other.getActionArn().equals(this.getActionArn()) == false)
            return false;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getActionParams() == null ^ this.getActionParams() == null)
            return false;
        if (other.getActionParams() != null && other.getActionParams().equals(this.getActionParams()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getActionArn() == null) ? 0 : getActionArn().hashCode());
        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getActionParams() == null) ? 0 : getActionParams().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMitigationActionResult clone() {
        try {
            return (DescribeMitigationActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
