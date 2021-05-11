/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListIncidentRecords" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIncidentRecordsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of each listed incident record.
     * </p>
     */
    private java.util.List<IncidentRecordSummary> incidentRecordSummaries;
    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The details of each listed incident record.
     * </p>
     * 
     * @return The details of each listed incident record.
     */

    public java.util.List<IncidentRecordSummary> getIncidentRecordSummaries() {
        return incidentRecordSummaries;
    }

    /**
     * <p>
     * The details of each listed incident record.
     * </p>
     * 
     * @param incidentRecordSummaries
     *        The details of each listed incident record.
     */

    public void setIncidentRecordSummaries(java.util.Collection<IncidentRecordSummary> incidentRecordSummaries) {
        if (incidentRecordSummaries == null) {
            this.incidentRecordSummaries = null;
            return;
        }

        this.incidentRecordSummaries = new java.util.ArrayList<IncidentRecordSummary>(incidentRecordSummaries);
    }

    /**
     * <p>
     * The details of each listed incident record.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncidentRecordSummaries(java.util.Collection)} or
     * {@link #withIncidentRecordSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param incidentRecordSummaries
     *        The details of each listed incident record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIncidentRecordsResult withIncidentRecordSummaries(IncidentRecordSummary... incidentRecordSummaries) {
        if (this.incidentRecordSummaries == null) {
            setIncidentRecordSummaries(new java.util.ArrayList<IncidentRecordSummary>(incidentRecordSummaries.length));
        }
        for (IncidentRecordSummary ele : incidentRecordSummaries) {
            this.incidentRecordSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of each listed incident record.
     * </p>
     * 
     * @param incidentRecordSummaries
     *        The details of each listed incident record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIncidentRecordsResult withIncidentRecordSummaries(java.util.Collection<IncidentRecordSummary> incidentRecordSummaries) {
        setIncidentRecordSummaries(incidentRecordSummaries);
        return this;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIncidentRecordsResult withNextToken(String nextToken) {
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
        if (getIncidentRecordSummaries() != null)
            sb.append("IncidentRecordSummaries: ").append(getIncidentRecordSummaries()).append(",");
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

        if (obj instanceof ListIncidentRecordsResult == false)
            return false;
        ListIncidentRecordsResult other = (ListIncidentRecordsResult) obj;
        if (other.getIncidentRecordSummaries() == null ^ this.getIncidentRecordSummaries() == null)
            return false;
        if (other.getIncidentRecordSummaries() != null && other.getIncidentRecordSummaries().equals(this.getIncidentRecordSummaries()) == false)
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

        hashCode = prime * hashCode + ((getIncidentRecordSummaries() == null) ? 0 : getIncidentRecordSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIncidentRecordsResult clone() {
        try {
            return (ListIncidentRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
