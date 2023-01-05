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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the maximum number of executions to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     * </p>
     * <p>
     * This is useful for pagination, for instance. If you have 100 executions for a workflow, you might only want to
     * list first 10. If so, call the API by specifying the <code>max-results</code>:
     * </p>
     * <p>
     * <code>aws transfer list-executions --max-results 10</code>
     * </p>
     * <p>
     * This returns details for the first 10 executions, as well as the pointer (<code>NextToken</code>) to the eleventh
     * execution. You can now call the API again, supplying the <code>NextToken</code> value you received:
     * </p>
     * <p>
     * <code>aws transfer list-executions --max-results 10 --next-token $somePointerReturnedFromPreviousListResult</code>
     * </p>
     * <p>
     * This call returns the next 10 executions, the 11th through the 20th. You can then repeat the call until the
     * details for all 100 executions have been returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     */
    private String workflowId;

    /**
     * <p>
     * Specifies the maximum number of executions to return.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of executions to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of executions to return.
     * </p>
     * 
     * @return Specifies the maximum number of executions to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of executions to return.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of executions to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     * </p>
     * <p>
     * This is useful for pagination, for instance. If you have 100 executions for a workflow, you might only want to
     * list first 10. If so, call the API by specifying the <code>max-results</code>:
     * </p>
     * <p>
     * <code>aws transfer list-executions --max-results 10</code>
     * </p>
     * <p>
     * This returns details for the first 10 executions, as well as the pointer (<code>NextToken</code>) to the eleventh
     * execution. You can now call the API again, supplying the <code>NextToken</code> value you received:
     * </p>
     * <p>
     * <code>aws transfer list-executions --max-results 10 --next-token $somePointerReturnedFromPreviousListResult</code>
     * </p>
     * <p>
     * This call returns the next 10 executions, the 11th through the 20th. You can then repeat the call until the
     * details for all 100 executions have been returned.
     * </p>
     * 
     * @param nextToken
     *        <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass
     *        the <code>NextToken</code> parameter in a subsequent command to continue listing additional
     *        executions.</p>
     *        <p>
     *        This is useful for pagination, for instance. If you have 100 executions for a workflow, you might only
     *        want to list first 10. If so, call the API by specifying the <code>max-results</code>:
     *        </p>
     *        <p>
     *        <code>aws transfer list-executions --max-results 10</code>
     *        </p>
     *        <p>
     *        This returns details for the first 10 executions, as well as the pointer (<code>NextToken</code>) to the
     *        eleventh execution. You can now call the API again, supplying the <code>NextToken</code> value you
     *        received:
     *        </p>
     *        <p>
     *        <code>aws transfer list-executions --max-results 10 --next-token $somePointerReturnedFromPreviousListResult</code>
     *        </p>
     *        <p>
     *        This call returns the next 10 executions, the 11th through the 20th. You can then repeat the call until
     *        the details for all 100 executions have been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     * </p>
     * <p>
     * This is useful for pagination, for instance. If you have 100 executions for a workflow, you might only want to
     * list first 10. If so, call the API by specifying the <code>max-results</code>:
     * </p>
     * <p>
     * <code>aws transfer list-executions --max-results 10</code>
     * </p>
     * <p>
     * This returns details for the first 10 executions, as well as the pointer (<code>NextToken</code>) to the eleventh
     * execution. You can now call the API again, supplying the <code>NextToken</code> value you received:
     * </p>
     * <p>
     * <code>aws transfer list-executions --max-results 10 --next-token $somePointerReturnedFromPreviousListResult</code>
     * </p>
     * <p>
     * This call returns the next 10 executions, the 11th through the 20th. You can then repeat the call until the
     * details for all 100 executions have been returned.
     * </p>
     * 
     * @return <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass
     *         the <code>NextToken</code> parameter in a subsequent command to continue listing additional
     *         executions.</p>
     *         <p>
     *         This is useful for pagination, for instance. If you have 100 executions for a workflow, you might only
     *         want to list first 10. If so, call the API by specifying the <code>max-results</code>:
     *         </p>
     *         <p>
     *         <code>aws transfer list-executions --max-results 10</code>
     *         </p>
     *         <p>
     *         This returns details for the first 10 executions, as well as the pointer (<code>NextToken</code>) to the
     *         eleventh execution. You can now call the API again, supplying the <code>NextToken</code> value you
     *         received:
     *         </p>
     *         <p>
     *         <code>aws transfer list-executions --max-results 10 --next-token $somePointerReturnedFromPreviousListResult</code>
     *         </p>
     *         <p>
     *         This call returns the next 10 executions, the 11th through the 20th. You can then repeat the call until
     *         the details for all 100 executions have been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     * </p>
     * <p>
     * This is useful for pagination, for instance. If you have 100 executions for a workflow, you might only want to
     * list first 10. If so, call the API by specifying the <code>max-results</code>:
     * </p>
     * <p>
     * <code>aws transfer list-executions --max-results 10</code>
     * </p>
     * <p>
     * This returns details for the first 10 executions, as well as the pointer (<code>NextToken</code>) to the eleventh
     * execution. You can now call the API again, supplying the <code>NextToken</code> value you received:
     * </p>
     * <p>
     * <code>aws transfer list-executions --max-results 10 --next-token $somePointerReturnedFromPreviousListResult</code>
     * </p>
     * <p>
     * This call returns the next 10 executions, the 11th through the 20th. You can then repeat the call until the
     * details for all 100 executions have been returned.
     * </p>
     * 
     * @param nextToken
     *        <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass
     *        the <code>NextToken</code> parameter in a subsequent command to continue listing additional
     *        executions.</p>
     *        <p>
     *        This is useful for pagination, for instance. If you have 100 executions for a workflow, you might only
     *        want to list first 10. If so, call the API by specifying the <code>max-results</code>:
     *        </p>
     *        <p>
     *        <code>aws transfer list-executions --max-results 10</code>
     *        </p>
     *        <p>
     *        This returns details for the first 10 executions, as well as the pointer (<code>NextToken</code>) to the
     *        eleventh execution. You can now call the API again, supplying the <code>NextToken</code> value you
     *        received:
     *        </p>
     *        <p>
     *        <code>aws transfer list-executions --max-results 10 --next-token $somePointerReturnedFromPreviousListResult</code>
     *        </p>
     *        <p>
     *        This call returns the next 10 executions, the 11th through the 20th. You can then repeat the call until
     *        the details for all 100 executions have been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        A unique identifier for the workflow.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     * 
     * @return A unique identifier for the workflow.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        A unique identifier for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsRequest withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListExecutionsRequest == false)
            return false;
        ListExecutionsRequest other = (ListExecutionsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        return hashCode;
    }

    @Override
    public ListExecutionsRequest clone() {
        return (ListExecutionsRequest) super.clone();
    }

}
