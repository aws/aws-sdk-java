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
 * Details about how to chunk the documents in the data source. A <i>chunk</i> refers to an excerpt from a data source
 * that is returned when the knowledge base that it belongs to is queried.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ChunkingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChunkingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Knowledge base can split your source data into chunks. A <i>chunk</i> refers to an excerpt from a data source
     * that is returned when the knowledge base that it belongs to is queried. You have the following options for
     * chunking your data. If you opt for <code>NONE</code>, then you may want to pre-process your files by splitting
     * them up such that each file corresponds to a chunk.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIXED_SIZE</code> – Amazon Bedrock splits your source data into chunks of the approximate size that you set
     * in the <code>fixedSizeChunkingConfiguration</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> – Amazon Bedrock treats each file as one chunk. If you choose this option, you may want to
     * pre-process your documents by splitting them into separate files.
     * </p>
     * </li>
     * </ul>
     */
    private String chunkingStrategy;
    /**
     * <p>
     * Configurations for when you choose fixed-size chunking. If you set the <code>chunkingStrategy</code> as
     * <code>NONE</code>, exclude this field.
     * </p>
     */
    private FixedSizeChunkingConfiguration fixedSizeChunkingConfiguration;

    /**
     * <p>
     * Knowledge base can split your source data into chunks. A <i>chunk</i> refers to an excerpt from a data source
     * that is returned when the knowledge base that it belongs to is queried. You have the following options for
     * chunking your data. If you opt for <code>NONE</code>, then you may want to pre-process your files by splitting
     * them up such that each file corresponds to a chunk.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIXED_SIZE</code> – Amazon Bedrock splits your source data into chunks of the approximate size that you set
     * in the <code>fixedSizeChunkingConfiguration</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> – Amazon Bedrock treats each file as one chunk. If you choose this option, you may want to
     * pre-process your documents by splitting them into separate files.
     * </p>
     * </li>
     * </ul>
     * 
     * @param chunkingStrategy
     *        Knowledge base can split your source data into chunks. A <i>chunk</i> refers to an excerpt from a data
     *        source that is returned when the knowledge base that it belongs to is queried. You have the following
     *        options for chunking your data. If you opt for <code>NONE</code>, then you may want to pre-process your
     *        files by splitting them up such that each file corresponds to a chunk.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FIXED_SIZE</code> – Amazon Bedrock splits your source data into chunks of the approximate size that
     *        you set in the <code>fixedSizeChunkingConfiguration</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> – Amazon Bedrock treats each file as one chunk. If you choose this option, you may want
     *        to pre-process your documents by splitting them into separate files.
     *        </p>
     *        </li>
     * @see ChunkingStrategy
     */

    public void setChunkingStrategy(String chunkingStrategy) {
        this.chunkingStrategy = chunkingStrategy;
    }

    /**
     * <p>
     * Knowledge base can split your source data into chunks. A <i>chunk</i> refers to an excerpt from a data source
     * that is returned when the knowledge base that it belongs to is queried. You have the following options for
     * chunking your data. If you opt for <code>NONE</code>, then you may want to pre-process your files by splitting
     * them up such that each file corresponds to a chunk.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIXED_SIZE</code> – Amazon Bedrock splits your source data into chunks of the approximate size that you set
     * in the <code>fixedSizeChunkingConfiguration</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> – Amazon Bedrock treats each file as one chunk. If you choose this option, you may want to
     * pre-process your documents by splitting them into separate files.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Knowledge base can split your source data into chunks. A <i>chunk</i> refers to an excerpt from a data
     *         source that is returned when the knowledge base that it belongs to is queried. You have the following
     *         options for chunking your data. If you opt for <code>NONE</code>, then you may want to pre-process your
     *         files by splitting them up such that each file corresponds to a chunk.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FIXED_SIZE</code> – Amazon Bedrock splits your source data into chunks of the approximate size that
     *         you set in the <code>fixedSizeChunkingConfiguration</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> – Amazon Bedrock treats each file as one chunk. If you choose this option, you may want
     *         to pre-process your documents by splitting them into separate files.
     *         </p>
     *         </li>
     * @see ChunkingStrategy
     */

    public String getChunkingStrategy() {
        return this.chunkingStrategy;
    }

    /**
     * <p>
     * Knowledge base can split your source data into chunks. A <i>chunk</i> refers to an excerpt from a data source
     * that is returned when the knowledge base that it belongs to is queried. You have the following options for
     * chunking your data. If you opt for <code>NONE</code>, then you may want to pre-process your files by splitting
     * them up such that each file corresponds to a chunk.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIXED_SIZE</code> – Amazon Bedrock splits your source data into chunks of the approximate size that you set
     * in the <code>fixedSizeChunkingConfiguration</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> – Amazon Bedrock treats each file as one chunk. If you choose this option, you may want to
     * pre-process your documents by splitting them into separate files.
     * </p>
     * </li>
     * </ul>
     * 
     * @param chunkingStrategy
     *        Knowledge base can split your source data into chunks. A <i>chunk</i> refers to an excerpt from a data
     *        source that is returned when the knowledge base that it belongs to is queried. You have the following
     *        options for chunking your data. If you opt for <code>NONE</code>, then you may want to pre-process your
     *        files by splitting them up such that each file corresponds to a chunk.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FIXED_SIZE</code> – Amazon Bedrock splits your source data into chunks of the approximate size that
     *        you set in the <code>fixedSizeChunkingConfiguration</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> – Amazon Bedrock treats each file as one chunk. If you choose this option, you may want
     *        to pre-process your documents by splitting them into separate files.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChunkingStrategy
     */

    public ChunkingConfiguration withChunkingStrategy(String chunkingStrategy) {
        setChunkingStrategy(chunkingStrategy);
        return this;
    }

    /**
     * <p>
     * Knowledge base can split your source data into chunks. A <i>chunk</i> refers to an excerpt from a data source
     * that is returned when the knowledge base that it belongs to is queried. You have the following options for
     * chunking your data. If you opt for <code>NONE</code>, then you may want to pre-process your files by splitting
     * them up such that each file corresponds to a chunk.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIXED_SIZE</code> – Amazon Bedrock splits your source data into chunks of the approximate size that you set
     * in the <code>fixedSizeChunkingConfiguration</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> – Amazon Bedrock treats each file as one chunk. If you choose this option, you may want to
     * pre-process your documents by splitting them into separate files.
     * </p>
     * </li>
     * </ul>
     * 
     * @param chunkingStrategy
     *        Knowledge base can split your source data into chunks. A <i>chunk</i> refers to an excerpt from a data
     *        source that is returned when the knowledge base that it belongs to is queried. You have the following
     *        options for chunking your data. If you opt for <code>NONE</code>, then you may want to pre-process your
     *        files by splitting them up such that each file corresponds to a chunk.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FIXED_SIZE</code> – Amazon Bedrock splits your source data into chunks of the approximate size that
     *        you set in the <code>fixedSizeChunkingConfiguration</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code> – Amazon Bedrock treats each file as one chunk. If you choose this option, you may want
     *        to pre-process your documents by splitting them into separate files.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChunkingStrategy
     */

    public ChunkingConfiguration withChunkingStrategy(ChunkingStrategy chunkingStrategy) {
        this.chunkingStrategy = chunkingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Configurations for when you choose fixed-size chunking. If you set the <code>chunkingStrategy</code> as
     * <code>NONE</code>, exclude this field.
     * </p>
     * 
     * @param fixedSizeChunkingConfiguration
     *        Configurations for when you choose fixed-size chunking. If you set the <code>chunkingStrategy</code> as
     *        <code>NONE</code>, exclude this field.
     */

    public void setFixedSizeChunkingConfiguration(FixedSizeChunkingConfiguration fixedSizeChunkingConfiguration) {
        this.fixedSizeChunkingConfiguration = fixedSizeChunkingConfiguration;
    }

    /**
     * <p>
     * Configurations for when you choose fixed-size chunking. If you set the <code>chunkingStrategy</code> as
     * <code>NONE</code>, exclude this field.
     * </p>
     * 
     * @return Configurations for when you choose fixed-size chunking. If you set the <code>chunkingStrategy</code> as
     *         <code>NONE</code>, exclude this field.
     */

    public FixedSizeChunkingConfiguration getFixedSizeChunkingConfiguration() {
        return this.fixedSizeChunkingConfiguration;
    }

    /**
     * <p>
     * Configurations for when you choose fixed-size chunking. If you set the <code>chunkingStrategy</code> as
     * <code>NONE</code>, exclude this field.
     * </p>
     * 
     * @param fixedSizeChunkingConfiguration
     *        Configurations for when you choose fixed-size chunking. If you set the <code>chunkingStrategy</code> as
     *        <code>NONE</code>, exclude this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChunkingConfiguration withFixedSizeChunkingConfiguration(FixedSizeChunkingConfiguration fixedSizeChunkingConfiguration) {
        setFixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration);
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
        if (getChunkingStrategy() != null)
            sb.append("ChunkingStrategy: ").append(getChunkingStrategy()).append(",");
        if (getFixedSizeChunkingConfiguration() != null)
            sb.append("FixedSizeChunkingConfiguration: ").append(getFixedSizeChunkingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChunkingConfiguration == false)
            return false;
        ChunkingConfiguration other = (ChunkingConfiguration) obj;
        if (other.getChunkingStrategy() == null ^ this.getChunkingStrategy() == null)
            return false;
        if (other.getChunkingStrategy() != null && other.getChunkingStrategy().equals(this.getChunkingStrategy()) == false)
            return false;
        if (other.getFixedSizeChunkingConfiguration() == null ^ this.getFixedSizeChunkingConfiguration() == null)
            return false;
        if (other.getFixedSizeChunkingConfiguration() != null
                && other.getFixedSizeChunkingConfiguration().equals(this.getFixedSizeChunkingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChunkingStrategy() == null) ? 0 : getChunkingStrategy().hashCode());
        hashCode = prime * hashCode + ((getFixedSizeChunkingConfiguration() == null) ? 0 : getFixedSizeChunkingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ChunkingConfiguration clone() {
        try {
            return (ChunkingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.ChunkingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
