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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateColumnStatisticsForTable"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateColumnStatisticsForTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * List of ColumnStatisticsErrors.
     * </p>
     */
    private java.util.List<ColumnStatisticsError> errors;

    /**
     * <p>
     * List of ColumnStatisticsErrors.
     * </p>
     * 
     * @return List of ColumnStatisticsErrors.
     */

    public java.util.List<ColumnStatisticsError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * List of ColumnStatisticsErrors.
     * </p>
     * 
     * @param errors
     *        List of ColumnStatisticsErrors.
     */

    public void setErrors(java.util.Collection<ColumnStatisticsError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ColumnStatisticsError>(errors);
    }

    /**
     * <p>
     * List of ColumnStatisticsErrors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        List of ColumnStatisticsErrors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateColumnStatisticsForTableResult withErrors(ColumnStatisticsError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<ColumnStatisticsError>(errors.length));
        }
        for (ColumnStatisticsError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ColumnStatisticsErrors.
     * </p>
     * 
     * @param errors
     *        List of ColumnStatisticsErrors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateColumnStatisticsForTableResult withErrors(java.util.Collection<ColumnStatisticsError> errors) {
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

        if (obj instanceof UpdateColumnStatisticsForTableResult == false)
            return false;
        UpdateColumnStatisticsForTableResult other = (UpdateColumnStatisticsForTableResult) obj;
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
    public UpdateColumnStatisticsForTableResult clone() {
        try {
            return (UpdateColumnStatisticsForTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
