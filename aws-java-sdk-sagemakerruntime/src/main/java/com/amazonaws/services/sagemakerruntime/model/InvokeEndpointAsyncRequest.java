/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.sagemaker-2017-05-13/InvokeEndpointAsync"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeEndpointAsyncRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint using the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateEndpoint.html">
     * <code>CreateEndpoint</code> </a> API.
     * </p>
     */
    private String endpointName;
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
    /**
     * <p>
     * Provides additional information about a request for an inference submitted to a model hosted at an Amazon
     * SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for
     * example, to provide an ID that you can use to track a request or to provide other metadata that a service
     * endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII characters as
     * specified in <a href="https://datatracker.ietf.org/doc/html/rfc7230#section-3.2.6">Section 3.3.6. Field Value
     * Components</a> of the Hypertext Transfer Protocol (HTTP/1.1).
     * </p>
     * <p>
     * The code in your model is responsible for setting or updating any custom attributes in the response. If your code
     * does not set this value in the response, an empty value is returned. For example, if a custom attribute
     * represents the trace ID, your model can prepend the custom attribute with <code>Trace ID</code>: in your
     * post-processing function.
     * </p>
     * <p>
     * This feature is currently supported in the Amazon Web Services SDKs but not in the Amazon SageMaker Python SDK.
     * </p>
     */
    private String customAttributes;
    /**
     * <p>
     * The identifier for the inference request. Amazon SageMaker will generate an identifier for you if none is
     * specified.
     * </p>
     */
    private String inferenceId;
    /**
     * <p>
     * The Amazon S3 URI where the inference request payload is stored.
     * </p>
     */
    private String inputLocation;
    /**
     * <p>
     * Maximum age in seconds a request can be in the queue before it is marked as expired.
     * </p>
     */
    private Integer requestTTLSeconds;

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint using the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateEndpoint.html">
     * <code>CreateEndpoint</code> </a> API.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint that you specified when you created the endpoint using the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateEndpoint.html">
     *        <code>CreateEndpoint</code> </a> API.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint using the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateEndpoint.html">
     * <code>CreateEndpoint</code> </a> API.
     * </p>
     * 
     * @return The name of the endpoint that you specified when you created the endpoint using the <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateEndpoint.html">
     *         <code>CreateEndpoint</code> </a> API.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint using the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateEndpoint.html">
     * <code>CreateEndpoint</code> </a> API.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint that you specified when you created the endpoint using the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateEndpoint.html">
     *        <code>CreateEndpoint</code> </a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointAsyncRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
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

    public InvokeEndpointAsyncRequest withContentType(String contentType) {
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

    public InvokeEndpointAsyncRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p>
     * Provides additional information about a request for an inference submitted to a model hosted at an Amazon
     * SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for
     * example, to provide an ID that you can use to track a request or to provide other metadata that a service
     * endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII characters as
     * specified in <a href="https://datatracker.ietf.org/doc/html/rfc7230#section-3.2.6">Section 3.3.6. Field Value
     * Components</a> of the Hypertext Transfer Protocol (HTTP/1.1).
     * </p>
     * <p>
     * The code in your model is responsible for setting or updating any custom attributes in the response. If your code
     * does not set this value in the response, an empty value is returned. For example, if a custom attribute
     * represents the trace ID, your model can prepend the custom attribute with <code>Trace ID</code>: in your
     * post-processing function.
     * </p>
     * <p>
     * This feature is currently supported in the Amazon Web Services SDKs but not in the Amazon SageMaker Python SDK.
     * </p>
     * 
     * @param customAttributes
     *        Provides additional information about a request for an inference submitted to a model hosted at an Amazon
     *        SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this
     *        value, for example, to provide an ID that you can use to track a request or to provide other metadata that
     *        a service endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII
     *        characters as specified in <a href="https://datatracker.ietf.org/doc/html/rfc7230#section-3.2.6">Section
     *        3.3.6. Field Value Components</a> of the Hypertext Transfer Protocol (HTTP/1.1). </p>
     *        <p>
     *        The code in your model is responsible for setting or updating any custom attributes in the response. If
     *        your code does not set this value in the response, an empty value is returned. For example, if a custom
     *        attribute represents the trace ID, your model can prepend the custom attribute with <code>Trace ID</code>:
     *        in your post-processing function.
     *        </p>
     *        <p>
     *        This feature is currently supported in the Amazon Web Services SDKs but not in the Amazon SageMaker Python
     *        SDK.
     */

    public void setCustomAttributes(String customAttributes) {
        this.customAttributes = customAttributes;
    }

    /**
     * <p>
     * Provides additional information about a request for an inference submitted to a model hosted at an Amazon
     * SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for
     * example, to provide an ID that you can use to track a request or to provide other metadata that a service
     * endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII characters as
     * specified in <a href="https://datatracker.ietf.org/doc/html/rfc7230#section-3.2.6">Section 3.3.6. Field Value
     * Components</a> of the Hypertext Transfer Protocol (HTTP/1.1).
     * </p>
     * <p>
     * The code in your model is responsible for setting or updating any custom attributes in the response. If your code
     * does not set this value in the response, an empty value is returned. For example, if a custom attribute
     * represents the trace ID, your model can prepend the custom attribute with <code>Trace ID</code>: in your
     * post-processing function.
     * </p>
     * <p>
     * This feature is currently supported in the Amazon Web Services SDKs but not in the Amazon SageMaker Python SDK.
     * </p>
     * 
     * @return Provides additional information about a request for an inference submitted to a model hosted at an Amazon
     *         SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this
     *         value, for example, to provide an ID that you can use to track a request or to provide other metadata
     *         that a service endpoint was programmed to process. The value must consist of no more than 1024 visible
     *         US-ASCII characters as specified in <a
     *         href="https://datatracker.ietf.org/doc/html/rfc7230#section-3.2.6">Section 3.3.6. Field Value
     *         Components</a> of the Hypertext Transfer Protocol (HTTP/1.1). </p>
     *         <p>
     *         The code in your model is responsible for setting or updating any custom attributes in the response. If
     *         your code does not set this value in the response, an empty value is returned. For example, if a custom
     *         attribute represents the trace ID, your model can prepend the custom attribute with <code>Trace ID</code>
     *         : in your post-processing function.
     *         </p>
     *         <p>
     *         This feature is currently supported in the Amazon Web Services SDKs but not in the Amazon SageMaker
     *         Python SDK.
     */

    public String getCustomAttributes() {
        return this.customAttributes;
    }

    /**
     * <p>
     * Provides additional information about a request for an inference submitted to a model hosted at an Amazon
     * SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for
     * example, to provide an ID that you can use to track a request or to provide other metadata that a service
     * endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII characters as
     * specified in <a href="https://datatracker.ietf.org/doc/html/rfc7230#section-3.2.6">Section 3.3.6. Field Value
     * Components</a> of the Hypertext Transfer Protocol (HTTP/1.1).
     * </p>
     * <p>
     * The code in your model is responsible for setting or updating any custom attributes in the response. If your code
     * does not set this value in the response, an empty value is returned. For example, if a custom attribute
     * represents the trace ID, your model can prepend the custom attribute with <code>Trace ID</code>: in your
     * post-processing function.
     * </p>
     * <p>
     * This feature is currently supported in the Amazon Web Services SDKs but not in the Amazon SageMaker Python SDK.
     * </p>
     * 
     * @param customAttributes
     *        Provides additional information about a request for an inference submitted to a model hosted at an Amazon
     *        SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this
     *        value, for example, to provide an ID that you can use to track a request or to provide other metadata that
     *        a service endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII
     *        characters as specified in <a href="https://datatracker.ietf.org/doc/html/rfc7230#section-3.2.6">Section
     *        3.3.6. Field Value Components</a> of the Hypertext Transfer Protocol (HTTP/1.1). </p>
     *        <p>
     *        The code in your model is responsible for setting or updating any custom attributes in the response. If
     *        your code does not set this value in the response, an empty value is returned. For example, if a custom
     *        attribute represents the trace ID, your model can prepend the custom attribute with <code>Trace ID</code>:
     *        in your post-processing function.
     *        </p>
     *        <p>
     *        This feature is currently supported in the Amazon Web Services SDKs but not in the Amazon SageMaker Python
     *        SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointAsyncRequest withCustomAttributes(String customAttributes) {
        setCustomAttributes(customAttributes);
        return this;
    }

    /**
     * <p>
     * The identifier for the inference request. Amazon SageMaker will generate an identifier for you if none is
     * specified.
     * </p>
     * 
     * @param inferenceId
     *        The identifier for the inference request. Amazon SageMaker will generate an identifier for you if none is
     *        specified.
     */

    public void setInferenceId(String inferenceId) {
        this.inferenceId = inferenceId;
    }

    /**
     * <p>
     * The identifier for the inference request. Amazon SageMaker will generate an identifier for you if none is
     * specified.
     * </p>
     * 
     * @return The identifier for the inference request. Amazon SageMaker will generate an identifier for you if none is
     *         specified.
     */

    public String getInferenceId() {
        return this.inferenceId;
    }

    /**
     * <p>
     * The identifier for the inference request. Amazon SageMaker will generate an identifier for you if none is
     * specified.
     * </p>
     * 
     * @param inferenceId
     *        The identifier for the inference request. Amazon SageMaker will generate an identifier for you if none is
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointAsyncRequest withInferenceId(String inferenceId) {
        setInferenceId(inferenceId);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URI where the inference request payload is stored.
     * </p>
     * 
     * @param inputLocation
     *        The Amazon S3 URI where the inference request payload is stored.
     */

    public void setInputLocation(String inputLocation) {
        this.inputLocation = inputLocation;
    }

    /**
     * <p>
     * The Amazon S3 URI where the inference request payload is stored.
     * </p>
     * 
     * @return The Amazon S3 URI where the inference request payload is stored.
     */

    public String getInputLocation() {
        return this.inputLocation;
    }

    /**
     * <p>
     * The Amazon S3 URI where the inference request payload is stored.
     * </p>
     * 
     * @param inputLocation
     *        The Amazon S3 URI where the inference request payload is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointAsyncRequest withInputLocation(String inputLocation) {
        setInputLocation(inputLocation);
        return this;
    }

    /**
     * <p>
     * Maximum age in seconds a request can be in the queue before it is marked as expired.
     * </p>
     * 
     * @param requestTTLSeconds
     *        Maximum age in seconds a request can be in the queue before it is marked as expired.
     */

    public void setRequestTTLSeconds(Integer requestTTLSeconds) {
        this.requestTTLSeconds = requestTTLSeconds;
    }

    /**
     * <p>
     * Maximum age in seconds a request can be in the queue before it is marked as expired.
     * </p>
     * 
     * @return Maximum age in seconds a request can be in the queue before it is marked as expired.
     */

    public Integer getRequestTTLSeconds() {
        return this.requestTTLSeconds;
    }

    /**
     * <p>
     * Maximum age in seconds a request can be in the queue before it is marked as expired.
     * </p>
     * 
     * @param requestTTLSeconds
     *        Maximum age in seconds a request can be in the queue before it is marked as expired.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointAsyncRequest withRequestTTLSeconds(Integer requestTTLSeconds) {
        setRequestTTLSeconds(requestTTLSeconds);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
        if (getCustomAttributes() != null)
            sb.append("CustomAttributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getInferenceId() != null)
            sb.append("InferenceId: ").append(getInferenceId()).append(",");
        if (getInputLocation() != null)
            sb.append("InputLocation: ").append(getInputLocation()).append(",");
        if (getRequestTTLSeconds() != null)
            sb.append("RequestTTLSeconds: ").append(getRequestTTLSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeEndpointAsyncRequest == false)
            return false;
        InvokeEndpointAsyncRequest other = (InvokeEndpointAsyncRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
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
        if (other.getInferenceId() == null ^ this.getInferenceId() == null)
            return false;
        if (other.getInferenceId() != null && other.getInferenceId().equals(this.getInferenceId()) == false)
            return false;
        if (other.getInputLocation() == null ^ this.getInputLocation() == null)
            return false;
        if (other.getInputLocation() != null && other.getInputLocation().equals(this.getInputLocation()) == false)
            return false;
        if (other.getRequestTTLSeconds() == null ^ this.getRequestTTLSeconds() == null)
            return false;
        if (other.getRequestTTLSeconds() != null && other.getRequestTTLSeconds().equals(this.getRequestTTLSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getCustomAttributes() == null) ? 0 : getCustomAttributes().hashCode());
        hashCode = prime * hashCode + ((getInferenceId() == null) ? 0 : getInferenceId().hashCode());
        hashCode = prime * hashCode + ((getInputLocation() == null) ? 0 : getInputLocation().hashCode());
        hashCode = prime * hashCode + ((getRequestTTLSeconds() == null) ? 0 : getRequestTTLSeconds().hashCode());
        return hashCode;
    }

    @Override
    public InvokeEndpointAsyncRequest clone() {
        return (InvokeEndpointAsyncRequest) super.clone();
    }

}
