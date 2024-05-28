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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetCollaborationAnalysisTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCollaborationAnalysisTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The retrieved list of analysis templates within a collaboration.
     * </p>
     */
    private java.util.List<CollaborationAnalysisTemplate> collaborationAnalysisTemplates;
    /**
     * <p>
     * Error reasons for collaboration analysis templates that could not be retrieved. One error is returned for every
     * collaboration analysis template that could not be retrieved.
     * </p>
     */
    private java.util.List<BatchGetCollaborationAnalysisTemplateError> errors;

    /**
     * <p>
     * The retrieved list of analysis templates within a collaboration.
     * </p>
     * 
     * @return The retrieved list of analysis templates within a collaboration.
     */

    public java.util.List<CollaborationAnalysisTemplate> getCollaborationAnalysisTemplates() {
        return collaborationAnalysisTemplates;
    }

    /**
     * <p>
     * The retrieved list of analysis templates within a collaboration.
     * </p>
     * 
     * @param collaborationAnalysisTemplates
     *        The retrieved list of analysis templates within a collaboration.
     */

    public void setCollaborationAnalysisTemplates(java.util.Collection<CollaborationAnalysisTemplate> collaborationAnalysisTemplates) {
        if (collaborationAnalysisTemplates == null) {
            this.collaborationAnalysisTemplates = null;
            return;
        }

        this.collaborationAnalysisTemplates = new java.util.ArrayList<CollaborationAnalysisTemplate>(collaborationAnalysisTemplates);
    }

    /**
     * <p>
     * The retrieved list of analysis templates within a collaboration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollaborationAnalysisTemplates(java.util.Collection)} or
     * {@link #withCollaborationAnalysisTemplates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param collaborationAnalysisTemplates
     *        The retrieved list of analysis templates within a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollaborationAnalysisTemplateResult withCollaborationAnalysisTemplates(CollaborationAnalysisTemplate... collaborationAnalysisTemplates) {
        if (this.collaborationAnalysisTemplates == null) {
            setCollaborationAnalysisTemplates(new java.util.ArrayList<CollaborationAnalysisTemplate>(collaborationAnalysisTemplates.length));
        }
        for (CollaborationAnalysisTemplate ele : collaborationAnalysisTemplates) {
            this.collaborationAnalysisTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The retrieved list of analysis templates within a collaboration.
     * </p>
     * 
     * @param collaborationAnalysisTemplates
     *        The retrieved list of analysis templates within a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollaborationAnalysisTemplateResult withCollaborationAnalysisTemplates(
            java.util.Collection<CollaborationAnalysisTemplate> collaborationAnalysisTemplates) {
        setCollaborationAnalysisTemplates(collaborationAnalysisTemplates);
        return this;
    }

    /**
     * <p>
     * Error reasons for collaboration analysis templates that could not be retrieved. One error is returned for every
     * collaboration analysis template that could not be retrieved.
     * </p>
     * 
     * @return Error reasons for collaboration analysis templates that could not be retrieved. One error is returned for
     *         every collaboration analysis template that could not be retrieved.
     */

    public java.util.List<BatchGetCollaborationAnalysisTemplateError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Error reasons for collaboration analysis templates that could not be retrieved. One error is returned for every
     * collaboration analysis template that could not be retrieved.
     * </p>
     * 
     * @param errors
     *        Error reasons for collaboration analysis templates that could not be retrieved. One error is returned for
     *        every collaboration analysis template that could not be retrieved.
     */

    public void setErrors(java.util.Collection<BatchGetCollaborationAnalysisTemplateError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetCollaborationAnalysisTemplateError>(errors);
    }

    /**
     * <p>
     * Error reasons for collaboration analysis templates that could not be retrieved. One error is returned for every
     * collaboration analysis template that could not be retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Error reasons for collaboration analysis templates that could not be retrieved. One error is returned for
     *        every collaboration analysis template that could not be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollaborationAnalysisTemplateResult withErrors(BatchGetCollaborationAnalysisTemplateError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetCollaborationAnalysisTemplateError>(errors.length));
        }
        for (BatchGetCollaborationAnalysisTemplateError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Error reasons for collaboration analysis templates that could not be retrieved. One error is returned for every
     * collaboration analysis template that could not be retrieved.
     * </p>
     * 
     * @param errors
     *        Error reasons for collaboration analysis templates that could not be retrieved. One error is returned for
     *        every collaboration analysis template that could not be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollaborationAnalysisTemplateResult withErrors(java.util.Collection<BatchGetCollaborationAnalysisTemplateError> errors) {
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
        if (getCollaborationAnalysisTemplates() != null)
            sb.append("CollaborationAnalysisTemplates: ").append(getCollaborationAnalysisTemplates()).append(",");
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

        if (obj instanceof BatchGetCollaborationAnalysisTemplateResult == false)
            return false;
        BatchGetCollaborationAnalysisTemplateResult other = (BatchGetCollaborationAnalysisTemplateResult) obj;
        if (other.getCollaborationAnalysisTemplates() == null ^ this.getCollaborationAnalysisTemplates() == null)
            return false;
        if (other.getCollaborationAnalysisTemplates() != null
                && other.getCollaborationAnalysisTemplates().equals(this.getCollaborationAnalysisTemplates()) == false)
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

        hashCode = prime * hashCode + ((getCollaborationAnalysisTemplates() == null) ? 0 : getCollaborationAnalysisTemplates().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCollaborationAnalysisTemplateResult clone() {
        try {
            return (BatchGetCollaborationAnalysisTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
