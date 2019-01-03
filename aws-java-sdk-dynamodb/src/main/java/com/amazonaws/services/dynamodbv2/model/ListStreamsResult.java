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

/**
 * <p>
 * Represents the output of a <code>ListStreams</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/ListStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of stream descriptors associated with the current account and endpoint.
     * </p>
     */
    private java.util.List<Stream> streams;
    /**
     * <p>
     * The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedStreamArn</code> is empty, then the "last page" of results has been processed and there is
     * no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedStreamArn</code> is not empty, it does not necessarily mean that there is more data in the
     * result set. The only way to know when you have reached the end of the result set is when
     * <code>LastEvaluatedStreamArn</code> is empty.
     * </p>
     */
    private String lastEvaluatedStreamArn;

    /**
     * <p>
     * A list of stream descriptors associated with the current account and endpoint.
     * </p>
     * 
     * @return A list of stream descriptors associated with the current account and endpoint.
     */

    public java.util.List<Stream> getStreams() {
        return streams;
    }

    /**
     * <p>
     * A list of stream descriptors associated with the current account and endpoint.
     * </p>
     * 
     * @param streams
     *        A list of stream descriptors associated with the current account and endpoint.
     */

    public void setStreams(java.util.Collection<Stream> streams) {
        if (streams == null) {
            this.streams = null;
            return;
        }

        this.streams = new java.util.ArrayList<Stream>(streams);
    }

    /**
     * <p>
     * A list of stream descriptors associated with the current account and endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreams(java.util.Collection)} or {@link #withStreams(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param streams
     *        A list of stream descriptors associated with the current account and endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withStreams(Stream... streams) {
        if (this.streams == null) {
            setStreams(new java.util.ArrayList<Stream>(streams.length));
        }
        for (Stream ele : streams) {
            this.streams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of stream descriptors associated with the current account and endpoint.
     * </p>
     * 
     * @param streams
     *        A list of stream descriptors associated with the current account and endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withStreams(java.util.Collection<Stream> streams) {
        setStreams(streams);
        return this;
    }

    /**
     * <p>
     * The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedStreamArn</code> is empty, then the "last page" of results has been processed and there is
     * no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedStreamArn</code> is not empty, it does not necessarily mean that there is more data in the
     * result set. The only way to know when you have reached the end of the result set is when
     * <code>LastEvaluatedStreamArn</code> is empty.
     * </p>
     * 
     * @param lastEvaluatedStreamArn
     *        The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this
     *        value to start a new operation, excluding this value in the new request.</p>
     *        <p>
     *        If <code>LastEvaluatedStreamArn</code> is empty, then the "last page" of results has been processed and
     *        there is no more data to be retrieved.
     *        </p>
     *        <p>
     *        If <code>LastEvaluatedStreamArn</code> is not empty, it does not necessarily mean that there is more data
     *        in the result set. The only way to know when you have reached the end of the result set is when
     *        <code>LastEvaluatedStreamArn</code> is empty.
     */

    public void setLastEvaluatedStreamArn(String lastEvaluatedStreamArn) {
        this.lastEvaluatedStreamArn = lastEvaluatedStreamArn;
    }

    /**
     * <p>
     * The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedStreamArn</code> is empty, then the "last page" of results has been processed and there is
     * no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedStreamArn</code> is not empty, it does not necessarily mean that there is more data in the
     * result set. The only way to know when you have reached the end of the result set is when
     * <code>LastEvaluatedStreamArn</code> is empty.
     * </p>
     * 
     * @return The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this
     *         value to start a new operation, excluding this value in the new request.</p>
     *         <p>
     *         If <code>LastEvaluatedStreamArn</code> is empty, then the "last page" of results has been processed and
     *         there is no more data to be retrieved.
     *         </p>
     *         <p>
     *         If <code>LastEvaluatedStreamArn</code> is not empty, it does not necessarily mean that there is more data
     *         in the result set. The only way to know when you have reached the end of the result set is when
     *         <code>LastEvaluatedStreamArn</code> is empty.
     */

    public String getLastEvaluatedStreamArn() {
        return this.lastEvaluatedStreamArn;
    }

    /**
     * <p>
     * The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedStreamArn</code> is empty, then the "last page" of results has been processed and there is
     * no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedStreamArn</code> is not empty, it does not necessarily mean that there is more data in the
     * result set. The only way to know when you have reached the end of the result set is when
     * <code>LastEvaluatedStreamArn</code> is empty.
     * </p>
     * 
     * @param lastEvaluatedStreamArn
     *        The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this
     *        value to start a new operation, excluding this value in the new request.</p>
     *        <p>
     *        If <code>LastEvaluatedStreamArn</code> is empty, then the "last page" of results has been processed and
     *        there is no more data to be retrieved.
     *        </p>
     *        <p>
     *        If <code>LastEvaluatedStreamArn</code> is not empty, it does not necessarily mean that there is more data
     *        in the result set. The only way to know when you have reached the end of the result set is when
     *        <code>LastEvaluatedStreamArn</code> is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withLastEvaluatedStreamArn(String lastEvaluatedStreamArn) {
        setLastEvaluatedStreamArn(lastEvaluatedStreamArn);
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
        if (getStreams() != null)
            sb.append("Streams: ").append(getStreams()).append(",");
        if (getLastEvaluatedStreamArn() != null)
            sb.append("LastEvaluatedStreamArn: ").append(getLastEvaluatedStreamArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamsResult == false)
            return false;
        ListStreamsResult other = (ListStreamsResult) obj;
        if (other.getStreams() == null ^ this.getStreams() == null)
            return false;
        if (other.getStreams() != null && other.getStreams().equals(this.getStreams()) == false)
            return false;
        if (other.getLastEvaluatedStreamArn() == null ^ this.getLastEvaluatedStreamArn() == null)
            return false;
        if (other.getLastEvaluatedStreamArn() != null && other.getLastEvaluatedStreamArn().equals(this.getLastEvaluatedStreamArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreams() == null) ? 0 : getStreams().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluatedStreamArn() == null) ? 0 : getLastEvaluatedStreamArn().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamsResult clone() {
        try {
            return (ListStreamsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
