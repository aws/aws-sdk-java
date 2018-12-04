/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * The IPv4 CIDRs to whitelist for this Input Security Group
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInputSecurityGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInputSecurityGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** List of IPv4 CIDR addresses to whitelist */
    private java.util.List<InputWhitelistRuleCidr> whitelistRules;

    /**
     * List of IPv4 CIDR addresses to whitelist
     * 
     * @return List of IPv4 CIDR addresses to whitelist
     */

    public java.util.List<InputWhitelistRuleCidr> getWhitelistRules() {
        return whitelistRules;
    }

    /**
     * List of IPv4 CIDR addresses to whitelist
     * 
     * @param whitelistRules
     *        List of IPv4 CIDR addresses to whitelist
     */

    public void setWhitelistRules(java.util.Collection<InputWhitelistRuleCidr> whitelistRules) {
        if (whitelistRules == null) {
            this.whitelistRules = null;
            return;
        }

        this.whitelistRules = new java.util.ArrayList<InputWhitelistRuleCidr>(whitelistRules);
    }

    /**
     * List of IPv4 CIDR addresses to whitelist
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWhitelistRules(java.util.Collection)} or {@link #withWhitelistRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param whitelistRules
     *        List of IPv4 CIDR addresses to whitelist
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputSecurityGroupRequest withWhitelistRules(InputWhitelistRuleCidr... whitelistRules) {
        if (this.whitelistRules == null) {
            setWhitelistRules(new java.util.ArrayList<InputWhitelistRuleCidr>(whitelistRules.length));
        }
        for (InputWhitelistRuleCidr ele : whitelistRules) {
            this.whitelistRules.add(ele);
        }
        return this;
    }

    /**
     * List of IPv4 CIDR addresses to whitelist
     * 
     * @param whitelistRules
     *        List of IPv4 CIDR addresses to whitelist
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputSecurityGroupRequest withWhitelistRules(java.util.Collection<InputWhitelistRuleCidr> whitelistRules) {
        setWhitelistRules(whitelistRules);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWhitelistRules() != null)
            sb.append("WhitelistRules: ").append(getWhitelistRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInputSecurityGroupRequest == false)
            return false;
        CreateInputSecurityGroupRequest other = (CreateInputSecurityGroupRequest) obj;
        if (other.getWhitelistRules() == null ^ this.getWhitelistRules() == null)
            return false;
        if (other.getWhitelistRules() != null && other.getWhitelistRules().equals(this.getWhitelistRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWhitelistRules() == null) ? 0 : getWhitelistRules().hashCode());
        return hashCode;
    }

    @Override
    public CreateInputSecurityGroupRequest clone() {
        return (CreateInputSecurityGroupRequest) super.clone();
    }

}
