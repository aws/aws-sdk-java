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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetTableOptimizer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetTableOptimizerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>BatchGetTableOptimizerEntry</code> objects specifying the table optimizers to retrieve.
     * </p>
     */
    private java.util.List<BatchGetTableOptimizerEntry> entries;

    /**
     * <p>
     * A list of <code>BatchGetTableOptimizerEntry</code> objects specifying the table optimizers to retrieve.
     * </p>
     * 
     * @return A list of <code>BatchGetTableOptimizerEntry</code> objects specifying the table optimizers to retrieve.
     */

    public java.util.List<BatchGetTableOptimizerEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * A list of <code>BatchGetTableOptimizerEntry</code> objects specifying the table optimizers to retrieve.
     * </p>
     * 
     * @param entries
     *        A list of <code>BatchGetTableOptimizerEntry</code> objects specifying the table optimizers to retrieve.
     */

    public void setEntries(java.util.Collection<BatchGetTableOptimizerEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<BatchGetTableOptimizerEntry>(entries);
    }

    /**
     * <p>
     * A list of <code>BatchGetTableOptimizerEntry</code> objects specifying the table optimizers to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        A list of <code>BatchGetTableOptimizerEntry</code> objects specifying the table optimizers to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTableOptimizerRequest withEntries(BatchGetTableOptimizerEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<BatchGetTableOptimizerEntry>(entries.length));
        }
        for (BatchGetTableOptimizerEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>BatchGetTableOptimizerEntry</code> objects specifying the table optimizers to retrieve.
     * </p>
     * 
     * @param entries
     *        A list of <code>BatchGetTableOptimizerEntry</code> objects specifying the table optimizers to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTableOptimizerRequest withEntries(java.util.Collection<BatchGetTableOptimizerEntry> entries) {
        setEntries(entries);
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetTableOptimizerRequest == false)
            return false;
        BatchGetTableOptimizerRequest other = (BatchGetTableOptimizerRequest) obj;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetTableOptimizerRequest clone() {
        return (BatchGetTableOptimizerRequest) super.clone();
    }

}
