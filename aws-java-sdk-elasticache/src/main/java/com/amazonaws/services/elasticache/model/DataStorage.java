/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The data storage limit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DataStorage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataStorage implements Serializable, Cloneable {

    /**
     * <p>
     * The upper limit for data storage the cache is set to use.
     * </p>
     */
    private Integer maximum;
    /**
     * <p>
     * The lower limit for data storage the cache is set to use.
     * </p>
     */
    private Integer minimum;
    /**
     * <p>
     * The unit that the storage is measured in, in GB.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The upper limit for data storage the cache is set to use.
     * </p>
     * 
     * @param maximum
     *        The upper limit for data storage the cache is set to use.
     */

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The upper limit for data storage the cache is set to use.
     * </p>
     * 
     * @return The upper limit for data storage the cache is set to use.
     */

    public Integer getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The upper limit for data storage the cache is set to use.
     * </p>
     * 
     * @param maximum
     *        The upper limit for data storage the cache is set to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataStorage withMaximum(Integer maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * <p>
     * The lower limit for data storage the cache is set to use.
     * </p>
     * 
     * @param minimum
     *        The lower limit for data storage the cache is set to use.
     */

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The lower limit for data storage the cache is set to use.
     * </p>
     * 
     * @return The lower limit for data storage the cache is set to use.
     */

    public Integer getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The lower limit for data storage the cache is set to use.
     * </p>
     * 
     * @param minimum
     *        The lower limit for data storage the cache is set to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataStorage withMinimum(Integer minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The unit that the storage is measured in, in GB.
     * </p>
     * 
     * @param unit
     *        The unit that the storage is measured in, in GB.
     * @see DataStorageUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit that the storage is measured in, in GB.
     * </p>
     * 
     * @return The unit that the storage is measured in, in GB.
     * @see DataStorageUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit that the storage is measured in, in GB.
     * </p>
     * 
     * @param unit
     *        The unit that the storage is measured in, in GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataStorageUnit
     */

    public DataStorage withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit that the storage is measured in, in GB.
     * </p>
     * 
     * @param unit
     *        The unit that the storage is measured in, in GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataStorageUnit
     */

    public DataStorage withUnit(DataStorageUnit unit) {
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
        if (getMaximum() != null)
            sb.append("Maximum: ").append(getMaximum()).append(",");
        if (getMinimum() != null)
            sb.append("Minimum: ").append(getMinimum()).append(",");
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

        if (obj instanceof DataStorage == false)
            return false;
        DataStorage other = (DataStorage) obj;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
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

        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public DataStorage clone() {
        try {
            return (DataStorage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
