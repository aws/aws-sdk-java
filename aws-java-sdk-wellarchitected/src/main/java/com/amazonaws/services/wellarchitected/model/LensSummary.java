/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A lens summary of a lens.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/LensSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LensSummary implements Serializable, Cloneable, StructuredPojo {

    private String lensAlias;
    /**
     * <p>
     * The version of the lens.
     * </p>
     */
    private String lensVersion;

    private String lensName;

    private String description;

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

    public LensSummary withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of the lens.
     */

    public void setLensVersion(String lensVersion) {
        this.lensVersion = lensVersion;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @return The version of the lens.
     */

    public String getLensVersion() {
        return this.lensVersion;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensSummary withLensVersion(String lensVersion) {
        setLensVersion(lensVersion);
        return this;
    }

    /**
     * @param lensName
     */

    public void setLensName(String lensName) {
        this.lensName = lensName;
    }

    /**
     * @return
     */

    public String getLensName() {
        return this.lensName;
    }

    /**
     * @param lensName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensSummary withLensName(String lensName) {
        setLensName(lensName);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensSummary withDescription(String description) {
        setDescription(description);
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
            sb.append("LensVersion: ").append(getLensVersion()).append(",");
        if (getLensName() != null)
            sb.append("LensName: ").append(getLensName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LensSummary == false)
            return false;
        LensSummary other = (LensSummary) obj;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getLensVersion() == null ^ this.getLensVersion() == null)
            return false;
        if (other.getLensVersion() != null && other.getLensVersion().equals(this.getLensVersion()) == false)
            return false;
        if (other.getLensName() == null ^ this.getLensName() == null)
            return false;
        if (other.getLensName() != null && other.getLensName().equals(this.getLensName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getLensVersion() == null) ? 0 : getLensVersion().hashCode());
        hashCode = prime * hashCode + ((getLensName() == null) ? 0 : getLensName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public LensSummary clone() {
        try {
            return (LensSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.LensSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
