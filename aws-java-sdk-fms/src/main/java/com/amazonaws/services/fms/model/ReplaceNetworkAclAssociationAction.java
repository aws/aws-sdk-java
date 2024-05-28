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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the <code>ReplaceNetworkAclAssociation</code> action in Amazon EC2. This is a remediation option in
 * <code>RemediationAction</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ReplaceNetworkAclAssociationAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceNetworkAclAssociationAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Brief description of this remediation action.
     * </p>
     */
    private String description;

    private ActionTarget associationId;
    /**
     * <p>
     * The network ACL that's associated with the remediation action.
     * </p>
     */
    private ActionTarget networkAclId;
    /**
     * <p>
     * Indicates whether it is possible for Firewall Manager to perform this remediation action. A false value indicates
     * that auto remediation is disabled or Firewall Manager is unable to perform the action due to a conflict of some
     * kind.
     * </p>
     */
    private Boolean fMSCanRemediate;

    /**
     * <p>
     * Brief description of this remediation action.
     * </p>
     * 
     * @param description
     *        Brief description of this remediation action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Brief description of this remediation action.
     * </p>
     * 
     * @return Brief description of this remediation action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Brief description of this remediation action.
     * </p>
     * 
     * @param description
     *        Brief description of this remediation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclAssociationAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param associationId
     */

    public void setAssociationId(ActionTarget associationId) {
        this.associationId = associationId;
    }

    /**
     * @return
     */

    public ActionTarget getAssociationId() {
        return this.associationId;
    }

    /**
     * @param associationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclAssociationAction withAssociationId(ActionTarget associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The network ACL that's associated with the remediation action.
     * </p>
     * 
     * @param networkAclId
     *        The network ACL that's associated with the remediation action.
     */

    public void setNetworkAclId(ActionTarget networkAclId) {
        this.networkAclId = networkAclId;
    }

    /**
     * <p>
     * The network ACL that's associated with the remediation action.
     * </p>
     * 
     * @return The network ACL that's associated with the remediation action.
     */

    public ActionTarget getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * <p>
     * The network ACL that's associated with the remediation action.
     * </p>
     * 
     * @param networkAclId
     *        The network ACL that's associated with the remediation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclAssociationAction withNetworkAclId(ActionTarget networkAclId) {
        setNetworkAclId(networkAclId);
        return this;
    }

    /**
     * <p>
     * Indicates whether it is possible for Firewall Manager to perform this remediation action. A false value indicates
     * that auto remediation is disabled or Firewall Manager is unable to perform the action due to a conflict of some
     * kind.
     * </p>
     * 
     * @param fMSCanRemediate
     *        Indicates whether it is possible for Firewall Manager to perform this remediation action. A false value
     *        indicates that auto remediation is disabled or Firewall Manager is unable to perform the action due to a
     *        conflict of some kind.
     */

    public void setFMSCanRemediate(Boolean fMSCanRemediate) {
        this.fMSCanRemediate = fMSCanRemediate;
    }

    /**
     * <p>
     * Indicates whether it is possible for Firewall Manager to perform this remediation action. A false value indicates
     * that auto remediation is disabled or Firewall Manager is unable to perform the action due to a conflict of some
     * kind.
     * </p>
     * 
     * @return Indicates whether it is possible for Firewall Manager to perform this remediation action. A false value
     *         indicates that auto remediation is disabled or Firewall Manager is unable to perform the action due to a
     *         conflict of some kind.
     */

    public Boolean getFMSCanRemediate() {
        return this.fMSCanRemediate;
    }

    /**
     * <p>
     * Indicates whether it is possible for Firewall Manager to perform this remediation action. A false value indicates
     * that auto remediation is disabled or Firewall Manager is unable to perform the action due to a conflict of some
     * kind.
     * </p>
     * 
     * @param fMSCanRemediate
     *        Indicates whether it is possible for Firewall Manager to perform this remediation action. A false value
     *        indicates that auto remediation is disabled or Firewall Manager is unable to perform the action due to a
     *        conflict of some kind.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceNetworkAclAssociationAction withFMSCanRemediate(Boolean fMSCanRemediate) {
        setFMSCanRemediate(fMSCanRemediate);
        return this;
    }

    /**
     * <p>
     * Indicates whether it is possible for Firewall Manager to perform this remediation action. A false value indicates
     * that auto remediation is disabled or Firewall Manager is unable to perform the action due to a conflict of some
     * kind.
     * </p>
     * 
     * @return Indicates whether it is possible for Firewall Manager to perform this remediation action. A false value
     *         indicates that auto remediation is disabled or Firewall Manager is unable to perform the action due to a
     *         conflict of some kind.
     */

    public Boolean isFMSCanRemediate() {
        return this.fMSCanRemediate;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getNetworkAclId() != null)
            sb.append("NetworkAclId: ").append(getNetworkAclId()).append(",");
        if (getFMSCanRemediate() != null)
            sb.append("FMSCanRemediate: ").append(getFMSCanRemediate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceNetworkAclAssociationAction == false)
            return false;
        ReplaceNetworkAclAssociationAction other = (ReplaceNetworkAclAssociationAction) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null)
            return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false)
            return false;
        if (other.getFMSCanRemediate() == null ^ this.getFMSCanRemediate() == null)
            return false;
        if (other.getFMSCanRemediate() != null && other.getFMSCanRemediate().equals(this.getFMSCanRemediate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode());
        hashCode = prime * hashCode + ((getFMSCanRemediate() == null) ? 0 : getFMSCanRemediate().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceNetworkAclAssociationAction clone() {
        try {
            return (ReplaceNetworkAclAssociationAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ReplaceNetworkAclAssociationActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
