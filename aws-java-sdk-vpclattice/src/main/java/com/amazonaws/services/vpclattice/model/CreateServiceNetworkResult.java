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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetwork" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceNetworkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of IAM policy.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The ID of the service network.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the service network.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service network.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service network.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @param authType
     *        The type of IAM policy.
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @return The type of IAM policy.
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @param authType
     *        The type of IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public CreateServiceNetworkResult withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @param authType
     *        The type of IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public CreateServiceNetworkResult withAuthType(AuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the service network.
     * </p>
     * 
     * @param id
     *        The ID of the service network.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the service network.
     * </p>
     * 
     * @return The ID of the service network.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the service network.
     * </p>
     * 
     * @param id
     *        The ID of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the service network.
     * </p>
     * 
     * @param name
     *        The name of the service network.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service network.
     * </p>
     * 
     * @return The name of the service network.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service network.
     * </p>
     * 
     * @param name
     *        The name of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkResult withName(String name) {
        setName(name);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceNetworkResult == false)
            return false;
        CreateServiceNetworkResult other = (CreateServiceNetworkResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceNetworkResult clone() {
        try {
            return (CreateServiceNetworkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
