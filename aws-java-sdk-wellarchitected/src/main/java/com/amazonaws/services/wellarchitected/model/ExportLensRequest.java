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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ExportLens" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportLensRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String lensAlias;
    /**
     * <p>
     * The lens version to be exported.
     * </p>
     */
    private String lensVersion;

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLensRequest withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * The lens version to be exported.
     * </p>
     * 
     * @param lensVersion
     *        The lens version to be exported.
     */

    public void setLensVersion(String lensVersion) {
        this.lensVersion = lensVersion;
    }

    /**
     * <p>
     * The lens version to be exported.
     * </p>
     * 
     * @return The lens version to be exported.
     */

    public String getLensVersion() {
        return this.lensVersion;
    }

    /**
     * <p>
     * The lens version to be exported.
     * </p>
     * 
     * @param lensVersion
     *        The lens version to be exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLensRequest withLensVersion(String lensVersion) {
        setLensVersion(lensVersion);
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
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getLensVersion() != null)
            sb.append("LensVersion: ").append(getLensVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportLensRequest == false)
            return false;
        ExportLensRequest other = (ExportLensRequest) obj;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getLensVersion() == null ^ this.getLensVersion() == null)
            return false;
        if (other.getLensVersion() != null && other.getLensVersion().equals(this.getLensVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getLensVersion() == null) ? 0 : getLensVersion().hashCode());
        return hashCode;
    }

    @Override
    public ExportLensRequest clone() {
        return (ExportLensRequest) super.clone();
    }

}
