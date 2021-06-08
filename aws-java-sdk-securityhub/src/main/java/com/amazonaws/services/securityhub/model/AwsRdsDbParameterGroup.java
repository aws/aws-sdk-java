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
 * Provides information about a parameter group for a DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbParameterGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbParameterGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     */
    private String dbParameterGroupName;
    /**
     * <p>
     * The status of parameter updates.
     * </p>
     */
    private String parameterApplyStatus;

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @param dbParameterGroupName
     *        The name of the parameter group.
     */

    public void setDbParameterGroupName(String dbParameterGroupName) {
        this.dbParameterGroupName = dbParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @return The name of the parameter group.
     */

    public String getDbParameterGroupName() {
        return this.dbParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @param dbParameterGroupName
     *        The name of the parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbParameterGroup withDbParameterGroupName(String dbParameterGroupName) {
        setDbParameterGroupName(dbParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates.
     */

    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @return The status of parameter updates.
     */

    public String getParameterApplyStatus() {
        return this.parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbParameterGroup withParameterApplyStatus(String parameterApplyStatus) {
        setParameterApplyStatus(parameterApplyStatus);
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
        if (getDbParameterGroupName() != null)
            sb.append("DbParameterGroupName: ").append(getDbParameterGroupName()).append(",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: ").append(getParameterApplyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbParameterGroup == false)
            return false;
        AwsRdsDbParameterGroup other = (AwsRdsDbParameterGroup) obj;
        if (other.getDbParameterGroupName() == null ^ this.getDbParameterGroupName() == null)
            return false;
        if (other.getDbParameterGroupName() != null && other.getDbParameterGroupName().equals(this.getDbParameterGroupName()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbParameterGroupName() == null) ? 0 : getDbParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbParameterGroup clone() {
        try {
            return (AwsRdsDbParameterGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbParameterGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
