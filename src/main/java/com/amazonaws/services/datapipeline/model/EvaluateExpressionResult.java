/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the output from the EvaluateExpression action.
 * </p>
 */
public class EvaluateExpressionResult implements Serializable {

    /**
     * The evaluated expression.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String evaluatedExpression;

    /**
     * The evaluated expression.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The evaluated expression.
     */
    public String getEvaluatedExpression() {
        return evaluatedExpression;
    }
    
    /**
     * The evaluated expression.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param evaluatedExpression The evaluated expression.
     */
    public void setEvaluatedExpression(String evaluatedExpression) {
        this.evaluatedExpression = evaluatedExpression;
    }
    
    /**
     * The evaluated expression.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param evaluatedExpression The evaluated expression.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EvaluateExpressionResult withEvaluatedExpression(String evaluatedExpression) {
        this.evaluatedExpression = evaluatedExpression;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvaluatedExpression() != null) sb.append("EvaluatedExpression: " + getEvaluatedExpression() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvaluatedExpression() == null) ? 0 : getEvaluatedExpression().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EvaluateExpressionResult == false) return false;
        EvaluateExpressionResult other = (EvaluateExpressionResult)obj;
        
        if (other.getEvaluatedExpression() == null ^ this.getEvaluatedExpression() == null) return false;
        if (other.getEvaluatedExpression() != null && other.getEvaluatedExpression().equals(this.getEvaluatedExpression()) == false) return false; 
        return true;
    }
    
}
    