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

/**
 * <p>
 * 
 * </p>
 */
public class Address {

    /**
     * 
     */
    private String instanceId;

    /**
     * 
     */
    private String publicIp;

    /**
     * 
     *
     * @return 
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * 
     *
     * @param instanceId 
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Address withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * 
     *
     * @param publicIp 
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Address withPublicIp(String publicIp) {
        this.publicIp = publicIp;
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
        sb.append("PublicIp: " + publicIp + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    