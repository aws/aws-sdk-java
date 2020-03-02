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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the listProfilingGroupsRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfilingGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfilingGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean value indicating whether to include a description.
     * </p>
     */
    private Boolean includeDescription;
    /**
     * <p>
     * The maximum number of profiling groups results returned by <code>ListProfilingGroups</code> in paginated output.
     * When this parameter is used, <code>ListProfilingGroups</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListProfilingGroups</code> request with the returned <code>nextToken</code>
     * value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListProfilingGroups</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * A Boolean value indicating whether to include a description.
     * </p>
     * 
     * @param includeDescription
     *        A Boolean value indicating whether to include a description.
     */

    public void setIncludeDescription(Boolean includeDescription) {
        this.includeDescription = includeDescription;
    }

    /**
     * <p>
     * A Boolean value indicating whether to include a description.
     * </p>
     * 
     * @return A Boolean value indicating whether to include a description.
     */

    public Boolean getIncludeDescription() {
        return this.includeDescription;
    }

    /**
     * <p>
     * A Boolean value indicating whether to include a description.
     * </p>
     * 
     * @param includeDescription
     *        A Boolean value indicating whether to include a description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsRequest withIncludeDescription(Boolean includeDescription) {
        setIncludeDescription(includeDescription);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether to include a description.
     * </p>
     * 
     * @return A Boolean value indicating whether to include a description.
     */

    public Boolean isIncludeDescription() {
        return this.includeDescription;
    }

    /**
     * <p>
     * The maximum number of profiling groups results returned by <code>ListProfilingGroups</code> in paginated output.
     * When this parameter is used, <code>ListProfilingGroups</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListProfilingGroups</code> request with the returned <code>nextToken</code>
     * value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of profiling groups results returned by <code>ListProfilingGroups</code> in paginated
     *        output. When this parameter is used, <code>ListProfilingGroups</code> only returns <code>maxResults</code>
     *        results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>ListProfilingGroups</code> request with the
     *        returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of profiling groups results returned by <code>ListProfilingGroups</code> in paginated output.
     * When this parameter is used, <code>ListProfilingGroups</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListProfilingGroups</code> request with the returned <code>nextToken</code>
     * value.
     * </p>
     * 
     * @return The maximum number of profiling groups results returned by <code>ListProfilingGroups</code> in paginated
     *         output. When this parameter is used, <code>ListProfilingGroups</code> only returns
     *         <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>ListProfilingGroups</code> request with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of profiling groups results returned by <code>ListProfilingGroups</code> in paginated output.
     * When this parameter is used, <code>ListProfilingGroups</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListProfilingGroups</code> request with the returned <code>nextToken</code>
     * value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of profiling groups results returned by <code>ListProfilingGroups</code> in paginated
     *        output. When this parameter is used, <code>ListProfilingGroups</code> only returns <code>maxResults</code>
     *        results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>ListProfilingGroups</code> request with the
     *        returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListProfilingGroups</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListProfilingGroups</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     *        </p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListProfilingGroups</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListProfilingGroups</code>
     *         request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     *         </p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListProfilingGroups</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListProfilingGroups</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     *        </p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsRequest withNextToken(String nextToken) {
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
        if (getIncludeDescription() != null)
            sb.append("IncludeDescription: ").append(getIncludeDescription()).append(",");
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

        if (obj instanceof ListProfilingGroupsRequest == false)
            return false;
        ListProfilingGroupsRequest other = (ListProfilingGroupsRequest) obj;
        if (other.getIncludeDescription() == null ^ this.getIncludeDescription() == null)
            return false;
        if (other.getIncludeDescription() != null && other.getIncludeDescription().equals(this.getIncludeDescription()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIncludeDescription() == null) ? 0 : getIncludeDescription().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProfilingGroupsRequest clone() {
        return (ListProfilingGroupsRequest) super.clone();
    }

}
