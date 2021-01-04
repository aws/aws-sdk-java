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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the account level permissions on the S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AccountLevelPermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountLevelPermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the S3 Block Public Access settings of the bucket's parent account.
     * </p>
     */
    private BlockPublicAccess blockPublicAccess;

    /**
     * <p>
     * Describes the S3 Block Public Access settings of the bucket's parent account.
     * </p>
     * 
     * @param blockPublicAccess
     *        Describes the S3 Block Public Access settings of the bucket's parent account.
     */

    public void setBlockPublicAccess(BlockPublicAccess blockPublicAccess) {
        this.blockPublicAccess = blockPublicAccess;
    }

    /**
     * <p>
     * Describes the S3 Block Public Access settings of the bucket's parent account.
     * </p>
     * 
     * @return Describes the S3 Block Public Access settings of the bucket's parent account.
     */

    public BlockPublicAccess getBlockPublicAccess() {
        return this.blockPublicAccess;
    }

    /**
     * <p>
     * Describes the S3 Block Public Access settings of the bucket's parent account.
     * </p>
     * 
     * @param blockPublicAccess
     *        Describes the S3 Block Public Access settings of the bucket's parent account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLevelPermissions withBlockPublicAccess(BlockPublicAccess blockPublicAccess) {
        setBlockPublicAccess(blockPublicAccess);
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
        if (getBlockPublicAccess() != null)
            sb.append("BlockPublicAccess: ").append(getBlockPublicAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountLevelPermissions == false)
            return false;
        AccountLevelPermissions other = (AccountLevelPermissions) obj;
        if (other.getBlockPublicAccess() == null ^ this.getBlockPublicAccess() == null)
            return false;
        if (other.getBlockPublicAccess() != null && other.getBlockPublicAccess().equals(this.getBlockPublicAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockPublicAccess() == null) ? 0 : getBlockPublicAccess().hashCode());
        return hashCode;
    }

    @Override
    public AccountLevelPermissions clone() {
        try {
            return (AccountLevelPermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.AccountLevelPermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
