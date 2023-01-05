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
 * The processing configuration for the given transform property. You can configure transforms to be kept at the edge or
 * forwarded to the Amazon Web Services Cloud. You can also configure transforms to be computed at the edge or in the
 * cloud.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/TransformProcessingConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformProcessingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The compute location for the given transform property.
     * </p>
     */
    private String computeLocation;

    private ForwardingConfig forwardingConfig;

    /**
     * <p>
     * The compute location for the given transform property.
     * </p>
     * 
     * @param computeLocation
     *        The compute location for the given transform property.
     * @see ComputeLocation
     */

    public void setComputeLocation(String computeLocation) {
        this.computeLocation = computeLocation;
    }

    /**
     * <p>
     * The compute location for the given transform property.
     * </p>
     * 
     * @return The compute location for the given transform property.
     * @see ComputeLocation
     */

    public String getComputeLocation() {
        return this.computeLocation;
    }

    /**
     * <p>
     * The compute location for the given transform property.
     * </p>
     * 
     * @param computeLocation
     *        The compute location for the given transform property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeLocation
     */

    public TransformProcessingConfig withComputeLocation(String computeLocation) {
        setComputeLocation(computeLocation);
        return this;
    }

    /**
     * <p>
     * The compute location for the given transform property.
     * </p>
     * 
     * @param computeLocation
     *        The compute location for the given transform property.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeLocation
     */

    public TransformProcessingConfig withComputeLocation(ComputeLocation computeLocation) {
        this.computeLocation = computeLocation.toString();
        return this;
    }

    /**
     * @param forwardingConfig
     */

    public void setForwardingConfig(ForwardingConfig forwardingConfig) {
        this.forwardingConfig = forwardingConfig;
    }

    /**
     * @return
     */

    public ForwardingConfig getForwardingConfig() {
        return this.forwardingConfig;
    }

    /**
     * @param forwardingConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformProcessingConfig withForwardingConfig(ForwardingConfig forwardingConfig) {
        setForwardingConfig(forwardingConfig);
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
            sb.append("ComputeLocation: ").append(getComputeLocation()).append(",");
        if (getForwardingConfig() != null)
            sb.append("ForwardingConfig: ").append(getForwardingConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformProcessingConfig == false)
            return false;
        TransformProcessingConfig other = (TransformProcessingConfig) obj;
        if (other.getComputeLocation() == null ^ this.getComputeLocation() == null)
            return false;
        if (other.getComputeLocation() != null && other.getComputeLocation().equals(this.getComputeLocation()) == false)
            return false;
        if (other.getForwardingConfig() == null ^ this.getForwardingConfig() == null)
            return false;
        if (other.getForwardingConfig() != null && other.getForwardingConfig().equals(this.getForwardingConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputeLocation() == null) ? 0 : getComputeLocation().hashCode());
        hashCode = prime * hashCode + ((getForwardingConfig() == null) ? 0 : getForwardingConfig().hashCode());
        return hashCode;
    }

    @Override
    public TransformProcessingConfig clone() {
        try {
            return (TransformProcessingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.TransformProcessingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
