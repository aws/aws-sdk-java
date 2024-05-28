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
 * Information about the <code>CreateNetworkAcl</code> action in Amazon EC2. This is a remediation option in
 * <code>RemediationAction</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/CreateNetworkAclAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkAclAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Brief description of this remediation action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The VPC that's associated with the remediation action.
     * </p>
     */
    private ActionTarget vpc;
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

    public CreateNetworkAclAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The VPC that's associated with the remediation action.
     * </p>
     * 
     * @param vpc
     *        The VPC that's associated with the remediation action.
     */

    public void setVpc(ActionTarget vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * The VPC that's associated with the remediation action.
     * </p>
     * 
     * @return The VPC that's associated with the remediation action.
     */

    public ActionTarget getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * The VPC that's associated with the remediation action.
     * </p>
     * 
     * @param vpc
     *        The VPC that's associated with the remediation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkAclAction withVpc(ActionTarget vpc) {
        setVpc(vpc);
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

    public CreateNetworkAclAction withFMSCanRemediate(Boolean fMSCanRemediate) {
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
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc()).append(",");
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

        if (obj instanceof CreateNetworkAclAction == false)
            return false;
        CreateNetworkAclAction other = (CreateNetworkAclAction) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
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
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        hashCode = prime * hashCode + ((getFMSCanRemediate() == null) ? 0 : getFMSCanRemediate().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkAclAction clone() {
        try {
            return (CreateNetworkAclAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.CreateNetworkAclActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
