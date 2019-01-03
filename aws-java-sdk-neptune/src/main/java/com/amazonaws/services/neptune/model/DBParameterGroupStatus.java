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
 * The status of the DB parameter group.
 * </p>
 * <p>
 * This data type is used as a response element in the following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateDBInstance</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteDBInstance</a>
 * </p>
 * </li>
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
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DBParameterGroupStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBParameterGroupStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DP parameter group.
     * </p>
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * The status of parameter updates.
     * </p>
     */
    private String parameterApplyStatus;

    /**
     * <p>
     * The name of the DP parameter group.
     * </p>
     * 
     * @param dBParameterGroupName
     *        The name of the DP parameter group.
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DP parameter group.
     * </p>
     * 
     * @return The name of the DP parameter group.
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DP parameter group.
     * </p>
     * 
     * @param dBParameterGroupName
     *        The name of the DP parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBParameterGroupStatus withDBParameterGroupName(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates.
     */

    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @return The status of parameter updates.
     */

    public String getParameterApplyStatus() {
        return this.parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBParameterGroupStatus withParameterApplyStatus(String parameterApplyStatus) {
        setParameterApplyStatus(parameterApplyStatus);
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
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: ").append(getDBParameterGroupName()).append(",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: ").append(getParameterApplyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBParameterGroupStatus == false)
            return false;
        DBParameterGroupStatus other = (DBParameterGroupStatus) obj;
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        return hashCode;
    }

    @Override
    public DBParameterGroupStatus clone() {
        try {
            return (DBParameterGroupStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
