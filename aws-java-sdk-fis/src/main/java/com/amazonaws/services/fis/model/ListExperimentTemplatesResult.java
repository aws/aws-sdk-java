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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperimentTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExperimentTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The experiment templates.
     * </p>
     */
    private java.util.List<ExperimentTemplateSummary> experimentTemplates;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The experiment templates.
     * </p>
     * 
     * @return The experiment templates.
     */

    public java.util.List<ExperimentTemplateSummary> getExperimentTemplates() {
        return experimentTemplates;
    }

    /**
     * <p>
     * The experiment templates.
     * </p>
     * 
     * @param experimentTemplates
     *        The experiment templates.
     */

    public void setExperimentTemplates(java.util.Collection<ExperimentTemplateSummary> experimentTemplates) {
        if (experimentTemplates == null) {
            this.experimentTemplates = null;
            return;
        }

        this.experimentTemplates = new java.util.ArrayList<ExperimentTemplateSummary>(experimentTemplates);
    }

    /**
     * <p>
     * The experiment templates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExperimentTemplates(java.util.Collection)} or {@link #withExperimentTemplates(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param experimentTemplates
     *        The experiment templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentTemplatesResult withExperimentTemplates(ExperimentTemplateSummary... experimentTemplates) {
        if (this.experimentTemplates == null) {
            setExperimentTemplates(new java.util.ArrayList<ExperimentTemplateSummary>(experimentTemplates.length));
        }
        for (ExperimentTemplateSummary ele : experimentTemplates) {
            this.experimentTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The experiment templates.
     * </p>
     * 
     * @param experimentTemplates
     *        The experiment templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentTemplatesResult withExperimentTemplates(java.util.Collection<ExperimentTemplateSummary> experimentTemplates) {
        setExperimentTemplates(experimentTemplates);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentTemplatesResult withNextToken(String nextToken) {
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
        if (getExperimentTemplates() != null)
            sb.append("ExperimentTemplates: ").append(getExperimentTemplates()).append(",");
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

        if (obj instanceof ListExperimentTemplatesResult == false)
            return false;
        ListExperimentTemplatesResult other = (ListExperimentTemplatesResult) obj;
        if (other.getExperimentTemplates() == null ^ this.getExperimentTemplates() == null)
            return false;
        if (other.getExperimentTemplates() != null && other.getExperimentTemplates().equals(this.getExperimentTemplates()) == false)
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

        hashCode = prime * hashCode + ((getExperimentTemplates() == null) ? 0 : getExperimentTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExperimentTemplatesResult clone() {
        try {
            return (ListExperimentTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
