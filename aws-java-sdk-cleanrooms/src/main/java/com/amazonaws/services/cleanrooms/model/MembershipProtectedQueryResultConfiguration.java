/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configurations for protected query results.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/MembershipProtectedQueryResultConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MembershipProtectedQueryResultConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration for protected query results.
     * </p>
     */
    private MembershipProtectedQueryOutputConfiguration outputConfiguration;
    /**
     * <p>
     * The unique ARN for an IAM role that is used by Clean Rooms to write protected query results to the result
     * location, given by the member who can receive results.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Configuration for protected query results.
     * </p>
     * 
     * @param outputConfiguration
     *        Configuration for protected query results.
     */

    public void setOutputConfiguration(MembershipProtectedQueryOutputConfiguration outputConfiguration) {
        this.outputConfiguration = outputConfiguration;
    }

    /**
     * <p>
     * Configuration for protected query results.
     * </p>
     * 
     * @return Configuration for protected query results.
     */

    public MembershipProtectedQueryOutputConfiguration getOutputConfiguration() {
        return this.outputConfiguration;
    }

    /**
     * <p>
     * Configuration for protected query results.
     * </p>
     * 
     * @param outputConfiguration
     *        Configuration for protected query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipProtectedQueryResultConfiguration withOutputConfiguration(MembershipProtectedQueryOutputConfiguration outputConfiguration) {
        setOutputConfiguration(outputConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique ARN for an IAM role that is used by Clean Rooms to write protected query results to the result
     * location, given by the member who can receive results.
     * </p>
     * 
     * @param roleArn
     *        The unique ARN for an IAM role that is used by Clean Rooms to write protected query results to the result
     *        location, given by the member who can receive results.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The unique ARN for an IAM role that is used by Clean Rooms to write protected query results to the result
     * location, given by the member who can receive results.
     * </p>
     * 
     * @return The unique ARN for an IAM role that is used by Clean Rooms to write protected query results to the result
     *         location, given by the member who can receive results.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The unique ARN for an IAM role that is used by Clean Rooms to write protected query results to the result
     * location, given by the member who can receive results.
     * </p>
     * 
     * @param roleArn
     *        The unique ARN for an IAM role that is used by Clean Rooms to write protected query results to the result
     *        location, given by the member who can receive results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipProtectedQueryResultConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getOutputConfiguration() != null)
            sb.append("OutputConfiguration: ").append(getOutputConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MembershipProtectedQueryResultConfiguration == false)
            return false;
        MembershipProtectedQueryResultConfiguration other = (MembershipProtectedQueryResultConfiguration) obj;
        if (other.getOutputConfiguration() == null ^ this.getOutputConfiguration() == null)
            return false;
        if (other.getOutputConfiguration() != null && other.getOutputConfiguration().equals(this.getOutputConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputConfiguration() == null) ? 0 : getOutputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public MembershipProtectedQueryResultConfiguration clone() {
        try {
            return (MembershipProtectedQueryResultConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.MembershipProtectedQueryResultConfigurationMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
