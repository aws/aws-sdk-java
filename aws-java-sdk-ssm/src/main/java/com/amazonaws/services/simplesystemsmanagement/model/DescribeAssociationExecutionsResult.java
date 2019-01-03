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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssociationExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of the executions for the specified association ID.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AssociationExecution> associationExecutions;
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the executions for the specified association ID.
     * </p>
     * 
     * @return A list of the executions for the specified association ID.
     */

    public java.util.List<AssociationExecution> getAssociationExecutions() {
        if (associationExecutions == null) {
            associationExecutions = new com.amazonaws.internal.SdkInternalList<AssociationExecution>();
        }
        return associationExecutions;
    }

    /**
     * <p>
     * A list of the executions for the specified association ID.
     * </p>
     * 
     * @param associationExecutions
     *        A list of the executions for the specified association ID.
     */

    public void setAssociationExecutions(java.util.Collection<AssociationExecution> associationExecutions) {
        if (associationExecutions == null) {
            this.associationExecutions = null;
            return;
        }

        this.associationExecutions = new com.amazonaws.internal.SdkInternalList<AssociationExecution>(associationExecutions);
    }

    /**
     * <p>
     * A list of the executions for the specified association ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociationExecutions(java.util.Collection)} or
     * {@link #withAssociationExecutions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associationExecutions
     *        A list of the executions for the specified association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionsResult withAssociationExecutions(AssociationExecution... associationExecutions) {
        if (this.associationExecutions == null) {
            setAssociationExecutions(new com.amazonaws.internal.SdkInternalList<AssociationExecution>(associationExecutions.length));
        }
        for (AssociationExecution ele : associationExecutions) {
            this.associationExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the executions for the specified association ID.
     * </p>
     * 
     * @param associationExecutions
     *        A list of the executions for the specified association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionsResult withAssociationExecutions(java.util.Collection<AssociationExecution> associationExecutions) {
        setAssociationExecutions(associationExecutions);
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

    public DescribeAssociationExecutionsResult withNextToken(String nextToken) {
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
        if (getAssociationExecutions() != null)
            sb.append("AssociationExecutions: ").append(getAssociationExecutions()).append(",");
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

        if (obj instanceof DescribeAssociationExecutionsResult == false)
            return false;
        DescribeAssociationExecutionsResult other = (DescribeAssociationExecutionsResult) obj;
        if (other.getAssociationExecutions() == null ^ this.getAssociationExecutions() == null)
            return false;
        if (other.getAssociationExecutions() != null && other.getAssociationExecutions().equals(this.getAssociationExecutions()) == false)
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

        hashCode = prime * hashCode + ((getAssociationExecutions() == null) ? 0 : getAssociationExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssociationExecutionsResult clone() {
        try {
            return (DescribeAssociationExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
