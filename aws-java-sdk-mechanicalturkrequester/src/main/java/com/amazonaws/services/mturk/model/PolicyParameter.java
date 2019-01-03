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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Name of the parameter from the Review policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/PolicyParameter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the parameter from the list of Review Polices.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The list of values of the Parameter
     * </p>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * List of ParameterMapEntry objects.
     * </p>
     */
    private java.util.List<ParameterMapEntry> mapEntries;

    /**
     * <p>
     * Name of the parameter from the list of Review Polices.
     * </p>
     * 
     * @param key
     *        Name of the parameter from the list of Review Polices.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Name of the parameter from the list of Review Polices.
     * </p>
     * 
     * @return Name of the parameter from the list of Review Polices.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Name of the parameter from the list of Review Polices.
     * </p>
     * 
     * @param key
     *        Name of the parameter from the list of Review Polices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyParameter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The list of values of the Parameter
     * </p>
     * 
     * @return The list of values of the Parameter
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The list of values of the Parameter
     * </p>
     * 
     * @param values
     *        The list of values of the Parameter
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The list of values of the Parameter
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The list of values of the Parameter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyParameter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of values of the Parameter
     * </p>
     * 
     * @param values
     *        The list of values of the Parameter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyParameter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * List of ParameterMapEntry objects.
     * </p>
     * 
     * @return List of ParameterMapEntry objects.
     */

    public java.util.List<ParameterMapEntry> getMapEntries() {
        return mapEntries;
    }

    /**
     * <p>
     * List of ParameterMapEntry objects.
     * </p>
     * 
     * @param mapEntries
     *        List of ParameterMapEntry objects.
     */

    public void setMapEntries(java.util.Collection<ParameterMapEntry> mapEntries) {
        if (mapEntries == null) {
            this.mapEntries = null;
            return;
        }

        this.mapEntries = new java.util.ArrayList<ParameterMapEntry>(mapEntries);
    }

    /**
     * <p>
     * List of ParameterMapEntry objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMapEntries(java.util.Collection)} or {@link #withMapEntries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mapEntries
     *        List of ParameterMapEntry objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyParameter withMapEntries(ParameterMapEntry... mapEntries) {
        if (this.mapEntries == null) {
            setMapEntries(new java.util.ArrayList<ParameterMapEntry>(mapEntries.length));
        }
        for (ParameterMapEntry ele : mapEntries) {
            this.mapEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ParameterMapEntry objects.
     * </p>
     * 
     * @param mapEntries
     *        List of ParameterMapEntry objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyParameter withMapEntries(java.util.Collection<ParameterMapEntry> mapEntries) {
        setMapEntries(mapEntries);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getMapEntries() != null)
            sb.append("MapEntries: ").append(getMapEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyParameter == false)
            return false;
        PolicyParameter other = (PolicyParameter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getMapEntries() == null ^ this.getMapEntries() == null)
            return false;
        if (other.getMapEntries() != null && other.getMapEntries().equals(this.getMapEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getMapEntries() == null) ? 0 : getMapEntries().hashCode());
        return hashCode;
    }

    @Override
    public PolicyParameter clone() {
        try {
            return (PolicyParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.PolicyParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
