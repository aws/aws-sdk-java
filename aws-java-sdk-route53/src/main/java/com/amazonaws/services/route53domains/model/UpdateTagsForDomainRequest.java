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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The UpdateTagsForDomainRequest includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/UpdateTagsForDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTagsForDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain for which you want to add or update tags.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the
     * corresponding value will be replaced.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tagsToUpdate;

    /**
     * <p>
     * The domain for which you want to add or update tags.
     * </p>
     * 
     * @param domainName
     *        The domain for which you want to add or update tags.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain for which you want to add or update tags.
     * </p>
     * 
     * @return The domain for which you want to add or update tags.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain for which you want to add or update tags.
     * </p>
     * 
     * @param domainName
     *        The domain for which you want to add or update tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTagsForDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the
     * corresponding value will be replaced.
     * </p>
     * 
     * @return A list of the tag keys and values that you want to add or update. If you specify a key that already
     *         exists, the corresponding value will be replaced.
     */

    public java.util.List<Tag> getTagsToUpdate() {
        if (tagsToUpdate == null) {
            tagsToUpdate = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tagsToUpdate;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the
     * corresponding value will be replaced.
     * </p>
     * 
     * @param tagsToUpdate
     *        A list of the tag keys and values that you want to add or update. If you specify a key that already
     *        exists, the corresponding value will be replaced.
     */

    public void setTagsToUpdate(java.util.Collection<Tag> tagsToUpdate) {
        if (tagsToUpdate == null) {
            this.tagsToUpdate = null;
            return;
        }

        this.tagsToUpdate = new com.amazonaws.internal.SdkInternalList<Tag>(tagsToUpdate);
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the
     * corresponding value will be replaced.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsToUpdate(java.util.Collection)} or {@link #withTagsToUpdate(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsToUpdate
     *        A list of the tag keys and values that you want to add or update. If you specify a key that already
     *        exists, the corresponding value will be replaced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTagsForDomainRequest withTagsToUpdate(Tag... tagsToUpdate) {
        if (this.tagsToUpdate == null) {
            setTagsToUpdate(new com.amazonaws.internal.SdkInternalList<Tag>(tagsToUpdate.length));
        }
        for (Tag ele : tagsToUpdate) {
            this.tagsToUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the
     * corresponding value will be replaced.
     * </p>
     * 
     * @param tagsToUpdate
     *        A list of the tag keys and values that you want to add or update. If you specify a key that already
     *        exists, the corresponding value will be replaced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTagsForDomainRequest withTagsToUpdate(java.util.Collection<Tag> tagsToUpdate) {
        setTagsToUpdate(tagsToUpdate);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getTagsToUpdate() != null)
            sb.append("TagsToUpdate: ").append(getTagsToUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTagsForDomainRequest == false)
            return false;
        UpdateTagsForDomainRequest other = (UpdateTagsForDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getTagsToUpdate() == null ^ this.getTagsToUpdate() == null)
            return false;
        if (other.getTagsToUpdate() != null && other.getTagsToUpdate().equals(this.getTagsToUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getTagsToUpdate() == null) ? 0 : getTagsToUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTagsForDomainRequest clone() {
        return (UpdateTagsForDomainRequest) super.clone();
    }

}
