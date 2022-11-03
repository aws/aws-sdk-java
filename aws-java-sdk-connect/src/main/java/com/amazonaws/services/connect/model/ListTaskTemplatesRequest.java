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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTaskTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTaskTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <important>
     * <p>
     * It is not expected that you set this because the value returned in the previous response is always null.
     * </p>
     * </important>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <important>
     * <p>
     * It is not expected that you set this.
     * </p>
     * </important>
     */
    private Integer maxResults;
    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the task template.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskTemplatesRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <important>
     * <p>
     * It is not expected that you set this because the value returned in the previous response is always null.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.</p> <important>
     *        <p>
     *        It is not expected that you set this because the value returned in the previous response is always null.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <important>
     * <p>
     * It is not expected that you set this because the value returned in the previous response is always null.
     * </p>
     * </important>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.</p> <important>
     *         <p>
     *         It is not expected that you set this because the value returned in the previous response is always null.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * <important>
     * <p>
     * It is not expected that you set this because the value returned in the previous response is always null.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.</p> <important>
     *        <p>
     *        It is not expected that you set this because the value returned in the previous response is always null.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskTemplatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <important>
     * <p>
     * It is not expected that you set this.
     * </p>
     * </important>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.</p> <important>
     *        <p>
     *        It is not expected that you set this.
     *        </p>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <important>
     * <p>
     * It is not expected that you set this.
     * </p>
     * </important>
     * 
     * @return The maximum number of results to return per page.</p> <important>
     *         <p>
     *         It is not expected that you set this.
     *         </p>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <important>
     * <p>
     * It is not expected that you set this.
     * </p>
     * </important>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.</p> <important>
     *        <p>
     *        It is not expected that you set this.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskTemplatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @param status
     *        Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only
     *        be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a
     *        task that refers to this template cannot be created.
     * @see TaskTemplateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @return Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can
     *         only be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>,
     *         then a task that refers to this template cannot be created.
     * @see TaskTemplateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @param status
     *        Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only
     *        be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a
     *        task that refers to this template cannot be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTemplateStatus
     */

    public ListTaskTemplatesRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @param status
     *        Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only
     *        be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a
     *        task that refers to this template cannot be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTemplateStatus
     */

    public ListTaskTemplatesRequest withStatus(TaskTemplateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * 
     * @param name
     *        The name of the task template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * 
     * @return The name of the task template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * 
     * @param name
     *        The name of the task template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskTemplatesRequest withName(String name) {
        setName(name);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTaskTemplatesRequest == false)
            return false;
        ListTaskTemplatesRequest other = (ListTaskTemplatesRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ListTaskTemplatesRequest clone() {
        return (ListTaskTemplatesRequest) super.clone();
    }

}
