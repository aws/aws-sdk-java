/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Details about a function's configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionCode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFunctionCodeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the function.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The function's Amazon Resource Name (ARN).
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     */
    private String runtime;
    /**
     * <p>
     * The function's execution role.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The function that Lambda calls to begin executing your function.
     * </p>
     */
    private String handler;
    /**
     * <p>
     * The size of the function's deployment package, in bytes.
     * </p>
     */
    private Long codeSize;
    /**
     * <p>
     * The function's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping it.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The memory that's allocated to the function.
     * </p>
     */
    private Integer memorySize;
    /**
     * <p>
     * The date and time that the function was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601
     * format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     */
    private String lastModified;
    /**
     * <p>
     * The SHA256 hash of the function's deployment package.
     * </p>
     */
    private String codeSha256;
    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The function's networking configuration.
     * </p>
     */
    private VpcConfigResponse vpcConfig;
    /**
     * <p>
     * The function's dead letter queue.
     * </p>
     */
    private DeadLetterConfig deadLetterConfig;
    /**
     * <p>
     * The function's environment variables.
     * </p>
     */
    private EnvironmentResponse environment;
    /**
     * <p>
     * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've
     * configured a customer managed CMK.
     * </p>
     */
    private String kMSKeyArn;
    /**
     * <p>
     * The function's AWS X-Ray tracing configuration.
     * </p>
     */
    private TracingConfigResponse tracingConfig;
    /**
     * <p>
     * For Lambda@Edge functions, the ARN of the master function.
     * </p>
     */
    private String masterArn;
    /**
     * <p>
     * The latest updated revision of the function or alias.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Layer> layers;
    /**
     * <p>
     * The current state of the function. When the state is <code>Inactive</code>, you can reactivate the function by
     * invoking it.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason for the function's current state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The reason code for the function's current state. When the code is <code>Creating</code>, you can't invoke or
     * modify the function.
     * </p>
     */
    private String stateReasonCode;
    /**
     * <p>
     * The status of the last update that was performed on the function. This is first set to <code>Successful</code>
     * after function creation completes.
     * </p>
     */
    private String lastUpdateStatus;
    /**
     * <p>
     * The reason for the last update that was performed on the function.
     * </p>
     */
    private String lastUpdateStatusReason;
    /**
     * <p>
     * The reason code for the last update that was performed on the function.
     * </p>
     */
    private String lastUpdateStatusReasonCode;

    /**
     * <p>
     * The name of the function.
     * </p>
     * 
     * @param functionName
     *        The name of the function.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * 
     * @return The name of the function.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * 
     * @param functionName
     *        The name of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The function's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param functionArn
     *        The function's Amazon Resource Name (ARN).
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The function's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The function's Amazon Resource Name (ARN).
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The function's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param functionArn
     *        The function's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.
     * @see Runtime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * 
     * @return The runtime environment for the Lambda function.
     * @see Runtime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public UpdateFunctionCodeResult withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.
     * @see Runtime
     */

    public void setRuntime(Runtime runtime) {
        withRuntime(runtime);
    }

    /**
     * <p>
     * The runtime environment for the Lambda function.
     * </p>
     * 
     * @param runtime
     *        The runtime environment for the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public UpdateFunctionCodeResult withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * <p>
     * The function's execution role.
     * </p>
     * 
     * @param role
     *        The function's execution role.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The function's execution role.
     * </p>
     * 
     * @return The function's execution role.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The function's execution role.
     * </p>
     * 
     * @param role
     *        The function's execution role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The function that Lambda calls to begin executing your function.
     * </p>
     * 
     * @param handler
     *        The function that Lambda calls to begin executing your function.
     */

    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The function that Lambda calls to begin executing your function.
     * </p>
     * 
     * @return The function that Lambda calls to begin executing your function.
     */

    public String getHandler() {
        return this.handler;
    }

    /**
     * <p>
     * The function that Lambda calls to begin executing your function.
     * </p>
     * 
     * @param handler
     *        The function that Lambda calls to begin executing your function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withHandler(String handler) {
        setHandler(handler);
        return this;
    }

    /**
     * <p>
     * The size of the function's deployment package, in bytes.
     * </p>
     * 
     * @param codeSize
     *        The size of the function's deployment package, in bytes.
     */

    public void setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
    }

    /**
     * <p>
     * The size of the function's deployment package, in bytes.
     * </p>
     * 
     * @return The size of the function's deployment package, in bytes.
     */

    public Long getCodeSize() {
        return this.codeSize;
    }

    /**
     * <p>
     * The size of the function's deployment package, in bytes.
     * </p>
     * 
     * @param codeSize
     *        The size of the function's deployment package, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withCodeSize(Long codeSize) {
        setCodeSize(codeSize);
        return this;
    }

    /**
     * <p>
     * The function's description.
     * </p>
     * 
     * @param description
     *        The function's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The function's description.
     * </p>
     * 
     * @return The function's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The function's description.
     * </p>
     * 
     * @param description
     *        The function's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping it.
     * </p>
     * 
     * @param timeout
     *        The amount of time that Lambda allows a function to run before stopping it.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping it.
     * </p>
     * 
     * @return The amount of time that Lambda allows a function to run before stopping it.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The amount of time that Lambda allows a function to run before stopping it.
     * </p>
     * 
     * @param timeout
     *        The amount of time that Lambda allows a function to run before stopping it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The memory that's allocated to the function.
     * </p>
     * 
     * @param memorySize
     *        The memory that's allocated to the function.
     */

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * <p>
     * The memory that's allocated to the function.
     * </p>
     * 
     * @return The memory that's allocated to the function.
     */

    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * <p>
     * The memory that's allocated to the function.
     * </p>
     * 
     * @param memorySize
     *        The memory that's allocated to the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withMemorySize(Integer memorySize) {
        setMemorySize(memorySize);
        return this;
    }

    /**
     * <p>
     * The date and time that the function was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601
     * format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param lastModified
     *        The date and time that the function was last updated, in <a
     *        href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that the function was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601
     * format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @return The date and time that the function was last updated, in <a
     *         href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time that the function was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601
     * format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param lastModified
     *        The date and time that the function was last updated, in <a
     *        href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a> (YYYY-MM-DDThh:mm:ss.sTZD).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withLastModified(String lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The SHA256 hash of the function's deployment package.
     * </p>
     * 
     * @param codeSha256
     *        The SHA256 hash of the function's deployment package.
     */

    public void setCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
    }

    /**
     * <p>
     * The SHA256 hash of the function's deployment package.
     * </p>
     * 
     * @return The SHA256 hash of the function's deployment package.
     */

    public String getCodeSha256() {
        return this.codeSha256;
    }

    /**
     * <p>
     * The SHA256 hash of the function's deployment package.
     * </p>
     * 
     * @param codeSha256
     *        The SHA256 hash of the function's deployment package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withCodeSha256(String codeSha256) {
        setCodeSha256(codeSha256);
        return this;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * 
     * @param version
     *        The version of the Lambda function.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * 
     * @return The version of the Lambda function.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the Lambda function.
     * </p>
     * 
     * @param version
     *        The version of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The function's networking configuration.
     * </p>
     * 
     * @param vpcConfig
     *        The function's networking configuration.
     */

    public void setVpcConfig(VpcConfigResponse vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The function's networking configuration.
     * </p>
     * 
     * @return The function's networking configuration.
     */

    public VpcConfigResponse getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The function's networking configuration.
     * </p>
     * 
     * @param vpcConfig
     *        The function's networking configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withVpcConfig(VpcConfigResponse vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The function's dead letter queue.
     * </p>
     * 
     * @param deadLetterConfig
     *        The function's dead letter queue.
     */

    public void setDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    /**
     * <p>
     * The function's dead letter queue.
     * </p>
     * 
     * @return The function's dead letter queue.
     */

    public DeadLetterConfig getDeadLetterConfig() {
        return this.deadLetterConfig;
    }

    /**
     * <p>
     * The function's dead letter queue.
     * </p>
     * 
     * @param deadLetterConfig
     *        The function's dead letter queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        setDeadLetterConfig(deadLetterConfig);
        return this;
    }

    /**
     * <p>
     * The function's environment variables.
     * </p>
     * 
     * @param environment
     *        The function's environment variables.
     */

    public void setEnvironment(EnvironmentResponse environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The function's environment variables.
     * </p>
     * 
     * @return The function's environment variables.
     */

    public EnvironmentResponse getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * The function's environment variables.
     * </p>
     * 
     * @param environment
     *        The function's environment variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withEnvironment(EnvironmentResponse environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've
     * configured a customer managed CMK.
     * </p>
     * 
     * @param kMSKeyArn
     *        The KMS key that's used to encrypt the function's environment variables. This key is only returned if
     *        you've configured a customer managed CMK.
     */

    public void setKMSKeyArn(String kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
    }

    /**
     * <p>
     * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've
     * configured a customer managed CMK.
     * </p>
     * 
     * @return The KMS key that's used to encrypt the function's environment variables. This key is only returned if
     *         you've configured a customer managed CMK.
     */

    public String getKMSKeyArn() {
        return this.kMSKeyArn;
    }

    /**
     * <p>
     * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've
     * configured a customer managed CMK.
     * </p>
     * 
     * @param kMSKeyArn
     *        The KMS key that's used to encrypt the function's environment variables. This key is only returned if
     *        you've configured a customer managed CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withKMSKeyArn(String kMSKeyArn) {
        setKMSKeyArn(kMSKeyArn);
        return this;
    }

    /**
     * <p>
     * The function's AWS X-Ray tracing configuration.
     * </p>
     * 
     * @param tracingConfig
     *        The function's AWS X-Ray tracing configuration.
     */

    public void setTracingConfig(TracingConfigResponse tracingConfig) {
        this.tracingConfig = tracingConfig;
    }

    /**
     * <p>
     * The function's AWS X-Ray tracing configuration.
     * </p>
     * 
     * @return The function's AWS X-Ray tracing configuration.
     */

    public TracingConfigResponse getTracingConfig() {
        return this.tracingConfig;
    }

    /**
     * <p>
     * The function's AWS X-Ray tracing configuration.
     * </p>
     * 
     * @param tracingConfig
     *        The function's AWS X-Ray tracing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withTracingConfig(TracingConfigResponse tracingConfig) {
        setTracingConfig(tracingConfig);
        return this;
    }

    /**
     * <p>
     * For Lambda@Edge functions, the ARN of the master function.
     * </p>
     * 
     * @param masterArn
     *        For Lambda@Edge functions, the ARN of the master function.
     */

    public void setMasterArn(String masterArn) {
        this.masterArn = masterArn;
    }

    /**
     * <p>
     * For Lambda@Edge functions, the ARN of the master function.
     * </p>
     * 
     * @return For Lambda@Edge functions, the ARN of the master function.
     */

    public String getMasterArn() {
        return this.masterArn;
    }

    /**
     * <p>
     * For Lambda@Edge functions, the ARN of the master function.
     * </p>
     * 
     * @param masterArn
     *        For Lambda@Edge functions, the ARN of the master function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withMasterArn(String masterArn) {
        setMasterArn(masterArn);
        return this;
    }

    /**
     * <p>
     * The latest updated revision of the function or alias.
     * </p>
     * 
     * @param revisionId
     *        The latest updated revision of the function or alias.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The latest updated revision of the function or alias.
     * </p>
     * 
     * @return The latest updated revision of the function or alias.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The latest updated revision of the function or alias.
     * </p>
     * 
     * @param revisionId
     *        The latest updated revision of the function or alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>.
     * </p>
     * 
     * @return The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">
     *         layers</a>.
     */

    public java.util.List<Layer> getLayers() {
        if (layers == null) {
            layers = new com.amazonaws.internal.SdkInternalList<Layer>();
        }
        return layers;
    }

    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>.
     * </p>
     * 
     * @param layers
     *        The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">
     *        layers</a>.
     */

    public void setLayers(java.util.Collection<Layer> layers) {
        if (layers == null) {
            this.layers = null;
            return;
        }

        this.layers = new com.amazonaws.internal.SdkInternalList<Layer>(layers);
    }

    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayers(java.util.Collection)} or {@link #withLayers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param layers
     *        The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">
     *        layers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withLayers(Layer... layers) {
        if (this.layers == null) {
            setLayers(new com.amazonaws.internal.SdkInternalList<Layer>(layers.length));
        }
        for (Layer ele : layers) {
            this.layers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>.
     * </p>
     * 
     * @param layers
     *        The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">
     *        layers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withLayers(java.util.Collection<Layer> layers) {
        setLayers(layers);
        return this;
    }

    /**
     * <p>
     * The current state of the function. When the state is <code>Inactive</code>, you can reactivate the function by
     * invoking it.
     * </p>
     * 
     * @param state
     *        The current state of the function. When the state is <code>Inactive</code>, you can reactivate the
     *        function by invoking it.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the function. When the state is <code>Inactive</code>, you can reactivate the function by
     * invoking it.
     * </p>
     * 
     * @return The current state of the function. When the state is <code>Inactive</code>, you can reactivate the
     *         function by invoking it.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the function. When the state is <code>Inactive</code>, you can reactivate the function by
     * invoking it.
     * </p>
     * 
     * @param state
     *        The current state of the function. When the state is <code>Inactive</code>, you can reactivate the
     *        function by invoking it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public UpdateFunctionCodeResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the function. When the state is <code>Inactive</code>, you can reactivate the function by
     * invoking it.
     * </p>
     * 
     * @param state
     *        The current state of the function. When the state is <code>Inactive</code>, you can reactivate the
     *        function by invoking it.
     * @see State
     */

    public void setState(State state) {
        withState(state);
    }

    /**
     * <p>
     * The current state of the function. When the state is <code>Inactive</code>, you can reactivate the function by
     * invoking it.
     * </p>
     * 
     * @param state
     *        The current state of the function. When the state is <code>Inactive</code>, you can reactivate the
     *        function by invoking it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public UpdateFunctionCodeResult withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the function's current state.
     * </p>
     * 
     * @param stateReason
     *        The reason for the function's current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason for the function's current state.
     * </p>
     * 
     * @return The reason for the function's current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason for the function's current state.
     * </p>
     * 
     * @param stateReason
     *        The reason for the function's current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The reason code for the function's current state. When the code is <code>Creating</code>, you can't invoke or
     * modify the function.
     * </p>
     * 
     * @param stateReasonCode
     *        The reason code for the function's current state. When the code is <code>Creating</code>, you can't invoke
     *        or modify the function.
     * @see StateReasonCode
     */

    public void setStateReasonCode(String stateReasonCode) {
        this.stateReasonCode = stateReasonCode;
    }

    /**
     * <p>
     * The reason code for the function's current state. When the code is <code>Creating</code>, you can't invoke or
     * modify the function.
     * </p>
     * 
     * @return The reason code for the function's current state. When the code is <code>Creating</code>, you can't
     *         invoke or modify the function.
     * @see StateReasonCode
     */

    public String getStateReasonCode() {
        return this.stateReasonCode;
    }

    /**
     * <p>
     * The reason code for the function's current state. When the code is <code>Creating</code>, you can't invoke or
     * modify the function.
     * </p>
     * 
     * @param stateReasonCode
     *        The reason code for the function's current state. When the code is <code>Creating</code>, you can't invoke
     *        or modify the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateReasonCode
     */

    public UpdateFunctionCodeResult withStateReasonCode(String stateReasonCode) {
        setStateReasonCode(stateReasonCode);
        return this;
    }

    /**
     * <p>
     * The reason code for the function's current state. When the code is <code>Creating</code>, you can't invoke or
     * modify the function.
     * </p>
     * 
     * @param stateReasonCode
     *        The reason code for the function's current state. When the code is <code>Creating</code>, you can't invoke
     *        or modify the function.
     * @see StateReasonCode
     */

    public void setStateReasonCode(StateReasonCode stateReasonCode) {
        withStateReasonCode(stateReasonCode);
    }

    /**
     * <p>
     * The reason code for the function's current state. When the code is <code>Creating</code>, you can't invoke or
     * modify the function.
     * </p>
     * 
     * @param stateReasonCode
     *        The reason code for the function's current state. When the code is <code>Creating</code>, you can't invoke
     *        or modify the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateReasonCode
     */

    public UpdateFunctionCodeResult withStateReasonCode(StateReasonCode stateReasonCode) {
        this.stateReasonCode = stateReasonCode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the last update that was performed on the function. This is first set to <code>Successful</code>
     * after function creation completes.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last update that was performed on the function. This is first set to
     *        <code>Successful</code> after function creation completes.
     * @see LastUpdateStatus
     */

    public void setLastUpdateStatus(String lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus;
    }

    /**
     * <p>
     * The status of the last update that was performed on the function. This is first set to <code>Successful</code>
     * after function creation completes.
     * </p>
     * 
     * @return The status of the last update that was performed on the function. This is first set to
     *         <code>Successful</code> after function creation completes.
     * @see LastUpdateStatus
     */

    public String getLastUpdateStatus() {
        return this.lastUpdateStatus;
    }

    /**
     * <p>
     * The status of the last update that was performed on the function. This is first set to <code>Successful</code>
     * after function creation completes.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last update that was performed on the function. This is first set to
     *        <code>Successful</code> after function creation completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastUpdateStatus
     */

    public UpdateFunctionCodeResult withLastUpdateStatus(String lastUpdateStatus) {
        setLastUpdateStatus(lastUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the last update that was performed on the function. This is first set to <code>Successful</code>
     * after function creation completes.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last update that was performed on the function. This is first set to
     *        <code>Successful</code> after function creation completes.
     * @see LastUpdateStatus
     */

    public void setLastUpdateStatus(LastUpdateStatus lastUpdateStatus) {
        withLastUpdateStatus(lastUpdateStatus);
    }

    /**
     * <p>
     * The status of the last update that was performed on the function. This is first set to <code>Successful</code>
     * after function creation completes.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last update that was performed on the function. This is first set to
     *        <code>Successful</code> after function creation completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastUpdateStatus
     */

    public UpdateFunctionCodeResult withLastUpdateStatus(LastUpdateStatus lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the last update that was performed on the function.
     * </p>
     * 
     * @param lastUpdateStatusReason
     *        The reason for the last update that was performed on the function.
     */

    public void setLastUpdateStatusReason(String lastUpdateStatusReason) {
        this.lastUpdateStatusReason = lastUpdateStatusReason;
    }

    /**
     * <p>
     * The reason for the last update that was performed on the function.
     * </p>
     * 
     * @return The reason for the last update that was performed on the function.
     */

    public String getLastUpdateStatusReason() {
        return this.lastUpdateStatusReason;
    }

    /**
     * <p>
     * The reason for the last update that was performed on the function.
     * </p>
     * 
     * @param lastUpdateStatusReason
     *        The reason for the last update that was performed on the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeResult withLastUpdateStatusReason(String lastUpdateStatusReason) {
        setLastUpdateStatusReason(lastUpdateStatusReason);
        return this;
    }

    /**
     * <p>
     * The reason code for the last update that was performed on the function.
     * </p>
     * 
     * @param lastUpdateStatusReasonCode
     *        The reason code for the last update that was performed on the function.
     * @see LastUpdateStatusReasonCode
     */

    public void setLastUpdateStatusReasonCode(String lastUpdateStatusReasonCode) {
        this.lastUpdateStatusReasonCode = lastUpdateStatusReasonCode;
    }

    /**
     * <p>
     * The reason code for the last update that was performed on the function.
     * </p>
     * 
     * @return The reason code for the last update that was performed on the function.
     * @see LastUpdateStatusReasonCode
     */

    public String getLastUpdateStatusReasonCode() {
        return this.lastUpdateStatusReasonCode;
    }

    /**
     * <p>
     * The reason code for the last update that was performed on the function.
     * </p>
     * 
     * @param lastUpdateStatusReasonCode
     *        The reason code for the last update that was performed on the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastUpdateStatusReasonCode
     */

    public UpdateFunctionCodeResult withLastUpdateStatusReasonCode(String lastUpdateStatusReasonCode) {
        setLastUpdateStatusReasonCode(lastUpdateStatusReasonCode);
        return this;
    }

    /**
     * <p>
     * The reason code for the last update that was performed on the function.
     * </p>
     * 
     * @param lastUpdateStatusReasonCode
     *        The reason code for the last update that was performed on the function.
     * @see LastUpdateStatusReasonCode
     */

    public void setLastUpdateStatusReasonCode(LastUpdateStatusReasonCode lastUpdateStatusReasonCode) {
        withLastUpdateStatusReasonCode(lastUpdateStatusReasonCode);
    }

    /**
     * <p>
     * The reason code for the last update that was performed on the function.
     * </p>
     * 
     * @param lastUpdateStatusReasonCode
     *        The reason code for the last update that was performed on the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastUpdateStatusReasonCode
     */

    public UpdateFunctionCodeResult withLastUpdateStatusReasonCode(LastUpdateStatusReasonCode lastUpdateStatusReasonCode) {
        this.lastUpdateStatusReasonCode = lastUpdateStatusReasonCode.toString();
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
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getHandler() != null)
            sb.append("Handler: ").append(getHandler()).append(",");
        if (getCodeSize() != null)
            sb.append("CodeSize: ").append(getCodeSize()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getMemorySize() != null)
            sb.append("MemorySize: ").append(getMemorySize()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getCodeSha256() != null)
            sb.append("CodeSha256: ").append(getCodeSha256()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
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
        if (getMasterArn() != null)
            sb.append("MasterArn: ").append(getMasterArn()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getLayers() != null)
            sb.append("Layers: ").append(getLayers()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getStateReasonCode() != null)
            sb.append("StateReasonCode: ").append(getStateReasonCode()).append(",");
        if (getLastUpdateStatus() != null)
            sb.append("LastUpdateStatus: ").append(getLastUpdateStatus()).append(",");
        if (getLastUpdateStatusReason() != null)
            sb.append("LastUpdateStatusReason: ").append(getLastUpdateStatusReason()).append(",");
        if (getLastUpdateStatusReasonCode() != null)
            sb.append("LastUpdateStatusReasonCode: ").append(getLastUpdateStatusReasonCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFunctionCodeResult == false)
            return false;
        UpdateFunctionCodeResult other = (UpdateFunctionCodeResult) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
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
        if (other.getCodeSize() == null ^ this.getCodeSize() == null)
            return false;
        if (other.getCodeSize() != null && other.getCodeSize().equals(this.getCodeSize()) == false)
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
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getCodeSha256() == null ^ this.getCodeSha256() == null)
            return false;
        if (other.getCodeSha256() != null && other.getCodeSha256().equals(this.getCodeSha256()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
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
        if (other.getMasterArn() == null ^ this.getMasterArn() == null)
            return false;
        if (other.getMasterArn() != null && other.getMasterArn().equals(this.getMasterArn()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getLayers() == null ^ this.getLayers() == null)
            return false;
        if (other.getLayers() != null && other.getLayers().equals(this.getLayers()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getStateReasonCode() == null ^ this.getStateReasonCode() == null)
            return false;
        if (other.getStateReasonCode() != null && other.getStateReasonCode().equals(this.getStateReasonCode()) == false)
            return false;
        if (other.getLastUpdateStatus() == null ^ this.getLastUpdateStatus() == null)
            return false;
        if (other.getLastUpdateStatus() != null && other.getLastUpdateStatus().equals(this.getLastUpdateStatus()) == false)
            return false;
        if (other.getLastUpdateStatusReason() == null ^ this.getLastUpdateStatusReason() == null)
            return false;
        if (other.getLastUpdateStatusReason() != null && other.getLastUpdateStatusReason().equals(this.getLastUpdateStatusReason()) == false)
            return false;
        if (other.getLastUpdateStatusReasonCode() == null ^ this.getLastUpdateStatusReasonCode() == null)
            return false;
        if (other.getLastUpdateStatusReasonCode() != null && other.getLastUpdateStatusReasonCode().equals(this.getLastUpdateStatusReasonCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode());
        hashCode = prime * hashCode + ((getCodeSize() == null) ? 0 : getCodeSize().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getCodeSha256() == null) ? 0 : getCodeSha256().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyArn() == null) ? 0 : getKMSKeyArn().hashCode());
        hashCode = prime * hashCode + ((getTracingConfig() == null) ? 0 : getTracingConfig().hashCode());
        hashCode = prime * hashCode + ((getMasterArn() == null) ? 0 : getMasterArn().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getLayers() == null) ? 0 : getLayers().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getStateReasonCode() == null) ? 0 : getStateReasonCode().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateStatus() == null) ? 0 : getLastUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateStatusReason() == null) ? 0 : getLastUpdateStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateStatusReasonCode() == null) ? 0 : getLastUpdateStatusReasonCode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFunctionCodeResult clone() {
        try {
            return (UpdateFunctionCodeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
