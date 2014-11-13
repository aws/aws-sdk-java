/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#uploadFunction(UploadFunctionRequest) UploadFunction operation}.
 * <p>
 * Creates a new Lambda function or updates an existing function. The
 * function metadata is created from the request parameters, and the code
 * for the function is provided by a .zip file in the request body. If
 * the function name already exists, the existing Lambda function is
 * updated with the new code and metadata.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:UploadFunction</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#uploadFunction(UploadFunctionRequest)
 */
public class UploadFunctionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name you want to assign to the function you are uploading. The
     * function names appear in the console and are returned in the
     * <a>ListFunctions</a> API. Function names are used to specify functions
     * to other AWS Lambda APIs, such as <a>InvokeAsync</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     */
    private String functionName;

    /**
     * A .zip file containing your packaged source code. For more information
     * about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events.html">AWS
     * LambdaL How it Works</a> in the AWS Lambda Developer Guide.
     *
     * This stream must implement mark/reset in order for signature calculation to be performed
     * before this data is read for the request payload.
     */
    private java.io.InputStream functionZip;

    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports only "nodejs" as the runtime.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs
     */
    private String runtime;

    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_]+<br/>
     */
    private String role;

    /**
     * The function that Lambda calls to begin execution. For Node.js, it is
     * the <i>module-name</i>.<i>export</i> value in your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9./\-_]+<br/>
     */
    private String handler;

    /**
     * How the Lambda function will be invoked. Lambda supports only the
     * "event" mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>event
     */
    private String mode;

    /**
     * A short, user-defined function description. Lambda does not use this
     * value. Assign a meaningful description as you see fit.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String description;

    /**
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     */
    private Integer timeout;

    /**
     * The amount of memory, in MB, your Lambda function is given. Lambda
     * uses this memory size to infer the amount of CPU allocated to your
     * function. Your function use-case determines your CPU and memory
     * requirements. For example, database operation might need less memory
     * compared to image processing function. The default value is 128 MB.
     * The value must be a multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64 - 1024<br/>
     */
    private Integer memorySize;

    /**
     * The name you want to assign to the function you are uploading. The
     * function names appear in the console and are returned in the
     * <a>ListFunctions</a> API. Function names are used to specify functions
     * to other AWS Lambda APIs, such as <a>InvokeAsync</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @return The name you want to assign to the function you are uploading. The
     *         function names appear in the console and are returned in the
     *         <a>ListFunctions</a> API. Function names are used to specify functions
     *         to other AWS Lambda APIs, such as <a>InvokeAsync</a>.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The name you want to assign to the function you are uploading. The
     * function names appear in the console and are returned in the
     * <a>ListFunctions</a> API. Function names are used to specify functions
     * to other AWS Lambda APIs, such as <a>InvokeAsync</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param functionName The name you want to assign to the function you are uploading. The
     *         function names appear in the console and are returned in the
     *         <a>ListFunctions</a> API. Function names are used to specify functions
     *         to other AWS Lambda APIs, such as <a>InvokeAsync</a>.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The name you want to assign to the function you are uploading. The
     * function names appear in the console and are returned in the
     * <a>ListFunctions</a> API. Function names are used to specify functions
     * to other AWS Lambda APIs, such as <a>InvokeAsync</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param functionName The name you want to assign to the function you are uploading. The
     *         function names appear in the console and are returned in the
     *         <a>ListFunctions</a> API. Function names are used to specify functions
     *         to other AWS Lambda APIs, such as <a>InvokeAsync</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadFunctionRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * A .zip file containing your packaged source code. For more information
     * about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events.html">AWS
     * LambdaL How it Works</a> in the AWS Lambda Developer Guide.
     *
     * This stream must implement mark/reset in order for signature calculation to be performed
     * before this data is read for the request payload.
     *
     * @return A .zip file containing your packaged source code. For more information
     *         about creating a .zip file, go to <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events.html">AWS
     *         LambdaL How it Works</a> in the AWS Lambda Developer Guide.
     */
    public java.io.InputStream getFunctionZip() {
        return functionZip;
    }
    
    /**
     * A .zip file containing your packaged source code. For more information
     * about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events.html">AWS
     * LambdaL How it Works</a> in the AWS Lambda Developer Guide.
     *
     * This stream must implement mark/reset in order for signature calculation to be performed
     * before this data is read for the request payload.
     *
     * @param functionZip A .zip file containing your packaged source code. For more information
     *         about creating a .zip file, go to <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events.html">AWS
     *         LambdaL How it Works</a> in the AWS Lambda Developer Guide.
     */
    public void setFunctionZip(java.io.InputStream functionZip) {
        this.functionZip = functionZip;
    }
    
    /**
     * A .zip file containing your packaged source code. For more information
     * about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events.html">AWS
     * LambdaL How it Works</a> in the AWS Lambda Developer Guide.
     *
     * This stream must implement mark/reset in order for signature calculation to be performed
     * before this data is read for the request payload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param functionZip A .zip file containing your packaged source code. For more information
     *         about creating a .zip file, go to <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events.html">AWS
     *         LambdaL How it Works</a> in the AWS Lambda Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadFunctionRequest withFunctionZip(java.io.InputStream functionZip) {
        this.functionZip = functionZip;
        return this;
    }

    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports only "nodejs" as the runtime.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs
     *
     * @return The runtime environment for the Lambda function you are uploading.
     *         Currently, Lambda supports only "nodejs" as the runtime.
     *
     * @see Runtime
     */
    public String getRuntime() {
        return runtime;
    }
    
    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports only "nodejs" as the runtime.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs
     *
     * @param runtime The runtime environment for the Lambda function you are uploading.
     *         Currently, Lambda supports only "nodejs" as the runtime.
     *
     * @see Runtime
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
    
    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports only "nodejs" as the runtime.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs
     *
     * @param runtime The runtime environment for the Lambda function you are uploading.
     *         Currently, Lambda supports only "nodejs" as the runtime.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Runtime
     */
    public UploadFunctionRequest withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports only "nodejs" as the runtime.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs
     *
     * @param runtime The runtime environment for the Lambda function you are uploading.
     *         Currently, Lambda supports only "nodejs" as the runtime.
     *
     * @see Runtime
     */
    public void setRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
    }
    
    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports only "nodejs" as the runtime.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs
     *
     * @param runtime The runtime environment for the Lambda function you are uploading.
     *         Currently, Lambda supports only "nodejs" as the runtime.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Runtime
     */
    public UploadFunctionRequest withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_]+<br/>
     *
     * @return The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *         when it executes your function to access any other Amazon Web Services
     *         (AWS) resources.
     */
    public String getRole() {
        return role;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_]+<br/>
     *
     * @param role The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *         when it executes your function to access any other Amazon Web Services
     *         (AWS) resources.
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_]+<br/>
     *
     * @param role The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *         when it executes your function to access any other Amazon Web Services
     *         (AWS) resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadFunctionRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * The function that Lambda calls to begin execution. For Node.js, it is
     * the <i>module-name</i>.<i>export</i> value in your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9./\-_]+<br/>
     *
     * @return The function that Lambda calls to begin execution. For Node.js, it is
     *         the <i>module-name</i>.<i>export</i> value in your function.
     */
    public String getHandler() {
        return handler;
    }
    
    /**
     * The function that Lambda calls to begin execution. For Node.js, it is
     * the <i>module-name</i>.<i>export</i> value in your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9./\-_]+<br/>
     *
     * @param handler The function that Lambda calls to begin execution. For Node.js, it is
     *         the <i>module-name</i>.<i>export</i> value in your function.
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }
    
    /**
     * The function that Lambda calls to begin execution. For Node.js, it is
     * the <i>module-name</i>.<i>export</i> value in your function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9./\-_]+<br/>
     *
     * @param handler The function that Lambda calls to begin execution. For Node.js, it is
     *         the <i>module-name</i>.<i>export</i> value in your function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadFunctionRequest withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * How the Lambda function will be invoked. Lambda supports only the
     * "event" mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>event
     *
     * @return How the Lambda function will be invoked. Lambda supports only the
     *         "event" mode.
     *
     * @see Mode
     */
    public String getMode() {
        return mode;
    }
    
    /**
     * How the Lambda function will be invoked. Lambda supports only the
     * "event" mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>event
     *
     * @param mode How the Lambda function will be invoked. Lambda supports only the
     *         "event" mode.
     *
     * @see Mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }
    
    /**
     * How the Lambda function will be invoked. Lambda supports only the
     * "event" mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>event
     *
     * @param mode How the Lambda function will be invoked. Lambda supports only the
     *         "event" mode.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Mode
     */
    public UploadFunctionRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * How the Lambda function will be invoked. Lambda supports only the
     * "event" mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>event
     *
     * @param mode How the Lambda function will be invoked. Lambda supports only the
     *         "event" mode.
     *
     * @see Mode
     */
    public void setMode(Mode mode) {
        this.mode = mode.toString();
    }
    
    /**
     * How the Lambda function will be invoked. Lambda supports only the
     * "event" mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>event
     *
     * @param mode How the Lambda function will be invoked. Lambda supports only the
     *         "event" mode.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Mode
     */
    public UploadFunctionRequest withMode(Mode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * A short, user-defined function description. Lambda does not use this
     * value. Assign a meaningful description as you see fit.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return A short, user-defined function description. Lambda does not use this
     *         value. Assign a meaningful description as you see fit.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A short, user-defined function description. Lambda does not use this
     * value. Assign a meaningful description as you see fit.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description A short, user-defined function description. Lambda does not use this
     *         value. Assign a meaningful description as you see fit.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A short, user-defined function description. Lambda does not use this
     * value. Assign a meaningful description as you see fit.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description A short, user-defined function description. Lambda does not use this
     *         value. Assign a meaningful description as you see fit.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadFunctionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @return The function execution time at which Lambda should terminate the
     *         function. Because the execution time has cost implications, we
     *         recommend you set this value based on your expected execution time.
     *         The default is 3 seconds.
     */
    public Integer getTimeout() {
        return timeout;
    }
    
    /**
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @param timeout The function execution time at which Lambda should terminate the
     *         function. Because the execution time has cost implications, we
     *         recommend you set this value based on your expected execution time.
     *         The default is 3 seconds.
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
    
    /**
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @param timeout The function execution time at which Lambda should terminate the
     *         function. Because the execution time has cost implications, we
     *         recommend you set this value based on your expected execution time.
     *         The default is 3 seconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadFunctionRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * The amount of memory, in MB, your Lambda function is given. Lambda
     * uses this memory size to infer the amount of CPU allocated to your
     * function. Your function use-case determines your CPU and memory
     * requirements. For example, database operation might need less memory
     * compared to image processing function. The default value is 128 MB.
     * The value must be a multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64 - 1024<br/>
     *
     * @return The amount of memory, in MB, your Lambda function is given. Lambda
     *         uses this memory size to infer the amount of CPU allocated to your
     *         function. Your function use-case determines your CPU and memory
     *         requirements. For example, database operation might need less memory
     *         compared to image processing function. The default value is 128 MB.
     *         The value must be a multiple of 64 MB.
     */
    public Integer getMemorySize() {
        return memorySize;
    }
    
    /**
     * The amount of memory, in MB, your Lambda function is given. Lambda
     * uses this memory size to infer the amount of CPU allocated to your
     * function. Your function use-case determines your CPU and memory
     * requirements. For example, database operation might need less memory
     * compared to image processing function. The default value is 128 MB.
     * The value must be a multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64 - 1024<br/>
     *
     * @param memorySize The amount of memory, in MB, your Lambda function is given. Lambda
     *         uses this memory size to infer the amount of CPU allocated to your
     *         function. Your function use-case determines your CPU and memory
     *         requirements. For example, database operation might need less memory
     *         compared to image processing function. The default value is 128 MB.
     *         The value must be a multiple of 64 MB.
     */
    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }
    
    /**
     * The amount of memory, in MB, your Lambda function is given. Lambda
     * uses this memory size to infer the amount of CPU allocated to your
     * function. Your function use-case determines your CPU and memory
     * requirements. For example, database operation might need less memory
     * compared to image processing function. The default value is 128 MB.
     * The value must be a multiple of 64 MB.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>64 - 1024<br/>
     *
     * @param memorySize The amount of memory, in MB, your Lambda function is given. Lambda
     *         uses this memory size to infer the amount of CPU allocated to your
     *         function. Your function use-case determines your CPU and memory
     *         requirements. For example, database operation might need less memory
     *         compared to image processing function. The default value is 128 MB.
     *         The value must be a multiple of 64 MB.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadFunctionRequest withMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
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
        if (getFunctionZip() != null) sb.append("FunctionZip: " + getFunctionZip() + ",");
        if (getRuntime() != null) sb.append("Runtime: " + getRuntime() + ",");
        if (getRole() != null) sb.append("Role: " + getRole() + ",");
        if (getHandler() != null) sb.append("Handler: " + getHandler() + ",");
        if (getMode() != null) sb.append("Mode: " + getMode() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getTimeout() != null) sb.append("Timeout: " + getTimeout() + ",");
        if (getMemorySize() != null) sb.append("MemorySize: " + getMemorySize() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getFunctionZip() == null) ? 0 : getFunctionZip().hashCode()); 
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode()); 
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode()); 
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode()); 
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadFunctionRequest == false) return false;
        UploadFunctionRequest other = (UploadFunctionRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getFunctionZip() == null ^ this.getFunctionZip() == null) return false;
        if (other.getFunctionZip() != null && other.getFunctionZip().equals(this.getFunctionZip()) == false) return false; 
        if (other.getRuntime() == null ^ this.getRuntime() == null) return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false) return false; 
        if (other.getRole() == null ^ this.getRole() == null) return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false) return false; 
        if (other.getHandler() == null ^ this.getHandler() == null) return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false) return false; 
        if (other.getMode() == null ^ this.getMode() == null) return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getTimeout() == null ^ this.getTimeout() == null) return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false) return false; 
        if (other.getMemorySize() == null ^ this.getMemorySize() == null) return false;
        if (other.getMemorySize() != null && other.getMemorySize().equals(this.getMemorySize()) == false) return false; 
        return true;
    }
    
}
    