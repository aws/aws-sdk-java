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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadMultipartPartResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The SHA256 tree hash that Amazon Glacier computed for the uploaded part.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * The SHA256 tree hash that Amazon Glacier computed for the uploaded part.
     * </p>
     * 
     * @param checksum
     *        The SHA256 tree hash that Amazon Glacier computed for the uploaded part.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The SHA256 tree hash that Amazon Glacier computed for the uploaded part.
     * </p>
     * 
     * @return The SHA256 tree hash that Amazon Glacier computed for the uploaded part.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * The SHA256 tree hash that Amazon Glacier computed for the uploaded part.
     * </p>
     * 
     * @param checksum
     *        The SHA256 tree hash that Amazon Glacier computed for the uploaded part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadMultipartPartResult withChecksum(String checksum) {
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

        if (obj instanceof UploadMultipartPartResult == false)
            return false;
        UploadMultipartPartResult other = (UploadMultipartPartResult) obj;
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
    public UploadMultipartPartResult clone() {
        try {
            return (UploadMultipartPartResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
