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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of names of the connection definitions that were successfully deleted.
     * </p>
     */
    private java.util.List<String> succeeded;
    /**
     * <p>
     * A map of the names of connections that were not successfully deleted to error details.
     * </p>
     */
    private java.util.Map<String, ErrorDetail> errors;

    /**
     * <p>
     * A list of names of the connection definitions that were successfully deleted.
     * </p>
     * 
     * @return A list of names of the connection definitions that were successfully deleted.
     */

    public java.util.List<String> getSucceeded() {
        return succeeded;
    }

    /**
     * <p>
     * A list of names of the connection definitions that were successfully deleted.
     * </p>
     * 
     * @param succeeded
     *        A list of names of the connection definitions that were successfully deleted.
     */

    public void setSucceeded(java.util.Collection<String> succeeded) {
        if (succeeded == null) {
            this.succeeded = null;
            return;
        }

        this.succeeded = new java.util.ArrayList<String>(succeeded);
    }

    /**
     * <p>
     * A list of names of the connection definitions that were successfully deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSucceeded(java.util.Collection)} or {@link #withSucceeded(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param succeeded
     *        A list of names of the connection definitions that were successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConnectionResult withSucceeded(String... succeeded) {
        if (this.succeeded == null) {
            setSucceeded(new java.util.ArrayList<String>(succeeded.length));
        }
        for (String ele : succeeded) {
            this.succeeded.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of the connection definitions that were successfully deleted.
     * </p>
     * 
     * @param succeeded
     *        A list of names of the connection definitions that were successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConnectionResult withSucceeded(java.util.Collection<String> succeeded) {
        setSucceeded(succeeded);
        return this;
    }

    /**
     * <p>
     * A map of the names of connections that were not successfully deleted to error details.
     * </p>
     * 
     * @return A map of the names of connections that were not successfully deleted to error details.
     */

    public java.util.Map<String, ErrorDetail> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A map of the names of connections that were not successfully deleted to error details.
     * </p>
     * 
     * @param errors
     *        A map of the names of connections that were not successfully deleted to error details.
     */

    public void setErrors(java.util.Map<String, ErrorDetail> errors) {
        this.errors = errors;
    }

    /**
     * <p>
     * A map of the names of connections that were not successfully deleted to error details.
     * </p>
     * 
     * @param errors
     *        A map of the names of connections that were not successfully deleted to error details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConnectionResult withErrors(java.util.Map<String, ErrorDetail> errors) {
        setErrors(errors);
        return this;
    }

    public BatchDeleteConnectionResult addErrorsEntry(String key, ErrorDetail value) {
        if (null == this.errors) {
            this.errors = new java.util.HashMap<String, ErrorDetail>();
        }
        if (this.errors.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.errors.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Errors.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConnectionResult clearErrorsEntries() {
        this.errors = null;
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
        if (getSucceeded() != null)
            sb.append("Succeeded: ").append(getSucceeded()).append(",");
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

        if (obj instanceof BatchDeleteConnectionResult == false)
            return false;
        BatchDeleteConnectionResult other = (BatchDeleteConnectionResult) obj;
        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null && other.getSucceeded().equals(this.getSucceeded()) == false)
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

        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteConnectionResult clone() {
        try {
            return (BatchDeleteConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
