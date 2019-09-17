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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMitigationActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A friendly name for the action. Choose a friendly name that accurately describes the action (for example,
     * <code>EnableLoggingAction</code>).
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The ARN of the IAM role that is used to apply the mitigation action.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Defines the type of action and the parameters for that action.
     * </p>
     */
    private MitigationActionParams actionParams;
    /**
     * <p>
     * Metadata that can be used to manage the mitigation action.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A friendly name for the action. Choose a friendly name that accurately describes the action (for example,
     * <code>EnableLoggingAction</code>).
     * </p>
     * 
     * @param actionName
     *        A friendly name for the action. Choose a friendly name that accurately describes the action (for example,
     *        <code>EnableLoggingAction</code>).
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * A friendly name for the action. Choose a friendly name that accurately describes the action (for example,
     * <code>EnableLoggingAction</code>).
     * </p>
     * 
     * @return A friendly name for the action. Choose a friendly name that accurately describes the action (for example,
     *         <code>EnableLoggingAction</code>).
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * A friendly name for the action. Choose a friendly name that accurately describes the action (for example,
     * <code>EnableLoggingAction</code>).
     * </p>
     * 
     * @param actionName
     *        A friendly name for the action. Choose a friendly name that accurately describes the action (for example,
     *        <code>EnableLoggingAction</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMitigationActionRequest withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that is used to apply the mitigation action.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that is used to apply the mitigation action.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that is used to apply the mitigation action.
     * </p>
     * 
     * @return The ARN of the IAM role that is used to apply the mitigation action.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that is used to apply the mitigation action.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that is used to apply the mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMitigationActionRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Defines the type of action and the parameters for that action.
     * </p>
     * 
     * @param actionParams
     *        Defines the type of action and the parameters for that action.
     */

    public void setActionParams(MitigationActionParams actionParams) {
        this.actionParams = actionParams;
    }

    /**
     * <p>
     * Defines the type of action and the parameters for that action.
     * </p>
     * 
     * @return Defines the type of action and the parameters for that action.
     */

    public MitigationActionParams getActionParams() {
        return this.actionParams;
    }

    /**
     * <p>
     * Defines the type of action and the parameters for that action.
     * </p>
     * 
     * @param actionParams
     *        Defines the type of action and the parameters for that action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMitigationActionRequest withActionParams(MitigationActionParams actionParams) {
        setActionParams(actionParams);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the mitigation action.
     * </p>
     * 
     * @return Metadata that can be used to manage the mitigation action.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the mitigation action.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the mitigation action.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the mitigation action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMitigationActionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the mitigation action.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMitigationActionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getActionParams() != null)
            sb.append("ActionParams: ").append(getActionParams()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMitigationActionRequest == false)
            return false;
        CreateMitigationActionRequest other = (CreateMitigationActionRequest) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getActionParams() == null ^ this.getActionParams() == null)
            return false;
        if (other.getActionParams() != null && other.getActionParams().equals(this.getActionParams()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getActionParams() == null) ? 0 : getActionParams().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMitigationActionRequest clone() {
        return (CreateMitigationActionRequest) super.clone();
    }

}
