/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a placement group.
 * </p>
 */
public class PlacementGroup implements Serializable {

    /**
     * The name of the placement group.
     */
    private String groupName;

    /**
     * The placement strategy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster
     */
    private String strategy;

    /**
     * The state of the placement group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     */
    private String state;

    /**
     * Default constructor for a new PlacementGroup object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PlacementGroup() {}
    
    /**
     * Constructs a new PlacementGroup object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName The name of the placement group.
     */
    public PlacementGroup(String groupName) {
        setGroupName(groupName);
    }

    /**
     * The name of the placement group.
     *
     * @return The name of the placement group.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the placement group.
     *
     * @param groupName The name of the placement group.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the placement group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the placement group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PlacementGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * The placement strategy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster
     *
     * @return The placement strategy.
     *
     * @see PlacementStrategy
     */
    public String getStrategy() {
        return strategy;
    }
    
    /**
     * The placement strategy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster
     *
     * @param strategy The placement strategy.
     *
     * @see PlacementStrategy
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
    
    /**
     * The placement strategy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster
     *
     * @param strategy The placement strategy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PlacementStrategy
     */
    public PlacementGroup withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * The placement strategy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster
     *
     * @param strategy The placement strategy.
     *
     * @see PlacementStrategy
     */
    public void setStrategy(PlacementStrategy strategy) {
        this.strategy = strategy.toString();
    }
    
    /**
     * The placement strategy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster
     *
     * @param strategy The placement strategy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PlacementStrategy
     */
    public PlacementGroup withStrategy(PlacementStrategy strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * The state of the placement group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return The state of the placement group.
     *
     * @see PlacementGroupState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the placement group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The state of the placement group.
     *
     * @see PlacementGroupState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the placement group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The state of the placement group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PlacementGroupState
     */
    public PlacementGroup withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the placement group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The state of the placement group.
     *
     * @see PlacementGroupState
     */
    public void setState(PlacementGroupState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the placement group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The state of the placement group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PlacementGroupState
     */
    public PlacementGroup withState(PlacementGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() + ",");
        if (getStrategy() != null) sb.append("Strategy: " + getStrategy() + ",");
        if (getState() != null) sb.append("State: " + getState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PlacementGroup == false) return false;
        PlacementGroup other = (PlacementGroup)obj;
        
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getStrategy() == null ^ this.getStrategy() == null) return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        return true;
    }
    
}
    