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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The processing configuration for the given metric property. You can configure metrics to be computed at the edge or
 * in the Amazon Web Services Cloud. By default, metrics are forwarded to the cloud.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/MetricProcessingConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricProcessingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The compute location for the given metric property.
     * </p>
     */
    private String computeLocation;

    /**
     * <p>
     * The compute location for the given metric property.
     * </p>
     * 
     * @param computeLocation
     *        The compute location for the given metric property.
     * @see ComputeLocation
     */

    public void setComputeLocation(String computeLocation) {
        this.computeLocation = computeLocation;
    }

    /**
     * <p>
     * The compute location for the given metric property.
     * </p>
     * 
     * @return The compute location for the given metric property.
     * @see ComputeLocation
     */

    public String getComputeLocation() {
        return this.computeLocation;
    }

    /**
     * <p>
     * The compute location for the given metric property.
     * </p>
     * 
     * @param computeLocation
     *        The compute location for the given metric property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeLocation
     */

    public MetricProcessingConfig withComputeLocation(String computeLocation) {
        setComputeLocation(computeLocation);
        return this;
    }

    /**
     * <p>
     * The compute location for the given metric property.
     * </p>
     * 
     * @param computeLocation
     *        The compute location for the given metric property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeLocation
     */

    public MetricProcessingConfig withComputeLocation(ComputeLocation computeLocation) {
        this.computeLocation = computeLocation.toString();
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
        if (getComputeLocation() != null)
            sb.append("ComputeLocation: ").append(getComputeLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricProcessingConfig == false)
            return false;
        MetricProcessingConfig other = (MetricProcessingConfig) obj;
        if (other.getComputeLocation() == null ^ this.getComputeLocation() == null)
            return false;
        if (other.getComputeLocation() != null && other.getComputeLocation().equals(this.getComputeLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputeLocation() == null) ? 0 : getComputeLocation().hashCode());
        return hashCode;
    }

    @Override
    public MetricProcessingConfig clone() {
        try {
            return (MetricProcessingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.MetricProcessingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
