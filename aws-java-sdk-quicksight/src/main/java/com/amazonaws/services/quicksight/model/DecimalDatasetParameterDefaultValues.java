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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The default values of a decimal parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DecimalDatasetParameterDefaultValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecimalDatasetParameterDefaultValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of static default values for a given decimal parameter.
     * </p>
     */
    private java.util.List<Double> staticValues;

    /**
     * <p>
     * A list of static default values for a given decimal parameter.
     * </p>
     * 
     * @return A list of static default values for a given decimal parameter.
     */

    public java.util.List<Double> getStaticValues() {
        return staticValues;
    }

    /**
     * <p>
     * A list of static default values for a given decimal parameter.
     * </p>
     * 
     * @param staticValues
     *        A list of static default values for a given decimal parameter.
     */

    public void setStaticValues(java.util.Collection<Double> staticValues) {
        if (staticValues == null) {
            this.staticValues = null;
            return;
        }

        this.staticValues = new java.util.ArrayList<Double>(staticValues);
    }

    /**
     * <p>
     * A list of static default values for a given decimal parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStaticValues(java.util.Collection)} or {@link #withStaticValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param staticValues
     *        A list of static default values for a given decimal parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalDatasetParameterDefaultValues withStaticValues(Double... staticValues) {
        if (this.staticValues == null) {
            setStaticValues(new java.util.ArrayList<Double>(staticValues.length));
        }
        for (Double ele : staticValues) {
            this.staticValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of static default values for a given decimal parameter.
     * </p>
     * 
     * @param staticValues
     *        A list of static default values for a given decimal parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalDatasetParameterDefaultValues withStaticValues(java.util.Collection<Double> staticValues) {
        setStaticValues(staticValues);
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
        if (getStaticValues() != null)
            sb.append("StaticValues: ").append(getStaticValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecimalDatasetParameterDefaultValues == false)
            return false;
        DecimalDatasetParameterDefaultValues other = (DecimalDatasetParameterDefaultValues) obj;
        if (other.getStaticValues() == null ^ this.getStaticValues() == null)
            return false;
        if (other.getStaticValues() != null && other.getStaticValues().equals(this.getStaticValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStaticValues() == null) ? 0 : getStaticValues().hashCode());
        return hashCode;
    }

    @Override
    public DecimalDatasetParameterDefaultValues clone() {
        try {
            return (DecimalDatasetParameterDefaultValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DecimalDatasetParameterDefaultValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
