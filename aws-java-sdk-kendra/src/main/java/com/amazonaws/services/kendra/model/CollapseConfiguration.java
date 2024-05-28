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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies how to group results by document attribute value, and how to display them collapsed/expanded under a
 * designated primary document for each group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CollapseConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollapseConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The document attribute used to group search results. You can use any attribute that has the <code>Sortable</code>
     * flag set to true. You can also sort by any of the following built-in attributes:"_category","_created_at",
     * "_last_updated_at", "_version", "_view_count".
     * </p>
     */
    private String documentAttributeKey;
    /**
     * <p>
     * A prioritized list of document attributes/fields that determine the primary document among those in a collapsed
     * group.
     * </p>
     */
    private java.util.List<SortingConfiguration> sortingConfigurations;
    /**
     * <p>
     * Specifies the behavior for documents without a value for the collapse attribute.
     * </p>
     * <p>
     * Amazon Kendra offers three customization options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose to <code>COLLAPSE</code> all documents with null or missing values in one group. This is the default
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose to <code>IGNORE</code> documents with null or missing values. Ignored documents will not appear in query
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose to <code>EXPAND</code> each document with a null or missing value into a group of its own.
     * </p>
     * </li>
     * </ul>
     */
    private String missingAttributeKeyStrategy;
    /**
     * <p>
     * Specifies whether to expand the collapsed results.
     * </p>
     */
    private Boolean expand;
    /**
     * <p>
     * Provides configuration information to customize expansion options for a collapsed group.
     * </p>
     */
    private ExpandConfiguration expandConfiguration;

    /**
     * <p>
     * The document attribute used to group search results. You can use any attribute that has the <code>Sortable</code>
     * flag set to true. You can also sort by any of the following built-in attributes:"_category","_created_at",
     * "_last_updated_at", "_version", "_view_count".
     * </p>
     * 
     * @param documentAttributeKey
     *        The document attribute used to group search results. You can use any attribute that has the
     *        <code>Sortable</code> flag set to true. You can also sort by any of the following built-in
     *        attributes:"_category","_created_at", "_last_updated_at", "_version", "_view_count".
     */

    public void setDocumentAttributeKey(String documentAttributeKey) {
        this.documentAttributeKey = documentAttributeKey;
    }

    /**
     * <p>
     * The document attribute used to group search results. You can use any attribute that has the <code>Sortable</code>
     * flag set to true. You can also sort by any of the following built-in attributes:"_category","_created_at",
     * "_last_updated_at", "_version", "_view_count".
     * </p>
     * 
     * @return The document attribute used to group search results. You can use any attribute that has the
     *         <code>Sortable</code> flag set to true. You can also sort by any of the following built-in
     *         attributes:"_category","_created_at", "_last_updated_at", "_version", "_view_count".
     */

    public String getDocumentAttributeKey() {
        return this.documentAttributeKey;
    }

    /**
     * <p>
     * The document attribute used to group search results. You can use any attribute that has the <code>Sortable</code>
     * flag set to true. You can also sort by any of the following built-in attributes:"_category","_created_at",
     * "_last_updated_at", "_version", "_view_count".
     * </p>
     * 
     * @param documentAttributeKey
     *        The document attribute used to group search results. You can use any attribute that has the
     *        <code>Sortable</code> flag set to true. You can also sort by any of the following built-in
     *        attributes:"_category","_created_at", "_last_updated_at", "_version", "_view_count".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollapseConfiguration withDocumentAttributeKey(String documentAttributeKey) {
        setDocumentAttributeKey(documentAttributeKey);
        return this;
    }

    /**
     * <p>
     * A prioritized list of document attributes/fields that determine the primary document among those in a collapsed
     * group.
     * </p>
     * 
     * @return A prioritized list of document attributes/fields that determine the primary document among those in a
     *         collapsed group.
     */

    public java.util.List<SortingConfiguration> getSortingConfigurations() {
        return sortingConfigurations;
    }

    /**
     * <p>
     * A prioritized list of document attributes/fields that determine the primary document among those in a collapsed
     * group.
     * </p>
     * 
     * @param sortingConfigurations
     *        A prioritized list of document attributes/fields that determine the primary document among those in a
     *        collapsed group.
     */

    public void setSortingConfigurations(java.util.Collection<SortingConfiguration> sortingConfigurations) {
        if (sortingConfigurations == null) {
            this.sortingConfigurations = null;
            return;
        }

        this.sortingConfigurations = new java.util.ArrayList<SortingConfiguration>(sortingConfigurations);
    }

    /**
     * <p>
     * A prioritized list of document attributes/fields that determine the primary document among those in a collapsed
     * group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSortingConfigurations(java.util.Collection)} or
     * {@link #withSortingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sortingConfigurations
     *        A prioritized list of document attributes/fields that determine the primary document among those in a
     *        collapsed group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollapseConfiguration withSortingConfigurations(SortingConfiguration... sortingConfigurations) {
        if (this.sortingConfigurations == null) {
            setSortingConfigurations(new java.util.ArrayList<SortingConfiguration>(sortingConfigurations.length));
        }
        for (SortingConfiguration ele : sortingConfigurations) {
            this.sortingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A prioritized list of document attributes/fields that determine the primary document among those in a collapsed
     * group.
     * </p>
     * 
     * @param sortingConfigurations
     *        A prioritized list of document attributes/fields that determine the primary document among those in a
     *        collapsed group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollapseConfiguration withSortingConfigurations(java.util.Collection<SortingConfiguration> sortingConfigurations) {
        setSortingConfigurations(sortingConfigurations);
        return this;
    }

    /**
     * <p>
     * Specifies the behavior for documents without a value for the collapse attribute.
     * </p>
     * <p>
     * Amazon Kendra offers three customization options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose to <code>COLLAPSE</code> all documents with null or missing values in one group. This is the default
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose to <code>IGNORE</code> documents with null or missing values. Ignored documents will not appear in query
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose to <code>EXPAND</code> each document with a null or missing value into a group of its own.
     * </p>
     * </li>
     * </ul>
     * 
     * @param missingAttributeKeyStrategy
     *        Specifies the behavior for documents without a value for the collapse attribute.</p>
     *        <p>
     *        Amazon Kendra offers three customization options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Choose to <code>COLLAPSE</code> all documents with null or missing values in one group. This is the
     *        default configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Choose to <code>IGNORE</code> documents with null or missing values. Ignored documents will not appear in
     *        query results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Choose to <code>EXPAND</code> each document with a null or missing value into a group of its own.
     *        </p>
     *        </li>
     * @see MissingAttributeKeyStrategy
     */

    public void setMissingAttributeKeyStrategy(String missingAttributeKeyStrategy) {
        this.missingAttributeKeyStrategy = missingAttributeKeyStrategy;
    }

    /**
     * <p>
     * Specifies the behavior for documents without a value for the collapse attribute.
     * </p>
     * <p>
     * Amazon Kendra offers three customization options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose to <code>COLLAPSE</code> all documents with null or missing values in one group. This is the default
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose to <code>IGNORE</code> documents with null or missing values. Ignored documents will not appear in query
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose to <code>EXPAND</code> each document with a null or missing value into a group of its own.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the behavior for documents without a value for the collapse attribute.</p>
     *         <p>
     *         Amazon Kendra offers three customization options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Choose to <code>COLLAPSE</code> all documents with null or missing values in one group. This is the
     *         default configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Choose to <code>IGNORE</code> documents with null or missing values. Ignored documents will not appear in
     *         query results.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Choose to <code>EXPAND</code> each document with a null or missing value into a group of its own.
     *         </p>
     *         </li>
     * @see MissingAttributeKeyStrategy
     */

    public String getMissingAttributeKeyStrategy() {
        return this.missingAttributeKeyStrategy;
    }

    /**
     * <p>
     * Specifies the behavior for documents without a value for the collapse attribute.
     * </p>
     * <p>
     * Amazon Kendra offers three customization options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose to <code>COLLAPSE</code> all documents with null or missing values in one group. This is the default
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose to <code>IGNORE</code> documents with null or missing values. Ignored documents will not appear in query
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose to <code>EXPAND</code> each document with a null or missing value into a group of its own.
     * </p>
     * </li>
     * </ul>
     * 
     * @param missingAttributeKeyStrategy
     *        Specifies the behavior for documents without a value for the collapse attribute.</p>
     *        <p>
     *        Amazon Kendra offers three customization options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Choose to <code>COLLAPSE</code> all documents with null or missing values in one group. This is the
     *        default configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Choose to <code>IGNORE</code> documents with null or missing values. Ignored documents will not appear in
     *        query results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Choose to <code>EXPAND</code> each document with a null or missing value into a group of its own.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MissingAttributeKeyStrategy
     */

    public CollapseConfiguration withMissingAttributeKeyStrategy(String missingAttributeKeyStrategy) {
        setMissingAttributeKeyStrategy(missingAttributeKeyStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies the behavior for documents without a value for the collapse attribute.
     * </p>
     * <p>
     * Amazon Kendra offers three customization options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose to <code>COLLAPSE</code> all documents with null or missing values in one group. This is the default
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose to <code>IGNORE</code> documents with null or missing values. Ignored documents will not appear in query
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose to <code>EXPAND</code> each document with a null or missing value into a group of its own.
     * </p>
     * </li>
     * </ul>
     * 
     * @param missingAttributeKeyStrategy
     *        Specifies the behavior for documents without a value for the collapse attribute.</p>
     *        <p>
     *        Amazon Kendra offers three customization options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Choose to <code>COLLAPSE</code> all documents with null or missing values in one group. This is the
     *        default configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Choose to <code>IGNORE</code> documents with null or missing values. Ignored documents will not appear in
     *        query results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Choose to <code>EXPAND</code> each document with a null or missing value into a group of its own.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MissingAttributeKeyStrategy
     */

    public CollapseConfiguration withMissingAttributeKeyStrategy(MissingAttributeKeyStrategy missingAttributeKeyStrategy) {
        this.missingAttributeKeyStrategy = missingAttributeKeyStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether to expand the collapsed results.
     * </p>
     * 
     * @param expand
     *        Specifies whether to expand the collapsed results.
     */

    public void setExpand(Boolean expand) {
        this.expand = expand;
    }

    /**
     * <p>
     * Specifies whether to expand the collapsed results.
     * </p>
     * 
     * @return Specifies whether to expand the collapsed results.
     */

    public Boolean getExpand() {
        return this.expand;
    }

    /**
     * <p>
     * Specifies whether to expand the collapsed results.
     * </p>
     * 
     * @param expand
     *        Specifies whether to expand the collapsed results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollapseConfiguration withExpand(Boolean expand) {
        setExpand(expand);
        return this;
    }

    /**
     * <p>
     * Specifies whether to expand the collapsed results.
     * </p>
     * 
     * @return Specifies whether to expand the collapsed results.
     */

    public Boolean isExpand() {
        return this.expand;
    }

    /**
     * <p>
     * Provides configuration information to customize expansion options for a collapsed group.
     * </p>
     * 
     * @param expandConfiguration
     *        Provides configuration information to customize expansion options for a collapsed group.
     */

    public void setExpandConfiguration(ExpandConfiguration expandConfiguration) {
        this.expandConfiguration = expandConfiguration;
    }

    /**
     * <p>
     * Provides configuration information to customize expansion options for a collapsed group.
     * </p>
     * 
     * @return Provides configuration information to customize expansion options for a collapsed group.
     */

    public ExpandConfiguration getExpandConfiguration() {
        return this.expandConfiguration;
    }

    /**
     * <p>
     * Provides configuration information to customize expansion options for a collapsed group.
     * </p>
     * 
     * @param expandConfiguration
     *        Provides configuration information to customize expansion options for a collapsed group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollapseConfiguration withExpandConfiguration(ExpandConfiguration expandConfiguration) {
        setExpandConfiguration(expandConfiguration);
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
        if (getDocumentAttributeKey() != null)
            sb.append("DocumentAttributeKey: ").append(getDocumentAttributeKey()).append(",");
        if (getSortingConfigurations() != null)
            sb.append("SortingConfigurations: ").append(getSortingConfigurations()).append(",");
        if (getMissingAttributeKeyStrategy() != null)
            sb.append("MissingAttributeKeyStrategy: ").append(getMissingAttributeKeyStrategy()).append(",");
        if (getExpand() != null)
            sb.append("Expand: ").append(getExpand()).append(",");
        if (getExpandConfiguration() != null)
            sb.append("ExpandConfiguration: ").append(getExpandConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollapseConfiguration == false)
            return false;
        CollapseConfiguration other = (CollapseConfiguration) obj;
        if (other.getDocumentAttributeKey() == null ^ this.getDocumentAttributeKey() == null)
            return false;
        if (other.getDocumentAttributeKey() != null && other.getDocumentAttributeKey().equals(this.getDocumentAttributeKey()) == false)
            return false;
        if (other.getSortingConfigurations() == null ^ this.getSortingConfigurations() == null)
            return false;
        if (other.getSortingConfigurations() != null && other.getSortingConfigurations().equals(this.getSortingConfigurations()) == false)
            return false;
        if (other.getMissingAttributeKeyStrategy() == null ^ this.getMissingAttributeKeyStrategy() == null)
            return false;
        if (other.getMissingAttributeKeyStrategy() != null && other.getMissingAttributeKeyStrategy().equals(this.getMissingAttributeKeyStrategy()) == false)
            return false;
        if (other.getExpand() == null ^ this.getExpand() == null)
            return false;
        if (other.getExpand() != null && other.getExpand().equals(this.getExpand()) == false)
            return false;
        if (other.getExpandConfiguration() == null ^ this.getExpandConfiguration() == null)
            return false;
        if (other.getExpandConfiguration() != null && other.getExpandConfiguration().equals(this.getExpandConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentAttributeKey() == null) ? 0 : getDocumentAttributeKey().hashCode());
        hashCode = prime * hashCode + ((getSortingConfigurations() == null) ? 0 : getSortingConfigurations().hashCode());
        hashCode = prime * hashCode + ((getMissingAttributeKeyStrategy() == null) ? 0 : getMissingAttributeKeyStrategy().hashCode());
        hashCode = prime * hashCode + ((getExpand() == null) ? 0 : getExpand().hashCode());
        hashCode = prime * hashCode + ((getExpandConfiguration() == null) ? 0 : getExpandConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CollapseConfiguration clone() {
        try {
            return (CollapseConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.CollapseConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
