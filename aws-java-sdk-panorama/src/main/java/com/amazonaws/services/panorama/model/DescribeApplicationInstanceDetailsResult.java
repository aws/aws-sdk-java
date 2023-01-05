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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstanceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationInstanceDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The application instance's ID.
     * </p>
     */
    private String applicationInstanceId;
    /**
     * <p>
     * The ID of the application instance that this instance replaced.
     * </p>
     */
    private String applicationInstanceIdToReplace;
    /**
     * <p>
     * When the application instance was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The application instance's default runtime context device.
     * </p>
     */
    private String defaultRuntimeContextDevice;
    /**
     * <p>
     * The application instance's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Parameter overrides for the configuration manifest.
     * </p>
     */
    private ManifestOverridesPayload manifestOverridesPayload;
    /**
     * <p>
     * The application instance's configuration manifest.
     * </p>
     */
    private ManifestPayload manifestPayload;
    /**
     * <p>
     * The application instance's name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The application instance's ID.
     * </p>
     * 
     * @param applicationInstanceId
     *        The application instance's ID.
     */

    public void setApplicationInstanceId(String applicationInstanceId) {
        this.applicationInstanceId = applicationInstanceId;
    }

    /**
     * <p>
     * The application instance's ID.
     * </p>
     * 
     * @return The application instance's ID.
     */

    public String getApplicationInstanceId() {
        return this.applicationInstanceId;
    }

    /**
     * <p>
     * The application instance's ID.
     * </p>
     * 
     * @param applicationInstanceId
     *        The application instance's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceDetailsResult withApplicationInstanceId(String applicationInstanceId) {
        setApplicationInstanceId(applicationInstanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the application instance that this instance replaced.
     * </p>
     * 
     * @param applicationInstanceIdToReplace
     *        The ID of the application instance that this instance replaced.
     */

    public void setApplicationInstanceIdToReplace(String applicationInstanceIdToReplace) {
        this.applicationInstanceIdToReplace = applicationInstanceIdToReplace;
    }

    /**
     * <p>
     * The ID of the application instance that this instance replaced.
     * </p>
     * 
     * @return The ID of the application instance that this instance replaced.
     */

    public String getApplicationInstanceIdToReplace() {
        return this.applicationInstanceIdToReplace;
    }

    /**
     * <p>
     * The ID of the application instance that this instance replaced.
     * </p>
     * 
     * @param applicationInstanceIdToReplace
     *        The ID of the application instance that this instance replaced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceDetailsResult withApplicationInstanceIdToReplace(String applicationInstanceIdToReplace) {
        setApplicationInstanceIdToReplace(applicationInstanceIdToReplace);
        return this;
    }

    /**
     * <p>
     * When the application instance was created.
     * </p>
     * 
     * @param createdTime
     *        When the application instance was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the application instance was created.
     * </p>
     * 
     * @return When the application instance was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * When the application instance was created.
     * </p>
     * 
     * @param createdTime
     *        When the application instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceDetailsResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The application instance's default runtime context device.
     * </p>
     * 
     * @param defaultRuntimeContextDevice
     *        The application instance's default runtime context device.
     */

    public void setDefaultRuntimeContextDevice(String defaultRuntimeContextDevice) {
        this.defaultRuntimeContextDevice = defaultRuntimeContextDevice;
    }

    /**
     * <p>
     * The application instance's default runtime context device.
     * </p>
     * 
     * @return The application instance's default runtime context device.
     */

    public String getDefaultRuntimeContextDevice() {
        return this.defaultRuntimeContextDevice;
    }

    /**
     * <p>
     * The application instance's default runtime context device.
     * </p>
     * 
     * @param defaultRuntimeContextDevice
     *        The application instance's default runtime context device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceDetailsResult withDefaultRuntimeContextDevice(String defaultRuntimeContextDevice) {
        setDefaultRuntimeContextDevice(defaultRuntimeContextDevice);
        return this;
    }

    /**
     * <p>
     * The application instance's description.
     * </p>
     * 
     * @param description
     *        The application instance's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The application instance's description.
     * </p>
     * 
     * @return The application instance's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The application instance's description.
     * </p>
     * 
     * @param description
     *        The application instance's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceDetailsResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Parameter overrides for the configuration manifest.
     * </p>
     * 
     * @param manifestOverridesPayload
     *        Parameter overrides for the configuration manifest.
     */

    public void setManifestOverridesPayload(ManifestOverridesPayload manifestOverridesPayload) {
        this.manifestOverridesPayload = manifestOverridesPayload;
    }

    /**
     * <p>
     * Parameter overrides for the configuration manifest.
     * </p>
     * 
     * @return Parameter overrides for the configuration manifest.
     */

    public ManifestOverridesPayload getManifestOverridesPayload() {
        return this.manifestOverridesPayload;
    }

    /**
     * <p>
     * Parameter overrides for the configuration manifest.
     * </p>
     * 
     * @param manifestOverridesPayload
     *        Parameter overrides for the configuration manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceDetailsResult withManifestOverridesPayload(ManifestOverridesPayload manifestOverridesPayload) {
        setManifestOverridesPayload(manifestOverridesPayload);
        return this;
    }

    /**
     * <p>
     * The application instance's configuration manifest.
     * </p>
     * 
     * @param manifestPayload
     *        The application instance's configuration manifest.
     */

    public void setManifestPayload(ManifestPayload manifestPayload) {
        this.manifestPayload = manifestPayload;
    }

    /**
     * <p>
     * The application instance's configuration manifest.
     * </p>
     * 
     * @return The application instance's configuration manifest.
     */

    public ManifestPayload getManifestPayload() {
        return this.manifestPayload;
    }

    /**
     * <p>
     * The application instance's configuration manifest.
     * </p>
     * 
     * @param manifestPayload
     *        The application instance's configuration manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceDetailsResult withManifestPayload(ManifestPayload manifestPayload) {
        setManifestPayload(manifestPayload);
        return this;
    }

    /**
     * <p>
     * The application instance's name.
     * </p>
     * 
     * @param name
     *        The application instance's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The application instance's name.
     * </p>
     * 
     * @return The application instance's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The application instance's name.
     * </p>
     * 
     * @param name
     *        The application instance's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceDetailsResult withName(String name) {
        setName(name);
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
        if (getApplicationInstanceId() != null)
            sb.append("ApplicationInstanceId: ").append(getApplicationInstanceId()).append(",");
        if (getApplicationInstanceIdToReplace() != null)
            sb.append("ApplicationInstanceIdToReplace: ").append(getApplicationInstanceIdToReplace()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDefaultRuntimeContextDevice() != null)
            sb.append("DefaultRuntimeContextDevice: ").append(getDefaultRuntimeContextDevice()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getManifestOverridesPayload() != null)
            sb.append("ManifestOverridesPayload: ").append(getManifestOverridesPayload()).append(",");
        if (getManifestPayload() != null)
            sb.append("ManifestPayload: ").append(getManifestPayload()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationInstanceDetailsResult == false)
            return false;
        DescribeApplicationInstanceDetailsResult other = (DescribeApplicationInstanceDetailsResult) obj;
        if (other.getApplicationInstanceId() == null ^ this.getApplicationInstanceId() == null)
            return false;
        if (other.getApplicationInstanceId() != null && other.getApplicationInstanceId().equals(this.getApplicationInstanceId()) == false)
            return false;
        if (other.getApplicationInstanceIdToReplace() == null ^ this.getApplicationInstanceIdToReplace() == null)
            return false;
        if (other.getApplicationInstanceIdToReplace() != null
                && other.getApplicationInstanceIdToReplace().equals(this.getApplicationInstanceIdToReplace()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDefaultRuntimeContextDevice() == null ^ this.getDefaultRuntimeContextDevice() == null)
            return false;
        if (other.getDefaultRuntimeContextDevice() != null && other.getDefaultRuntimeContextDevice().equals(this.getDefaultRuntimeContextDevice()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getManifestOverridesPayload() == null ^ this.getManifestOverridesPayload() == null)
            return false;
        if (other.getManifestOverridesPayload() != null && other.getManifestOverridesPayload().equals(this.getManifestOverridesPayload()) == false)
            return false;
        if (other.getManifestPayload() == null ^ this.getManifestPayload() == null)
            return false;
        if (other.getManifestPayload() != null && other.getManifestPayload().equals(this.getManifestPayload()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationInstanceId() == null) ? 0 : getApplicationInstanceId().hashCode());
        hashCode = prime * hashCode + ((getApplicationInstanceIdToReplace() == null) ? 0 : getApplicationInstanceIdToReplace().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDefaultRuntimeContextDevice() == null) ? 0 : getDefaultRuntimeContextDevice().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getManifestOverridesPayload() == null) ? 0 : getManifestOverridesPayload().hashCode());
        hashCode = prime * hashCode + ((getManifestPayload() == null) ? 0 : getManifestPayload().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationInstanceDetailsResult clone() {
        try {
            return (DescribeApplicationInstanceDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
