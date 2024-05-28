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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A response element in the <code>ModifyTenantDatabase</code> operation that describes changes that will be applied.
 * Specific changes are identified by subelements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/TenantDatabasePendingModifiedValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TenantDatabasePendingModifiedValues implements Serializable, Cloneable {

    /**
     * <p>
     * The master password for the tenant database.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The name of the tenant database.
     * </p>
     */
    private String tenantDBName;

    /**
     * <p>
     * The master password for the tenant database.
     * </p>
     * 
     * @param masterUserPassword
     *        The master password for the tenant database.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The master password for the tenant database.
     * </p>
     * 
     * @return The master password for the tenant database.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The master password for the tenant database.
     * </p>
     * 
     * @param masterUserPassword
     *        The master password for the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabasePendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The name of the tenant database.
     * </p>
     * 
     * @param tenantDBName
     *        The name of the tenant database.
     */

    public void setTenantDBName(String tenantDBName) {
        this.tenantDBName = tenantDBName;
    }

    /**
     * <p>
     * The name of the tenant database.
     * </p>
     * 
     * @return The name of the tenant database.
     */

    public String getTenantDBName() {
        return this.tenantDBName;
    }

    /**
     * <p>
     * The name of the tenant database.
     * </p>
     * 
     * @param tenantDBName
     *        The name of the tenant database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TenantDatabasePendingModifiedValues withTenantDBName(String tenantDBName) {
        setTenantDBName(tenantDBName);
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
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getTenantDBName() != null)
            sb.append("TenantDBName: ").append(getTenantDBName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TenantDatabasePendingModifiedValues == false)
            return false;
        TenantDatabasePendingModifiedValues other = (TenantDatabasePendingModifiedValues) obj;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getTenantDBName() == null ^ this.getTenantDBName() == null)
            return false;
        if (other.getTenantDBName() != null && other.getTenantDBName().equals(this.getTenantDBName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getTenantDBName() == null) ? 0 : getTenantDBName().hashCode());
        return hashCode;
    }

    @Override
    public TenantDatabasePendingModifiedValues clone() {
        try {
            return (TenantDatabasePendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
