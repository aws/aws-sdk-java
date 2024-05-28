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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration to manage IoT Job's package version reporting. If configured, Jobs updates the thing's reserved named
 * shadow with the package version information up on successful job completion.
 * </p>
 * <p>
 * <b>Note:</b> For each job, the destinationPackageVersions attribute has to be set with the correct data for Jobs to
 * report to the thing shadow.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VersionUpdateByJobsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the Job is enabled or not.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that grants permission to the IoT jobs service to update the reserved
     * named shadow when the job successfully completes.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Indicates whether the Job is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the Job is enabled or not.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the Job is enabled or not.
     * </p>
     * 
     * @return Indicates whether the Job is enabled or not.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the Job is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the Job is enabled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionUpdateByJobsConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Job is enabled or not.
     * </p>
     * 
     * @return Indicates whether the Job is enabled or not.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that grants permission to the IoT jobs service to update the reserved
     * named shadow when the job successfully completes.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that grants permission to the IoT jobs service to update the
     *        reserved named shadow when the job successfully completes.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that grants permission to the IoT jobs service to update the reserved
     * named shadow when the job successfully completes.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that grants permission to the IoT jobs service to update the
     *         reserved named shadow when the job successfully completes.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that grants permission to the IoT jobs service to update the reserved
     * named shadow when the job successfully completes.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that grants permission to the IoT jobs service to update the
     *        reserved named shadow when the job successfully completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionUpdateByJobsConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VersionUpdateByJobsConfig == false)
            return false;
        VersionUpdateByJobsConfig other = (VersionUpdateByJobsConfig) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public VersionUpdateByJobsConfig clone() {
        try {
            return (VersionUpdateByJobsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.VersionUpdateByJobsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
