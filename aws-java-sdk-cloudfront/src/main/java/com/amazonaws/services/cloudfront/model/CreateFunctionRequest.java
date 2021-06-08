/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFunctionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name to identify the function.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Configuration information about the function, including an optional comment and the function’s runtime.
     * </p>
     */
    private FunctionConfig functionConfig;
    /**
     * <p>
     * The function code. For more information about writing a CloudFront function, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html">Writing
     * function code for CloudFront Functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private java.nio.ByteBuffer functionCode;

    /**
     * <p>
     * A name to identify the function.
     * </p>
     * 
     * @param name
     *        A name to identify the function.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name to identify the function.
     * </p>
     * 
     * @return A name to identify the function.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name to identify the function.
     * </p>
     * 
     * @param name
     *        A name to identify the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Configuration information about the function, including an optional comment and the function’s runtime.
     * </p>
     * 
     * @param functionConfig
     *        Configuration information about the function, including an optional comment and the function’s runtime.
     */

    public void setFunctionConfig(FunctionConfig functionConfig) {
        this.functionConfig = functionConfig;
    }

    /**
     * <p>
     * Configuration information about the function, including an optional comment and the function’s runtime.
     * </p>
     * 
     * @return Configuration information about the function, including an optional comment and the function’s runtime.
     */

    public FunctionConfig getFunctionConfig() {
        return this.functionConfig;
    }

    /**
     * <p>
     * Configuration information about the function, including an optional comment and the function’s runtime.
     * </p>
     * 
     * @param functionConfig
     *        Configuration information about the function, including an optional comment and the function’s runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withFunctionConfig(FunctionConfig functionConfig) {
        setFunctionConfig(functionConfig);
        return this;
    }

    /**
     * <p>
     * The function code. For more information about writing a CloudFront function, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html">Writing
     * function code for CloudFront Functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
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
     * @param functionCode
     *        The function code. For more information about writing a CloudFront function, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html"
     *        >Writing function code for CloudFront Functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setFunctionCode(java.nio.ByteBuffer functionCode) {
        this.functionCode = functionCode;
    }

    /**
     * <p>
     * The function code. For more information about writing a CloudFront function, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html">Writing
     * function code for CloudFront Functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The function code. For more information about writing a CloudFront function, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html"
     *         >Writing function code for CloudFront Functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public java.nio.ByteBuffer getFunctionCode() {
        return this.functionCode;
    }

    /**
     * <p>
     * The function code. For more information about writing a CloudFront function, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html">Writing
     * function code for CloudFront Functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
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
     * @param functionCode
     *        The function code. For more information about writing a CloudFront function, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html"
     *        >Writing function code for CloudFront Functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withFunctionCode(java.nio.ByteBuffer functionCode) {
        setFunctionCode(functionCode);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFunctionConfig() != null)
            sb.append("FunctionConfig: ").append(getFunctionConfig()).append(",");
        if (getFunctionCode() != null)
            sb.append("FunctionCode: ").append("***Sensitive Data Redacted***");
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFunctionConfig() == null ^ this.getFunctionConfig() == null)
            return false;
        if (other.getFunctionConfig() != null && other.getFunctionConfig().equals(this.getFunctionConfig()) == false)
            return false;
        if (other.getFunctionCode() == null ^ this.getFunctionCode() == null)
            return false;
        if (other.getFunctionCode() != null && other.getFunctionCode().equals(this.getFunctionCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFunctionConfig() == null) ? 0 : getFunctionConfig().hashCode());
        hashCode = prime * hashCode + ((getFunctionCode() == null) ? 0 : getFunctionCode().hashCode());
        return hashCode;
    }

    @Override
    public CreateFunctionRequest clone() {
        return (CreateFunctionRequest) super.clone();
    }

}
