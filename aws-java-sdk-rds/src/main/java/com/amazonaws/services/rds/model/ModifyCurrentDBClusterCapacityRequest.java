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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCurrentDBClusterCapacity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCurrentDBClusterCapacityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The DB cluster capacity.
     * </p>
     * <p>
     * When you change the capacity of a paused Aurora Serverless DB cluster, it automatically resumes.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>, <code>64</code>,
     * <code>128</code>, or <code>256</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Integer capacity;
    /**
     * <p>
     * The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless scaling
     * before enforcing the timeout action. The default is 300.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be from 10 through 600.
     * </p>
     * </li>
     * </ul>
     */
    private Integer secondsBeforeTimeout;
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
     */
    private String timeoutAction;

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DB cluster.
     *        </p>
     *        </li>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DB cluster.
     *         </p>
     *         </li>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DB cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCurrentDBClusterCapacityRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The DB cluster capacity.
     * </p>
     * <p>
     * When you change the capacity of a paused Aurora Serverless DB cluster, it automatically resumes.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>, <code>64</code>,
     * <code>128</code>, or <code>256</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacity
     *        The DB cluster capacity.</p>
     *        <p>
     *        When you change the capacity of a paused Aurora Serverless DB cluster, it automatically resumes.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Value must be <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     *        <code>64</code>, <code>128</code>, or <code>256</code>.
     *        </p>
     *        </li>
     */

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The DB cluster capacity.
     * </p>
     * <p>
     * When you change the capacity of a paused Aurora Serverless DB cluster, it automatically resumes.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>, <code>64</code>,
     * <code>128</code>, or <code>256</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB cluster capacity.</p>
     *         <p>
     *         When you change the capacity of a paused Aurora Serverless DB cluster, it automatically resumes.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Value must be <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     *         <code>64</code>, <code>128</code>, or <code>256</code>.
     *         </p>
     *         </li>
     */

    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The DB cluster capacity.
     * </p>
     * <p>
     * When you change the capacity of a paused Aurora Serverless DB cluster, it automatically resumes.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>, <code>64</code>,
     * <code>128</code>, or <code>256</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacity
     *        The DB cluster capacity.</p>
     *        <p>
     *        When you change the capacity of a paused Aurora Serverless DB cluster, it automatically resumes.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Value must be <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     *        <code>64</code>, <code>128</code>, or <code>256</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCurrentDBClusterCapacityRequest withCapacity(Integer capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless scaling
     * before enforcing the timeout action. The default is 300.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be from 10 through 600.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secondsBeforeTimeout
     *        The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless
     *        scaling before enforcing the timeout action. The default is 300.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Value must be from 10 through 600.
     *        </p>
     *        </li>
     */

    public void setSecondsBeforeTimeout(Integer secondsBeforeTimeout) {
        this.secondsBeforeTimeout = secondsBeforeTimeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless scaling
     * before enforcing the timeout action. The default is 300.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be from 10 through 600.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless
     *         scaling before enforcing the timeout action. The default is 300.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Value must be from 10 through 600.
     *         </p>
     *         </li>
     */

    public Integer getSecondsBeforeTimeout() {
        return this.secondsBeforeTimeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless scaling
     * before enforcing the timeout action. The default is 300.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be from 10 through 600.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secondsBeforeTimeout
     *        The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless
     *        scaling before enforcing the timeout action. The default is 300.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Value must be from 10 through 600.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCurrentDBClusterCapacityRequest withSecondsBeforeTimeout(Integer secondsBeforeTimeout) {
        setSecondsBeforeTimeout(secondsBeforeTimeout);
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCurrentDBClusterCapacityRequest withTimeoutAction(String timeoutAction) {
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getSecondsBeforeTimeout() != null)
            sb.append("SecondsBeforeTimeout: ").append(getSecondsBeforeTimeout()).append(",");
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

        if (obj instanceof ModifyCurrentDBClusterCapacityRequest == false)
            return false;
        ModifyCurrentDBClusterCapacityRequest other = (ModifyCurrentDBClusterCapacityRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getSecondsBeforeTimeout() == null ^ this.getSecondsBeforeTimeout() == null)
            return false;
        if (other.getSecondsBeforeTimeout() != null && other.getSecondsBeforeTimeout().equals(this.getSecondsBeforeTimeout()) == false)
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

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getSecondsBeforeTimeout() == null) ? 0 : getSecondsBeforeTimeout().hashCode());
        hashCode = prime * hashCode + ((getTimeoutAction() == null) ? 0 : getTimeoutAction().hashCode());
        return hashCode;
    }

    @Override
    public ModifyCurrentDBClusterCapacityRequest clone() {
        return (ModifyCurrentDBClusterCapacityRequest) super.clone();
    }

}
