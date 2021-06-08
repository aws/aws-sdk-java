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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for certain <code>Config</code> object types in a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ConfigDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for antenna demod decode <code>Config</code> in a contact.
     * </p>
     */
    private AntennaDemodDecodeDetails antennaDemodDecodeDetails;

    private EndpointDetails endpointDetails;
    /**
     * <p>
     * Details for an S3 recording <code>Config</code> in a contact.
     * </p>
     */
    private S3RecordingDetails s3RecordingDetails;

    /**
     * <p>
     * Details for antenna demod decode <code>Config</code> in a contact.
     * </p>
     * 
     * @param antennaDemodDecodeDetails
     *        Details for antenna demod decode <code>Config</code> in a contact.
     */

    public void setAntennaDemodDecodeDetails(AntennaDemodDecodeDetails antennaDemodDecodeDetails) {
        this.antennaDemodDecodeDetails = antennaDemodDecodeDetails;
    }

    /**
     * <p>
     * Details for antenna demod decode <code>Config</code> in a contact.
     * </p>
     * 
     * @return Details for antenna demod decode <code>Config</code> in a contact.
     */

    public AntennaDemodDecodeDetails getAntennaDemodDecodeDetails() {
        return this.antennaDemodDecodeDetails;
    }

    /**
     * <p>
     * Details for antenna demod decode <code>Config</code> in a contact.
     * </p>
     * 
     * @param antennaDemodDecodeDetails
     *        Details for antenna demod decode <code>Config</code> in a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigDetails withAntennaDemodDecodeDetails(AntennaDemodDecodeDetails antennaDemodDecodeDetails) {
        setAntennaDemodDecodeDetails(antennaDemodDecodeDetails);
        return this;
    }

    /**
     * @param endpointDetails
     */

    public void setEndpointDetails(EndpointDetails endpointDetails) {
        this.endpointDetails = endpointDetails;
    }

    /**
     * @return
     */

    public EndpointDetails getEndpointDetails() {
        return this.endpointDetails;
    }

    /**
     * @param endpointDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigDetails withEndpointDetails(EndpointDetails endpointDetails) {
        setEndpointDetails(endpointDetails);
        return this;
    }

    /**
     * <p>
     * Details for an S3 recording <code>Config</code> in a contact.
     * </p>
     * 
     * @param s3RecordingDetails
     *        Details for an S3 recording <code>Config</code> in a contact.
     */

    public void setS3RecordingDetails(S3RecordingDetails s3RecordingDetails) {
        this.s3RecordingDetails = s3RecordingDetails;
    }

    /**
     * <p>
     * Details for an S3 recording <code>Config</code> in a contact.
     * </p>
     * 
     * @return Details for an S3 recording <code>Config</code> in a contact.
     */

    public S3RecordingDetails getS3RecordingDetails() {
        return this.s3RecordingDetails;
    }

    /**
     * <p>
     * Details for an S3 recording <code>Config</code> in a contact.
     * </p>
     * 
     * @param s3RecordingDetails
     *        Details for an S3 recording <code>Config</code> in a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigDetails withS3RecordingDetails(S3RecordingDetails s3RecordingDetails) {
        setS3RecordingDetails(s3RecordingDetails);
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
        if (getAntennaDemodDecodeDetails() != null)
            sb.append("AntennaDemodDecodeDetails: ").append(getAntennaDemodDecodeDetails()).append(",");
        if (getEndpointDetails() != null)
            sb.append("EndpointDetails: ").append(getEndpointDetails()).append(",");
        if (getS3RecordingDetails() != null)
            sb.append("S3RecordingDetails: ").append(getS3RecordingDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigDetails == false)
            return false;
        ConfigDetails other = (ConfigDetails) obj;
        if (other.getAntennaDemodDecodeDetails() == null ^ this.getAntennaDemodDecodeDetails() == null)
            return false;
        if (other.getAntennaDemodDecodeDetails() != null && other.getAntennaDemodDecodeDetails().equals(this.getAntennaDemodDecodeDetails()) == false)
            return false;
        if (other.getEndpointDetails() == null ^ this.getEndpointDetails() == null)
            return false;
        if (other.getEndpointDetails() != null && other.getEndpointDetails().equals(this.getEndpointDetails()) == false)
            return false;
        if (other.getS3RecordingDetails() == null ^ this.getS3RecordingDetails() == null)
            return false;
        if (other.getS3RecordingDetails() != null && other.getS3RecordingDetails().equals(this.getS3RecordingDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAntennaDemodDecodeDetails() == null) ? 0 : getAntennaDemodDecodeDetails().hashCode());
        hashCode = prime * hashCode + ((getEndpointDetails() == null) ? 0 : getEndpointDetails().hashCode());
        hashCode = prime * hashCode + ((getS3RecordingDetails() == null) ? 0 : getS3RecordingDetails().hashCode());
        return hashCode;
    }

    @Override
    public ConfigDetails clone() {
        try {
            return (ConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.ConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
