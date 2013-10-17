/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DeletePlacementGroupRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deletePlacementGroup(DeletePlacementGroupRequest) DeletePlacementGroup operation}.
 * <p>
 * Deletes a PlacementGroup from a user's account. Terminate all Amazon EC2 instances in the placement group before deletion.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deletePlacementGroup(DeletePlacementGroupRequest)
 */
public class DeletePlacementGroupRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeletePlacementGroupRequest> {

    /**
     * The name of the <code>PlacementGroup</code> to delete.
     */
    private String groupName;

    /**
     * Default constructor for a new DeletePlacementGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeletePlacementGroupRequest() {}
    
    /**
     * Constructs a new DeletePlacementGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName The name of the <code>PlacementGroup</code> to
     * delete.
     */
    public DeletePlacementGroupRequest(String groupName) {
        setGroupName(groupName);
    }

    /**
     * The name of the <code>PlacementGroup</code> to delete.
     *
     * @return The name of the <code>PlacementGroup</code> to delete.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the <code>PlacementGroup</code> to delete.
     *
     * @param groupName The name of the <code>PlacementGroup</code> to delete.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the <code>PlacementGroup</code> to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the <code>PlacementGroup</code> to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeletePlacementGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeletePlacementGroupRequest> getDryRunRequest() {
        Request<DeletePlacementGroupRequest> request = new DeletePlacementGroupRequestMarshaller().marshall(this);
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
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeletePlacementGroupRequest == false) return false;
        DeletePlacementGroupRequest other = (DeletePlacementGroupRequest)obj;
        
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        return true;
    }
    
}
    