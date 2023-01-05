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
 * DataQualitySummary gives aggregated statistics over all the sensors about a completed ingestion job. It primarily
 * gives more information about statistics over different incorrect data like MissingCompleteSensorData,
 * MissingSensorData, UnsupportedDateFormats, InsufficientSensorData, DuplicateTimeStamps.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DataQualitySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualitySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameter that gives information about insufficient data for sensors in the dataset. This includes information
     * about those sensors that have complete data missing and those with a short date range.
     * </p>
     */
    private InsufficientSensorData insufficientSensorData;
    /**
     * <p>
     * Parameter that gives information about data that is missing over all the sensors in the input data.
     * </p>
     */
    private MissingSensorData missingSensorData;
    /**
     * <p>
     * Parameter that gives information about data that is invalid over all the sensors in the input data.
     * </p>
     */
    private InvalidSensorData invalidSensorData;
    /**
     * <p>
     * Parameter that gives information about unsupported timestamps in the input data.
     * </p>
     */
    private UnsupportedTimestamps unsupportedTimestamps;
    /**
     * <p>
     * Parameter that gives information about duplicate timestamps in the input data.
     * </p>
     */
    private DuplicateTimestamps duplicateTimestamps;

    /**
     * <p>
     * Parameter that gives information about insufficient data for sensors in the dataset. This includes information
     * about those sensors that have complete data missing and those with a short date range.
     * </p>
     * 
     * @param insufficientSensorData
     *        Parameter that gives information about insufficient data for sensors in the dataset. This includes
     *        information about those sensors that have complete data missing and those with a short date range.
     */

    public void setInsufficientSensorData(InsufficientSensorData insufficientSensorData) {
        this.insufficientSensorData = insufficientSensorData;
    }

    /**
     * <p>
     * Parameter that gives information about insufficient data for sensors in the dataset. This includes information
     * about those sensors that have complete data missing and those with a short date range.
     * </p>
     * 
     * @return Parameter that gives information about insufficient data for sensors in the dataset. This includes
     *         information about those sensors that have complete data missing and those with a short date range.
     */

    public InsufficientSensorData getInsufficientSensorData() {
        return this.insufficientSensorData;
    }

    /**
     * <p>
     * Parameter that gives information about insufficient data for sensors in the dataset. This includes information
     * about those sensors that have complete data missing and those with a short date range.
     * </p>
     * 
     * @param insufficientSensorData
     *        Parameter that gives information about insufficient data for sensors in the dataset. This includes
     *        information about those sensors that have complete data missing and those with a short date range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualitySummary withInsufficientSensorData(InsufficientSensorData insufficientSensorData) {
        setInsufficientSensorData(insufficientSensorData);
        return this;
    }

    /**
     * <p>
     * Parameter that gives information about data that is missing over all the sensors in the input data.
     * </p>
     * 
     * @param missingSensorData
     *        Parameter that gives information about data that is missing over all the sensors in the input data.
     */

    public void setMissingSensorData(MissingSensorData missingSensorData) {
        this.missingSensorData = missingSensorData;
    }

    /**
     * <p>
     * Parameter that gives information about data that is missing over all the sensors in the input data.
     * </p>
     * 
     * @return Parameter that gives information about data that is missing over all the sensors in the input data.
     */

    public MissingSensorData getMissingSensorData() {
        return this.missingSensorData;
    }

    /**
     * <p>
     * Parameter that gives information about data that is missing over all the sensors in the input data.
     * </p>
     * 
     * @param missingSensorData
     *        Parameter that gives information about data that is missing over all the sensors in the input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualitySummary withMissingSensorData(MissingSensorData missingSensorData) {
        setMissingSensorData(missingSensorData);
        return this;
    }

    /**
     * <p>
     * Parameter that gives information about data that is invalid over all the sensors in the input data.
     * </p>
     * 
     * @param invalidSensorData
     *        Parameter that gives information about data that is invalid over all the sensors in the input data.
     */

    public void setInvalidSensorData(InvalidSensorData invalidSensorData) {
        this.invalidSensorData = invalidSensorData;
    }

    /**
     * <p>
     * Parameter that gives information about data that is invalid over all the sensors in the input data.
     * </p>
     * 
     * @return Parameter that gives information about data that is invalid over all the sensors in the input data.
     */

    public InvalidSensorData getInvalidSensorData() {
        return this.invalidSensorData;
    }

    /**
     * <p>
     * Parameter that gives information about data that is invalid over all the sensors in the input data.
     * </p>
     * 
     * @param invalidSensorData
     *        Parameter that gives information about data that is invalid over all the sensors in the input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualitySummary withInvalidSensorData(InvalidSensorData invalidSensorData) {
        setInvalidSensorData(invalidSensorData);
        return this;
    }

    /**
     * <p>
     * Parameter that gives information about unsupported timestamps in the input data.
     * </p>
     * 
     * @param unsupportedTimestamps
     *        Parameter that gives information about unsupported timestamps in the input data.
     */

    public void setUnsupportedTimestamps(UnsupportedTimestamps unsupportedTimestamps) {
        this.unsupportedTimestamps = unsupportedTimestamps;
    }

    /**
     * <p>
     * Parameter that gives information about unsupported timestamps in the input data.
     * </p>
     * 
     * @return Parameter that gives information about unsupported timestamps in the input data.
     */

    public UnsupportedTimestamps getUnsupportedTimestamps() {
        return this.unsupportedTimestamps;
    }

    /**
     * <p>
     * Parameter that gives information about unsupported timestamps in the input data.
     * </p>
     * 
     * @param unsupportedTimestamps
     *        Parameter that gives information about unsupported timestamps in the input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualitySummary withUnsupportedTimestamps(UnsupportedTimestamps unsupportedTimestamps) {
        setUnsupportedTimestamps(unsupportedTimestamps);
        return this;
    }

    /**
     * <p>
     * Parameter that gives information about duplicate timestamps in the input data.
     * </p>
     * 
     * @param duplicateTimestamps
     *        Parameter that gives information about duplicate timestamps in the input data.
     */

    public void setDuplicateTimestamps(DuplicateTimestamps duplicateTimestamps) {
        this.duplicateTimestamps = duplicateTimestamps;
    }

    /**
     * <p>
     * Parameter that gives information about duplicate timestamps in the input data.
     * </p>
     * 
     * @return Parameter that gives information about duplicate timestamps in the input data.
     */

    public DuplicateTimestamps getDuplicateTimestamps() {
        return this.duplicateTimestamps;
    }

    /**
     * <p>
     * Parameter that gives information about duplicate timestamps in the input data.
     * </p>
     * 
     * @param duplicateTimestamps
     *        Parameter that gives information about duplicate timestamps in the input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualitySummary withDuplicateTimestamps(DuplicateTimestamps duplicateTimestamps) {
        setDuplicateTimestamps(duplicateTimestamps);
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
        if (getInsufficientSensorData() != null)
            sb.append("InsufficientSensorData: ").append(getInsufficientSensorData()).append(",");
        if (getMissingSensorData() != null)
            sb.append("MissingSensorData: ").append(getMissingSensorData()).append(",");
        if (getInvalidSensorData() != null)
            sb.append("InvalidSensorData: ").append(getInvalidSensorData()).append(",");
        if (getUnsupportedTimestamps() != null)
            sb.append("UnsupportedTimestamps: ").append(getUnsupportedTimestamps()).append(",");
        if (getDuplicateTimestamps() != null)
            sb.append("DuplicateTimestamps: ").append(getDuplicateTimestamps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualitySummary == false)
            return false;
        DataQualitySummary other = (DataQualitySummary) obj;
        if (other.getInsufficientSensorData() == null ^ this.getInsufficientSensorData() == null)
            return false;
        if (other.getInsufficientSensorData() != null && other.getInsufficientSensorData().equals(this.getInsufficientSensorData()) == false)
            return false;
        if (other.getMissingSensorData() == null ^ this.getMissingSensorData() == null)
            return false;
        if (other.getMissingSensorData() != null && other.getMissingSensorData().equals(this.getMissingSensorData()) == false)
            return false;
        if (other.getInvalidSensorData() == null ^ this.getInvalidSensorData() == null)
            return false;
        if (other.getInvalidSensorData() != null && other.getInvalidSensorData().equals(this.getInvalidSensorData()) == false)
            return false;
        if (other.getUnsupportedTimestamps() == null ^ this.getUnsupportedTimestamps() == null)
            return false;
        if (other.getUnsupportedTimestamps() != null && other.getUnsupportedTimestamps().equals(this.getUnsupportedTimestamps()) == false)
            return false;
        if (other.getDuplicateTimestamps() == null ^ this.getDuplicateTimestamps() == null)
            return false;
        if (other.getDuplicateTimestamps() != null && other.getDuplicateTimestamps().equals(this.getDuplicateTimestamps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsufficientSensorData() == null) ? 0 : getInsufficientSensorData().hashCode());
        hashCode = prime * hashCode + ((getMissingSensorData() == null) ? 0 : getMissingSensorData().hashCode());
        hashCode = prime * hashCode + ((getInvalidSensorData() == null) ? 0 : getInvalidSensorData().hashCode());
        hashCode = prime * hashCode + ((getUnsupportedTimestamps() == null) ? 0 : getUnsupportedTimestamps().hashCode());
        hashCode = prime * hashCode + ((getDuplicateTimestamps() == null) ? 0 : getDuplicateTimestamps().hashCode());
        return hashCode;
    }

    @Override
    public DataQualitySummary clone() {
        try {
            return (DataQualitySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.DataQualitySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
