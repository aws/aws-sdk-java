/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * [<code>Service-managed</code> permissions] Describes whether StackSets automatically deploys to AWS Organizations
 * accounts that are added to a target organization or organizational unit (OU).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/AutoDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoDeployment implements Serializable, Cloneable {

    /**
     * <p>
     * If set to <code>true</code>, StackSets automatically deploys additional stack instances to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an
     * account is removed from a target organization or OU, StackSets deletes stack instances from the account in the
     * specified Regions.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * If set to <code>true</code>, stack resources are retained when an account is removed from a target organization
     * or OU. If set to <code>false</code>, stack resources are deleted. Specify only if <code>Enabled</code> is set to
     * <code>True</code>.
     * </p>
     */
    private Boolean retainStacksOnAccountRemoval;

    /**
     * <p>
     * If set to <code>true</code>, StackSets automatically deploys additional stack instances to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an
     * account is removed from a target organization or OU, StackSets deletes stack instances from the account in the
     * specified Regions.
     * </p>
     * 
     * @param enabled
     *        If set to <code>true</code>, StackSets automatically deploys additional stack instances to AWS
     *        Organizations accounts that are added to a target organization or organizational unit (OU) in the
     *        specified Regions. If an account is removed from a target organization or OU, StackSets deletes stack
     *        instances from the account in the specified Regions.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If set to <code>true</code>, StackSets automatically deploys additional stack instances to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an
     * account is removed from a target organization or OU, StackSets deletes stack instances from the account in the
     * specified Regions.
     * </p>
     * 
     * @return If set to <code>true</code>, StackSets automatically deploys additional stack instances to AWS
     *         Organizations accounts that are added to a target organization or organizational unit (OU) in the
     *         specified Regions. If an account is removed from a target organization or OU, StackSets deletes stack
     *         instances from the account in the specified Regions.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If set to <code>true</code>, StackSets automatically deploys additional stack instances to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an
     * account is removed from a target organization or OU, StackSets deletes stack instances from the account in the
     * specified Regions.
     * </p>
     * 
     * @param enabled
     *        If set to <code>true</code>, StackSets automatically deploys additional stack instances to AWS
     *        Organizations accounts that are added to a target organization or organizational unit (OU) in the
     *        specified Regions. If an account is removed from a target organization or OU, StackSets deletes stack
     *        instances from the account in the specified Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoDeployment withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, StackSets automatically deploys additional stack instances to AWS Organizations
     * accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an
     * account is removed from a target organization or OU, StackSets deletes stack instances from the account in the
     * specified Regions.
     * </p>
     * 
     * @return If set to <code>true</code>, StackSets automatically deploys additional stack instances to AWS
     *         Organizations accounts that are added to a target organization or organizational unit (OU) in the
     *         specified Regions. If an account is removed from a target organization or OU, StackSets deletes stack
     *         instances from the account in the specified Regions.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If set to <code>true</code>, stack resources are retained when an account is removed from a target organization
     * or OU. If set to <code>false</code>, stack resources are deleted. Specify only if <code>Enabled</code> is set to
     * <code>True</code>.
     * </p>
     * 
     * @param retainStacksOnAccountRemoval
     *        If set to <code>true</code>, stack resources are retained when an account is removed from a target
     *        organization or OU. If set to <code>false</code>, stack resources are deleted. Specify only if
     *        <code>Enabled</code> is set to <code>True</code>.
     */

    public void setRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
        this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
    }

    /**
     * <p>
     * If set to <code>true</code>, stack resources are retained when an account is removed from a target organization
     * or OU. If set to <code>false</code>, stack resources are deleted. Specify only if <code>Enabled</code> is set to
     * <code>True</code>.
     * </p>
     * 
     * @return If set to <code>true</code>, stack resources are retained when an account is removed from a target
     *         organization or OU. If set to <code>false</code>, stack resources are deleted. Specify only if
     *         <code>Enabled</code> is set to <code>True</code>.
     */

    public Boolean getRetainStacksOnAccountRemoval() {
        return this.retainStacksOnAccountRemoval;
    }

    /**
     * <p>
     * If set to <code>true</code>, stack resources are retained when an account is removed from a target organization
     * or OU. If set to <code>false</code>, stack resources are deleted. Specify only if <code>Enabled</code> is set to
     * <code>True</code>.
     * </p>
     * 
     * @param retainStacksOnAccountRemoval
     *        If set to <code>true</code>, stack resources are retained when an account is removed from a target
     *        organization or OU. If set to <code>false</code>, stack resources are deleted. Specify only if
     *        <code>Enabled</code> is set to <code>True</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoDeployment withRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
        setRetainStacksOnAccountRemoval(retainStacksOnAccountRemoval);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, stack resources are retained when an account is removed from a target organization
     * or OU. If set to <code>false</code>, stack resources are deleted. Specify only if <code>Enabled</code> is set to
     * <code>True</code>.
     * </p>
     * 
     * @return If set to <code>true</code>, stack resources are retained when an account is removed from a target
     *         organization or OU. If set to <code>false</code>, stack resources are deleted. Specify only if
     *         <code>Enabled</code> is set to <code>True</code>.
     */

    public Boolean isRetainStacksOnAccountRemoval() {
        return this.retainStacksOnAccountRemoval;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getRetainStacksOnAccountRemoval() != null)
            sb.append("RetainStacksOnAccountRemoval: ").append(getRetainStacksOnAccountRemoval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoDeployment == false)
            return false;
        AutoDeployment other = (AutoDeployment) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getRetainStacksOnAccountRemoval() == null ^ this.getRetainStacksOnAccountRemoval() == null)
            return false;
        if (other.getRetainStacksOnAccountRemoval() != null && other.getRetainStacksOnAccountRemoval().equals(this.getRetainStacksOnAccountRemoval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getRetainStacksOnAccountRemoval() == null) ? 0 : getRetainStacksOnAccountRemoval().hashCode());
        return hashCode;
    }

    @Override
    public AutoDeployment clone() {
        try {
            return (AutoDeployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
