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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the scaling configuration of an Aurora Serverless DB cluster.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
 * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ScalingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * The minimum capacity must be less than or equal to the maximum capacity.
     * </p>
     */
    private Integer minCapacity;
    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * The maximum capacity must be greater than or equal to the minimum capacity.
     * </p>
     */
    private Integer maxCapacity;
    /**
     * <p>
     * A value that specifies whether to allow or disallow automatic pause for an Aurora DB cluster in
     * <code>serverless</code> DB engine mode. A DB cluster can be paused only when it's idle (it has no connections).
     * </p>
     * <note>
     * <p>
     * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this
     * case, the DB cluster is restored when there is a request to connect to it.
     * </p>
     * </note>
     */
    private Boolean autoPause;
    /**
     * <p>
     * The time, in seconds, before an Aurora DB cluster in <code>serverless</code> mode is paused.
     * </p>
     */
    private Integer secondsUntilAutoPause;
    /**
     * <p>
     * The action to take when the timeout is reached, either <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point is not found in the timeout
     * period.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     */
    private String timeoutAction;

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * The minimum capacity must be less than or equal to the maximum capacity.
     * </p>
     * 
     * @param minCapacity
     *        The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.</p>
     *        <p>
     *        Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     *        </p>
     *        <p>
     *        The minimum capacity must be less than or equal to the maximum capacity.
     */

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * The minimum capacity must be less than or equal to the maximum capacity.
     * </p>
     * 
     * @return The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.</p>
     *         <p>
     *         Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     *         <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     *         </p>
     *         <p>
     *         The minimum capacity must be less than or equal to the maximum capacity.
     */

    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * <p>
     * The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * The minimum capacity must be less than or equal to the maximum capacity.
     * </p>
     * 
     * @param minCapacity
     *        The minimum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.</p>
     *        <p>
     *        Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     *        </p>
     *        <p>
     *        The minimum capacity must be less than or equal to the maximum capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfiguration withMinCapacity(Integer minCapacity) {
        setMinCapacity(minCapacity);
        return this;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * The maximum capacity must be greater than or equal to the minimum capacity.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.</p>
     *        <p>
     *        Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     *        </p>
     *        <p>
     *        The maximum capacity must be greater than or equal to the minimum capacity.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * The maximum capacity must be greater than or equal to the minimum capacity.
     * </p>
     * 
     * @return The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.</p>
     *         <p>
     *         Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     *         <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     *         </p>
     *         <p>
     *         The maximum capacity must be greater than or equal to the minimum capacity.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * <p>
     * The maximum capacity must be greater than or equal to the minimum capacity.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum capacity for an Aurora DB cluster in <code>serverless</code> DB engine mode.</p>
     *        <p>
     *        Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     *        </p>
     *        <p>
     *        The maximum capacity must be greater than or equal to the minimum capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfiguration withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether to allow or disallow automatic pause for an Aurora DB cluster in
     * <code>serverless</code> DB engine mode. A DB cluster can be paused only when it's idle (it has no connections).
     * </p>
     * <note>
     * <p>
     * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this
     * case, the DB cluster is restored when there is a request to connect to it.
     * </p>
     * </note>
     * 
     * @param autoPause
     *        A value that specifies whether to allow or disallow automatic pause for an Aurora DB cluster in
     *        <code>serverless</code> DB engine mode. A DB cluster can be paused only when it's idle (it has no
     *        connections).</p> <note>
     *        <p>
     *        If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In
     *        this case, the DB cluster is restored when there is a request to connect to it.
     *        </p>
     */

    public void setAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
    }

    /**
     * <p>
     * A value that specifies whether to allow or disallow automatic pause for an Aurora DB cluster in
     * <code>serverless</code> DB engine mode. A DB cluster can be paused only when it's idle (it has no connections).
     * </p>
     * <note>
     * <p>
     * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this
     * case, the DB cluster is restored when there is a request to connect to it.
     * </p>
     * </note>
     * 
     * @return A value that specifies whether to allow or disallow automatic pause for an Aurora DB cluster in
     *         <code>serverless</code> DB engine mode. A DB cluster can be paused only when it's idle (it has no
     *         connections).</p> <note>
     *         <p>
     *         If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In
     *         this case, the DB cluster is restored when there is a request to connect to it.
     *         </p>
     */

    public Boolean getAutoPause() {
        return this.autoPause;
    }

    /**
     * <p>
     * A value that specifies whether to allow or disallow automatic pause for an Aurora DB cluster in
     * <code>serverless</code> DB engine mode. A DB cluster can be paused only when it's idle (it has no connections).
     * </p>
     * <note>
     * <p>
     * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this
     * case, the DB cluster is restored when there is a request to connect to it.
     * </p>
     * </note>
     * 
     * @param autoPause
     *        A value that specifies whether to allow or disallow automatic pause for an Aurora DB cluster in
     *        <code>serverless</code> DB engine mode. A DB cluster can be paused only when it's idle (it has no
     *        connections).</p> <note>
     *        <p>
     *        If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In
     *        this case, the DB cluster is restored when there is a request to connect to it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfiguration withAutoPause(Boolean autoPause) {
        setAutoPause(autoPause);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether to allow or disallow automatic pause for an Aurora DB cluster in
     * <code>serverless</code> DB engine mode. A DB cluster can be paused only when it's idle (it has no connections).
     * </p>
     * <note>
     * <p>
     * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this
     * case, the DB cluster is restored when there is a request to connect to it.
     * </p>
     * </note>
     * 
     * @return A value that specifies whether to allow or disallow automatic pause for an Aurora DB cluster in
     *         <code>serverless</code> DB engine mode. A DB cluster can be paused only when it's idle (it has no
     *         connections).</p> <note>
     *         <p>
     *         If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In
     *         this case, the DB cluster is restored when there is a request to connect to it.
     *         </p>
     */

    public Boolean isAutoPause() {
        return this.autoPause;
    }

    /**
     * <p>
     * The time, in seconds, before an Aurora DB cluster in <code>serverless</code> mode is paused.
     * </p>
     * 
     * @param secondsUntilAutoPause
     *        The time, in seconds, before an Aurora DB cluster in <code>serverless</code> mode is paused.
     */

    public void setSecondsUntilAutoPause(Integer secondsUntilAutoPause) {
        this.secondsUntilAutoPause = secondsUntilAutoPause;
    }

    /**
     * <p>
     * The time, in seconds, before an Aurora DB cluster in <code>serverless</code> mode is paused.
     * </p>
     * 
     * @return The time, in seconds, before an Aurora DB cluster in <code>serverless</code> mode is paused.
     */

    public Integer getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause;
    }

    /**
     * <p>
     * The time, in seconds, before an Aurora DB cluster in <code>serverless</code> mode is paused.
     * </p>
     * 
     * @param secondsUntilAutoPause
     *        The time, in seconds, before an Aurora DB cluster in <code>serverless</code> mode is paused.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfiguration withSecondsUntilAutoPause(Integer secondsUntilAutoPause) {
        setSecondsUntilAutoPause(secondsUntilAutoPause);
        return this;
    }

    /**
     * <p>
     * The action to take when the timeout is reached, either <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point is not found in the timeout
     * period.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param timeoutAction
     *        The action to take when the timeout is reached, either <code>ForceApplyCapacityChange</code> or
     *        <code>RollbackCapacityChange</code>.</p>
     *        <p>
     *        <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as
     *        possible.
     *        </p>
     *        <p>
     *        <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point is not found in the
     *        timeout period.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     *        > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public void setTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    /**
     * <p>
     * The action to take when the timeout is reached, either <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point is not found in the timeout
     * period.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return The action to take when the timeout is reached, either <code>ForceApplyCapacityChange</code> or
     *         <code>RollbackCapacityChange</code>.</p>
     *         <p>
     *         <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as
     *         possible.
     *         </p>
     *         <p>
     *         <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point is not found in the
     *         timeout period.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     *         > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public String getTimeoutAction() {
        return this.timeoutAction;
    }

    /**
     * <p>
     * The action to take when the timeout is reached, either <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point is not found in the timeout
     * period.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param timeoutAction
     *        The action to take when the timeout is reached, either <code>ForceApplyCapacityChange</code> or
     *        <code>RollbackCapacityChange</code>.</p>
     *        <p>
     *        <code>ForceApplyCapacityChange</code>, the default, sets the capacity to the specified value as soon as
     *        possible.
     *        </p>
     *        <p>
     *        <code>RollbackCapacityChange</code> ignores the capacity change if a scaling point is not found in the
     *        timeout period.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     *        > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfiguration withTimeoutAction(String timeoutAction) {
        setTimeoutAction(timeoutAction);
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
            sb.append("TimeoutAction: ").append(getTimeoutAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingConfiguration == false)
            return false;
        ScalingConfiguration other = (ScalingConfiguration) obj;
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
        return hashCode;
    }

    @Override
    public ScalingConfiguration clone() {
        try {
            return (ScalingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
