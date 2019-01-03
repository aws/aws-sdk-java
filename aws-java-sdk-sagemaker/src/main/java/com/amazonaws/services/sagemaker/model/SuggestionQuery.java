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
 * Limits the property names that are included in the response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SuggestionQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuggestionQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A type of <code>SuggestionQuery</code>. Defines a property name hint. Only property names that match the
     * specified hint are included in the response.
     * </p>
     */
    private PropertyNameQuery propertyNameQuery;

    /**
     * <p>
     * A type of <code>SuggestionQuery</code>. Defines a property name hint. Only property names that match the
     * specified hint are included in the response.
     * </p>
     * 
     * @param propertyNameQuery
     *        A type of <code>SuggestionQuery</code>. Defines a property name hint. Only property names that match the
     *        specified hint are included in the response.
     */

    public void setPropertyNameQuery(PropertyNameQuery propertyNameQuery) {
        this.propertyNameQuery = propertyNameQuery;
    }

    /**
     * <p>
     * A type of <code>SuggestionQuery</code>. Defines a property name hint. Only property names that match the
     * specified hint are included in the response.
     * </p>
     * 
     * @return A type of <code>SuggestionQuery</code>. Defines a property name hint. Only property names that match the
     *         specified hint are included in the response.
     */

    public PropertyNameQuery getPropertyNameQuery() {
        return this.propertyNameQuery;
    }

    /**
     * <p>
     * A type of <code>SuggestionQuery</code>. Defines a property name hint. Only property names that match the
     * specified hint are included in the response.
     * </p>
     * 
     * @param propertyNameQuery
     *        A type of <code>SuggestionQuery</code>. Defines a property name hint. Only property names that match the
     *        specified hint are included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestionQuery withPropertyNameQuery(PropertyNameQuery propertyNameQuery) {
        setPropertyNameQuery(propertyNameQuery);
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
        if (getPropertyNameQuery() != null)
            sb.append("PropertyNameQuery: ").append(getPropertyNameQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestionQuery == false)
            return false;
        SuggestionQuery other = (SuggestionQuery) obj;
        if (other.getPropertyNameQuery() == null ^ this.getPropertyNameQuery() == null)
            return false;
        if (other.getPropertyNameQuery() != null && other.getPropertyNameQuery().equals(this.getPropertyNameQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyNameQuery() == null) ? 0 : getPropertyNameQuery().hashCode());
        return hashCode;
    }

    @Override
    public SuggestionQuery clone() {
        try {
            return (SuggestionQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SuggestionQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
