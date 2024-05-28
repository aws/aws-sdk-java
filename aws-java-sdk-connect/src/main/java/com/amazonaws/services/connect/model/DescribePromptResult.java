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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribePrompt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePromptResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the prompt.
     * </p>
     */
    private Prompt prompt;

    /**
     * <p>
     * Information about the prompt.
     * </p>
     * 
     * @param prompt
     *        Information about the prompt.
     */

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    /**
     * <p>
     * Information about the prompt.
     * </p>
     * 
     * @return Information about the prompt.
     */

    public Prompt getPrompt() {
        return this.prompt;
    }

    /**
     * <p>
     * Information about the prompt.
     * </p>
     * 
     * @param prompt
     *        Information about the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePromptResult withPrompt(Prompt prompt) {
        setPrompt(prompt);
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
        if (getPrompt() != null)
            sb.append("Prompt: ").append(getPrompt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePromptResult == false)
            return false;
        DescribePromptResult other = (DescribePromptResult) obj;
        if (other.getPrompt() == null ^ this.getPrompt() == null)
            return false;
        if (other.getPrompt() != null && other.getPrompt().equals(this.getPrompt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrompt() == null) ? 0 : getPrompt().hashCode());
        return hashCode;
    }

    @Override
    public DescribePromptResult clone() {
        try {
            return (DescribePromptResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
