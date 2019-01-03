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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The skill store category that is shown. Alexa skills are assigned a specific skill category during creation, such as
 * News, Social, and Sports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/Category" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Category implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the skill store category.
     * </p>
     */
    private Long categoryId;
    /**
     * <p>
     * The name of the skill store category.
     * </p>
     */
    private String categoryName;

    /**
     * <p>
     * The ID of the skill store category.
     * </p>
     * 
     * @param categoryId
     *        The ID of the skill store category.
     */

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * <p>
     * The ID of the skill store category.
     * </p>
     * 
     * @return The ID of the skill store category.
     */

    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * <p>
     * The ID of the skill store category.
     * </p>
     * 
     * @param categoryId
     *        The ID of the skill store category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Category withCategoryId(Long categoryId) {
        setCategoryId(categoryId);
        return this;
    }

    /**
     * <p>
     * The name of the skill store category.
     * </p>
     * 
     * @param categoryName
     *        The name of the skill store category.
     */

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * The name of the skill store category.
     * </p>
     * 
     * @return The name of the skill store category.
     */

    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * <p>
     * The name of the skill store category.
     * </p>
     * 
     * @param categoryName
     *        The name of the skill store category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Category withCategoryName(String categoryName) {
        setCategoryName(categoryName);
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
        if (getCategoryId() != null)
            sb.append("CategoryId: ").append(getCategoryId()).append(",");
        if (getCategoryName() != null)
            sb.append("CategoryName: ").append(getCategoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Category == false)
            return false;
        Category other = (Category) obj;
        if (other.getCategoryId() == null ^ this.getCategoryId() == null)
            return false;
        if (other.getCategoryId() != null && other.getCategoryId().equals(this.getCategoryId()) == false)
            return false;
        if (other.getCategoryName() == null ^ this.getCategoryName() == null)
            return false;
        if (other.getCategoryName() != null && other.getCategoryName().equals(this.getCategoryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        hashCode = prime * hashCode + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        return hashCode;
    }

    @Override
    public Category clone() {
        try {
            return (Category) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.CategoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
