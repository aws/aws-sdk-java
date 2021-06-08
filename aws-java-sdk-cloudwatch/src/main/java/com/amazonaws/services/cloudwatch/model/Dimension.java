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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A dimension is a name/value pair that is part of the identity of a metric. You can assign up to 10 dimensions to a
 * metric. Because dimensions are part of the unique identifier for a metric, whenever you add a unique name/value pair
 * to one of your metrics, you are creating a new variation of that metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/Dimension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dimension implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dimension. Dimension names cannot contain blank spaces or non-ASCII characters.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the dimension. Dimension values cannot contain blank spaces or non-ASCII characters.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the dimension. Dimension names cannot contain blank spaces or non-ASCII characters.
     * </p>
     * 
     * @param name
     *        The name of the dimension. Dimension names cannot contain blank spaces or non-ASCII characters.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the dimension. Dimension names cannot contain blank spaces or non-ASCII characters.
     * </p>
     * 
     * @return The name of the dimension. Dimension names cannot contain blank spaces or non-ASCII characters.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the dimension. Dimension names cannot contain blank spaces or non-ASCII characters.
     * </p>
     * 
     * @param name
     *        The name of the dimension. Dimension names cannot contain blank spaces or non-ASCII characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dimension withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the dimension. Dimension values cannot contain blank spaces or non-ASCII characters.
     * </p>
     * 
     * @param value
     *        The value of the dimension. Dimension values cannot contain blank spaces or non-ASCII characters.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the dimension. Dimension values cannot contain blank spaces or non-ASCII characters.
     * </p>
     * 
     * @return The value of the dimension. Dimension values cannot contain blank spaces or non-ASCII characters.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the dimension. Dimension values cannot contain blank spaces or non-ASCII characters.
     * </p>
     * 
     * @param value
     *        The value of the dimension. Dimension values cannot contain blank spaces or non-ASCII characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dimension withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dimension == false)
            return false;
        Dimension other = (Dimension) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Dimension clone() {
        try {
            return (Dimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
