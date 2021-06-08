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
     * The name of the external provider where your third-party code repository is configured.
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
     * The key-value pair to use when tagging the resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host associated with the connection to be created.
     * </p>
     */
    private String hostArn;

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured.
     * </p>
     * 
     * @param providerType
     *        The name of the external provider where your third-party code repository is configured.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured.
     * </p>
     * 
     * @return The name of the external provider where your third-party code repository is configured.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured.
     * </p>
     * 
     * @param providerType
     *        The name of the external provider where your third-party code repository is configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public CreateConnectionRequest withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The name of the external provider where your third-party code repository is configured.
     * </p>
     * 
     * @param providerType
     *        The name of the external provider where your third-party code repository is configured.
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
     * <p>
     * The key-value pair to use when tagging the resource.
     * </p>
     * 
     * @return The key-value pair to use when tagging the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pair to use when tagging the resource.
     * </p>
     * 
     * @param tags
     *        The key-value pair to use when tagging the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The key-value pair to use when tagging the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pair to use when tagging the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pair to use when tagging the resource.
     * </p>
     * 
     * @param tags
     *        The key-value pair to use when tagging the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host associated with the connection to be created.
     * </p>
     * 
     * @param hostArn
     *        The Amazon Resource Name (ARN) of the host associated with the connection to be created.
     */

    public void setHostArn(String hostArn) {
        this.hostArn = hostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host associated with the connection to be created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the host associated with the connection to be created.
     */

    public String getHostArn() {
        return this.hostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host associated with the connection to be created.
     * </p>
     * 
     * @param hostArn
     *        The Amazon Resource Name (ARN) of the host associated with the connection to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withHostArn(String hostArn) {
        setHostArn(hostArn);
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
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getHostArn() != null)
            sb.append("HostArn: ").append(getHostArn());
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getHostArn() == null ^ this.getHostArn() == null)
            return false;
        if (other.getHostArn() != null && other.getHostArn().equals(this.getHostArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getHostArn() == null) ? 0 : getHostArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectionRequest clone() {
        return (CreateConnectionRequest) super.clone();
    }

}
