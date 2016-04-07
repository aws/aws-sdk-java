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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#updateFunctionConfiguration(UpdateFunctionConfigurationRequest) UpdateFunctionConfiguration operation}.
 * <p>
 * Updates the configuration parameters for the specified Lambda function
 * by using the values provided in the request. You provide only the
 * parameters you want to change. This operation must only be used on an
 * existing Lambda function and cannot be used to update the function's
 * code.
 * </p>
 * <p>
 * If you are using the versioning feature, note this API will always
 * update the $LATEST version of your Lambda function. For information
 * about the versioning feature, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
 * .
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:UpdateFunctionConfiguration</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#updateFunctionConfiguration(UpdateFunctionConfigurationRequest)
 */
public class UpdateFunctionConfigurationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the Lambda function. <p> You can specify a function name
     * (for example, <code>Thumbnail</code>) or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
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
     * The Amazon Resource Name (ARN) of the IAM role that Lambda will assume
     * when it executes your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     */
    private String role;

    /**
     * The function that Lambda calls to begin executing your function. For
     * Node.js, it is the <code>module-name.export</code> value in your
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     */
    private String handler;

    /**
     * A short user-defined function description. AWS Lambda does not use
     * this value. Assign a meaningful description as you see fit.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String description;

    /**
     * The function execution time at which AWS Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer timeout;

    /**
     * The amount of memory, in MB, your Lambda function is given. AWS Lambda
     * uses this memory size to infer the amount of CPU allocated to your
     * function. Your function use-case determines your CPU and memory
     * requirements. For example, a database operation might need less memory
     * compared to an image processing function. The default value is 128 MB.
     * The value must be a multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     */
    private Integer memorySize;

    /**
     * If your Lambda function accesses resources in a VPC, you provide this
     * parameter identifying the list of security group IDs and subnet IDs.
     * These must belong to the same VPC. You must provide at least one
     * security group and one subnet ID.
     */
    private VpcConfig vpcConfig;

    private String runtime;

    /**
     * The name of the Lambda function. <p> You can specify a function name
     * (for example, <code>Thumbnail</code>) or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
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
     * @return The name of the Lambda function. <p> You can specify a function name
     *         (for example, <code>Thumbnail</code>) or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
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
     * The name of the Lambda function. <p> You can specify a function name
     * (for example, <code>Thumbnail</code>) or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
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
     * @param functionName The name of the Lambda function. <p> You can specify a function name
     *         (for example, <code>Thumbnail</code>) or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
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
     * The name of the Lambda function. <p> You can specify a function name
     * (for example, <code>Thumbnail</code>) or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
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
     * @param functionName The name of the Lambda function. <p> You can specify a function name
     *         (for example, <code>Thumbnail</code>) or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionConfigurationRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda will assume
     * when it executes your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @return The Amazon Resource Name (ARN) of the IAM role that Lambda will assume
     *         when it executes your function.
     */
    public String getRole() {
        return role;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda will assume
     * when it executes your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param role The Amazon Resource Name (ARN) of the IAM role that Lambda will assume
     *         when it executes your function.
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda will assume
     * when it executes your function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param role The Amazon Resource Name (ARN) of the IAM role that Lambda will assume
     *         when it executes your function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionConfigurationRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * The function that Lambda calls to begin executing your function. For
     * Node.js, it is the <code>module-name.export</code> value in your
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     *
     * @return The function that Lambda calls to begin executing your function. For
     *         Node.js, it is the <code>module-name.export</code> value in your
     *         function.
     */
    public String getHandler() {
        return handler;
    }
    
    /**
     * The function that Lambda calls to begin executing your function. For
     * Node.js, it is the <code>module-name.export</code> value in your
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     *
     * @param handler The function that Lambda calls to begin executing your function. For
     *         Node.js, it is the <code>module-name.export</code> value in your
     *         function.
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }
    
    /**
     * The function that Lambda calls to begin executing your function. For
     * Node.js, it is the <code>module-name.export</code> value in your
     * function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     *
     * @param handler The function that Lambda calls to begin executing your function. For
     *         Node.js, it is the <code>module-name.export</code> value in your
     *         function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionConfigurationRequest withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * A short user-defined function description. AWS Lambda does not use
     * this value. Assign a meaningful description as you see fit.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return A short user-defined function description. AWS Lambda does not use
     *         this value. Assign a meaningful description as you see fit.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A short user-defined function description. AWS Lambda does not use
     * this value. Assign a meaningful description as you see fit.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description A short user-defined function description. AWS Lambda does not use
     *         this value. Assign a meaningful description as you see fit.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A short user-defined function description. AWS Lambda does not use
     * this value. Assign a meaningful description as you see fit.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description A short user-defined function description. AWS Lambda does not use
     *         this value. Assign a meaningful description as you see fit.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionConfigurationRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The function execution time at which AWS Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The function execution time at which AWS Lambda should terminate the
     *         function. Because the execution time has cost implications, we
     *         recommend you set this value based on your expected execution time.
     *         The default is 3 seconds.
     */
    public Integer getTimeout() {
        return timeout;
    }
    
    /**
     * The function execution time at which AWS Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout The function execution time at which AWS Lambda should terminate the
     *         function. Because the execution time has cost implications, we
     *         recommend you set this value based on your expected execution time.
     *         The default is 3 seconds.
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
    
    /**
     * The function execution time at which AWS Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout The function execution time at which AWS Lambda should terminate the
     *         function. Because the execution time has cost implications, we
     *         recommend you set this value based on your expected execution time.
     *         The default is 3 seconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionConfigurationRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * The amount of memory, in MB, your Lambda function is given. AWS Lambda
     * uses this memory size to infer the amount of CPU allocated to your
     * function. Your function use-case determines your CPU and memory
     * requirements. For example, a database operation might need less memory
     * compared to an image processing function. The default value is 128 MB.
     * The value must be a multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     *
     * @return The amount of memory, in MB, your Lambda function is given. AWS Lambda
     *         uses this memory size to infer the amount of CPU allocated to your
     *         function. Your function use-case determines your CPU and memory
     *         requirements. For example, a database operation might need less memory
     *         compared to an image processing function. The default value is 128 MB.
     *         The value must be a multiple of 64 MB.
     */
    public Integer getMemorySize() {
        return memorySize;
    }
    
    /**
     * The amount of memory, in MB, your Lambda function is given. AWS Lambda
     * uses this memory size to infer the amount of CPU allocated to your
     * function. Your function use-case determines your CPU and memory
     * requirements. For example, a database operation might need less memory
     * compared to an image processing function. The default value is 128 MB.
     * The value must be a multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     *
     * @param memorySize The amount of memory, in MB, your Lambda function is given. AWS Lambda
     *         uses this memory size to infer the amount of CPU allocated to your
     *         function. Your function use-case determines your CPU and memory
     *         requirements. For example, a database operation might need less memory
     *         compared to an image processing function. The default value is 128 MB.
     *         The value must be a multiple of 64 MB.
     */
    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }
    
    /**
     * The amount of memory, in MB, your Lambda function is given. AWS Lambda
     * uses this memory size to infer the amount of CPU allocated to your
     * function. Your function use-case determines your CPU and memory
     * requirements. For example, a database operation might need less memory
     * compared to an image processing function. The default value is 128 MB.
     * The value must be a multiple of 64 MB.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     *
     * @param memorySize The amount of memory, in MB, your Lambda function is given. AWS Lambda
     *         uses this memory size to infer the amount of CPU allocated to your
     *         function. Your function use-case determines your CPU and memory
     *         requirements. For example, a database operation might need less memory
     *         compared to an image processing function. The default value is 128 MB.
     *         The value must be a multiple of 64 MB.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionConfigurationRequest withMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * If your Lambda function accesses resources in a VPC, you provide this
     * parameter identifying the list of security group IDs and subnet IDs.
     * These must belong to the same VPC. You must provide at least one
     * security group and one subnet ID.
     *
     * @return If your Lambda function accesses resources in a VPC, you provide this
     *         parameter identifying the list of security group IDs and subnet IDs.
     *         These must belong to the same VPC. You must provide at least one
     *         security group and one subnet ID.
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }
    
    /**
     * If your Lambda function accesses resources in a VPC, you provide this
     * parameter identifying the list of security group IDs and subnet IDs.
     * These must belong to the same VPC. You must provide at least one
     * security group and one subnet ID.
     *
     * @param vpcConfig If your Lambda function accesses resources in a VPC, you provide this
     *         parameter identifying the list of security group IDs and subnet IDs.
     *         These must belong to the same VPC. You must provide at least one
     *         security group and one subnet ID.
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }
    
    /**
     * If your Lambda function accesses resources in a VPC, you provide this
     * parameter identifying the list of security group IDs and subnet IDs.
     * These must belong to the same VPC. You must provide at least one
     * security group and one subnet ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcConfig If your Lambda function accesses resources in a VPC, you provide this
     *         parameter identifying the list of security group IDs and subnet IDs.
     *         These must belong to the same VPC. You must provide at least one
     *         security group and one subnet ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionConfigurationRequest withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * Returns the value of the Runtime property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     *
     * @return The value of the Runtime property for this object.
     *
     * @see Runtime
     */
    public String getRuntime() {
        return runtime;
    }
    
    /**
     * Sets the value of the Runtime property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     *
     * @param runtime The new value for the Runtime property for this object.
     *
     * @see Runtime
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
    
    /**
     * Sets the value of the Runtime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     *
     * @param runtime The new value for the Runtime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Runtime
     */
    public UpdateFunctionConfigurationRequest withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * Sets the value of the Runtime property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     *
     * @param runtime The new value for the Runtime property for this object.
     *
     * @see Runtime
     */
    public void setRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
    }
    
    /**
     * Sets the value of the Runtime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     *
     * @param runtime The new value for the Runtime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Runtime
     */
    public UpdateFunctionConfigurationRequest withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
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
        if (getRole() != null) sb.append("Role: " + getRole() + ",");
        if (getHandler() != null) sb.append("Handler: " + getHandler() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getTimeout() != null) sb.append("Timeout: " + getTimeout() + ",");
        if (getMemorySize() != null) sb.append("MemorySize: " + getMemorySize() + ",");
        if (getVpcConfig() != null) sb.append("VpcConfig: " + getVpcConfig() + ",");
        if (getRuntime() != null) sb.append("Runtime: " + getRuntime() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateFunctionConfigurationRequest == false) return false;
        UpdateFunctionConfigurationRequest other = (UpdateFunctionConfigurationRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
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
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null) return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false) return false; 
        if (other.getRuntime() == null ^ this.getRuntime() == null) return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateFunctionConfigurationRequest clone() {
        
            return (UpdateFunctionConfigurationRequest) super.clone();
    }

}
    