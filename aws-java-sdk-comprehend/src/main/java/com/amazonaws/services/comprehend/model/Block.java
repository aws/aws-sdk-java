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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about each word or line of text in the input document.
 * </p>
 * <p>
 * For additional information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/API_Block.html">Block</a> in
 * the Amazon Textract API reference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/Block" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Block implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a document page
     * </p>
     * </li>
     * </ul>
     */
    private String blockType;
    /**
     * <p>
     * The word or line of text extracted from the block.
     * </p>
     */
    private String text;
    /**
     * <p>
     * Page number where the block appears.
     * </p>
     */
    private Integer page;
    /**
     * <p>
     * Co-ordinates of the rectangle or polygon that contains the text.
     * </p>
     */
    private Geometry geometry;
    /**
     * <p>
     * A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD block
     * that's part of the line of text.
     * </p>
     */
    private java.util.List<RelationshipsListItem> relationships;

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * 
     * @param id
     *        Unique identifier for the block.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * 
     * @return Unique identifier for the block.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * 
     * @param id
     *        Unique identifier for the block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a document page
     * </p>
     * </li>
     * </ul>
     * 
     * @param blockType
     *        The block represents a line of text or one word of text.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters
     *        that aren't separated by spaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINE - A string of tab-delimited, contiguous words that are detected on a document page
     *        </p>
     *        </li>
     * @see BlockType
     */

    public void setBlockType(String blockType) {
        this.blockType = blockType;
    }

    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a document page
     * </p>
     * </li>
     * </ul>
     * 
     * @return The block represents a line of text or one word of text.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters
     *         that aren't separated by spaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LINE - A string of tab-delimited, contiguous words that are detected on a document page
     *         </p>
     *         </li>
     * @see BlockType
     */

    public String getBlockType() {
        return this.blockType;
    }

    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a document page
     * </p>
     * </li>
     * </ul>
     * 
     * @param blockType
     *        The block represents a line of text or one word of text.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters
     *        that aren't separated by spaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINE - A string of tab-delimited, contiguous words that are detected on a document page
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockType
     */

    public Block withBlockType(String blockType) {
        setBlockType(blockType);
        return this;
    }

    /**
     * <p>
     * The block represents a line of text or one word of text.
     * </p>
     * <ul>
     * <li>
     * <p>
     * WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINE - A string of tab-delimited, contiguous words that are detected on a document page
     * </p>
     * </li>
     * </ul>
     * 
     * @param blockType
     *        The block represents a line of text or one word of text.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters
     *        that aren't separated by spaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINE - A string of tab-delimited, contiguous words that are detected on a document page
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockType
     */

    public Block withBlockType(BlockType blockType) {
        this.blockType = blockType.toString();
        return this;
    }

    /**
     * <p>
     * The word or line of text extracted from the block.
     * </p>
     * 
     * @param text
     *        The word or line of text extracted from the block.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The word or line of text extracted from the block.
     * </p>
     * 
     * @return The word or line of text extracted from the block.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The word or line of text extracted from the block.
     * </p>
     * 
     * @param text
     *        The word or line of text extracted from the block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * Page number where the block appears.
     * </p>
     * 
     * @param page
     *        Page number where the block appears.
     */

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * Page number where the block appears.
     * </p>
     * 
     * @return Page number where the block appears.
     */

    public Integer getPage() {
        return this.page;
    }

    /**
     * <p>
     * Page number where the block appears.
     * </p>
     * 
     * @param page
     *        Page number where the block appears.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withPage(Integer page) {
        setPage(page);
        return this;
    }

    /**
     * <p>
     * Co-ordinates of the rectangle or polygon that contains the text.
     * </p>
     * 
     * @param geometry
     *        Co-ordinates of the rectangle or polygon that contains the text.
     */

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Co-ordinates of the rectangle or polygon that contains the text.
     * </p>
     * 
     * @return Co-ordinates of the rectangle or polygon that contains the text.
     */

    public Geometry getGeometry() {
        return this.geometry;
    }

    /**
     * <p>
     * Co-ordinates of the rectangle or polygon that contains the text.
     * </p>
     * 
     * @param geometry
     *        Co-ordinates of the rectangle or polygon that contains the text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withGeometry(Geometry geometry) {
        setGeometry(geometry);
        return this;
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD block
     * that's part of the line of text.
     * </p>
     * 
     * @return A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD
     *         block that's part of the line of text.
     */

    public java.util.List<RelationshipsListItem> getRelationships() {
        return relationships;
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD block
     * that's part of the line of text.
     * </p>
     * 
     * @param relationships
     *        A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD
     *        block that's part of the line of text.
     */

    public void setRelationships(java.util.Collection<RelationshipsListItem> relationships) {
        if (relationships == null) {
            this.relationships = null;
            return;
        }

        this.relationships = new java.util.ArrayList<RelationshipsListItem>(relationships);
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD block
     * that's part of the line of text.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelationships(java.util.Collection)} or {@link #withRelationships(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param relationships
     *        A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD
     *        block that's part of the line of text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withRelationships(RelationshipsListItem... relationships) {
        if (this.relationships == null) {
            setRelationships(new java.util.ArrayList<RelationshipsListItem>(relationships.length));
        }
        for (RelationshipsListItem ele : relationships) {
            this.relationships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD block
     * that's part of the line of text.
     * </p>
     * 
     * @param relationships
     *        A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD
     *        block that's part of the line of text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withRelationships(java.util.Collection<RelationshipsListItem> relationships) {
        setRelationships(relationships);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getBlockType() != null)
            sb.append("BlockType: ").append(getBlockType()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getPage() != null)
            sb.append("Page: ").append(getPage()).append(",");
        if (getGeometry() != null)
            sb.append("Geometry: ").append(getGeometry()).append(",");
        if (getRelationships() != null)
            sb.append("Relationships: ").append(getRelationships());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Block == false)
            return false;
        Block other = (Block) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getBlockType() == null ^ this.getBlockType() == null)
            return false;
        if (other.getBlockType() != null && other.getBlockType().equals(this.getBlockType()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getRelationships() == null ^ this.getRelationships() == null)
            return false;
        if (other.getRelationships() != null && other.getRelationships().equals(this.getRelationships()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getBlockType() == null) ? 0 : getBlockType().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode + ((getRelationships() == null) ? 0 : getRelationships().hashCode());
        return hashCode;
    }

    @Override
    public Block clone() {
        try {
            return (Block) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.BlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
