/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentUserData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCurrentUserDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of the user data that is returned.
     * </p>
     */
    private java.util.List<UserData> userDataList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentUserDataResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of the user data that is returned.
     * </p>
     * 
     * @return A list of the user data that is returned.
     */

    public java.util.List<UserData> getUserDataList() {
        return userDataList;
    }

    /**
     * <p>
     * A list of the user data that is returned.
     * </p>
     * 
     * @param userDataList
     *        A list of the user data that is returned.
     */

    public void setUserDataList(java.util.Collection<UserData> userDataList) {
        if (userDataList == null) {
            this.userDataList = null;
            return;
        }

        this.userDataList = new java.util.ArrayList<UserData>(userDataList);
    }

    /**
     * <p>
     * A list of the user data that is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserDataList(java.util.Collection)} or {@link #withUserDataList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userDataList
     *        A list of the user data that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentUserDataResult withUserDataList(UserData... userDataList) {
        if (this.userDataList == null) {
            setUserDataList(new java.util.ArrayList<UserData>(userDataList.length));
        }
        for (UserData ele : userDataList) {
            this.userDataList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the user data that is returned.
     * </p>
     * 
     * @param userDataList
     *        A list of the user data that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentUserDataResult withUserDataList(java.util.Collection<UserData> userDataList) {
        setUserDataList(userDataList);
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
        if (getUserDataList() != null)
            sb.append("UserDataList: ").append(getUserDataList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCurrentUserDataResult == false)
            return false;
        GetCurrentUserDataResult other = (GetCurrentUserDataResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getUserDataList() == null ^ this.getUserDataList() == null)
            return false;
        if (other.getUserDataList() != null && other.getUserDataList().equals(this.getUserDataList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getUserDataList() == null) ? 0 : getUserDataList().hashCode());
        return hashCode;
    }

    @Override
    public GetCurrentUserDataResult clone() {
        try {
            return (GetCurrentUserDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
