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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The fully qualified domain name (FQDN).
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The ARN of an issued ACM certificate that is valid for the domain being associated.
     * </p>
     */
    private String acmCertificateArn;
    /**
     * <p>
     * The name to display.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (ARN) of the fleet.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the fleet.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (ARN) of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDomainRequest withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN).
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name (FQDN).
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN).
     * </p>
     * 
     * @return The fully qualified domain name (FQDN).
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN).
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name (FQDN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The ARN of an issued ACM certificate that is valid for the domain being associated.
     * </p>
     * 
     * @param acmCertificateArn
     *        The ARN of an issued ACM certificate that is valid for the domain being associated.
     */

    public void setAcmCertificateArn(String acmCertificateArn) {
        this.acmCertificateArn = acmCertificateArn;
    }

    /**
     * <p>
     * The ARN of an issued ACM certificate that is valid for the domain being associated.
     * </p>
     * 
     * @return The ARN of an issued ACM certificate that is valid for the domain being associated.
     */

    public String getAcmCertificateArn() {
        return this.acmCertificateArn;
    }

    /**
     * <p>
     * The ARN of an issued ACM certificate that is valid for the domain being associated.
     * </p>
     * 
     * @param acmCertificateArn
     *        The ARN of an issued ACM certificate that is valid for the domain being associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDomainRequest withAcmCertificateArn(String acmCertificateArn) {
        setAcmCertificateArn(acmCertificateArn);
        return this;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * 
     * @param displayName
     *        The name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * 
     * @return The name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * 
     * @param displayName
     *        The name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDomainRequest withDisplayName(String displayName) {
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAcmCertificateArn() != null)
            sb.append("AcmCertificateArn: ").append(getAcmCertificateArn()).append(",");
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

        if (obj instanceof AssociateDomainRequest == false)
            return false;
        AssociateDomainRequest other = (AssociateDomainRequest) obj;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAcmCertificateArn() == null ^ this.getAcmCertificateArn() == null)
            return false;
        if (other.getAcmCertificateArn() != null && other.getAcmCertificateArn().equals(this.getAcmCertificateArn()) == false)
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
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAcmCertificateArn() == null) ? 0 : getAcmCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public AssociateDomainRequest clone() {
        return (AssociateDomainRequest) super.clone();
    }

}
