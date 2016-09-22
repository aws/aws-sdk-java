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
 * The UpdateTagsForDomainRequest includes the following elements.
 * </p>
 */
public class UpdateTagsForDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain for which you want to add or update tags.
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
     * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the
     * corresponding value will be replaced.
     * </p>
     * <p>
     * Type: A complex type containing a list of tags
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * '>
     * <p>
     * Each tag includes the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key
     * </p>
     * <p>
     * The key (name) of a tag.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     * </p>
     * <p>
     * Constraints: Each key can be 1-128 characters long.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * <li>
     * <p>
     * Value
     * </p>
     * <p>
     * The value of a tag.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     * </p>
     * <p>
     * Constraints: Each value can be 0-256 characters long.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tagsToUpdate;

    /**
     * <p>
     * The domain for which you want to add or update tags.
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
     *        The domain for which you want to add or update tags.</p>
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
     * The domain for which you want to add or update tags.
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
     * @return The domain for which you want to add or update tags.</p>
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
     * The domain for which you want to add or update tags.
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
     *        The domain for which you want to add or update tags.</p>
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

    public UpdateTagsForDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the
     * corresponding value will be replaced.
     * </p>
     * <p>
     * Type: A complex type containing a list of tags
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * '>
     * <p>
     * Each tag includes the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key
     * </p>
     * <p>
     * The key (name) of a tag.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     * </p>
     * <p>
     * Constraints: Each key can be 1-128 characters long.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * <li>
     * <p>
     * Value
     * </p>
     * <p>
     * The value of a tag.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     * </p>
     * <p>
     * Constraints: Each value can be 0-256 characters long.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of the tag keys and values that you want to add or update. If you specify a key that already
     *         exists, the corresponding value will be replaced.</p>
     *         <p>
     *         Type: A complex type containing a list of tags
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Required: No
     *         </p>
     *         '>
     *         <p>
     *         Each tag includes the following elements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key
     *         </p>
     *         <p>
     *         The key (name) of a tag.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     *         </p>
     *         <p>
     *         Constraints: Each key can be 1-128 characters long.
     *         </p>
     *         <p>
     *         Required: Yes
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Value
     *         </p>
     *         <p>
     *         The value of a tag.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     *         </p>
     *         <p>
     *         Constraints: Each value can be 0-256 characters long.
     *         </p>
     *         <p>
     *         Required: Yes
     *         </p>
     *         </li>
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
     * <p>
     * Type: A complex type containing a list of tags
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * '>
     * <p>
     * Each tag includes the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key
     * </p>
     * <p>
     * The key (name) of a tag.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     * </p>
     * <p>
     * Constraints: Each key can be 1-128 characters long.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * <li>
     * <p>
     * Value
     * </p>
     * <p>
     * The value of a tag.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     * </p>
     * <p>
     * Constraints: Each value can be 0-256 characters long.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagsToUpdate
     *        A list of the tag keys and values that you want to add or update. If you specify a key that already
     *        exists, the corresponding value will be replaced.</p>
     *        <p>
     *        Type: A complex type containing a list of tags
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: No
     *        </p>
     *        '>
     *        <p>
     *        Each tag includes the following elements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key
     *        </p>
     *        <p>
     *        The key (name) of a tag.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     *        </p>
     *        <p>
     *        Constraints: Each key can be 1-128 characters long.
     *        </p>
     *        <p>
     *        Required: Yes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Value
     *        </p>
     *        <p>
     *        The value of a tag.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     *        </p>
     *        <p>
     *        Constraints: Each value can be 0-256 characters long.
     *        </p>
     *        <p>
     *        Required: Yes
     *        </p>
     *        </li>
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
     * Type: A complex type containing a list of tags
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * '>
     * <p>
     * Each tag includes the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key
     * </p>
     * <p>
     * The key (name) of a tag.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     * </p>
     * <p>
     * Constraints: Each key can be 1-128 characters long.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * <li>
     * <p>
     * Value
     * </p>
     * <p>
     * The value of a tag.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     * </p>
     * <p>
     * Constraints: Each value can be 0-256 characters long.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsToUpdate(java.util.Collection)} or {@link #withTagsToUpdate(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsToUpdate
     *        A list of the tag keys and values that you want to add or update. If you specify a key that already
     *        exists, the corresponding value will be replaced.</p>
     *        <p>
     *        Type: A complex type containing a list of tags
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: No
     *        </p>
     *        '>
     *        <p>
     *        Each tag includes the following elements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key
     *        </p>
     *        <p>
     *        The key (name) of a tag.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     *        </p>
     *        <p>
     *        Constraints: Each key can be 1-128 characters long.
     *        </p>
     *        <p>
     *        Required: Yes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Value
     *        </p>
     *        <p>
     *        The value of a tag.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     *        </p>
     *        <p>
     *        Constraints: Each value can be 0-256 characters long.
     *        </p>
     *        <p>
     *        Required: Yes
     *        </p>
     *        </li>
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
     * <p>
     * Type: A complex type containing a list of tags
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: No
     * </p>
     * '>
     * <p>
     * Each tag includes the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key
     * </p>
     * <p>
     * The key (name) of a tag.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     * </p>
     * <p>
     * Constraints: Each key can be 1-128 characters long.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * <li>
     * <p>
     * Value
     * </p>
     * <p>
     * The value of a tag.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     * </p>
     * <p>
     * Constraints: Each value can be 0-256 characters long.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagsToUpdate
     *        A list of the tag keys and values that you want to add or update. If you specify a key that already
     *        exists, the corresponding value will be replaced.</p>
     *        <p>
     *        Type: A complex type containing a list of tags
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: No
     *        </p>
     *        '>
     *        <p>
     *        Each tag includes the following elements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key
     *        </p>
     *        <p>
     *        The key (name) of a tag.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     *        </p>
     *        <p>
     *        Constraints: Each key can be 1-128 characters long.
     *        </p>
     *        <p>
     *        Required: Yes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Value
     *        </p>
     *        <p>
     *        The value of a tag.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: Unicode characters including alphanumeric, space, and ".:/=+\-@"
     *        </p>
     *        <p>
     *        Constraints: Each value can be 0-256 characters long.
     *        </p>
     *        <p>
     *        Required: Yes
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTagsForDomainRequest withTagsToUpdate(java.util.Collection<Tag> tagsToUpdate) {
        setTagsToUpdate(tagsToUpdate);
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
        if (getTagsToUpdate() != null)
            sb.append("TagsToUpdate: " + getTagsToUpdate());
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
