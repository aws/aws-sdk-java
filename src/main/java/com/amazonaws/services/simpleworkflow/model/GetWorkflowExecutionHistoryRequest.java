/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#getWorkflowExecutionHistory(GetWorkflowExecutionHistoryRequest) GetWorkflowExecutionHistory operation}.
 * <p>
 * Returns the history of the specified workflow execution. The results may be split into multiple pages. To retrieve subsequent pages, make the call
 * again using the <code>nextPageToken</code> returned by the initial call.
 * </p>
 * <p>
 * <b>NOTE:</b> This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
 * </p>
 * 
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
 * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action
 * fails by throwing <code>OperationNotPermitted</code> . For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#getWorkflowExecutionHistory(GetWorkflowExecutionHistoryRequest)
 */
public class GetWorkflowExecutionHistoryRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain containing the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * Specifies the workflow execution for which to return the history.
     */
    private WorkflowExecution execution;

    /**
     * If a <code>NextPageToken</code> is returned, the result has more than
     * one pages. To get the next page, repeat the call and specify the
     * nextPageToken with all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * Specifies the maximum number of history events returned in one page.
     * The next page in the result is identified by the
     * <code>NextPageToken</code> returned. By default 100 history events are
     * returned in a page but the caller can override this value to a page
     * size <i>smaller</i> than the default. You cannot specify a page size
     * larger than 100. Note that the number of events may be less than the
     * maxiumum page size, in which case, the returned page will have fewer
     * results than the maximumPageSize specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer maximumPageSize;

    /**
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimeStamp</code> of the events.
     */
    private Boolean reverseOrder;

    /**
     * The name of the domain containing the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain containing the workflow execution.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain containing the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain containing the workflow execution.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain containing the workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain containing the workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetWorkflowExecutionHistoryRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Specifies the workflow execution for which to return the history.
     *
     * @return Specifies the workflow execution for which to return the history.
     */
    public WorkflowExecution getExecution() {
        return execution;
    }
    
    /**
     * Specifies the workflow execution for which to return the history.
     *
     * @param execution Specifies the workflow execution for which to return the history.
     */
    public void setExecution(WorkflowExecution execution) {
        this.execution = execution;
    }
    
    /**
     * Specifies the workflow execution for which to return the history.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param execution Specifies the workflow execution for which to return the history.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetWorkflowExecutionHistoryRequest withExecution(WorkflowExecution execution) {
        this.execution = execution;
        return this;
    }

    /**
     * If a <code>NextPageToken</code> is returned, the result has more than
     * one pages. To get the next page, repeat the call and specify the
     * nextPageToken with all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return If a <code>NextPageToken</code> is returned, the result has more than
     *         one pages. To get the next page, repeat the call and specify the
     *         nextPageToken with all other arguments unchanged.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * If a <code>NextPageToken</code> is returned, the result has more than
     * one pages. To get the next page, repeat the call and specify the
     * nextPageToken with all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If a <code>NextPageToken</code> is returned, the result has more than
     *         one pages. To get the next page, repeat the call and specify the
     *         nextPageToken with all other arguments unchanged.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * If a <code>NextPageToken</code> is returned, the result has more than
     * one pages. To get the next page, repeat the call and specify the
     * nextPageToken with all other arguments unchanged.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If a <code>NextPageToken</code> is returned, the result has more than
     *         one pages. To get the next page, repeat the call and specify the
     *         nextPageToken with all other arguments unchanged.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetWorkflowExecutionHistoryRequest withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * Specifies the maximum number of history events returned in one page.
     * The next page in the result is identified by the
     * <code>NextPageToken</code> returned. By default 100 history events are
     * returned in a page but the caller can override this value to a page
     * size <i>smaller</i> than the default. You cannot specify a page size
     * larger than 100. Note that the number of events may be less than the
     * maxiumum page size, in which case, the returned page will have fewer
     * results than the maximumPageSize specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return Specifies the maximum number of history events returned in one page.
     *         The next page in the result is identified by the
     *         <code>NextPageToken</code> returned. By default 100 history events are
     *         returned in a page but the caller can override this value to a page
     *         size <i>smaller</i> than the default. You cannot specify a page size
     *         larger than 100. Note that the number of events may be less than the
     *         maxiumum page size, in which case, the returned page will have fewer
     *         results than the maximumPageSize specified.
     */
    public Integer getMaximumPageSize() {
        return maximumPageSize;
    }
    
    /**
     * Specifies the maximum number of history events returned in one page.
     * The next page in the result is identified by the
     * <code>NextPageToken</code> returned. By default 100 history events are
     * returned in a page but the caller can override this value to a page
     * size <i>smaller</i> than the default. You cannot specify a page size
     * larger than 100. Note that the number of events may be less than the
     * maxiumum page size, in which case, the returned page will have fewer
     * results than the maximumPageSize specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param maximumPageSize Specifies the maximum number of history events returned in one page.
     *         The next page in the result is identified by the
     *         <code>NextPageToken</code> returned. By default 100 history events are
     *         returned in a page but the caller can override this value to a page
     *         size <i>smaller</i> than the default. You cannot specify a page size
     *         larger than 100. Note that the number of events may be less than the
     *         maxiumum page size, in which case, the returned page will have fewer
     *         results than the maximumPageSize specified.
     */
    public void setMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
    }
    
    /**
     * Specifies the maximum number of history events returned in one page.
     * The next page in the result is identified by the
     * <code>NextPageToken</code> returned. By default 100 history events are
     * returned in a page but the caller can override this value to a page
     * size <i>smaller</i> than the default. You cannot specify a page size
     * larger than 100. Note that the number of events may be less than the
     * maxiumum page size, in which case, the returned page will have fewer
     * results than the maximumPageSize specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param maximumPageSize Specifies the maximum number of history events returned in one page.
     *         The next page in the result is identified by the
     *         <code>NextPageToken</code> returned. By default 100 history events are
     *         returned in a page but the caller can override this value to a page
     *         size <i>smaller</i> than the default. You cannot specify a page size
     *         larger than 100. Note that the number of events may be less than the
     *         maxiumum page size, in which case, the returned page will have fewer
     *         results than the maximumPageSize specified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetWorkflowExecutionHistoryRequest withMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }

    /**
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimeStamp</code> of the events.
     *
     * @return When set to <code>true</code>, returns the events in reverse order. By
     *         default the results are returned in ascending order of the
     *         <code>eventTimeStamp</code> of the events.
     */
    public Boolean isReverseOrder() {
        return reverseOrder;
    }
    
    /**
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimeStamp</code> of the events.
     *
     * @param reverseOrder When set to <code>true</code>, returns the events in reverse order. By
     *         default the results are returned in ascending order of the
     *         <code>eventTimeStamp</code> of the events.
     */
    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }
    
    /**
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimeStamp</code> of the events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reverseOrder When set to <code>true</code>, returns the events in reverse order. By
     *         default the results are returned in ascending order of the
     *         <code>eventTimeStamp</code> of the events.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetWorkflowExecutionHistoryRequest withReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
        return this;
    }

    /**
     * When set to <code>true</code>, returns the events in reverse order. By
     * default the results are returned in ascending order of the
     * <code>eventTimeStamp</code> of the events.
     *
     * @return When set to <code>true</code>, returns the events in reverse order. By
     *         default the results are returned in ascending order of the
     *         <code>eventTimeStamp</code> of the events.
     */
    public Boolean getReverseOrder() {
        return reverseOrder;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (getExecution() != null) sb.append("Execution: " + getExecution() + ",");
        if (getNextPageToken() != null) sb.append("NextPageToken: " + getNextPageToken() + ",");
        if (getMaximumPageSize() != null) sb.append("MaximumPageSize: " + getMaximumPageSize() + ",");
        if (isReverseOrder() != null) sb.append("ReverseOrder: " + isReverseOrder() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getExecution() == null) ? 0 : getExecution().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaximumPageSize() == null) ? 0 : getMaximumPageSize().hashCode()); 
        hashCode = prime * hashCode + ((isReverseOrder() == null) ? 0 : isReverseOrder().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetWorkflowExecutionHistoryRequest == false) return false;
        GetWorkflowExecutionHistoryRequest other = (GetWorkflowExecutionHistoryRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getExecution() == null ^ this.getExecution() == null) return false;
        if (other.getExecution() != null && other.getExecution().equals(this.getExecution()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        if (other.getMaximumPageSize() == null ^ this.getMaximumPageSize() == null) return false;
        if (other.getMaximumPageSize() != null && other.getMaximumPageSize().equals(this.getMaximumPageSize()) == false) return false; 
        if (other.isReverseOrder() == null ^ this.isReverseOrder() == null) return false;
        if (other.isReverseOrder() != null && other.isReverseOrder().equals(this.isReverseOrder()) == false) return false; 
        return true;
    }
    
}
    