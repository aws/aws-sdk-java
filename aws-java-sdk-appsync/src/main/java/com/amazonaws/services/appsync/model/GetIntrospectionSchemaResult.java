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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetIntrospectionSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIntrospectionSchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The schema, in GraphQL Schema Definition Language (SDL) format.
     * </p>
     * <p>
     * For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     * </p>
     */
    private java.nio.ByteBuffer schema;

    /**
     * <p>
     * The schema, in GraphQL Schema Definition Language (SDL) format.
     * </p>
     * <p>
     * For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param schema
     *        The schema, in GraphQL Schema Definition Language (SDL) format.</p>
     *        <p>
     *        For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     */

    public void setSchema(java.nio.ByteBuffer schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema, in GraphQL Schema Definition Language (SDL) format.
     * </p>
     * <p>
     * For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The schema, in GraphQL Schema Definition Language (SDL) format.</p>
     *         <p>
     *         For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     */

    public java.nio.ByteBuffer getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema, in GraphQL Schema Definition Language (SDL) format.
     * </p>
     * <p>
     * For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param schema
     *        The schema, in GraphQL Schema Definition Language (SDL) format.</p>
     *        <p>
     *        For more information, see the <a href="http://graphql.org/learn/schema/">GraphQL SDL documentation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntrospectionSchemaResult withSchema(java.nio.ByteBuffer schema) {
        setSchema(schema);
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
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIntrospectionSchemaResult == false)
            return false;
        GetIntrospectionSchemaResult other = (GetIntrospectionSchemaResult) obj;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public GetIntrospectionSchemaResult clone() {
        try {
            return (GetIntrospectionSchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
