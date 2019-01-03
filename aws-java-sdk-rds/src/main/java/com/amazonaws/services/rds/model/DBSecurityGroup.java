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
 * Contains the details for an Amazon RDS DB security group.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>DescribeDBSecurityGroups</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBSecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBSecurityGroup implements Serializable, Cloneable {

    /**
     * <p>
     * Provides the AWS ID of the owner of a specific DB security group.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     */
    private String dBSecurityGroupName;
    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     */
    private String dBSecurityGroupDescription;
    /**
     * <p>
     * Provides the VpcId of the DB security group.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EC2SecurityGroup> eC2SecurityGroups;
    /**
     * <p>
     * Contains a list of <a>IPRange</a> elements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IPRange> iPRanges;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB security group.
     * </p>
     */
    private String dBSecurityGroupArn;

    /**
     * <p>
     * Provides the AWS ID of the owner of a specific DB security group.
     * </p>
     * 
     * @param ownerId
     *        Provides the AWS ID of the owner of a specific DB security group.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Provides the AWS ID of the owner of a specific DB security group.
     * </p>
     * 
     * @return Provides the AWS ID of the owner of a specific DB security group.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * Provides the AWS ID of the owner of a specific DB security group.
     * </p>
     * 
     * @param ownerId
     *        Provides the AWS ID of the owner of a specific DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroup withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     * 
     * @param dBSecurityGroupName
     *        Specifies the name of the DB security group.
     */

    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     * 
     * @return Specifies the name of the DB security group.
     */

    public String getDBSecurityGroupName() {
        return this.dBSecurityGroupName;
    }

    /**
     * <p>
     * Specifies the name of the DB security group.
     * </p>
     * 
     * @param dBSecurityGroupName
     *        Specifies the name of the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroup withDBSecurityGroupName(String dBSecurityGroupName) {
        setDBSecurityGroupName(dBSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     * 
     * @param dBSecurityGroupDescription
     *        Provides the description of the DB security group.
     */

    public void setDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
    }

    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     * 
     * @return Provides the description of the DB security group.
     */

    public String getDBSecurityGroupDescription() {
        return this.dBSecurityGroupDescription;
    }

    /**
     * <p>
     * Provides the description of the DB security group.
     * </p>
     * 
     * @param dBSecurityGroupDescription
     *        Provides the description of the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroup withDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        setDBSecurityGroupDescription(dBSecurityGroupDescription);
        return this;
    }

    /**
     * <p>
     * Provides the VpcId of the DB security group.
     * </p>
     * 
     * @param vpcId
     *        Provides the VpcId of the DB security group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VpcId of the DB security group.
     * </p>
     * 
     * @return Provides the VpcId of the DB security group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Provides the VpcId of the DB security group.
     * </p>
     * 
     * @param vpcId
     *        Provides the VpcId of the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     * </p>
     * 
     * @return Contains a list of <a>EC2SecurityGroup</a> elements.
     */

    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        if (eC2SecurityGroups == null) {
            eC2SecurityGroups = new com.amazonaws.internal.SdkInternalList<EC2SecurityGroup>();
        }
        return eC2SecurityGroups;
    }

    /**
     * <p>
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     * </p>
     * 
     * @param eC2SecurityGroups
     *        Contains a list of <a>EC2SecurityGroup</a> elements.
     */

    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
            return;
        }

        this.eC2SecurityGroups = new com.amazonaws.internal.SdkInternalList<EC2SecurityGroup>(eC2SecurityGroups);
    }

    /**
     * <p>
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEC2SecurityGroups(java.util.Collection)} or {@link #withEC2SecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eC2SecurityGroups
     *        Contains a list of <a>EC2SecurityGroup</a> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroup withEC2SecurityGroups(EC2SecurityGroup... eC2SecurityGroups) {
        if (this.eC2SecurityGroups == null) {
            setEC2SecurityGroups(new com.amazonaws.internal.SdkInternalList<EC2SecurityGroup>(eC2SecurityGroups.length));
        }
        for (EC2SecurityGroup ele : eC2SecurityGroups) {
            this.eC2SecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of <a>EC2SecurityGroup</a> elements.
     * </p>
     * 
     * @param eC2SecurityGroups
     *        Contains a list of <a>EC2SecurityGroup</a> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroup withEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        setEC2SecurityGroups(eC2SecurityGroups);
        return this;
    }

    /**
     * <p>
     * Contains a list of <a>IPRange</a> elements.
     * </p>
     * 
     * @return Contains a list of <a>IPRange</a> elements.
     */

    public java.util.List<IPRange> getIPRanges() {
        if (iPRanges == null) {
            iPRanges = new com.amazonaws.internal.SdkInternalList<IPRange>();
        }
        return iPRanges;
    }

    /**
     * <p>
     * Contains a list of <a>IPRange</a> elements.
     * </p>
     * 
     * @param iPRanges
     *        Contains a list of <a>IPRange</a> elements.
     */

    public void setIPRanges(java.util.Collection<IPRange> iPRanges) {
        if (iPRanges == null) {
            this.iPRanges = null;
            return;
        }

        this.iPRanges = new com.amazonaws.internal.SdkInternalList<IPRange>(iPRanges);
    }

    /**
     * <p>
     * Contains a list of <a>IPRange</a> elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIPRanges(java.util.Collection)} or {@link #withIPRanges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param iPRanges
     *        Contains a list of <a>IPRange</a> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroup withIPRanges(IPRange... iPRanges) {
        if (this.iPRanges == null) {
            setIPRanges(new com.amazonaws.internal.SdkInternalList<IPRange>(iPRanges.length));
        }
        for (IPRange ele : iPRanges) {
            this.iPRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of <a>IPRange</a> elements.
     * </p>
     * 
     * @param iPRanges
     *        Contains a list of <a>IPRange</a> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroup withIPRanges(java.util.Collection<IPRange> iPRanges) {
        setIPRanges(iPRanges);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB security group.
     * </p>
     * 
     * @param dBSecurityGroupArn
     *        The Amazon Resource Name (ARN) for the DB security group.
     */

    public void setDBSecurityGroupArn(String dBSecurityGroupArn) {
        this.dBSecurityGroupArn = dBSecurityGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB security group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the DB security group.
     */

    public String getDBSecurityGroupArn() {
        return this.dBSecurityGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB security group.
     * </p>
     * 
     * @param dBSecurityGroupArn
     *        The Amazon Resource Name (ARN) for the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSecurityGroup withDBSecurityGroupArn(String dBSecurityGroupArn) {
        setDBSecurityGroupArn(dBSecurityGroupArn);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getDBSecurityGroupName() != null)
            sb.append("DBSecurityGroupName: ").append(getDBSecurityGroupName()).append(",");
        if (getDBSecurityGroupDescription() != null)
            sb.append("DBSecurityGroupDescription: ").append(getDBSecurityGroupDescription()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getEC2SecurityGroups() != null)
            sb.append("EC2SecurityGroups: ").append(getEC2SecurityGroups()).append(",");
        if (getIPRanges() != null)
            sb.append("IPRanges: ").append(getIPRanges()).append(",");
        if (getDBSecurityGroupArn() != null)
            sb.append("DBSecurityGroupArn: ").append(getDBSecurityGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSecurityGroup == false)
            return false;
        DBSecurityGroup other = (DBSecurityGroup) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null)
            return false;
        if (other.getDBSecurityGroupName() != null && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false)
            return false;
        if (other.getDBSecurityGroupDescription() == null ^ this.getDBSecurityGroupDescription() == null)
            return false;
        if (other.getDBSecurityGroupDescription() != null && other.getDBSecurityGroupDescription().equals(this.getDBSecurityGroupDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getEC2SecurityGroups() == null ^ this.getEC2SecurityGroups() == null)
            return false;
        if (other.getEC2SecurityGroups() != null && other.getEC2SecurityGroups().equals(this.getEC2SecurityGroups()) == false)
            return false;
        if (other.getIPRanges() == null ^ this.getIPRanges() == null)
            return false;
        if (other.getIPRanges() != null && other.getIPRanges().equals(this.getIPRanges()) == false)
            return false;
        if (other.getDBSecurityGroupArn() == null ^ this.getDBSecurityGroupArn() == null)
            return false;
        if (other.getDBSecurityGroupArn() != null && other.getDBSecurityGroupArn().equals(this.getDBSecurityGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBSecurityGroupDescription() == null) ? 0 : getDBSecurityGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getEC2SecurityGroups() == null) ? 0 : getEC2SecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getIPRanges() == null) ? 0 : getIPRanges().hashCode());
        hashCode = prime * hashCode + ((getDBSecurityGroupArn() == null) ? 0 : getDBSecurityGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public DBSecurityGroup clone() {
        try {
            return (DBSecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
