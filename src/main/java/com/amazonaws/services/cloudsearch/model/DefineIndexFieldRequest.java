/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearch.AmazonCloudSearch#defineIndexField(DefineIndexFieldRequest) DefineIndexField operation}.
 * <p>
 * Configures an <code>IndexField</code> for the search domain. Used to create new fields and modify existing ones. If the field exists, the new
 * configuration replaces the old one. You can configure a maximum of 200 index fields.
 * </p>
 *
 * @see com.amazonaws.services.cloudsearch.AmazonCloudSearch#defineIndexField(DefineIndexFieldRequest)
 */
public class DefineIndexFieldRequest extends AmazonWebServiceRequest implements Serializable {

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
     * Defines a field in the index, including its name, type, and the source
     * of its data. The <code>IndexFieldType</code> indicates which of the
     * options will be present. It is invalid to specify options for a type
     * other than the <code>IndexFieldType</code>.
     */
    private IndexField indexField;

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
    public DefineIndexFieldRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Defines a field in the index, including its name, type, and the source
     * of its data. The <code>IndexFieldType</code> indicates which of the
     * options will be present. It is invalid to specify options for a type
     * other than the <code>IndexFieldType</code>.
     *
     * @return Defines a field in the index, including its name, type, and the source
     *         of its data. The <code>IndexFieldType</code> indicates which of the
     *         options will be present. It is invalid to specify options for a type
     *         other than the <code>IndexFieldType</code>.
     */
    public IndexField getIndexField() {
        return indexField;
    }
    
    /**
     * Defines a field in the index, including its name, type, and the source
     * of its data. The <code>IndexFieldType</code> indicates which of the
     * options will be present. It is invalid to specify options for a type
     * other than the <code>IndexFieldType</code>.
     *
     * @param indexField Defines a field in the index, including its name, type, and the source
     *         of its data. The <code>IndexFieldType</code> indicates which of the
     *         options will be present. It is invalid to specify options for a type
     *         other than the <code>IndexFieldType</code>.
     */
    public void setIndexField(IndexField indexField) {
        this.indexField = indexField;
    }
    
    /**
     * Defines a field in the index, including its name, type, and the source
     * of its data. The <code>IndexFieldType</code> indicates which of the
     * options will be present. It is invalid to specify options for a type
     * other than the <code>IndexFieldType</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param indexField Defines a field in the index, including its name, type, and the source
     *         of its data. The <code>IndexFieldType</code> indicates which of the
     *         options will be present. It is invalid to specify options for a type
     *         other than the <code>IndexFieldType</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DefineIndexFieldRequest withIndexField(IndexField indexField) {
        this.indexField = indexField;
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
        if (getIndexField() != null) sb.append("IndexField: " + getIndexField() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getIndexField() == null) ? 0 : getIndexField().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DefineIndexFieldRequest == false) return false;
        DefineIndexFieldRequest other = (DefineIndexFieldRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getIndexField() == null ^ this.getIndexField() == null) return false;
        if (other.getIndexField() != null && other.getIndexField().equals(this.getIndexField()) == false) return false; 
        return true;
    }
    
}
    