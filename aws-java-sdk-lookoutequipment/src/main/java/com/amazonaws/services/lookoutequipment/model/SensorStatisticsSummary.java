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
 * Summary of ingestion statistics like whether data exists, number of missing values, number of invalid values and so
 * on related to the particular sensor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/SensorStatisticsSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SensorStatisticsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the component to which the particular sensor belongs for which the statistics belong to.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * Name of the sensor that the statistics belong to.
     * </p>
     */
    private String sensorName;
    /**
     * <p>
     * Parameter that indicates whether data exists for the sensor that the statistics belong to.
     * </p>
     */
    private Boolean dataExists;
    /**
     * <p>
     * Parameter that describes the total number of, and percentage of, values that are missing for the sensor that the
     * statistics belong to.
     * </p>
     */
    private CountPercent missingValues;
    /**
     * <p>
     * Parameter that describes the total number of, and percentage of, values that are invalid for the sensor that the
     * statistics belong to.
     * </p>
     */
    private CountPercent invalidValues;
    /**
     * <p>
     * Parameter that describes the total number of invalid date entries associated with the sensor that the statistics
     * belong to.
     * </p>
     */
    private CountPercent invalidDateEntries;
    /**
     * <p>
     * Parameter that describes the total number of duplicate timestamp records associated with the sensor that the
     * statistics belong to.
     * </p>
     */
    private CountPercent duplicateTimestamps;
    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor is categorical.
     * </p>
     */
    private CategoricalValues categoricalValues;
    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor has more than one operating
     * mode.
     * </p>
     */
    private MultipleOperatingModes multipleOperatingModes;
    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor contains one or more large
     * gaps between consecutive timestamps.
     * </p>
     */
    private LargeTimestampGaps largeTimestampGaps;
    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor is mostly monotonic.
     * </p>
     */
    private MonotonicValues monotonicValues;
    /**
     * <p>
     * Indicates the time reference to indicate the beginning of valid data associated with the sensor that the
     * statistics belong to.
     * </p>
     */
    private java.util.Date dataStartTime;
    /**
     * <p>
     * Indicates the time reference to indicate the end of valid data associated with the sensor that the statistics
     * belong to.
     * </p>
     */
    private java.util.Date dataEndTime;

    /**
     * <p>
     * Name of the component to which the particular sensor belongs for which the statistics belong to.
     * </p>
     * 
     * @param componentName
     *        Name of the component to which the particular sensor belongs for which the statistics belong to.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * Name of the component to which the particular sensor belongs for which the statistics belong to.
     * </p>
     * 
     * @return Name of the component to which the particular sensor belongs for which the statistics belong to.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * Name of the component to which the particular sensor belongs for which the statistics belong to.
     * </p>
     * 
     * @param componentName
     *        Name of the component to which the particular sensor belongs for which the statistics belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * Name of the sensor that the statistics belong to.
     * </p>
     * 
     * @param sensorName
     *        Name of the sensor that the statistics belong to.
     */

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    /**
     * <p>
     * Name of the sensor that the statistics belong to.
     * </p>
     * 
     * @return Name of the sensor that the statistics belong to.
     */

    public String getSensorName() {
        return this.sensorName;
    }

    /**
     * <p>
     * Name of the sensor that the statistics belong to.
     * </p>
     * 
     * @param sensorName
     *        Name of the sensor that the statistics belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withSensorName(String sensorName) {
        setSensorName(sensorName);
        return this;
    }

    /**
     * <p>
     * Parameter that indicates whether data exists for the sensor that the statistics belong to.
     * </p>
     * 
     * @param dataExists
     *        Parameter that indicates whether data exists for the sensor that the statistics belong to.
     */

    public void setDataExists(Boolean dataExists) {
        this.dataExists = dataExists;
    }

    /**
     * <p>
     * Parameter that indicates whether data exists for the sensor that the statistics belong to.
     * </p>
     * 
     * @return Parameter that indicates whether data exists for the sensor that the statistics belong to.
     */

    public Boolean getDataExists() {
        return this.dataExists;
    }

    /**
     * <p>
     * Parameter that indicates whether data exists for the sensor that the statistics belong to.
     * </p>
     * 
     * @param dataExists
     *        Parameter that indicates whether data exists for the sensor that the statistics belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withDataExists(Boolean dataExists) {
        setDataExists(dataExists);
        return this;
    }

    /**
     * <p>
     * Parameter that indicates whether data exists for the sensor that the statistics belong to.
     * </p>
     * 
     * @return Parameter that indicates whether data exists for the sensor that the statistics belong to.
     */

    public Boolean isDataExists() {
        return this.dataExists;
    }

    /**
     * <p>
     * Parameter that describes the total number of, and percentage of, values that are missing for the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @param missingValues
     *        Parameter that describes the total number of, and percentage of, values that are missing for the sensor
     *        that the statistics belong to.
     */

    public void setMissingValues(CountPercent missingValues) {
        this.missingValues = missingValues;
    }

    /**
     * <p>
     * Parameter that describes the total number of, and percentage of, values that are missing for the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @return Parameter that describes the total number of, and percentage of, values that are missing for the sensor
     *         that the statistics belong to.
     */

    public CountPercent getMissingValues() {
        return this.missingValues;
    }

    /**
     * <p>
     * Parameter that describes the total number of, and percentage of, values that are missing for the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @param missingValues
     *        Parameter that describes the total number of, and percentage of, values that are missing for the sensor
     *        that the statistics belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withMissingValues(CountPercent missingValues) {
        setMissingValues(missingValues);
        return this;
    }

    /**
     * <p>
     * Parameter that describes the total number of, and percentage of, values that are invalid for the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @param invalidValues
     *        Parameter that describes the total number of, and percentage of, values that are invalid for the sensor
     *        that the statistics belong to.
     */

    public void setInvalidValues(CountPercent invalidValues) {
        this.invalidValues = invalidValues;
    }

    /**
     * <p>
     * Parameter that describes the total number of, and percentage of, values that are invalid for the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @return Parameter that describes the total number of, and percentage of, values that are invalid for the sensor
     *         that the statistics belong to.
     */

    public CountPercent getInvalidValues() {
        return this.invalidValues;
    }

    /**
     * <p>
     * Parameter that describes the total number of, and percentage of, values that are invalid for the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @param invalidValues
     *        Parameter that describes the total number of, and percentage of, values that are invalid for the sensor
     *        that the statistics belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withInvalidValues(CountPercent invalidValues) {
        setInvalidValues(invalidValues);
        return this;
    }

    /**
     * <p>
     * Parameter that describes the total number of invalid date entries associated with the sensor that the statistics
     * belong to.
     * </p>
     * 
     * @param invalidDateEntries
     *        Parameter that describes the total number of invalid date entries associated with the sensor that the
     *        statistics belong to.
     */

    public void setInvalidDateEntries(CountPercent invalidDateEntries) {
        this.invalidDateEntries = invalidDateEntries;
    }

    /**
     * <p>
     * Parameter that describes the total number of invalid date entries associated with the sensor that the statistics
     * belong to.
     * </p>
     * 
     * @return Parameter that describes the total number of invalid date entries associated with the sensor that the
     *         statistics belong to.
     */

    public CountPercent getInvalidDateEntries() {
        return this.invalidDateEntries;
    }

    /**
     * <p>
     * Parameter that describes the total number of invalid date entries associated with the sensor that the statistics
     * belong to.
     * </p>
     * 
     * @param invalidDateEntries
     *        Parameter that describes the total number of invalid date entries associated with the sensor that the
     *        statistics belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withInvalidDateEntries(CountPercent invalidDateEntries) {
        setInvalidDateEntries(invalidDateEntries);
        return this;
    }

    /**
     * <p>
     * Parameter that describes the total number of duplicate timestamp records associated with the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @param duplicateTimestamps
     *        Parameter that describes the total number of duplicate timestamp records associated with the sensor that
     *        the statistics belong to.
     */

    public void setDuplicateTimestamps(CountPercent duplicateTimestamps) {
        this.duplicateTimestamps = duplicateTimestamps;
    }

    /**
     * <p>
     * Parameter that describes the total number of duplicate timestamp records associated with the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @return Parameter that describes the total number of duplicate timestamp records associated with the sensor that
     *         the statistics belong to.
     */

    public CountPercent getDuplicateTimestamps() {
        return this.duplicateTimestamps;
    }

    /**
     * <p>
     * Parameter that describes the total number of duplicate timestamp records associated with the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @param duplicateTimestamps
     *        Parameter that describes the total number of duplicate timestamp records associated with the sensor that
     *        the statistics belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withDuplicateTimestamps(CountPercent duplicateTimestamps) {
        setDuplicateTimestamps(duplicateTimestamps);
        return this;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor is categorical.
     * </p>
     * 
     * @param categoricalValues
     *        Parameter that describes potential risk about whether data associated with the sensor is categorical.
     */

    public void setCategoricalValues(CategoricalValues categoricalValues) {
        this.categoricalValues = categoricalValues;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor is categorical.
     * </p>
     * 
     * @return Parameter that describes potential risk about whether data associated with the sensor is categorical.
     */

    public CategoricalValues getCategoricalValues() {
        return this.categoricalValues;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor is categorical.
     * </p>
     * 
     * @param categoricalValues
     *        Parameter that describes potential risk about whether data associated with the sensor is categorical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withCategoricalValues(CategoricalValues categoricalValues) {
        setCategoricalValues(categoricalValues);
        return this;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor has more than one operating
     * mode.
     * </p>
     * 
     * @param multipleOperatingModes
     *        Parameter that describes potential risk about whether data associated with the sensor has more than one
     *        operating mode.
     */

    public void setMultipleOperatingModes(MultipleOperatingModes multipleOperatingModes) {
        this.multipleOperatingModes = multipleOperatingModes;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor has more than one operating
     * mode.
     * </p>
     * 
     * @return Parameter that describes potential risk about whether data associated with the sensor has more than one
     *         operating mode.
     */

    public MultipleOperatingModes getMultipleOperatingModes() {
        return this.multipleOperatingModes;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor has more than one operating
     * mode.
     * </p>
     * 
     * @param multipleOperatingModes
     *        Parameter that describes potential risk about whether data associated with the sensor has more than one
     *        operating mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withMultipleOperatingModes(MultipleOperatingModes multipleOperatingModes) {
        setMultipleOperatingModes(multipleOperatingModes);
        return this;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor contains one or more large
     * gaps between consecutive timestamps.
     * </p>
     * 
     * @param largeTimestampGaps
     *        Parameter that describes potential risk about whether data associated with the sensor contains one or more
     *        large gaps between consecutive timestamps.
     */

    public void setLargeTimestampGaps(LargeTimestampGaps largeTimestampGaps) {
        this.largeTimestampGaps = largeTimestampGaps;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor contains one or more large
     * gaps between consecutive timestamps.
     * </p>
     * 
     * @return Parameter that describes potential risk about whether data associated with the sensor contains one or
     *         more large gaps between consecutive timestamps.
     */

    public LargeTimestampGaps getLargeTimestampGaps() {
        return this.largeTimestampGaps;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor contains one or more large
     * gaps between consecutive timestamps.
     * </p>
     * 
     * @param largeTimestampGaps
     *        Parameter that describes potential risk about whether data associated with the sensor contains one or more
     *        large gaps between consecutive timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withLargeTimestampGaps(LargeTimestampGaps largeTimestampGaps) {
        setLargeTimestampGaps(largeTimestampGaps);
        return this;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor is mostly monotonic.
     * </p>
     * 
     * @param monotonicValues
     *        Parameter that describes potential risk about whether data associated with the sensor is mostly monotonic.
     */

    public void setMonotonicValues(MonotonicValues monotonicValues) {
        this.monotonicValues = monotonicValues;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor is mostly monotonic.
     * </p>
     * 
     * @return Parameter that describes potential risk about whether data associated with the sensor is mostly
     *         monotonic.
     */

    public MonotonicValues getMonotonicValues() {
        return this.monotonicValues;
    }

    /**
     * <p>
     * Parameter that describes potential risk about whether data associated with the sensor is mostly monotonic.
     * </p>
     * 
     * @param monotonicValues
     *        Parameter that describes potential risk about whether data associated with the sensor is mostly monotonic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withMonotonicValues(MonotonicValues monotonicValues) {
        setMonotonicValues(monotonicValues);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference to indicate the beginning of valid data associated with the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @param dataStartTime
     *        Indicates the time reference to indicate the beginning of valid data associated with the sensor that the
     *        statistics belong to.
     */

    public void setDataStartTime(java.util.Date dataStartTime) {
        this.dataStartTime = dataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference to indicate the beginning of valid data associated with the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @return Indicates the time reference to indicate the beginning of valid data associated with the sensor that the
     *         statistics belong to.
     */

    public java.util.Date getDataStartTime() {
        return this.dataStartTime;
    }

    /**
     * <p>
     * Indicates the time reference to indicate the beginning of valid data associated with the sensor that the
     * statistics belong to.
     * </p>
     * 
     * @param dataStartTime
     *        Indicates the time reference to indicate the beginning of valid data associated with the sensor that the
     *        statistics belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withDataStartTime(java.util.Date dataStartTime) {
        setDataStartTime(dataStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time reference to indicate the end of valid data associated with the sensor that the statistics
     * belong to.
     * </p>
     * 
     * @param dataEndTime
     *        Indicates the time reference to indicate the end of valid data associated with the sensor that the
     *        statistics belong to.
     */

    public void setDataEndTime(java.util.Date dataEndTime) {
        this.dataEndTime = dataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference to indicate the end of valid data associated with the sensor that the statistics
     * belong to.
     * </p>
     * 
     * @return Indicates the time reference to indicate the end of valid data associated with the sensor that the
     *         statistics belong to.
     */

    public java.util.Date getDataEndTime() {
        return this.dataEndTime;
    }

    /**
     * <p>
     * Indicates the time reference to indicate the end of valid data associated with the sensor that the statistics
     * belong to.
     * </p>
     * 
     * @param dataEndTime
     *        Indicates the time reference to indicate the end of valid data associated with the sensor that the
     *        statistics belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensorStatisticsSummary withDataEndTime(java.util.Date dataEndTime) {
        setDataEndTime(dataEndTime);
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getSensorName() != null)
            sb.append("SensorName: ").append(getSensorName()).append(",");
        if (getDataExists() != null)
            sb.append("DataExists: ").append(getDataExists()).append(",");
        if (getMissingValues() != null)
            sb.append("MissingValues: ").append(getMissingValues()).append(",");
        if (getInvalidValues() != null)
            sb.append("InvalidValues: ").append(getInvalidValues()).append(",");
        if (getInvalidDateEntries() != null)
            sb.append("InvalidDateEntries: ").append(getInvalidDateEntries()).append(",");
        if (getDuplicateTimestamps() != null)
            sb.append("DuplicateTimestamps: ").append(getDuplicateTimestamps()).append(",");
        if (getCategoricalValues() != null)
            sb.append("CategoricalValues: ").append(getCategoricalValues()).append(",");
        if (getMultipleOperatingModes() != null)
            sb.append("MultipleOperatingModes: ").append(getMultipleOperatingModes()).append(",");
        if (getLargeTimestampGaps() != null)
            sb.append("LargeTimestampGaps: ").append(getLargeTimestampGaps()).append(",");
        if (getMonotonicValues() != null)
            sb.append("MonotonicValues: ").append(getMonotonicValues()).append(",");
        if (getDataStartTime() != null)
            sb.append("DataStartTime: ").append(getDataStartTime()).append(",");
        if (getDataEndTime() != null)
            sb.append("DataEndTime: ").append(getDataEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SensorStatisticsSummary == false)
            return false;
        SensorStatisticsSummary other = (SensorStatisticsSummary) obj;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getSensorName() == null ^ this.getSensorName() == null)
            return false;
        if (other.getSensorName() != null && other.getSensorName().equals(this.getSensorName()) == false)
            return false;
        if (other.getDataExists() == null ^ this.getDataExists() == null)
            return false;
        if (other.getDataExists() != null && other.getDataExists().equals(this.getDataExists()) == false)
            return false;
        if (other.getMissingValues() == null ^ this.getMissingValues() == null)
            return false;
        if (other.getMissingValues() != null && other.getMissingValues().equals(this.getMissingValues()) == false)
            return false;
        if (other.getInvalidValues() == null ^ this.getInvalidValues() == null)
            return false;
        if (other.getInvalidValues() != null && other.getInvalidValues().equals(this.getInvalidValues()) == false)
            return false;
        if (other.getInvalidDateEntries() == null ^ this.getInvalidDateEntries() == null)
            return false;
        if (other.getInvalidDateEntries() != null && other.getInvalidDateEntries().equals(this.getInvalidDateEntries()) == false)
            return false;
        if (other.getDuplicateTimestamps() == null ^ this.getDuplicateTimestamps() == null)
            return false;
        if (other.getDuplicateTimestamps() != null && other.getDuplicateTimestamps().equals(this.getDuplicateTimestamps()) == false)
            return false;
        if (other.getCategoricalValues() == null ^ this.getCategoricalValues() == null)
            return false;
        if (other.getCategoricalValues() != null && other.getCategoricalValues().equals(this.getCategoricalValues()) == false)
            return false;
        if (other.getMultipleOperatingModes() == null ^ this.getMultipleOperatingModes() == null)
            return false;
        if (other.getMultipleOperatingModes() != null && other.getMultipleOperatingModes().equals(this.getMultipleOperatingModes()) == false)
            return false;
        if (other.getLargeTimestampGaps() == null ^ this.getLargeTimestampGaps() == null)
            return false;
        if (other.getLargeTimestampGaps() != null && other.getLargeTimestampGaps().equals(this.getLargeTimestampGaps()) == false)
            return false;
        if (other.getMonotonicValues() == null ^ this.getMonotonicValues() == null)
            return false;
        if (other.getMonotonicValues() != null && other.getMonotonicValues().equals(this.getMonotonicValues()) == false)
            return false;
        if (other.getDataStartTime() == null ^ this.getDataStartTime() == null)
            return false;
        if (other.getDataStartTime() != null && other.getDataStartTime().equals(this.getDataStartTime()) == false)
            return false;
        if (other.getDataEndTime() == null ^ this.getDataEndTime() == null)
            return false;
        if (other.getDataEndTime() != null && other.getDataEndTime().equals(this.getDataEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getSensorName() == null) ? 0 : getSensorName().hashCode());
        hashCode = prime * hashCode + ((getDataExists() == null) ? 0 : getDataExists().hashCode());
        hashCode = prime * hashCode + ((getMissingValues() == null) ? 0 : getMissingValues().hashCode());
        hashCode = prime * hashCode + ((getInvalidValues() == null) ? 0 : getInvalidValues().hashCode());
        hashCode = prime * hashCode + ((getInvalidDateEntries() == null) ? 0 : getInvalidDateEntries().hashCode());
        hashCode = prime * hashCode + ((getDuplicateTimestamps() == null) ? 0 : getDuplicateTimestamps().hashCode());
        hashCode = prime * hashCode + ((getCategoricalValues() == null) ? 0 : getCategoricalValues().hashCode());
        hashCode = prime * hashCode + ((getMultipleOperatingModes() == null) ? 0 : getMultipleOperatingModes().hashCode());
        hashCode = prime * hashCode + ((getLargeTimestampGaps() == null) ? 0 : getLargeTimestampGaps().hashCode());
        hashCode = prime * hashCode + ((getMonotonicValues() == null) ? 0 : getMonotonicValues().hashCode());
        hashCode = prime * hashCode + ((getDataStartTime() == null) ? 0 : getDataStartTime().hashCode());
        hashCode = prime * hashCode + ((getDataEndTime() == null) ? 0 : getDataEndTime().hashCode());
        return hashCode;
    }

    @Override
    public SensorStatisticsSummary clone() {
        try {
            return (SensorStatisticsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.SensorStatisticsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
