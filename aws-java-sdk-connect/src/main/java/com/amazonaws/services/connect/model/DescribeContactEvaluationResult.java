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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactEvaluation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeContactEvaluationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the evaluation form completed for a specific contact.
     * </p>
     */
    private Evaluation evaluation;
    /**
     * <p>
     * Information about the evaluation form.
     * </p>
     */
    private EvaluationFormContent evaluationForm;

    /**
     * <p>
     * Information about the evaluation form completed for a specific contact.
     * </p>
     * 
     * @param evaluation
     *        Information about the evaluation form completed for a specific contact.
     */

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * <p>
     * Information about the evaluation form completed for a specific contact.
     * </p>
     * 
     * @return Information about the evaluation form completed for a specific contact.
     */

    public Evaluation getEvaluation() {
        return this.evaluation;
    }

    /**
     * <p>
     * Information about the evaluation form completed for a specific contact.
     * </p>
     * 
     * @param evaluation
     *        Information about the evaluation form completed for a specific contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContactEvaluationResult withEvaluation(Evaluation evaluation) {
        setEvaluation(evaluation);
        return this;
    }

    /**
     * <p>
     * Information about the evaluation form.
     * </p>
     * 
     * @param evaluationForm
     *        Information about the evaluation form.
     */

    public void setEvaluationForm(EvaluationFormContent evaluationForm) {
        this.evaluationForm = evaluationForm;
    }

    /**
     * <p>
     * Information about the evaluation form.
     * </p>
     * 
     * @return Information about the evaluation form.
     */

    public EvaluationFormContent getEvaluationForm() {
        return this.evaluationForm;
    }

    /**
     * <p>
     * Information about the evaluation form.
     * </p>
     * 
     * @param evaluationForm
     *        Information about the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContactEvaluationResult withEvaluationForm(EvaluationFormContent evaluationForm) {
        setEvaluationForm(evaluationForm);
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
        if (getEvaluation() != null)
            sb.append("Evaluation: ").append(getEvaluation()).append(",");
        if (getEvaluationForm() != null)
            sb.append("EvaluationForm: ").append(getEvaluationForm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContactEvaluationResult == false)
            return false;
        DescribeContactEvaluationResult other = (DescribeContactEvaluationResult) obj;
        if (other.getEvaluation() == null ^ this.getEvaluation() == null)
            return false;
        if (other.getEvaluation() != null && other.getEvaluation().equals(this.getEvaluation()) == false)
            return false;
        if (other.getEvaluationForm() == null ^ this.getEvaluationForm() == null)
            return false;
        if (other.getEvaluationForm() != null && other.getEvaluationForm().equals(this.getEvaluationForm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluation() == null) ? 0 : getEvaluation().hashCode());
        hashCode = prime * hashCode + ((getEvaluationForm() == null) ? 0 : getEvaluationForm().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContactEvaluationResult clone() {
        try {
            return (DescribeContactEvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
