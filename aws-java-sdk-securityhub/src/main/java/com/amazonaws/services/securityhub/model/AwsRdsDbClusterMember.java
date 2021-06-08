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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an instance in the DB cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbClusterMember" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbClusterMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the cluster member is the primary instance for the DB cluster.
     * </p>
     */
    private Boolean isClusterWriter;
    /**
     * <p>
     * Specifies the order in which an Aurora replica is promoted to the primary instance when the existing primary
     * instance fails.
     * </p>
     */
    private Integer promotionTier;
    /**
     * <p>
     * The instance identifier for this member of the DB cluster.
     * </p>
     */
    private String dbInstanceIdentifier;
    /**
     * <p>
     * The status of the DB cluster parameter group for this member of the DB cluster.
     * </p>
     */
    private String dbClusterParameterGroupStatus;

    /**
     * <p>
     * Whether the cluster member is the primary instance for the DB cluster.
     * </p>
     * 
     * @param isClusterWriter
     *        Whether the cluster member is the primary instance for the DB cluster.
     */

    public void setIsClusterWriter(Boolean isClusterWriter) {
        this.isClusterWriter = isClusterWriter;
    }

    /**
     * <p>
     * Whether the cluster member is the primary instance for the DB cluster.
     * </p>
     * 
     * @return Whether the cluster member is the primary instance for the DB cluster.
     */

    public Boolean getIsClusterWriter() {
        return this.isClusterWriter;
    }

    /**
     * <p>
     * Whether the cluster member is the primary instance for the DB cluster.
     * </p>
     * 
     * @param isClusterWriter
     *        Whether the cluster member is the primary instance for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterMember withIsClusterWriter(Boolean isClusterWriter) {
        setIsClusterWriter(isClusterWriter);
        return this;
    }

    /**
     * <p>
     * Whether the cluster member is the primary instance for the DB cluster.
     * </p>
     * 
     * @return Whether the cluster member is the primary instance for the DB cluster.
     */

    public Boolean isClusterWriter() {
        return this.isClusterWriter;
    }

    /**
     * <p>
     * Specifies the order in which an Aurora replica is promoted to the primary instance when the existing primary
     * instance fails.
     * </p>
     * 
     * @param promotionTier
     *        Specifies the order in which an Aurora replica is promoted to the primary instance when the existing
     *        primary instance fails.
     */

    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }

    /**
     * <p>
     * Specifies the order in which an Aurora replica is promoted to the primary instance when the existing primary
     * instance fails.
     * </p>
     * 
     * @return Specifies the order in which an Aurora replica is promoted to the primary instance when the existing
     *         primary instance fails.
     */

    public Integer getPromotionTier() {
        return this.promotionTier;
    }

    /**
     * <p>
     * Specifies the order in which an Aurora replica is promoted to the primary instance when the existing primary
     * instance fails.
     * </p>
     * 
     * @param promotionTier
     *        Specifies the order in which an Aurora replica is promoted to the primary instance when the existing
     *        primary instance fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterMember withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
        return this;
    }

    /**
     * <p>
     * The instance identifier for this member of the DB cluster.
     * </p>
     * 
     * @param dbInstanceIdentifier
     *        The instance identifier for this member of the DB cluster.
     */

    public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
        this.dbInstanceIdentifier = dbInstanceIdentifier;
    }

    /**
     * <p>
     * The instance identifier for this member of the DB cluster.
     * </p>
     * 
     * @return The instance identifier for this member of the DB cluster.
     */

    public String getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }

    /**
     * <p>
     * The instance identifier for this member of the DB cluster.
     * </p>
     * 
     * @param dbInstanceIdentifier
     *        The instance identifier for this member of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterMember withDbInstanceIdentifier(String dbInstanceIdentifier) {
        setDbInstanceIdentifier(dbInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The status of the DB cluster parameter group for this member of the DB cluster.
     * </p>
     * 
     * @param dbClusterParameterGroupStatus
     *        The status of the DB cluster parameter group for this member of the DB cluster.
     */

    public void setDbClusterParameterGroupStatus(String dbClusterParameterGroupStatus) {
        this.dbClusterParameterGroupStatus = dbClusterParameterGroupStatus;
    }

    /**
     * <p>
     * The status of the DB cluster parameter group for this member of the DB cluster.
     * </p>
     * 
     * @return The status of the DB cluster parameter group for this member of the DB cluster.
     */

    public String getDbClusterParameterGroupStatus() {
        return this.dbClusterParameterGroupStatus;
    }

    /**
     * <p>
     * The status of the DB cluster parameter group for this member of the DB cluster.
     * </p>
     * 
     * @param dbClusterParameterGroupStatus
     *        The status of the DB cluster parameter group for this member of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterMember withDbClusterParameterGroupStatus(String dbClusterParameterGroupStatus) {
        setDbClusterParameterGroupStatus(dbClusterParameterGroupStatus);
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
        if (getIsClusterWriter() != null)
            sb.append("IsClusterWriter: ").append(getIsClusterWriter()).append(",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier()).append(",");
        if (getDbInstanceIdentifier() != null)
            sb.append("DbInstanceIdentifier: ").append(getDbInstanceIdentifier()).append(",");
        if (getDbClusterParameterGroupStatus() != null)
            sb.append("DbClusterParameterGroupStatus: ").append(getDbClusterParameterGroupStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbClusterMember == false)
            return false;
        AwsRdsDbClusterMember other = (AwsRdsDbClusterMember) obj;
        if (other.getIsClusterWriter() == null ^ this.getIsClusterWriter() == null)
            return false;
        if (other.getIsClusterWriter() != null && other.getIsClusterWriter().equals(this.getIsClusterWriter()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        if (other.getDbInstanceIdentifier() == null ^ this.getDbInstanceIdentifier() == null)
            return false;
        if (other.getDbInstanceIdentifier() != null && other.getDbInstanceIdentifier().equals(this.getDbInstanceIdentifier()) == false)
            return false;
        if (other.getDbClusterParameterGroupStatus() == null ^ this.getDbClusterParameterGroupStatus() == null)
            return false;
        if (other.getDbClusterParameterGroupStatus() != null
                && other.getDbClusterParameterGroupStatus().equals(this.getDbClusterParameterGroupStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsClusterWriter() == null) ? 0 : getIsClusterWriter().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        hashCode = prime * hashCode + ((getDbInstanceIdentifier() == null) ? 0 : getDbInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDbClusterParameterGroupStatus() == null) ? 0 : getDbClusterParameterGroupStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbClusterMember clone() {
        try {
            return (AwsRdsDbClusterMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbClusterMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
