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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a component on a Greengrass core device.
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
     * A detailed response about the lifecycle state of the component that explains the reason why a component has an
     * error or is broken.
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
     * The status of how current the data is.
     * </p>
     * <p>
     * This response is based off of component state changes. The status reflects component disruptions and deployments.
     * If a component only sees a configuration update during a deployment, it might not undergo a state change and this
     * status would not be updated.
     * </p>
     */
    private java.util.Date lastStatusChangeTimestamp;
    /**
     * <p>
     * The last time the Greengrass core device sent a message containing a certain component to the Amazon Web Services
     * Cloud.
     * </p>
     * <p>
     * A component does not need to see a state change for this field to update.
     * </p>
     */
    private java.util.Date lastReportedTimestamp;
    /**
     * <p>
     * The most recent deployment source that brought the component to the Greengrass core device. For a thing group
     * deployment or thing deployment, the source will be the The ID of the deployment. and for local deployments it
     * will be <code>LOCAL</code>.
     * </p>
     */
    private String lastInstallationSource;
    /**
     * <p>
     * The status codes that indicate the reason for failure whenever the <code>lifecycleState</code> has an error or is
     * in a broken state.
     * </p>
     * <note>
     * <p>
     * Greengrass nucleus v2.8.0 or later is required to get an accurate <code>lifecycleStatusCodes</code> response.
     * This response can be inaccurate in earlier Greengrass nucleus versions.
     * </p>
     * </note>
     */
    private java.util.List<String> lifecycleStatusCodes;

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
     * A detailed response about the lifecycle state of the component that explains the reason why a component has an
     * error or is broken.
     * </p>
     * 
     * @param lifecycleStateDetails
     *        A detailed response about the lifecycle state of the component that explains the reason why a component
     *        has an error or is broken.
     */

    public void setLifecycleStateDetails(String lifecycleStateDetails) {
        this.lifecycleStateDetails = lifecycleStateDetails;
    }

    /**
     * <p>
     * A detailed response about the lifecycle state of the component that explains the reason why a component has an
     * error or is broken.
     * </p>
     * 
     * @return A detailed response about the lifecycle state of the component that explains the reason why a component
     *         has an error or is broken.
     */

    public String getLifecycleStateDetails() {
        return this.lifecycleStateDetails;
    }

    /**
     * <p>
     * A detailed response about the lifecycle state of the component that explains the reason why a component has an
     * error or is broken.
     * </p>
     * 
     * @param lifecycleStateDetails
     *        A detailed response about the lifecycle state of the component that explains the reason why a component
     *        has an error or is broken.
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
     * <p>
     * The status of how current the data is.
     * </p>
     * <p>
     * This response is based off of component state changes. The status reflects component disruptions and deployments.
     * If a component only sees a configuration update during a deployment, it might not undergo a state change and this
     * status would not be updated.
     * </p>
     * 
     * @param lastStatusChangeTimestamp
     *        The status of how current the data is.</p>
     *        <p>
     *        This response is based off of component state changes. The status reflects component disruptions and
     *        deployments. If a component only sees a configuration update during a deployment, it might not undergo a
     *        state change and this status would not be updated.
     */

    public void setLastStatusChangeTimestamp(java.util.Date lastStatusChangeTimestamp) {
        this.lastStatusChangeTimestamp = lastStatusChangeTimestamp;
    }

    /**
     * <p>
     * The status of how current the data is.
     * </p>
     * <p>
     * This response is based off of component state changes. The status reflects component disruptions and deployments.
     * If a component only sees a configuration update during a deployment, it might not undergo a state change and this
     * status would not be updated.
     * </p>
     * 
     * @return The status of how current the data is.</p>
     *         <p>
     *         This response is based off of component state changes. The status reflects component disruptions and
     *         deployments. If a component only sees a configuration update during a deployment, it might not undergo a
     *         state change and this status would not be updated.
     */

    public java.util.Date getLastStatusChangeTimestamp() {
        return this.lastStatusChangeTimestamp;
    }

    /**
     * <p>
     * The status of how current the data is.
     * </p>
     * <p>
     * This response is based off of component state changes. The status reflects component disruptions and deployments.
     * If a component only sees a configuration update during a deployment, it might not undergo a state change and this
     * status would not be updated.
     * </p>
     * 
     * @param lastStatusChangeTimestamp
     *        The status of how current the data is.</p>
     *        <p>
     *        This response is based off of component state changes. The status reflects component disruptions and
     *        deployments. If a component only sees a configuration update during a deployment, it might not undergo a
     *        state change and this status would not be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstalledComponent withLastStatusChangeTimestamp(java.util.Date lastStatusChangeTimestamp) {
        setLastStatusChangeTimestamp(lastStatusChangeTimestamp);
        return this;
    }

    /**
     * <p>
     * The last time the Greengrass core device sent a message containing a certain component to the Amazon Web Services
     * Cloud.
     * </p>
     * <p>
     * A component does not need to see a state change for this field to update.
     * </p>
     * 
     * @param lastReportedTimestamp
     *        The last time the Greengrass core device sent a message containing a certain component to the Amazon Web
     *        Services Cloud.</p>
     *        <p>
     *        A component does not need to see a state change for this field to update.
     */

    public void setLastReportedTimestamp(java.util.Date lastReportedTimestamp) {
        this.lastReportedTimestamp = lastReportedTimestamp;
    }

    /**
     * <p>
     * The last time the Greengrass core device sent a message containing a certain component to the Amazon Web Services
     * Cloud.
     * </p>
     * <p>
     * A component does not need to see a state change for this field to update.
     * </p>
     * 
     * @return The last time the Greengrass core device sent a message containing a certain component to the Amazon Web
     *         Services Cloud.</p>
     *         <p>
     *         A component does not need to see a state change for this field to update.
     */

    public java.util.Date getLastReportedTimestamp() {
        return this.lastReportedTimestamp;
    }

    /**
     * <p>
     * The last time the Greengrass core device sent a message containing a certain component to the Amazon Web Services
     * Cloud.
     * </p>
     * <p>
     * A component does not need to see a state change for this field to update.
     * </p>
     * 
     * @param lastReportedTimestamp
     *        The last time the Greengrass core device sent a message containing a certain component to the Amazon Web
     *        Services Cloud.</p>
     *        <p>
     *        A component does not need to see a state change for this field to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstalledComponent withLastReportedTimestamp(java.util.Date lastReportedTimestamp) {
        setLastReportedTimestamp(lastReportedTimestamp);
        return this;
    }

    /**
     * <p>
     * The most recent deployment source that brought the component to the Greengrass core device. For a thing group
     * deployment or thing deployment, the source will be the The ID of the deployment. and for local deployments it
     * will be <code>LOCAL</code>.
     * </p>
     * 
     * @param lastInstallationSource
     *        The most recent deployment source that brought the component to the Greengrass core device. For a thing
     *        group deployment or thing deployment, the source will be the The ID of the deployment. and for local
     *        deployments it will be <code>LOCAL</code>.
     */

    public void setLastInstallationSource(String lastInstallationSource) {
        this.lastInstallationSource = lastInstallationSource;
    }

    /**
     * <p>
     * The most recent deployment source that brought the component to the Greengrass core device. For a thing group
     * deployment or thing deployment, the source will be the The ID of the deployment. and for local deployments it
     * will be <code>LOCAL</code>.
     * </p>
     * 
     * @return The most recent deployment source that brought the component to the Greengrass core device. For a thing
     *         group deployment or thing deployment, the source will be the The ID of the deployment. and for local
     *         deployments it will be <code>LOCAL</code>.
     */

    public String getLastInstallationSource() {
        return this.lastInstallationSource;
    }

    /**
     * <p>
     * The most recent deployment source that brought the component to the Greengrass core device. For a thing group
     * deployment or thing deployment, the source will be the The ID of the deployment. and for local deployments it
     * will be <code>LOCAL</code>.
     * </p>
     * 
     * @param lastInstallationSource
     *        The most recent deployment source that brought the component to the Greengrass core device. For a thing
     *        group deployment or thing deployment, the source will be the The ID of the deployment. and for local
     *        deployments it will be <code>LOCAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstalledComponent withLastInstallationSource(String lastInstallationSource) {
        setLastInstallationSource(lastInstallationSource);
        return this;
    }

    /**
     * <p>
     * The status codes that indicate the reason for failure whenever the <code>lifecycleState</code> has an error or is
     * in a broken state.
     * </p>
     * <note>
     * <p>
     * Greengrass nucleus v2.8.0 or later is required to get an accurate <code>lifecycleStatusCodes</code> response.
     * This response can be inaccurate in earlier Greengrass nucleus versions.
     * </p>
     * </note>
     * 
     * @return The status codes that indicate the reason for failure whenever the <code>lifecycleState</code> has an
     *         error or is in a broken state.</p> <note>
     *         <p>
     *         Greengrass nucleus v2.8.0 or later is required to get an accurate <code>lifecycleStatusCodes</code>
     *         response. This response can be inaccurate in earlier Greengrass nucleus versions.
     *         </p>
     */

    public java.util.List<String> getLifecycleStatusCodes() {
        return lifecycleStatusCodes;
    }

    /**
     * <p>
     * The status codes that indicate the reason for failure whenever the <code>lifecycleState</code> has an error or is
     * in a broken state.
     * </p>
     * <note>
     * <p>
     * Greengrass nucleus v2.8.0 or later is required to get an accurate <code>lifecycleStatusCodes</code> response.
     * This response can be inaccurate in earlier Greengrass nucleus versions.
     * </p>
     * </note>
     * 
     * @param lifecycleStatusCodes
     *        The status codes that indicate the reason for failure whenever the <code>lifecycleState</code> has an
     *        error or is in a broken state.</p> <note>
     *        <p>
     *        Greengrass nucleus v2.8.0 or later is required to get an accurate <code>lifecycleStatusCodes</code>
     *        response. This response can be inaccurate in earlier Greengrass nucleus versions.
     *        </p>
     */

    public void setLifecycleStatusCodes(java.util.Collection<String> lifecycleStatusCodes) {
        if (lifecycleStatusCodes == null) {
            this.lifecycleStatusCodes = null;
            return;
        }

        this.lifecycleStatusCodes = new java.util.ArrayList<String>(lifecycleStatusCodes);
    }

    /**
     * <p>
     * The status codes that indicate the reason for failure whenever the <code>lifecycleState</code> has an error or is
     * in a broken state.
     * </p>
     * <note>
     * <p>
     * Greengrass nucleus v2.8.0 or later is required to get an accurate <code>lifecycleStatusCodes</code> response.
     * This response can be inaccurate in earlier Greengrass nucleus versions.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecycleStatusCodes(java.util.Collection)} or {@link #withLifecycleStatusCodes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param lifecycleStatusCodes
     *        The status codes that indicate the reason for failure whenever the <code>lifecycleState</code> has an
     *        error or is in a broken state.</p> <note>
     *        <p>
     *        Greengrass nucleus v2.8.0 or later is required to get an accurate <code>lifecycleStatusCodes</code>
     *        response. This response can be inaccurate in earlier Greengrass nucleus versions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstalledComponent withLifecycleStatusCodes(String... lifecycleStatusCodes) {
        if (this.lifecycleStatusCodes == null) {
            setLifecycleStatusCodes(new java.util.ArrayList<String>(lifecycleStatusCodes.length));
        }
        for (String ele : lifecycleStatusCodes) {
            this.lifecycleStatusCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status codes that indicate the reason for failure whenever the <code>lifecycleState</code> has an error or is
     * in a broken state.
     * </p>
     * <note>
     * <p>
     * Greengrass nucleus v2.8.0 or later is required to get an accurate <code>lifecycleStatusCodes</code> response.
     * This response can be inaccurate in earlier Greengrass nucleus versions.
     * </p>
     * </note>
     * 
     * @param lifecycleStatusCodes
     *        The status codes that indicate the reason for failure whenever the <code>lifecycleState</code> has an
     *        error or is in a broken state.</p> <note>
     *        <p>
     *        Greengrass nucleus v2.8.0 or later is required to get an accurate <code>lifecycleStatusCodes</code>
     *        response. This response can be inaccurate in earlier Greengrass nucleus versions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstalledComponent withLifecycleStatusCodes(java.util.Collection<String> lifecycleStatusCodes) {
        setLifecycleStatusCodes(lifecycleStatusCodes);
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getComponentVersion() != null)
            sb.append("ComponentVersion: ").append(getComponentVersion()).append(",");
        if (getLifecycleState() != null)
            sb.append("LifecycleState: ").append(getLifecycleState()).append(",");
        if (getLifecycleStateDetails() != null)
            sb.append("LifecycleStateDetails: ").append(getLifecycleStateDetails()).append(",");
        if (getIsRoot() != null)
            sb.append("IsRoot: ").append(getIsRoot()).append(",");
        if (getLastStatusChangeTimestamp() != null)
            sb.append("LastStatusChangeTimestamp: ").append(getLastStatusChangeTimestamp()).append(",");
        if (getLastReportedTimestamp() != null)
            sb.append("LastReportedTimestamp: ").append(getLastReportedTimestamp()).append(",");
        if (getLastInstallationSource() != null)
            sb.append("LastInstallationSource: ").append(getLastInstallationSource()).append(",");
        if (getLifecycleStatusCodes() != null)
            sb.append("LifecycleStatusCodes: ").append(getLifecycleStatusCodes());
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
        if (other.getLastStatusChangeTimestamp() == null ^ this.getLastStatusChangeTimestamp() == null)
            return false;
        if (other.getLastStatusChangeTimestamp() != null && other.getLastStatusChangeTimestamp().equals(this.getLastStatusChangeTimestamp()) == false)
            return false;
        if (other.getLastReportedTimestamp() == null ^ this.getLastReportedTimestamp() == null)
            return false;
        if (other.getLastReportedTimestamp() != null && other.getLastReportedTimestamp().equals(this.getLastReportedTimestamp()) == false)
            return false;
        if (other.getLastInstallationSource() == null ^ this.getLastInstallationSource() == null)
            return false;
        if (other.getLastInstallationSource() != null && other.getLastInstallationSource().equals(this.getLastInstallationSource()) == false)
            return false;
        if (other.getLifecycleStatusCodes() == null ^ this.getLifecycleStatusCodes() == null)
            return false;
        if (other.getLifecycleStatusCodes() != null && other.getLifecycleStatusCodes().equals(this.getLifecycleStatusCodes()) == false)
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
        hashCode = prime * hashCode + ((getLastStatusChangeTimestamp() == null) ? 0 : getLastStatusChangeTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastReportedTimestamp() == null) ? 0 : getLastReportedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastInstallationSource() == null) ? 0 : getLastInstallationSource().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatusCodes() == null) ? 0 : getLifecycleStatusCodes().hashCode());
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
