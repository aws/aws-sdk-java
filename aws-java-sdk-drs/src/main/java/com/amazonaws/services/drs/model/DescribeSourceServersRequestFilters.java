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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of filters by which to return Source Servers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeSourceServersRequestFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSourceServersRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An ID that describes the hardware of the Source Server. This is either an EC2 instance id, a VMware uuid or a mac
     * address.
     * </p>
     */
    private String hardwareId;
    /**
     * <p>
     * An array of Source Servers IDs that should be returned. An empty array means all Source Servers.
     * </p>
     */
    private java.util.List<String> sourceServerIDs;
    /**
     * <p>
     * An array of staging account IDs that extended source servers belong to. An empty array means all source servers
     * will be shown.
     * </p>
     */
    private java.util.List<String> stagingAccountIDs;

    /**
     * <p>
     * An ID that describes the hardware of the Source Server. This is either an EC2 instance id, a VMware uuid or a mac
     * address.
     * </p>
     * 
     * @param hardwareId
     *        An ID that describes the hardware of the Source Server. This is either an EC2 instance id, a VMware uuid
     *        or a mac address.
     */

    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    /**
     * <p>
     * An ID that describes the hardware of the Source Server. This is either an EC2 instance id, a VMware uuid or a mac
     * address.
     * </p>
     * 
     * @return An ID that describes the hardware of the Source Server. This is either an EC2 instance id, a VMware uuid
     *         or a mac address.
     */

    public String getHardwareId() {
        return this.hardwareId;
    }

    /**
     * <p>
     * An ID that describes the hardware of the Source Server. This is either an EC2 instance id, a VMware uuid or a mac
     * address.
     * </p>
     * 
     * @param hardwareId
     *        An ID that describes the hardware of the Source Server. This is either an EC2 instance id, a VMware uuid
     *        or a mac address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withHardwareId(String hardwareId) {
        setHardwareId(hardwareId);
        return this;
    }

    /**
     * <p>
     * An array of Source Servers IDs that should be returned. An empty array means all Source Servers.
     * </p>
     * 
     * @return An array of Source Servers IDs that should be returned. An empty array means all Source Servers.
     */

    public java.util.List<String> getSourceServerIDs() {
        return sourceServerIDs;
    }

    /**
     * <p>
     * An array of Source Servers IDs that should be returned. An empty array means all Source Servers.
     * </p>
     * 
     * @param sourceServerIDs
     *        An array of Source Servers IDs that should be returned. An empty array means all Source Servers.
     */

    public void setSourceServerIDs(java.util.Collection<String> sourceServerIDs) {
        if (sourceServerIDs == null) {
            this.sourceServerIDs = null;
            return;
        }

        this.sourceServerIDs = new java.util.ArrayList<String>(sourceServerIDs);
    }

    /**
     * <p>
     * An array of Source Servers IDs that should be returned. An empty array means all Source Servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceServerIDs(java.util.Collection)} or {@link #withSourceServerIDs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceServerIDs
     *        An array of Source Servers IDs that should be returned. An empty array means all Source Servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withSourceServerIDs(String... sourceServerIDs) {
        if (this.sourceServerIDs == null) {
            setSourceServerIDs(new java.util.ArrayList<String>(sourceServerIDs.length));
        }
        for (String ele : sourceServerIDs) {
            this.sourceServerIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Source Servers IDs that should be returned. An empty array means all Source Servers.
     * </p>
     * 
     * @param sourceServerIDs
     *        An array of Source Servers IDs that should be returned. An empty array means all Source Servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withSourceServerIDs(java.util.Collection<String> sourceServerIDs) {
        setSourceServerIDs(sourceServerIDs);
        return this;
    }

    /**
     * <p>
     * An array of staging account IDs that extended source servers belong to. An empty array means all source servers
     * will be shown.
     * </p>
     * 
     * @return An array of staging account IDs that extended source servers belong to. An empty array means all source
     *         servers will be shown.
     */

    public java.util.List<String> getStagingAccountIDs() {
        return stagingAccountIDs;
    }

    /**
     * <p>
     * An array of staging account IDs that extended source servers belong to. An empty array means all source servers
     * will be shown.
     * </p>
     * 
     * @param stagingAccountIDs
     *        An array of staging account IDs that extended source servers belong to. An empty array means all source
     *        servers will be shown.
     */

    public void setStagingAccountIDs(java.util.Collection<String> stagingAccountIDs) {
        if (stagingAccountIDs == null) {
            this.stagingAccountIDs = null;
            return;
        }

        this.stagingAccountIDs = new java.util.ArrayList<String>(stagingAccountIDs);
    }

    /**
     * <p>
     * An array of staging account IDs that extended source servers belong to. An empty array means all source servers
     * will be shown.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStagingAccountIDs(java.util.Collection)} or {@link #withStagingAccountIDs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param stagingAccountIDs
     *        An array of staging account IDs that extended source servers belong to. An empty array means all source
     *        servers will be shown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withStagingAccountIDs(String... stagingAccountIDs) {
        if (this.stagingAccountIDs == null) {
            setStagingAccountIDs(new java.util.ArrayList<String>(stagingAccountIDs.length));
        }
        for (String ele : stagingAccountIDs) {
            this.stagingAccountIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of staging account IDs that extended source servers belong to. An empty array means all source servers
     * will be shown.
     * </p>
     * 
     * @param stagingAccountIDs
     *        An array of staging account IDs that extended source servers belong to. An empty array means all source
     *        servers will be shown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withStagingAccountIDs(java.util.Collection<String> stagingAccountIDs) {
        setStagingAccountIDs(stagingAccountIDs);
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
        if (getHardwareId() != null)
            sb.append("HardwareId: ").append(getHardwareId()).append(",");
        if (getSourceServerIDs() != null)
            sb.append("SourceServerIDs: ").append(getSourceServerIDs()).append(",");
        if (getStagingAccountIDs() != null)
            sb.append("StagingAccountIDs: ").append(getStagingAccountIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSourceServersRequestFilters == false)
            return false;
        DescribeSourceServersRequestFilters other = (DescribeSourceServersRequestFilters) obj;
        if (other.getHardwareId() == null ^ this.getHardwareId() == null)
            return false;
        if (other.getHardwareId() != null && other.getHardwareId().equals(this.getHardwareId()) == false)
            return false;
        if (other.getSourceServerIDs() == null ^ this.getSourceServerIDs() == null)
            return false;
        if (other.getSourceServerIDs() != null && other.getSourceServerIDs().equals(this.getSourceServerIDs()) == false)
            return false;
        if (other.getStagingAccountIDs() == null ^ this.getStagingAccountIDs() == null)
            return false;
        if (other.getStagingAccountIDs() != null && other.getStagingAccountIDs().equals(this.getStagingAccountIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHardwareId() == null) ? 0 : getHardwareId().hashCode());
        hashCode = prime * hashCode + ((getSourceServerIDs() == null) ? 0 : getSourceServerIDs().hashCode());
        hashCode = prime * hashCode + ((getStagingAccountIDs() == null) ? 0 : getStagingAccountIDs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSourceServersRequestFilters clone() {
        try {
            return (DescribeSourceServersRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.DescribeSourceServersRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
