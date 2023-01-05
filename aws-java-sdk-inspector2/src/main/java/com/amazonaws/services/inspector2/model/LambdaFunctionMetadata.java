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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The AWS Lambda function metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/LambdaFunctionMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a function.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The resource tags on an AWS Lambda function.
     * </p>
     */
    private java.util.Map<String, String> functionTags;
    /**
     * <p>
     * The layers for an AWS Lambda function. A Lambda function can have up to five layers.
     * </p>
     */
    private java.util.List<String> layers;
    /**
     * <p>
     * An AWS Lambda function's runtime.
     * </p>
     */
    private String runtime;

    /**
     * <p>
     * The name of a function.
     * </p>
     * 
     * @param functionName
     *        The name of a function.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of a function.
     * </p>
     * 
     * @return The name of a function.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of a function.
     * </p>
     * 
     * @param functionName
     *        The name of a function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionMetadata withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The resource tags on an AWS Lambda function.
     * </p>
     * 
     * @return The resource tags on an AWS Lambda function.
     */

    public java.util.Map<String, String> getFunctionTags() {
        return functionTags;
    }

    /**
     * <p>
     * The resource tags on an AWS Lambda function.
     * </p>
     * 
     * @param functionTags
     *        The resource tags on an AWS Lambda function.
     */

    public void setFunctionTags(java.util.Map<String, String> functionTags) {
        this.functionTags = functionTags;
    }

    /**
     * <p>
     * The resource tags on an AWS Lambda function.
     * </p>
     * 
     * @param functionTags
     *        The resource tags on an AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionMetadata withFunctionTags(java.util.Map<String, String> functionTags) {
        setFunctionTags(functionTags);
        return this;
    }

    /**
     * Add a single FunctionTags entry
     *
     * @see LambdaFunctionMetadata#withFunctionTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionMetadata addFunctionTagsEntry(String key, String value) {
        if (null == this.functionTags) {
            this.functionTags = new java.util.HashMap<String, String>();
        }
        if (this.functionTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.functionTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FunctionTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionMetadata clearFunctionTagsEntries() {
        this.functionTags = null;
        return this;
    }

    /**
     * <p>
     * The layers for an AWS Lambda function. A Lambda function can have up to five layers.
     * </p>
     * 
     * @return The layers for an AWS Lambda function. A Lambda function can have up to five layers.
     */

    public java.util.List<String> getLayers() {
        return layers;
    }

    /**
     * <p>
     * The layers for an AWS Lambda function. A Lambda function can have up to five layers.
     * </p>
     * 
     * @param layers
     *        The layers for an AWS Lambda function. A Lambda function can have up to five layers.
     */

    public void setLayers(java.util.Collection<String> layers) {
        if (layers == null) {
            this.layers = null;
            return;
        }

        this.layers = new java.util.ArrayList<String>(layers);
    }

    /**
     * <p>
     * The layers for an AWS Lambda function. A Lambda function can have up to five layers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayers(java.util.Collection)} or {@link #withLayers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param layers
     *        The layers for an AWS Lambda function. A Lambda function can have up to five layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionMetadata withLayers(String... layers) {
        if (this.layers == null) {
            setLayers(new java.util.ArrayList<String>(layers.length));
        }
        for (String ele : layers) {
            this.layers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The layers for an AWS Lambda function. A Lambda function can have up to five layers.
     * </p>
     * 
     * @param layers
     *        The layers for an AWS Lambda function. A Lambda function can have up to five layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionMetadata withLayers(java.util.Collection<String> layers) {
        setLayers(layers);
        return this;
    }

    /**
     * <p>
     * An AWS Lambda function's runtime.
     * </p>
     * 
     * @param runtime
     *        An AWS Lambda function's runtime.
     * @see Runtime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * An AWS Lambda function's runtime.
     * </p>
     * 
     * @return An AWS Lambda function's runtime.
     * @see Runtime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * An AWS Lambda function's runtime.
     * </p>
     * 
     * @param runtime
     *        An AWS Lambda function's runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public LambdaFunctionMetadata withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * An AWS Lambda function's runtime.
     * </p>
     * 
     * @param runtime
     *        An AWS Lambda function's runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public LambdaFunctionMetadata withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
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
        if (getFunctionTags() != null)
            sb.append("FunctionTags: ").append(getFunctionTags()).append(",");
        if (getLayers() != null)
            sb.append("Layers: ").append(getLayers()).append(",");
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionMetadata == false)
            return false;
        LambdaFunctionMetadata other = (LambdaFunctionMetadata) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getFunctionTags() == null ^ this.getFunctionTags() == null)
            return false;
        if (other.getFunctionTags() != null && other.getFunctionTags().equals(this.getFunctionTags()) == false)
            return false;
        if (other.getLayers() == null ^ this.getLayers() == null)
            return false;
        if (other.getLayers() != null && other.getLayers().equals(this.getLayers()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getFunctionTags() == null) ? 0 : getFunctionTags().hashCode());
        hashCode = prime * hashCode + ((getLayers() == null) ? 0 : getLayers().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionMetadata clone() {
        try {
            return (LambdaFunctionMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.LambdaFunctionMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
