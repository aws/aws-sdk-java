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
 * Contains information about the analyzer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/AnalyzerSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyzerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the analyzer.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A timestamp for the time at which the analyzer was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The resource that was most recently analyzed by the analyzer.
     * </p>
     */
    private String lastResourceAnalyzed;
    /**
     * <p>
     * The time at which the most recently analyzed resource was analyzed.
     * </p>
     */
    private java.util.Date lastResourceAnalyzedAt;
    /**
     * <p>
     * The name of the analyzer.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tags added to the analyzer.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ARN of the analyzer.
     * </p>
     * 
     * @param arn
     *        The ARN of the analyzer.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the analyzer.
     * </p>
     * 
     * @return The ARN of the analyzer.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the analyzer.
     * </p>
     * 
     * @param arn
     *        The ARN of the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzerSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A timestamp for the time at which the analyzer was created.
     * </p>
     * 
     * @param createdAt
     *        A timestamp for the time at which the analyzer was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * A timestamp for the time at which the analyzer was created.
     * </p>
     * 
     * @return A timestamp for the time at which the analyzer was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * A timestamp for the time at which the analyzer was created.
     * </p>
     * 
     * @param createdAt
     *        A timestamp for the time at which the analyzer was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzerSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The resource that was most recently analyzed by the analyzer.
     * </p>
     * 
     * @param lastResourceAnalyzed
     *        The resource that was most recently analyzed by the analyzer.
     */

    public void setLastResourceAnalyzed(String lastResourceAnalyzed) {
        this.lastResourceAnalyzed = lastResourceAnalyzed;
    }

    /**
     * <p>
     * The resource that was most recently analyzed by the analyzer.
     * </p>
     * 
     * @return The resource that was most recently analyzed by the analyzer.
     */

    public String getLastResourceAnalyzed() {
        return this.lastResourceAnalyzed;
    }

    /**
     * <p>
     * The resource that was most recently analyzed by the analyzer.
     * </p>
     * 
     * @param lastResourceAnalyzed
     *        The resource that was most recently analyzed by the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzerSummary withLastResourceAnalyzed(String lastResourceAnalyzed) {
        setLastResourceAnalyzed(lastResourceAnalyzed);
        return this;
    }

    /**
     * <p>
     * The time at which the most recently analyzed resource was analyzed.
     * </p>
     * 
     * @param lastResourceAnalyzedAt
     *        The time at which the most recently analyzed resource was analyzed.
     */

    public void setLastResourceAnalyzedAt(java.util.Date lastResourceAnalyzedAt) {
        this.lastResourceAnalyzedAt = lastResourceAnalyzedAt;
    }

    /**
     * <p>
     * The time at which the most recently analyzed resource was analyzed.
     * </p>
     * 
     * @return The time at which the most recently analyzed resource was analyzed.
     */

    public java.util.Date getLastResourceAnalyzedAt() {
        return this.lastResourceAnalyzedAt;
    }

    /**
     * <p>
     * The time at which the most recently analyzed resource was analyzed.
     * </p>
     * 
     * @param lastResourceAnalyzedAt
     *        The time at which the most recently analyzed resource was analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzerSummary withLastResourceAnalyzedAt(java.util.Date lastResourceAnalyzedAt) {
        setLastResourceAnalyzedAt(lastResourceAnalyzedAt);
        return this;
    }

    /**
     * <p>
     * The name of the analyzer.
     * </p>
     * 
     * @param name
     *        The name of the analyzer.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the analyzer.
     * </p>
     * 
     * @return The name of the analyzer.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the analyzer.
     * </p>
     * 
     * @param name
     *        The name of the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzerSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags added to the analyzer.
     * </p>
     * 
     * @return The tags added to the analyzer.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags added to the analyzer.
     * </p>
     * 
     * @param tags
     *        The tags added to the analyzer.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags added to the analyzer.
     * </p>
     * 
     * @param tags
     *        The tags added to the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzerSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AnalyzerSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzerSummary addTagsEntry(String key, String value) {
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

    public AnalyzerSummary clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
     * </p>
     * 
     * @param type
     *        The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
     * </p>
     * 
     * @return The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
     * </p>
     * 
     * @param type
     *        The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public AnalyzerSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
     * </p>
     * 
     * @param type
     *        The type of analyzer, which corresponds to the zone of trust chosen for the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public AnalyzerSummary withType(Type type) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastResourceAnalyzed() != null)
            sb.append("LastResourceAnalyzed: ").append(getLastResourceAnalyzed()).append(",");
        if (getLastResourceAnalyzedAt() != null)
            sb.append("LastResourceAnalyzedAt: ").append(getLastResourceAnalyzedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof AnalyzerSummary == false)
            return false;
        AnalyzerSummary other = (AnalyzerSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastResourceAnalyzed() == null ^ this.getLastResourceAnalyzed() == null)
            return false;
        if (other.getLastResourceAnalyzed() != null && other.getLastResourceAnalyzed().equals(this.getLastResourceAnalyzed()) == false)
            return false;
        if (other.getLastResourceAnalyzedAt() == null ^ this.getLastResourceAnalyzedAt() == null)
            return false;
        if (other.getLastResourceAnalyzedAt() != null && other.getLastResourceAnalyzedAt().equals(this.getLastResourceAnalyzedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastResourceAnalyzed() == null) ? 0 : getLastResourceAnalyzed().hashCode());
        hashCode = prime * hashCode + ((getLastResourceAnalyzedAt() == null) ? 0 : getLastResourceAnalyzedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AnalyzerSummary clone() {
        try {
            return (AnalyzerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.AnalyzerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
