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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListWorkersWithQualificationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkersWithQualificationTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Qualification type of the Qualifications to return.
     * </p>
     */
    private String qualificationTypeId;
    /**
     * <p>
     * The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Pagination Token
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the Qualification type of the Qualifications to return.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type of the Qualifications to return.
     */

    public void setQualificationTypeId(String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type of the Qualifications to return.
     * </p>
     * 
     * @return The ID of the Qualification type of the Qualifications to return.
     */

    public String getQualificationTypeId() {
        return this.qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type of the Qualifications to return.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type of the Qualifications to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkersWithQualificationTypeRequest withQualificationTypeId(String qualificationTypeId) {
        setQualificationTypeId(qualificationTypeId);
        return this;
    }

    /**
     * <p>
     * The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * </p>
     * 
     * @param status
     *        The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * @see QualificationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * </p>
     * 
     * @return The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * @see QualificationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * </p>
     * 
     * @param status
     *        The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualificationStatus
     */

    public ListWorkersWithQualificationTypeRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * </p>
     * 
     * @param status
     *        The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * @see QualificationStatus
     */

    public void setStatus(QualificationStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * </p>
     * 
     * @param status
     *        The status of the Qualifications to return. Can be <code>Granted | Revoked</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualificationStatus
     */

    public ListWorkersWithQualificationTypeRequest withStatus(QualificationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Pagination Token
     * </p>
     * 
     * @param nextToken
     *        Pagination Token
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination Token
     * </p>
     * 
     * @return Pagination Token
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination Token
     * </p>
     * 
     * @param nextToken
     *        Pagination Token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkersWithQualificationTypeRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     * 
     * @param maxResults
     *        Limit the number of results returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     * 
     * @return Limit the number of results returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     * 
     * @param maxResults
     *        Limit the number of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkersWithQualificationTypeRequest withMaxResults(Integer maxResults) {
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
        if (getQualificationTypeId() != null)
            sb.append("QualificationTypeId: ").append(getQualificationTypeId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof ListWorkersWithQualificationTypeRequest == false)
            return false;
        ListWorkersWithQualificationTypeRequest other = (ListWorkersWithQualificationTypeRequest) obj;
        if (other.getQualificationTypeId() == null ^ this.getQualificationTypeId() == null)
            return false;
        if (other.getQualificationTypeId() != null && other.getQualificationTypeId().equals(this.getQualificationTypeId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getQualificationTypeId() == null) ? 0 : getQualificationTypeId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkersWithQualificationTypeRequest clone() {
        return (ListWorkersWithQualificationTypeRequest) super.clone();
    }

}
