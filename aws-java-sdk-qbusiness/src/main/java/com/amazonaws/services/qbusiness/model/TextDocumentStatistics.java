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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about text documents in an index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/TextDocumentStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextDocumentStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     */
    private Long indexedTextBytes;
    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     */
    private Integer indexedTextDocumentCount;

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     * 
     * @param indexedTextBytes
     *        The total size, in bytes, of the indexed documents.
     */

    public void setIndexedTextBytes(Long indexedTextBytes) {
        this.indexedTextBytes = indexedTextBytes;
    }

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     * 
     * @return The total size, in bytes, of the indexed documents.
     */

    public Long getIndexedTextBytes() {
        return this.indexedTextBytes;
    }

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     * 
     * @param indexedTextBytes
     *        The total size, in bytes, of the indexed documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextDocumentStatistics withIndexedTextBytes(Long indexedTextBytes) {
        setIndexedTextBytes(indexedTextBytes);
        return this;
    }

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * 
     * @param indexedTextDocumentCount
     *        The number of text documents indexed.
     */

    public void setIndexedTextDocumentCount(Integer indexedTextDocumentCount) {
        this.indexedTextDocumentCount = indexedTextDocumentCount;
    }

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * 
     * @return The number of text documents indexed.
     */

    public Integer getIndexedTextDocumentCount() {
        return this.indexedTextDocumentCount;
    }

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * 
     * @param indexedTextDocumentCount
     *        The number of text documents indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextDocumentStatistics withIndexedTextDocumentCount(Integer indexedTextDocumentCount) {
        setIndexedTextDocumentCount(indexedTextDocumentCount);
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
        if (getIndexedTextBytes() != null)
            sb.append("IndexedTextBytes: ").append(getIndexedTextBytes()).append(",");
        if (getIndexedTextDocumentCount() != null)
            sb.append("IndexedTextDocumentCount: ").append(getIndexedTextDocumentCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextDocumentStatistics == false)
            return false;
        TextDocumentStatistics other = (TextDocumentStatistics) obj;
        if (other.getIndexedTextBytes() == null ^ this.getIndexedTextBytes() == null)
            return false;
        if (other.getIndexedTextBytes() != null && other.getIndexedTextBytes().equals(this.getIndexedTextBytes()) == false)
            return false;
        if (other.getIndexedTextDocumentCount() == null ^ this.getIndexedTextDocumentCount() == null)
            return false;
        if (other.getIndexedTextDocumentCount() != null && other.getIndexedTextDocumentCount().equals(this.getIndexedTextDocumentCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexedTextBytes() == null) ? 0 : getIndexedTextBytes().hashCode());
        hashCode = prime * hashCode + ((getIndexedTextDocumentCount() == null) ? 0 : getIndexedTextDocumentCount().hashCode());
        return hashCode;
    }

    @Override
    public TextDocumentStatistics clone() {
        try {
            return (TextDocumentStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.TextDocumentStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
