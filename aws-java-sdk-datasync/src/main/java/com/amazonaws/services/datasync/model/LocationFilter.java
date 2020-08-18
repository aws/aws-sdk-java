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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/LocationFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocationFilter implements Serializable, Cloneable, StructuredPojo {

    private String name;

    private java.util.List<String> values;

    private String operator;

    /**
     * @param name
     * @see LocationFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     * @see LocationFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationFilterName
     */

    public LocationFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationFilterName
     */

    public LocationFilter withName(LocationFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * @param values
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * @param values
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * @param operator
     * @see Operator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return
     * @see Operator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * @param operator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public LocationFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * @param operator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public LocationFilter withOperator(Operator operator) {
        this.operator = operator.toString();
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocationFilter == false)
            return false;
        LocationFilter other = (LocationFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public LocationFilter clone() {
        try {
            return (LocationFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.LocationFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
