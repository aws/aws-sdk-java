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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Docker volume.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to create the Docker volume automatically if it does not already exist.
     * </p>
     */
    private Boolean autoprovision;
    /**
     * <p>
     * The Docker volume driver to use.
     * </p>
     */
    private String driver;
    /**
     * <p>
     * A map of Docker driver-specific options that are passed through.
     * </p>
     */
    private java.util.Map<String, String> driverOpts;
    /**
     * <p>
     * Custom metadata to add to the Docker volume.
     * </p>
     */
    private java.util.Map<String, String> labels;
    /**
     * <p>
     * The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task are
     * provisioned automatically when the task starts and destroyed when the task stops. Docker volumes that are shared
     * persist after the task stops.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * Whether to create the Docker volume automatically if it does not already exist.
     * </p>
     * 
     * @param autoprovision
     *        Whether to create the Docker volume automatically if it does not already exist.
     */

    public void setAutoprovision(Boolean autoprovision) {
        this.autoprovision = autoprovision;
    }

    /**
     * <p>
     * Whether to create the Docker volume automatically if it does not already exist.
     * </p>
     * 
     * @return Whether to create the Docker volume automatically if it does not already exist.
     */

    public Boolean getAutoprovision() {
        return this.autoprovision;
    }

    /**
     * <p>
     * Whether to create the Docker volume automatically if it does not already exist.
     * </p>
     * 
     * @param autoprovision
     *        Whether to create the Docker volume automatically if it does not already exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails withAutoprovision(Boolean autoprovision) {
        setAutoprovision(autoprovision);
        return this;
    }

    /**
     * <p>
     * Whether to create the Docker volume automatically if it does not already exist.
     * </p>
     * 
     * @return Whether to create the Docker volume automatically if it does not already exist.
     */

    public Boolean isAutoprovision() {
        return this.autoprovision;
    }

    /**
     * <p>
     * The Docker volume driver to use.
     * </p>
     * 
     * @param driver
     *        The Docker volume driver to use.
     */

    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * <p>
     * The Docker volume driver to use.
     * </p>
     * 
     * @return The Docker volume driver to use.
     */

    public String getDriver() {
        return this.driver;
    }

    /**
     * <p>
     * The Docker volume driver to use.
     * </p>
     * 
     * @param driver
     *        The Docker volume driver to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails withDriver(String driver) {
        setDriver(driver);
        return this;
    }

    /**
     * <p>
     * A map of Docker driver-specific options that are passed through.
     * </p>
     * 
     * @return A map of Docker driver-specific options that are passed through.
     */

    public java.util.Map<String, String> getDriverOpts() {
        return driverOpts;
    }

    /**
     * <p>
     * A map of Docker driver-specific options that are passed through.
     * </p>
     * 
     * @param driverOpts
     *        A map of Docker driver-specific options that are passed through.
     */

    public void setDriverOpts(java.util.Map<String, String> driverOpts) {
        this.driverOpts = driverOpts;
    }

    /**
     * <p>
     * A map of Docker driver-specific options that are passed through.
     * </p>
     * 
     * @param driverOpts
     *        A map of Docker driver-specific options that are passed through.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails withDriverOpts(java.util.Map<String, String> driverOpts) {
        setDriverOpts(driverOpts);
        return this;
    }

    /**
     * Add a single DriverOpts entry
     *
     * @see AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails#withDriverOpts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails addDriverOptsEntry(String key, String value) {
        if (null == this.driverOpts) {
            this.driverOpts = new java.util.HashMap<String, String>();
        }
        if (this.driverOpts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.driverOpts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DriverOpts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails clearDriverOptsEntries() {
        this.driverOpts = null;
        return this;
    }

    /**
     * <p>
     * Custom metadata to add to the Docker volume.
     * </p>
     * 
     * @return Custom metadata to add to the Docker volume.
     */

    public java.util.Map<String, String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * Custom metadata to add to the Docker volume.
     * </p>
     * 
     * @param labels
     *        Custom metadata to add to the Docker volume.
     */

    public void setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * <p>
     * Custom metadata to add to the Docker volume.
     * </p>
     * 
     * @param labels
     *        Custom metadata to add to the Docker volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails withLabels(java.util.Map<String, String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * Add a single Labels entry
     *
     * @see AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails#withLabels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails addLabelsEntry(String key, String value) {
        if (null == this.labels) {
            this.labels = new java.util.HashMap<String, String>();
        }
        if (this.labels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.labels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Labels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails clearLabelsEntries() {
        this.labels = null;
        return this;
    }

    /**
     * <p>
     * The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task are
     * provisioned automatically when the task starts and destroyed when the task stops. Docker volumes that are shared
     * persist after the task stops.
     * </p>
     * 
     * @param scope
     *        The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task
     *        are provisioned automatically when the task starts and destroyed when the task stops. Docker volumes that
     *        are shared persist after the task stops.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task are
     * provisioned automatically when the task starts and destroyed when the task stops. Docker volumes that are shared
     * persist after the task stops.
     * </p>
     * 
     * @return The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task
     *         are provisioned automatically when the task starts and destroyed when the task stops. Docker volumes that
     *         are shared persist after the task stops.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task are
     * provisioned automatically when the task starts and destroyed when the task stops. Docker volumes that are shared
     * persist after the task stops.
     * </p>
     * 
     * @param scope
     *        The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task
     *        are provisioned automatically when the task starts and destroyed when the task stops. Docker volumes that
     *        are shared persist after the task stops.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails withScope(String scope) {
        setScope(scope);
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
        if (getAutoprovision() != null)
            sb.append("Autoprovision: ").append(getAutoprovision()).append(",");
        if (getDriver() != null)
            sb.append("Driver: ").append(getDriver()).append(",");
        if (getDriverOpts() != null)
            sb.append("DriverOpts: ").append(getDriverOpts()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails == false)
            return false;
        AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails other = (AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails) obj;
        if (other.getAutoprovision() == null ^ this.getAutoprovision() == null)
            return false;
        if (other.getAutoprovision() != null && other.getAutoprovision().equals(this.getAutoprovision()) == false)
            return false;
        if (other.getDriver() == null ^ this.getDriver() == null)
            return false;
        if (other.getDriver() != null && other.getDriver().equals(this.getDriver()) == false)
            return false;
        if (other.getDriverOpts() == null ^ this.getDriverOpts() == null)
            return false;
        if (other.getDriverOpts() != null && other.getDriverOpts().equals(this.getDriverOpts()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoprovision() == null) ? 0 : getAutoprovision().hashCode());
        hashCode = prime * hashCode + ((getDriver() == null) ? 0 : getDriver().hashCode());
        hashCode = prime * hashCode + ((getDriverOpts() == null) ? 0 : getDriverOpts().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails clone() {
        try {
            return (AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
