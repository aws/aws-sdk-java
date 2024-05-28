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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This is a structure that contains the status of Amazon Web Services service access, and whether you have a valid
 * service-linked role to enable multi-account search for your organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/OrgConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrgConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This value displays whether your Amazon Web Services service access is <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     */
    private String aWSServiceAccessStatus;
    /**
     * <p>
     * This value shows whether or not you have a valid a service-linked role required to start the multi-account search
     * feature.
     * </p>
     */
    private String serviceLinkedRole;

    /**
     * <p>
     * This value displays whether your Amazon Web Services service access is <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param aWSServiceAccessStatus
     *        This value displays whether your Amazon Web Services service access is <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     * @see AWSServiceAccessStatus
     */

    public void setAWSServiceAccessStatus(String aWSServiceAccessStatus) {
        this.aWSServiceAccessStatus = aWSServiceAccessStatus;
    }

    /**
     * <p>
     * This value displays whether your Amazon Web Services service access is <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @return This value displays whether your Amazon Web Services service access is <code>ENABLED</code> or
     *         <code>DISABLED</code>.
     * @see AWSServiceAccessStatus
     */

    public String getAWSServiceAccessStatus() {
        return this.aWSServiceAccessStatus;
    }

    /**
     * <p>
     * This value displays whether your Amazon Web Services service access is <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param aWSServiceAccessStatus
     *        This value displays whether your Amazon Web Services service access is <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AWSServiceAccessStatus
     */

    public OrgConfiguration withAWSServiceAccessStatus(String aWSServiceAccessStatus) {
        setAWSServiceAccessStatus(aWSServiceAccessStatus);
        return this;
    }

    /**
     * <p>
     * This value displays whether your Amazon Web Services service access is <code>ENABLED</code> or
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param aWSServiceAccessStatus
     *        This value displays whether your Amazon Web Services service access is <code>ENABLED</code> or
     *        <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AWSServiceAccessStatus
     */

    public OrgConfiguration withAWSServiceAccessStatus(AWSServiceAccessStatus aWSServiceAccessStatus) {
        this.aWSServiceAccessStatus = aWSServiceAccessStatus.toString();
        return this;
    }

    /**
     * <p>
     * This value shows whether or not you have a valid a service-linked role required to start the multi-account search
     * feature.
     * </p>
     * 
     * @param serviceLinkedRole
     *        This value shows whether or not you have a valid a service-linked role required to start the multi-account
     *        search feature.
     */

    public void setServiceLinkedRole(String serviceLinkedRole) {
        this.serviceLinkedRole = serviceLinkedRole;
    }

    /**
     * <p>
     * This value shows whether or not you have a valid a service-linked role required to start the multi-account search
     * feature.
     * </p>
     * 
     * @return This value shows whether or not you have a valid a service-linked role required to start the
     *         multi-account search feature.
     */

    public String getServiceLinkedRole() {
        return this.serviceLinkedRole;
    }

    /**
     * <p>
     * This value shows whether or not you have a valid a service-linked role required to start the multi-account search
     * feature.
     * </p>
     * 
     * @param serviceLinkedRole
     *        This value shows whether or not you have a valid a service-linked role required to start the multi-account
     *        search feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrgConfiguration withServiceLinkedRole(String serviceLinkedRole) {
        setServiceLinkedRole(serviceLinkedRole);
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
        if (getAWSServiceAccessStatus() != null)
            sb.append("AWSServiceAccessStatus: ").append(getAWSServiceAccessStatus()).append(",");
        if (getServiceLinkedRole() != null)
            sb.append("ServiceLinkedRole: ").append(getServiceLinkedRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrgConfiguration == false)
            return false;
        OrgConfiguration other = (OrgConfiguration) obj;
        if (other.getAWSServiceAccessStatus() == null ^ this.getAWSServiceAccessStatus() == null)
            return false;
        if (other.getAWSServiceAccessStatus() != null && other.getAWSServiceAccessStatus().equals(this.getAWSServiceAccessStatus()) == false)
            return false;
        if (other.getServiceLinkedRole() == null ^ this.getServiceLinkedRole() == null)
            return false;
        if (other.getServiceLinkedRole() != null && other.getServiceLinkedRole().equals(this.getServiceLinkedRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAWSServiceAccessStatus() == null) ? 0 : getAWSServiceAccessStatus().hashCode());
        hashCode = prime * hashCode + ((getServiceLinkedRole() == null) ? 0 : getServiceLinkedRole().hashCode());
        return hashCode;
    }

    @Override
    public OrgConfiguration clone() {
        try {
            return (OrgConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourceexplorer2.model.transform.OrgConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
