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
 * A simple result wrapper around the Volume object that was sent over the wire.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVolumeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes a volume.
     * </p>
     */
    private Volume volume;

    /**
     * <p>
     * Describes a volume.
     * </p>
     * 
     * @param volume
     *        Describes a volume.
     */

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    /**
     * <p>
     * Describes a volume.
     * </p>
     * 
     * @return Describes a volume.
     */

    public Volume getVolume() {
        return this.volume;
    }

    /**
     * <p>
     * Describes a volume.
     * </p>
     * 
     * @param volume
     *        Describes a volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeResult withVolume(Volume volume) {
        setVolume(volume);
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
        if (getVolume() != null)
            sb.append("Volume: ").append(getVolume());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVolumeResult == false)
            return false;
        CreateVolumeResult other = (CreateVolumeResult) obj;
        if (other.getVolume() == null ^ this.getVolume() == null)
            return false;
        if (other.getVolume() != null && other.getVolume().equals(this.getVolume()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode());
        return hashCode;
    }

    @Override
    public CreateVolumeResult clone() {
        try {
            return (CreateVolumeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
