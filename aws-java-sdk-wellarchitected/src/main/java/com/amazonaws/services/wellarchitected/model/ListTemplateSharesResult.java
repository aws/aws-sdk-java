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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListTemplateShares" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplateSharesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The review template ARN.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * A review template share summary return object.
     * </p>
     */
    private java.util.List<TemplateShareSummary> templateShareSummaries;

    private String nextToken;

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @param templateArn
     *        The review template ARN.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @return The review template ARN.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @param templateArn
     *        The review template ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateSharesResult withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * A review template share summary return object.
     * </p>
     * 
     * @return A review template share summary return object.
     */

    public java.util.List<TemplateShareSummary> getTemplateShareSummaries() {
        return templateShareSummaries;
    }

    /**
     * <p>
     * A review template share summary return object.
     * </p>
     * 
     * @param templateShareSummaries
     *        A review template share summary return object.
     */

    public void setTemplateShareSummaries(java.util.Collection<TemplateShareSummary> templateShareSummaries) {
        if (templateShareSummaries == null) {
            this.templateShareSummaries = null;
            return;
        }

        this.templateShareSummaries = new java.util.ArrayList<TemplateShareSummary>(templateShareSummaries);
    }

    /**
     * <p>
     * A review template share summary return object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplateShareSummaries(java.util.Collection)} or
     * {@link #withTemplateShareSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param templateShareSummaries
     *        A review template share summary return object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateSharesResult withTemplateShareSummaries(TemplateShareSummary... templateShareSummaries) {
        if (this.templateShareSummaries == null) {
            setTemplateShareSummaries(new java.util.ArrayList<TemplateShareSummary>(templateShareSummaries.length));
        }
        for (TemplateShareSummary ele : templateShareSummaries) {
            this.templateShareSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A review template share summary return object.
     * </p>
     * 
     * @param templateShareSummaries
     *        A review template share summary return object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateSharesResult withTemplateShareSummaries(java.util.Collection<TemplateShareSummary> templateShareSummaries) {
        setTemplateShareSummaries(templateShareSummaries);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateSharesResult withNextToken(String nextToken) {
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
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getTemplateShareSummaries() != null)
            sb.append("TemplateShareSummaries: ").append(getTemplateShareSummaries()).append(",");
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

        if (obj instanceof ListTemplateSharesResult == false)
            return false;
        ListTemplateSharesResult other = (ListTemplateSharesResult) obj;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateShareSummaries() == null ^ this.getTemplateShareSummaries() == null)
            return false;
        if (other.getTemplateShareSummaries() != null && other.getTemplateShareSummaries().equals(this.getTemplateShareSummaries()) == false)
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

        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateShareSummaries() == null) ? 0 : getTemplateShareSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplateSharesResult clone() {
        try {
            return (ListTemplateSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
