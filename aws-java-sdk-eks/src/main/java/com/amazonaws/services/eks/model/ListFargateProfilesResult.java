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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListFargateProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFargateProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all of the Fargate profiles associated with the specified cluster.
     * </p>
     */
    private java.util.List<String> fargateProfileNames;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListFargateProfiles</code> request. When the
     * results of a <code>ListFargateProfiles</code> request exceed <code>maxResults</code>, you can use this value to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of all of the Fargate profiles associated with the specified cluster.
     * </p>
     * 
     * @return A list of all of the Fargate profiles associated with the specified cluster.
     */

    public java.util.List<String> getFargateProfileNames() {
        return fargateProfileNames;
    }

    /**
     * <p>
     * A list of all of the Fargate profiles associated with the specified cluster.
     * </p>
     * 
     * @param fargateProfileNames
     *        A list of all of the Fargate profiles associated with the specified cluster.
     */

    public void setFargateProfileNames(java.util.Collection<String> fargateProfileNames) {
        if (fargateProfileNames == null) {
            this.fargateProfileNames = null;
            return;
        }

        this.fargateProfileNames = new java.util.ArrayList<String>(fargateProfileNames);
    }

    /**
     * <p>
     * A list of all of the Fargate profiles associated with the specified cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFargateProfileNames(java.util.Collection)} or {@link #withFargateProfileNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param fargateProfileNames
     *        A list of all of the Fargate profiles associated with the specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFargateProfilesResult withFargateProfileNames(String... fargateProfileNames) {
        if (this.fargateProfileNames == null) {
            setFargateProfileNames(new java.util.ArrayList<String>(fargateProfileNames.length));
        }
        for (String ele : fargateProfileNames) {
            this.fargateProfileNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all of the Fargate profiles associated with the specified cluster.
     * </p>
     * 
     * @param fargateProfileNames
     *        A list of all of the Fargate profiles associated with the specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFargateProfilesResult withFargateProfileNames(java.util.Collection<String> fargateProfileNames) {
        setFargateProfileNames(fargateProfileNames);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListFargateProfiles</code> request. When the
     * results of a <code>ListFargateProfiles</code> request exceed <code>maxResults</code>, you can use this value to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListFargateProfiles</code> request. When the
     *        results of a <code>ListFargateProfiles</code> request exceed <code>maxResults</code>, you can use this
     *        value to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListFargateProfiles</code> request. When the
     * results of a <code>ListFargateProfiles</code> request exceed <code>maxResults</code>, you can use this value to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListFargateProfiles</code> request. When
     *         the results of a <code>ListFargateProfiles</code> request exceed <code>maxResults</code>, you can use
     *         this value to retrieve the next page of results. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListFargateProfiles</code> request. When the
     * results of a <code>ListFargateProfiles</code> request exceed <code>maxResults</code>, you can use this value to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListFargateProfiles</code> request. When the
     *        results of a <code>ListFargateProfiles</code> request exceed <code>maxResults</code>, you can use this
     *        value to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFargateProfilesResult withNextToken(String nextToken) {
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
        if (getFargateProfileNames() != null)
            sb.append("FargateProfileNames: ").append(getFargateProfileNames()).append(",");
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

        if (obj instanceof ListFargateProfilesResult == false)
            return false;
        ListFargateProfilesResult other = (ListFargateProfilesResult) obj;
        if (other.getFargateProfileNames() == null ^ this.getFargateProfileNames() == null)
            return false;
        if (other.getFargateProfileNames() != null && other.getFargateProfileNames().equals(this.getFargateProfileNames()) == false)
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

        hashCode = prime * hashCode + ((getFargateProfileNames() == null) ? 0 : getFargateProfileNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFargateProfilesResult clone() {
        try {
            return (ListFargateProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
