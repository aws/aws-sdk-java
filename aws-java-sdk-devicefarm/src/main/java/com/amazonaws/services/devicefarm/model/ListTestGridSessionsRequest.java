/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTestGridSessions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestGridSessionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of a <a>TestGridProject</a>.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * Return only sessions in this state.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Return only sessions created after this time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Return only sessions created before this time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Return only sessions that ended after this time.
     * </p>
     */
    private java.util.Date endTimeAfter;
    /**
     * <p>
     * Return only sessions that ended before this time.
     * </p>
     */
    private java.util.Date endTimeBefore;
    /**
     * <p>
     * Return only this many results at a time.
     * </p>
     */
    private Integer maxResult;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * ARN of a <a>TestGridProject</a>.
     * </p>
     * 
     * @param projectArn
     *        ARN of a <a>TestGridProject</a>.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * ARN of a <a>TestGridProject</a>.
     * </p>
     * 
     * @return ARN of a <a>TestGridProject</a>.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * ARN of a <a>TestGridProject</a>.
     * </p>
     * 
     * @param projectArn
     *        ARN of a <a>TestGridProject</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionsRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * Return only sessions in this state.
     * </p>
     * 
     * @param status
     *        Return only sessions in this state.
     * @see TestGridSessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Return only sessions in this state.
     * </p>
     * 
     * @return Return only sessions in this state.
     * @see TestGridSessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Return only sessions in this state.
     * </p>
     * 
     * @param status
     *        Return only sessions in this state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestGridSessionStatus
     */

    public ListTestGridSessionsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Return only sessions in this state.
     * </p>
     * 
     * @param status
     *        Return only sessions in this state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestGridSessionStatus
     */

    public ListTestGridSessionsRequest withStatus(TestGridSessionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Return only sessions created after this time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Return only sessions created after this time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Return only sessions created after this time.
     * </p>
     * 
     * @return Return only sessions created after this time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Return only sessions created after this time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Return only sessions created after this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Return only sessions created before this time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Return only sessions created before this time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Return only sessions created before this time.
     * </p>
     * 
     * @return Return only sessions created before this time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Return only sessions created before this time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Return only sessions created before this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Return only sessions that ended after this time.
     * </p>
     * 
     * @param endTimeAfter
     *        Return only sessions that ended after this time.
     */

    public void setEndTimeAfter(java.util.Date endTimeAfter) {
        this.endTimeAfter = endTimeAfter;
    }

    /**
     * <p>
     * Return only sessions that ended after this time.
     * </p>
     * 
     * @return Return only sessions that ended after this time.
     */

    public java.util.Date getEndTimeAfter() {
        return this.endTimeAfter;
    }

    /**
     * <p>
     * Return only sessions that ended after this time.
     * </p>
     * 
     * @param endTimeAfter
     *        Return only sessions that ended after this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionsRequest withEndTimeAfter(java.util.Date endTimeAfter) {
        setEndTimeAfter(endTimeAfter);
        return this;
    }

    /**
     * <p>
     * Return only sessions that ended before this time.
     * </p>
     * 
     * @param endTimeBefore
     *        Return only sessions that ended before this time.
     */

    public void setEndTimeBefore(java.util.Date endTimeBefore) {
        this.endTimeBefore = endTimeBefore;
    }

    /**
     * <p>
     * Return only sessions that ended before this time.
     * </p>
     * 
     * @return Return only sessions that ended before this time.
     */

    public java.util.Date getEndTimeBefore() {
        return this.endTimeBefore;
    }

    /**
     * <p>
     * Return only sessions that ended before this time.
     * </p>
     * 
     * @param endTimeBefore
     *        Return only sessions that ended before this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionsRequest withEndTimeBefore(java.util.Date endTimeBefore) {
        setEndTimeBefore(endTimeBefore);
        return this;
    }

    /**
     * <p>
     * Return only this many results at a time.
     * </p>
     * 
     * @param maxResult
     *        Return only this many results at a time.
     */

    public void setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
    }

    /**
     * <p>
     * Return only this many results at a time.
     * </p>
     * 
     * @return Return only this many results at a time.
     */

    public Integer getMaxResult() {
        return this.maxResult;
    }

    /**
     * <p>
     * Return only this many results at a time.
     * </p>
     * 
     * @param maxResult
     *        Return only this many results at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionsRequest withMaxResult(Integer maxResult) {
        setMaxResult(maxResult);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridSessionsRequest withNextToken(String nextToken) {
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getEndTimeAfter() != null)
            sb.append("EndTimeAfter: ").append(getEndTimeAfter()).append(",");
        if (getEndTimeBefore() != null)
            sb.append("EndTimeBefore: ").append(getEndTimeBefore()).append(",");
        if (getMaxResult() != null)
            sb.append("MaxResult: ").append(getMaxResult()).append(",");
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

        if (obj instanceof ListTestGridSessionsRequest == false)
            return false;
        ListTestGridSessionsRequest other = (ListTestGridSessionsRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getEndTimeAfter() == null ^ this.getEndTimeAfter() == null)
            return false;
        if (other.getEndTimeAfter() != null && other.getEndTimeAfter().equals(this.getEndTimeAfter()) == false)
            return false;
        if (other.getEndTimeBefore() == null ^ this.getEndTimeBefore() == null)
            return false;
        if (other.getEndTimeBefore() != null && other.getEndTimeBefore().equals(this.getEndTimeBefore()) == false)
            return false;
        if (other.getMaxResult() == null ^ this.getMaxResult() == null)
            return false;
        if (other.getMaxResult() != null && other.getMaxResult().equals(this.getMaxResult()) == false)
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

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getEndTimeAfter() == null) ? 0 : getEndTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getEndTimeBefore() == null) ? 0 : getEndTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getMaxResult() == null) ? 0 : getMaxResult().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestGridSessionsRequest clone() {
        return (ListTestGridSessionsRequest) super.clone();
    }

}
