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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a ListGitHubAccountTokenNames operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListGitHubAccountTokenNames"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGitHubAccountTokenNamesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of names of connections to GitHub accounts.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tokenNameList;
    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent
     * ListGitHubAccountTokenNames call to return the next set of names in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of names of connections to GitHub accounts.
     * </p>
     * 
     * @return A list of names of connections to GitHub accounts.
     */

    public java.util.List<String> getTokenNameList() {
        if (tokenNameList == null) {
            tokenNameList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tokenNameList;
    }

    /**
     * <p>
     * A list of names of connections to GitHub accounts.
     * </p>
     * 
     * @param tokenNameList
     *        A list of names of connections to GitHub accounts.
     */

    public void setTokenNameList(java.util.Collection<String> tokenNameList) {
        if (tokenNameList == null) {
            this.tokenNameList = null;
            return;
        }

        this.tokenNameList = new com.amazonaws.internal.SdkInternalList<String>(tokenNameList);
    }

    /**
     * <p>
     * A list of names of connections to GitHub accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenNameList(java.util.Collection)} or {@link #withTokenNameList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tokenNameList
     *        A list of names of connections to GitHub accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGitHubAccountTokenNamesResult withTokenNameList(String... tokenNameList) {
        if (this.tokenNameList == null) {
            setTokenNameList(new com.amazonaws.internal.SdkInternalList<String>(tokenNameList.length));
        }
        for (String ele : tokenNameList) {
            this.tokenNameList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of connections to GitHub accounts.
     * </p>
     * 
     * @param tokenNameList
     *        A list of names of connections to GitHub accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGitHubAccountTokenNamesResult withTokenNameList(java.util.Collection<String> tokenNameList) {
        setTokenNameList(tokenNameList);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent
     * ListGitHubAccountTokenNames call to return the next set of names in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent ListGitHubAccountTokenNames call to return the next set of names in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent
     * ListGitHubAccountTokenNames call to return the next set of names in the list.
     * </p>
     * 
     * @return If a large amount of information is returned, an identifier is also returned. It can be used in a
     *         subsequent ListGitHubAccountTokenNames call to return the next set of names in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent
     * ListGitHubAccountTokenNames call to return the next set of names in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent ListGitHubAccountTokenNames call to return the next set of names in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGitHubAccountTokenNamesResult withNextToken(String nextToken) {
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
        if (getTokenNameList() != null)
            sb.append("TokenNameList: ").append(getTokenNameList()).append(",");
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

        if (obj instanceof ListGitHubAccountTokenNamesResult == false)
            return false;
        ListGitHubAccountTokenNamesResult other = (ListGitHubAccountTokenNamesResult) obj;
        if (other.getTokenNameList() == null ^ this.getTokenNameList() == null)
            return false;
        if (other.getTokenNameList() != null && other.getTokenNameList().equals(this.getTokenNameList()) == false)
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

        hashCode = prime * hashCode + ((getTokenNameList() == null) ? 0 : getTokenNameList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGitHubAccountTokenNamesResult clone() {
        try {
            return (ListGitHubAccountTokenNamesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
