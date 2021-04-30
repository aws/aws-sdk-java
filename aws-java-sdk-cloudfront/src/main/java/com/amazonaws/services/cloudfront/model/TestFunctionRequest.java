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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TestFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestFunctionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the function that you are testing.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current version (<code>ETag</code> value) of the function that you are testing, which you can get using
     * <code>DescribeFunction</code>.
     * </p>
     */
    private String ifMatch;
    /**
     * <p>
     * The stage of the function that you are testing, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     */
    private String stage;
    /**
     * <p>
     * The event object to test the function with. For more information about the structure of the event object, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/managing-functions.html#test-function">
     * Testing functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private java.nio.ByteBuffer eventObject;

    /**
     * <p>
     * The name of the function that you are testing.
     * </p>
     * 
     * @param name
     *        The name of the function that you are testing.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the function that you are testing.
     * </p>
     * 
     * @return The name of the function that you are testing.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the function that you are testing.
     * </p>
     * 
     * @param name
     *        The name of the function that you are testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestFunctionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current version (<code>ETag</code> value) of the function that you are testing, which you can get using
     * <code>DescribeFunction</code>.
     * </p>
     * 
     * @param ifMatch
     *        The current version (<code>ETag</code> value) of the function that you are testing, which you can get
     *        using <code>DescribeFunction</code>.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The current version (<code>ETag</code> value) of the function that you are testing, which you can get using
     * <code>DescribeFunction</code>.
     * </p>
     * 
     * @return The current version (<code>ETag</code> value) of the function that you are testing, which you can get
     *         using <code>DescribeFunction</code>.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The current version (<code>ETag</code> value) of the function that you are testing, which you can get using
     * <code>DescribeFunction</code>.
     * </p>
     * 
     * @param ifMatch
     *        The current version (<code>ETag</code> value) of the function that you are testing, which you can get
     *        using <code>DescribeFunction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestFunctionRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
        return this;
    }

    /**
     * <p>
     * The stage of the function that you are testing, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * 
     * @param stage
     *        The stage of the function that you are testing, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * @see FunctionStage
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The stage of the function that you are testing, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * 
     * @return The stage of the function that you are testing, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * @see FunctionStage
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The stage of the function that you are testing, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * 
     * @param stage
     *        The stage of the function that you are testing, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionStage
     */

    public TestFunctionRequest withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * The stage of the function that you are testing, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * 
     * @param stage
     *        The stage of the function that you are testing, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionStage
     */

    public TestFunctionRequest withStage(FunctionStage stage) {
        this.stage = stage.toString();
        return this;
    }

    /**
     * <p>
     * The event object to test the function with. For more information about the structure of the event object, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/managing-functions.html#test-function">
     * Testing functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
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
     * @param eventObject
     *        The event object to test the function with. For more information about the structure of the event object,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/managing-functions.html#test-function"
     *        >Testing functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setEventObject(java.nio.ByteBuffer eventObject) {
        this.eventObject = eventObject;
    }

    /**
     * <p>
     * The event object to test the function with. For more information about the structure of the event object, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/managing-functions.html#test-function">
     * Testing functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The event object to test the function with. For more information about the structure of the event object,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/managing-functions.html#test-function"
     *         >Testing functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public java.nio.ByteBuffer getEventObject() {
        return this.eventObject;
    }

    /**
     * <p>
     * The event object to test the function with. For more information about the structure of the event object, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/managing-functions.html#test-function">
     * Testing functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
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
     * @param eventObject
     *        The event object to test the function with. For more information about the structure of the event object,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/managing-functions.html#test-function"
     *        >Testing functions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestFunctionRequest withEventObject(java.nio.ByteBuffer eventObject) {
        setEventObject(eventObject);
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
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch()).append(",");
        if (getStage() != null)
            sb.append("Stage: ").append(getStage()).append(",");
        if (getEventObject() != null)
            sb.append("EventObject: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestFunctionRequest == false)
            return false;
        TestFunctionRequest other = (TestFunctionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getEventObject() == null ^ this.getEventObject() == null)
            return false;
        if (other.getEventObject() != null && other.getEventObject().equals(this.getEventObject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getEventObject() == null) ? 0 : getEventObject().hashCode());
        return hashCode;
    }

    @Override
    public TestFunctionRequest clone() {
        return (TestFunctionRequest) super.clone();
    }

}
