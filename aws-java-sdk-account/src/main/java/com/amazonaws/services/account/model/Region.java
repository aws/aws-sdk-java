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
package com.amazonaws.services.account.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This is a structure that expresses the Region for a given account, consisting of a name and opt-in status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/Region" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Region implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Region code of a given Region (for example, <code>us-east-1</code>).
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * One of potential statuses a Region can undergo (Enabled, Enabling, Disabled, Disabling, Enabled_By_Default).
     * </p>
     */
    private String regionOptStatus;

    /**
     * <p>
     * The Region code of a given Region (for example, <code>us-east-1</code>).
     * </p>
     * 
     * @param regionName
     *        The Region code of a given Region (for example, <code>us-east-1</code>).
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The Region code of a given Region (for example, <code>us-east-1</code>).
     * </p>
     * 
     * @return The Region code of a given Region (for example, <code>us-east-1</code>).
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The Region code of a given Region (for example, <code>us-east-1</code>).
     * </p>
     * 
     * @param regionName
     *        The Region code of a given Region (for example, <code>us-east-1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Region withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * One of potential statuses a Region can undergo (Enabled, Enabling, Disabled, Disabling, Enabled_By_Default).
     * </p>
     * 
     * @param regionOptStatus
     *        One of potential statuses a Region can undergo (Enabled, Enabling, Disabled, Disabling,
     *        Enabled_By_Default).
     * @see RegionOptStatus
     */

    public void setRegionOptStatus(String regionOptStatus) {
        this.regionOptStatus = regionOptStatus;
    }

    /**
     * <p>
     * One of potential statuses a Region can undergo (Enabled, Enabling, Disabled, Disabling, Enabled_By_Default).
     * </p>
     * 
     * @return One of potential statuses a Region can undergo (Enabled, Enabling, Disabled, Disabling,
     *         Enabled_By_Default).
     * @see RegionOptStatus
     */

    public String getRegionOptStatus() {
        return this.regionOptStatus;
    }

    /**
     * <p>
     * One of potential statuses a Region can undergo (Enabled, Enabling, Disabled, Disabling, Enabled_By_Default).
     * </p>
     * 
     * @param regionOptStatus
     *        One of potential statuses a Region can undergo (Enabled, Enabling, Disabled, Disabling,
     *        Enabled_By_Default).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionOptStatus
     */

    public Region withRegionOptStatus(String regionOptStatus) {
        setRegionOptStatus(regionOptStatus);
        return this;
    }

    /**
     * <p>
     * One of potential statuses a Region can undergo (Enabled, Enabling, Disabled, Disabling, Enabled_By_Default).
     * </p>
     * 
     * @param regionOptStatus
     *        One of potential statuses a Region can undergo (Enabled, Enabling, Disabled, Disabling,
     *        Enabled_By_Default).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionOptStatus
     */

    public Region withRegionOptStatus(RegionOptStatus regionOptStatus) {
        this.regionOptStatus = regionOptStatus.toString();
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
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getRegionOptStatus() != null)
            sb.append("RegionOptStatus: ").append(getRegionOptStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Region == false)
            return false;
        Region other = (Region) obj;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getRegionOptStatus() == null ^ this.getRegionOptStatus() == null)
            return false;
        if (other.getRegionOptStatus() != null && other.getRegionOptStatus().equals(this.getRegionOptStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getRegionOptStatus() == null) ? 0 : getRegionOptStatus().hashCode());
        return hashCode;
    }

    @Override
    public Region clone() {
        try {
            return (Region) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.account.model.transform.RegionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
