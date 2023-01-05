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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides you with the properties of the Call Analytics category you specified in your request. This includes the list
 * of rules that define the specified category.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CategoryProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CategoryProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Call Analytics category. Category names are case sensitive and must be unique within an Amazon
     * Web Services account.
     * </p>
     */
    private String categoryName;
    /**
     * <p>
     * The rules used to define a Call Analytics category. Each category can have between 1 and 20 rules.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * The date and time the specified Call Analytics category was created.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The date and time the specified Call Analytics category was last updated.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7 on May 5, 2022.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The input type associated with the specified category. <code>POST_CALL</code> refers to a category that is
     * applied to batch transcriptions; <code>REAL_TIME</code> refers to a category that is applied to streaming
     * transcriptions.
     * </p>
     */
    private String inputType;

    /**
     * <p>
     * The name of the Call Analytics category. Category names are case sensitive and must be unique within an Amazon
     * Web Services account.
     * </p>
     * 
     * @param categoryName
     *        The name of the Call Analytics category. Category names are case sensitive and must be unique within an
     *        Amazon Web Services account.
     */

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * The name of the Call Analytics category. Category names are case sensitive and must be unique within an Amazon
     * Web Services account.
     * </p>
     * 
     * @return The name of the Call Analytics category. Category names are case sensitive and must be unique within an
     *         Amazon Web Services account.
     */

    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * <p>
     * The name of the Call Analytics category. Category names are case sensitive and must be unique within an Amazon
     * Web Services account.
     * </p>
     * 
     * @param categoryName
     *        The name of the Call Analytics category. Category names are case sensitive and must be unique within an
     *        Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryProperties withCategoryName(String categoryName) {
        setCategoryName(categoryName);
        return this;
    }

    /**
     * <p>
     * The rules used to define a Call Analytics category. Each category can have between 1 and 20 rules.
     * </p>
     * 
     * @return The rules used to define a Call Analytics category. Each category can have between 1 and 20 rules.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules used to define a Call Analytics category. Each category can have between 1 and 20 rules.
     * </p>
     * 
     * @param rules
     *        The rules used to define a Call Analytics category. Each category can have between 1 and 20 rules.
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
     * The rules used to define a Call Analytics category. Each category can have between 1 and 20 rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules used to define a Call Analytics category. Each category can have between 1 and 20 rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryProperties withRules(Rule... rules) {
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
     * The rules used to define a Call Analytics category. Each category can have between 1 and 20 rules.
     * </p>
     * 
     * @param rules
     *        The rules used to define a Call Analytics category. Each category can have between 1 and 20 rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryProperties withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was created.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param createTime
     *        The date and time the specified Call Analytics category was created.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was created.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified Call Analytics category was created.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was created.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param createTime
     *        The date and time the specified Call Analytics category was created.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryProperties withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was last updated.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7 on May 5, 2022.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time the specified Call Analytics category was last updated.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7 on May 5, 2022.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was last updated.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7 on May 5, 2022.
     * </p>
     * 
     * @return The date and time the specified Call Analytics category was last updated.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7 on May 5, 2022.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was last updated.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7 on May 5, 2022.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time the specified Call Analytics category was last updated.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7 on May 5, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryProperties withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The input type associated with the specified category. <code>POST_CALL</code> refers to a category that is
     * applied to batch transcriptions; <code>REAL_TIME</code> refers to a category that is applied to streaming
     * transcriptions.
     * </p>
     * 
     * @param inputType
     *        The input type associated with the specified category. <code>POST_CALL</code> refers to a category that is
     *        applied to batch transcriptions; <code>REAL_TIME</code> refers to a category that is applied to streaming
     *        transcriptions.
     * @see InputType
     */

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /**
     * <p>
     * The input type associated with the specified category. <code>POST_CALL</code> refers to a category that is
     * applied to batch transcriptions; <code>REAL_TIME</code> refers to a category that is applied to streaming
     * transcriptions.
     * </p>
     * 
     * @return The input type associated with the specified category. <code>POST_CALL</code> refers to a category that
     *         is applied to batch transcriptions; <code>REAL_TIME</code> refers to a category that is applied to
     *         streaming transcriptions.
     * @see InputType
     */

    public String getInputType() {
        return this.inputType;
    }

    /**
     * <p>
     * The input type associated with the specified category. <code>POST_CALL</code> refers to a category that is
     * applied to batch transcriptions; <code>REAL_TIME</code> refers to a category that is applied to streaming
     * transcriptions.
     * </p>
     * 
     * @param inputType
     *        The input type associated with the specified category. <code>POST_CALL</code> refers to a category that is
     *        applied to batch transcriptions; <code>REAL_TIME</code> refers to a category that is applied to streaming
     *        transcriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public CategoryProperties withInputType(String inputType) {
        setInputType(inputType);
        return this;
    }

    /**
     * <p>
     * The input type associated with the specified category. <code>POST_CALL</code> refers to a category that is
     * applied to batch transcriptions; <code>REAL_TIME</code> refers to a category that is applied to streaming
     * transcriptions.
     * </p>
     * 
     * @param inputType
     *        The input type associated with the specified category. <code>POST_CALL</code> refers to a category that is
     *        applied to batch transcriptions; <code>REAL_TIME</code> refers to a category that is applied to streaming
     *        transcriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public CategoryProperties withInputType(InputType inputType) {
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
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

        if (obj instanceof CategoryProperties == false)
            return false;
        CategoryProperties other = (CategoryProperties) obj;
        if (other.getCategoryName() == null ^ this.getCategoryName() == null)
            return false;
        if (other.getCategoryName() != null && other.getCategoryName().equals(this.getCategoryName()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
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
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getInputType() == null) ? 0 : getInputType().hashCode());
        return hashCode;
    }

    @Override
    public CategoryProperties clone() {
        try {
            return (CategoryProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.CategoryPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
