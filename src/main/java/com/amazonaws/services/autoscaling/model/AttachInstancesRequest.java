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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#attachInstances(AttachInstancesRequest) AttachInstances operation}.
 * <p>
 * Attaches one or more Amazon EC2 instances to an existing Auto Scaling
 * group. After the instance(s) is attached, it becomes a part of the
 * Auto Scaling group.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-instance-asg.html"> Attach Amazon EC2 Instance(s) to Your Existing Auto Scaling Group </a>
 * in the <i>Auto Scaling Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#attachInstances(AttachInstancesRequest)
 */
public class AttachInstancesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * One or more IDs of the Amazon EC2 instances to attach to the specified
     * Auto Scaling group. You must specify at least one instance ID.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * The name of the Auto Scaling group to which to attach the specified
     * instance(s).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * One or more IDs of the Amazon EC2 instances to attach to the specified
     * Auto Scaling group. You must specify at least one instance ID.
     *
     * @return One or more IDs of the Amazon EC2 instances to attach to the specified
     *         Auto Scaling group. You must specify at least one instance ID.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
              instanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceIds.setAutoConstruct(true);
        }
        return instanceIds;
    }
    
    /**
     * One or more IDs of the Amazon EC2 instances to attach to the specified
     * Auto Scaling group. You must specify at least one instance ID.
     *
     * @param instanceIds One or more IDs of the Amazon EC2 instances to attach to the specified
     *         Auto Scaling group. You must specify at least one instance ID.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * One or more IDs of the Amazon EC2 instances to attach to the specified
     * Auto Scaling group. You must specify at least one instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds One or more IDs of the Amazon EC2 instances to attach to the specified
     *         Auto Scaling group. You must specify at least one instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more IDs of the Amazon EC2 instances to attach to the specified
     * Auto Scaling group. You must specify at least one instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds One or more IDs of the Amazon EC2 instances to attach to the specified
     *         Auto Scaling group. You must specify at least one instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
        }

        return this;
    }

    /**
     * The name of the Auto Scaling group to which to attach the specified
     * instance(s).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group to which to attach the specified
     *         instance(s).
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group to which to attach the specified
     * instance(s).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group to which to attach the specified
     *         instance(s).
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group to which to attach the specified
     * instance(s).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group to which to attach the specified
     *         instance(s).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachInstancesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
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
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttachInstancesRequest == false) return false;
        AttachInstancesRequest other = (AttachInstancesRequest)obj;
        
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        return true;
    }
    
}
    