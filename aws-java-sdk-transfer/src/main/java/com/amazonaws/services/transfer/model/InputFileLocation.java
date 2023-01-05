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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the location for the file being copied. Only applicable for the Copy type of workflow steps.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/InputFileLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputFileLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the details for the S3 file being copied.
     * </p>
     */
    private S3InputFileLocation s3FileLocation;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private EfsFileLocation efsFileLocation;

    /**
     * <p>
     * Specifies the details for the S3 file being copied.
     * </p>
     * 
     * @param s3FileLocation
     *        Specifies the details for the S3 file being copied.
     */

    public void setS3FileLocation(S3InputFileLocation s3FileLocation) {
        this.s3FileLocation = s3FileLocation;
    }

    /**
     * <p>
     * Specifies the details for the S3 file being copied.
     * </p>
     * 
     * @return Specifies the details for the S3 file being copied.
     */

    public S3InputFileLocation getS3FileLocation() {
        return this.s3FileLocation;
    }

    /**
     * <p>
     * Specifies the details for the S3 file being copied.
     * </p>
     * 
     * @param s3FileLocation
     *        Specifies the details for the S3 file being copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputFileLocation withS3FileLocation(S3InputFileLocation s3FileLocation) {
        setS3FileLocation(s3FileLocation);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param efsFileLocation
     *        Reserved for future use.
     */

    public void setEfsFileLocation(EfsFileLocation efsFileLocation) {
        this.efsFileLocation = efsFileLocation;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public EfsFileLocation getEfsFileLocation() {
        return this.efsFileLocation;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param efsFileLocation
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputFileLocation withEfsFileLocation(EfsFileLocation efsFileLocation) {
        setEfsFileLocation(efsFileLocation);
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
        if (getS3FileLocation() != null)
            sb.append("S3FileLocation: ").append(getS3FileLocation()).append(",");
        if (getEfsFileLocation() != null)
            sb.append("EfsFileLocation: ").append(getEfsFileLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputFileLocation == false)
            return false;
        InputFileLocation other = (InputFileLocation) obj;
        if (other.getS3FileLocation() == null ^ this.getS3FileLocation() == null)
            return false;
        if (other.getS3FileLocation() != null && other.getS3FileLocation().equals(this.getS3FileLocation()) == false)
            return false;
        if (other.getEfsFileLocation() == null ^ this.getEfsFileLocation() == null)
            return false;
        if (other.getEfsFileLocation() != null && other.getEfsFileLocation().equals(this.getEfsFileLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3FileLocation() == null) ? 0 : getS3FileLocation().hashCode());
        hashCode = prime * hashCode + ((getEfsFileLocation() == null) ? 0 : getEfsFileLocation().hashCode());
        return hashCode;
    }

    @Override
    public InputFileLocation clone() {
        try {
            return (InputFileLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.InputFileLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
