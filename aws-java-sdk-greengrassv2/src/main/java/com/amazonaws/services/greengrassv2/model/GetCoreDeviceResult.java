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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetCoreDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCoreDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     */
    private String coreDeviceThingName;
    /**
     * <p>
     * The version of the AWS IoT Greengrass Core software that the core device runs. This version is equivalent to the
     * version of the AWS IoT Greengrass nucleus component that runs on the core device. For more information, see the
     * <a href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     * Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private String coreVersion;
    /**
     * <p>
     * The operating system platform that the core device runs.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The computer architecture of the core device.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The status of the core device. The core device status can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The time at which the core device's status last updated, expressed in ISO 8601 format.
     * </p>
     */
    private java.util.Date lastStatusUpdateTimestamp;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a> in the
     * <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @param coreDeviceThingName
     *        The name of the core device. This is also the name of the AWS IoT thing.
     */

    public void setCoreDeviceThingName(String coreDeviceThingName) {
        this.coreDeviceThingName = coreDeviceThingName;
    }

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @return The name of the core device. This is also the name of the AWS IoT thing.
     */

    public String getCoreDeviceThingName() {
        return this.coreDeviceThingName;
    }

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @param coreDeviceThingName
     *        The name of the core device. This is also the name of the AWS IoT thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreDeviceResult withCoreDeviceThingName(String coreDeviceThingName) {
        setCoreDeviceThingName(coreDeviceThingName);
        return this;
    }

    /**
     * <p>
     * The version of the AWS IoT Greengrass Core software that the core device runs. This version is equivalent to the
     * version of the AWS IoT Greengrass nucleus component that runs on the core device. For more information, see the
     * <a href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     * Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param coreVersion
     *        The version of the AWS IoT Greengrass Core software that the core device runs. This version is equivalent
     *        to the version of the AWS IoT Greengrass nucleus component that runs on the core device. For more
     *        information, see the <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     *        Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public void setCoreVersion(String coreVersion) {
        this.coreVersion = coreVersion;
    }

    /**
     * <p>
     * The version of the AWS IoT Greengrass Core software that the core device runs. This version is equivalent to the
     * version of the AWS IoT Greengrass nucleus component that runs on the core device. For more information, see the
     * <a href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     * Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return The version of the AWS IoT Greengrass Core software that the core device runs. This version is equivalent
     *         to the version of the AWS IoT Greengrass nucleus component that runs on the core device. For more
     *         information, see the <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     *         Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public String getCoreVersion() {
        return this.coreVersion;
    }

    /**
     * <p>
     * The version of the AWS IoT Greengrass Core software that the core device runs. This version is equivalent to the
     * version of the AWS IoT Greengrass nucleus component that runs on the core device. For more information, see the
     * <a href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     * Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param coreVersion
     *        The version of the AWS IoT Greengrass Core software that the core device runs. This version is equivalent
     *        to the version of the AWS IoT Greengrass nucleus component that runs on the core device. For more
     *        information, see the <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/greengrass-nucleus-component.html">AWS IoT
     *        Greengrass nucleus component</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreDeviceResult withCoreVersion(String coreVersion) {
        setCoreVersion(coreVersion);
        return this;
    }

    /**
     * <p>
     * The operating system platform that the core device runs.
     * </p>
     * 
     * @param platform
     *        The operating system platform that the core device runs.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system platform that the core device runs.
     * </p>
     * 
     * @return The operating system platform that the core device runs.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The operating system platform that the core device runs.
     * </p>
     * 
     * @param platform
     *        The operating system platform that the core device runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreDeviceResult withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The computer architecture of the core device.
     * </p>
     * 
     * @param architecture
     *        The computer architecture of the core device.
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The computer architecture of the core device.
     * </p>
     * 
     * @return The computer architecture of the core device.
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The computer architecture of the core device.
     * </p>
     * 
     * @param architecture
     *        The computer architecture of the core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreDeviceResult withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The status of the core device. The core device status can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the core device. The core device status can be:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *        without issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *        core device.
     *        </p>
     *        </li>
     * @see CoreDeviceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the core device. The core device status can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the core device. The core device status can be:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *         without issue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *         core device.
     *         </p>
     *         </li>
     * @see CoreDeviceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the core device. The core device status can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the core device. The core device status can be:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *        without issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *        core device.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreDeviceStatus
     */

    public GetCoreDeviceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the core device. The core device status can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the core device. The core device status can be:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *        without issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *        core device.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreDeviceStatus
     */

    public GetCoreDeviceResult withStatus(CoreDeviceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the core device's status last updated, expressed in ISO 8601 format.
     * </p>
     * 
     * @param lastStatusUpdateTimestamp
     *        The time at which the core device's status last updated, expressed in ISO 8601 format.
     */

    public void setLastStatusUpdateTimestamp(java.util.Date lastStatusUpdateTimestamp) {
        this.lastStatusUpdateTimestamp = lastStatusUpdateTimestamp;
    }

    /**
     * <p>
     * The time at which the core device's status last updated, expressed in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the core device's status last updated, expressed in ISO 8601 format.
     */

    public java.util.Date getLastStatusUpdateTimestamp() {
        return this.lastStatusUpdateTimestamp;
    }

    /**
     * <p>
     * The time at which the core device's status last updated, expressed in ISO 8601 format.
     * </p>
     * 
     * @param lastStatusUpdateTimestamp
     *        The time at which the core device's status last updated, expressed in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreDeviceResult withLastStatusUpdateTimestamp(java.util.Date lastStatusUpdateTimestamp) {
        setLastStatusUpdateTimestamp(lastStatusUpdateTimestamp);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a> in the
     * <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a>
     *         in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a> in the
     * <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a>
     *        in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a> in the
     * <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html">Tag your resources</a>
     *        in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreDeviceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetCoreDeviceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreDeviceResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreDeviceResult clearTagsEntries() {
        this.tags = null;
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
        if (getCoreDeviceThingName() != null)
            sb.append("CoreDeviceThingName: ").append(getCoreDeviceThingName()).append(",");
        if (getCoreVersion() != null)
            sb.append("CoreVersion: ").append(getCoreVersion()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastStatusUpdateTimestamp() != null)
            sb.append("LastStatusUpdateTimestamp: ").append(getLastStatusUpdateTimestamp()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCoreDeviceResult == false)
            return false;
        GetCoreDeviceResult other = (GetCoreDeviceResult) obj;
        if (other.getCoreDeviceThingName() == null ^ this.getCoreDeviceThingName() == null)
            return false;
        if (other.getCoreDeviceThingName() != null && other.getCoreDeviceThingName().equals(this.getCoreDeviceThingName()) == false)
            return false;
        if (other.getCoreVersion() == null ^ this.getCoreVersion() == null)
            return false;
        if (other.getCoreVersion() != null && other.getCoreVersion().equals(this.getCoreVersion()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastStatusUpdateTimestamp() == null ^ this.getLastStatusUpdateTimestamp() == null)
            return false;
        if (other.getLastStatusUpdateTimestamp() != null && other.getLastStatusUpdateTimestamp().equals(this.getLastStatusUpdateTimestamp()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreDeviceThingName() == null) ? 0 : getCoreDeviceThingName().hashCode());
        hashCode = prime * hashCode + ((getCoreVersion() == null) ? 0 : getCoreVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastStatusUpdateTimestamp() == null) ? 0 : getLastStatusUpdateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetCoreDeviceResult clone() {
        try {
            return (GetCoreDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
