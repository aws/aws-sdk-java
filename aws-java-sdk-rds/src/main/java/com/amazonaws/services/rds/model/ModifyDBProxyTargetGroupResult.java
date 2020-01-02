/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxyTargetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBProxyTargetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The settings of the modified <code>DBProxyTarget</code>.
     * </p>
     */
    private DBProxyTargetGroup dBProxyTargetGroup;

    /**
     * <p>
     * The settings of the modified <code>DBProxyTarget</code>.
     * </p>
     * 
     * @param dBProxyTargetGroup
     *        The settings of the modified <code>DBProxyTarget</code>.
     */

    public void setDBProxyTargetGroup(DBProxyTargetGroup dBProxyTargetGroup) {
        this.dBProxyTargetGroup = dBProxyTargetGroup;
    }

    /**
     * <p>
     * The settings of the modified <code>DBProxyTarget</code>.
     * </p>
     * 
     * @return The settings of the modified <code>DBProxyTarget</code>.
     */

    public DBProxyTargetGroup getDBProxyTargetGroup() {
        return this.dBProxyTargetGroup;
    }

    /**
     * <p>
     * The settings of the modified <code>DBProxyTarget</code>.
     * </p>
     * 
     * @param dBProxyTargetGroup
     *        The settings of the modified <code>DBProxyTarget</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyTargetGroupResult withDBProxyTargetGroup(DBProxyTargetGroup dBProxyTargetGroup) {
        setDBProxyTargetGroup(dBProxyTargetGroup);
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
        if (getDBProxyTargetGroup() != null)
            sb.append("DBProxyTargetGroup: ").append(getDBProxyTargetGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBProxyTargetGroupResult == false)
            return false;
        ModifyDBProxyTargetGroupResult other = (ModifyDBProxyTargetGroupResult) obj;
        if (other.getDBProxyTargetGroup() == null ^ this.getDBProxyTargetGroup() == null)
            return false;
        if (other.getDBProxyTargetGroup() != null && other.getDBProxyTargetGroup().equals(this.getDBProxyTargetGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyTargetGroup() == null) ? 0 : getDBProxyTargetGroup().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBProxyTargetGroupResult clone() {
        try {
            return (ModifyDBProxyTargetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
