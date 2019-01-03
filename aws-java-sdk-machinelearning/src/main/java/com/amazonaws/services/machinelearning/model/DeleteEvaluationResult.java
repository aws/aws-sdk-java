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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>DeleteEvaluation</code> operation. The output indicates that Amazon Machine Learning
 * (Amazon ML) received the request.
 * </p>
 * <p>
 * You can use the <code>GetEvaluation</code> operation and check the value of the <code>Status</code> parameter to see
 * whether an <code>Evaluation</code> is marked as <code>DELETED</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEvaluationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>Evaluation</code>. This value should be identical to the
     * value of the <code>EvaluationId</code> in the request.
     * </p>
     */
    private String evaluationId;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>Evaluation</code>. This value should be identical to the
     * value of the <code>EvaluationId</code> in the request.
     * </p>
     * 
     * @param evaluationId
     *        A user-supplied ID that uniquely identifies the <code>Evaluation</code>. This value should be identical to
     *        the value of the <code>EvaluationId</code> in the request.
     */

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>Evaluation</code>. This value should be identical to the
     * value of the <code>EvaluationId</code> in the request.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the <code>Evaluation</code>. This value should be identical
     *         to the value of the <code>EvaluationId</code> in the request.
     */

    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>Evaluation</code>. This value should be identical to the
     * value of the <code>EvaluationId</code> in the request.
     * </p>
     * 
     * @param evaluationId
     *        A user-supplied ID that uniquely identifies the <code>Evaluation</code>. This value should be identical to
     *        the value of the <code>EvaluationId</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEvaluationResult withEvaluationId(String evaluationId) {
        setEvaluationId(evaluationId);
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
        if (getEvaluationId() != null)
            sb.append("EvaluationId: ").append(getEvaluationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEvaluationResult == false)
            return false;
        DeleteEvaluationResult other = (DeleteEvaluationResult) obj;
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEvaluationResult clone() {
        try {
            return (DeleteEvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
