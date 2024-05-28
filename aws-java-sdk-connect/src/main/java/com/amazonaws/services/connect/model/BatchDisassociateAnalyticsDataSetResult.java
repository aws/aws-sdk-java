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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchDisassociateAnalyticsDataSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateAnalyticsDataSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of successfully disassociated dataset identifiers.
     * </p>
     */
    private java.util.List<String> deleted;
    /**
     * <p>
     * A list of errors for any datasets not successfully removed.
     * </p>
     */
    private java.util.List<ErrorResult> errors;

    /**
     * <p>
     * An array of successfully disassociated dataset identifiers.
     * </p>
     * 
     * @return An array of successfully disassociated dataset identifiers.
     */

    public java.util.List<String> getDeleted() {
        return deleted;
    }

    /**
     * <p>
     * An array of successfully disassociated dataset identifiers.
     * </p>
     * 
     * @param deleted
     *        An array of successfully disassociated dataset identifiers.
     */

    public void setDeleted(java.util.Collection<String> deleted) {
        if (deleted == null) {
            this.deleted = null;
            return;
        }

        this.deleted = new java.util.ArrayList<String>(deleted);
    }

    /**
     * <p>
     * An array of successfully disassociated dataset identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeleted(java.util.Collection)} or {@link #withDeleted(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param deleted
     *        An array of successfully disassociated dataset identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAnalyticsDataSetResult withDeleted(String... deleted) {
        if (this.deleted == null) {
            setDeleted(new java.util.ArrayList<String>(deleted.length));
        }
        for (String ele : deleted) {
            this.deleted.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of successfully disassociated dataset identifiers.
     * </p>
     * 
     * @param deleted
     *        An array of successfully disassociated dataset identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAnalyticsDataSetResult withDeleted(java.util.Collection<String> deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * A list of errors for any datasets not successfully removed.
     * </p>
     * 
     * @return A list of errors for any datasets not successfully removed.
     */

    public java.util.List<ErrorResult> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of errors for any datasets not successfully removed.
     * </p>
     * 
     * @param errors
     *        A list of errors for any datasets not successfully removed.
     */

    public void setErrors(java.util.Collection<ErrorResult> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ErrorResult>(errors);
    }

    /**
     * <p>
     * A list of errors for any datasets not successfully removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of errors for any datasets not successfully removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAnalyticsDataSetResult withErrors(ErrorResult... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<ErrorResult>(errors.length));
        }
        for (ErrorResult ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors for any datasets not successfully removed.
     * </p>
     * 
     * @param errors
     *        A list of errors for any datasets not successfully removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAnalyticsDataSetResult withErrors(java.util.Collection<ErrorResult> errors) {
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
        if (getDeleted() != null)
            sb.append("Deleted: ").append(getDeleted()).append(",");
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

        if (obj instanceof BatchDisassociateAnalyticsDataSetResult == false)
            return false;
        BatchDisassociateAnalyticsDataSetResult other = (BatchDisassociateAnalyticsDataSetResult) obj;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
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

        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateAnalyticsDataSetResult clone() {
        try {
            return (BatchDisassociateAnalyticsDataSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
