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
 * A request to describe an attribute of one of a user's EC2 instances.
 * Only one attribute can be specified per call.
 * </p>
 */
public class DescribeInstanceAttributeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the instance whose instance attribute is being described.
     */
    private String instanceId;

    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * instanceType, kernel, ramdisk, userData, disableApiTermination,
     * instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping
     */
    private String attribute;

    /**
     * The ID of the instance whose instance attribute is being described.
     *
     * @return The ID of the instance whose instance attribute is being described.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance whose instance attribute is being described.
     *
     * @param instanceId The ID of the instance whose instance attribute is being described.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance whose instance attribute is being described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance whose instance attribute is being described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceAttributeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * instanceType, kernel, ramdisk, userData, disableApiTermination,
     * instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping
     *
     * @return The name of the attribute to describe. <p> Available attribute names:
     *         instanceType, kernel, ramdisk, userData, disableApiTermination,
     *         instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * instanceType, kernel, ramdisk, userData, disableApiTermination,
     * instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping
     *
     * @param attribute The name of the attribute to describe. <p> Available attribute names:
     *         instanceType, kernel, ramdisk, userData, disableApiTermination,
     *         instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * instanceType, kernel, ramdisk, userData, disableApiTermination,
     * instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attribute The name of the attribute to describe. <p> Available attribute names:
     *         instanceType, kernel, ramdisk, userData, disableApiTermination,
     *         instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    
    
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
    