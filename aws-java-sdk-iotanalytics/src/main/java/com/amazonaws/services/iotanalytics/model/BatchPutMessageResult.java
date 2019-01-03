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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/BatchPutMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutMessageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of any errors encountered when sending the messages to the channel.
     * </p>
     */
    private java.util.List<BatchPutMessageErrorEntry> batchPutMessageErrorEntries;

    /**
     * <p>
     * A list of any errors encountered when sending the messages to the channel.
     * </p>
     * 
     * @return A list of any errors encountered when sending the messages to the channel.
     */

    public java.util.List<BatchPutMessageErrorEntry> getBatchPutMessageErrorEntries() {
        return batchPutMessageErrorEntries;
    }

    /**
     * <p>
     * A list of any errors encountered when sending the messages to the channel.
     * </p>
     * 
     * @param batchPutMessageErrorEntries
     *        A list of any errors encountered when sending the messages to the channel.
     */

    public void setBatchPutMessageErrorEntries(java.util.Collection<BatchPutMessageErrorEntry> batchPutMessageErrorEntries) {
        if (batchPutMessageErrorEntries == null) {
            this.batchPutMessageErrorEntries = null;
            return;
        }

        this.batchPutMessageErrorEntries = new java.util.ArrayList<BatchPutMessageErrorEntry>(batchPutMessageErrorEntries);
    }

    /**
     * <p>
     * A list of any errors encountered when sending the messages to the channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchPutMessageErrorEntries(java.util.Collection)} or
     * {@link #withBatchPutMessageErrorEntries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param batchPutMessageErrorEntries
     *        A list of any errors encountered when sending the messages to the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutMessageResult withBatchPutMessageErrorEntries(BatchPutMessageErrorEntry... batchPutMessageErrorEntries) {
        if (this.batchPutMessageErrorEntries == null) {
            setBatchPutMessageErrorEntries(new java.util.ArrayList<BatchPutMessageErrorEntry>(batchPutMessageErrorEntries.length));
        }
        for (BatchPutMessageErrorEntry ele : batchPutMessageErrorEntries) {
            this.batchPutMessageErrorEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of any errors encountered when sending the messages to the channel.
     * </p>
     * 
     * @param batchPutMessageErrorEntries
     *        A list of any errors encountered when sending the messages to the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutMessageResult withBatchPutMessageErrorEntries(java.util.Collection<BatchPutMessageErrorEntry> batchPutMessageErrorEntries) {
        setBatchPutMessageErrorEntries(batchPutMessageErrorEntries);
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
        if (getBatchPutMessageErrorEntries() != null)
            sb.append("BatchPutMessageErrorEntries: ").append(getBatchPutMessageErrorEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutMessageResult == false)
            return false;
        BatchPutMessageResult other = (BatchPutMessageResult) obj;
        if (other.getBatchPutMessageErrorEntries() == null ^ this.getBatchPutMessageErrorEntries() == null)
            return false;
        if (other.getBatchPutMessageErrorEntries() != null && other.getBatchPutMessageErrorEntries().equals(this.getBatchPutMessageErrorEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchPutMessageErrorEntries() == null) ? 0 : getBatchPutMessageErrorEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutMessageResult clone() {
        try {
            return (BatchPutMessageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
