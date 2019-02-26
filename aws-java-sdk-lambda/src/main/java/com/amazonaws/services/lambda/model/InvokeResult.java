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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Invoke" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP status code is in the 200 range for a successful request. For the <code>RequestResponse</code>
     * invocation type, this status code is 200. For the <code>Event</code> invocation type, this status code is 202.
     * For the <code>DryRun</code> invocation type, the status code is 204.
     * </p>
     */
    private Integer statusCode;
    /**
     * <p>
     * If present, indicates that an error occurred during function execution. Details about the error are included in
     * the response payload.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Handled</code> - The runtime caught an error thrown by the function and formatted it into a JSON document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhandled</code> - The runtime didn't handle the error. For example, the function ran out of memory or
     * timed out.
     * </p>
     * </li>
     * </ul>
     */
    private String functionError;
    /**
     * <p>
     * The last 4 KB of the execution log, which is base64 encoded.
     * </p>
     */
    private String logResult;
    /**
     * <p>
     * The response from the function, or an error object.
     * </p>
     */
    private java.nio.ByteBuffer payload;
    /**
     * <p>
     * The version of the function that executed. When you invoke a function with an alias, this indicates which version
     * the alias resolved to.
     * </p>
     */
    private String executedVersion;

    /**
     * <p>
     * The HTTP status code is in the 200 range for a successful request. For the <code>RequestResponse</code>
     * invocation type, this status code is 200. For the <code>Event</code> invocation type, this status code is 202.
     * For the <code>DryRun</code> invocation type, the status code is 204.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code is in the 200 range for a successful request. For the <code>RequestResponse</code>
     *        invocation type, this status code is 200. For the <code>Event</code> invocation type, this status code is
     *        202. For the <code>DryRun</code> invocation type, the status code is 204.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code is in the 200 range for a successful request. For the <code>RequestResponse</code>
     * invocation type, this status code is 200. For the <code>Event</code> invocation type, this status code is 202.
     * For the <code>DryRun</code> invocation type, the status code is 204.
     * </p>
     * 
     * @return The HTTP status code is in the 200 range for a successful request. For the <code>RequestResponse</code>
     *         invocation type, this status code is 200. For the <code>Event</code> invocation type, this status code is
     *         202. For the <code>DryRun</code> invocation type, the status code is 204.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP status code is in the 200 range for a successful request. For the <code>RequestResponse</code>
     * invocation type, this status code is 200. For the <code>Event</code> invocation type, this status code is 202.
     * For the <code>DryRun</code> invocation type, the status code is 204.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code is in the 200 range for a successful request. For the <code>RequestResponse</code>
     *        invocation type, this status code is 200. For the <code>Event</code> invocation type, this status code is
     *        202. For the <code>DryRun</code> invocation type, the status code is 204.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeResult withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * If present, indicates that an error occurred during function execution. Details about the error are included in
     * the response payload.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Handled</code> - The runtime caught an error thrown by the function and formatted it into a JSON document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhandled</code> - The runtime didn't handle the error. For example, the function ran out of memory or
     * timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @param functionError
     *        If present, indicates that an error occurred during function execution. Details about the error are
     *        included in the response payload.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Handled</code> - The runtime caught an error thrown by the function and formatted it into a JSON
     *        document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unhandled</code> - The runtime didn't handle the error. For example, the function ran out of memory
     *        or timed out.
     *        </p>
     *        </li>
     */

    public void setFunctionError(String functionError) {
        this.functionError = functionError;
    }

    /**
     * <p>
     * If present, indicates that an error occurred during function execution. Details about the error are included in
     * the response payload.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Handled</code> - The runtime caught an error thrown by the function and formatted it into a JSON document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhandled</code> - The runtime didn't handle the error. For example, the function ran out of memory or
     * timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If present, indicates that an error occurred during function execution. Details about the error are
     *         included in the response payload.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Handled</code> - The runtime caught an error thrown by the function and formatted it into a JSON
     *         document.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unhandled</code> - The runtime didn't handle the error. For example, the function ran out of memory
     *         or timed out.
     *         </p>
     *         </li>
     */

    public String getFunctionError() {
        return this.functionError;
    }

    /**
     * <p>
     * If present, indicates that an error occurred during function execution. Details about the error are included in
     * the response payload.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Handled</code> - The runtime caught an error thrown by the function and formatted it into a JSON document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhandled</code> - The runtime didn't handle the error. For example, the function ran out of memory or
     * timed out.
     * </p>
     * </li>
     * </ul>
     * 
     * @param functionError
     *        If present, indicates that an error occurred during function execution. Details about the error are
     *        included in the response payload.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Handled</code> - The runtime caught an error thrown by the function and formatted it into a JSON
     *        document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unhandled</code> - The runtime didn't handle the error. For example, the function ran out of memory
     *        or timed out.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeResult withFunctionError(String functionError) {
        setFunctionError(functionError);
        return this;
    }

    /**
     * <p>
     * The last 4 KB of the execution log, which is base64 encoded.
     * </p>
     * 
     * @param logResult
     *        The last 4 KB of the execution log, which is base64 encoded.
     */

    public void setLogResult(String logResult) {
        this.logResult = logResult;
    }

    /**
     * <p>
     * The last 4 KB of the execution log, which is base64 encoded.
     * </p>
     * 
     * @return The last 4 KB of the execution log, which is base64 encoded.
     */

    public String getLogResult() {
        return this.logResult;
    }

    /**
     * <p>
     * The last 4 KB of the execution log, which is base64 encoded.
     * </p>
     * 
     * @param logResult
     *        The last 4 KB of the execution log, which is base64 encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeResult withLogResult(String logResult) {
        setLogResult(logResult);
        return this;
    }

    /**
     * <p>
     * The response from the function, or an error object.
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
     * @param payload
     *        The response from the function, or an error object.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The response from the function, or an error object.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The response from the function, or an error object.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The response from the function, or an error object.
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
     * @param payload
     *        The response from the function, or an error object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeResult withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * The version of the function that executed. When you invoke a function with an alias, this indicates which version
     * the alias resolved to.
     * </p>
     * 
     * @param executedVersion
     *        The version of the function that executed. When you invoke a function with an alias, this indicates which
     *        version the alias resolved to.
     */

    public void setExecutedVersion(String executedVersion) {
        this.executedVersion = executedVersion;
    }

    /**
     * <p>
     * The version of the function that executed. When you invoke a function with an alias, this indicates which version
     * the alias resolved to.
     * </p>
     * 
     * @return The version of the function that executed. When you invoke a function with an alias, this indicates which
     *         version the alias resolved to.
     */

    public String getExecutedVersion() {
        return this.executedVersion;
    }

    /**
     * <p>
     * The version of the function that executed. When you invoke a function with an alias, this indicates which version
     * the alias resolved to.
     * </p>
     * 
     * @param executedVersion
     *        The version of the function that executed. When you invoke a function with an alias, this indicates which
     *        version the alias resolved to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeResult withExecutedVersion(String executedVersion) {
        setExecutedVersion(executedVersion);
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getFunctionError() != null)
            sb.append("FunctionError: ").append(getFunctionError()).append(",");
        if (getLogResult() != null)
            sb.append("LogResult: ").append(getLogResult()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append("***Sensitive Data Redacted***").append(",");
        if (getExecutedVersion() != null)
            sb.append("ExecutedVersion: ").append(getExecutedVersion());
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
        if (other.getExecutedVersion() == null ^ this.getExecutedVersion() == null)
            return false;
        if (other.getExecutedVersion() != null && other.getExecutedVersion().equals(this.getExecutedVersion()) == false)
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
        hashCode = prime * hashCode + ((getExecutedVersion() == null) ? 0 : getExecutedVersion().hashCode());
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
