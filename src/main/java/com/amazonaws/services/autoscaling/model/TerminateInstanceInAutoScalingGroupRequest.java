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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#terminateInstanceInAutoScalingGroup(TerminateInstanceInAutoScalingGroupRequest) TerminateInstanceInAutoScalingGroup operation}.
 * <p>
 * Terminates the specified instance. Optionally, the desired group size can be adjusted.
 * </p>
 * <p>
 * <b>NOTE:</b> This call simply registers a termination request. The termination of the instance cannot happen immediately.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#terminateInstanceInAutoScalingGroup(TerminateInstanceInAutoScalingGroupRequest)
 */
public class TerminateInstanceInAutoScalingGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the Amazon EC2 instance to be terminated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceId;

    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) terminating this
     * instance should also decrement the size of the
     * <a>AutoScalingGroup</a>.
     */
    private Boolean shouldDecrementDesiredCapacity;

    /**
     * The ID of the Amazon EC2 instance to be terminated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the Amazon EC2 instance to be terminated.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the Amazon EC2 instance to be terminated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The ID of the Amazon EC2 instance to be terminated.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the Amazon EC2 instance to be terminated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The ID of the Amazon EC2 instance to be terminated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateInstanceInAutoScalingGroupRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) terminating this
     * instance should also decrement the size of the
     * <a>AutoScalingGroup</a>.
     *
     * @return Specifies whether (<i>true</i>) or not (<i>false</i>) terminating this
     *         instance should also decrement the size of the
     *         <a>AutoScalingGroup</a>.
     */
    public Boolean isShouldDecrementDesiredCapacity() {
        return shouldDecrementDesiredCapacity;
    }
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) terminating this
     * instance should also decrement the size of the
     * <a>AutoScalingGroup</a>.
     *
     * @param shouldDecrementDesiredCapacity Specifies whether (<i>true</i>) or not (<i>false</i>) terminating this
     *         instance should also decrement the size of the
     *         <a>AutoScalingGroup</a>.
     */
    public void setShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
    }
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) terminating this
     * instance should also decrement the size of the
     * <a>AutoScalingGroup</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shouldDecrementDesiredCapacity Specifies whether (<i>true</i>) or not (<i>false</i>) terminating this
     *         instance should also decrement the size of the
     *         <a>AutoScalingGroup</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateInstanceInAutoScalingGroupRequest withShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
        return this;
    }

    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) terminating this
     * instance should also decrement the size of the
     * <a>AutoScalingGroup</a>.
     *
     * @return Specifies whether (<i>true</i>) or not (<i>false</i>) terminating this
     *         instance should also decrement the size of the
     *         <a>AutoScalingGroup</a>.
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (isShouldDecrementDesiredCapacity() != null) sb.append("ShouldDecrementDesiredCapacity: " + isShouldDecrementDesiredCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((isShouldDecrementDesiredCapacity() == null) ? 0 : isShouldDecrementDesiredCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TerminateInstanceInAutoScalingGroupRequest == false) return false;
        TerminateInstanceInAutoScalingGroupRequest other = (TerminateInstanceInAutoScalingGroupRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.isShouldDecrementDesiredCapacity() == null ^ this.isShouldDecrementDesiredCapacity() == null) return false;
        if (other.isShouldDecrementDesiredCapacity() != null && other.isShouldDecrementDesiredCapacity().equals(this.isShouldDecrementDesiredCapacity()) == false) return false; 
        return true;
    }
    
}
    