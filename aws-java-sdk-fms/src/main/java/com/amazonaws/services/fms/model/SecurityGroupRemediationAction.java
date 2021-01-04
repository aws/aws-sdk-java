/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Remediation option for the rule specified in the <code>ViolationTarget</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/SecurityGroupRemediationAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupRemediationAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The remediation action that will be performed.
     * </p>
     */
    private String remediationActionType;
    /**
     * <p>
     * Brief description of the action that will be performed.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The final state of the rule specified in the <code>ViolationTarget</code> after it is remediated.
     * </p>
     */
    private SecurityGroupRuleDescription remediationResult;
    /**
     * <p>
     * Indicates if the current action is the default action.
     * </p>
     */
    private Boolean isDefaultAction;

    /**
     * <p>
     * The remediation action that will be performed.
     * </p>
     * 
     * @param remediationActionType
     *        The remediation action that will be performed.
     * @see RemediationActionType
     */

    public void setRemediationActionType(String remediationActionType) {
        this.remediationActionType = remediationActionType;
    }

    /**
     * <p>
     * The remediation action that will be performed.
     * </p>
     * 
     * @return The remediation action that will be performed.
     * @see RemediationActionType
     */

    public String getRemediationActionType() {
        return this.remediationActionType;
    }

    /**
     * <p>
     * The remediation action that will be performed.
     * </p>
     * 
     * @param remediationActionType
     *        The remediation action that will be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RemediationActionType
     */

    public SecurityGroupRemediationAction withRemediationActionType(String remediationActionType) {
        setRemediationActionType(remediationActionType);
        return this;
    }

    /**
     * <p>
     * The remediation action that will be performed.
     * </p>
     * 
     * @param remediationActionType
     *        The remediation action that will be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RemediationActionType
     */

    public SecurityGroupRemediationAction withRemediationActionType(RemediationActionType remediationActionType) {
        this.remediationActionType = remediationActionType.toString();
        return this;
    }

    /**
     * <p>
     * Brief description of the action that will be performed.
     * </p>
     * 
     * @param description
     *        Brief description of the action that will be performed.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Brief description of the action that will be performed.
     * </p>
     * 
     * @return Brief description of the action that will be performed.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Brief description of the action that will be performed.
     * </p>
     * 
     * @param description
     *        Brief description of the action that will be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRemediationAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The final state of the rule specified in the <code>ViolationTarget</code> after it is remediated.
     * </p>
     * 
     * @param remediationResult
     *        The final state of the rule specified in the <code>ViolationTarget</code> after it is remediated.
     */

    public void setRemediationResult(SecurityGroupRuleDescription remediationResult) {
        this.remediationResult = remediationResult;
    }

    /**
     * <p>
     * The final state of the rule specified in the <code>ViolationTarget</code> after it is remediated.
     * </p>
     * 
     * @return The final state of the rule specified in the <code>ViolationTarget</code> after it is remediated.
     */

    public SecurityGroupRuleDescription getRemediationResult() {
        return this.remediationResult;
    }

    /**
     * <p>
     * The final state of the rule specified in the <code>ViolationTarget</code> after it is remediated.
     * </p>
     * 
     * @param remediationResult
     *        The final state of the rule specified in the <code>ViolationTarget</code> after it is remediated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRemediationAction withRemediationResult(SecurityGroupRuleDescription remediationResult) {
        setRemediationResult(remediationResult);
        return this;
    }

    /**
     * <p>
     * Indicates if the current action is the default action.
     * </p>
     * 
     * @param isDefaultAction
     *        Indicates if the current action is the default action.
     */

    public void setIsDefaultAction(Boolean isDefaultAction) {
        this.isDefaultAction = isDefaultAction;
    }

    /**
     * <p>
     * Indicates if the current action is the default action.
     * </p>
     * 
     * @return Indicates if the current action is the default action.
     */

    public Boolean getIsDefaultAction() {
        return this.isDefaultAction;
    }

    /**
     * <p>
     * Indicates if the current action is the default action.
     * </p>
     * 
     * @param isDefaultAction
     *        Indicates if the current action is the default action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupRemediationAction withIsDefaultAction(Boolean isDefaultAction) {
        setIsDefaultAction(isDefaultAction);
        return this;
    }

    /**
     * <p>
     * Indicates if the current action is the default action.
     * </p>
     * 
     * @return Indicates if the current action is the default action.
     */

    public Boolean isDefaultAction() {
        return this.isDefaultAction;
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
        if (getRemediationActionType() != null)
            sb.append("RemediationActionType: ").append(getRemediationActionType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRemediationResult() != null)
            sb.append("RemediationResult: ").append(getRemediationResult()).append(",");
        if (getIsDefaultAction() != null)
            sb.append("IsDefaultAction: ").append(getIsDefaultAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroupRemediationAction == false)
            return false;
        SecurityGroupRemediationAction other = (SecurityGroupRemediationAction) obj;
        if (other.getRemediationActionType() == null ^ this.getRemediationActionType() == null)
            return false;
        if (other.getRemediationActionType() != null && other.getRemediationActionType().equals(this.getRemediationActionType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRemediationResult() == null ^ this.getRemediationResult() == null)
            return false;
        if (other.getRemediationResult() != null && other.getRemediationResult().equals(this.getRemediationResult()) == false)
            return false;
        if (other.getIsDefaultAction() == null ^ this.getIsDefaultAction() == null)
            return false;
        if (other.getIsDefaultAction() != null && other.getIsDefaultAction().equals(this.getIsDefaultAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRemediationActionType() == null) ? 0 : getRemediationActionType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRemediationResult() == null) ? 0 : getRemediationResult().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultAction() == null) ? 0 : getIsDefaultAction().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroupRemediationAction clone() {
        try {
            return (SecurityGroupRemediationAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.SecurityGroupRemediationActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
