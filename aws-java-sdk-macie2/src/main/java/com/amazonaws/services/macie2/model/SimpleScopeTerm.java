/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a property-based condition that determines whether an object is included or excluded from a classification
 * job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/SimpleScopeTerm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimpleScopeTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     */
    private String comparator;
    /**
     * <p>
     * The property to use in the condition.
     * </p>
     */
    private String key;
    /**
     * <p>
     * An array that lists one or more values to use in the condition.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition.
     * @see JobComparator
     */

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     * 
     * @return The operator to use in the condition.
     * @see JobComparator
     */

    public String getComparator() {
        return this.comparator;
    }

    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobComparator
     */

    public SimpleScopeTerm withComparator(String comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * <p>
     * The operator to use in the condition.
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobComparator
     */

    public SimpleScopeTerm withComparator(JobComparator comparator) {
        this.comparator = comparator.toString();
        return this;
    }

    /**
     * <p>
     * The property to use in the condition.
     * </p>
     * 
     * @param key
     *        The property to use in the condition.
     * @see ScopeFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The property to use in the condition.
     * </p>
     * 
     * @return The property to use in the condition.
     * @see ScopeFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The property to use in the condition.
     * </p>
     * 
     * @param key
     *        The property to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScopeFilterKey
     */

    public SimpleScopeTerm withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The property to use in the condition.
     * </p>
     * 
     * @param key
     *        The property to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScopeFilterKey
     */

    public SimpleScopeTerm withKey(ScopeFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * An array that lists one or more values to use in the condition.
     * </p>
     * 
     * @return An array that lists one or more values to use in the condition.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * An array that lists one or more values to use in the condition.
     * </p>
     * 
     * @param values
     *        An array that lists one or more values to use in the condition.
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
     * An array that lists one or more values to use in the condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        An array that lists one or more values to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleScopeTerm withValues(String... values) {
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
     * An array that lists one or more values to use in the condition.
     * </p>
     * 
     * @param values
     *        An array that lists one or more values to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleScopeTerm withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getComparator() != null)
            sb.append("Comparator: ").append(getComparator()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleScopeTerm == false)
            return false;
        SimpleScopeTerm other = (SimpleScopeTerm) obj;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null && other.getComparator().equals(this.getComparator()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public SimpleScopeTerm clone() {
        try {
            return (SimpleScopeTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SimpleScopeTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
