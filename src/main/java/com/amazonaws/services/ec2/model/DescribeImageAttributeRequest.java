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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeImageAttribute(DescribeImageAttributeRequest) DescribeImageAttribute operation}.
 * <p>
 * The DescribeImageAttribute operation returns information about an
 * attribute of an AMI. Only one attribute can be specified per call.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeImageAttribute(DescribeImageAttributeRequest)
 */
public class DescribeImageAttributeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the AMI whose attribute is to be described.
     */
    private String imageId;

    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * productCodes, kernel, ramdisk, launchPermisson, blockDeviceMapping
     */
    private String attribute;

    /**
     * The ID of the AMI whose attribute is to be described.
     *
     * @return The ID of the AMI whose attribute is to be described.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the AMI whose attribute is to be described.
     *
     * @param imageId The ID of the AMI whose attribute is to be described.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the AMI whose attribute is to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the AMI whose attribute is to be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImageAttributeRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * productCodes, kernel, ramdisk, launchPermisson, blockDeviceMapping
     *
     * @return The name of the attribute to describe. <p> Available attribute names:
     *         productCodes, kernel, ramdisk, launchPermisson, blockDeviceMapping
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * productCodes, kernel, ramdisk, launchPermisson, blockDeviceMapping
     *
     * @param attribute The name of the attribute to describe. <p> Available attribute names:
     *         productCodes, kernel, ramdisk, launchPermisson, blockDeviceMapping
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * productCodes, kernel, ramdisk, launchPermisson, blockDeviceMapping
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attribute The name of the attribute to describe. <p> Available attribute names:
     *         productCodes, kernel, ramdisk, launchPermisson, blockDeviceMapping
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImageAttributeRequest withAttribute(String attribute) {
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
        sb.append("ImageId: " + imageId + ", ");
        sb.append("Attribute: " + attribute + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    