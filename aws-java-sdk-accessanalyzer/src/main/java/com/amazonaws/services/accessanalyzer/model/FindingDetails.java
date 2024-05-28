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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an external access or unused access finding. Only one parameter can be used in a
 * <code>FindingDetails</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/FindingDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details for an external access analyzer finding.
     * </p>
     */
    private ExternalAccessDetails externalAccessDetails;
    /**
     * <p>
     * The details for an unused access analyzer finding with an unused permission finding type.
     * </p>
     */
    private UnusedPermissionDetails unusedPermissionDetails;
    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM user access key finding type.
     * </p>
     */
    private UnusedIamUserAccessKeyDetails unusedIamUserAccessKeyDetails;
    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM role finding type.
     * </p>
     */
    private UnusedIamRoleDetails unusedIamRoleDetails;
    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM user password finding type.
     * </p>
     */
    private UnusedIamUserPasswordDetails unusedIamUserPasswordDetails;

    /**
     * <p>
     * The details for an external access analyzer finding.
     * </p>
     * 
     * @param externalAccessDetails
     *        The details for an external access analyzer finding.
     */

    public void setExternalAccessDetails(ExternalAccessDetails externalAccessDetails) {
        this.externalAccessDetails = externalAccessDetails;
    }

    /**
     * <p>
     * The details for an external access analyzer finding.
     * </p>
     * 
     * @return The details for an external access analyzer finding.
     */

    public ExternalAccessDetails getExternalAccessDetails() {
        return this.externalAccessDetails;
    }

    /**
     * <p>
     * The details for an external access analyzer finding.
     * </p>
     * 
     * @param externalAccessDetails
     *        The details for an external access analyzer finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetails withExternalAccessDetails(ExternalAccessDetails externalAccessDetails) {
        setExternalAccessDetails(externalAccessDetails);
        return this;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused permission finding type.
     * </p>
     * 
     * @param unusedPermissionDetails
     *        The details for an unused access analyzer finding with an unused permission finding type.
     */

    public void setUnusedPermissionDetails(UnusedPermissionDetails unusedPermissionDetails) {
        this.unusedPermissionDetails = unusedPermissionDetails;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused permission finding type.
     * </p>
     * 
     * @return The details for an unused access analyzer finding with an unused permission finding type.
     */

    public UnusedPermissionDetails getUnusedPermissionDetails() {
        return this.unusedPermissionDetails;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused permission finding type.
     * </p>
     * 
     * @param unusedPermissionDetails
     *        The details for an unused access analyzer finding with an unused permission finding type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetails withUnusedPermissionDetails(UnusedPermissionDetails unusedPermissionDetails) {
        setUnusedPermissionDetails(unusedPermissionDetails);
        return this;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM user access key finding type.
     * </p>
     * 
     * @param unusedIamUserAccessKeyDetails
     *        The details for an unused access analyzer finding with an unused IAM user access key finding type.
     */

    public void setUnusedIamUserAccessKeyDetails(UnusedIamUserAccessKeyDetails unusedIamUserAccessKeyDetails) {
        this.unusedIamUserAccessKeyDetails = unusedIamUserAccessKeyDetails;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM user access key finding type.
     * </p>
     * 
     * @return The details for an unused access analyzer finding with an unused IAM user access key finding type.
     */

    public UnusedIamUserAccessKeyDetails getUnusedIamUserAccessKeyDetails() {
        return this.unusedIamUserAccessKeyDetails;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM user access key finding type.
     * </p>
     * 
     * @param unusedIamUserAccessKeyDetails
     *        The details for an unused access analyzer finding with an unused IAM user access key finding type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetails withUnusedIamUserAccessKeyDetails(UnusedIamUserAccessKeyDetails unusedIamUserAccessKeyDetails) {
        setUnusedIamUserAccessKeyDetails(unusedIamUserAccessKeyDetails);
        return this;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM role finding type.
     * </p>
     * 
     * @param unusedIamRoleDetails
     *        The details for an unused access analyzer finding with an unused IAM role finding type.
     */

    public void setUnusedIamRoleDetails(UnusedIamRoleDetails unusedIamRoleDetails) {
        this.unusedIamRoleDetails = unusedIamRoleDetails;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM role finding type.
     * </p>
     * 
     * @return The details for an unused access analyzer finding with an unused IAM role finding type.
     */

    public UnusedIamRoleDetails getUnusedIamRoleDetails() {
        return this.unusedIamRoleDetails;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM role finding type.
     * </p>
     * 
     * @param unusedIamRoleDetails
     *        The details for an unused access analyzer finding with an unused IAM role finding type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetails withUnusedIamRoleDetails(UnusedIamRoleDetails unusedIamRoleDetails) {
        setUnusedIamRoleDetails(unusedIamRoleDetails);
        return this;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM user password finding type.
     * </p>
     * 
     * @param unusedIamUserPasswordDetails
     *        The details for an unused access analyzer finding with an unused IAM user password finding type.
     */

    public void setUnusedIamUserPasswordDetails(UnusedIamUserPasswordDetails unusedIamUserPasswordDetails) {
        this.unusedIamUserPasswordDetails = unusedIamUserPasswordDetails;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM user password finding type.
     * </p>
     * 
     * @return The details for an unused access analyzer finding with an unused IAM user password finding type.
     */

    public UnusedIamUserPasswordDetails getUnusedIamUserPasswordDetails() {
        return this.unusedIamUserPasswordDetails;
    }

    /**
     * <p>
     * The details for an unused access analyzer finding with an unused IAM user password finding type.
     * </p>
     * 
     * @param unusedIamUserPasswordDetails
     *        The details for an unused access analyzer finding with an unused IAM user password finding type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetails withUnusedIamUserPasswordDetails(UnusedIamUserPasswordDetails unusedIamUserPasswordDetails) {
        setUnusedIamUserPasswordDetails(unusedIamUserPasswordDetails);
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
        if (getExternalAccessDetails() != null)
            sb.append("ExternalAccessDetails: ").append(getExternalAccessDetails()).append(",");
        if (getUnusedPermissionDetails() != null)
            sb.append("UnusedPermissionDetails: ").append(getUnusedPermissionDetails()).append(",");
        if (getUnusedIamUserAccessKeyDetails() != null)
            sb.append("UnusedIamUserAccessKeyDetails: ").append(getUnusedIamUserAccessKeyDetails()).append(",");
        if (getUnusedIamRoleDetails() != null)
            sb.append("UnusedIamRoleDetails: ").append(getUnusedIamRoleDetails()).append(",");
        if (getUnusedIamUserPasswordDetails() != null)
            sb.append("UnusedIamUserPasswordDetails: ").append(getUnusedIamUserPasswordDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingDetails == false)
            return false;
        FindingDetails other = (FindingDetails) obj;
        if (other.getExternalAccessDetails() == null ^ this.getExternalAccessDetails() == null)
            return false;
        if (other.getExternalAccessDetails() != null && other.getExternalAccessDetails().equals(this.getExternalAccessDetails()) == false)
            return false;
        if (other.getUnusedPermissionDetails() == null ^ this.getUnusedPermissionDetails() == null)
            return false;
        if (other.getUnusedPermissionDetails() != null && other.getUnusedPermissionDetails().equals(this.getUnusedPermissionDetails()) == false)
            return false;
        if (other.getUnusedIamUserAccessKeyDetails() == null ^ this.getUnusedIamUserAccessKeyDetails() == null)
            return false;
        if (other.getUnusedIamUserAccessKeyDetails() != null
                && other.getUnusedIamUserAccessKeyDetails().equals(this.getUnusedIamUserAccessKeyDetails()) == false)
            return false;
        if (other.getUnusedIamRoleDetails() == null ^ this.getUnusedIamRoleDetails() == null)
            return false;
        if (other.getUnusedIamRoleDetails() != null && other.getUnusedIamRoleDetails().equals(this.getUnusedIamRoleDetails()) == false)
            return false;
        if (other.getUnusedIamUserPasswordDetails() == null ^ this.getUnusedIamUserPasswordDetails() == null)
            return false;
        if (other.getUnusedIamUserPasswordDetails() != null && other.getUnusedIamUserPasswordDetails().equals(this.getUnusedIamUserPasswordDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalAccessDetails() == null) ? 0 : getExternalAccessDetails().hashCode());
        hashCode = prime * hashCode + ((getUnusedPermissionDetails() == null) ? 0 : getUnusedPermissionDetails().hashCode());
        hashCode = prime * hashCode + ((getUnusedIamUserAccessKeyDetails() == null) ? 0 : getUnusedIamUserAccessKeyDetails().hashCode());
        hashCode = prime * hashCode + ((getUnusedIamRoleDetails() == null) ? 0 : getUnusedIamRoleDetails().hashCode());
        hashCode = prime * hashCode + ((getUnusedIamUserPasswordDetails() == null) ? 0 : getUnusedIamUserPasswordDetails().hashCode());
        return hashCode;
    }

    @Override
    public FindingDetails clone() {
        try {
            return (FindingDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.FindingDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
