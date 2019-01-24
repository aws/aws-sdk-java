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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateWebsiteCertificateAuthority"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateWebsiteCertificateAuthorityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The root certificate of the CA.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The certificate name to display.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The ARN of the fleet.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @return The ARN of the fleet.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The ARN of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWebsiteCertificateAuthorityRequest withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The root certificate of the CA.
     * </p>
     * 
     * @param certificate
     *        The root certificate of the CA.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The root certificate of the CA.
     * </p>
     * 
     * @return The root certificate of the CA.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The root certificate of the CA.
     * </p>
     * 
     * @param certificate
     *        The root certificate of the CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWebsiteCertificateAuthorityRequest withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The certificate name to display.
     * </p>
     * 
     * @param displayName
     *        The certificate name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The certificate name to display.
     * </p>
     * 
     * @return The certificate name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The certificate name to display.
     * </p>
     * 
     * @param displayName
     *        The certificate name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWebsiteCertificateAuthorityRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
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
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateWebsiteCertificateAuthorityRequest == false)
            return false;
        AssociateWebsiteCertificateAuthorityRequest other = (AssociateWebsiteCertificateAuthorityRequest) obj;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public AssociateWebsiteCertificateAuthorityRequest clone() {
        return (AssociateWebsiteCertificateAuthorityRequest) super.clone();
    }

}
