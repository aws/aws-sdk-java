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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AssociateLicense" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateLicenseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token from Grafana Labs that ties your Amazon Web Services account with a Grafana Labs account. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     * >Link your account with Grafana Labs</a>.
     * </p>
     */
    private String grafanaToken;
    /**
     * <p>
     * The type of license to associate with the workspace.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     */
    private String licenseType;
    /**
     * <p>
     * The ID of the workspace to associate the license with.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * A token from Grafana Labs that ties your Amazon Web Services account with a Grafana Labs account. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     * >Link your account with Grafana Labs</a>.
     * </p>
     * 
     * @param grafanaToken
     *        A token from Grafana Labs that ties your Amazon Web Services account with a Grafana Labs account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     *        >Link your account with Grafana Labs</a>.
     */

    public void setGrafanaToken(String grafanaToken) {
        this.grafanaToken = grafanaToken;
    }

    /**
     * <p>
     * A token from Grafana Labs that ties your Amazon Web Services account with a Grafana Labs account. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     * >Link your account with Grafana Labs</a>.
     * </p>
     * 
     * @return A token from Grafana Labs that ties your Amazon Web Services account with a Grafana Labs account. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     *         >Link your account with Grafana Labs</a>.
     */

    public String getGrafanaToken() {
        return this.grafanaToken;
    }

    /**
     * <p>
     * A token from Grafana Labs that ties your Amazon Web Services account with a Grafana Labs account. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     * >Link your account with Grafana Labs</a>.
     * </p>
     * 
     * @param grafanaToken
     *        A token from Grafana Labs that ties your Amazon Web Services account with a Grafana Labs account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     *        >Link your account with Grafana Labs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateLicenseRequest withGrafanaToken(String grafanaToken) {
        setGrafanaToken(grafanaToken);
        return this;
    }

    /**
     * <p>
     * The type of license to associate with the workspace.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @param licenseType
     *        The type of license to associate with the workspace.</p> <note>
     *        <p>
     *        Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *        </p>
     * @see LicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The type of license to associate with the workspace.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @return The type of license to associate with the workspace.</p> <note>
     *         <p>
     *         Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *         </p>
     * @see LicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The type of license to associate with the workspace.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @param licenseType
     *        The type of license to associate with the workspace.</p> <note>
     *        <p>
     *        Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public AssociateLicenseRequest withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The type of license to associate with the workspace.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @param licenseType
     *        The type of license to associate with the workspace.</p> <note>
     *        <p>
     *        Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public AssociateLicenseRequest withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to associate the license with.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to associate the license with.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to associate the license with.
     * </p>
     * 
     * @return The ID of the workspace to associate the license with.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to associate the license with.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to associate the license with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateLicenseRequest withWorkspaceId(String workspaceId) {
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
        if (getGrafanaToken() != null)
            sb.append("GrafanaToken: ").append(getGrafanaToken()).append(",");
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

        if (obj instanceof AssociateLicenseRequest == false)
            return false;
        AssociateLicenseRequest other = (AssociateLicenseRequest) obj;
        if (other.getGrafanaToken() == null ^ this.getGrafanaToken() == null)
            return false;
        if (other.getGrafanaToken() != null && other.getGrafanaToken().equals(this.getGrafanaToken()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getGrafanaToken() == null) ? 0 : getGrafanaToken().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateLicenseRequest clone() {
        return (AssociateLicenseRequest) super.clone();
    }

}
