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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon S3 storage options that are configured for your server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/S3StorageOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3StorageOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default.
     * </p>
     * <p>
     * By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     * option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     * <code>FILE</code> if you want a mapping to have a file target.
     * </p>
     */
    private String directoryListingOptimization;

    /**
     * <p>
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default.
     * </p>
     * <p>
     * By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     * option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     * <code>FILE</code> if you want a mapping to have a file target.
     * </p>
     * 
     * @param directoryListingOptimization
     *        Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by
     *        default.</p>
     *        <p>
     *        By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     *        option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     *        <code>FILE</code> if you want a mapping to have a file target.
     * @see DirectoryListingOptimization
     */

    public void setDirectoryListingOptimization(String directoryListingOptimization) {
        this.directoryListingOptimization = directoryListingOptimization;
    }

    /**
     * <p>
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default.
     * </p>
     * <p>
     * By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     * option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     * <code>FILE</code> if you want a mapping to have a file target.
     * </p>
     * 
     * @return Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by
     *         default.</p>
     *         <p>
     *         By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable
     *         this option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code>
     *         <code>Type</code> to <code>FILE</code> if you want a mapping to have a file target.
     * @see DirectoryListingOptimization
     */

    public String getDirectoryListingOptimization() {
        return this.directoryListingOptimization;
    }

    /**
     * <p>
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default.
     * </p>
     * <p>
     * By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     * option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     * <code>FILE</code> if you want a mapping to have a file target.
     * </p>
     * 
     * @param directoryListingOptimization
     *        Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by
     *        default.</p>
     *        <p>
     *        By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     *        option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     *        <code>FILE</code> if you want a mapping to have a file target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryListingOptimization
     */

    public S3StorageOptions withDirectoryListingOptimization(String directoryListingOptimization) {
        setDirectoryListingOptimization(directoryListingOptimization);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by default.
     * </p>
     * <p>
     * By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     * option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     * <code>FILE</code> if you want a mapping to have a file target.
     * </p>
     * 
     * @param directoryListingOptimization
     *        Specifies whether or not performance for your Amazon S3 directories is optimized. This is disabled by
     *        default.</p>
     *        <p>
     *        By default, home directory mappings have a <code>TYPE</code> of <code>DIRECTORY</code>. If you enable this
     *        option, you would then need to explicitly set the <code>HomeDirectoryMapEntry</code> <code>Type</code> to
     *        <code>FILE</code> if you want a mapping to have a file target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryListingOptimization
     */

    public S3StorageOptions withDirectoryListingOptimization(DirectoryListingOptimization directoryListingOptimization) {
        this.directoryListingOptimization = directoryListingOptimization.toString();
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
        if (getDirectoryListingOptimization() != null)
            sb.append("DirectoryListingOptimization: ").append(getDirectoryListingOptimization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3StorageOptions == false)
            return false;
        S3StorageOptions other = (S3StorageOptions) obj;
        if (other.getDirectoryListingOptimization() == null ^ this.getDirectoryListingOptimization() == null)
            return false;
        if (other.getDirectoryListingOptimization() != null && other.getDirectoryListingOptimization().equals(this.getDirectoryListingOptimization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryListingOptimization() == null) ? 0 : getDirectoryListingOptimization().hashCode());
        return hashCode;
    }

    @Override
    public S3StorageOptions clone() {
        try {
            return (S3StorageOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.S3StorageOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
