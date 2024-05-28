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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusterOperationsV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClusterOperationsV2Result extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of cluster operation information objects.
     * </p>
     */
    private java.util.List<ClusterOperationV2Summary> clusterOperationInfoList;
    /**
     * <p>
     * If the response of ListClusterOperationsV2 is truncated, it returns a NextToken in the response. This NextToken
     * should be sent in the subsequent request to ListClusterOperationsV2.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of cluster operation information objects.
     * </p>
     * 
     * @return <p>
     *         An array of cluster operation information objects.
     *         </p>
     */

    public java.util.List<ClusterOperationV2Summary> getClusterOperationInfoList() {
        return clusterOperationInfoList;
    }

    /**
     * <p>
     * An array of cluster operation information objects.
     * </p>
     * 
     * @param clusterOperationInfoList
     *        <p>
     *        An array of cluster operation information objects.
     *        </p>
     */

    public void setClusterOperationInfoList(java.util.Collection<ClusterOperationV2Summary> clusterOperationInfoList) {
        if (clusterOperationInfoList == null) {
            this.clusterOperationInfoList = null;
            return;
        }

        this.clusterOperationInfoList = new java.util.ArrayList<ClusterOperationV2Summary>(clusterOperationInfoList);
    }

    /**
     * <p>
     * An array of cluster operation information objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterOperationInfoList(java.util.Collection)} or
     * {@link #withClusterOperationInfoList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterOperationInfoList
     *        <p>
     *        An array of cluster operation information objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterOperationsV2Result withClusterOperationInfoList(ClusterOperationV2Summary... clusterOperationInfoList) {
        if (this.clusterOperationInfoList == null) {
            setClusterOperationInfoList(new java.util.ArrayList<ClusterOperationV2Summary>(clusterOperationInfoList.length));
        }
        for (ClusterOperationV2Summary ele : clusterOperationInfoList) {
            this.clusterOperationInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of cluster operation information objects.
     * </p>
     * 
     * @param clusterOperationInfoList
     *        <p>
     *        An array of cluster operation information objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterOperationsV2Result withClusterOperationInfoList(java.util.Collection<ClusterOperationV2Summary> clusterOperationInfoList) {
        setClusterOperationInfoList(clusterOperationInfoList);
        return this;
    }

    /**
     * <p>
     * If the response of ListClusterOperationsV2 is truncated, it returns a NextToken in the response. This NextToken
     * should be sent in the subsequent request to ListClusterOperationsV2.
     * </p>
     * 
     * @param nextToken
     *        <p>
     *        If the response of ListClusterOperationsV2 is truncated, it returns a NextToken in the response. This
     *        NextToken should be sent in the subsequent request to ListClusterOperationsV2.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response of ListClusterOperationsV2 is truncated, it returns a NextToken in the response. This NextToken
     * should be sent in the subsequent request to ListClusterOperationsV2.
     * </p>
     * 
     * @return <p>
     *         If the response of ListClusterOperationsV2 is truncated, it returns a NextToken in the response. This
     *         NextToken should be sent in the subsequent request to ListClusterOperationsV2.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response of ListClusterOperationsV2 is truncated, it returns a NextToken in the response. This NextToken
     * should be sent in the subsequent request to ListClusterOperationsV2.
     * </p>
     * 
     * @param nextToken
     *        <p>
     *        If the response of ListClusterOperationsV2 is truncated, it returns a NextToken in the response. This
     *        NextToken should be sent in the subsequent request to ListClusterOperationsV2.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterOperationsV2Result withNextToken(String nextToken) {
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
        if (getClusterOperationInfoList() != null)
            sb.append("ClusterOperationInfoList: ").append(getClusterOperationInfoList()).append(",");
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

        if (obj instanceof ListClusterOperationsV2Result == false)
            return false;
        ListClusterOperationsV2Result other = (ListClusterOperationsV2Result) obj;
        if (other.getClusterOperationInfoList() == null ^ this.getClusterOperationInfoList() == null)
            return false;
        if (other.getClusterOperationInfoList() != null && other.getClusterOperationInfoList().equals(this.getClusterOperationInfoList()) == false)
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

        hashCode = prime * hashCode + ((getClusterOperationInfoList() == null) ? 0 : getClusterOperationInfoList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListClusterOperationsV2Result clone() {
        try {
            return (ListClusterOperationsV2Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
