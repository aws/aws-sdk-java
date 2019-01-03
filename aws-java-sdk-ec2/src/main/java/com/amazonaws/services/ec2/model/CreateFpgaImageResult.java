/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFpgaImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     */
    private String fpgaImageId;
    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     */
    private String fpgaImageGlobalId;

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     * 
     * @param fpgaImageId
     *        The FPGA image identifier (AFI ID).
     */

    public void setFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
    }

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     * 
     * @return The FPGA image identifier (AFI ID).
     */

    public String getFpgaImageId() {
        return this.fpgaImageId;
    }

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     * 
     * @param fpgaImageId
     *        The FPGA image identifier (AFI ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFpgaImageResult withFpgaImageId(String fpgaImageId) {
        setFpgaImageId(fpgaImageId);
        return this;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     * 
     * @param fpgaImageGlobalId
     *        The global FPGA image identifier (AGFI ID).
     */

    public void setFpgaImageGlobalId(String fpgaImageGlobalId) {
        this.fpgaImageGlobalId = fpgaImageGlobalId;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     * 
     * @return The global FPGA image identifier (AGFI ID).
     */

    public String getFpgaImageGlobalId() {
        return this.fpgaImageGlobalId;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     * 
     * @param fpgaImageGlobalId
     *        The global FPGA image identifier (AGFI ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFpgaImageResult withFpgaImageGlobalId(String fpgaImageGlobalId) {
        setFpgaImageGlobalId(fpgaImageGlobalId);
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
        if (getFpgaImageId() != null)
            sb.append("FpgaImageId: ").append(getFpgaImageId()).append(",");
        if (getFpgaImageGlobalId() != null)
            sb.append("FpgaImageGlobalId: ").append(getFpgaImageGlobalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFpgaImageResult == false)
            return false;
        CreateFpgaImageResult other = (CreateFpgaImageResult) obj;
        if (other.getFpgaImageId() == null ^ this.getFpgaImageId() == null)
            return false;
        if (other.getFpgaImageId() != null && other.getFpgaImageId().equals(this.getFpgaImageId()) == false)
            return false;
        if (other.getFpgaImageGlobalId() == null ^ this.getFpgaImageGlobalId() == null)
            return false;
        if (other.getFpgaImageGlobalId() != null && other.getFpgaImageGlobalId().equals(this.getFpgaImageGlobalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgaImageId() == null) ? 0 : getFpgaImageId().hashCode());
        hashCode = prime * hashCode + ((getFpgaImageGlobalId() == null) ? 0 : getFpgaImageGlobalId().hashCode());
        return hashCode;
    }

    @Override
    public CreateFpgaImageResult clone() {
        try {
            return (CreateFpgaImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
