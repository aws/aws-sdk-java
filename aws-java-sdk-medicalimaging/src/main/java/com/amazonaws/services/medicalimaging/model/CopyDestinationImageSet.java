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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Copy the destination image set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CopyDestinationImageSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDestinationImageSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image set identifier for the destination image set.
     * </p>
     */
    private String imageSetId;
    /**
     * <p>
     * The latest version identifier for the destination image set.
     * </p>
     */
    private String latestVersionId;

    /**
     * <p>
     * The image set identifier for the destination image set.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier for the destination image set.
     */

    public void setImageSetId(String imageSetId) {
        this.imageSetId = imageSetId;
    }

    /**
     * <p>
     * The image set identifier for the destination image set.
     * </p>
     * 
     * @return The image set identifier for the destination image set.
     */

    public String getImageSetId() {
        return this.imageSetId;
    }

    /**
     * <p>
     * The image set identifier for the destination image set.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier for the destination image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDestinationImageSet withImageSetId(String imageSetId) {
        setImageSetId(imageSetId);
        return this;
    }

    /**
     * <p>
     * The latest version identifier for the destination image set.
     * </p>
     * 
     * @param latestVersionId
     *        The latest version identifier for the destination image set.
     */

    public void setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
    }

    /**
     * <p>
     * The latest version identifier for the destination image set.
     * </p>
     * 
     * @return The latest version identifier for the destination image set.
     */

    public String getLatestVersionId() {
        return this.latestVersionId;
    }

    /**
     * <p>
     * The latest version identifier for the destination image set.
     * </p>
     * 
     * @param latestVersionId
     *        The latest version identifier for the destination image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDestinationImageSet withLatestVersionId(String latestVersionId) {
        setLatestVersionId(latestVersionId);
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
        if (getImageSetId() != null)
            sb.append("ImageSetId: ").append(getImageSetId()).append(",");
        if (getLatestVersionId() != null)
            sb.append("LatestVersionId: ").append(getLatestVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyDestinationImageSet == false)
            return false;
        CopyDestinationImageSet other = (CopyDestinationImageSet) obj;
        if (other.getImageSetId() == null ^ this.getImageSetId() == null)
            return false;
        if (other.getImageSetId() != null && other.getImageSetId().equals(this.getImageSetId()) == false)
            return false;
        if (other.getLatestVersionId() == null ^ this.getLatestVersionId() == null)
            return false;
        if (other.getLatestVersionId() != null && other.getLatestVersionId().equals(this.getLatestVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageSetId() == null) ? 0 : getImageSetId().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionId() == null) ? 0 : getLatestVersionId().hashCode());
        return hashCode;
    }

    @Override
    public CopyDestinationImageSet clone() {
        try {
            return (CopyDestinationImageSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.CopyDestinationImageSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
