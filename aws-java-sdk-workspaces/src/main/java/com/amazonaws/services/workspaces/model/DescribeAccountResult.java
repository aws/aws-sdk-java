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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of BYOL (whether BYOL is enabled or disabled).
     * </p>
     */
    private String dedicatedTenancySupport;
    /**
     * <p>
     * The IP address range, specified as an IPv4 CIDR block, used for the management network interface.
     * </p>
     * <p>
     * The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
     * interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
     * manage the WorkSpace.
     * </p>
     */
    private String dedicatedTenancyManagementCidrRange;

    /**
     * <p>
     * The status of BYOL (whether BYOL is enabled or disabled).
     * </p>
     * 
     * @param dedicatedTenancySupport
     *        The status of BYOL (whether BYOL is enabled or disabled).
     * @see DedicatedTenancySupportResultEnum
     */

    public void setDedicatedTenancySupport(String dedicatedTenancySupport) {
        this.dedicatedTenancySupport = dedicatedTenancySupport;
    }

    /**
     * <p>
     * The status of BYOL (whether BYOL is enabled or disabled).
     * </p>
     * 
     * @return The status of BYOL (whether BYOL is enabled or disabled).
     * @see DedicatedTenancySupportResultEnum
     */

    public String getDedicatedTenancySupport() {
        return this.dedicatedTenancySupport;
    }

    /**
     * <p>
     * The status of BYOL (whether BYOL is enabled or disabled).
     * </p>
     * 
     * @param dedicatedTenancySupport
     *        The status of BYOL (whether BYOL is enabled or disabled).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DedicatedTenancySupportResultEnum
     */

    public DescribeAccountResult withDedicatedTenancySupport(String dedicatedTenancySupport) {
        setDedicatedTenancySupport(dedicatedTenancySupport);
        return this;
    }

    /**
     * <p>
     * The status of BYOL (whether BYOL is enabled or disabled).
     * </p>
     * 
     * @param dedicatedTenancySupport
     *        The status of BYOL (whether BYOL is enabled or disabled).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DedicatedTenancySupportResultEnum
     */

    public DescribeAccountResult withDedicatedTenancySupport(DedicatedTenancySupportResultEnum dedicatedTenancySupport) {
        this.dedicatedTenancySupport = dedicatedTenancySupport.toString();
        return this;
    }

    /**
     * <p>
     * The IP address range, specified as an IPv4 CIDR block, used for the management network interface.
     * </p>
     * <p>
     * The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
     * interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
     * manage the WorkSpace.
     * </p>
     * 
     * @param dedicatedTenancyManagementCidrRange
     *        The IP address range, specified as an IPv4 CIDR block, used for the management network interface.</p>
     *        <p>
     *        The management network interface is connected to a secure Amazon WorkSpaces management network. It is used
     *        for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon
     *        WorkSpaces to manage the WorkSpace.
     */

    public void setDedicatedTenancyManagementCidrRange(String dedicatedTenancyManagementCidrRange) {
        this.dedicatedTenancyManagementCidrRange = dedicatedTenancyManagementCidrRange;
    }

    /**
     * <p>
     * The IP address range, specified as an IPv4 CIDR block, used for the management network interface.
     * </p>
     * <p>
     * The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
     * interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
     * manage the WorkSpace.
     * </p>
     * 
     * @return The IP address range, specified as an IPv4 CIDR block, used for the management network interface.</p>
     *         <p>
     *         The management network interface is connected to a secure Amazon WorkSpaces management network. It is
     *         used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon
     *         WorkSpaces to manage the WorkSpace.
     */

    public String getDedicatedTenancyManagementCidrRange() {
        return this.dedicatedTenancyManagementCidrRange;
    }

    /**
     * <p>
     * The IP address range, specified as an IPv4 CIDR block, used for the management network interface.
     * </p>
     * <p>
     * The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
     * interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
     * manage the WorkSpace.
     * </p>
     * 
     * @param dedicatedTenancyManagementCidrRange
     *        The IP address range, specified as an IPv4 CIDR block, used for the management network interface.</p>
     *        <p>
     *        The management network interface is connected to a secure Amazon WorkSpaces management network. It is used
     *        for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon
     *        WorkSpaces to manage the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountResult withDedicatedTenancyManagementCidrRange(String dedicatedTenancyManagementCidrRange) {
        setDedicatedTenancyManagementCidrRange(dedicatedTenancyManagementCidrRange);
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
        if (getDedicatedTenancySupport() != null)
            sb.append("DedicatedTenancySupport: ").append(getDedicatedTenancySupport()).append(",");
        if (getDedicatedTenancyManagementCidrRange() != null)
            sb.append("DedicatedTenancyManagementCidrRange: ").append(getDedicatedTenancyManagementCidrRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountResult == false)
            return false;
        DescribeAccountResult other = (DescribeAccountResult) obj;
        if (other.getDedicatedTenancySupport() == null ^ this.getDedicatedTenancySupport() == null)
            return false;
        if (other.getDedicatedTenancySupport() != null && other.getDedicatedTenancySupport().equals(this.getDedicatedTenancySupport()) == false)
            return false;
        if (other.getDedicatedTenancyManagementCidrRange() == null ^ this.getDedicatedTenancyManagementCidrRange() == null)
            return false;
        if (other.getDedicatedTenancyManagementCidrRange() != null
                && other.getDedicatedTenancyManagementCidrRange().equals(this.getDedicatedTenancyManagementCidrRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDedicatedTenancySupport() == null) ? 0 : getDedicatedTenancySupport().hashCode());
        hashCode = prime * hashCode + ((getDedicatedTenancyManagementCidrRange() == null) ? 0 : getDedicatedTenancyManagementCidrRange().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountResult clone() {
        try {
            return (DescribeAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
