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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RecoveryPointSelection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryPointSelection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * These are the names of the vaults in which the selected recovery points are contained.
     * </p>
     */
    private java.util.List<String> vaultNames;
    /**
     * <p>
     * These are the resources included in the resource selection (including type of resources and vaults).
     * </p>
     */
    private java.util.List<String> resourceIdentifiers;

    private DateRange dateRange;

    /**
     * <p>
     * These are the names of the vaults in which the selected recovery points are contained.
     * </p>
     * 
     * @return These are the names of the vaults in which the selected recovery points are contained.
     */

    public java.util.List<String> getVaultNames() {
        return vaultNames;
    }

    /**
     * <p>
     * These are the names of the vaults in which the selected recovery points are contained.
     * </p>
     * 
     * @param vaultNames
     *        These are the names of the vaults in which the selected recovery points are contained.
     */

    public void setVaultNames(java.util.Collection<String> vaultNames) {
        if (vaultNames == null) {
            this.vaultNames = null;
            return;
        }

        this.vaultNames = new java.util.ArrayList<String>(vaultNames);
    }

    /**
     * <p>
     * These are the names of the vaults in which the selected recovery points are contained.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVaultNames(java.util.Collection)} or {@link #withVaultNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vaultNames
     *        These are the names of the vaults in which the selected recovery points are contained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointSelection withVaultNames(String... vaultNames) {
        if (this.vaultNames == null) {
            setVaultNames(new java.util.ArrayList<String>(vaultNames.length));
        }
        for (String ele : vaultNames) {
            this.vaultNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * These are the names of the vaults in which the selected recovery points are contained.
     * </p>
     * 
     * @param vaultNames
     *        These are the names of the vaults in which the selected recovery points are contained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointSelection withVaultNames(java.util.Collection<String> vaultNames) {
        setVaultNames(vaultNames);
        return this;
    }

    /**
     * <p>
     * These are the resources included in the resource selection (including type of resources and vaults).
     * </p>
     * 
     * @return These are the resources included in the resource selection (including type of resources and vaults).
     */

    public java.util.List<String> getResourceIdentifiers() {
        return resourceIdentifiers;
    }

    /**
     * <p>
     * These are the resources included in the resource selection (including type of resources and vaults).
     * </p>
     * 
     * @param resourceIdentifiers
     *        These are the resources included in the resource selection (including type of resources and vaults).
     */

    public void setResourceIdentifiers(java.util.Collection<String> resourceIdentifiers) {
        if (resourceIdentifiers == null) {
            this.resourceIdentifiers = null;
            return;
        }

        this.resourceIdentifiers = new java.util.ArrayList<String>(resourceIdentifiers);
    }

    /**
     * <p>
     * These are the resources included in the resource selection (including type of resources and vaults).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIdentifiers(java.util.Collection)} or {@link #withResourceIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceIdentifiers
     *        These are the resources included in the resource selection (including type of resources and vaults).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointSelection withResourceIdentifiers(String... resourceIdentifiers) {
        if (this.resourceIdentifiers == null) {
            setResourceIdentifiers(new java.util.ArrayList<String>(resourceIdentifiers.length));
        }
        for (String ele : resourceIdentifiers) {
            this.resourceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * These are the resources included in the resource selection (including type of resources and vaults).
     * </p>
     * 
     * @param resourceIdentifiers
     *        These are the resources included in the resource selection (including type of resources and vaults).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointSelection withResourceIdentifiers(java.util.Collection<String> resourceIdentifiers) {
        setResourceIdentifiers(resourceIdentifiers);
        return this;
    }

    /**
     * @param dateRange
     */

    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    /**
     * @return
     */

    public DateRange getDateRange() {
        return this.dateRange;
    }

    /**
     * @param dateRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointSelection withDateRange(DateRange dateRange) {
        setDateRange(dateRange);
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
        if (getVaultNames() != null)
            sb.append("VaultNames: ").append(getVaultNames()).append(",");
        if (getResourceIdentifiers() != null)
            sb.append("ResourceIdentifiers: ").append(getResourceIdentifiers()).append(",");
        if (getDateRange() != null)
            sb.append("DateRange: ").append(getDateRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryPointSelection == false)
            return false;
        RecoveryPointSelection other = (RecoveryPointSelection) obj;
        if (other.getVaultNames() == null ^ this.getVaultNames() == null)
            return false;
        if (other.getVaultNames() != null && other.getVaultNames().equals(this.getVaultNames()) == false)
            return false;
        if (other.getResourceIdentifiers() == null ^ this.getResourceIdentifiers() == null)
            return false;
        if (other.getResourceIdentifiers() != null && other.getResourceIdentifiers().equals(this.getResourceIdentifiers()) == false)
            return false;
        if (other.getDateRange() == null ^ this.getDateRange() == null)
            return false;
        if (other.getDateRange() != null && other.getDateRange().equals(this.getDateRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVaultNames() == null) ? 0 : getVaultNames().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifiers() == null) ? 0 : getResourceIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getDateRange() == null) ? 0 : getDateRange().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryPointSelection clone() {
        try {
            return (RecoveryPointSelection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RecoveryPointSelectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
