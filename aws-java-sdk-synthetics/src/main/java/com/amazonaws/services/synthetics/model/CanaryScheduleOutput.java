/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * How long, in seconds, for the canary to continue making regular runs according to the schedule in the
 * <code>Expression</code> value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CanaryScheduleOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanaryScheduleOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A rate expression that defines how often the canary is to run. The syntax is
     * <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be <code>minute</code>, <code>minutes</code>, or
     * <code>hour</code>.
     * </p>
     * <p>
     * For example, <code>rate(1 minute)</code> runs the canary once a minute, <code>rate(10 minutes)</code> runs it
     * once every 10 minutes, and <code>rate(1 hour)</code> runs it once every hour.
     * </p>
     * <p>
     * Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a special value that causes the canary to
     * run only once when it is started.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * How long, in seconds, for the canary to continue making regular runs after it was created. The runs are performed
     * according to the schedule in the <code>Expression</code> value.
     * </p>
     */
    private Long durationInSeconds;

    /**
     * <p>
     * A rate expression that defines how often the canary is to run. The syntax is
     * <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be <code>minute</code>, <code>minutes</code>, or
     * <code>hour</code>.
     * </p>
     * <p>
     * For example, <code>rate(1 minute)</code> runs the canary once a minute, <code>rate(10 minutes)</code> runs it
     * once every 10 minutes, and <code>rate(1 hour)</code> runs it once every hour.
     * </p>
     * <p>
     * Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a special value that causes the canary to
     * run only once when it is started.
     * </p>
     * 
     * @param expression
     *        A rate expression that defines how often the canary is to run. The syntax is
     *        <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be <code>minute</code>, <code>minutes</code>, or
     *        <code>hour</code>. </p>
     *        <p>
     *        For example, <code>rate(1 minute)</code> runs the canary once a minute, <code>rate(10 minutes)</code> runs
     *        it once every 10 minutes, and <code>rate(1 hour)</code> runs it once every hour.
     *        </p>
     *        <p>
     *        Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a special value that causes the
     *        canary to run only once when it is started.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * A rate expression that defines how often the canary is to run. The syntax is
     * <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be <code>minute</code>, <code>minutes</code>, or
     * <code>hour</code>.
     * </p>
     * <p>
     * For example, <code>rate(1 minute)</code> runs the canary once a minute, <code>rate(10 minutes)</code> runs it
     * once every 10 minutes, and <code>rate(1 hour)</code> runs it once every hour.
     * </p>
     * <p>
     * Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a special value that causes the canary to
     * run only once when it is started.
     * </p>
     * 
     * @return A rate expression that defines how often the canary is to run. The syntax is
     *         <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be <code>minute</code>, <code>minutes</code>, or
     *         <code>hour</code>. </p>
     *         <p>
     *         For example, <code>rate(1 minute)</code> runs the canary once a minute, <code>rate(10 minutes)</code>
     *         runs it once every 10 minutes, and <code>rate(1 hour)</code> runs it once every hour.
     *         </p>
     *         <p>
     *         Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a special value that causes the
     *         canary to run only once when it is started.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * A rate expression that defines how often the canary is to run. The syntax is
     * <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be <code>minute</code>, <code>minutes</code>, or
     * <code>hour</code>.
     * </p>
     * <p>
     * For example, <code>rate(1 minute)</code> runs the canary once a minute, <code>rate(10 minutes)</code> runs it
     * once every 10 minutes, and <code>rate(1 hour)</code> runs it once every hour.
     * </p>
     * <p>
     * Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a special value that causes the canary to
     * run only once when it is started.
     * </p>
     * 
     * @param expression
     *        A rate expression that defines how often the canary is to run. The syntax is
     *        <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be <code>minute</code>, <code>minutes</code>, or
     *        <code>hour</code>. </p>
     *        <p>
     *        For example, <code>rate(1 minute)</code> runs the canary once a minute, <code>rate(10 minutes)</code> runs
     *        it once every 10 minutes, and <code>rate(1 hour)</code> runs it once every hour.
     *        </p>
     *        <p>
     *        Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a special value that causes the
     *        canary to run only once when it is started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryScheduleOutput withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * How long, in seconds, for the canary to continue making regular runs after it was created. The runs are performed
     * according to the schedule in the <code>Expression</code> value.
     * </p>
     * 
     * @param durationInSeconds
     *        How long, in seconds, for the canary to continue making regular runs after it was created. The runs are
     *        performed according to the schedule in the <code>Expression</code> value.
     */

    public void setDurationInSeconds(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * How long, in seconds, for the canary to continue making regular runs after it was created. The runs are performed
     * according to the schedule in the <code>Expression</code> value.
     * </p>
     * 
     * @return How long, in seconds, for the canary to continue making regular runs after it was created. The runs are
     *         performed according to the schedule in the <code>Expression</code> value.
     */

    public Long getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * How long, in seconds, for the canary to continue making regular runs after it was created. The runs are performed
     * according to the schedule in the <code>Expression</code> value.
     * </p>
     * 
     * @param durationInSeconds
     *        How long, in seconds, for the canary to continue making regular runs after it was created. The runs are
     *        performed according to the schedule in the <code>Expression</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryScheduleOutput withDurationInSeconds(Long durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryScheduleOutput == false)
            return false;
        CanaryScheduleOutput other = (CanaryScheduleOutput) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public CanaryScheduleOutput clone() {
        try {
            return (CanaryScheduleOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.CanaryScheduleOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
