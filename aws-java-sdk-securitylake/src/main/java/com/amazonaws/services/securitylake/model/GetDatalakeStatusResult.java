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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDatalakeStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of enabled accounts and enabled sources.
     * </p>
     */
    private java.util.List<AccountSources> accountSourcesList;
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
     * The list of enabled accounts and enabled sources.
     * </p>
     * 
     * @return The list of enabled accounts and enabled sources.
     */

    public java.util.List<AccountSources> getAccountSourcesList() {
        return accountSourcesList;
    }

    /**
     * <p>
     * The list of enabled accounts and enabled sources.
     * </p>
     * 
     * @param accountSourcesList
     *        The list of enabled accounts and enabled sources.
     */

    public void setAccountSourcesList(java.util.Collection<AccountSources> accountSourcesList) {
        if (accountSourcesList == null) {
            this.accountSourcesList = null;
            return;
        }

        this.accountSourcesList = new java.util.ArrayList<AccountSources>(accountSourcesList);
    }

    /**
     * <p>
     * The list of enabled accounts and enabled sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountSourcesList(java.util.Collection)} or {@link #withAccountSourcesList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accountSourcesList
     *        The list of enabled accounts and enabled sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeStatusResult withAccountSourcesList(AccountSources... accountSourcesList) {
        if (this.accountSourcesList == null) {
            setAccountSourcesList(new java.util.ArrayList<AccountSources>(accountSourcesList.length));
        }
        for (AccountSources ele : accountSourcesList) {
            this.accountSourcesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of enabled accounts and enabled sources.
     * </p>
     * 
     * @param accountSourcesList
     *        The list of enabled accounts and enabled sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeStatusResult withAccountSourcesList(java.util.Collection<AccountSources> accountSourcesList) {
        setAccountSourcesList(accountSourcesList);
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

    public GetDatalakeStatusResult withNextToken(String nextToken) {
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
        if (getAccountSourcesList() != null)
            sb.append("AccountSourcesList: ").append(getAccountSourcesList()).append(",");
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

        if (obj instanceof GetDatalakeStatusResult == false)
            return false;
        GetDatalakeStatusResult other = (GetDatalakeStatusResult) obj;
        if (other.getAccountSourcesList() == null ^ this.getAccountSourcesList() == null)
            return false;
        if (other.getAccountSourcesList() != null && other.getAccountSourcesList().equals(this.getAccountSourcesList()) == false)
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

        hashCode = prime * hashCode + ((getAccountSourcesList() == null) ? 0 : getAccountSourcesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDatalakeStatusResult clone() {
        try {
            return (GetDatalakeStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
