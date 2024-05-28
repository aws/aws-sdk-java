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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindingHistory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of events that altered the specified finding during the specified time period.
     * </p>
     */
    private java.util.List<FindingHistoryRecord> records;
    /**
     * <p>
     * A token for pagination purposes. Provide this token in the subsequent request to <code>GetFindingsHistory</code>
     * to get up to an additional 100 results of history for the same finding that you specified in your initial
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of events that altered the specified finding during the specified time period.
     * </p>
     * 
     * @return A list of events that altered the specified finding during the specified time period.
     */

    public java.util.List<FindingHistoryRecord> getRecords() {
        return records;
    }

    /**
     * <p>
     * A list of events that altered the specified finding during the specified time period.
     * </p>
     * 
     * @param records
     *        A list of events that altered the specified finding during the specified time period.
     */

    public void setRecords(java.util.Collection<FindingHistoryRecord> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<FindingHistoryRecord>(records);
    }

    /**
     * <p>
     * A list of events that altered the specified finding during the specified time period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        A list of events that altered the specified finding during the specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingHistoryResult withRecords(FindingHistoryRecord... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<FindingHistoryRecord>(records.length));
        }
        for (FindingHistoryRecord ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of events that altered the specified finding during the specified time period.
     * </p>
     * 
     * @param records
     *        A list of events that altered the specified finding during the specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingHistoryResult withRecords(java.util.Collection<FindingHistoryRecord> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * A token for pagination purposes. Provide this token in the subsequent request to <code>GetFindingsHistory</code>
     * to get up to an additional 100 results of history for the same finding that you specified in your initial
     * request.
     * </p>
     * 
     * @param nextToken
     *        A token for pagination purposes. Provide this token in the subsequent request to
     *        <code>GetFindingsHistory</code> to get up to an additional 100 results of history for the same finding
     *        that you specified in your initial request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for pagination purposes. Provide this token in the subsequent request to <code>GetFindingsHistory</code>
     * to get up to an additional 100 results of history for the same finding that you specified in your initial
     * request.
     * </p>
     * 
     * @return A token for pagination purposes. Provide this token in the subsequent request to
     *         <code>GetFindingsHistory</code> to get up to an additional 100 results of history for the same finding
     *         that you specified in your initial request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for pagination purposes. Provide this token in the subsequent request to <code>GetFindingsHistory</code>
     * to get up to an additional 100 results of history for the same finding that you specified in your initial
     * request.
     * </p>
     * 
     * @param nextToken
     *        A token for pagination purposes. Provide this token in the subsequent request to
     *        <code>GetFindingsHistory</code> to get up to an additional 100 results of history for the same finding
     *        that you specified in your initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingHistoryResult withNextToken(String nextToken) {
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
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
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

        if (obj instanceof GetFindingHistoryResult == false)
            return false;
        GetFindingHistoryResult other = (GetFindingHistoryResult) obj;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
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

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingHistoryResult clone() {
        try {
            return (GetFindingHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
