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
     * An agent endpoint.
     * </p>
     */
    private AwsGroundStationAgentEndpoint awsGroundStationAgentEndpoint;
    /**
     * <p>
     * A dataflow endpoint.
     * </p>
     */
    private DataflowEndpoint endpoint;
    /**
     * <p>
     * Health reasons for a dataflow endpoint. This field is ignored when calling
     * <code>CreateDataflowEndpointGroup</code>.
     * </p>
     */
    private java.util.List<String> healthReasons;
    /**
     * <p>
     * A dataflow endpoint health status. This field is ignored when calling <code>CreateDataflowEndpointGroup</code>.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * Endpoint security details including a list of subnets, a list of security groups and a role to connect streams to
     * instances.
     * </p>
     */
    private SecurityDetails securityDetails;

    /**
     * <p>
     * An agent endpoint.
     * </p>
     * 
     * @param awsGroundStationAgentEndpoint
     *        An agent endpoint.
     */

    public void setAwsGroundStationAgentEndpoint(AwsGroundStationAgentEndpoint awsGroundStationAgentEndpoint) {
        this.awsGroundStationAgentEndpoint = awsGroundStationAgentEndpoint;
    }

    /**
     * <p>
     * An agent endpoint.
     * </p>
     * 
     * @return An agent endpoint.
     */

    public AwsGroundStationAgentEndpoint getAwsGroundStationAgentEndpoint() {
        return this.awsGroundStationAgentEndpoint;
    }

    /**
     * <p>
     * An agent endpoint.
     * </p>
     * 
     * @param awsGroundStationAgentEndpoint
     *        An agent endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointDetails withAwsGroundStationAgentEndpoint(AwsGroundStationAgentEndpoint awsGroundStationAgentEndpoint) {
        setAwsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint);
        return this;
    }

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
     * Health reasons for a dataflow endpoint. This field is ignored when calling
     * <code>CreateDataflowEndpointGroup</code>.
     * </p>
     * 
     * @return Health reasons for a dataflow endpoint. This field is ignored when calling
     *         <code>CreateDataflowEndpointGroup</code>.
     * @see CapabilityHealthReason
     */

    public java.util.List<String> getHealthReasons() {
        return healthReasons;
    }

    /**
     * <p>
     * Health reasons for a dataflow endpoint. This field is ignored when calling
     * <code>CreateDataflowEndpointGroup</code>.
     * </p>
     * 
     * @param healthReasons
     *        Health reasons for a dataflow endpoint. This field is ignored when calling
     *        <code>CreateDataflowEndpointGroup</code>.
     * @see CapabilityHealthReason
     */

    public void setHealthReasons(java.util.Collection<String> healthReasons) {
        if (healthReasons == null) {
            this.healthReasons = null;
            return;
        }

        this.healthReasons = new java.util.ArrayList<String>(healthReasons);
    }

    /**
     * <p>
     * Health reasons for a dataflow endpoint. This field is ignored when calling
     * <code>CreateDataflowEndpointGroup</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHealthReasons(java.util.Collection)} or {@link #withHealthReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param healthReasons
     *        Health reasons for a dataflow endpoint. This field is ignored when calling
     *        <code>CreateDataflowEndpointGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityHealthReason
     */

    public EndpointDetails withHealthReasons(String... healthReasons) {
        if (this.healthReasons == null) {
            setHealthReasons(new java.util.ArrayList<String>(healthReasons.length));
        }
        for (String ele : healthReasons) {
            this.healthReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Health reasons for a dataflow endpoint. This field is ignored when calling
     * <code>CreateDataflowEndpointGroup</code>.
     * </p>
     * 
     * @param healthReasons
     *        Health reasons for a dataflow endpoint. This field is ignored when calling
     *        <code>CreateDataflowEndpointGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityHealthReason
     */

    public EndpointDetails withHealthReasons(java.util.Collection<String> healthReasons) {
        setHealthReasons(healthReasons);
        return this;
    }

    /**
     * <p>
     * Health reasons for a dataflow endpoint. This field is ignored when calling
     * <code>CreateDataflowEndpointGroup</code>.
     * </p>
     * 
     * @param healthReasons
     *        Health reasons for a dataflow endpoint. This field is ignored when calling
     *        <code>CreateDataflowEndpointGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityHealthReason
     */

    public EndpointDetails withHealthReasons(CapabilityHealthReason... healthReasons) {
        java.util.ArrayList<String> healthReasonsCopy = new java.util.ArrayList<String>(healthReasons.length);
        for (CapabilityHealthReason value : healthReasons) {
            healthReasonsCopy.add(value.toString());
        }
        if (getHealthReasons() == null) {
            setHealthReasons(healthReasonsCopy);
        } else {
            getHealthReasons().addAll(healthReasonsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A dataflow endpoint health status. This field is ignored when calling <code>CreateDataflowEndpointGroup</code>.
     * </p>
     * 
     * @param healthStatus
     *        A dataflow endpoint health status. This field is ignored when calling
     *        <code>CreateDataflowEndpointGroup</code>.
     * @see CapabilityHealth
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * A dataflow endpoint health status. This field is ignored when calling <code>CreateDataflowEndpointGroup</code>.
     * </p>
     * 
     * @return A dataflow endpoint health status. This field is ignored when calling
     *         <code>CreateDataflowEndpointGroup</code>.
     * @see CapabilityHealth
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * A dataflow endpoint health status. This field is ignored when calling <code>CreateDataflowEndpointGroup</code>.
     * </p>
     * 
     * @param healthStatus
     *        A dataflow endpoint health status. This field is ignored when calling
     *        <code>CreateDataflowEndpointGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityHealth
     */

    public EndpointDetails withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * A dataflow endpoint health status. This field is ignored when calling <code>CreateDataflowEndpointGroup</code>.
     * </p>
     * 
     * @param healthStatus
     *        A dataflow endpoint health status. This field is ignored when calling
     *        <code>CreateDataflowEndpointGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityHealth
     */

    public EndpointDetails withHealthStatus(CapabilityHealth healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * Endpoint security details including a list of subnets, a list of security groups and a role to connect streams to
     * instances.
     * </p>
     * 
     * @param securityDetails
     *        Endpoint security details including a list of subnets, a list of security groups and a role to connect
     *        streams to instances.
     */

    public void setSecurityDetails(SecurityDetails securityDetails) {
        this.securityDetails = securityDetails;
    }

    /**
     * <p>
     * Endpoint security details including a list of subnets, a list of security groups and a role to connect streams to
     * instances.
     * </p>
     * 
     * @return Endpoint security details including a list of subnets, a list of security groups and a role to connect
     *         streams to instances.
     */

    public SecurityDetails getSecurityDetails() {
        return this.securityDetails;
    }

    /**
     * <p>
     * Endpoint security details including a list of subnets, a list of security groups and a role to connect streams to
     * instances.
     * </p>
     * 
     * @param securityDetails
     *        Endpoint security details including a list of subnets, a list of security groups and a role to connect
     *        streams to instances.
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
        if (getAwsGroundStationAgentEndpoint() != null)
            sb.append("AwsGroundStationAgentEndpoint: ").append(getAwsGroundStationAgentEndpoint()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getHealthReasons() != null)
            sb.append("HealthReasons: ").append(getHealthReasons()).append(",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus()).append(",");
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
        if (other.getAwsGroundStationAgentEndpoint() == null ^ this.getAwsGroundStationAgentEndpoint() == null)
            return false;
        if (other.getAwsGroundStationAgentEndpoint() != null
                && other.getAwsGroundStationAgentEndpoint().equals(this.getAwsGroundStationAgentEndpoint()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getHealthReasons() == null ^ this.getHealthReasons() == null)
            return false;
        if (other.getHealthReasons() != null && other.getHealthReasons().equals(this.getHealthReasons()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
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

        hashCode = prime * hashCode + ((getAwsGroundStationAgentEndpoint() == null) ? 0 : getAwsGroundStationAgentEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHealthReasons() == null) ? 0 : getHealthReasons().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
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
