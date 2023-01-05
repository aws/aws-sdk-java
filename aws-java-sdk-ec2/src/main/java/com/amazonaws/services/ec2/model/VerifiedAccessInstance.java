/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Verified Access instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessInstance implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     */
    private String verifiedAccessInstanceId;
    /**
     * <p>
     * A description for the Amazon Web Services Verified Access instance.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The IDs of the Amazon Web Services Verified Access trust providers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VerifiedAccessTrustProviderCondensed> verifiedAccessTrustProviders;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The last updated time.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstanceId
     *        The ID of the Amazon Web Services Verified Access instance.
     */

    public void setVerifiedAccessInstanceId(String verifiedAccessInstanceId) {
        this.verifiedAccessInstanceId = verifiedAccessInstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access instance.
     */

    public String getVerifiedAccessInstanceId() {
        return this.verifiedAccessInstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstanceId
     *        The ID of the Amazon Web Services Verified Access instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessInstance withVerifiedAccessInstanceId(String verifiedAccessInstanceId) {
        setVerifiedAccessInstanceId(verifiedAccessInstanceId);
        return this;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access instance.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @return A description for the Amazon Web Services Verified Access instance.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessInstance withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services Verified Access trust providers.
     * </p>
     * 
     * @return The IDs of the Amazon Web Services Verified Access trust providers.
     */

    public java.util.List<VerifiedAccessTrustProviderCondensed> getVerifiedAccessTrustProviders() {
        if (verifiedAccessTrustProviders == null) {
            verifiedAccessTrustProviders = new com.amazonaws.internal.SdkInternalList<VerifiedAccessTrustProviderCondensed>();
        }
        return verifiedAccessTrustProviders;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services Verified Access trust providers.
     * </p>
     * 
     * @param verifiedAccessTrustProviders
     *        The IDs of the Amazon Web Services Verified Access trust providers.
     */

    public void setVerifiedAccessTrustProviders(java.util.Collection<VerifiedAccessTrustProviderCondensed> verifiedAccessTrustProviders) {
        if (verifiedAccessTrustProviders == null) {
            this.verifiedAccessTrustProviders = null;
            return;
        }

        this.verifiedAccessTrustProviders = new com.amazonaws.internal.SdkInternalList<VerifiedAccessTrustProviderCondensed>(verifiedAccessTrustProviders);
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services Verified Access trust providers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVerifiedAccessTrustProviders(java.util.Collection)} or
     * {@link #withVerifiedAccessTrustProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param verifiedAccessTrustProviders
     *        The IDs of the Amazon Web Services Verified Access trust providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessInstance withVerifiedAccessTrustProviders(VerifiedAccessTrustProviderCondensed... verifiedAccessTrustProviders) {
        if (this.verifiedAccessTrustProviders == null) {
            setVerifiedAccessTrustProviders(new com.amazonaws.internal.SdkInternalList<VerifiedAccessTrustProviderCondensed>(
                    verifiedAccessTrustProviders.length));
        }
        for (VerifiedAccessTrustProviderCondensed ele : verifiedAccessTrustProviders) {
            this.verifiedAccessTrustProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services Verified Access trust providers.
     * </p>
     * 
     * @param verifiedAccessTrustProviders
     *        The IDs of the Amazon Web Services Verified Access trust providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessInstance withVerifiedAccessTrustProviders(java.util.Collection<VerifiedAccessTrustProviderCondensed> verifiedAccessTrustProviders) {
        setVerifiedAccessTrustProviders(verifiedAccessTrustProviders);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessInstance withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last updated time.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @return The last updated time.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last updated time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessInstance withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
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
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessInstance withTags(Tag... tags) {
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
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessInstance withTags(java.util.Collection<Tag> tags) {
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
        if (getVerifiedAccessInstanceId() != null)
            sb.append("VerifiedAccessInstanceId: ").append(getVerifiedAccessInstanceId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVerifiedAccessTrustProviders() != null)
            sb.append("VerifiedAccessTrustProviders: ").append(getVerifiedAccessTrustProviders()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
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

        if (obj instanceof VerifiedAccessInstance == false)
            return false;
        VerifiedAccessInstance other = (VerifiedAccessInstance) obj;
        if (other.getVerifiedAccessInstanceId() == null ^ this.getVerifiedAccessInstanceId() == null)
            return false;
        if (other.getVerifiedAccessInstanceId() != null && other.getVerifiedAccessInstanceId().equals(this.getVerifiedAccessInstanceId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVerifiedAccessTrustProviders() == null ^ this.getVerifiedAccessTrustProviders() == null)
            return false;
        if (other.getVerifiedAccessTrustProviders() != null && other.getVerifiedAccessTrustProviders().equals(this.getVerifiedAccessTrustProviders()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
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

        hashCode = prime * hashCode + ((getVerifiedAccessInstanceId() == null) ? 0 : getVerifiedAccessInstanceId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVerifiedAccessTrustProviders() == null) ? 0 : getVerifiedAccessTrustProviders().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public VerifiedAccessInstance clone() {
        try {
            return (VerifiedAccessInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
