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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateCallAnalyticsCategory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCallAnalyticsCategoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Call Analytics category you want to update. Category names are case sensitive.
     * </p>
     */
    private String categoryName;
    /**
     * <p>
     * The rules used for the updated Call Analytics category. The rules you provide in this field replace the ones that
     * are currently being used in the specified category.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * Choose whether you want to update a streaming or a batch Call Analytics category. The input type you specify must
     * match the input type specified when the category was created. For example, if you created a category with the
     * <code>POST_CALL</code> input type, you must use <code>POST_CALL</code> as the input type when updating this
     * category.
     * </p>
     */
    private String inputType;

    /**
     * <p>
     * The name of the Call Analytics category you want to update. Category names are case sensitive.
     * </p>
     * 
     * @param categoryName
     *        The name of the Call Analytics category you want to update. Category names are case sensitive.
     */

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * The name of the Call Analytics category you want to update. Category names are case sensitive.
     * </p>
     * 
     * @return The name of the Call Analytics category you want to update. Category names are case sensitive.
     */

    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * <p>
     * The name of the Call Analytics category you want to update. Category names are case sensitive.
     * </p>
     * 
     * @param categoryName
     *        The name of the Call Analytics category you want to update. Category names are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCallAnalyticsCategoryRequest withCategoryName(String categoryName) {
        setCategoryName(categoryName);
        return this;
    }

    /**
     * <p>
     * The rules used for the updated Call Analytics category. The rules you provide in this field replace the ones that
     * are currently being used in the specified category.
     * </p>
     * 
     * @return The rules used for the updated Call Analytics category. The rules you provide in this field replace the
     *         ones that are currently being used in the specified category.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules used for the updated Call Analytics category. The rules you provide in this field replace the ones that
     * are currently being used in the specified category.
     * </p>
     * 
     * @param rules
     *        The rules used for the updated Call Analytics category. The rules you provide in this field replace the
     *        ones that are currently being used in the specified category.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * The rules used for the updated Call Analytics category. The rules you provide in this field replace the ones that
     * are currently being used in the specified category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules used for the updated Call Analytics category. The rules you provide in this field replace the
     *        ones that are currently being used in the specified category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCallAnalyticsCategoryRequest withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules used for the updated Call Analytics category. The rules you provide in this field replace the ones that
     * are currently being used in the specified category.
     * </p>
     * 
     * @param rules
     *        The rules used for the updated Call Analytics category. The rules you provide in this field replace the
     *        ones that are currently being used in the specified category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCallAnalyticsCategoryRequest withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * Choose whether you want to update a streaming or a batch Call Analytics category. The input type you specify must
     * match the input type specified when the category was created. For example, if you created a category with the
     * <code>POST_CALL</code> input type, you must use <code>POST_CALL</code> as the input type when updating this
     * category.
     * </p>
     * 
     * @param inputType
     *        Choose whether you want to update a streaming or a batch Call Analytics category. The input type you
     *        specify must match the input type specified when the category was created. For example, if you created a
     *        category with the <code>POST_CALL</code> input type, you must use <code>POST_CALL</code> as the input type
     *        when updating this category.
     * @see InputType
     */

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /**
     * <p>
     * Choose whether you want to update a streaming or a batch Call Analytics category. The input type you specify must
     * match the input type specified when the category was created. For example, if you created a category with the
     * <code>POST_CALL</code> input type, you must use <code>POST_CALL</code> as the input type when updating this
     * category.
     * </p>
     * 
     * @return Choose whether you want to update a streaming or a batch Call Analytics category. The input type you
     *         specify must match the input type specified when the category was created. For example, if you created a
     *         category with the <code>POST_CALL</code> input type, you must use <code>POST_CALL</code> as the input
     *         type when updating this category.
     * @see InputType
     */

    public String getInputType() {
        return this.inputType;
    }

    /**
     * <p>
     * Choose whether you want to update a streaming or a batch Call Analytics category. The input type you specify must
     * match the input type specified when the category was created. For example, if you created a category with the
     * <code>POST_CALL</code> input type, you must use <code>POST_CALL</code> as the input type when updating this
     * category.
     * </p>
     * 
     * @param inputType
     *        Choose whether you want to update a streaming or a batch Call Analytics category. The input type you
     *        specify must match the input type specified when the category was created. For example, if you created a
     *        category with the <code>POST_CALL</code> input type, you must use <code>POST_CALL</code> as the input type
     *        when updating this category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public UpdateCallAnalyticsCategoryRequest withInputType(String inputType) {
        setInputType(inputType);
        return this;
    }

    /**
     * <p>
     * Choose whether you want to update a streaming or a batch Call Analytics category. The input type you specify must
     * match the input type specified when the category was created. For example, if you created a category with the
     * <code>POST_CALL</code> input type, you must use <code>POST_CALL</code> as the input type when updating this
     * category.
     * </p>
     * 
     * @param inputType
     *        Choose whether you want to update a streaming or a batch Call Analytics category. The input type you
     *        specify must match the input type specified when the category was created. For example, if you created a
     *        category with the <code>POST_CALL</code> input type, you must use <code>POST_CALL</code> as the input type
     *        when updating this category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public UpdateCallAnalyticsCategoryRequest withInputType(InputType inputType) {
        this.inputType = inputType.toString();
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
            sb.append("CategoryName: ").append(getCategoryName()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getInputType() != null)
            sb.append("InputType: ").append(getInputType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCallAnalyticsCategoryRequest == false)
            return false;
        UpdateCallAnalyticsCategoryRequest other = (UpdateCallAnalyticsCategoryRequest) obj;
        if (other.getCategoryName() == null ^ this.getCategoryName() == null)
            return false;
        if (other.getCategoryName() != null && other.getCategoryName().equals(this.getCategoryName()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getInputType() == null ^ this.getInputType() == null)
            return false;
        if (other.getInputType() != null && other.getInputType().equals(this.getInputType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getInputType() == null) ? 0 : getInputType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCallAnalyticsCategoryRequest clone() {
        return (UpdateCallAnalyticsCategoryRequest) super.clone();
    }

}
