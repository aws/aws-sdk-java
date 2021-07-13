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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribePartners" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePartnersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Region ID that owns the cluster.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The cluster identifier of the cluster whose partner integration is being described.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The name of the database whose partner integration is being described. If database name is not specified, then
     * all databases in the cluster are described.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the partner that is being described. If partner name is not specified, then all partner integrations
     * are described.
     * </p>
     */
    private String partnerName;

    /**
     * <p>
     * The Region ID that owns the cluster.
     * </p>
     * 
     * @param accountId
     *        The Region ID that owns the cluster.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Region ID that owns the cluster.
     * </p>
     * 
     * @return The Region ID that owns the cluster.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Region ID that owns the cluster.
     * </p>
     * 
     * @param accountId
     *        The Region ID that owns the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePartnersRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The cluster identifier of the cluster whose partner integration is being described.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster whose partner integration is being described.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster whose partner integration is being described.
     * </p>
     * 
     * @return The cluster identifier of the cluster whose partner integration is being described.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster whose partner integration is being described.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster whose partner integration is being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePartnersRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the database whose partner integration is being described. If database name is not specified, then
     * all databases in the cluster are described.
     * </p>
     * 
     * @param databaseName
     *        The name of the database whose partner integration is being described. If database name is not specified,
     *        then all databases in the cluster are described.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database whose partner integration is being described. If database name is not specified, then
     * all databases in the cluster are described.
     * </p>
     * 
     * @return The name of the database whose partner integration is being described. If database name is not specified,
     *         then all databases in the cluster are described.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database whose partner integration is being described. If database name is not specified, then
     * all databases in the cluster are described.
     * </p>
     * 
     * @param databaseName
     *        The name of the database whose partner integration is being described. If database name is not specified,
     *        then all databases in the cluster are described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePartnersRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the partner that is being described. If partner name is not specified, then all partner integrations
     * are described.
     * </p>
     * 
     * @param partnerName
     *        The name of the partner that is being described. If partner name is not specified, then all partner
     *        integrations are described.
     */

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    /**
     * <p>
     * The name of the partner that is being described. If partner name is not specified, then all partner integrations
     * are described.
     * </p>
     * 
     * @return The name of the partner that is being described. If partner name is not specified, then all partner
     *         integrations are described.
     */

    public String getPartnerName() {
        return this.partnerName;
    }

    /**
     * <p>
     * The name of the partner that is being described. If partner name is not specified, then all partner integrations
     * are described.
     * </p>
     * 
     * @param partnerName
     *        The name of the partner that is being described. If partner name is not specified, then all partner
     *        integrations are described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePartnersRequest withPartnerName(String partnerName) {
        setPartnerName(partnerName);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getPartnerName() != null)
            sb.append("PartnerName: ").append(getPartnerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePartnersRequest == false)
            return false;
        DescribePartnersRequest other = (DescribePartnersRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getPartnerName() == null ^ this.getPartnerName() == null)
            return false;
        if (other.getPartnerName() != null && other.getPartnerName().equals(this.getPartnerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getPartnerName() == null) ? 0 : getPartnerName().hashCode());
        return hashCode;
    }

    @Override
    public DescribePartnersRequest clone() {
        return (DescribePartnersRequest) super.clone();
    }

}
