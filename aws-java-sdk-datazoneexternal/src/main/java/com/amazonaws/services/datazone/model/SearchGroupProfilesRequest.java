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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchGroupProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchGroupProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which you want to search group profiles.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The group type for which to search.
     * </p>
     */
    private String groupType;
    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchGroupProfiles</code>. When the number of
     * results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>SearchGroupProfiles</code> to list
     * the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>SearchGroupProfiles</code> to list the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the text for which to search.
     * </p>
     */
    private String searchText;

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which you want to search group profiles.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which you want to search group profiles.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which you want to search group profiles.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which you want to search group profiles.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which you want to search group profiles.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which you want to search group profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGroupProfilesRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The group type for which to search.
     * </p>
     * 
     * @param groupType
     *        The group type for which to search.
     * @see GroupSearchType
     */

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    /**
     * <p>
     * The group type for which to search.
     * </p>
     * 
     * @return The group type for which to search.
     * @see GroupSearchType
     */

    public String getGroupType() {
        return this.groupType;
    }

    /**
     * <p>
     * The group type for which to search.
     * </p>
     * 
     * @param groupType
     *        The group type for which to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupSearchType
     */

    public SearchGroupProfilesRequest withGroupType(String groupType) {
        setGroupType(groupType);
        return this;
    }

    /**
     * <p>
     * The group type for which to search.
     * </p>
     * 
     * @param groupType
     *        The group type for which to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupSearchType
     */

    public SearchGroupProfilesRequest withGroupType(GroupSearchType groupType) {
        this.groupType = groupType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchGroupProfiles</code>. When the number of
     * results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>SearchGroupProfiles</code> to list
     * the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call to <code>SearchGroupProfiles</code>. When the
     *        number of results to be listed is greater than the value of <code>MaxResults</code>, the response contains
     *        a <code>NextToken</code> value that you can use in a subsequent call to <code>SearchGroupProfiles</code>
     *        to list the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchGroupProfiles</code>. When the number of
     * results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>SearchGroupProfiles</code> to list
     * the next set of results.
     * </p>
     * 
     * @return The maximum number of results to return in a single call to <code>SearchGroupProfiles</code>. When the
     *         number of results to be listed is greater than the value of <code>MaxResults</code>, the response
     *         contains a <code>NextToken</code> value that you can use in a subsequent call to
     *         <code>SearchGroupProfiles</code> to list the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchGroupProfiles</code>. When the number of
     * results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>SearchGroupProfiles</code> to list
     * the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call to <code>SearchGroupProfiles</code>. When the
     *        number of results to be listed is greater than the value of <code>MaxResults</code>, the response contains
     *        a <code>NextToken</code> value that you can use in a subsequent call to <code>SearchGroupProfiles</code>
     *        to list the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGroupProfilesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>SearchGroupProfiles</code> to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or
     *        if you explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the
     *        response includes a pagination token named <code>NextToken</code>. You can specify this
     *        <code>NextToken</code> value in a subsequent call to <code>SearchGroupProfiles</code> to list the next set
     *        of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>SearchGroupProfiles</code> to list the next set of results.
     * </p>
     * 
     * @return When the number of results is greater than the default value for the <code>MaxResults</code> parameter,
     *         or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of results,
     *         the response includes a pagination token named <code>NextToken</code>. You can specify this
     *         <code>NextToken</code> value in a subsequent call to <code>SearchGroupProfiles</code> to list the next
     *         set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>SearchGroupProfiles</code> to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or
     *        if you explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the
     *        response includes a pagination token named <code>NextToken</code>. You can specify this
     *        <code>NextToken</code> value in a subsequent call to <code>SearchGroupProfiles</code> to list the next set
     *        of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGroupProfilesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the text for which to search.
     * </p>
     * 
     * @param searchText
     *        Specifies the text for which to search.
     */

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    /**
     * <p>
     * Specifies the text for which to search.
     * </p>
     * 
     * @return Specifies the text for which to search.
     */

    public String getSearchText() {
        return this.searchText;
    }

    /**
     * <p>
     * Specifies the text for which to search.
     * </p>
     * 
     * @param searchText
     *        Specifies the text for which to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGroupProfilesRequest withSearchText(String searchText) {
        setSearchText(searchText);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getGroupType() != null)
            sb.append("GroupType: ").append(getGroupType()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSearchText() != null)
            sb.append("SearchText: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchGroupProfilesRequest == false)
            return false;
        SearchGroupProfilesRequest other = (SearchGroupProfilesRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getGroupType() == null ^ this.getGroupType() == null)
            return false;
        if (other.getGroupType() != null && other.getGroupType().equals(this.getGroupType()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSearchText() == null ^ this.getSearchText() == null)
            return false;
        if (other.getSearchText() != null && other.getSearchText().equals(this.getSearchText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGroupType() == null) ? 0 : getGroupType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSearchText() == null) ? 0 : getSearchText().hashCode());
        return hashCode;
    }

    @Override
    public SearchGroupProfilesRequest clone() {
        return (SearchGroupProfilesRequest) super.clone();
    }

}
