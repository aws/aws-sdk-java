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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreatePlacementGroupRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createPlacementGroup(CreatePlacementGroupRequest) CreatePlacementGroup operation}.
 * <p>
 * Creates a placement group that you launch cluster instances into. You
 * must give the group a name that's unique within the scope of your
 * account.
 * </p>
 * <p>
 * For more information about placement groups and cluster instances, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createPlacementGroup(CreatePlacementGroupRequest)
 */
public class CreatePlacementGroupRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreatePlacementGroupRequest> {

    /**
     * A name for the placement group. <p>Constraints: Up to 255 ASCII
     * characters
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
     * Default constructor for a new CreatePlacementGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreatePlacementGroupRequest() {}
    
    /**
     * Constructs a new CreatePlacementGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName A name for the placement group. <p>Constraints: Up to
     * 255 ASCII characters
     * @param strategy The placement strategy.
     */
    public CreatePlacementGroupRequest(String groupName, String strategy) {
        setGroupName(groupName);
        setStrategy(strategy);
    }

    /**
     * Constructs a new CreatePlacementGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName A name for the placement group. <p>Constraints: Up to
     * 255 ASCII characters
     * @param strategy The placement strategy.
     */
    public CreatePlacementGroupRequest(String groupName, PlacementStrategy strategy) {
        this.groupName = groupName;
        this.strategy = strategy.toString();
    }

    /**
     * A name for the placement group. <p>Constraints: Up to 255 ASCII
     * characters
     *
     * @return A name for the placement group. <p>Constraints: Up to 255 ASCII
     *         characters
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * A name for the placement group. <p>Constraints: Up to 255 ASCII
     * characters
     *
     * @param groupName A name for the placement group. <p>Constraints: Up to 255 ASCII
     *         characters
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * A name for the placement group. <p>Constraints: Up to 255 ASCII
     * characters
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName A name for the placement group. <p>Constraints: Up to 255 ASCII
     *         characters
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePlacementGroupRequest withGroupName(String groupName) {
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
    public CreatePlacementGroupRequest withStrategy(String strategy) {
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
    public CreatePlacementGroupRequest withStrategy(PlacementStrategy strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreatePlacementGroupRequest> getDryRunRequest() {
        Request<CreatePlacementGroupRequest> request = new CreatePlacementGroupRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getStrategy() != null) sb.append("Strategy: " + getStrategy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePlacementGroupRequest == false) return false;
        CreatePlacementGroupRequest other = (CreatePlacementGroupRequest)obj;
        
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getStrategy() == null ^ this.getStrategy() == null) return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false) return false; 
        return true;
    }
    
}
    