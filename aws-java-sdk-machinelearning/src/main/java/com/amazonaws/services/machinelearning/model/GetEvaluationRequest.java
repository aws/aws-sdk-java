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
public class GetEvaluationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the <code>Evaluation</code> to retrieve. The evaluation of each <code>MLModel</code> is recorded and
     * cataloged. The ID provides the means to access the information.
     * </p>
     */
    private String evaluationId;

    /**
     * <p>
     * The ID of the <code>Evaluation</code> to retrieve. The evaluation of each <code>MLModel</code> is recorded and
     * cataloged. The ID provides the means to access the information.
     * </p>
     * 
     * @param evaluationId
     *        The ID of the <code>Evaluation</code> to retrieve. The evaluation of each <code>MLModel</code> is recorded
     *        and cataloged. The ID provides the means to access the information.
     */

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * <p>
     * The ID of the <code>Evaluation</code> to retrieve. The evaluation of each <code>MLModel</code> is recorded and
     * cataloged. The ID provides the means to access the information.
     * </p>
     * 
     * @return The ID of the <code>Evaluation</code> to retrieve. The evaluation of each <code>MLModel</code> is
     *         recorded and cataloged. The ID provides the means to access the information.
     */

    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * <p>
     * The ID of the <code>Evaluation</code> to retrieve. The evaluation of each <code>MLModel</code> is recorded and
     * cataloged. The ID provides the means to access the information.
     * </p>
     * 
     * @param evaluationId
     *        The ID of the <code>Evaluation</code> to retrieve. The evaluation of each <code>MLModel</code> is recorded
     *        and cataloged. The ID provides the means to access the information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationRequest withEvaluationId(String evaluationId) {
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

        if (obj instanceof GetEvaluationRequest == false)
            return false;
        GetEvaluationRequest other = (GetEvaluationRequest) obj;
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
    public GetEvaluationRequest clone() {
        return (GetEvaluationRequest) super.clone();
    }

}
