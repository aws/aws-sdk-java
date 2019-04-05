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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFunctionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration of the function or version.
     * </p>
     */
    private FunctionConfiguration configuration;
    /**
     * <p>
     * The deployment package of the function or version.
     * </p>
     */
    private FunctionCodeLocation code;
    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;
    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">reserved
     * concurrency</a>.
     * </p>
     */
    private Concurrency concurrency;

    /**
     * <p>
     * The configuration of the function or version.
     * </p>
     * 
     * @param configuration
     *        The configuration of the function or version.
     */

    public void setConfiguration(FunctionConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration of the function or version.
     * </p>
     * 
     * @return The configuration of the function or version.
     */

    public FunctionConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration of the function or version.
     * </p>
     * 
     * @param configuration
     *        The configuration of the function or version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionResult withConfiguration(FunctionConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The deployment package of the function or version.
     * </p>
     * 
     * @param code
     *        The deployment package of the function or version.
     */

    public void setCode(FunctionCodeLocation code) {
        this.code = code;
    }

    /**
     * <p>
     * The deployment package of the function or version.
     * </p>
     * 
     * @return The deployment package of the function or version.
     */

    public FunctionCodeLocation getCode() {
        return this.code;
    }

    /**
     * <p>
     * The deployment package of the function or version.
     * </p>
     * 
     * @param code
     *        The deployment package of the function or version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionResult withCode(FunctionCodeLocation code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>.
     * </p>
     * 
     * @return The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>.
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>.
     * </p>
     * 
     * @param tags
     *        The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>.
     * </p>
     * 
     * @param tags
     *        The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/tagging.html">tags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public GetFunctionResult addTagsEntry(String key, String value) {
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

    public GetFunctionResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">reserved
     * concurrency</a>.
     * </p>
     * 
     * @param concurrency
     *        The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">reserved
     *        concurrency</a>.
     */

    public void setConcurrency(Concurrency concurrency) {
        this.concurrency = concurrency;
    }

    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">reserved
     * concurrency</a>.
     * </p>
     * 
     * @return The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">reserved
     *         concurrency</a>.
     */

    public Concurrency getConcurrency() {
        return this.concurrency;
    }

    /**
     * <p>
     * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">reserved
     * concurrency</a>.
     * </p>
     * 
     * @param concurrency
     *        The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">reserved
     *        concurrency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionResult withConcurrency(Concurrency concurrency) {
        setConcurrency(concurrency);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getConcurrency() != null)
            sb.append("Concurrency: ").append(getConcurrency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFunctionResult == false)
            return false;
        GetFunctionResult other = (GetFunctionResult) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getConcurrency() == null ^ this.getConcurrency() == null)
            return false;
        if (other.getConcurrency() != null && other.getConcurrency().equals(this.getConcurrency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getConcurrency() == null) ? 0 : getConcurrency().hashCode());
        return hashCode;
    }

    @Override
    public GetFunctionResult clone() {
        try {
            return (GetFunctionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
