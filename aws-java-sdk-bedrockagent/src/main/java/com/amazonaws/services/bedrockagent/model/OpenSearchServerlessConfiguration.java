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
 * Contains details about the storage configuration of the knowledge base in Amazon OpenSearch Service. For more
 * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-oss.html">Create
 * a vector index in Amazon OpenSearch Service</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/OpenSearchServerlessConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenSearchServerlessConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
     * </p>
     */
    private String collectionArn;
    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     */
    private OpenSearchServerlessFieldMapping fieldMapping;
    /**
     * <p>
     * The name of the vector store.
     * </p>
     */
    private String vectorIndexName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
     * </p>
     * 
     * @param collectionArn
     *        The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
     */

    public void setCollectionArn(String collectionArn) {
        this.collectionArn = collectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
     */

    public String getCollectionArn() {
        return this.collectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
     * </p>
     * 
     * @param collectionArn
     *        The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenSearchServerlessConfiguration withCollectionArn(String collectionArn) {
        setCollectionArn(collectionArn);
        return this;
    }

    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     * 
     * @param fieldMapping
     *        Contains the names of the fields to which to map information about the vector store.
     */

    public void setFieldMapping(OpenSearchServerlessFieldMapping fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     * 
     * @return Contains the names of the fields to which to map information about the vector store.
     */

    public OpenSearchServerlessFieldMapping getFieldMapping() {
        return this.fieldMapping;
    }

    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     * 
     * @param fieldMapping
     *        Contains the names of the fields to which to map information about the vector store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenSearchServerlessConfiguration withFieldMapping(OpenSearchServerlessFieldMapping fieldMapping) {
        setFieldMapping(fieldMapping);
        return this;
    }

    /**
     * <p>
     * The name of the vector store.
     * </p>
     * 
     * @param vectorIndexName
     *        The name of the vector store.
     */

    public void setVectorIndexName(String vectorIndexName) {
        this.vectorIndexName = vectorIndexName;
    }

    /**
     * <p>
     * The name of the vector store.
     * </p>
     * 
     * @return The name of the vector store.
     */

    public String getVectorIndexName() {
        return this.vectorIndexName;
    }

    /**
     * <p>
     * The name of the vector store.
     * </p>
     * 
     * @param vectorIndexName
     *        The name of the vector store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenSearchServerlessConfiguration withVectorIndexName(String vectorIndexName) {
        setVectorIndexName(vectorIndexName);
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
        if (getCollectionArn() != null)
            sb.append("CollectionArn: ").append(getCollectionArn()).append(",");
        if (getFieldMapping() != null)
            sb.append("FieldMapping: ").append(getFieldMapping()).append(",");
        if (getVectorIndexName() != null)
            sb.append("VectorIndexName: ").append(getVectorIndexName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenSearchServerlessConfiguration == false)
            return false;
        OpenSearchServerlessConfiguration other = (OpenSearchServerlessConfiguration) obj;
        if (other.getCollectionArn() == null ^ this.getCollectionArn() == null)
            return false;
        if (other.getCollectionArn() != null && other.getCollectionArn().equals(this.getCollectionArn()) == false)
            return false;
        if (other.getFieldMapping() == null ^ this.getFieldMapping() == null)
            return false;
        if (other.getFieldMapping() != null && other.getFieldMapping().equals(this.getFieldMapping()) == false)
            return false;
        if (other.getVectorIndexName() == null ^ this.getVectorIndexName() == null)
            return false;
        if (other.getVectorIndexName() != null && other.getVectorIndexName().equals(this.getVectorIndexName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionArn() == null) ? 0 : getCollectionArn().hashCode());
        hashCode = prime * hashCode + ((getFieldMapping() == null) ? 0 : getFieldMapping().hashCode());
        hashCode = prime * hashCode + ((getVectorIndexName() == null) ? 0 : getVectorIndexName().hashCode());
        return hashCode;
    }

    @Override
    public OpenSearchServerlessConfiguration clone() {
        try {
            return (OpenSearchServerlessConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.OpenSearchServerlessConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
