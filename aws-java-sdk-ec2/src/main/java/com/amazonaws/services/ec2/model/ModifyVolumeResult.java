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
public class ModifyVolumeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the volume modification.
     * </p>
     */
    private VolumeModification volumeModification;

    /**
     * <p>
     * Information about the volume modification.
     * </p>
     * 
     * @param volumeModification
     *        Information about the volume modification.
     */

    public void setVolumeModification(VolumeModification volumeModification) {
        this.volumeModification = volumeModification;
    }

    /**
     * <p>
     * Information about the volume modification.
     * </p>
     * 
     * @return Information about the volume modification.
     */

    public VolumeModification getVolumeModification() {
        return this.volumeModification;
    }

    /**
     * <p>
     * Information about the volume modification.
     * </p>
     * 
     * @param volumeModification
     *        Information about the volume modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeResult withVolumeModification(VolumeModification volumeModification) {
        setVolumeModification(volumeModification);
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
        if (getVolumeModification() != null)
            sb.append("VolumeModification: ").append(getVolumeModification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVolumeResult == false)
            return false;
        ModifyVolumeResult other = (ModifyVolumeResult) obj;
        if (other.getVolumeModification() == null ^ this.getVolumeModification() == null)
            return false;
        if (other.getVolumeModification() != null && other.getVolumeModification().equals(this.getVolumeModification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeModification() == null) ? 0 : getVolumeModification().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVolumeResult clone() {
        try {
            return (ModifyVolumeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
