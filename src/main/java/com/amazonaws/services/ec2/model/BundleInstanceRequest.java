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
 * Bundle Instance Request
 */
public class BundleInstanceRequest extends AmazonWebServiceRequest {
        
    private String instanceId;

    private Storage storage;

    /**
     * Returns the value of the InstanceId property for this object.
     *
     * @return The value of the InstanceId property for this object.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * Sets the value of the InstanceId property for this object.
     *
     * @param instanceId The new value for the InstanceId property for this object.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * Sets the value of the InstanceId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The new value for the InstanceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BundleInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * Returns the value of the Storage property for this object.
     *
     * @return The value of the Storage property for this object.
     */
    public Storage getStorage() {
        return storage;
    }
    
    /**
     * Sets the value of the Storage property for this object.
     *
     * @param storage The new value for the Storage property for this object.
     */
    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    
    /**
     * Sets the value of the Storage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storage The new value for the Storage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BundleInstanceRequest withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }
    
    
}
    