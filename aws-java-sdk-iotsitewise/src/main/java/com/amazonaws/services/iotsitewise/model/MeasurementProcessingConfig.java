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
 * The processing configuration for the given measurement property. You can configure measurements to be kept at the
 * edge or forwarded to the Amazon Web Services Cloud. By default, measurements are forwarded to the cloud.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/MeasurementProcessingConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeasurementProcessingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The forwarding configuration for the given measurement property.
     * </p>
     */
    private ForwardingConfig forwardingConfig;

    /**
     * <p>
     * The forwarding configuration for the given measurement property.
     * </p>
     * 
     * @param forwardingConfig
     *        The forwarding configuration for the given measurement property.
     */

    public void setForwardingConfig(ForwardingConfig forwardingConfig) {
        this.forwardingConfig = forwardingConfig;
    }

    /**
     * <p>
     * The forwarding configuration for the given measurement property.
     * </p>
     * 
     * @return The forwarding configuration for the given measurement property.
     */

    public ForwardingConfig getForwardingConfig() {
        return this.forwardingConfig;
    }

    /**
     * <p>
     * The forwarding configuration for the given measurement property.
     * </p>
     * 
     * @param forwardingConfig
     *        The forwarding configuration for the given measurement property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeasurementProcessingConfig withForwardingConfig(ForwardingConfig forwardingConfig) {
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

        if (obj instanceof MeasurementProcessingConfig == false)
            return false;
        MeasurementProcessingConfig other = (MeasurementProcessingConfig) obj;
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

        hashCode = prime * hashCode + ((getForwardingConfig() == null) ? 0 : getForwardingConfig().hashCode());
        return hashCode;
    }

    @Override
    public MeasurementProcessingConfig clone() {
        try {
            return (MeasurementProcessingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.MeasurementProcessingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
