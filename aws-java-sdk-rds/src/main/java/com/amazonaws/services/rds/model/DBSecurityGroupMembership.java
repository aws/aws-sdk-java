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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This data type is used as a response element in the following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ModifyDBInstance</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RebootDBInstance</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RestoreDBInstanceFromDBSnapshot</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RestoreDBInstanceToPointInTime</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBSecurityGroupMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBSecurityGroupMembership implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB security group.
     * </p>
     */
    private String dBSecurityGroupName;
    /**
     * <p>
     * The status of the DB security group.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the DB security group.
     * </p>
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group.
     */

    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    /**
     * <p>
     * The name of the DB security group.
     * </p>
     * 
     * @return The name of the DB security group.
     */

    public String getDBSecurityGroupName() {
        return this.dBSecurityGroupName;
    }

    /**
     * <p>
     * The name of the DB security group.
     * </p>
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroupMembership withDBSecurityGroupName(String dBSecurityGroupName) {
        setDBSecurityGroupName(dBSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The status of the DB security group.
     * </p>
     * 
     * @param status
     *        The status of the DB security group.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the DB security group.
     * </p>
     * 
     * @return The status of the DB security group.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the DB security group.
     * </p>
     * 
     * @param status
     *        The status of the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroupMembership withStatus(String status) {
        setStatus(status);
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
        if (getDBSecurityGroupName() != null)
            sb.append("DBSecurityGroupName: ").append(getDBSecurityGroupName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSecurityGroupMembership == false)
            return false;
        DBSecurityGroupMembership other = (DBSecurityGroupMembership) obj;
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null)
            return false;
        if (other.getDBSecurityGroupName() != null && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DBSecurityGroupMembership clone() {
        try {
            return (DBSecurityGroupMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
