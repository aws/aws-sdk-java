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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes resources needed to authenticate access to some source repositories. The specific resource depends on the
 * repository provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/AuthenticationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner connection that enables the App Runner service to connect to a
     * source repository. It's required for GitHub code repositories.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants the App Runner service access to a source repository.
     * It's required for ECR image repositories (but not for ECR Public repositories).
     * </p>
     */
    private String accessRoleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner connection that enables the App Runner service to connect to a
     * source repository. It's required for GitHub code repositories.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the App Runner connection that enables the App Runner service to connect
     *        to a source repository. It's required for GitHub code repositories.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner connection that enables the App Runner service to connect to a
     * source repository. It's required for GitHub code repositories.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner connection that enables the App Runner service to
     *         connect to a source repository. It's required for GitHub code repositories.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner connection that enables the App Runner service to connect to a
     * source repository. It's required for GitHub code repositories.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the App Runner connection that enables the App Runner service to connect
     *        to a source repository. It's required for GitHub code repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfiguration withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants the App Runner service access to a source repository.
     * It's required for ECR image repositories (but not for ECR Public repositories).
     * </p>
     * 
     * @param accessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants the App Runner service access to a source
     *        repository. It's required for ECR image repositories (but not for ECR Public repositories).
     */

    public void setAccessRoleArn(String accessRoleArn) {
        this.accessRoleArn = accessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants the App Runner service access to a source repository.
     * It's required for ECR image repositories (but not for ECR Public repositories).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that grants the App Runner service access to a source
     *         repository. It's required for ECR image repositories (but not for ECR Public repositories).
     */

    public String getAccessRoleArn() {
        return this.accessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants the App Runner service access to a source repository.
     * It's required for ECR image repositories (but not for ECR Public repositories).
     * </p>
     * 
     * @param accessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants the App Runner service access to a source
     *        repository. It's required for ECR image repositories (but not for ECR Public repositories).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfiguration withAccessRoleArn(String accessRoleArn) {
        setAccessRoleArn(accessRoleArn);
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
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getAccessRoleArn() != null)
            sb.append("AccessRoleArn: ").append(getAccessRoleArn());
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
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getAccessRoleArn() == null ^ this.getAccessRoleArn() == null)
            return false;
        if (other.getAccessRoleArn() != null && other.getAccessRoleArn().equals(this.getAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getAccessRoleArn() == null) ? 0 : getAccessRoleArn().hashCode());
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
        com.amazonaws.services.apprunner.model.transform.AuthenticationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
