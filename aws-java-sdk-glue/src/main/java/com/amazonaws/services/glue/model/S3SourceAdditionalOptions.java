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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies additional connection options for the Amazon S3 data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/S3SourceAdditionalOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3SourceAdditionalOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets the upper limit for the target size of the dataset in bytes that will be processed.
     * </p>
     */
    private Long boundedSize;
    /**
     * <p>
     * Sets the upper limit for the target number of files that will be processed.
     * </p>
     */
    private Long boundedFiles;

    /**
     * <p>
     * Sets the upper limit for the target size of the dataset in bytes that will be processed.
     * </p>
     * 
     * @param boundedSize
     *        Sets the upper limit for the target size of the dataset in bytes that will be processed.
     */

    public void setBoundedSize(Long boundedSize) {
        this.boundedSize = boundedSize;
    }

    /**
     * <p>
     * Sets the upper limit for the target size of the dataset in bytes that will be processed.
     * </p>
     * 
     * @return Sets the upper limit for the target size of the dataset in bytes that will be processed.
     */

    public Long getBoundedSize() {
        return this.boundedSize;
    }

    /**
     * <p>
     * Sets the upper limit for the target size of the dataset in bytes that will be processed.
     * </p>
     * 
     * @param boundedSize
     *        Sets the upper limit for the target size of the dataset in bytes that will be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SourceAdditionalOptions withBoundedSize(Long boundedSize) {
        setBoundedSize(boundedSize);
        return this;
    }

    /**
     * <p>
     * Sets the upper limit for the target number of files that will be processed.
     * </p>
     * 
     * @param boundedFiles
     *        Sets the upper limit for the target number of files that will be processed.
     */

    public void setBoundedFiles(Long boundedFiles) {
        this.boundedFiles = boundedFiles;
    }

    /**
     * <p>
     * Sets the upper limit for the target number of files that will be processed.
     * </p>
     * 
     * @return Sets the upper limit for the target number of files that will be processed.
     */

    public Long getBoundedFiles() {
        return this.boundedFiles;
    }

    /**
     * <p>
     * Sets the upper limit for the target number of files that will be processed.
     * </p>
     * 
     * @param boundedFiles
     *        Sets the upper limit for the target number of files that will be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3SourceAdditionalOptions withBoundedFiles(Long boundedFiles) {
        setBoundedFiles(boundedFiles);
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
        if (getBoundedSize() != null)
            sb.append("BoundedSize: ").append(getBoundedSize()).append(",");
        if (getBoundedFiles() != null)
            sb.append("BoundedFiles: ").append(getBoundedFiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3SourceAdditionalOptions == false)
            return false;
        S3SourceAdditionalOptions other = (S3SourceAdditionalOptions) obj;
        if (other.getBoundedSize() == null ^ this.getBoundedSize() == null)
            return false;
        if (other.getBoundedSize() != null && other.getBoundedSize().equals(this.getBoundedSize()) == false)
            return false;
        if (other.getBoundedFiles() == null ^ this.getBoundedFiles() == null)
            return false;
        if (other.getBoundedFiles() != null && other.getBoundedFiles().equals(this.getBoundedFiles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoundedSize() == null) ? 0 : getBoundedSize().hashCode());
        hashCode = prime * hashCode + ((getBoundedFiles() == null) ? 0 : getBoundedFiles().hashCode());
        return hashCode;
    }

    @Override
    public S3SourceAdditionalOptions clone() {
        try {
            return (S3SourceAdditionalOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.S3SourceAdditionalOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
