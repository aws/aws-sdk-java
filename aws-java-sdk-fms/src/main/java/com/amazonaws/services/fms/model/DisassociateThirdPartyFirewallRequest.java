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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DisassociateThirdPartyFirewall" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateThirdPartyFirewallRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the third-party firewall vendor.
     * </p>
     */
    private String thirdPartyFirewall;

    /**
     * <p>
     * The name of the third-party firewall vendor.
     * </p>
     * 
     * @param thirdPartyFirewall
     *        The name of the third-party firewall vendor.
     * @see ThirdPartyFirewall
     */

    public void setThirdPartyFirewall(String thirdPartyFirewall) {
        this.thirdPartyFirewall = thirdPartyFirewall;
    }

    /**
     * <p>
     * The name of the third-party firewall vendor.
     * </p>
     * 
     * @return The name of the third-party firewall vendor.
     * @see ThirdPartyFirewall
     */

    public String getThirdPartyFirewall() {
        return this.thirdPartyFirewall;
    }

    /**
     * <p>
     * The name of the third-party firewall vendor.
     * </p>
     * 
     * @param thirdPartyFirewall
     *        The name of the third-party firewall vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyFirewall
     */

    public DisassociateThirdPartyFirewallRequest withThirdPartyFirewall(String thirdPartyFirewall) {
        setThirdPartyFirewall(thirdPartyFirewall);
        return this;
    }

    /**
     * <p>
     * The name of the third-party firewall vendor.
     * </p>
     * 
     * @param thirdPartyFirewall
     *        The name of the third-party firewall vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyFirewall
     */

    public DisassociateThirdPartyFirewallRequest withThirdPartyFirewall(ThirdPartyFirewall thirdPartyFirewall) {
        this.thirdPartyFirewall = thirdPartyFirewall.toString();
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
        if (getThirdPartyFirewall() != null)
            sb.append("ThirdPartyFirewall: ").append(getThirdPartyFirewall());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateThirdPartyFirewallRequest == false)
            return false;
        DisassociateThirdPartyFirewallRequest other = (DisassociateThirdPartyFirewallRequest) obj;
        if (other.getThirdPartyFirewall() == null ^ this.getThirdPartyFirewall() == null)
            return false;
        if (other.getThirdPartyFirewall() != null && other.getThirdPartyFirewall().equals(this.getThirdPartyFirewall()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThirdPartyFirewall() == null) ? 0 : getThirdPartyFirewall().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateThirdPartyFirewallRequest clone() {
        return (DisassociateThirdPartyFirewallRequest) super.clone();
    }

}
