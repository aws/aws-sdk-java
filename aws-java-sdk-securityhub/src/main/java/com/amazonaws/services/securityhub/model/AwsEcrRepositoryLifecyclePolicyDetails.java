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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the lifecycle policy for the repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcrRepositoryLifecyclePolicyDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcrRepositoryLifecyclePolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text of the lifecycle policy.
     * </p>
     */
    private String lifecyclePolicyText;
    /**
     * <p>
     * The Amazon Web Services account identifier that is associated with the registry that contains the repository.
     * </p>
     */
    private String registryId;

    /**
     * <p>
     * The text of the lifecycle policy.
     * </p>
     * 
     * @param lifecyclePolicyText
     *        The text of the lifecycle policy.
     */

    public void setLifecyclePolicyText(String lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
    }

    /**
     * <p>
     * The text of the lifecycle policy.
     * </p>
     * 
     * @return The text of the lifecycle policy.
     */

    public String getLifecyclePolicyText() {
        return this.lifecyclePolicyText;
    }

    /**
     * <p>
     * The text of the lifecycle policy.
     * </p>
     * 
     * @param lifecyclePolicyText
     *        The text of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrRepositoryLifecyclePolicyDetails withLifecyclePolicyText(String lifecyclePolicyText) {
        setLifecyclePolicyText(lifecyclePolicyText);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier that is associated with the registry that contains the repository.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account identifier that is associated with the registry that contains the
     *        repository.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier that is associated with the registry that contains the repository.
     * </p>
     * 
     * @return The Amazon Web Services account identifier that is associated with the registry that contains the
     *         repository.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier that is associated with the registry that contains the repository.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account identifier that is associated with the registry that contains the
     *        repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrRepositoryLifecyclePolicyDetails withRegistryId(String registryId) {
        setRegistryId(registryId);
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
        if (getLifecyclePolicyText() != null)
            sb.append("LifecyclePolicyText: ").append(getLifecyclePolicyText()).append(",");
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcrRepositoryLifecyclePolicyDetails == false)
            return false;
        AwsEcrRepositoryLifecyclePolicyDetails other = (AwsEcrRepositoryLifecyclePolicyDetails) obj;
        if (other.getLifecyclePolicyText() == null ^ this.getLifecyclePolicyText() == null)
            return false;
        if (other.getLifecyclePolicyText() != null && other.getLifecyclePolicyText().equals(this.getLifecyclePolicyText()) == false)
            return false;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecyclePolicyText() == null) ? 0 : getLifecyclePolicyText().hashCode());
        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcrRepositoryLifecyclePolicyDetails clone() {
        try {
            return (AwsEcrRepositoryLifecyclePolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcrRepositoryLifecyclePolicyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
