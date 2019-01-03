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
package com.amazonaws.services.sagemakerruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.sagemaker-2017-05-13/InvokeEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint using the <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * Provides input data, in the format specified in the <code>ContentType</code> request header. Amazon SageMaker
     * passes all of the data in the body to the model.
     * </p>
     * <p>
     * For information about the format of the request body, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data Formats—Inference</a>.
     * </p>
     */
    private java.nio.ByteBuffer body;
    /**
     * <p>
     * The MIME type of the input data in the request body.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The desired MIME type of the inference in the response.
     * </p>
     */
    private String accept;
    /** <p/> */
    private String customAttributes;

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint using the <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint that you specified when you created the endpoint using the <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint using the <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     * </p>
     * 
     * @return The name of the endpoint that you specified when you created the endpoint using the <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint using the <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint that you specified when you created the endpoint using the <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * Provides input data, in the format specified in the <code>ContentType</code> request header. Amazon SageMaker
     * passes all of the data in the body to the model.
     * </p>
     * <p>
     * For information about the format of the request body, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data Formats—Inference</a>.
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
     *        Provides input data, in the format specified in the <code>ContentType</code> request header. Amazon
     *        SageMaker passes all of the data in the body to the model. </p>
     *        <p>
     *        For information about the format of the request body, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data
     *        Formats—Inference</a>.
     */

    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * Provides input data, in the format specified in the <code>ContentType</code> request header. Amazon SageMaker
     * passes all of the data in the body to the model.
     * </p>
     * <p>
     * For information about the format of the request body, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data Formats—Inference</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Provides input data, in the format specified in the <code>ContentType</code> request header. Amazon
     *         SageMaker passes all of the data in the body to the model. </p>
     *         <p>
     *         For information about the format of the request body, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data
     *         Formats—Inference</a>.
     */

    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * <p>
     * Provides input data, in the format specified in the <code>ContentType</code> request header. Amazon SageMaker
     * passes all of the data in the body to the model.
     * </p>
     * <p>
     * For information about the format of the request body, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data Formats—Inference</a>.
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
     *        Provides input data, in the format specified in the <code>ContentType</code> request header. Amazon
     *        SageMaker passes all of the data in the body to the model. </p>
     *        <p>
     *        For information about the format of the request body, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data
     *        Formats—Inference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointRequest withBody(java.nio.ByteBuffer body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The MIME type of the input data in the request body.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the input data in the request body.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The MIME type of the input data in the request body.
     * </p>
     * 
     * @return The MIME type of the input data in the request body.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The MIME type of the input data in the request body.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the input data in the request body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The desired MIME type of the inference in the response.
     * </p>
     * 
     * @param accept
     *        The desired MIME type of the inference in the response.
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * The desired MIME type of the inference in the response.
     * </p>
     * 
     * @return The desired MIME type of the inference in the response.
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * <p>
     * The desired MIME type of the inference in the response.
     * </p>
     * 
     * @param accept
     *        The desired MIME type of the inference in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p/>
     * 
     * @param customAttributes
     */

    public void setCustomAttributes(String customAttributes) {
        this.customAttributes = customAttributes;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getCustomAttributes() {
        return this.customAttributes;
    }

    /**
     * <p/>
     * 
     * @param customAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointRequest withCustomAttributes(String customAttributes) {
        setCustomAttributes(customAttributes);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append("***Sensitive Data Redacted***").append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
        if (getCustomAttributes() != null)
            sb.append("CustomAttributes: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeEndpointRequest == false)
            return false;
        InvokeEndpointRequest other = (InvokeEndpointRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
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
        if (other.getCustomAttributes() == null ^ this.getCustomAttributes() == null)
            return false;
        if (other.getCustomAttributes() != null && other.getCustomAttributes().equals(this.getCustomAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getCustomAttributes() == null) ? 0 : getCustomAttributes().hashCode());
        return hashCode;
    }

    @Override
    public InvokeEndpointRequest clone() {
        return (InvokeEndpointRequest) super.clone();
    }

}
