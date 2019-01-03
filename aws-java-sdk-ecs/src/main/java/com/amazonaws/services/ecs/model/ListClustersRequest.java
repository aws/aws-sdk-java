/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
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
     * The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When this
     * parameter is used, <code>ListClusters</code> only returns <code>maxResults</code> results in a single page along
     * with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListClusters</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 100. If this parameter is not used, then <code>ListClusters</code> returns up to 100 results and
     * a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
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
     * The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request
     *         where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
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
     * The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When this
     * parameter is used, <code>ListClusters</code> only returns <code>maxResults</code> results in a single page along
     * with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListClusters</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 100. If this parameter is not used, then <code>ListClusters</code> returns up to 100 results and
     * a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When this
     *        parameter is used, <code>ListClusters</code> only returns <code>maxResults</code> results in a single page
     *        along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     *        seen by sending another <code>ListClusters</code> request with the returned <code>nextToken</code> value.
     *        This value can be between 1 and 100. If this parameter is not used, then <code>ListClusters</code> returns
     *        up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When this
     * parameter is used, <code>ListClusters</code> only returns <code>maxResults</code> results in a single page along
     * with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListClusters</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 100. If this parameter is not used, then <code>ListClusters</code> returns up to 100 results and
     * a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When
     *         this parameter is used, <code>ListClusters</code> only returns <code>maxResults</code> results in a
     *         single page along with a <code>nextToken</code> response element. The remaining results of the initial
     *         request can be seen by sending another <code>ListClusters</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     *         <code>ListClusters</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When this
     * parameter is used, <code>ListClusters</code> only returns <code>maxResults</code> results in a single page along
     * with a <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListClusters</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 100. If this parameter is not used, then <code>ListClusters</code> returns up to 100 results and
     * a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When this
     *        parameter is used, <code>ListClusters</code> only returns <code>maxResults</code> results in a single page
     *        along with a <code>nextToken</code> response element. The remaining results of the initial request can be
     *        seen by sending another <code>ListClusters</code> request with the returned <code>nextToken</code> value.
     *        This value can be between 1 and 100. If this parameter is not used, then <code>ListClusters</code> returns
     *        up to 100 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClustersRequest == false)
            return false;
        ListClustersRequest other = (ListClustersRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListClustersRequest clone() {
        return (ListClustersRequest) super.clone();
    }

}
