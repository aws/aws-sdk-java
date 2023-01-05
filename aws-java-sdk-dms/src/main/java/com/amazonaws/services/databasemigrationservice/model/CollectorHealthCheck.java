/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the last Fleet Advisor collector health check.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CollectorHealthCheck" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollectorHealthCheck implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the Fleet Advisor collector.
     * </p>
     */
    private String collectorStatus;
    /**
     * <p>
     * Whether the local collector can access its Amazon S3 bucket.
     * </p>
     */
    private Boolean localCollectorS3Access;
    /**
     * <p>
     * Whether the web collector can access its Amazon S3 bucket.
     * </p>
     */
    private Boolean webCollectorS3Access;
    /**
     * <p>
     * Whether the role that you provided when creating the Fleet Advisor collector has sufficient permissions to access
     * the Fleet Advisor web collector.
     * </p>
     */
    private Boolean webCollectorGrantedRoleBasedAccess;

    /**
     * <p>
     * The status of the Fleet Advisor collector.
     * </p>
     * 
     * @param collectorStatus
     *        The status of the Fleet Advisor collector.
     * @see CollectorStatus
     */

    public void setCollectorStatus(String collectorStatus) {
        this.collectorStatus = collectorStatus;
    }

    /**
     * <p>
     * The status of the Fleet Advisor collector.
     * </p>
     * 
     * @return The status of the Fleet Advisor collector.
     * @see CollectorStatus
     */

    public String getCollectorStatus() {
        return this.collectorStatus;
    }

    /**
     * <p>
     * The status of the Fleet Advisor collector.
     * </p>
     * 
     * @param collectorStatus
     *        The status of the Fleet Advisor collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectorStatus
     */

    public CollectorHealthCheck withCollectorStatus(String collectorStatus) {
        setCollectorStatus(collectorStatus);
        return this;
    }

    /**
     * <p>
     * The status of the Fleet Advisor collector.
     * </p>
     * 
     * @param collectorStatus
     *        The status of the Fleet Advisor collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectorStatus
     */

    public CollectorHealthCheck withCollectorStatus(CollectorStatus collectorStatus) {
        this.collectorStatus = collectorStatus.toString();
        return this;
    }

    /**
     * <p>
     * Whether the local collector can access its Amazon S3 bucket.
     * </p>
     * 
     * @param localCollectorS3Access
     *        Whether the local collector can access its Amazon S3 bucket.
     */

    public void setLocalCollectorS3Access(Boolean localCollectorS3Access) {
        this.localCollectorS3Access = localCollectorS3Access;
    }

    /**
     * <p>
     * Whether the local collector can access its Amazon S3 bucket.
     * </p>
     * 
     * @return Whether the local collector can access its Amazon S3 bucket.
     */

    public Boolean getLocalCollectorS3Access() {
        return this.localCollectorS3Access;
    }

    /**
     * <p>
     * Whether the local collector can access its Amazon S3 bucket.
     * </p>
     * 
     * @param localCollectorS3Access
     *        Whether the local collector can access its Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorHealthCheck withLocalCollectorS3Access(Boolean localCollectorS3Access) {
        setLocalCollectorS3Access(localCollectorS3Access);
        return this;
    }

    /**
     * <p>
     * Whether the local collector can access its Amazon S3 bucket.
     * </p>
     * 
     * @return Whether the local collector can access its Amazon S3 bucket.
     */

    public Boolean isLocalCollectorS3Access() {
        return this.localCollectorS3Access;
    }

    /**
     * <p>
     * Whether the web collector can access its Amazon S3 bucket.
     * </p>
     * 
     * @param webCollectorS3Access
     *        Whether the web collector can access its Amazon S3 bucket.
     */

    public void setWebCollectorS3Access(Boolean webCollectorS3Access) {
        this.webCollectorS3Access = webCollectorS3Access;
    }

    /**
     * <p>
     * Whether the web collector can access its Amazon S3 bucket.
     * </p>
     * 
     * @return Whether the web collector can access its Amazon S3 bucket.
     */

    public Boolean getWebCollectorS3Access() {
        return this.webCollectorS3Access;
    }

    /**
     * <p>
     * Whether the web collector can access its Amazon S3 bucket.
     * </p>
     * 
     * @param webCollectorS3Access
     *        Whether the web collector can access its Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorHealthCheck withWebCollectorS3Access(Boolean webCollectorS3Access) {
        setWebCollectorS3Access(webCollectorS3Access);
        return this;
    }

    /**
     * <p>
     * Whether the web collector can access its Amazon S3 bucket.
     * </p>
     * 
     * @return Whether the web collector can access its Amazon S3 bucket.
     */

    public Boolean isWebCollectorS3Access() {
        return this.webCollectorS3Access;
    }

    /**
     * <p>
     * Whether the role that you provided when creating the Fleet Advisor collector has sufficient permissions to access
     * the Fleet Advisor web collector.
     * </p>
     * 
     * @param webCollectorGrantedRoleBasedAccess
     *        Whether the role that you provided when creating the Fleet Advisor collector has sufficient permissions to
     *        access the Fleet Advisor web collector.
     */

    public void setWebCollectorGrantedRoleBasedAccess(Boolean webCollectorGrantedRoleBasedAccess) {
        this.webCollectorGrantedRoleBasedAccess = webCollectorGrantedRoleBasedAccess;
    }

    /**
     * <p>
     * Whether the role that you provided when creating the Fleet Advisor collector has sufficient permissions to access
     * the Fleet Advisor web collector.
     * </p>
     * 
     * @return Whether the role that you provided when creating the Fleet Advisor collector has sufficient permissions
     *         to access the Fleet Advisor web collector.
     */

    public Boolean getWebCollectorGrantedRoleBasedAccess() {
        return this.webCollectorGrantedRoleBasedAccess;
    }

    /**
     * <p>
     * Whether the role that you provided when creating the Fleet Advisor collector has sufficient permissions to access
     * the Fleet Advisor web collector.
     * </p>
     * 
     * @param webCollectorGrantedRoleBasedAccess
     *        Whether the role that you provided when creating the Fleet Advisor collector has sufficient permissions to
     *        access the Fleet Advisor web collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorHealthCheck withWebCollectorGrantedRoleBasedAccess(Boolean webCollectorGrantedRoleBasedAccess) {
        setWebCollectorGrantedRoleBasedAccess(webCollectorGrantedRoleBasedAccess);
        return this;
    }

    /**
     * <p>
     * Whether the role that you provided when creating the Fleet Advisor collector has sufficient permissions to access
     * the Fleet Advisor web collector.
     * </p>
     * 
     * @return Whether the role that you provided when creating the Fleet Advisor collector has sufficient permissions
     *         to access the Fleet Advisor web collector.
     */

    public Boolean isWebCollectorGrantedRoleBasedAccess() {
        return this.webCollectorGrantedRoleBasedAccess;
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
        if (getCollectorStatus() != null)
            sb.append("CollectorStatus: ").append(getCollectorStatus()).append(",");
        if (getLocalCollectorS3Access() != null)
            sb.append("LocalCollectorS3Access: ").append(getLocalCollectorS3Access()).append(",");
        if (getWebCollectorS3Access() != null)
            sb.append("WebCollectorS3Access: ").append(getWebCollectorS3Access()).append(",");
        if (getWebCollectorGrantedRoleBasedAccess() != null)
            sb.append("WebCollectorGrantedRoleBasedAccess: ").append(getWebCollectorGrantedRoleBasedAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollectorHealthCheck == false)
            return false;
        CollectorHealthCheck other = (CollectorHealthCheck) obj;
        if (other.getCollectorStatus() == null ^ this.getCollectorStatus() == null)
            return false;
        if (other.getCollectorStatus() != null && other.getCollectorStatus().equals(this.getCollectorStatus()) == false)
            return false;
        if (other.getLocalCollectorS3Access() == null ^ this.getLocalCollectorS3Access() == null)
            return false;
        if (other.getLocalCollectorS3Access() != null && other.getLocalCollectorS3Access().equals(this.getLocalCollectorS3Access()) == false)
            return false;
        if (other.getWebCollectorS3Access() == null ^ this.getWebCollectorS3Access() == null)
            return false;
        if (other.getWebCollectorS3Access() != null && other.getWebCollectorS3Access().equals(this.getWebCollectorS3Access()) == false)
            return false;
        if (other.getWebCollectorGrantedRoleBasedAccess() == null ^ this.getWebCollectorGrantedRoleBasedAccess() == null)
            return false;
        if (other.getWebCollectorGrantedRoleBasedAccess() != null
                && other.getWebCollectorGrantedRoleBasedAccess().equals(this.getWebCollectorGrantedRoleBasedAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectorStatus() == null) ? 0 : getCollectorStatus().hashCode());
        hashCode = prime * hashCode + ((getLocalCollectorS3Access() == null) ? 0 : getLocalCollectorS3Access().hashCode());
        hashCode = prime * hashCode + ((getWebCollectorS3Access() == null) ? 0 : getWebCollectorS3Access().hashCode());
        hashCode = prime * hashCode + ((getWebCollectorGrantedRoleBasedAccess() == null) ? 0 : getWebCollectorGrantedRoleBasedAccess().hashCode());
        return hashCode;
    }

    @Override
    public CollectorHealthCheck clone() {
        try {
            return (CollectorHealthCheck) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.CollectorHealthCheckMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
