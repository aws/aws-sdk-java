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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ExportLens" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportLensResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The JSON for the lens.
     * </p>
     */
    private String lensJSON;

    /**
     * <p>
     * The JSON for the lens.
     * </p>
     * 
     * @param lensJSON
     *        The JSON for the lens.
     */

    public void setLensJSON(String lensJSON) {
        this.lensJSON = lensJSON;
    }

    /**
     * <p>
     * The JSON for the lens.
     * </p>
     * 
     * @return The JSON for the lens.
     */

    public String getLensJSON() {
        return this.lensJSON;
    }

    /**
     * <p>
     * The JSON for the lens.
     * </p>
     * 
     * @param lensJSON
     *        The JSON for the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLensResult withLensJSON(String lensJSON) {
        setLensJSON(lensJSON);
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
        if (getLensJSON() != null)
            sb.append("LensJSON: ").append(getLensJSON());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportLensResult == false)
            return false;
        ExportLensResult other = (ExportLensResult) obj;
        if (other.getLensJSON() == null ^ this.getLensJSON() == null)
            return false;
        if (other.getLensJSON() != null && other.getLensJSON().equals(this.getLensJSON()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensJSON() == null) ? 0 : getLensJSON().hashCode());
        return hashCode;
    }

    @Override
    public ExportLensResult clone() {
        try {
            return (ExportLensResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
