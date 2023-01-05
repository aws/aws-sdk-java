/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListDatalakeExceptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatalakeExceptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Lists the failures that cannot be retried in the current Region.
     * </p>
     */
    private java.util.List<FailuresResponse> nonRetryableFailures;

    /**
     * <p>
     * List if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        List if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged. </p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *        InvalidToken error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * List if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @return List if there are more results available. The value of nextToken is a unique pagination token for each
     *         page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *         unchanged. </p>
     *         <p>
     *         Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *         InvalidToken error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * List if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        List if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged. </p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *        InvalidToken error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatalakeExceptionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Lists the failures that cannot be retried in the current Region.
     * </p>
     * 
     * @return Lists the failures that cannot be retried in the current Region.
     */

    public java.util.List<FailuresResponse> getNonRetryableFailures() {
        return nonRetryableFailures;
    }

    /**
     * <p>
     * Lists the failures that cannot be retried in the current Region.
     * </p>
     * 
     * @param nonRetryableFailures
     *        Lists the failures that cannot be retried in the current Region.
     */

    public void setNonRetryableFailures(java.util.Collection<FailuresResponse> nonRetryableFailures) {
        if (nonRetryableFailures == null) {
            this.nonRetryableFailures = null;
            return;
        }

        this.nonRetryableFailures = new java.util.ArrayList<FailuresResponse>(nonRetryableFailures);
    }

    /**
     * <p>
     * Lists the failures that cannot be retried in the current Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNonRetryableFailures(java.util.Collection)} or {@link #withNonRetryableFailures(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param nonRetryableFailures
     *        Lists the failures that cannot be retried in the current Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatalakeExceptionsResult withNonRetryableFailures(FailuresResponse... nonRetryableFailures) {
        if (this.nonRetryableFailures == null) {
            setNonRetryableFailures(new java.util.ArrayList<FailuresResponse>(nonRetryableFailures.length));
        }
        for (FailuresResponse ele : nonRetryableFailures) {
            this.nonRetryableFailures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the failures that cannot be retried in the current Region.
     * </p>
     * 
     * @param nonRetryableFailures
     *        Lists the failures that cannot be retried in the current Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatalakeExceptionsResult withNonRetryableFailures(java.util.Collection<FailuresResponse> nonRetryableFailures) {
        setNonRetryableFailures(nonRetryableFailures);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getNonRetryableFailures() != null)
            sb.append("NonRetryableFailures: ").append(getNonRetryableFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatalakeExceptionsResult == false)
            return false;
        ListDatalakeExceptionsResult other = (ListDatalakeExceptionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNonRetryableFailures() == null ^ this.getNonRetryableFailures() == null)
            return false;
        if (other.getNonRetryableFailures() != null && other.getNonRetryableFailures().equals(this.getNonRetryableFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNonRetryableFailures() == null) ? 0 : getNonRetryableFailures().hashCode());
        return hashCode;
    }

    @Override
    public ListDatalakeExceptionsResult clone() {
        try {
            return (ListDatalakeExceptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
