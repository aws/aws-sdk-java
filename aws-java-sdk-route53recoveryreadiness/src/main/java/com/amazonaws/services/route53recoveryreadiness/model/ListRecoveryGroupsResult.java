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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRecoveryGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecoveryGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of recovery groups.
     * </p>
     */
    private java.util.List<RecoveryGroupOutput> recoveryGroups;

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @return The token that identifies which batch of results you want to see.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of recovery groups.
     * </p>
     * 
     * @return A list of recovery groups.
     */

    public java.util.List<RecoveryGroupOutput> getRecoveryGroups() {
        return recoveryGroups;
    }

    /**
     * <p>
     * A list of recovery groups.
     * </p>
     * 
     * @param recoveryGroups
     *        A list of recovery groups.
     */

    public void setRecoveryGroups(java.util.Collection<RecoveryGroupOutput> recoveryGroups) {
        if (recoveryGroups == null) {
            this.recoveryGroups = null;
            return;
        }

        this.recoveryGroups = new java.util.ArrayList<RecoveryGroupOutput>(recoveryGroups);
    }

    /**
     * <p>
     * A list of recovery groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecoveryGroups(java.util.Collection)} or {@link #withRecoveryGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param recoveryGroups
     *        A list of recovery groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryGroupsResult withRecoveryGroups(RecoveryGroupOutput... recoveryGroups) {
        if (this.recoveryGroups == null) {
            setRecoveryGroups(new java.util.ArrayList<RecoveryGroupOutput>(recoveryGroups.length));
        }
        for (RecoveryGroupOutput ele : recoveryGroups) {
            this.recoveryGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of recovery groups.
     * </p>
     * 
     * @param recoveryGroups
     *        A list of recovery groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryGroupsResult withRecoveryGroups(java.util.Collection<RecoveryGroupOutput> recoveryGroups) {
        setRecoveryGroups(recoveryGroups);
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
        if (getRecoveryGroups() != null)
            sb.append("RecoveryGroups: ").append(getRecoveryGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecoveryGroupsResult == false)
            return false;
        ListRecoveryGroupsResult other = (ListRecoveryGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecoveryGroups() == null ^ this.getRecoveryGroups() == null)
            return false;
        if (other.getRecoveryGroups() != null && other.getRecoveryGroups().equals(this.getRecoveryGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecoveryGroups() == null) ? 0 : getRecoveryGroups().hashCode());
        return hashCode;
    }

    @Override
    public ListRecoveryGroupsResult clone() {
        try {
            return (ListRecoveryGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
