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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains details of a service principal that is enabled to integrate with AWS Organizations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnabledServicePrincipal"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnabledServicePrincipal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the service principal. This is typically in the form of a URL, such as:
     * <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     */
    private String servicePrincipal;
    /**
     * <p>
     * The date that the service principal was enabled for integration with AWS Organizations.
     * </p>
     */
    private java.util.Date dateEnabled;

    /**
     * <p>
     * The name of the service principal. This is typically in the form of a URL, such as:
     * <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * 
     * @param servicePrincipal
     *        The name of the service principal. This is typically in the form of a URL, such as:
     *        <code> <i>servicename</i>.amazonaws.com</code>.
     */

    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * <p>
     * The name of the service principal. This is typically in the form of a URL, such as:
     * <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * 
     * @return The name of the service principal. This is typically in the form of a URL, such as:
     *         <code> <i>servicename</i>.amazonaws.com</code>.
     */

    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

    /**
     * <p>
     * The name of the service principal. This is typically in the form of a URL, such as:
     * <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * 
     * @param servicePrincipal
     *        The name of the service principal. This is typically in the form of a URL, such as:
     *        <code> <i>servicename</i>.amazonaws.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledServicePrincipal withServicePrincipal(String servicePrincipal) {
        setServicePrincipal(servicePrincipal);
        return this;
    }

    /**
     * <p>
     * The date that the service principal was enabled for integration with AWS Organizations.
     * </p>
     * 
     * @param dateEnabled
     *        The date that the service principal was enabled for integration with AWS Organizations.
     */

    public void setDateEnabled(java.util.Date dateEnabled) {
        this.dateEnabled = dateEnabled;
    }

    /**
     * <p>
     * The date that the service principal was enabled for integration with AWS Organizations.
     * </p>
     * 
     * @return The date that the service principal was enabled for integration with AWS Organizations.
     */

    public java.util.Date getDateEnabled() {
        return this.dateEnabled;
    }

    /**
     * <p>
     * The date that the service principal was enabled for integration with AWS Organizations.
     * </p>
     * 
     * @param dateEnabled
     *        The date that the service principal was enabled for integration with AWS Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledServicePrincipal withDateEnabled(java.util.Date dateEnabled) {
        setDateEnabled(dateEnabled);
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
        if (getServicePrincipal() != null)
            sb.append("ServicePrincipal: ").append(getServicePrincipal()).append(",");
        if (getDateEnabled() != null)
            sb.append("DateEnabled: ").append(getDateEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnabledServicePrincipal == false)
            return false;
        EnabledServicePrincipal other = (EnabledServicePrincipal) obj;
        if (other.getServicePrincipal() == null ^ this.getServicePrincipal() == null)
            return false;
        if (other.getServicePrincipal() != null && other.getServicePrincipal().equals(this.getServicePrincipal()) == false)
            return false;
        if (other.getDateEnabled() == null ^ this.getDateEnabled() == null)
            return false;
        if (other.getDateEnabled() != null && other.getDateEnabled().equals(this.getDateEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServicePrincipal() == null) ? 0 : getServicePrincipal().hashCode());
        hashCode = prime * hashCode + ((getDateEnabled() == null) ? 0 : getDateEnabled().hashCode());
        return hashCode;
    }

    @Override
    public EnabledServicePrincipal clone() {
        try {
            return (EnabledServicePrincipal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.EnabledServicePrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
