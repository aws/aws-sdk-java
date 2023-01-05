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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Shows the scaling configuration for an Aurora DB cluster in <code>serverless</code> DB engine mode.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
 * Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ScalingConfigurationInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingConfigurationInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     */
    private Integer minCapacity;
    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     */
    private Integer maxCapacity;
    /**
     * <p>
     * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in <code>serverless</code> DB
     * engine mode.
     * </p>
     * <p>
     * When the value is set to false for an Aurora Serverless v1 DB cluster, the DB cluster automatically resumes.
     * </p>
     */
    private Boolean autoPause;
    /**
     * <p>
     * The remaining amount of time, in seconds, before the Aurora DB cluster in <code>serverless</code> mode is paused.
     * A DB cluster can be paused only when it's idle (it has no connections).
     * </p>
     */
    private Integer secondsUntilAutoPause;
    /**
     * <p>
     * The action that occurs when Aurora times out while attempting to change the capacity of an Aurora Serverless v1
     * cluster. The value is either <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point isn't found in the timeout
     * period.
     * </p>
     */
    private String timeoutAction;
    /**
     * <p>
     * The number of seconds before scaling times out. What happens when an attempted scaling action times out is
     * determined by the <code>TimeoutAction</code> setting.
     * </p>
     */
    private Integer secondsBeforeTimeout;

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * 
     * @param minCapacity
     *        The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     */

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * 
     * @return The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     */

    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * 
     * @param minCapacity
     *        The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfigurationInfo withMinCapacity(Integer minCapacity) {
        setMinCapacity(minCapacity);
        return this;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * 
     * @return The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfigurationInfo withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in <code>serverless</code> DB
     * engine mode.
     * </p>
     * <p>
     * When the value is set to false for an Aurora Serverless v1 DB cluster, the DB cluster automatically resumes.
     * </p>
     * 
     * @param autoPause
     *        A value that indicates whether automatic pause is allowed for the Aurora DB cluster in
     *        <code>serverless</code> DB engine mode.</p>
     *        <p>
     *        When the value is set to false for an Aurora Serverless v1 DB cluster, the DB cluster automatically
     *        resumes.
     */

    public void setAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
    }

    /**
     * <p>
     * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in <code>serverless</code> DB
     * engine mode.
     * </p>
     * <p>
     * When the value is set to false for an Aurora Serverless v1 DB cluster, the DB cluster automatically resumes.
     * </p>
     * 
     * @return A value that indicates whether automatic pause is allowed for the Aurora DB cluster in
     *         <code>serverless</code> DB engine mode.</p>
     *         <p>
     *         When the value is set to false for an Aurora Serverless v1 DB cluster, the DB cluster automatically
     *         resumes.
     */

    public Boolean getAutoPause() {
        return this.autoPause;
    }

    /**
     * <p>
     * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in <code>serverless</code> DB
     * engine mode.
     * </p>
     * <p>
     * When the value is set to false for an Aurora Serverless v1 DB cluster, the DB cluster automatically resumes.
     * </p>
     * 
     * @param autoPause
     *        A value that indicates whether automatic pause is allowed for the Aurora DB cluster in
     *        <code>serverless</code> DB engine mode.</p>
     *        <p>
     *        When the value is set to false for an Aurora Serverless v1 DB cluster, the DB cluster automatically
     *        resumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfigurationInfo withAutoPause(Boolean autoPause) {
        setAutoPause(autoPause);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in <code>serverless</code> DB
     * engine mode.
     * </p>
     * <p>
     * When the value is set to false for an Aurora Serverless v1 DB cluster, the DB cluster automatically resumes.
     * </p>
     * 
     * @return A value that indicates whether automatic pause is allowed for the Aurora DB cluster in
     *         <code>serverless</code> DB engine mode.</p>
     *         <p>
     *         When the value is set to false for an Aurora Serverless v1 DB cluster, the DB cluster automatically
     *         resumes.
     */

    public Boolean isAutoPause() {
        return this.autoPause;
    }

    /**
     * <p>
     * The remaining amount of time, in seconds, before the Aurora DB cluster in <code>serverless</code> mode is paused.
     * A DB cluster can be paused only when it's idle (it has no connections).
     * </p>
     * 
     * @param secondsUntilAutoPause
     *        The remaining amount of time, in seconds, before the Aurora DB cluster in <code>serverless</code> mode is
     *        paused. A DB cluster can be paused only when it's idle (it has no connections).
     */

    public void setSecondsUntilAutoPause(Integer secondsUntilAutoPause) {
        this.secondsUntilAutoPause = secondsUntilAutoPause;
    }

    /**
     * <p>
     * The remaining amount of time, in seconds, before the Aurora DB cluster in <code>serverless</code> mode is paused.
     * A DB cluster can be paused only when it's idle (it has no connections).
     * </p>
     * 
     * @return The remaining amount of time, in seconds, before the Aurora DB cluster in <code>serverless</code> mode is
     *         paused. A DB cluster can be paused only when it's idle (it has no connections).
     */

    public Integer getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause;
    }

    /**
     * <p>
     * The remaining amount of time, in seconds, before the Aurora DB cluster in <code>serverless</code> mode is paused.
     * A DB cluster can be paused only when it's idle (it has no connections).
     * </p>
     * 
     * @param secondsUntilAutoPause
     *        The remaining amount of time, in seconds, before the Aurora DB cluster in <code>serverless</code> mode is
     *        paused. A DB cluster can be paused only when it's idle (it has no connections).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfigurationInfo withSecondsUntilAutoPause(Integer secondsUntilAutoPause) {
        setSecondsUntilAutoPause(secondsUntilAutoPause);
        return this;
    }

    /**
     * <p>
     * The action that occurs when Aurora times out while attempting to change the capacity of an Aurora Serverless v1
     * cluster. The value is either <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point isn't found in the timeout
     * period.
     * </p>
     * 
     * @param timeoutAction
     *        The action that occurs when Aurora times out while attempting to change the capacity of an Aurora
     *        Serverless v1 cluster. The value is either <code>ForceApplyCapacityChange</code> or
     *        <code>RollbackCapacityChange</code>.</p>
     *        <p>
     *        <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as
     *        possible.
     *        </p>
     *        <p>
     *        <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point isn't found in the
     *        timeout period.
     */

    public void setTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    /**
     * <p>
     * The action that occurs when Aurora times out while attempting to change the capacity of an Aurora Serverless v1
     * cluster. The value is either <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point isn't found in the timeout
     * period.
     * </p>
     * 
     * @return The action that occurs when Aurora times out while attempting to change the capacity of an Aurora
     *         Serverless v1 cluster. The value is either <code>ForceApplyCapacityChange</code> or
     *         <code>RollbackCapacityChange</code>.</p>
     *         <p>
     *         <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as
     *         possible.
     *         </p>
     *         <p>
     *         <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point isn't found in the
     *         timeout period.
     */

    public String getTimeoutAction() {
        return this.timeoutAction;
    }

    /**
     * <p>
     * The action that occurs when Aurora times out while attempting to change the capacity of an Aurora Serverless v1
     * cluster. The value is either <code>ForceApplyCapacityChange</code> or <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point isn't found in the timeout
     * period.
     * </p>
     * 
     * @param timeoutAction
     *        The action that occurs when Aurora times out while attempting to change the capacity of an Aurora
     *        Serverless v1 cluster. The value is either <code>ForceApplyCapacityChange</code> or
     *        <code>RollbackCapacityChange</code>.</p>
     *        <p>
     *        <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as
     *        possible.
     *        </p>
     *        <p>
     *        <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point isn't found in the
     *        timeout period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfigurationInfo withTimeoutAction(String timeoutAction) {
        setTimeoutAction(timeoutAction);
        return this;
    }

    /**
     * <p>
     * The number of seconds before scaling times out. What happens when an attempted scaling action times out is
     * determined by the <code>TimeoutAction</code> setting.
     * </p>
     * 
     * @param secondsBeforeTimeout
     *        The number of seconds before scaling times out. What happens when an attempted scaling action times out is
     *        determined by the <code>TimeoutAction</code> setting.
     */

    public void setSecondsBeforeTimeout(Integer secondsBeforeTimeout) {
        this.secondsBeforeTimeout = secondsBeforeTimeout;
    }

    /**
     * <p>
     * The number of seconds before scaling times out. What happens when an attempted scaling action times out is
     * determined by the <code>TimeoutAction</code> setting.
     * </p>
     * 
     * @return The number of seconds before scaling times out. What happens when an attempted scaling action times out
     *         is determined by the <code>TimeoutAction</code> setting.
     */

    public Integer getSecondsBeforeTimeout() {
        return this.secondsBeforeTimeout;
    }

    /**
     * <p>
     * The number of seconds before scaling times out. What happens when an attempted scaling action times out is
     * determined by the <code>TimeoutAction</code> setting.
     * </p>
     * 
     * @param secondsBeforeTimeout
     *        The number of seconds before scaling times out. What happens when an attempted scaling action times out is
     *        determined by the <code>TimeoutAction</code> setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfigurationInfo withSecondsBeforeTimeout(Integer secondsBeforeTimeout) {
        setSecondsBeforeTimeout(secondsBeforeTimeout);
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
        if (getMinCapacity() != null)
            sb.append("MinCapacity: ").append(getMinCapacity()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getAutoPause() != null)
            sb.append("AutoPause: ").append(getAutoPause()).append(",");
        if (getSecondsUntilAutoPause() != null)
            sb.append("SecondsUntilAutoPause: ").append(getSecondsUntilAutoPause()).append(",");
        if (getTimeoutAction() != null)
            sb.append("TimeoutAction: ").append(getTimeoutAction()).append(",");
        if (getSecondsBeforeTimeout() != null)
            sb.append("SecondsBeforeTimeout: ").append(getSecondsBeforeTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingConfigurationInfo == false)
            return false;
        ScalingConfigurationInfo other = (ScalingConfigurationInfo) obj;
        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null)
            return false;
        if (other.getMinCapacity() != null && other.getMinCapacity().equals(this.getMinCapacity()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getAutoPause() == null ^ this.getAutoPause() == null)
            return false;
        if (other.getAutoPause() != null && other.getAutoPause().equals(this.getAutoPause()) == false)
            return false;
        if (other.getSecondsUntilAutoPause() == null ^ this.getSecondsUntilAutoPause() == null)
            return false;
        if (other.getSecondsUntilAutoPause() != null && other.getSecondsUntilAutoPause().equals(this.getSecondsUntilAutoPause()) == false)
            return false;
        if (other.getTimeoutAction() == null ^ this.getTimeoutAction() == null)
            return false;
        if (other.getTimeoutAction() != null && other.getTimeoutAction().equals(this.getTimeoutAction()) == false)
            return false;
        if (other.getSecondsBeforeTimeout() == null ^ this.getSecondsBeforeTimeout() == null)
            return false;
        if (other.getSecondsBeforeTimeout() != null && other.getSecondsBeforeTimeout().equals(this.getSecondsBeforeTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getAutoPause() == null) ? 0 : getAutoPause().hashCode());
        hashCode = prime * hashCode + ((getSecondsUntilAutoPause() == null) ? 0 : getSecondsUntilAutoPause().hashCode());
        hashCode = prime * hashCode + ((getTimeoutAction() == null) ? 0 : getTimeoutAction().hashCode());
        hashCode = prime * hashCode + ((getSecondsBeforeTimeout() == null) ? 0 : getSecondsBeforeTimeout().hashCode());
        return hashCode;
    }

    @Override
    public ScalingConfigurationInfo clone() {
        try {
            return (ScalingConfigurationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
