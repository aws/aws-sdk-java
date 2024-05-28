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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartMetadataGenerationRun"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMetadataGenerationRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically populated
     * if not provided.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the Amazon DataZone domain where you want to start a metadata generation run.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The ID of the project that owns the asset for which you want to start a metadata generation run.
     * </p>
     */
    private String owningProjectIdentifier;
    /**
     * <p>
     * The asset for which you want to start a metadata generation run.
     * </p>
     */
    private MetadataGenerationRunTarget target;
    /**
     * <p>
     * The type of the metadata generation run.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically populated
     * if not provided.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically
     *        populated if not provided.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically populated
     * if not provided.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically
     *         populated if not provided.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically populated
     * if not provided.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure idempotency of the request. This field is automatically
     *        populated if not provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataGenerationRunRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where you want to start a metadata generation run.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain where you want to start a metadata generation run.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where you want to start a metadata generation run.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain where you want to start a metadata generation run.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where you want to start a metadata generation run.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain where you want to start a metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataGenerationRunRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the project that owns the asset for which you want to start a metadata generation run.
     * </p>
     * 
     * @param owningProjectIdentifier
     *        The ID of the project that owns the asset for which you want to start a metadata generation run.
     */

    public void setOwningProjectIdentifier(String owningProjectIdentifier) {
        this.owningProjectIdentifier = owningProjectIdentifier;
    }

    /**
     * <p>
     * The ID of the project that owns the asset for which you want to start a metadata generation run.
     * </p>
     * 
     * @return The ID of the project that owns the asset for which you want to start a metadata generation run.
     */

    public String getOwningProjectIdentifier() {
        return this.owningProjectIdentifier;
    }

    /**
     * <p>
     * The ID of the project that owns the asset for which you want to start a metadata generation run.
     * </p>
     * 
     * @param owningProjectIdentifier
     *        The ID of the project that owns the asset for which you want to start a metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataGenerationRunRequest withOwningProjectIdentifier(String owningProjectIdentifier) {
        setOwningProjectIdentifier(owningProjectIdentifier);
        return this;
    }

    /**
     * <p>
     * The asset for which you want to start a metadata generation run.
     * </p>
     * 
     * @param target
     *        The asset for which you want to start a metadata generation run.
     */

    public void setTarget(MetadataGenerationRunTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * The asset for which you want to start a metadata generation run.
     * </p>
     * 
     * @return The asset for which you want to start a metadata generation run.
     */

    public MetadataGenerationRunTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The asset for which you want to start a metadata generation run.
     * </p>
     * 
     * @param target
     *        The asset for which you want to start a metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataGenerationRunRequest withTarget(MetadataGenerationRunTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The type of the metadata generation run.
     * </p>
     * 
     * @param type
     *        The type of the metadata generation run.
     * @see MetadataGenerationRunType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the metadata generation run.
     * </p>
     * 
     * @return The type of the metadata generation run.
     * @see MetadataGenerationRunType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the metadata generation run.
     * </p>
     * 
     * @param type
     *        The type of the metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunType
     */

    public StartMetadataGenerationRunRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the metadata generation run.
     * </p>
     * 
     * @param type
     *        The type of the metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunType
     */

    public StartMetadataGenerationRunRequest withType(MetadataGenerationRunType type) {
        this.type = type.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getOwningProjectIdentifier() != null)
            sb.append("OwningProjectIdentifier: ").append(getOwningProjectIdentifier()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMetadataGenerationRunRequest == false)
            return false;
        StartMetadataGenerationRunRequest other = (StartMetadataGenerationRunRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getOwningProjectIdentifier() == null ^ this.getOwningProjectIdentifier() == null)
            return false;
        if (other.getOwningProjectIdentifier() != null && other.getOwningProjectIdentifier().equals(this.getOwningProjectIdentifier()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectIdentifier() == null) ? 0 : getOwningProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public StartMetadataGenerationRunRequest clone() {
        return (StartMetadataGenerationRunRequest) super.clone();
    }

}
