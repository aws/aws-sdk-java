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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration used to authenticate a speaker during a session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/AuthenticationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum threshold needed to successfully authenticate a speaker.
     * </p>
     */
    private Integer acceptanceThreshold;

    /**
     * <p>
     * The minimum threshold needed to successfully authenticate a speaker.
     * </p>
     * 
     * @param acceptanceThreshold
     *        The minimum threshold needed to successfully authenticate a speaker.
     */

    public void setAcceptanceThreshold(Integer acceptanceThreshold) {
        this.acceptanceThreshold = acceptanceThreshold;
    }

    /**
     * <p>
     * The minimum threshold needed to successfully authenticate a speaker.
     * </p>
     * 
     * @return The minimum threshold needed to successfully authenticate a speaker.
     */

    public Integer getAcceptanceThreshold() {
        return this.acceptanceThreshold;
    }

    /**
     * <p>
     * The minimum threshold needed to successfully authenticate a speaker.
     * </p>
     * 
     * @param acceptanceThreshold
     *        The minimum threshold needed to successfully authenticate a speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfiguration withAcceptanceThreshold(Integer acceptanceThreshold) {
        setAcceptanceThreshold(acceptanceThreshold);
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
        if (getAcceptanceThreshold() != null)
            sb.append("AcceptanceThreshold: ").append(getAcceptanceThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationConfiguration == false)
            return false;
        AuthenticationConfiguration other = (AuthenticationConfiguration) obj;
        if (other.getAcceptanceThreshold() == null ^ this.getAcceptanceThreshold() == null)
            return false;
        if (other.getAcceptanceThreshold() != null && other.getAcceptanceThreshold().equals(this.getAcceptanceThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptanceThreshold() == null) ? 0 : getAcceptanceThreshold().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationConfiguration clone() {
        try {
            return (AuthenticationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.AuthenticationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
