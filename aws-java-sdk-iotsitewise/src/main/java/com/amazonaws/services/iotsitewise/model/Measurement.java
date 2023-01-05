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
 * Contains an asset measurement property. For more information, see <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#measurements">Measurements</a>
 * in the <i>IoT SiteWise User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Measurement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Measurement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The processing configuration for the given measurement property. You can configure measurements to be kept at the
     * edge or forwarded to the Amazon Web Services Cloud. By default, measurements are forwarded to the cloud.
     * </p>
     */
    private MeasurementProcessingConfig processingConfig;

    /**
     * <p>
     * The processing configuration for the given measurement property. You can configure measurements to be kept at the
     * edge or forwarded to the Amazon Web Services Cloud. By default, measurements are forwarded to the cloud.
     * </p>
     * 
     * @param processingConfig
     *        The processing configuration for the given measurement property. You can configure measurements to be kept
     *        at the edge or forwarded to the Amazon Web Services Cloud. By default, measurements are forwarded to the
     *        cloud.
     */

    public void setProcessingConfig(MeasurementProcessingConfig processingConfig) {
        this.processingConfig = processingConfig;
    }

    /**
     * <p>
     * The processing configuration for the given measurement property. You can configure measurements to be kept at the
     * edge or forwarded to the Amazon Web Services Cloud. By default, measurements are forwarded to the cloud.
     * </p>
     * 
     * @return The processing configuration for the given measurement property. You can configure measurements to be
     *         kept at the edge or forwarded to the Amazon Web Services Cloud. By default, measurements are forwarded to
     *         the cloud.
     */

    public MeasurementProcessingConfig getProcessingConfig() {
        return this.processingConfig;
    }

    /**
     * <p>
     * The processing configuration for the given measurement property. You can configure measurements to be kept at the
     * edge or forwarded to the Amazon Web Services Cloud. By default, measurements are forwarded to the cloud.
     * </p>
     * 
     * @param processingConfig
     *        The processing configuration for the given measurement property. You can configure measurements to be kept
     *        at the edge or forwarded to the Amazon Web Services Cloud. By default, measurements are forwarded to the
     *        cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Measurement withProcessingConfig(MeasurementProcessingConfig processingConfig) {
        setProcessingConfig(processingConfig);
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
        if (getProcessingConfig() != null)
            sb.append("ProcessingConfig: ").append(getProcessingConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Measurement == false)
            return false;
        Measurement other = (Measurement) obj;
        if (other.getProcessingConfig() == null ^ this.getProcessingConfig() == null)
            return false;
        if (other.getProcessingConfig() != null && other.getProcessingConfig().equals(this.getProcessingConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessingConfig() == null) ? 0 : getProcessingConfig().hashCode());
        return hashCode;
    }

    @Override
    public Measurement clone() {
        try {
            return (Measurement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.MeasurementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
