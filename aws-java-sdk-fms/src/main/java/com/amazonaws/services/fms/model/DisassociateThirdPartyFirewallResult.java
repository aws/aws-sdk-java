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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DisassociateThirdPartyFirewall" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateThirdPartyFirewallResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The current status for the disassociation of a Firewall Manager administrators account with a third-party
     * firewall.
     * </p>
     */
    private String thirdPartyFirewallStatus;

    /**
     * <p>
     * The current status for the disassociation of a Firewall Manager administrators account with a third-party
     * firewall.
     * </p>
     * 
     * @param thirdPartyFirewallStatus
     *        The current status for the disassociation of a Firewall Manager administrators account with a third-party
     *        firewall.
     * @see ThirdPartyFirewallAssociationStatus
     */

    public void setThirdPartyFirewallStatus(String thirdPartyFirewallStatus) {
        this.thirdPartyFirewallStatus = thirdPartyFirewallStatus;
    }

    /**
     * <p>
     * The current status for the disassociation of a Firewall Manager administrators account with a third-party
     * firewall.
     * </p>
     * 
     * @return The current status for the disassociation of a Firewall Manager administrators account with a third-party
     *         firewall.
     * @see ThirdPartyFirewallAssociationStatus
     */

    public String getThirdPartyFirewallStatus() {
        return this.thirdPartyFirewallStatus;
    }

    /**
     * <p>
     * The current status for the disassociation of a Firewall Manager administrators account with a third-party
     * firewall.
     * </p>
     * 
     * @param thirdPartyFirewallStatus
     *        The current status for the disassociation of a Firewall Manager administrators account with a third-party
     *        firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyFirewallAssociationStatus
     */

    public DisassociateThirdPartyFirewallResult withThirdPartyFirewallStatus(String thirdPartyFirewallStatus) {
        setThirdPartyFirewallStatus(thirdPartyFirewallStatus);
        return this;
    }

    /**
     * <p>
     * The current status for the disassociation of a Firewall Manager administrators account with a third-party
     * firewall.
     * </p>
     * 
     * @param thirdPartyFirewallStatus
     *        The current status for the disassociation of a Firewall Manager administrators account with a third-party
     *        firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyFirewallAssociationStatus
     */

    public DisassociateThirdPartyFirewallResult withThirdPartyFirewallStatus(ThirdPartyFirewallAssociationStatus thirdPartyFirewallStatus) {
        this.thirdPartyFirewallStatus = thirdPartyFirewallStatus.toString();
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
        if (getThirdPartyFirewallStatus() != null)
            sb.append("ThirdPartyFirewallStatus: ").append(getThirdPartyFirewallStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateThirdPartyFirewallResult == false)
            return false;
        DisassociateThirdPartyFirewallResult other = (DisassociateThirdPartyFirewallResult) obj;
        if (other.getThirdPartyFirewallStatus() == null ^ this.getThirdPartyFirewallStatus() == null)
            return false;
        if (other.getThirdPartyFirewallStatus() != null && other.getThirdPartyFirewallStatus().equals(this.getThirdPartyFirewallStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThirdPartyFirewallStatus() == null) ? 0 : getThirdPartyFirewallStatus().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateThirdPartyFirewallResult clone() {
        try {
            return (DisassociateThirdPartyFirewallResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
