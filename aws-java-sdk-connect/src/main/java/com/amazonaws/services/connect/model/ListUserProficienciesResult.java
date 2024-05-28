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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUserProficiencies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUserProficienciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the user proficiencies.
     * </p>
     */
    private java.util.List<UserProficiency> userProficiencyList;
    /**
     * <p>
     * The last time that the user's proficiencies are were modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The region in which a user's proficiencies were last modified.
     * </p>
     */
    private String lastModifiedRegion;

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

    public ListUserProficienciesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the user proficiencies.
     * </p>
     * 
     * @return Information about the user proficiencies.
     */

    public java.util.List<UserProficiency> getUserProficiencyList() {
        return userProficiencyList;
    }

    /**
     * <p>
     * Information about the user proficiencies.
     * </p>
     * 
     * @param userProficiencyList
     *        Information about the user proficiencies.
     */

    public void setUserProficiencyList(java.util.Collection<UserProficiency> userProficiencyList) {
        if (userProficiencyList == null) {
            this.userProficiencyList = null;
            return;
        }

        this.userProficiencyList = new java.util.ArrayList<UserProficiency>(userProficiencyList);
    }

    /**
     * <p>
     * Information about the user proficiencies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserProficiencyList(java.util.Collection)} or {@link #withUserProficiencyList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param userProficiencyList
     *        Information about the user proficiencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProficienciesResult withUserProficiencyList(UserProficiency... userProficiencyList) {
        if (this.userProficiencyList == null) {
            setUserProficiencyList(new java.util.ArrayList<UserProficiency>(userProficiencyList.length));
        }
        for (UserProficiency ele : userProficiencyList) {
            this.userProficiencyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the user proficiencies.
     * </p>
     * 
     * @param userProficiencyList
     *        Information about the user proficiencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProficienciesResult withUserProficiencyList(java.util.Collection<UserProficiency> userProficiencyList) {
        setUserProficiencyList(userProficiencyList);
        return this;
    }

    /**
     * <p>
     * The last time that the user's proficiencies are were modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that the user's proficiencies are were modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the user's proficiencies are were modified.
     * </p>
     * 
     * @return The last time that the user's proficiencies are were modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the user's proficiencies are were modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that the user's proficiencies are were modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProficienciesResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The region in which a user's proficiencies were last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The region in which a user's proficiencies were last modified.
     */

    public void setLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
    }

    /**
     * <p>
     * The region in which a user's proficiencies were last modified.
     * </p>
     * 
     * @return The region in which a user's proficiencies were last modified.
     */

    public String getLastModifiedRegion() {
        return this.lastModifiedRegion;
    }

    /**
     * <p>
     * The region in which a user's proficiencies were last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The region in which a user's proficiencies were last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProficienciesResult withLastModifiedRegion(String lastModifiedRegion) {
        setLastModifiedRegion(lastModifiedRegion);
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
        if (getUserProficiencyList() != null)
            sb.append("UserProficiencyList: ").append(getUserProficiencyList()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedRegion() != null)
            sb.append("LastModifiedRegion: ").append(getLastModifiedRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserProficienciesResult == false)
            return false;
        ListUserProficienciesResult other = (ListUserProficienciesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getUserProficiencyList() == null ^ this.getUserProficiencyList() == null)
            return false;
        if (other.getUserProficiencyList() != null && other.getUserProficiencyList().equals(this.getUserProficiencyList()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedRegion() == null ^ this.getLastModifiedRegion() == null)
            return false;
        if (other.getLastModifiedRegion() != null && other.getLastModifiedRegion().equals(this.getLastModifiedRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getUserProficiencyList() == null) ? 0 : getUserProficiencyList().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedRegion() == null) ? 0 : getLastModifiedRegion().hashCode());
        return hashCode;
    }

    @Override
    public ListUserProficienciesResult clone() {
        try {
            return (ListUserProficienciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
