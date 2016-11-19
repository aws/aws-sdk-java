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
public class CreateFunctionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name you want to assign to the function you are uploading. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other AWS Lambda APIs,
     * such as <a>Invoke</a>.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the value
     * to "nodejs".
     * </p>
     */
    private String runtime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to access any
     * other Amazon Web Services (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The function within your code that Lambda calls to begin execution. For Node.js, it is the
     * <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     * <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda Function
     * Handler (Java)</a>.
     * </p>
     */
    private String handler;
    /**
     * <p>
     * The code for the Lambda function.
     * </p>
     */
    private FunctionCode code;
    /**
     * <p>
     * A short, user-defined function description. Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The function execution time at which Lambda should terminate the function. Because the execution time has cost
     * implications, we recommend you set this value based on your expected execution time. The default is 3 seconds.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the amount of
     * CPU and memory allocated to your function. Your function use-case determines your CPU and memory requirements.
     * For example, a database operation might need less memory compared to an image processing function. The default
     * value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     */
    private Integer memorySize;
    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     */
    private Boolean publish;
    /**
     * <p>
     * If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security
     * group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one
     * subnet ID.
     * </p>
     */
    private VpcConfig vpcConfig;

    private Environment environment;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If not
     * provided, AWS Lambda will use a default service key.
     * </p>
     */
    private String kMSKeyArn;

    /**
     * <p>
     * The name you want to assign to the function you are uploading. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other AWS Lambda APIs,
     * such as <a>Invoke</a>.
     * </p>
     * 
     * @param functionName
     *        The name you want to assign to the function you are uploading. The function names appear in the console
     *        and are returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other
     *        AWS Lambda APIs, such as <a>Invoke</a>.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name you want to assign to the function you are uploading. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other AWS Lambda APIs,
     * such as <a>Invoke</a>.
     * </p>
     * 
     * @return The name you want to assign to the function you are uploading. The function names appear in the console
     *         and are returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other
     *         AWS Lambda APIs, such as <a>Invoke</a>.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name you want to assign to the function you are uploading. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other AWS Lambda APIs,
     * such as <a>Invoke</a>.
     * </p>
     * 
     * @param functionName
     *        The name you want to assign to the function you are uploading. The function names appear in the console
     *        and are returned in the <a>ListFunctions</a> API. Function names are used to specify functions to other
     *        AWS Lambda APIs, such as <a>Invoke</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the value
     * to "nodejs".
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function you are uploading.</p>
     *        <p>
     *        To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the
     *        value to "nodejs".
     * @see Runtime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the value
     * to "nodejs".
     * </p>
     * 
     * @return The runtime environment for the Lambda function you are uploading.</p>
     *         <p>
     *         To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the
     *         value to "nodejs".
     * @see Runtime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the value
     * to "nodejs".
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function you are uploading.</p>
     *        <p>
     *        To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the
     *        value to "nodejs".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public CreateFunctionRequest withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the value
     * to "nodejs".
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function you are uploading.</p>
     *        <p>
     *        To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the
     *        value to "nodejs".
     * @see Runtime
     */

    public void setRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
    }

    /**
     * <p>
     * The runtime environment for the Lambda function you are uploading.
     * </p>
     * <p>
     * To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the value
     * to "nodejs".
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function you are uploading.</p>
     *        <p>
     *        To use the Node.js runtime v4.3, set the value to "nodejs4.3". To use earlier runtime (v0.10.42), set the
     *        value to "nodejs".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public CreateFunctionRequest withRuntime(Runtime runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to access any
     * other Amazon Web Services (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to
     *        access any other Amazon Web Services (AWS) resources. For more information, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to access any
     * other Amazon Web Services (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to
     *         access any other Amazon Web Services (AWS) resources. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to access any
     * other Amazon Web Services (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the IAM role that Lambda assumes when it executes your function to
     *        access any other Amazon Web Services (AWS) resources. For more information, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The function within your code that Lambda calls to begin execution. For Node.js, it is the
     * <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     * <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda Function
     * Handler (Java)</a>.
     * </p>
     * 
     * @param handler
     *        The function within your code that Lambda calls to begin execution. For Node.js, it is the
     *        <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     *        <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     *        Function Handler (Java)</a>.
     */

    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The function within your code that Lambda calls to begin execution. For Node.js, it is the
     * <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     * <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda Function
     * Handler (Java)</a>.
     * </p>
     * 
     * @return The function within your code that Lambda calls to begin execution. For Node.js, it is the
     *         <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     *         <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     *         Function Handler (Java)</a>.
     */

    public String getHandler() {
        return this.handler;
    }

    /**
     * <p>
     * The function within your code that Lambda calls to begin execution. For Node.js, it is the
     * <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     * <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda Function
     * Handler (Java)</a>.
     * </p>
     * 
     * @param handler
     *        The function within your code that Lambda calls to begin execution. For Node.js, it is the
     *        <i>module-name</i>.<i>export</i> value in your function. For Java, it can be
     *        <code>package.class-name::handler</code> or <code>package.class-name</code>. For more information, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     *        Function Handler (Java)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withHandler(String handler) {
        setHandler(handler);
        return this;
    }

    /**
     * <p>
     * The code for the Lambda function.
     * </p>
     * 
     * @param code
     *        The code for the Lambda function.
     */

    public void setCode(FunctionCode code) {
        this.code = code;
    }

    /**
     * <p>
     * The code for the Lambda function.
     * </p>
     * 
     * @return The code for the Lambda function.
     */

    public FunctionCode getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code for the Lambda function.
     * </p>
     * 
     * @param code
     *        The code for the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withCode(FunctionCode code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A short, user-defined function description. Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     * 
     * @param description
     *        A short, user-defined function description. Lambda does not use this value. Assign a meaningful
     *        description as you see fit.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A short, user-defined function description. Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     * 
     * @return A short, user-defined function description. Lambda does not use this value. Assign a meaningful
     *         description as you see fit.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A short, user-defined function description. Lambda does not use this value. Assign a meaningful description as
     * you see fit.
     * </p>
     * 
     * @param description
     *        A short, user-defined function description. Lambda does not use this value. Assign a meaningful
     *        description as you see fit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The function execution time at which Lambda should terminate the function. Because the execution time has cost
     * implications, we recommend you set this value based on your expected execution time. The default is 3 seconds.
     * </p>
     * 
     * @param timeout
     *        The function execution time at which Lambda should terminate the function. Because the execution time has
     *        cost implications, we recommend you set this value based on your expected execution time. The default is 3
     *        seconds.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The function execution time at which Lambda should terminate the function. Because the execution time has cost
     * implications, we recommend you set this value based on your expected execution time. The default is 3 seconds.
     * </p>
     * 
     * @return The function execution time at which Lambda should terminate the function. Because the execution time has
     *         cost implications, we recommend you set this value based on your expected execution time. The default is
     *         3 seconds.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The function execution time at which Lambda should terminate the function. Because the execution time has cost
     * implications, we recommend you set this value based on your expected execution time. The default is 3 seconds.
     * </p>
     * 
     * @param timeout
     *        The function execution time at which Lambda should terminate the function. Because the execution time has
     *        cost implications, we recommend you set this value based on your expected execution time. The default is 3
     *        seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the amount of
     * CPU and memory allocated to your function. Your function use-case determines your CPU and memory requirements.
     * For example, a database operation might need less memory compared to an image processing function. The default
     * value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @param memorySize
     *        The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the
     *        amount of CPU and memory allocated to your function. Your function use-case determines your CPU and memory
     *        requirements. For example, a database operation might need less memory compared to an image processing
     *        function. The default value is 128 MB. The value must be a multiple of 64 MB.
     */

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the amount of
     * CPU and memory allocated to your function. Your function use-case determines your CPU and memory requirements.
     * For example, a database operation might need less memory compared to an image processing function. The default
     * value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @return The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the
     *         amount of CPU and memory allocated to your function. Your function use-case determines your CPU and
     *         memory requirements. For example, a database operation might need less memory compared to an image
     *         processing function. The default value is 128 MB. The value must be a multiple of 64 MB.
     */

    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * <p>
     * The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the amount of
     * CPU and memory allocated to your function. Your function use-case determines your CPU and memory requirements.
     * For example, a database operation might need less memory compared to an image processing function. The default
     * value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @param memorySize
     *        The amount of memory, in MB, your Lambda function is given. Lambda uses this memory size to infer the
     *        amount of CPU and memory allocated to your function. Your function use-case determines your CPU and memory
     *        requirements. For example, a database operation might need less memory compared to an image processing
     *        function. The default value is 128 MB. The value must be a multiple of 64 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withMemorySize(Integer memorySize) {
        setMemorySize(memorySize);
        return this;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @param publish
     *        This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a
     *        version as an atomic operation.
     */

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @return This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a
     *         version as an atomic operation.
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @param publish
     *        This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a
     *        version as an atomic operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withPublish(Boolean publish) {
        setPublish(publish);
        return this;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @return This boolean parameter can be used to request AWS Lambda to create the Lambda function and publish a
     *         version as an atomic operation.
     */

    public Boolean isPublish() {
        return this.publish;
    }

    /**
     * <p>
     * If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security
     * group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one
     * subnet ID.
     * </p>
     * 
     * @param vpcConfig
     *        If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of
     *        security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one
     *        security group and one subnet ID.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security
     * group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one
     * subnet ID.
     * </p>
     * 
     * @return If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of
     *         security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one
     *         security group and one subnet ID.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security
     * group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one
     * subnet ID.
     * </p>
     * 
     * @param vpcConfig
     *        If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of
     *        security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one
     *        security group and one subnet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * @param environment
     */

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    /**
     * @return
     */

    public Environment getEnvironment() {
        return this.environment;
    }

    /**
     * @param environment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withEnvironment(Environment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If not
     * provided, AWS Lambda will use a default service key.
     * </p>
     * 
     * @param kMSKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If
     *        not provided, AWS Lambda will use a default service key.
     */

    public void setKMSKeyArn(String kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If not
     * provided, AWS Lambda will use a default service key.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If
     *         not provided, AWS Lambda will use a default service key.
     */

    public String getKMSKeyArn() {
        return this.kMSKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If not
     * provided, AWS Lambda will use a default service key.
     * </p>
     * 
     * @param kMSKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key used to encrypt your function's environment variables. If
     *        not provided, AWS Lambda will use a default service key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withKMSKeyArn(String kMSKeyArn) {
        setKMSKeyArn(kMSKeyArn);
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
        if (getRuntime() != null)
            sb.append("Runtime: " + getRuntime() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getHandler() != null)
            sb.append("Handler: " + getHandler() + ",");
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTimeout() != null)
            sb.append("Timeout: " + getTimeout() + ",");
        if (getMemorySize() != null)
            sb.append("MemorySize: " + getMemorySize() + ",");
        if (getPublish() != null)
            sb.append("Publish: " + getPublish() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment() + ",");
        if (getKMSKeyArn() != null)
            sb.append("KMSKeyArn: " + getKMSKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFunctionRequest == false)
            return false;
        CreateFunctionRequest other = (CreateFunctionRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getHandler() == null ^ this.getHandler() == null)
            return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
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
        if (other.getPublish() == null ^ this.getPublish() == null)
            return false;
        if (other.getPublish() != null && other.getPublish().equals(this.getPublish()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getKMSKeyArn() == null ^ this.getKMSKeyArn() == null)
            return false;
        if (other.getKMSKeyArn() != null && other.getKMSKeyArn().equals(this.getKMSKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode());
        hashCode = prime * hashCode + ((getPublish() == null) ? 0 : getPublish().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyArn() == null) ? 0 : getKMSKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateFunctionRequest clone() {
        return (CreateFunctionRequest) super.clone();
    }
}
