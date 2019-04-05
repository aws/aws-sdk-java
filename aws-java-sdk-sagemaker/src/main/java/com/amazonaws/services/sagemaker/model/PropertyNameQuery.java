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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A type of <code>SuggestionQuery</code>. A suggestion query for retrieving property names that match the specified
 * hint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PropertyNameQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyNameQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Text that is part of a property's name. The property names of hyperparameter, metric, and tag key names that
     * begin with the specified text in the <code>PropertyNameHint</code>.
     * </p>
     */
    private String propertyNameHint;

    /**
     * <p>
     * Text that is part of a property's name. The property names of hyperparameter, metric, and tag key names that
     * begin with the specified text in the <code>PropertyNameHint</code>.
     * </p>
     * 
     * @param propertyNameHint
     *        Text that is part of a property's name. The property names of hyperparameter, metric, and tag key names
     *        that begin with the specified text in the <code>PropertyNameHint</code>.
     */

    public void setPropertyNameHint(String propertyNameHint) {
        this.propertyNameHint = propertyNameHint;
    }

    /**
     * <p>
     * Text that is part of a property's name. The property names of hyperparameter, metric, and tag key names that
     * begin with the specified text in the <code>PropertyNameHint</code>.
     * </p>
     * 
     * @return Text that is part of a property's name. The property names of hyperparameter, metric, and tag key names
     *         that begin with the specified text in the <code>PropertyNameHint</code>.
     */

    public String getPropertyNameHint() {
        return this.propertyNameHint;
    }

    /**
     * <p>
     * Text that is part of a property's name. The property names of hyperparameter, metric, and tag key names that
     * begin with the specified text in the <code>PropertyNameHint</code>.
     * </p>
     * 
     * @param propertyNameHint
     *        Text that is part of a property's name. The property names of hyperparameter, metric, and tag key names
     *        that begin with the specified text in the <code>PropertyNameHint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyNameQuery withPropertyNameHint(String propertyNameHint) {
        setPropertyNameHint(propertyNameHint);
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
        if (getPropertyNameHint() != null)
            sb.append("PropertyNameHint: ").append(getPropertyNameHint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyNameQuery == false)
            return false;
        PropertyNameQuery other = (PropertyNameQuery) obj;
        if (other.getPropertyNameHint() == null ^ this.getPropertyNameHint() == null)
            return false;
        if (other.getPropertyNameHint() != null && other.getPropertyNameHint().equals(this.getPropertyNameHint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyNameHint() == null) ? 0 : getPropertyNameHint().hashCode());
        return hashCode;
    }

    @Override
    public PropertyNameQuery clone() {
        try {
            return (PropertyNameQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PropertyNameQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
