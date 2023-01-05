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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines the VDM settings that apply to emails that you send using the configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/VdmOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VdmOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * </p>
     */
    private DashboardOptions dashboardOptions;
    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * </p>
     */
    private GuardianOptions guardianOptions;

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * </p>
     * 
     * @param dashboardOptions
     *        Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     */

    public void setDashboardOptions(DashboardOptions dashboardOptions) {
        this.dashboardOptions = dashboardOptions;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * </p>
     * 
     * @return Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     */

    public DashboardOptions getDashboardOptions() {
        return this.dashboardOptions;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * </p>
     * 
     * @param dashboardOptions
     *        Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VdmOptions withDashboardOptions(DashboardOptions dashboardOptions) {
        setDashboardOptions(dashboardOptions);
        return this;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * </p>
     * 
     * @param guardianOptions
     *        Specifies additional settings for your VDM configuration as applicable to the Guardian.
     */

    public void setGuardianOptions(GuardianOptions guardianOptions) {
        this.guardianOptions = guardianOptions;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * </p>
     * 
     * @return Specifies additional settings for your VDM configuration as applicable to the Guardian.
     */

    public GuardianOptions getGuardianOptions() {
        return this.guardianOptions;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * </p>
     * 
     * @param guardianOptions
     *        Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VdmOptions withGuardianOptions(GuardianOptions guardianOptions) {
        setGuardianOptions(guardianOptions);
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
        if (getDashboardOptions() != null)
            sb.append("DashboardOptions: ").append(getDashboardOptions()).append(",");
        if (getGuardianOptions() != null)
            sb.append("GuardianOptions: ").append(getGuardianOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VdmOptions == false)
            return false;
        VdmOptions other = (VdmOptions) obj;
        if (other.getDashboardOptions() == null ^ this.getDashboardOptions() == null)
            return false;
        if (other.getDashboardOptions() != null && other.getDashboardOptions().equals(this.getDashboardOptions()) == false)
            return false;
        if (other.getGuardianOptions() == null ^ this.getGuardianOptions() == null)
            return false;
        if (other.getGuardianOptions() != null && other.getGuardianOptions().equals(this.getGuardianOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardOptions() == null) ? 0 : getDashboardOptions().hashCode());
        hashCode = prime * hashCode + ((getGuardianOptions() == null) ? 0 : getGuardianOptions().hashCode());
        return hashCode;
    }

    @Override
    public VdmOptions clone() {
        try {
            return (VdmOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.VdmOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
