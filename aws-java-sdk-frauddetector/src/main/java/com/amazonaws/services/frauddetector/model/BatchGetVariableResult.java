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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchGetVariable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetVariableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The returned variables.
     * </p>
     */
    private java.util.List<Variable> variables;
    /**
     * <p>
     * The errors from the request.
     * </p>
     */
    private java.util.List<BatchGetVariableError> errors;

    /**
     * <p>
     * The returned variables.
     * </p>
     * 
     * @return The returned variables.
     */

    public java.util.List<Variable> getVariables() {
        return variables;
    }

    /**
     * <p>
     * The returned variables.
     * </p>
     * 
     * @param variables
     *        The returned variables.
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
     * The returned variables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariables(java.util.Collection)} or {@link #withVariables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param variables
     *        The returned variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetVariableResult withVariables(Variable... variables) {
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
     * The returned variables.
     * </p>
     * 
     * @param variables
     *        The returned variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetVariableResult withVariables(java.util.Collection<Variable> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * <p>
     * The errors from the request.
     * </p>
     * 
     * @return The errors from the request.
     */

    public java.util.List<BatchGetVariableError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * The errors from the request.
     * </p>
     * 
     * @param errors
     *        The errors from the request.
     */

    public void setErrors(java.util.Collection<BatchGetVariableError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetVariableError>(errors);
    }

    /**
     * <p>
     * The errors from the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        The errors from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetVariableResult withErrors(BatchGetVariableError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetVariableError>(errors.length));
        }
        for (BatchGetVariableError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The errors from the request.
     * </p>
     * 
     * @param errors
     *        The errors from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetVariableResult withErrors(java.util.Collection<BatchGetVariableError> errors) {
        setErrors(errors);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetVariableResult == false)
            return false;
        BatchGetVariableResult other = (BatchGetVariableResult) obj;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetVariableResult clone() {
        try {
            return (BatchGetVariableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
