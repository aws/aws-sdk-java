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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchCasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The list of field identifiers to be returned as part of the response.
     * </p>
     */
    private java.util.List<FieldIdentifier> fields;
    /**
     * <p>
     * A list of filter objects.
     * </p>
     */
    private CaseFilter filter;
    /**
     * <p>
     * The maximum number of cases to return. The current maximum supported value is 25. This is also the default value
     * when no other value is provided.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A word or phrase used to perform a quick search.
     * </p>
     */
    private String searchTerm;
    /**
     * <p>
     * A list of sorts where each sort specifies a field and their sort order to be applied to the results.
     * </p>
     */
    private java.util.List<Sort> sorts;

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @return The unique identifier of the Cases domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The list of field identifiers to be returned as part of the response.
     * </p>
     * 
     * @return The list of field identifiers to be returned as part of the response.
     */

    public java.util.List<FieldIdentifier> getFields() {
        return fields;
    }

    /**
     * <p>
     * The list of field identifiers to be returned as part of the response.
     * </p>
     * 
     * @param fields
     *        The list of field identifiers to be returned as part of the response.
     */

    public void setFields(java.util.Collection<FieldIdentifier> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<FieldIdentifier>(fields);
    }

    /**
     * <p>
     * The list of field identifiers to be returned as part of the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        The list of field identifiers to be returned as part of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesRequest withFields(FieldIdentifier... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<FieldIdentifier>(fields.length));
        }
        for (FieldIdentifier ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of field identifiers to be returned as part of the response.
     * </p>
     * 
     * @param fields
     *        The list of field identifiers to be returned as part of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesRequest withFields(java.util.Collection<FieldIdentifier> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @param filter
     *        A list of filter objects.
     */

    public void setFilter(CaseFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @return A list of filter objects.
     */

    public CaseFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @param filter
     *        A list of filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesRequest withFilter(CaseFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The maximum number of cases to return. The current maximum supported value is 25. This is also the default value
     * when no other value is provided.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cases to return. The current maximum supported value is 25. This is also the default
     *        value when no other value is provided.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of cases to return. The current maximum supported value is 25. This is also the default value
     * when no other value is provided.
     * </p>
     * 
     * @return The maximum number of cases to return. The current maximum supported value is 25. This is also the
     *         default value when no other value is provided.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of cases to return. The current maximum supported value is 25. This is also the default value
     * when no other value is provided.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cases to return. The current maximum supported value is 25. This is also the default
     *        value when no other value is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A word or phrase used to perform a quick search.
     * </p>
     * 
     * @param searchTerm
     *        A word or phrase used to perform a quick search.
     */

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * <p>
     * A word or phrase used to perform a quick search.
     * </p>
     * 
     * @return A word or phrase used to perform a quick search.
     */

    public String getSearchTerm() {
        return this.searchTerm;
    }

    /**
     * <p>
     * A word or phrase used to perform a quick search.
     * </p>
     * 
     * @param searchTerm
     *        A word or phrase used to perform a quick search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesRequest withSearchTerm(String searchTerm) {
        setSearchTerm(searchTerm);
        return this;
    }

    /**
     * <p>
     * A list of sorts where each sort specifies a field and their sort order to be applied to the results.
     * </p>
     * 
     * @return A list of sorts where each sort specifies a field and their sort order to be applied to the results.
     */

    public java.util.List<Sort> getSorts() {
        return sorts;
    }

    /**
     * <p>
     * A list of sorts where each sort specifies a field and their sort order to be applied to the results.
     * </p>
     * 
     * @param sorts
     *        A list of sorts where each sort specifies a field and their sort order to be applied to the results.
     */

    public void setSorts(java.util.Collection<Sort> sorts) {
        if (sorts == null) {
            this.sorts = null;
            return;
        }

        this.sorts = new java.util.ArrayList<Sort>(sorts);
    }

    /**
     * <p>
     * A list of sorts where each sort specifies a field and their sort order to be applied to the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSorts(java.util.Collection)} or {@link #withSorts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sorts
     *        A list of sorts where each sort specifies a field and their sort order to be applied to the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesRequest withSorts(Sort... sorts) {
        if (this.sorts == null) {
            setSorts(new java.util.ArrayList<Sort>(sorts.length));
        }
        for (Sort ele : sorts) {
            this.sorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of sorts where each sort specifies a field and their sort order to be applied to the results.
     * </p>
     * 
     * @param sorts
     *        A list of sorts where each sort specifies a field and their sort order to be applied to the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCasesRequest withSorts(java.util.Collection<Sort> sorts) {
        setSorts(sorts);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSearchTerm() != null)
            sb.append("SearchTerm: ").append(getSearchTerm()).append(",");
        if (getSorts() != null)
            sb.append("Sorts: ").append(getSorts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchCasesRequest == false)
            return false;
        SearchCasesRequest other = (SearchCasesRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSearchTerm() == null ^ this.getSearchTerm() == null)
            return false;
        if (other.getSearchTerm() != null && other.getSearchTerm().equals(this.getSearchTerm()) == false)
            return false;
        if (other.getSorts() == null ^ this.getSorts() == null)
            return false;
        if (other.getSorts() != null && other.getSorts().equals(this.getSorts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSearchTerm() == null) ? 0 : getSearchTerm().hashCode());
        hashCode = prime * hashCode + ((getSorts() == null) ? 0 : getSorts().hashCode());
        return hashCode;
    }

    @Override
    public SearchCasesRequest clone() {
        return (SearchCasesRequest) super.clone();
    }

}
