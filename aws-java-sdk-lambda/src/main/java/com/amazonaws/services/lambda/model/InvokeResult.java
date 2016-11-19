/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * Upon success, returns an empty response. Otherwise, throws an exception.
 * </p>
 */
public class InvokeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP status code will be in the 200 range for successful request. For the <code>RequestResonse</code>
     * invocation type this status code will be 200. For the <code>Event</code> invocation type this status code will be
     * 202. For the <code>DryRun</code> invocation type the status code will be 204.
     * </p>
     */
    private Integer statusCode;
    /**
     * <p>
     * Indicates whether an error occurred while executing the Lambda function. If an error occurred this field will
     * have one of two values; <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code> errors are errors
     * that are reported by the function while the <code>Unhandled</code> errors are those detected and reported by AWS
     * Lambda. Unhandled errors include out of memory errors and function timeouts. For information about how to report
     * an <code>Handled</code> error, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html">Programming Model</a>.
     * </p>
     */
    private String functionError;
    /**
     * <p>
     * It is the base64-encoded logs for the Lambda function invocation. This is present only if the invocation type is
     * <code>RequestResponse</code> and the logs were requested.
     * </p>
     */
    private String logResult;
    /**
     * <p>
     * It is the JSON representation of the object returned by the Lambda function. This is present only if the
     * invocation type is <code>RequestResponse</code>.
     * </p>
     * <p>
     * In the event of a function error this field contains a message describing the error. For the <code>Handled</code>
     * errors the Lambda function will report this message. For <code>Unhandled</code> errors AWS Lambda reports the
     * message.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * The HTTP status code will be in the 200 range for successful request. For the <code>RequestResonse</code>
     * invocation type this status code will be 200. For the <code>Event</code> invocation type this status code will be
     * 202. For the <code>DryRun</code> invocation type the status code will be 204.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code will be in the 200 range for successful request. For the <code>RequestResonse</code>
     *        invocation type this status code will be 200. For the <code>Event</code> invocation type this status code
     *        will be 202. For the <code>DryRun</code> invocation type the status code will be 204.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code will be in the 200 range for successful request. For the <code>RequestResonse</code>
     * invocation type this status code will be 200. For the <code>Event</code> invocation type this status code will be
     * 202. For the <code>DryRun</code> invocation type the status code will be 204.
     * </p>
     * 
     * @return The HTTP status code will be in the 200 range for successful request. For the <code>RequestResonse</code>
     *         invocation type this status code will be 200. For the <code>Event</code> invocation type this status code
     *         will be 202. For the <code>DryRun</code> invocation type the status code will be 204.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP status code will be in the 200 range for successful request. For the <code>RequestResonse</code>
     * invocation type this status code will be 200. For the <code>Event</code> invocation type this status code will be
     * 202. For the <code>DryRun</code> invocation type the status code will be 204.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code will be in the 200 range for successful request. For the <code>RequestResonse</code>
     *        invocation type this status code will be 200. For the <code>Event</code> invocation type this status code
     *        will be 202. For the <code>DryRun</code> invocation type the status code will be 204.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeResult withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Indicates whether an error occurred while executing the Lambda function. If an error occurred this field will
     * have one of two values; <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code> errors are errors
     * that are reported by the function while the <code>Unhandled</code> errors are those detected and reported by AWS
     * Lambda. Unhandled errors include out of memory errors and function timeouts. For information about how to report
     * an <code>Handled</code> error, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html">Programming Model</a>.
     * </p>
     * 
     * @param functionError
     *        Indicates whether an error occurred while executing the Lambda function. If an error occurred this field
     *        will have one of two values; <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code> errors
     *        are errors that are reported by the function while the <code>Unhandled</code> errors are those detected
     *        and reported by AWS Lambda. Unhandled errors include out of memory errors and function timeouts. For
     *        information about how to report an <code>Handled</code> error, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html">Programming Model</a>.
     */

    public void setFunctionError(String functionError) {
        this.functionError = functionError;
    }

    /**
     * <p>
     * Indicates whether an error occurred while executing the Lambda function. If an error occurred this field will
     * have one of two values; <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code> errors are errors
     * that are reported by the function while the <code>Unhandled</code> errors are those detected and reported by AWS
     * Lambda. Unhandled errors include out of memory errors and function timeouts. For information about how to report
     * an <code>Handled</code> error, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html">Programming Model</a>.
     * </p>
     * 
     * @return Indicates whether an error occurred while executing the Lambda function. If an error occurred this field
     *         will have one of two values; <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code> errors
     *         are errors that are reported by the function while the <code>Unhandled</code> errors are those detected
     *         and reported by AWS Lambda. Unhandled errors include out of memory errors and function timeouts. For
     *         information about how to report an <code>Handled</code> error, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html">Programming Model</a>.
     */

    public String getFunctionError() {
        return this.functionError;
    }

    /**
     * <p>
     * Indicates whether an error occurred while executing the Lambda function. If an error occurred this field will
     * have one of two values; <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code> errors are errors
     * that are reported by the function while the <code>Unhandled</code> errors are those detected and reported by AWS
     * Lambda. Unhandled errors include out of memory errors and function timeouts. For information about how to report
     * an <code>Handled</code> error, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html">Programming Model</a>.
     * </p>
     * 
     * @param functionError
     *        Indicates whether an error occurred while executing the Lambda function. If an error occurred this field
     *        will have one of two values; <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code> errors
     *        are errors that are reported by the function while the <code>Unhandled</code> errors are those detected
     *        and reported by AWS Lambda. Unhandled errors include out of memory errors and function timeouts. For
     *        information about how to report an <code>Handled</code> error, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html">Programming Model</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeResult withFunctionError(String functionError) {
        setFunctionError(functionError);
        return this;
    }

    /**
     * <p>
     * It is the base64-encoded logs for the Lambda function invocation. This is present only if the invocation type is
     * <code>RequestResponse</code> and the logs were requested.
     * </p>
     * 
     * @param logResult
     *        It is the base64-encoded logs for the Lambda function invocation. This is present only if the invocation
     *        type is <code>RequestResponse</code> and the logs were requested.
     */

    public void setLogResult(String logResult) {
        this.logResult = logResult;
    }

    /**
     * <p>
     * It is the base64-encoded logs for the Lambda function invocation. This is present only if the invocation type is
     * <code>RequestResponse</code> and the logs were requested.
     * </p>
     * 
     * @return It is the base64-encoded logs for the Lambda function invocation. This is present only if the invocation
     *         type is <code>RequestResponse</code> and the logs were requested.
     */

    public String getLogResult() {
        return this.logResult;
    }

    /**
     * <p>
     * It is the base64-encoded logs for the Lambda function invocation. This is present only if the invocation type is
     * <code>RequestResponse</code> and the logs were requested.
     * </p>
     * 
     * @param logResult
     *        It is the base64-encoded logs for the Lambda function invocation. This is present only if the invocation
     *        type is <code>RequestResponse</code> and the logs were requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeResult withLogResult(String logResult) {
        setLogResult(logResult);
        return this;
    }

    /**
     * <p>
     * It is the JSON representation of the object returned by the Lambda function. This is present only if the
     * invocation type is <code>RequestResponse</code>.
     * </p>
     * <p>
     * In the event of a function error this field contains a message describing the error. For the <code>Handled</code>
     * errors the Lambda function will report this message. For <code>Unhandled</code> errors AWS Lambda reports the
     * message.
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending this request to AWS service by default.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param payload
     *        It is the JSON representation of the object returned by the Lambda function. This is present only if the
     *        invocation type is <code>RequestResponse</code>. </p>
     *        <p>
     *        In the event of a function error this field contains a message describing the error. For the
     *        <code>Handled</code> errors the Lambda function will report this message. For <code>Unhandled</code>
     *        errors AWS Lambda reports the message.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * It is the JSON representation of the object returned by the Lambda function. This is present only if the
     * invocation type is <code>RequestResponse</code>.
     * </p>
     * <p>
     * In the event of a function error this field contains a message describing the error. For the <code>Handled</code>
     * errors the Lambda function will report this message. For <code>Unhandled</code> errors AWS Lambda reports the
     * message.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return It is the JSON representation of the object returned by the Lambda function. This is present only if the
     *         invocation type is <code>RequestResponse</code>. </p>
     *         <p>
     *         In the event of a function error this field contains a message describing the error. For the
     *         <code>Handled</code> errors the Lambda function will report this message. For <code>Unhandled</code>
     *         errors AWS Lambda reports the message.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * It is the JSON representation of the object returned by the Lambda function. This is present only if the
     * invocation type is <code>RequestResponse</code>.
     * </p>
     * <p>
     * In the event of a function error this field contains a message describing the error. For the <code>Handled</code>
     * errors the Lambda function will report this message. For <code>Unhandled</code> errors AWS Lambda reports the
     * message.
     * </p>
     * 
     * @param payload
     *        It is the JSON representation of the object returned by the Lambda function. This is present only if the
     *        invocation type is <code>RequestResponse</code>. </p>
     *        <p>
     *        In the event of a function error this field contains a message describing the error. For the
     *        <code>Handled</code> errors the Lambda function will report this message. For <code>Unhandled</code>
     *        errors AWS Lambda reports the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeResult withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getFunctionError() != null)
            sb.append("FunctionError: " + getFunctionError() + ",");
        if (getLogResult() != null)
            sb.append("LogResult: " + getLogResult() + ",");
        if (getPayload() != null)
            sb.append("Payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeResult == false)
            return false;
        InvokeResult other = (InvokeResult) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getFunctionError() == null ^ this.getFunctionError() == null)
            return false;
        if (other.getFunctionError() != null && other.getFunctionError().equals(this.getFunctionError()) == false)
            return false;
        if (other.getLogResult() == null ^ this.getLogResult() == null)
            return false;
        if (other.getLogResult() != null && other.getLogResult().equals(this.getLogResult()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getFunctionError() == null) ? 0 : getFunctionError().hashCode());
        hashCode = prime * hashCode + ((getLogResult() == null) ? 0 : getLogResult().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public InvokeResult clone() {
        try {
            return (InvokeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
