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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options you can specify when you create a new version of a grant, such as activation override behavior. For more
 * information, see <a href="https://docs.aws.amazon.com/license-manager/latest/userguide/granted-licenses.html">Granted
 * licenses in License Manager</a> in the <i>License Manager User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/Options" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Options implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An activation option for your grant that determines the behavior of activating a grant. Activation options can
     * only be used with granted licenses sourced from the Amazon Web Services Marketplace. Additionally, the operation
     * must specify the value of <code>ACTIVE</code> for the <code>Status</code> parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * As a license administrator, you can optionally specify an <code>ActivationOverrideBehavior</code> when activating
     * a grant.
     * </p>
     * </li>
     * <li>
     * <p>
     * As a grantor, you can optionally specify an <code>ActivationOverrideBehavior</code> when you activate a grant for
     * a grantee account in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * As a grantee, if the grantor creating the distributed grant doesn’t specify an
     * <code>ActivationOverrideBehavior</code>, you can optionally specify one when you are activating the grant.
     * </p>
     * </li>
     * </ul>
     * <dl>
     * <dt>DISTRIBUTED_GRANTS_ONLY</dt>
     * <dd>
     * <p>
     * Use this value to activate a grant without replacing any member account’s active grants for the same product.
     * </p>
     * </dd>
     * <dt>ALL_GRANTS_PERMITTED_BY_ISSUER</dt>
     * <dd>
     * <p>
     * Use this value to activate a grant and disable other active grants in any member accounts for the same product.
     * This action will also replace their previously activated grants with this activated grant.
     * </p>
     * </dd>
     * </dl>
     */
    private String activationOverrideBehavior;

    /**
     * <p>
     * An activation option for your grant that determines the behavior of activating a grant. Activation options can
     * only be used with granted licenses sourced from the Amazon Web Services Marketplace. Additionally, the operation
     * must specify the value of <code>ACTIVE</code> for the <code>Status</code> parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * As a license administrator, you can optionally specify an <code>ActivationOverrideBehavior</code> when activating
     * a grant.
     * </p>
     * </li>
     * <li>
     * <p>
     * As a grantor, you can optionally specify an <code>ActivationOverrideBehavior</code> when you activate a grant for
     * a grantee account in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * As a grantee, if the grantor creating the distributed grant doesn’t specify an
     * <code>ActivationOverrideBehavior</code>, you can optionally specify one when you are activating the grant.
     * </p>
     * </li>
     * </ul>
     * <dl>
     * <dt>DISTRIBUTED_GRANTS_ONLY</dt>
     * <dd>
     * <p>
     * Use this value to activate a grant without replacing any member account’s active grants for the same product.
     * </p>
     * </dd>
     * <dt>ALL_GRANTS_PERMITTED_BY_ISSUER</dt>
     * <dd>
     * <p>
     * Use this value to activate a grant and disable other active grants in any member accounts for the same product.
     * This action will also replace their previously activated grants with this activated grant.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param activationOverrideBehavior
     *        An activation option for your grant that determines the behavior of activating a grant. Activation options
     *        can only be used with granted licenses sourced from the Amazon Web Services Marketplace. Additionally, the
     *        operation must specify the value of <code>ACTIVE</code> for the <code>Status</code> parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        As a license administrator, you can optionally specify an <code>ActivationOverrideBehavior</code> when
     *        activating a grant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        As a grantor, you can optionally specify an <code>ActivationOverrideBehavior</code> when you activate a
     *        grant for a grantee account in your organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        As a grantee, if the grantor creating the distributed grant doesn’t specify an
     *        <code>ActivationOverrideBehavior</code>, you can optionally specify one when you are activating the grant.
     *        </p>
     *        </li>
     *        </ul>
     *        <dl>
     *        <dt>DISTRIBUTED_GRANTS_ONLY</dt>
     *        <dd>
     *        <p>
     *        Use this value to activate a grant without replacing any member account’s active grants for the same
     *        product.
     *        </p>
     *        </dd>
     *        <dt>ALL_GRANTS_PERMITTED_BY_ISSUER</dt>
     *        <dd>
     *        <p>
     *        Use this value to activate a grant and disable other active grants in any member accounts for the same
     *        product. This action will also replace their previously activated grants with this activated grant.
     *        </p>
     *        </dd>
     * @see ActivationOverrideBehavior
     */

    public void setActivationOverrideBehavior(String activationOverrideBehavior) {
        this.activationOverrideBehavior = activationOverrideBehavior;
    }

    /**
     * <p>
     * An activation option for your grant that determines the behavior of activating a grant. Activation options can
     * only be used with granted licenses sourced from the Amazon Web Services Marketplace. Additionally, the operation
     * must specify the value of <code>ACTIVE</code> for the <code>Status</code> parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * As a license administrator, you can optionally specify an <code>ActivationOverrideBehavior</code> when activating
     * a grant.
     * </p>
     * </li>
     * <li>
     * <p>
     * As a grantor, you can optionally specify an <code>ActivationOverrideBehavior</code> when you activate a grant for
     * a grantee account in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * As a grantee, if the grantor creating the distributed grant doesn’t specify an
     * <code>ActivationOverrideBehavior</code>, you can optionally specify one when you are activating the grant.
     * </p>
     * </li>
     * </ul>
     * <dl>
     * <dt>DISTRIBUTED_GRANTS_ONLY</dt>
     * <dd>
     * <p>
     * Use this value to activate a grant without replacing any member account’s active grants for the same product.
     * </p>
     * </dd>
     * <dt>ALL_GRANTS_PERMITTED_BY_ISSUER</dt>
     * <dd>
     * <p>
     * Use this value to activate a grant and disable other active grants in any member accounts for the same product.
     * This action will also replace their previously activated grants with this activated grant.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return An activation option for your grant that determines the behavior of activating a grant. Activation
     *         options can only be used with granted licenses sourced from the Amazon Web Services Marketplace.
     *         Additionally, the operation must specify the value of <code>ACTIVE</code> for the <code>Status</code>
     *         parameter.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         As a license administrator, you can optionally specify an <code>ActivationOverrideBehavior</code> when
     *         activating a grant.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         As a grantor, you can optionally specify an <code>ActivationOverrideBehavior</code> when you activate a
     *         grant for a grantee account in your organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         As a grantee, if the grantor creating the distributed grant doesn’t specify an
     *         <code>ActivationOverrideBehavior</code>, you can optionally specify one when you are activating the
     *         grant.
     *         </p>
     *         </li>
     *         </ul>
     *         <dl>
     *         <dt>DISTRIBUTED_GRANTS_ONLY</dt>
     *         <dd>
     *         <p>
     *         Use this value to activate a grant without replacing any member account’s active grants for the same
     *         product.
     *         </p>
     *         </dd>
     *         <dt>ALL_GRANTS_PERMITTED_BY_ISSUER</dt>
     *         <dd>
     *         <p>
     *         Use this value to activate a grant and disable other active grants in any member accounts for the same
     *         product. This action will also replace their previously activated grants with this activated grant.
     *         </p>
     *         </dd>
     * @see ActivationOverrideBehavior
     */

    public String getActivationOverrideBehavior() {
        return this.activationOverrideBehavior;
    }

    /**
     * <p>
     * An activation option for your grant that determines the behavior of activating a grant. Activation options can
     * only be used with granted licenses sourced from the Amazon Web Services Marketplace. Additionally, the operation
     * must specify the value of <code>ACTIVE</code> for the <code>Status</code> parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * As a license administrator, you can optionally specify an <code>ActivationOverrideBehavior</code> when activating
     * a grant.
     * </p>
     * </li>
     * <li>
     * <p>
     * As a grantor, you can optionally specify an <code>ActivationOverrideBehavior</code> when you activate a grant for
     * a grantee account in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * As a grantee, if the grantor creating the distributed grant doesn’t specify an
     * <code>ActivationOverrideBehavior</code>, you can optionally specify one when you are activating the grant.
     * </p>
     * </li>
     * </ul>
     * <dl>
     * <dt>DISTRIBUTED_GRANTS_ONLY</dt>
     * <dd>
     * <p>
     * Use this value to activate a grant without replacing any member account’s active grants for the same product.
     * </p>
     * </dd>
     * <dt>ALL_GRANTS_PERMITTED_BY_ISSUER</dt>
     * <dd>
     * <p>
     * Use this value to activate a grant and disable other active grants in any member accounts for the same product.
     * This action will also replace their previously activated grants with this activated grant.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param activationOverrideBehavior
     *        An activation option for your grant that determines the behavior of activating a grant. Activation options
     *        can only be used with granted licenses sourced from the Amazon Web Services Marketplace. Additionally, the
     *        operation must specify the value of <code>ACTIVE</code> for the <code>Status</code> parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        As a license administrator, you can optionally specify an <code>ActivationOverrideBehavior</code> when
     *        activating a grant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        As a grantor, you can optionally specify an <code>ActivationOverrideBehavior</code> when you activate a
     *        grant for a grantee account in your organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        As a grantee, if the grantor creating the distributed grant doesn’t specify an
     *        <code>ActivationOverrideBehavior</code>, you can optionally specify one when you are activating the grant.
     *        </p>
     *        </li>
     *        </ul>
     *        <dl>
     *        <dt>DISTRIBUTED_GRANTS_ONLY</dt>
     *        <dd>
     *        <p>
     *        Use this value to activate a grant without replacing any member account’s active grants for the same
     *        product.
     *        </p>
     *        </dd>
     *        <dt>ALL_GRANTS_PERMITTED_BY_ISSUER</dt>
     *        <dd>
     *        <p>
     *        Use this value to activate a grant and disable other active grants in any member accounts for the same
     *        product. This action will also replace their previously activated grants with this activated grant.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivationOverrideBehavior
     */

    public Options withActivationOverrideBehavior(String activationOverrideBehavior) {
        setActivationOverrideBehavior(activationOverrideBehavior);
        return this;
    }

    /**
     * <p>
     * An activation option for your grant that determines the behavior of activating a grant. Activation options can
     * only be used with granted licenses sourced from the Amazon Web Services Marketplace. Additionally, the operation
     * must specify the value of <code>ACTIVE</code> for the <code>Status</code> parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * As a license administrator, you can optionally specify an <code>ActivationOverrideBehavior</code> when activating
     * a grant.
     * </p>
     * </li>
     * <li>
     * <p>
     * As a grantor, you can optionally specify an <code>ActivationOverrideBehavior</code> when you activate a grant for
     * a grantee account in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * As a grantee, if the grantor creating the distributed grant doesn’t specify an
     * <code>ActivationOverrideBehavior</code>, you can optionally specify one when you are activating the grant.
     * </p>
     * </li>
     * </ul>
     * <dl>
     * <dt>DISTRIBUTED_GRANTS_ONLY</dt>
     * <dd>
     * <p>
     * Use this value to activate a grant without replacing any member account’s active grants for the same product.
     * </p>
     * </dd>
     * <dt>ALL_GRANTS_PERMITTED_BY_ISSUER</dt>
     * <dd>
     * <p>
     * Use this value to activate a grant and disable other active grants in any member accounts for the same product.
     * This action will also replace their previously activated grants with this activated grant.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param activationOverrideBehavior
     *        An activation option for your grant that determines the behavior of activating a grant. Activation options
     *        can only be used with granted licenses sourced from the Amazon Web Services Marketplace. Additionally, the
     *        operation must specify the value of <code>ACTIVE</code> for the <code>Status</code> parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        As a license administrator, you can optionally specify an <code>ActivationOverrideBehavior</code> when
     *        activating a grant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        As a grantor, you can optionally specify an <code>ActivationOverrideBehavior</code> when you activate a
     *        grant for a grantee account in your organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        As a grantee, if the grantor creating the distributed grant doesn’t specify an
     *        <code>ActivationOverrideBehavior</code>, you can optionally specify one when you are activating the grant.
     *        </p>
     *        </li>
     *        </ul>
     *        <dl>
     *        <dt>DISTRIBUTED_GRANTS_ONLY</dt>
     *        <dd>
     *        <p>
     *        Use this value to activate a grant without replacing any member account’s active grants for the same
     *        product.
     *        </p>
     *        </dd>
     *        <dt>ALL_GRANTS_PERMITTED_BY_ISSUER</dt>
     *        <dd>
     *        <p>
     *        Use this value to activate a grant and disable other active grants in any member accounts for the same
     *        product. This action will also replace their previously activated grants with this activated grant.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivationOverrideBehavior
     */

    public Options withActivationOverrideBehavior(ActivationOverrideBehavior activationOverrideBehavior) {
        this.activationOverrideBehavior = activationOverrideBehavior.toString();
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
        if (getActivationOverrideBehavior() != null)
            sb.append("ActivationOverrideBehavior: ").append(getActivationOverrideBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Options == false)
            return false;
        Options other = (Options) obj;
        if (other.getActivationOverrideBehavior() == null ^ this.getActivationOverrideBehavior() == null)
            return false;
        if (other.getActivationOverrideBehavior() != null && other.getActivationOverrideBehavior().equals(this.getActivationOverrideBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationOverrideBehavior() == null) ? 0 : getActivationOverrideBehavior().hashCode());
        return hashCode;
    }

    @Override
    public Options clone() {
        try {
            return (Options) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.OptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
