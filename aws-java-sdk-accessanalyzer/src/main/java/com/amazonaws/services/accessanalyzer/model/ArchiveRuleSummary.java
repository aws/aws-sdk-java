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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an archive rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ArchiveRuleSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArchiveRuleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time at which the archive rule was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A filter used to define the archive rule.
     * </p>
     */
    private java.util.Map<String, Criterion> filter;
    /**
     * <p>
     * The name of the archive rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The time at which the archive rule was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The time at which the archive rule was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the archive rule was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the archive rule was created.
     * </p>
     * 
     * @return The time at which the archive rule was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the archive rule was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the archive rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveRuleSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A filter used to define the archive rule.
     * </p>
     * 
     * @return A filter used to define the archive rule.
     */

    public java.util.Map<String, Criterion> getFilter() {
        return filter;
    }

    /**
     * <p>
     * A filter used to define the archive rule.
     * </p>
     * 
     * @param filter
     *        A filter used to define the archive rule.
     */

    public void setFilter(java.util.Map<String, Criterion> filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter used to define the archive rule.
     * </p>
     * 
     * @param filter
     *        A filter used to define the archive rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveRuleSummary withFilter(java.util.Map<String, Criterion> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Add a single Filter entry
     *
     * @see ArchiveRuleSummary#withFilter
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveRuleSummary addFilterEntry(String key, Criterion value) {
        if (null == this.filter) {
            this.filter = new java.util.HashMap<String, Criterion>();
        }
        if (this.filter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveRuleSummary clearFilterEntries() {
        this.filter = null;
        return this;
    }

    /**
     * <p>
     * The name of the archive rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the archive rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the archive rule.
     * </p>
     * 
     * @return The name of the archive rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the archive rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the archive rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveRuleSummary withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The time at which the archive rule was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the archive rule was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the archive rule was last updated.
     * </p>
     * 
     * @return The time at which the archive rule was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the archive rule was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the archive rule was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveRuleSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveRuleSummary == false)
            return false;
        ArchiveRuleSummary other = (ArchiveRuleSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ArchiveRuleSummary clone() {
        try {
            return (ArchiveRuleSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.ArchiveRuleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
