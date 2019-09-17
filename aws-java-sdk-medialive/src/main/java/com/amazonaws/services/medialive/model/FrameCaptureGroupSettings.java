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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Frame Capture Group Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/FrameCaptureGroupSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FrameCaptureGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * The destination for the frame capture files. Either the URI for an Amazon S3 bucket and object, plus a file name
     * prefix (for example, s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a MediaStore container,
     * plus a file name prefix (for example, mediastoressl://sportsDelivery/20180820/curling_). The final file names
     * consist of the prefix from the destination field (for example, "curling_") + name modifier + the counter (5
     * digits, starting from 00001) + extension (which is always .jpg). For example, curlingLow.00001.jpg
     */
    private OutputLocationRef destination;

    /**
     * The destination for the frame capture files. Either the URI for an Amazon S3 bucket and object, plus a file name
     * prefix (for example, s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a MediaStore container,
     * plus a file name prefix (for example, mediastoressl://sportsDelivery/20180820/curling_). The final file names
     * consist of the prefix from the destination field (for example, "curling_") + name modifier + the counter (5
     * digits, starting from 00001) + extension (which is always .jpg). For example, curlingLow.00001.jpg
     * 
     * @param destination
     *        The destination for the frame capture files. Either the URI for an Amazon S3 bucket and object, plus a
     *        file name prefix (for example, s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a
     *        MediaStore container, plus a file name prefix (for example,
     *        mediastoressl://sportsDelivery/20180820/curling_). The final file names consist of the prefix from the
     *        destination field (for example, "curling_") + name modifier + the counter (5 digits, starting from 00001)
     *        + extension (which is always .jpg). For example, curlingLow.00001.jpg
     */

    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * The destination for the frame capture files. Either the URI for an Amazon S3 bucket and object, plus a file name
     * prefix (for example, s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a MediaStore container,
     * plus a file name prefix (for example, mediastoressl://sportsDelivery/20180820/curling_). The final file names
     * consist of the prefix from the destination field (for example, "curling_") + name modifier + the counter (5
     * digits, starting from 00001) + extension (which is always .jpg). For example, curlingLow.00001.jpg
     * 
     * @return The destination for the frame capture files. Either the URI for an Amazon S3 bucket and object, plus a
     *         file name prefix (for example, s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a
     *         MediaStore container, plus a file name prefix (for example,
     *         mediastoressl://sportsDelivery/20180820/curling_). The final file names consist of the prefix from the
     *         destination field (for example, "curling_") + name modifier + the counter (5 digits, starting from 00001)
     *         + extension (which is always .jpg). For example, curlingLow.00001.jpg
     */

    public OutputLocationRef getDestination() {
        return this.destination;
    }

    /**
     * The destination for the frame capture files. Either the URI for an Amazon S3 bucket and object, plus a file name
     * prefix (for example, s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a MediaStore container,
     * plus a file name prefix (for example, mediastoressl://sportsDelivery/20180820/curling_). The final file names
     * consist of the prefix from the destination field (for example, "curling_") + name modifier + the counter (5
     * digits, starting from 00001) + extension (which is always .jpg). For example, curlingLow.00001.jpg
     * 
     * @param destination
     *        The destination for the frame capture files. Either the URI for an Amazon S3 bucket and object, plus a
     *        file name prefix (for example, s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a
     *        MediaStore container, plus a file name prefix (for example,
     *        mediastoressl://sportsDelivery/20180820/curling_). The final file names consist of the prefix from the
     *        destination field (for example, "curling_") + name modifier + the counter (5 digits, starting from 00001)
     *        + extension (which is always .jpg). For example, curlingLow.00001.jpg
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameCaptureGroupSettings withDestination(OutputLocationRef destination) {
        setDestination(destination);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrameCaptureGroupSettings == false)
            return false;
        FrameCaptureGroupSettings other = (FrameCaptureGroupSettings) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public FrameCaptureGroupSettings clone() {
        try {
            return (FrameCaptureGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.FrameCaptureGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
