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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/PutDeploymentParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDeploymentParameterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     */
    private String agreementId;
    /**
     * <p>
     * The unique identifier of the deployment parameter.
     * </p>
     */
    private String deploymentParameterId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the deployment parameter resource you want to create or update.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be applied for
     * create operations, and they'll be ignored if the resource already exists.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @param agreementId
     *        The unique identifier of the agreement.
     */

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @return The unique identifier of the agreement.
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @param agreementId
     *        The unique identifier of the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterResult withAgreementId(String agreementId) {
        setAgreementId(agreementId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the deployment parameter.
     * </p>
     * 
     * @param deploymentParameterId
     *        The unique identifier of the deployment parameter.
     */

    public void setDeploymentParameterId(String deploymentParameterId) {
        this.deploymentParameterId = deploymentParameterId;
    }

    /**
     * <p>
     * The unique identifier of the deployment parameter.
     * </p>
     * 
     * @return The unique identifier of the deployment parameter.
     */

    public String getDeploymentParameterId() {
        return this.deploymentParameterId;
    }

    /**
     * <p>
     * The unique identifier of the deployment parameter.
     * </p>
     * 
     * @param deploymentParameterId
     *        The unique identifier of the deployment parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterResult withDeploymentParameterId(String deploymentParameterId) {
        setDeploymentParameterId(deploymentParameterId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the deployment parameter resource you want to create or update.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) associated with the deployment parameter resource you want to create or
     *        update.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the deployment parameter resource you want to create or update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the deployment parameter resource you want to create or
     *         update.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the deployment parameter resource you want to create or update.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) associated with the deployment parameter resource you want to create or
     *        update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be applied for
     * create operations, and they'll be ignored if the resource already exists.
     * </p>
     * 
     * @return A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be
     *         applied for create operations, and they'll be ignored if the resource already exists.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be applied for
     * create operations, and they'll be ignored if the resource already exists.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be
     *        applied for create operations, and they'll be ignored if the resource already exists.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be applied for
     * create operations, and they'll be ignored if the resource already exists.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be
     *        applied for create operations, and they'll be ignored if the resource already exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PutDeploymentParameterResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterResult clearTagsEntries() {
        this.tags = null;
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
        if (getAgreementId() != null)
            sb.append("AgreementId: ").append(getAgreementId()).append(",");
        if (getDeploymentParameterId() != null)
            sb.append("DeploymentParameterId: ").append(getDeploymentParameterId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof PutDeploymentParameterResult == false)
            return false;
        PutDeploymentParameterResult other = (PutDeploymentParameterResult) obj;
        if (other.getAgreementId() == null ^ this.getAgreementId() == null)
            return false;
        if (other.getAgreementId() != null && other.getAgreementId().equals(this.getAgreementId()) == false)
            return false;
        if (other.getDeploymentParameterId() == null ^ this.getDeploymentParameterId() == null)
            return false;
        if (other.getDeploymentParameterId() != null && other.getDeploymentParameterId().equals(this.getDeploymentParameterId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentParameterId() == null) ? 0 : getDeploymentParameterId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutDeploymentParameterResult clone() {
        try {
            return (PutDeploymentParameterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
