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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Remove an operating Region from an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed
 * to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select
 * as operating Regions.
 * </p>
 * <p>
 * For more information about operating Regions, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM User
 * Guide</i>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RemoveIpamOperatingRegion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveIpamOperatingRegion implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the operating Region you want to remove.
     * </p>
     */
    private String regionName;

    /**
     * <p>
     * The name of the operating Region you want to remove.
     * </p>
     * 
     * @param regionName
     *        The name of the operating Region you want to remove.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the operating Region you want to remove.
     * </p>
     * 
     * @return The name of the operating Region you want to remove.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The name of the operating Region you want to remove.
     * </p>
     * 
     * @param regionName
     *        The name of the operating Region you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveIpamOperatingRegion withRegionName(String regionName) {
        setRegionName(regionName);
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
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveIpamOperatingRegion == false)
            return false;
        RemoveIpamOperatingRegion other = (RemoveIpamOperatingRegion) obj;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        return hashCode;
    }

    @Override
    public RemoveIpamOperatingRegion clone() {
        try {
            return (RemoveIpamOperatingRegion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
