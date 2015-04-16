/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53domains.AmazonRoute53Domains#updateTagsForDomain(UpdateTagsForDomainRequest) UpdateTagsForDomain operation}.
 * <p>
 * This operation adds or updates tags for a specified domain.
 * </p>
 * <p>
 * All tag operations are eventually consistent; subsequent operations
 * may not immediately represent all issued operations.
 * </p>
 *
 * @see com.amazonaws.services.route53domains.AmazonRoute53Domains#updateTagsForDomain(UpdateTagsForDomainRequest)
 */
public class UpdateTagsForDomainRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The domain for which you want to add or update tags. <p>The name of a
     * domain. <p>Type: String <p>Default: None <p>Constraints: The domain
     * name can contain only the letters a through z, the numbers 0 through
     * 9, and hyphen (-). Hyphens are allowed only when they're surrounded by
     * letters, numbers, or other hyphens. You can't specify a hyphen at the
     * beginning or end of a label. To specify an Internationalized Domain
     * Name, you must convert the name to Punycode. <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     */
    private String domainName;

    /**
     * A list of the tag keys and values that you want to add or update. If
     * you specify a key that already exists, the corresponding value will be
     * replaced. <p>Type: A complex type containing a list of tags
     * <p>Default: None <p>Required: No'> <p>Each tag includes the following
     * elements: <ul> <li><p>Key <p>The key (name) of a tag. <p>Type: String
     * <p>Default: None <p>Valid values: Unicode characters including
     * alphanumeric, space, and ".:/=+\-%@" <p>Constraints: Each key can be
     * 1-128 characters long. <p>Required: Yes </li> <li><p>Value <p>The
     * value of a tag. <p>Type: String <p>Default: None <p>Valid values:
     * Unicode characters including alphanumeric, space, and ".:/=+\-%@"
     * <p>Constraints: Each value can be 0-256 characters long. <p>Required:
     * Yes </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsToUpdate;

    /**
     * The domain for which you want to add or update tags. <p>The name of a
     * domain. <p>Type: String <p>Default: None <p>Constraints: The domain
     * name can contain only the letters a through z, the numbers 0 through
     * 9, and hyphen (-). Hyphens are allowed only when they're surrounded by
     * letters, numbers, or other hyphens. You can't specify a hyphen at the
     * beginning or end of a label. To specify an Internationalized Domain
     * Name, you must convert the name to Punycode. <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @return The domain for which you want to add or update tags. <p>The name of a
     *         domain. <p>Type: String <p>Default: None <p>Constraints: The domain
     *         name can contain only the letters a through z, the numbers 0 through
     *         9, and hyphen (-). Hyphens are allowed only when they're surrounded by
     *         letters, numbers, or other hyphens. You can't specify a hyphen at the
     *         beginning or end of a label. To specify an Internationalized Domain
     *         Name, you must convert the name to Punycode. <p>Required: Yes
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The domain for which you want to add or update tags. <p>The name of a
     * domain. <p>Type: String <p>Default: None <p>Constraints: The domain
     * name can contain only the letters a through z, the numbers 0 through
     * 9, and hyphen (-). Hyphens are allowed only when they're surrounded by
     * letters, numbers, or other hyphens. You can't specify a hyphen at the
     * beginning or end of a label. To specify an Internationalized Domain
     * Name, you must convert the name to Punycode. <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The domain for which you want to add or update tags. <p>The name of a
     *         domain. <p>Type: String <p>Default: None <p>Constraints: The domain
     *         name can contain only the letters a through z, the numbers 0 through
     *         9, and hyphen (-). Hyphens are allowed only when they're surrounded by
     *         letters, numbers, or other hyphens. You can't specify a hyphen at the
     *         beginning or end of a label. To specify an Internationalized Domain
     *         Name, you must convert the name to Punycode. <p>Required: Yes
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The domain for which you want to add or update tags. <p>The name of a
     * domain. <p>Type: String <p>Default: None <p>Constraints: The domain
     * name can contain only the letters a through z, the numbers 0 through
     * 9, and hyphen (-). Hyphens are allowed only when they're surrounded by
     * letters, numbers, or other hyphens. You can't specify a hyphen at the
     * beginning or end of a label. To specify an Internationalized Domain
     * Name, you must convert the name to Punycode. <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The domain for which you want to add or update tags. <p>The name of a
     *         domain. <p>Type: String <p>Default: None <p>Constraints: The domain
     *         name can contain only the letters a through z, the numbers 0 through
     *         9, and hyphen (-). Hyphens are allowed only when they're surrounded by
     *         letters, numbers, or other hyphens. You can't specify a hyphen at the
     *         beginning or end of a label. To specify an Internationalized Domain
     *         Name, you must convert the name to Punycode. <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTagsForDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * A list of the tag keys and values that you want to add or update. If
     * you specify a key that already exists, the corresponding value will be
     * replaced. <p>Type: A complex type containing a list of tags
     * <p>Default: None <p>Required: No'> <p>Each tag includes the following
     * elements: <ul> <li><p>Key <p>The key (name) of a tag. <p>Type: String
     * <p>Default: None <p>Valid values: Unicode characters including
     * alphanumeric, space, and ".:/=+\-%@" <p>Constraints: Each key can be
     * 1-128 characters long. <p>Required: Yes </li> <li><p>Value <p>The
     * value of a tag. <p>Type: String <p>Default: None <p>Valid values:
     * Unicode characters including alphanumeric, space, and ".:/=+\-%@"
     * <p>Constraints: Each value can be 0-256 characters long. <p>Required:
     * Yes </li> </ul>
     *
     * @return A list of the tag keys and values that you want to add or update. If
     *         you specify a key that already exists, the corresponding value will be
     *         replaced. <p>Type: A complex type containing a list of tags
     *         <p>Default: None <p>Required: No'> <p>Each tag includes the following
     *         elements: <ul> <li><p>Key <p>The key (name) of a tag. <p>Type: String
     *         <p>Default: None <p>Valid values: Unicode characters including
     *         alphanumeric, space, and ".:/=+\-%@" <p>Constraints: Each key can be
     *         1-128 characters long. <p>Required: Yes </li> <li><p>Value <p>The
     *         value of a tag. <p>Type: String <p>Default: None <p>Valid values:
     *         Unicode characters including alphanumeric, space, and ".:/=+\-%@"
     *         <p>Constraints: Each value can be 0-256 characters long. <p>Required:
     *         Yes </li> </ul>
     */
    public java.util.List<Tag> getTagsToUpdate() {
        if (tagsToUpdate == null) {
              tagsToUpdate = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tagsToUpdate.setAutoConstruct(true);
        }
        return tagsToUpdate;
    }
    
    /**
     * A list of the tag keys and values that you want to add or update. If
     * you specify a key that already exists, the corresponding value will be
     * replaced. <p>Type: A complex type containing a list of tags
     * <p>Default: None <p>Required: No'> <p>Each tag includes the following
     * elements: <ul> <li><p>Key <p>The key (name) of a tag. <p>Type: String
     * <p>Default: None <p>Valid values: Unicode characters including
     * alphanumeric, space, and ".:/=+\-%@" <p>Constraints: Each key can be
     * 1-128 characters long. <p>Required: Yes </li> <li><p>Value <p>The
     * value of a tag. <p>Type: String <p>Default: None <p>Valid values:
     * Unicode characters including alphanumeric, space, and ".:/=+\-%@"
     * <p>Constraints: Each value can be 0-256 characters long. <p>Required:
     * Yes </li> </ul>
     *
     * @param tagsToUpdate A list of the tag keys and values that you want to add or update. If
     *         you specify a key that already exists, the corresponding value will be
     *         replaced. <p>Type: A complex type containing a list of tags
     *         <p>Default: None <p>Required: No'> <p>Each tag includes the following
     *         elements: <ul> <li><p>Key <p>The key (name) of a tag. <p>Type: String
     *         <p>Default: None <p>Valid values: Unicode characters including
     *         alphanumeric, space, and ".:/=+\-%@" <p>Constraints: Each key can be
     *         1-128 characters long. <p>Required: Yes </li> <li><p>Value <p>The
     *         value of a tag. <p>Type: String <p>Default: None <p>Valid values:
     *         Unicode characters including alphanumeric, space, and ".:/=+\-%@"
     *         <p>Constraints: Each value can be 0-256 characters long. <p>Required:
     *         Yes </li> </ul>
     */
    public void setTagsToUpdate(java.util.Collection<Tag> tagsToUpdate) {
        if (tagsToUpdate == null) {
            this.tagsToUpdate = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsToUpdateCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tagsToUpdate.size());
        tagsToUpdateCopy.addAll(tagsToUpdate);
        this.tagsToUpdate = tagsToUpdateCopy;
    }
    
    /**
     * A list of the tag keys and values that you want to add or update. If
     * you specify a key that already exists, the corresponding value will be
     * replaced. <p>Type: A complex type containing a list of tags
     * <p>Default: None <p>Required: No'> <p>Each tag includes the following
     * elements: <ul> <li><p>Key <p>The key (name) of a tag. <p>Type: String
     * <p>Default: None <p>Valid values: Unicode characters including
     * alphanumeric, space, and ".:/=+\-%@" <p>Constraints: Each key can be
     * 1-128 characters long. <p>Required: Yes </li> <li><p>Value <p>The
     * value of a tag. <p>Type: String <p>Default: None <p>Valid values:
     * Unicode characters including alphanumeric, space, and ".:/=+\-%@"
     * <p>Constraints: Each value can be 0-256 characters long. <p>Required:
     * Yes </li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagsToUpdate(java.util.Collection)} or {@link
     * #withTagsToUpdate(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagsToUpdate A list of the tag keys and values that you want to add or update. If
     *         you specify a key that already exists, the corresponding value will be
     *         replaced. <p>Type: A complex type containing a list of tags
     *         <p>Default: None <p>Required: No'> <p>Each tag includes the following
     *         elements: <ul> <li><p>Key <p>The key (name) of a tag. <p>Type: String
     *         <p>Default: None <p>Valid values: Unicode characters including
     *         alphanumeric, space, and ".:/=+\-%@" <p>Constraints: Each key can be
     *         1-128 characters long. <p>Required: Yes </li> <li><p>Value <p>The
     *         value of a tag. <p>Type: String <p>Default: None <p>Valid values:
     *         Unicode characters including alphanumeric, space, and ".:/=+\-%@"
     *         <p>Constraints: Each value can be 0-256 characters long. <p>Required:
     *         Yes </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTagsForDomainRequest withTagsToUpdate(Tag... tagsToUpdate) {
        if (getTagsToUpdate() == null) setTagsToUpdate(new java.util.ArrayList<Tag>(tagsToUpdate.length));
        for (Tag value : tagsToUpdate) {
            getTagsToUpdate().add(value);
        }
        return this;
    }
    
    /**
     * A list of the tag keys and values that you want to add or update. If
     * you specify a key that already exists, the corresponding value will be
     * replaced. <p>Type: A complex type containing a list of tags
     * <p>Default: None <p>Required: No'> <p>Each tag includes the following
     * elements: <ul> <li><p>Key <p>The key (name) of a tag. <p>Type: String
     * <p>Default: None <p>Valid values: Unicode characters including
     * alphanumeric, space, and ".:/=+\-%@" <p>Constraints: Each key can be
     * 1-128 characters long. <p>Required: Yes </li> <li><p>Value <p>The
     * value of a tag. <p>Type: String <p>Default: None <p>Valid values:
     * Unicode characters including alphanumeric, space, and ".:/=+\-%@"
     * <p>Constraints: Each value can be 0-256 characters long. <p>Required:
     * Yes </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagsToUpdate A list of the tag keys and values that you want to add or update. If
     *         you specify a key that already exists, the corresponding value will be
     *         replaced. <p>Type: A complex type containing a list of tags
     *         <p>Default: None <p>Required: No'> <p>Each tag includes the following
     *         elements: <ul> <li><p>Key <p>The key (name) of a tag. <p>Type: String
     *         <p>Default: None <p>Valid values: Unicode characters including
     *         alphanumeric, space, and ".:/=+\-%@" <p>Constraints: Each key can be
     *         1-128 characters long. <p>Required: Yes </li> <li><p>Value <p>The
     *         value of a tag. <p>Type: String <p>Default: None <p>Valid values:
     *         Unicode characters including alphanumeric, space, and ".:/=+\-%@"
     *         <p>Constraints: Each value can be 0-256 characters long. <p>Required:
     *         Yes </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTagsForDomainRequest withTagsToUpdate(java.util.Collection<Tag> tagsToUpdate) {
        if (tagsToUpdate == null) {
            this.tagsToUpdate = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsToUpdateCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tagsToUpdate.size());
            tagsToUpdateCopy.addAll(tagsToUpdate);
            this.tagsToUpdate = tagsToUpdateCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getTagsToUpdate() != null) sb.append("TagsToUpdate: " + getTagsToUpdate() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateTagsForDomainRequest == false) return false;
        UpdateTagsForDomainRequest other = (UpdateTagsForDomainRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getTagsToUpdate() == null ^ this.getTagsToUpdate() == null) return false;
        if (other.getTagsToUpdate() != null && other.getTagsToUpdate().equals(this.getTagsToUpdate()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateTagsForDomainRequest clone() {
        
            return (UpdateTagsForDomainRequest) super.clone();
    }

}
    