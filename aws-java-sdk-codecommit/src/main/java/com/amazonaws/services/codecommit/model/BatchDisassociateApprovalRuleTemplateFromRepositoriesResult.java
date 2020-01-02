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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDisassociateApprovalRuleTemplateFromRepositories"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateApprovalRuleTemplateFromRepositoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of repository names that have had their association with the template removed.
     * </p>
     */
    private java.util.List<String> disassociatedRepositoryNames;
    /**
     * <p>
     * A list of any errors that might have occurred while attempting to remove the association between the template and
     * the repositories.
     * </p>
     */
    private java.util.List<BatchDisassociateApprovalRuleTemplateFromRepositoriesError> errors;

    /**
     * <p>
     * A list of repository names that have had their association with the template removed.
     * </p>
     * 
     * @return A list of repository names that have had their association with the template removed.
     */

    public java.util.List<String> getDisassociatedRepositoryNames() {
        return disassociatedRepositoryNames;
    }

    /**
     * <p>
     * A list of repository names that have had their association with the template removed.
     * </p>
     * 
     * @param disassociatedRepositoryNames
     *        A list of repository names that have had their association with the template removed.
     */

    public void setDisassociatedRepositoryNames(java.util.Collection<String> disassociatedRepositoryNames) {
        if (disassociatedRepositoryNames == null) {
            this.disassociatedRepositoryNames = null;
            return;
        }

        this.disassociatedRepositoryNames = new java.util.ArrayList<String>(disassociatedRepositoryNames);
    }

    /**
     * <p>
     * A list of repository names that have had their association with the template removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisassociatedRepositoryNames(java.util.Collection)} or
     * {@link #withDisassociatedRepositoryNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param disassociatedRepositoryNames
     *        A list of repository names that have had their association with the template removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult withDisassociatedRepositoryNames(String... disassociatedRepositoryNames) {
        if (this.disassociatedRepositoryNames == null) {
            setDisassociatedRepositoryNames(new java.util.ArrayList<String>(disassociatedRepositoryNames.length));
        }
        for (String ele : disassociatedRepositoryNames) {
            this.disassociatedRepositoryNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of repository names that have had their association with the template removed.
     * </p>
     * 
     * @param disassociatedRepositoryNames
     *        A list of repository names that have had their association with the template removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult withDisassociatedRepositoryNames(
            java.util.Collection<String> disassociatedRepositoryNames) {
        setDisassociatedRepositoryNames(disassociatedRepositoryNames);
        return this;
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to remove the association between the template and
     * the repositories.
     * </p>
     * 
     * @return A list of any errors that might have occurred while attempting to remove the association between the
     *         template and the repositories.
     */

    public java.util.List<BatchDisassociateApprovalRuleTemplateFromRepositoriesError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to remove the association between the template and
     * the repositories.
     * </p>
     * 
     * @param errors
     *        A list of any errors that might have occurred while attempting to remove the association between the
     *        template and the repositories.
     */

    public void setErrors(java.util.Collection<BatchDisassociateApprovalRuleTemplateFromRepositoriesError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchDisassociateApprovalRuleTemplateFromRepositoriesError>(errors);
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to remove the association between the template and
     * the repositories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of any errors that might have occurred while attempting to remove the association between the
     *        template and the repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult withErrors(BatchDisassociateApprovalRuleTemplateFromRepositoriesError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchDisassociateApprovalRuleTemplateFromRepositoriesError>(errors.length));
        }
        for (BatchDisassociateApprovalRuleTemplateFromRepositoriesError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to remove the association between the template and
     * the repositories.
     * </p>
     * 
     * @param errors
     *        A list of any errors that might have occurred while attempting to remove the association between the
     *        template and the repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult withErrors(
            java.util.Collection<BatchDisassociateApprovalRuleTemplateFromRepositoriesError> errors) {
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
        if (getDisassociatedRepositoryNames() != null)
            sb.append("DisassociatedRepositoryNames: ").append(getDisassociatedRepositoryNames()).append(",");
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

        if (obj instanceof BatchDisassociateApprovalRuleTemplateFromRepositoriesResult == false)
            return false;
        BatchDisassociateApprovalRuleTemplateFromRepositoriesResult other = (BatchDisassociateApprovalRuleTemplateFromRepositoriesResult) obj;
        if (other.getDisassociatedRepositoryNames() == null ^ this.getDisassociatedRepositoryNames() == null)
            return false;
        if (other.getDisassociatedRepositoryNames() != null && other.getDisassociatedRepositoryNames().equals(this.getDisassociatedRepositoryNames()) == false)
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

        hashCode = prime * hashCode + ((getDisassociatedRepositoryNames() == null) ? 0 : getDisassociatedRepositoryNames().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult clone() {
        try {
            return (BatchDisassociateApprovalRuleTemplateFromRepositoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
