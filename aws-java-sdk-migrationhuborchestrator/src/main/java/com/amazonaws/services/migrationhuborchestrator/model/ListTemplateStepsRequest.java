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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateSteps"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplateStepsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results that can be returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the template.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The ID of the step group.
     * </p>
     */
    private String stepGroupId;

    /**
     * <p>
     * The maximum number of results that can be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that can be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that can be returned.
     * </p>
     * 
     * @return The maximum number of results that can be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that can be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that can be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateStepsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

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

    public ListTemplateStepsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param templateId
     *        The ID of the template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @return The ID of the template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param templateId
     *        The ID of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateStepsRequest withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The ID of the step group.
     * </p>
     * 
     * @param stepGroupId
     *        The ID of the step group.
     */

    public void setStepGroupId(String stepGroupId) {
        this.stepGroupId = stepGroupId;
    }

    /**
     * <p>
     * The ID of the step group.
     * </p>
     * 
     * @return The ID of the step group.
     */

    public String getStepGroupId() {
        return this.stepGroupId;
    }

    /**
     * <p>
     * The ID of the step group.
     * </p>
     * 
     * @param stepGroupId
     *        The ID of the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateStepsRequest withStepGroupId(String stepGroupId) {
        setStepGroupId(stepGroupId);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getStepGroupId() != null)
            sb.append("StepGroupId: ").append(getStepGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplateStepsRequest == false)
            return false;
        ListTemplateStepsRequest other = (ListTemplateStepsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getStepGroupId() == null ^ this.getStepGroupId() == null)
            return false;
        if (other.getStepGroupId() != null && other.getStepGroupId().equals(this.getStepGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getStepGroupId() == null) ? 0 : getStepGroupId().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplateStepsRequest clone() {
        return (ListTemplateStepsRequest) super.clone();
    }

}
