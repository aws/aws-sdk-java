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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an asset for a code generation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CodegenJobAsset" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenJobAsset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL to use to access the asset.
     * </p>
     */
    private String downloadUrl;

    /**
     * <p>
     * The URL to use to access the asset.
     * </p>
     * 
     * @param downloadUrl
     *        The URL to use to access the asset.
     */

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * <p>
     * The URL to use to access the asset.
     * </p>
     * 
     * @return The URL to use to access the asset.
     */

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * <p>
     * The URL to use to access the asset.
     * </p>
     * 
     * @param downloadUrl
     *        The URL to use to access the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobAsset withDownloadUrl(String downloadUrl) {
        setDownloadUrl(downloadUrl);
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
        if (getDownloadUrl() != null)
            sb.append("DownloadUrl: ").append(getDownloadUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodegenJobAsset == false)
            return false;
        CodegenJobAsset other = (CodegenJobAsset) obj;
        if (other.getDownloadUrl() == null ^ this.getDownloadUrl() == null)
            return false;
        if (other.getDownloadUrl() != null && other.getDownloadUrl().equals(this.getDownloadUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        return hashCode;
    }

    @Override
    public CodegenJobAsset clone() {
        try {
            return (CodegenJobAsset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.CodegenJobAssetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
