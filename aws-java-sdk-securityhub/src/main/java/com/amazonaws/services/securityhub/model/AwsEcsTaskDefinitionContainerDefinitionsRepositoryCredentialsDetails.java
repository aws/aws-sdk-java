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
 * The private repository authentication credentials to use.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the secret that contains the private repository credentials.
     * </p>
     */
    private String credentialsParameter;

    /**
     * <p>
     * The ARN of the secret that contains the private repository credentials.
     * </p>
     * 
     * @param credentialsParameter
     *        The ARN of the secret that contains the private repository credentials.
     */

    public void setCredentialsParameter(String credentialsParameter) {
        this.credentialsParameter = credentialsParameter;
    }

    /**
     * <p>
     * The ARN of the secret that contains the private repository credentials.
     * </p>
     * 
     * @return The ARN of the secret that contains the private repository credentials.
     */

    public String getCredentialsParameter() {
        return this.credentialsParameter;
    }

    /**
     * <p>
     * The ARN of the secret that contains the private repository credentials.
     * </p>
     * 
     * @param credentialsParameter
     *        The ARN of the secret that contains the private repository credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails withCredentialsParameter(String credentialsParameter) {
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

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails other = (AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails) obj;
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
    public AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
