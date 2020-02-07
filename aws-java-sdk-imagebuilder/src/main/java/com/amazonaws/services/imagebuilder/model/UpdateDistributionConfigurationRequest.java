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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateDistributionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDistributionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that you want to update.
     * </p>
     */
    private String distributionConfigurationArn;
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
     * The idempotency token of the distribution configuration.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that you want to update.
     * </p>
     * 
     * @param distributionConfigurationArn
     *        The Amazon Resource Name (ARN) of the distribution configuration that you want to update.
     */

    public void setDistributionConfigurationArn(String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the distribution configuration that you want to update.
     */

    public String getDistributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that you want to update.
     * </p>
     * 
     * @param distributionConfigurationArn
     *        The Amazon Resource Name (ARN) of the distribution configuration that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionConfigurationRequest withDistributionConfigurationArn(String distributionConfigurationArn) {
        setDistributionConfigurationArn(distributionConfigurationArn);
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

    public UpdateDistributionConfigurationRequest withDescription(String description) {
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

    public UpdateDistributionConfigurationRequest withDistributions(Distribution... distributions) {
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

    public UpdateDistributionConfigurationRequest withDistributions(java.util.Collection<Distribution> distributions) {
        setDistributions(distributions);
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

    public UpdateDistributionConfigurationRequest withClientToken(String clientToken) {
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
        if (getDistributionConfigurationArn() != null)
            sb.append("DistributionConfigurationArn: ").append(getDistributionConfigurationArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDistributions() != null)
            sb.append("Distributions: ").append(getDistributions()).append(",");
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

        if (obj instanceof UpdateDistributionConfigurationRequest == false)
            return false;
        UpdateDistributionConfigurationRequest other = (UpdateDistributionConfigurationRequest) obj;
        if (other.getDistributionConfigurationArn() == null ^ this.getDistributionConfigurationArn() == null)
            return false;
        if (other.getDistributionConfigurationArn() != null && other.getDistributionConfigurationArn().equals(this.getDistributionConfigurationArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDistributions() == null ^ this.getDistributions() == null)
            return false;
        if (other.getDistributions() != null && other.getDistributions().equals(this.getDistributions()) == false)
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

        hashCode = prime * hashCode + ((getDistributionConfigurationArn() == null) ? 0 : getDistributionConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDistributions() == null) ? 0 : getDistributions().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDistributionConfigurationRequest clone() {
        return (UpdateDistributionConfigurationRequest) super.clone();
    }

}
