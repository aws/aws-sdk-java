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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a domain name.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainName implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The API mapping selection expression.
     * </p>
     */
    private String apiMappingSelectionExpression;
    /**
     * <p>
     * The name of the DomainName resource.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The domain name configurations.
     * </p>
     */
    private java.util.List<DomainNameConfiguration> domainNameConfigurations;
    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The API mapping selection expression.
     * </p>
     * 
     * @param apiMappingSelectionExpression
     *        The API mapping selection expression.
     */

    public void setApiMappingSelectionExpression(String apiMappingSelectionExpression) {
        this.apiMappingSelectionExpression = apiMappingSelectionExpression;
    }

    /**
     * <p>
     * The API mapping selection expression.
     * </p>
     * 
     * @return The API mapping selection expression.
     */

    public String getApiMappingSelectionExpression() {
        return this.apiMappingSelectionExpression;
    }

    /**
     * <p>
     * The API mapping selection expression.
     * </p>
     * 
     * @param apiMappingSelectionExpression
     *        The API mapping selection expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainName withApiMappingSelectionExpression(String apiMappingSelectionExpression) {
        setApiMappingSelectionExpression(apiMappingSelectionExpression);
        return this;
    }

    /**
     * <p>
     * The name of the DomainName resource.
     * </p>
     * 
     * @param domainName
     *        The name of the DomainName resource.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the DomainName resource.
     * </p>
     * 
     * @return The name of the DomainName resource.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the DomainName resource.
     * </p>
     * 
     * @param domainName
     *        The name of the DomainName resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainName withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * 
     * @return The domain name configurations.
     */

    public java.util.List<DomainNameConfiguration> getDomainNameConfigurations() {
        return domainNameConfigurations;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * 
     * @param domainNameConfigurations
     *        The domain name configurations.
     */

    public void setDomainNameConfigurations(java.util.Collection<DomainNameConfiguration> domainNameConfigurations) {
        if (domainNameConfigurations == null) {
            this.domainNameConfigurations = null;
            return;
        }

        this.domainNameConfigurations = new java.util.ArrayList<DomainNameConfiguration>(domainNameConfigurations);
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainNameConfigurations(java.util.Collection)} or
     * {@link #withDomainNameConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainNameConfigurations
     *        The domain name configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainName withDomainNameConfigurations(DomainNameConfiguration... domainNameConfigurations) {
        if (this.domainNameConfigurations == null) {
            setDomainNameConfigurations(new java.util.ArrayList<DomainNameConfiguration>(domainNameConfigurations.length));
        }
        for (DomainNameConfiguration ele : domainNameConfigurations) {
            this.domainNameConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * 
     * @param domainNameConfigurations
     *        The domain name configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainName withDomainNameConfigurations(java.util.Collection<DomainNameConfiguration> domainNameConfigurations) {
        setDomainNameConfigurations(domainNameConfigurations);
        return this;
    }

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     * 
     * @return The collection of tags associated with a domain name.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     * 
     * @param tags
     *        The collection of tags associated with a domain name.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     * 
     * @param tags
     *        The collection of tags associated with a domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainName withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DomainName#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DomainName addTagsEntry(String key, String value) {
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

    public DomainName clearTagsEntries() {
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
        if (getApiMappingSelectionExpression() != null)
            sb.append("ApiMappingSelectionExpression: ").append(getApiMappingSelectionExpression()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getDomainNameConfigurations() != null)
            sb.append("DomainNameConfigurations: ").append(getDomainNameConfigurations()).append(",");
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

        if (obj instanceof DomainName == false)
            return false;
        DomainName other = (DomainName) obj;
        if (other.getApiMappingSelectionExpression() == null ^ this.getApiMappingSelectionExpression() == null)
            return false;
        if (other.getApiMappingSelectionExpression() != null
                && other.getApiMappingSelectionExpression().equals(this.getApiMappingSelectionExpression()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainNameConfigurations() == null ^ this.getDomainNameConfigurations() == null)
            return false;
        if (other.getDomainNameConfigurations() != null && other.getDomainNameConfigurations().equals(this.getDomainNameConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getApiMappingSelectionExpression() == null) ? 0 : getApiMappingSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDomainNameConfigurations() == null) ? 0 : getDomainNameConfigurations().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DomainName clone() {
        try {
            return (DomainName) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.DomainNameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
