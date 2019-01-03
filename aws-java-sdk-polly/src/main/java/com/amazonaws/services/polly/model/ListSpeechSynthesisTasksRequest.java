/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListSpeechSynthesisTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSpeechSynthesisTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Maximum number of speech synthesis tasks returned in a List operation.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of speech synthesis tasks.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     */
    private String status;

    /**
     * <p>
     * Maximum number of speech synthesis tasks returned in a List operation.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of speech synthesis tasks returned in a List operation.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of speech synthesis tasks returned in a List operation.
     * </p>
     * 
     * @return Maximum number of speech synthesis tasks returned in a List operation.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of speech synthesis tasks returned in a List operation.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of speech synthesis tasks returned in a List operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSpeechSynthesisTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of speech synthesis tasks.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use in the next request to continue the listing of speech synthesis tasks.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of speech synthesis tasks.
     * </p>
     * 
     * @return The pagination token to use in the next request to continue the listing of speech synthesis tasks.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing of speech synthesis tasks.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use in the next request to continue the listing of speech synthesis tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSpeechSynthesisTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     * 
     * @param status
     *        Status of the speech synthesis tasks returned in a List operation
     * @see TaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     * 
     * @return Status of the speech synthesis tasks returned in a List operation
     * @see TaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     * 
     * @param status
     *        Status of the speech synthesis tasks returned in a List operation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public ListSpeechSynthesisTasksRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the speech synthesis tasks returned in a List operation
     * </p>
     * 
     * @param status
     *        Status of the speech synthesis tasks returned in a List operation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public ListSpeechSynthesisTasksRequest withStatus(TaskStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSpeechSynthesisTasksRequest == false)
            return false;
        ListSpeechSynthesisTasksRequest other = (ListSpeechSynthesisTasksRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListSpeechSynthesisTasksRequest clone() {
        return (ListSpeechSynthesisTasksRequest) super.clone();
    }

}
