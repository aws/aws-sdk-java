/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrockruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/InvokeModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The prompt and inference parameters in the format specified in the <code>contentType</code> in the header. To see
     * the format and content of the request and response bodies for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>. For
     * more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html">Run
     * inference</a> in the Bedrock User Guide.
     * </p>
     */
    private java.nio.ByteBuffer body;
    /**
     * <p>
     * The MIME type of the input data in the request. The default value is <code>application/json</code>.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The desired MIME type of the inference body in the response. The default value is <code>application/json</code>.
     * </p>
     */
    private String accept;
    /**
     * <p>
     * The unique identifier of the model to invoke to run inference.
     * </p>
     * <p>
     * The <code>modelId</code> to provide depends on the type of model that you use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock base
     * model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a Provisioned
     * Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the resulting
     * provisioned model. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom model in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * </ul>
     */
    private String modelId;
    /**
     * <p>
     * Specifies whether to enable or disable the Bedrock trace. If enabled, you can see the full Bedrock trace.
     * </p>
     */
    private String trace;
    /**
     * <p>
     * The unique identifier of the guardrail that you want to use. If you don't provide a value, no guardrail is
     * applied to the invocation.
     * </p>
     * <p>
     * An error will be thrown in the following situations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You don't provide a guardrail identifier but you specify the <code>amazon-bedrock-guardrailConfig</code> field in
     * the request body.
     * </p>
     * </li>
     * <li>
     * <p>
     * You enable the guardrail but the <code>contentType</code> isn't <code>application/json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You provide a guardrail identifier, but <code>guardrailVersion</code> isn't specified.
     * </p>
     * </li>
     * </ul>
     */
    private String guardrailIdentifier;
    /**
     * <p>
     * The version number for the guardrail. The value can also be <code>DRAFT</code>.
     * </p>
     */
    private String guardrailVersion;

    /**
     * <p>
     * The prompt and inference parameters in the format specified in the <code>contentType</code> in the header. To see
     * the format and content of the request and response bodies for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>. For
     * more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html">Run
     * inference</a> in the Bedrock User Guide.
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
     * @param body
     *        The prompt and inference parameters in the format specified in the <code>contentType</code> in the header.
     *        To see the format and content of the request and response bodies for different models, refer to <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference
     *        parameters</a>. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html">Run inference</a> in the
     *        Bedrock User Guide.
     */

    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * The prompt and inference parameters in the format specified in the <code>contentType</code> in the header. To see
     * the format and content of the request and response bodies for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>. For
     * more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html">Run
     * inference</a> in the Bedrock User Guide.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The prompt and inference parameters in the format specified in the <code>contentType</code> in the
     *         header. To see the format and content of the request and response bodies for different models, refer to
     *         <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference
     *         parameters</a>. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html">Run inference</a> in the
     *         Bedrock User Guide.
     */

    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * <p>
     * The prompt and inference parameters in the format specified in the <code>contentType</code> in the header. To see
     * the format and content of the request and response bodies for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>. For
     * more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html">Run
     * inference</a> in the Bedrock User Guide.
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
     * @param body
     *        The prompt and inference parameters in the format specified in the <code>contentType</code> in the header.
     *        To see the format and content of the request and response bodies for different models, refer to <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference
     *        parameters</a>. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html">Run inference</a> in the
     *        Bedrock User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelRequest withBody(java.nio.ByteBuffer body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The MIME type of the input data in the request. The default value is <code>application/json</code>.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the input data in the request. The default value is <code>application/json</code>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The MIME type of the input data in the request. The default value is <code>application/json</code>.
     * </p>
     * 
     * @return The MIME type of the input data in the request. The default value is <code>application/json</code>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The MIME type of the input data in the request. The default value is <code>application/json</code>.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the input data in the request. The default value is <code>application/json</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The desired MIME type of the inference body in the response. The default value is <code>application/json</code>.
     * </p>
     * 
     * @param accept
     *        The desired MIME type of the inference body in the response. The default value is
     *        <code>application/json</code>.
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * The desired MIME type of the inference body in the response. The default value is <code>application/json</code>.
     * </p>
     * 
     * @return The desired MIME type of the inference body in the response. The default value is
     *         <code>application/json</code>.
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * <p>
     * The desired MIME type of the inference body in the response. The default value is <code>application/json</code>.
     * </p>
     * 
     * @param accept
     *        The desired MIME type of the inference body in the response. The default value is
     *        <code>application/json</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the model to invoke to run inference.
     * </p>
     * <p>
     * The <code>modelId</code> to provide depends on the type of model that you use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock base
     * model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a Provisioned
     * Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the resulting
     * provisioned model. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom model in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelId
     *        The unique identifier of the model to invoke to run inference.</p>
     *        <p>
     *        The <code>modelId</code> to provide depends on the type of model that you use:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock
     *        base model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see
     *        <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a
     *        Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the
     *        resulting provisioned model. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom
     *        model in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The unique identifier of the model to invoke to run inference.
     * </p>
     * <p>
     * The <code>modelId</code> to provide depends on the type of model that you use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock base
     * model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a Provisioned
     * Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the resulting
     * provisioned model. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom model in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier of the model to invoke to run inference.</p>
     *         <p>
     *         The <code>modelId</code> to provide depends on the type of model that you use:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock
     *         base model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see
     *         <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a
     *         Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the
     *         resulting provisioned model. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom
     *         model in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     *         </p>
     *         </li>
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The unique identifier of the model to invoke to run inference.
     * </p>
     * <p>
     * The <code>modelId</code> to provide depends on the type of model that you use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock base
     * model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a Provisioned
     * Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the resulting
     * provisioned model. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom model in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelId
     *        The unique identifier of the model to invoke to run inference.</p>
     *        <p>
     *        The <code>modelId</code> to provide depends on the type of model that you use:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock
     *        base model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see
     *        <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a
     *        Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the
     *        resulting provisioned model. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom
     *        model in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelRequest withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable or disable the Bedrock trace. If enabled, you can see the full Bedrock trace.
     * </p>
     * 
     * @param trace
     *        Specifies whether to enable or disable the Bedrock trace. If enabled, you can see the full Bedrock trace.
     * @see Trace
     */

    public void setTrace(String trace) {
        this.trace = trace;
    }

    /**
     * <p>
     * Specifies whether to enable or disable the Bedrock trace. If enabled, you can see the full Bedrock trace.
     * </p>
     * 
     * @return Specifies whether to enable or disable the Bedrock trace. If enabled, you can see the full Bedrock trace.
     * @see Trace
     */

    public String getTrace() {
        return this.trace;
    }

    /**
     * <p>
     * Specifies whether to enable or disable the Bedrock trace. If enabled, you can see the full Bedrock trace.
     * </p>
     * 
     * @param trace
     *        Specifies whether to enable or disable the Bedrock trace. If enabled, you can see the full Bedrock trace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Trace
     */

    public InvokeModelRequest withTrace(String trace) {
        setTrace(trace);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable or disable the Bedrock trace. If enabled, you can see the full Bedrock trace.
     * </p>
     * 
     * @param trace
     *        Specifies whether to enable or disable the Bedrock trace. If enabled, you can see the full Bedrock trace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Trace
     */

    public InvokeModelRequest withTrace(Trace trace) {
        this.trace = trace.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the guardrail that you want to use. If you don't provide a value, no guardrail is
     * applied to the invocation.
     * </p>
     * <p>
     * An error will be thrown in the following situations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You don't provide a guardrail identifier but you specify the <code>amazon-bedrock-guardrailConfig</code> field in
     * the request body.
     * </p>
     * </li>
     * <li>
     * <p>
     * You enable the guardrail but the <code>contentType</code> isn't <code>application/json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You provide a guardrail identifier, but <code>guardrailVersion</code> isn't specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param guardrailIdentifier
     *        The unique identifier of the guardrail that you want to use. If you don't provide a value, no guardrail is
     *        applied to the invocation.</p>
     *        <p>
     *        An error will be thrown in the following situations.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You don't provide a guardrail identifier but you specify the <code>amazon-bedrock-guardrailConfig</code>
     *        field in the request body.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You enable the guardrail but the <code>contentType</code> isn't <code>application/json</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You provide a guardrail identifier, but <code>guardrailVersion</code> isn't specified.
     *        </p>
     *        </li>
     */

    public void setGuardrailIdentifier(String guardrailIdentifier) {
        this.guardrailIdentifier = guardrailIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the guardrail that you want to use. If you don't provide a value, no guardrail is
     * applied to the invocation.
     * </p>
     * <p>
     * An error will be thrown in the following situations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You don't provide a guardrail identifier but you specify the <code>amazon-bedrock-guardrailConfig</code> field in
     * the request body.
     * </p>
     * </li>
     * <li>
     * <p>
     * You enable the guardrail but the <code>contentType</code> isn't <code>application/json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You provide a guardrail identifier, but <code>guardrailVersion</code> isn't specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier of the guardrail that you want to use. If you don't provide a value, no guardrail
     *         is applied to the invocation.</p>
     *         <p>
     *         An error will be thrown in the following situations.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't provide a guardrail identifier but you specify the <code>amazon-bedrock-guardrailConfig</code>
     *         field in the request body.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You enable the guardrail but the <code>contentType</code> isn't <code>application/json</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You provide a guardrail identifier, but <code>guardrailVersion</code> isn't specified.
     *         </p>
     *         </li>
     */

    public String getGuardrailIdentifier() {
        return this.guardrailIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the guardrail that you want to use. If you don't provide a value, no guardrail is
     * applied to the invocation.
     * </p>
     * <p>
     * An error will be thrown in the following situations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You don't provide a guardrail identifier but you specify the <code>amazon-bedrock-guardrailConfig</code> field in
     * the request body.
     * </p>
     * </li>
     * <li>
     * <p>
     * You enable the guardrail but the <code>contentType</code> isn't <code>application/json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You provide a guardrail identifier, but <code>guardrailVersion</code> isn't specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param guardrailIdentifier
     *        The unique identifier of the guardrail that you want to use. If you don't provide a value, no guardrail is
     *        applied to the invocation.</p>
     *        <p>
     *        An error will be thrown in the following situations.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You don't provide a guardrail identifier but you specify the <code>amazon-bedrock-guardrailConfig</code>
     *        field in the request body.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You enable the guardrail but the <code>contentType</code> isn't <code>application/json</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You provide a guardrail identifier, but <code>guardrailVersion</code> isn't specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelRequest withGuardrailIdentifier(String guardrailIdentifier) {
        setGuardrailIdentifier(guardrailIdentifier);
        return this;
    }

    /**
     * <p>
     * The version number for the guardrail. The value can also be <code>DRAFT</code>.
     * </p>
     * 
     * @param guardrailVersion
     *        The version number for the guardrail. The value can also be <code>DRAFT</code>.
     */

    public void setGuardrailVersion(String guardrailVersion) {
        this.guardrailVersion = guardrailVersion;
    }

    /**
     * <p>
     * The version number for the guardrail. The value can also be <code>DRAFT</code>.
     * </p>
     * 
     * @return The version number for the guardrail. The value can also be <code>DRAFT</code>.
     */

    public String getGuardrailVersion() {
        return this.guardrailVersion;
    }

    /**
     * <p>
     * The version number for the guardrail. The value can also be <code>DRAFT</code>.
     * </p>
     * 
     * @param guardrailVersion
     *        The version number for the guardrail. The value can also be <code>DRAFT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelRequest withGuardrailVersion(String guardrailVersion) {
        setGuardrailVersion(guardrailVersion);
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
        if (getBody() != null)
            sb.append("Body: ").append("***Sensitive Data Redacted***").append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getTrace() != null)
            sb.append("Trace: ").append(getTrace()).append(",");
        if (getGuardrailIdentifier() != null)
            sb.append("GuardrailIdentifier: ").append(getGuardrailIdentifier()).append(",");
        if (getGuardrailVersion() != null)
            sb.append("GuardrailVersion: ").append(getGuardrailVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeModelRequest == false)
            return false;
        InvokeModelRequest other = (InvokeModelRequest) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getTrace() == null ^ this.getTrace() == null)
            return false;
        if (other.getTrace() != null && other.getTrace().equals(this.getTrace()) == false)
            return false;
        if (other.getGuardrailIdentifier() == null ^ this.getGuardrailIdentifier() == null)
            return false;
        if (other.getGuardrailIdentifier() != null && other.getGuardrailIdentifier().equals(this.getGuardrailIdentifier()) == false)
            return false;
        if (other.getGuardrailVersion() == null ^ this.getGuardrailVersion() == null)
            return false;
        if (other.getGuardrailVersion() != null && other.getGuardrailVersion().equals(this.getGuardrailVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getTrace() == null) ? 0 : getTrace().hashCode());
        hashCode = prime * hashCode + ((getGuardrailIdentifier() == null) ? 0 : getGuardrailIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGuardrailVersion() == null) ? 0 : getGuardrailVersion().hashCode());
        return hashCode;
    }

    @Override
    public InvokeModelRequest clone() {
        return (InvokeModelRequest) super.clone();
    }

}
