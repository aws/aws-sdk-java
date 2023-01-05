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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateWorker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientToken;

    private String name;

    private String fleet;

    private String additionalTransientProperties;

    private String additionalFixedProperties;

    private VendorProperties vendorProperties;

    private PositionCoordinates position;

    private Orientation orientation;

    /**
     * @param clientToken
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * @return
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @param clientToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateWorkerRequest withName(String name) {
        setName(name);
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

    public CreateWorkerRequest withFleet(String fleet) {
        setFleet(fleet);
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

    public CreateWorkerRequest withAdditionalTransientProperties(String additionalTransientProperties) {
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

    public CreateWorkerRequest withAdditionalFixedProperties(String additionalFixedProperties) {
        setAdditionalFixedProperties(additionalFixedProperties);
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

    public CreateWorkerRequest withVendorProperties(VendorProperties vendorProperties) {
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

    public CreateWorkerRequest withPosition(PositionCoordinates position) {
        setPosition(position);
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

    public CreateWorkerRequest withOrientation(Orientation orientation) {
        setOrientation(orientation);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFleet() != null)
            sb.append("Fleet: ").append(getFleet()).append(",");
        if (getAdditionalTransientProperties() != null)
            sb.append("AdditionalTransientProperties: ").append(getAdditionalTransientProperties()).append(",");
        if (getAdditionalFixedProperties() != null)
            sb.append("AdditionalFixedProperties: ").append(getAdditionalFixedProperties()).append(",");
        if (getVendorProperties() != null)
            sb.append("VendorProperties: ").append(getVendorProperties()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getOrientation() != null)
            sb.append("Orientation: ").append(getOrientation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkerRequest == false)
            return false;
        CreateWorkerRequest other = (CreateWorkerRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFleet() == null ^ this.getFleet() == null)
            return false;
        if (other.getFleet() != null && other.getFleet().equals(this.getFleet()) == false)
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
        if (other.getVendorProperties() == null ^ this.getVendorProperties() == null)
            return false;
        if (other.getVendorProperties() != null && other.getVendorProperties().equals(this.getVendorProperties()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getOrientation() == null ^ this.getOrientation() == null)
            return false;
        if (other.getOrientation() != null && other.getOrientation().equals(this.getOrientation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFleet() == null) ? 0 : getFleet().hashCode());
        hashCode = prime * hashCode + ((getAdditionalTransientProperties() == null) ? 0 : getAdditionalTransientProperties().hashCode());
        hashCode = prime * hashCode + ((getAdditionalFixedProperties() == null) ? 0 : getAdditionalFixedProperties().hashCode());
        hashCode = prime * hashCode + ((getVendorProperties() == null) ? 0 : getVendorProperties().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getOrientation() == null) ? 0 : getOrientation().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkerRequest clone() {
        return (CreateWorkerRequest) super.clone();
    }

}
