/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of template summary objects.
     * </p>
     */
    private java.util.List<TemplateSummary> templates;

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @return The token for the next set of results. This is null if there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of template summary objects.
     * </p>
     * 
     * @return List of template summary objects.
     */

    public java.util.List<TemplateSummary> getTemplates() {
        return templates;
    }

    /**
     * <p>
     * List of template summary objects.
     * </p>
     * 
     * @param templates
     *        List of template summary objects.
     */

    public void setTemplates(java.util.Collection<TemplateSummary> templates) {
        if (templates == null) {
            this.templates = null;
            return;
        }

        this.templates = new java.util.ArrayList<TemplateSummary>(templates);
    }

    /**
     * <p>
     * List of template summary objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplates(java.util.Collection)} or {@link #withTemplates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param templates
     *        List of template summary objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesResult withTemplates(TemplateSummary... templates) {
        if (this.templates == null) {
            setTemplates(new java.util.ArrayList<TemplateSummary>(templates.length));
        }
        for (TemplateSummary ele : templates) {
            this.templates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of template summary objects.
     * </p>
     * 
     * @param templates
     *        List of template summary objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesResult withTemplates(java.util.Collection<TemplateSummary> templates) {
        setTemplates(templates);
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
        if (getTemplates() != null)
            sb.append("Templates: ").append(getTemplates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplatesResult == false)
            return false;
        ListTemplatesResult other = (ListTemplatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTemplates() == null ^ this.getTemplates() == null)
            return false;
        if (other.getTemplates() != null && other.getTemplates().equals(this.getTemplates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTemplates() == null) ? 0 : getTemplates().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplatesResult clone() {
        try {
            return (ListTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
