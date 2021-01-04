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
 * Information about an option group membership for a DB cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbClusterOptionGroupMembership"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbClusterOptionGroupMembership implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the DB cluster option group.
     * </p>
     */
    private String dbClusterOptionGroupName;
    /**
     * <p>
     * The status of the DB cluster option group.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the DB cluster option group.
     * </p>
     * 
     * @param dbClusterOptionGroupName
     *        The name of the DB cluster option group.
     */

    public void setDbClusterOptionGroupName(String dbClusterOptionGroupName) {
        this.dbClusterOptionGroupName = dbClusterOptionGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster option group.
     * </p>
     * 
     * @return The name of the DB cluster option group.
     */

    public String getDbClusterOptionGroupName() {
        return this.dbClusterOptionGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster option group.
     * </p>
     * 
     * @param dbClusterOptionGroupName
     *        The name of the DB cluster option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterOptionGroupMembership withDbClusterOptionGroupName(String dbClusterOptionGroupName) {
        setDbClusterOptionGroupName(dbClusterOptionGroupName);
        return this;
    }

    /**
     * <p>
     * The status of the DB cluster option group.
     * </p>
     * 
     * @param status
     *        The status of the DB cluster option group.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the DB cluster option group.
     * </p>
     * 
     * @return The status of the DB cluster option group.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the DB cluster option group.
     * </p>
     * 
     * @param status
     *        The status of the DB cluster option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterOptionGroupMembership withStatus(String status) {
        setStatus(status);
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
        if (getDbClusterOptionGroupName() != null)
            sb.append("DbClusterOptionGroupName: ").append(getDbClusterOptionGroupName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbClusterOptionGroupMembership == false)
            return false;
        AwsRdsDbClusterOptionGroupMembership other = (AwsRdsDbClusterOptionGroupMembership) obj;
        if (other.getDbClusterOptionGroupName() == null ^ this.getDbClusterOptionGroupName() == null)
            return false;
        if (other.getDbClusterOptionGroupName() != null && other.getDbClusterOptionGroupName().equals(this.getDbClusterOptionGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbClusterOptionGroupName() == null) ? 0 : getDbClusterOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbClusterOptionGroupMembership clone() {
        try {
            return (AwsRdsDbClusterOptionGroupMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbClusterOptionGroupMembershipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
