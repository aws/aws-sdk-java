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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * One of the targets for the stack set. Returned by the <a
 * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSetAutoDeploymentTargets.html"
 * >ListStackSetAutoDeploymentTargets</a> API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackSetAutoDeploymentTargetSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSetAutoDeploymentTargetSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The organization root ID or organizational unit (OU) IDs where the stack set is targeted.
     * </p>
     */
    private String organizationalUnitId;
    /**
     * <p>
     * The list of Regions targeted for this organization or OU.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regions;

    /**
     * <p>
     * The organization root ID or organizational unit (OU) IDs where the stack set is targeted.
     * </p>
     * 
     * @param organizationalUnitId
     *        The organization root ID or organizational unit (OU) IDs where the stack set is targeted.
     */

    public void setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
    }

    /**
     * <p>
     * The organization root ID or organizational unit (OU) IDs where the stack set is targeted.
     * </p>
     * 
     * @return The organization root ID or organizational unit (OU) IDs where the stack set is targeted.
     */

    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    /**
     * <p>
     * The organization root ID or organizational unit (OU) IDs where the stack set is targeted.
     * </p>
     * 
     * @param organizationalUnitId
     *        The organization root ID or organizational unit (OU) IDs where the stack set is targeted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetAutoDeploymentTargetSummary withOrganizationalUnitId(String organizationalUnitId) {
        setOrganizationalUnitId(organizationalUnitId);
        return this;
    }

    /**
     * <p>
     * The list of Regions targeted for this organization or OU.
     * </p>
     * 
     * @return The list of Regions targeted for this organization or OU.
     */

    public java.util.List<String> getRegions() {
        if (regions == null) {
            regions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regions;
    }

    /**
     * <p>
     * The list of Regions targeted for this organization or OU.
     * </p>
     * 
     * @param regions
     *        The list of Regions targeted for this organization or OU.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new com.amazonaws.internal.SdkInternalList<String>(regions);
    }

    /**
     * <p>
     * The list of Regions targeted for this organization or OU.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        The list of Regions targeted for this organization or OU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetAutoDeploymentTargetSummary withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new com.amazonaws.internal.SdkInternalList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Regions targeted for this organization or OU.
     * </p>
     * 
     * @param regions
     *        The list of Regions targeted for this organization or OU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetAutoDeploymentTargetSummary withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
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
        if (getOrganizationalUnitId() != null)
            sb.append("OrganizationalUnitId: ").append(getOrganizationalUnitId()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetAutoDeploymentTargetSummary == false)
            return false;
        StackSetAutoDeploymentTargetSummary other = (StackSetAutoDeploymentTargetSummary) obj;
        if (other.getOrganizationalUnitId() == null ^ this.getOrganizationalUnitId() == null)
            return false;
        if (other.getOrganizationalUnitId() != null && other.getOrganizationalUnitId().equals(this.getOrganizationalUnitId()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationalUnitId() == null) ? 0 : getOrganizationalUnitId().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public StackSetAutoDeploymentTargetSummary clone() {
        try {
            return (StackSetAutoDeploymentTargetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
