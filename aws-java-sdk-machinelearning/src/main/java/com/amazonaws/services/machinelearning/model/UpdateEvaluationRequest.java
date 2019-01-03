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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEvaluationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the <code>Evaluation</code> during creation.
     * </p>
     */
    private String evaluationId;
    /**
     * <p>
     * A new user-supplied name or description of the <code>Evaluation</code> that will replace the current content.
     * </p>
     */
    private String evaluationName;

    /**
     * <p>
     * The ID assigned to the <code>Evaluation</code> during creation.
     * </p>
     * 
     * @param evaluationId
     *        The ID assigned to the <code>Evaluation</code> during creation.
     */

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * <p>
     * The ID assigned to the <code>Evaluation</code> during creation.
     * </p>
     * 
     * @return The ID assigned to the <code>Evaluation</code> during creation.
     */

    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * <p>
     * The ID assigned to the <code>Evaluation</code> during creation.
     * </p>
     * 
     * @param evaluationId
     *        The ID assigned to the <code>Evaluation</code> during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEvaluationRequest withEvaluationId(String evaluationId) {
        setEvaluationId(evaluationId);
        return this;
    }

    /**
     * <p>
     * A new user-supplied name or description of the <code>Evaluation</code> that will replace the current content.
     * </p>
     * 
     * @param evaluationName
     *        A new user-supplied name or description of the <code>Evaluation</code> that will replace the current
     *        content.
     */

    public void setEvaluationName(String evaluationName) {
        this.evaluationName = evaluationName;
    }

    /**
     * <p>
     * A new user-supplied name or description of the <code>Evaluation</code> that will replace the current content.
     * </p>
     * 
     * @return A new user-supplied name or description of the <code>Evaluation</code> that will replace the current
     *         content.
     */

    public String getEvaluationName() {
        return this.evaluationName;
    }

    /**
     * <p>
     * A new user-supplied name or description of the <code>Evaluation</code> that will replace the current content.
     * </p>
     * 
     * @param evaluationName
     *        A new user-supplied name or description of the <code>Evaluation</code> that will replace the current
     *        content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEvaluationRequest withEvaluationName(String evaluationName) {
        setEvaluationName(evaluationName);
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
        if (getEvaluationName() != null)
            sb.append("EvaluationName: ").append(getEvaluationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEvaluationRequest == false)
            return false;
        UpdateEvaluationRequest other = (UpdateEvaluationRequest) obj;
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        if (other.getEvaluationName() == null ^ this.getEvaluationName() == null)
            return false;
        if (other.getEvaluationName() != null && other.getEvaluationName().equals(this.getEvaluationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationName() == null) ? 0 : getEvaluationName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEvaluationRequest clone() {
        return (UpdateEvaluationRequest) super.clone();
    }

}
