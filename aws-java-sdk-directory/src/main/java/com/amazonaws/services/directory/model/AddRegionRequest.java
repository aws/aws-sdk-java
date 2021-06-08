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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AddRegion" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddRegionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory to which you want to add Region replication.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The name of the Region where you want to add domain controllers for replication. For example,
     * <code>us-east-1</code>.
     * </p>
     */
    private String regionName;

    private DirectoryVpcSettings vPCSettings;

    /**
     * <p>
     * The identifier of the directory to which you want to add Region replication.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory to which you want to add Region replication.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory to which you want to add Region replication.
     * </p>
     * 
     * @return The identifier of the directory to which you want to add Region replication.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory to which you want to add Region replication.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory to which you want to add Region replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddRegionRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The name of the Region where you want to add domain controllers for replication. For example,
     * <code>us-east-1</code>.
     * </p>
     * 
     * @param regionName
     *        The name of the Region where you want to add domain controllers for replication. For example,
     *        <code>us-east-1</code>.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the Region where you want to add domain controllers for replication. For example,
     * <code>us-east-1</code>.
     * </p>
     * 
     * @return The name of the Region where you want to add domain controllers for replication. For example,
     *         <code>us-east-1</code>.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The name of the Region where you want to add domain controllers for replication. For example,
     * <code>us-east-1</code>.
     * </p>
     * 
     * @param regionName
     *        The name of the Region where you want to add domain controllers for replication. For example,
     *        <code>us-east-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddRegionRequest withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * @param vPCSettings
     */

    public void setVPCSettings(DirectoryVpcSettings vPCSettings) {
        this.vPCSettings = vPCSettings;
    }

    /**
     * @return
     */

    public DirectoryVpcSettings getVPCSettings() {
        return this.vPCSettings;
    }

    /**
     * @param vPCSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddRegionRequest withVPCSettings(DirectoryVpcSettings vPCSettings) {
        setVPCSettings(vPCSettings);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getVPCSettings() != null)
            sb.append("VPCSettings: ").append(getVPCSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddRegionRequest == false)
            return false;
        AddRegionRequest other = (AddRegionRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getVPCSettings() == null ^ this.getVPCSettings() == null)
            return false;
        if (other.getVPCSettings() != null && other.getVPCSettings().equals(this.getVPCSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getVPCSettings() == null) ? 0 : getVPCSettings().hashCode());
        return hashCode;
    }

    @Override
    public AddRegionRequest clone() {
        return (AddRegionRequest) super.clone();
    }

}
