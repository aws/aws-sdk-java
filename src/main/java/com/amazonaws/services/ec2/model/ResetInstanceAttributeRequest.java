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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#resetInstanceAttribute(ResetInstanceAttributeRequest) ResetInstanceAttribute operation}.
 * <p>
 * Resets an attribute of an instance to its default value.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#resetInstanceAttribute(ResetInstanceAttributeRequest)
 */
public class ResetInstanceAttributeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the Amazon EC2 instance whose attribute is being reset.
     */
    private String instanceId;

    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * kernel, ramdisk
     */
    private String attribute;

    /**
     * The ID of the Amazon EC2 instance whose attribute is being reset.
     *
     * @return The ID of the Amazon EC2 instance whose attribute is being reset.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the Amazon EC2 instance whose attribute is being reset.
     *
     * @param instanceId The ID of the Amazon EC2 instance whose attribute is being reset.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the Amazon EC2 instance whose attribute is being reset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the Amazon EC2 instance whose attribute is being reset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetInstanceAttributeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * kernel, ramdisk
     *
     * @return The name of the attribute being reset. <p> Available attribute names:
     *         kernel, ramdisk
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * kernel, ramdisk
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         kernel, ramdisk
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute being reset. <p> Available attribute names:
     * kernel, ramdisk
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attribute The name of the attribute being reset. <p> Available attribute names:
     *         kernel, ramdisk
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetInstanceAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
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
        sb.append("Attribute: " + attribute + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    