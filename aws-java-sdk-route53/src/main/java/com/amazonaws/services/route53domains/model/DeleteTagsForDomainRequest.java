/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The DeleteTagsForDomainRequest includes the following elements.
 * </p>
 */
public class DeleteTagsForDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Hyphens are allowed only when they&apos;re surrounded by letters, numbers, or other hyphens. You can&apos;t
     * specify a hyphen at the beginning or end of a label. To specify an Internationalized Domain Name, you must
     * convert the name to Punycode.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A list of tag keys to delete.
     * </p>
     * <p>
     * Type: A list that contains the keys of the tags that you want to delete.
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * '>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagsToDelete;

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Hyphens are allowed only when they&apos;re surrounded by letters, numbers, or other hyphens. You can&apos;t
     * specify a hyphen at the beginning or end of a label. To specify an Internationalized Domain Name, you must
     * convert the name to Punycode.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param domainName
     *        The domain for which you want to delete one or more tags.</p>
     *        <p>
     *        The name of a domain.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Hyphens are allowed only when they&apos;re surrounded by letters, numbers, or other hyphens. You
     *        can&apos;t specify a hyphen at the beginning or end of a label. To specify an Internationalized Domain
     *        Name, you must convert the name to Punycode.
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Hyphens are allowed only when they&apos;re surrounded by letters, numbers, or other hyphens. You can&apos;t
     * specify a hyphen at the beginning or end of a label. To specify an Internationalized Domain Name, you must
     * convert the name to Punycode.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The domain for which you want to delete one or more tags.</p>
     *         <p>
     *         The name of a domain.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and
     *         hyphen (-). Hyphens are allowed only when they&apos;re surrounded by letters, numbers, or other hyphens.
     *         You can&apos;t specify a hyphen at the beginning or end of a label. To specify an Internationalized
     *         Domain Name, you must convert the name to Punycode.
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain for which you want to delete one or more tags.
     * </p>
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Hyphens are allowed only when they&apos;re surrounded by letters, numbers, or other hyphens. You can&apos;t
     * specify a hyphen at the beginning or end of a label. To specify an Internationalized Domain Name, you must
     * convert the name to Punycode.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param domainName
     *        The domain for which you want to delete one or more tags.</p>
     *        <p>
     *        The name of a domain.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Hyphens are allowed only when they&apos;re surrounded by letters, numbers, or other hyphens. You
     *        can&apos;t specify a hyphen at the beginning or end of a label. To specify an Internationalized Domain
     *        Name, you must convert the name to Punycode.
     *        </p>
     *        <p>
     *        Required: Yes
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
     * <p>
     * Type: A list that contains the keys of the tags that you want to delete.
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * '>
     * 
     * @return A list of tag keys to delete.</p>
     *         <p>
     *         Type: A list that contains the keys of the tags that you want to delete.
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Required: No
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
     * <p>
     * Type: A list that contains the keys of the tags that you want to delete.
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * '>
     * 
     * @param tagsToDelete
     *        A list of tag keys to delete.</p>
     *        <p>
     *        Type: A list that contains the keys of the tags that you want to delete.
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: No
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
     * Type: A list that contains the keys of the tags that you want to delete.
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * '>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsToDelete(java.util.Collection)} or {@link #withTagsToDelete(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsToDelete
     *        A list of tag keys to delete.</p>
     *        <p>
     *        Type: A list that contains the keys of the tags that you want to delete.
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: No
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
     * <p>
     * Type: A list that contains the keys of the tags that you want to delete.
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * '>
     * 
     * @param tagsToDelete
     *        A list of tag keys to delete.</p>
     *        <p>
     *        Type: A list that contains the keys of the tags that you want to delete.
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsForDomainRequest withTagsToDelete(java.util.Collection<String> tagsToDelete) {
        setTagsToDelete(tagsToDelete);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DomainName: " + getDomainName() + ",");
        if (getTagsToDelete() != null)
            sb.append("TagsToDelete: " + getTagsToDelete());
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
