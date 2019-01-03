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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeEcsClusters</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeEcsClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEcsClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>EcsCluster</code> objects containing the cluster descriptions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EcsCluster> ecsClusters;
    /**
     * <p>
     * If a paginated request does not return all of the remaining results, this parameter is set to a token that you
     * can assign to the request object's <code>NextToken</code> parameter to retrieve the next set of results. If the
     * previous paginated request returned all of the remaining results, this parameter is set to <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>EcsCluster</code> objects containing the cluster descriptions.
     * </p>
     * 
     * @return A list of <code>EcsCluster</code> objects containing the cluster descriptions.
     */

    public java.util.List<EcsCluster> getEcsClusters() {
        if (ecsClusters == null) {
            ecsClusters = new com.amazonaws.internal.SdkInternalList<EcsCluster>();
        }
        return ecsClusters;
    }

    /**
     * <p>
     * A list of <code>EcsCluster</code> objects containing the cluster descriptions.
     * </p>
     * 
     * @param ecsClusters
     *        A list of <code>EcsCluster</code> objects containing the cluster descriptions.
     */

    public void setEcsClusters(java.util.Collection<EcsCluster> ecsClusters) {
        if (ecsClusters == null) {
            this.ecsClusters = null;
            return;
        }

        this.ecsClusters = new com.amazonaws.internal.SdkInternalList<EcsCluster>(ecsClusters);
    }

    /**
     * <p>
     * A list of <code>EcsCluster</code> objects containing the cluster descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcsClusters(java.util.Collection)} or {@link #withEcsClusters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ecsClusters
     *        A list of <code>EcsCluster</code> objects containing the cluster descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEcsClustersResult withEcsClusters(EcsCluster... ecsClusters) {
        if (this.ecsClusters == null) {
            setEcsClusters(new com.amazonaws.internal.SdkInternalList<EcsCluster>(ecsClusters.length));
        }
        for (EcsCluster ele : ecsClusters) {
            this.ecsClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>EcsCluster</code> objects containing the cluster descriptions.
     * </p>
     * 
     * @param ecsClusters
     *        A list of <code>EcsCluster</code> objects containing the cluster descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEcsClustersResult withEcsClusters(java.util.Collection<EcsCluster> ecsClusters) {
        setEcsClusters(ecsClusters);
        return this;
    }

    /**
     * <p>
     * If a paginated request does not return all of the remaining results, this parameter is set to a token that you
     * can assign to the request object's <code>NextToken</code> parameter to retrieve the next set of results. If the
     * previous paginated request returned all of the remaining results, this parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If a paginated request does not return all of the remaining results, this parameter is set to a token that
     *        you can assign to the request object's <code>NextToken</code> parameter to retrieve the next set of
     *        results. If the previous paginated request returned all of the remaining results, this parameter is set to
     *        <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a paginated request does not return all of the remaining results, this parameter is set to a token that you
     * can assign to the request object's <code>NextToken</code> parameter to retrieve the next set of results. If the
     * previous paginated request returned all of the remaining results, this parameter is set to <code>null</code>.
     * </p>
     * 
     * @return If a paginated request does not return all of the remaining results, this parameter is set to a token
     *         that you can assign to the request object's <code>NextToken</code> parameter to retrieve the next set of
     *         results. If the previous paginated request returned all of the remaining results, this parameter is set
     *         to <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a paginated request does not return all of the remaining results, this parameter is set to a token that you
     * can assign to the request object's <code>NextToken</code> parameter to retrieve the next set of results. If the
     * previous paginated request returned all of the remaining results, this parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If a paginated request does not return all of the remaining results, this parameter is set to a token that
     *        you can assign to the request object's <code>NextToken</code> parameter to retrieve the next set of
     *        results. If the previous paginated request returned all of the remaining results, this parameter is set to
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEcsClustersResult withNextToken(String nextToken) {
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
        if (getEcsClusters() != null)
            sb.append("EcsClusters: ").append(getEcsClusters()).append(",");
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

        if (obj instanceof DescribeEcsClustersResult == false)
            return false;
        DescribeEcsClustersResult other = (DescribeEcsClustersResult) obj;
        if (other.getEcsClusters() == null ^ this.getEcsClusters() == null)
            return false;
        if (other.getEcsClusters() != null && other.getEcsClusters().equals(this.getEcsClusters()) == false)
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

        hashCode = prime * hashCode + ((getEcsClusters() == null) ? 0 : getEcsClusters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEcsClustersResult clone() {
        try {
            return (DescribeEcsClustersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
