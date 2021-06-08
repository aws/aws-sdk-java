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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensVersionDifference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLensVersionDifferenceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String lensAlias;
    /**
     * <p>
     * The base version of the lens.
     * </p>
     */
    private String baseLensVersion;

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

    public GetLensVersionDifferenceRequest withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * The base version of the lens.
     * </p>
     * 
     * @param baseLensVersion
     *        The base version of the lens.
     */

    public void setBaseLensVersion(String baseLensVersion) {
        this.baseLensVersion = baseLensVersion;
    }

    /**
     * <p>
     * The base version of the lens.
     * </p>
     * 
     * @return The base version of the lens.
     */

    public String getBaseLensVersion() {
        return this.baseLensVersion;
    }

    /**
     * <p>
     * The base version of the lens.
     * </p>
     * 
     * @param baseLensVersion
     *        The base version of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLensVersionDifferenceRequest withBaseLensVersion(String baseLensVersion) {
        setBaseLensVersion(baseLensVersion);
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
        if (getBaseLensVersion() != null)
            sb.append("BaseLensVersion: ").append(getBaseLensVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLensVersionDifferenceRequest == false)
            return false;
        GetLensVersionDifferenceRequest other = (GetLensVersionDifferenceRequest) obj;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getBaseLensVersion() == null ^ this.getBaseLensVersion() == null)
            return false;
        if (other.getBaseLensVersion() != null && other.getBaseLensVersion().equals(this.getBaseLensVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getBaseLensVersion() == null) ? 0 : getBaseLensVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetLensVersionDifferenceRequest clone() {
        return (GetLensVersionDifferenceRequest) super.clone();
    }

}
