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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a detector's configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AnomalyDetectorConfigSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyDetectorConfigSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The interval at which the detector analyzes its source data.
     * </p>
     */
    private String anomalyDetectorFrequency;

    /**
     * <p>
     * The interval at which the detector analyzes its source data.
     * </p>
     * 
     * @param anomalyDetectorFrequency
     *        The interval at which the detector analyzes its source data.
     * @see Frequency
     */

    public void setAnomalyDetectorFrequency(String anomalyDetectorFrequency) {
        this.anomalyDetectorFrequency = anomalyDetectorFrequency;
    }

    /**
     * <p>
     * The interval at which the detector analyzes its source data.
     * </p>
     * 
     * @return The interval at which the detector analyzes its source data.
     * @see Frequency
     */

    public String getAnomalyDetectorFrequency() {
        return this.anomalyDetectorFrequency;
    }

    /**
     * <p>
     * The interval at which the detector analyzes its source data.
     * </p>
     * 
     * @param anomalyDetectorFrequency
     *        The interval at which the detector analyzes its source data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public AnomalyDetectorConfigSummary withAnomalyDetectorFrequency(String anomalyDetectorFrequency) {
        setAnomalyDetectorFrequency(anomalyDetectorFrequency);
        return this;
    }

    /**
     * <p>
     * The interval at which the detector analyzes its source data.
     * </p>
     * 
     * @param anomalyDetectorFrequency
     *        The interval at which the detector analyzes its source data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public AnomalyDetectorConfigSummary withAnomalyDetectorFrequency(Frequency anomalyDetectorFrequency) {
        this.anomalyDetectorFrequency = anomalyDetectorFrequency.toString();
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
        if (getAnomalyDetectorFrequency() != null)
            sb.append("AnomalyDetectorFrequency: ").append(getAnomalyDetectorFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyDetectorConfigSummary == false)
            return false;
        AnomalyDetectorConfigSummary other = (AnomalyDetectorConfigSummary) obj;
        if (other.getAnomalyDetectorFrequency() == null ^ this.getAnomalyDetectorFrequency() == null)
            return false;
        if (other.getAnomalyDetectorFrequency() != null && other.getAnomalyDetectorFrequency().equals(this.getAnomalyDetectorFrequency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectorFrequency() == null) ? 0 : getAnomalyDetectorFrequency().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyDetectorConfigSummary clone() {
        try {
            return (AnomalyDetectorConfigSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AnomalyDetectorConfigSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
