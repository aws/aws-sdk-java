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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateRegistry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRegistryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     * </p>
     */
    private RegistryId registryId;
    /**
     * <p>
     * A description of the registry. If description is not provided, this field will not be updated.
     * </p>
     */
    private String description;

    /**
     * <p>
     * This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param registryId
     *        This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     */

    public void setRegistryId(RegistryId registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @return This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     */

    public RegistryId getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param registryId
     *        This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegistryRequest withRegistryId(RegistryId registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * A description of the registry. If description is not provided, this field will not be updated.
     * </p>
     * 
     * @param description
     *        A description of the registry. If description is not provided, this field will not be updated.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the registry. If description is not provided, this field will not be updated.
     * </p>
     * 
     * @return A description of the registry. If description is not provided, this field will not be updated.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the registry. If description is not provided, this field will not be updated.
     * </p>
     * 
     * @param description
     *        A description of the registry. If description is not provided, this field will not be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegistryRequest withDescription(String description) {
        setDescription(description);
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRegistryRequest == false)
            return false;
        UpdateRegistryRequest other = (UpdateRegistryRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRegistryRequest clone() {
        return (UpdateRegistryRequest) super.clone();
    }

}
