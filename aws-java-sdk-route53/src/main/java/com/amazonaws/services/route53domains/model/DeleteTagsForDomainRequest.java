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
 * The DeleteTagsForDomainRequest includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DeleteTagsForDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTagsForDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagsToDelete;

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * 
     * @param domainName
     *        The domain for which you want to delete one or more tags.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * 
     * @return The domain for which you want to delete one or more tags.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * 
     * @param domainName
     *        The domain for which you want to delete one or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsForDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * 
     * @return A list of tag keys to delete.
     */

    public java.util.List<String> getTagsToDelete() {
        if (tagsToDelete == null) {
            tagsToDelete = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagsToDelete;
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * 
     * @param tagsToDelete
     *        A list of tag keys to delete.
     */

    public void setTagsToDelete(java.util.Collection<String> tagsToDelete) {
        if (tagsToDelete == null) {
            this.tagsToDelete = null;
            return;
        }

        this.tagsToDelete = new com.amazonaws.internal.SdkInternalList<String>(tagsToDelete);
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsToDelete(java.util.Collection)} or {@link #withTagsToDelete(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsToDelete
     *        A list of tag keys to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsForDomainRequest withTagsToDelete(String... tagsToDelete) {
        if (this.tagsToDelete == null) {
            setTagsToDelete(new com.amazonaws.internal.SdkInternalList<String>(tagsToDelete.length));
        }
        for (String ele : tagsToDelete) {
            this.tagsToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * 
     * @param tagsToDelete
     *        A list of tag keys to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsForDomainRequest withTagsToDelete(java.util.Collection<String> tagsToDelete) {
        setTagsToDelete(tagsToDelete);
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
        if (getTagsToDelete() != null)
            sb.append("TagsToDelete: ").append(getTagsToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTagsForDomainRequest == false)
            return false;
        DeleteTagsForDomainRequest other = (DeleteTagsForDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getTagsToDelete() == null ^ this.getTagsToDelete() == null)
            return false;
        if (other.getTagsToDelete() != null && other.getTagsToDelete().equals(this.getTagsToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getTagsToDelete() == null) ? 0 : getTagsToDelete().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTagsForDomainRequest clone() {
        return (DeleteTagsForDomainRequest) super.clone();
    }

}
