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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDataLakeSources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataLakeSourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     * including enabled accounts and log sources, is retrieved.
     * </p>
     */
    private java.util.List<String> accounts;
    /**
     * <p>
     * The maximum limit of accounts for which the static snapshot of the current Region, including enabled accounts and
     * log sources, is retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
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
     * The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     * including enabled accounts and log sources, is retrieved.
     * </p>
     * 
     * @return The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     *         including enabled accounts and log sources, is retrieved.
     */

    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     * including enabled accounts and log sources, is retrieved.
     * </p>
     * 
     * @param accounts
     *        The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     *        including enabled accounts and log sources, is retrieved.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<String>(accounts);
    }

    /**
     * <p>
     * The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     * including enabled accounts and log sources, is retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     *        including enabled accounts and log sources, is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataLakeSourcesRequest withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     * including enabled accounts and log sources, is retrieved.
     * </p>
     * 
     * @param accounts
     *        The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     *        including enabled accounts and log sources, is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataLakeSourcesRequest withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * The maximum limit of accounts for which the static snapshot of the current Region, including enabled accounts and
     * log sources, is retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum limit of accounts for which the static snapshot of the current Region, including enabled
     *        accounts and log sources, is retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum limit of accounts for which the static snapshot of the current Region, including enabled accounts and
     * log sources, is retrieved.
     * </p>
     * 
     * @return The maximum limit of accounts for which the static snapshot of the current Region, including enabled
     *         accounts and log sources, is retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum limit of accounts for which the static snapshot of the current Region, including enabled accounts and
     * log sources, is retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum limit of accounts for which the static snapshot of the current Region, including enabled
     *        accounts and log sources, is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataLakeSourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *        InvalidToken error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @return Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *         page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *         unchanged.</p>
     *         <p>
     *         Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *         InvalidToken error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Lists if there are more results available. The value of nextToken is a unique pagination token for each page.
     * Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * <p>
     * Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     * InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        Lists if there are more results available. The value of nextToken is a unique pagination token for each
     *        page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *        InvalidToken error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataLakeSourcesRequest withNextToken(String nextToken) {
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
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetDataLakeSourcesRequest == false)
            return false;
        GetDataLakeSourcesRequest other = (GetDataLakeSourcesRequest) obj;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDataLakeSourcesRequest clone() {
        return (GetDataLakeSourcesRequest) super.clone();
    }

}
