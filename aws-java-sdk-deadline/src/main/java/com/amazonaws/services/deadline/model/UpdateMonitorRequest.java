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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new value to use for the monitor's display name.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The unique identifier of the monitor to update.
     * </p>
     */
    private String monitorId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new IAM role to use with the monitor.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The new value of the subdomain to use when forming the monitor URL.
     * </p>
     */
    private String subdomain;

    /**
     * <p>
     * The new value to use for the monitor's display name.
     * </p>
     * 
     * @param displayName
     *        The new value to use for the monitor's display name.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The new value to use for the monitor's display name.
     * </p>
     * 
     * @return The new value to use for the monitor's display name.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The new value to use for the monitor's display name.
     * </p>
     * 
     * @param displayName
     *        The new value to use for the monitor's display name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the monitor to update.
     * </p>
     * 
     * @param monitorId
     *        The unique identifier of the monitor to update.
     */

    public void setMonitorId(String monitorId) {
        this.monitorId = monitorId;
    }

    /**
     * <p>
     * The unique identifier of the monitor to update.
     * </p>
     * 
     * @return The unique identifier of the monitor to update.
     */

    public String getMonitorId() {
        return this.monitorId;
    }

    /**
     * <p>
     * The unique identifier of the monitor to update.
     * </p>
     * 
     * @param monitorId
     *        The unique identifier of the monitor to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withMonitorId(String monitorId) {
        setMonitorId(monitorId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new IAM role to use with the monitor.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the new IAM role to use with the monitor.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new IAM role to use with the monitor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new IAM role to use with the monitor.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new IAM role to use with the monitor.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the new IAM role to use with the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The new value of the subdomain to use when forming the monitor URL.
     * </p>
     * 
     * @param subdomain
     *        The new value of the subdomain to use when forming the monitor URL.
     */

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * <p>
     * The new value of the subdomain to use when forming the monitor URL.
     * </p>
     * 
     * @return The new value of the subdomain to use when forming the monitor URL.
     */

    public String getSubdomain() {
        return this.subdomain;
    }

    /**
     * <p>
     * The new value of the subdomain to use when forming the monitor URL.
     * </p>
     * 
     * @param subdomain
     *        The new value of the subdomain to use when forming the monitor URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitorRequest withSubdomain(String subdomain) {
        setSubdomain(subdomain);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getMonitorId() != null)
            sb.append("MonitorId: ").append(getMonitorId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSubdomain() != null)
            sb.append("Subdomain: ").append(getSubdomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMonitorRequest == false)
            return false;
        UpdateMonitorRequest other = (UpdateMonitorRequest) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getMonitorId() == null ^ this.getMonitorId() == null)
            return false;
        if (other.getMonitorId() != null && other.getMonitorId().equals(this.getMonitorId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSubdomain() == null ^ this.getSubdomain() == null)
            return false;
        if (other.getSubdomain() != null && other.getSubdomain().equals(this.getSubdomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getMonitorId() == null) ? 0 : getMonitorId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSubdomain() == null) ? 0 : getSubdomain().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMonitorRequest clone() {
        return (UpdateMonitorRequest) super.clone();
    }

}
