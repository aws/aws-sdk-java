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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListPodIdentityAssociations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPodIdentityAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of summarized descriptions of the associations that are in the cluster and match any filters that you
     * provided.
     * </p>
     * <p>
     * Each summary is simplified by removing these fields compared to the full
     * <code> <a>PodIdentityAssociation</a> </code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IAM role: <code>roleArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The timestamp that the association was created at: <code>createdAt</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The most recent timestamp that the association was modified at:. <code>modifiedAt</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The tags on the association: <code>tags</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<PodIdentityAssociationSummary> associations;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListPodIdentityAssociations</code> request. When
     * the results of a <code>ListPodIdentityAssociations</code> request exceed <code>maxResults</code>, you can use
     * this value to retrieve the next page of results. This value is <code>null</code> when there are no more results
     * to return.
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
     * The list of summarized descriptions of the associations that are in the cluster and match any filters that you
     * provided.
     * </p>
     * <p>
     * Each summary is simplified by removing these fields compared to the full
     * <code> <a>PodIdentityAssociation</a> </code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IAM role: <code>roleArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The timestamp that the association was created at: <code>createdAt</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The most recent timestamp that the association was modified at:. <code>modifiedAt</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The tags on the association: <code>tags</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The list of summarized descriptions of the associations that are in the cluster and match any filters
     *         that you provided.</p>
     *         <p>
     *         Each summary is simplified by removing these fields compared to the full
     *         <code> <a>PodIdentityAssociation</a> </code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The IAM role: <code>roleArn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The timestamp that the association was created at: <code>createdAt</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The most recent timestamp that the association was modified at:. <code>modifiedAt</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The tags on the association: <code>tags</code>
     *         </p>
     *         </li>
     */

    public java.util.List<PodIdentityAssociationSummary> getAssociations() {
        return associations;
    }

    /**
     * <p>
     * The list of summarized descriptions of the associations that are in the cluster and match any filters that you
     * provided.
     * </p>
     * <p>
     * Each summary is simplified by removing these fields compared to the full
     * <code> <a>PodIdentityAssociation</a> </code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IAM role: <code>roleArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The timestamp that the association was created at: <code>createdAt</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The most recent timestamp that the association was modified at:. <code>modifiedAt</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The tags on the association: <code>tags</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param associations
     *        The list of summarized descriptions of the associations that are in the cluster and match any filters that
     *        you provided.</p>
     *        <p>
     *        Each summary is simplified by removing these fields compared to the full
     *        <code> <a>PodIdentityAssociation</a> </code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IAM role: <code>roleArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The timestamp that the association was created at: <code>createdAt</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The most recent timestamp that the association was modified at:. <code>modifiedAt</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The tags on the association: <code>tags</code>
     *        </p>
     *        </li>
     */

    public void setAssociations(java.util.Collection<PodIdentityAssociationSummary> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new java.util.ArrayList<PodIdentityAssociationSummary>(associations);
    }

    /**
     * <p>
     * The list of summarized descriptions of the associations that are in the cluster and match any filters that you
     * provided.
     * </p>
     * <p>
     * Each summary is simplified by removing these fields compared to the full
     * <code> <a>PodIdentityAssociation</a> </code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IAM role: <code>roleArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The timestamp that the association was created at: <code>createdAt</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The most recent timestamp that the association was modified at:. <code>modifiedAt</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The tags on the association: <code>tags</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociations(java.util.Collection)} or {@link #withAssociations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param associations
     *        The list of summarized descriptions of the associations that are in the cluster and match any filters that
     *        you provided.</p>
     *        <p>
     *        Each summary is simplified by removing these fields compared to the full
     *        <code> <a>PodIdentityAssociation</a> </code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IAM role: <code>roleArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The timestamp that the association was created at: <code>createdAt</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The most recent timestamp that the association was modified at:. <code>modifiedAt</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The tags on the association: <code>tags</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPodIdentityAssociationsResult withAssociations(PodIdentityAssociationSummary... associations) {
        if (this.associations == null) {
            setAssociations(new java.util.ArrayList<PodIdentityAssociationSummary>(associations.length));
        }
        for (PodIdentityAssociationSummary ele : associations) {
            this.associations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of summarized descriptions of the associations that are in the cluster and match any filters that you
     * provided.
     * </p>
     * <p>
     * Each summary is simplified by removing these fields compared to the full
     * <code> <a>PodIdentityAssociation</a> </code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IAM role: <code>roleArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The timestamp that the association was created at: <code>createdAt</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The most recent timestamp that the association was modified at:. <code>modifiedAt</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The tags on the association: <code>tags</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param associations
     *        The list of summarized descriptions of the associations that are in the cluster and match any filters that
     *        you provided.</p>
     *        <p>
     *        Each summary is simplified by removing these fields compared to the full
     *        <code> <a>PodIdentityAssociation</a> </code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IAM role: <code>roleArn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The timestamp that the association was created at: <code>createdAt</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The most recent timestamp that the association was modified at:. <code>modifiedAt</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The tags on the association: <code>tags</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPodIdentityAssociationsResult withAssociations(java.util.Collection<PodIdentityAssociationSummary> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListPodIdentityAssociations</code> request. When
     * the results of a <code>ListPodIdentityAssociations</code> request exceed <code>maxResults</code>, you can use
     * this value to retrieve the next page of results. This value is <code>null</code> when there are no more results
     * to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListPodIdentityAssociations</code> request.
     *        When the results of a <code>ListPodIdentityAssociations</code> request exceed <code>maxResults</code>, you
     *        can use this value to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.</p> <note>
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
     * The <code>nextToken</code> value to include in a future <code>ListPodIdentityAssociations</code> request. When
     * the results of a <code>ListPodIdentityAssociations</code> request exceed <code>maxResults</code>, you can use
     * this value to retrieve the next page of results. This value is <code>null</code> when there are no more results
     * to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListPodIdentityAssociations</code> request.
     *         When the results of a <code>ListPodIdentityAssociations</code> request exceed <code>maxResults</code>,
     *         you can use this value to retrieve the next page of results. This value is <code>null</code> when there
     *         are no more results to return.</p> <note>
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
     * The <code>nextToken</code> value to include in a future <code>ListPodIdentityAssociations</code> request. When
     * the results of a <code>ListPodIdentityAssociations</code> request exceed <code>maxResults</code>, you can use
     * this value to retrieve the next page of results. This value is <code>null</code> when there are no more results
     * to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListPodIdentityAssociations</code> request.
     *        When the results of a <code>ListPodIdentityAssociations</code> request exceed <code>maxResults</code>, you
     *        can use this value to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is used only to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPodIdentityAssociationsResult withNextToken(String nextToken) {
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
        if (getAssociations() != null)
            sb.append("Associations: ").append(getAssociations()).append(",");
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

        if (obj instanceof ListPodIdentityAssociationsResult == false)
            return false;
        ListPodIdentityAssociationsResult other = (ListPodIdentityAssociationsResult) obj;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false)
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

        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPodIdentityAssociationsResult clone() {
        try {
            return (ListPodIdentityAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
