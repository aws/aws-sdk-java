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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#stopInstances(StopInstancesRequest) StopInstances operation}.
 * <p>
 * Stops an instance that uses an Amazon EBS volume as its root device.
 * Instances that use Amazon EBS volumes as their root devices can be
 * quickly stopped and started. When an instance is stopped, the compute
 * resources are released and you are not billed for hourly instance
 * usage. However, your root partition Amazon EBS volume remains,
 * continues to persist your data, and you are charged for Amazon EBS
 * volume usage. You can restart your instance at any time.
 * </p>
 * <p>
 * <b>NOTE:</b> Before stopping an instance, make sure it is in a state
 * from which it can be restarted. Stopping an instance does not preserve
 * data stored in RAM. Performing this operation on an instance that uses
 * an instance store as its root device returns an error.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#stopInstances(StopInstancesRequest)
 */
public class StopInstancesRequest extends AmazonWebServiceRequest {

    /**
     * The list of Amazon EC2 instances to stop.
     */
    private java.util.List<String> instanceIds;

    /**
     * Forces the instance to stop. The instance will not have an opportunity
     * to flush file system caches nor file system meta data. If you use this
     * option, you must perform file system check and repair procedures. This
     * option is not recommended for Windows instances.
     */
    private Boolean force;

    /**
     * The list of Amazon EC2 instances to stop.
     *
     * @return The list of Amazon EC2 instances to stop.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new java.util.ArrayList<String>();
        }
        return instanceIds;
    }
    
    /**
     * The list of Amazon EC2 instances to stop.
     *
     * @param instanceIds The list of Amazon EC2 instances to stop.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>();
        if (instanceIds != null) {
            instanceIdsCopy.addAll(instanceIds);
        }
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * The list of Amazon EC2 instances to stop.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The list of Amazon EC2 instances to stop.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StopInstancesRequest withInstanceIds(String... instanceIds) {
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * The list of Amazon EC2 instances to stop.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The list of Amazon EC2 instances to stop.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StopInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>();
        if (instanceIds != null) {
            instanceIdsCopy.addAll(instanceIds);
        }
        this.instanceIds = instanceIdsCopy;

        return this;
    }
    
    /**
     * Forces the instance to stop. The instance will not have an opportunity
     * to flush file system caches nor file system meta data. If you use this
     * option, you must perform file system check and repair procedures. This
     * option is not recommended for Windows instances.
     *
     * @return Forces the instance to stop. The instance will not have an opportunity
     *         to flush file system caches nor file system meta data. If you use this
     *         option, you must perform file system check and repair procedures. This
     *         option is not recommended for Windows instances.
     */
    public Boolean isForce() {
        return force;
    }
    
    /**
     * Forces the instance to stop. The instance will not have an opportunity
     * to flush file system caches nor file system meta data. If you use this
     * option, you must perform file system check and repair procedures. This
     * option is not recommended for Windows instances.
     *
     * @param force Forces the instance to stop. The instance will not have an opportunity
     *         to flush file system caches nor file system meta data. If you use this
     *         option, you must perform file system check and repair procedures. This
     *         option is not recommended for Windows instances.
     */
    public void setForce(Boolean force) {
        this.force = force;
    }
    
    /**
     * Forces the instance to stop. The instance will not have an opportunity
     * to flush file system caches nor file system meta data. If you use this
     * option, you must perform file system check and repair procedures. This
     * option is not recommended for Windows instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param force Forces the instance to stop. The instance will not have an opportunity
     *         to flush file system caches nor file system meta data. If you use this
     *         option, you must perform file system check and repair procedures. This
     *         option is not recommended for Windows instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StopInstancesRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }
    
    
    /**
     * Forces the instance to stop. The instance will not have an opportunity
     * to flush file system caches nor file system meta data. If you use this
     * option, you must perform file system check and repair procedures. This
     * option is not recommended for Windows instances.
     *
     * @return Forces the instance to stop. The instance will not have an opportunity
     *         to flush file system caches nor file system meta data. If you use this
     *         option, you must perform file system check and repair procedures. This
     *         option is not recommended for Windows instances.
     */
    public Boolean getForce() {
        return force;
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
        sb.append("Force: " + force + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    