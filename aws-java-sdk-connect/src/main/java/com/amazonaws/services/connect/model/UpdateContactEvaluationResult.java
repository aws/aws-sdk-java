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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactEvaluation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactEvaluationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     */
    private String evaluationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     */
    private String evaluationArn;

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * 
     * @param evaluationId
     *        A unique identifier for the contact evaluation.
     */

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * 
     * @return A unique identifier for the contact evaluation.
     */

    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * 
     * @param evaluationId
     *        A unique identifier for the contact evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactEvaluationResult withEvaluationId(String evaluationId) {
        setEvaluationId(evaluationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     * 
     * @param evaluationArn
     *        The Amazon Resource Name (ARN) for the contact evaluation resource.
     */

    public void setEvaluationArn(String evaluationArn) {
        this.evaluationArn = evaluationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the contact evaluation resource.
     */

    public String getEvaluationArn() {
        return this.evaluationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     * 
     * @param evaluationArn
     *        The Amazon Resource Name (ARN) for the contact evaluation resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactEvaluationResult withEvaluationArn(String evaluationArn) {
        setEvaluationArn(evaluationArn);
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
            sb.append("EvaluationId: ").append(getEvaluationId()).append(",");
        if (getEvaluationArn() != null)
            sb.append("EvaluationArn: ").append(getEvaluationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactEvaluationResult == false)
            return false;
        UpdateContactEvaluationResult other = (UpdateContactEvaluationResult) obj;
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        if (other.getEvaluationArn() == null ^ this.getEvaluationArn() == null)
            return false;
        if (other.getEvaluationArn() != null && other.getEvaluationArn().equals(this.getEvaluationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationArn() == null) ? 0 : getEvaluationArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactEvaluationResult clone() {
        try {
            return (UpdateContactEvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
