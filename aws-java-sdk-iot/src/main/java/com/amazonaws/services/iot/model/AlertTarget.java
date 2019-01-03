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
 * A structure containing the alert target ARN and the role ARN.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlertTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the notification target to which alerts are sent.
     * </p>
     */
    private String alertTargetArn;
    /**
     * <p>
     * The ARN of the role that grants permission to send alerts to the notification target.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The ARN of the notification target to which alerts are sent.
     * </p>
     * 
     * @param alertTargetArn
     *        The ARN of the notification target to which alerts are sent.
     */

    public void setAlertTargetArn(String alertTargetArn) {
        this.alertTargetArn = alertTargetArn;
    }

    /**
     * <p>
     * The ARN of the notification target to which alerts are sent.
     * </p>
     * 
     * @return The ARN of the notification target to which alerts are sent.
     */

    public String getAlertTargetArn() {
        return this.alertTargetArn;
    }

    /**
     * <p>
     * The ARN of the notification target to which alerts are sent.
     * </p>
     * 
     * @param alertTargetArn
     *        The ARN of the notification target to which alerts are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertTarget withAlertTargetArn(String alertTargetArn) {
        setAlertTargetArn(alertTargetArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to send alerts to the notification target.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to send alerts to the notification target.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to send alerts to the notification target.
     * </p>
     * 
     * @return The ARN of the role that grants permission to send alerts to the notification target.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to send alerts to the notification target.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to send alerts to the notification target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertTarget withRoleArn(String roleArn) {
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
        if (getAlertTargetArn() != null)
            sb.append("AlertTargetArn: ").append(getAlertTargetArn()).append(",");
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

        if (obj instanceof AlertTarget == false)
            return false;
        AlertTarget other = (AlertTarget) obj;
        if (other.getAlertTargetArn() == null ^ this.getAlertTargetArn() == null)
            return false;
        if (other.getAlertTargetArn() != null && other.getAlertTargetArn().equals(this.getAlertTargetArn()) == false)
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

        hashCode = prime * hashCode + ((getAlertTargetArn() == null) ? 0 : getAlertTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AlertTarget clone() {
        try {
            return (AlertTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AlertTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
