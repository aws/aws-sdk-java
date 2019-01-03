/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>CurrentMetric</code> object that contains the Name and Unit for the metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CurrentMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CurrentMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unit for the metric.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param name
     *        The name of the metric.
     * @see CurrentMetricName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     * @see CurrentMetricName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param name
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrentMetricName
     */

    public CurrentMetric withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param name
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrentMetricName
     */

    public CurrentMetric withName(CurrentMetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @param unit
     *        The unit for the metric.
     * @see Unit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @return The unit for the metric.
     * @see Unit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @param unit
     *        The unit for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public CurrentMetric withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @param unit
     *        The unit for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public CurrentMetric withUnit(Unit unit) {
        this.unit = unit.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CurrentMetric == false)
            return false;
        CurrentMetric other = (CurrentMetric) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public CurrentMetric clone() {
        try {
            return (CurrentMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.CurrentMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
