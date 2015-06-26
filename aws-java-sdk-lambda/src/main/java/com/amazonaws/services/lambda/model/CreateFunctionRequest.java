/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#createFunction(CreateFunctionRequest) CreateFunction operation}.
 * <p>
 * Creates a new Lambda function. The function metadata is created from
 * the request parameters, and the code for the function is provided by a
 * .zip file in the request body. If the function name already exists,
 * the operation will fail. Note that the function name is
 * case-sensitive.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:CreateFunction</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#createFunction(CreateFunctionRequest)
 */
public class CreateFunctionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name you want to assign to the function you are uploading. You can
     * specify an unqualified function name (for example, "Thumbnail") or you
     * can specify Amazon Resource Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to
     * specify functions to other AWS Lambda APIs, such as <a>Invoke</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     */
    private String functionName;

    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports "java" and "nodejs" as the runtime.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, java8
     */
    private String runtime;

    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS
     * Lambda: How it Works</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     */
    private String role;

    /**
     * The function within your code that Lambda calls to begin execution.
     * For Node.js, it is the <i>module-name</i>.<i>export</i> value in your
     * function. For Java, it can be <code>package.class-name::handler</code>
     * or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     * Function Handler (Java)</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     */
    private String handler;

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
     * uses this memory size to infer the amount of CPU and memory allocated
     * to your function. Your function use-case determines your CPU and
     * memory requirements. For example, a database operation might need less
     * memory compared to an image processing function. The default value is
     * 128 MB. The value must be a multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     */
    private Integer memorySize;

    /**
     * The code for the Lambda function.
     */
    private FunctionCode code;

    /**
     * The name you want to assign to the function you are uploading. You can
     * specify an unqualified function name (for example, "Thumbnail") or you
     * can specify Amazon Resource Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to
     * specify functions to other AWS Lambda APIs, such as <a>Invoke</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @return The name you want to assign to the function you are uploading. You can
     *         specify an unqualified function name (for example, "Thumbnail") or you
     *         can specify Amazon Resource Name (ARN) of the function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length. The function names appear in the console and are
     *         returned in the <a>ListFunctions</a> API. Function names are used to
     *         specify functions to other AWS Lambda APIs, such as <a>Invoke</a>.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The name you want to assign to the function you are uploading. You can
     * specify an unqualified function name (for example, "Thumbnail") or you
     * can specify Amazon Resource Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to
     * specify functions to other AWS Lambda APIs, such as <a>Invoke</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @param functionName The name you want to assign to the function you are uploading. You can
     *         specify an unqualified function name (for example, "Thumbnail") or you
     *         can specify Amazon Resource Name (ARN) of the function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length. The function names appear in the console and are
     *         returned in the <a>ListFunctions</a> API. Function names are used to
     *         specify functions to other AWS Lambda APIs, such as <a>Invoke</a>.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The name you want to assign to the function you are uploading. You can
     * specify an unqualified function name (for example, "Thumbnail") or you
     * can specify Amazon Resource Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length. The function names appear in the console and are
     * returned in the <a>ListFunctions</a> API. Function names are used to
     * specify functions to other AWS Lambda APIs, such as <a>Invoke</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @param functionName The name you want to assign to the function you are uploading. You can
     *         specify an unqualified function name (for example, "Thumbnail") or you
     *         can specify Amazon Resource Name (ARN) of the function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length. The function names appear in the console and are
     *         returned in the <a>ListFunctions</a> API. Function names are used to
     *         specify functions to other AWS Lambda APIs, such as <a>Invoke</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFunctionRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports "java" and "nodejs" as the runtime.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, java8
     *
     * @return The runtime environment for the Lambda function you are uploading.
     *         Currently, Lambda supports "java" and "nodejs" as the runtime.
     *
     * @see Runtime
     */
    public String getRuntime() {
        return runtime;
    }
    
    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports "java" and "nodejs" as the runtime.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, java8
     *
     * @param runtime The runtime environment for the Lambda function you are uploading.
     *         Currently, Lambda supports "java" and "nodejs" as the runtime.
     *
     * @see Runtime
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
    
    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports "java" and "nodejs" as the runtime.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, java8
     *
     * @param runtime The runtime environment for the Lambda function you are uploading.
     *         Currently, Lambda supports "java" and "nodejs" as the runtime.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Runtime
     */
    public CreateFunctionRequest withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports "java" and "nodejs" as the runtime.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, java8
     *
     * @param runtime The runtime environment for the Lambda function you are uploading.
     *         Currently, Lambda supports "java" and "nodejs" as the runtime.
     *
     * @see Runtime
     */
    public void setRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
    }
    
    /**
     * The runtime environment for the Lambda function you are uploading.
     * Currently, Lambda supports "java" and "nodejs" as the runtime.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, java8
     *
     * @param runtime The runtime environment for the Lambda function you are uploading.
     *         Currently, Lambda supports "java" and "nodejs" as the runtime.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Runtime
     */
    public CreateFunctionRequest withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS
     * Lambda: How it Works</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @return The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *         when it executes your function to access any other Amazon Web Services
     *         (AWS) resources. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS
     *         Lambda: How it Works</a>
     */
    public String getRole() {
        return role;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS
     * Lambda: How it Works</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param role The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *         when it executes your function to access any other Amazon Web Services
     *         (AWS) resources. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS
     *         Lambda: How it Works</a>
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS
     * Lambda: How it Works</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param role The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *         when it executes your function to access any other Amazon Web Services
     *         (AWS) resources. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS
     *         Lambda: How it Works</a>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFunctionRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * The function within your code that Lambda calls to begin execution.
     * For Node.js, it is the <i>module-name</i>.<i>export</i> value in your
     * function. For Java, it can be <code>package.class-name::handler</code>
     * or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     * Function Handler (Java)</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     *
     * @return The function within your code that Lambda calls to begin execution.
     *         For Node.js, it is the <i>module-name</i>.<i>export</i> value in your
     *         function. For Java, it can be <code>package.class-name::handler</code>
     *         or <code>package.class-name</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     *         Function Handler (Java)</a>.
     */
    public String getHandler() {
        return handler;
    }
    
    /**
     * The function within your code that Lambda calls to begin execution.
     * For Node.js, it is the <i>module-name</i>.<i>export</i> value in your
     * function. For Java, it can be <code>package.class-name::handler</code>
     * or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     * Function Handler (Java)</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     *
     * @param handler The function within your code that Lambda calls to begin execution.
     *         For Node.js, it is the <i>module-name</i>.<i>export</i> value in your
     *         function. For Java, it can be <code>package.class-name::handler</code>
     *         or <code>package.class-name</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     *         Function Handler (Java)</a>.
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }
    
    /**
     * The function within your code that Lambda calls to begin execution.
     * For Node.js, it is the <i>module-name</i>.<i>export</i> value in your
     * function. For Java, it can be <code>package.class-name::handler</code>
     * or <code>package.class-name</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     * Function Handler (Java)</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     *
     * @param handler The function within your code that Lambda calls to begin execution.
     *         For Node.js, it is the <i>module-name</i>.<i>export</i> value in your
     *         function. For Java, it can be <code>package.class-name::handler</code>
     *         or <code>package.class-name</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-handler-types.html">Lambda
     *         Function Handler (Java)</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFunctionRequest withHandler(String handler) {
        this.handler = handler;
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
    public CreateFunctionRequest withDescription(String description) {
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
    public CreateFunctionRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * The amount of memory, in MB, your Lambda function is given. Lambda
     * uses this memory size to infer the amount of CPU and memory allocated
     * to your function. Your function use-case determines your CPU and
     * memory requirements. For example, a database operation might need less
     * memory compared to an image processing function. The default value is
     * 128 MB. The value must be a multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     *
     * @return The amount of memory, in MB, your Lambda function is given. Lambda
     *         uses this memory size to infer the amount of CPU and memory allocated
     *         to your function. Your function use-case determines your CPU and
     *         memory requirements. For example, a database operation might need less
     *         memory compared to an image processing function. The default value is
     *         128 MB. The value must be a multiple of 64 MB.
     */
    public Integer getMemorySize() {
        return memorySize;
    }
    
    /**
     * The amount of memory, in MB, your Lambda function is given. Lambda
     * uses this memory size to infer the amount of CPU and memory allocated
     * to your function. Your function use-case determines your CPU and
     * memory requirements. For example, a database operation might need less
     * memory compared to an image processing function. The default value is
     * 128 MB. The value must be a multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     *
     * @param memorySize The amount of memory, in MB, your Lambda function is given. Lambda
     *         uses this memory size to infer the amount of CPU and memory allocated
     *         to your function. Your function use-case determines your CPU and
     *         memory requirements. For example, a database operation might need less
     *         memory compared to an image processing function. The default value is
     *         128 MB. The value must be a multiple of 64 MB.
     */
    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }
    
    /**
     * The amount of memory, in MB, your Lambda function is given. Lambda
     * uses this memory size to infer the amount of CPU and memory allocated
     * to your function. Your function use-case determines your CPU and
     * memory requirements. For example, a database operation might need less
     * memory compared to an image processing function. The default value is
     * 128 MB. The value must be a multiple of 64 MB.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     *
     * @param memorySize The amount of memory, in MB, your Lambda function is given. Lambda
     *         uses this memory size to infer the amount of CPU and memory allocated
     *         to your function. Your function use-case determines your CPU and
     *         memory requirements. For example, a database operation might need less
     *         memory compared to an image processing function. The default value is
     *         128 MB. The value must be a multiple of 64 MB.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFunctionRequest withMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * The code for the Lambda function.
     *
     * @return The code for the Lambda function.
     */
    public FunctionCode getCode() {
        return code;
    }
    
    /**
     * The code for the Lambda function.
     *
     * @param code The code for the Lambda function.
     */
    public void setCode(FunctionCode code) {
        this.code = code;
    }
    
    /**
     * The code for the Lambda function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code The code for the Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFunctionRequest withCode(FunctionCode code) {
        this.code = code;
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
        if (getRuntime() != null) sb.append("Runtime: " + getRuntime() + ",");
        if (getRole() != null) sb.append("Role: " + getRole() + ",");
        if (getHandler() != null) sb.append("Handler: " + getHandler() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getTimeout() != null) sb.append("Timeout: " + getTimeout() + ",");
        if (getMemorySize() != null) sb.append("MemorySize: " + getMemorySize() + ",");
        if (getCode() != null) sb.append("Code: " + getCode() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode()); 
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode()); 
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode()); 
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateFunctionRequest == false) return false;
        CreateFunctionRequest other = (CreateFunctionRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getRuntime() == null ^ this.getRuntime() == null) return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false) return false; 
        if (other.getRole() == null ^ this.getRole() == null) return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false) return false; 
        if (other.getHandler() == null ^ this.getHandler() == null) return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getTimeout() == null ^ this.getTimeout() == null) return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false) return false; 
        if (other.getMemorySize() == null ^ this.getMemorySize() == null) return false;
        if (other.getMemorySize() != null && other.getMemorySize().equals(this.getMemorySize()) == false) return false; 
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateFunctionRequest clone() {
        
            return (CreateFunctionRequest) super.clone();
    }

}
    