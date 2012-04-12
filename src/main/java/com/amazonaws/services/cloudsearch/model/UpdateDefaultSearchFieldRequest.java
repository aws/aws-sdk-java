/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearch.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearch.AmazonCloudSearch#updateDefaultSearchField(UpdateDefaultSearchFieldRequest) UpdateDefaultSearchField operation}.
 * <p>
 * Configures the default search field for the search domain. The default
 * search field is used when a search request does not specify which
 * fields to search. By default, it is configured to include the contents
 * of all of the domain's text fields.
 * </p>
 *
 * @see com.amazonaws.services.cloudsearch.AmazonCloudSearch#updateDefaultSearchField(UpdateDefaultSearchFieldRequest)
 */
public class UpdateDefaultSearchFieldRequest extends AmazonWebServiceRequest {

    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * The <code>IndexField</code> to use for search requests issued with the
     * <code>q</code> parameter. The default is an empty string, which
     * automatically searches all text fields.
     */
    private String defaultSearchField;

    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return A string that represents the name of a domain. Domain names must be
     *         unique across the domains owned by an account within an AWS region.
     *         Domain names must start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     *         letters and underscores are not allowed.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names must be
     *         unique across the domains owned by an account within an AWS region.
     *         Domain names must start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     *         letters and underscores are not allowed.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names must be
     *         unique across the domains owned by an account within an AWS region.
     *         Domain names must start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     *         letters and underscores are not allowed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateDefaultSearchFieldRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    
    
    /**
     * The <code>IndexField</code> to use for search requests issued with the
     * <code>q</code> parameter. The default is an empty string, which
     * automatically searches all text fields.
     *
     * @return The <code>IndexField</code> to use for search requests issued with the
     *         <code>q</code> parameter. The default is an empty string, which
     *         automatically searches all text fields.
     */
    public String getDefaultSearchField() {
        return defaultSearchField;
    }
    
    /**
     * The <code>IndexField</code> to use for search requests issued with the
     * <code>q</code> parameter. The default is an empty string, which
     * automatically searches all text fields.
     *
     * @param defaultSearchField The <code>IndexField</code> to use for search requests issued with the
     *         <code>q</code> parameter. The default is an empty string, which
     *         automatically searches all text fields.
     */
    public void setDefaultSearchField(String defaultSearchField) {
        this.defaultSearchField = defaultSearchField;
    }
    
    /**
     * The <code>IndexField</code> to use for search requests issued with the
     * <code>q</code> parameter. The default is an empty string, which
     * automatically searches all text fields.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultSearchField The <code>IndexField</code> to use for search requests issued with the
     *         <code>q</code> parameter. The default is an empty string, which
     *         automatically searches all text fields.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateDefaultSearchFieldRequest withDefaultSearchField(String defaultSearchField) {
        this.defaultSearchField = defaultSearchField;
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
        if (domainName != null) sb.append("DomainName: " + domainName + ", ");
        if (defaultSearchField != null) sb.append("DefaultSearchField: " + defaultSearchField + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultSearchField() == null) ? 0 : getDefaultSearchField().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof UpdateDefaultSearchFieldRequest == false) return false;
        UpdateDefaultSearchFieldRequest other = (UpdateDefaultSearchFieldRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getDefaultSearchField() == null ^ this.getDefaultSearchField() == null) return false;
        if (other.getDefaultSearchField() != null && other.getDefaultSearchField().equals(this.getDefaultSearchField()) == false) return false; 
        return true;
    }
    
}
    