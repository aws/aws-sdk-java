/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. Currently, the valid
     * provider type is Bitbucket.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The name of the connection to be created. The name must be unique in the calling AWS account.
     * </p>
     */
    private String connectionName;

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. Currently, the valid
     * provider type is Bitbucket.
     * </p>
     * 
     * @param providerType
     *        The name of the external provider where your third-party code repository is configured. Currently, the
     *        valid provider type is Bitbucket.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. Currently, the valid
     * provider type is Bitbucket.
     * </p>
     * 
     * @return The name of the external provider where your third-party code repository is configured. Currently, the
     *         valid provider type is Bitbucket.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. Currently, the valid
     * provider type is Bitbucket.
     * </p>
     * 
     * @param providerType
     *        The name of the external provider where your third-party code repository is configured. Currently, the
     *        valid provider type is Bitbucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public CreateConnectionRequest withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured. Currently, the valid
     * provider type is Bitbucket.
     * </p>
     * 
     * @param providerType
     *        The name of the external provider where your third-party code repository is configured. Currently, the
     *        valid provider type is Bitbucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public CreateConnectionRequest withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the connection to be created. The name must be unique in the calling AWS account.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to be created. The name must be unique in the calling AWS account.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection to be created. The name must be unique in the calling AWS account.
     * </p>
     * 
     * @return The name of the connection to be created. The name must be unique in the calling AWS account.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection to be created. The name must be unique in the calling AWS account.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to be created. The name must be unique in the calling AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withConnectionName(String connectionName) {
        setConnectionName(connectionName);
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
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectionRequest == false)
            return false;
        CreateConnectionRequest other = (CreateConnectionRequest) obj;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectionRequest clone() {
        return (CreateConnectionRequest) super.clone();
    }

}
