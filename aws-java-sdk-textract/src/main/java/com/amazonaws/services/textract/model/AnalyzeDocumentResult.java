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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyzeDocumentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Metadata about the analyzed document. An example is the number of pages.
     * </p>
     */
    private DocumentMetadata documentMetadata;
    /**
     * <p>
     * The text that's detected and analyzed by <code>AnalyzeDocument</code>.
     * </p>
     */
    private java.util.List<Block> blocks;

    /**
     * <p>
     * Metadata about the analyzed document. An example is the number of pages.
     * </p>
     * 
     * @param documentMetadata
     *        Metadata about the analyzed document. An example is the number of pages.
     */

    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Metadata about the analyzed document. An example is the number of pages.
     * </p>
     * 
     * @return Metadata about the analyzed document. An example is the number of pages.
     */

    public DocumentMetadata getDocumentMetadata() {
        return this.documentMetadata;
    }

    /**
     * <p>
     * Metadata about the analyzed document. An example is the number of pages.
     * </p>
     * 
     * @param documentMetadata
     *        Metadata about the analyzed document. An example is the number of pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeDocumentResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        setDocumentMetadata(documentMetadata);
        return this;
    }

    /**
     * <p>
     * The text that's detected and analyzed by <code>AnalyzeDocument</code>.
     * </p>
     * 
     * @return The text that's detected and analyzed by <code>AnalyzeDocument</code>.
     */

    public java.util.List<Block> getBlocks() {
        return blocks;
    }

    /**
     * <p>
     * The text that's detected and analyzed by <code>AnalyzeDocument</code>.
     * </p>
     * 
     * @param blocks
     *        The text that's detected and analyzed by <code>AnalyzeDocument</code>.
     */

    public void setBlocks(java.util.Collection<Block> blocks) {
        if (blocks == null) {
            this.blocks = null;
            return;
        }

        this.blocks = new java.util.ArrayList<Block>(blocks);
    }

    /**
     * <p>
     * The text that's detected and analyzed by <code>AnalyzeDocument</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlocks(java.util.Collection)} or {@link #withBlocks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param blocks
     *        The text that's detected and analyzed by <code>AnalyzeDocument</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeDocumentResult withBlocks(Block... blocks) {
        if (this.blocks == null) {
            setBlocks(new java.util.ArrayList<Block>(blocks.length));
        }
        for (Block ele : blocks) {
            this.blocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The text that's detected and analyzed by <code>AnalyzeDocument</code>.
     * </p>
     * 
     * @param blocks
     *        The text that's detected and analyzed by <code>AnalyzeDocument</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeDocumentResult withBlocks(java.util.Collection<Block> blocks) {
        setBlocks(blocks);
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
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: ").append(getDocumentMetadata()).append(",");
        if (getBlocks() != null)
            sb.append("Blocks: ").append(getBlocks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeDocumentResult == false)
            return false;
        AnalyzeDocumentResult other = (AnalyzeDocumentResult) obj;
        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getBlocks() == null ^ this.getBlocks() == null)
            return false;
        if (other.getBlocks() != null && other.getBlocks().equals(this.getBlocks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode + ((getBlocks() == null) ? 0 : getBlocks().hashCode());
        return hashCode;
    }

    @Override
    public AnalyzeDocumentResult clone() {
        try {
            return (AnalyzeDocumentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
