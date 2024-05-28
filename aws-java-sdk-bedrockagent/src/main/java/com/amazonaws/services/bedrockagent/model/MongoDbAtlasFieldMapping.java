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
 * Contains the names of the fields to which to map information about the vector store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/MongoDbAtlasFieldMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MongoDbAtlasFieldMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores metadata about the vector store.
     * </p>
     */
    private String metadataField;
    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores the raw text from your data. The text is split according to
     * the chunking strategy you choose.
     * </p>
     */
    private String textField;
    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores the vector embeddings for your data sources.
     * </p>
     */
    private String vectorField;

    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores metadata about the vector store.
     * </p>
     * 
     * @param metadataField
     *        The name of the field in which Amazon Bedrock stores metadata about the vector store.
     */

    public void setMetadataField(String metadataField) {
        this.metadataField = metadataField;
    }

    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores metadata about the vector store.
     * </p>
     * 
     * @return The name of the field in which Amazon Bedrock stores metadata about the vector store.
     */

    public String getMetadataField() {
        return this.metadataField;
    }

    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores metadata about the vector store.
     * </p>
     * 
     * @param metadataField
     *        The name of the field in which Amazon Bedrock stores metadata about the vector store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbAtlasFieldMapping withMetadataField(String metadataField) {
        setMetadataField(metadataField);
        return this;
    }

    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores the raw text from your data. The text is split according to
     * the chunking strategy you choose.
     * </p>
     * 
     * @param textField
     *        The name of the field in which Amazon Bedrock stores the raw text from your data. The text is split
     *        according to the chunking strategy you choose.
     */

    public void setTextField(String textField) {
        this.textField = textField;
    }

    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores the raw text from your data. The text is split according to
     * the chunking strategy you choose.
     * </p>
     * 
     * @return The name of the field in which Amazon Bedrock stores the raw text from your data. The text is split
     *         according to the chunking strategy you choose.
     */

    public String getTextField() {
        return this.textField;
    }

    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores the raw text from your data. The text is split according to
     * the chunking strategy you choose.
     * </p>
     * 
     * @param textField
     *        The name of the field in which Amazon Bedrock stores the raw text from your data. The text is split
     *        according to the chunking strategy you choose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbAtlasFieldMapping withTextField(String textField) {
        setTextField(textField);
        return this;
    }

    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores the vector embeddings for your data sources.
     * </p>
     * 
     * @param vectorField
     *        The name of the field in which Amazon Bedrock stores the vector embeddings for your data sources.
     */

    public void setVectorField(String vectorField) {
        this.vectorField = vectorField;
    }

    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores the vector embeddings for your data sources.
     * </p>
     * 
     * @return The name of the field in which Amazon Bedrock stores the vector embeddings for your data sources.
     */

    public String getVectorField() {
        return this.vectorField;
    }

    /**
     * <p>
     * The name of the field in which Amazon Bedrock stores the vector embeddings for your data sources.
     * </p>
     * 
     * @param vectorField
     *        The name of the field in which Amazon Bedrock stores the vector embeddings for your data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbAtlasFieldMapping withVectorField(String vectorField) {
        setVectorField(vectorField);
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
        if (getMetadataField() != null)
            sb.append("MetadataField: ").append(getMetadataField()).append(",");
        if (getTextField() != null)
            sb.append("TextField: ").append(getTextField()).append(",");
        if (getVectorField() != null)
            sb.append("VectorField: ").append(getVectorField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MongoDbAtlasFieldMapping == false)
            return false;
        MongoDbAtlasFieldMapping other = (MongoDbAtlasFieldMapping) obj;
        if (other.getMetadataField() == null ^ this.getMetadataField() == null)
            return false;
        if (other.getMetadataField() != null && other.getMetadataField().equals(this.getMetadataField()) == false)
            return false;
        if (other.getTextField() == null ^ this.getTextField() == null)
            return false;
        if (other.getTextField() != null && other.getTextField().equals(this.getTextField()) == false)
            return false;
        if (other.getVectorField() == null ^ this.getVectorField() == null)
            return false;
        if (other.getVectorField() != null && other.getVectorField().equals(this.getVectorField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataField() == null) ? 0 : getMetadataField().hashCode());
        hashCode = prime * hashCode + ((getTextField() == null) ? 0 : getTextField().hashCode());
        hashCode = prime * hashCode + ((getVectorField() == null) ? 0 : getVectorField().hashCode());
        return hashCode;
    }

    @Override
    public MongoDbAtlasFieldMapping clone() {
        try {
            return (MongoDbAtlasFieldMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.MongoDbAtlasFieldMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
