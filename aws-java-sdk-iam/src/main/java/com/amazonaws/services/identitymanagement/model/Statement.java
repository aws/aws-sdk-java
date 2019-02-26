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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains a reference to a <code>Statement</code> element in a policy document that determines the result of the
 * simulation.
 * </p>
 * <p>
 * This data type is used by the <code>MatchedStatements</code> member of the <code> <a>EvaluationResult</a> </code>
 * type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/Statement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Statement implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the policy that was provided as an input.
     * </p>
     */
    private String sourcePolicyId;
    /**
     * <p>
     * The type of the policy.
     * </p>
     */
    private String sourcePolicyType;
    /**
     * <p>
     * The row and column of the beginning of the <code>Statement</code> in an IAM policy.
     * </p>
     */
    private Position startPosition;
    /**
     * <p>
     * The row and column of the end of a <code>Statement</code> in an IAM policy.
     * </p>
     */
    private Position endPosition;

    /**
     * <p>
     * The identifier of the policy that was provided as an input.
     * </p>
     * 
     * @param sourcePolicyId
     *        The identifier of the policy that was provided as an input.
     */

    public void setSourcePolicyId(String sourcePolicyId) {
        this.sourcePolicyId = sourcePolicyId;
    }

    /**
     * <p>
     * The identifier of the policy that was provided as an input.
     * </p>
     * 
     * @return The identifier of the policy that was provided as an input.
     */

    public String getSourcePolicyId() {
        return this.sourcePolicyId;
    }

    /**
     * <p>
     * The identifier of the policy that was provided as an input.
     * </p>
     * 
     * @param sourcePolicyId
     *        The identifier of the policy that was provided as an input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withSourcePolicyId(String sourcePolicyId) {
        setSourcePolicyId(sourcePolicyId);
        return this;
    }

    /**
     * <p>
     * The type of the policy.
     * </p>
     * 
     * @param sourcePolicyType
     *        The type of the policy.
     * @see PolicySourceType
     */

    public void setSourcePolicyType(String sourcePolicyType) {
        this.sourcePolicyType = sourcePolicyType;
    }

    /**
     * <p>
     * The type of the policy.
     * </p>
     * 
     * @return The type of the policy.
     * @see PolicySourceType
     */

    public String getSourcePolicyType() {
        return this.sourcePolicyType;
    }

    /**
     * <p>
     * The type of the policy.
     * </p>
     * 
     * @param sourcePolicyType
     *        The type of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicySourceType
     */

    public Statement withSourcePolicyType(String sourcePolicyType) {
        setSourcePolicyType(sourcePolicyType);
        return this;
    }

    /**
     * <p>
     * The type of the policy.
     * </p>
     * 
     * @param sourcePolicyType
     *        The type of the policy.
     * @see PolicySourceType
     */

    public void setSourcePolicyType(PolicySourceType sourcePolicyType) {
        withSourcePolicyType(sourcePolicyType);
    }

    /**
     * <p>
     * The type of the policy.
     * </p>
     * 
     * @param sourcePolicyType
     *        The type of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicySourceType
     */

    public Statement withSourcePolicyType(PolicySourceType sourcePolicyType) {
        this.sourcePolicyType = sourcePolicyType.toString();
        return this;
    }

    /**
     * <p>
     * The row and column of the beginning of the <code>Statement</code> in an IAM policy.
     * </p>
     * 
     * @param startPosition
     *        The row and column of the beginning of the <code>Statement</code> in an IAM policy.
     */

    public void setStartPosition(Position startPosition) {
        this.startPosition = startPosition;
    }

    /**
     * <p>
     * The row and column of the beginning of the <code>Statement</code> in an IAM policy.
     * </p>
     * 
     * @return The row and column of the beginning of the <code>Statement</code> in an IAM policy.
     */

    public Position getStartPosition() {
        return this.startPosition;
    }

    /**
     * <p>
     * The row and column of the beginning of the <code>Statement</code> in an IAM policy.
     * </p>
     * 
     * @param startPosition
     *        The row and column of the beginning of the <code>Statement</code> in an IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withStartPosition(Position startPosition) {
        setStartPosition(startPosition);
        return this;
    }

    /**
     * <p>
     * The row and column of the end of a <code>Statement</code> in an IAM policy.
     * </p>
     * 
     * @param endPosition
     *        The row and column of the end of a <code>Statement</code> in an IAM policy.
     */

    public void setEndPosition(Position endPosition) {
        this.endPosition = endPosition;
    }

    /**
     * <p>
     * The row and column of the end of a <code>Statement</code> in an IAM policy.
     * </p>
     * 
     * @return The row and column of the end of a <code>Statement</code> in an IAM policy.
     */

    public Position getEndPosition() {
        return this.endPosition;
    }

    /**
     * <p>
     * The row and column of the end of a <code>Statement</code> in an IAM policy.
     * </p>
     * 
     * @param endPosition
     *        The row and column of the end of a <code>Statement</code> in an IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withEndPosition(Position endPosition) {
        setEndPosition(endPosition);
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
        if (getSourcePolicyId() != null)
            sb.append("SourcePolicyId: ").append(getSourcePolicyId()).append(",");
        if (getSourcePolicyType() != null)
            sb.append("SourcePolicyType: ").append(getSourcePolicyType()).append(",");
        if (getStartPosition() != null)
            sb.append("StartPosition: ").append(getStartPosition()).append(",");
        if (getEndPosition() != null)
            sb.append("EndPosition: ").append(getEndPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statement == false)
            return false;
        Statement other = (Statement) obj;
        if (other.getSourcePolicyId() == null ^ this.getSourcePolicyId() == null)
            return false;
        if (other.getSourcePolicyId() != null && other.getSourcePolicyId().equals(this.getSourcePolicyId()) == false)
            return false;
        if (other.getSourcePolicyType() == null ^ this.getSourcePolicyType() == null)
            return false;
        if (other.getSourcePolicyType() != null && other.getSourcePolicyType().equals(this.getSourcePolicyType()) == false)
            return false;
        if (other.getStartPosition() == null ^ this.getStartPosition() == null)
            return false;
        if (other.getStartPosition() != null && other.getStartPosition().equals(this.getStartPosition()) == false)
            return false;
        if (other.getEndPosition() == null ^ this.getEndPosition() == null)
            return false;
        if (other.getEndPosition() != null && other.getEndPosition().equals(this.getEndPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourcePolicyId() == null) ? 0 : getSourcePolicyId().hashCode());
        hashCode = prime * hashCode + ((getSourcePolicyType() == null) ? 0 : getSourcePolicyType().hashCode());
        hashCode = prime * hashCode + ((getStartPosition() == null) ? 0 : getStartPosition().hashCode());
        hashCode = prime * hashCode + ((getEndPosition() == null) ? 0 : getEndPosition().hashCode());
        return hashCode;
    }

    @Override
    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
