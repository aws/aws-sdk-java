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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCommunications" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCommunicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     */
    private String caseId;
    /**
     * <p>
     * The end date for a filtered date search on support case communications. Case communications are available for 12
     * months after creation.
     * </p>
     */
    private String beforeTime;
    /**
     * <p>
     * The start date for a filtered date search on support case communications. Case communications are available for
     * 12 months after creation.
     * </p>
     */
    private String afterTime;
    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @param caseId
     *        The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted
     *        as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @return The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string
     *         formatted as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */

    public String getCaseId() {
        return this.caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @param caseId
     *        The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted
     *        as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommunicationsRequest withCaseId(String caseId) {
        setCaseId(caseId);
        return this;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications. Case communications are available for 12
     * months after creation.
     * </p>
     * 
     * @param beforeTime
     *        The end date for a filtered date search on support case communications. Case communications are available
     *        for 12 months after creation.
     */

    public void setBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications. Case communications are available for 12
     * months after creation.
     * </p>
     * 
     * @return The end date for a filtered date search on support case communications. Case communications are available
     *         for 12 months after creation.
     */

    public String getBeforeTime() {
        return this.beforeTime;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications. Case communications are available for 12
     * months after creation.
     * </p>
     * 
     * @param beforeTime
     *        The end date for a filtered date search on support case communications. Case communications are available
     *        for 12 months after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommunicationsRequest withBeforeTime(String beforeTime) {
        setBeforeTime(beforeTime);
        return this;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications. Case communications are available for
     * 12 months after creation.
     * </p>
     * 
     * @param afterTime
     *        The start date for a filtered date search on support case communications. Case communications are
     *        available for 12 months after creation.
     */

    public void setAfterTime(String afterTime) {
        this.afterTime = afterTime;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications. Case communications are available for
     * 12 months after creation.
     * </p>
     * 
     * @return The start date for a filtered date search on support case communications. Case communications are
     *         available for 12 months after creation.
     */

    public String getAfterTime() {
        return this.afterTime;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications. Case communications are available for
     * 12 months after creation.
     * </p>
     * 
     * @param afterTime
     *        The start date for a filtered date search on support case communications. Case communications are
     *        available for 12 months after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommunicationsRequest withAfterTime(String afterTime) {
        setAfterTime(afterTime);
        return this;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @param nextToken
     *        A resumption point for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @return A resumption point for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @param nextToken
     *        A resumption point for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommunicationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return before paginating.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * 
     * @return The maximum number of results to return before paginating.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return before paginating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommunicationsRequest withMaxResults(Integer maxResults) {
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
        if (getCaseId() != null)
            sb.append("CaseId: ").append(getCaseId()).append(",");
        if (getBeforeTime() != null)
            sb.append("BeforeTime: ").append(getBeforeTime()).append(",");
        if (getAfterTime() != null)
            sb.append("AfterTime: ").append(getAfterTime()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof DescribeCommunicationsRequest == false)
            return false;
        DescribeCommunicationsRequest other = (DescribeCommunicationsRequest) obj;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getBeforeTime() == null ^ this.getBeforeTime() == null)
            return false;
        if (other.getBeforeTime() != null && other.getBeforeTime().equals(this.getBeforeTime()) == false)
            return false;
        if (other.getAfterTime() == null ^ this.getAfterTime() == null)
            return false;
        if (other.getAfterTime() != null && other.getAfterTime().equals(this.getAfterTime()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode + ((getBeforeTime() == null) ? 0 : getBeforeTime().hashCode());
        hashCode = prime * hashCode + ((getAfterTime() == null) ? 0 : getAfterTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCommunicationsRequest clone() {
        return (DescribeCommunicationsRequest) super.clone();
    }

}
