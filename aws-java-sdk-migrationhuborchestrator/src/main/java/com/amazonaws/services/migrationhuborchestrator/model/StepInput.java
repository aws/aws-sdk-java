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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A map of key value pairs that is generated when you create a migration workflow. The key value pairs will differ
 * based on your selection of the template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StepInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the integer.
     * </p>
     */
    private Integer integerValue;
    /**
     * <p>
     * String value.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * List of string values.
     * </p>
     */
    private java.util.List<String> listOfStringsValue;
    /**
     * <p>
     * Map of string values.
     * </p>
     */
    private java.util.Map<String, String> mapOfStringValue;

    /**
     * <p>
     * The value of the integer.
     * </p>
     * 
     * @param integerValue
     *        The value of the integer.
     */

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * The value of the integer.
     * </p>
     * 
     * @return The value of the integer.
     */

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * The value of the integer.
     * </p>
     * 
     * @param integerValue
     *        The value of the integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepInput withIntegerValue(Integer integerValue) {
        setIntegerValue(integerValue);
        return this;
    }

    /**
     * <p>
     * String value.
     * </p>
     * 
     * @param stringValue
     *        String value.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * String value.
     * </p>
     * 
     * @return String value.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * String value.
     * </p>
     * 
     * @param stringValue
     *        String value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepInput withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * List of string values.
     * </p>
     * 
     * @return List of string values.
     */

    public java.util.List<String> getListOfStringsValue() {
        return listOfStringsValue;
    }

    /**
     * <p>
     * List of string values.
     * </p>
     * 
     * @param listOfStringsValue
     *        List of string values.
     */

    public void setListOfStringsValue(java.util.Collection<String> listOfStringsValue) {
        if (listOfStringsValue == null) {
            this.listOfStringsValue = null;
            return;
        }

        this.listOfStringsValue = new java.util.ArrayList<String>(listOfStringsValue);
    }

    /**
     * <p>
     * List of string values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListOfStringsValue(java.util.Collection)} or {@link #withListOfStringsValue(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param listOfStringsValue
     *        List of string values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepInput withListOfStringsValue(String... listOfStringsValue) {
        if (this.listOfStringsValue == null) {
            setListOfStringsValue(new java.util.ArrayList<String>(listOfStringsValue.length));
        }
        for (String ele : listOfStringsValue) {
            this.listOfStringsValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of string values.
     * </p>
     * 
     * @param listOfStringsValue
     *        List of string values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepInput withListOfStringsValue(java.util.Collection<String> listOfStringsValue) {
        setListOfStringsValue(listOfStringsValue);
        return this;
    }

    /**
     * <p>
     * Map of string values.
     * </p>
     * 
     * @return Map of string values.
     */

    public java.util.Map<String, String> getMapOfStringValue() {
        return mapOfStringValue;
    }

    /**
     * <p>
     * Map of string values.
     * </p>
     * 
     * @param mapOfStringValue
     *        Map of string values.
     */

    public void setMapOfStringValue(java.util.Map<String, String> mapOfStringValue) {
        this.mapOfStringValue = mapOfStringValue;
    }

    /**
     * <p>
     * Map of string values.
     * </p>
     * 
     * @param mapOfStringValue
     *        Map of string values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepInput withMapOfStringValue(java.util.Map<String, String> mapOfStringValue) {
        setMapOfStringValue(mapOfStringValue);
        return this;
    }

    /**
     * Add a single MapOfStringValue entry
     *
     * @see StepInput#withMapOfStringValue
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StepInput addMapOfStringValueEntry(String key, String value) {
        if (null == this.mapOfStringValue) {
            this.mapOfStringValue = new java.util.HashMap<String, String>();
        }
        if (this.mapOfStringValue.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.mapOfStringValue.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MapOfStringValue.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepInput clearMapOfStringValueEntries() {
        this.mapOfStringValue = null;
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
        if (getIntegerValue() != null)
            sb.append("IntegerValue: ").append(getIntegerValue()).append(",");
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getListOfStringsValue() != null)
            sb.append("ListOfStringsValue: ").append(getListOfStringsValue()).append(",");
        if (getMapOfStringValue() != null)
            sb.append("MapOfStringValue: ").append(getMapOfStringValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepInput == false)
            return false;
        StepInput other = (StepInput) obj;
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null)
            return false;
        if (other.getIntegerValue() != null && other.getIntegerValue().equals(this.getIntegerValue()) == false)
            return false;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getListOfStringsValue() == null ^ this.getListOfStringsValue() == null)
            return false;
        if (other.getListOfStringsValue() != null && other.getListOfStringsValue().equals(this.getListOfStringsValue()) == false)
            return false;
        if (other.getMapOfStringValue() == null ^ this.getMapOfStringValue() == null)
            return false;
        if (other.getMapOfStringValue() != null && other.getMapOfStringValue().equals(this.getMapOfStringValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getListOfStringsValue() == null) ? 0 : getListOfStringsValue().hashCode());
        hashCode = prime * hashCode + ((getMapOfStringValue() == null) ? 0 : getMapOfStringValue().hashCode());
        return hashCode;
    }

    @Override
    public StepInput clone() {
        try {
            return (StepInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhuborchestrator.model.transform.StepInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
