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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetCallAnalyticsCategory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCallAnalyticsCategoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Call Analytics category you want information about. Category names are case sensitive.
     * </p>
     */
    private String categoryName;

    /**
     * <p>
     * The name of the Call Analytics category you want information about. Category names are case sensitive.
     * </p>
     * 
     * @param categoryName
     *        The name of the Call Analytics category you want information about. Category names are case sensitive.
     */

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * The name of the Call Analytics category you want information about. Category names are case sensitive.
     * </p>
     * 
     * @return The name of the Call Analytics category you want information about. Category names are case sensitive.
     */

    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * <p>
     * The name of the Call Analytics category you want information about. Category names are case sensitive.
     * </p>
     * 
     * @param categoryName
     *        The name of the Call Analytics category you want information about. Category names are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCallAnalyticsCategoryRequest withCategoryName(String categoryName) {
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

        if (obj instanceof GetCallAnalyticsCategoryRequest == false)
            return false;
        GetCallAnalyticsCategoryRequest other = (GetCallAnalyticsCategoryRequest) obj;
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

        hashCode = prime * hashCode + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        return hashCode;
    }

    @Override
    public GetCallAnalyticsCategoryRequest clone() {
        return (GetCallAnalyticsCategoryRequest) super.clone();
    }

}
