/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The user-defined preferences that will be applied during product provisioning, unless overridden by
 * <code>ProvisioningPreferences</code> or <code>UpdateProvisioningPreferences</code>.
 * </p>
 * <p>
 * For more information on maximum concurrent accounts and failure tolerance, see <a
 * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
 * >Stack set operation options</a> in the <i>AWS CloudFormation User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisioningArtifactPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisioningArtifactPreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be scoped in
     * <code>ProvisioningPreferences$StackSetAccounts</code> and
     * <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     */
    private java.util.List<String> stackSetAccounts;
    /**
     * <p>
     * One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped in
     * <code>ProvisioningPreferences$StackSetRegions</code> and
     * <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     */
    private java.util.List<String> stackSetRegions;

    /**
     * <p>
     * One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be scoped in
     * <code>ProvisioningPreferences$StackSetAccounts</code> and
     * <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * 
     * @return One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be
     *         scoped in <code>ProvisioningPreferences$StackSetAccounts</code> and
     *         <code>UpdateProvisioningPreferences$StackSetAccounts</code>.</p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     */

    public java.util.List<String> getStackSetAccounts() {
        return stackSetAccounts;
    }

    /**
     * <p>
     * One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be scoped in
     * <code>ProvisioningPreferences$StackSetAccounts</code> and
     * <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * 
     * @param stackSetAccounts
     *        One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be
     *        scoped in <code>ProvisioningPreferences$StackSetAccounts</code> and
     *        <code>UpdateProvisioningPreferences$StackSetAccounts</code>.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     */

    public void setStackSetAccounts(java.util.Collection<String> stackSetAccounts) {
        if (stackSetAccounts == null) {
            this.stackSetAccounts = null;
            return;
        }

        this.stackSetAccounts = new java.util.ArrayList<String>(stackSetAccounts);
    }

    /**
     * <p>
     * One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be scoped in
     * <code>ProvisioningPreferences$StackSetAccounts</code> and
     * <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackSetAccounts(java.util.Collection)} or {@link #withStackSetAccounts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stackSetAccounts
     *        One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be
     *        scoped in <code>ProvisioningPreferences$StackSetAccounts</code> and
     *        <code>UpdateProvisioningPreferences$StackSetAccounts</code>.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactPreferences withStackSetAccounts(String... stackSetAccounts) {
        if (this.stackSetAccounts == null) {
            setStackSetAccounts(new java.util.ArrayList<String>(stackSetAccounts.length));
        }
        for (String ele : stackSetAccounts) {
            this.stackSetAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be scoped in
     * <code>ProvisioningPreferences$StackSetAccounts</code> and
     * <code>UpdateProvisioningPreferences$StackSetAccounts</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * 
     * @param stackSetAccounts
     *        One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be
     *        scoped in <code>ProvisioningPreferences$StackSetAccounts</code> and
     *        <code>UpdateProvisioningPreferences$StackSetAccounts</code>.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactPreferences withStackSetAccounts(java.util.Collection<String> stackSetAccounts) {
        setStackSetAccounts(stackSetAccounts);
        return this;
    }

    /**
     * <p>
     * One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped in
     * <code>ProvisioningPreferences$StackSetRegions</code> and
     * <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * 
     * @return One or more AWS Regions where stack instances are deployed from the stack set. These regions can be
     *         scoped in <code>ProvisioningPreferences$StackSetRegions</code> and
     *         <code>UpdateProvisioningPreferences$StackSetRegions</code>.</p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     */

    public java.util.List<String> getStackSetRegions() {
        return stackSetRegions;
    }

    /**
     * <p>
     * One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped in
     * <code>ProvisioningPreferences$StackSetRegions</code> and
     * <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * 
     * @param stackSetRegions
     *        One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped
     *        in <code>ProvisioningPreferences$StackSetRegions</code> and
     *        <code>UpdateProvisioningPreferences$StackSetRegions</code>.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     */

    public void setStackSetRegions(java.util.Collection<String> stackSetRegions) {
        if (stackSetRegions == null) {
            this.stackSetRegions = null;
            return;
        }

        this.stackSetRegions = new java.util.ArrayList<String>(stackSetRegions);
    }

    /**
     * <p>
     * One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped in
     * <code>ProvisioningPreferences$StackSetRegions</code> and
     * <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackSetRegions(java.util.Collection)} or {@link #withStackSetRegions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stackSetRegions
     *        One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped
     *        in <code>ProvisioningPreferences$StackSetRegions</code> and
     *        <code>UpdateProvisioningPreferences$StackSetRegions</code>.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactPreferences withStackSetRegions(String... stackSetRegions) {
        if (this.stackSetRegions == null) {
            setStackSetRegions(new java.util.ArrayList<String>(stackSetRegions.length));
        }
        for (String ele : stackSetRegions) {
            this.stackSetRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped in
     * <code>ProvisioningPreferences$StackSetRegions</code> and
     * <code>UpdateProvisioningPreferences$StackSetRegions</code>.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * 
     * @param stackSetRegions
     *        One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped
     *        in <code>ProvisioningPreferences$StackSetRegions</code> and
     *        <code>UpdateProvisioningPreferences$StackSetRegions</code>.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactPreferences withStackSetRegions(java.util.Collection<String> stackSetRegions) {
        setStackSetRegions(stackSetRegions);
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
        if (getStackSetAccounts() != null)
            sb.append("StackSetAccounts: ").append(getStackSetAccounts()).append(",");
        if (getStackSetRegions() != null)
            sb.append("StackSetRegions: ").append(getStackSetRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactPreferences == false)
            return false;
        ProvisioningArtifactPreferences other = (ProvisioningArtifactPreferences) obj;
        if (other.getStackSetAccounts() == null ^ this.getStackSetAccounts() == null)
            return false;
        if (other.getStackSetAccounts() != null && other.getStackSetAccounts().equals(this.getStackSetAccounts()) == false)
            return false;
        if (other.getStackSetRegions() == null ^ this.getStackSetRegions() == null)
            return false;
        if (other.getStackSetRegions() != null && other.getStackSetRegions().equals(this.getStackSetRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetAccounts() == null) ? 0 : getStackSetAccounts().hashCode());
        hashCode = prime * hashCode + ((getStackSetRegions() == null) ? 0 : getStackSetRegions().hashCode());
        return hashCode;
    }

    @Override
    public ProvisioningArtifactPreferences clone() {
        try {
            return (ProvisioningArtifactPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProvisioningArtifactPreferencesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
