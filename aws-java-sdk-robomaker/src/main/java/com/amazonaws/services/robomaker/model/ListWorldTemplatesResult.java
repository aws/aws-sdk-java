/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListWorldTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorldTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information for templates.
     * </p>
     */
    private java.util.List<TemplateSummary> templateSummaries;
    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     * parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information for templates.
     * </p>
     * 
     * @return Summary information for templates.
     */

    public java.util.List<TemplateSummary> getTemplateSummaries() {
        return templateSummaries;
    }

    /**
     * <p>
     * Summary information for templates.
     * </p>
     * 
     * @param templateSummaries
     *        Summary information for templates.
     */

    public void setTemplateSummaries(java.util.Collection<TemplateSummary> templateSummaries) {
        if (templateSummaries == null) {
            this.templateSummaries = null;
            return;
        }

        this.templateSummaries = new java.util.ArrayList<TemplateSummary>(templateSummaries);
    }

    /**
     * <p>
     * Summary information for templates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplateSummaries(java.util.Collection)} or {@link #withTemplateSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param templateSummaries
     *        Summary information for templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldTemplatesResult withTemplateSummaries(TemplateSummary... templateSummaries) {
        if (this.templateSummaries == null) {
            setTemplateSummaries(new java.util.ArrayList<TemplateSummary>(templateSummaries.length));
        }
        for (TemplateSummary ele : templateSummaries) {
            this.templateSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for templates.
     * </p>
     * 
     * @param templateSummaries
     *        Summary information for templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldTemplatesResult withTemplateSummaries(java.util.Collection<TemplateSummary> templateSummaries) {
        setTemplateSummaries(templateSummaries);
        return this;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     * parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     *        parameter. If there are no remaining results, the previous response object's NextToken parameter is set to
     *        null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     * parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     * 
     * @return If the previous paginated request did not return all of the remaining results, the response object's
     *         <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *         <code>ListWorldTemplates</code> again and assign that token to the request object's
     *         <code>nextToken</code> parameter. If there are no remaining results, the previous response object's
     *         NextToken parameter is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     * parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>nextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListWorldTemplates</code> again and assign that token to the request object's <code>nextToken</code>
     *        parameter. If there are no remaining results, the previous response object's NextToken parameter is set to
     *        null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorldTemplatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTemplateSummaries() != null)
            sb.append("TemplateSummaries: ").append(getTemplateSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorldTemplatesResult == false)
            return false;
        ListWorldTemplatesResult other = (ListWorldTemplatesResult) obj;
        if (other.getTemplateSummaries() == null ^ this.getTemplateSummaries() == null)
            return false;
        if (other.getTemplateSummaries() != null && other.getTemplateSummaries().equals(this.getTemplateSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateSummaries() == null) ? 0 : getTemplateSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorldTemplatesResult clone() {
        try {
            return (ListWorldTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
