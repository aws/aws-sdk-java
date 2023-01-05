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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * One or more filters that searches for the specified resource or resources in a search. All resource objects that
 * satisfy the expression's condition are included in the search results
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelMetadataSearchExpression"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelMetadataSearchExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of filter objects.
     * </p>
     */
    private java.util.List<ModelMetadataFilter> filters;

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @return A list of filter objects.
     */

    public java.util.List<ModelMetadataFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @param filters
     *        A list of filter objects.
     */

    public void setFilters(java.util.Collection<ModelMetadataFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ModelMetadataFilter>(filters);
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadataSearchExpression withFilters(ModelMetadataFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ModelMetadataFilter>(filters.length));
        }
        for (ModelMetadataFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @param filters
     *        A list of filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadataSearchExpression withFilters(java.util.Collection<ModelMetadataFilter> filters) {
        setFilters(filters);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelMetadataSearchExpression == false)
            return false;
        ModelMetadataSearchExpression other = (ModelMetadataSearchExpression) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ModelMetadataSearchExpression clone() {
        try {
            return (ModelMetadataSearchExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelMetadataSearchExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
