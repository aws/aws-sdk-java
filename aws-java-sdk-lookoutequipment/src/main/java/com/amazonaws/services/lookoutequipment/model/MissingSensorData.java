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
 * Entity that comprises aggregated information on sensors having missing data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/MissingSensorData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MissingSensorData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the number of sensors that have atleast some data missing.
     * </p>
     */
    private Integer affectedSensorCount;
    /**
     * <p>
     * Indicates the total number of missing values across all the sensors.
     * </p>
     */
    private Integer totalNumberOfMissingValues;

    /**
     * <p>
     * Indicates the number of sensors that have atleast some data missing.
     * </p>
     * 
     * @param affectedSensorCount
     *        Indicates the number of sensors that have atleast some data missing.
     */

    public void setAffectedSensorCount(Integer affectedSensorCount) {
        this.affectedSensorCount = affectedSensorCount;
    }

    /**
     * <p>
     * Indicates the number of sensors that have atleast some data missing.
     * </p>
     * 
     * @return Indicates the number of sensors that have atleast some data missing.
     */

    public Integer getAffectedSensorCount() {
        return this.affectedSensorCount;
    }

    /**
     * <p>
     * Indicates the number of sensors that have atleast some data missing.
     * </p>
     * 
     * @param affectedSensorCount
     *        Indicates the number of sensors that have atleast some data missing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MissingSensorData withAffectedSensorCount(Integer affectedSensorCount) {
        setAffectedSensorCount(affectedSensorCount);
        return this;
    }

    /**
     * <p>
     * Indicates the total number of missing values across all the sensors.
     * </p>
     * 
     * @param totalNumberOfMissingValues
     *        Indicates the total number of missing values across all the sensors.
     */

    public void setTotalNumberOfMissingValues(Integer totalNumberOfMissingValues) {
        this.totalNumberOfMissingValues = totalNumberOfMissingValues;
    }

    /**
     * <p>
     * Indicates the total number of missing values across all the sensors.
     * </p>
     * 
     * @return Indicates the total number of missing values across all the sensors.
     */

    public Integer getTotalNumberOfMissingValues() {
        return this.totalNumberOfMissingValues;
    }

    /**
     * <p>
     * Indicates the total number of missing values across all the sensors.
     * </p>
     * 
     * @param totalNumberOfMissingValues
     *        Indicates the total number of missing values across all the sensors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MissingSensorData withTotalNumberOfMissingValues(Integer totalNumberOfMissingValues) {
        setTotalNumberOfMissingValues(totalNumberOfMissingValues);
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
        if (getAffectedSensorCount() != null)
            sb.append("AffectedSensorCount: ").append(getAffectedSensorCount()).append(",");
        if (getTotalNumberOfMissingValues() != null)
            sb.append("TotalNumberOfMissingValues: ").append(getTotalNumberOfMissingValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MissingSensorData == false)
            return false;
        MissingSensorData other = (MissingSensorData) obj;
        if (other.getAffectedSensorCount() == null ^ this.getAffectedSensorCount() == null)
            return false;
        if (other.getAffectedSensorCount() != null && other.getAffectedSensorCount().equals(this.getAffectedSensorCount()) == false)
            return false;
        if (other.getTotalNumberOfMissingValues() == null ^ this.getTotalNumberOfMissingValues() == null)
            return false;
        if (other.getTotalNumberOfMissingValues() != null && other.getTotalNumberOfMissingValues().equals(this.getTotalNumberOfMissingValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAffectedSensorCount() == null) ? 0 : getAffectedSensorCount().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfMissingValues() == null) ? 0 : getTotalNumberOfMissingValues().hashCode());
        return hashCode;
    }

    @Override
    public MissingSensorData clone() {
        try {
            return (MissingSensorData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.MissingSensorDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
