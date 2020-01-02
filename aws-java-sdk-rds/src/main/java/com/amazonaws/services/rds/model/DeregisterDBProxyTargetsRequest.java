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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeregisterDBProxyTargets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterDBProxyTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <code>DBProxy</code> that is associated with the <code>DBProxyTargetGroup</code>.
     * </p>
     */
    private String dBProxyName;
    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code>.
     * </p>
     */
    private String targetGroupName;
    /**
     * <p>
     * One or more DB instance identifiers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dBInstanceIdentifiers;
    /**
     * <p>
     * One or more DB cluster identifiers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dBClusterIdentifiers;

    /**
     * <p>
     * The identifier of the <code>DBProxy</code> that is associated with the <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier of the <code>DBProxy</code> that is associated with the <code>DBProxyTargetGroup</code>.
     */

    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxy</code> that is associated with the <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @return The identifier of the <code>DBProxy</code> that is associated with the <code>DBProxyTargetGroup</code>.
     */

    public String getDBProxyName() {
        return this.dBProxyName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxy</code> that is associated with the <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier of the <code>DBProxy</code> that is associated with the <code>DBProxyTargetGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterDBProxyTargetsRequest withDBProxyName(String dBProxyName) {
        setDBProxyName(dBProxyName);
        return this;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param targetGroupName
     *        The identifier of the <code>DBProxyTargetGroup</code>.
     */

    public void setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @return The identifier of the <code>DBProxyTargetGroup</code>.
     */

    public String getTargetGroupName() {
        return this.targetGroupName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param targetGroupName
     *        The identifier of the <code>DBProxyTargetGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterDBProxyTargetsRequest withTargetGroupName(String targetGroupName) {
        setTargetGroupName(targetGroupName);
        return this;
    }

    /**
     * <p>
     * One or more DB instance identifiers.
     * </p>
     * 
     * @return One or more DB instance identifiers.
     */

    public java.util.List<String> getDBInstanceIdentifiers() {
        if (dBInstanceIdentifiers == null) {
            dBInstanceIdentifiers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dBInstanceIdentifiers;
    }

    /**
     * <p>
     * One or more DB instance identifiers.
     * </p>
     * 
     * @param dBInstanceIdentifiers
     *        One or more DB instance identifiers.
     */

    public void setDBInstanceIdentifiers(java.util.Collection<String> dBInstanceIdentifiers) {
        if (dBInstanceIdentifiers == null) {
            this.dBInstanceIdentifiers = null;
            return;
        }

        this.dBInstanceIdentifiers = new com.amazonaws.internal.SdkInternalList<String>(dBInstanceIdentifiers);
    }

    /**
     * <p>
     * One or more DB instance identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBInstanceIdentifiers(java.util.Collection)} or
     * {@link #withDBInstanceIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dBInstanceIdentifiers
     *        One or more DB instance identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterDBProxyTargetsRequest withDBInstanceIdentifiers(String... dBInstanceIdentifiers) {
        if (this.dBInstanceIdentifiers == null) {
            setDBInstanceIdentifiers(new com.amazonaws.internal.SdkInternalList<String>(dBInstanceIdentifiers.length));
        }
        for (String ele : dBInstanceIdentifiers) {
            this.dBInstanceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more DB instance identifiers.
     * </p>
     * 
     * @param dBInstanceIdentifiers
     *        One or more DB instance identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterDBProxyTargetsRequest withDBInstanceIdentifiers(java.util.Collection<String> dBInstanceIdentifiers) {
        setDBInstanceIdentifiers(dBInstanceIdentifiers);
        return this;
    }

    /**
     * <p>
     * One or more DB cluster identifiers.
     * </p>
     * 
     * @return One or more DB cluster identifiers.
     */

    public java.util.List<String> getDBClusterIdentifiers() {
        if (dBClusterIdentifiers == null) {
            dBClusterIdentifiers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dBClusterIdentifiers;
    }

    /**
     * <p>
     * One or more DB cluster identifiers.
     * </p>
     * 
     * @param dBClusterIdentifiers
     *        One or more DB cluster identifiers.
     */

    public void setDBClusterIdentifiers(java.util.Collection<String> dBClusterIdentifiers) {
        if (dBClusterIdentifiers == null) {
            this.dBClusterIdentifiers = null;
            return;
        }

        this.dBClusterIdentifiers = new com.amazonaws.internal.SdkInternalList<String>(dBClusterIdentifiers);
    }

    /**
     * <p>
     * One or more DB cluster identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBClusterIdentifiers(java.util.Collection)} or {@link #withDBClusterIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dBClusterIdentifiers
     *        One or more DB cluster identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterDBProxyTargetsRequest withDBClusterIdentifiers(String... dBClusterIdentifiers) {
        if (this.dBClusterIdentifiers == null) {
            setDBClusterIdentifiers(new com.amazonaws.internal.SdkInternalList<String>(dBClusterIdentifiers.length));
        }
        for (String ele : dBClusterIdentifiers) {
            this.dBClusterIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more DB cluster identifiers.
     * </p>
     * 
     * @param dBClusterIdentifiers
     *        One or more DB cluster identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterDBProxyTargetsRequest withDBClusterIdentifiers(java.util.Collection<String> dBClusterIdentifiers) {
        setDBClusterIdentifiers(dBClusterIdentifiers);
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
        if (getDBProxyName() != null)
            sb.append("DBProxyName: ").append(getDBProxyName()).append(",");
        if (getTargetGroupName() != null)
            sb.append("TargetGroupName: ").append(getTargetGroupName()).append(",");
        if (getDBInstanceIdentifiers() != null)
            sb.append("DBInstanceIdentifiers: ").append(getDBInstanceIdentifiers()).append(",");
        if (getDBClusterIdentifiers() != null)
            sb.append("DBClusterIdentifiers: ").append(getDBClusterIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterDBProxyTargetsRequest == false)
            return false;
        DeregisterDBProxyTargetsRequest other = (DeregisterDBProxyTargetsRequest) obj;
        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getTargetGroupName() == null ^ this.getTargetGroupName() == null)
            return false;
        if (other.getTargetGroupName() != null && other.getTargetGroupName().equals(this.getTargetGroupName()) == false)
            return false;
        if (other.getDBInstanceIdentifiers() == null ^ this.getDBInstanceIdentifiers() == null)
            return false;
        if (other.getDBInstanceIdentifiers() != null && other.getDBInstanceIdentifiers().equals(this.getDBInstanceIdentifiers()) == false)
            return false;
        if (other.getDBClusterIdentifiers() == null ^ this.getDBClusterIdentifiers() == null)
            return false;
        if (other.getDBClusterIdentifiers() != null && other.getDBClusterIdentifiers().equals(this.getDBClusterIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupName() == null) ? 0 : getTargetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceIdentifiers() == null) ? 0 : getDBInstanceIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifiers() == null) ? 0 : getDBClusterIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterDBProxyTargetsRequest clone() {
        return (DeregisterDBProxyTargetsRequest) super.clone();
    }

}
