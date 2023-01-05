/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/BatchGetView" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetViewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If any of the specified ARNs result in an error, then this structure describes the error.
     * </p>
     */
    private java.util.List<BatchGetViewError> errors;
    /**
     * <p>
     * A structure with a list of objects with details for each of the specified views.
     * </p>
     */
    private java.util.List<View> views;

    /**
     * <p>
     * If any of the specified ARNs result in an error, then this structure describes the error.
     * </p>
     * 
     * @return If any of the specified ARNs result in an error, then this structure describes the error.
     */

    public java.util.List<BatchGetViewError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * If any of the specified ARNs result in an error, then this structure describes the error.
     * </p>
     * 
     * @param errors
     *        If any of the specified ARNs result in an error, then this structure describes the error.
     */

    public void setErrors(java.util.Collection<BatchGetViewError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetViewError>(errors);
    }

    /**
     * <p>
     * If any of the specified ARNs result in an error, then this structure describes the error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        If any of the specified ARNs result in an error, then this structure describes the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetViewResult withErrors(BatchGetViewError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetViewError>(errors.length));
        }
        for (BatchGetViewError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If any of the specified ARNs result in an error, then this structure describes the error.
     * </p>
     * 
     * @param errors
     *        If any of the specified ARNs result in an error, then this structure describes the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetViewResult withErrors(java.util.Collection<BatchGetViewError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * A structure with a list of objects with details for each of the specified views.
     * </p>
     * 
     * @return A structure with a list of objects with details for each of the specified views.
     */

    public java.util.List<View> getViews() {
        return views;
    }

    /**
     * <p>
     * A structure with a list of objects with details for each of the specified views.
     * </p>
     * 
     * @param views
     *        A structure with a list of objects with details for each of the specified views.
     */

    public void setViews(java.util.Collection<View> views) {
        if (views == null) {
            this.views = null;
            return;
        }

        this.views = new java.util.ArrayList<View>(views);
    }

    /**
     * <p>
     * A structure with a list of objects with details for each of the specified views.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViews(java.util.Collection)} or {@link #withViews(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param views
     *        A structure with a list of objects with details for each of the specified views.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetViewResult withViews(View... views) {
        if (this.views == null) {
            setViews(new java.util.ArrayList<View>(views.length));
        }
        for (View ele : views) {
            this.views.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure with a list of objects with details for each of the specified views.
     * </p>
     * 
     * @param views
     *        A structure with a list of objects with details for each of the specified views.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetViewResult withViews(java.util.Collection<View> views) {
        setViews(views);
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
        if (getViews() != null)
            sb.append("Views: ").append(getViews());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetViewResult == false)
            return false;
        BatchGetViewResult other = (BatchGetViewResult) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getViews() == null ^ this.getViews() == null)
            return false;
        if (other.getViews() != null && other.getViews().equals(this.getViews()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getViews() == null) ? 0 : getViews().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetViewResult clone() {
        try {
            return (BatchGetViewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
