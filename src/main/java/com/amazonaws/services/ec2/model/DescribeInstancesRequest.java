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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeInstances(DescribeInstancesRequest) DescribeInstances operation}.
 * <p>
 * The DescribeInstances operation returns information about instances
 * that you own.
 * </p>
 * <p>
 * If you specify one or more instance IDs, Amazon EC2 returns
 * information for those instances. If you do not specify instance IDs,
 * Amazon EC2 returns information for all relevant instances. If you
 * specify an invalid instance ID, a fault is returned. If you specify an
 * instance that you do not own, it will not be included in the returned
 * results.
 * </p>
 * <p>
 * Recently terminated instances might appear in the returned results.
 * This interval is usually less than one hour.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeInstances(DescribeInstancesRequest)
 */
public class DescribeInstancesRequest extends AmazonWebServiceRequest {

    /**
     * An optional list of the instances to describe.
     */
    private java.util.List<String> instanceIds;

    /**
     * An optional list of the instances to describe.
     *
     * @return An optional list of the instances to describe.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new java.util.ArrayList<String>();
        }
        return instanceIds;
    }
    
    /**
     * An optional list of the instances to describe.
     *
     * @param instanceIds An optional list of the instances to describe.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>();
        if (instanceIds != null) {
            instanceIdsCopy.addAll(instanceIds);
        }
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * An optional list of the instances to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds An optional list of the instances to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withInstanceIds(String... instanceIds) {
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * An optional list of the instances to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds An optional list of the instances to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>();
        if (instanceIds != null) {
            instanceIdsCopy.addAll(instanceIds);
        }
        this.instanceIds = instanceIdsCopy;

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
        
        sb.append("InstanceIds: " + instanceIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    