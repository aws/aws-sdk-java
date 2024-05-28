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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ListMessageMoveTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMessageMoveTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the queue whose message movement tasks are to be listed.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The maximum number of results to include in the response. The default is 1, which provides the most recent
     * message movement task. The upper limit is 10.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of the queue whose message movement tasks are to be listed.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the queue whose message movement tasks are to be listed.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The ARN of the queue whose message movement tasks are to be listed.
     * </p>
     * 
     * @return The ARN of the queue whose message movement tasks are to be listed.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The ARN of the queue whose message movement tasks are to be listed.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the queue whose message movement tasks are to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. The default is 1, which provides the most recent
     * message movement task. The upper limit is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. The default is 1, which provides the most recent
     *        message movement task. The upper limit is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. The default is 1, which provides the most recent
     * message movement task. The upper limit is 10.
     * </p>
     * 
     * @return The maximum number of results to include in the response. The default is 1, which provides the most
     *         recent message movement task. The upper limit is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. The default is 1, which provides the most recent
     * message movement task. The upper limit is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. The default is 1, which provides the most recent
     *        message movement task. The upper limit is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMessageMoveTasksRequest == false)
            return false;
        ListMessageMoveTasksRequest other = (ListMessageMoveTasksRequest) obj;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListMessageMoveTasksRequest clone() {
        return (ListMessageMoveTasksRequest) super.clone();
    }

}
