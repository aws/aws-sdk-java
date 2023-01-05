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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DisassociateLicense" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateLicenseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of license to remove from the workspace.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The ID of the workspace to remove the Grafana Enterprise license from.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The type of license to remove from the workspace.
     * </p>
     * 
     * @param licenseType
     *        The type of license to remove from the workspace.
     * @see LicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The type of license to remove from the workspace.
     * </p>
     * 
     * @return The type of license to remove from the workspace.
     * @see LicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The type of license to remove from the workspace.
     * </p>
     * 
     * @param licenseType
     *        The type of license to remove from the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public DisassociateLicenseRequest withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The type of license to remove from the workspace.
     * </p>
     * 
     * @param licenseType
     *        The type of license to remove from the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public DisassociateLicenseRequest withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to remove the Grafana Enterprise license from.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to remove the Grafana Enterprise license from.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to remove the Grafana Enterprise license from.
     * </p>
     * 
     * @return The ID of the workspace to remove the Grafana Enterprise license from.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to remove the Grafana Enterprise license from.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to remove the Grafana Enterprise license from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateLicenseRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateLicenseRequest == false)
            return false;
        DisassociateLicenseRequest other = (DisassociateLicenseRequest) obj;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateLicenseRequest clone() {
        return (DisassociateLicenseRequest) super.clone();
    }

}
