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
package com.amazonaws.services.support.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#describeCommunications(DescribeCommunicationsRequest) DescribeCommunications operation}.
 * <p>
 * This action returns communications regarding the support case. You can use the <i>AfterTime</i> and <i>BeforeTime</i> parameters to filter by date.
 * The <i>CaseId</i> parameter enables you to identify a specific case by its <i>CaseId</i> number.
 * </p>
 * <p>
 * The <i>MaxResults</i> and <i>NextToken</i> parameters enable you to control the pagination of the result set. Set <i>MaxResults</i> to the number of
 * cases you want displayed on each page, and use <i>NextToken</i> to specify the resumption of pagination.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#describeCommunications(DescribeCommunicationsRequest)
 */
public class DescribeCommunicationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    private String caseId;

    /**
     * End date for a filtered date search on support case communications.
     */
    private String beforeTime;

    /**
     * Start date for a filtered date search on support case communications.
     */
    private String afterTime;

    /**
     * Defines a resumption point for pagination.
     */
    private String nextToken;

    /**
     * Integer that sets the maximum number of results to return before
     * paginating.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     */
    private Integer maxResults;

    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @return String that indicates the AWS Support caseID requested or returned in
     *         the call. The caseID is an alphanumeric string formatted as shown in
     *         this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    public String getCaseId() {
        return caseId;
    }
    
    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @param caseId String that indicates the AWS Support caseID requested or returned in
     *         the call. The caseID is an alphanumeric string formatted as shown in
     *         this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }
    
    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param caseId String that indicates the AWS Support caseID requested or returned in
     *         the call. The caseID is an alphanumeric string formatted as shown in
     *         this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommunicationsRequest withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * End date for a filtered date search on support case communications.
     *
     * @return End date for a filtered date search on support case communications.
     */
    public String getBeforeTime() {
        return beforeTime;
    }
    
    /**
     * End date for a filtered date search on support case communications.
     *
     * @param beforeTime End date for a filtered date search on support case communications.
     */
    public void setBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
    }
    
    /**
     * End date for a filtered date search on support case communications.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param beforeTime End date for a filtered date search on support case communications.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommunicationsRequest withBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }

    /**
     * Start date for a filtered date search on support case communications.
     *
     * @return Start date for a filtered date search on support case communications.
     */
    public String getAfterTime() {
        return afterTime;
    }
    
    /**
     * Start date for a filtered date search on support case communications.
     *
     * @param afterTime Start date for a filtered date search on support case communications.
     */
    public void setAfterTime(String afterTime) {
        this.afterTime = afterTime;
    }
    
    /**
     * Start date for a filtered date search on support case communications.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param afterTime Start date for a filtered date search on support case communications.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommunicationsRequest withAfterTime(String afterTime) {
        this.afterTime = afterTime;
        return this;
    }

    /**
     * Defines a resumption point for pagination.
     *
     * @return Defines a resumption point for pagination.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Defines a resumption point for pagination.
     *
     * @param nextToken Defines a resumption point for pagination.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Defines a resumption point for pagination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Defines a resumption point for pagination.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommunicationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Integer that sets the maximum number of results to return before
     * paginating.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @return Integer that sets the maximum number of results to return before
     *         paginating.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * Integer that sets the maximum number of results to return before
     * paginating.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults Integer that sets the maximum number of results to return before
     *         paginating.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * Integer that sets the maximum number of results to return before
     * paginating.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults Integer that sets the maximum number of results to return before
     *         paginating.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommunicationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
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
        if (getCaseId() != null) sb.append("CaseId: " + getCaseId() + ",");
        if (getBeforeTime() != null) sb.append("BeforeTime: " + getBeforeTime() + ",");
        if (getAfterTime() != null) sb.append("AfterTime: " + getAfterTime() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCommunicationsRequest == false) return false;
        DescribeCommunicationsRequest other = (DescribeCommunicationsRequest)obj;
        
        if (other.getCaseId() == null ^ this.getCaseId() == null) return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false) return false; 
        if (other.getBeforeTime() == null ^ this.getBeforeTime() == null) return false;
        if (other.getBeforeTime() != null && other.getBeforeTime().equals(this.getBeforeTime()) == false) return false; 
        if (other.getAfterTime() == null ^ this.getAfterTime() == null) return false;
        if (other.getAfterTime() != null && other.getAfterTime().equals(this.getAfterTime()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
}
    