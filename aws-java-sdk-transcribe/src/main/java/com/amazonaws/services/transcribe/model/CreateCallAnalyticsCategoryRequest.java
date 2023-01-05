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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateCallAnalyticsCategory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCallAnalyticsCategoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics category. It's helpful to use a detailed naming system that
     * will make sense to you in the future. For example, it's better to use
     * <code>sentiment-positive-last30seconds</code> for a category over a generic name like <code>test-category</code>.
     * </p>
     * <p>
     * Category names are case sensitive.
     * </p>
     */
    private String categoryName;
    /**
     * <p>
     * Rules define a Call Analytics category. When creating a new category, you must create between 1 and 20 rules for
     * that category. For each rule, you specify a filter you want applied to the attributes of a call. For example, you
     * can choose a sentiment filter that detects if a customer's sentiment was positive during the last 30 seconds of
     * the call.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * Choose whether you want to create a streaming or a batch category for your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to batch transcriptions; categories with this input type
     * cannot be applied to streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming transcriptions; categories with this input
     * type cannot be applied to batch (post-call) transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as a batch category by default.
     * </p>
     */
    private String inputType;

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics category. It's helpful to use a detailed naming system that
     * will make sense to you in the future. For example, it's better to use
     * <code>sentiment-positive-last30seconds</code> for a category over a generic name like <code>test-category</code>.
     * </p>
     * <p>
     * Category names are case sensitive.
     * </p>
     * 
     * @param categoryName
     *        A unique name, chosen by you, for your Call Analytics category. It's helpful to use a detailed naming
     *        system that will make sense to you in the future. For example, it's better to use
     *        <code>sentiment-positive-last30seconds</code> for a category over a generic name like
     *        <code>test-category</code>.</p>
     *        <p>
     *        Category names are case sensitive.
     */

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics category. It's helpful to use a detailed naming system that
     * will make sense to you in the future. For example, it's better to use
     * <code>sentiment-positive-last30seconds</code> for a category over a generic name like <code>test-category</code>.
     * </p>
     * <p>
     * Category names are case sensitive.
     * </p>
     * 
     * @return A unique name, chosen by you, for your Call Analytics category. It's helpful to use a detailed naming
     *         system that will make sense to you in the future. For example, it's better to use
     *         <code>sentiment-positive-last30seconds</code> for a category over a generic name like
     *         <code>test-category</code>.</p>
     *         <p>
     *         Category names are case sensitive.
     */

    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics category. It's helpful to use a detailed naming system that
     * will make sense to you in the future. For example, it's better to use
     * <code>sentiment-positive-last30seconds</code> for a category over a generic name like <code>test-category</code>.
     * </p>
     * <p>
     * Category names are case sensitive.
     * </p>
     * 
     * @param categoryName
     *        A unique name, chosen by you, for your Call Analytics category. It's helpful to use a detailed naming
     *        system that will make sense to you in the future. For example, it's better to use
     *        <code>sentiment-positive-last30seconds</code> for a category over a generic name like
     *        <code>test-category</code>.</p>
     *        <p>
     *        Category names are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCallAnalyticsCategoryRequest withCategoryName(String categoryName) {
        setCategoryName(categoryName);
        return this;
    }

    /**
     * <p>
     * Rules define a Call Analytics category. When creating a new category, you must create between 1 and 20 rules for
     * that category. For each rule, you specify a filter you want applied to the attributes of a call. For example, you
     * can choose a sentiment filter that detects if a customer's sentiment was positive during the last 30 seconds of
     * the call.
     * </p>
     * 
     * @return Rules define a Call Analytics category. When creating a new category, you must create between 1 and 20
     *         rules for that category. For each rule, you specify a filter you want applied to the attributes of a
     *         call. For example, you can choose a sentiment filter that detects if a customer's sentiment was positive
     *         during the last 30 seconds of the call.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * Rules define a Call Analytics category. When creating a new category, you must create between 1 and 20 rules for
     * that category. For each rule, you specify a filter you want applied to the attributes of a call. For example, you
     * can choose a sentiment filter that detects if a customer's sentiment was positive during the last 30 seconds of
     * the call.
     * </p>
     * 
     * @param rules
     *        Rules define a Call Analytics category. When creating a new category, you must create between 1 and 20
     *        rules for that category. For each rule, you specify a filter you want applied to the attributes of a call.
     *        For example, you can choose a sentiment filter that detects if a customer's sentiment was positive during
     *        the last 30 seconds of the call.
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
     * Rules define a Call Analytics category. When creating a new category, you must create between 1 and 20 rules for
     * that category. For each rule, you specify a filter you want applied to the attributes of a call. For example, you
     * can choose a sentiment filter that detects if a customer's sentiment was positive during the last 30 seconds of
     * the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        Rules define a Call Analytics category. When creating a new category, you must create between 1 and 20
     *        rules for that category. For each rule, you specify a filter you want applied to the attributes of a call.
     *        For example, you can choose a sentiment filter that detects if a customer's sentiment was positive during
     *        the last 30 seconds of the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCallAnalyticsCategoryRequest withRules(Rule... rules) {
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
     * Rules define a Call Analytics category. When creating a new category, you must create between 1 and 20 rules for
     * that category. For each rule, you specify a filter you want applied to the attributes of a call. For example, you
     * can choose a sentiment filter that detects if a customer's sentiment was positive during the last 30 seconds of
     * the call.
     * </p>
     * 
     * @param rules
     *        Rules define a Call Analytics category. When creating a new category, you must create between 1 and 20
     *        rules for that category. For each rule, you specify a filter you want applied to the attributes of a call.
     *        For example, you can choose a sentiment filter that detects if a customer's sentiment was positive during
     *        the last 30 seconds of the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCallAnalyticsCategoryRequest withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * Choose whether you want to create a streaming or a batch category for your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to batch transcriptions; categories with this input type
     * cannot be applied to streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming transcriptions; categories with this input
     * type cannot be applied to batch (post-call) transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as a batch category by default.
     * </p>
     * 
     * @param inputType
     *        Choose whether you want to create a streaming or a batch category for your Call Analytics
     *        transcription.</p>
     *        <p>
     *        Specifying <code>POST_CALL</code> assigns your category to batch transcriptions; categories with this
     *        input type cannot be applied to streaming (real-time) transcriptions.
     *        </p>
     *        <p>
     *        Specifying <code>REAL_TIME</code> assigns your category to streaming transcriptions; categories with this
     *        input type cannot be applied to batch (post-call) transcriptions.
     *        </p>
     *        <p>
     *        If you do not include <code>InputType</code>, your category is created as a batch category by default.
     * @see InputType
     */

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /**
     * <p>
     * Choose whether you want to create a streaming or a batch category for your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to batch transcriptions; categories with this input type
     * cannot be applied to streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming transcriptions; categories with this input
     * type cannot be applied to batch (post-call) transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as a batch category by default.
     * </p>
     * 
     * @return Choose whether you want to create a streaming or a batch category for your Call Analytics
     *         transcription.</p>
     *         <p>
     *         Specifying <code>POST_CALL</code> assigns your category to batch transcriptions; categories with this
     *         input type cannot be applied to streaming (real-time) transcriptions.
     *         </p>
     *         <p>
     *         Specifying <code>REAL_TIME</code> assigns your category to streaming transcriptions; categories with this
     *         input type cannot be applied to batch (post-call) transcriptions.
     *         </p>
     *         <p>
     *         If you do not include <code>InputType</code>, your category is created as a batch category by default.
     * @see InputType
     */

    public String getInputType() {
        return this.inputType;
    }

    /**
     * <p>
     * Choose whether you want to create a streaming or a batch category for your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to batch transcriptions; categories with this input type
     * cannot be applied to streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming transcriptions; categories with this input
     * type cannot be applied to batch (post-call) transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as a batch category by default.
     * </p>
     * 
     * @param inputType
     *        Choose whether you want to create a streaming or a batch category for your Call Analytics
     *        transcription.</p>
     *        <p>
     *        Specifying <code>POST_CALL</code> assigns your category to batch transcriptions; categories with this
     *        input type cannot be applied to streaming (real-time) transcriptions.
     *        </p>
     *        <p>
     *        Specifying <code>REAL_TIME</code> assigns your category to streaming transcriptions; categories with this
     *        input type cannot be applied to batch (post-call) transcriptions.
     *        </p>
     *        <p>
     *        If you do not include <code>InputType</code>, your category is created as a batch category by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public CreateCallAnalyticsCategoryRequest withInputType(String inputType) {
        setInputType(inputType);
        return this;
    }

    /**
     * <p>
     * Choose whether you want to create a streaming or a batch category for your Call Analytics transcription.
     * </p>
     * <p>
     * Specifying <code>POST_CALL</code> assigns your category to batch transcriptions; categories with this input type
     * cannot be applied to streaming (real-time) transcriptions.
     * </p>
     * <p>
     * Specifying <code>REAL_TIME</code> assigns your category to streaming transcriptions; categories with this input
     * type cannot be applied to batch (post-call) transcriptions.
     * </p>
     * <p>
     * If you do not include <code>InputType</code>, your category is created as a batch category by default.
     * </p>
     * 
     * @param inputType
     *        Choose whether you want to create a streaming or a batch category for your Call Analytics
     *        transcription.</p>
     *        <p>
     *        Specifying <code>POST_CALL</code> assigns your category to batch transcriptions; categories with this
     *        input type cannot be applied to streaming (real-time) transcriptions.
     *        </p>
     *        <p>
     *        Specifying <code>REAL_TIME</code> assigns your category to streaming transcriptions; categories with this
     *        input type cannot be applied to batch (post-call) transcriptions.
     *        </p>
     *        <p>
     *        If you do not include <code>InputType</code>, your category is created as a batch category by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public CreateCallAnalyticsCategoryRequest withInputType(InputType inputType) {
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

        if (obj instanceof CreateCallAnalyticsCategoryRequest == false)
            return false;
        CreateCallAnalyticsCategoryRequest other = (CreateCallAnalyticsCategoryRequest) obj;
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
    public CreateCallAnalyticsCategoryRequest clone() {
        return (CreateCallAnalyticsCategoryRequest) super.clone();
    }

}
