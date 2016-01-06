/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * A named expression that can be evaluated at search time. Can be used
 * to sort the search results, define other expressions, or return
 * computed information in the search results.
 * </p>
 */
public class Expression implements Serializable, Cloneable {

    /**
     * Names must begin with a letter and can contain the following
     * characters: a-z (lowercase), 0-9, and _ (underscore).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String expressionName;

    /**
     * The expression to evaluate for sorting while processing a search
     * request. The <code>Expression</code> syntax is based on JavaScript
     * expressions. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     * target="_blank">Configuring Expressions</a> in the <i>Amazon
     * CloudSearch Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     */
    private String expressionValue;

    /**
     * Names must begin with a letter and can contain the following
     * characters: a-z (lowercase), 0-9, and _ (underscore).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @return Names must begin with a letter and can contain the following
     *         characters: a-z (lowercase), 0-9, and _ (underscore).
     */
    public String getExpressionName() {
        return expressionName;
    }
    
    /**
     * Names must begin with a letter and can contain the following
     * characters: a-z (lowercase), 0-9, and _ (underscore).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param expressionName Names must begin with a letter and can contain the following
     *         characters: a-z (lowercase), 0-9, and _ (underscore).
     */
    public void setExpressionName(String expressionName) {
        this.expressionName = expressionName;
    }
    
    /**
     * Names must begin with a letter and can contain the following
     * characters: a-z (lowercase), 0-9, and _ (underscore).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param expressionName Names must begin with a letter and can contain the following
     *         characters: a-z (lowercase), 0-9, and _ (underscore).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Expression withExpressionName(String expressionName) {
        this.expressionName = expressionName;
        return this;
    }

    /**
     * The expression to evaluate for sorting while processing a search
     * request. The <code>Expression</code> syntax is based on JavaScript
     * expressions. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     * target="_blank">Configuring Expressions</a> in the <i>Amazon
     * CloudSearch Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @return The expression to evaluate for sorting while processing a search
     *         request. The <code>Expression</code> syntax is based on JavaScript
     *         expressions. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     *         target="_blank">Configuring Expressions</a> in the <i>Amazon
     *         CloudSearch Developer Guide</i>.
     */
    public String getExpressionValue() {
        return expressionValue;
    }
    
    /**
     * The expression to evaluate for sorting while processing a search
     * request. The <code>Expression</code> syntax is based on JavaScript
     * expressions. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     * target="_blank">Configuring Expressions</a> in the <i>Amazon
     * CloudSearch Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @param expressionValue The expression to evaluate for sorting while processing a search
     *         request. The <code>Expression</code> syntax is based on JavaScript
     *         expressions. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     *         target="_blank">Configuring Expressions</a> in the <i>Amazon
     *         CloudSearch Developer Guide</i>.
     */
    public void setExpressionValue(String expressionValue) {
        this.expressionValue = expressionValue;
    }
    
    /**
     * The expression to evaluate for sorting while processing a search
     * request. The <code>Expression</code> syntax is based on JavaScript
     * expressions. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     * target="_blank">Configuring Expressions</a> in the <i>Amazon
     * CloudSearch Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @param expressionValue The expression to evaluate for sorting while processing a search
     *         request. The <code>Expression</code> syntax is based on JavaScript
     *         expressions. For more information, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     *         target="_blank">Configuring Expressions</a> in the <i>Amazon
     *         CloudSearch Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Expression withExpressionValue(String expressionValue) {
        this.expressionValue = expressionValue;
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
        if (getExpressionName() != null) sb.append("ExpressionName: " + getExpressionName() + ",");
        if (getExpressionValue() != null) sb.append("ExpressionValue: " + getExpressionValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExpressionName() == null) ? 0 : getExpressionName().hashCode()); 
        hashCode = prime * hashCode + ((getExpressionValue() == null) ? 0 : getExpressionValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Expression == false) return false;
        Expression other = (Expression)obj;
        
        if (other.getExpressionName() == null ^ this.getExpressionName() == null) return false;
        if (other.getExpressionName() != null && other.getExpressionName().equals(this.getExpressionName()) == false) return false; 
        if (other.getExpressionValue() == null ^ this.getExpressionValue() == null) return false;
        if (other.getExpressionValue() != null && other.getExpressionValue().equals(this.getExpressionValue()) == false) return false; 
        return true;
    }
    
    @Override
    public Expression clone() {
        try {
            return (Expression) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    