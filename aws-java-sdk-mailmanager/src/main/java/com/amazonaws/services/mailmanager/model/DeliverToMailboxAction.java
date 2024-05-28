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
 * This action to delivers an email to a mailbox.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeliverToMailboxAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliverToMailboxAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the mailbox ARN is no longer valid.
     * </p>
     */
    private String actionFailurePolicy;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a WorkMail organization to deliver the email to.
     * </p>
     */
    private String mailboxArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role to use to execute this action. The role must have access to the
     * workmail:DeliverToMailbox API.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the mailbox ARN is no longer valid.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the mailbox ARN is no longer valid.
     * @see ActionFailurePolicy
     */

    public void setActionFailurePolicy(String actionFailurePolicy) {
        this.actionFailurePolicy = actionFailurePolicy;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the mailbox ARN is no longer valid.
     * </p>
     * 
     * @return A policy that states what to do in the case of failure. The action will fail if there are configuration
     *         errors. For example, the mailbox ARN is no longer valid.
     * @see ActionFailurePolicy
     */

    public String getActionFailurePolicy() {
        return this.actionFailurePolicy;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the mailbox ARN is no longer valid.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the mailbox ARN is no longer valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionFailurePolicy
     */

    public DeliverToMailboxAction withActionFailurePolicy(String actionFailurePolicy) {
        setActionFailurePolicy(actionFailurePolicy);
        return this;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the mailbox ARN is no longer valid.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the mailbox ARN is no longer valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionFailurePolicy
     */

    public DeliverToMailboxAction withActionFailurePolicy(ActionFailurePolicy actionFailurePolicy) {
        this.actionFailurePolicy = actionFailurePolicy.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a WorkMail organization to deliver the email to.
     * </p>
     * 
     * @param mailboxArn
     *        The Amazon Resource Name (ARN) of a WorkMail organization to deliver the email to.
     */

    public void setMailboxArn(String mailboxArn) {
        this.mailboxArn = mailboxArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a WorkMail organization to deliver the email to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a WorkMail organization to deliver the email to.
     */

    public String getMailboxArn() {
        return this.mailboxArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a WorkMail organization to deliver the email to.
     * </p>
     * 
     * @param mailboxArn
     *        The Amazon Resource Name (ARN) of a WorkMail organization to deliver the email to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverToMailboxAction withMailboxArn(String mailboxArn) {
        setMailboxArn(mailboxArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role to use to execute this action. The role must have access to the
     * workmail:DeliverToMailbox API.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role to use to execute this action. The role must have access to
     *        the workmail:DeliverToMailbox API.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role to use to execute this action. The role must have access to the
     * workmail:DeliverToMailbox API.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role to use to execute this action. The role must have access to
     *         the workmail:DeliverToMailbox API.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role to use to execute this action. The role must have access to the
     * workmail:DeliverToMailbox API.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role to use to execute this action. The role must have access to
     *        the workmail:DeliverToMailbox API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverToMailboxAction withRoleArn(String roleArn) {
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
        if (getMailboxArn() != null)
            sb.append("MailboxArn: ").append(getMailboxArn()).append(",");
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

        if (obj instanceof DeliverToMailboxAction == false)
            return false;
        DeliverToMailboxAction other = (DeliverToMailboxAction) obj;
        if (other.getActionFailurePolicy() == null ^ this.getActionFailurePolicy() == null)
            return false;
        if (other.getActionFailurePolicy() != null && other.getActionFailurePolicy().equals(this.getActionFailurePolicy()) == false)
            return false;
        if (other.getMailboxArn() == null ^ this.getMailboxArn() == null)
            return false;
        if (other.getMailboxArn() != null && other.getMailboxArn().equals(this.getMailboxArn()) == false)
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
        hashCode = prime * hashCode + ((getMailboxArn() == null) ? 0 : getMailboxArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public DeliverToMailboxAction clone() {
        try {
            return (DeliverToMailboxAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.DeliverToMailboxActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
