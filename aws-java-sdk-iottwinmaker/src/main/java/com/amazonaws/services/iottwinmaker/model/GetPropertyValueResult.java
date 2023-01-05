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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetPropertyValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPropertyValueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that maps strings to the properties and latest property values in the response. Each string in the
     * mapping must be unique to this object.
     * </p>
     */
    private java.util.Map<String, PropertyLatestValue> propertyValues;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A table of property values.
     * </p>
     */
    private java.util.List<java.util.List<java.util.Map<String, DataValue>>> tabularPropertyValues;

    /**
     * <p>
     * An object that maps strings to the properties and latest property values in the response. Each string in the
     * mapping must be unique to this object.
     * </p>
     * 
     * @return An object that maps strings to the properties and latest property values in the response. Each string in
     *         the mapping must be unique to this object.
     */

    public java.util.Map<String, PropertyLatestValue> getPropertyValues() {
        return propertyValues;
    }

    /**
     * <p>
     * An object that maps strings to the properties and latest property values in the response. Each string in the
     * mapping must be unique to this object.
     * </p>
     * 
     * @param propertyValues
     *        An object that maps strings to the properties and latest property values in the response. Each string in
     *        the mapping must be unique to this object.
     */

    public void setPropertyValues(java.util.Map<String, PropertyLatestValue> propertyValues) {
        this.propertyValues = propertyValues;
    }

    /**
     * <p>
     * An object that maps strings to the properties and latest property values in the response. Each string in the
     * mapping must be unique to this object.
     * </p>
     * 
     * @param propertyValues
     *        An object that maps strings to the properties and latest property values in the response. Each string in
     *        the mapping must be unique to this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueResult withPropertyValues(java.util.Map<String, PropertyLatestValue> propertyValues) {
        setPropertyValues(propertyValues);
        return this;
    }

    /**
     * Add a single PropertyValues entry
     *
     * @see GetPropertyValueResult#withPropertyValues
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueResult addPropertyValuesEntry(String key, PropertyLatestValue value) {
        if (null == this.propertyValues) {
            this.propertyValues = new java.util.HashMap<String, PropertyLatestValue>();
        }
        if (this.propertyValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.propertyValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PropertyValues.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueResult clearPropertyValuesEntries() {
        this.propertyValues = null;
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A table of property values.
     * </p>
     * 
     * @return A table of property values.
     */

    public java.util.List<java.util.List<java.util.Map<String, DataValue>>> getTabularPropertyValues() {
        return tabularPropertyValues;
    }

    /**
     * <p>
     * A table of property values.
     * </p>
     * 
     * @param tabularPropertyValues
     *        A table of property values.
     */

    public void setTabularPropertyValues(java.util.Collection<java.util.List<java.util.Map<String, DataValue>>> tabularPropertyValues) {
        if (tabularPropertyValues == null) {
            this.tabularPropertyValues = null;
            return;
        }

        this.tabularPropertyValues = new java.util.ArrayList<java.util.List<java.util.Map<String, DataValue>>>(tabularPropertyValues);
    }

    /**
     * <p>
     * A table of property values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTabularPropertyValues(java.util.Collection)} or
     * {@link #withTabularPropertyValues(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param tabularPropertyValues
     *        A table of property values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueResult withTabularPropertyValues(java.util.List<java.util.Map<String, DataValue>>... tabularPropertyValues) {
        if (this.tabularPropertyValues == null) {
            setTabularPropertyValues(new java.util.ArrayList<java.util.List<java.util.Map<String, DataValue>>>(tabularPropertyValues.length));
        }
        for (java.util.List<java.util.Map<String, DataValue>> ele : tabularPropertyValues) {
            this.tabularPropertyValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A table of property values.
     * </p>
     * 
     * @param tabularPropertyValues
     *        A table of property values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertyValueResult withTabularPropertyValues(java.util.Collection<java.util.List<java.util.Map<String, DataValue>>> tabularPropertyValues) {
        setTabularPropertyValues(tabularPropertyValues);
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
        if (getPropertyValues() != null)
            sb.append("PropertyValues: ").append(getPropertyValues()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTabularPropertyValues() != null)
            sb.append("TabularPropertyValues: ").append(getTabularPropertyValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPropertyValueResult == false)
            return false;
        GetPropertyValueResult other = (GetPropertyValueResult) obj;
        if (other.getPropertyValues() == null ^ this.getPropertyValues() == null)
            return false;
        if (other.getPropertyValues() != null && other.getPropertyValues().equals(this.getPropertyValues()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTabularPropertyValues() == null ^ this.getTabularPropertyValues() == null)
            return false;
        if (other.getTabularPropertyValues() != null && other.getTabularPropertyValues().equals(this.getTabularPropertyValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyValues() == null) ? 0 : getPropertyValues().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTabularPropertyValues() == null) ? 0 : getTabularPropertyValues().hashCode());
        return hashCode;
    }

    @Override
    public GetPropertyValueResult clone() {
        try {
            return (GetPropertyValueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
