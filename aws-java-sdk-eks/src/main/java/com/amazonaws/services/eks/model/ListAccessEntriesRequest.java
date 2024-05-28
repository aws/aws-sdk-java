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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAccessEntries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessEntriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The ARN of an <code>AccessPolicy</code>. When you specify an access policy ARN, only the access entries
     * associated to that access policy are returned. For a list of available policy ARNs, use
     * <code>ListAccessPolicies</code>.
     * </p>
     */
    private String associatedPolicyArn;
    /**
     * <p>
     * The maximum number of results, returned in paginated output. You receive <code>maxResults</code> in a single
     * page, along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     * request by sending another request with the returned <code>nextToken</code> value. This value can be between 1
     * and 100. If you don't use this parameter, 100 results and a <code>nextToken</code> value, if applicable, are
     * returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated request, where <code>maxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination continues from the end of the previous
     * results that returned the <code>nextToken</code> value. This value is null when there are no more results to
     * return.
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
     * The name of your cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of your cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @return The name of your cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessEntriesRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The ARN of an <code>AccessPolicy</code>. When you specify an access policy ARN, only the access entries
     * associated to that access policy are returned. For a list of available policy ARNs, use
     * <code>ListAccessPolicies</code>.
     * </p>
     * 
     * @param associatedPolicyArn
     *        The ARN of an <code>AccessPolicy</code>. When you specify an access policy ARN, only the access entries
     *        associated to that access policy are returned. For a list of available policy ARNs, use
     *        <code>ListAccessPolicies</code>.
     */

    public void setAssociatedPolicyArn(String associatedPolicyArn) {
        this.associatedPolicyArn = associatedPolicyArn;
    }

    /**
     * <p>
     * The ARN of an <code>AccessPolicy</code>. When you specify an access policy ARN, only the access entries
     * associated to that access policy are returned. For a list of available policy ARNs, use
     * <code>ListAccessPolicies</code>.
     * </p>
     * 
     * @return The ARN of an <code>AccessPolicy</code>. When you specify an access policy ARN, only the access entries
     *         associated to that access policy are returned. For a list of available policy ARNs, use
     *         <code>ListAccessPolicies</code>.
     */

    public String getAssociatedPolicyArn() {
        return this.associatedPolicyArn;
    }

    /**
     * <p>
     * The ARN of an <code>AccessPolicy</code>. When you specify an access policy ARN, only the access entries
     * associated to that access policy are returned. For a list of available policy ARNs, use
     * <code>ListAccessPolicies</code>.
     * </p>
     * 
     * @param associatedPolicyArn
     *        The ARN of an <code>AccessPolicy</code>. When you specify an access policy ARN, only the access entries
     *        associated to that access policy are returned. For a list of available policy ARNs, use
     *        <code>ListAccessPolicies</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessEntriesRequest withAssociatedPolicyArn(String associatedPolicyArn) {
        setAssociatedPolicyArn(associatedPolicyArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of results, returned in paginated output. You receive <code>maxResults</code> in a single
     * page, along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     * request by sending another request with the returned <code>nextToken</code> value. This value can be between 1
     * and 100. If you don't use this parameter, 100 results and a <code>nextToken</code> value, if applicable, are
     * returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results, returned in paginated output. You receive <code>maxResults</code> in a
     *        single page, along with a <code>nextToken</code> response element. You can see the remaining results of
     *        the initial request by sending another request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 100. If you don't use this parameter, 100 results and a <code>nextToken</code> value,
     *        if applicable, are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results, returned in paginated output. You receive <code>maxResults</code> in a single
     * page, along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     * request by sending another request with the returned <code>nextToken</code> value. This value can be between 1
     * and 100. If you don't use this parameter, 100 results and a <code>nextToken</code> value, if applicable, are
     * returned.
     * </p>
     * 
     * @return The maximum number of results, returned in paginated output. You receive <code>maxResults</code> in a
     *         single page, along with a <code>nextToken</code> response element. You can see the remaining results of
     *         the initial request by sending another request with the returned <code>nextToken</code> value. This value
     *         can be between 1 and 100. If you don't use this parameter, 100 results and a <code>nextToken</code>
     *         value, if applicable, are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results, returned in paginated output. You receive <code>maxResults</code> in a single
     * page, along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     * request by sending another request with the returned <code>nextToken</code> value. This value can be between 1
     * and 100. If you don't use this parameter, 100 results and a <code>nextToken</code> value, if applicable, are
     * returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results, returned in paginated output. You receive <code>maxResults</code> in a
     *        single page, along with a <code>nextToken</code> response element. You can see the remaining results of
     *        the initial request by sending another request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 100. If you don't use this parameter, 100 results and a <code>nextToken</code> value,
     *        if applicable, are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessEntriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated request, where <code>maxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination continues from the end of the previous
     * results that returned the <code>nextToken</code> value. This value is null when there are no more results to
     * return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated request, where <code>maxResults</code>
     *        was used and the results exceeded the value of that parameter. Pagination continues from the end of the
     *        previous results that returned the <code>nextToken</code> value. This value is null when there are no more
     *        results to return.</p> <note>
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
     * The <code>nextToken</code> value returned from a previous paginated request, where <code>maxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination continues from the end of the previous
     * results that returned the <code>nextToken</code> value. This value is null when there are no more results to
     * return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated request, where
     *         <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *         is null when there are no more results to return.</p> <note>
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
     * The <code>nextToken</code> value returned from a previous paginated request, where <code>maxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination continues from the end of the previous
     * results that returned the <code>nextToken</code> value. This value is null when there are no more results to
     * return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated request, where <code>maxResults</code>
     *        was used and the results exceeded the value of that parameter. Pagination continues from the end of the
     *        previous results that returned the <code>nextToken</code> value. This value is null when there are no more
     *        results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is used only to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessEntriesRequest withNextToken(String nextToken) {
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
        if (getAssociatedPolicyArn() != null)
            sb.append("AssociatedPolicyArn: ").append(getAssociatedPolicyArn()).append(",");
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

        if (obj instanceof ListAccessEntriesRequest == false)
            return false;
        ListAccessEntriesRequest other = (ListAccessEntriesRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getAssociatedPolicyArn() == null ^ this.getAssociatedPolicyArn() == null)
            return false;
        if (other.getAssociatedPolicyArn() != null && other.getAssociatedPolicyArn().equals(this.getAssociatedPolicyArn()) == false)
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
        hashCode = prime * hashCode + ((getAssociatedPolicyArn() == null) ? 0 : getAssociatedPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessEntriesRequest clone() {
        return (ListAccessEntriesRequest) super.clone();
    }

}
