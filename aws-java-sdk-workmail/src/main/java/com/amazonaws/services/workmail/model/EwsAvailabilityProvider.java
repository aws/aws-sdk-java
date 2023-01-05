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
 * Describes an EWS based availability provider. This is only used as input to the service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/EwsAvailabilityProvider" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EwsAvailabilityProvider implements Serializable, Cloneable, StructuredPojo {

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
     * The password used to authenticate the remote EWS server.
     * </p>
     */
    private String ewsPassword;

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

    public EwsAvailabilityProvider withEwsEndpoint(String ewsEndpoint) {
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

    public EwsAvailabilityProvider withEwsUsername(String ewsUsername) {
        setEwsUsername(ewsUsername);
        return this;
    }

    /**
     * <p>
     * The password used to authenticate the remote EWS server.
     * </p>
     * 
     * @param ewsPassword
     *        The password used to authenticate the remote EWS server.
     */

    public void setEwsPassword(String ewsPassword) {
        this.ewsPassword = ewsPassword;
    }

    /**
     * <p>
     * The password used to authenticate the remote EWS server.
     * </p>
     * 
     * @return The password used to authenticate the remote EWS server.
     */

    public String getEwsPassword() {
        return this.ewsPassword;
    }

    /**
     * <p>
     * The password used to authenticate the remote EWS server.
     * </p>
     * 
     * @param ewsPassword
     *        The password used to authenticate the remote EWS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EwsAvailabilityProvider withEwsPassword(String ewsPassword) {
        setEwsPassword(ewsPassword);
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
            sb.append("EwsUsername: ").append(getEwsUsername()).append(",");
        if (getEwsPassword() != null)
            sb.append("EwsPassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EwsAvailabilityProvider == false)
            return false;
        EwsAvailabilityProvider other = (EwsAvailabilityProvider) obj;
        if (other.getEwsEndpoint() == null ^ this.getEwsEndpoint() == null)
            return false;
        if (other.getEwsEndpoint() != null && other.getEwsEndpoint().equals(this.getEwsEndpoint()) == false)
            return false;
        if (other.getEwsUsername() == null ^ this.getEwsUsername() == null)
            return false;
        if (other.getEwsUsername() != null && other.getEwsUsername().equals(this.getEwsUsername()) == false)
            return false;
        if (other.getEwsPassword() == null ^ this.getEwsPassword() == null)
            return false;
        if (other.getEwsPassword() != null && other.getEwsPassword().equals(this.getEwsPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEwsEndpoint() == null) ? 0 : getEwsEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEwsUsername() == null) ? 0 : getEwsUsername().hashCode());
        hashCode = prime * hashCode + ((getEwsPassword() == null) ? 0 : getEwsPassword().hashCode());
        return hashCode;
    }

    @Override
    public EwsAvailabilityProvider clone() {
        try {
            return (EwsAvailabilityProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.EwsAvailabilityProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
