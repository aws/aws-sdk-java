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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a rolling deployment strategy for updating a SageMaker endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RollingUpdatePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RollingUpdatePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Batch size for each rolling step to provision capacity and turn on traffic on the new endpoint fleet, and
     * terminate capacity on the old endpoint fleet. Value must be between 5% to 50% of the variant's total instance
     * count.
     * </p>
     */
    private CapacitySize maximumBatchSize;
    /**
     * <p>
     * The length of the baking period, during which SageMaker monitors alarms for each batch on the new fleet.
     * </p>
     */
    private Integer waitIntervalInSeconds;
    /**
     * <p>
     * The time limit for the total deployment. Exceeding this limit causes a timeout.
     * </p>
     */
    private Integer maximumExecutionTimeoutInSeconds;
    /**
     * <p>
     * Batch size for rollback to the old endpoint fleet. Each rolling step to provision capacity and turn on traffic on
     * the old endpoint fleet, and terminate capacity on the new endpoint fleet. If this field is absent, the default
     * value will be set to 100% of total capacity which means to bring up the whole capacity of the old fleet at once
     * during rollback.
     * </p>
     */
    private CapacitySize rollbackMaximumBatchSize;

    /**
     * <p>
     * Batch size for each rolling step to provision capacity and turn on traffic on the new endpoint fleet, and
     * terminate capacity on the old endpoint fleet. Value must be between 5% to 50% of the variant's total instance
     * count.
     * </p>
     * 
     * @param maximumBatchSize
     *        Batch size for each rolling step to provision capacity and turn on traffic on the new endpoint fleet, and
     *        terminate capacity on the old endpoint fleet. Value must be between 5% to 50% of the variant's total
     *        instance count.
     */

    public void setMaximumBatchSize(CapacitySize maximumBatchSize) {
        this.maximumBatchSize = maximumBatchSize;
    }

    /**
     * <p>
     * Batch size for each rolling step to provision capacity and turn on traffic on the new endpoint fleet, and
     * terminate capacity on the old endpoint fleet. Value must be between 5% to 50% of the variant's total instance
     * count.
     * </p>
     * 
     * @return Batch size for each rolling step to provision capacity and turn on traffic on the new endpoint fleet, and
     *         terminate capacity on the old endpoint fleet. Value must be between 5% to 50% of the variant's total
     *         instance count.
     */

    public CapacitySize getMaximumBatchSize() {
        return this.maximumBatchSize;
    }

    /**
     * <p>
     * Batch size for each rolling step to provision capacity and turn on traffic on the new endpoint fleet, and
     * terminate capacity on the old endpoint fleet. Value must be between 5% to 50% of the variant's total instance
     * count.
     * </p>
     * 
     * @param maximumBatchSize
     *        Batch size for each rolling step to provision capacity and turn on traffic on the new endpoint fleet, and
     *        terminate capacity on the old endpoint fleet. Value must be between 5% to 50% of the variant's total
     *        instance count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollingUpdatePolicy withMaximumBatchSize(CapacitySize maximumBatchSize) {
        setMaximumBatchSize(maximumBatchSize);
        return this;
    }

    /**
     * <p>
     * The length of the baking period, during which SageMaker monitors alarms for each batch on the new fleet.
     * </p>
     * 
     * @param waitIntervalInSeconds
     *        The length of the baking period, during which SageMaker monitors alarms for each batch on the new fleet.
     */

    public void setWaitIntervalInSeconds(Integer waitIntervalInSeconds) {
        this.waitIntervalInSeconds = waitIntervalInSeconds;
    }

    /**
     * <p>
     * The length of the baking period, during which SageMaker monitors alarms for each batch on the new fleet.
     * </p>
     * 
     * @return The length of the baking period, during which SageMaker monitors alarms for each batch on the new fleet.
     */

    public Integer getWaitIntervalInSeconds() {
        return this.waitIntervalInSeconds;
    }

    /**
     * <p>
     * The length of the baking period, during which SageMaker monitors alarms for each batch on the new fleet.
     * </p>
     * 
     * @param waitIntervalInSeconds
     *        The length of the baking period, during which SageMaker monitors alarms for each batch on the new fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollingUpdatePolicy withWaitIntervalInSeconds(Integer waitIntervalInSeconds) {
        setWaitIntervalInSeconds(waitIntervalInSeconds);
        return this;
    }

    /**
     * <p>
     * The time limit for the total deployment. Exceeding this limit causes a timeout.
     * </p>
     * 
     * @param maximumExecutionTimeoutInSeconds
     *        The time limit for the total deployment. Exceeding this limit causes a timeout.
     */

    public void setMaximumExecutionTimeoutInSeconds(Integer maximumExecutionTimeoutInSeconds) {
        this.maximumExecutionTimeoutInSeconds = maximumExecutionTimeoutInSeconds;
    }

    /**
     * <p>
     * The time limit for the total deployment. Exceeding this limit causes a timeout.
     * </p>
     * 
     * @return The time limit for the total deployment. Exceeding this limit causes a timeout.
     */

    public Integer getMaximumExecutionTimeoutInSeconds() {
        return this.maximumExecutionTimeoutInSeconds;
    }

    /**
     * <p>
     * The time limit for the total deployment. Exceeding this limit causes a timeout.
     * </p>
     * 
     * @param maximumExecutionTimeoutInSeconds
     *        The time limit for the total deployment. Exceeding this limit causes a timeout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollingUpdatePolicy withMaximumExecutionTimeoutInSeconds(Integer maximumExecutionTimeoutInSeconds) {
        setMaximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * Batch size for rollback to the old endpoint fleet. Each rolling step to provision capacity and turn on traffic on
     * the old endpoint fleet, and terminate capacity on the new endpoint fleet. If this field is absent, the default
     * value will be set to 100% of total capacity which means to bring up the whole capacity of the old fleet at once
     * during rollback.
     * </p>
     * 
     * @param rollbackMaximumBatchSize
     *        Batch size for rollback to the old endpoint fleet. Each rolling step to provision capacity and turn on
     *        traffic on the old endpoint fleet, and terminate capacity on the new endpoint fleet. If this field is
     *        absent, the default value will be set to 100% of total capacity which means to bring up the whole capacity
     *        of the old fleet at once during rollback.
     */

    public void setRollbackMaximumBatchSize(CapacitySize rollbackMaximumBatchSize) {
        this.rollbackMaximumBatchSize = rollbackMaximumBatchSize;
    }

    /**
     * <p>
     * Batch size for rollback to the old endpoint fleet. Each rolling step to provision capacity and turn on traffic on
     * the old endpoint fleet, and terminate capacity on the new endpoint fleet. If this field is absent, the default
     * value will be set to 100% of total capacity which means to bring up the whole capacity of the old fleet at once
     * during rollback.
     * </p>
     * 
     * @return Batch size for rollback to the old endpoint fleet. Each rolling step to provision capacity and turn on
     *         traffic on the old endpoint fleet, and terminate capacity on the new endpoint fleet. If this field is
     *         absent, the default value will be set to 100% of total capacity which means to bring up the whole
     *         capacity of the old fleet at once during rollback.
     */

    public CapacitySize getRollbackMaximumBatchSize() {
        return this.rollbackMaximumBatchSize;
    }

    /**
     * <p>
     * Batch size for rollback to the old endpoint fleet. Each rolling step to provision capacity and turn on traffic on
     * the old endpoint fleet, and terminate capacity on the new endpoint fleet. If this field is absent, the default
     * value will be set to 100% of total capacity which means to bring up the whole capacity of the old fleet at once
     * during rollback.
     * </p>
     * 
     * @param rollbackMaximumBatchSize
     *        Batch size for rollback to the old endpoint fleet. Each rolling step to provision capacity and turn on
     *        traffic on the old endpoint fleet, and terminate capacity on the new endpoint fleet. If this field is
     *        absent, the default value will be set to 100% of total capacity which means to bring up the whole capacity
     *        of the old fleet at once during rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollingUpdatePolicy withRollbackMaximumBatchSize(CapacitySize rollbackMaximumBatchSize) {
        setRollbackMaximumBatchSize(rollbackMaximumBatchSize);
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
        if (getMaximumBatchSize() != null)
            sb.append("MaximumBatchSize: ").append(getMaximumBatchSize()).append(",");
        if (getWaitIntervalInSeconds() != null)
            sb.append("WaitIntervalInSeconds: ").append(getWaitIntervalInSeconds()).append(",");
        if (getMaximumExecutionTimeoutInSeconds() != null)
            sb.append("MaximumExecutionTimeoutInSeconds: ").append(getMaximumExecutionTimeoutInSeconds()).append(",");
        if (getRollbackMaximumBatchSize() != null)
            sb.append("RollbackMaximumBatchSize: ").append(getRollbackMaximumBatchSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollingUpdatePolicy == false)
            return false;
        RollingUpdatePolicy other = (RollingUpdatePolicy) obj;
        if (other.getMaximumBatchSize() == null ^ this.getMaximumBatchSize() == null)
            return false;
        if (other.getMaximumBatchSize() != null && other.getMaximumBatchSize().equals(this.getMaximumBatchSize()) == false)
            return false;
        if (other.getWaitIntervalInSeconds() == null ^ this.getWaitIntervalInSeconds() == null)
            return false;
        if (other.getWaitIntervalInSeconds() != null && other.getWaitIntervalInSeconds().equals(this.getWaitIntervalInSeconds()) == false)
            return false;
        if (other.getMaximumExecutionTimeoutInSeconds() == null ^ this.getMaximumExecutionTimeoutInSeconds() == null)
            return false;
        if (other.getMaximumExecutionTimeoutInSeconds() != null
                && other.getMaximumExecutionTimeoutInSeconds().equals(this.getMaximumExecutionTimeoutInSeconds()) == false)
            return false;
        if (other.getRollbackMaximumBatchSize() == null ^ this.getRollbackMaximumBatchSize() == null)
            return false;
        if (other.getRollbackMaximumBatchSize() != null && other.getRollbackMaximumBatchSize().equals(this.getRollbackMaximumBatchSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumBatchSize() == null) ? 0 : getMaximumBatchSize().hashCode());
        hashCode = prime * hashCode + ((getWaitIntervalInSeconds() == null) ? 0 : getWaitIntervalInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMaximumExecutionTimeoutInSeconds() == null) ? 0 : getMaximumExecutionTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getRollbackMaximumBatchSize() == null) ? 0 : getRollbackMaximumBatchSize().hashCode());
        return hashCode;
    }

    @Override
    public RollingUpdatePolicy clone() {
        try {
            return (RollingUpdatePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RollingUpdatePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
