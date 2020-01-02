/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about the endpoint details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/EndpointDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A dataflow endpoint.
     * </p>
     */
    private DataflowEndpoint endpoint;
    /**
     * <p>
     * Endpoint security details.
     * </p>
     */
    private SecurityDetails securityDetails;

    /**
     * <p>
     * A dataflow endpoint.
     * </p>
     * 
     * @param endpoint
     *        A dataflow endpoint.
     */

    public void setEndpoint(DataflowEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * A dataflow endpoint.
     * </p>
     * 
     * @return A dataflow endpoint.
     */

    public DataflowEndpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * A dataflow endpoint.
     * </p>
     * 
     * @param endpoint
     *        A dataflow endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withEndpoint(DataflowEndpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Endpoint security details.
     * </p>
     * 
     * @param securityDetails
     *        Endpoint security details.
     */

    public void setSecurityDetails(SecurityDetails securityDetails) {
        this.securityDetails = securityDetails;
    }

    /**
     * <p>
     * Endpoint security details.
     * </p>
     * 
     * @return Endpoint security details.
     */

    public SecurityDetails getSecurityDetails() {
        return this.securityDetails;
    }

    /**
     * <p>
     * Endpoint security details.
     * </p>
     * 
     * @param securityDetails
     *        Endpoint security details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withSecurityDetails(SecurityDetails securityDetails) {
        setSecurityDetails(securityDetails);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getSecurityDetails() != null)
            sb.append("SecurityDetails: ").append(getSecurityDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointDetails == false)
            return false;
        EndpointDetails other = (EndpointDetails) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getSecurityDetails() == null ^ this.getSecurityDetails() == null)
            return false;
        if (other.getSecurityDetails() != null && other.getSecurityDetails().equals(this.getSecurityDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSecurityDetails() == null) ? 0 : getSecurityDetails().hashCode());
        return hashCode;
    }

    @Override
    public EndpointDetails clone() {
        try {
            return (EndpointDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.EndpointDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
