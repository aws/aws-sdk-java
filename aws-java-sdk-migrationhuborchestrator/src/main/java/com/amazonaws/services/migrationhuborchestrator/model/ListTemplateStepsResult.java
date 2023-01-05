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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateSteps"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplateStepsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of summaries of steps in a template.
     * </p>
     */
    private java.util.List<TemplateStepSummary> templateStepSummaryList;

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateStepsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of summaries of steps in a template.
     * </p>
     * 
     * @return The list of summaries of steps in a template.
     */

    public java.util.List<TemplateStepSummary> getTemplateStepSummaryList() {
        return templateStepSummaryList;
    }

    /**
     * <p>
     * The list of summaries of steps in a template.
     * </p>
     * 
     * @param templateStepSummaryList
     *        The list of summaries of steps in a template.
     */

    public void setTemplateStepSummaryList(java.util.Collection<TemplateStepSummary> templateStepSummaryList) {
        if (templateStepSummaryList == null) {
            this.templateStepSummaryList = null;
            return;
        }

        this.templateStepSummaryList = new java.util.ArrayList<TemplateStepSummary>(templateStepSummaryList);
    }

    /**
     * <p>
     * The list of summaries of steps in a template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplateStepSummaryList(java.util.Collection)} or
     * {@link #withTemplateStepSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param templateStepSummaryList
     *        The list of summaries of steps in a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateStepsResult withTemplateStepSummaryList(TemplateStepSummary... templateStepSummaryList) {
        if (this.templateStepSummaryList == null) {
            setTemplateStepSummaryList(new java.util.ArrayList<TemplateStepSummary>(templateStepSummaryList.length));
        }
        for (TemplateStepSummary ele : templateStepSummaryList) {
            this.templateStepSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of summaries of steps in a template.
     * </p>
     * 
     * @param templateStepSummaryList
     *        The list of summaries of steps in a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateStepsResult withTemplateStepSummaryList(java.util.Collection<TemplateStepSummary> templateStepSummaryList) {
        setTemplateStepSummaryList(templateStepSummaryList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTemplateStepSummaryList() != null)
            sb.append("TemplateStepSummaryList: ").append(getTemplateStepSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplateStepsResult == false)
            return false;
        ListTemplateStepsResult other = (ListTemplateStepsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTemplateStepSummaryList() == null ^ this.getTemplateStepSummaryList() == null)
            return false;
        if (other.getTemplateStepSummaryList() != null && other.getTemplateStepSummaryList().equals(this.getTemplateStepSummaryList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTemplateStepSummaryList() == null) ? 0 : getTemplateStepSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplateStepsResult clone() {
        try {
            return (ListTemplateStepsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
