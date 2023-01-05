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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchDeleteDetector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteDetectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of errors associated with the request, or an empty array (<code>[]</code>) if there are no errors. Each
     * error entry contains a <code>messageId</code> that helps you identify the entry that failed.
     * </p>
     */
    private java.util.List<BatchDeleteDetectorErrorEntry> batchDeleteDetectorErrorEntries;

    /**
     * <p>
     * A list of errors associated with the request, or an empty array (<code>[]</code>) if there are no errors. Each
     * error entry contains a <code>messageId</code> that helps you identify the entry that failed.
     * </p>
     * 
     * @return A list of errors associated with the request, or an empty array (<code>[]</code>) if there are no errors.
     *         Each error entry contains a <code>messageId</code> that helps you identify the entry that failed.
     */

    public java.util.List<BatchDeleteDetectorErrorEntry> getBatchDeleteDetectorErrorEntries() {
        return batchDeleteDetectorErrorEntries;
    }

    /**
     * <p>
     * A list of errors associated with the request, or an empty array (<code>[]</code>) if there are no errors. Each
     * error entry contains a <code>messageId</code> that helps you identify the entry that failed.
     * </p>
     * 
     * @param batchDeleteDetectorErrorEntries
     *        A list of errors associated with the request, or an empty array (<code>[]</code>) if there are no errors.
     *        Each error entry contains a <code>messageId</code> that helps you identify the entry that failed.
     */

    public void setBatchDeleteDetectorErrorEntries(java.util.Collection<BatchDeleteDetectorErrorEntry> batchDeleteDetectorErrorEntries) {
        if (batchDeleteDetectorErrorEntries == null) {
            this.batchDeleteDetectorErrorEntries = null;
            return;
        }

        this.batchDeleteDetectorErrorEntries = new java.util.ArrayList<BatchDeleteDetectorErrorEntry>(batchDeleteDetectorErrorEntries);
    }

    /**
     * <p>
     * A list of errors associated with the request, or an empty array (<code>[]</code>) if there are no errors. Each
     * error entry contains a <code>messageId</code> that helps you identify the entry that failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchDeleteDetectorErrorEntries(java.util.Collection)} or
     * {@link #withBatchDeleteDetectorErrorEntries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param batchDeleteDetectorErrorEntries
     *        A list of errors associated with the request, or an empty array (<code>[]</code>) if there are no errors.
     *        Each error entry contains a <code>messageId</code> that helps you identify the entry that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDetectorResult withBatchDeleteDetectorErrorEntries(BatchDeleteDetectorErrorEntry... batchDeleteDetectorErrorEntries) {
        if (this.batchDeleteDetectorErrorEntries == null) {
            setBatchDeleteDetectorErrorEntries(new java.util.ArrayList<BatchDeleteDetectorErrorEntry>(batchDeleteDetectorErrorEntries.length));
        }
        for (BatchDeleteDetectorErrorEntry ele : batchDeleteDetectorErrorEntries) {
            this.batchDeleteDetectorErrorEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors associated with the request, or an empty array (<code>[]</code>) if there are no errors. Each
     * error entry contains a <code>messageId</code> that helps you identify the entry that failed.
     * </p>
     * 
     * @param batchDeleteDetectorErrorEntries
     *        A list of errors associated with the request, or an empty array (<code>[]</code>) if there are no errors.
     *        Each error entry contains a <code>messageId</code> that helps you identify the entry that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDetectorResult withBatchDeleteDetectorErrorEntries(java.util.Collection<BatchDeleteDetectorErrorEntry> batchDeleteDetectorErrorEntries) {
        setBatchDeleteDetectorErrorEntries(batchDeleteDetectorErrorEntries);
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
        if (getBatchDeleteDetectorErrorEntries() != null)
            sb.append("BatchDeleteDetectorErrorEntries: ").append(getBatchDeleteDetectorErrorEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteDetectorResult == false)
            return false;
        BatchDeleteDetectorResult other = (BatchDeleteDetectorResult) obj;
        if (other.getBatchDeleteDetectorErrorEntries() == null ^ this.getBatchDeleteDetectorErrorEntries() == null)
            return false;
        if (other.getBatchDeleteDetectorErrorEntries() != null
                && other.getBatchDeleteDetectorErrorEntries().equals(this.getBatchDeleteDetectorErrorEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchDeleteDetectorErrorEntries() == null) ? 0 : getBatchDeleteDetectorErrorEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteDetectorResult clone() {
        try {
            return (BatchDeleteDetectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
