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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTaskTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTaskTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides details about a list of task templates belonging to an instance.
     * </p>
     */
    private java.util.List<TaskTemplateMetadata> taskTemplates;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as a null in the response.
     * </p>
     * </important>
     */
    private String nextToken;

    /**
     * <p>
     * Provides details about a list of task templates belonging to an instance.
     * </p>
     * 
     * @return Provides details about a list of task templates belonging to an instance.
     */

    public java.util.List<TaskTemplateMetadata> getTaskTemplates() {
        return taskTemplates;
    }

    /**
     * <p>
     * Provides details about a list of task templates belonging to an instance.
     * </p>
     * 
     * @param taskTemplates
     *        Provides details about a list of task templates belonging to an instance.
     */

    public void setTaskTemplates(java.util.Collection<TaskTemplateMetadata> taskTemplates) {
        if (taskTemplates == null) {
            this.taskTemplates = null;
            return;
        }

        this.taskTemplates = new java.util.ArrayList<TaskTemplateMetadata>(taskTemplates);
    }

    /**
     * <p>
     * Provides details about a list of task templates belonging to an instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskTemplates(java.util.Collection)} or {@link #withTaskTemplates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param taskTemplates
     *        Provides details about a list of task templates belonging to an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskTemplatesResult withTaskTemplates(TaskTemplateMetadata... taskTemplates) {
        if (this.taskTemplates == null) {
            setTaskTemplates(new java.util.ArrayList<TaskTemplateMetadata>(taskTemplates.length));
        }
        for (TaskTemplateMetadata ele : taskTemplates) {
            this.taskTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides details about a list of task templates belonging to an instance.
     * </p>
     * 
     * @param taskTemplates
     *        Provides details about a list of task templates belonging to an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskTemplatesResult withTaskTemplates(java.util.Collection<TaskTemplateMetadata> taskTemplates) {
        setTaskTemplates(taskTemplates);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as a null in the response.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.</p> <important>
     *        <p>
     *        This is always returned as a null in the response.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as a null in the response.
     * </p>
     * </important>
     * 
     * @return If there are additional results, this is the token for the next set of results.</p> <important>
     *         <p>
     *         This is always returned as a null in the response.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as a null in the response.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.</p> <important>
     *        <p>
     *        This is always returned as a null in the response.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskTemplatesResult withNextToken(String nextToken) {
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
        if (getTaskTemplates() != null)
            sb.append("TaskTemplates: ").append(getTaskTemplates()).append(",");
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

        if (obj instanceof ListTaskTemplatesResult == false)
            return false;
        ListTaskTemplatesResult other = (ListTaskTemplatesResult) obj;
        if (other.getTaskTemplates() == null ^ this.getTaskTemplates() == null)
            return false;
        if (other.getTaskTemplates() != null && other.getTaskTemplates().equals(this.getTaskTemplates()) == false)
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

        hashCode = prime * hashCode + ((getTaskTemplates() == null) ? 0 : getTaskTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTaskTemplatesResult clone() {
        try {
            return (ListTaskTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
