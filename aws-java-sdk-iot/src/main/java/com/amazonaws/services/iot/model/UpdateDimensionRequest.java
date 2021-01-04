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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDimensionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to
     * remember what it does.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is a
     * pattern used to match the MQTT topic (for example, "admin/#").
     * </p>
     */
    private java.util.List<String> stringValues;

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to
     * remember what it does.
     * </p>
     * 
     * @param name
     *        A unique identifier for the dimension. Choose something that describes the type and value to make it easy
     *        to remember what it does.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to
     * remember what it does.
     * </p>
     * 
     * @return A unique identifier for the dimension. Choose something that describes the type and value to make it easy
     *         to remember what it does.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to
     * remember what it does.
     * </p>
     * 
     * @param name
     *        A unique identifier for the dimension. Choose something that describes the type and value to make it easy
     *        to remember what it does.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDimensionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is a
     * pattern used to match the MQTT topic (for example, "admin/#").
     * </p>
     * 
     * @return Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this
     *         is a pattern used to match the MQTT topic (for example, "admin/#").
     */

    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is a
     * pattern used to match the MQTT topic (for example, "admin/#").
     * </p>
     * 
     * @param stringValues
     *        Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is
     *        a pattern used to match the MQTT topic (for example, "admin/#").
     */

    public void setStringValues(java.util.Collection<String> stringValues) {
        if (stringValues == null) {
            this.stringValues = null;
            return;
        }

        this.stringValues = new java.util.ArrayList<String>(stringValues);
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is a
     * pattern used to match the MQTT topic (for example, "admin/#").
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringValues(java.util.Collection)} or {@link #withStringValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringValues
     *        Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is
     *        a pattern used to match the MQTT topic (for example, "admin/#").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDimensionRequest withStringValues(String... stringValues) {
        if (this.stringValues == null) {
            setStringValues(new java.util.ArrayList<String>(stringValues.length));
        }
        for (String ele : stringValues) {
            this.stringValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is a
     * pattern used to match the MQTT topic (for example, "admin/#").
     * </p>
     * 
     * @param stringValues
     *        Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is
     *        a pattern used to match the MQTT topic (for example, "admin/#").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDimensionRequest withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
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
        if (getStringValues() != null)
            sb.append("StringValues: ").append(getStringValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDimensionRequest == false)
            return false;
        UpdateDimensionRequest other = (UpdateDimensionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null && other.getStringValues().equals(this.getStringValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDimensionRequest clone() {
        return (UpdateDimensionRequest) super.clone();
    }

}
