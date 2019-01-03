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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the targets to which audit notifications are sent.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditNotificationTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the target (SNS topic) to which audit notifications are sent.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The ARN of the role that grants permission to send notifications to the target.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * True if notifications to the target are enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The ARN of the target (SNS topic) to which audit notifications are sent.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the target (SNS topic) to which audit notifications are sent.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the target (SNS topic) to which audit notifications are sent.
     * </p>
     * 
     * @return The ARN of the target (SNS topic) to which audit notifications are sent.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of the target (SNS topic) to which audit notifications are sent.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the target (SNS topic) to which audit notifications are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditNotificationTarget withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to send notifications to the target.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to send notifications to the target.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to send notifications to the target.
     * </p>
     * 
     * @return The ARN of the role that grants permission to send notifications to the target.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to send notifications to the target.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to send notifications to the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditNotificationTarget withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * True if notifications to the target are enabled.
     * </p>
     * 
     * @param enabled
     *        True if notifications to the target are enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True if notifications to the target are enabled.
     * </p>
     * 
     * @return True if notifications to the target are enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True if notifications to the target are enabled.
     * </p>
     * 
     * @param enabled
     *        True if notifications to the target are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditNotificationTarget withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * True if notifications to the target are enabled.
     * </p>
     * 
     * @return True if notifications to the target are enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditNotificationTarget == false)
            return false;
        AuditNotificationTarget other = (AuditNotificationTarget) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public AuditNotificationTarget clone() {
        try {
            return (AuditNotificationTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuditNotificationTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
