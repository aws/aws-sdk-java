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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/BatchGetIncidentFindings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetIncidentFindingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of errors encountered during the operation.
     * </p>
     */
    private java.util.List<BatchGetIncidentFindingsError> errors;
    /**
     * <p>
     * Information about the requested findings.
     * </p>
     */
    private java.util.List<Finding> findings;

    /**
     * <p>
     * A list of errors encountered during the operation.
     * </p>
     * 
     * @return A list of errors encountered during the operation.
     */

    public java.util.List<BatchGetIncidentFindingsError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of errors encountered during the operation.
     * </p>
     * 
     * @param errors
     *        A list of errors encountered during the operation.
     */

    public void setErrors(java.util.Collection<BatchGetIncidentFindingsError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetIncidentFindingsError>(errors);
    }

    /**
     * <p>
     * A list of errors encountered during the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of errors encountered during the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetIncidentFindingsResult withErrors(BatchGetIncidentFindingsError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetIncidentFindingsError>(errors.length));
        }
        for (BatchGetIncidentFindingsError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors encountered during the operation.
     * </p>
     * 
     * @param errors
     *        A list of errors encountered during the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetIncidentFindingsResult withErrors(java.util.Collection<BatchGetIncidentFindingsError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Information about the requested findings.
     * </p>
     * 
     * @return Information about the requested findings.
     */

    public java.util.List<Finding> getFindings() {
        return findings;
    }

    /**
     * <p>
     * Information about the requested findings.
     * </p>
     * 
     * @param findings
     *        Information about the requested findings.
     */

    public void setFindings(java.util.Collection<Finding> findings) {
        if (findings == null) {
            this.findings = null;
            return;
        }

        this.findings = new java.util.ArrayList<Finding>(findings);
    }

    /**
     * <p>
     * Information about the requested findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindings(java.util.Collection)} or {@link #withFindings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param findings
     *        Information about the requested findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetIncidentFindingsResult withFindings(Finding... findings) {
        if (this.findings == null) {
            setFindings(new java.util.ArrayList<Finding>(findings.length));
        }
        for (Finding ele : findings) {
            this.findings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the requested findings.
     * </p>
     * 
     * @param findings
     *        Information about the requested findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetIncidentFindingsResult withFindings(java.util.Collection<Finding> findings) {
        setFindings(findings);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getFindings() != null)
            sb.append("Findings: ").append(getFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetIncidentFindingsResult == false)
            return false;
        BatchGetIncidentFindingsResult other = (BatchGetIncidentFindingsResult) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getFindings() == null ^ this.getFindings() == null)
            return false;
        if (other.getFindings() != null && other.getFindings().equals(this.getFindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getFindings() == null) ? 0 : getFindings().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetIncidentFindingsResult clone() {
        try {
            return (BatchGetIncidentFindingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
