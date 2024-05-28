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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchemaAnalysisRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetSchemaAnalysisRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The retrieved list of analysis rules.
     * </p>
     */
    private java.util.List<AnalysisRule> analysisRules;
    /**
     * <p>
     * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be
     * retrieved.
     * </p>
     */
    private java.util.List<BatchGetSchemaAnalysisRuleError> errors;

    /**
     * <p>
     * The retrieved list of analysis rules.
     * </p>
     * 
     * @return The retrieved list of analysis rules.
     */

    public java.util.List<AnalysisRule> getAnalysisRules() {
        return analysisRules;
    }

    /**
     * <p>
     * The retrieved list of analysis rules.
     * </p>
     * 
     * @param analysisRules
     *        The retrieved list of analysis rules.
     */

    public void setAnalysisRules(java.util.Collection<AnalysisRule> analysisRules) {
        if (analysisRules == null) {
            this.analysisRules = null;
            return;
        }

        this.analysisRules = new java.util.ArrayList<AnalysisRule>(analysisRules);
    }

    /**
     * <p>
     * The retrieved list of analysis rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisRules(java.util.Collection)} or {@link #withAnalysisRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param analysisRules
     *        The retrieved list of analysis rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaAnalysisRuleResult withAnalysisRules(AnalysisRule... analysisRules) {
        if (this.analysisRules == null) {
            setAnalysisRules(new java.util.ArrayList<AnalysisRule>(analysisRules.length));
        }
        for (AnalysisRule ele : analysisRules) {
            this.analysisRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The retrieved list of analysis rules.
     * </p>
     * 
     * @param analysisRules
     *        The retrieved list of analysis rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaAnalysisRuleResult withAnalysisRules(java.util.Collection<AnalysisRule> analysisRules) {
        setAnalysisRules(analysisRules);
        return this;
    }

    /**
     * <p>
     * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be
     * retrieved.
     * </p>
     * 
     * @return Error reasons for schemas that could not be retrieved. One error is returned for every schema that could
     *         not be retrieved.
     */

    public java.util.List<BatchGetSchemaAnalysisRuleError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be
     * retrieved.
     * </p>
     * 
     * @param errors
     *        Error reasons for schemas that could not be retrieved. One error is returned for every schema that could
     *        not be retrieved.
     */

    public void setErrors(java.util.Collection<BatchGetSchemaAnalysisRuleError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetSchemaAnalysisRuleError>(errors);
    }

    /**
     * <p>
     * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be
     * retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Error reasons for schemas that could not be retrieved. One error is returned for every schema that could
     *        not be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaAnalysisRuleResult withErrors(BatchGetSchemaAnalysisRuleError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetSchemaAnalysisRuleError>(errors.length));
        }
        for (BatchGetSchemaAnalysisRuleError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be
     * retrieved.
     * </p>
     * 
     * @param errors
     *        Error reasons for schemas that could not be retrieved. One error is returned for every schema that could
     *        not be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaAnalysisRuleResult withErrors(java.util.Collection<BatchGetSchemaAnalysisRuleError> errors) {
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
        if (getAnalysisRules() != null)
            sb.append("AnalysisRules: ").append(getAnalysisRules()).append(",");
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

        if (obj instanceof BatchGetSchemaAnalysisRuleResult == false)
            return false;
        BatchGetSchemaAnalysisRuleResult other = (BatchGetSchemaAnalysisRuleResult) obj;
        if (other.getAnalysisRules() == null ^ this.getAnalysisRules() == null)
            return false;
        if (other.getAnalysisRules() != null && other.getAnalysisRules().equals(this.getAnalysisRules()) == false)
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

        hashCode = prime * hashCode + ((getAnalysisRules() == null) ? 0 : getAnalysisRules().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetSchemaAnalysisRuleResult clone() {
        try {
            return (BatchGetSchemaAnalysisRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
