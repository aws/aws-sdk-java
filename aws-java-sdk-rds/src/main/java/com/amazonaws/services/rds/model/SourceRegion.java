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

/**
 * <p>
 * Contains an Amazon Web Services Region name as the result of a successful call to the
 * <code>DescribeSourceRegions</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/SourceRegion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceRegion implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the source Amazon Web Services Region.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The endpoint for the source Amazon Web Services Region endpoint.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The status of the source Amazon Web Services Region.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Whether the source Amazon Web Services Region supports replicating automated backups to the current Amazon Web
     * Services Region.
     * </p>
     */
    private Boolean supportsDBInstanceAutomatedBackupsReplication;

    /**
     * <p>
     * The name of the source Amazon Web Services Region.
     * </p>
     * 
     * @param regionName
     *        The name of the source Amazon Web Services Region.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the source Amazon Web Services Region.
     * </p>
     * 
     * @return The name of the source Amazon Web Services Region.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The name of the source Amazon Web Services Region.
     * </p>
     * 
     * @param regionName
     *        The name of the source Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRegion withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The endpoint for the source Amazon Web Services Region endpoint.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for the source Amazon Web Services Region endpoint.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint for the source Amazon Web Services Region endpoint.
     * </p>
     * 
     * @return The endpoint for the source Amazon Web Services Region endpoint.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint for the source Amazon Web Services Region endpoint.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for the source Amazon Web Services Region endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRegion withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The status of the source Amazon Web Services Region.
     * </p>
     * 
     * @param status
     *        The status of the source Amazon Web Services Region.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the source Amazon Web Services Region.
     * </p>
     * 
     * @return The status of the source Amazon Web Services Region.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the source Amazon Web Services Region.
     * </p>
     * 
     * @param status
     *        The status of the source Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRegion withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Whether the source Amazon Web Services Region supports replicating automated backups to the current Amazon Web
     * Services Region.
     * </p>
     * 
     * @param supportsDBInstanceAutomatedBackupsReplication
     *        Whether the source Amazon Web Services Region supports replicating automated backups to the current Amazon
     *        Web Services Region.
     */

    public void setSupportsDBInstanceAutomatedBackupsReplication(Boolean supportsDBInstanceAutomatedBackupsReplication) {
        this.supportsDBInstanceAutomatedBackupsReplication = supportsDBInstanceAutomatedBackupsReplication;
    }

    /**
     * <p>
     * Whether the source Amazon Web Services Region supports replicating automated backups to the current Amazon Web
     * Services Region.
     * </p>
     * 
     * @return Whether the source Amazon Web Services Region supports replicating automated backups to the current
     *         Amazon Web Services Region.
     */

    public Boolean getSupportsDBInstanceAutomatedBackupsReplication() {
        return this.supportsDBInstanceAutomatedBackupsReplication;
    }

    /**
     * <p>
     * Whether the source Amazon Web Services Region supports replicating automated backups to the current Amazon Web
     * Services Region.
     * </p>
     * 
     * @param supportsDBInstanceAutomatedBackupsReplication
     *        Whether the source Amazon Web Services Region supports replicating automated backups to the current Amazon
     *        Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRegion withSupportsDBInstanceAutomatedBackupsReplication(Boolean supportsDBInstanceAutomatedBackupsReplication) {
        setSupportsDBInstanceAutomatedBackupsReplication(supportsDBInstanceAutomatedBackupsReplication);
        return this;
    }

    /**
     * <p>
     * Whether the source Amazon Web Services Region supports replicating automated backups to the current Amazon Web
     * Services Region.
     * </p>
     * 
     * @return Whether the source Amazon Web Services Region supports replicating automated backups to the current
     *         Amazon Web Services Region.
     */

    public Boolean isSupportsDBInstanceAutomatedBackupsReplication() {
        return this.supportsDBInstanceAutomatedBackupsReplication;
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
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSupportsDBInstanceAutomatedBackupsReplication() != null)
            sb.append("SupportsDBInstanceAutomatedBackupsReplication: ").append(getSupportsDBInstanceAutomatedBackupsReplication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceRegion == false)
            return false;
        SourceRegion other = (SourceRegion) obj;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSupportsDBInstanceAutomatedBackupsReplication() == null ^ this.getSupportsDBInstanceAutomatedBackupsReplication() == null)
            return false;
        if (other.getSupportsDBInstanceAutomatedBackupsReplication() != null
                && other.getSupportsDBInstanceAutomatedBackupsReplication().equals(this.getSupportsDBInstanceAutomatedBackupsReplication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSupportsDBInstanceAutomatedBackupsReplication() == null) ? 0 : getSupportsDBInstanceAutomatedBackupsReplication().hashCode());
        return hashCode;
    }

    @Override
    public SourceRegion clone() {
        try {
            return (SourceRegion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
