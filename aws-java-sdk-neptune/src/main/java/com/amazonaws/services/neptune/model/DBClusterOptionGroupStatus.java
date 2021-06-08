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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Not supported by Neptune.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DBClusterOptionGroupStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterOptionGroupStatus implements Serializable, Cloneable {

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     */
    private String dBClusterOptionGroupName;
    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     * 
     * @param dBClusterOptionGroupName
     *        Not supported by Neptune.
     */

    public void setDBClusterOptionGroupName(String dBClusterOptionGroupName) {
        this.dBClusterOptionGroupName = dBClusterOptionGroupName;
    }

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     * 
     * @return Not supported by Neptune.
     */

    public String getDBClusterOptionGroupName() {
        return this.dBClusterOptionGroupName;
    }

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     * 
     * @param dBClusterOptionGroupName
     *        Not supported by Neptune.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterOptionGroupStatus withDBClusterOptionGroupName(String dBClusterOptionGroupName) {
        setDBClusterOptionGroupName(dBClusterOptionGroupName);
        return this;
    }

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     * 
     * @param status
     *        Not supported by Neptune.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     * 
     * @return Not supported by Neptune.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Not supported by Neptune.
     * </p>
     * 
     * @param status
     *        Not supported by Neptune.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterOptionGroupStatus withStatus(String status) {
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
        if (getDBClusterOptionGroupName() != null)
            sb.append("DBClusterOptionGroupName: ").append(getDBClusterOptionGroupName()).append(",");
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

        if (obj instanceof DBClusterOptionGroupStatus == false)
            return false;
        DBClusterOptionGroupStatus other = (DBClusterOptionGroupStatus) obj;
        if (other.getDBClusterOptionGroupName() == null ^ this.getDBClusterOptionGroupName() == null)
            return false;
        if (other.getDBClusterOptionGroupName() != null && other.getDBClusterOptionGroupName().equals(this.getDBClusterOptionGroupName()) == false)
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

        hashCode = prime * hashCode + ((getDBClusterOptionGroupName() == null) ? 0 : getDBClusterOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterOptionGroupStatus clone() {
        try {
            return (DBClusterOptionGroupStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
