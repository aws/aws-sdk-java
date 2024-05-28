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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListAssociatedAccessPolicies" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociatedAccessPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>.
     * </p>
     */
    private String principalArn;
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
     * The list of access policies associated with the access entry.
     * </p>
     */
    private java.util.List<AssociatedAccessPolicy> associatedAccessPolicies;

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

    public ListAssociatedAccessPoliciesResult withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM principal for the <code>AccessEntry</code>.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>.
     * </p>
     * 
     * @return The ARN of the IAM principal for the <code>AccessEntry</code>.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM principal for the <code>AccessEntry</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedAccessPoliciesResult withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
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

    public ListAssociatedAccessPoliciesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of access policies associated with the access entry.
     * </p>
     * 
     * @return The list of access policies associated with the access entry.
     */

    public java.util.List<AssociatedAccessPolicy> getAssociatedAccessPolicies() {
        return associatedAccessPolicies;
    }

    /**
     * <p>
     * The list of access policies associated with the access entry.
     * </p>
     * 
     * @param associatedAccessPolicies
     *        The list of access policies associated with the access entry.
     */

    public void setAssociatedAccessPolicies(java.util.Collection<AssociatedAccessPolicy> associatedAccessPolicies) {
        if (associatedAccessPolicies == null) {
            this.associatedAccessPolicies = null;
            return;
        }

        this.associatedAccessPolicies = new java.util.ArrayList<AssociatedAccessPolicy>(associatedAccessPolicies);
    }

    /**
     * <p>
     * The list of access policies associated with the access entry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedAccessPolicies(java.util.Collection)} or
     * {@link #withAssociatedAccessPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associatedAccessPolicies
     *        The list of access policies associated with the access entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedAccessPoliciesResult withAssociatedAccessPolicies(AssociatedAccessPolicy... associatedAccessPolicies) {
        if (this.associatedAccessPolicies == null) {
            setAssociatedAccessPolicies(new java.util.ArrayList<AssociatedAccessPolicy>(associatedAccessPolicies.length));
        }
        for (AssociatedAccessPolicy ele : associatedAccessPolicies) {
            this.associatedAccessPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of access policies associated with the access entry.
     * </p>
     * 
     * @param associatedAccessPolicies
     *        The list of access policies associated with the access entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedAccessPoliciesResult withAssociatedAccessPolicies(java.util.Collection<AssociatedAccessPolicy> associatedAccessPolicies) {
        setAssociatedAccessPolicies(associatedAccessPolicies);
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
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getAssociatedAccessPolicies() != null)
            sb.append("AssociatedAccessPolicies: ").append(getAssociatedAccessPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssociatedAccessPoliciesResult == false)
            return false;
        ListAssociatedAccessPoliciesResult other = (ListAssociatedAccessPoliciesResult) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAssociatedAccessPolicies() == null ^ this.getAssociatedAccessPolicies() == null)
            return false;
        if (other.getAssociatedAccessPolicies() != null && other.getAssociatedAccessPolicies().equals(this.getAssociatedAccessPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAssociatedAccessPolicies() == null) ? 0 : getAssociatedAccessPolicies().hashCode());
        return hashCode;
    }

    @Override
    public ListAssociatedAccessPoliciesResult clone() {
        try {
            return (ListAssociatedAccessPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
