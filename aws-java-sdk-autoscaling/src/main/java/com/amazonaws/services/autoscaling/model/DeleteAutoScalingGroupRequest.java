/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#deleteAutoScalingGroup(DeleteAutoScalingGroupRequest) DeleteAutoScalingGroup operation}.
 * <p>
 * Deletes the specified Auto Scaling group.
 * </p>
 * <p>
 * The group must have no instances and no scaling activities in
 * progress.
 * </p>
 * <p>
 * To remove all instances before calling DeleteAutoScalingGroup, you can
 * call UpdateAutoScalingGroup to set the minimum and maximum size of the
 * AutoScalingGroup to zero.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#deleteAutoScalingGroup(DeleteAutoScalingGroupRequest)
 */
public class DeleteAutoScalingGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the group to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * Specifies that the group will be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions
     * associated with the group.
     */
    private Boolean forceDelete;

    /**
     * The name of the group to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the group to delete.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the group to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group to delete.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the group to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteAutoScalingGroupRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * Specifies that the group will be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions
     * associated with the group.
     *
     * @return Specifies that the group will be deleted along with all instances
     *         associated with the group, without waiting for all instances to be
     *         terminated. This parameter also deletes any lifecycle actions
     *         associated with the group.
     */
    public Boolean isForceDelete() {
        return forceDelete;
    }
    
    /**
     * Specifies that the group will be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions
     * associated with the group.
     *
     * @param forceDelete Specifies that the group will be deleted along with all instances
     *         associated with the group, without waiting for all instances to be
     *         terminated. This parameter also deletes any lifecycle actions
     *         associated with the group.
     */
    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }
    
    /**
     * Specifies that the group will be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions
     * associated with the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param forceDelete Specifies that the group will be deleted along with all instances
     *         associated with the group, without waiting for all instances to be
     *         terminated. This parameter also deletes any lifecycle actions
     *         associated with the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteAutoScalingGroupRequest withForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }

    /**
     * Specifies that the group will be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions
     * associated with the group.
     *
     * @return Specifies that the group will be deleted along with all instances
     *         associated with the group, without waiting for all instances to be
     *         terminated. This parameter also deletes any lifecycle actions
     *         associated with the group.
     */
    public Boolean getForceDelete() {
        return forceDelete;
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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (isForceDelete() != null) sb.append("ForceDelete: " + isForceDelete() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isForceDelete() == null) ? 0 : isForceDelete().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteAutoScalingGroupRequest == false) return false;
        DeleteAutoScalingGroupRequest other = (DeleteAutoScalingGroupRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.isForceDelete() == null ^ this.isForceDelete() == null) return false;
        if (other.isForceDelete() != null && other.isForceDelete().equals(this.isForceDelete()) == false) return false; 
        return true;
    }
    
}
    