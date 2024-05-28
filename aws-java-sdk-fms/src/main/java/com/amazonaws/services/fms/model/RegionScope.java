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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the Amazon Web Services Regions that the specified Firewall Manager administrator can manage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/RegionScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionScope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * </p>
     */
    private java.util.List<String> regions;
    /**
     * <p>
     * Allows the specified Firewall Manager administrator to manage all Amazon Web Services Regions.
     * </p>
     */
    private Boolean allRegionsEnabled;

    /**
     * <p>
     * The Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * </p>
     * 
     * @return The Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * The Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * </p>
     * 
     * @param regions
     *        The Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * The Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        The Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionScope withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * </p>
     * 
     * @param regions
     *        The Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionScope withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * Allows the specified Firewall Manager administrator to manage all Amazon Web Services Regions.
     * </p>
     * 
     * @param allRegionsEnabled
     *        Allows the specified Firewall Manager administrator to manage all Amazon Web Services Regions.
     */

    public void setAllRegionsEnabled(Boolean allRegionsEnabled) {
        this.allRegionsEnabled = allRegionsEnabled;
    }

    /**
     * <p>
     * Allows the specified Firewall Manager administrator to manage all Amazon Web Services Regions.
     * </p>
     * 
     * @return Allows the specified Firewall Manager administrator to manage all Amazon Web Services Regions.
     */

    public Boolean getAllRegionsEnabled() {
        return this.allRegionsEnabled;
    }

    /**
     * <p>
     * Allows the specified Firewall Manager administrator to manage all Amazon Web Services Regions.
     * </p>
     * 
     * @param allRegionsEnabled
     *        Allows the specified Firewall Manager administrator to manage all Amazon Web Services Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionScope withAllRegionsEnabled(Boolean allRegionsEnabled) {
        setAllRegionsEnabled(allRegionsEnabled);
        return this;
    }

    /**
     * <p>
     * Allows the specified Firewall Manager administrator to manage all Amazon Web Services Regions.
     * </p>
     * 
     * @return Allows the specified Firewall Manager administrator to manage all Amazon Web Services Regions.
     */

    public Boolean isAllRegionsEnabled() {
        return this.allRegionsEnabled;
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
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getAllRegionsEnabled() != null)
            sb.append("AllRegionsEnabled: ").append(getAllRegionsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionScope == false)
            return false;
        RegionScope other = (RegionScope) obj;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getAllRegionsEnabled() == null ^ this.getAllRegionsEnabled() == null)
            return false;
        if (other.getAllRegionsEnabled() != null && other.getAllRegionsEnabled().equals(this.getAllRegionsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getAllRegionsEnabled() == null) ? 0 : getAllRegionsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public RegionScope clone() {
        try {
            return (RegionScope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.RegionScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
