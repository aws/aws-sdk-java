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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the position of the asset in a rack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/AssetLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The position of an asset in a rack measured in rack units.
     * </p>
     */
    private Float rackElevation;

    /**
     * <p>
     * The position of an asset in a rack measured in rack units.
     * </p>
     * 
     * @param rackElevation
     *        The position of an asset in a rack measured in rack units.
     */

    public void setRackElevation(Float rackElevation) {
        this.rackElevation = rackElevation;
    }

    /**
     * <p>
     * The position of an asset in a rack measured in rack units.
     * </p>
     * 
     * @return The position of an asset in a rack measured in rack units.
     */

    public Float getRackElevation() {
        return this.rackElevation;
    }

    /**
     * <p>
     * The position of an asset in a rack measured in rack units.
     * </p>
     * 
     * @param rackElevation
     *        The position of an asset in a rack measured in rack units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetLocation withRackElevation(Float rackElevation) {
        setRackElevation(rackElevation);
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
        if (getRackElevation() != null)
            sb.append("RackElevation: ").append(getRackElevation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetLocation == false)
            return false;
        AssetLocation other = (AssetLocation) obj;
        if (other.getRackElevation() == null ^ this.getRackElevation() == null)
            return false;
        if (other.getRackElevation() != null && other.getRackElevation().equals(this.getRackElevation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRackElevation() == null) ? 0 : getRackElevation().hashCode());
        return hashCode;
    }

    @Override
    public AssetLocation clone() {
        try {
            return (AssetLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.AssetLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
