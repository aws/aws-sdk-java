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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RegisterDBProxyTargets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterDBProxyTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * One or more <code>DBProxyTarget</code> objects that are created when you register targets with a target group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBProxyTarget> dBProxyTargets;

    /**
     * <p>
     * One or more <code>DBProxyTarget</code> objects that are created when you register targets with a target group.
     * </p>
     * 
     * @return One or more <code>DBProxyTarget</code> objects that are created when you register targets with a target
     *         group.
     */

    public java.util.List<DBProxyTarget> getDBProxyTargets() {
        if (dBProxyTargets == null) {
            dBProxyTargets = new com.amazonaws.internal.SdkInternalList<DBProxyTarget>();
        }
        return dBProxyTargets;
    }

    /**
     * <p>
     * One or more <code>DBProxyTarget</code> objects that are created when you register targets with a target group.
     * </p>
     * 
     * @param dBProxyTargets
     *        One or more <code>DBProxyTarget</code> objects that are created when you register targets with a target
     *        group.
     */

    public void setDBProxyTargets(java.util.Collection<DBProxyTarget> dBProxyTargets) {
        if (dBProxyTargets == null) {
            this.dBProxyTargets = null;
            return;
        }

        this.dBProxyTargets = new com.amazonaws.internal.SdkInternalList<DBProxyTarget>(dBProxyTargets);
    }

    /**
     * <p>
     * One or more <code>DBProxyTarget</code> objects that are created when you register targets with a target group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBProxyTargets(java.util.Collection)} or {@link #withDBProxyTargets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dBProxyTargets
     *        One or more <code>DBProxyTarget</code> objects that are created when you register targets with a target
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDBProxyTargetsResult withDBProxyTargets(DBProxyTarget... dBProxyTargets) {
        if (this.dBProxyTargets == null) {
            setDBProxyTargets(new com.amazonaws.internal.SdkInternalList<DBProxyTarget>(dBProxyTargets.length));
        }
        for (DBProxyTarget ele : dBProxyTargets) {
            this.dBProxyTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more <code>DBProxyTarget</code> objects that are created when you register targets with a target group.
     * </p>
     * 
     * @param dBProxyTargets
     *        One or more <code>DBProxyTarget</code> objects that are created when you register targets with a target
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDBProxyTargetsResult withDBProxyTargets(java.util.Collection<DBProxyTarget> dBProxyTargets) {
        setDBProxyTargets(dBProxyTargets);
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
        if (getDBProxyTargets() != null)
            sb.append("DBProxyTargets: ").append(getDBProxyTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterDBProxyTargetsResult == false)
            return false;
        RegisterDBProxyTargetsResult other = (RegisterDBProxyTargetsResult) obj;
        if (other.getDBProxyTargets() == null ^ this.getDBProxyTargets() == null)
            return false;
        if (other.getDBProxyTargets() != null && other.getDBProxyTargets().equals(this.getDBProxyTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyTargets() == null) ? 0 : getDBProxyTargets().hashCode());
        return hashCode;
    }

    @Override
    public RegisterDBProxyTargetsResult clone() {
        try {
            return (RegisterDBProxyTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
