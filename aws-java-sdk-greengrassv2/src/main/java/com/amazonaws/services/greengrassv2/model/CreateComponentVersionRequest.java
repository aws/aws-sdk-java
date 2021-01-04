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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateComponentVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateComponentVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The recipe to use to create the component. The recipe defines the component's metadata, parameters, dependencies,
     * lifecycle, artifacts, and platform compatibility.
     * </p>
     * <p>
     * You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     * </p>
     */
    private java.nio.ByteBuffer inlineRecipe;
    /**
     * <p>
     * The parameters to create a component from a Lambda function.
     * </p>
     * <p>
     * You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     * </p>
     */
    private LambdaFunctionRecipeSource lambdaFunction;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The recipe to use to create the component. The recipe defines the component's metadata, parameters, dependencies,
     * lifecycle, artifacts, and platform compatibility.
     * </p>
     * <p>
     * You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
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
     * @param inlineRecipe
     *        The recipe to use to create the component. The recipe defines the component's metadata, parameters,
     *        dependencies, lifecycle, artifacts, and platform compatibility.</p>
     *        <p>
     *        You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     */

    public void setInlineRecipe(java.nio.ByteBuffer inlineRecipe) {
        this.inlineRecipe = inlineRecipe;
    }

    /**
     * <p>
     * The recipe to use to create the component. The recipe defines the component's metadata, parameters, dependencies,
     * lifecycle, artifacts, and platform compatibility.
     * </p>
     * <p>
     * You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The recipe to use to create the component. The recipe defines the component's metadata, parameters,
     *         dependencies, lifecycle, artifacts, and platform compatibility.</p>
     *         <p>
     *         You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     */

    public java.nio.ByteBuffer getInlineRecipe() {
        return this.inlineRecipe;
    }

    /**
     * <p>
     * The recipe to use to create the component. The recipe defines the component's metadata, parameters, dependencies,
     * lifecycle, artifacts, and platform compatibility.
     * </p>
     * <p>
     * You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
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
     * @param inlineRecipe
     *        The recipe to use to create the component. The recipe defines the component's metadata, parameters,
     *        dependencies, lifecycle, artifacts, and platform compatibility.</p>
     *        <p>
     *        You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentVersionRequest withInlineRecipe(java.nio.ByteBuffer inlineRecipe) {
        setInlineRecipe(inlineRecipe);
        return this;
    }

    /**
     * <p>
     * The parameters to create a component from a Lambda function.
     * </p>
     * <p>
     * You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     * </p>
     * 
     * @param lambdaFunction
     *        The parameters to create a component from a Lambda function.</p>
     *        <p>
     *        You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     */

    public void setLambdaFunction(LambdaFunctionRecipeSource lambdaFunction) {
        this.lambdaFunction = lambdaFunction;
    }

    /**
     * <p>
     * The parameters to create a component from a Lambda function.
     * </p>
     * <p>
     * You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     * </p>
     * 
     * @return The parameters to create a component from a Lambda function.</p>
     *         <p>
     *         You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     */

    public LambdaFunctionRecipeSource getLambdaFunction() {
        return this.lambdaFunction;
    }

    /**
     * <p>
     * The parameters to create a component from a Lambda function.
     * </p>
     * <p>
     * You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     * </p>
     * 
     * @param lambdaFunction
     *        The parameters to create a component from a Lambda function.</p>
     *        <p>
     *        You must specify either <code>inlineRecipe</code> or <code>lambdaFunction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentVersionRequest withLambdaFunction(LambdaFunctionRecipeSource lambdaFunction) {
        setLambdaFunction(lambdaFunction);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS
     *         IoT Greengrass V2 Developer Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS
     *        IoT Greengrass V2 Developer Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS
     *        IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentVersionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateComponentVersionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentVersionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
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

    public CreateComponentVersionRequest clearTagsEntries() {
        this.tags = null;
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
        if (getInlineRecipe() != null)
            sb.append("InlineRecipe: ").append(getInlineRecipe()).append(",");
        if (getLambdaFunction() != null)
            sb.append("LambdaFunction: ").append(getLambdaFunction()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateComponentVersionRequest == false)
            return false;
        CreateComponentVersionRequest other = (CreateComponentVersionRequest) obj;
        if (other.getInlineRecipe() == null ^ this.getInlineRecipe() == null)
            return false;
        if (other.getInlineRecipe() != null && other.getInlineRecipe().equals(this.getInlineRecipe()) == false)
            return false;
        if (other.getLambdaFunction() == null ^ this.getLambdaFunction() == null)
            return false;
        if (other.getLambdaFunction() != null && other.getLambdaFunction().equals(this.getLambdaFunction()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInlineRecipe() == null) ? 0 : getInlineRecipe().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunction() == null) ? 0 : getLambdaFunction().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateComponentVersionRequest clone() {
        return (CreateComponentVersionRequest) super.clone();
    }

}
