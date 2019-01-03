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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for <a>DeleteStream</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DeleteStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream to delete.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * If this parameter is unset (<code>null</code>) or if you set it to <code>false</code>, and the stream has
     * registered consumers, the call to <code>DeleteStream</code> fails with a <code>ResourceInUseException</code>.
     * </p>
     */
    private Boolean enforceConsumerDeletion;

    /**
     * <p>
     * The name of the stream to delete.
     * </p>
     * 
     * @param streamName
     *        The name of the stream to delete.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream to delete.
     * </p>
     * 
     * @return The name of the stream to delete.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream to delete.
     * </p>
     * 
     * @param streamName
     *        The name of the stream to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStreamRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * If this parameter is unset (<code>null</code>) or if you set it to <code>false</code>, and the stream has
     * registered consumers, the call to <code>DeleteStream</code> fails with a <code>ResourceInUseException</code>.
     * </p>
     * 
     * @param enforceConsumerDeletion
     *        If this parameter is unset (<code>null</code>) or if you set it to <code>false</code>, and the stream has
     *        registered consumers, the call to <code>DeleteStream</code> fails with a
     *        <code>ResourceInUseException</code>.
     */

    public void setEnforceConsumerDeletion(Boolean enforceConsumerDeletion) {
        this.enforceConsumerDeletion = enforceConsumerDeletion;
    }

    /**
     * <p>
     * If this parameter is unset (<code>null</code>) or if you set it to <code>false</code>, and the stream has
     * registered consumers, the call to <code>DeleteStream</code> fails with a <code>ResourceInUseException</code>.
     * </p>
     * 
     * @return If this parameter is unset (<code>null</code>) or if you set it to <code>false</code>, and the stream has
     *         registered consumers, the call to <code>DeleteStream</code> fails with a
     *         <code>ResourceInUseException</code>.
     */

    public Boolean getEnforceConsumerDeletion() {
        return this.enforceConsumerDeletion;
    }

    /**
     * <p>
     * If this parameter is unset (<code>null</code>) or if you set it to <code>false</code>, and the stream has
     * registered consumers, the call to <code>DeleteStream</code> fails with a <code>ResourceInUseException</code>.
     * </p>
     * 
     * @param enforceConsumerDeletion
     *        If this parameter is unset (<code>null</code>) or if you set it to <code>false</code>, and the stream has
     *        registered consumers, the call to <code>DeleteStream</code> fails with a
     *        <code>ResourceInUseException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStreamRequest withEnforceConsumerDeletion(Boolean enforceConsumerDeletion) {
        setEnforceConsumerDeletion(enforceConsumerDeletion);
        return this;
    }

    /**
     * <p>
     * If this parameter is unset (<code>null</code>) or if you set it to <code>false</code>, and the stream has
     * registered consumers, the call to <code>DeleteStream</code> fails with a <code>ResourceInUseException</code>.
     * </p>
     * 
     * @return If this parameter is unset (<code>null</code>) or if you set it to <code>false</code>, and the stream has
     *         registered consumers, the call to <code>DeleteStream</code> fails with a
     *         <code>ResourceInUseException</code>.
     */

    public Boolean isEnforceConsumerDeletion() {
        return this.enforceConsumerDeletion;
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getEnforceConsumerDeletion() != null)
            sb.append("EnforceConsumerDeletion: ").append(getEnforceConsumerDeletion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStreamRequest == false)
            return false;
        DeleteStreamRequest other = (DeleteStreamRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getEnforceConsumerDeletion() == null ^ this.getEnforceConsumerDeletion() == null)
            return false;
        if (other.getEnforceConsumerDeletion() != null && other.getEnforceConsumerDeletion().equals(this.getEnforceConsumerDeletion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getEnforceConsumerDeletion() == null) ? 0 : getEnforceConsumerDeletion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStreamRequest clone() {
        return (DeleteStreamRequest) super.clone();
    }

}
