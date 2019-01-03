/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetAggregateResourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAggregateResourceConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     */
    private String configurationAggregatorName;
    /**
     * <p>
     * A list of aggregate ResourceIdentifiers objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AggregateResourceIdentifier> resourceIdentifiers;

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     */

    public void setConfigurationAggregatorName(String configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @return The name of the configuration aggregator.
     */

    public String getConfigurationAggregatorName() {
        return this.configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAggregateResourceConfigRequest withConfigurationAggregatorName(String configurationAggregatorName) {
        setConfigurationAggregatorName(configurationAggregatorName);
        return this;
    }

    /**
     * <p>
     * A list of aggregate ResourceIdentifiers objects.
     * </p>
     * 
     * @return A list of aggregate ResourceIdentifiers objects.
     */

    public java.util.List<AggregateResourceIdentifier> getResourceIdentifiers() {
        if (resourceIdentifiers == null) {
            resourceIdentifiers = new com.amazonaws.internal.SdkInternalList<AggregateResourceIdentifier>();
        }
        return resourceIdentifiers;
    }

    /**
     * <p>
     * A list of aggregate ResourceIdentifiers objects.
     * </p>
     * 
     * @param resourceIdentifiers
     *        A list of aggregate ResourceIdentifiers objects.
     */

    public void setResourceIdentifiers(java.util.Collection<AggregateResourceIdentifier> resourceIdentifiers) {
        if (resourceIdentifiers == null) {
            this.resourceIdentifiers = null;
            return;
        }

        this.resourceIdentifiers = new com.amazonaws.internal.SdkInternalList<AggregateResourceIdentifier>(resourceIdentifiers);
    }

    /**
     * <p>
     * A list of aggregate ResourceIdentifiers objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIdentifiers(java.util.Collection)} or {@link #withResourceIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceIdentifiers
     *        A list of aggregate ResourceIdentifiers objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAggregateResourceConfigRequest withResourceIdentifiers(AggregateResourceIdentifier... resourceIdentifiers) {
        if (this.resourceIdentifiers == null) {
            setResourceIdentifiers(new com.amazonaws.internal.SdkInternalList<AggregateResourceIdentifier>(resourceIdentifiers.length));
        }
        for (AggregateResourceIdentifier ele : resourceIdentifiers) {
            this.resourceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of aggregate ResourceIdentifiers objects.
     * </p>
     * 
     * @param resourceIdentifiers
     *        A list of aggregate ResourceIdentifiers objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAggregateResourceConfigRequest withResourceIdentifiers(java.util.Collection<AggregateResourceIdentifier> resourceIdentifiers) {
        setResourceIdentifiers(resourceIdentifiers);
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
        if (getConfigurationAggregatorName() != null)
            sb.append("ConfigurationAggregatorName: ").append(getConfigurationAggregatorName()).append(",");
        if (getResourceIdentifiers() != null)
            sb.append("ResourceIdentifiers: ").append(getResourceIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAggregateResourceConfigRequest == false)
            return false;
        BatchGetAggregateResourceConfigRequest other = (BatchGetAggregateResourceConfigRequest) obj;
        if (other.getConfigurationAggregatorName() == null ^ this.getConfigurationAggregatorName() == null)
            return false;
        if (other.getConfigurationAggregatorName() != null && other.getConfigurationAggregatorName().equals(this.getConfigurationAggregatorName()) == false)
            return false;
        if (other.getResourceIdentifiers() == null ^ this.getResourceIdentifiers() == null)
            return false;
        if (other.getResourceIdentifiers() != null && other.getResourceIdentifiers().equals(this.getResourceIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationAggregatorName() == null) ? 0 : getConfigurationAggregatorName().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifiers() == null) ? 0 : getResourceIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAggregateResourceConfigRequest clone() {
        return (BatchGetAggregateResourceConfigRequest) super.clone();
    }

}
