/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteImportDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Error messages returned for each import task that you deleted as a response for this command.
     * </p>
     */
    private java.util.List<BatchDeleteImportDataError> errors;

    /**
     * <p>
     * Error messages returned for each import task that you deleted as a response for this command.
     * </p>
     * 
     * @return Error messages returned for each import task that you deleted as a response for this command.
     */

    public java.util.List<BatchDeleteImportDataError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Error messages returned for each import task that you deleted as a response for this command.
     * </p>
     * 
     * @param errors
     *        Error messages returned for each import task that you deleted as a response for this command.
     */

    public void setErrors(java.util.Collection<BatchDeleteImportDataError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchDeleteImportDataError>(errors);
    }

    /**
     * <p>
     * Error messages returned for each import task that you deleted as a response for this command.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Error messages returned for each import task that you deleted as a response for this command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteImportDataResult withErrors(BatchDeleteImportDataError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchDeleteImportDataError>(errors.length));
        }
        for (BatchDeleteImportDataError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Error messages returned for each import task that you deleted as a response for this command.
     * </p>
     * 
     * @param errors
     *        Error messages returned for each import task that you deleted as a response for this command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteImportDataResult withErrors(java.util.Collection<BatchDeleteImportDataError> errors) {
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

        if (obj instanceof BatchDeleteImportDataResult == false)
            return false;
        BatchDeleteImportDataResult other = (BatchDeleteImportDataResult) obj;
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

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteImportDataResult clone() {
        try {
            return (BatchDeleteImportDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
