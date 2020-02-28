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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateDistributionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDistributionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The distributions of the distribution configuration.
     * </p>
     */
    private java.util.List<Distribution> distributions;
    /**
     * <p>
     * The tags of the distribution configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The idempotency token of the distribution configuration.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     * 
     * @param name
     *        The name of the distribution configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     * 
     * @return The name of the distribution configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     * 
     * @param name
     *        The name of the distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     * 
     * @param description
     *        The description of the distribution configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     * 
     * @return The description of the distribution configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     * 
     * @param description
     *        The description of the distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The distributions of the distribution configuration.
     * </p>
     * 
     * @return The distributions of the distribution configuration.
     */

    public java.util.List<Distribution> getDistributions() {
        return distributions;
    }

    /**
     * <p>
     * The distributions of the distribution configuration.
     * </p>
     * 
     * @param distributions
     *        The distributions of the distribution configuration.
     */

    public void setDistributions(java.util.Collection<Distribution> distributions) {
        if (distributions == null) {
            this.distributions = null;
            return;
        }

        this.distributions = new java.util.ArrayList<Distribution>(distributions);
    }

    /**
     * <p>
     * The distributions of the distribution configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDistributions(java.util.Collection)} or {@link #withDistributions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param distributions
     *        The distributions of the distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionConfigurationRequest withDistributions(Distribution... distributions) {
        if (this.distributions == null) {
            setDistributions(new java.util.ArrayList<Distribution>(distributions.length));
        }
        for (Distribution ele : distributions) {
            this.distributions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The distributions of the distribution configuration.
     * </p>
     * 
     * @param distributions
     *        The distributions of the distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionConfigurationRequest withDistributions(java.util.Collection<Distribution> distributions) {
        setDistributions(distributions);
        return this;
    }

    /**
     * <p>
     * The tags of the distribution configuration.
     * </p>
     * 
     * @return The tags of the distribution configuration.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the distribution configuration.
     * </p>
     * 
     * @param tags
     *        The tags of the distribution configuration.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the distribution configuration.
     * </p>
     * 
     * @param tags
     *        The tags of the distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionConfigurationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDistributionConfigurationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionConfigurationRequest addTagsEntry(String key, String value) {
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

    public CreateDistributionConfigurationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token of the distribution configuration.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token of the distribution configuration.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token of the distribution configuration.
     * </p>
     * 
     * @return The idempotency token of the distribution configuration.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token of the distribution configuration.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token of the distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDistributionConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDistributions() != null)
            sb.append("Distributions: ").append(getDistributions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDistributionConfigurationRequest == false)
            return false;
        CreateDistributionConfigurationRequest other = (CreateDistributionConfigurationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDistributions() == null ^ this.getDistributions() == null)
            return false;
        if (other.getDistributions() != null && other.getDistributions().equals(this.getDistributions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDistributions() == null) ? 0 : getDistributions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateDistributionConfigurationRequest clone() {
        return (CreateDistributionConfigurationRequest) super.clone();
    }

}
