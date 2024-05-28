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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the EC2 Mac Dedicated Host.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MacHost" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MacHost implements Serializable, Cloneable {

    /**
     * <p>
     * The EC2 Mac Dedicated Host ID.
     * </p>
     */
    private String hostId;
    /**
     * <p>
     * The latest macOS versions that the EC2 Mac Dedicated Host can launch without being upgraded.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> macOSLatestSupportedVersions;

    /**
     * <p>
     * The EC2 Mac Dedicated Host ID.
     * </p>
     * 
     * @param hostId
     *        The EC2 Mac Dedicated Host ID.
     */

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The EC2 Mac Dedicated Host ID.
     * </p>
     * 
     * @return The EC2 Mac Dedicated Host ID.
     */

    public String getHostId() {
        return this.hostId;
    }

    /**
     * <p>
     * The EC2 Mac Dedicated Host ID.
     * </p>
     * 
     * @param hostId
     *        The EC2 Mac Dedicated Host ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacHost withHostId(String hostId) {
        setHostId(hostId);
        return this;
    }

    /**
     * <p>
     * The latest macOS versions that the EC2 Mac Dedicated Host can launch without being upgraded.
     * </p>
     * 
     * @return The latest macOS versions that the EC2 Mac Dedicated Host can launch without being upgraded.
     */

    public java.util.List<String> getMacOSLatestSupportedVersions() {
        if (macOSLatestSupportedVersions == null) {
            macOSLatestSupportedVersions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return macOSLatestSupportedVersions;
    }

    /**
     * <p>
     * The latest macOS versions that the EC2 Mac Dedicated Host can launch without being upgraded.
     * </p>
     * 
     * @param macOSLatestSupportedVersions
     *        The latest macOS versions that the EC2 Mac Dedicated Host can launch without being upgraded.
     */

    public void setMacOSLatestSupportedVersions(java.util.Collection<String> macOSLatestSupportedVersions) {
        if (macOSLatestSupportedVersions == null) {
            this.macOSLatestSupportedVersions = null;
            return;
        }

        this.macOSLatestSupportedVersions = new com.amazonaws.internal.SdkInternalList<String>(macOSLatestSupportedVersions);
    }

    /**
     * <p>
     * The latest macOS versions that the EC2 Mac Dedicated Host can launch without being upgraded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMacOSLatestSupportedVersions(java.util.Collection)} or
     * {@link #withMacOSLatestSupportedVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param macOSLatestSupportedVersions
     *        The latest macOS versions that the EC2 Mac Dedicated Host can launch without being upgraded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacHost withMacOSLatestSupportedVersions(String... macOSLatestSupportedVersions) {
        if (this.macOSLatestSupportedVersions == null) {
            setMacOSLatestSupportedVersions(new com.amazonaws.internal.SdkInternalList<String>(macOSLatestSupportedVersions.length));
        }
        for (String ele : macOSLatestSupportedVersions) {
            this.macOSLatestSupportedVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The latest macOS versions that the EC2 Mac Dedicated Host can launch without being upgraded.
     * </p>
     * 
     * @param macOSLatestSupportedVersions
     *        The latest macOS versions that the EC2 Mac Dedicated Host can launch without being upgraded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacHost withMacOSLatestSupportedVersions(java.util.Collection<String> macOSLatestSupportedVersions) {
        setMacOSLatestSupportedVersions(macOSLatestSupportedVersions);
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
        if (getHostId() != null)
            sb.append("HostId: ").append(getHostId()).append(",");
        if (getMacOSLatestSupportedVersions() != null)
            sb.append("MacOSLatestSupportedVersions: ").append(getMacOSLatestSupportedVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MacHost == false)
            return false;
        MacHost other = (MacHost) obj;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getMacOSLatestSupportedVersions() == null ^ this.getMacOSLatestSupportedVersions() == null)
            return false;
        if (other.getMacOSLatestSupportedVersions() != null && other.getMacOSLatestSupportedVersions().equals(this.getMacOSLatestSupportedVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode + ((getMacOSLatestSupportedVersions() == null) ? 0 : getMacOSLatestSupportedVersions().hashCode());
        return hashCode;
    }

    @Override
    public MacHost clone() {
        try {
            return (MacHost) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
