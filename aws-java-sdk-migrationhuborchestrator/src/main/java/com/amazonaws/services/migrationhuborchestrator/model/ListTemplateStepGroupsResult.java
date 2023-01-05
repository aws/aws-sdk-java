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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateStepGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplateStepGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The summary of the step group in the template.
     * </p>
     */
    private java.util.List<TemplateStepGroupSummary> templateStepGroupSummary;

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

    public ListTemplateStepGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The summary of the step group in the template.
     * </p>
     * 
     * @return The summary of the step group in the template.
     */

    public java.util.List<TemplateStepGroupSummary> getTemplateStepGroupSummary() {
        return templateStepGroupSummary;
    }

    /**
     * <p>
     * The summary of the step group in the template.
     * </p>
     * 
     * @param templateStepGroupSummary
     *        The summary of the step group in the template.
     */

    public void setTemplateStepGroupSummary(java.util.Collection<TemplateStepGroupSummary> templateStepGroupSummary) {
        if (templateStepGroupSummary == null) {
            this.templateStepGroupSummary = null;
            return;
        }

        this.templateStepGroupSummary = new java.util.ArrayList<TemplateStepGroupSummary>(templateStepGroupSummary);
    }

    /**
     * <p>
     * The summary of the step group in the template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplateStepGroupSummary(java.util.Collection)} or
     * {@link #withTemplateStepGroupSummary(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param templateStepGroupSummary
     *        The summary of the step group in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateStepGroupsResult withTemplateStepGroupSummary(TemplateStepGroupSummary... templateStepGroupSummary) {
        if (this.templateStepGroupSummary == null) {
            setTemplateStepGroupSummary(new java.util.ArrayList<TemplateStepGroupSummary>(templateStepGroupSummary.length));
        }
        for (TemplateStepGroupSummary ele : templateStepGroupSummary) {
            this.templateStepGroupSummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary of the step group in the template.
     * </p>
     * 
     * @param templateStepGroupSummary
     *        The summary of the step group in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateStepGroupsResult withTemplateStepGroupSummary(java.util.Collection<TemplateStepGroupSummary> templateStepGroupSummary) {
        setTemplateStepGroupSummary(templateStepGroupSummary);
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
        if (getTemplateStepGroupSummary() != null)
            sb.append("TemplateStepGroupSummary: ").append(getTemplateStepGroupSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplateStepGroupsResult == false)
            return false;
        ListTemplateStepGroupsResult other = (ListTemplateStepGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTemplateStepGroupSummary() == null ^ this.getTemplateStepGroupSummary() == null)
            return false;
        if (other.getTemplateStepGroupSummary() != null && other.getTemplateStepGroupSummary().equals(this.getTemplateStepGroupSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTemplateStepGroupSummary() == null) ? 0 : getTemplateStepGroupSummary().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplateStepGroupsResult clone() {
        try {
            return (ListTemplateStepGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
