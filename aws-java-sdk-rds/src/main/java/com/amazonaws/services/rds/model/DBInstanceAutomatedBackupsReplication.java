/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Automated backups of a DB instance replicated to another Amazon Web Services Region. They consist of system backups,
 * transaction logs, and database instance properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBInstanceAutomatedBackupsReplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBInstanceAutomatedBackupsReplication implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated automated backups.
     * </p>
     */
    private String dBInstanceAutomatedBackupsArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated automated backups.
     * </p>
     * 
     * @param dBInstanceAutomatedBackupsArn
     *        The Amazon Resource Name (ARN) of the replicated automated backups.
     */

    public void setDBInstanceAutomatedBackupsArn(String dBInstanceAutomatedBackupsArn) {
        this.dBInstanceAutomatedBackupsArn = dBInstanceAutomatedBackupsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated automated backups.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replicated automated backups.
     */

    public String getDBInstanceAutomatedBackupsArn() {
        return this.dBInstanceAutomatedBackupsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated automated backups.
     * </p>
     * 
     * @param dBInstanceAutomatedBackupsArn
     *        The Amazon Resource Name (ARN) of the replicated automated backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackupsReplication withDBInstanceAutomatedBackupsArn(String dBInstanceAutomatedBackupsArn) {
        setDBInstanceAutomatedBackupsArn(dBInstanceAutomatedBackupsArn);
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
        if (getDBInstanceAutomatedBackupsArn() != null)
            sb.append("DBInstanceAutomatedBackupsArn: ").append(getDBInstanceAutomatedBackupsArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBInstanceAutomatedBackupsReplication == false)
            return false;
        DBInstanceAutomatedBackupsReplication other = (DBInstanceAutomatedBackupsReplication) obj;
        if (other.getDBInstanceAutomatedBackupsArn() == null ^ this.getDBInstanceAutomatedBackupsArn() == null)
            return false;
        if (other.getDBInstanceAutomatedBackupsArn() != null
                && other.getDBInstanceAutomatedBackupsArn().equals(this.getDBInstanceAutomatedBackupsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceAutomatedBackupsArn() == null) ? 0 : getDBInstanceAutomatedBackupsArn().hashCode());
        return hashCode;
    }

    @Override
    public DBInstanceAutomatedBackupsReplication clone() {
        try {
            return (DBInstanceAutomatedBackupsReplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
