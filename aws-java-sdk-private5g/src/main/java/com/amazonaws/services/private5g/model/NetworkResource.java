/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a network resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/NetworkResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attributes of the network resource.
     * </p>
     */
    private java.util.List<NameValuePair> attributes;
    /**
     * <p>
     * The creation time of the network resource.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the network resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The health of the network resource.
     * </p>
     */
    private String health;
    /**
     * <p>
     * The model of the network resource.
     * </p>
     */
    private String model;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network on which this network resource appears.
     * </p>
     */
    private String networkArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     */
    private String networkResourceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site on which this network resource appears.
     * </p>
     */
    private String networkSiteArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order used to purchase this network resource.
     * </p>
     */
    private String orderArn;
    /**
     * <p>
     * The position of the network resource.
     * </p>
     */
    private Position position;
    /**
     * <p>
     * The serial number of the network resource.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The status of the network resource.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status reason of the network resource.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The type of the network resource.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The vendor of the network resource.
     * </p>
     */
    private String vendor;

    /**
     * <p>
     * The attributes of the network resource.
     * </p>
     * 
     * @return The attributes of the network resource.
     */

    public java.util.List<NameValuePair> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes of the network resource.
     * </p>
     * 
     * @param attributes
     *        The attributes of the network resource.
     */

    public void setAttributes(java.util.Collection<NameValuePair> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<NameValuePair>(attributes);
    }

    /**
     * <p>
     * The attributes of the network resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The attributes of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withAttributes(NameValuePair... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<NameValuePair>(attributes.length));
        }
        for (NameValuePair ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes of the network resource.
     * </p>
     * 
     * @param attributes
     *        The attributes of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withAttributes(java.util.Collection<NameValuePair> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The creation time of the network resource.
     * </p>
     * 
     * @param createdAt
     *        The creation time of the network resource.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The creation time of the network resource.
     * </p>
     * 
     * @return The creation time of the network resource.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The creation time of the network resource.
     * </p>
     * 
     * @param createdAt
     *        The creation time of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the network resource.
     * </p>
     * 
     * @param description
     *        The description of the network resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the network resource.
     * </p>
     * 
     * @return The description of the network resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the network resource.
     * </p>
     * 
     * @param description
     *        The description of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The health of the network resource.
     * </p>
     * 
     * @param health
     *        The health of the network resource.
     * @see HealthStatus
     */

    public void setHealth(String health) {
        this.health = health;
    }

    /**
     * <p>
     * The health of the network resource.
     * </p>
     * 
     * @return The health of the network resource.
     * @see HealthStatus
     */

    public String getHealth() {
        return this.health;
    }

    /**
     * <p>
     * The health of the network resource.
     * </p>
     * 
     * @param health
     *        The health of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatus
     */

    public NetworkResource withHealth(String health) {
        setHealth(health);
        return this;
    }

    /**
     * <p>
     * The health of the network resource.
     * </p>
     * 
     * @param health
     *        The health of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatus
     */

    public NetworkResource withHealth(HealthStatus health) {
        this.health = health.toString();
        return this;
    }

    /**
     * <p>
     * The model of the network resource.
     * </p>
     * 
     * @param model
     *        The model of the network resource.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The model of the network resource.
     * </p>
     * 
     * @return The model of the network resource.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The model of the network resource.
     * </p>
     * 
     * @param model
     *        The model of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network on which this network resource appears.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network on which this network resource appears.
     */

    public void setNetworkArn(String networkArn) {
        this.networkArn = networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network on which this network resource appears.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network on which this network resource appears.
     */

    public String getNetworkArn() {
        return this.networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network on which this network resource appears.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network on which this network resource appears.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withNetworkArn(String networkArn) {
        setNetworkArn(networkArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     * 
     * @param networkResourceArn
     *        The Amazon Resource Name (ARN) of the network resource.
     */

    public void setNetworkResourceArn(String networkResourceArn) {
        this.networkResourceArn = networkResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network resource.
     */

    public String getNetworkResourceArn() {
        return this.networkResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     * 
     * @param networkResourceArn
     *        The Amazon Resource Name (ARN) of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withNetworkResourceArn(String networkResourceArn) {
        setNetworkResourceArn(networkResourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site on which this network resource appears.
     * </p>
     * 
     * @param networkSiteArn
     *        The Amazon Resource Name (ARN) of the network site on which this network resource appears.
     */

    public void setNetworkSiteArn(String networkSiteArn) {
        this.networkSiteArn = networkSiteArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site on which this network resource appears.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network site on which this network resource appears.
     */

    public String getNetworkSiteArn() {
        return this.networkSiteArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site on which this network resource appears.
     * </p>
     * 
     * @param networkSiteArn
     *        The Amazon Resource Name (ARN) of the network site on which this network resource appears.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withNetworkSiteArn(String networkSiteArn) {
        setNetworkSiteArn(networkSiteArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order used to purchase this network resource.
     * </p>
     * 
     * @param orderArn
     *        The Amazon Resource Name (ARN) of the order used to purchase this network resource.
     */

    public void setOrderArn(String orderArn) {
        this.orderArn = orderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order used to purchase this network resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the order used to purchase this network resource.
     */

    public String getOrderArn() {
        return this.orderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order used to purchase this network resource.
     * </p>
     * 
     * @param orderArn
     *        The Amazon Resource Name (ARN) of the order used to purchase this network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withOrderArn(String orderArn) {
        setOrderArn(orderArn);
        return this;
    }

    /**
     * <p>
     * The position of the network resource.
     * </p>
     * 
     * @param position
     *        The position of the network resource.
     */

    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * <p>
     * The position of the network resource.
     * </p>
     * 
     * @return The position of the network resource.
     */

    public Position getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The position of the network resource.
     * </p>
     * 
     * @param position
     *        The position of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withPosition(Position position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The serial number of the network resource.
     * </p>
     * 
     * @param serialNumber
     *        The serial number of the network resource.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number of the network resource.
     * </p>
     * 
     * @return The serial number of the network resource.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The serial number of the network resource.
     * </p>
     * 
     * @param serialNumber
     *        The serial number of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The status of the network resource.
     * </p>
     * 
     * @param status
     *        The status of the network resource.
     * @see NetworkResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the network resource.
     * </p>
     * 
     * @return The status of the network resource.
     * @see NetworkResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the network resource.
     * </p>
     * 
     * @param status
     *        The status of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkResourceStatus
     */

    public NetworkResource withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the network resource.
     * </p>
     * 
     * @param status
     *        The status of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkResourceStatus
     */

    public NetworkResource withStatus(NetworkResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status reason of the network resource.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the network resource.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the network resource.
     * </p>
     * 
     * @return The status reason of the network resource.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the network resource.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The type of the network resource.
     * </p>
     * 
     * @param type
     *        The type of the network resource.
     * @see NetworkResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the network resource.
     * </p>
     * 
     * @return The type of the network resource.
     * @see NetworkResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the network resource.
     * </p>
     * 
     * @param type
     *        The type of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkResourceType
     */

    public NetworkResource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the network resource.
     * </p>
     * 
     * @param type
     *        The type of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkResourceType
     */

    public NetworkResource withType(NetworkResourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The vendor of the network resource.
     * </p>
     * 
     * @param vendor
     *        The vendor of the network resource.
     */

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * The vendor of the network resource.
     * </p>
     * 
     * @return The vendor of the network resource.
     */

    public String getVendor() {
        return this.vendor;
    }

    /**
     * <p>
     * The vendor of the network resource.
     * </p>
     * 
     * @param vendor
     *        The vendor of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withVendor(String vendor) {
        setVendor(vendor);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHealth() != null)
            sb.append("Health: ").append(getHealth()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getNetworkArn() != null)
            sb.append("NetworkArn: ").append(getNetworkArn()).append(",");
        if (getNetworkResourceArn() != null)
            sb.append("NetworkResourceArn: ").append(getNetworkResourceArn()).append(",");
        if (getNetworkSiteArn() != null)
            sb.append("NetworkSiteArn: ").append(getNetworkSiteArn()).append(",");
        if (getOrderArn() != null)
            sb.append("OrderArn: ").append(getOrderArn()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVendor() != null)
            sb.append("Vendor: ").append(getVendor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkResource == false)
            return false;
        NetworkResource other = (NetworkResource) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHealth() == null ^ this.getHealth() == null)
            return false;
        if (other.getHealth() != null && other.getHealth().equals(this.getHealth()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getNetworkArn() == null ^ this.getNetworkArn() == null)
            return false;
        if (other.getNetworkArn() != null && other.getNetworkArn().equals(this.getNetworkArn()) == false)
            return false;
        if (other.getNetworkResourceArn() == null ^ this.getNetworkResourceArn() == null)
            return false;
        if (other.getNetworkResourceArn() != null && other.getNetworkResourceArn().equals(this.getNetworkResourceArn()) == false)
            return false;
        if (other.getNetworkSiteArn() == null ^ this.getNetworkSiteArn() == null)
            return false;
        if (other.getNetworkSiteArn() != null && other.getNetworkSiteArn().equals(this.getNetworkSiteArn()) == false)
            return false;
        if (other.getOrderArn() == null ^ this.getOrderArn() == null)
            return false;
        if (other.getOrderArn() != null && other.getOrderArn().equals(this.getOrderArn()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHealth() == null) ? 0 : getHealth().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getNetworkArn() == null) ? 0 : getNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkResourceArn() == null) ? 0 : getNetworkResourceArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkSiteArn() == null) ? 0 : getNetworkSiteArn().hashCode());
        hashCode = prime * hashCode + ((getOrderArn() == null) ? 0 : getOrderArn().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        return hashCode;
    }

    @Override
    public NetworkResource clone() {
        try {
            return (NetworkResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.NetworkResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
