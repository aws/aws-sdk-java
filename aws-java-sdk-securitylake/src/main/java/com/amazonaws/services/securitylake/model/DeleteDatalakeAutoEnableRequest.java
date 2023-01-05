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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeAutoEnable"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDatalakeAutoEnableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Delete Amazon Security Lake with the specified configuration settings to stop ingesting security data for new
     * accounts in Security Lake.
     * </p>
     */
    private java.util.List<AutoEnableNewRegionConfiguration> removeFromConfigurationForNewAccounts;

    /**
     * <p>
     * Delete Amazon Security Lake with the specified configuration settings to stop ingesting security data for new
     * accounts in Security Lake.
     * </p>
     * 
     * @return Delete Amazon Security Lake with the specified configuration settings to stop ingesting security data for
     *         new accounts in Security Lake.
     */

    public java.util.List<AutoEnableNewRegionConfiguration> getRemoveFromConfigurationForNewAccounts() {
        return removeFromConfigurationForNewAccounts;
    }

    /**
     * <p>
     * Delete Amazon Security Lake with the specified configuration settings to stop ingesting security data for new
     * accounts in Security Lake.
     * </p>
     * 
     * @param removeFromConfigurationForNewAccounts
     *        Delete Amazon Security Lake with the specified configuration settings to stop ingesting security data for
     *        new accounts in Security Lake.
     */

    public void setRemoveFromConfigurationForNewAccounts(java.util.Collection<AutoEnableNewRegionConfiguration> removeFromConfigurationForNewAccounts) {
        if (removeFromConfigurationForNewAccounts == null) {
            this.removeFromConfigurationForNewAccounts = null;
            return;
        }

        this.removeFromConfigurationForNewAccounts = new java.util.ArrayList<AutoEnableNewRegionConfiguration>(removeFromConfigurationForNewAccounts);
    }

    /**
     * <p>
     * Delete Amazon Security Lake with the specified configuration settings to stop ingesting security data for new
     * accounts in Security Lake.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveFromConfigurationForNewAccounts(java.util.Collection)} or
     * {@link #withRemoveFromConfigurationForNewAccounts(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param removeFromConfigurationForNewAccounts
     *        Delete Amazon Security Lake with the specified configuration settings to stop ingesting security data for
     *        new accounts in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDatalakeAutoEnableRequest withRemoveFromConfigurationForNewAccounts(AutoEnableNewRegionConfiguration... removeFromConfigurationForNewAccounts) {
        if (this.removeFromConfigurationForNewAccounts == null) {
            setRemoveFromConfigurationForNewAccounts(new java.util.ArrayList<AutoEnableNewRegionConfiguration>(removeFromConfigurationForNewAccounts.length));
        }
        for (AutoEnableNewRegionConfiguration ele : removeFromConfigurationForNewAccounts) {
            this.removeFromConfigurationForNewAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Delete Amazon Security Lake with the specified configuration settings to stop ingesting security data for new
     * accounts in Security Lake.
     * </p>
     * 
     * @param removeFromConfigurationForNewAccounts
     *        Delete Amazon Security Lake with the specified configuration settings to stop ingesting security data for
     *        new accounts in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDatalakeAutoEnableRequest withRemoveFromConfigurationForNewAccounts(
            java.util.Collection<AutoEnableNewRegionConfiguration> removeFromConfigurationForNewAccounts) {
        setRemoveFromConfigurationForNewAccounts(removeFromConfigurationForNewAccounts);
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
        if (getRemoveFromConfigurationForNewAccounts() != null)
            sb.append("RemoveFromConfigurationForNewAccounts: ").append(getRemoveFromConfigurationForNewAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDatalakeAutoEnableRequest == false)
            return false;
        DeleteDatalakeAutoEnableRequest other = (DeleteDatalakeAutoEnableRequest) obj;
        if (other.getRemoveFromConfigurationForNewAccounts() == null ^ this.getRemoveFromConfigurationForNewAccounts() == null)
            return false;
        if (other.getRemoveFromConfigurationForNewAccounts() != null
                && other.getRemoveFromConfigurationForNewAccounts().equals(this.getRemoveFromConfigurationForNewAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRemoveFromConfigurationForNewAccounts() == null) ? 0 : getRemoveFromConfigurationForNewAccounts().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDatalakeAutoEnableRequest clone() {
        return (DeleteDatalakeAutoEnableRequest) super.clone();
    }

}
