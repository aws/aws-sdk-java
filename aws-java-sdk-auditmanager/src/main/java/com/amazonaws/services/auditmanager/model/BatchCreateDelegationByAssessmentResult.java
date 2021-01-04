/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchCreateDelegationByAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateDelegationByAssessmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The delegations associated with the assessment.
     * </p>
     */
    private java.util.List<Delegation> delegations;
    /**
     * <p>
     * A list of errors returned by the <code>BatchCreateDelegationByAssessment</code> API.
     * </p>
     */
    private java.util.List<BatchCreateDelegationByAssessmentError> errors;

    /**
     * <p>
     * The delegations associated with the assessment.
     * </p>
     * 
     * @return The delegations associated with the assessment.
     */

    public java.util.List<Delegation> getDelegations() {
        return delegations;
    }

    /**
     * <p>
     * The delegations associated with the assessment.
     * </p>
     * 
     * @param delegations
     *        The delegations associated with the assessment.
     */

    public void setDelegations(java.util.Collection<Delegation> delegations) {
        if (delegations == null) {
            this.delegations = null;
            return;
        }

        this.delegations = new java.util.ArrayList<Delegation>(delegations);
    }

    /**
     * <p>
     * The delegations associated with the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDelegations(java.util.Collection)} or {@link #withDelegations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param delegations
     *        The delegations associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateDelegationByAssessmentResult withDelegations(Delegation... delegations) {
        if (this.delegations == null) {
            setDelegations(new java.util.ArrayList<Delegation>(delegations.length));
        }
        for (Delegation ele : delegations) {
            this.delegations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The delegations associated with the assessment.
     * </p>
     * 
     * @param delegations
     *        The delegations associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateDelegationByAssessmentResult withDelegations(java.util.Collection<Delegation> delegations) {
        setDelegations(delegations);
        return this;
    }

    /**
     * <p>
     * A list of errors returned by the <code>BatchCreateDelegationByAssessment</code> API.
     * </p>
     * 
     * @return A list of errors returned by the <code>BatchCreateDelegationByAssessment</code> API.
     */

    public java.util.List<BatchCreateDelegationByAssessmentError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of errors returned by the <code>BatchCreateDelegationByAssessment</code> API.
     * </p>
     * 
     * @param errors
     *        A list of errors returned by the <code>BatchCreateDelegationByAssessment</code> API.
     */

    public void setErrors(java.util.Collection<BatchCreateDelegationByAssessmentError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchCreateDelegationByAssessmentError>(errors);
    }

    /**
     * <p>
     * A list of errors returned by the <code>BatchCreateDelegationByAssessment</code> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of errors returned by the <code>BatchCreateDelegationByAssessment</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateDelegationByAssessmentResult withErrors(BatchCreateDelegationByAssessmentError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchCreateDelegationByAssessmentError>(errors.length));
        }
        for (BatchCreateDelegationByAssessmentError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors returned by the <code>BatchCreateDelegationByAssessment</code> API.
     * </p>
     * 
     * @param errors
     *        A list of errors returned by the <code>BatchCreateDelegationByAssessment</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateDelegationByAssessmentResult withErrors(java.util.Collection<BatchCreateDelegationByAssessmentError> errors) {
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
        if (getDelegations() != null)
            sb.append("Delegations: ").append(getDelegations()).append(",");
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

        if (obj instanceof BatchCreateDelegationByAssessmentResult == false)
            return false;
        BatchCreateDelegationByAssessmentResult other = (BatchCreateDelegationByAssessmentResult) obj;
        if (other.getDelegations() == null ^ this.getDelegations() == null)
            return false;
        if (other.getDelegations() != null && other.getDelegations().equals(this.getDelegations()) == false)
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

        hashCode = prime * hashCode + ((getDelegations() == null) ? 0 : getDelegations().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateDelegationByAssessmentResult clone() {
        try {
            return (BatchCreateDelegationByAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
