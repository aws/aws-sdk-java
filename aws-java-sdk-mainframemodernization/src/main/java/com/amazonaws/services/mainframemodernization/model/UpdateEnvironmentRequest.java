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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UpdateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether to update the runtime environment during the maintenance window. The default is false.
     * Currently, Amazon Web Services Mainframe Modernization accepts the <code>engineVersion</code> parameter only if
     * <code>applyDuringMaintenanceWindow</code> is true. If any parameter other than <code>engineVersion</code> is
     * provided in <code>UpdateEnvironmentRequest</code>, it will fail if <code>applyDuringMaintenanceWindow</code> is
     * set to true.
     * </p>
     */
    private Boolean applyDuringMaintenanceWindow;
    /**
     * <p>
     * The desired capacity for the runtime environment to update.
     * </p>
     */
    private Integer desiredCapacity;
    /**
     * <p>
     * The version of the runtime engine for the runtime environment.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The unique identifier of the runtime environment that you want to update.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The instance type for the runtime environment to update.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Configures the maintenance window you want for the runtime environment. If you do not provide a value, a random
     * system-generated value will be assigned.
     * </p>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * Indicates whether to update the runtime environment during the maintenance window. The default is false.
     * Currently, Amazon Web Services Mainframe Modernization accepts the <code>engineVersion</code> parameter only if
     * <code>applyDuringMaintenanceWindow</code> is true. If any parameter other than <code>engineVersion</code> is
     * provided in <code>UpdateEnvironmentRequest</code>, it will fail if <code>applyDuringMaintenanceWindow</code> is
     * set to true.
     * </p>
     * 
     * @param applyDuringMaintenanceWindow
     *        Indicates whether to update the runtime environment during the maintenance window. The default is false.
     *        Currently, Amazon Web Services Mainframe Modernization accepts the <code>engineVersion</code> parameter
     *        only if <code>applyDuringMaintenanceWindow</code> is true. If any parameter other than
     *        <code>engineVersion</code> is provided in <code>UpdateEnvironmentRequest</code>, it will fail if
     *        <code>applyDuringMaintenanceWindow</code> is set to true.
     */

    public void setApplyDuringMaintenanceWindow(Boolean applyDuringMaintenanceWindow) {
        this.applyDuringMaintenanceWindow = applyDuringMaintenanceWindow;
    }

    /**
     * <p>
     * Indicates whether to update the runtime environment during the maintenance window. The default is false.
     * Currently, Amazon Web Services Mainframe Modernization accepts the <code>engineVersion</code> parameter only if
     * <code>applyDuringMaintenanceWindow</code> is true. If any parameter other than <code>engineVersion</code> is
     * provided in <code>UpdateEnvironmentRequest</code>, it will fail if <code>applyDuringMaintenanceWindow</code> is
     * set to true.
     * </p>
     * 
     * @return Indicates whether to update the runtime environment during the maintenance window. The default is false.
     *         Currently, Amazon Web Services Mainframe Modernization accepts the <code>engineVersion</code> parameter
     *         only if <code>applyDuringMaintenanceWindow</code> is true. If any parameter other than
     *         <code>engineVersion</code> is provided in <code>UpdateEnvironmentRequest</code>, it will fail if
     *         <code>applyDuringMaintenanceWindow</code> is set to true.
     */

    public Boolean getApplyDuringMaintenanceWindow() {
        return this.applyDuringMaintenanceWindow;
    }

    /**
     * <p>
     * Indicates whether to update the runtime environment during the maintenance window. The default is false.
     * Currently, Amazon Web Services Mainframe Modernization accepts the <code>engineVersion</code> parameter only if
     * <code>applyDuringMaintenanceWindow</code> is true. If any parameter other than <code>engineVersion</code> is
     * provided in <code>UpdateEnvironmentRequest</code>, it will fail if <code>applyDuringMaintenanceWindow</code> is
     * set to true.
     * </p>
     * 
     * @param applyDuringMaintenanceWindow
     *        Indicates whether to update the runtime environment during the maintenance window. The default is false.
     *        Currently, Amazon Web Services Mainframe Modernization accepts the <code>engineVersion</code> parameter
     *        only if <code>applyDuringMaintenanceWindow</code> is true. If any parameter other than
     *        <code>engineVersion</code> is provided in <code>UpdateEnvironmentRequest</code>, it will fail if
     *        <code>applyDuringMaintenanceWindow</code> is set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withApplyDuringMaintenanceWindow(Boolean applyDuringMaintenanceWindow) {
        setApplyDuringMaintenanceWindow(applyDuringMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Indicates whether to update the runtime environment during the maintenance window. The default is false.
     * Currently, Amazon Web Services Mainframe Modernization accepts the <code>engineVersion</code> parameter only if
     * <code>applyDuringMaintenanceWindow</code> is true. If any parameter other than <code>engineVersion</code> is
     * provided in <code>UpdateEnvironmentRequest</code>, it will fail if <code>applyDuringMaintenanceWindow</code> is
     * set to true.
     * </p>
     * 
     * @return Indicates whether to update the runtime environment during the maintenance window. The default is false.
     *         Currently, Amazon Web Services Mainframe Modernization accepts the <code>engineVersion</code> parameter
     *         only if <code>applyDuringMaintenanceWindow</code> is true. If any parameter other than
     *         <code>engineVersion</code> is provided in <code>UpdateEnvironmentRequest</code>, it will fail if
     *         <code>applyDuringMaintenanceWindow</code> is set to true.
     */

    public Boolean isApplyDuringMaintenanceWindow() {
        return this.applyDuringMaintenanceWindow;
    }

    /**
     * <p>
     * The desired capacity for the runtime environment to update.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired capacity for the runtime environment to update.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The desired capacity for the runtime environment to update.
     * </p>
     * 
     * @return The desired capacity for the runtime environment to update.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The desired capacity for the runtime environment to update.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired capacity for the runtime environment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withDesiredCapacity(Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
        return this;
    }

    /**
     * <p>
     * The version of the runtime engine for the runtime environment.
     * </p>
     * 
     * @param engineVersion
     *        The version of the runtime engine for the runtime environment.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the runtime engine for the runtime environment.
     * </p>
     * 
     * @return The version of the runtime engine for the runtime environment.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the runtime engine for the runtime environment.
     * </p>
     * 
     * @param engineVersion
     *        The version of the runtime engine for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment that you want to update.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the runtime environment that you want to update.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment that you want to update.
     * </p>
     * 
     * @return The unique identifier of the runtime environment that you want to update.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment that you want to update.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the runtime environment that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The instance type for the runtime environment to update.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the runtime environment to update.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for the runtime environment to update.
     * </p>
     * 
     * @return The instance type for the runtime environment to update.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for the runtime environment to update.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the runtime environment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Configures the maintenance window you want for the runtime environment. If you do not provide a value, a random
     * system-generated value will be assigned.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Configures the maintenance window you want for the runtime environment. If you do not provide a value, a
     *        random system-generated value will be assigned.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Configures the maintenance window you want for the runtime environment. If you do not provide a value, a random
     * system-generated value will be assigned.
     * </p>
     * 
     * @return Configures the maintenance window you want for the runtime environment. If you do not provide a value, a
     *         random system-generated value will be assigned.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Configures the maintenance window you want for the runtime environment. If you do not provide a value, a random
     * system-generated value will be assigned.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Configures the maintenance window you want for the runtime environment. If you do not provide a value, a
     *        random system-generated value will be assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
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
        if (getApplyDuringMaintenanceWindow() != null)
            sb.append("ApplyDuringMaintenanceWindow: ").append(getApplyDuringMaintenanceWindow()).append(",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: ").append(getDesiredCapacity()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentRequest == false)
            return false;
        UpdateEnvironmentRequest other = (UpdateEnvironmentRequest) obj;
        if (other.getApplyDuringMaintenanceWindow() == null ^ this.getApplyDuringMaintenanceWindow() == null)
            return false;
        if (other.getApplyDuringMaintenanceWindow() != null && other.getApplyDuringMaintenanceWindow().equals(this.getApplyDuringMaintenanceWindow()) == false)
            return false;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplyDuringMaintenanceWindow() == null) ? 0 : getApplyDuringMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentRequest clone() {
        return (UpdateEnvironmentRequest) super.clone();
    }

}
