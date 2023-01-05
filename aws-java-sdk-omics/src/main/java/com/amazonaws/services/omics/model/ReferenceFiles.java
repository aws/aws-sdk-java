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
 * A set of genome reference files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ReferenceFiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceFiles implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The files' index.
     * </p>
     */
    private FileInformation index;
    /**
     * <p>
     * The source file's location in Amazon S3.
     * </p>
     */
    private FileInformation source;

    /**
     * <p>
     * The files' index.
     * </p>
     * 
     * @param index
     *        The files' index.
     */

    public void setIndex(FileInformation index) {
        this.index = index;
    }

    /**
     * <p>
     * The files' index.
     * </p>
     * 
     * @return The files' index.
     */

    public FileInformation getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The files' index.
     * </p>
     * 
     * @param index
     *        The files' index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceFiles withIndex(FileInformation index) {
        setIndex(index);
        return this;
    }

    /**
     * <p>
     * The source file's location in Amazon S3.
     * </p>
     * 
     * @param source
     *        The source file's location in Amazon S3.
     */

    public void setSource(FileInformation source) {
        this.source = source;
    }

    /**
     * <p>
     * The source file's location in Amazon S3.
     * </p>
     * 
     * @return The source file's location in Amazon S3.
     */

    public FileInformation getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source file's location in Amazon S3.
     * </p>
     * 
     * @param source
     *        The source file's location in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceFiles withSource(FileInformation source) {
        setSource(source);
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
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceFiles == false)
            return false;
        ReferenceFiles other = (ReferenceFiles) obj;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceFiles clone() {
        try {
            return (ReferenceFiles) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ReferenceFilesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
