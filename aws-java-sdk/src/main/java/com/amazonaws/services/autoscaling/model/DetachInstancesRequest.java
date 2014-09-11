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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#detachInstances(DetachInstancesRequest) DetachInstances operation}.
 * <p>
 * Using <code>DetachInstances</code> , you can remove an instance from
 * an Auto Scaling group. After the instances are detached, you can
 * manage them independently from the rest of the Auto Scaling group.
 * </p>
 * <p>
 * To learn more about detaching instances, see
 * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/detach-instance-asg.html"> Detach Amazon EC2 Instances From Your Auto Scaling Group </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#detachInstances(DetachInstancesRequest)
 */
public class DetachInstancesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list of instances to detach from the Auto Scaling group. You must
     * specify at least one instance ID.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * The name of the Auto Scaling group from which to detach instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * Specifies if the detached instance should decrement the desired
     * capacity value for the Auto Scaling group. If set to
     * <code>True</code>, the Auto Scaling group decrements the desired
     * capacity value by the number of instances detached.
     */
    private Boolean shouldDecrementDesiredCapacity;

    /**
     * A list of instances to detach from the Auto Scaling group. You must
     * specify at least one instance ID.
     *
     * @return A list of instances to detach from the Auto Scaling group. You must
     *         specify at least one instance ID.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
              instanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceIds.setAutoConstruct(true);
        }
        return instanceIds;
    }
    
    /**
     * A list of instances to detach from the Auto Scaling group. You must
     * specify at least one instance ID.
     *
     * @param instanceIds A list of instances to detach from the Auto Scaling group. You must
     *         specify at least one instance ID.
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
     * A list of instances to detach from the Auto Scaling group. You must
     * specify at least one instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds A list of instances to detach from the Auto Scaling group. You must
     *         specify at least one instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of instances to detach from the Auto Scaling group. You must
     * specify at least one instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds A list of instances to detach from the Auto Scaling group. You must
     *         specify at least one instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
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
     * The name of the Auto Scaling group from which to detach instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group from which to detach instances.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group from which to detach instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group from which to detach instances.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group from which to detach instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group from which to detach instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachInstancesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * Specifies if the detached instance should decrement the desired
     * capacity value for the Auto Scaling group. If set to
     * <code>True</code>, the Auto Scaling group decrements the desired
     * capacity value by the number of instances detached.
     *
     * @return Specifies if the detached instance should decrement the desired
     *         capacity value for the Auto Scaling group. If set to
     *         <code>True</code>, the Auto Scaling group decrements the desired
     *         capacity value by the number of instances detached.
     */
    public Boolean isShouldDecrementDesiredCapacity() {
        return shouldDecrementDesiredCapacity;
    }
    
    /**
     * Specifies if the detached instance should decrement the desired
     * capacity value for the Auto Scaling group. If set to
     * <code>True</code>, the Auto Scaling group decrements the desired
     * capacity value by the number of instances detached.
     *
     * @param shouldDecrementDesiredCapacity Specifies if the detached instance should decrement the desired
     *         capacity value for the Auto Scaling group. If set to
     *         <code>True</code>, the Auto Scaling group decrements the desired
     *         capacity value by the number of instances detached.
     */
    public void setShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
    }
    
    /**
     * Specifies if the detached instance should decrement the desired
     * capacity value for the Auto Scaling group. If set to
     * <code>True</code>, the Auto Scaling group decrements the desired
     * capacity value by the number of instances detached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shouldDecrementDesiredCapacity Specifies if the detached instance should decrement the desired
     *         capacity value for the Auto Scaling group. If set to
     *         <code>True</code>, the Auto Scaling group decrements the desired
     *         capacity value by the number of instances detached.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachInstancesRequest withShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
        return this;
    }

    /**
     * Specifies if the detached instance should decrement the desired
     * capacity value for the Auto Scaling group. If set to
     * <code>True</code>, the Auto Scaling group decrements the desired
     * capacity value by the number of instances detached.
     *
     * @return Specifies if the detached instance should decrement the desired
     *         capacity value for the Auto Scaling group. If set to
     *         <code>True</code>, the Auto Scaling group decrements the desired
     *         capacity value by the number of instances detached.
     */
    public Boolean getShouldDecrementDesiredCapacity() {
        return shouldDecrementDesiredCapacity;
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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (isShouldDecrementDesiredCapacity() != null) sb.append("ShouldDecrementDesiredCapacity: " + isShouldDecrementDesiredCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isShouldDecrementDesiredCapacity() == null) ? 0 : isShouldDecrementDesiredCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DetachInstancesRequest == false) return false;
        DetachInstancesRequest other = (DetachInstancesRequest)obj;
        
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.isShouldDecrementDesiredCapacity() == null ^ this.isShouldDecrementDesiredCapacity() == null) return false;
        if (other.isShouldDecrementDesiredCapacity() != null && other.isShouldDecrementDesiredCapacity().equals(this.isShouldDecrementDesiredCapacity()) == false) return false; 
        return true;
    }
    
}
    