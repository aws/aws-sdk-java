/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sends the email to the internet using the ses:SendRawEmail API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/SendAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the caller does not have the permissions to call the sendRawEmail API.
     * </p>
     */
    private String actionFailurePolicy;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to use for this action. This role must have access to the
     * ses:SendRawEmail API.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the caller does not have the permissions to call the sendRawEmail API.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the caller does not have the permissions to call the sendRawEmail API.
     * @see ActionFailurePolicy
     */

    public void setActionFailurePolicy(String actionFailurePolicy) {
        this.actionFailurePolicy = actionFailurePolicy;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the caller does not have the permissions to call the sendRawEmail API.
     * </p>
     * 
     * @return A policy that states what to do in the case of failure. The action will fail if there are configuration
     *         errors. For example, the caller does not have the permissions to call the sendRawEmail API.
     * @see ActionFailurePolicy
     */

    public String getActionFailurePolicy() {
        return this.actionFailurePolicy;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the caller does not have the permissions to call the sendRawEmail API.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the caller does not have the permissions to call the sendRawEmail API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionFailurePolicy
     */

    public SendAction withActionFailurePolicy(String actionFailurePolicy) {
        setActionFailurePolicy(actionFailurePolicy);
        return this;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the caller does not have the permissions to call the sendRawEmail API.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the caller does not have the permissions to call the sendRawEmail API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionFailurePolicy
     */

    public SendAction withActionFailurePolicy(ActionFailurePolicy actionFailurePolicy) {
        this.actionFailurePolicy = actionFailurePolicy.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to use for this action. This role must have access to the
     * ses:SendRawEmail API.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role to use for this action. This role must have access to the
     *        ses:SendRawEmail API.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to use for this action. This role must have access to the
     * ses:SendRawEmail API.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role to use for this action. This role must have access to the
     *         ses:SendRawEmail API.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to use for this action. This role must have access to the
     * ses:SendRawEmail API.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role to use for this action. This role must have access to the
     *        ses:SendRawEmail API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getActionFailurePolicy() != null)
            sb.append("ActionFailurePolicy: ").append(getActionFailurePolicy()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendAction == false)
            return false;
        SendAction other = (SendAction) obj;
        if (other.getActionFailurePolicy() == null ^ this.getActionFailurePolicy() == null)
            return false;
        if (other.getActionFailurePolicy() != null && other.getActionFailurePolicy().equals(this.getActionFailurePolicy()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionFailurePolicy() == null) ? 0 : getActionFailurePolicy().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public SendAction clone() {
        try {
            return (SendAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.SendActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
