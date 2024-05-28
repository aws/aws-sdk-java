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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartDiscoveryJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDiscoveryJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the on-premises storage system that you want to run the discovery job
     * on.
     * </p>
     */
    private String storageSystemArn;
    /**
     * <p>
     * Specifies in minutes how long you want the discovery job to run.
     * </p>
     * <note>
     * <p>
     * For more accurate recommendations, we recommend a duration of at least 14 days. Longer durations allow time to
     * collect a sufficient number of data points and provide a realistic representation of storage performance and
     * utilization.
     * </p>
     * </note>
     */
    private Integer collectionDurationMinutes;
    /**
     * <p>
     * Specifies a client token to make sure requests with this API operation are idempotent. If you don't specify a
     * client token, DataSync generates one for you automatically.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the on-premises storage system that you want to run the discovery job
     * on.
     * </p>
     * 
     * @param storageSystemArn
     *        Specifies the Amazon Resource Name (ARN) of the on-premises storage system that you want to run the
     *        discovery job on.
     */

    public void setStorageSystemArn(String storageSystemArn) {
        this.storageSystemArn = storageSystemArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the on-premises storage system that you want to run the discovery job
     * on.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the on-premises storage system that you want to run the
     *         discovery job on.
     */

    public String getStorageSystemArn() {
        return this.storageSystemArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the on-premises storage system that you want to run the discovery job
     * on.
     * </p>
     * 
     * @param storageSystemArn
     *        Specifies the Amazon Resource Name (ARN) of the on-premises storage system that you want to run the
     *        discovery job on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDiscoveryJobRequest withStorageSystemArn(String storageSystemArn) {
        setStorageSystemArn(storageSystemArn);
        return this;
    }

    /**
     * <p>
     * Specifies in minutes how long you want the discovery job to run.
     * </p>
     * <note>
     * <p>
     * For more accurate recommendations, we recommend a duration of at least 14 days. Longer durations allow time to
     * collect a sufficient number of data points and provide a realistic representation of storage performance and
     * utilization.
     * </p>
     * </note>
     * 
     * @param collectionDurationMinutes
     *        Specifies in minutes how long you want the discovery job to run.</p> <note>
     *        <p>
     *        For more accurate recommendations, we recommend a duration of at least 14 days. Longer durations allow
     *        time to collect a sufficient number of data points and provide a realistic representation of storage
     *        performance and utilization.
     *        </p>
     */

    public void setCollectionDurationMinutes(Integer collectionDurationMinutes) {
        this.collectionDurationMinutes = collectionDurationMinutes;
    }

    /**
     * <p>
     * Specifies in minutes how long you want the discovery job to run.
     * </p>
     * <note>
     * <p>
     * For more accurate recommendations, we recommend a duration of at least 14 days. Longer durations allow time to
     * collect a sufficient number of data points and provide a realistic representation of storage performance and
     * utilization.
     * </p>
     * </note>
     * 
     * @return Specifies in minutes how long you want the discovery job to run.</p> <note>
     *         <p>
     *         For more accurate recommendations, we recommend a duration of at least 14 days. Longer durations allow
     *         time to collect a sufficient number of data points and provide a realistic representation of storage
     *         performance and utilization.
     *         </p>
     */

    public Integer getCollectionDurationMinutes() {
        return this.collectionDurationMinutes;
    }

    /**
     * <p>
     * Specifies in minutes how long you want the discovery job to run.
     * </p>
     * <note>
     * <p>
     * For more accurate recommendations, we recommend a duration of at least 14 days. Longer durations allow time to
     * collect a sufficient number of data points and provide a realistic representation of storage performance and
     * utilization.
     * </p>
     * </note>
     * 
     * @param collectionDurationMinutes
     *        Specifies in minutes how long you want the discovery job to run.</p> <note>
     *        <p>
     *        For more accurate recommendations, we recommend a duration of at least 14 days. Longer durations allow
     *        time to collect a sufficient number of data points and provide a realistic representation of storage
     *        performance and utilization.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDiscoveryJobRequest withCollectionDurationMinutes(Integer collectionDurationMinutes) {
        setCollectionDurationMinutes(collectionDurationMinutes);
        return this;
    }

    /**
     * <p>
     * Specifies a client token to make sure requests with this API operation are idempotent. If you don't specify a
     * client token, DataSync generates one for you automatically.
     * </p>
     * 
     * @param clientToken
     *        Specifies a client token to make sure requests with this API operation are idempotent. If you don't
     *        specify a client token, DataSync generates one for you automatically.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a client token to make sure requests with this API operation are idempotent. If you don't specify a
     * client token, DataSync generates one for you automatically.
     * </p>
     * 
     * @return Specifies a client token to make sure requests with this API operation are idempotent. If you don't
     *         specify a client token, DataSync generates one for you automatically.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a client token to make sure requests with this API operation are idempotent. If you don't specify a
     * client token, DataSync generates one for you automatically.
     * </p>
     * 
     * @param clientToken
     *        Specifies a client token to make sure requests with this API operation are idempotent. If you don't
     *        specify a client token, DataSync generates one for you automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDiscoveryJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources.
     * </p>
     * 
     * @return Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDiscoveryJobRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDiscoveryJobRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
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
        if (getStorageSystemArn() != null)
            sb.append("StorageSystemArn: ").append(getStorageSystemArn()).append(",");
        if (getCollectionDurationMinutes() != null)
            sb.append("CollectionDurationMinutes: ").append(getCollectionDurationMinutes()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof StartDiscoveryJobRequest == false)
            return false;
        StartDiscoveryJobRequest other = (StartDiscoveryJobRequest) obj;
        if (other.getStorageSystemArn() == null ^ this.getStorageSystemArn() == null)
            return false;
        if (other.getStorageSystemArn() != null && other.getStorageSystemArn().equals(this.getStorageSystemArn()) == false)
            return false;
        if (other.getCollectionDurationMinutes() == null ^ this.getCollectionDurationMinutes() == null)
            return false;
        if (other.getCollectionDurationMinutes() != null && other.getCollectionDurationMinutes().equals(this.getCollectionDurationMinutes()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getStorageSystemArn() == null) ? 0 : getStorageSystemArn().hashCode());
        hashCode = prime * hashCode + ((getCollectionDurationMinutes() == null) ? 0 : getCollectionDurationMinutes().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartDiscoveryJobRequest clone() {
        return (StartDiscoveryJobRequest) super.clone();
    }

}
