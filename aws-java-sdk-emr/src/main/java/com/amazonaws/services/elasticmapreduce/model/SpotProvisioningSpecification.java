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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The launch specification for Spot instances in the instance fleet, which determines the defined duration and
 * provisioning timeout behavior.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SpotProvisioningSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotProvisioningSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period,
     * the <code>TimeOutAction</code> is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only
     * during initial provisioning, when the cluster is first created.
     * </p>
     */
    private Integer timeoutDurationMinutes;
    /**
     * <p>
     * The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     * <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be provisioned within
     * the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     * <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     * On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * </p>
     */
    private String timeoutAction;
    /**
     * <p>
     * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance
     * does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies.
     * Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives
     * its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a
     * Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * </p>
     */
    private Integer blockDurationMinutes;

    /**
     * <p>
     * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period,
     * the <code>TimeOutAction</code> is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only
     * during initial provisioning, when the cluster is first created.
     * </p>
     * 
     * @param timeoutDurationMinutes
     *        The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time
     *        period, the <code>TimeOutAction</code> is taken. Minimum value is 5 and maximum value is 1440. The timeout
     *        applies only during initial provisioning, when the cluster is first created.
     */

    public void setTimeoutDurationMinutes(Integer timeoutDurationMinutes) {
        this.timeoutDurationMinutes = timeoutDurationMinutes;
    }

    /**
     * <p>
     * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period,
     * the <code>TimeOutAction</code> is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only
     * during initial provisioning, when the cluster is first created.
     * </p>
     * 
     * @return The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time
     *         period, the <code>TimeOutAction</code> is taken. Minimum value is 5 and maximum value is 1440. The
     *         timeout applies only during initial provisioning, when the cluster is first created.
     */

    public Integer getTimeoutDurationMinutes() {
        return this.timeoutDurationMinutes;
    }

    /**
     * <p>
     * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period,
     * the <code>TimeOutAction</code> is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only
     * during initial provisioning, when the cluster is first created.
     * </p>
     * 
     * @param timeoutDurationMinutes
     *        The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time
     *        period, the <code>TimeOutAction</code> is taken. Minimum value is 5 and maximum value is 1440. The timeout
     *        applies only during initial provisioning, when the cluster is first created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotProvisioningSpecification withTimeoutDurationMinutes(Integer timeoutDurationMinutes) {
        setTimeoutDurationMinutes(timeoutDurationMinutes);
        return this;
    }

    /**
     * <p>
     * The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     * <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be provisioned within
     * the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     * <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     * On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * </p>
     * 
     * @param timeoutAction
     *        The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     *        <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be provisioned
     *        within the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     *        <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     *        On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * @see SpotProvisioningTimeoutAction
     */

    public void setTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    /**
     * <p>
     * The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     * <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be provisioned within
     * the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     * <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     * On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * </p>
     * 
     * @return The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     *         <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be
     *         provisioned within the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     *         <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     *         On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * @see SpotProvisioningTimeoutAction
     */

    public String getTimeoutAction() {
        return this.timeoutAction;
    }

    /**
     * <p>
     * The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     * <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be provisioned within
     * the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     * <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     * On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * </p>
     * 
     * @param timeoutAction
     *        The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     *        <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be provisioned
     *        within the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     *        <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     *        On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotProvisioningTimeoutAction
     */

    public SpotProvisioningSpecification withTimeoutAction(String timeoutAction) {
        setTimeoutAction(timeoutAction);
        return this;
    }

    /**
     * <p>
     * The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     * <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be provisioned within
     * the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     * <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     * On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * </p>
     * 
     * @param timeoutAction
     *        The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     *        <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be provisioned
     *        within the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     *        <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     *        On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * @see SpotProvisioningTimeoutAction
     */

    public void setTimeoutAction(SpotProvisioningTimeoutAction timeoutAction) {
        withTimeoutAction(timeoutAction);
    }

    /**
     * <p>
     * The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     * <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be provisioned within
     * the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     * <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     * On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * </p>
     * 
     * @param timeoutAction
     *        The action to take when <code>TargetSpotCapacity</code> has not been fulfilled when the
     *        <code>TimeoutDurationMinutes</code> has expired; that is, when all Spot instances could not be provisioned
     *        within the Spot provisioning timeout. Valid values are <code>TERMINATE_CLUSTER</code> and
     *        <code>SWITCH_TO_ON_DEMAND</code>. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available,
     *        On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotProvisioningTimeoutAction
     */

    public SpotProvisioningSpecification withTimeoutAction(SpotProvisioningTimeoutAction timeoutAction) {
        this.timeoutAction = timeoutAction.toString();
        return this;
    }

    /**
     * <p>
     * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance
     * does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies.
     * Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives
     * its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a
     * Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * </p>
     * 
     * @param blockDurationMinutes
     *        The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot
     *        instance does not terminate before the defined duration expires, and defined duration pricing for Spot
     *        instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as
     *        a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance
     *        for termination and provides a Spot instance termination notice, which gives the instance a two-minute
     *        warning before it terminates.
     */

    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    /**
     * <p>
     * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance
     * does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies.
     * Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives
     * its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a
     * Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * </p>
     * 
     * @return The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot
     *         instance does not terminate before the defined duration expires, and defined duration pricing for Spot
     *         instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as
     *         a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance
     *         for termination and provides a Spot instance termination notice, which gives the instance a two-minute
     *         warning before it terminates.
     */

    public Integer getBlockDurationMinutes() {
        return this.blockDurationMinutes;
    }

    /**
     * <p>
     * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance
     * does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies.
     * Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives
     * its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a
     * Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * </p>
     * 
     * @param blockDurationMinutes
     *        The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot
     *        instance does not terminate before the defined duration expires, and defined duration pricing for Spot
     *        instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as
     *        a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance
     *        for termination and provides a Spot instance termination notice, which gives the instance a two-minute
     *        warning before it terminates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotProvisioningSpecification withBlockDurationMinutes(Integer blockDurationMinutes) {
        setBlockDurationMinutes(blockDurationMinutes);
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
        if (getTimeoutDurationMinutes() != null)
            sb.append("TimeoutDurationMinutes: ").append(getTimeoutDurationMinutes()).append(",");
        if (getTimeoutAction() != null)
            sb.append("TimeoutAction: ").append(getTimeoutAction()).append(",");
        if (getBlockDurationMinutes() != null)
            sb.append("BlockDurationMinutes: ").append(getBlockDurationMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotProvisioningSpecification == false)
            return false;
        SpotProvisioningSpecification other = (SpotProvisioningSpecification) obj;
        if (other.getTimeoutDurationMinutes() == null ^ this.getTimeoutDurationMinutes() == null)
            return false;
        if (other.getTimeoutDurationMinutes() != null && other.getTimeoutDurationMinutes().equals(this.getTimeoutDurationMinutes()) == false)
            return false;
        if (other.getTimeoutAction() == null ^ this.getTimeoutAction() == null)
            return false;
        if (other.getTimeoutAction() != null && other.getTimeoutAction().equals(this.getTimeoutAction()) == false)
            return false;
        if (other.getBlockDurationMinutes() == null ^ this.getBlockDurationMinutes() == null)
            return false;
        if (other.getBlockDurationMinutes() != null && other.getBlockDurationMinutes().equals(this.getBlockDurationMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeoutDurationMinutes() == null) ? 0 : getTimeoutDurationMinutes().hashCode());
        hashCode = prime * hashCode + ((getTimeoutAction() == null) ? 0 : getTimeoutAction().hashCode());
        hashCode = prime * hashCode + ((getBlockDurationMinutes() == null) ? 0 : getBlockDurationMinutes().hashCode());
        return hashCode;
    }

    @Override
    public SpotProvisioningSpecification clone() {
        try {
            return (SpotProvisioningSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.SpotProvisioningSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
