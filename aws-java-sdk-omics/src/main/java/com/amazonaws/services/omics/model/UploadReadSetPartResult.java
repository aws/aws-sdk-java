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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UploadReadSetPart" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadReadSetPartResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier used to confirm that parts are being added to the intended upload.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * An identifier used to confirm that parts are being added to the intended upload.
     * </p>
     * 
     * @param checksum
     *        An identifier used to confirm that parts are being added to the intended upload.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * An identifier used to confirm that parts are being added to the intended upload.
     * </p>
     * 
     * @return An identifier used to confirm that parts are being added to the intended upload.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * An identifier used to confirm that parts are being added to the intended upload.
     * </p>
     * 
     * @param checksum
     *        An identifier used to confirm that parts are being added to the intended upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadReadSetPartResult withChecksum(String checksum) {
        setChecksum(checksum);
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
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadReadSetPartResult == false)
            return false;
        UploadReadSetPartResult other = (UploadReadSetPartResult) obj;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        return hashCode;
    }

    @Override
    public UploadReadSetPartResult clone() {
        try {
            return (UploadReadSetPartResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
