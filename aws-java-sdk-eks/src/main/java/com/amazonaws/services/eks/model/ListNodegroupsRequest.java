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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListNodegroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNodegroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon EKS cluster that you would like to list node groups in.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The maximum number of node group results returned by <code>ListNodegroups</code> in paginated output. When you
     * use this parameter, <code>ListNodegroups</code> returns only <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListNodegroups</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If you don't use this parameter, <code>ListNodegroups</code> returns up to 100 results
     * and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListNodegroups</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the Amazon EKS cluster that you would like to list node groups in.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster that you would like to list node groups in.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that you would like to list node groups in.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster that you would like to list node groups in.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that you would like to list node groups in.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster that you would like to list node groups in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodegroupsRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The maximum number of node group results returned by <code>ListNodegroups</code> in paginated output. When you
     * use this parameter, <code>ListNodegroups</code> returns only <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListNodegroups</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If you don't use this parameter, <code>ListNodegroups</code> returns up to 100 results
     * and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of node group results returned by <code>ListNodegroups</code> in paginated output. When
     *        you use this parameter, <code>ListNodegroups</code> returns only <code>maxResults</code> results in a
     *        single page along with a <code>nextToken</code> response element. You can see the remaining results of the
     *        initial request by sending another <code>ListNodegroups</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *        <code>ListNodegroups</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of node group results returned by <code>ListNodegroups</code> in paginated output. When you
     * use this parameter, <code>ListNodegroups</code> returns only <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListNodegroups</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If you don't use this parameter, <code>ListNodegroups</code> returns up to 100 results
     * and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of node group results returned by <code>ListNodegroups</code> in paginated output.
     *         When you use this parameter, <code>ListNodegroups</code> returns only <code>maxResults</code> results in
     *         a single page along with a <code>nextToken</code> response element. You can see the remaining results of
     *         the initial request by sending another <code>ListNodegroups</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *         <code>ListNodegroups</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of node group results returned by <code>ListNodegroups</code> in paginated output. When you
     * use this parameter, <code>ListNodegroups</code> returns only <code>maxResults</code> results in a single page
     * along with a <code>nextToken</code> response element. You can see the remaining results of the initial request by
     * sending another <code>ListNodegroups</code> request with the returned <code>nextToken</code> value. This value
     * can be between 1 and 100. If you don't use this parameter, <code>ListNodegroups</code> returns up to 100 results
     * and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of node group results returned by <code>ListNodegroups</code> in paginated output. When
     *        you use this parameter, <code>ListNodegroups</code> returns only <code>maxResults</code> results in a
     *        single page along with a <code>nextToken</code> response element. You can see the remaining results of the
     *        initial request by sending another <code>ListNodegroups</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *        <code>ListNodegroups</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodegroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListNodegroups</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListNodegroups</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListNodegroups</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListNodegroups</code> request
     *         where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListNodegroups</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListNodegroups</code> request
     *        where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodegroupsRequest withNextToken(String nextToken) {
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
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

        if (obj instanceof ListNodegroupsRequest == false)
            return false;
        ListNodegroupsRequest other = (ListNodegroupsRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
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

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNodegroupsRequest clone() {
        return (ListNodegroupsRequest) super.clone();
    }

}
