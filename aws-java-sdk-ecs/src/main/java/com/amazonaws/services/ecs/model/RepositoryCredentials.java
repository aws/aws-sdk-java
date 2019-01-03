/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The repository credentials for private registry authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RepositoryCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret containing the private repository credentials.
     * </p>
     * <note>
     * <p>
     * When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret exists in the same Region as the task
     * that you are launching then you can use either the full ARN or the name of the secret. When you are using the AWS
     * Management Console, you must specify the full ARN of the secret.
     * </p>
     * </note>
     */
    private String credentialsParameter;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret containing the private repository credentials.
     * </p>
     * <note>
     * <p>
     * When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret exists in the same Region as the task
     * that you are launching then you can use either the full ARN or the name of the secret. When you are using the AWS
     * Management Console, you must specify the full ARN of the secret.
     * </p>
     * </note>
     * 
     * @param credentialsParameter
     *        The Amazon Resource Name (ARN) of the secret containing the private repository credentials.</p> <note>
     *        <p>
     *        When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret exists in the same Region as the
     *        task that you are launching then you can use either the full ARN or the name of the secret. When you are
     *        using the AWS Management Console, you must specify the full ARN of the secret.
     *        </p>
     */

    public void setCredentialsParameter(String credentialsParameter) {
        this.credentialsParameter = credentialsParameter;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret containing the private repository credentials.
     * </p>
     * <note>
     * <p>
     * When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret exists in the same Region as the task
     * that you are launching then you can use either the full ARN or the name of the secret. When you are using the AWS
     * Management Console, you must specify the full ARN of the secret.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the secret containing the private repository credentials.</p> <note>
     *         <p>
     *         When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret exists in the same Region as
     *         the task that you are launching then you can use either the full ARN or the name of the secret. When you
     *         are using the AWS Management Console, you must specify the full ARN of the secret.
     *         </p>
     */

    public String getCredentialsParameter() {
        return this.credentialsParameter;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret containing the private repository credentials.
     * </p>
     * <note>
     * <p>
     * When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret exists in the same Region as the task
     * that you are launching then you can use either the full ARN or the name of the secret. When you are using the AWS
     * Management Console, you must specify the full ARN of the secret.
     * </p>
     * </note>
     * 
     * @param credentialsParameter
     *        The Amazon Resource Name (ARN) of the secret containing the private repository credentials.</p> <note>
     *        <p>
     *        When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret exists in the same Region as the
     *        task that you are launching then you can use either the full ARN or the name of the secret. When you are
     *        using the AWS Management Console, you must specify the full ARN of the secret.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCredentials withCredentialsParameter(String credentialsParameter) {
        setCredentialsParameter(credentialsParameter);
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
        if (getCredentialsParameter() != null)
            sb.append("CredentialsParameter: ").append(getCredentialsParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryCredentials == false)
            return false;
        RepositoryCredentials other = (RepositoryCredentials) obj;
        if (other.getCredentialsParameter() == null ^ this.getCredentialsParameter() == null)
            return false;
        if (other.getCredentialsParameter() != null && other.getCredentialsParameter().equals(this.getCredentialsParameter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentialsParameter() == null) ? 0 : getCredentialsParameter().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryCredentials clone() {
        try {
            return (RepositoryCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.RepositoryCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
