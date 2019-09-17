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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the input document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/DocumentMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of pages detected in the document.
     * </p>
     */
    private Integer pages;

    /**
     * <p>
     * The number of pages detected in the document.
     * </p>
     * 
     * @param pages
     *        The number of pages detected in the document.
     */

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    /**
     * <p>
     * The number of pages detected in the document.
     * </p>
     * 
     * @return The number of pages detected in the document.
     */

    public Integer getPages() {
        return this.pages;
    }

    /**
     * <p>
     * The number of pages detected in the document.
     * </p>
     * 
     * @param pages
     *        The number of pages detected in the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadata withPages(Integer pages) {
        setPages(pages);
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
            sb.append("Pages: ").append(getPages());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
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
        com.amazonaws.services.textract.model.transform.DocumentMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
