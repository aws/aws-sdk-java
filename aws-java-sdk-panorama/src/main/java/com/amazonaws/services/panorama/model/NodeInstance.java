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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A node instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/NodeInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance's current status.
     * </p>
     */
    private String currentStatus;
    /**
     * <p>
     * The node's ID.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * The instance's ID.
     * </p>
     */
    private String nodeInstanceId;
    /**
     * <p>
     * The instance's name.
     * </p>
     */
    private String nodeName;
    /**
     * <p>
     * The instance's package name.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The instance's package patch version.
     * </p>
     */
    private String packagePatchVersion;
    /**
     * <p>
     * The instance's package version.
     * </p>
     */
    private String packageVersion;

    /**
     * <p>
     * The instance's current status.
     * </p>
     * 
     * @param currentStatus
     *        The instance's current status.
     * @see NodeInstanceStatus
     */

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * <p>
     * The instance's current status.
     * </p>
     * 
     * @return The instance's current status.
     * @see NodeInstanceStatus
     */

    public String getCurrentStatus() {
        return this.currentStatus;
    }

    /**
     * <p>
     * The instance's current status.
     * </p>
     * 
     * @param currentStatus
     *        The instance's current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeInstanceStatus
     */

    public NodeInstance withCurrentStatus(String currentStatus) {
        setCurrentStatus(currentStatus);
        return this;
    }

    /**
     * <p>
     * The instance's current status.
     * </p>
     * 
     * @param currentStatus
     *        The instance's current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeInstanceStatus
     */

    public NodeInstance withCurrentStatus(NodeInstanceStatus currentStatus) {
        this.currentStatus = currentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The node's ID.
     * </p>
     * 
     * @param nodeId
     *        The node's ID.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * The node's ID.
     * </p>
     * 
     * @return The node's ID.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * The node's ID.
     * </p>
     * 
     * @param nodeId
     *        The node's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInstance withNodeId(String nodeId) {
        setNodeId(nodeId);
        return this;
    }

    /**
     * <p>
     * The instance's ID.
     * </p>
     * 
     * @param nodeInstanceId
     *        The instance's ID.
     */

    public void setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
    }

    /**
     * <p>
     * The instance's ID.
     * </p>
     * 
     * @return The instance's ID.
     */

    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * <p>
     * The instance's ID.
     * </p>
     * 
     * @param nodeInstanceId
     *        The instance's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInstance withNodeInstanceId(String nodeInstanceId) {
        setNodeInstanceId(nodeInstanceId);
        return this;
    }

    /**
     * <p>
     * The instance's name.
     * </p>
     * 
     * @param nodeName
     *        The instance's name.
     */

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * <p>
     * The instance's name.
     * </p>
     * 
     * @return The instance's name.
     */

    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * <p>
     * The instance's name.
     * </p>
     * 
     * @param nodeName
     *        The instance's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInstance withNodeName(String nodeName) {
        setNodeName(nodeName);
        return this;
    }

    /**
     * <p>
     * The instance's package name.
     * </p>
     * 
     * @param packageName
     *        The instance's package name.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The instance's package name.
     * </p>
     * 
     * @return The instance's package name.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The instance's package name.
     * </p>
     * 
     * @param packageName
     *        The instance's package name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInstance withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The instance's package patch version.
     * </p>
     * 
     * @param packagePatchVersion
     *        The instance's package patch version.
     */

    public void setPackagePatchVersion(String packagePatchVersion) {
        this.packagePatchVersion = packagePatchVersion;
    }

    /**
     * <p>
     * The instance's package patch version.
     * </p>
     * 
     * @return The instance's package patch version.
     */

    public String getPackagePatchVersion() {
        return this.packagePatchVersion;
    }

    /**
     * <p>
     * The instance's package patch version.
     * </p>
     * 
     * @param packagePatchVersion
     *        The instance's package patch version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInstance withPackagePatchVersion(String packagePatchVersion) {
        setPackagePatchVersion(packagePatchVersion);
        return this;
    }

    /**
     * <p>
     * The instance's package version.
     * </p>
     * 
     * @param packageVersion
     *        The instance's package version.
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * The instance's package version.
     * </p>
     * 
     * @return The instance's package version.
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * The instance's package version.
     * </p>
     * 
     * @param packageVersion
     *        The instance's package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInstance withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
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
        if (getCurrentStatus() != null)
            sb.append("CurrentStatus: ").append(getCurrentStatus()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId()).append(",");
        if (getNodeInstanceId() != null)
            sb.append("NodeInstanceId: ").append(getNodeInstanceId()).append(",");
        if (getNodeName() != null)
            sb.append("NodeName: ").append(getNodeName()).append(",");
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getPackagePatchVersion() != null)
            sb.append("PackagePatchVersion: ").append(getPackagePatchVersion()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeInstance == false)
            return false;
        NodeInstance other = (NodeInstance) obj;
        if (other.getCurrentStatus() == null ^ this.getCurrentStatus() == null)
            return false;
        if (other.getCurrentStatus() != null && other.getCurrentStatus().equals(this.getCurrentStatus()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getNodeInstanceId() == null ^ this.getNodeInstanceId() == null)
            return false;
        if (other.getNodeInstanceId() != null && other.getNodeInstanceId().equals(this.getNodeInstanceId()) == false)
            return false;
        if (other.getNodeName() == null ^ this.getNodeName() == null)
            return false;
        if (other.getNodeName() != null && other.getNodeName().equals(this.getNodeName()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPackagePatchVersion() == null ^ this.getPackagePatchVersion() == null)
            return false;
        if (other.getPackagePatchVersion() != null && other.getPackagePatchVersion().equals(this.getPackagePatchVersion()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentStatus() == null) ? 0 : getCurrentStatus().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getNodeInstanceId() == null) ? 0 : getNodeInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getPackagePatchVersion() == null) ? 0 : getPackagePatchVersion().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        return hashCode;
    }

    @Override
    public NodeInstance clone() {
        try {
            return (NodeInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.NodeInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
