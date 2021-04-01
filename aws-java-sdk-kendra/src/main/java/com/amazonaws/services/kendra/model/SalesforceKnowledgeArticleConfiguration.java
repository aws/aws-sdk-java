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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configuration information for the knowledge article types that Amazon Kendra indexes. Amazon Kendra indexes
 * standard knowledge articles and the standard fields of knowledge articles, or the custom fields of custom knowledge
 * articles, but not both
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SalesforceKnowledgeArticleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceKnowledgeArticleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You must
     * specify at least one state.
     * </p>
     */
    private java.util.List<String> includedStates;
    /**
     * <p>
     * Provides configuration information for standard Salesforce knowledge articles.
     * </p>
     */
    private SalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration;
    /**
     * <p>
     * Provides configuration information for custom Salesforce knowledge articles.
     * </p>
     */
    private java.util.List<SalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations;

    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You must
     * specify at least one state.
     * </p>
     * 
     * @return Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You
     *         must specify at least one state.
     * @see SalesforceKnowledgeArticleState
     */

    public java.util.List<String> getIncludedStates() {
        return includedStates;
    }

    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You must
     * specify at least one state.
     * </p>
     * 
     * @param includedStates
     *        Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You
     *        must specify at least one state.
     * @see SalesforceKnowledgeArticleState
     */

    public void setIncludedStates(java.util.Collection<String> includedStates) {
        if (includedStates == null) {
            this.includedStates = null;
            return;
        }

        this.includedStates = new java.util.ArrayList<String>(includedStates);
    }

    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You must
     * specify at least one state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludedStates(java.util.Collection)} or {@link #withIncludedStates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param includedStates
     *        Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You
     *        must specify at least one state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceKnowledgeArticleState
     */

    public SalesforceKnowledgeArticleConfiguration withIncludedStates(String... includedStates) {
        if (this.includedStates == null) {
            setIncludedStates(new java.util.ArrayList<String>(includedStates.length));
        }
        for (String ele : includedStates) {
            this.includedStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You must
     * specify at least one state.
     * </p>
     * 
     * @param includedStates
     *        Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You
     *        must specify at least one state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceKnowledgeArticleState
     */

    public SalesforceKnowledgeArticleConfiguration withIncludedStates(java.util.Collection<String> includedStates) {
        setIncludedStates(includedStates);
        return this;
    }

    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You must
     * specify at least one state.
     * </p>
     * 
     * @param includedStates
     *        Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You
     *        must specify at least one state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceKnowledgeArticleState
     */

    public SalesforceKnowledgeArticleConfiguration withIncludedStates(SalesforceKnowledgeArticleState... includedStates) {
        java.util.ArrayList<String> includedStatesCopy = new java.util.ArrayList<String>(includedStates.length);
        for (SalesforceKnowledgeArticleState value : includedStates) {
            includedStatesCopy.add(value.toString());
        }
        if (getIncludedStates() == null) {
            setIncludedStates(includedStatesCopy);
        } else {
            getIncludedStates().addAll(includedStatesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Provides configuration information for standard Salesforce knowledge articles.
     * </p>
     * 
     * @param standardKnowledgeArticleTypeConfiguration
     *        Provides configuration information for standard Salesforce knowledge articles.
     */

    public void setStandardKnowledgeArticleTypeConfiguration(SalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration) {
        this.standardKnowledgeArticleTypeConfiguration = standardKnowledgeArticleTypeConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for standard Salesforce knowledge articles.
     * </p>
     * 
     * @return Provides configuration information for standard Salesforce knowledge articles.
     */

    public SalesforceStandardKnowledgeArticleTypeConfiguration getStandardKnowledgeArticleTypeConfiguration() {
        return this.standardKnowledgeArticleTypeConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for standard Salesforce knowledge articles.
     * </p>
     * 
     * @param standardKnowledgeArticleTypeConfiguration
     *        Provides configuration information for standard Salesforce knowledge articles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceKnowledgeArticleConfiguration withStandardKnowledgeArticleTypeConfiguration(
            SalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration) {
        setStandardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides configuration information for custom Salesforce knowledge articles.
     * </p>
     * 
     * @return Provides configuration information for custom Salesforce knowledge articles.
     */

    public java.util.List<SalesforceCustomKnowledgeArticleTypeConfiguration> getCustomKnowledgeArticleTypeConfigurations() {
        return customKnowledgeArticleTypeConfigurations;
    }

    /**
     * <p>
     * Provides configuration information for custom Salesforce knowledge articles.
     * </p>
     * 
     * @param customKnowledgeArticleTypeConfigurations
     *        Provides configuration information for custom Salesforce knowledge articles.
     */

    public void setCustomKnowledgeArticleTypeConfigurations(
            java.util.Collection<SalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations) {
        if (customKnowledgeArticleTypeConfigurations == null) {
            this.customKnowledgeArticleTypeConfigurations = null;
            return;
        }

        this.customKnowledgeArticleTypeConfigurations = new java.util.ArrayList<SalesforceCustomKnowledgeArticleTypeConfiguration>(
                customKnowledgeArticleTypeConfigurations);
    }

    /**
     * <p>
     * Provides configuration information for custom Salesforce knowledge articles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomKnowledgeArticleTypeConfigurations(java.util.Collection)} or
     * {@link #withCustomKnowledgeArticleTypeConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param customKnowledgeArticleTypeConfigurations
     *        Provides configuration information for custom Salesforce knowledge articles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceKnowledgeArticleConfiguration withCustomKnowledgeArticleTypeConfigurations(
            SalesforceCustomKnowledgeArticleTypeConfiguration... customKnowledgeArticleTypeConfigurations) {
        if (this.customKnowledgeArticleTypeConfigurations == null) {
            setCustomKnowledgeArticleTypeConfigurations(new java.util.ArrayList<SalesforceCustomKnowledgeArticleTypeConfiguration>(
                    customKnowledgeArticleTypeConfigurations.length));
        }
        for (SalesforceCustomKnowledgeArticleTypeConfiguration ele : customKnowledgeArticleTypeConfigurations) {
            this.customKnowledgeArticleTypeConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides configuration information for custom Salesforce knowledge articles.
     * </p>
     * 
     * @param customKnowledgeArticleTypeConfigurations
     *        Provides configuration information for custom Salesforce knowledge articles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceKnowledgeArticleConfiguration withCustomKnowledgeArticleTypeConfigurations(
            java.util.Collection<SalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations) {
        setCustomKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations);
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
        if (getIncludedStates() != null)
            sb.append("IncludedStates: ").append(getIncludedStates()).append(",");
        if (getStandardKnowledgeArticleTypeConfiguration() != null)
            sb.append("StandardKnowledgeArticleTypeConfiguration: ").append(getStandardKnowledgeArticleTypeConfiguration()).append(",");
        if (getCustomKnowledgeArticleTypeConfigurations() != null)
            sb.append("CustomKnowledgeArticleTypeConfigurations: ").append(getCustomKnowledgeArticleTypeConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceKnowledgeArticleConfiguration == false)
            return false;
        SalesforceKnowledgeArticleConfiguration other = (SalesforceKnowledgeArticleConfiguration) obj;
        if (other.getIncludedStates() == null ^ this.getIncludedStates() == null)
            return false;
        if (other.getIncludedStates() != null && other.getIncludedStates().equals(this.getIncludedStates()) == false)
            return false;
        if (other.getStandardKnowledgeArticleTypeConfiguration() == null ^ this.getStandardKnowledgeArticleTypeConfiguration() == null)
            return false;
        if (other.getStandardKnowledgeArticleTypeConfiguration() != null
                && other.getStandardKnowledgeArticleTypeConfiguration().equals(this.getStandardKnowledgeArticleTypeConfiguration()) == false)
            return false;
        if (other.getCustomKnowledgeArticleTypeConfigurations() == null ^ this.getCustomKnowledgeArticleTypeConfigurations() == null)
            return false;
        if (other.getCustomKnowledgeArticleTypeConfigurations() != null
                && other.getCustomKnowledgeArticleTypeConfigurations().equals(this.getCustomKnowledgeArticleTypeConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludedStates() == null) ? 0 : getIncludedStates().hashCode());
        hashCode = prime * hashCode
                + ((getStandardKnowledgeArticleTypeConfiguration() == null) ? 0 : getStandardKnowledgeArticleTypeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomKnowledgeArticleTypeConfigurations() == null) ? 0 : getCustomKnowledgeArticleTypeConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceKnowledgeArticleConfiguration clone() {
        try {
            return (SalesforceKnowledgeArticleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SalesforceKnowledgeArticleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
