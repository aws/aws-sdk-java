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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a property type, which can be one of <code>attribute</code>, <code>measurement</code>, <code>metric</code>,
 * or <code>transform</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PropertyType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies an asset attribute property. An attribute generally contains static information, such as the serial
     * number of an <a href="https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications">IIoT</a> wind
     * turbine.
     * </p>
     */
    private Attribute attribute;
    /**
     * <p>
     * Specifies an asset measurement property. A measurement represents a device's raw sensor data stream, such as
     * timestamped temperature values or timestamped power values.
     * </p>
     */
    private Measurement measurement;
    /**
     * <p>
     * Specifies an asset transform property. A transform contains a mathematical expression that maps a property's data
     * points from one form to another, such as a unit conversion from Celsius to Fahrenheit.
     * </p>
     */
    private Transform transform;
    /**
     * <p>
     * Specifies an asset metric property. A metric contains a mathematical expression that uses aggregate functions to
     * process all input data points over a time interval and output a single data point, such as to calculate the
     * average hourly temperature.
     * </p>
     */
    private Metric metric;

    /**
     * <p>
     * Specifies an asset attribute property. An attribute generally contains static information, such as the serial
     * number of an <a href="https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications">IIoT</a> wind
     * turbine.
     * </p>
     * 
     * @param attribute
     *        Specifies an asset attribute property. An attribute generally contains static information, such as the
     *        serial number of an <a
     *        href="https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications">IIoT</a> wind turbine.
     */

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * Specifies an asset attribute property. An attribute generally contains static information, such as the serial
     * number of an <a href="https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications">IIoT</a> wind
     * turbine.
     * </p>
     * 
     * @return Specifies an asset attribute property. An attribute generally contains static information, such as the
     *         serial number of an <a
     *         href="https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications">IIoT</a> wind turbine.
     */

    public Attribute getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * Specifies an asset attribute property. An attribute generally contains static information, such as the serial
     * number of an <a href="https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications">IIoT</a> wind
     * turbine.
     * </p>
     * 
     * @param attribute
     *        Specifies an asset attribute property. An attribute generally contains static information, such as the
     *        serial number of an <a
     *        href="https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications">IIoT</a> wind turbine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyType withAttribute(Attribute attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * Specifies an asset measurement property. A measurement represents a device's raw sensor data stream, such as
     * timestamped temperature values or timestamped power values.
     * </p>
     * 
     * @param measurement
     *        Specifies an asset measurement property. A measurement represents a device's raw sensor data stream, such
     *        as timestamped temperature values or timestamped power values.
     */

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    /**
     * <p>
     * Specifies an asset measurement property. A measurement represents a device's raw sensor data stream, such as
     * timestamped temperature values or timestamped power values.
     * </p>
     * 
     * @return Specifies an asset measurement property. A measurement represents a device's raw sensor data stream, such
     *         as timestamped temperature values or timestamped power values.
     */

    public Measurement getMeasurement() {
        return this.measurement;
    }

    /**
     * <p>
     * Specifies an asset measurement property. A measurement represents a device's raw sensor data stream, such as
     * timestamped temperature values or timestamped power values.
     * </p>
     * 
     * @param measurement
     *        Specifies an asset measurement property. A measurement represents a device's raw sensor data stream, such
     *        as timestamped temperature values or timestamped power values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyType withMeasurement(Measurement measurement) {
        setMeasurement(measurement);
        return this;
    }

    /**
     * <p>
     * Specifies an asset transform property. A transform contains a mathematical expression that maps a property's data
     * points from one form to another, such as a unit conversion from Celsius to Fahrenheit.
     * </p>
     * 
     * @param transform
     *        Specifies an asset transform property. A transform contains a mathematical expression that maps a
     *        property's data points from one form to another, such as a unit conversion from Celsius to Fahrenheit.
     */

    public void setTransform(Transform transform) {
        this.transform = transform;
    }

    /**
     * <p>
     * Specifies an asset transform property. A transform contains a mathematical expression that maps a property's data
     * points from one form to another, such as a unit conversion from Celsius to Fahrenheit.
     * </p>
     * 
     * @return Specifies an asset transform property. A transform contains a mathematical expression that maps a
     *         property's data points from one form to another, such as a unit conversion from Celsius to Fahrenheit.
     */

    public Transform getTransform() {
        return this.transform;
    }

    /**
     * <p>
     * Specifies an asset transform property. A transform contains a mathematical expression that maps a property's data
     * points from one form to another, such as a unit conversion from Celsius to Fahrenheit.
     * </p>
     * 
     * @param transform
     *        Specifies an asset transform property. A transform contains a mathematical expression that maps a
     *        property's data points from one form to another, such as a unit conversion from Celsius to Fahrenheit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyType withTransform(Transform transform) {
        setTransform(transform);
        return this;
    }

    /**
     * <p>
     * Specifies an asset metric property. A metric contains a mathematical expression that uses aggregate functions to
     * process all input data points over a time interval and output a single data point, such as to calculate the
     * average hourly temperature.
     * </p>
     * 
     * @param metric
     *        Specifies an asset metric property. A metric contains a mathematical expression that uses aggregate
     *        functions to process all input data points over a time interval and output a single data point, such as to
     *        calculate the average hourly temperature.
     */

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * Specifies an asset metric property. A metric contains a mathematical expression that uses aggregate functions to
     * process all input data points over a time interval and output a single data point, such as to calculate the
     * average hourly temperature.
     * </p>
     * 
     * @return Specifies an asset metric property. A metric contains a mathematical expression that uses aggregate
     *         functions to process all input data points over a time interval and output a single data point, such as
     *         to calculate the average hourly temperature.
     */

    public Metric getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * Specifies an asset metric property. A metric contains a mathematical expression that uses aggregate functions to
     * process all input data points over a time interval and output a single data point, such as to calculate the
     * average hourly temperature.
     * </p>
     * 
     * @param metric
     *        Specifies an asset metric property. A metric contains a mathematical expression that uses aggregate
     *        functions to process all input data points over a time interval and output a single data point, such as to
     *        calculate the average hourly temperature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyType withMetric(Metric metric) {
        setMetric(metric);
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getMeasurement() != null)
            sb.append("Measurement: ").append(getMeasurement()).append(",");
        if (getTransform() != null)
            sb.append("Transform: ").append(getTransform()).append(",");
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyType == false)
            return false;
        PropertyType other = (PropertyType) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getMeasurement() == null ^ this.getMeasurement() == null)
            return false;
        if (other.getMeasurement() != null && other.getMeasurement().equals(this.getMeasurement()) == false)
            return false;
        if (other.getTransform() == null ^ this.getTransform() == null)
            return false;
        if (other.getTransform() != null && other.getTransform().equals(this.getTransform()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getMeasurement() == null) ? 0 : getMeasurement().hashCode());
        hashCode = prime * hashCode + ((getTransform() == null) ? 0 : getTransform().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        return hashCode;
    }

    @Override
    public PropertyType clone() {
        try {
            return (PropertyType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.PropertyTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
