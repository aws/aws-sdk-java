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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists the properties of an <i>action</i>. An action represents an action or activity. Some examples are a workflow
 * step and a model deployment. Generally, an action involves at least one input artifact or output artifact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ActionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     */
    private String actionArn;
    /**
     * <p>
     * The name of the action.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The source of the action.
     * </p>
     */
    private ActionSource source;
    /**
     * <p>
     * The type of the action.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The status of the action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * When the action was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the action was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     * 
     * @param actionArn
     *        The Amazon Resource Name (ARN) of the action.
     */

    public void setActionArn(String actionArn) {
        this.actionArn = actionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the action.
     */

    public String getActionArn() {
        return this.actionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     * 
     * @param actionArn
     *        The Amazon Resource Name (ARN) of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionSummary withActionArn(String actionArn) {
        setActionArn(actionArn);
        return this;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param actionName
     *        The name of the action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @return The name of the action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param actionName
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionSummary withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The source of the action.
     * </p>
     * 
     * @param source
     *        The source of the action.
     */

    public void setSource(ActionSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the action.
     * </p>
     * 
     * @return The source of the action.
     */

    public ActionSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the action.
     * </p>
     * 
     * @param source
     *        The source of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionSummary withSource(ActionSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The type of the action.
     * </p>
     * 
     * @param actionType
     *        The type of the action.
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of the action.
     * </p>
     * 
     * @return The type of the action.
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of the action.
     * </p>
     * 
     * @param actionType
     *        The type of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionSummary withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see ActionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @return The status of the action.
     * @see ActionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public ActionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public ActionSummary withStatus(ActionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When the action was created.
     * </p>
     * 
     * @param creationTime
     *        When the action was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the action was created.
     * </p>
     * 
     * @return When the action was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the action was created.
     * </p>
     * 
     * @param creationTime
     *        When the action was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the action was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the action was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the action was last modified.
     * </p>
     * 
     * @return When the action was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the action was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the action was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getActionArn() != null)
            sb.append("ActionArn: ").append(getActionArn()).append(",");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionSummary == false)
            return false;
        ActionSummary other = (ActionSummary) obj;
        if (other.getActionArn() == null ^ this.getActionArn() == null)
            return false;
        if (other.getActionArn() != null && other.getActionArn().equals(this.getActionArn()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionArn() == null) ? 0 : getActionArn().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public ActionSummary clone() {
        try {
            return (ActionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ActionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
