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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ValidateStateMachineDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateStateMachineDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The result value will be <code>OK</code> when no syntax errors are found, or <code>FAIL</code> if the workflow
     * definition does not pass verification.
     * </p>
     */
    private String result;
    /**
     * <p>
     * If the result is <code>OK</code>, this field will be empty. When there are errors, this field will contain an
     * array of <b>Diagnostic</b> objects to help you troubleshoot.
     * </p>
     */
    private java.util.List<ValidateStateMachineDefinitionDiagnostic> diagnostics;

    /**
     * <p>
     * The result value will be <code>OK</code> when no syntax errors are found, or <code>FAIL</code> if the workflow
     * definition does not pass verification.
     * </p>
     * 
     * @param result
     *        The result value will be <code>OK</code> when no syntax errors are found, or <code>FAIL</code> if the
     *        workflow definition does not pass verification.
     * @see ValidateStateMachineDefinitionResultCode
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * The result value will be <code>OK</code> when no syntax errors are found, or <code>FAIL</code> if the workflow
     * definition does not pass verification.
     * </p>
     * 
     * @return The result value will be <code>OK</code> when no syntax errors are found, or <code>FAIL</code> if the
     *         workflow definition does not pass verification.
     * @see ValidateStateMachineDefinitionResultCode
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * The result value will be <code>OK</code> when no syntax errors are found, or <code>FAIL</code> if the workflow
     * definition does not pass verification.
     * </p>
     * 
     * @param result
     *        The result value will be <code>OK</code> when no syntax errors are found, or <code>FAIL</code> if the
     *        workflow definition does not pass verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidateStateMachineDefinitionResultCode
     */

    public ValidateStateMachineDefinitionResult withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The result value will be <code>OK</code> when no syntax errors are found, or <code>FAIL</code> if the workflow
     * definition does not pass verification.
     * </p>
     * 
     * @param result
     *        The result value will be <code>OK</code> when no syntax errors are found, or <code>FAIL</code> if the
     *        workflow definition does not pass verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidateStateMachineDefinitionResultCode
     */

    public ValidateStateMachineDefinitionResult withResult(ValidateStateMachineDefinitionResultCode result) {
        this.result = result.toString();
        return this;
    }

    /**
     * <p>
     * If the result is <code>OK</code>, this field will be empty. When there are errors, this field will contain an
     * array of <b>Diagnostic</b> objects to help you troubleshoot.
     * </p>
     * 
     * @return If the result is <code>OK</code>, this field will be empty. When there are errors, this field will
     *         contain an array of <b>Diagnostic</b> objects to help you troubleshoot.
     */

    public java.util.List<ValidateStateMachineDefinitionDiagnostic> getDiagnostics() {
        return diagnostics;
    }

    /**
     * <p>
     * If the result is <code>OK</code>, this field will be empty. When there are errors, this field will contain an
     * array of <b>Diagnostic</b> objects to help you troubleshoot.
     * </p>
     * 
     * @param diagnostics
     *        If the result is <code>OK</code>, this field will be empty. When there are errors, this field will contain
     *        an array of <b>Diagnostic</b> objects to help you troubleshoot.
     */

    public void setDiagnostics(java.util.Collection<ValidateStateMachineDefinitionDiagnostic> diagnostics) {
        if (diagnostics == null) {
            this.diagnostics = null;
            return;
        }

        this.diagnostics = new java.util.ArrayList<ValidateStateMachineDefinitionDiagnostic>(diagnostics);
    }

    /**
     * <p>
     * If the result is <code>OK</code>, this field will be empty. When there are errors, this field will contain an
     * array of <b>Diagnostic</b> objects to help you troubleshoot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiagnostics(java.util.Collection)} or {@link #withDiagnostics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param diagnostics
     *        If the result is <code>OK</code>, this field will be empty. When there are errors, this field will contain
     *        an array of <b>Diagnostic</b> objects to help you troubleshoot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateStateMachineDefinitionResult withDiagnostics(ValidateStateMachineDefinitionDiagnostic... diagnostics) {
        if (this.diagnostics == null) {
            setDiagnostics(new java.util.ArrayList<ValidateStateMachineDefinitionDiagnostic>(diagnostics.length));
        }
        for (ValidateStateMachineDefinitionDiagnostic ele : diagnostics) {
            this.diagnostics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the result is <code>OK</code>, this field will be empty. When there are errors, this field will contain an
     * array of <b>Diagnostic</b> objects to help you troubleshoot.
     * </p>
     * 
     * @param diagnostics
     *        If the result is <code>OK</code>, this field will be empty. When there are errors, this field will contain
     *        an array of <b>Diagnostic</b> objects to help you troubleshoot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateStateMachineDefinitionResult withDiagnostics(java.util.Collection<ValidateStateMachineDefinitionDiagnostic> diagnostics) {
        setDiagnostics(diagnostics);
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getDiagnostics() != null)
            sb.append("Diagnostics: ").append(getDiagnostics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateStateMachineDefinitionResult == false)
            return false;
        ValidateStateMachineDefinitionResult other = (ValidateStateMachineDefinitionResult) obj;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getDiagnostics() == null ^ this.getDiagnostics() == null)
            return false;
        if (other.getDiagnostics() != null && other.getDiagnostics().equals(this.getDiagnostics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getDiagnostics() == null) ? 0 : getDiagnostics().hashCode());
        return hashCode;
    }

    @Override
    public ValidateStateMachineDefinitionResult clone() {
        try {
            return (ValidateStateMachineDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
