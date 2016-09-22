/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Creates the configuration settings for a remote access session, including the device model and type.
 * </p>
 */
public class CreateRemoteAccessSessionConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the billing method for purposes of configuring a remote access session.
     * </p>
     */
    private String billingMethod;

    /**
     * <p>
     * Returns the billing method for purposes of configuring a remote access session.
     * </p>
     * 
     * @param billingMethod
     *        Returns the billing method for purposes of configuring a remote access session.
     * @see BillingMethod
     */

    public void setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
    }

    /**
     * <p>
     * Returns the billing method for purposes of configuring a remote access session.
     * </p>
     * 
     * @return Returns the billing method for purposes of configuring a remote access session.
     * @see BillingMethod
     */

    public String getBillingMethod() {
        return this.billingMethod;
    }

    /**
     * <p>
     * Returns the billing method for purposes of configuring a remote access session.
     * </p>
     * 
     * @param billingMethod
     *        Returns the billing method for purposes of configuring a remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMethod
     */

    public CreateRemoteAccessSessionConfiguration withBillingMethod(String billingMethod) {
        setBillingMethod(billingMethod);
        return this;
    }

    /**
     * <p>
     * Returns the billing method for purposes of configuring a remote access session.
     * </p>
     * 
     * @param billingMethod
     *        Returns the billing method for purposes of configuring a remote access session.
     * @see BillingMethod
     */

    public void setBillingMethod(BillingMethod billingMethod) {
        this.billingMethod = billingMethod.toString();
    }

    /**
     * <p>
     * Returns the billing method for purposes of configuring a remote access session.
     * </p>
     * 
     * @param billingMethod
     *        Returns the billing method for purposes of configuring a remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMethod
     */

    public CreateRemoteAccessSessionConfiguration withBillingMethod(BillingMethod billingMethod) {
        setBillingMethod(billingMethod);
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
        if (getBillingMethod() != null)
            sb.append("BillingMethod: " + getBillingMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRemoteAccessSessionConfiguration == false)
            return false;
        CreateRemoteAccessSessionConfiguration other = (CreateRemoteAccessSessionConfiguration) obj;
        if (other.getBillingMethod() == null ^ this.getBillingMethod() == null)
            return false;
        if (other.getBillingMethod() != null && other.getBillingMethod().equals(this.getBillingMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillingMethod() == null) ? 0 : getBillingMethod().hashCode());
        return hashCode;
    }

    @Override
    public CreateRemoteAccessSessionConfiguration clone() {
        try {
            return (CreateRemoteAccessSessionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
