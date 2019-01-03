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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an operation to perform - either <code>DeleteItem</code> or <code>PutItem</code>. You can only request one
 * of these operations, not both, in a single <code>WriteRequest</code>. If you do need to perform both of these
 * operations, you will need to provide two separate <code>WriteRequest</code> objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/WriteRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     */
    private PutRequest putRequest;
    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     */
    private DeleteRequest deleteRequest;

    /**
     * Default constructor for WriteRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public WriteRequest() {
    }

    /**
     * Constructs a new WriteRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param putRequest
     *        A request to perform a <code>PutItem</code> operation.
     */
    public WriteRequest(PutRequest putRequest) {
        setPutRequest(putRequest);
    }

    /**
     * Constructs a new WriteRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param deleteRequest
     *        A request to perform a <code>DeleteItem</code> operation.
     */
    public WriteRequest(DeleteRequest deleteRequest) {
        setDeleteRequest(deleteRequest);
    }

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     * 
     * @param putRequest
     *        A request to perform a <code>PutItem</code> operation.
     */

    public void setPutRequest(PutRequest putRequest) {
        this.putRequest = putRequest;
    }

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     * 
     * @return A request to perform a <code>PutItem</code> operation.
     */

    public PutRequest getPutRequest() {
        return this.putRequest;
    }

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     * 
     * @param putRequest
     *        A request to perform a <code>PutItem</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteRequest withPutRequest(PutRequest putRequest) {
        setPutRequest(putRequest);
        return this;
    }

    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     * 
     * @param deleteRequest
     *        A request to perform a <code>DeleteItem</code> operation.
     */

    public void setDeleteRequest(DeleteRequest deleteRequest) {
        this.deleteRequest = deleteRequest;
    }

    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     * 
     * @return A request to perform a <code>DeleteItem</code> operation.
     */

    public DeleteRequest getDeleteRequest() {
        return this.deleteRequest;
    }

    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     * 
     * @param deleteRequest
     *        A request to perform a <code>DeleteItem</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteRequest withDeleteRequest(DeleteRequest deleteRequest) {
        setDeleteRequest(deleteRequest);
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
        if (getPutRequest() != null)
            sb.append("PutRequest: ").append(getPutRequest()).append(",");
        if (getDeleteRequest() != null)
            sb.append("DeleteRequest: ").append(getDeleteRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteRequest == false)
            return false;
        WriteRequest other = (WriteRequest) obj;
        if (other.getPutRequest() == null ^ this.getPutRequest() == null)
            return false;
        if (other.getPutRequest() != null && other.getPutRequest().equals(this.getPutRequest()) == false)
            return false;
        if (other.getDeleteRequest() == null ^ this.getDeleteRequest() == null)
            return false;
        if (other.getDeleteRequest() != null && other.getDeleteRequest().equals(this.getDeleteRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPutRequest() == null) ? 0 : getPutRequest().hashCode());
        hashCode = prime * hashCode + ((getDeleteRequest() == null) ? 0 : getDeleteRequest().hashCode());
        return hashCode;
    }

    @Override
    public WriteRequest clone() {
        try {
            return (WriteRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.WriteRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
