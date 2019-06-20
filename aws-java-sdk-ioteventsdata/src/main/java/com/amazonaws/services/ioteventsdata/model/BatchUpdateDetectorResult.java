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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchUpdateDetector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateDetectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of those detector updates that resulted in errors. (If an error is listed here, the specific update did
     * not occur.)
     * </p>
     */
    private java.util.List<BatchUpdateDetectorErrorEntry> batchUpdateDetectorErrorEntries;

    /**
     * <p>
     * A list of those detector updates that resulted in errors. (If an error is listed here, the specific update did
     * not occur.)
     * </p>
     * 
     * @return A list of those detector updates that resulted in errors. (If an error is listed here, the specific
     *         update did not occur.)
     */

    public java.util.List<BatchUpdateDetectorErrorEntry> getBatchUpdateDetectorErrorEntries() {
        return batchUpdateDetectorErrorEntries;
    }

    /**
     * <p>
     * A list of those detector updates that resulted in errors. (If an error is listed here, the specific update did
     * not occur.)
     * </p>
     * 
     * @param batchUpdateDetectorErrorEntries
     *        A list of those detector updates that resulted in errors. (If an error is listed here, the specific update
     *        did not occur.)
     */

    public void setBatchUpdateDetectorErrorEntries(java.util.Collection<BatchUpdateDetectorErrorEntry> batchUpdateDetectorErrorEntries) {
        if (batchUpdateDetectorErrorEntries == null) {
            this.batchUpdateDetectorErrorEntries = null;
            return;
        }

        this.batchUpdateDetectorErrorEntries = new java.util.ArrayList<BatchUpdateDetectorErrorEntry>(batchUpdateDetectorErrorEntries);
    }

    /**
     * <p>
     * A list of those detector updates that resulted in errors. (If an error is listed here, the specific update did
     * not occur.)
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchUpdateDetectorErrorEntries(java.util.Collection)} or
     * {@link #withBatchUpdateDetectorErrorEntries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param batchUpdateDetectorErrorEntries
     *        A list of those detector updates that resulted in errors. (If an error is listed here, the specific update
     *        did not occur.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateDetectorResult withBatchUpdateDetectorErrorEntries(BatchUpdateDetectorErrorEntry... batchUpdateDetectorErrorEntries) {
        if (this.batchUpdateDetectorErrorEntries == null) {
            setBatchUpdateDetectorErrorEntries(new java.util.ArrayList<BatchUpdateDetectorErrorEntry>(batchUpdateDetectorErrorEntries.length));
        }
        for (BatchUpdateDetectorErrorEntry ele : batchUpdateDetectorErrorEntries) {
            this.batchUpdateDetectorErrorEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of those detector updates that resulted in errors. (If an error is listed here, the specific update did
     * not occur.)
     * </p>
     * 
     * @param batchUpdateDetectorErrorEntries
     *        A list of those detector updates that resulted in errors. (If an error is listed here, the specific update
     *        did not occur.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateDetectorResult withBatchUpdateDetectorErrorEntries(java.util.Collection<BatchUpdateDetectorErrorEntry> batchUpdateDetectorErrorEntries) {
        setBatchUpdateDetectorErrorEntries(batchUpdateDetectorErrorEntries);
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
        if (getBatchUpdateDetectorErrorEntries() != null)
            sb.append("BatchUpdateDetectorErrorEntries: ").append(getBatchUpdateDetectorErrorEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateDetectorResult == false)
            return false;
        BatchUpdateDetectorResult other = (BatchUpdateDetectorResult) obj;
        if (other.getBatchUpdateDetectorErrorEntries() == null ^ this.getBatchUpdateDetectorErrorEntries() == null)
            return false;
        if (other.getBatchUpdateDetectorErrorEntries() != null
                && other.getBatchUpdateDetectorErrorEntries().equals(this.getBatchUpdateDetectorErrorEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchUpdateDetectorErrorEntries() == null) ? 0 : getBatchUpdateDetectorErrorEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateDetectorResult clone() {
        try {
            return (BatchUpdateDetectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
