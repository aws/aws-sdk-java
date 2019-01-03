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
 * A simple result wrapper around the VolumeAttachment object that was sent over the wire.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachVolumeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes volume attachment details.
     * </p>
     */
    private VolumeAttachment attachment;

    /**
     * <p>
     * Describes volume attachment details.
     * </p>
     * 
     * @param attachment
     *        Describes volume attachment details.
     */

    public void setAttachment(VolumeAttachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * Describes volume attachment details.
     * </p>
     * 
     * @return Describes volume attachment details.
     */

    public VolumeAttachment getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * Describes volume attachment details.
     * </p>
     * 
     * @param attachment
     *        Describes volume attachment details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachVolumeResult withAttachment(VolumeAttachment attachment) {
        setAttachment(attachment);
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
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachVolumeResult == false)
            return false;
        AttachVolumeResult other = (AttachVolumeResult) obj;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        return hashCode;
    }

    @Override
    public AttachVolumeResult clone() {
        try {
            return (AttachVolumeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
