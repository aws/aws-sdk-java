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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetTile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The output binary file.
     * </p>
     */
    private java.io.InputStream binaryFile;

    /**
     * <p>
     * The output binary file.
     * </p>
     * 
     * @param binaryFile
     *        The output binary file.
     */

    public void setBinaryFile(java.io.InputStream binaryFile) {
        this.binaryFile = binaryFile;
    }

    /**
     * <p>
     * The output binary file.
     * </p>
     * 
     * @return The output binary file.
     */

    public java.io.InputStream getBinaryFile() {
        return this.binaryFile;
    }

    /**
     * <p>
     * The output binary file.
     * </p>
     * 
     * @param binaryFile
     *        The output binary file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileResult withBinaryFile(java.io.InputStream binaryFile) {
        setBinaryFile(binaryFile);
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
        if (getBinaryFile() != null)
            sb.append("BinaryFile: ").append(getBinaryFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTileResult == false)
            return false;
        GetTileResult other = (GetTileResult) obj;
        if (other.getBinaryFile() == null ^ this.getBinaryFile() == null)
            return false;
        if (other.getBinaryFile() != null && other.getBinaryFile().equals(this.getBinaryFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBinaryFile() == null) ? 0 : getBinaryFile().hashCode());
        return hashCode;
    }

    @Override
    public GetTileResult clone() {
        try {
            return (GetTileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
