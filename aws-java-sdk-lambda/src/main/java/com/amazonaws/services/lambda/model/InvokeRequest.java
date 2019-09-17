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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Invoke" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     */
    private String invocationType;
    /**
     * <p>
     * Set to <code>Tail</code> to include the execution log in the response.
     * </p>
     */
    private String logType;
    /**
     * <p>
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function in the context object.
     * </p>
     */
    private String clientContext;
    /**
     * <p>
     * The JSON that you want to provide to your Lambda function as input.
     * </p>
     */
    private java.nio.ByteBuffer payload;
    /**
     * <p>
     * Specify a version or alias to invoke a published version of the function.
     * </p>
     */
    private String qualifier;

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function, version, or alias.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can append a version number or alias to any of the formats. The length constraint applies only to the
     *        full ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @return The name of the Lambda function, version, or alias.</p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can append a version number or alias to any of the formats. The length constraint applies only to the
     *         full ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function, version, or alias.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can append a version number or alias to any of the formats. The length constraint applies only to the
     *        full ARN. If you specify only the function name, it is limited to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param invocationType
     *        Choose from the following options.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until
     *        the function returns a response or times out. The API response includes the function response and
     *        additional data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the
     *        function's dead-letter queue (if it's configured). The API response only includes a status code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke
     *        the function.
     *        </p>
     *        </li>
     * @see InvocationType
     */

    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Choose from the following options.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open
     *         until the function returns a response or times out. The API response includes the function response and
     *         additional data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the
     *         function's dead-letter queue (if it's configured). The API response only includes a status code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke
     *         the function.
     *         </p>
     *         </li>
     * @see InvocationType
     */

    public String getInvocationType() {
        return this.invocationType;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param invocationType
     *        Choose from the following options.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until
     *        the function returns a response or times out. The API response includes the function response and
     *        additional data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the
     *        function's dead-letter queue (if it's configured). The API response only includes a status code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke
     *        the function.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvocationType
     */

    public InvokeRequest withInvocationType(String invocationType) {
        setInvocationType(invocationType);
        return this;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param invocationType
     *        Choose from the following options.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until
     *        the function returns a response or times out. The API response includes the function response and
     *        additional data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the
     *        function's dead-letter queue (if it's configured). The API response only includes a status code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke
     *        the function.
     *        </p>
     *        </li>
     * @see InvocationType
     */

    public void setInvocationType(InvocationType invocationType) {
        withInvocationType(invocationType);
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param invocationType
     *        Choose from the following options.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until
     *        the function returns a response or times out. The API response includes the function response and
     *        additional data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the
     *        function's dead-letter queue (if it's configured). The API response only includes a status code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke
     *        the function.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvocationType
     */

    public InvokeRequest withInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
        return this;
    }

    /**
     * <p>
     * Set to <code>Tail</code> to include the execution log in the response.
     * </p>
     * 
     * @param logType
     *        Set to <code>Tail</code> to include the execution log in the response.
     * @see LogType
     */

    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * Set to <code>Tail</code> to include the execution log in the response.
     * </p>
     * 
     * @return Set to <code>Tail</code> to include the execution log in the response.
     * @see LogType
     */

    public String getLogType() {
        return this.logType;
    }

    /**
     * <p>
     * Set to <code>Tail</code> to include the execution log in the response.
     * </p>
     * 
     * @param logType
     *        Set to <code>Tail</code> to include the execution log in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public InvokeRequest withLogType(String logType) {
        setLogType(logType);
        return this;
    }

    /**
     * <p>
     * Set to <code>Tail</code> to include the execution log in the response.
     * </p>
     * 
     * @param logType
     *        Set to <code>Tail</code> to include the execution log in the response.
     * @see LogType
     */

    public void setLogType(LogType logType) {
        withLogType(logType);
    }

    /**
     * <p>
     * Set to <code>Tail</code> to include the execution log in the response.
     * </p>
     * 
     * @param logType
     *        Set to <code>Tail</code> to include the execution log in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public InvokeRequest withLogType(LogType logType) {
        this.logType = logType.toString();
        return this;
    }

    /**
     * <p>
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function in the context object.
     * </p>
     * 
     * @param clientContext
     *        Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function in the context
     *        object.
     */

    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    /**
     * <p>
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function in the context object.
     * </p>
     * 
     * @return Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function in the context
     *         object.
     */

    public String getClientContext() {
        return this.clientContext;
    }

    /**
     * <p>
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function in the context object.
     * </p>
     * 
     * @param clientContext
     *        Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function in the context
     *        object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeRequest withClientContext(String clientContext) {
        setClientContext(clientContext);
        return this;
    }

    /**
     * <p>
     * The JSON that you want to provide to your Lambda function as input.
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
     *        The JSON that you want to provide to your Lambda function as input.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The JSON that you want to provide to your Lambda function as input.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The JSON that you want to provide to your Lambda function as input.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The JSON that you want to provide to your Lambda function as input.
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
     *        The JSON that you want to provide to your Lambda function as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeRequest withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * The JSON that you want to provide to your Lambda function as input.
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
     *        The JSON that you want to provide to your Lambda function as input.
     */
    public void setPayload(String payload) {
        setPayload(new com.amazonaws.adapters.types.StringToByteBufferAdapter().adapt(payload));
    }

    /**
     * <p>
     * The JSON that you want to provide to your Lambda function as input.
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
     *        The JSON that you want to provide to your Lambda function as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public InvokeRequest withPayload(String payload) {
        setPayload(new com.amazonaws.adapters.types.StringToByteBufferAdapter().adapt(payload));
        return this;
    }

    /**
     * <p>
     * Specify a version or alias to invoke a published version of the function.
     * </p>
     * 
     * @param qualifier
     *        Specify a version or alias to invoke a published version of the function.
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * Specify a version or alias to invoke a published version of the function.
     * </p>
     * 
     * @return Specify a version or alias to invoke a published version of the function.
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * Specify a version or alias to invoke a published version of the function.
     * </p>
     * 
     * @param qualifier
     *        Specify a version or alias to invoke a published version of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getInvocationType() != null)
            sb.append("InvocationType: ").append(getInvocationType()).append(",");
        if (getLogType() != null)
            sb.append("LogType: ").append(getLogType()).append(",");
        if (getClientContext() != null)
            sb.append("ClientContext: ").append(getClientContext()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append("***Sensitive Data Redacted***").append(",");
        if (getQualifier() != null)
            sb.append("Qualifier: ").append(getQualifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeRequest == false)
            return false;
        InvokeRequest other = (InvokeRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getInvocationType() == null ^ this.getInvocationType() == null)
            return false;
        if (other.getInvocationType() != null && other.getInvocationType().equals(this.getInvocationType()) == false)
            return false;
        if (other.getLogType() == null ^ this.getLogType() == null)
            return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false)
            return false;
        if (other.getClientContext() == null ^ this.getClientContext() == null)
            return false;
        if (other.getClientContext() != null && other.getClientContext().equals(this.getClientContext()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getInvocationType() == null) ? 0 : getInvocationType().hashCode());
        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode());
        hashCode = prime * hashCode + ((getClientContext() == null) ? 0 : getClientContext().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        return hashCode;
    }

    @Override
    public InvokeRequest clone() {
        return (InvokeRequest) super.clone();
    }

}
