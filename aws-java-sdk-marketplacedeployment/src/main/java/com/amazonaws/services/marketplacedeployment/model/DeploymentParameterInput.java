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
package com.amazonaws.services.marketplacedeployment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The shape containing the requested deployment parameter name and secretString.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/DeploymentParameterInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentParameterInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The desired name of the deployment parameter. This is the identifier on which deployment parameters are keyed for
     * a given buyer and product. If this name matches an existing deployment parameter, this request will update the
     * existing resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The text to encrypt and store in the secret.
     * </p>
     */
    private String secretString;

    /**
     * <p>
     * The desired name of the deployment parameter. This is the identifier on which deployment parameters are keyed for
     * a given buyer and product. If this name matches an existing deployment parameter, this request will update the
     * existing resource.
     * </p>
     * 
     * @param name
     *        The desired name of the deployment parameter. This is the identifier on which deployment parameters are
     *        keyed for a given buyer and product. If this name matches an existing deployment parameter, this request
     *        will update the existing resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The desired name of the deployment parameter. This is the identifier on which deployment parameters are keyed for
     * a given buyer and product. If this name matches an existing deployment parameter, this request will update the
     * existing resource.
     * </p>
     * 
     * @return The desired name of the deployment parameter. This is the identifier on which deployment parameters are
     *         keyed for a given buyer and product. If this name matches an existing deployment parameter, this request
     *         will update the existing resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The desired name of the deployment parameter. This is the identifier on which deployment parameters are keyed for
     * a given buyer and product. If this name matches an existing deployment parameter, this request will update the
     * existing resource.
     * </p>
     * 
     * @param name
     *        The desired name of the deployment parameter. This is the identifier on which deployment parameters are
     *        keyed for a given buyer and product. If this name matches an existing deployment parameter, this request
     *        will update the existing resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentParameterInput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The text to encrypt and store in the secret.
     * </p>
     * 
     * @param secretString
     *        The text to encrypt and store in the secret.
     */

    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    /**
     * <p>
     * The text to encrypt and store in the secret.
     * </p>
     * 
     * @return The text to encrypt and store in the secret.
     */

    public String getSecretString() {
        return this.secretString;
    }

    /**
     * <p>
     * The text to encrypt and store in the secret.
     * </p>
     * 
     * @param secretString
     *        The text to encrypt and store in the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentParameterInput withSecretString(String secretString) {
        setSecretString(secretString);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSecretString() != null)
            sb.append("SecretString: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentParameterInput == false)
            return false;
        DeploymentParameterInput other = (DeploymentParameterInput) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSecretString() == null ^ this.getSecretString() == null)
            return false;
        if (other.getSecretString() != null && other.getSecretString().equals(this.getSecretString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecretString() == null) ? 0 : getSecretString().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentParameterInput clone() {
        try {
            return (DeploymentParameterInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacedeployment.model.transform.DeploymentParameterInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
