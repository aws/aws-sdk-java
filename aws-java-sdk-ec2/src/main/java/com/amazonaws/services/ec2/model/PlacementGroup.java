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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a placement group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PlacementGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlacementGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the placement group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The state of the placement group.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The placement strategy.
     * </p>
     */
    private String strategy;
    /**
     * <p>
     * The number of partitions. Valid only if <b>strategy</b> is set to <code>partition</code>.
     * </p>
     */
    private Integer partitionCount;

    /**
     * Default constructor for PlacementGroup object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public PlacementGroup() {
    }

    /**
     * Constructs a new PlacementGroup object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName
     *        The name of the placement group.
     */
    public PlacementGroup(String groupName) {
        setGroupName(groupName);
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     * 
     * @return The name of the placement group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementGroup withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * 
     * @param state
     *        The state of the placement group.
     * @see PlacementGroupState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * 
     * @return The state of the placement group.
     * @see PlacementGroupState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * 
     * @param state
     *        The state of the placement group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementGroupState
     */

    public PlacementGroup withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * 
     * @param state
     *        The state of the placement group.
     * @see PlacementGroupState
     */

    public void setState(PlacementGroupState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * 
     * @param state
     *        The state of the placement group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementGroupState
     */

    public PlacementGroup withState(PlacementGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * 
     * @param strategy
     *        The placement strategy.
     * @see PlacementStrategy
     */

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * 
     * @return The placement strategy.
     * @see PlacementStrategy
     */

    public String getStrategy() {
        return this.strategy;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * 
     * @param strategy
     *        The placement strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementStrategy
     */

    public PlacementGroup withStrategy(String strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * 
     * @param strategy
     *        The placement strategy.
     * @see PlacementStrategy
     */

    public void setStrategy(PlacementStrategy strategy) {
        withStrategy(strategy);
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * 
     * @param strategy
     *        The placement strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementStrategy
     */

    public PlacementGroup withStrategy(PlacementStrategy strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * The number of partitions. Valid only if <b>strategy</b> is set to <code>partition</code>.
     * </p>
     * 
     * @param partitionCount
     *        The number of partitions. Valid only if <b>strategy</b> is set to <code>partition</code>.
     */

    public void setPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
    }

    /**
     * <p>
     * The number of partitions. Valid only if <b>strategy</b> is set to <code>partition</code>.
     * </p>
     * 
     * @return The number of partitions. Valid only if <b>strategy</b> is set to <code>partition</code>.
     */

    public Integer getPartitionCount() {
        return this.partitionCount;
    }

    /**
     * <p>
     * The number of partitions. Valid only if <b>strategy</b> is set to <code>partition</code>.
     * </p>
     * 
     * @param partitionCount
     *        The number of partitions. Valid only if <b>strategy</b> is set to <code>partition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementGroup withPartitionCount(Integer partitionCount) {
        setPartitionCount(partitionCount);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStrategy() != null)
            sb.append("Strategy: ").append(getStrategy()).append(",");
        if (getPartitionCount() != null)
            sb.append("PartitionCount: ").append(getPartitionCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementGroup == false)
            return false;
        PlacementGroup other = (PlacementGroup) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        if (other.getPartitionCount() == null ^ this.getPartitionCount() == null)
            return false;
        if (other.getPartitionCount() != null && other.getPartitionCount().equals(this.getPartitionCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime * hashCode + ((getPartitionCount() == null) ? 0 : getPartitionCount().hashCode());
        return hashCode;
    }

    @Override
    public PlacementGroup clone() {
        try {
            return (PlacementGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
