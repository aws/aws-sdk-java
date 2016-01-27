/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#deleteIndexField(DeleteIndexFieldRequest) DeleteIndexField operation}.
 * <p>
 * Removes an <code> IndexField </code> from the search domain. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#deleteIndexField(DeleteIndexFieldRequest)
 */
public class DeleteIndexFieldRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * The name of the index field your want to remove from the domain's
     * indexing options.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)<br/>
     */
    private String indexFieldName;

    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteIndexFieldRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * The name of the index field your want to remove from the domain's
     * indexing options.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)<br/>
     *
     * @return The name of the index field your want to remove from the domain's
     *         indexing options.
     */
    public String getIndexFieldName() {
        return indexFieldName;
    }
    
    /**
     * The name of the index field your want to remove from the domain's
     * indexing options.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)<br/>
     *
     * @param indexFieldName The name of the index field your want to remove from the domain's
     *         indexing options.
     */
    public void setIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
    }
    
    /**
     * The name of the index field your want to remove from the domain's
     * indexing options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)<br/>
     *
     * @param indexFieldName The name of the index field your want to remove from the domain's
     *         indexing options.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteIndexFieldRequest withIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
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
        if (getIndexFieldName() != null) sb.append("IndexFieldName: " + getIndexFieldName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getIndexFieldName() == null) ? 0 : getIndexFieldName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteIndexFieldRequest == false) return false;
        DeleteIndexFieldRequest other = (DeleteIndexFieldRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getIndexFieldName() == null ^ this.getIndexFieldName() == null) return false;
        if (other.getIndexFieldName() != null && other.getIndexFieldName().equals(this.getIndexFieldName()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteIndexFieldRequest clone() {
        
            return (DeleteIndexFieldRequest) super.clone();
    }

}
    