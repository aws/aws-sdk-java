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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an EWS based availability provider when returned from the service. It does not contain the password of the
 * endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RedactedEwsAvailabilityProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedactedEwsAvailabilityProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint of the remote EWS server.
     * </p>
     */
    private String ewsEndpoint;
    /**
     * <p>
     * The username used to authenticate the remote EWS server.
     * </p>
     */
    private String ewsUsername;

    /**
     * <p>
     * The endpoint of the remote EWS server.
     * </p>
     * 
     * @param ewsEndpoint
     *        The endpoint of the remote EWS server.
     */

    public void setEwsEndpoint(String ewsEndpoint) {
        this.ewsEndpoint = ewsEndpoint;
    }

    /**
     * <p>
     * The endpoint of the remote EWS server.
     * </p>
     * 
     * @return The endpoint of the remote EWS server.
     */

    public String getEwsEndpoint() {
        return this.ewsEndpoint;
    }

    /**
     * <p>
     * The endpoint of the remote EWS server.
     * </p>
     * 
     * @param ewsEndpoint
     *        The endpoint of the remote EWS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedactedEwsAvailabilityProvider withEwsEndpoint(String ewsEndpoint) {
        setEwsEndpoint(ewsEndpoint);
        return this;
    }

    /**
     * <p>
     * The username used to authenticate the remote EWS server.
     * </p>
     * 
     * @param ewsUsername
     *        The username used to authenticate the remote EWS server.
     */

    public void setEwsUsername(String ewsUsername) {
        this.ewsUsername = ewsUsername;
    }

    /**
     * <p>
     * The username used to authenticate the remote EWS server.
     * </p>
     * 
     * @return The username used to authenticate the remote EWS server.
     */

    public String getEwsUsername() {
        return this.ewsUsername;
    }

    /**
     * <p>
     * The username used to authenticate the remote EWS server.
     * </p>
     * 
     * @param ewsUsername
     *        The username used to authenticate the remote EWS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedactedEwsAvailabilityProvider withEwsUsername(String ewsUsername) {
        setEwsUsername(ewsUsername);
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
        if (getEwsEndpoint() != null)
            sb.append("EwsEndpoint: ").append(getEwsEndpoint()).append(",");
        if (getEwsUsername() != null)
            sb.append("EwsUsername: ").append(getEwsUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedactedEwsAvailabilityProvider == false)
            return false;
        RedactedEwsAvailabilityProvider other = (RedactedEwsAvailabilityProvider) obj;
        if (other.getEwsEndpoint() == null ^ this.getEwsEndpoint() == null)
            return false;
        if (other.getEwsEndpoint() != null && other.getEwsEndpoint().equals(this.getEwsEndpoint()) == false)
            return false;
        if (other.getEwsUsername() == null ^ this.getEwsUsername() == null)
            return false;
        if (other.getEwsUsername() != null && other.getEwsUsername().equals(this.getEwsUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEwsEndpoint() == null) ? 0 : getEwsEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEwsUsername() == null) ? 0 : getEwsUsername().hashCode());
        return hashCode;
    }

    @Override
    public RedactedEwsAvailabilityProvider clone() {
        try {
            return (RedactedEwsAvailabilityProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.RedactedEwsAvailabilityProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
