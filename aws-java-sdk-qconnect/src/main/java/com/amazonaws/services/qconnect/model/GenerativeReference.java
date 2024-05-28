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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reference information about generative content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GenerativeReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerativeReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the LLM model.
     * </p>
     */
    private String generationId;
    /**
     * <p>
     * The identifier of the LLM model.
     * </p>
     */
    private String modelId;

    /**
     * <p>
     * The identifier of the LLM model.
     * </p>
     * 
     * @param generationId
     *        The identifier of the LLM model.
     */

    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    /**
     * <p>
     * The identifier of the LLM model.
     * </p>
     * 
     * @return The identifier of the LLM model.
     */

    public String getGenerationId() {
        return this.generationId;
    }

    /**
     * <p>
     * The identifier of the LLM model.
     * </p>
     * 
     * @param generationId
     *        The identifier of the LLM model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerativeReference withGenerationId(String generationId) {
        setGenerationId(generationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the LLM model.
     * </p>
     * 
     * @param modelId
     *        The identifier of the LLM model.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The identifier of the LLM model.
     * </p>
     * 
     * @return The identifier of the LLM model.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The identifier of the LLM model.
     * </p>
     * 
     * @param modelId
     *        The identifier of the LLM model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerativeReference withModelId(String modelId) {
        setModelId(modelId);
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
        if (getGenerationId() != null)
            sb.append("GenerationId: ").append(getGenerationId()).append(",");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerativeReference == false)
            return false;
        GenerativeReference other = (GenerativeReference) obj;
        if (other.getGenerationId() == null ^ this.getGenerationId() == null)
            return false;
        if (other.getGenerationId() != null && other.getGenerationId().equals(this.getGenerationId()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerationId() == null) ? 0 : getGenerationId().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        return hashCode;
    }

    @Override
    public GenerativeReference clone() {
        try {
            return (GenerativeReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.GenerativeReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
