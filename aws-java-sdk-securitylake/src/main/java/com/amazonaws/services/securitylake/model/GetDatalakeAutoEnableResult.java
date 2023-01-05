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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/GetDatalakeAutoEnable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDatalakeAutoEnableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration for new accounts.
     * </p>
     */
    private java.util.List<AutoEnableNewRegionConfiguration> autoEnableNewAccounts;

    /**
     * <p>
     * The configuration for new accounts.
     * </p>
     * 
     * @return The configuration for new accounts.
     */

    public java.util.List<AutoEnableNewRegionConfiguration> getAutoEnableNewAccounts() {
        return autoEnableNewAccounts;
    }

    /**
     * <p>
     * The configuration for new accounts.
     * </p>
     * 
     * @param autoEnableNewAccounts
     *        The configuration for new accounts.
     */

    public void setAutoEnableNewAccounts(java.util.Collection<AutoEnableNewRegionConfiguration> autoEnableNewAccounts) {
        if (autoEnableNewAccounts == null) {
            this.autoEnableNewAccounts = null;
            return;
        }

        this.autoEnableNewAccounts = new java.util.ArrayList<AutoEnableNewRegionConfiguration>(autoEnableNewAccounts);
    }

    /**
     * <p>
     * The configuration for new accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoEnableNewAccounts(java.util.Collection)} or
     * {@link #withAutoEnableNewAccounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoEnableNewAccounts
     *        The configuration for new accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeAutoEnableResult withAutoEnableNewAccounts(AutoEnableNewRegionConfiguration... autoEnableNewAccounts) {
        if (this.autoEnableNewAccounts == null) {
            setAutoEnableNewAccounts(new java.util.ArrayList<AutoEnableNewRegionConfiguration>(autoEnableNewAccounts.length));
        }
        for (AutoEnableNewRegionConfiguration ele : autoEnableNewAccounts) {
            this.autoEnableNewAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration for new accounts.
     * </p>
     * 
     * @param autoEnableNewAccounts
     *        The configuration for new accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatalakeAutoEnableResult withAutoEnableNewAccounts(java.util.Collection<AutoEnableNewRegionConfiguration> autoEnableNewAccounts) {
        setAutoEnableNewAccounts(autoEnableNewAccounts);
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
        if (getAutoEnableNewAccounts() != null)
            sb.append("AutoEnableNewAccounts: ").append(getAutoEnableNewAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDatalakeAutoEnableResult == false)
            return false;
        GetDatalakeAutoEnableResult other = (GetDatalakeAutoEnableResult) obj;
        if (other.getAutoEnableNewAccounts() == null ^ this.getAutoEnableNewAccounts() == null)
            return false;
        if (other.getAutoEnableNewAccounts() != null && other.getAutoEnableNewAccounts().equals(this.getAutoEnableNewAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnableNewAccounts() == null) ? 0 : getAutoEnableNewAccounts().hashCode());
        return hashCode;
    }

    @Override
    public GetDatalakeAutoEnableResult clone() {
        try {
            return (GetDatalakeAutoEnableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
