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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the details of an Amazon Neptune DB cluster parameter group.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>DescribeDBClusterParameterGroups</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DBClusterParameterGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterParameterGroup implements Serializable, Cloneable {

    /**
     * <p>
     * Provides the name of the DB cluster parameter group.
     * </p>
     */
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * Provides the name of the DB parameter group family that this DB cluster parameter group is compatible with.
     * </p>
     */
    private String dBParameterGroupFamily;
    /**
     * <p>
     * Provides the customer-specified description for this DB cluster parameter group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster parameter group.
     * </p>
     */
    private String dBClusterParameterGroupArn;

    /**
     * <p>
     * Provides the name of the DB cluster parameter group.
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        Provides the name of the DB cluster parameter group.
     */

    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * Provides the name of the DB cluster parameter group.
     * </p>
     * 
     * @return Provides the name of the DB cluster parameter group.
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * Provides the name of the DB cluster parameter group.
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        Provides the name of the DB cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterParameterGroup withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * Provides the name of the DB parameter group family that this DB cluster parameter group is compatible with.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        Provides the name of the DB parameter group family that this DB cluster parameter group is compatible
     *        with.
     */

    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * Provides the name of the DB parameter group family that this DB cluster parameter group is compatible with.
     * </p>
     * 
     * @return Provides the name of the DB parameter group family that this DB cluster parameter group is compatible
     *         with.
     */

    public String getDBParameterGroupFamily() {
        return this.dBParameterGroupFamily;
    }

    /**
     * <p>
     * Provides the name of the DB parameter group family that this DB cluster parameter group is compatible with.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        Provides the name of the DB parameter group family that this DB cluster parameter group is compatible
     *        with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterParameterGroup withDBParameterGroupFamily(String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * Provides the customer-specified description for this DB cluster parameter group.
     * </p>
     * 
     * @param description
     *        Provides the customer-specified description for this DB cluster parameter group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Provides the customer-specified description for this DB cluster parameter group.
     * </p>
     * 
     * @return Provides the customer-specified description for this DB cluster parameter group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Provides the customer-specified description for this DB cluster parameter group.
     * </p>
     * 
     * @param description
     *        Provides the customer-specified description for this DB cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterParameterGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster parameter group.
     * </p>
     * 
     * @param dBClusterParameterGroupArn
     *        The Amazon Resource Name (ARN) for the DB cluster parameter group.
     */

    public void setDBClusterParameterGroupArn(String dBClusterParameterGroupArn) {
        this.dBClusterParameterGroupArn = dBClusterParameterGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster parameter group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the DB cluster parameter group.
     */

    public String getDBClusterParameterGroupArn() {
        return this.dBClusterParameterGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster parameter group.
     * </p>
     * 
     * @param dBClusterParameterGroupArn
     *        The Amazon Resource Name (ARN) for the DB cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterParameterGroup withDBClusterParameterGroupArn(String dBClusterParameterGroupArn) {
        setDBClusterParameterGroupArn(dBClusterParameterGroupArn);
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
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: ").append(getDBClusterParameterGroupName()).append(",");
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: ").append(getDBParameterGroupFamily()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDBClusterParameterGroupArn() != null)
            sb.append("DBClusterParameterGroupArn: ").append(getDBClusterParameterGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterParameterGroup == false)
            return false;
        DBClusterParameterGroup other = (DBClusterParameterGroup) obj;
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDBClusterParameterGroupArn() == null ^ this.getDBClusterParameterGroupArn() == null)
            return false;
        if (other.getDBClusterParameterGroupArn() != null && other.getDBClusterParameterGroupArn().equals(this.getDBClusterParameterGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroupArn() == null) ? 0 : getDBClusterParameterGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterParameterGroup clone() {
        try {
            return (DBClusterParameterGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
