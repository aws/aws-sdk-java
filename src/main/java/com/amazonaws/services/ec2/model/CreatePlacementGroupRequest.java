/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createPlacementGroup(CreatePlacementGroupRequest) CreatePlacementGroup operation}.
 * <p>
 * Creates a PlacementGroup into which multiple Amazon EC2 instances can
 * be launched. Users must give the group a name unique within the scope
 * of the user account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createPlacementGroup(CreatePlacementGroupRequest)
 */
public class CreatePlacementGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the <code>PlacementGroup</code>.
     */
    private String groupName;

    /**
     * The <code>PlacementGroup</code> strategy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster
     */
    private String strategy;

    /**
     * Default constructor for a new CreatePlacementGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreatePlacementGroupRequest() {}
    
    /**
     * Constructs a new CreatePlacementGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName The name of the <code>PlacementGroup</code>.
     * @param strategy The <code>PlacementGroup</code> strategy.
     */
    public CreatePlacementGroupRequest(String groupName, String strategy) {
        this.groupName = groupName;
        this.strategy = strategy;
    }
    
    /**
     * The name of the <code>PlacementGroup</code>.
     *
     * @return The name of the <code>PlacementGroup</code>.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the <code>PlacementGroup</code>.
     *
     * @param groupName The name of the <code>PlacementGroup</code>.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the <code>PlacementGroup</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the <code>PlacementGroup</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreatePlacementGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    
    
    /**
     * The <code>PlacementGroup</code> strategy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster
     *
     * @return The <code>PlacementGroup</code> strategy.
     *
     * @see PlacementStrategy
     */
    public String getStrategy() {
        return strategy;
    }
    
    /**
     * The <code>PlacementGroup</code> strategy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster
     *
     * @param strategy The <code>PlacementGroup</code> strategy.
     *
     * @see PlacementStrategy
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
    
    /**
     * The <code>PlacementGroup</code> strategy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster
     *
     * @param strategy The <code>PlacementGroup</code> strategy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see PlacementStrategy
     */
    public CreatePlacementGroupRequest withStrategy(String strategy) {
        this.strategy = strategy;
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
        sb.append("GroupName: " + groupName + ", ");
        sb.append("Strategy: " + strategy + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    