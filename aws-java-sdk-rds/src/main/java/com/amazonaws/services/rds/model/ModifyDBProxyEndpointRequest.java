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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxyEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBProxyEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB proxy sociated with the DB proxy endpoint that you want to modify.
     * </p>
     */
    private String dBProxyEndpointName;
    /**
     * <p>
     * The new identifier for the <code>DBProxyEndpoint</code>. An identifier must begin with a letter and must contain
     * only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String newDBProxyEndpointName;
    /**
     * <p>
     * The VPC security group IDs for the DB proxy endpoint. When the DB proxy endpoint uses a different VPC than the
     * original proxy, you also specify a different set of security group IDs than for the original proxy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The name of the DB proxy sociated with the DB proxy endpoint that you want to modify.
     * </p>
     * 
     * @param dBProxyEndpointName
     *        The name of the DB proxy sociated with the DB proxy endpoint that you want to modify.
     */

    public void setDBProxyEndpointName(String dBProxyEndpointName) {
        this.dBProxyEndpointName = dBProxyEndpointName;
    }

    /**
     * <p>
     * The name of the DB proxy sociated with the DB proxy endpoint that you want to modify.
     * </p>
     * 
     * @return The name of the DB proxy sociated with the DB proxy endpoint that you want to modify.
     */

    public String getDBProxyEndpointName() {
        return this.dBProxyEndpointName;
    }

    /**
     * <p>
     * The name of the DB proxy sociated with the DB proxy endpoint that you want to modify.
     * </p>
     * 
     * @param dBProxyEndpointName
     *        The name of the DB proxy sociated with the DB proxy endpoint that you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyEndpointRequest withDBProxyEndpointName(String dBProxyEndpointName) {
        setDBProxyEndpointName(dBProxyEndpointName);
        return this;
    }

    /**
     * <p>
     * The new identifier for the <code>DBProxyEndpoint</code>. An identifier must begin with a letter and must contain
     * only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param newDBProxyEndpointName
     *        The new identifier for the <code>DBProxyEndpoint</code>. An identifier must begin with a letter and must
     *        contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive
     *        hyphens.
     */

    public void setNewDBProxyEndpointName(String newDBProxyEndpointName) {
        this.newDBProxyEndpointName = newDBProxyEndpointName;
    }

    /**
     * <p>
     * The new identifier for the <code>DBProxyEndpoint</code>. An identifier must begin with a letter and must contain
     * only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The new identifier for the <code>DBProxyEndpoint</code>. An identifier must begin with a letter and must
     *         contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive
     *         hyphens.
     */

    public String getNewDBProxyEndpointName() {
        return this.newDBProxyEndpointName;
    }

    /**
     * <p>
     * The new identifier for the <code>DBProxyEndpoint</code>. An identifier must begin with a letter and must contain
     * only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param newDBProxyEndpointName
     *        The new identifier for the <code>DBProxyEndpoint</code>. An identifier must begin with a letter and must
     *        contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive
     *        hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyEndpointRequest withNewDBProxyEndpointName(String newDBProxyEndpointName) {
        setNewDBProxyEndpointName(newDBProxyEndpointName);
        return this;
    }

    /**
     * <p>
     * The VPC security group IDs for the DB proxy endpoint. When the DB proxy endpoint uses a different VPC than the
     * original proxy, you also specify a different set of security group IDs than for the original proxy.
     * </p>
     * 
     * @return The VPC security group IDs for the DB proxy endpoint. When the DB proxy endpoint uses a different VPC
     *         than the original proxy, you also specify a different set of security group IDs than for the original
     *         proxy.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * The VPC security group IDs for the DB proxy endpoint. When the DB proxy endpoint uses a different VPC than the
     * original proxy, you also specify a different set of security group IDs than for the original proxy.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The VPC security group IDs for the DB proxy endpoint. When the DB proxy endpoint uses a different VPC than
     *        the original proxy, you also specify a different set of security group IDs than for the original proxy.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * The VPC security group IDs for the DB proxy endpoint. When the DB proxy endpoint uses a different VPC than the
     * original proxy, you also specify a different set of security group IDs than for the original proxy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The VPC security group IDs for the DB proxy endpoint. When the DB proxy endpoint uses a different VPC than
     *        the original proxy, you also specify a different set of security group IDs than for the original proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyEndpointRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The VPC security group IDs for the DB proxy endpoint. When the DB proxy endpoint uses a different VPC than the
     * original proxy, you also specify a different set of security group IDs than for the original proxy.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The VPC security group IDs for the DB proxy endpoint. When the DB proxy endpoint uses a different VPC than
     *        the original proxy, you also specify a different set of security group IDs than for the original proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyEndpointRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
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
        if (getDBProxyEndpointName() != null)
            sb.append("DBProxyEndpointName: ").append(getDBProxyEndpointName()).append(",");
        if (getNewDBProxyEndpointName() != null)
            sb.append("NewDBProxyEndpointName: ").append(getNewDBProxyEndpointName()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBProxyEndpointRequest == false)
            return false;
        ModifyDBProxyEndpointRequest other = (ModifyDBProxyEndpointRequest) obj;
        if (other.getDBProxyEndpointName() == null ^ this.getDBProxyEndpointName() == null)
            return false;
        if (other.getDBProxyEndpointName() != null && other.getDBProxyEndpointName().equals(this.getDBProxyEndpointName()) == false)
            return false;
        if (other.getNewDBProxyEndpointName() == null ^ this.getNewDBProxyEndpointName() == null)
            return false;
        if (other.getNewDBProxyEndpointName() != null && other.getNewDBProxyEndpointName().equals(this.getNewDBProxyEndpointName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyEndpointName() == null) ? 0 : getDBProxyEndpointName().hashCode());
        hashCode = prime * hashCode + ((getNewDBProxyEndpointName() == null) ? 0 : getNewDBProxyEndpointName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBProxyEndpointRequest clone() {
        return (ModifyDBProxyEndpointRequest) super.clone();
    }

}
