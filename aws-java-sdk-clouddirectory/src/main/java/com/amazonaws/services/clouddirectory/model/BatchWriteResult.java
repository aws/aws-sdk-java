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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchWrite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all the responses for each batch write.
     * </p>
     */
    private java.util.List<BatchWriteOperationResponse> responses;

    /**
     * <p>
     * A list of all the responses for each batch write.
     * </p>
     * 
     * @return A list of all the responses for each batch write.
     */

    public java.util.List<BatchWriteOperationResponse> getResponses() {
        return responses;
    }

    /**
     * <p>
     * A list of all the responses for each batch write.
     * </p>
     * 
     * @param responses
     *        A list of all the responses for each batch write.
     */

    public void setResponses(java.util.Collection<BatchWriteOperationResponse> responses) {
        if (responses == null) {
            this.responses = null;
            return;
        }

        this.responses = new java.util.ArrayList<BatchWriteOperationResponse>(responses);
    }

    /**
     * <p>
     * A list of all the responses for each batch write.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponses(java.util.Collection)} or {@link #withResponses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param responses
     *        A list of all the responses for each batch write.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteResult withResponses(BatchWriteOperationResponse... responses) {
        if (this.responses == null) {
            setResponses(new java.util.ArrayList<BatchWriteOperationResponse>(responses.length));
        }
        for (BatchWriteOperationResponse ele : responses) {
            this.responses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all the responses for each batch write.
     * </p>
     * 
     * @param responses
     *        A list of all the responses for each batch write.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteResult withResponses(java.util.Collection<BatchWriteOperationResponse> responses) {
        setResponses(responses);
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
        if (getResponses() != null)
            sb.append("Responses: ").append(getResponses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchWriteResult == false)
            return false;
        BatchWriteResult other = (BatchWriteResult) obj;
        if (other.getResponses() == null ^ this.getResponses() == null)
            return false;
        if (other.getResponses() != null && other.getResponses().equals(this.getResponses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponses() == null) ? 0 : getResponses().hashCode());
        return hashCode;
    }

    @Override
    public BatchWriteResult clone() {
        try {
            return (BatchWriteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
