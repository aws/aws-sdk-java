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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutionTargets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssociationExecutionTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the execution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AssociationExecutionTarget> associationExecutionTargets;
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the execution.
     * </p>
     * 
     * @return Information about the execution.
     */

    public java.util.List<AssociationExecutionTarget> getAssociationExecutionTargets() {
        if (associationExecutionTargets == null) {
            associationExecutionTargets = new com.amazonaws.internal.SdkInternalList<AssociationExecutionTarget>();
        }
        return associationExecutionTargets;
    }

    /**
     * <p>
     * Information about the execution.
     * </p>
     * 
     * @param associationExecutionTargets
     *        Information about the execution.
     */

    public void setAssociationExecutionTargets(java.util.Collection<AssociationExecutionTarget> associationExecutionTargets) {
        if (associationExecutionTargets == null) {
            this.associationExecutionTargets = null;
            return;
        }

        this.associationExecutionTargets = new com.amazonaws.internal.SdkInternalList<AssociationExecutionTarget>(associationExecutionTargets);
    }

    /**
     * <p>
     * Information about the execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociationExecutionTargets(java.util.Collection)} or
     * {@link #withAssociationExecutionTargets(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associationExecutionTargets
     *        Information about the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionTargetsResult withAssociationExecutionTargets(AssociationExecutionTarget... associationExecutionTargets) {
        if (this.associationExecutionTargets == null) {
            setAssociationExecutionTargets(new com.amazonaws.internal.SdkInternalList<AssociationExecutionTarget>(associationExecutionTargets.length));
        }
        for (AssociationExecutionTarget ele : associationExecutionTargets) {
            this.associationExecutionTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the execution.
     * </p>
     * 
     * @param associationExecutionTargets
     *        Information about the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionTargetsResult withAssociationExecutionTargets(
            java.util.Collection<AssociationExecutionTarget> associationExecutionTargets) {
        setAssociationExecutionTargets(associationExecutionTargets);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of items to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionTargetsResult withNextToken(String nextToken) {
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
        if (getAssociationExecutionTargets() != null)
            sb.append("AssociationExecutionTargets: ").append(getAssociationExecutionTargets()).append(",");
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

        if (obj instanceof DescribeAssociationExecutionTargetsResult == false)
            return false;
        DescribeAssociationExecutionTargetsResult other = (DescribeAssociationExecutionTargetsResult) obj;
        if (other.getAssociationExecutionTargets() == null ^ this.getAssociationExecutionTargets() == null)
            return false;
        if (other.getAssociationExecutionTargets() != null && other.getAssociationExecutionTargets().equals(this.getAssociationExecutionTargets()) == false)
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

        hashCode = prime * hashCode + ((getAssociationExecutionTargets() == null) ? 0 : getAssociationExecutionTargets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssociationExecutionTargetsResult clone() {
        try {
            return (DescribeAssociationExecutionTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
