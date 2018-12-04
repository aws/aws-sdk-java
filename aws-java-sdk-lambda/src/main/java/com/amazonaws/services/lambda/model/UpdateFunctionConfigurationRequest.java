/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFunctionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Lambda function.
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
     * The Amazon Resource Name (ARN) of the IAM role that Lambda will assume when it executes your function.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The function that Lambda calls to begin executing your function. For Node.js, it is the
     * <code>module-name.export</code> value in your function.
     * </p>
     */
    private String handler;
    /**
     * <p>
     * A short user-defined function description. AWS Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The function execution time at which AWS Lambda should terminate the function. Because the execution time has
     * cost implications, we recommend you set this value based on your expected execution time. The default is 3
     * seconds.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. AWS Lambda uses this memory size to infer the amount
     * of CPU allocated to your function. Your function use-case determines your CPU and memory requirements. For
     * example, a database operation might need less memory compared to an image processing function. The default value
     * is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     */
    private Integer memorySize;

    private VpcConfig vpcConfig;
    /**
     * <p>
     * The parent object that contains your environment's configuration settings.
     * </p>
     */
    private Environment environment;
    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     */
    private String runtime;
    /**
     * <p>
     * The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS topic.
     * </p>
     */
    private DeadLetterConfig deadLetterConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If you elect
     * to use the AWS Lambda default service key, pass in an empty string ("") for this parameter.
     * </p>
     */
    private String kMSKeyArn;
    /**
     * <p>
     * The parent object that contains your function's tracing settings.
     * </p>
     */
    private TracingConfig tracingConfig;
    /**
     * <p>
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either or .
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The name of the Lambda function.
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
     *        The name of the Lambda function.</p>
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
     * The name of the Lambda function.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @return The name of the Lambda function.</p>
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
     * The name of the Lambda function.
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
     *        The name of the Lambda function.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda will assume when it executes your function.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the IAM role that Lambda will assume when it executes your function.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda will assume when it executes your function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Lambda will assume when it executes your function.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda will assume when it executes your function.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the IAM role that Lambda will assume when it executes your function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The function that Lambda calls to begin executing your function. For Node.js, it is the
     * <code>module-name.export</code> value in your function.
     * </p>
     * 
     * @param handler
     *        The function that Lambda calls to begin executing your function. For Node.js, it is the
     *        <code>module-name.export</code> value in your function.
     */

    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The function that Lambda calls to begin executing your function. For Node.js, it is the
     * <code>module-name.export</code> value in your function.
     * </p>
     * 
     * @return The function that Lambda calls to begin executing your function. For Node.js, it is the
     *         <code>module-name.export</code> value in your function.
     */

    public String getHandler() {
        return this.handler;
    }

    /**
     * <p>
     * The function that Lambda calls to begin executing your function. For Node.js, it is the
     * <code>module-name.export</code> value in your function.
     * </p>
     * 
     * @param handler
     *        The function that Lambda calls to begin executing your function. For Node.js, it is the
     *        <code>module-name.export</code> value in your function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withHandler(String handler) {
        setHandler(handler);
        return this;
    }

    /**
     * <p>
     * A short user-defined function description. AWS Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     * 
     * @param description
     *        A short user-defined function description. AWS Lambda does not use this value. Assign a meaningful
     *        description as you see fit.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A short user-defined function description. AWS Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     * 
     * @return A short user-defined function description. AWS Lambda does not use this value. Assign a meaningful
     *         description as you see fit.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A short user-defined function description. AWS Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     * 
     * @param description
     *        A short user-defined function description. AWS Lambda does not use this value. Assign a meaningful
     *        description as you see fit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The function execution time at which AWS Lambda should terminate the function. Because the execution time has
     * cost implications, we recommend you set this value based on your expected execution time. The default is 3
     * seconds.
     * </p>
     * 
     * @param timeout
     *        The function execution time at which AWS Lambda should terminate the function. Because the execution time
     *        has cost implications, we recommend you set this value based on your expected execution time. The default
     *        is 3 seconds.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The function execution time at which AWS Lambda should terminate the function. Because the execution time has
     * cost implications, we recommend you set this value based on your expected execution time. The default is 3
     * seconds.
     * </p>
     * 
     * @return The function execution time at which AWS Lambda should terminate the function. Because the execution time
     *         has cost implications, we recommend you set this value based on your expected execution time. The default
     *         is 3 seconds.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The function execution time at which AWS Lambda should terminate the function. Because the execution time has
     * cost implications, we recommend you set this value based on your expected execution time. The default is 3
     * seconds.
     * </p>
     * 
     * @param timeout
     *        The function execution time at which AWS Lambda should terminate the function. Because the execution time
     *        has cost implications, we recommend you set this value based on your expected execution time. The default
     *        is 3 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. AWS Lambda uses this memory size to infer the amount
     * of CPU allocated to your function. Your function use-case determines your CPU and memory requirements. For
     * example, a database operation might need less memory compared to an image processing function. The default value
     * is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @param memorySize
     *        The amount of memory, in MB, your Lambda function is given. AWS Lambda uses this memory size to infer the
     *        amount of CPU allocated to your function. Your function use-case determines your CPU and memory
     *        requirements. For example, a database operation might need less memory compared to an image processing
     *        function. The default value is 128 MB. The value must be a multiple of 64 MB.
     */

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. AWS Lambda uses this memory size to infer the amount
     * of CPU allocated to your function. Your function use-case determines your CPU and memory requirements. For
     * example, a database operation might need less memory compared to an image processing function. The default value
     * is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @return The amount of memory, in MB, your Lambda function is given. AWS Lambda uses this memory size to infer the
     *         amount of CPU allocated to your function. Your function use-case determines your CPU and memory
     *         requirements. For example, a database operation might need less memory compared to an image processing
     *         function. The default value is 128 MB. The value must be a multiple of 64 MB.
     */

    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. AWS Lambda uses this memory size to infer the amount
     * of CPU allocated to your function. Your function use-case determines your CPU and memory requirements. For
     * example, a database operation might need less memory compared to an image processing function. The default value
     * is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @param memorySize
     *        The amount of memory, in MB, your Lambda function is given. AWS Lambda uses this memory size to infer the
     *        amount of CPU allocated to your function. Your function use-case determines your CPU and memory
     *        requirements. For example, a database operation might need less memory compared to an image processing
     *        function. The default value is 128 MB. The value must be a multiple of 64 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withMemorySize(Integer memorySize) {
        setMemorySize(memorySize);
        return this;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The parent object that contains your environment's configuration settings.
     * </p>
     * 
     * @param environment
     *        The parent object that contains your environment's configuration settings.
     */

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The parent object that contains your environment's configuration settings.
     * </p>
     * 
     * @return The parent object that contains your environment's configuration settings.
     */

    public Environment getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * The parent object that contains your environment's configuration settings.
     * </p>
     * 
     * @param environment
     *        The parent object that contains your environment's configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withEnvironment(Environment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.</p>
     *        <p>
     *        To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the
     *        value to "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js
     *        runtime v4.3, set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     *        </p>
     *        <note>
     *        <p>
     *        Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js
     *        runtime versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so
     *        will result in an invalid parameter error being returned. Note that you will have to follow this procedure
     *        for each region that contains functions written in the Node v0.10.42 runtime.
     *        </p>
     * @see Runtime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     * 
     * @return The runtime environment for the Lambda function.</p>
     *         <p>
     *         To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the
     *         value to "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js
     *         runtime v4.3, set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     *         </p>
     *         <note>
     *         <p>
     *         Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js
     *         runtime versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so
     *         will result in an invalid parameter error being returned. Note that you will have to follow this
     *         procedure for each region that contains functions written in the Node v0.10.42 runtime.
     *         </p>
     * @see Runtime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.</p>
     *        <p>
     *        To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the
     *        value to "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js
     *        runtime v4.3, set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     *        </p>
     *        <note>
     *        <p>
     *        Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js
     *        runtime versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so
     *        will result in an invalid parameter error being returned. Note that you will have to follow this procedure
     *        for each region that contains functions written in the Node v0.10.42 runtime.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public UpdateFunctionConfigurationRequest withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.</p>
     *        <p>
     *        To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the
     *        value to "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js
     *        runtime v4.3, set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     *        </p>
     *        <note>
     *        <p>
     *        Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js
     *        runtime versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so
     *        will result in an invalid parameter error being returned. Note that you will have to follow this procedure
     *        for each region that contains functions written in the Node v0.10.42 runtime.
     *        </p>
     * @see Runtime
     */

    public void setRuntime(Runtime runtime) {
        withRuntime(runtime);
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * <p>
     * To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the value to
     * "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js runtime v4.3,
     * set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     * </p>
     * <note>
     * <p>
     * Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js runtime
     * versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so will result in
     * an invalid parameter error being returned. Note that you will have to follow this procedure for each region that
     * contains functions written in the Node v0.10.42 runtime.
     * </p>
     * </note>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.</p>
     *        <p>
     *        To use the Python runtime v3.6, set the value to "python3.6". To use the Python runtime v2.7, set the
     *        value to "python2.7". To use the Node.js runtime v6.10, set the value to "nodejs6.10". To use the Node.js
     *        runtime v4.3, set the value to "nodejs4.3". To use the Python runtime v3.6, set the value to "python3.6".
     *        </p>
     *        <note>
     *        <p>
     *        Node v0.10.42 is currently marked as deprecated. You must migrate existing functions to the newer Node.js
     *        runtime versions available on AWS Lambda (nodejs4.3 or nodejs6.10) as soon as possible. Failure to do so
     *        will result in an invalid parameter error being returned. Note that you will have to follow this procedure
     *        for each region that contains functions written in the Node v0.10.42 runtime.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public UpdateFunctionConfigurationRequest withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * <p>
     * The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * 
     * @param deadLetterConfig
     *        The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS
     *        topic.
     */

    public void setDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    /**
     * <p>
     * The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * 
     * @return The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon
     *         SNS topic.
     */

    public DeadLetterConfig getDeadLetterConfig() {
        return this.deadLetterConfig;
    }

    /**
     * <p>
     * The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * 
     * @param deadLetterConfig
     *        The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS
     *        topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        setDeadLetterConfig(deadLetterConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If you elect
     * to use the AWS Lambda default service key, pass in an empty string ("") for this parameter.
     * </p>
     * 
     * @param kMSKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If
     *        you elect to use the AWS Lambda default service key, pass in an empty string ("") for this parameter.
     */

    public void setKMSKeyArn(String kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If you elect
     * to use the AWS Lambda default service key, pass in an empty string ("") for this parameter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If
     *         you elect to use the AWS Lambda default service key, pass in an empty string ("") for this parameter.
     */

    public String getKMSKeyArn() {
        return this.kMSKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If you elect
     * to use the AWS Lambda default service key, pass in an empty string ("") for this parameter.
     * </p>
     * 
     * @param kMSKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If
     *        you elect to use the AWS Lambda default service key, pass in an empty string ("") for this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withKMSKeyArn(String kMSKeyArn) {
        setKMSKeyArn(kMSKeyArn);
        return this;
    }

    /**
     * <p>
     * The parent object that contains your function's tracing settings.
     * </p>
     * 
     * @param tracingConfig
     *        The parent object that contains your function's tracing settings.
     */

    public void setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
    }

    /**
     * <p>
     * The parent object that contains your function's tracing settings.
     * </p>
     * 
     * @return The parent object that contains your function's tracing settings.
     */

    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    /**
     * <p>
     * The parent object that contains your function's tracing settings.
     * </p>
     * 
     * @param tracingConfig
     *        The parent object that contains your function's tracing settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withTracingConfig(TracingConfig tracingConfig) {
        setTracingConfig(tracingConfig);
        return this;
    }

    /**
     * <p>
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either or .
     * </p>
     * 
     * @param revisionId
     *        An optional value you can use to ensure you are updating the latest update of the function version or
     *        alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the
     *        function or alias, it will fail with an error message, advising you to retrieve the latest function
     *        version or alias <code>RevisionID</code> using either or .
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either or .
     * </p>
     * 
     * @return An optional value you can use to ensure you are updating the latest update of the function version or
     *         alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the
     *         function or alias, it will fail with an error message, advising you to retrieve the latest function
     *         version or alias <code>RevisionID</code> using either or .
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either or .
     * </p>
     * 
     * @param revisionId
     *        An optional value you can use to ensure you are updating the latest update of the function version or
     *        alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the
     *        function or alias, it will fail with an error message, advising you to retrieve the latest function
     *        version or alias <code>RevisionID</code> using either or .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionConfigurationRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getHandler() != null)
            sb.append("Handler: ").append(getHandler()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getMemorySize() != null)
            sb.append("MemorySize: ").append(getMemorySize()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime()).append(",");
        if (getDeadLetterConfig() != null)
            sb.append("DeadLetterConfig: ").append(getDeadLetterConfig()).append(",");
        if (getKMSKeyArn() != null)
            sb.append("KMSKeyArn: ").append(getKMSKeyArn()).append(",");
        if (getTracingConfig() != null)
            sb.append("TracingConfig: ").append(getTracingConfig()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFunctionConfigurationRequest == false)
            return false;
        UpdateFunctionConfigurationRequest other = (UpdateFunctionConfigurationRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getHandler() == null ^ this.getHandler() == null)
            return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getMemorySize() == null ^ this.getMemorySize() == null)
            return false;
        if (other.getMemorySize() != null && other.getMemorySize().equals(this.getMemorySize()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        if (other.getDeadLetterConfig() == null ^ this.getDeadLetterConfig() == null)
            return false;
        if (other.getDeadLetterConfig() != null && other.getDeadLetterConfig().equals(this.getDeadLetterConfig()) == false)
            return false;
        if (other.getKMSKeyArn() == null ^ this.getKMSKeyArn() == null)
            return false;
        if (other.getKMSKeyArn() != null && other.getKMSKeyArn().equals(this.getKMSKeyArn()) == false)
            return false;
        if (other.getTracingConfig() == null ^ this.getTracingConfig() == null)
            return false;
        if (other.getTracingConfig() != null && other.getTracingConfig().equals(this.getTracingConfig()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyArn() == null) ? 0 : getKMSKeyArn().hashCode());
        hashCode = prime * hashCode + ((getTracingConfig() == null) ? 0 : getTracingConfig().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFunctionConfigurationRequest clone() {
        return (UpdateFunctionConfigurationRequest) super.clone();
    }

}
