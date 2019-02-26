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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFunctionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code>.
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
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The identifier of the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * </p>
     */
    private String runtime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function's execution role.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The name of the method within your code that Lambda calls to execute your function. The format includes the file
     * name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html">Programming Model</a>.
     * </p>
     */
    private String handler;
    /**
     * <p>
     * The code for the function.
     * </p>
     */
    private FunctionCode code;
    /**
     * <p>
     * A description of the function.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum
     * allowed value is 900 seconds.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU
     * allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     */
    private Integer memorySize;
    /**
     * <p>
     * Set to true to publish the first version of the function during creation.
     * </p>
     */
    private Boolean publish;
    /**
     * <p>
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more
     * information, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/vpc.html">VPC Settings</a>.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when
     * they fail processing. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>.
     * </p>
     */
    private DeadLetterConfig deadLetterConfig;
    /**
     * <p>
     * Environment variables that are accessible from function code during execution.
     * </p>
     */
    private Environment environment;
    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment
     * variables. If it's not provided, AWS Lambda uses a default service key.
     * </p>
     */
    private String kMSKeyArn;
    /**
     * <p>
     * Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS X-Ray.
     * </p>
     */
    private TracingConfig tracingConfig;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to apply to the function.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">function layers</a> to
     * add to the function's execution environment. Specify each layer by its ARN, including the version.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> layers;

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code>.
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
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>my-function</code>.
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
     *        The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *        to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code>.
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
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @return The name of the Lambda function.</p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> - <code>my-function</code>.
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
     *         The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *         to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code>.
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
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>my-function</code>.
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
     *        The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *        to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The identifier of the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * </p>
     * 
     * @param runtime
     *        The identifier of the function's <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * @see Runtime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The identifier of the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * </p>
     * 
     * @return The identifier of the function's <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * @see Runtime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The identifier of the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * </p>
     * 
     * @param runtime
     *        The identifier of the function's <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public CreateFunctionRequest withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The identifier of the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * </p>
     * 
     * @param runtime
     *        The identifier of the function's <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * @see Runtime
     */

    public void setRuntime(Runtime runtime) {
        withRuntime(runtime);
    }

    /**
     * <p>
     * The identifier of the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * </p>
     * 
     * @param runtime
     *        The identifier of the function's <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">runtime</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public CreateFunctionRequest withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function's execution role.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the function's execution role.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function's execution role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the function's execution role.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function's execution role.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the function's execution role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The name of the method within your code that Lambda calls to execute your function. The format includes the file
     * name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html">Programming Model</a>.
     * </p>
     * 
     * @param handler
     *        The name of the method within your code that Lambda calls to execute your function. The format includes
     *        the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html">Programming Model</a>.
     */

    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The name of the method within your code that Lambda calls to execute your function. The format includes the file
     * name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html">Programming Model</a>.
     * </p>
     * 
     * @return The name of the method within your code that Lambda calls to execute your function. The format includes
     *         the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html">Programming Model</a>.
     */

    public String getHandler() {
        return this.handler;
    }

    /**
     * <p>
     * The name of the method within your code that Lambda calls to execute your function. The format includes the file
     * name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html">Programming Model</a>.
     * </p>
     * 
     * @param handler
     *        The name of the method within your code that Lambda calls to execute your function. The format includes
     *        the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html">Programming Model</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withHandler(String handler) {
        setHandler(handler);
        return this;
    }

    /**
     * <p>
     * The code for the function.
     * </p>
     * 
     * @param code
     *        The code for the function.
     */

    public void setCode(FunctionCode code) {
        this.code = code;
    }

    /**
     * <p>
     * The code for the function.
     * </p>
     * 
     * @return The code for the function.
     */

    public FunctionCode getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code for the function.
     * </p>
     * 
     * @param code
     *        The code for the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withCode(FunctionCode code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A description of the function.
     * </p>
     * 
     * @param description
     *        A description of the function.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the function.
     * </p>
     * 
     * @return A description of the function.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the function.
     * </p>
     * 
     * @param description
     *        A description of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum
     * allowed value is 900 seconds.
     * </p>
     * 
     * @param timeout
     *        The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The
     *        maximum allowed value is 900 seconds.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum
     * allowed value is 900 seconds.
     * </p>
     * 
     * @return The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The
     *         maximum allowed value is 900 seconds.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum
     * allowed value is 900 seconds.
     * </p>
     * 
     * @param timeout
     *        The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The
     *        maximum allowed value is 900 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU
     * allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @param memorySize
     *        The amount of memory that your function has access to. Increasing the function's memory also increases its
     *        CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     */

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * <p>
     * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU
     * allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @return The amount of memory that your function has access to. Increasing the function's memory also increases
     *         its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     */

    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * <p>
     * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU
     * allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * </p>
     * 
     * @param memorySize
     *        The amount of memory that your function has access to. Increasing the function's memory also increases its
     *        CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withMemorySize(Integer memorySize) {
        setMemorySize(memorySize);
        return this;
    }

    /**
     * <p>
     * Set to true to publish the first version of the function during creation.
     * </p>
     * 
     * @param publish
     *        Set to true to publish the first version of the function during creation.
     */

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    /**
     * <p>
     * Set to true to publish the first version of the function during creation.
     * </p>
     * 
     * @return Set to true to publish the first version of the function during creation.
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     * <p>
     * Set to true to publish the first version of the function during creation.
     * </p>
     * 
     * @param publish
     *        Set to true to publish the first version of the function during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withPublish(Boolean publish) {
        setPublish(publish);
        return this;
    }

    /**
     * <p>
     * Set to true to publish the first version of the function during creation.
     * </p>
     * 
     * @return Set to true to publish the first version of the function during creation.
     */

    public Boolean isPublish() {
        return this.publish;
    }

    /**
     * <p>
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more
     * information, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/vpc.html">VPC Settings</a>.
     * </p>
     * 
     * @param vpcConfig
     *        For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the
     *        VPC. When you connect a function to a VPC, it can only access resources and the internet through that VPC.
     *        For more information, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/vpc.html">VPC
     *        Settings</a>.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more
     * information, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/vpc.html">VPC Settings</a>.
     * </p>
     * 
     * @return For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the
     *         VPC. When you connect a function to a VPC, it can only access resources and the internet through that
     *         VPC. For more information, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/vpc.html">VPC
     *         Settings</a>.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more
     * information, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/vpc.html">VPC Settings</a>.
     * </p>
     * 
     * @param vpcConfig
     *        For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the
     *        VPC. When you connect a function to a VPC, it can only access resources and the internet through that VPC.
     *        For more information, see <a href="https://docs.aws.amazon.com/lambda/latest/dg/vpc.html">VPC
     *        Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when
     * they fail processing. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>.
     * </p>
     * 
     * @param deadLetterConfig
     *        A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events
     *        when they fail processing. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>.
     */

    public void setDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    /**
     * <p>
     * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when
     * they fail processing. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>.
     * </p>
     * 
     * @return A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous
     *         events when they fail processing. For more information, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>.
     */

    public DeadLetterConfig getDeadLetterConfig() {
        return this.deadLetterConfig;
    }

    /**
     * <p>
     * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when
     * they fail processing. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>.
     * </p>
     * 
     * @param deadLetterConfig
     *        A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events
     *        when they fail processing. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        setDeadLetterConfig(deadLetterConfig);
        return this;
    }

    /**
     * <p>
     * Environment variables that are accessible from function code during execution.
     * </p>
     * 
     * @param environment
     *        Environment variables that are accessible from function code during execution.
     */

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Environment variables that are accessible from function code during execution.
     * </p>
     * 
     * @return Environment variables that are accessible from function code during execution.
     */

    public Environment getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * Environment variables that are accessible from function code during execution.
     * </p>
     * 
     * @param environment
     *        Environment variables that are accessible from function code during execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withEnvironment(Environment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment
     * variables. If it's not provided, AWS Lambda uses a default service key.
     * </p>
     * 
     * @param kMSKeyArn
     *        The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment
     *        variables. If it's not provided, AWS Lambda uses a default service key.
     */

    public void setKMSKeyArn(String kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
    }

    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment
     * variables. If it's not provided, AWS Lambda uses a default service key.
     * </p>
     * 
     * @return The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's
     *         environment variables. If it's not provided, AWS Lambda uses a default service key.
     */

    public String getKMSKeyArn() {
        return this.kMSKeyArn;
    }

    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment
     * variables. If it's not provided, AWS Lambda uses a default service key.
     * </p>
     * 
     * @param kMSKeyArn
     *        The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment
     *        variables. If it's not provided, AWS Lambda uses a default service key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withKMSKeyArn(String kMSKeyArn) {
        setKMSKeyArn(kMSKeyArn);
        return this;
    }

    /**
     * <p>
     * Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS X-Ray.
     * </p>
     * 
     * @param tracingConfig
     *        Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS
     *        X-Ray.
     */

    public void setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
    }

    /**
     * <p>
     * Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS X-Ray.
     * </p>
     * 
     * @return Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS
     *         X-Ray.
     */

    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    /**
     * <p>
     * Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS X-Ray.
     * </p>
     * 
     * @param tracingConfig
     *        Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS
     *        X-Ray.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withTracingConfig(TracingConfig tracingConfig) {
        setTracingConfig(tracingConfig);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to apply to the function.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to apply to the
     *         function.
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to apply to the function.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to apply to the
     *        function.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to apply to the function.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a> to apply to the
     *        function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateFunctionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">function layers</a> to
     * add to the function's execution environment. Specify each layer by its ARN, including the version.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">function
     *         layers</a> to add to the function's execution environment. Specify each layer by its ARN, including the
     *         version.
     */

    public java.util.List<String> getLayers() {
        if (layers == null) {
            layers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return layers;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">function layers</a> to
     * add to the function's execution environment. Specify each layer by its ARN, including the version.
     * </p>
     * 
     * @param layers
     *        A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">function
     *        layers</a> to add to the function's execution environment. Specify each layer by its ARN, including the
     *        version.
     */

    public void setLayers(java.util.Collection<String> layers) {
        if (layers == null) {
            this.layers = null;
            return;
        }

        this.layers = new com.amazonaws.internal.SdkInternalList<String>(layers);
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">function layers</a> to
     * add to the function's execution environment. Specify each layer by its ARN, including the version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayers(java.util.Collection)} or {@link #withLayers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param layers
     *        A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">function
     *        layers</a> to add to the function's execution environment. Specify each layer by its ARN, including the
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withLayers(String... layers) {
        if (this.layers == null) {
            setLayers(new com.amazonaws.internal.SdkInternalList<String>(layers.length));
        }
        for (String ele : layers) {
            this.layers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">function layers</a> to
     * add to the function's execution environment. Specify each layer by its ARN, including the version.
     * </p>
     * 
     * @param layers
     *        A list of <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">function
     *        layers</a> to add to the function's execution environment. Specify each layer by its ARN, including the
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withLayers(java.util.Collection<String> layers) {
        setLayers(layers);
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
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getHandler() != null)
            sb.append("Handler: ").append(getHandler()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getMemorySize() != null)
            sb.append("MemorySize: ").append(getMemorySize()).append(",");
        if (getPublish() != null)
            sb.append("Publish: ").append(getPublish()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getDeadLetterConfig() != null)
            sb.append("DeadLetterConfig: ").append(getDeadLetterConfig()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getKMSKeyArn() != null)
            sb.append("KMSKeyArn: ").append(getKMSKeyArn()).append(",");
        if (getTracingConfig() != null)
            sb.append("TracingConfig: ").append(getTracingConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLayers() != null)
            sb.append("Layers: ").append(getLayers());
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
        if (other.getDeadLetterConfig() == null ^ this.getDeadLetterConfig() == null)
            return false;
        if (other.getDeadLetterConfig() != null && other.getDeadLetterConfig().equals(this.getDeadLetterConfig()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getKMSKeyArn() == null ^ this.getKMSKeyArn() == null)
            return false;
        if (other.getKMSKeyArn() != null && other.getKMSKeyArn().equals(this.getKMSKeyArn()) == false)
            return false;
        if (other.getTracingConfig() == null ^ this.getTracingConfig() == null)
            return false;
        if (other.getTracingConfig() != null && other.getTracingConfig().equals(this.getTracingConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLayers() == null ^ this.getLayers() == null)
            return false;
        if (other.getLayers() != null && other.getLayers().equals(this.getLayers()) == false)
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
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyArn() == null) ? 0 : getKMSKeyArn().hashCode());
        hashCode = prime * hashCode + ((getTracingConfig() == null) ? 0 : getTracingConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLayers() == null) ? 0 : getLayers().hashCode());
        return hashCode;
    }

    @Override
    public CreateFunctionRequest clone() {
        return (CreateFunctionRequest) super.clone();
    }

}
