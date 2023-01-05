/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure that lists each document processed in an AnalyzeID operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/IdentityDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Denotes the placement of a document in the IdentityDocument list. The first document is marked 1, the second 2
     * and so on.
     * </p>
     */
    private Integer documentIndex;
    /**
     * <p>
     * The structure used to record information extracted from identity documents. Contains both normalized field and
     * value of the extracted text.
     * </p>
     */
    private java.util.List<IdentityDocumentField> identityDocumentFields;
    /**
     * <p>
     * Individual word recognition, as returned by document detection.
     * </p>
     */
    private java.util.List<Block> blocks;

    /**
     * <p>
     * Denotes the placement of a document in the IdentityDocument list. The first document is marked 1, the second 2
     * and so on.
     * </p>
     * 
     * @param documentIndex
     *        Denotes the placement of a document in the IdentityDocument list. The first document is marked 1, the
     *        second 2 and so on.
     */

    public void setDocumentIndex(Integer documentIndex) {
        this.documentIndex = documentIndex;
    }

    /**
     * <p>
     * Denotes the placement of a document in the IdentityDocument list. The first document is marked 1, the second 2
     * and so on.
     * </p>
     * 
     * @return Denotes the placement of a document in the IdentityDocument list. The first document is marked 1, the
     *         second 2 and so on.
     */

    public Integer getDocumentIndex() {
        return this.documentIndex;
    }

    /**
     * <p>
     * Denotes the placement of a document in the IdentityDocument list. The first document is marked 1, the second 2
     * and so on.
     * </p>
     * 
     * @param documentIndex
     *        Denotes the placement of a document in the IdentityDocument list. The first document is marked 1, the
     *        second 2 and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityDocument withDocumentIndex(Integer documentIndex) {
        setDocumentIndex(documentIndex);
        return this;
    }

    /**
     * <p>
     * The structure used to record information extracted from identity documents. Contains both normalized field and
     * value of the extracted text.
     * </p>
     * 
     * @return The structure used to record information extracted from identity documents. Contains both normalized
     *         field and value of the extracted text.
     */

    public java.util.List<IdentityDocumentField> getIdentityDocumentFields() {
        return identityDocumentFields;
    }

    /**
     * <p>
     * The structure used to record information extracted from identity documents. Contains both normalized field and
     * value of the extracted text.
     * </p>
     * 
     * @param identityDocumentFields
     *        The structure used to record information extracted from identity documents. Contains both normalized field
     *        and value of the extracted text.
     */

    public void setIdentityDocumentFields(java.util.Collection<IdentityDocumentField> identityDocumentFields) {
        if (identityDocumentFields == null) {
            this.identityDocumentFields = null;
            return;
        }

        this.identityDocumentFields = new java.util.ArrayList<IdentityDocumentField>(identityDocumentFields);
    }

    /**
     * <p>
     * The structure used to record information extracted from identity documents. Contains both normalized field and
     * value of the extracted text.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityDocumentFields(java.util.Collection)} or
     * {@link #withIdentityDocumentFields(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param identityDocumentFields
     *        The structure used to record information extracted from identity documents. Contains both normalized field
     *        and value of the extracted text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityDocument withIdentityDocumentFields(IdentityDocumentField... identityDocumentFields) {
        if (this.identityDocumentFields == null) {
            setIdentityDocumentFields(new java.util.ArrayList<IdentityDocumentField>(identityDocumentFields.length));
        }
        for (IdentityDocumentField ele : identityDocumentFields) {
            this.identityDocumentFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The structure used to record information extracted from identity documents. Contains both normalized field and
     * value of the extracted text.
     * </p>
     * 
     * @param identityDocumentFields
     *        The structure used to record information extracted from identity documents. Contains both normalized field
     *        and value of the extracted text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityDocument withIdentityDocumentFields(java.util.Collection<IdentityDocumentField> identityDocumentFields) {
        setIdentityDocumentFields(identityDocumentFields);
        return this;
    }

    /**
     * <p>
     * Individual word recognition, as returned by document detection.
     * </p>
     * 
     * @return Individual word recognition, as returned by document detection.
     */

    public java.util.List<Block> getBlocks() {
        return blocks;
    }

    /**
     * <p>
     * Individual word recognition, as returned by document detection.
     * </p>
     * 
     * @param blocks
     *        Individual word recognition, as returned by document detection.
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
     * Individual word recognition, as returned by document detection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlocks(java.util.Collection)} or {@link #withBlocks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param blocks
     *        Individual word recognition, as returned by document detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityDocument withBlocks(Block... blocks) {
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
     * Individual word recognition, as returned by document detection.
     * </p>
     * 
     * @param blocks
     *        Individual word recognition, as returned by document detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityDocument withBlocks(java.util.Collection<Block> blocks) {
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
        if (getDocumentIndex() != null)
            sb.append("DocumentIndex: ").append(getDocumentIndex()).append(",");
        if (getIdentityDocumentFields() != null)
            sb.append("IdentityDocumentFields: ").append(getIdentityDocumentFields()).append(",");
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

        if (obj instanceof IdentityDocument == false)
            return false;
        IdentityDocument other = (IdentityDocument) obj;
        if (other.getDocumentIndex() == null ^ this.getDocumentIndex() == null)
            return false;
        if (other.getDocumentIndex() != null && other.getDocumentIndex().equals(this.getDocumentIndex()) == false)
            return false;
        if (other.getIdentityDocumentFields() == null ^ this.getIdentityDocumentFields() == null)
            return false;
        if (other.getIdentityDocumentFields() != null && other.getIdentityDocumentFields().equals(this.getIdentityDocumentFields()) == false)
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

        hashCode = prime * hashCode + ((getDocumentIndex() == null) ? 0 : getDocumentIndex().hashCode());
        hashCode = prime * hashCode + ((getIdentityDocumentFields() == null) ? 0 : getIdentityDocumentFields().hashCode());
        hashCode = prime * hashCode + ((getBlocks() == null) ? 0 : getBlocks().hashCode());
        return hashCode;
    }

    @Override
    public IdentityDocument clone() {
        try {
            return (IdentityDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.IdentityDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
