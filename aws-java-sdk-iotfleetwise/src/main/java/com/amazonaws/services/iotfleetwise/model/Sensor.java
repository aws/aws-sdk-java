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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An input component that reports the environmental condition of a vehicle.
 * </p>
 * <note>
 * <p>
 * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from sensors.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/Sensor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Sensor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified name of the sensor. For example, the fully qualified name of a sensor might be
     * <code>Vehicle.Body.Engine.Battery</code>.
     * </p>
     */
    private String fullyQualifiedName;
    /**
     * <p>
     * The specified data type of the sensor.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * A brief description of a sensor.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The scientific unit of measurement for data collected by the sensor.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * A list of possible values a sensor can take.
     * </p>
     */
    private java.util.List<String> allowedValues;
    /**
     * <p>
     * The specified possible minimum value of the sensor.
     * </p>
     */
    private Double min;
    /**
     * <p>
     * The specified possible maximum value of the sensor.
     * </p>
     */
    private Double max;

    /**
     * <p>
     * The fully qualified name of the sensor. For example, the fully qualified name of a sensor might be
     * <code>Vehicle.Body.Engine.Battery</code>.
     * </p>
     * 
     * @param fullyQualifiedName
     *        The fully qualified name of the sensor. For example, the fully qualified name of a sensor might be
     *        <code>Vehicle.Body.Engine.Battery</code>.
     */

    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of the sensor. For example, the fully qualified name of a sensor might be
     * <code>Vehicle.Body.Engine.Battery</code>.
     * </p>
     * 
     * @return The fully qualified name of the sensor. For example, the fully qualified name of a sensor might be
     *         <code>Vehicle.Body.Engine.Battery</code>.
     */

    public String getFullyQualifiedName() {
        return this.fullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of the sensor. For example, the fully qualified name of a sensor might be
     * <code>Vehicle.Body.Engine.Battery</code>.
     * </p>
     * 
     * @param fullyQualifiedName
     *        The fully qualified name of the sensor. For example, the fully qualified name of a sensor might be
     *        <code>Vehicle.Body.Engine.Battery</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sensor withFullyQualifiedName(String fullyQualifiedName) {
        setFullyQualifiedName(fullyQualifiedName);
        return this;
    }

    /**
     * <p>
     * The specified data type of the sensor.
     * </p>
     * 
     * @param dataType
     *        The specified data type of the sensor.
     * @see NodeDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The specified data type of the sensor.
     * </p>
     * 
     * @return The specified data type of the sensor.
     * @see NodeDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The specified data type of the sensor.
     * </p>
     * 
     * @param dataType
     *        The specified data type of the sensor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeDataType
     */

    public Sensor withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The specified data type of the sensor.
     * </p>
     * 
     * @param dataType
     *        The specified data type of the sensor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeDataType
     */

    public Sensor withDataType(NodeDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * A brief description of a sensor.
     * </p>
     * 
     * @param description
     *        A brief description of a sensor.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of a sensor.
     * </p>
     * 
     * @return A brief description of a sensor.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of a sensor.
     * </p>
     * 
     * @param description
     *        A brief description of a sensor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sensor withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The scientific unit of measurement for data collected by the sensor.
     * </p>
     * 
     * @param unit
     *        The scientific unit of measurement for data collected by the sensor.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The scientific unit of measurement for data collected by the sensor.
     * </p>
     * 
     * @return The scientific unit of measurement for data collected by the sensor.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The scientific unit of measurement for data collected by the sensor.
     * </p>
     * 
     * @param unit
     *        The scientific unit of measurement for data collected by the sensor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sensor withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * A list of possible values a sensor can take.
     * </p>
     * 
     * @return A list of possible values a sensor can take.
     */

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * A list of possible values a sensor can take.
     * </p>
     * 
     * @param allowedValues
     *        A list of possible values a sensor can take.
     */

    public void setAllowedValues(java.util.Collection<String> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new java.util.ArrayList<String>(allowedValues);
    }

    /**
     * <p>
     * A list of possible values a sensor can take.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        A list of possible values a sensor can take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sensor withAllowedValues(String... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new java.util.ArrayList<String>(allowedValues.length));
        }
        for (String ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of possible values a sensor can take.
     * </p>
     * 
     * @param allowedValues
     *        A list of possible values a sensor can take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sensor withAllowedValues(java.util.Collection<String> allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * The specified possible minimum value of the sensor.
     * </p>
     * 
     * @param min
     *        The specified possible minimum value of the sensor.
     */

    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * <p>
     * The specified possible minimum value of the sensor.
     * </p>
     * 
     * @return The specified possible minimum value of the sensor.
     */

    public Double getMin() {
        return this.min;
    }

    /**
     * <p>
     * The specified possible minimum value of the sensor.
     * </p>
     * 
     * @param min
     *        The specified possible minimum value of the sensor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sensor withMin(Double min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The specified possible maximum value of the sensor.
     * </p>
     * 
     * @param max
     *        The specified possible maximum value of the sensor.
     */

    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * <p>
     * The specified possible maximum value of the sensor.
     * </p>
     * 
     * @return The specified possible maximum value of the sensor.
     */

    public Double getMax() {
        return this.max;
    }

    /**
     * <p>
     * The specified possible maximum value of the sensor.
     * </p>
     * 
     * @param max
     *        The specified possible maximum value of the sensor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sensor withMax(Double max) {
        setMax(max);
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
        if (getFullyQualifiedName() != null)
            sb.append("FullyQualifiedName: ").append(getFullyQualifiedName()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getMin() != null)
            sb.append("Min: ").append(getMin()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Sensor == false)
            return false;
        Sensor other = (Sensor) obj;
        if (other.getFullyQualifiedName() == null ^ this.getFullyQualifiedName() == null)
            return false;
        if (other.getFullyQualifiedName() != null && other.getFullyQualifiedName().equals(this.getFullyQualifiedName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFullyQualifiedName() == null) ? 0 : getFullyQualifiedName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        return hashCode;
    }

    @Override
    public Sensor clone() {
        try {
            return (Sensor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.SensorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
