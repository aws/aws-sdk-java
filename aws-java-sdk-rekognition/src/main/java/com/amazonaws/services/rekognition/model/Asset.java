/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Assets are the images that you use to train and evaluate a model version. Assets are referenced by Sagemaker
 * GroundTruth manifest files.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Asset implements Serializable, Cloneable, StructuredPojo {

    private GroundTruthManifest groundTruthManifest;

    /**
     * @param groundTruthManifest
     */

    public void setGroundTruthManifest(GroundTruthManifest groundTruthManifest) {
        this.groundTruthManifest = groundTruthManifest;
    }

    /**
     * @return
     */

    public GroundTruthManifest getGroundTruthManifest() {
        return this.groundTruthManifest;
    }

    /**
     * @param groundTruthManifest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Asset withGroundTruthManifest(GroundTruthManifest groundTruthManifest) {
        setGroundTruthManifest(groundTruthManifest);
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
        if (getGroundTruthManifest() != null)
            sb.append("GroundTruthManifest: ").append(getGroundTruthManifest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Asset == false)
            return false;
        Asset other = (Asset) obj;
        if (other.getGroundTruthManifest() == null ^ this.getGroundTruthManifest() == null)
            return false;
        if (other.getGroundTruthManifest() != null && other.getGroundTruthManifest().equals(this.getGroundTruthManifest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroundTruthManifest() == null) ? 0 : getGroundTruthManifest().hashCode());
        return hashCode;
    }

    @Override
    public Asset clone() {
        try {
            return (Asset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.AssetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
