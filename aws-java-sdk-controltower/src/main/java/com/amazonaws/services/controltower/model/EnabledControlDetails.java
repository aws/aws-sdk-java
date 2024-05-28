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
 * Information about the enabled control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnabledControlDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnabledControlDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the enabled control.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The control identifier of the enabled control. For information on how to find the <code>controlIdentifier</code>,
     * see <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
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
     * The deployment summary of the enabled control.
     * </p>
     */
    private EnablementStatusSummary statusSummary;
    /**
     * <p>
     * The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     */
    private String targetIdentifier;
    /**
     * <p>
     * Target Amazon Web Services Regions for the enabled control.
     * </p>
     */
    private java.util.List<Region> targetRegions;

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

    public EnabledControlDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The control identifier of the enabled control. For information on how to find the <code>controlIdentifier</code>,
     * see <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @param controlIdentifier
     *        The control identifier of the enabled control. For information on how to find the
     *        <code>controlIdentifier</code>, see <a
     *        href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     */

    public void setControlIdentifier(String controlIdentifier) {
        this.controlIdentifier = controlIdentifier;
    }

    /**
     * <p>
     * The control identifier of the enabled control. For information on how to find the <code>controlIdentifier</code>,
     * see <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @return The control identifier of the enabled control. For information on how to find the
     *         <code>controlIdentifier</code>, see <a
     *         href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     */

    public String getControlIdentifier() {
        return this.controlIdentifier;
    }

    /**
     * <p>
     * The control identifier of the enabled control. For information on how to find the <code>controlIdentifier</code>,
     * see <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @param controlIdentifier
     *        The control identifier of the enabled control. For information on how to find the
     *        <code>controlIdentifier</code>, see <a
     *        href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlDetails withControlIdentifier(String controlIdentifier) {
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

    public EnabledControlDetails withDriftStatusSummary(DriftStatusSummary driftStatusSummary) {
        setDriftStatusSummary(driftStatusSummary);
        return this;
    }

    /**
     * <p>
     * The deployment summary of the enabled control.
     * </p>
     * 
     * @param statusSummary
     *        The deployment summary of the enabled control.
     */

    public void setStatusSummary(EnablementStatusSummary statusSummary) {
        this.statusSummary = statusSummary;
    }

    /**
     * <p>
     * The deployment summary of the enabled control.
     * </p>
     * 
     * @return The deployment summary of the enabled control.
     */

    public EnablementStatusSummary getStatusSummary() {
        return this.statusSummary;
    }

    /**
     * <p>
     * The deployment summary of the enabled control.
     * </p>
     * 
     * @param statusSummary
     *        The deployment summary of the enabled control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlDetails withStatusSummary(EnablementStatusSummary statusSummary) {
        setStatusSummary(statusSummary);
        return this;
    }

    /**
     * <p>
     * The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @param targetIdentifier
     *        The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see
     *        <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     */

    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    /**
     * <p>
     * The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @return The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see
     *         <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview
     *         page</a>.
     */

    public String getTargetIdentifier() {
        return this.targetIdentifier;
    }

    /**
     * <p>
     * The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @param targetIdentifier
     *        The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see
     *        <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlDetails withTargetIdentifier(String targetIdentifier) {
        setTargetIdentifier(targetIdentifier);
        return this;
    }

    /**
     * <p>
     * Target Amazon Web Services Regions for the enabled control.
     * </p>
     * 
     * @return Target Amazon Web Services Regions for the enabled control.
     */

    public java.util.List<Region> getTargetRegions() {
        return targetRegions;
    }

    /**
     * <p>
     * Target Amazon Web Services Regions for the enabled control.
     * </p>
     * 
     * @param targetRegions
     *        Target Amazon Web Services Regions for the enabled control.
     */

    public void setTargetRegions(java.util.Collection<Region> targetRegions) {
        if (targetRegions == null) {
            this.targetRegions = null;
            return;
        }

        this.targetRegions = new java.util.ArrayList<Region>(targetRegions);
    }

    /**
     * <p>
     * Target Amazon Web Services Regions for the enabled control.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetRegions(java.util.Collection)} or {@link #withTargetRegions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param targetRegions
     *        Target Amazon Web Services Regions for the enabled control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlDetails withTargetRegions(Region... targetRegions) {
        if (this.targetRegions == null) {
            setTargetRegions(new java.util.ArrayList<Region>(targetRegions.length));
        }
        for (Region ele : targetRegions) {
            this.targetRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Target Amazon Web Services Regions for the enabled control.
     * </p>
     * 
     * @param targetRegions
     *        Target Amazon Web Services Regions for the enabled control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlDetails withTargetRegions(java.util.Collection<Region> targetRegions) {
        setTargetRegions(targetRegions);
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
            sb.append("TargetIdentifier: ").append(getTargetIdentifier()).append(",");
        if (getTargetRegions() != null)
            sb.append("TargetRegions: ").append(getTargetRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnabledControlDetails == false)
            return false;
        EnabledControlDetails other = (EnabledControlDetails) obj;
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
        if (other.getTargetRegions() == null ^ this.getTargetRegions() == null)
            return false;
        if (other.getTargetRegions() != null && other.getTargetRegions().equals(this.getTargetRegions()) == false)
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
        hashCode = prime * hashCode + ((getTargetRegions() == null) ? 0 : getTargetRegions().hashCode());
        return hashCode;
    }

    @Override
    public EnabledControlDetails clone() {
        try {
            return (EnabledControlDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.EnabledControlDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
