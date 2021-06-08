/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessDevice" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWirelessDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The wireless device type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the new resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the new resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the destination to assign to the new wireless device.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The device configuration information to use to create the wireless device.
     * </p>
     */
    private LoRaWANDevice loRaWAN;
    /**
     * <p>
     * The tags to attach to the new wireless device. Tags are metadata that you can use to manage a resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @see WirelessDeviceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @return The wireless device type.
     * @see WirelessDeviceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public CreateWirelessDeviceRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public CreateWirelessDeviceRequest withType(WirelessDeviceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * 
     * @param name
     *        The name of the new resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * 
     * @return The name of the new resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * 
     * @param name
     *        The name of the new resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessDeviceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the new resource.
     * </p>
     * 
     * @param description
     *        The description of the new resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the new resource.
     * </p>
     * 
     * @return The description of the new resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the new resource.
     * </p>
     * 
     * @param description
     *        The description of the new resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessDeviceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the destination to assign to the new wireless device.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination to assign to the new wireless device.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the destination to assign to the new wireless device.
     * </p>
     * 
     * @return The name of the destination to assign to the new wireless device.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of the destination to assign to the new wireless device.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination to assign to the new wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessDeviceRequest withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each resource must have a unique client request token. If you try to create a new resource with the same
     *        token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @return Each resource must have a unique client request token. If you try to create a new resource with the same
     *         token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *         automatically generate a unique client request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each resource must have a unique client request token. If you try to create a new resource with the same
     *        token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessDeviceRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The device configuration information to use to create the wireless device.
     * </p>
     * 
     * @param loRaWAN
     *        The device configuration information to use to create the wireless device.
     */

    public void setLoRaWAN(LoRaWANDevice loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * <p>
     * The device configuration information to use to create the wireless device.
     * </p>
     * 
     * @return The device configuration information to use to create the wireless device.
     */

    public LoRaWANDevice getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * <p>
     * The device configuration information to use to create the wireless device.
     * </p>
     * 
     * @param loRaWAN
     *        The device configuration information to use to create the wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessDeviceRequest withLoRaWAN(LoRaWANDevice loRaWAN) {
        setLoRaWAN(loRaWAN);
        return this;
    }

    /**
     * <p>
     * The tags to attach to the new wireless device. Tags are metadata that you can use to manage a resource.
     * </p>
     * 
     * @return The tags to attach to the new wireless device. Tags are metadata that you can use to manage a resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to attach to the new wireless device. Tags are metadata that you can use to manage a resource.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the new wireless device. Tags are metadata that you can use to manage a resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to attach to the new wireless device. Tags are metadata that you can use to manage a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the new wireless device. Tags are metadata that you can use to manage a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessDeviceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to attach to the new wireless device. Tags are metadata that you can use to manage a resource.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the new wireless device. Tags are metadata that you can use to manage a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessDeviceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getLoRaWAN() != null)
            sb.append("LoRaWAN: ").append(getLoRaWAN()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWirelessDeviceRequest == false)
            return false;
        CreateWirelessDeviceRequest other = (CreateWirelessDeviceRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getLoRaWAN() == null ^ this.getLoRaWAN() == null)
            return false;
        if (other.getLoRaWAN() != null && other.getLoRaWAN().equals(this.getLoRaWAN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWirelessDeviceRequest clone() {
        return (CreateWirelessDeviceRequest) super.clone();
    }

}
