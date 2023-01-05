/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListStatements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStatementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the list of statements.
     * </p>
     */
    private java.util.List<Statement> statements;
    /**
     * <p>
     * A continuation token, if not all statements have yet been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns the list of statements.
     * </p>
     * 
     * @return Returns the list of statements.
     */

    public java.util.List<Statement> getStatements() {
        return statements;
    }

    /**
     * <p>
     * Returns the list of statements.
     * </p>
     * 
     * @param statements
     *        Returns the list of statements.
     */

    public void setStatements(java.util.Collection<Statement> statements) {
        if (statements == null) {
            this.statements = null;
            return;
        }

        this.statements = new java.util.ArrayList<Statement>(statements);
    }

    /**
     * <p>
     * Returns the list of statements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatements(java.util.Collection)} or {@link #withStatements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statements
     *        Returns the list of statements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStatementsResult withStatements(Statement... statements) {
        if (this.statements == null) {
            setStatements(new java.util.ArrayList<Statement>(statements.length));
        }
        for (Statement ele : statements) {
            this.statements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the list of statements.
     * </p>
     * 
     * @param statements
     *        Returns the list of statements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStatementsResult withStatements(java.util.Collection<Statement> statements) {
        setStatements(statements);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all statements have yet been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all statements have yet been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all statements have yet been returned.
     * </p>
     * 
     * @return A continuation token, if not all statements have yet been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all statements have yet been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all statements have yet been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStatementsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getStatements() != null)
            sb.append("Statements: ").append(getStatements()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStatementsResult == false)
            return false;
        ListStatementsResult other = (ListStatementsResult) obj;
        if (other.getStatements() == null ^ this.getStatements() == null)
            return false;
        if (other.getStatements() != null && other.getStatements().equals(this.getStatements()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatements() == null) ? 0 : getStatements().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStatementsResult clone() {
        try {
            return (ListStatementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
