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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The proposed access control configuration for an Amazon ECR repository. You can propose a configuration for a new
 * Amazon ECR repository or an existing Amazon ECR repository that you own by specifying the Amazon ECR policy. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_Repository.html">Repository</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the configuration is for an existing Amazon ECR repository and you do not specify the Amazon ECR policy, then the
 * access preview uses the existing Amazon ECR policy for the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the access preview is for a new resource and you do not specify the policy, then the access preview assumes an
 * Amazon ECR repository without a policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * To propose deletion of an existing Amazon ECR repository policy, you can specify an empty string for the Amazon ECR
 * policy.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/EcrRepositoryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcrRepositoryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JSON repository policy text to apply to the Amazon ECR repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html">Private repository
     * policy examples</a> in the <i>Amazon ECR User Guide</i>.
     * </p>
     */
    private String repositoryPolicy;

    /**
     * <p>
     * The JSON repository policy text to apply to the Amazon ECR repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html">Private repository
     * policy examples</a> in the <i>Amazon ECR User Guide</i>.
     * </p>
     * 
     * @param repositoryPolicy
     *        The JSON repository policy text to apply to the Amazon ECR repository. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html">Private
     *        repository policy examples</a> in the <i>Amazon ECR User Guide</i>.
     */

    public void setRepositoryPolicy(String repositoryPolicy) {
        this.repositoryPolicy = repositoryPolicy;
    }

    /**
     * <p>
     * The JSON repository policy text to apply to the Amazon ECR repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html">Private repository
     * policy examples</a> in the <i>Amazon ECR User Guide</i>.
     * </p>
     * 
     * @return The JSON repository policy text to apply to the Amazon ECR repository. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html">Private
     *         repository policy examples</a> in the <i>Amazon ECR User Guide</i>.
     */

    public String getRepositoryPolicy() {
        return this.repositoryPolicy;
    }

    /**
     * <p>
     * The JSON repository policy text to apply to the Amazon ECR repository. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html">Private repository
     * policy examples</a> in the <i>Amazon ECR User Guide</i>.
     * </p>
     * 
     * @param repositoryPolicy
     *        The JSON repository policy text to apply to the Amazon ECR repository. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html">Private
     *        repository policy examples</a> in the <i>Amazon ECR User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcrRepositoryConfiguration withRepositoryPolicy(String repositoryPolicy) {
        setRepositoryPolicy(repositoryPolicy);
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
        if (getRepositoryPolicy() != null)
            sb.append("RepositoryPolicy: ").append(getRepositoryPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcrRepositoryConfiguration == false)
            return false;
        EcrRepositoryConfiguration other = (EcrRepositoryConfiguration) obj;
        if (other.getRepositoryPolicy() == null ^ this.getRepositoryPolicy() == null)
            return false;
        if (other.getRepositoryPolicy() != null && other.getRepositoryPolicy().equals(this.getRepositoryPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryPolicy() == null) ? 0 : getRepositoryPolicy().hashCode());
        return hashCode;
    }

    @Override
    public EcrRepositoryConfiguration clone() {
        try {
            return (EcrRepositoryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.EcrRepositoryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
