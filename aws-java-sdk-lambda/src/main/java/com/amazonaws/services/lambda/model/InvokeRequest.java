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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class InvokeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Lambda function name.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the <code>InvocationType</code>. You can also
     * use this parameter to request AWS Lambda to not execute the function but do some verification, such as if the
     * caller is authorized to invoke the function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful in a cross-account scenario when you want
     * to verify access to a function without running it.
     * </p>
     */
    private String invocationType;
    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     * <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda returns
     * the base64-encoded last 4 KB of log data produced by your Lambda function in the <code>x-amz-log-result</code>
     * header.
     * </p>
     */
    private String logType;
    /**
     * <p>
     * Using the <code>ClientContext</code> you can pass client-specific information to the Lambda function you are
     * invoking. You can then process the client information in your Lambda function as you choose through the context
     * variable. For an example of a <code>ClientContext</code> JSON, see <a
     * href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a> in the <i>Amazon Mobile
     * Analytics API Reference and User Guide</i>.
     * </p>
     * <p>
     * The ClientContext JSON must be base64-encoded.
     * </p>
     */
    private String clientContext;
    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     */
    private java.nio.ByteBuffer payload;
    /**
     * <p>
     * You can use this optional parameter to specify a Lambda function version or alias name. If you specify a function
     * version, the API uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias
     * name, the API uses the alias ARN to invoke the Lambda function version to which the alias points.
     * </p>
     * <p>
     * If you don't provide this parameter, then the API uses unqualified function ARN which results in invocation of
     * the <code>$LATEST</code> version.
     * </p>
     */
    private String qualifier;

    /**
     * <p>
     * The Lambda function name.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @param functionName
     *        The Lambda function name.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The Lambda function name.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @return The Lambda function name.</p>
     *         <p>
     *         You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *         specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The Lambda function name.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @param functionName
     *        The Lambda function name.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the <code>InvocationType</code>. You can also
     * use this parameter to request AWS Lambda to not execute the function but do some verification, such as if the
     * caller is authorized to invoke the function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful in a cross-account scenario when you want
     * to verify access to a function without running it.
     * </p>
     * 
     * @param invocationType
     *        By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can
     *        optionally request asynchronous execution by specifying <code>Event</code> as the
     *        <code>InvocationType</code>. You can also use this parameter to request AWS Lambda to not execute the
     *        function but do some verification, such as if the caller is authorized to invoke the function and if the
     *        inputs are valid. You request this by specifying <code>DryRun</code> as the <code>InvocationType</code>.
     *        This is useful in a cross-account scenario when you want to verify access to a function without running
     *        it.
     * @see InvocationType
     */

    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }

    /**
     * <p>
     * By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the <code>InvocationType</code>. You can also
     * use this parameter to request AWS Lambda to not execute the function but do some verification, such as if the
     * caller is authorized to invoke the function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful in a cross-account scenario when you want
     * to verify access to a function without running it.
     * </p>
     * 
     * @return By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can
     *         optionally request asynchronous execution by specifying <code>Event</code> as the
     *         <code>InvocationType</code>. You can also use this parameter to request AWS Lambda to not execute the
     *         function but do some verification, such as if the caller is authorized to invoke the function and if the
     *         inputs are valid. You request this by specifying <code>DryRun</code> as the <code>InvocationType</code>.
     *         This is useful in a cross-account scenario when you want to verify access to a function without running
     *         it.
     * @see InvocationType
     */

    public String getInvocationType() {
        return this.invocationType;
    }

    /**
     * <p>
     * By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the <code>InvocationType</code>. You can also
     * use this parameter to request AWS Lambda to not execute the function but do some verification, such as if the
     * caller is authorized to invoke the function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful in a cross-account scenario when you want
     * to verify access to a function without running it.
     * </p>
     * 
     * @param invocationType
     *        By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can
     *        optionally request asynchronous execution by specifying <code>Event</code> as the
     *        <code>InvocationType</code>. You can also use this parameter to request AWS Lambda to not execute the
     *        function but do some verification, such as if the caller is authorized to invoke the function and if the
     *        inputs are valid. You request this by specifying <code>DryRun</code> as the <code>InvocationType</code>.
     *        This is useful in a cross-account scenario when you want to verify access to a function without running
     *        it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvocationType
     */

    public InvokeRequest withInvocationType(String invocationType) {
        setInvocationType(invocationType);
        return this;
    }

    /**
     * <p>
     * By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the <code>InvocationType</code>. You can also
     * use this parameter to request AWS Lambda to not execute the function but do some verification, such as if the
     * caller is authorized to invoke the function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful in a cross-account scenario when you want
     * to verify access to a function without running it.
     * </p>
     * 
     * @param invocationType
     *        By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can
     *        optionally request asynchronous execution by specifying <code>Event</code> as the
     *        <code>InvocationType</code>. You can also use this parameter to request AWS Lambda to not execute the
     *        function but do some verification, such as if the caller is authorized to invoke the function and if the
     *        inputs are valid. You request this by specifying <code>DryRun</code> as the <code>InvocationType</code>.
     *        This is useful in a cross-account scenario when you want to verify access to a function without running
     *        it.
     * @see InvocationType
     */

    public void setInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
    }

    /**
     * <p>
     * By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the <code>InvocationType</code>. You can also
     * use this parameter to request AWS Lambda to not execute the function but do some verification, such as if the
     * caller is authorized to invoke the function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful in a cross-account scenario when you want
     * to verify access to a function without running it.
     * </p>
     * 
     * @param invocationType
     *        By default, the <code>Invoke</code> API assumes <code>RequestResponse</code> invocation type. You can
     *        optionally request asynchronous execution by specifying <code>Event</code> as the
     *        <code>InvocationType</code>. You can also use this parameter to request AWS Lambda to not execute the
     *        function but do some verification, such as if the caller is authorized to invoke the function and if the
     *        inputs are valid. You request this by specifying <code>DryRun</code> as the <code>InvocationType</code>.
     *        This is useful in a cross-account scenario when you want to verify access to a function without running
     *        it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvocationType
     */

    public InvokeRequest withInvocationType(InvocationType invocationType) {
        setInvocationType(invocationType);
        return this;
    }

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     * <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda returns
     * the base64-encoded last 4 KB of log data produced by your Lambda function in the <code>x-amz-log-result</code>
     * header.
     * </p>
     * 
     * @param logType
     *        You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     *        <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda
     *        returns the base64-encoded last 4 KB of log data produced by your Lambda function in the
     *        <code>x-amz-log-result</code> header.
     * @see LogType
     */

    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     * <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda returns
     * the base64-encoded last 4 KB of log data produced by your Lambda function in the <code>x-amz-log-result</code>
     * header.
     * </p>
     * 
     * @return You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     *         <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda
     *         returns the base64-encoded last 4 KB of log data produced by your Lambda function in the
     *         <code>x-amz-log-result</code> header.
     * @see LogType
     */

    public String getLogType() {
        return this.logType;
    }

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     * <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda returns
     * the base64-encoded last 4 KB of log data produced by your Lambda function in the <code>x-amz-log-result</code>
     * header.
     * </p>
     * 
     * @param logType
     *        You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     *        <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda
     *        returns the base64-encoded last 4 KB of log data produced by your Lambda function in the
     *        <code>x-amz-log-result</code> header.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public InvokeRequest withLogType(String logType) {
        setLogType(logType);
        return this;
    }

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     * <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda returns
     * the base64-encoded last 4 KB of log data produced by your Lambda function in the <code>x-amz-log-result</code>
     * header.
     * </p>
     * 
     * @param logType
     *        You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     *        <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda
     *        returns the base64-encoded last 4 KB of log data produced by your Lambda function in the
     *        <code>x-amz-log-result</code> header.
     * @see LogType
     */

    public void setLogType(LogType logType) {
        this.logType = logType.toString();
    }

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     * <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda returns
     * the base64-encoded last 4 KB of log data produced by your Lambda function in the <code>x-amz-log-result</code>
     * header.
     * </p>
     * 
     * @param logType
     *        You can set this optional parameter to <code>Tail</code> in the request only if you specify the
     *        <code>InvocationType</code> parameter with value <code>RequestResponse</code>. In this case, AWS Lambda
     *        returns the base64-encoded last 4 KB of log data produced by your Lambda function in the
     *        <code>x-amz-log-result</code> header.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public InvokeRequest withLogType(LogType logType) {
        setLogType(logType);
        return this;
    }

    /**
     * <p>
     * Using the <code>ClientContext</code> you can pass client-specific information to the Lambda function you are
     * invoking. You can then process the client information in your Lambda function as you choose through the context
     * variable. For an example of a <code>ClientContext</code> JSON, see <a
     * href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a> in the <i>Amazon Mobile
     * Analytics API Reference and User Guide</i>.
     * </p>
     * <p>
     * The ClientContext JSON must be base64-encoded.
     * </p>
     * 
     * @param clientContext
     *        Using the <code>ClientContext</code> you can pass client-specific information to the Lambda function you
     *        are invoking. You can then process the client information in your Lambda function as you choose through
     *        the context variable. For an example of a <code>ClientContext</code> JSON, see <a
     *        href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a> in the <i>Amazon
     *        Mobile Analytics API Reference and User Guide</i>.</p>
     *        <p>
     *        The ClientContext JSON must be base64-encoded.
     */

    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    /**
     * <p>
     * Using the <code>ClientContext</code> you can pass client-specific information to the Lambda function you are
     * invoking. You can then process the client information in your Lambda function as you choose through the context
     * variable. For an example of a <code>ClientContext</code> JSON, see <a
     * href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a> in the <i>Amazon Mobile
     * Analytics API Reference and User Guide</i>.
     * </p>
     * <p>
     * The ClientContext JSON must be base64-encoded.
     * </p>
     * 
     * @return Using the <code>ClientContext</code> you can pass client-specific information to the Lambda function you
     *         are invoking. You can then process the client information in your Lambda function as you choose through
     *         the context variable. For an example of a <code>ClientContext</code> JSON, see <a
     *         href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a> in the <i>Amazon
     *         Mobile Analytics API Reference and User Guide</i>.</p>
     *         <p>
     *         The ClientContext JSON must be base64-encoded.
     */

    public String getClientContext() {
        return this.clientContext;
    }

    /**
     * <p>
     * Using the <code>ClientContext</code> you can pass client-specific information to the Lambda function you are
     * invoking. You can then process the client information in your Lambda function as you choose through the context
     * variable. For an example of a <code>ClientContext</code> JSON, see <a
     * href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a> in the <i>Amazon Mobile
     * Analytics API Reference and User Guide</i>.
     * </p>
     * <p>
     * The ClientContext JSON must be base64-encoded.
     * </p>
     * 
     * @param clientContext
     *        Using the <code>ClientContext</code> you can pass client-specific information to the Lambda function you
     *        are invoking. You can then process the client information in your Lambda function as you choose through
     *        the context variable. For an example of a <code>ClientContext</code> JSON, see <a
     *        href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a> in the <i>Amazon
     *        Mobile Analytics API Reference and User Guide</i>.</p>
     *        <p>
     *        The ClientContext JSON must be base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeRequest withClientContext(String clientContext) {
        setClientContext(clientContext);
        return this;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
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
     *        JSON that you want to provide to your Lambda function as input.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return JSON that you want to provide to your Lambda function as input.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     * 
     * @param payload
     *        JSON that you want to provide to your Lambda function as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeRequest withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
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
     *        JSON that you want to provide to your Lambda function as input.
     */
    public void setPayload(String payload) {
        setPayload(new com.amazonaws.adapters.types.StringToByteBufferAdapter().adapt(payload));
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     * 
     * @param payload
     *        JSON that you want to provide to your Lambda function as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public InvokeRequest withPayload(String payload) {
        setPayload(new com.amazonaws.adapters.types.StringToByteBufferAdapter().adapt(payload));
        return this;
    }

    /**
     * <p>
     * You can use this optional parameter to specify a Lambda function version or alias name. If you specify a function
     * version, the API uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias
     * name, the API uses the alias ARN to invoke the Lambda function version to which the alias points.
     * </p>
     * <p>
     * If you don't provide this parameter, then the API uses unqualified function ARN which results in invocation of
     * the <code>$LATEST</code> version.
     * </p>
     * 
     * @param qualifier
     *        You can use this optional parameter to specify a Lambda function version or alias name. If you specify a
     *        function version, the API uses the qualified function ARN to invoke a specific Lambda function. If you
     *        specify an alias name, the API uses the alias ARN to invoke the Lambda function version to which the alias
     *        points.</p>
     *        <p>
     *        If you don't provide this parameter, then the API uses unqualified function ARN which results in
     *        invocation of the <code>$LATEST</code> version.
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * You can use this optional parameter to specify a Lambda function version or alias name. If you specify a function
     * version, the API uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias
     * name, the API uses the alias ARN to invoke the Lambda function version to which the alias points.
     * </p>
     * <p>
     * If you don't provide this parameter, then the API uses unqualified function ARN which results in invocation of
     * the <code>$LATEST</code> version.
     * </p>
     * 
     * @return You can use this optional parameter to specify a Lambda function version or alias name. If you specify a
     *         function version, the API uses the qualified function ARN to invoke a specific Lambda function. If you
     *         specify an alias name, the API uses the alias ARN to invoke the Lambda function version to which the
     *         alias points.</p>
     *         <p>
     *         If you don't provide this parameter, then the API uses unqualified function ARN which results in
     *         invocation of the <code>$LATEST</code> version.
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * You can use this optional parameter to specify a Lambda function version or alias name. If you specify a function
     * version, the API uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias
     * name, the API uses the alias ARN to invoke the Lambda function version to which the alias points.
     * </p>
     * <p>
     * If you don't provide this parameter, then the API uses unqualified function ARN which results in invocation of
     * the <code>$LATEST</code> version.
     * </p>
     * 
     * @param qualifier
     *        You can use this optional parameter to specify a Lambda function version or alias name. If you specify a
     *        function version, the API uses the qualified function ARN to invoke a specific Lambda function. If you
     *        specify an alias name, the API uses the alias ARN to invoke the Lambda function version to which the alias
     *        points.</p>
     *        <p>
     *        If you don't provide this parameter, then the API uses unqualified function ARN which results in
     *        invocation of the <code>$LATEST</code> version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getInvocationType() != null)
            sb.append("InvocationType: " + getInvocationType() + ",");
        if (getLogType() != null)
            sb.append("LogType: " + getLogType() + ",");
        if (getClientContext() != null)
            sb.append("ClientContext: " + getClientContext() + ",");
        if (getPayload() != null)
            sb.append("Payload: " + getPayload() + ",");
        if (getQualifier() != null)
            sb.append("Qualifier: " + getQualifier());
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
