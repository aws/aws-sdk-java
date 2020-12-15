/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a component on a AWS IoT Greengrass core device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/InstalledComponent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstalledComponent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The version of the component.
     * </p>
     */
    private String componentVersion;
    /**
     * <p>
     * The lifecycle state of the component.
     * </p>
     */
    private String lifecycleState;
    /**
     * <p>
     * The details about the lifecycle state of the component.
     * </p>
     */
    private String lifecycleStateDetails;
    /**
     * <p>
     * Whether or not the component is a root component.
     * </p>
     */
    private Boolean isRoot;

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstalledComponent withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.
     */

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @return The version of the component.
     */

    public String getComponentVersion() {
        return this.componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstalledComponent withComponentVersion(String componentVersion) {
        setComponentVersion(componentVersion);
        return this;
    }

    /**
     * <p>
     * The lifecycle state of the component.
     * </p>
     * 
     * @param lifecycleState
     *        The lifecycle state of the component.
     * @see InstalledComponentLifecycleState
     */

    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    /**
     * <p>
     * The lifecycle state of the component.
     * </p>
     * 
     * @return The lifecycle state of the component.
     * @see InstalledComponentLifecycleState
     */

    public String getLifecycleState() {
        return this.lifecycleState;
    }

    /**
     * <p>
     * The lifecycle state of the component.
     * </p>
     * 
     * @param lifecycleState
     *        The lifecycle state of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstalledComponentLifecycleState
     */

    public InstalledComponent withLifecycleState(String lifecycleState) {
        setLifecycleState(lifecycleState);
        return this;
    }

    /**
     * <p>
     * The lifecycle state of the component.
     * </p>
     * 
     * @param lifecycleState
     *        The lifecycle state of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstalledComponentLifecycleState
     */

    public InstalledComponent withLifecycleState(InstalledComponentLifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState.toString();
        return this;
    }

    /**
     * <p>
     * The details about the lifecycle state of the component.
     * </p>
     * 
     * @param lifecycleStateDetails
     *        The details about the lifecycle state of the component.
     */

    public void setLifecycleStateDetails(String lifecycleStateDetails) {
        this.lifecycleStateDetails = lifecycleStateDetails;
    }

    /**
     * <p>
     * The details about the lifecycle state of the component.
     * </p>
     * 
     * @return The details about the lifecycle state of the component.
     */

    public String getLifecycleStateDetails() {
        return this.lifecycleStateDetails;
    }

    /**
     * <p>
     * The details about the lifecycle state of the component.
     * </p>
     * 
     * @param lifecycleStateDetails
     *        The details about the lifecycle state of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstalledComponent withLifecycleStateDetails(String lifecycleStateDetails) {
        setLifecycleStateDetails(lifecycleStateDetails);
        return this;
    }

    /**
     * <p>
     * Whether or not the component is a root component.
     * </p>
     * 
     * @param isRoot
     *        Whether or not the component is a root component.
     */

    public void setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
    }

    /**
     * <p>
     * Whether or not the component is a root component.
     * </p>
     * 
     * @return Whether or not the component is a root component.
     */

    public Boolean getIsRoot() {
        return this.isRoot;
    }

    /**
     * <p>
     * Whether or not the component is a root component.
     * </p>
     * 
     * @param isRoot
     *        Whether or not the component is a root component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstalledComponent withIsRoot(Boolean isRoot) {
        setIsRoot(isRoot);
        return this;
    }

    /**
     * <p>
     * Whether or not the component is a root component.
     * </p>
     * 
     * @return Whether or not the component is a root component.
     */

    public Boolean isRoot() {
        return this.isRoot;
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getComponentVersion() != null)
            sb.append("ComponentVersion: ").append(getComponentVersion()).append(",");
        if (getLifecycleState() != null)
            sb.append("LifecycleState: ").append(getLifecycleState()).append(",");
        if (getLifecycleStateDetails() != null)
            sb.append("LifecycleStateDetails: ").append(getLifecycleStateDetails()).append(",");
        if (getIsRoot() != null)
            sb.append("IsRoot: ").append(getIsRoot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstalledComponent == false)
            return false;
        InstalledComponent other = (InstalledComponent) obj;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getComponentVersion() == null ^ this.getComponentVersion() == null)
            return false;
        if (other.getComponentVersion() != null && other.getComponentVersion().equals(this.getComponentVersion()) == false)
            return false;
        if (other.getLifecycleState() == null ^ this.getLifecycleState() == null)
            return false;
        if (other.getLifecycleState() != null && other.getLifecycleState().equals(this.getLifecycleState()) == false)
            return false;
        if (other.getLifecycleStateDetails() == null ^ this.getLifecycleStateDetails() == null)
            return false;
        if (other.getLifecycleStateDetails() != null && other.getLifecycleStateDetails().equals(this.getLifecycleStateDetails()) == false)
            return false;
        if (other.getIsRoot() == null ^ this.getIsRoot() == null)
            return false;
        if (other.getIsRoot() != null && other.getIsRoot().equals(this.getIsRoot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getComponentVersion() == null) ? 0 : getComponentVersion().hashCode());
        hashCode = prime * hashCode + ((getLifecycleState() == null) ? 0 : getLifecycleState().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStateDetails() == null) ? 0 : getLifecycleStateDetails().hashCode());
        hashCode = prime * hashCode + ((getIsRoot() == null) ? 0 : getIsRoot().hashCode());
        return hashCode;
    }

    @Override
    public InstalledComponent clone() {
        try {
            return (InstalledComponent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.InstalledComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
