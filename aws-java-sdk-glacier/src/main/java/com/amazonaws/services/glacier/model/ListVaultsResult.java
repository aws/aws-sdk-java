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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVaultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of vaults.
     * </p>
     */
    private java.util.List<DescribeVaultOutput> vaultList;
    /**
     * <p>
     * The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request
     * to obtain more vaults in the list.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * List of vaults.
     * </p>
     * 
     * @return List of vaults.
     */

    public java.util.List<DescribeVaultOutput> getVaultList() {
        return vaultList;
    }

    /**
     * <p>
     * List of vaults.
     * </p>
     * 
     * @param vaultList
     *        List of vaults.
     */

    public void setVaultList(java.util.Collection<DescribeVaultOutput> vaultList) {
        if (vaultList == null) {
            this.vaultList = null;
            return;
        }

        this.vaultList = new java.util.ArrayList<DescribeVaultOutput>(vaultList);
    }

    /**
     * <p>
     * List of vaults.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVaultList(java.util.Collection)} or {@link #withVaultList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vaultList
     *        List of vaults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVaultsResult withVaultList(DescribeVaultOutput... vaultList) {
        if (this.vaultList == null) {
            setVaultList(new java.util.ArrayList<DescribeVaultOutput>(vaultList.length));
        }
        for (DescribeVaultOutput ele : vaultList) {
            this.vaultList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of vaults.
     * </p>
     * 
     * @param vaultList
     *        List of vaults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVaultsResult withVaultList(java.util.Collection<DescribeVaultOutput> vaultList) {
        setVaultList(vaultList);
        return this;
    }

    /**
     * <p>
     * The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request
     * to obtain more vaults in the list.
     * </p>
     * 
     * @param marker
     *        The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults
     *        request to obtain more vaults in the list.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request
     * to obtain more vaults in the list.
     * </p>
     * 
     * @return The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults
     *         request to obtain more vaults in the list.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request
     * to obtain more vaults in the list.
     * </p>
     * 
     * @param marker
     *        The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults
     *        request to obtain more vaults in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVaultsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getVaultList() != null)
            sb.append("VaultList: ").append(getVaultList()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVaultsResult == false)
            return false;
        ListVaultsResult other = (ListVaultsResult) obj;
        if (other.getVaultList() == null ^ this.getVaultList() == null)
            return false;
        if (other.getVaultList() != null && other.getVaultList().equals(this.getVaultList()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVaultList() == null) ? 0 : getVaultList().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListVaultsResult clone() {
        try {
            return (ListVaultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
