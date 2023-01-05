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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListRecoveryPoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecoveryPointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The returned recovery point objects.
     * </p>
     */
    private java.util.List<RecoveryPoint> recoveryPoints;

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The returned recovery point objects.
     * </p>
     * 
     * @return The returned recovery point objects.
     */

    public java.util.List<RecoveryPoint> getRecoveryPoints() {
        return recoveryPoints;
    }

    /**
     * <p>
     * The returned recovery point objects.
     * </p>
     * 
     * @param recoveryPoints
     *        The returned recovery point objects.
     */

    public void setRecoveryPoints(java.util.Collection<RecoveryPoint> recoveryPoints) {
        if (recoveryPoints == null) {
            this.recoveryPoints = null;
            return;
        }

        this.recoveryPoints = new java.util.ArrayList<RecoveryPoint>(recoveryPoints);
    }

    /**
     * <p>
     * The returned recovery point objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecoveryPoints(java.util.Collection)} or {@link #withRecoveryPoints(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param recoveryPoints
     *        The returned recovery point objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsResult withRecoveryPoints(RecoveryPoint... recoveryPoints) {
        if (this.recoveryPoints == null) {
            setRecoveryPoints(new java.util.ArrayList<RecoveryPoint>(recoveryPoints.length));
        }
        for (RecoveryPoint ele : recoveryPoints) {
            this.recoveryPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned recovery point objects.
     * </p>
     * 
     * @param recoveryPoints
     *        The returned recovery point objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsResult withRecoveryPoints(java.util.Collection<RecoveryPoint> recoveryPoints) {
        setRecoveryPoints(recoveryPoints);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRecoveryPoints() != null)
            sb.append("RecoveryPoints: ").append(getRecoveryPoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecoveryPointsResult == false)
            return false;
        ListRecoveryPointsResult other = (ListRecoveryPointsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecoveryPoints() == null ^ this.getRecoveryPoints() == null)
            return false;
        if (other.getRecoveryPoints() != null && other.getRecoveryPoints().equals(this.getRecoveryPoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPoints() == null) ? 0 : getRecoveryPoints().hashCode());
        return hashCode;
    }

    @Override
    public ListRecoveryPointsResult clone() {
        try {
            return (ListRecoveryPointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
