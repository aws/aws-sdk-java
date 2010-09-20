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
 * Provides information about an Amazon EC2 resource Tag.
 * </p>
 */
public class TagDescription {

    /**
     * The resource ID for the tag.
     */
    private String resourceId;

    /**
     * The type of resource identified by the associated resource ID (ex:
     * instance, AMI, EBS volume, etc).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>customer-gateway, dhcp-options, image, instance, snapshot, spot-instances-request, subnet, volume, vpc, vpn-connection, vpn-gateway
     */
    private String resourceType;

    /**
     * The tag's key.
     */
    private String key;

    /**
     * The tag's value.
     */
    private String value;

    /**
     * The resource ID for the tag.
     *
     * @return The resource ID for the tag.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The resource ID for the tag.
     *
     * @param resourceId The resource ID for the tag.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The resource ID for the tag.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The resource ID for the tag.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TagDescription withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    
    
    /**
     * The type of resource identified by the associated resource ID (ex:
     * instance, AMI, EBS volume, etc).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>customer-gateway, dhcp-options, image, instance, snapshot, spot-instances-request, subnet, volume, vpc, vpn-connection, vpn-gateway
     *
     * @return The type of resource identified by the associated resource ID (ex:
     *         instance, AMI, EBS volume, etc).
     *
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of resource identified by the associated resource ID (ex:
     * instance, AMI, EBS volume, etc).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>customer-gateway, dhcp-options, image, instance, snapshot, spot-instances-request, subnet, volume, vpc, vpn-connection, vpn-gateway
     *
     * @param resourceType The type of resource identified by the associated resource ID (ex:
     *         instance, AMI, EBS volume, etc).
     *
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of resource identified by the associated resource ID (ex:
     * instance, AMI, EBS volume, etc).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>customer-gateway, dhcp-options, image, instance, snapshot, spot-instances-request, subnet, volume, vpc, vpn-connection, vpn-gateway
     *
     * @param resourceType The type of resource identified by the associated resource ID (ex:
     *         instance, AMI, EBS volume, etc).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ResourceType
     */
    public TagDescription withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    
    
    /**
     * The tag's key.
     *
     * @return The tag's key.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The tag's key.
     *
     * @param key The tag's key.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The tag's key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The tag's key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TagDescription withKey(String key) {
        this.key = key;
        return this;
    }
    
    
    /**
     * The tag's value.
     *
     * @return The tag's value.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The tag's value.
     *
     * @param value The tag's value.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The tag's value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The tag's value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TagDescription withValue(String value) {
        this.value = value;
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
        sb.append("ResourceId: " + resourceId + ", ");
        sb.append("ResourceType: " + resourceType + ", ");
        sb.append("Key: " + key + ", ");
        sb.append("Value: " + value + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    