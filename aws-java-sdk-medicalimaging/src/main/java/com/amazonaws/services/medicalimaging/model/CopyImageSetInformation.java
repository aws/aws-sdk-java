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
 * Copy image set information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CopyImageSetInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyImageSetInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source image set.
     * </p>
     */
    private CopySourceImageSetInformation sourceImageSet;
    /**
     * <p>
     * The destination image set.
     * </p>
     */
    private CopyDestinationImageSet destinationImageSet;

    /**
     * <p>
     * The source image set.
     * </p>
     * 
     * @param sourceImageSet
     *        The source image set.
     */

    public void setSourceImageSet(CopySourceImageSetInformation sourceImageSet) {
        this.sourceImageSet = sourceImageSet;
    }

    /**
     * <p>
     * The source image set.
     * </p>
     * 
     * @return The source image set.
     */

    public CopySourceImageSetInformation getSourceImageSet() {
        return this.sourceImageSet;
    }

    /**
     * <p>
     * The source image set.
     * </p>
     * 
     * @param sourceImageSet
     *        The source image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageSetInformation withSourceImageSet(CopySourceImageSetInformation sourceImageSet) {
        setSourceImageSet(sourceImageSet);
        return this;
    }

    /**
     * <p>
     * The destination image set.
     * </p>
     * 
     * @param destinationImageSet
     *        The destination image set.
     */

    public void setDestinationImageSet(CopyDestinationImageSet destinationImageSet) {
        this.destinationImageSet = destinationImageSet;
    }

    /**
     * <p>
     * The destination image set.
     * </p>
     * 
     * @return The destination image set.
     */

    public CopyDestinationImageSet getDestinationImageSet() {
        return this.destinationImageSet;
    }

    /**
     * <p>
     * The destination image set.
     * </p>
     * 
     * @param destinationImageSet
     *        The destination image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageSetInformation withDestinationImageSet(CopyDestinationImageSet destinationImageSet) {
        setDestinationImageSet(destinationImageSet);
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
        if (getSourceImageSet() != null)
            sb.append("SourceImageSet: ").append(getSourceImageSet()).append(",");
        if (getDestinationImageSet() != null)
            sb.append("DestinationImageSet: ").append(getDestinationImageSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyImageSetInformation == false)
            return false;
        CopyImageSetInformation other = (CopyImageSetInformation) obj;
        if (other.getSourceImageSet() == null ^ this.getSourceImageSet() == null)
            return false;
        if (other.getSourceImageSet() != null && other.getSourceImageSet().equals(this.getSourceImageSet()) == false)
            return false;
        if (other.getDestinationImageSet() == null ^ this.getDestinationImageSet() == null)
            return false;
        if (other.getDestinationImageSet() != null && other.getDestinationImageSet().equals(this.getDestinationImageSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceImageSet() == null) ? 0 : getSourceImageSet().hashCode());
        hashCode = prime * hashCode + ((getDestinationImageSet() == null) ? 0 : getDestinationImageSet().hashCode());
        return hashCode;
    }

    @Override
    public CopyImageSetInformation clone() {
        try {
            return (CopyImageSetInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.CopyImageSetInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
