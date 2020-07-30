/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The following data is returned in JSON format by the service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendBulkEmail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendBulkEmailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<BulkEmailEntryResult> bulkEmailEntryResults;

    /**
     * @return
     */

    public java.util.List<BulkEmailEntryResult> getBulkEmailEntryResults() {
        return bulkEmailEntryResults;
    }

    /**
     * @param bulkEmailEntryResults
     */

    public void setBulkEmailEntryResults(java.util.Collection<BulkEmailEntryResult> bulkEmailEntryResults) {
        if (bulkEmailEntryResults == null) {
            this.bulkEmailEntryResults = null;
            return;
        }

        this.bulkEmailEntryResults = new java.util.ArrayList<BulkEmailEntryResult>(bulkEmailEntryResults);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBulkEmailEntryResults(java.util.Collection)} or
     * {@link #withBulkEmailEntryResults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param bulkEmailEntryResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkEmailResult withBulkEmailEntryResults(BulkEmailEntryResult... bulkEmailEntryResults) {
        if (this.bulkEmailEntryResults == null) {
            setBulkEmailEntryResults(new java.util.ArrayList<BulkEmailEntryResult>(bulkEmailEntryResults.length));
        }
        for (BulkEmailEntryResult ele : bulkEmailEntryResults) {
            this.bulkEmailEntryResults.add(ele);
        }
        return this;
    }

    /**
     * @param bulkEmailEntryResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkEmailResult withBulkEmailEntryResults(java.util.Collection<BulkEmailEntryResult> bulkEmailEntryResults) {
        setBulkEmailEntryResults(bulkEmailEntryResults);
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
        if (getBulkEmailEntryResults() != null)
            sb.append("BulkEmailEntryResults: ").append(getBulkEmailEntryResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendBulkEmailResult == false)
            return false;
        SendBulkEmailResult other = (SendBulkEmailResult) obj;
        if (other.getBulkEmailEntryResults() == null ^ this.getBulkEmailEntryResults() == null)
            return false;
        if (other.getBulkEmailEntryResults() != null && other.getBulkEmailEntryResults().equals(this.getBulkEmailEntryResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBulkEmailEntryResults() == null) ? 0 : getBulkEmailEntryResults().hashCode());
        return hashCode;
    }

    @Override
    public SendBulkEmailResult clone() {
        try {
            return (SendBulkEmailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
