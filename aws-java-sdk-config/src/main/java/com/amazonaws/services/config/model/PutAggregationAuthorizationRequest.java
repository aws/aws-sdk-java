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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutAggregationAuthorization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAggregationAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The 12-digit account ID of the account authorized to aggregate data.
     * </p>
     */
    private String authorizedAccountId;
    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     */
    private String authorizedAwsRegion;
    /**
     * <p>
     * An array of tag object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The 12-digit account ID of the account authorized to aggregate data.
     * </p>
     * 
     * @param authorizedAccountId
     *        The 12-digit account ID of the account authorized to aggregate data.
     */

    public void setAuthorizedAccountId(String authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the account authorized to aggregate data.
     * </p>
     * 
     * @return The 12-digit account ID of the account authorized to aggregate data.
     */

    public String getAuthorizedAccountId() {
        return this.authorizedAccountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the account authorized to aggregate data.
     * </p>
     * 
     * @param authorizedAccountId
     *        The 12-digit account ID of the account authorized to aggregate data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAggregationAuthorizationRequest withAuthorizedAccountId(String authorizedAccountId) {
        setAuthorizedAccountId(authorizedAccountId);
        return this;
    }

    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     * 
     * @param authorizedAwsRegion
     *        The region authorized to collect aggregated data.
     */

    public void setAuthorizedAwsRegion(String authorizedAwsRegion) {
        this.authorizedAwsRegion = authorizedAwsRegion;
    }

    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     * 
     * @return The region authorized to collect aggregated data.
     */

    public String getAuthorizedAwsRegion() {
        return this.authorizedAwsRegion;
    }

    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     * 
     * @param authorizedAwsRegion
     *        The region authorized to collect aggregated data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAggregationAuthorizationRequest withAuthorizedAwsRegion(String authorizedAwsRegion) {
        setAuthorizedAwsRegion(authorizedAwsRegion);
        return this;
    }

    /**
     * <p>
     * An array of tag object.
     * </p>
     * 
     * @return An array of tag object.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * An array of tag object.
     * </p>
     * 
     * @param tags
     *        An array of tag object.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * An array of tag object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of tag object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAggregationAuthorizationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of tag object.
     * </p>
     * 
     * @param tags
     *        An array of tag object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAggregationAuthorizationRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getAuthorizedAccountId() != null)
            sb.append("AuthorizedAccountId: ").append(getAuthorizedAccountId()).append(",");
        if (getAuthorizedAwsRegion() != null)
            sb.append("AuthorizedAwsRegion: ").append(getAuthorizedAwsRegion()).append(",");
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

        if (obj instanceof PutAggregationAuthorizationRequest == false)
            return false;
        PutAggregationAuthorizationRequest other = (PutAggregationAuthorizationRequest) obj;
        if (other.getAuthorizedAccountId() == null ^ this.getAuthorizedAccountId() == null)
            return false;
        if (other.getAuthorizedAccountId() != null && other.getAuthorizedAccountId().equals(this.getAuthorizedAccountId()) == false)
            return false;
        if (other.getAuthorizedAwsRegion() == null ^ this.getAuthorizedAwsRegion() == null)
            return false;
        if (other.getAuthorizedAwsRegion() != null && other.getAuthorizedAwsRegion().equals(this.getAuthorizedAwsRegion()) == false)
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

        hashCode = prime * hashCode + ((getAuthorizedAccountId() == null) ? 0 : getAuthorizedAccountId().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedAwsRegion() == null) ? 0 : getAuthorizedAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutAggregationAuthorizationRequest clone() {
        return (PutAggregationAuthorizationRequest) super.clone();
    }

}
