/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListMissionProfiles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMissionProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of mission profiles.
     * </p>
     */
    private java.util.List<MissionProfileListItem> missionProfileList;
    /**
     * <p>
     * Next token returned in the response of a previous <code>ListMissionProfiles</code> call. Used to get the next
     * page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of mission profiles.
     * </p>
     * 
     * @return List of mission profiles.
     */

    public java.util.List<MissionProfileListItem> getMissionProfileList() {
        return missionProfileList;
    }

    /**
     * <p>
     * List of mission profiles.
     * </p>
     * 
     * @param missionProfileList
     *        List of mission profiles.
     */

    public void setMissionProfileList(java.util.Collection<MissionProfileListItem> missionProfileList) {
        if (missionProfileList == null) {
            this.missionProfileList = null;
            return;
        }

        this.missionProfileList = new java.util.ArrayList<MissionProfileListItem>(missionProfileList);
    }

    /**
     * <p>
     * List of mission profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMissionProfileList(java.util.Collection)} or {@link #withMissionProfileList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param missionProfileList
     *        List of mission profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMissionProfilesResult withMissionProfileList(MissionProfileListItem... missionProfileList) {
        if (this.missionProfileList == null) {
            setMissionProfileList(new java.util.ArrayList<MissionProfileListItem>(missionProfileList.length));
        }
        for (MissionProfileListItem ele : missionProfileList) {
            this.missionProfileList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of mission profiles.
     * </p>
     * 
     * @param missionProfileList
     *        List of mission profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMissionProfilesResult withMissionProfileList(java.util.Collection<MissionProfileListItem> missionProfileList) {
        setMissionProfileList(missionProfileList);
        return this;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListMissionProfiles</code> call. Used to get the next
     * page of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous <code>ListMissionProfiles</code> call. Used to get the
     *        next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListMissionProfiles</code> call. Used to get the next
     * page of results.
     * </p>
     * 
     * @return Next token returned in the response of a previous <code>ListMissionProfiles</code> call. Used to get the
     *         next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous <code>ListMissionProfiles</code> call. Used to get the next
     * page of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous <code>ListMissionProfiles</code> call. Used to get the
     *        next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMissionProfilesResult withNextToken(String nextToken) {
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
        if (getMissionProfileList() != null)
            sb.append("MissionProfileList: ").append(getMissionProfileList()).append(",");
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

        if (obj instanceof ListMissionProfilesResult == false)
            return false;
        ListMissionProfilesResult other = (ListMissionProfilesResult) obj;
        if (other.getMissionProfileList() == null ^ this.getMissionProfileList() == null)
            return false;
        if (other.getMissionProfileList() != null && other.getMissionProfileList().equals(this.getMissionProfileList()) == false)
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

        hashCode = prime * hashCode + ((getMissionProfileList() == null) ? 0 : getMissionProfileList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMissionProfilesResult clone() {
        try {
            return (ListMissionProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
