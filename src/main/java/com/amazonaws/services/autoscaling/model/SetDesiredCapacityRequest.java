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
package com.amazonaws.services.autoscaling.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#setDesiredCapacity(SetDesiredCapacityRequest) SetDesiredCapacity operation}.
 * <p>
 * Adjusts the desired size of the AutoScalingGroup by initiating
 * scaling activities. When reducing the size of the group, it is not
 * possible to define which EC2 instances will be terminated. This
 * applies to any auto-scaling decisions that might result in the
 * termination of instances.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#setDesiredCapacity(SetDesiredCapacityRequest)
 */
public class SetDesiredCapacityRequest extends AmazonWebServiceRequest {

    /**
     * The name of the AutoScalingGroup.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The new capacity setting for the AutoScalingGroup.
     */
    private Integer desiredCapacity;

    /**
     * The name of the AutoScalingGroup.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the AutoScalingGroup.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the AutoScalingGroup.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the AutoScalingGroup.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the AutoScalingGroup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the AutoScalingGroup.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetDesiredCapacityRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The new capacity setting for the AutoScalingGroup.
     *
     * @return The new capacity setting for the AutoScalingGroup.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * The new capacity setting for the AutoScalingGroup.
     *
     * @param desiredCapacity The new capacity setting for the AutoScalingGroup.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * The new capacity setting for the AutoScalingGroup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity The new capacity setting for the AutoScalingGroup.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetDesiredCapacityRequest withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
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
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("DesiredCapacity: " + desiredCapacity + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    