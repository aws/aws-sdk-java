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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetSimilarProfiles"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSimilarProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Specify the type of matching to get similar profiles for.
     * </p>
     */
    private String matchType;
    /**
     * <p>
     * The string indicating the search key to be used.
     * </p>
     */
    private String searchKey;
    /**
     * <p>
     * The string based on <code>SearchKey</code> to be searched for similar profiles.
     * </p>
     */
    private String searchValue;

    /**
     * <p>
     * The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     * </p>
     * 
     * @return The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects returned per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @return The maximum number of objects returned per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects returned per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Specify the type of matching to get similar profiles for.
     * </p>
     * 
     * @param matchType
     *        Specify the type of matching to get similar profiles for.
     * @see MatchType
     */

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * <p>
     * Specify the type of matching to get similar profiles for.
     * </p>
     * 
     * @return Specify the type of matching to get similar profiles for.
     * @see MatchType
     */

    public String getMatchType() {
        return this.matchType;
    }

    /**
     * <p>
     * Specify the type of matching to get similar profiles for.
     * </p>
     * 
     * @param matchType
     *        Specify the type of matching to get similar profiles for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MatchType
     */

    public GetSimilarProfilesRequest withMatchType(String matchType) {
        setMatchType(matchType);
        return this;
    }

    /**
     * <p>
     * Specify the type of matching to get similar profiles for.
     * </p>
     * 
     * @param matchType
     *        Specify the type of matching to get similar profiles for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MatchType
     */

    public GetSimilarProfilesRequest withMatchType(MatchType matchType) {
        this.matchType = matchType.toString();
        return this;
    }

    /**
     * <p>
     * The string indicating the search key to be used.
     * </p>
     * 
     * @param searchKey
     *        The string indicating the search key to be used.
     */

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    /**
     * <p>
     * The string indicating the search key to be used.
     * </p>
     * 
     * @return The string indicating the search key to be used.
     */

    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * <p>
     * The string indicating the search key to be used.
     * </p>
     * 
     * @param searchKey
     *        The string indicating the search key to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesRequest withSearchKey(String searchKey) {
        setSearchKey(searchKey);
        return this;
    }

    /**
     * <p>
     * The string based on <code>SearchKey</code> to be searched for similar profiles.
     * </p>
     * 
     * @param searchValue
     *        The string based on <code>SearchKey</code> to be searched for similar profiles.
     */

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    /**
     * <p>
     * The string based on <code>SearchKey</code> to be searched for similar profiles.
     * </p>
     * 
     * @return The string based on <code>SearchKey</code> to be searched for similar profiles.
     */

    public String getSearchValue() {
        return this.searchValue;
    }

    /**
     * <p>
     * The string based on <code>SearchKey</code> to be searched for similar profiles.
     * </p>
     * 
     * @param searchValue
     *        The string based on <code>SearchKey</code> to be searched for similar profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesRequest withSearchValue(String searchValue) {
        setSearchValue(searchValue);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getMatchType() != null)
            sb.append("MatchType: ").append(getMatchType()).append(",");
        if (getSearchKey() != null)
            sb.append("SearchKey: ").append(getSearchKey()).append(",");
        if (getSearchValue() != null)
            sb.append("SearchValue: ").append(getSearchValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSimilarProfilesRequest == false)
            return false;
        GetSimilarProfilesRequest other = (GetSimilarProfilesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getMatchType() == null ^ this.getMatchType() == null)
            return false;
        if (other.getMatchType() != null && other.getMatchType().equals(this.getMatchType()) == false)
            return false;
        if (other.getSearchKey() == null ^ this.getSearchKey() == null)
            return false;
        if (other.getSearchKey() != null && other.getSearchKey().equals(this.getSearchKey()) == false)
            return false;
        if (other.getSearchValue() == null ^ this.getSearchValue() == null)
            return false;
        if (other.getSearchValue() != null && other.getSearchValue().equals(this.getSearchValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getMatchType() == null) ? 0 : getMatchType().hashCode());
        hashCode = prime * hashCode + ((getSearchKey() == null) ? 0 : getSearchKey().hashCode());
        hashCode = prime * hashCode + ((getSearchValue() == null) ? 0 : getSearchValue().hashCode());
        return hashCode;
    }

    @Override
    public GetSimilarProfilesRequest clone() {
        return (GetSimilarProfilesRequest) super.clone();
    }

}
