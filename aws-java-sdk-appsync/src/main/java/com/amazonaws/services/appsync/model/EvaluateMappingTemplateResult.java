/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/EvaluateMappingTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateMappingTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The mapping template; this can be a request or response template.
     * </p>
     */
    private String evaluationResult;
    /**
     * <p>
     * The <code>ErrorDetail</code> object.
     * </p>
     */
    private ErrorDetail error;

    /**
     * <p>
     * The mapping template; this can be a request or response template.
     * </p>
     * 
     * @param evaluationResult
     *        The mapping template; this can be a request or response template.
     */

    public void setEvaluationResult(String evaluationResult) {
        this.evaluationResult = evaluationResult;
    }

    /**
     * <p>
     * The mapping template; this can be a request or response template.
     * </p>
     * 
     * @return The mapping template; this can be a request or response template.
     */

    public String getEvaluationResult() {
        return this.evaluationResult;
    }

    /**
     * <p>
     * The mapping template; this can be a request or response template.
     * </p>
     * 
     * @param evaluationResult
     *        The mapping template; this can be a request or response template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateMappingTemplateResult withEvaluationResult(String evaluationResult) {
        setEvaluationResult(evaluationResult);
        return this;
    }

    /**
     * <p>
     * The <code>ErrorDetail</code> object.
     * </p>
     * 
     * @param error
     *        The <code>ErrorDetail</code> object.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * The <code>ErrorDetail</code> object.
     * </p>
     * 
     * @return The <code>ErrorDetail</code> object.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * The <code>ErrorDetail</code> object.
     * </p>
     * 
     * @param error
     *        The <code>ErrorDetail</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateMappingTemplateResult withError(ErrorDetail error) {
        setError(error);
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
        if (getEvaluationResult() != null)
            sb.append("EvaluationResult: ").append(getEvaluationResult()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluateMappingTemplateResult == false)
            return false;
        EvaluateMappingTemplateResult other = (EvaluateMappingTemplateResult) obj;
        if (other.getEvaluationResult() == null ^ this.getEvaluationResult() == null)
            return false;
        if (other.getEvaluationResult() != null && other.getEvaluationResult().equals(this.getEvaluationResult()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationResult() == null) ? 0 : getEvaluationResult().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public EvaluateMappingTemplateResult clone() {
        try {
            return (EvaluateMappingTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
