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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByLegalHold"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecoveryPointsByLegalHoldResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * This is a list of the recovery points returned by <code>ListRecoveryPointsByLegalHold</code>.
     * </p>
     */
    private java.util.List<RecoveryPointMember> recoveryPoints;
    /**
     * <p>
     * This return is the next item following a partial list of returned resources.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * This is a list of the recovery points returned by <code>ListRecoveryPointsByLegalHold</code>.
     * </p>
     * 
     * @return This is a list of the recovery points returned by <code>ListRecoveryPointsByLegalHold</code>.
     */

    public java.util.List<RecoveryPointMember> getRecoveryPoints() {
        return recoveryPoints;
    }

    /**
     * <p>
     * This is a list of the recovery points returned by <code>ListRecoveryPointsByLegalHold</code>.
     * </p>
     * 
     * @param recoveryPoints
     *        This is a list of the recovery points returned by <code>ListRecoveryPointsByLegalHold</code>.
     */

    public void setRecoveryPoints(java.util.Collection<RecoveryPointMember> recoveryPoints) {
        if (recoveryPoints == null) {
            this.recoveryPoints = null;
            return;
        }

        this.recoveryPoints = new java.util.ArrayList<RecoveryPointMember>(recoveryPoints);
    }

    /**
     * <p>
     * This is a list of the recovery points returned by <code>ListRecoveryPointsByLegalHold</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecoveryPoints(java.util.Collection)} or {@link #withRecoveryPoints(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param recoveryPoints
     *        This is a list of the recovery points returned by <code>ListRecoveryPointsByLegalHold</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByLegalHoldResult withRecoveryPoints(RecoveryPointMember... recoveryPoints) {
        if (this.recoveryPoints == null) {
            setRecoveryPoints(new java.util.ArrayList<RecoveryPointMember>(recoveryPoints.length));
        }
        for (RecoveryPointMember ele : recoveryPoints) {
            this.recoveryPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is a list of the recovery points returned by <code>ListRecoveryPointsByLegalHold</code>.
     * </p>
     * 
     * @param recoveryPoints
     *        This is a list of the recovery points returned by <code>ListRecoveryPointsByLegalHold</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByLegalHoldResult withRecoveryPoints(java.util.Collection<RecoveryPointMember> recoveryPoints) {
        setRecoveryPoints(recoveryPoints);
        return this;
    }

    /**
     * <p>
     * This return is the next item following a partial list of returned resources.
     * </p>
     * 
     * @param nextToken
     *        This return is the next item following a partial list of returned resources.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This return is the next item following a partial list of returned resources.
     * </p>
     * 
     * @return This return is the next item following a partial list of returned resources.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * This return is the next item following a partial list of returned resources.
     * </p>
     * 
     * @param nextToken
     *        This return is the next item following a partial list of returned resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByLegalHoldResult withNextToken(String nextToken) {
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
        if (getRecoveryPoints() != null)
            sb.append("RecoveryPoints: ").append(getRecoveryPoints()).append(",");
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

        if (obj instanceof ListRecoveryPointsByLegalHoldResult == false)
            return false;
        ListRecoveryPointsByLegalHoldResult other = (ListRecoveryPointsByLegalHoldResult) obj;
        if (other.getRecoveryPoints() == null ^ this.getRecoveryPoints() == null)
            return false;
        if (other.getRecoveryPoints() != null && other.getRecoveryPoints().equals(this.getRecoveryPoints()) == false)
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

        hashCode = prime * hashCode + ((getRecoveryPoints() == null) ? 0 : getRecoveryPoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecoveryPointsByLegalHoldResult clone() {
        try {
            return (ListRecoveryPointsByLegalHoldResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
