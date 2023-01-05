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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListRecoveryPoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecoveryPointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The time when creation of the recovery point finished.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace from which to list recovery points.
     * </p>
     */
    private String namespaceArn;
    /**
     * <p>
     * The name of the namespace to list recovery points for.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * If your initial <code>ListRecoveryPoints</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListRecoveryPoints</code> operations, which returns results in
     * the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The time when the recovery point's creation was initiated.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The time when creation of the recovery point finished.
     * </p>
     * 
     * @param endTime
     *        The time when creation of the recovery point finished.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time when creation of the recovery point finished.
     * </p>
     * 
     * @return The time when creation of the recovery point finished.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time when creation of the recovery point finished.
     * </p>
     * 
     * @param endTime
     *        The time when creation of the recovery point finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to display the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to display the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to display the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace from which to list recovery points.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Resource Name (ARN) of the namespace from which to list recovery points.
     */

    public void setNamespaceArn(String namespaceArn) {
        this.namespaceArn = namespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace from which to list recovery points.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the namespace from which to list recovery points.
     */

    public String getNamespaceArn() {
        return this.namespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace from which to list recovery points.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Resource Name (ARN) of the namespace from which to list recovery points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsRequest withNamespaceArn(String namespaceArn) {
        setNamespaceArn(namespaceArn);
        return this;
    }

    /**
     * <p>
     * The name of the namespace to list recovery points for.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to list recovery points for.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to list recovery points for.
     * </p>
     * 
     * @return The name of the namespace to list recovery points for.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to list recovery points for.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to list recovery points for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsRequest withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * If your initial <code>ListRecoveryPoints</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListRecoveryPoints</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListRecoveryPoints</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in following <code>ListRecoveryPoints</code> operations, which
     *        returns results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListRecoveryPoints</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListRecoveryPoints</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @return If your initial <code>ListRecoveryPoints</code> operation returns a <code>nextToken</code>, you can
     *         include the returned <code>nextToken</code> in following <code>ListRecoveryPoints</code> operations,
     *         which returns results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListRecoveryPoints</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListRecoveryPoints</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListRecoveryPoints</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in following <code>ListRecoveryPoints</code> operations, which
     *        returns results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The time when the recovery point's creation was initiated.
     * </p>
     * 
     * @param startTime
     *        The time when the recovery point's creation was initiated.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when the recovery point's creation was initiated.
     * </p>
     * 
     * @return The time when the recovery point's creation was initiated.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when the recovery point's creation was initiated.
     * </p>
     * 
     * @param startTime
     *        The time when the recovery point's creation was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNamespaceArn() != null)
            sb.append("NamespaceArn: ").append(getNamespaceArn()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecoveryPointsRequest == false)
            return false;
        ListRecoveryPointsRequest other = (ListRecoveryPointsRequest) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNamespaceArn() == null ^ this.getNamespaceArn() == null)
            return false;
        if (other.getNamespaceArn() != null && other.getNamespaceArn().equals(this.getNamespaceArn()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNamespaceArn() == null) ? 0 : getNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public ListRecoveryPointsRequest clone() {
        return (ListRecoveryPointsRequest) super.clone();
    }

}
