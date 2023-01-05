/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The updates to the auto scaling parameters for the connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/AutoScalingUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target maximum number of workers allocated to the connector.
     * </p>
     */
    private Integer maxWorkerCount;
    /**
     * <p>
     * The target number of microcontroller units (MCUs) allocated to each connector worker. The valid values are
     * 1,2,4,8.
     * </p>
     */
    private Integer mcuCount;
    /**
     * <p>
     * The target minimum number of workers allocated to the connector.
     * </p>
     */
    private Integer minWorkerCount;
    /**
     * <p>
     * The target sacle-in policy for the connector.
     * </p>
     */
    private ScaleInPolicyUpdate scaleInPolicy;
    /**
     * <p>
     * The target sacle-out policy for the connector.
     * </p>
     */
    private ScaleOutPolicyUpdate scaleOutPolicy;

    /**
     * <p>
     * The target maximum number of workers allocated to the connector.
     * </p>
     * 
     * @param maxWorkerCount
     *        The target maximum number of workers allocated to the connector.
     */

    public void setMaxWorkerCount(Integer maxWorkerCount) {
        this.maxWorkerCount = maxWorkerCount;
    }

    /**
     * <p>
     * The target maximum number of workers allocated to the connector.
     * </p>
     * 
     * @return The target maximum number of workers allocated to the connector.
     */

    public Integer getMaxWorkerCount() {
        return this.maxWorkerCount;
    }

    /**
     * <p>
     * The target maximum number of workers allocated to the connector.
     * </p>
     * 
     * @param maxWorkerCount
     *        The target maximum number of workers allocated to the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingUpdate withMaxWorkerCount(Integer maxWorkerCount) {
        setMaxWorkerCount(maxWorkerCount);
        return this;
    }

    /**
     * <p>
     * The target number of microcontroller units (MCUs) allocated to each connector worker. The valid values are
     * 1,2,4,8.
     * </p>
     * 
     * @param mcuCount
     *        The target number of microcontroller units (MCUs) allocated to each connector worker. The valid values are
     *        1,2,4,8.
     */

    public void setMcuCount(Integer mcuCount) {
        this.mcuCount = mcuCount;
    }

    /**
     * <p>
     * The target number of microcontroller units (MCUs) allocated to each connector worker. The valid values are
     * 1,2,4,8.
     * </p>
     * 
     * @return The target number of microcontroller units (MCUs) allocated to each connector worker. The valid values
     *         are 1,2,4,8.
     */

    public Integer getMcuCount() {
        return this.mcuCount;
    }

    /**
     * <p>
     * The target number of microcontroller units (MCUs) allocated to each connector worker. The valid values are
     * 1,2,4,8.
     * </p>
     * 
     * @param mcuCount
     *        The target number of microcontroller units (MCUs) allocated to each connector worker. The valid values are
     *        1,2,4,8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingUpdate withMcuCount(Integer mcuCount) {
        setMcuCount(mcuCount);
        return this;
    }

    /**
     * <p>
     * The target minimum number of workers allocated to the connector.
     * </p>
     * 
     * @param minWorkerCount
     *        The target minimum number of workers allocated to the connector.
     */

    public void setMinWorkerCount(Integer minWorkerCount) {
        this.minWorkerCount = minWorkerCount;
    }

    /**
     * <p>
     * The target minimum number of workers allocated to the connector.
     * </p>
     * 
     * @return The target minimum number of workers allocated to the connector.
     */

    public Integer getMinWorkerCount() {
        return this.minWorkerCount;
    }

    /**
     * <p>
     * The target minimum number of workers allocated to the connector.
     * </p>
     * 
     * @param minWorkerCount
     *        The target minimum number of workers allocated to the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingUpdate withMinWorkerCount(Integer minWorkerCount) {
        setMinWorkerCount(minWorkerCount);
        return this;
    }

    /**
     * <p>
     * The target sacle-in policy for the connector.
     * </p>
     * 
     * @param scaleInPolicy
     *        The target sacle-in policy for the connector.
     */

    public void setScaleInPolicy(ScaleInPolicyUpdate scaleInPolicy) {
        this.scaleInPolicy = scaleInPolicy;
    }

    /**
     * <p>
     * The target sacle-in policy for the connector.
     * </p>
     * 
     * @return The target sacle-in policy for the connector.
     */

    public ScaleInPolicyUpdate getScaleInPolicy() {
        return this.scaleInPolicy;
    }

    /**
     * <p>
     * The target sacle-in policy for the connector.
     * </p>
     * 
     * @param scaleInPolicy
     *        The target sacle-in policy for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingUpdate withScaleInPolicy(ScaleInPolicyUpdate scaleInPolicy) {
        setScaleInPolicy(scaleInPolicy);
        return this;
    }

    /**
     * <p>
     * The target sacle-out policy for the connector.
     * </p>
     * 
     * @param scaleOutPolicy
     *        The target sacle-out policy for the connector.
     */

    public void setScaleOutPolicy(ScaleOutPolicyUpdate scaleOutPolicy) {
        this.scaleOutPolicy = scaleOutPolicy;
    }

    /**
     * <p>
     * The target sacle-out policy for the connector.
     * </p>
     * 
     * @return The target sacle-out policy for the connector.
     */

    public ScaleOutPolicyUpdate getScaleOutPolicy() {
        return this.scaleOutPolicy;
    }

    /**
     * <p>
     * The target sacle-out policy for the connector.
     * </p>
     * 
     * @param scaleOutPolicy
     *        The target sacle-out policy for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingUpdate withScaleOutPolicy(ScaleOutPolicyUpdate scaleOutPolicy) {
        setScaleOutPolicy(scaleOutPolicy);
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
        if (getMaxWorkerCount() != null)
            sb.append("MaxWorkerCount: ").append(getMaxWorkerCount()).append(",");
        if (getMcuCount() != null)
            sb.append("McuCount: ").append(getMcuCount()).append(",");
        if (getMinWorkerCount() != null)
            sb.append("MinWorkerCount: ").append(getMinWorkerCount()).append(",");
        if (getScaleInPolicy() != null)
            sb.append("ScaleInPolicy: ").append(getScaleInPolicy()).append(",");
        if (getScaleOutPolicy() != null)
            sb.append("ScaleOutPolicy: ").append(getScaleOutPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingUpdate == false)
            return false;
        AutoScalingUpdate other = (AutoScalingUpdate) obj;
        if (other.getMaxWorkerCount() == null ^ this.getMaxWorkerCount() == null)
            return false;
        if (other.getMaxWorkerCount() != null && other.getMaxWorkerCount().equals(this.getMaxWorkerCount()) == false)
            return false;
        if (other.getMcuCount() == null ^ this.getMcuCount() == null)
            return false;
        if (other.getMcuCount() != null && other.getMcuCount().equals(this.getMcuCount()) == false)
            return false;
        if (other.getMinWorkerCount() == null ^ this.getMinWorkerCount() == null)
            return false;
        if (other.getMinWorkerCount() != null && other.getMinWorkerCount().equals(this.getMinWorkerCount()) == false)
            return false;
        if (other.getScaleInPolicy() == null ^ this.getScaleInPolicy() == null)
            return false;
        if (other.getScaleInPolicy() != null && other.getScaleInPolicy().equals(this.getScaleInPolicy()) == false)
            return false;
        if (other.getScaleOutPolicy() == null ^ this.getScaleOutPolicy() == null)
            return false;
        if (other.getScaleOutPolicy() != null && other.getScaleOutPolicy().equals(this.getScaleOutPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxWorkerCount() == null) ? 0 : getMaxWorkerCount().hashCode());
        hashCode = prime * hashCode + ((getMcuCount() == null) ? 0 : getMcuCount().hashCode());
        hashCode = prime * hashCode + ((getMinWorkerCount() == null) ? 0 : getMinWorkerCount().hashCode());
        hashCode = prime * hashCode + ((getScaleInPolicy() == null) ? 0 : getScaleInPolicy().hashCode());
        hashCode = prime * hashCode + ((getScaleOutPolicy() == null) ? 0 : getScaleOutPolicy().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingUpdate clone() {
        try {
            return (AutoScalingUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.AutoScalingUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
