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
package com.amazonaws.services.iotroborunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateWorker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String arn;

    private String id;

    private String fleet;

    private java.util.Date updatedAt;

    private String name;

    private String additionalTransientProperties;

    private String additionalFixedProperties;

    private Orientation orientation;

    private VendorProperties vendorProperties;

    private PositionCoordinates position;

    /**
     * @param arn
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * @return
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * @param arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param fleet
     */

    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    /**
     * @return
     */

    public String getFleet() {
        return this.fleet;
    }

    /**
     * @param fleet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerResult withFleet(String fleet) {
        setFleet(fleet);
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param additionalTransientProperties
     */

    public void setAdditionalTransientProperties(String additionalTransientProperties) {
        this.additionalTransientProperties = additionalTransientProperties;
    }

    /**
     * @return
     */

    public String getAdditionalTransientProperties() {
        return this.additionalTransientProperties;
    }

    /**
     * @param additionalTransientProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerResult withAdditionalTransientProperties(String additionalTransientProperties) {
        setAdditionalTransientProperties(additionalTransientProperties);
        return this;
    }

    /**
     * @param additionalFixedProperties
     */

    public void setAdditionalFixedProperties(String additionalFixedProperties) {
        this.additionalFixedProperties = additionalFixedProperties;
    }

    /**
     * @return
     */

    public String getAdditionalFixedProperties() {
        return this.additionalFixedProperties;
    }

    /**
     * @param additionalFixedProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerResult withAdditionalFixedProperties(String additionalFixedProperties) {
        setAdditionalFixedProperties(additionalFixedProperties);
        return this;
    }

    /**
     * @param orientation
     */

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    /**
     * @return
     */

    public Orientation getOrientation() {
        return this.orientation;
    }

    /**
     * @param orientation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerResult withOrientation(Orientation orientation) {
        setOrientation(orientation);
        return this;
    }

    /**
     * @param vendorProperties
     */

    public void setVendorProperties(VendorProperties vendorProperties) {
        this.vendorProperties = vendorProperties;
    }

    /**
     * @return
     */

    public VendorProperties getVendorProperties() {
        return this.vendorProperties;
    }

    /**
     * @param vendorProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerResult withVendorProperties(VendorProperties vendorProperties) {
        setVendorProperties(vendorProperties);
        return this;
    }

    /**
     * @param position
     */

    public void setPosition(PositionCoordinates position) {
        this.position = position;
    }

    /**
     * @return
     */

    public PositionCoordinates getPosition() {
        return this.position;
    }

    /**
     * @param position
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkerResult withPosition(PositionCoordinates position) {
        setPosition(position);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getFleet() != null)
            sb.append("Fleet: ").append(getFleet()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAdditionalTransientProperties() != null)
            sb.append("AdditionalTransientProperties: ").append(getAdditionalTransientProperties()).append(",");
        if (getAdditionalFixedProperties() != null)
            sb.append("AdditionalFixedProperties: ").append(getAdditionalFixedProperties()).append(",");
        if (getOrientation() != null)
            sb.append("Orientation: ").append(getOrientation()).append(",");
        if (getVendorProperties() != null)
            sb.append("VendorProperties: ").append(getVendorProperties()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkerResult == false)
            return false;
        UpdateWorkerResult other = (UpdateWorkerResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFleet() == null ^ this.getFleet() == null)
            return false;
        if (other.getFleet() != null && other.getFleet().equals(this.getFleet()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAdditionalTransientProperties() == null ^ this.getAdditionalTransientProperties() == null)
            return false;
        if (other.getAdditionalTransientProperties() != null
                && other.getAdditionalTransientProperties().equals(this.getAdditionalTransientProperties()) == false)
            return false;
        if (other.getAdditionalFixedProperties() == null ^ this.getAdditionalFixedProperties() == null)
            return false;
        if (other.getAdditionalFixedProperties() != null && other.getAdditionalFixedProperties().equals(this.getAdditionalFixedProperties()) == false)
            return false;
        if (other.getOrientation() == null ^ this.getOrientation() == null)
            return false;
        if (other.getOrientation() != null && other.getOrientation().equals(this.getOrientation()) == false)
            return false;
        if (other.getVendorProperties() == null ^ this.getVendorProperties() == null)
            return false;
        if (other.getVendorProperties() != null && other.getVendorProperties().equals(this.getVendorProperties()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFleet() == null) ? 0 : getFleet().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAdditionalTransientProperties() == null) ? 0 : getAdditionalTransientProperties().hashCode());
        hashCode = prime * hashCode + ((getAdditionalFixedProperties() == null) ? 0 : getAdditionalFixedProperties().hashCode());
        hashCode = prime * hashCode + ((getOrientation() == null) ? 0 : getOrientation().hashCode());
        hashCode = prime * hashCode + ((getVendorProperties() == null) ? 0 : getVendorProperties().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkerResult clone() {
        try {
            return (UpdateWorkerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
