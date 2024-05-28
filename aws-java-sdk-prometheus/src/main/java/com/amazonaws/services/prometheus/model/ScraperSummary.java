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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>ScraperSummary</code> structure contains a summary of the details about one scraper in your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ScraperSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScraperSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * (Optional) A name associated with the scraper.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scraper.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the scraper was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     * </p>
     */
    private Destination destination;
    /**
     * <p>
     * The date and time that the scraper was last modified.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the scraper to discover and collect
     * metrics on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The ID of the scraper.
     * </p>
     */
    private String scraperId;
    /**
     * <p>
     * The Amazon EKS cluster from which the scraper collects metrics.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * A structure that contains the current status of the scraper.
     * </p>
     */
    private ScraperStatus status;
    /**
     * <p>
     * If there is a failure, the reason for the failure.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * (Optional) The list of tag keys and values associated with the scraper.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * (Optional) A name associated with the scraper.
     * </p>
     * 
     * @param alias
     *        (Optional) A name associated with the scraper.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * (Optional) A name associated with the scraper.
     * </p>
     * 
     * @return (Optional) A name associated with the scraper.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * (Optional) A name associated with the scraper.
     * </p>
     * 
     * @param alias
     *        (Optional) A name associated with the scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scraper.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the scraper.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scraper.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the scraper.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scraper.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the scraper was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the scraper was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the scraper was created.
     * </p>
     * 
     * @return The date and time that the scraper was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the scraper was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the scraper was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     * </p>
     * 
     * @param destination
     *        The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     * </p>
     * 
     * @return The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     * </p>
     * 
     * @param destination
     *        The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withDestination(Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The date and time that the scraper was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The date and time that the scraper was last modified.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The date and time that the scraper was last modified.
     * </p>
     * 
     * @return The date and time that the scraper was last modified.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The date and time that the scraper was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The date and time that the scraper was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the scraper to discover and collect
     * metrics on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that provides permissions for the scraper to discover and
     *        collect metrics on your behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the scraper to discover and collect
     * metrics on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that provides permissions for the scraper to discover and
     *         collect metrics on your behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the scraper to discover and collect
     * metrics on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that provides permissions for the scraper to discover and
     *        collect metrics on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The ID of the scraper.
     * </p>
     * 
     * @param scraperId
     *        The ID of the scraper.
     */

    public void setScraperId(String scraperId) {
        this.scraperId = scraperId;
    }

    /**
     * <p>
     * The ID of the scraper.
     * </p>
     * 
     * @return The ID of the scraper.
     */

    public String getScraperId() {
        return this.scraperId;
    }

    /**
     * <p>
     * The ID of the scraper.
     * </p>
     * 
     * @param scraperId
     *        The ID of the scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withScraperId(String scraperId) {
        setScraperId(scraperId);
        return this;
    }

    /**
     * <p>
     * The Amazon EKS cluster from which the scraper collects metrics.
     * </p>
     * 
     * @param source
     *        The Amazon EKS cluster from which the scraper collects metrics.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * The Amazon EKS cluster from which the scraper collects metrics.
     * </p>
     * 
     * @return The Amazon EKS cluster from which the scraper collects metrics.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * The Amazon EKS cluster from which the scraper collects metrics.
     * </p>
     * 
     * @param source
     *        The Amazon EKS cluster from which the scraper collects metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * A structure that contains the current status of the scraper.
     * </p>
     * 
     * @param status
     *        A structure that contains the current status of the scraper.
     */

    public void setStatus(ScraperStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * A structure that contains the current status of the scraper.
     * </p>
     * 
     * @return A structure that contains the current status of the scraper.
     */

    public ScraperStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A structure that contains the current status of the scraper.
     * </p>
     * 
     * @param status
     *        A structure that contains the current status of the scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withStatus(ScraperStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If there is a failure, the reason for the failure.
     * </p>
     * 
     * @param statusReason
     *        If there is a failure, the reason for the failure.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * If there is a failure, the reason for the failure.
     * </p>
     * 
     * @return If there is a failure, the reason for the failure.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * If there is a failure, the reason for the failure.
     * </p>
     * 
     * @param statusReason
     *        If there is a failure, the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * (Optional) The list of tag keys and values associated with the scraper.
     * </p>
     * 
     * @return (Optional) The list of tag keys and values associated with the scraper.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * (Optional) The list of tag keys and values associated with the scraper.
     * </p>
     * 
     * @param tags
     *        (Optional) The list of tag keys and values associated with the scraper.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * (Optional) The list of tag keys and values associated with the scraper.
     * </p>
     * 
     * @param tags
     *        (Optional) The list of tag keys and values associated with the scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ScraperSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ScraperSummary addTagsEntry(String key, String value) {
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

    public ScraperSummary clearTagsEntries() {
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getScraperId() != null)
            sb.append("ScraperId: ").append(getScraperId()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
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

        if (obj instanceof ScraperSummary == false)
            return false;
        ScraperSummary other = (ScraperSummary) obj;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getScraperId() == null ^ this.getScraperId() == null)
            return false;
        if (other.getScraperId() != null && other.getScraperId().equals(this.getScraperId()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
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

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getScraperId() == null) ? 0 : getScraperId().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ScraperSummary clone() {
        try {
            return (ScraperSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.ScraperSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
