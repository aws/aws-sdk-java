/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/StartBgpFailoverTest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBgpFailoverTestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual interface you want to test.
     * </p>
     */
    private String virtualInterfaceId;
    /**
     * <p>
     * The BGP peers to place in the DOWN state.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> bgpPeers;
    /**
     * <p>
     * The time in minutes that the virtual interface failover test will last.
     * </p>
     * <p>
     * Maximum value: 180 minutes (3 hours).
     * </p>
     * <p>
     * Default: 180 minutes (3 hours).
     * </p>
     */
    private Integer testDurationInMinutes;

    /**
     * <p>
     * The ID of the virtual interface you want to test.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface you want to test.
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface you want to test.
     * </p>
     * 
     * @return The ID of the virtual interface you want to test.
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface you want to test.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface you want to test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBgpFailoverTestRequest withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * The BGP peers to place in the DOWN state.
     * </p>
     * 
     * @return The BGP peers to place in the DOWN state.
     */

    public java.util.List<String> getBgpPeers() {
        if (bgpPeers == null) {
            bgpPeers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return bgpPeers;
    }

    /**
     * <p>
     * The BGP peers to place in the DOWN state.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers to place in the DOWN state.
     */

    public void setBgpPeers(java.util.Collection<String> bgpPeers) {
        if (bgpPeers == null) {
            this.bgpPeers = null;
            return;
        }

        this.bgpPeers = new com.amazonaws.internal.SdkInternalList<String>(bgpPeers);
    }

    /**
     * <p>
     * The BGP peers to place in the DOWN state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBgpPeers(java.util.Collection)} or {@link #withBgpPeers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers to place in the DOWN state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBgpFailoverTestRequest withBgpPeers(String... bgpPeers) {
        if (this.bgpPeers == null) {
            setBgpPeers(new com.amazonaws.internal.SdkInternalList<String>(bgpPeers.length));
        }
        for (String ele : bgpPeers) {
            this.bgpPeers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The BGP peers to place in the DOWN state.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers to place in the DOWN state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBgpFailoverTestRequest withBgpPeers(java.util.Collection<String> bgpPeers) {
        setBgpPeers(bgpPeers);
        return this;
    }

    /**
     * <p>
     * The time in minutes that the virtual interface failover test will last.
     * </p>
     * <p>
     * Maximum value: 180 minutes (3 hours).
     * </p>
     * <p>
     * Default: 180 minutes (3 hours).
     * </p>
     * 
     * @param testDurationInMinutes
     *        The time in minutes that the virtual interface failover test will last.</p>
     *        <p>
     *        Maximum value: 180 minutes (3 hours).
     *        </p>
     *        <p>
     *        Default: 180 minutes (3 hours).
     */

    public void setTestDurationInMinutes(Integer testDurationInMinutes) {
        this.testDurationInMinutes = testDurationInMinutes;
    }

    /**
     * <p>
     * The time in minutes that the virtual interface failover test will last.
     * </p>
     * <p>
     * Maximum value: 180 minutes (3 hours).
     * </p>
     * <p>
     * Default: 180 minutes (3 hours).
     * </p>
     * 
     * @return The time in minutes that the virtual interface failover test will last.</p>
     *         <p>
     *         Maximum value: 180 minutes (3 hours).
     *         </p>
     *         <p>
     *         Default: 180 minutes (3 hours).
     */

    public Integer getTestDurationInMinutes() {
        return this.testDurationInMinutes;
    }

    /**
     * <p>
     * The time in minutes that the virtual interface failover test will last.
     * </p>
     * <p>
     * Maximum value: 180 minutes (3 hours).
     * </p>
     * <p>
     * Default: 180 minutes (3 hours).
     * </p>
     * 
     * @param testDurationInMinutes
     *        The time in minutes that the virtual interface failover test will last.</p>
     *        <p>
     *        Maximum value: 180 minutes (3 hours).
     *        </p>
     *        <p>
     *        Default: 180 minutes (3 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBgpFailoverTestRequest withTestDurationInMinutes(Integer testDurationInMinutes) {
        setTestDurationInMinutes(testDurationInMinutes);
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
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getBgpPeers() != null)
            sb.append("BgpPeers: ").append(getBgpPeers()).append(",");
        if (getTestDurationInMinutes() != null)
            sb.append("TestDurationInMinutes: ").append(getTestDurationInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBgpFailoverTestRequest == false)
            return false;
        StartBgpFailoverTestRequest other = (StartBgpFailoverTestRequest) obj;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getBgpPeers() == null ^ this.getBgpPeers() == null)
            return false;
        if (other.getBgpPeers() != null && other.getBgpPeers().equals(this.getBgpPeers()) == false)
            return false;
        if (other.getTestDurationInMinutes() == null ^ this.getTestDurationInMinutes() == null)
            return false;
        if (other.getTestDurationInMinutes() != null && other.getTestDurationInMinutes().equals(this.getTestDurationInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getBgpPeers() == null) ? 0 : getBgpPeers().hashCode());
        hashCode = prime * hashCode + ((getTestDurationInMinutes() == null) ? 0 : getTestDurationInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public StartBgpFailoverTestRequest clone() {
        return (StartBgpFailoverTestRequest) super.clone();
    }

}
