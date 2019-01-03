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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the output of EvaluateExpression.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/EvaluateExpression" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateExpressionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The evaluated expression.
     * </p>
     */
    private String evaluatedExpression;

    /**
     * <p>
     * The evaluated expression.
     * </p>
     * 
     * @param evaluatedExpression
     *        The evaluated expression.
     */

    public void setEvaluatedExpression(String evaluatedExpression) {
        this.evaluatedExpression = evaluatedExpression;
    }

    /**
     * <p>
     * The evaluated expression.
     * </p>
     * 
     * @return The evaluated expression.
     */

    public String getEvaluatedExpression() {
        return this.evaluatedExpression;
    }

    /**
     * <p>
     * The evaluated expression.
     * </p>
     * 
     * @param evaluatedExpression
     *        The evaluated expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateExpressionResult withEvaluatedExpression(String evaluatedExpression) {
        setEvaluatedExpression(evaluatedExpression);
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
        if (getEvaluatedExpression() != null)
            sb.append("EvaluatedExpression: ").append(getEvaluatedExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluateExpressionResult == false)
            return false;
        EvaluateExpressionResult other = (EvaluateExpressionResult) obj;
        if (other.getEvaluatedExpression() == null ^ this.getEvaluatedExpression() == null)
            return false;
        if (other.getEvaluatedExpression() != null && other.getEvaluatedExpression().equals(this.getEvaluatedExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluatedExpression() == null) ? 0 : getEvaluatedExpression().hashCode());
        return hashCode;
    }

    @Override
    public EvaluateExpressionResult clone() {
        try {
            return (EvaluateExpressionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
