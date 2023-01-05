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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListJobTemplates" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This output lists information about the specified job templates.
     * </p>
     */
    private java.util.List<JobTemplate> templates;
    /**
     * <p>
     * This output displays the token for the next set of job templates.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * This output lists information about the specified job templates.
     * </p>
     * 
     * @return This output lists information about the specified job templates.
     */

    public java.util.List<JobTemplate> getTemplates() {
        return templates;
    }

    /**
     * <p>
     * This output lists information about the specified job templates.
     * </p>
     * 
     * @param templates
     *        This output lists information about the specified job templates.
     */

    public void setTemplates(java.util.Collection<JobTemplate> templates) {
        if (templates == null) {
            this.templates = null;
            return;
        }

        this.templates = new java.util.ArrayList<JobTemplate>(templates);
    }

    /**
     * <p>
     * This output lists information about the specified job templates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplates(java.util.Collection)} or {@link #withTemplates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param templates
     *        This output lists information about the specified job templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesResult withTemplates(JobTemplate... templates) {
        if (this.templates == null) {
            setTemplates(new java.util.ArrayList<JobTemplate>(templates.length));
        }
        for (JobTemplate ele : templates) {
            this.templates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This output lists information about the specified job templates.
     * </p>
     * 
     * @param templates
     *        This output lists information about the specified job templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesResult withTemplates(java.util.Collection<JobTemplate> templates) {
        setTemplates(templates);
        return this;
    }

    /**
     * <p>
     * This output displays the token for the next set of job templates.
     * </p>
     * 
     * @param nextToken
     *        This output displays the token for the next set of job templates.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This output displays the token for the next set of job templates.
     * </p>
     * 
     * @return This output displays the token for the next set of job templates.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * This output displays the token for the next set of job templates.
     * </p>
     * 
     * @param nextToken
     *        This output displays the token for the next set of job templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesResult withNextToken(String nextToken) {
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
        if (getTemplates() != null)
            sb.append("Templates: ").append(getTemplates()).append(",");
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

        if (obj instanceof ListJobTemplatesResult == false)
            return false;
        ListJobTemplatesResult other = (ListJobTemplatesResult) obj;
        if (other.getTemplates() == null ^ this.getTemplates() == null)
            return false;
        if (other.getTemplates() != null && other.getTemplates().equals(this.getTemplates()) == false)
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

        hashCode = prime * hashCode + ((getTemplates() == null) ? 0 : getTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJobTemplatesResult clone() {
        try {
            return (ListJobTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
