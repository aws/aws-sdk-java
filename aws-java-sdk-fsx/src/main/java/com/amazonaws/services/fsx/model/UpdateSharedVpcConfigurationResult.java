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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateSharedVpcConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSharedVpcConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets.
     * </p>
     */
    private String enableFsxRouteTableUpdatesFromParticipantAccounts;

    /**
     * <p>
     * Indicates whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets.
     * </p>
     * 
     * @param enableFsxRouteTableUpdatesFromParticipantAccounts
     *        Indicates whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets.
     */

    public void setEnableFsxRouteTableUpdatesFromParticipantAccounts(String enableFsxRouteTableUpdatesFromParticipantAccounts) {
        this.enableFsxRouteTableUpdatesFromParticipantAccounts = enableFsxRouteTableUpdatesFromParticipantAccounts;
    }

    /**
     * <p>
     * Indicates whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets.
     * </p>
     * 
     * @return Indicates whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets.
     */

    public String getEnableFsxRouteTableUpdatesFromParticipantAccounts() {
        return this.enableFsxRouteTableUpdatesFromParticipantAccounts;
    }

    /**
     * <p>
     * Indicates whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets.
     * </p>
     * 
     * @param enableFsxRouteTableUpdatesFromParticipantAccounts
     *        Indicates whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSharedVpcConfigurationResult withEnableFsxRouteTableUpdatesFromParticipantAccounts(String enableFsxRouteTableUpdatesFromParticipantAccounts) {
        setEnableFsxRouteTableUpdatesFromParticipantAccounts(enableFsxRouteTableUpdatesFromParticipantAccounts);
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
        if (getEnableFsxRouteTableUpdatesFromParticipantAccounts() != null)
            sb.append("EnableFsxRouteTableUpdatesFromParticipantAccounts: ").append(getEnableFsxRouteTableUpdatesFromParticipantAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSharedVpcConfigurationResult == false)
            return false;
        UpdateSharedVpcConfigurationResult other = (UpdateSharedVpcConfigurationResult) obj;
        if (other.getEnableFsxRouteTableUpdatesFromParticipantAccounts() == null ^ this.getEnableFsxRouteTableUpdatesFromParticipantAccounts() == null)
            return false;
        if (other.getEnableFsxRouteTableUpdatesFromParticipantAccounts() != null
                && other.getEnableFsxRouteTableUpdatesFromParticipantAccounts().equals(this.getEnableFsxRouteTableUpdatesFromParticipantAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnableFsxRouteTableUpdatesFromParticipantAccounts() == null) ? 0 : getEnableFsxRouteTableUpdatesFromParticipantAccounts().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSharedVpcConfigurationResult clone() {
        try {
            return (UpdateSharedVpcConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
