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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListFraudsters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFraudstersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that contains details about each fraudster in the Amazon Web Services account.
     * </p>
     */
    private java.util.List<FraudsterSummary> fraudsterSummaries;
    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that contains details about each fraudster in the Amazon Web Services account.
     * </p>
     * 
     * @return A list that contains details about each fraudster in the Amazon Web Services account.
     */

    public java.util.List<FraudsterSummary> getFraudsterSummaries() {
        return fraudsterSummaries;
    }

    /**
     * <p>
     * A list that contains details about each fraudster in the Amazon Web Services account.
     * </p>
     * 
     * @param fraudsterSummaries
     *        A list that contains details about each fraudster in the Amazon Web Services account.
     */

    public void setFraudsterSummaries(java.util.Collection<FraudsterSummary> fraudsterSummaries) {
        if (fraudsterSummaries == null) {
            this.fraudsterSummaries = null;
            return;
        }

        this.fraudsterSummaries = new java.util.ArrayList<FraudsterSummary>(fraudsterSummaries);
    }

    /**
     * <p>
     * A list that contains details about each fraudster in the Amazon Web Services account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFraudsterSummaries(java.util.Collection)} or {@link #withFraudsterSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param fraudsterSummaries
     *        A list that contains details about each fraudster in the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFraudstersResult withFraudsterSummaries(FraudsterSummary... fraudsterSummaries) {
        if (this.fraudsterSummaries == null) {
            setFraudsterSummaries(new java.util.ArrayList<FraudsterSummary>(fraudsterSummaries.length));
        }
        for (FraudsterSummary ele : fraudsterSummaries) {
            this.fraudsterSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains details about each fraudster in the Amazon Web Services account.
     * </p>
     * 
     * @param fraudsterSummaries
     *        A list that contains details about each fraudster in the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFraudstersResult withFraudsterSummaries(java.util.Collection<FraudsterSummary> fraudsterSummaries) {
        setFraudsterSummaries(fraudsterSummaries);
        return this;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @return If <code>NextToken</code> is returned, there are more results available. The value of
     *         <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *         24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFraudstersResult withNextToken(String nextToken) {
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
        if (getFraudsterSummaries() != null)
            sb.append("FraudsterSummaries: ").append(getFraudsterSummaries()).append(",");
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

        if (obj instanceof ListFraudstersResult == false)
            return false;
        ListFraudstersResult other = (ListFraudstersResult) obj;
        if (other.getFraudsterSummaries() == null ^ this.getFraudsterSummaries() == null)
            return false;
        if (other.getFraudsterSummaries() != null && other.getFraudsterSummaries().equals(this.getFraudsterSummaries()) == false)
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

        hashCode = prime * hashCode + ((getFraudsterSummaries() == null) ? 0 : getFraudsterSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFraudstersResult clone() {
        try {
            return (ListFraudstersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
