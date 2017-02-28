/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOrganizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the mode that the new organization is in. Each mode supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     * >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you use the AWS Organizations console, you can create an organization only in full-control mode. To create an
     * organization in billing mode, you must call this API through a tool such as the AWS CLI or an AWS SDK.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any type of
     * organizational control policy (OCP) to any member account in the organization. For more information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     * >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String mode;

    /**
     * <p>
     * Specifies the mode that the new organization is in. Each mode supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     * >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you use the AWS Organizations console, you can create an organization only in full-control mode. To create an
     * organization in billing mode, you must call this API through a tool such as the AWS CLI or an AWS SDK.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any type of
     * organizational control policy (OCP) to any member account in the organization. For more information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     * >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        Specifies the mode that the new organization is in. Each mode supports different levels of
     *        functionality.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     *        >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        If you use the AWS Organizations console, you can create an organization only in full-control mode. To
     *        create an organization in billing mode, you must call this API through a tool such as the AWS CLI or an
     *        AWS SDK.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any
     *        type of organizational control policy (OCP) to any member account in the organization. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     *        >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        </li>
     * @see OrganizationMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specifies the mode that the new organization is in. Each mode supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     * >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you use the AWS Organizations console, you can create an organization only in full-control mode. To create an
     * organization in billing mode, you must call this API through a tool such as the AWS CLI or an AWS SDK.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any type of
     * organizational control policy (OCP) to any member account in the organization. For more information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     * >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the mode that the new organization is in. Each mode supports different levels of
     *         functionality.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     *         >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         If you use the AWS Organizations console, you can create an organization only in full-control mode. To
     *         create an organization in billing mode, you must call this API through a tool such as the AWS CLI or an
     *         AWS SDK.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any
     *         type of organizational control policy (OCP) to any member account in the organization. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     *         >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     *         </p>
     *         </li>
     * @see OrganizationMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Specifies the mode that the new organization is in. Each mode supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     * >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you use the AWS Organizations console, you can create an organization only in full-control mode. To create an
     * organization in billing mode, you must call this API through a tool such as the AWS CLI or an AWS SDK.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any type of
     * organizational control policy (OCP) to any member account in the organization. For more information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     * >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        Specifies the mode that the new organization is in. Each mode supports different levels of
     *        functionality.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     *        >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        If you use the AWS Organizations console, you can create an organization only in full-control mode. To
     *        create an organization in billing mode, you must call this API through a tool such as the AWS CLI or an
     *        AWS SDK.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any
     *        type of organizational control policy (OCP) to any member account in the organization. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     *        >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationMode
     */

    public CreateOrganizationRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Specifies the mode that the new organization is in. Each mode supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     * >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you use the AWS Organizations console, you can create an organization only in full-control mode. To create an
     * organization in billing mode, you must call this API through a tool such as the AWS CLI or an AWS SDK.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any type of
     * organizational control policy (OCP) to any member account in the organization. For more information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     * >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        Specifies the mode that the new organization is in. Each mode supports different levels of
     *        functionality.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     *        >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        If you use the AWS Organizations console, you can create an organization only in full-control mode. To
     *        create an organization in billing mode, you must call this API through a tool such as the AWS CLI or an
     *        AWS SDK.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any
     *        type of organizational control policy (OCP) to any member account in the organization. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     *        >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        </li>
     * @see OrganizationMode
     */

    public void setMode(OrganizationMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Specifies the mode that the new organization is in. Each mode supports different levels of functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     * >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you use the AWS Organizations console, you can create an organization only in full-control mode. To create an
     * organization in billing mode, you must call this API through a tool such as the AWS CLI or an AWS SDK.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any type of
     * organizational control policy (OCP) to any member account in the organization. For more information, see <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     * >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        Specifies the mode that the new organization is in. Each mode supports different levels of
     *        functionality.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>BILLING</i>: All member accounts have their bills consolidated to and paid by the master account. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#billing-mode"
     *        >Billing mode</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        If you use the AWS Organizations console, you can create an organization only in full-control mode. To
     *        create an organization in billing mode, you must call this API through a tool such as the AWS CLI or an
     *        AWS SDK.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <i>FULL_CONTROL</i>: In addition to all the features of billing mode, the master account can apply any
     *        type of organizational control policy (OCP) to any member account in the organization. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_getting-started_concepts.html#full-control-mode"
     *        >Full-control mode</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationMode
     */

    public CreateOrganizationRequest withMode(OrganizationMode mode) {
        setMode(mode);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOrganizationRequest == false)
            return false;
        CreateOrganizationRequest other = (CreateOrganizationRequest) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public CreateOrganizationRequest clone() {
        return (CreateOrganizationRequest) super.clone();
    }

}
