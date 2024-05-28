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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListPodIdentityAssociations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPodIdentityAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster that the associations are in.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster that the associations are in.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the Kubernetes service account that the associations use.
     * </p>
     */
    private String serviceAccount;
    /**
     * <p>
     * The maximum number of EKS Pod Identity association results returned by <code>ListPodIdentityAssociations</code>
     * in paginated output. When you use this parameter, <code>ListPodIdentityAssociations</code> returns only
     * <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. You can
     * see the remaining results of the initial request by sending another <code>ListPodIdentityAssociations</code>
     * request with the returned <code>nextToken</code> value. This value can be between 1 and 100. If you don't use
     * this parameter, <code>ListPodIdentityAssociations</code> returns up to 100 results and a <code>nextToken</code>
     * value if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
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
     * The name of the cluster that the associations are in.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that the associations are in.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the associations are in.
     * </p>
     * 
     * @return The name of the cluster that the associations are in.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the associations are in.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that the associations are in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPodIdentityAssociationsRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster that the associations are in.
     * </p>
     * 
     * @param namespace
     *        The name of the Kubernetes namespace inside the cluster that the associations are in.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster that the associations are in.
     * </p>
     * 
     * @return The name of the Kubernetes namespace inside the cluster that the associations are in.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster that the associations are in.
     * </p>
     * 
     * @param namespace
     *        The name of the Kubernetes namespace inside the cluster that the associations are in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPodIdentityAssociationsRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the Kubernetes service account that the associations use.
     * </p>
     * 
     * @param serviceAccount
     *        The name of the Kubernetes service account that the associations use.
     */

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * <p>
     * The name of the Kubernetes service account that the associations use.
     * </p>
     * 
     * @return The name of the Kubernetes service account that the associations use.
     */

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * <p>
     * The name of the Kubernetes service account that the associations use.
     * </p>
     * 
     * @param serviceAccount
     *        The name of the Kubernetes service account that the associations use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPodIdentityAssociationsRequest withServiceAccount(String serviceAccount) {
        setServiceAccount(serviceAccount);
        return this;
    }

    /**
     * <p>
     * The maximum number of EKS Pod Identity association results returned by <code>ListPodIdentityAssociations</code>
     * in paginated output. When you use this parameter, <code>ListPodIdentityAssociations</code> returns only
     * <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. You can
     * see the remaining results of the initial request by sending another <code>ListPodIdentityAssociations</code>
     * request with the returned <code>nextToken</code> value. This value can be between 1 and 100. If you don't use
     * this parameter, <code>ListPodIdentityAssociations</code> returns up to 100 results and a <code>nextToken</code>
     * value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of EKS Pod Identity association results returned by
     *        <code>ListPodIdentityAssociations</code> in paginated output. When you use this parameter,
     *        <code>ListPodIdentityAssociations</code> returns only <code>maxResults</code> results in a single page
     *        along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     *        request by sending another <code>ListPodIdentityAssociations</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *        <code>ListPodIdentityAssociations</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of EKS Pod Identity association results returned by <code>ListPodIdentityAssociations</code>
     * in paginated output. When you use this parameter, <code>ListPodIdentityAssociations</code> returns only
     * <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. You can
     * see the remaining results of the initial request by sending another <code>ListPodIdentityAssociations</code>
     * request with the returned <code>nextToken</code> value. This value can be between 1 and 100. If you don't use
     * this parameter, <code>ListPodIdentityAssociations</code> returns up to 100 results and a <code>nextToken</code>
     * value if applicable.
     * </p>
     * 
     * @return The maximum number of EKS Pod Identity association results returned by
     *         <code>ListPodIdentityAssociations</code> in paginated output. When you use this parameter,
     *         <code>ListPodIdentityAssociations</code> returns only <code>maxResults</code> results in a single page
     *         along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     *         request by sending another <code>ListPodIdentityAssociations</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *         <code>ListPodIdentityAssociations</code> returns up to 100 results and a <code>nextToken</code> value if
     *         applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of EKS Pod Identity association results returned by <code>ListPodIdentityAssociations</code>
     * in paginated output. When you use this parameter, <code>ListPodIdentityAssociations</code> returns only
     * <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. You can
     * see the remaining results of the initial request by sending another <code>ListPodIdentityAssociations</code>
     * request with the returned <code>nextToken</code> value. This value can be between 1 and 100. If you don't use
     * this parameter, <code>ListPodIdentityAssociations</code> returns up to 100 results and a <code>nextToken</code>
     * value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of EKS Pod Identity association results returned by
     *        <code>ListPodIdentityAssociations</code> in paginated output. When you use this parameter,
     *        <code>ListPodIdentityAssociations</code> returns only <code>maxResults</code> results in a single page
     *        along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     *        request by sending another <code>ListPodIdentityAssociations</code> request with the returned
     *        <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *        <code>ListPodIdentityAssociations</code> returns up to 100 results and a <code>nextToken</code> value if
     *        applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPodIdentityAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
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
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
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
     * The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
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
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request
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
     * The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
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
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListUpdates</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is used only to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPodIdentityAssociationsRequest withNextToken(String nextToken) {
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getServiceAccount() != null)
            sb.append("ServiceAccount: ").append(getServiceAccount()).append(",");
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

        if (obj instanceof ListPodIdentityAssociationsRequest == false)
            return false;
        ListPodIdentityAssociationsRequest other = (ListPodIdentityAssociationsRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getServiceAccount() == null ^ this.getServiceAccount() == null)
            return false;
        if (other.getServiceAccount() != null && other.getServiceAccount().equals(this.getServiceAccount()) == false)
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
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getServiceAccount() == null) ? 0 : getServiceAccount().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPodIdentityAssociationsRequest clone() {
        return (ListPodIdentityAssociationsRequest) super.clone();
    }

}
