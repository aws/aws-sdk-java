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
 * Contains the details of an Amazon RDS DB subnet group.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>DescribeDBSubnetGroups</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBSubnetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBSubnetGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB subnet group.
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * Provides the description of the DB subnet group.
     * </p>
     */
    private String dBSubnetGroupDescription;
    /**
     * <p>
     * Provides the VpcId of the DB subnet group.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Provides the status of the DB subnet group.
     * </p>
     */
    private String subnetGroupStatus;
    /**
     * <p>
     * Contains a list of <a>Subnet</a> elements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Subnet> subnets;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB subnet group.
     * </p>
     */
    private String dBSubnetGroupArn;

    /**
     * <p>
     * The name of the DB subnet group.
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name of the DB subnet group.
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the DB subnet group.
     * </p>
     * 
     * @return The name of the DB subnet group.
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the DB subnet group.
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name of the DB subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSubnetGroup withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * Provides the description of the DB subnet group.
     * </p>
     * 
     * @param dBSubnetGroupDescription
     *        Provides the description of the DB subnet group.
     */

    public void setDBSubnetGroupDescription(String dBSubnetGroupDescription) {
        this.dBSubnetGroupDescription = dBSubnetGroupDescription;
    }

    /**
     * <p>
     * Provides the description of the DB subnet group.
     * </p>
     * 
     * @return Provides the description of the DB subnet group.
     */

    public String getDBSubnetGroupDescription() {
        return this.dBSubnetGroupDescription;
    }

    /**
     * <p>
     * Provides the description of the DB subnet group.
     * </p>
     * 
     * @param dBSubnetGroupDescription
     *        Provides the description of the DB subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSubnetGroup withDBSubnetGroupDescription(String dBSubnetGroupDescription) {
        setDBSubnetGroupDescription(dBSubnetGroupDescription);
        return this;
    }

    /**
     * <p>
     * Provides the VpcId of the DB subnet group.
     * </p>
     * 
     * @param vpcId
     *        Provides the VpcId of the DB subnet group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VpcId of the DB subnet group.
     * </p>
     * 
     * @return Provides the VpcId of the DB subnet group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Provides the VpcId of the DB subnet group.
     * </p>
     * 
     * @param vpcId
     *        Provides the VpcId of the DB subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSubnetGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Provides the status of the DB subnet group.
     * </p>
     * 
     * @param subnetGroupStatus
     *        Provides the status of the DB subnet group.
     */

    public void setSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
    }

    /**
     * <p>
     * Provides the status of the DB subnet group.
     * </p>
     * 
     * @return Provides the status of the DB subnet group.
     */

    public String getSubnetGroupStatus() {
        return this.subnetGroupStatus;
    }

    /**
     * <p>
     * Provides the status of the DB subnet group.
     * </p>
     * 
     * @param subnetGroupStatus
     *        Provides the status of the DB subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSubnetGroup withSubnetGroupStatus(String subnetGroupStatus) {
        setSubnetGroupStatus(subnetGroupStatus);
        return this;
    }

    /**
     * <p>
     * Contains a list of <a>Subnet</a> elements.
     * </p>
     * 
     * @return Contains a list of <a>Subnet</a> elements.
     */

    public java.util.List<Subnet> getSubnets() {
        if (subnets == null) {
            subnets = new com.amazonaws.internal.SdkInternalList<Subnet>();
        }
        return subnets;
    }

    /**
     * <p>
     * Contains a list of <a>Subnet</a> elements.
     * </p>
     * 
     * @param subnets
     *        Contains a list of <a>Subnet</a> elements.
     */

    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new com.amazonaws.internal.SdkInternalList<Subnet>(subnets);
    }

    /**
     * <p>
     * Contains a list of <a>Subnet</a> elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        Contains a list of <a>Subnet</a> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSubnetGroup withSubnets(Subnet... subnets) {
        if (this.subnets == null) {
            setSubnets(new com.amazonaws.internal.SdkInternalList<Subnet>(subnets.length));
        }
        for (Subnet ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of <a>Subnet</a> elements.
     * </p>
     * 
     * @param subnets
     *        Contains a list of <a>Subnet</a> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB subnet group.
     * </p>
     * 
     * @param dBSubnetGroupArn
     *        The Amazon Resource Name (ARN) for the DB subnet group.
     */

    public void setDBSubnetGroupArn(String dBSubnetGroupArn) {
        this.dBSubnetGroupArn = dBSubnetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB subnet group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the DB subnet group.
     */

    public String getDBSubnetGroupArn() {
        return this.dBSubnetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB subnet group.
     * </p>
     * 
     * @param dBSubnetGroupArn
     *        The Amazon Resource Name (ARN) for the DB subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSubnetGroup withDBSubnetGroupArn(String dBSubnetGroupArn) {
        setDBSubnetGroupArn(dBSubnetGroupArn);
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
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getDBSubnetGroupDescription() != null)
            sb.append("DBSubnetGroupDescription: ").append(getDBSubnetGroupDescription()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetGroupStatus() != null)
            sb.append("SubnetGroupStatus: ").append(getSubnetGroupStatus()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getDBSubnetGroupArn() != null)
            sb.append("DBSubnetGroupArn: ").append(getDBSubnetGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSubnetGroup == false)
            return false;
        DBSubnetGroup other = (DBSubnetGroup) obj;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getDBSubnetGroupDescription() == null ^ this.getDBSubnetGroupDescription() == null)
            return false;
        if (other.getDBSubnetGroupDescription() != null && other.getDBSubnetGroupDescription().equals(this.getDBSubnetGroupDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetGroupStatus() == null ^ this.getSubnetGroupStatus() == null)
            return false;
        if (other.getSubnetGroupStatus() != null && other.getSubnetGroupStatus().equals(this.getSubnetGroupStatus()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getDBSubnetGroupArn() == null ^ this.getDBSubnetGroupArn() == null)
            return false;
        if (other.getDBSubnetGroupArn() != null && other.getDBSubnetGroupArn().equals(this.getDBSubnetGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupDescription() == null) ? 0 : getDBSubnetGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupStatus() == null) ? 0 : getSubnetGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupArn() == null) ? 0 : getDBSubnetGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public DBSubnetGroup clone() {
        try {
            return (DBSubnetGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
