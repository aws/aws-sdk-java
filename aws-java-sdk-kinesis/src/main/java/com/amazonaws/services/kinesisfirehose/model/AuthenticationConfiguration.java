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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authentication configuration of the Amazon MSK cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/AuthenticationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the role used to access the Amazon MSK cluster.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The type of connectivity used to access the Amazon MSK cluster.
     * </p>
     */
    private String connectivity;

    /**
     * <p>
     * The ARN of the role used to access the Amazon MSK cluster.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the role used to access the Amazon MSK cluster.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the role used to access the Amazon MSK cluster.
     * </p>
     * 
     * @return The ARN of the role used to access the Amazon MSK cluster.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the role used to access the Amazon MSK cluster.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the role used to access the Amazon MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfiguration withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The type of connectivity used to access the Amazon MSK cluster.
     * </p>
     * 
     * @param connectivity
     *        The type of connectivity used to access the Amazon MSK cluster.
     * @see Connectivity
     */

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    /**
     * <p>
     * The type of connectivity used to access the Amazon MSK cluster.
     * </p>
     * 
     * @return The type of connectivity used to access the Amazon MSK cluster.
     * @see Connectivity
     */

    public String getConnectivity() {
        return this.connectivity;
    }

    /**
     * <p>
     * The type of connectivity used to access the Amazon MSK cluster.
     * </p>
     * 
     * @param connectivity
     *        The type of connectivity used to access the Amazon MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Connectivity
     */

    public AuthenticationConfiguration withConnectivity(String connectivity) {
        setConnectivity(connectivity);
        return this;
    }

    /**
     * <p>
     * The type of connectivity used to access the Amazon MSK cluster.
     * </p>
     * 
     * @param connectivity
     *        The type of connectivity used to access the Amazon MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Connectivity
     */

    public AuthenticationConfiguration withConnectivity(Connectivity connectivity) {
        this.connectivity = connectivity.toString();
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
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getConnectivity() != null)
            sb.append("Connectivity: ").append(getConnectivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationConfiguration == false)
            return false;
        AuthenticationConfiguration other = (AuthenticationConfiguration) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getConnectivity() == null ^ this.getConnectivity() == null)
            return false;
        if (other.getConnectivity() != null && other.getConnectivity().equals(this.getConnectivity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getConnectivity() == null) ? 0 : getConnectivity().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationConfiguration clone() {
        try {
            return (AuthenticationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.AuthenticationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
