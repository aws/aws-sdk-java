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
package com.amazonaws.services.elasticinference.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The offering for an Elastic Inference Accelerator type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/AcceleratorTypeOffering"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceleratorTypeOffering implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     */
    private String acceleratorType;
    /**
     * <p>
     * The location type for the offering. It can assume the following values: region: defines that the offering is at
     * the regional level. availability-zone: defines that the offering is at the availability zone level.
     * availability-zone-id: defines that the offering is at the availability zone level, defined by the availability
     * zone id.
     * </p>
     */
    private String locationType;
    /**
     * <p>
     * The location for the offering. It will return either the region, availability zone or availability zone id for
     * the offering depending on the locationType value.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @param acceleratorType
     *        The name of the Elastic Inference Accelerator type.
     */

    public void setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
    }

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @return The name of the Elastic Inference Accelerator type.
     */

    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * 
     * @param acceleratorType
     *        The name of the Elastic Inference Accelerator type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceleratorTypeOffering withAcceleratorType(String acceleratorType) {
        setAcceleratorType(acceleratorType);
        return this;
    }

    /**
     * <p>
     * The location type for the offering. It can assume the following values: region: defines that the offering is at
     * the regional level. availability-zone: defines that the offering is at the availability zone level.
     * availability-zone-id: defines that the offering is at the availability zone level, defined by the availability
     * zone id.
     * </p>
     * 
     * @param locationType
     *        The location type for the offering. It can assume the following values: region: defines that the offering
     *        is at the regional level. availability-zone: defines that the offering is at the availability zone level.
     *        availability-zone-id: defines that the offering is at the availability zone level, defined by the
     *        availability zone id.
     * @see LocationType
     */

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * <p>
     * The location type for the offering. It can assume the following values: region: defines that the offering is at
     * the regional level. availability-zone: defines that the offering is at the availability zone level.
     * availability-zone-id: defines that the offering is at the availability zone level, defined by the availability
     * zone id.
     * </p>
     * 
     * @return The location type for the offering. It can assume the following values: region: defines that the offering
     *         is at the regional level. availability-zone: defines that the offering is at the availability zone level.
     *         availability-zone-id: defines that the offering is at the availability zone level, defined by the
     *         availability zone id.
     * @see LocationType
     */

    public String getLocationType() {
        return this.locationType;
    }

    /**
     * <p>
     * The location type for the offering. It can assume the following values: region: defines that the offering is at
     * the regional level. availability-zone: defines that the offering is at the availability zone level.
     * availability-zone-id: defines that the offering is at the availability zone level, defined by the availability
     * zone id.
     * </p>
     * 
     * @param locationType
     *        The location type for the offering. It can assume the following values: region: defines that the offering
     *        is at the regional level. availability-zone: defines that the offering is at the availability zone level.
     *        availability-zone-id: defines that the offering is at the availability zone level, defined by the
     *        availability zone id.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationType
     */

    public AcceleratorTypeOffering withLocationType(String locationType) {
        setLocationType(locationType);
        return this;
    }

    /**
     * <p>
     * The location type for the offering. It can assume the following values: region: defines that the offering is at
     * the regional level. availability-zone: defines that the offering is at the availability zone level.
     * availability-zone-id: defines that the offering is at the availability zone level, defined by the availability
     * zone id.
     * </p>
     * 
     * @param locationType
     *        The location type for the offering. It can assume the following values: region: defines that the offering
     *        is at the regional level. availability-zone: defines that the offering is at the availability zone level.
     *        availability-zone-id: defines that the offering is at the availability zone level, defined by the
     *        availability zone id.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationType
     */

    public AcceleratorTypeOffering withLocationType(LocationType locationType) {
        this.locationType = locationType.toString();
        return this;
    }

    /**
     * <p>
     * The location for the offering. It will return either the region, availability zone or availability zone id for
     * the offering depending on the locationType value.
     * </p>
     * 
     * @param location
     *        The location for the offering. It will return either the region, availability zone or availability zone id
     *        for the offering depending on the locationType value.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location for the offering. It will return either the region, availability zone or availability zone id for
     * the offering depending on the locationType value.
     * </p>
     * 
     * @return The location for the offering. It will return either the region, availability zone or availability zone
     *         id for the offering depending on the locationType value.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location for the offering. It will return either the region, availability zone or availability zone id for
     * the offering depending on the locationType value.
     * </p>
     * 
     * @param location
     *        The location for the offering. It will return either the region, availability zone or availability zone id
     *        for the offering depending on the locationType value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceleratorTypeOffering withLocation(String location) {
        setLocation(location);
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
        if (getAcceleratorType() != null)
            sb.append("AcceleratorType: ").append(getAcceleratorType()).append(",");
        if (getLocationType() != null)
            sb.append("LocationType: ").append(getLocationType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceleratorTypeOffering == false)
            return false;
        AcceleratorTypeOffering other = (AcceleratorTypeOffering) obj;
        if (other.getAcceleratorType() == null ^ this.getAcceleratorType() == null)
            return false;
        if (other.getAcceleratorType() != null && other.getAcceleratorType().equals(this.getAcceleratorType()) == false)
            return false;
        if (other.getLocationType() == null ^ this.getLocationType() == null)
            return false;
        if (other.getLocationType() != null && other.getLocationType().equals(this.getLocationType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorType() == null) ? 0 : getAcceleratorType().hashCode());
        hashCode = prime * hashCode + ((getLocationType() == null) ? 0 : getLocationType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public AcceleratorTypeOffering clone() {
        try {
            return (AcceleratorTypeOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticinference.model.transform.AcceleratorTypeOfferingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
