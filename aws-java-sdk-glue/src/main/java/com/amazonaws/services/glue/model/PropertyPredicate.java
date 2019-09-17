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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a property predicate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PropertyPredicate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyPredicate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of the property.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value of the property.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     */
    private String comparator;

    /**
     * <p>
     * The key of the property.
     * </p>
     * 
     * @param key
     *        The key of the property.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the property.
     * </p>
     * 
     * @return The key of the property.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the property.
     * </p>
     * 
     * @param key
     *        The key of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyPredicate withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * 
     * @param value
     *        The value of the property.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * 
     * @return The value of the property.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * 
     * @param value
     *        The value of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyPredicate withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     * 
     * @param comparator
     *        The comparator used to compare this property to others.
     * @see Comparator
     */

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     * 
     * @return The comparator used to compare this property to others.
     * @see Comparator
     */

    public String getComparator() {
        return this.comparator;
    }

    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     * 
     * @param comparator
     *        The comparator used to compare this property to others.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Comparator
     */

    public PropertyPredicate withComparator(String comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     * 
     * @param comparator
     *        The comparator used to compare this property to others.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Comparator
     */

    public PropertyPredicate withComparator(Comparator comparator) {
        this.comparator = comparator.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getComparator() != null)
            sb.append("Comparator: ").append(getComparator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyPredicate == false)
            return false;
        PropertyPredicate other = (PropertyPredicate) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null && other.getComparator().equals(this.getComparator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        return hashCode;
    }

    @Override
    public PropertyPredicate clone() {
        try {
            return (PropertyPredicate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.PropertyPredicateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
