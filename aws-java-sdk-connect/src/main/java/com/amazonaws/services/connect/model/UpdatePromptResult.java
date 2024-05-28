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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePrompt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePromptResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     */
    private String promptARN;
    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     */
    private String promptId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     * 
     * @param promptARN
     *        The Amazon Resource Name (ARN) of the prompt.
     */

    public void setPromptARN(String promptARN) {
        this.promptARN = promptARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the prompt.
     */

    public String getPromptARN() {
        return this.promptARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     * 
     * @param promptARN
     *        The Amazon Resource Name (ARN) of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withPromptARN(String promptARN) {
        setPromptARN(promptARN);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     * 
     * @param promptId
     *        A unique identifier for the prompt.
     */

    public void setPromptId(String promptId) {
        this.promptId = promptId;
    }

    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     * 
     * @return A unique identifier for the prompt.
     */

    public String getPromptId() {
        return this.promptId;
    }

    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     * 
     * @param promptId
     *        A unique identifier for the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePromptResult withPromptId(String promptId) {
        setPromptId(promptId);
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
        if (getPromptARN() != null)
            sb.append("PromptARN: ").append(getPromptARN()).append(",");
        if (getPromptId() != null)
            sb.append("PromptId: ").append(getPromptId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePromptResult == false)
            return false;
        UpdatePromptResult other = (UpdatePromptResult) obj;
        if (other.getPromptARN() == null ^ this.getPromptARN() == null)
            return false;
        if (other.getPromptARN() != null && other.getPromptARN().equals(this.getPromptARN()) == false)
            return false;
        if (other.getPromptId() == null ^ this.getPromptId() == null)
            return false;
        if (other.getPromptId() != null && other.getPromptId().equals(this.getPromptId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPromptARN() == null) ? 0 : getPromptARN().hashCode());
        hashCode = prime * hashCode + ((getPromptId() == null) ? 0 : getPromptId().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePromptResult clone() {
        try {
            return (UpdatePromptResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
