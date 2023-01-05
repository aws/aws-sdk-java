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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/FileInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file's content length.
     * </p>
     */
    private Long contentLength;
    /**
     * <p>
     * The file's part size.
     * </p>
     */
    private Long partSize;
    /**
     * <p>
     * The file's total parts.
     * </p>
     */
    private Integer totalParts;

    /**
     * <p>
     * The file's content length.
     * </p>
     * 
     * @param contentLength
     *        The file's content length.
     */

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * <p>
     * The file's content length.
     * </p>
     * 
     * @return The file's content length.
     */

    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * <p>
     * The file's content length.
     * </p>
     * 
     * @param contentLength
     *        The file's content length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileInformation withContentLength(Long contentLength) {
        setContentLength(contentLength);
        return this;
    }

    /**
     * <p>
     * The file's part size.
     * </p>
     * 
     * @param partSize
     *        The file's part size.
     */

    public void setPartSize(Long partSize) {
        this.partSize = partSize;
    }

    /**
     * <p>
     * The file's part size.
     * </p>
     * 
     * @return The file's part size.
     */

    public Long getPartSize() {
        return this.partSize;
    }

    /**
     * <p>
     * The file's part size.
     * </p>
     * 
     * @param partSize
     *        The file's part size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileInformation withPartSize(Long partSize) {
        setPartSize(partSize);
        return this;
    }

    /**
     * <p>
     * The file's total parts.
     * </p>
     * 
     * @param totalParts
     *        The file's total parts.
     */

    public void setTotalParts(Integer totalParts) {
        this.totalParts = totalParts;
    }

    /**
     * <p>
     * The file's total parts.
     * </p>
     * 
     * @return The file's total parts.
     */

    public Integer getTotalParts() {
        return this.totalParts;
    }

    /**
     * <p>
     * The file's total parts.
     * </p>
     * 
     * @param totalParts
     *        The file's total parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileInformation withTotalParts(Integer totalParts) {
        setTotalParts(totalParts);
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
        if (getContentLength() != null)
            sb.append("ContentLength: ").append(getContentLength()).append(",");
        if (getPartSize() != null)
            sb.append("PartSize: ").append(getPartSize()).append(",");
        if (getTotalParts() != null)
            sb.append("TotalParts: ").append(getTotalParts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileInformation == false)
            return false;
        FileInformation other = (FileInformation) obj;
        if (other.getContentLength() == null ^ this.getContentLength() == null)
            return false;
        if (other.getContentLength() != null && other.getContentLength().equals(this.getContentLength()) == false)
            return false;
        if (other.getPartSize() == null ^ this.getPartSize() == null)
            return false;
        if (other.getPartSize() != null && other.getPartSize().equals(this.getPartSize()) == false)
            return false;
        if (other.getTotalParts() == null ^ this.getTotalParts() == null)
            return false;
        if (other.getTotalParts() != null && other.getTotalParts().equals(this.getTotalParts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        hashCode = prime * hashCode + ((getPartSize() == null) ? 0 : getPartSize().hashCode());
        hashCode = prime * hashCode + ((getTotalParts() == null) ? 0 : getTotalParts().hashCode());
        return hashCode;
    }

    @Override
    public FileInformation clone() {
        try {
            return (FileInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.FileInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
