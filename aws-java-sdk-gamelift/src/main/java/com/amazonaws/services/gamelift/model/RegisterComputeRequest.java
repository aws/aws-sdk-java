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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RegisterCompute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterComputeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet to register the compute to. You can use either the fleet ID or ARN value.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * A descriptive label that is associated with the compute resource registered to your fleet.
     * </p>
     */
    private String computeName;
    /**
     * <p>
     * The path to the TLS certificate on your compute resource. The path and certificate are not validated by GameLift.
     * </p>
     */
    private String certificatePath;
    /**
     * <p>
     * The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     */
    private String dnsName;
    /**
     * <p>
     * The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The name of the custom location you added to the fleet you are registering this compute resource to.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the fleet to register the compute to. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to register the compute to. You can use either the fleet ID or ARN
     *        value.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to register the compute to. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the fleet to register the compute to. You can use either the fleet ID or ARN
     *         value.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to register the compute to. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to register the compute to. You can use either the fleet ID or ARN
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterComputeRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * A descriptive label that is associated with the compute resource registered to your fleet.
     * </p>
     * 
     * @param computeName
     *        A descriptive label that is associated with the compute resource registered to your fleet.
     */

    public void setComputeName(String computeName) {
        this.computeName = computeName;
    }

    /**
     * <p>
     * A descriptive label that is associated with the compute resource registered to your fleet.
     * </p>
     * 
     * @return A descriptive label that is associated with the compute resource registered to your fleet.
     */

    public String getComputeName() {
        return this.computeName;
    }

    /**
     * <p>
     * A descriptive label that is associated with the compute resource registered to your fleet.
     * </p>
     * 
     * @param computeName
     *        A descriptive label that is associated with the compute resource registered to your fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterComputeRequest withComputeName(String computeName) {
        setComputeName(computeName);
        return this;
    }

    /**
     * <p>
     * The path to the TLS certificate on your compute resource. The path and certificate are not validated by GameLift.
     * </p>
     * 
     * @param certificatePath
     *        The path to the TLS certificate on your compute resource. The path and certificate are not validated by
     *        GameLift.
     */

    public void setCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
    }

    /**
     * <p>
     * The path to the TLS certificate on your compute resource. The path and certificate are not validated by GameLift.
     * </p>
     * 
     * @return The path to the TLS certificate on your compute resource. The path and certificate are not validated by
     *         GameLift.
     */

    public String getCertificatePath() {
        return this.certificatePath;
    }

    /**
     * <p>
     * The path to the TLS certificate on your compute resource. The path and certificate are not validated by GameLift.
     * </p>
     * 
     * @param certificatePath
     *        The path to the TLS certificate on your compute resource. The path and certificate are not validated by
     *        GameLift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterComputeRequest withCertificatePath(String certificatePath) {
        setCertificatePath(certificatePath);
        return this;
    }

    /**
     * <p>
     * The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     *        resource.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @return The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     *         resource.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterComputeRequest withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * <p>
     * The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your
     *        compute resource.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @return The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your
     *         compute resource.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your
     *        compute resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterComputeRequest withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The name of the custom location you added to the fleet you are registering this compute resource to.
     * </p>
     * 
     * @param location
     *        The name of the custom location you added to the fleet you are registering this compute resource to.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The name of the custom location you added to the fleet you are registering this compute resource to.
     * </p>
     * 
     * @return The name of the custom location you added to the fleet you are registering this compute resource to.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The name of the custom location you added to the fleet you are registering this compute resource to.
     * </p>
     * 
     * @param location
     *        The name of the custom location you added to the fleet you are registering this compute resource to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterComputeRequest withLocation(String location) {
        setLocation(location);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getComputeName() != null)
            sb.append("ComputeName: ").append(getComputeName()).append(",");
        if (getCertificatePath() != null)
            sb.append("CertificatePath: ").append(getCertificatePath()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterComputeRequest == false)
            return false;
        RegisterComputeRequest other = (RegisterComputeRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getComputeName() == null ^ this.getComputeName() == null)
            return false;
        if (other.getComputeName() != null && other.getComputeName().equals(this.getComputeName()) == false)
            return false;
        if (other.getCertificatePath() == null ^ this.getCertificatePath() == null)
            return false;
        if (other.getCertificatePath() != null && other.getCertificatePath().equals(this.getCertificatePath()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getComputeName() == null) ? 0 : getComputeName().hashCode());
        hashCode = prime * hashCode + ((getCertificatePath() == null) ? 0 : getCertificatePath().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public RegisterComputeRequest clone() {
        return (RegisterComputeRequest) super.clone();
    }

}
