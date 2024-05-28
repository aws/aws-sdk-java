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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns a summary of information about an enabled control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnabledControlSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnabledControlSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the enabled control.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The <code>controlIdentifier</code> of the enabled control.
     * </p>
     */
    private String controlIdentifier;
    /**
     * <p>
     * The drift status of the enabled control.
     * </p>
     */
    private DriftStatusSummary driftStatusSummary;
    /**
     * <p>
     * A short description of the status of the enabled control.
     * </p>
     */
    private EnablementStatusSummary statusSummary;
    /**
     * <p>
     * The ARN of the organizational unit.
     * </p>
     */
    private String targetIdentifier;

    /**
     * <p>
     * The ARN of the enabled control.
     * </p>
     * 
     * @param arn
     *        The ARN of the enabled control.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the enabled control.
     * </p>
     * 
     * @return The ARN of the enabled control.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the enabled control.
     * </p>
     * 
     * @param arn
     *        The ARN of the enabled control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The <code>controlIdentifier</code> of the enabled control.
     * </p>
     * 
     * @param controlIdentifier
     *        The <code>controlIdentifier</code> of the enabled control.
     */

    public void setControlIdentifier(String controlIdentifier) {
        this.controlIdentifier = controlIdentifier;
    }

    /**
     * <p>
     * The <code>controlIdentifier</code> of the enabled control.
     * </p>
     * 
     * @return The <code>controlIdentifier</code> of the enabled control.
     */

    public String getControlIdentifier() {
        return this.controlIdentifier;
    }

    /**
     * <p>
     * The <code>controlIdentifier</code> of the enabled control.
     * </p>
     * 
     * @param controlIdentifier
     *        The <code>controlIdentifier</code> of the enabled control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlSummary withControlIdentifier(String controlIdentifier) {
        setControlIdentifier(controlIdentifier);
        return this;
    }

    /**
     * <p>
     * The drift status of the enabled control.
     * </p>
     * 
     * @param driftStatusSummary
     *        The drift status of the enabled control.
     */

    public void setDriftStatusSummary(DriftStatusSummary driftStatusSummary) {
        this.driftStatusSummary = driftStatusSummary;
    }

    /**
     * <p>
     * The drift status of the enabled control.
     * </p>
     * 
     * @return The drift status of the enabled control.
     */

    public DriftStatusSummary getDriftStatusSummary() {
        return this.driftStatusSummary;
    }

    /**
     * <p>
     * The drift status of the enabled control.
     * </p>
     * 
     * @param driftStatusSummary
     *        The drift status of the enabled control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlSummary withDriftStatusSummary(DriftStatusSummary driftStatusSummary) {
        setDriftStatusSummary(driftStatusSummary);
        return this;
    }

    /**
     * <p>
     * A short description of the status of the enabled control.
     * </p>
     * 
     * @param statusSummary
     *        A short description of the status of the enabled control.
     */

    public void setStatusSummary(EnablementStatusSummary statusSummary) {
        this.statusSummary = statusSummary;
    }

    /**
     * <p>
     * A short description of the status of the enabled control.
     * </p>
     * 
     * @return A short description of the status of the enabled control.
     */

    public EnablementStatusSummary getStatusSummary() {
        return this.statusSummary;
    }

    /**
     * <p>
     * A short description of the status of the enabled control.
     * </p>
     * 
     * @param statusSummary
     *        A short description of the status of the enabled control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlSummary withStatusSummary(EnablementStatusSummary statusSummary) {
        setStatusSummary(statusSummary);
        return this;
    }

    /**
     * <p>
     * The ARN of the organizational unit.
     * </p>
     * 
     * @param targetIdentifier
     *        The ARN of the organizational unit.
     */

    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    /**
     * <p>
     * The ARN of the organizational unit.
     * </p>
     * 
     * @return The ARN of the organizational unit.
     */

    public String getTargetIdentifier() {
        return this.targetIdentifier;
    }

    /**
     * <p>
     * The ARN of the organizational unit.
     * </p>
     * 
     * @param targetIdentifier
     *        The ARN of the organizational unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlSummary withTargetIdentifier(String targetIdentifier) {
        setTargetIdentifier(targetIdentifier);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getControlIdentifier() != null)
            sb.append("ControlIdentifier: ").append(getControlIdentifier()).append(",");
        if (getDriftStatusSummary() != null)
            sb.append("DriftStatusSummary: ").append(getDriftStatusSummary()).append(",");
        if (getStatusSummary() != null)
            sb.append("StatusSummary: ").append(getStatusSummary()).append(",");
        if (getTargetIdentifier() != null)
            sb.append("TargetIdentifier: ").append(getTargetIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnabledControlSummary == false)
            return false;
        EnabledControlSummary other = (EnabledControlSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getControlIdentifier() == null ^ this.getControlIdentifier() == null)
            return false;
        if (other.getControlIdentifier() != null && other.getControlIdentifier().equals(this.getControlIdentifier()) == false)
            return false;
        if (other.getDriftStatusSummary() == null ^ this.getDriftStatusSummary() == null)
            return false;
        if (other.getDriftStatusSummary() != null && other.getDriftStatusSummary().equals(this.getDriftStatusSummary()) == false)
            return false;
        if (other.getStatusSummary() == null ^ this.getStatusSummary() == null)
            return false;
        if (other.getStatusSummary() != null && other.getStatusSummary().equals(this.getStatusSummary()) == false)
            return false;
        if (other.getTargetIdentifier() == null ^ this.getTargetIdentifier() == null)
            return false;
        if (other.getTargetIdentifier() != null && other.getTargetIdentifier().equals(this.getTargetIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getControlIdentifier() == null) ? 0 : getControlIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDriftStatusSummary() == null) ? 0 : getDriftStatusSummary().hashCode());
        hashCode = prime * hashCode + ((getStatusSummary() == null) ? 0 : getStatusSummary().hashCode());
        hashCode = prime * hashCode + ((getTargetIdentifier() == null) ? 0 : getTargetIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public EnabledControlSummary clone() {
        try {
            return (EnabledControlSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.EnabledControlSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
