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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The deregistration policy for the data that's stored in Audit Manager. You can use this attribute to determine how
 * your data is handled when you <a
 * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeregisterAccount.html">deregister Audit
 * Manager</a>.
 * </p>
 * <p>
 * By default, Audit Manager retains evidence data for two years from the time of its creation. Other Audit Manager
 * resources (including assessments, custom controls, and custom frameworks) remain in Audit Manager indefinitely, and
 * are available if you <a
 * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_RegisterAccount.html">re-register Audit
 * Manager</a> in the future. For more information about data retention, see <a
 * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/data-protection.html">Data Protection</a> in the
 * <i>Audit Manager User Guide</i>.
 * </p>
 * <important>
 * <p>
 * If you choose to delete all data, this action permanently deletes all evidence data in your account within seven
 * days. It also deletes all of the Audit Manager resources that you created, including assessments, custom controls,
 * and custom frameworks. Your data will not be available if you re-register Audit Manager in the future.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregistrationPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregistrationPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies which Audit Manager data will be deleted when you deregister Audit Manager.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set the value to <code>ALL</code>, all of your data is deleted within seven days of deregistration.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the value to <code>DEFAULT</code>, none of your data is deleted at the time of deregistration.
     * However, keep in mind that the Audit Manager data retention policy still applies. As a result, any evidence data
     * will be deleted two years after its creation date. Your other Audit Manager resources will continue to exist
     * indefinitely.
     * </p>
     * </li>
     * </ul>
     */
    private String deleteResources;

    /**
     * <p>
     * Specifies which Audit Manager data will be deleted when you deregister Audit Manager.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set the value to <code>ALL</code>, all of your data is deleted within seven days of deregistration.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the value to <code>DEFAULT</code>, none of your data is deleted at the time of deregistration.
     * However, keep in mind that the Audit Manager data retention policy still applies. As a result, any evidence data
     * will be deleted two years after its creation date. Your other Audit Manager resources will continue to exist
     * indefinitely.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteResources
     *        Specifies which Audit Manager data will be deleted when you deregister Audit Manager.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you set the value to <code>ALL</code>, all of your data is deleted within seven days of deregistration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set the value to <code>DEFAULT</code>, none of your data is deleted at the time of deregistration.
     *        However, keep in mind that the Audit Manager data retention policy still applies. As a result, any
     *        evidence data will be deleted two years after its creation date. Your other Audit Manager resources will
     *        continue to exist indefinitely.
     *        </p>
     *        </li>
     * @see DeleteResources
     */

    public void setDeleteResources(String deleteResources) {
        this.deleteResources = deleteResources;
    }

    /**
     * <p>
     * Specifies which Audit Manager data will be deleted when you deregister Audit Manager.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set the value to <code>ALL</code>, all of your data is deleted within seven days of deregistration.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the value to <code>DEFAULT</code>, none of your data is deleted at the time of deregistration.
     * However, keep in mind that the Audit Manager data retention policy still applies. As a result, any evidence data
     * will be deleted two years after its creation date. Your other Audit Manager resources will continue to exist
     * indefinitely.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies which Audit Manager data will be deleted when you deregister Audit Manager.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you set the value to <code>ALL</code>, all of your data is deleted within seven days of
     *         deregistration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you set the value to <code>DEFAULT</code>, none of your data is deleted at the time of deregistration.
     *         However, keep in mind that the Audit Manager data retention policy still applies. As a result, any
     *         evidence data will be deleted two years after its creation date. Your other Audit Manager resources will
     *         continue to exist indefinitely.
     *         </p>
     *         </li>
     * @see DeleteResources
     */

    public String getDeleteResources() {
        return this.deleteResources;
    }

    /**
     * <p>
     * Specifies which Audit Manager data will be deleted when you deregister Audit Manager.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set the value to <code>ALL</code>, all of your data is deleted within seven days of deregistration.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the value to <code>DEFAULT</code>, none of your data is deleted at the time of deregistration.
     * However, keep in mind that the Audit Manager data retention policy still applies. As a result, any evidence data
     * will be deleted two years after its creation date. Your other Audit Manager resources will continue to exist
     * indefinitely.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteResources
     *        Specifies which Audit Manager data will be deleted when you deregister Audit Manager.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you set the value to <code>ALL</code>, all of your data is deleted within seven days of deregistration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set the value to <code>DEFAULT</code>, none of your data is deleted at the time of deregistration.
     *        However, keep in mind that the Audit Manager data retention policy still applies. As a result, any
     *        evidence data will be deleted two years after its creation date. Your other Audit Manager resources will
     *        continue to exist indefinitely.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteResources
     */

    public DeregistrationPolicy withDeleteResources(String deleteResources) {
        setDeleteResources(deleteResources);
        return this;
    }

    /**
     * <p>
     * Specifies which Audit Manager data will be deleted when you deregister Audit Manager.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you set the value to <code>ALL</code>, all of your data is deleted within seven days of deregistration.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you set the value to <code>DEFAULT</code>, none of your data is deleted at the time of deregistration.
     * However, keep in mind that the Audit Manager data retention policy still applies. As a result, any evidence data
     * will be deleted two years after its creation date. Your other Audit Manager resources will continue to exist
     * indefinitely.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteResources
     *        Specifies which Audit Manager data will be deleted when you deregister Audit Manager.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you set the value to <code>ALL</code>, all of your data is deleted within seven days of deregistration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you set the value to <code>DEFAULT</code>, none of your data is deleted at the time of deregistration.
     *        However, keep in mind that the Audit Manager data retention policy still applies. As a result, any
     *        evidence data will be deleted two years after its creation date. Your other Audit Manager resources will
     *        continue to exist indefinitely.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteResources
     */

    public DeregistrationPolicy withDeleteResources(DeleteResources deleteResources) {
        this.deleteResources = deleteResources.toString();
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
        if (getDeleteResources() != null)
            sb.append("DeleteResources: ").append(getDeleteResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregistrationPolicy == false)
            return false;
        DeregistrationPolicy other = (DeregistrationPolicy) obj;
        if (other.getDeleteResources() == null ^ this.getDeleteResources() == null)
            return false;
        if (other.getDeleteResources() != null && other.getDeleteResources().equals(this.getDeleteResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleteResources() == null) ? 0 : getDeleteResources().hashCode());
        return hashCode;
    }

    @Override
    public DeregistrationPolicy clone() {
        try {
            return (DeregistrationPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.DeregistrationPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
