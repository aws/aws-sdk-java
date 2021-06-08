/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the location of a manifest file that Amazon Lookout for Vision uses to to create a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DatasetSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Location information for the manifest file.
     * </p>
     */
    private DatasetGroundTruthManifest groundTruthManifest;

    /**
     * <p>
     * Location information for the manifest file.
     * </p>
     * 
     * @param groundTruthManifest
     *        Location information for the manifest file.
     */

    public void setGroundTruthManifest(DatasetGroundTruthManifest groundTruthManifest) {
        this.groundTruthManifest = groundTruthManifest;
    }

    /**
     * <p>
     * Location information for the manifest file.
     * </p>
     * 
     * @return Location information for the manifest file.
     */

    public DatasetGroundTruthManifest getGroundTruthManifest() {
        return this.groundTruthManifest;
    }

    /**
     * <p>
     * Location information for the manifest file.
     * </p>
     * 
     * @param groundTruthManifest
     *        Location information for the manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSource withGroundTruthManifest(DatasetGroundTruthManifest groundTruthManifest) {
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

        if (obj instanceof DatasetSource == false)
            return false;
        DatasetSource other = (DatasetSource) obj;
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
    public DatasetSource clone() {
        try {
            return (DatasetSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.DatasetSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
