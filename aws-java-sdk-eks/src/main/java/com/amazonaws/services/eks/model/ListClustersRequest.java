/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When you use
     * this parameter, <code>ListClusters</code> returns only <code>maxResults</code> results in a single page along
     * with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListClusters</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 100. If you don't use this parameter, <code>ListClusters</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
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
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * Indicates whether external clusters are included in the returned list. Use '<code>all</code>' to return connected
     * clusters, or blank to return only Amazon EKS clusters. '<code>all</code>' must be in lowercase otherwise an error
     * occurs.
     * </p>
     */
    private java.util.List<String> include;

    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When you use
     * this parameter, <code>ListClusters</code> returns only <code>maxResults</code> results in a single page along
     * with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListClusters</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 100. If you don't use this parameter, <code>ListClusters</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When you
     *        use this parameter, <code>ListClusters</code> returns only <code>maxResults</code> results in a single
     *        page along with a <code>nextToken</code> response element. You can see the remaining results of the
     *        initial request by sending another <code>ListClusters</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *        <code>ListClusters</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When you use
     * this parameter, <code>ListClusters</code> returns only <code>maxResults</code> results in a single page along
     * with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListClusters</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 100. If you don't use this parameter, <code>ListClusters</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When you
     *         use this parameter, <code>ListClusters</code> returns only <code>maxResults</code> results in a single
     *         page along with a <code>nextToken</code> response element. You can see the remaining results of the
     *         initial request by sending another <code>ListClusters</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *         <code>ListClusters</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When you use
     * this parameter, <code>ListClusters</code> returns only <code>maxResults</code> results in a single page along
     * with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListClusters</code> request with the returned <code>nextToken</code> value. This value can
     * be between 1 and 100. If you don't use this parameter, <code>ListClusters</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of cluster results returned by <code>ListClusters</code> in paginated output. When you
     *        use this parameter, <code>ListClusters</code> returns only <code>maxResults</code> results in a single
     *        page along with a <code>nextToken</code> response element. You can see the remaining results of the
     *        initial request by sending another <code>ListClusters</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *        <code>ListClusters</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is used only to retrieve the next items in a
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
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request
     *         where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is used only to retrieve the next items in a
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
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListClusters</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is used only to retrieve the next items in a
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
     * Indicates whether external clusters are included in the returned list. Use '<code>all</code>' to return connected
     * clusters, or blank to return only Amazon EKS clusters. '<code>all</code>' must be in lowercase otherwise an error
     * occurs.
     * </p>
     * 
     * @return Indicates whether external clusters are included in the returned list. Use '<code>all</code>' to return
     *         connected clusters, or blank to return only Amazon EKS clusters. '<code>all</code>' must be in lowercase
     *         otherwise an error occurs.
     */

    public java.util.List<String> getInclude() {
        return include;
    }

    /**
     * <p>
     * Indicates whether external clusters are included in the returned list. Use '<code>all</code>' to return connected
     * clusters, or blank to return only Amazon EKS clusters. '<code>all</code>' must be in lowercase otherwise an error
     * occurs.
     * </p>
     * 
     * @param include
     *        Indicates whether external clusters are included in the returned list. Use '<code>all</code>' to return
     *        connected clusters, or blank to return only Amazon EKS clusters. '<code>all</code>' must be in lowercase
     *        otherwise an error occurs.
     */

    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new java.util.ArrayList<String>(include);
    }

    /**
     * <p>
     * Indicates whether external clusters are included in the returned list. Use '<code>all</code>' to return connected
     * clusters, or blank to return only Amazon EKS clusters. '<code>all</code>' must be in lowercase otherwise an error
     * occurs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclude(java.util.Collection)} or {@link #withInclude(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param include
     *        Indicates whether external clusters are included in the returned list. Use '<code>all</code>' to return
     *        connected clusters, or blank to return only Amazon EKS clusters. '<code>all</code>' must be in lowercase
     *        otherwise an error occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersRequest withInclude(String... include) {
        if (this.include == null) {
            setInclude(new java.util.ArrayList<String>(include.length));
        }
        for (String ele : include) {
            this.include.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether external clusters are included in the returned list. Use '<code>all</code>' to return connected
     * clusters, or blank to return only Amazon EKS clusters. '<code>all</code>' must be in lowercase otherwise an error
     * occurs.
     * </p>
     * 
     * @param include
     *        Indicates whether external clusters are included in the returned list. Use '<code>all</code>' to return
     *        connected clusters, or blank to return only Amazon EKS clusters. '<code>all</code>' must be in lowercase
     *        otherwise an error occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersRequest withInclude(java.util.Collection<String> include) {
        setInclude(include);
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
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude());
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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public ListClustersRequest clone() {
        return (ListClustersRequest) super.clone();
    }

}
