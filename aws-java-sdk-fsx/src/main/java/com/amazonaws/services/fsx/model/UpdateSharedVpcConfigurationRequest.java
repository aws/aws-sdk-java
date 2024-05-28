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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateSharedVpcConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSharedVpcConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets. Set to
     * <code>true</code> to enable or <code>false</code> to disable.
     * </p>
     */
    private String enableFsxRouteTableUpdatesFromParticipantAccounts;

    private String clientRequestToken;

    /**
     * <p>
     * Specifies whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets. Set to
     * <code>true</code> to enable or <code>false</code> to disable.
     * </p>
     * 
     * @param enableFsxRouteTableUpdatesFromParticipantAccounts
     *        Specifies whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets.
     *        Set to <code>true</code> to enable or <code>false</code> to disable.
     */

    public void setEnableFsxRouteTableUpdatesFromParticipantAccounts(String enableFsxRouteTableUpdatesFromParticipantAccounts) {
        this.enableFsxRouteTableUpdatesFromParticipantAccounts = enableFsxRouteTableUpdatesFromParticipantAccounts;
    }

    /**
     * <p>
     * Specifies whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets. Set to
     * <code>true</code> to enable or <code>false</code> to disable.
     * </p>
     * 
     * @return Specifies whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets.
     *         Set to <code>true</code> to enable or <code>false</code> to disable.
     */

    public String getEnableFsxRouteTableUpdatesFromParticipantAccounts() {
        return this.enableFsxRouteTableUpdatesFromParticipantAccounts;
    }

    /**
     * <p>
     * Specifies whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets. Set to
     * <code>true</code> to enable or <code>false</code> to disable.
     * </p>
     * 
     * @param enableFsxRouteTableUpdatesFromParticipantAccounts
     *        Specifies whether participant accounts can create FSx for ONTAP Multi-AZ file systems in shared subnets.
     *        Set to <code>true</code> to enable or <code>false</code> to disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSharedVpcConfigurationRequest withEnableFsxRouteTableUpdatesFromParticipantAccounts(String enableFsxRouteTableUpdatesFromParticipantAccounts) {
        setEnableFsxRouteTableUpdatesFromParticipantAccounts(enableFsxRouteTableUpdatesFromParticipantAccounts);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSharedVpcConfigurationRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
            sb.append("EnableFsxRouteTableUpdatesFromParticipantAccounts: ").append(getEnableFsxRouteTableUpdatesFromParticipantAccounts()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSharedVpcConfigurationRequest == false)
            return false;
        UpdateSharedVpcConfigurationRequest other = (UpdateSharedVpcConfigurationRequest) obj;
        if (other.getEnableFsxRouteTableUpdatesFromParticipantAccounts() == null ^ this.getEnableFsxRouteTableUpdatesFromParticipantAccounts() == null)
            return false;
        if (other.getEnableFsxRouteTableUpdatesFromParticipantAccounts() != null
                && other.getEnableFsxRouteTableUpdatesFromParticipantAccounts().equals(this.getEnableFsxRouteTableUpdatesFromParticipantAccounts()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnableFsxRouteTableUpdatesFromParticipantAccounts() == null) ? 0 : getEnableFsxRouteTableUpdatesFromParticipantAccounts().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSharedVpcConfigurationRequest clone() {
        return (UpdateSharedVpcConfigurationRequest) super.clone();
    }

}
