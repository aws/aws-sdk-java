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
 * <p>
 * A request to shut down one or more instances. This operation is
 * idempotent; if you terminate an instance more than once, each call
 * will succeed. Terminated instances will remain visible after
 * termination (for approximately one hour).
 * </p>
 * <p>
 * <b>NOTE:</b> By default, Amazon EC2 deletes all Amazon EBS volumes
 * that were attached when the instance launched. Amazon EBS volumes
 * attached after instance launch continue running.
 * </p>
 */
public class TerminateInstancesRequest extends AmazonWebServiceRequest {

    /**
     * The list of instances to terminate.
     */
    private java.util.List<String> instanceIds;

    /**
     * The list of instances to terminate.
     *
     * @return The list of instances to terminate.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new java.util.ArrayList<String>();
        }
        return instanceIds;
    }
    
    /**
     * The list of instances to terminate.
     *
     * @param instanceIds The list of instances to terminate.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>();
        if (instanceIds != null) {
            instanceIdsCopy.addAll(instanceIds);
        }
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * The list of instances to terminate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The list of instances to terminate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateInstancesRequest withInstanceIds(String... instanceIds) {
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * The list of instances to terminate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The list of instances to terminate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>();
        if (instanceIds != null) {
            instanceIdsCopy.addAll(instanceIds);
        }
        this.instanceIds = instanceIdsCopy;

        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("InstanceIds: " + instanceIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    