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
 * A structure that represents a category filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicCategoryFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicCategoryFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The category filter function. Valid values for this structure are <code>EXACT</code> and <code>CONTAINS</code>.
     * </p>
     */
    private String categoryFilterFunction;
    /**
     * <p>
     * The category filter type. This element is used to specify whether a filter is a simple category filter or an
     * inverse category filter.
     * </p>
     */
    private String categoryFilterType;
    /**
     * <p>
     * The constant used in a category filter.
     * </p>
     */
    private TopicCategoryFilterConstant constant;
    /**
     * <p>
     * A Boolean value that indicates if the filter is inverse.
     * </p>
     */
    private Boolean inverse;

    /**
     * <p>
     * The category filter function. Valid values for this structure are <code>EXACT</code> and <code>CONTAINS</code>.
     * </p>
     * 
     * @param categoryFilterFunction
     *        The category filter function. Valid values for this structure are <code>EXACT</code> and
     *        <code>CONTAINS</code>.
     * @see CategoryFilterFunction
     */

    public void setCategoryFilterFunction(String categoryFilterFunction) {
        this.categoryFilterFunction = categoryFilterFunction;
    }

    /**
     * <p>
     * The category filter function. Valid values for this structure are <code>EXACT</code> and <code>CONTAINS</code>.
     * </p>
     * 
     * @return The category filter function. Valid values for this structure are <code>EXACT</code> and
     *         <code>CONTAINS</code>.
     * @see CategoryFilterFunction
     */

    public String getCategoryFilterFunction() {
        return this.categoryFilterFunction;
    }

    /**
     * <p>
     * The category filter function. Valid values for this structure are <code>EXACT</code> and <code>CONTAINS</code>.
     * </p>
     * 
     * @param categoryFilterFunction
     *        The category filter function. Valid values for this structure are <code>EXACT</code> and
     *        <code>CONTAINS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CategoryFilterFunction
     */

    public TopicCategoryFilter withCategoryFilterFunction(String categoryFilterFunction) {
        setCategoryFilterFunction(categoryFilterFunction);
        return this;
    }

    /**
     * <p>
     * The category filter function. Valid values for this structure are <code>EXACT</code> and <code>CONTAINS</code>.
     * </p>
     * 
     * @param categoryFilterFunction
     *        The category filter function. Valid values for this structure are <code>EXACT</code> and
     *        <code>CONTAINS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CategoryFilterFunction
     */

    public TopicCategoryFilter withCategoryFilterFunction(CategoryFilterFunction categoryFilterFunction) {
        this.categoryFilterFunction = categoryFilterFunction.toString();
        return this;
    }

    /**
     * <p>
     * The category filter type. This element is used to specify whether a filter is a simple category filter or an
     * inverse category filter.
     * </p>
     * 
     * @param categoryFilterType
     *        The category filter type. This element is used to specify whether a filter is a simple category filter or
     *        an inverse category filter.
     * @see CategoryFilterType
     */

    public void setCategoryFilterType(String categoryFilterType) {
        this.categoryFilterType = categoryFilterType;
    }

    /**
     * <p>
     * The category filter type. This element is used to specify whether a filter is a simple category filter or an
     * inverse category filter.
     * </p>
     * 
     * @return The category filter type. This element is used to specify whether a filter is a simple category filter or
     *         an inverse category filter.
     * @see CategoryFilterType
     */

    public String getCategoryFilterType() {
        return this.categoryFilterType;
    }

    /**
     * <p>
     * The category filter type. This element is used to specify whether a filter is a simple category filter or an
     * inverse category filter.
     * </p>
     * 
     * @param categoryFilterType
     *        The category filter type. This element is used to specify whether a filter is a simple category filter or
     *        an inverse category filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CategoryFilterType
     */

    public TopicCategoryFilter withCategoryFilterType(String categoryFilterType) {
        setCategoryFilterType(categoryFilterType);
        return this;
    }

    /**
     * <p>
     * The category filter type. This element is used to specify whether a filter is a simple category filter or an
     * inverse category filter.
     * </p>
     * 
     * @param categoryFilterType
     *        The category filter type. This element is used to specify whether a filter is a simple category filter or
     *        an inverse category filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CategoryFilterType
     */

    public TopicCategoryFilter withCategoryFilterType(CategoryFilterType categoryFilterType) {
        this.categoryFilterType = categoryFilterType.toString();
        return this;
    }

    /**
     * <p>
     * The constant used in a category filter.
     * </p>
     * 
     * @param constant
     *        The constant used in a category filter.
     */

    public void setConstant(TopicCategoryFilterConstant constant) {
        this.constant = constant;
    }

    /**
     * <p>
     * The constant used in a category filter.
     * </p>
     * 
     * @return The constant used in a category filter.
     */

    public TopicCategoryFilterConstant getConstant() {
        return this.constant;
    }

    /**
     * <p>
     * The constant used in a category filter.
     * </p>
     * 
     * @param constant
     *        The constant used in a category filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCategoryFilter withConstant(TopicCategoryFilterConstant constant) {
        setConstant(constant);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates if the filter is inverse.
     * </p>
     * 
     * @param inverse
     *        A Boolean value that indicates if the filter is inverse.
     */

    public void setInverse(Boolean inverse) {
        this.inverse = inverse;
    }

    /**
     * <p>
     * A Boolean value that indicates if the filter is inverse.
     * </p>
     * 
     * @return A Boolean value that indicates if the filter is inverse.
     */

    public Boolean getInverse() {
        return this.inverse;
    }

    /**
     * <p>
     * A Boolean value that indicates if the filter is inverse.
     * </p>
     * 
     * @param inverse
     *        A Boolean value that indicates if the filter is inverse.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCategoryFilter withInverse(Boolean inverse) {
        setInverse(inverse);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates if the filter is inverse.
     * </p>
     * 
     * @return A Boolean value that indicates if the filter is inverse.
     */

    public Boolean isInverse() {
        return this.inverse;
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
        if (getCategoryFilterFunction() != null)
            sb.append("CategoryFilterFunction: ").append(getCategoryFilterFunction()).append(",");
        if (getCategoryFilterType() != null)
            sb.append("CategoryFilterType: ").append(getCategoryFilterType()).append(",");
        if (getConstant() != null)
            sb.append("Constant: ").append("***Sensitive Data Redacted***").append(",");
        if (getInverse() != null)
            sb.append("Inverse: ").append(getInverse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicCategoryFilter == false)
            return false;
        TopicCategoryFilter other = (TopicCategoryFilter) obj;
        if (other.getCategoryFilterFunction() == null ^ this.getCategoryFilterFunction() == null)
            return false;
        if (other.getCategoryFilterFunction() != null && other.getCategoryFilterFunction().equals(this.getCategoryFilterFunction()) == false)
            return false;
        if (other.getCategoryFilterType() == null ^ this.getCategoryFilterType() == null)
            return false;
        if (other.getCategoryFilterType() != null && other.getCategoryFilterType().equals(this.getCategoryFilterType()) == false)
            return false;
        if (other.getConstant() == null ^ this.getConstant() == null)
            return false;
        if (other.getConstant() != null && other.getConstant().equals(this.getConstant()) == false)
            return false;
        if (other.getInverse() == null ^ this.getInverse() == null)
            return false;
        if (other.getInverse() != null && other.getInverse().equals(this.getInverse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryFilterFunction() == null) ? 0 : getCategoryFilterFunction().hashCode());
        hashCode = prime * hashCode + ((getCategoryFilterType() == null) ? 0 : getCategoryFilterType().hashCode());
        hashCode = prime * hashCode + ((getConstant() == null) ? 0 : getConstant().hashCode());
        hashCode = prime * hashCode + ((getInverse() == null) ? 0 : getInverse().hashCode());
        return hashCode;
    }

    @Override
    public TopicCategoryFilter clone() {
        try {
            return (TopicCategoryFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicCategoryFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
