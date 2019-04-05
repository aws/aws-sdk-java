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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to FILE_GROUP_SETTINGS.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/FileGroupSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     */
    private String destination;
    /** Settings associated with the destination. Will vary based on the type of destination */
    private DestinationSettings destinationSettings;

    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     * 
     * @param destination
     *        Use Destination (Destination) to specify the S3 output location and the output filename base. Destination
     *        accepts format identifiers. If you do not specify the base filename in the URI, the service will use the
     *        filename of the input file. If your job has multiple inputs, the service uses the filename of the first
     *        input file.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     * 
     * @return Use Destination (Destination) to specify the S3 output location and the output filename base. Destination
     *         accepts format identifiers. If you do not specify the base filename in the URI, the service will use the
     *         filename of the input file. If your job has multiple inputs, the service uses the filename of the first
     *         input file.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     * 
     * @param destination
     *        Use Destination (Destination) to specify the S3 output location and the output filename base. Destination
     *        accepts format identifiers. If you do not specify the base filename in the URI, the service will use the
     *        filename of the input file. If your job has multiple inputs, the service uses the filename of the first
     *        input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileGroupSettings withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of destination
     * 
     * @param destinationSettings
     *        Settings associated with the destination. Will vary based on the type of destination
     */

    public void setDestinationSettings(DestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of destination
     * 
     * @return Settings associated with the destination. Will vary based on the type of destination
     */

    public DestinationSettings getDestinationSettings() {
        return this.destinationSettings;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of destination
     * 
     * @param destinationSettings
     *        Settings associated with the destination. Will vary based on the type of destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileGroupSettings withDestinationSettings(DestinationSettings destinationSettings) {
        setDestinationSettings(destinationSettings);
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
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: ").append(getDestinationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileGroupSettings == false)
            return false;
        FileGroupSettings other = (FileGroupSettings) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationSettings() == null ^ this.getDestinationSettings() == null)
            return false;
        if (other.getDestinationSettings() != null && other.getDestinationSettings().equals(this.getDestinationSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        return hashCode;
    }

    @Override
    public FileGroupSettings clone() {
        try {
            return (FileGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.FileGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
