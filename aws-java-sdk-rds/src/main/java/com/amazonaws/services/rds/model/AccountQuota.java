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
 * <p>
 * Describes a quota for an AWS account.
 * </p>
 * <p>
 * The following are account quotas:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AllocatedStorage</code> - The total allocated storage per account, in GiB. The used value is the total
 * allocated storage in the account, in GiB.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>AuthorizationsPerDBSecurityGroup</code> - The number of ingress rules per DB security group. The used value is
 * the highest number of ingress rules in a DB security group in the account. Other DB security groups in the account
 * might have a lower number of ingress rules.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CustomEndpointsPerDBCluster</code> - The number of custom endpoints per DB cluster. The used value is the
 * highest number of custom endpoints in a DB clusters in the account. Other DB clusters in the account might have a
 * lower number of custom endpoints.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DBClusterParameterGroups</code> - The number of DB cluster parameter groups per account, excluding default
 * parameter groups. The used value is the count of nondefault DB cluster parameter groups in the account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DBClusterRoles</code> - The number of associated AWS Identity and Access Management (IAM) roles per DB cluster.
 * The used value is the highest number of associated IAM roles for a DB cluster in the account. Other DB clusters in
 * the account might have a lower number of associated IAM roles.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DBClusters</code> - The number of DB clusters per account. The used value is the count of DB clusters in the
 * account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DBInstanceRoles</code> - The number of associated IAM roles per DB instance. The used value is the highest
 * number of associated IAM roles for a DB instance in the account. Other DB instances in the account might have a lower
 * number of associated IAM roles.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DBInstances</code> - The number of DB instances per account. The used value is the count of the DB instances in
 * the account.
 * </p>
 * <p>
 * Amazon RDS DB instances, Amazon Aurora DB instances, Amazon Neptune instances, and Amazon DocumentDB instances apply
 * to this quota.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DBParameterGroups</code> - The number of DB parameter groups per account, excluding default parameter groups.
 * The used value is the count of nondefault DB parameter groups in the account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DBSecurityGroups</code> - The number of DB security groups (not VPC security groups) per account, excluding the
 * default security group. The used value is the count of nondefault DB security groups in the account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DBSubnetGroups</code> - The number of DB subnet groups per account. The used value is the count of the DB
 * subnet groups in the account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>EventSubscriptions</code> - The number of event subscriptions per account. The used value is the count of the
 * event subscriptions in the account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ManualSnapshots</code> - The number of manual DB snapshots per account. The used value is the count of the
 * manual DB snapshots in the account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>OptionGroups</code> - The number of DB option groups per account, excluding default option groups. The used
 * value is the count of nondefault DB option groups in the account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ReadReplicasPerMaster</code> - The number of Read Replicas per DB instance. The used value is the highest
 * number of Read Replicas for a DB instance in the account. Other DB instances in the account might have a lower number
 * of Read Replicas.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ReservedDBInstances</code> - The number of reserved DB instances per account. The used value is the count of
 * the active reserved DB instances in the account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SubnetsPerDBSubnetGroup</code> - The number of subnets per DB subnet group. The used value is highest number of
 * subnets for a DB subnet group in the account. Other DB subnet groups in the account might have a lower number of
 * subnets.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html">Quotas
 * for Amazon RDS</a> in the <i>Amazon RDS User Guide</i> and <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_Limits.html">Quotas for Amazon Aurora</a> in
 * the <i>Amazon Aurora User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AccountQuota" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountQuota implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon RDS quota for this AWS account.
     * </p>
     */
    private String accountQuotaName;
    /**
     * <p>
     * The amount currently used toward the quota maximum.
     * </p>
     */
    private Long used;
    /**
     * <p>
     * The maximum allowed value for the quota.
     * </p>
     */
    private Long max;

    /**
     * <p>
     * The name of the Amazon RDS quota for this AWS account.
     * </p>
     * 
     * @param accountQuotaName
     *        The name of the Amazon RDS quota for this AWS account.
     */

    public void setAccountQuotaName(String accountQuotaName) {
        this.accountQuotaName = accountQuotaName;
    }

    /**
     * <p>
     * The name of the Amazon RDS quota for this AWS account.
     * </p>
     * 
     * @return The name of the Amazon RDS quota for this AWS account.
     */

    public String getAccountQuotaName() {
        return this.accountQuotaName;
    }

    /**
     * <p>
     * The name of the Amazon RDS quota for this AWS account.
     * </p>
     * 
     * @param accountQuotaName
     *        The name of the Amazon RDS quota for this AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountQuota withAccountQuotaName(String accountQuotaName) {
        setAccountQuotaName(accountQuotaName);
        return this;
    }

    /**
     * <p>
     * The amount currently used toward the quota maximum.
     * </p>
     * 
     * @param used
     *        The amount currently used toward the quota maximum.
     */

    public void setUsed(Long used) {
        this.used = used;
    }

    /**
     * <p>
     * The amount currently used toward the quota maximum.
     * </p>
     * 
     * @return The amount currently used toward the quota maximum.
     */

    public Long getUsed() {
        return this.used;
    }

    /**
     * <p>
     * The amount currently used toward the quota maximum.
     * </p>
     * 
     * @param used
     *        The amount currently used toward the quota maximum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountQuota withUsed(Long used) {
        setUsed(used);
        return this;
    }

    /**
     * <p>
     * The maximum allowed value for the quota.
     * </p>
     * 
     * @param max
     *        The maximum allowed value for the quota.
     */

    public void setMax(Long max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum allowed value for the quota.
     * </p>
     * 
     * @return The maximum allowed value for the quota.
     */

    public Long getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum allowed value for the quota.
     * </p>
     * 
     * @param max
     *        The maximum allowed value for the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountQuota withMax(Long max) {
        setMax(max);
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
        if (getAccountQuotaName() != null)
            sb.append("AccountQuotaName: ").append(getAccountQuotaName()).append(",");
        if (getUsed() != null)
            sb.append("Used: ").append(getUsed()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountQuota == false)
            return false;
        AccountQuota other = (AccountQuota) obj;
        if (other.getAccountQuotaName() == null ^ this.getAccountQuotaName() == null)
            return false;
        if (other.getAccountQuotaName() != null && other.getAccountQuotaName().equals(this.getAccountQuotaName()) == false)
            return false;
        if (other.getUsed() == null ^ this.getUsed() == null)
            return false;
        if (other.getUsed() != null && other.getUsed().equals(this.getUsed()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountQuotaName() == null) ? 0 : getAccountQuotaName().hashCode());
        hashCode = prime * hashCode + ((getUsed() == null) ? 0 : getUsed().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        return hashCode;
    }

    @Override
    public AccountQuota clone() {
        try {
            return (AccountQuota) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
