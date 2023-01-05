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
 * Information about the document, discovered during text extraction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DocumentMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of pages in the document.
     * </p>
     */
    private Integer pages;
    /**
     * <p>
     * List of pages in the document, with the number of characters extracted from each page.
     * </p>
     */
    private java.util.List<ExtractedCharactersListItem> extractedCharacters;

    /**
     * <p>
     * Number of pages in the document.
     * </p>
     * 
     * @param pages
     *        Number of pages in the document.
     */

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    /**
     * <p>
     * Number of pages in the document.
     * </p>
     * 
     * @return Number of pages in the document.
     */

    public Integer getPages() {
        return this.pages;
    }

    /**
     * <p>
     * Number of pages in the document.
     * </p>
     * 
     * @param pages
     *        Number of pages in the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadata withPages(Integer pages) {
        setPages(pages);
        return this;
    }

    /**
     * <p>
     * List of pages in the document, with the number of characters extracted from each page.
     * </p>
     * 
     * @return List of pages in the document, with the number of characters extracted from each page.
     */

    public java.util.List<ExtractedCharactersListItem> getExtractedCharacters() {
        return extractedCharacters;
    }

    /**
     * <p>
     * List of pages in the document, with the number of characters extracted from each page.
     * </p>
     * 
     * @param extractedCharacters
     *        List of pages in the document, with the number of characters extracted from each page.
     */

    public void setExtractedCharacters(java.util.Collection<ExtractedCharactersListItem> extractedCharacters) {
        if (extractedCharacters == null) {
            this.extractedCharacters = null;
            return;
        }

        this.extractedCharacters = new java.util.ArrayList<ExtractedCharactersListItem>(extractedCharacters);
    }

    /**
     * <p>
     * List of pages in the document, with the number of characters extracted from each page.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtractedCharacters(java.util.Collection)} or {@link #withExtractedCharacters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param extractedCharacters
     *        List of pages in the document, with the number of characters extracted from each page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadata withExtractedCharacters(ExtractedCharactersListItem... extractedCharacters) {
        if (this.extractedCharacters == null) {
            setExtractedCharacters(new java.util.ArrayList<ExtractedCharactersListItem>(extractedCharacters.length));
        }
        for (ExtractedCharactersListItem ele : extractedCharacters) {
            this.extractedCharacters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of pages in the document, with the number of characters extracted from each page.
     * </p>
     * 
     * @param extractedCharacters
     *        List of pages in the document, with the number of characters extracted from each page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadata withExtractedCharacters(java.util.Collection<ExtractedCharactersListItem> extractedCharacters) {
        setExtractedCharacters(extractedCharacters);
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
        if (getPages() != null)
            sb.append("Pages: ").append(getPages()).append(",");
        if (getExtractedCharacters() != null)
            sb.append("ExtractedCharacters: ").append(getExtractedCharacters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentMetadata == false)
            return false;
        DocumentMetadata other = (DocumentMetadata) obj;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        if (other.getExtractedCharacters() == null ^ this.getExtractedCharacters() == null)
            return false;
        if (other.getExtractedCharacters() != null && other.getExtractedCharacters().equals(this.getExtractedCharacters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        hashCode = prime * hashCode + ((getExtractedCharacters() == null) ? 0 : getExtractedCharacters().hashCode());
        return hashCode;
    }

    @Override
    public DocumentMetadata clone() {
        try {
            return (DocumentMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DocumentMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
