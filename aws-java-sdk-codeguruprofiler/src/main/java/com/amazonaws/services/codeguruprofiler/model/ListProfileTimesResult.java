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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The structure representing the listProfileTimesResponse.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfileTimes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfileTimesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListProfileTimes</code> request. When the results
     * of a <code>ListProfileTimes</code> request exceed <code>maxResults</code>, this value can be used to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of start times of the available profiles for the aggregation period in the specified time range.
     * </p>
     */
    private java.util.List<ProfileTime> profileTimes;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListProfileTimes</code> request. When the results
     * of a <code>ListProfileTimes</code> request exceed <code>maxResults</code>, this value can be used to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListProfileTimes</code> request. When the
     *        results of a <code>ListProfileTimes</code> request exceed <code>maxResults</code>, this value can be used
     *        to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListProfileTimes</code> request. When the results
     * of a <code>ListProfileTimes</code> request exceed <code>maxResults</code>, this value can be used to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListProfileTimes</code> request. When the
     *         results of a <code>ListProfileTimes</code> request exceed <code>maxResults</code>, this value can be used
     *         to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListProfileTimes</code> request. When the results
     * of a <code>ListProfileTimes</code> request exceed <code>maxResults</code>, this value can be used to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListProfileTimes</code> request. When the
     *        results of a <code>ListProfileTimes</code> request exceed <code>maxResults</code>, this value can be used
     *        to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileTimesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of start times of the available profiles for the aggregation period in the specified time range.
     * </p>
     * 
     * @return The list of start times of the available profiles for the aggregation period in the specified time range.
     */

    public java.util.List<ProfileTime> getProfileTimes() {
        return profileTimes;
    }

    /**
     * <p>
     * The list of start times of the available profiles for the aggregation period in the specified time range.
     * </p>
     * 
     * @param profileTimes
     *        The list of start times of the available profiles for the aggregation period in the specified time range.
     */

    public void setProfileTimes(java.util.Collection<ProfileTime> profileTimes) {
        if (profileTimes == null) {
            this.profileTimes = null;
            return;
        }

        this.profileTimes = new java.util.ArrayList<ProfileTime>(profileTimes);
    }

    /**
     * <p>
     * The list of start times of the available profiles for the aggregation period in the specified time range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileTimes(java.util.Collection)} or {@link #withProfileTimes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param profileTimes
     *        The list of start times of the available profiles for the aggregation period in the specified time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileTimesResult withProfileTimes(ProfileTime... profileTimes) {
        if (this.profileTimes == null) {
            setProfileTimes(new java.util.ArrayList<ProfileTime>(profileTimes.length));
        }
        for (ProfileTime ele : profileTimes) {
            this.profileTimes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of start times of the available profiles for the aggregation period in the specified time range.
     * </p>
     * 
     * @param profileTimes
     *        The list of start times of the available profiles for the aggregation period in the specified time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileTimesResult withProfileTimes(java.util.Collection<ProfileTime> profileTimes) {
        setProfileTimes(profileTimes);
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
        if (getProfileTimes() != null)
            sb.append("ProfileTimes: ").append(getProfileTimes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProfileTimesResult == false)
            return false;
        ListProfileTimesResult other = (ListProfileTimesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProfileTimes() == null ^ this.getProfileTimes() == null)
            return false;
        if (other.getProfileTimes() != null && other.getProfileTimes().equals(this.getProfileTimes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProfileTimes() == null) ? 0 : getProfileTimes().hashCode());
        return hashCode;
    }

    @Override
    public ListProfileTimesResult clone() {
        try {
            return (ListProfileTimesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
