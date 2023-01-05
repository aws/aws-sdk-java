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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/BatchPutPropertyValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutPropertyValuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Entries that caused errors in the batch put operation.
     * </p>
     */
    private java.util.List<BatchPutPropertyErrorEntry> errorEntries;

    /**
     * <p>
     * Entries that caused errors in the batch put operation.
     * </p>
     * 
     * @return Entries that caused errors in the batch put operation.
     */

    public java.util.List<BatchPutPropertyErrorEntry> getErrorEntries() {
        return errorEntries;
    }

    /**
     * <p>
     * Entries that caused errors in the batch put operation.
     * </p>
     * 
     * @param errorEntries
     *        Entries that caused errors in the batch put operation.
     */

    public void setErrorEntries(java.util.Collection<BatchPutPropertyErrorEntry> errorEntries) {
        if (errorEntries == null) {
            this.errorEntries = null;
            return;
        }

        this.errorEntries = new java.util.ArrayList<BatchPutPropertyErrorEntry>(errorEntries);
    }

    /**
     * <p>
     * Entries that caused errors in the batch put operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorEntries(java.util.Collection)} or {@link #withErrorEntries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorEntries
     *        Entries that caused errors in the batch put operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutPropertyValuesResult withErrorEntries(BatchPutPropertyErrorEntry... errorEntries) {
        if (this.errorEntries == null) {
            setErrorEntries(new java.util.ArrayList<BatchPutPropertyErrorEntry>(errorEntries.length));
        }
        for (BatchPutPropertyErrorEntry ele : errorEntries) {
            this.errorEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Entries that caused errors in the batch put operation.
     * </p>
     * 
     * @param errorEntries
     *        Entries that caused errors in the batch put operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutPropertyValuesResult withErrorEntries(java.util.Collection<BatchPutPropertyErrorEntry> errorEntries) {
        setErrorEntries(errorEntries);
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
        if (getErrorEntries() != null)
            sb.append("ErrorEntries: ").append(getErrorEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutPropertyValuesResult == false)
            return false;
        BatchPutPropertyValuesResult other = (BatchPutPropertyValuesResult) obj;
        if (other.getErrorEntries() == null ^ this.getErrorEntries() == null)
            return false;
        if (other.getErrorEntries() != null && other.getErrorEntries().equals(this.getErrorEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorEntries() == null) ? 0 : getErrorEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutPropertyValuesResult clone() {
        try {
            return (BatchPutPropertyValuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
