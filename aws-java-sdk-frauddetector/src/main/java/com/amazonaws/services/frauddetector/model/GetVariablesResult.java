/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetVariables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVariablesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the variables returned.
     * </p>
     */
    private java.util.List<Variable> variables;
    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of the variables returned.
     * </p>
     * 
     * @return The names of the variables returned.
     */

    public java.util.List<Variable> getVariables() {
        return variables;
    }

    /**
     * <p>
     * The names of the variables returned.
     * </p>
     * 
     * @param variables
     *        The names of the variables returned.
     */

    public void setVariables(java.util.Collection<Variable> variables) {
        if (variables == null) {
            this.variables = null;
            return;
        }

        this.variables = new java.util.ArrayList<Variable>(variables);
    }

    /**
     * <p>
     * The names of the variables returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariables(java.util.Collection)} or {@link #withVariables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param variables
     *        The names of the variables returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVariablesResult withVariables(Variable... variables) {
        if (this.variables == null) {
            setVariables(new java.util.ArrayList<Variable>(variables.length));
        }
        for (Variable ele : variables) {
            this.variables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the variables returned.
     * </p>
     * 
     * @param variables
     *        The names of the variables returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVariablesResult withVariables(java.util.Collection<Variable> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     * 
     * @param nextToken
     *        The next page token to be used in subsequent requests.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     * 
     * @return The next page token to be used in subsequent requests.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     * 
     * @param nextToken
     *        The next page token to be used in subsequent requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVariablesResult withNextToken(String nextToken) {
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
        if (getVariables() != null)
            sb.append("Variables: ").append(getVariables()).append(",");
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

        if (obj instanceof GetVariablesResult == false)
            return false;
        GetVariablesResult other = (GetVariablesResult) obj;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
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

        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetVariablesResult clone() {
        try {
            return (GetVariablesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
