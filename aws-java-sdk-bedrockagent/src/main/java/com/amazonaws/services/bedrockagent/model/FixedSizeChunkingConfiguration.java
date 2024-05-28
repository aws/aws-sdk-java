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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configurations for when you choose fixed-size chunking. If you set the <code>chunkingStrategy</code> as
 * <code>NONE</code>, exclude this field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FixedSizeChunkingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FixedSizeChunkingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of tokens to include in a chunk.
     * </p>
     */
    private Integer maxTokens;
    /**
     * <p>
     * The percentage of overlap between adjacent chunks of a data source.
     * </p>
     */
    private Integer overlapPercentage;

    /**
     * <p>
     * The maximum number of tokens to include in a chunk.
     * </p>
     * 
     * @param maxTokens
     *        The maximum number of tokens to include in a chunk.
     */

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    /**
     * <p>
     * The maximum number of tokens to include in a chunk.
     * </p>
     * 
     * @return The maximum number of tokens to include in a chunk.
     */

    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * <p>
     * The maximum number of tokens to include in a chunk.
     * </p>
     * 
     * @param maxTokens
     *        The maximum number of tokens to include in a chunk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedSizeChunkingConfiguration withMaxTokens(Integer maxTokens) {
        setMaxTokens(maxTokens);
        return this;
    }

    /**
     * <p>
     * The percentage of overlap between adjacent chunks of a data source.
     * </p>
     * 
     * @param overlapPercentage
     *        The percentage of overlap between adjacent chunks of a data source.
     */

    public void setOverlapPercentage(Integer overlapPercentage) {
        this.overlapPercentage = overlapPercentage;
    }

    /**
     * <p>
     * The percentage of overlap between adjacent chunks of a data source.
     * </p>
     * 
     * @return The percentage of overlap between adjacent chunks of a data source.
     */

    public Integer getOverlapPercentage() {
        return this.overlapPercentage;
    }

    /**
     * <p>
     * The percentage of overlap between adjacent chunks of a data source.
     * </p>
     * 
     * @param overlapPercentage
     *        The percentage of overlap between adjacent chunks of a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedSizeChunkingConfiguration withOverlapPercentage(Integer overlapPercentage) {
        setOverlapPercentage(overlapPercentage);
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
        if (getMaxTokens() != null)
            sb.append("MaxTokens: ").append(getMaxTokens()).append(",");
        if (getOverlapPercentage() != null)
            sb.append("OverlapPercentage: ").append(getOverlapPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FixedSizeChunkingConfiguration == false)
            return false;
        FixedSizeChunkingConfiguration other = (FixedSizeChunkingConfiguration) obj;
        if (other.getMaxTokens() == null ^ this.getMaxTokens() == null)
            return false;
        if (other.getMaxTokens() != null && other.getMaxTokens().equals(this.getMaxTokens()) == false)
            return false;
        if (other.getOverlapPercentage() == null ^ this.getOverlapPercentage() == null)
            return false;
        if (other.getOverlapPercentage() != null && other.getOverlapPercentage().equals(this.getOverlapPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxTokens() == null) ? 0 : getMaxTokens().hashCode());
        hashCode = prime * hashCode + ((getOverlapPercentage() == null) ? 0 : getOverlapPercentage().hashCode());
        return hashCode;
    }

    @Override
    public FixedSizeChunkingConfiguration clone() {
        try {
            return (FixedSizeChunkingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FixedSizeChunkingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
