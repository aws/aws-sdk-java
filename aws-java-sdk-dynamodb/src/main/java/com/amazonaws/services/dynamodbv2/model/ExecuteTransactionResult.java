/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ExecuteTransaction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteTransactionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response to a PartiQL transaction.
     * </p>
     */
    private java.util.List<ItemResponse> responses;

    /**
     * <p>
     * The response to a PartiQL transaction.
     * </p>
     * 
     * @return The response to a PartiQL transaction.
     */

    public java.util.List<ItemResponse> getResponses() {
        return responses;
    }

    /**
     * <p>
     * The response to a PartiQL transaction.
     * </p>
     * 
     * @param responses
     *        The response to a PartiQL transaction.
     */

    public void setResponses(java.util.Collection<ItemResponse> responses) {
        if (responses == null) {
            this.responses = null;
            return;
        }

        this.responses = new java.util.ArrayList<ItemResponse>(responses);
    }

    /**
     * <p>
     * The response to a PartiQL transaction.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponses(java.util.Collection)} or {@link #withResponses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param responses
     *        The response to a PartiQL transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteTransactionResult withResponses(ItemResponse... responses) {
        if (this.responses == null) {
            setResponses(new java.util.ArrayList<ItemResponse>(responses.length));
        }
        for (ItemResponse ele : responses) {
            this.responses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The response to a PartiQL transaction.
     * </p>
     * 
     * @param responses
     *        The response to a PartiQL transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteTransactionResult withResponses(java.util.Collection<ItemResponse> responses) {
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

        if (obj instanceof ExecuteTransactionResult == false)
            return false;
        ExecuteTransactionResult other = (ExecuteTransactionResult) obj;
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
    public ExecuteTransactionResult clone() {
        try {
            return (ExecuteTransactionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
