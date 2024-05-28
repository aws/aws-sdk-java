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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/BatchGetJobEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetJobEntityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the job entities, or details, in the batch.
     * </p>
     */
    private java.util.List<JobEntity> entities;
    /**
     * <p>
     * A list of errors from the job error logs for the batch.
     * </p>
     */
    private java.util.List<GetJobEntityError> errors;

    /**
     * <p>
     * A list of the job entities, or details, in the batch.
     * </p>
     * 
     * @return A list of the job entities, or details, in the batch.
     */

    public java.util.List<JobEntity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * A list of the job entities, or details, in the batch.
     * </p>
     * 
     * @param entities
     *        A list of the job entities, or details, in the batch.
     */

    public void setEntities(java.util.Collection<JobEntity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<JobEntity>(entities);
    }

    /**
     * <p>
     * A list of the job entities, or details, in the batch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        A list of the job entities, or details, in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobEntityResult withEntities(JobEntity... entities) {
        if (this.entities == null) {
            setEntities(new java.util.ArrayList<JobEntity>(entities.length));
        }
        for (JobEntity ele : entities) {
            this.entities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the job entities, or details, in the batch.
     * </p>
     * 
     * @param entities
     *        A list of the job entities, or details, in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobEntityResult withEntities(java.util.Collection<JobEntity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * A list of errors from the job error logs for the batch.
     * </p>
     * 
     * @return A list of errors from the job error logs for the batch.
     */

    public java.util.List<GetJobEntityError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of errors from the job error logs for the batch.
     * </p>
     * 
     * @param errors
     *        A list of errors from the job error logs for the batch.
     */

    public void setErrors(java.util.Collection<GetJobEntityError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<GetJobEntityError>(errors);
    }

    /**
     * <p>
     * A list of errors from the job error logs for the batch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of errors from the job error logs for the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobEntityResult withErrors(GetJobEntityError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<GetJobEntityError>(errors.length));
        }
        for (GetJobEntityError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors from the job error logs for the batch.
     * </p>
     * 
     * @param errors
     *        A list of errors from the job error logs for the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobEntityResult withErrors(java.util.Collection<GetJobEntityError> errors) {
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
        if (getEntities() != null)
            sb.append("Entities: ").append(getEntities()).append(",");
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

        if (obj instanceof BatchGetJobEntityResult == false)
            return false;
        BatchGetJobEntityResult other = (BatchGetJobEntityResult) obj;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
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

        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetJobEntityResult clone() {
        try {
            return (BatchGetJobEntityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
