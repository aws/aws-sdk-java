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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisassociateApplicationFromEntitlement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateApplicationFromEntitlementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The name of the entitlement.
     * </p>
     */
    private String entitlementName;
    /**
     * <p>
     * The identifier of the application to remove from the entitlement.
     * </p>
     */
    private String applicationIdentifier;

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     * 
     * @param stackName
     *        The name of the stack with which the entitlement is associated.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     * 
     * @return The name of the stack with which the entitlement is associated.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     * 
     * @param stackName
     *        The name of the stack with which the entitlement is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateApplicationFromEntitlementRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The name of the entitlement.
     * </p>
     * 
     * @param entitlementName
     *        The name of the entitlement.
     */

    public void setEntitlementName(String entitlementName) {
        this.entitlementName = entitlementName;
    }

    /**
     * <p>
     * The name of the entitlement.
     * </p>
     * 
     * @return The name of the entitlement.
     */

    public String getEntitlementName() {
        return this.entitlementName;
    }

    /**
     * <p>
     * The name of the entitlement.
     * </p>
     * 
     * @param entitlementName
     *        The name of the entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateApplicationFromEntitlementRequest withEntitlementName(String entitlementName) {
        setEntitlementName(entitlementName);
        return this;
    }

    /**
     * <p>
     * The identifier of the application to remove from the entitlement.
     * </p>
     * 
     * @param applicationIdentifier
     *        The identifier of the application to remove from the entitlement.
     */

    public void setApplicationIdentifier(String applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }

    /**
     * <p>
     * The identifier of the application to remove from the entitlement.
     * </p>
     * 
     * @return The identifier of the application to remove from the entitlement.
     */

    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /**
     * <p>
     * The identifier of the application to remove from the entitlement.
     * </p>
     * 
     * @param applicationIdentifier
     *        The identifier of the application to remove from the entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateApplicationFromEntitlementRequest withApplicationIdentifier(String applicationIdentifier) {
        setApplicationIdentifier(applicationIdentifier);
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getEntitlementName() != null)
            sb.append("EntitlementName: ").append(getEntitlementName()).append(",");
        if (getApplicationIdentifier() != null)
            sb.append("ApplicationIdentifier: ").append(getApplicationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateApplicationFromEntitlementRequest == false)
            return false;
        DisassociateApplicationFromEntitlementRequest other = (DisassociateApplicationFromEntitlementRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getEntitlementName() == null ^ this.getEntitlementName() == null)
            return false;
        if (other.getEntitlementName() != null && other.getEntitlementName().equals(this.getEntitlementName()) == false)
            return false;
        if (other.getApplicationIdentifier() == null ^ this.getApplicationIdentifier() == null)
            return false;
        if (other.getApplicationIdentifier() != null && other.getApplicationIdentifier().equals(this.getApplicationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getEntitlementName() == null) ? 0 : getEntitlementName().hashCode());
        hashCode = prime * hashCode + ((getApplicationIdentifier() == null) ? 0 : getApplicationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateApplicationFromEntitlementRequest clone() {
        return (DisassociateApplicationFromEntitlementRequest) super.clone();
    }

}
