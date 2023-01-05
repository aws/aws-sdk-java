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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDatalakeStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     * including enabled accounts and log sources, is retrieved.
     * </p>
     */
    private java.util.List<String> accountSet;
    /**
     * <p>
     * The maximum limit of accounts for which the static snapshot of the current Region, including enabled accounts and
     * log sources, is retrieved.
     * </p>
     */
    private Integer maxAccountResults;
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

    public java.util.List<String> getAccountSet() {
        return accountSet;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     * including enabled accounts and log sources, is retrieved.
     * </p>
     * 
     * @param accountSet
     *        The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     *        including enabled accounts and log sources, is retrieved.
     */

    public void setAccountSet(java.util.Collection<String> accountSet) {
        if (accountSet == null) {
            this.accountSet = null;
            return;
        }

        this.accountSet = new java.util.ArrayList<String>(accountSet);
    }

    /**
     * <p>
     * The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     * including enabled accounts and log sources, is retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountSet(java.util.Collection)} or {@link #withAccountSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountSet
     *        The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     *        including enabled accounts and log sources, is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeStatusRequest withAccountSet(String... accountSet) {
        if (this.accountSet == null) {
            setAccountSet(new java.util.ArrayList<String>(accountSet.length));
        }
        for (String ele : accountSet) {
            this.accountSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     * including enabled accounts and log sources, is retrieved.
     * </p>
     * 
     * @param accountSet
     *        The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region,
     *        including enabled accounts and log sources, is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeStatusRequest withAccountSet(java.util.Collection<String> accountSet) {
        setAccountSet(accountSet);
        return this;
    }

    /**
     * <p>
     * The maximum limit of accounts for which the static snapshot of the current Region, including enabled accounts and
     * log sources, is retrieved.
     * </p>
     * 
     * @param maxAccountResults
     *        The maximum limit of accounts for which the static snapshot of the current Region, including enabled
     *        accounts and log sources, is retrieved.
     */

    public void setMaxAccountResults(Integer maxAccountResults) {
        this.maxAccountResults = maxAccountResults;
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

    public Integer getMaxAccountResults() {
        return this.maxAccountResults;
    }

    /**
     * <p>
     * The maximum limit of accounts for which the static snapshot of the current Region, including enabled accounts and
     * log sources, is retrieved.
     * </p>
     * 
     * @param maxAccountResults
     *        The maximum limit of accounts for which the static snapshot of the current Region, including enabled
     *        accounts and log sources, is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeStatusRequest withMaxAccountResults(Integer maxAccountResults) {
        setMaxAccountResults(maxAccountResults);
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
     *        unchanged. </p>
     *        <p>
     *        Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400
     *        InvalidToken error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeStatusRequest withNextToken(String nextToken) {
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
        if (getAccountSet() != null)
            sb.append("AccountSet: ").append(getAccountSet()).append(",");
        if (getMaxAccountResults() != null)
            sb.append("MaxAccountResults: ").append(getMaxAccountResults()).append(",");
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

        if (obj instanceof GetDatalakeStatusRequest == false)
            return false;
        GetDatalakeStatusRequest other = (GetDatalakeStatusRequest) obj;
        if (other.getAccountSet() == null ^ this.getAccountSet() == null)
            return false;
        if (other.getAccountSet() != null && other.getAccountSet().equals(this.getAccountSet()) == false)
            return false;
        if (other.getMaxAccountResults() == null ^ this.getMaxAccountResults() == null)
            return false;
        if (other.getMaxAccountResults() != null && other.getMaxAccountResults().equals(this.getMaxAccountResults()) == false)
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

        hashCode = prime * hashCode + ((getAccountSet() == null) ? 0 : getAccountSet().hashCode());
        hashCode = prime * hashCode + ((getMaxAccountResults() == null) ? 0 : getMaxAccountResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDatalakeStatusRequest clone() {
        return (GetDatalakeStatusRequest) super.clone();
    }

}
