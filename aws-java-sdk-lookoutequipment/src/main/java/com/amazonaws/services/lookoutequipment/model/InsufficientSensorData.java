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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Entity that comprises aggregated information on sensors having insufficient data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/InsufficientSensorData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsufficientSensorData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameter that describes the total number of sensors that have data completely missing for it.
     * </p>
     */
    private MissingCompleteSensorData missingCompleteSensorData;
    /**
     * <p>
     * Parameter that describes the total number of sensors that have a short date range of less than 90 days of data
     * overall.
     * </p>
     */
    private SensorsWithShortDateRange sensorsWithShortDateRange;

    /**
     * <p>
     * Parameter that describes the total number of sensors that have data completely missing for it.
     * </p>
     * 
     * @param missingCompleteSensorData
     *        Parameter that describes the total number of sensors that have data completely missing for it.
     */

    public void setMissingCompleteSensorData(MissingCompleteSensorData missingCompleteSensorData) {
        this.missingCompleteSensorData = missingCompleteSensorData;
    }

    /**
     * <p>
     * Parameter that describes the total number of sensors that have data completely missing for it.
     * </p>
     * 
     * @return Parameter that describes the total number of sensors that have data completely missing for it.
     */

    public MissingCompleteSensorData getMissingCompleteSensorData() {
        return this.missingCompleteSensorData;
    }

    /**
     * <p>
     * Parameter that describes the total number of sensors that have data completely missing for it.
     * </p>
     * 
     * @param missingCompleteSensorData
     *        Parameter that describes the total number of sensors that have data completely missing for it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsufficientSensorData withMissingCompleteSensorData(MissingCompleteSensorData missingCompleteSensorData) {
        setMissingCompleteSensorData(missingCompleteSensorData);
        return this;
    }

    /**
     * <p>
     * Parameter that describes the total number of sensors that have a short date range of less than 90 days of data
     * overall.
     * </p>
     * 
     * @param sensorsWithShortDateRange
     *        Parameter that describes the total number of sensors that have a short date range of less than 90 days of
     *        data overall.
     */

    public void setSensorsWithShortDateRange(SensorsWithShortDateRange sensorsWithShortDateRange) {
        this.sensorsWithShortDateRange = sensorsWithShortDateRange;
    }

    /**
     * <p>
     * Parameter that describes the total number of sensors that have a short date range of less than 90 days of data
     * overall.
     * </p>
     * 
     * @return Parameter that describes the total number of sensors that have a short date range of less than 90 days of
     *         data overall.
     */

    public SensorsWithShortDateRange getSensorsWithShortDateRange() {
        return this.sensorsWithShortDateRange;
    }

    /**
     * <p>
     * Parameter that describes the total number of sensors that have a short date range of less than 90 days of data
     * overall.
     * </p>
     * 
     * @param sensorsWithShortDateRange
     *        Parameter that describes the total number of sensors that have a short date range of less than 90 days of
     *        data overall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsufficientSensorData withSensorsWithShortDateRange(SensorsWithShortDateRange sensorsWithShortDateRange) {
        setSensorsWithShortDateRange(sensorsWithShortDateRange);
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
        if (getMissingCompleteSensorData() != null)
            sb.append("MissingCompleteSensorData: ").append(getMissingCompleteSensorData()).append(",");
        if (getSensorsWithShortDateRange() != null)
            sb.append("SensorsWithShortDateRange: ").append(getSensorsWithShortDateRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsufficientSensorData == false)
            return false;
        InsufficientSensorData other = (InsufficientSensorData) obj;
        if (other.getMissingCompleteSensorData() == null ^ this.getMissingCompleteSensorData() == null)
            return false;
        if (other.getMissingCompleteSensorData() != null && other.getMissingCompleteSensorData().equals(this.getMissingCompleteSensorData()) == false)
            return false;
        if (other.getSensorsWithShortDateRange() == null ^ this.getSensorsWithShortDateRange() == null)
            return false;
        if (other.getSensorsWithShortDateRange() != null && other.getSensorsWithShortDateRange().equals(this.getSensorsWithShortDateRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMissingCompleteSensorData() == null) ? 0 : getMissingCompleteSensorData().hashCode());
        hashCode = prime * hashCode + ((getSensorsWithShortDateRange() == null) ? 0 : getSensorsWithShortDateRange().hashCode());
        return hashCode;
    }

    @Override
    public InsufficientSensorData clone() {
        try {
            return (InsufficientSensorData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.InsufficientSensorDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
