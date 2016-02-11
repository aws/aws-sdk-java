/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#invoke(InvokeRequest) Invoke operation}.
 * <p>
 * Invokes a specific Lambda function.
 * </p>
 * <p>
 * If you are using the versioning feature, you can invoke the specific
 * function version by providing function version or alias name that is
 * pointing to the function version using the <code>Qualifier</code>
 * parameter in the request. If you don't provide the
 * <code>Qualifier</code> parameter, the <code>$LATEST</code> version of
 * the Lambda function is invoked. For information about the versioning
 * feature, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
 * .
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:InvokeFunction</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#invoke(InvokeRequest)
 */
public class InvokeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Lambda function name. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * By default, the <code>Invoke</code> API assumes
     * <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the
     * <code>InvocationType</code>. You can also use this parameter to
     * request AWS Lambda to not execute the function but do some
     * verification, such as if the caller is authorized to invoke the
     * function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     * in a cross-account scenario when you want to verify access to a
     * function without running it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     */
    private String invocationType;

    /**
     * You can set this optional parameter to <code>Tail</code> in the
     * request only if you specify the <code>InvocationType</code> parameter
     * with value <code>RequestResponse</code>. In this case, AWS Lambda
     * returns the base64-encoded last 4 KB of log data produced by your
     * Lambda function in the <code>x-amz-log-results</code> header.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     */
    private String logType;

    /**
     * Using the <code>ClientContext</code> you can pass client-specific
     * information to the Lambda function you are invoking. You can then
     * process the client information in your Lambda function as you choose
     * through the context variable. For an example of a
     * <code>ClientContext</code> JSON, see <a
     * href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a>
     * in the <i>Amazon Mobile Analytics API Reference and User Guide</i>.
     * <p>The ClientContext JSON must be base64-encoded.
     */
    private String clientContext;

    /**
     * JSON that you want to provide to your Lambda function as input.
     */
    private java.nio.ByteBuffer payload;

    /**
     * You can use this optional parameter to specify a Lambda function
     * version or alias name. If you specify a function version, the API uses
     * the qualified function ARN to invoke a specific Lambda function. If
     * you specify an alias name, the API uses the alias ARN to invoke the
     * Lambda function version to which the alias points. <p>If you don't
     * provide this parameter, then the API uses unqualified function ARN
     * which results in invocation of the <code>$LATEST</code> version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     */
    private String qualifier;

    /**
     * The Lambda function name. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return The Lambda function name. <p> You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The Lambda function name. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The Lambda function name. <p> You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The Lambda function name. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The Lambda function name. <p> You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * By default, the <code>Invoke</code> API assumes
     * <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the
     * <code>InvocationType</code>. You can also use this parameter to
     * request AWS Lambda to not execute the function but do some
     * verification, such as if the caller is authorized to invoke the
     * function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     * in a cross-account scenario when you want to verify access to a
     * function without running it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @return By default, the <code>Invoke</code> API assumes
     *         <code>RequestResponse</code> invocation type. You can optionally
     *         request asynchronous execution by specifying <code>Event</code> as the
     *         <code>InvocationType</code>. You can also use this parameter to
     *         request AWS Lambda to not execute the function but do some
     *         verification, such as if the caller is authorized to invoke the
     *         function and if the inputs are valid. You request this by specifying
     *         <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     *         in a cross-account scenario when you want to verify access to a
     *         function without running it.
     *
     * @see InvocationType
     */
    public String getInvocationType() {
        return invocationType;
    }
    
    /**
     * By default, the <code>Invoke</code> API assumes
     * <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the
     * <code>InvocationType</code>. You can also use this parameter to
     * request AWS Lambda to not execute the function but do some
     * verification, such as if the caller is authorized to invoke the
     * function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     * in a cross-account scenario when you want to verify access to a
     * function without running it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType By default, the <code>Invoke</code> API assumes
     *         <code>RequestResponse</code> invocation type. You can optionally
     *         request asynchronous execution by specifying <code>Event</code> as the
     *         <code>InvocationType</code>. You can also use this parameter to
     *         request AWS Lambda to not execute the function but do some
     *         verification, such as if the caller is authorized to invoke the
     *         function and if the inputs are valid. You request this by specifying
     *         <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     *         in a cross-account scenario when you want to verify access to a
     *         function without running it.
     *
     * @see InvocationType
     */
    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }
    
    /**
     * By default, the <code>Invoke</code> API assumes
     * <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the
     * <code>InvocationType</code>. You can also use this parameter to
     * request AWS Lambda to not execute the function but do some
     * verification, such as if the caller is authorized to invoke the
     * function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     * in a cross-account scenario when you want to verify access to a
     * function without running it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType By default, the <code>Invoke</code> API assumes
     *         <code>RequestResponse</code> invocation type. You can optionally
     *         request asynchronous execution by specifying <code>Event</code> as the
     *         <code>InvocationType</code>. You can also use this parameter to
     *         request AWS Lambda to not execute the function but do some
     *         verification, such as if the caller is authorized to invoke the
     *         function and if the inputs are valid. You request this by specifying
     *         <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     *         in a cross-account scenario when you want to verify access to a
     *         function without running it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InvocationType
     */
    public InvokeRequest withInvocationType(String invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    /**
     * By default, the <code>Invoke</code> API assumes
     * <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the
     * <code>InvocationType</code>. You can also use this parameter to
     * request AWS Lambda to not execute the function but do some
     * verification, such as if the caller is authorized to invoke the
     * function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     * in a cross-account scenario when you want to verify access to a
     * function without running it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType By default, the <code>Invoke</code> API assumes
     *         <code>RequestResponse</code> invocation type. You can optionally
     *         request asynchronous execution by specifying <code>Event</code> as the
     *         <code>InvocationType</code>. You can also use this parameter to
     *         request AWS Lambda to not execute the function but do some
     *         verification, such as if the caller is authorized to invoke the
     *         function and if the inputs are valid. You request this by specifying
     *         <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     *         in a cross-account scenario when you want to verify access to a
     *         function without running it.
     *
     * @see InvocationType
     */
    public void setInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
    }
    
    /**
     * By default, the <code>Invoke</code> API assumes
     * <code>RequestResponse</code> invocation type. You can optionally
     * request asynchronous execution by specifying <code>Event</code> as the
     * <code>InvocationType</code>. You can also use this parameter to
     * request AWS Lambda to not execute the function but do some
     * verification, such as if the caller is authorized to invoke the
     * function and if the inputs are valid. You request this by specifying
     * <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     * in a cross-account scenario when you want to verify access to a
     * function without running it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType By default, the <code>Invoke</code> API assumes
     *         <code>RequestResponse</code> invocation type. You can optionally
     *         request asynchronous execution by specifying <code>Event</code> as the
     *         <code>InvocationType</code>. You can also use this parameter to
     *         request AWS Lambda to not execute the function but do some
     *         verification, such as if the caller is authorized to invoke the
     *         function and if the inputs are valid. You request this by specifying
     *         <code>DryRun</code> as the <code>InvocationType</code>. This is useful
     *         in a cross-account scenario when you want to verify access to a
     *         function without running it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InvocationType
     */
    public InvokeRequest withInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
        return this;
    }

    /**
     * You can set this optional parameter to <code>Tail</code> in the
     * request only if you specify the <code>InvocationType</code> parameter
     * with value <code>RequestResponse</code>. In this case, AWS Lambda
     * returns the base64-encoded last 4 KB of log data produced by your
     * Lambda function in the <code>x-amz-log-results</code> header.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @return You can set this optional parameter to <code>Tail</code> in the
     *         request only if you specify the <code>InvocationType</code> parameter
     *         with value <code>RequestResponse</code>. In this case, AWS Lambda
     *         returns the base64-encoded last 4 KB of log data produced by your
     *         Lambda function in the <code>x-amz-log-results</code> header.
     *
     * @see LogType
     */
    public String getLogType() {
        return logType;
    }
    
    /**
     * You can set this optional parameter to <code>Tail</code> in the
     * request only if you specify the <code>InvocationType</code> parameter
     * with value <code>RequestResponse</code>. In this case, AWS Lambda
     * returns the base64-encoded last 4 KB of log data produced by your
     * Lambda function in the <code>x-amz-log-results</code> header.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType You can set this optional parameter to <code>Tail</code> in the
     *         request only if you specify the <code>InvocationType</code> parameter
     *         with value <code>RequestResponse</code>. In this case, AWS Lambda
     *         returns the base64-encoded last 4 KB of log data produced by your
     *         Lambda function in the <code>x-amz-log-results</code> header.
     *
     * @see LogType
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }
    
    /**
     * You can set this optional parameter to <code>Tail</code> in the
     * request only if you specify the <code>InvocationType</code> parameter
     * with value <code>RequestResponse</code>. In this case, AWS Lambda
     * returns the base64-encoded last 4 KB of log data produced by your
     * Lambda function in the <code>x-amz-log-results</code> header.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType You can set this optional parameter to <code>Tail</code> in the
     *         request only if you specify the <code>InvocationType</code> parameter
     *         with value <code>RequestResponse</code>. In this case, AWS Lambda
     *         returns the base64-encoded last 4 KB of log data produced by your
     *         Lambda function in the <code>x-amz-log-results</code> header.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LogType
     */
    public InvokeRequest withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * You can set this optional parameter to <code>Tail</code> in the
     * request only if you specify the <code>InvocationType</code> parameter
     * with value <code>RequestResponse</code>. In this case, AWS Lambda
     * returns the base64-encoded last 4 KB of log data produced by your
     * Lambda function in the <code>x-amz-log-results</code> header.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType You can set this optional parameter to <code>Tail</code> in the
     *         request only if you specify the <code>InvocationType</code> parameter
     *         with value <code>RequestResponse</code>. In this case, AWS Lambda
     *         returns the base64-encoded last 4 KB of log data produced by your
     *         Lambda function in the <code>x-amz-log-results</code> header.
     *
     * @see LogType
     */
    public void setLogType(LogType logType) {
        this.logType = logType.toString();
    }
    
    /**
     * You can set this optional parameter to <code>Tail</code> in the
     * request only if you specify the <code>InvocationType</code> parameter
     * with value <code>RequestResponse</code>. In this case, AWS Lambda
     * returns the base64-encoded last 4 KB of log data produced by your
     * Lambda function in the <code>x-amz-log-results</code> header.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType You can set this optional parameter to <code>Tail</code> in the
     *         request only if you specify the <code>InvocationType</code> parameter
     *         with value <code>RequestResponse</code>. In this case, AWS Lambda
     *         returns the base64-encoded last 4 KB of log data produced by your
     *         Lambda function in the <code>x-amz-log-results</code> header.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LogType
     */
    public InvokeRequest withLogType(LogType logType) {
        this.logType = logType.toString();
        return this;
    }

    /**
     * Using the <code>ClientContext</code> you can pass client-specific
     * information to the Lambda function you are invoking. You can then
     * process the client information in your Lambda function as you choose
     * through the context variable. For an example of a
     * <code>ClientContext</code> JSON, see <a
     * href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a>
     * in the <i>Amazon Mobile Analytics API Reference and User Guide</i>.
     * <p>The ClientContext JSON must be base64-encoded.
     *
     * @return Using the <code>ClientContext</code> you can pass client-specific
     *         information to the Lambda function you are invoking. You can then
     *         process the client information in your Lambda function as you choose
     *         through the context variable. For an example of a
     *         <code>ClientContext</code> JSON, see <a
     *         href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a>
     *         in the <i>Amazon Mobile Analytics API Reference and User Guide</i>.
     *         <p>The ClientContext JSON must be base64-encoded.
     */
    public String getClientContext() {
        return clientContext;
    }
    
    /**
     * Using the <code>ClientContext</code> you can pass client-specific
     * information to the Lambda function you are invoking. You can then
     * process the client information in your Lambda function as you choose
     * through the context variable. For an example of a
     * <code>ClientContext</code> JSON, see <a
     * href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a>
     * in the <i>Amazon Mobile Analytics API Reference and User Guide</i>.
     * <p>The ClientContext JSON must be base64-encoded.
     *
     * @param clientContext Using the <code>ClientContext</code> you can pass client-specific
     *         information to the Lambda function you are invoking. You can then
     *         process the client information in your Lambda function as you choose
     *         through the context variable. For an example of a
     *         <code>ClientContext</code> JSON, see <a
     *         href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a>
     *         in the <i>Amazon Mobile Analytics API Reference and User Guide</i>.
     *         <p>The ClientContext JSON must be base64-encoded.
     */
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }
    
    /**
     * Using the <code>ClientContext</code> you can pass client-specific
     * information to the Lambda function you are invoking. You can then
     * process the client information in your Lambda function as you choose
     * through the context variable. For an example of a
     * <code>ClientContext</code> JSON, see <a
     * href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a>
     * in the <i>Amazon Mobile Analytics API Reference and User Guide</i>.
     * <p>The ClientContext JSON must be base64-encoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientContext Using the <code>ClientContext</code> you can pass client-specific
     *         information to the Lambda function you are invoking. You can then
     *         process the client information in your Lambda function as you choose
     *         through the context variable. For an example of a
     *         <code>ClientContext</code> JSON, see <a
     *         href="http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html">PutEvents</a>
     *         in the <i>Amazon Mobile Analytics API Reference and User Guide</i>.
     *         <p>The ClientContext JSON must be base64-encoded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeRequest withClientContext(String clientContext) {
        this.clientContext = clientContext;
        return this;
    }

    /**
     * JSON that you want to provide to your Lambda function as input.
     *
     * @return JSON that you want to provide to your Lambda function as input.
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }
    
    /**
     * JSON that you want to provide to your Lambda function as input.
     *
     * @param payload JSON that you want to provide to your Lambda function as input.
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }
    
    /**
     * JSON that you want to provide to your Lambda function as input.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param payload JSON that you want to provide to your Lambda function as input.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeRequest withPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
        return this;
    }

    /**
     * JSON that you want to provide to your Lambda function as input.
     *
     * @param payload JSON that you want to provide to your Lambda function as input.
     */
    public void setPayload(String payload) {
        if (payload == null) {
            this.payload = null;
        } else {
            this.payload = java.nio.ByteBuffer.wrap(payload.getBytes(com.amazonaws.util.StringUtils.UTF8));
        }
    }
    
    /**
     * JSON that you want to provide to your Lambda function as input.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param payload JSON that you want to provide to your Lambda function as input.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeRequest withPayload(String payload) {
        setPayload(payload);
        return this;
    }

    /**
     * You can use this optional parameter to specify a Lambda function
     * version or alias name. If you specify a function version, the API uses
     * the qualified function ARN to invoke a specific Lambda function. If
     * you specify an alias name, the API uses the alias ARN to invoke the
     * Lambda function version to which the alias points. <p>If you don't
     * provide this parameter, then the API uses unqualified function ARN
     * which results in invocation of the <code>$LATEST</code> version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @return You can use this optional parameter to specify a Lambda function
     *         version or alias name. If you specify a function version, the API uses
     *         the qualified function ARN to invoke a specific Lambda function. If
     *         you specify an alias name, the API uses the alias ARN to invoke the
     *         Lambda function version to which the alias points. <p>If you don't
     *         provide this parameter, then the API uses unqualified function ARN
     *         which results in invocation of the <code>$LATEST</code> version.
     */
    public String getQualifier() {
        return qualifier;
    }
    
    /**
     * You can use this optional parameter to specify a Lambda function
     * version or alias name. If you specify a function version, the API uses
     * the qualified function ARN to invoke a specific Lambda function. If
     * you specify an alias name, the API uses the alias ARN to invoke the
     * Lambda function version to which the alias points. <p>If you don't
     * provide this parameter, then the API uses unqualified function ARN
     * which results in invocation of the <code>$LATEST</code> version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @param qualifier You can use this optional parameter to specify a Lambda function
     *         version or alias name. If you specify a function version, the API uses
     *         the qualified function ARN to invoke a specific Lambda function. If
     *         you specify an alias name, the API uses the alias ARN to invoke the
     *         Lambda function version to which the alias points. <p>If you don't
     *         provide this parameter, then the API uses unqualified function ARN
     *         which results in invocation of the <code>$LATEST</code> version.
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }
    
    /**
     * You can use this optional parameter to specify a Lambda function
     * version or alias name. If you specify a function version, the API uses
     * the qualified function ARN to invoke a specific Lambda function. If
     * you specify an alias name, the API uses the alias ARN to invoke the
     * Lambda function version to which the alias points. <p>If you don't
     * provide this parameter, then the API uses unqualified function ARN
     * which results in invocation of the <code>$LATEST</code> version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @param qualifier You can use this optional parameter to specify a Lambda function
     *         version or alias name. If you specify a function version, the API uses
     *         the qualified function ARN to invoke a specific Lambda function. If
     *         you specify an alias name, the API uses the alias ARN to invoke the
     *         Lambda function version to which the alias points. <p>If you don't
     *         provide this parameter, then the API uses unqualified function ARN
     *         which results in invocation of the <code>$LATEST</code> version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeRequest withQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getInvocationType() != null) sb.append("InvocationType: " + getInvocationType() + ",");
        if (getLogType() != null) sb.append("LogType: " + getLogType() + ",");
        if (getClientContext() != null) sb.append("ClientContext: " + getClientContext() + ",");
        if (getPayload() != null) sb.append("Payload: " + getPayload() + ",");
        if (getQualifier() != null) sb.append("Qualifier: " + getQualifier() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InvokeRequest == false) return false;
        InvokeRequest other = (InvokeRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getInvocationType() == null ^ this.getInvocationType() == null) return false;
        if (other.getInvocationType() != null && other.getInvocationType().equals(this.getInvocationType()) == false) return false; 
        if (other.getLogType() == null ^ this.getLogType() == null) return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false) return false; 
        if (other.getClientContext() == null ^ this.getClientContext() == null) return false;
        if (other.getClientContext() != null && other.getClientContext().equals(this.getClientContext()) == false) return false; 
        if (other.getPayload() == null ^ this.getPayload() == null) return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false) return false; 
        if (other.getQualifier() == null ^ this.getQualifier() == null) return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false) return false; 
        return true;
    }
    
    @Override
    public InvokeRequest clone() {
        
            return (InvokeRequest) super.clone();
    }

}
    