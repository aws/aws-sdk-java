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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AddPartner" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddPartnerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Region ID that owns the cluster.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The cluster identifier of the cluster that receives data from the partner.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The name of the database that receives data from the partner.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the partner that is authorized to send data.
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

    public AddPartnerRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The cluster identifier of the cluster that receives data from the partner.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster that receives data from the partner.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster that receives data from the partner.
     * </p>
     * 
     * @return The cluster identifier of the cluster that receives data from the partner.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster that receives data from the partner.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster that receives data from the partner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPartnerRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the database that receives data from the partner.
     * </p>
     * 
     * @param databaseName
     *        The name of the database that receives data from the partner.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database that receives data from the partner.
     * </p>
     * 
     * @return The name of the database that receives data from the partner.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database that receives data from the partner.
     * </p>
     * 
     * @param databaseName
     *        The name of the database that receives data from the partner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPartnerRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the partner that is authorized to send data.
     * </p>
     * 
     * @param partnerName
     *        The name of the partner that is authorized to send data.
     */

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    /**
     * <p>
     * The name of the partner that is authorized to send data.
     * </p>
     * 
     * @return The name of the partner that is authorized to send data.
     */

    public String getPartnerName() {
        return this.partnerName;
    }

    /**
     * <p>
     * The name of the partner that is authorized to send data.
     * </p>
     * 
     * @param partnerName
     *        The name of the partner that is authorized to send data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPartnerRequest withPartnerName(String partnerName) {
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

        if (obj instanceof AddPartnerRequest == false)
            return false;
        AddPartnerRequest other = (AddPartnerRequest) obj;
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
    public AddPartnerRequest clone() {
        return (AddPartnerRequest) super.clone();
    }

}
