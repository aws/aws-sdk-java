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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchNetworkProfiles"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchNetworkProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The network profiles that meet the specified set of filter criteria, in sort order. It is a list of
     * NetworkProfileData objects.
     * </p>
     */
    private java.util.List<NetworkProfileData> networkProfiles;
    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of network profiles returned.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * The network profiles that meet the specified set of filter criteria, in sort order. It is a list of
     * NetworkProfileData objects.
     * </p>
     * 
     * @return The network profiles that meet the specified set of filter criteria, in sort order. It is a list of
     *         NetworkProfileData objects.
     */

    public java.util.List<NetworkProfileData> getNetworkProfiles() {
        return networkProfiles;
    }

    /**
     * <p>
     * The network profiles that meet the specified set of filter criteria, in sort order. It is a list of
     * NetworkProfileData objects.
     * </p>
     * 
     * @param networkProfiles
     *        The network profiles that meet the specified set of filter criteria, in sort order. It is a list of
     *        NetworkProfileData objects.
     */

    public void setNetworkProfiles(java.util.Collection<NetworkProfileData> networkProfiles) {
        if (networkProfiles == null) {
            this.networkProfiles = null;
            return;
        }

        this.networkProfiles = new java.util.ArrayList<NetworkProfileData>(networkProfiles);
    }

    /**
     * <p>
     * The network profiles that meet the specified set of filter criteria, in sort order. It is a list of
     * NetworkProfileData objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkProfiles(java.util.Collection)} or {@link #withNetworkProfiles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkProfiles
     *        The network profiles that meet the specified set of filter criteria, in sort order. It is a list of
     *        NetworkProfileData objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchNetworkProfilesResult withNetworkProfiles(NetworkProfileData... networkProfiles) {
        if (this.networkProfiles == null) {
            setNetworkProfiles(new java.util.ArrayList<NetworkProfileData>(networkProfiles.length));
        }
        for (NetworkProfileData ele : networkProfiles) {
            this.networkProfiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network profiles that meet the specified set of filter criteria, in sort order. It is a list of
     * NetworkProfileData objects.
     * </p>
     * 
     * @param networkProfiles
     *        The network profiles that meet the specified set of filter criteria, in sort order. It is a list of
     *        NetworkProfileData objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchNetworkProfilesResult withNetworkProfiles(java.util.Collection<NetworkProfileData> networkProfiles) {
        setNetworkProfiles(networkProfiles);
        return this;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * </p>
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by MaxResults.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * </p>
     * 
     * @return An optional token returned from a prior request. Use this token for pagination of results from this
     *         action. If this parameter is specified, the response includes only results beyond the token, up to the
     *         value specified by MaxResults.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * </p>
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by MaxResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchNetworkProfilesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of network profiles returned.
     * </p>
     * 
     * @param totalCount
     *        The total number of network profiles returned.
     */

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of network profiles returned.
     * </p>
     * 
     * @return The total number of network profiles returned.
     */

    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of network profiles returned.
     * </p>
     * 
     * @param totalCount
     *        The total number of network profiles returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchNetworkProfilesResult withTotalCount(Integer totalCount) {
        setTotalCount(totalCount);
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
        if (getNetworkProfiles() != null)
            sb.append("NetworkProfiles: ").append(getNetworkProfiles()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchNetworkProfilesResult == false)
            return false;
        SearchNetworkProfilesResult other = (SearchNetworkProfilesResult) obj;
        if (other.getNetworkProfiles() == null ^ this.getNetworkProfiles() == null)
            return false;
        if (other.getNetworkProfiles() != null && other.getNetworkProfiles().equals(this.getNetworkProfiles()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkProfiles() == null) ? 0 : getNetworkProfiles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public SearchNetworkProfilesResult clone() {
        try {
            return (SearchNetworkProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
