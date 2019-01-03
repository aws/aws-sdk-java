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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information required to start a signing job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSigningJobParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the code-signing profile.
     * </p>
     */
    private SigningProfileParameter signingProfileParameter;
    /**
     * <p>
     * The code-signing profile name.
     * </p>
     */
    private String signingProfileName;
    /**
     * <p>
     * The location to write the code-signed file.
     * </p>
     */
    private Destination destination;

    /**
     * <p>
     * Describes the code-signing profile.
     * </p>
     * 
     * @param signingProfileParameter
     *        Describes the code-signing profile.
     */

    public void setSigningProfileParameter(SigningProfileParameter signingProfileParameter) {
        this.signingProfileParameter = signingProfileParameter;
    }

    /**
     * <p>
     * Describes the code-signing profile.
     * </p>
     * 
     * @return Describes the code-signing profile.
     */

    public SigningProfileParameter getSigningProfileParameter() {
        return this.signingProfileParameter;
    }

    /**
     * <p>
     * Describes the code-signing profile.
     * </p>
     * 
     * @param signingProfileParameter
     *        Describes the code-signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSigningJobParameter withSigningProfileParameter(SigningProfileParameter signingProfileParameter) {
        setSigningProfileParameter(signingProfileParameter);
        return this;
    }

    /**
     * <p>
     * The code-signing profile name.
     * </p>
     * 
     * @param signingProfileName
     *        The code-signing profile name.
     */

    public void setSigningProfileName(String signingProfileName) {
        this.signingProfileName = signingProfileName;
    }

    /**
     * <p>
     * The code-signing profile name.
     * </p>
     * 
     * @return The code-signing profile name.
     */

    public String getSigningProfileName() {
        return this.signingProfileName;
    }

    /**
     * <p>
     * The code-signing profile name.
     * </p>
     * 
     * @param signingProfileName
     *        The code-signing profile name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSigningJobParameter withSigningProfileName(String signingProfileName) {
        setSigningProfileName(signingProfileName);
        return this;
    }

    /**
     * <p>
     * The location to write the code-signed file.
     * </p>
     * 
     * @param destination
     *        The location to write the code-signed file.
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The location to write the code-signed file.
     * </p>
     * 
     * @return The location to write the code-signed file.
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The location to write the code-signed file.
     * </p>
     * 
     * @param destination
     *        The location to write the code-signed file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSigningJobParameter withDestination(Destination destination) {
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
        if (getSigningProfileParameter() != null)
            sb.append("SigningProfileParameter: ").append(getSigningProfileParameter()).append(",");
        if (getSigningProfileName() != null)
            sb.append("SigningProfileName: ").append(getSigningProfileName()).append(",");
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

        if (obj instanceof StartSigningJobParameter == false)
            return false;
        StartSigningJobParameter other = (StartSigningJobParameter) obj;
        if (other.getSigningProfileParameter() == null ^ this.getSigningProfileParameter() == null)
            return false;
        if (other.getSigningProfileParameter() != null && other.getSigningProfileParameter().equals(this.getSigningProfileParameter()) == false)
            return false;
        if (other.getSigningProfileName() == null ^ this.getSigningProfileName() == null)
            return false;
        if (other.getSigningProfileName() != null && other.getSigningProfileName().equals(this.getSigningProfileName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getSigningProfileParameter() == null) ? 0 : getSigningProfileParameter().hashCode());
        hashCode = prime * hashCode + ((getSigningProfileName() == null) ? 0 : getSigningProfileName().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public StartSigningJobParameter clone() {
        try {
            return (StartSigningJobParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.StartSigningJobParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
