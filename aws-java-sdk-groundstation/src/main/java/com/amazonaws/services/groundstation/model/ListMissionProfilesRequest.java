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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListMissionProfiles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMissionProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Maximum number of mission profiles returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Next token returned in the request of a previous <code>ListMissionProfiles</code> call. Used to get the next page
     * of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Maximum number of mission profiles returned.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of mission profiles returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of mission profiles returned.
     * </p>
     * 
     * @return Maximum number of mission profiles returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of mission profiles returned.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of mission profiles returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMissionProfilesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Next token returned in the request of a previous <code>ListMissionProfiles</code> call. Used to get the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the request of a previous <code>ListMissionProfiles</code> call. Used to get the
     *        next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the request of a previous <code>ListMissionProfiles</code> call. Used to get the next page
     * of results.
     * </p>
     * 
     * @return Next token returned in the request of a previous <code>ListMissionProfiles</code> call. Used to get the
     *         next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the request of a previous <code>ListMissionProfiles</code> call. Used to get the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the request of a previous <code>ListMissionProfiles</code> call. Used to get the
     *        next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMissionProfilesRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListMissionProfilesRequest == false)
            return false;
        ListMissionProfilesRequest other = (ListMissionProfilesRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMissionProfilesRequest clone() {
        return (ListMissionProfilesRequest) super.clone();
    }

}
