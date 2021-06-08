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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the new connection. It must be unique across all App Runner connections for the AWS account in the AWS
     * Region.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The source repository provider.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * A list of metadata items that you can associate with your connection resource. A tag is a key-value pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A name for the new connection. It must be unique across all App Runner connections for the AWS account in the AWS
     * Region.
     * </p>
     * 
     * @param connectionName
     *        A name for the new connection. It must be unique across all App Runner connections for the AWS account in
     *        the AWS Region.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * A name for the new connection. It must be unique across all App Runner connections for the AWS account in the AWS
     * Region.
     * </p>
     * 
     * @return A name for the new connection. It must be unique across all App Runner connections for the AWS account in
     *         the AWS Region.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * A name for the new connection. It must be unique across all App Runner connections for the AWS account in the AWS
     * Region.
     * </p>
     * 
     * @param connectionName
     *        A name for the new connection. It must be unique across all App Runner connections for the AWS account in
     *        the AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The source repository provider.
     * </p>
     * 
     * @param providerType
     *        The source repository provider.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The source repository provider.
     * </p>
     * 
     * @return The source repository provider.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The source repository provider.
     * </p>
     * 
     * @param providerType
     *        The source repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public CreateConnectionRequest withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The source repository provider.
     * </p>
     * 
     * @param providerType
     *        The source repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public CreateConnectionRequest withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your connection resource. A tag is a key-value pair.
     * </p>
     * 
     * @return A list of metadata items that you can associate with your connection resource. A tag is a key-value pair.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your connection resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your connection resource. A tag is a key-value pair.
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
     * A list of metadata items that you can associate with your connection resource. A tag is a key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your connection resource. A tag is a key-value pair.
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
     * A list of metadata items that you can associate with your connection resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your connection resource. A tag is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectionRequest clone() {
        return (CreateConnectionRequest) super.clone();
    }

}
