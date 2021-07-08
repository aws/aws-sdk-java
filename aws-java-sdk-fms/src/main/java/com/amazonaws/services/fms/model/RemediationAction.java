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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an individual action you can take to remediate a violation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/RemediationAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemediationAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of a remediation action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the CreateRoute action in the Amazon EC2 API.
     * </p>
     */
    private EC2CreateRouteAction eC2CreateRouteAction;
    /**
     * <p>
     * Information about the ReplaceRoute action in the Amazon EC2 API.
     * </p>
     */
    private EC2ReplaceRouteAction eC2ReplaceRouteAction;
    /**
     * <p>
     * Information about the DeleteRoute action in the Amazon EC2 API.
     * </p>
     */
    private EC2DeleteRouteAction eC2DeleteRouteAction;
    /**
     * <p>
     * Information about the CopyRouteTable action in the Amazon EC2 API.
     * </p>
     */
    private EC2CopyRouteTableAction eC2CopyRouteTableAction;
    /**
     * <p>
     * Information about the ReplaceRouteTableAssociation action in the Amazon EC2 API.
     * </p>
     */
    private EC2ReplaceRouteTableAssociationAction eC2ReplaceRouteTableAssociationAction;
    /**
     * <p>
     * Information about the AssociateRouteTable action in the Amazon EC2 API.
     * </p>
     */
    private EC2AssociateRouteTableAction eC2AssociateRouteTableAction;
    /**
     * <p>
     * Information about the CreateRouteTable action in the Amazon EC2 API.
     * </p>
     */
    private EC2CreateRouteTableAction eC2CreateRouteTableAction;

    /**
     * <p>
     * A description of a remediation action.
     * </p>
     * 
     * @param description
     *        A description of a remediation action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of a remediation action.
     * </p>
     * 
     * @return A description of a remediation action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of a remediation action.
     * </p>
     * 
     * @param description
     *        A description of a remediation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the CreateRoute action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2CreateRouteAction
     *        Information about the CreateRoute action in the Amazon EC2 API.
     */

    public void setEC2CreateRouteAction(EC2CreateRouteAction eC2CreateRouteAction) {
        this.eC2CreateRouteAction = eC2CreateRouteAction;
    }

    /**
     * <p>
     * Information about the CreateRoute action in the Amazon EC2 API.
     * </p>
     * 
     * @return Information about the CreateRoute action in the Amazon EC2 API.
     */

    public EC2CreateRouteAction getEC2CreateRouteAction() {
        return this.eC2CreateRouteAction;
    }

    /**
     * <p>
     * Information about the CreateRoute action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2CreateRouteAction
     *        Information about the CreateRoute action in the Amazon EC2 API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationAction withEC2CreateRouteAction(EC2CreateRouteAction eC2CreateRouteAction) {
        setEC2CreateRouteAction(eC2CreateRouteAction);
        return this;
    }

    /**
     * <p>
     * Information about the ReplaceRoute action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2ReplaceRouteAction
     *        Information about the ReplaceRoute action in the Amazon EC2 API.
     */

    public void setEC2ReplaceRouteAction(EC2ReplaceRouteAction eC2ReplaceRouteAction) {
        this.eC2ReplaceRouteAction = eC2ReplaceRouteAction;
    }

    /**
     * <p>
     * Information about the ReplaceRoute action in the Amazon EC2 API.
     * </p>
     * 
     * @return Information about the ReplaceRoute action in the Amazon EC2 API.
     */

    public EC2ReplaceRouteAction getEC2ReplaceRouteAction() {
        return this.eC2ReplaceRouteAction;
    }

    /**
     * <p>
     * Information about the ReplaceRoute action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2ReplaceRouteAction
     *        Information about the ReplaceRoute action in the Amazon EC2 API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationAction withEC2ReplaceRouteAction(EC2ReplaceRouteAction eC2ReplaceRouteAction) {
        setEC2ReplaceRouteAction(eC2ReplaceRouteAction);
        return this;
    }

    /**
     * <p>
     * Information about the DeleteRoute action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2DeleteRouteAction
     *        Information about the DeleteRoute action in the Amazon EC2 API.
     */

    public void setEC2DeleteRouteAction(EC2DeleteRouteAction eC2DeleteRouteAction) {
        this.eC2DeleteRouteAction = eC2DeleteRouteAction;
    }

    /**
     * <p>
     * Information about the DeleteRoute action in the Amazon EC2 API.
     * </p>
     * 
     * @return Information about the DeleteRoute action in the Amazon EC2 API.
     */

    public EC2DeleteRouteAction getEC2DeleteRouteAction() {
        return this.eC2DeleteRouteAction;
    }

    /**
     * <p>
     * Information about the DeleteRoute action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2DeleteRouteAction
     *        Information about the DeleteRoute action in the Amazon EC2 API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationAction withEC2DeleteRouteAction(EC2DeleteRouteAction eC2DeleteRouteAction) {
        setEC2DeleteRouteAction(eC2DeleteRouteAction);
        return this;
    }

    /**
     * <p>
     * Information about the CopyRouteTable action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2CopyRouteTableAction
     *        Information about the CopyRouteTable action in the Amazon EC2 API.
     */

    public void setEC2CopyRouteTableAction(EC2CopyRouteTableAction eC2CopyRouteTableAction) {
        this.eC2CopyRouteTableAction = eC2CopyRouteTableAction;
    }

    /**
     * <p>
     * Information about the CopyRouteTable action in the Amazon EC2 API.
     * </p>
     * 
     * @return Information about the CopyRouteTable action in the Amazon EC2 API.
     */

    public EC2CopyRouteTableAction getEC2CopyRouteTableAction() {
        return this.eC2CopyRouteTableAction;
    }

    /**
     * <p>
     * Information about the CopyRouteTable action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2CopyRouteTableAction
     *        Information about the CopyRouteTable action in the Amazon EC2 API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationAction withEC2CopyRouteTableAction(EC2CopyRouteTableAction eC2CopyRouteTableAction) {
        setEC2CopyRouteTableAction(eC2CopyRouteTableAction);
        return this;
    }

    /**
     * <p>
     * Information about the ReplaceRouteTableAssociation action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2ReplaceRouteTableAssociationAction
     *        Information about the ReplaceRouteTableAssociation action in the Amazon EC2 API.
     */

    public void setEC2ReplaceRouteTableAssociationAction(EC2ReplaceRouteTableAssociationAction eC2ReplaceRouteTableAssociationAction) {
        this.eC2ReplaceRouteTableAssociationAction = eC2ReplaceRouteTableAssociationAction;
    }

    /**
     * <p>
     * Information about the ReplaceRouteTableAssociation action in the Amazon EC2 API.
     * </p>
     * 
     * @return Information about the ReplaceRouteTableAssociation action in the Amazon EC2 API.
     */

    public EC2ReplaceRouteTableAssociationAction getEC2ReplaceRouteTableAssociationAction() {
        return this.eC2ReplaceRouteTableAssociationAction;
    }

    /**
     * <p>
     * Information about the ReplaceRouteTableAssociation action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2ReplaceRouteTableAssociationAction
     *        Information about the ReplaceRouteTableAssociation action in the Amazon EC2 API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationAction withEC2ReplaceRouteTableAssociationAction(EC2ReplaceRouteTableAssociationAction eC2ReplaceRouteTableAssociationAction) {
        setEC2ReplaceRouteTableAssociationAction(eC2ReplaceRouteTableAssociationAction);
        return this;
    }

    /**
     * <p>
     * Information about the AssociateRouteTable action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2AssociateRouteTableAction
     *        Information about the AssociateRouteTable action in the Amazon EC2 API.
     */

    public void setEC2AssociateRouteTableAction(EC2AssociateRouteTableAction eC2AssociateRouteTableAction) {
        this.eC2AssociateRouteTableAction = eC2AssociateRouteTableAction;
    }

    /**
     * <p>
     * Information about the AssociateRouteTable action in the Amazon EC2 API.
     * </p>
     * 
     * @return Information about the AssociateRouteTable action in the Amazon EC2 API.
     */

    public EC2AssociateRouteTableAction getEC2AssociateRouteTableAction() {
        return this.eC2AssociateRouteTableAction;
    }

    /**
     * <p>
     * Information about the AssociateRouteTable action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2AssociateRouteTableAction
     *        Information about the AssociateRouteTable action in the Amazon EC2 API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationAction withEC2AssociateRouteTableAction(EC2AssociateRouteTableAction eC2AssociateRouteTableAction) {
        setEC2AssociateRouteTableAction(eC2AssociateRouteTableAction);
        return this;
    }

    /**
     * <p>
     * Information about the CreateRouteTable action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2CreateRouteTableAction
     *        Information about the CreateRouteTable action in the Amazon EC2 API.
     */

    public void setEC2CreateRouteTableAction(EC2CreateRouteTableAction eC2CreateRouteTableAction) {
        this.eC2CreateRouteTableAction = eC2CreateRouteTableAction;
    }

    /**
     * <p>
     * Information about the CreateRouteTable action in the Amazon EC2 API.
     * </p>
     * 
     * @return Information about the CreateRouteTable action in the Amazon EC2 API.
     */

    public EC2CreateRouteTableAction getEC2CreateRouteTableAction() {
        return this.eC2CreateRouteTableAction;
    }

    /**
     * <p>
     * Information about the CreateRouteTable action in the Amazon EC2 API.
     * </p>
     * 
     * @param eC2CreateRouteTableAction
     *        Information about the CreateRouteTable action in the Amazon EC2 API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationAction withEC2CreateRouteTableAction(EC2CreateRouteTableAction eC2CreateRouteTableAction) {
        setEC2CreateRouteTableAction(eC2CreateRouteTableAction);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEC2CreateRouteAction() != null)
            sb.append("EC2CreateRouteAction: ").append(getEC2CreateRouteAction()).append(",");
        if (getEC2ReplaceRouteAction() != null)
            sb.append("EC2ReplaceRouteAction: ").append(getEC2ReplaceRouteAction()).append(",");
        if (getEC2DeleteRouteAction() != null)
            sb.append("EC2DeleteRouteAction: ").append(getEC2DeleteRouteAction()).append(",");
        if (getEC2CopyRouteTableAction() != null)
            sb.append("EC2CopyRouteTableAction: ").append(getEC2CopyRouteTableAction()).append(",");
        if (getEC2ReplaceRouteTableAssociationAction() != null)
            sb.append("EC2ReplaceRouteTableAssociationAction: ").append(getEC2ReplaceRouteTableAssociationAction()).append(",");
        if (getEC2AssociateRouteTableAction() != null)
            sb.append("EC2AssociateRouteTableAction: ").append(getEC2AssociateRouteTableAction()).append(",");
        if (getEC2CreateRouteTableAction() != null)
            sb.append("EC2CreateRouteTableAction: ").append(getEC2CreateRouteTableAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemediationAction == false)
            return false;
        RemediationAction other = (RemediationAction) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEC2CreateRouteAction() == null ^ this.getEC2CreateRouteAction() == null)
            return false;
        if (other.getEC2CreateRouteAction() != null && other.getEC2CreateRouteAction().equals(this.getEC2CreateRouteAction()) == false)
            return false;
        if (other.getEC2ReplaceRouteAction() == null ^ this.getEC2ReplaceRouteAction() == null)
            return false;
        if (other.getEC2ReplaceRouteAction() != null && other.getEC2ReplaceRouteAction().equals(this.getEC2ReplaceRouteAction()) == false)
            return false;
        if (other.getEC2DeleteRouteAction() == null ^ this.getEC2DeleteRouteAction() == null)
            return false;
        if (other.getEC2DeleteRouteAction() != null && other.getEC2DeleteRouteAction().equals(this.getEC2DeleteRouteAction()) == false)
            return false;
        if (other.getEC2CopyRouteTableAction() == null ^ this.getEC2CopyRouteTableAction() == null)
            return false;
        if (other.getEC2CopyRouteTableAction() != null && other.getEC2CopyRouteTableAction().equals(this.getEC2CopyRouteTableAction()) == false)
            return false;
        if (other.getEC2ReplaceRouteTableAssociationAction() == null ^ this.getEC2ReplaceRouteTableAssociationAction() == null)
            return false;
        if (other.getEC2ReplaceRouteTableAssociationAction() != null
                && other.getEC2ReplaceRouteTableAssociationAction().equals(this.getEC2ReplaceRouteTableAssociationAction()) == false)
            return false;
        if (other.getEC2AssociateRouteTableAction() == null ^ this.getEC2AssociateRouteTableAction() == null)
            return false;
        if (other.getEC2AssociateRouteTableAction() != null && other.getEC2AssociateRouteTableAction().equals(this.getEC2AssociateRouteTableAction()) == false)
            return false;
        if (other.getEC2CreateRouteTableAction() == null ^ this.getEC2CreateRouteTableAction() == null)
            return false;
        if (other.getEC2CreateRouteTableAction() != null && other.getEC2CreateRouteTableAction().equals(this.getEC2CreateRouteTableAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEC2CreateRouteAction() == null) ? 0 : getEC2CreateRouteAction().hashCode());
        hashCode = prime * hashCode + ((getEC2ReplaceRouteAction() == null) ? 0 : getEC2ReplaceRouteAction().hashCode());
        hashCode = prime * hashCode + ((getEC2DeleteRouteAction() == null) ? 0 : getEC2DeleteRouteAction().hashCode());
        hashCode = prime * hashCode + ((getEC2CopyRouteTableAction() == null) ? 0 : getEC2CopyRouteTableAction().hashCode());
        hashCode = prime * hashCode + ((getEC2ReplaceRouteTableAssociationAction() == null) ? 0 : getEC2ReplaceRouteTableAssociationAction().hashCode());
        hashCode = prime * hashCode + ((getEC2AssociateRouteTableAction() == null) ? 0 : getEC2AssociateRouteTableAction().hashCode());
        hashCode = prime * hashCode + ((getEC2CreateRouteTableAction() == null) ? 0 : getEC2CreateRouteTableAction().hashCode());
        return hashCode;
    }

    @Override
    public RemediationAction clone() {
        try {
            return (RemediationAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.RemediationActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
