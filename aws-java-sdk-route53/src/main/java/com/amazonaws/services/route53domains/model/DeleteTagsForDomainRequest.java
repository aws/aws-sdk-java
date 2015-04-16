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
 * Container for the parameters to the {@link com.amazonaws.services.route53domains.AmazonRoute53Domains#deleteTagsForDomain(DeleteTagsForDomainRequest) DeleteTagsForDomain operation}.
 * <p>
 * This operation deletes the specified tags for a domain.
 * </p>
 * <p>
 * All tag operations are eventually consistent; subsequent operations
 * may not immediately represent all issued operations.
 * </p>
 *
 * @see com.amazonaws.services.route53domains.AmazonRoute53Domains#deleteTagsForDomain(DeleteTagsForDomainRequest)
 */
public class DeleteTagsForDomainRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The domain for which you want to delete one or more tags. <p>The name
     * of a domain. <p>Type: String <p>Default: None <p>Constraints: The
     * domain name can contain only the letters a through z, the numbers 0
     * through 9, and hyphen (-). Hyphens are allowed only when they're
     * surrounded by letters, numbers, or other hyphens. You can't specify a
     * hyphen at the beginning or end of a label. To specify an
     * Internationalized Domain Name, you must convert the name to Punycode.
     * <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     */
    private String domainName;

    /**
     * A list of tag keys to delete. <p>Type: A list that contains the keys
     * of the tags that you want to delete. <p>Default: None <p>Required:
     * No'>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagsToDelete;

    /**
     * The domain for which you want to delete one or more tags. <p>The name
     * of a domain. <p>Type: String <p>Default: None <p>Constraints: The
     * domain name can contain only the letters a through z, the numbers 0
     * through 9, and hyphen (-). Hyphens are allowed only when they're
     * surrounded by letters, numbers, or other hyphens. You can't specify a
     * hyphen at the beginning or end of a label. To specify an
     * Internationalized Domain Name, you must convert the name to Punycode.
     * <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @return The domain for which you want to delete one or more tags. <p>The name
     *         of a domain. <p>Type: String <p>Default: None <p>Constraints: The
     *         domain name can contain only the letters a through z, the numbers 0
     *         through 9, and hyphen (-). Hyphens are allowed only when they're
     *         surrounded by letters, numbers, or other hyphens. You can't specify a
     *         hyphen at the beginning or end of a label. To specify an
     *         Internationalized Domain Name, you must convert the name to Punycode.
     *         <p>Required: Yes
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The domain for which you want to delete one or more tags. <p>The name
     * of a domain. <p>Type: String <p>Default: None <p>Constraints: The
     * domain name can contain only the letters a through z, the numbers 0
     * through 9, and hyphen (-). Hyphens are allowed only when they're
     * surrounded by letters, numbers, or other hyphens. You can't specify a
     * hyphen at the beginning or end of a label. To specify an
     * Internationalized Domain Name, you must convert the name to Punycode.
     * <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The domain for which you want to delete one or more tags. <p>The name
     *         of a domain. <p>Type: String <p>Default: None <p>Constraints: The
     *         domain name can contain only the letters a through z, the numbers 0
     *         through 9, and hyphen (-). Hyphens are allowed only when they're
     *         surrounded by letters, numbers, or other hyphens. You can't specify a
     *         hyphen at the beginning or end of a label. To specify an
     *         Internationalized Domain Name, you must convert the name to Punycode.
     *         <p>Required: Yes
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The domain for which you want to delete one or more tags. <p>The name
     * of a domain. <p>Type: String <p>Default: None <p>Constraints: The
     * domain name can contain only the letters a through z, the numbers 0
     * through 9, and hyphen (-). Hyphens are allowed only when they're
     * surrounded by letters, numbers, or other hyphens. You can't specify a
     * hyphen at the beginning or end of a label. To specify an
     * Internationalized Domain Name, you must convert the name to Punycode.
     * <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The domain for which you want to delete one or more tags. <p>The name
     *         of a domain. <p>Type: String <p>Default: None <p>Constraints: The
     *         domain name can contain only the letters a through z, the numbers 0
     *         through 9, and hyphen (-). Hyphens are allowed only when they're
     *         surrounded by letters, numbers, or other hyphens. You can't specify a
     *         hyphen at the beginning or end of a label. To specify an
     *         Internationalized Domain Name, you must convert the name to Punycode.
     *         <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteTagsForDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * A list of tag keys to delete. <p>Type: A list that contains the keys
     * of the tags that you want to delete. <p>Default: None <p>Required:
     * No'>
     *
     * @return A list of tag keys to delete. <p>Type: A list that contains the keys
     *         of the tags that you want to delete. <p>Default: None <p>Required:
     *         No'>
     */
    public java.util.List<String> getTagsToDelete() {
        if (tagsToDelete == null) {
              tagsToDelete = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagsToDelete.setAutoConstruct(true);
        }
        return tagsToDelete;
    }
    
    /**
     * A list of tag keys to delete. <p>Type: A list that contains the keys
     * of the tags that you want to delete. <p>Default: None <p>Required:
     * No'>
     *
     * @param tagsToDelete A list of tag keys to delete. <p>Type: A list that contains the keys
     *         of the tags that you want to delete. <p>Default: None <p>Required:
     *         No'>
     */
    public void setTagsToDelete(java.util.Collection<String> tagsToDelete) {
        if (tagsToDelete == null) {
            this.tagsToDelete = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagsToDeleteCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagsToDelete.size());
        tagsToDeleteCopy.addAll(tagsToDelete);
        this.tagsToDelete = tagsToDeleteCopy;
    }
    
    /**
     * A list of tag keys to delete. <p>Type: A list that contains the keys
     * of the tags that you want to delete. <p>Default: None <p>Required:
     * No'>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagsToDelete(java.util.Collection)} or {@link
     * #withTagsToDelete(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagsToDelete A list of tag keys to delete. <p>Type: A list that contains the keys
     *         of the tags that you want to delete. <p>Default: None <p>Required:
     *         No'>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteTagsForDomainRequest withTagsToDelete(String... tagsToDelete) {
        if (getTagsToDelete() == null) setTagsToDelete(new java.util.ArrayList<String>(tagsToDelete.length));
        for (String value : tagsToDelete) {
            getTagsToDelete().add(value);
        }
        return this;
    }
    
    /**
     * A list of tag keys to delete. <p>Type: A list that contains the keys
     * of the tags that you want to delete. <p>Default: None <p>Required:
     * No'>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagsToDelete A list of tag keys to delete. <p>Type: A list that contains the keys
     *         of the tags that you want to delete. <p>Default: None <p>Required:
     *         No'>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteTagsForDomainRequest withTagsToDelete(java.util.Collection<String> tagsToDelete) {
        if (tagsToDelete == null) {
            this.tagsToDelete = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagsToDeleteCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagsToDelete.size());
            tagsToDeleteCopy.addAll(tagsToDelete);
            this.tagsToDelete = tagsToDeleteCopy;
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
        if (getTagsToDelete() != null) sb.append("TagsToDelete: " + getTagsToDelete() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteTagsForDomainRequest == false) return false;
        DeleteTagsForDomainRequest other = (DeleteTagsForDomainRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getTagsToDelete() == null ^ this.getTagsToDelete() == null) return false;
        if (other.getTagsToDelete() != null && other.getTagsToDelete().equals(this.getTagsToDelete()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteTagsForDomainRequest clone() {
        
            return (DeleteTagsForDomainRequest) super.clone();
    }

}
    