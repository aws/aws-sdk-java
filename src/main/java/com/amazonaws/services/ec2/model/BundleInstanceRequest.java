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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#bundleInstance(BundleInstanceRequest) BundleInstance operation}.
 * <p>
 * The BundleInstance operation request that an instance is bundled the
 * next time it boots. The bundling process creates a new image from a
 * running instance and stores the AMI data in S3. Once bundled, the
 * image must be registered in the normal way using the RegisterImage
 * API.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#bundleInstance(BundleInstanceRequest)
 */
public class BundleInstanceRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the instance to bundle.
     */
    private String instanceId;

    /**
     * 
     */
    private Storage storage;

    /**
     * Default constructor for a new BundleInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public BundleInstanceRequest() {}
    
    /**
     * Constructs a new BundleInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance to bundle.
     * @param storage
     */
    public BundleInstanceRequest(String instanceId, Storage storage) {
        this.instanceId = instanceId;
        this.storage = storage;
    }
    
    /**
     * The ID of the instance to bundle.
     *
     * @return The ID of the instance to bundle.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance to bundle.
     *
     * @param instanceId The ID of the instance to bundle.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance to bundle.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance to bundle.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BundleInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public Storage getStorage() {
        return storage;
    }
    
    /**
     * 
     *
     * @param storage 
     */
    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storage 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BundleInstanceRequest withStorage(Storage storage) {
        this.storage = storage;
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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("Storage: " + storage + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    