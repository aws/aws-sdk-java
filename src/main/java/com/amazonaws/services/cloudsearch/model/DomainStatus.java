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


/**
 * <p>
 * The current status of the search domain.
 * </p>
 */
public class DomainStatus implements Serializable {

    /**
     * An internally generated unique identifier for a domain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String domainId;

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
     * True if the search domain is created. It can take several minutes to
     * initialize a domain when <a>CreateDomain</a> is called. Newly created
     * search domains are returned from <a>DescribeDomains</a> with a false
     * value for Created until domain creation is complete.
     */
    private Boolean created;

    /**
     * True if the search domain has been deleted. The system must clean up
     * resources dedicated to the search domain when <a>DeleteDomain</a> is
     * called. Newly deleted search domains are returned from
     * <a>DescribeDomains</a> with a true value for IsDeleted for several
     * minutes until resource cleanup is complete.
     */
    private Boolean deleted;

    /**
     * The number of documents that have been submitted to the domain and
     * indexed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer numSearchableDocs;

    /**
     * The service endpoint for updating documents in a search domain.
     */
    private ServiceEndpoint docService;

    /**
     * The service endpoint for requesting search results from a search
     * domain.
     */
    private ServiceEndpoint searchService;

    /**
     * True if <a>IndexDocuments</a> needs to be called to activate the
     * current domain configuration.
     */
    private Boolean requiresIndexDocuments;

    /**
     * True if processing is being done to activate the current domain
     * configuration.
     */
    private Boolean processing;

    /**
     * The instance type (such as search.m1.small) that is being used to
     * process search requests.
     */
    private String searchInstanceType;

    /**
     * The number of partitions across which the search index is spread.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer searchPartitionCount;

    /**
     * The number of search instances that are available to process search
     * requests.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer searchInstanceCount;

    /**
     * An internally generated unique identifier for a domain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return An internally generated unique identifier for a domain.
     */
    public String getDomainId() {
        return domainId;
    }
    
    /**
     * An internally generated unique identifier for a domain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param domainId An internally generated unique identifier for a domain.
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }
    
    /**
     * An internally generated unique identifier for a domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param domainId An internally generated unique identifier for a domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
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
    public DomainStatus withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * True if the search domain is created. It can take several minutes to
     * initialize a domain when <a>CreateDomain</a> is called. Newly created
     * search domains are returned from <a>DescribeDomains</a> with a false
     * value for Created until domain creation is complete.
     *
     * @return True if the search domain is created. It can take several minutes to
     *         initialize a domain when <a>CreateDomain</a> is called. Newly created
     *         search domains are returned from <a>DescribeDomains</a> with a false
     *         value for Created until domain creation is complete.
     */
    public Boolean isCreated() {
        return created;
    }
    
    /**
     * True if the search domain is created. It can take several minutes to
     * initialize a domain when <a>CreateDomain</a> is called. Newly created
     * search domains are returned from <a>DescribeDomains</a> with a false
     * value for Created until domain creation is complete.
     *
     * @param created True if the search domain is created. It can take several minutes to
     *         initialize a domain when <a>CreateDomain</a> is called. Newly created
     *         search domains are returned from <a>DescribeDomains</a> with a false
     *         value for Created until domain creation is complete.
     */
    public void setCreated(Boolean created) {
        this.created = created;
    }
    
    /**
     * True if the search domain is created. It can take several minutes to
     * initialize a domain when <a>CreateDomain</a> is called. Newly created
     * search domains are returned from <a>DescribeDomains</a> with a false
     * value for Created until domain creation is complete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param created True if the search domain is created. It can take several minutes to
     *         initialize a domain when <a>CreateDomain</a> is called. Newly created
     *         search domains are returned from <a>DescribeDomains</a> with a false
     *         value for Created until domain creation is complete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withCreated(Boolean created) {
        this.created = created;
        return this;
    }

    /**
     * True if the search domain is created. It can take several minutes to
     * initialize a domain when <a>CreateDomain</a> is called. Newly created
     * search domains are returned from <a>DescribeDomains</a> with a false
     * value for Created until domain creation is complete.
     *
     * @return True if the search domain is created. It can take several minutes to
     *         initialize a domain when <a>CreateDomain</a> is called. Newly created
     *         search domains are returned from <a>DescribeDomains</a> with a false
     *         value for Created until domain creation is complete.
     */
    public Boolean getCreated() {
        return created;
    }

    /**
     * True if the search domain has been deleted. The system must clean up
     * resources dedicated to the search domain when <a>DeleteDomain</a> is
     * called. Newly deleted search domains are returned from
     * <a>DescribeDomains</a> with a true value for IsDeleted for several
     * minutes until resource cleanup is complete.
     *
     * @return True if the search domain has been deleted. The system must clean up
     *         resources dedicated to the search domain when <a>DeleteDomain</a> is
     *         called. Newly deleted search domains are returned from
     *         <a>DescribeDomains</a> with a true value for IsDeleted for several
     *         minutes until resource cleanup is complete.
     */
    public Boolean isDeleted() {
        return deleted;
    }
    
    /**
     * True if the search domain has been deleted. The system must clean up
     * resources dedicated to the search domain when <a>DeleteDomain</a> is
     * called. Newly deleted search domains are returned from
     * <a>DescribeDomains</a> with a true value for IsDeleted for several
     * minutes until resource cleanup is complete.
     *
     * @param deleted True if the search domain has been deleted. The system must clean up
     *         resources dedicated to the search domain when <a>DeleteDomain</a> is
     *         called. Newly deleted search domains are returned from
     *         <a>DescribeDomains</a> with a true value for IsDeleted for several
     *         minutes until resource cleanup is complete.
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    
    /**
     * True if the search domain has been deleted. The system must clean up
     * resources dedicated to the search domain when <a>DeleteDomain</a> is
     * called. Newly deleted search domains are returned from
     * <a>DescribeDomains</a> with a true value for IsDeleted for several
     * minutes until resource cleanup is complete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleted True if the search domain has been deleted. The system must clean up
     *         resources dedicated to the search domain when <a>DeleteDomain</a> is
     *         called. Newly deleted search domains are returned from
     *         <a>DescribeDomains</a> with a true value for IsDeleted for several
     *         minutes until resource cleanup is complete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * True if the search domain has been deleted. The system must clean up
     * resources dedicated to the search domain when <a>DeleteDomain</a> is
     * called. Newly deleted search domains are returned from
     * <a>DescribeDomains</a> with a true value for IsDeleted for several
     * minutes until resource cleanup is complete.
     *
     * @return True if the search domain has been deleted. The system must clean up
     *         resources dedicated to the search domain when <a>DeleteDomain</a> is
     *         called. Newly deleted search domains are returned from
     *         <a>DescribeDomains</a> with a true value for IsDeleted for several
     *         minutes until resource cleanup is complete.
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * The number of documents that have been submitted to the domain and
     * indexed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The number of documents that have been submitted to the domain and
     *         indexed.
     */
    public Integer getNumSearchableDocs() {
        return numSearchableDocs;
    }
    
    /**
     * The number of documents that have been submitted to the domain and
     * indexed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numSearchableDocs The number of documents that have been submitted to the domain and
     *         indexed.
     */
    public void setNumSearchableDocs(Integer numSearchableDocs) {
        this.numSearchableDocs = numSearchableDocs;
    }
    
    /**
     * The number of documents that have been submitted to the domain and
     * indexed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numSearchableDocs The number of documents that have been submitted to the domain and
     *         indexed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withNumSearchableDocs(Integer numSearchableDocs) {
        this.numSearchableDocs = numSearchableDocs;
        return this;
    }

    /**
     * The service endpoint for updating documents in a search domain.
     *
     * @return The service endpoint for updating documents in a search domain.
     */
    public ServiceEndpoint getDocService() {
        return docService;
    }
    
    /**
     * The service endpoint for updating documents in a search domain.
     *
     * @param docService The service endpoint for updating documents in a search domain.
     */
    public void setDocService(ServiceEndpoint docService) {
        this.docService = docService;
    }
    
    /**
     * The service endpoint for updating documents in a search domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param docService The service endpoint for updating documents in a search domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withDocService(ServiceEndpoint docService) {
        this.docService = docService;
        return this;
    }

    /**
     * The service endpoint for requesting search results from a search
     * domain.
     *
     * @return The service endpoint for requesting search results from a search
     *         domain.
     */
    public ServiceEndpoint getSearchService() {
        return searchService;
    }
    
    /**
     * The service endpoint for requesting search results from a search
     * domain.
     *
     * @param searchService The service endpoint for requesting search results from a search
     *         domain.
     */
    public void setSearchService(ServiceEndpoint searchService) {
        this.searchService = searchService;
    }
    
    /**
     * The service endpoint for requesting search results from a search
     * domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param searchService The service endpoint for requesting search results from a search
     *         domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withSearchService(ServiceEndpoint searchService) {
        this.searchService = searchService;
        return this;
    }

    /**
     * True if <a>IndexDocuments</a> needs to be called to activate the
     * current domain configuration.
     *
     * @return True if <a>IndexDocuments</a> needs to be called to activate the
     *         current domain configuration.
     */
    public Boolean isRequiresIndexDocuments() {
        return requiresIndexDocuments;
    }
    
    /**
     * True if <a>IndexDocuments</a> needs to be called to activate the
     * current domain configuration.
     *
     * @param requiresIndexDocuments True if <a>IndexDocuments</a> needs to be called to activate the
     *         current domain configuration.
     */
    public void setRequiresIndexDocuments(Boolean requiresIndexDocuments) {
        this.requiresIndexDocuments = requiresIndexDocuments;
    }
    
    /**
     * True if <a>IndexDocuments</a> needs to be called to activate the
     * current domain configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requiresIndexDocuments True if <a>IndexDocuments</a> needs to be called to activate the
     *         current domain configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withRequiresIndexDocuments(Boolean requiresIndexDocuments) {
        this.requiresIndexDocuments = requiresIndexDocuments;
        return this;
    }

    /**
     * True if <a>IndexDocuments</a> needs to be called to activate the
     * current domain configuration.
     *
     * @return True if <a>IndexDocuments</a> needs to be called to activate the
     *         current domain configuration.
     */
    public Boolean getRequiresIndexDocuments() {
        return requiresIndexDocuments;
    }

    /**
     * True if processing is being done to activate the current domain
     * configuration.
     *
     * @return True if processing is being done to activate the current domain
     *         configuration.
     */
    public Boolean isProcessing() {
        return processing;
    }
    
    /**
     * True if processing is being done to activate the current domain
     * configuration.
     *
     * @param processing True if processing is being done to activate the current domain
     *         configuration.
     */
    public void setProcessing(Boolean processing) {
        this.processing = processing;
    }
    
    /**
     * True if processing is being done to activate the current domain
     * configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param processing True if processing is being done to activate the current domain
     *         configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withProcessing(Boolean processing) {
        this.processing = processing;
        return this;
    }

    /**
     * True if processing is being done to activate the current domain
     * configuration.
     *
     * @return True if processing is being done to activate the current domain
     *         configuration.
     */
    public Boolean getProcessing() {
        return processing;
    }

    /**
     * The instance type (such as search.m1.small) that is being used to
     * process search requests.
     *
     * @return The instance type (such as search.m1.small) that is being used to
     *         process search requests.
     */
    public String getSearchInstanceType() {
        return searchInstanceType;
    }
    
    /**
     * The instance type (such as search.m1.small) that is being used to
     * process search requests.
     *
     * @param searchInstanceType The instance type (such as search.m1.small) that is being used to
     *         process search requests.
     */
    public void setSearchInstanceType(String searchInstanceType) {
        this.searchInstanceType = searchInstanceType;
    }
    
    /**
     * The instance type (such as search.m1.small) that is being used to
     * process search requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param searchInstanceType The instance type (such as search.m1.small) that is being used to
     *         process search requests.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withSearchInstanceType(String searchInstanceType) {
        this.searchInstanceType = searchInstanceType;
        return this;
    }

    /**
     * The number of partitions across which the search index is spread.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The number of partitions across which the search index is spread.
     */
    public Integer getSearchPartitionCount() {
        return searchPartitionCount;
    }
    
    /**
     * The number of partitions across which the search index is spread.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param searchPartitionCount The number of partitions across which the search index is spread.
     */
    public void setSearchPartitionCount(Integer searchPartitionCount) {
        this.searchPartitionCount = searchPartitionCount;
    }
    
    /**
     * The number of partitions across which the search index is spread.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param searchPartitionCount The number of partitions across which the search index is spread.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withSearchPartitionCount(Integer searchPartitionCount) {
        this.searchPartitionCount = searchPartitionCount;
        return this;
    }

    /**
     * The number of search instances that are available to process search
     * requests.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The number of search instances that are available to process search
     *         requests.
     */
    public Integer getSearchInstanceCount() {
        return searchInstanceCount;
    }
    
    /**
     * The number of search instances that are available to process search
     * requests.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param searchInstanceCount The number of search instances that are available to process search
     *         requests.
     */
    public void setSearchInstanceCount(Integer searchInstanceCount) {
        this.searchInstanceCount = searchInstanceCount;
    }
    
    /**
     * The number of search instances that are available to process search
     * requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param searchInstanceCount The number of search instances that are available to process search
     *         requests.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainStatus withSearchInstanceCount(Integer searchInstanceCount) {
        this.searchInstanceCount = searchInstanceCount;
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
        if (getDomainId() != null) sb.append("DomainId: " + getDomainId() + ",");
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (isCreated() != null) sb.append("Created: " + isCreated() + ",");
        if (isDeleted() != null) sb.append("Deleted: " + isDeleted() + ",");
        if (getNumSearchableDocs() != null) sb.append("NumSearchableDocs: " + getNumSearchableDocs() + ",");
        if (getDocService() != null) sb.append("DocService: " + getDocService() + ",");
        if (getSearchService() != null) sb.append("SearchService: " + getSearchService() + ",");
        if (isRequiresIndexDocuments() != null) sb.append("RequiresIndexDocuments: " + isRequiresIndexDocuments() + ",");
        if (isProcessing() != null) sb.append("Processing: " + isProcessing() + ",");
        if (getSearchInstanceType() != null) sb.append("SearchInstanceType: " + getSearchInstanceType() + ",");
        if (getSearchPartitionCount() != null) sb.append("SearchPartitionCount: " + getSearchPartitionCount() + ",");
        if (getSearchInstanceCount() != null) sb.append("SearchInstanceCount: " + getSearchInstanceCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode()); 
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((isCreated() == null) ? 0 : isCreated().hashCode()); 
        hashCode = prime * hashCode + ((isDeleted() == null) ? 0 : isDeleted().hashCode()); 
        hashCode = prime * hashCode + ((getNumSearchableDocs() == null) ? 0 : getNumSearchableDocs().hashCode()); 
        hashCode = prime * hashCode + ((getDocService() == null) ? 0 : getDocService().hashCode()); 
        hashCode = prime * hashCode + ((getSearchService() == null) ? 0 : getSearchService().hashCode()); 
        hashCode = prime * hashCode + ((isRequiresIndexDocuments() == null) ? 0 : isRequiresIndexDocuments().hashCode()); 
        hashCode = prime * hashCode + ((isProcessing() == null) ? 0 : isProcessing().hashCode()); 
        hashCode = prime * hashCode + ((getSearchInstanceType() == null) ? 0 : getSearchInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getSearchPartitionCount() == null) ? 0 : getSearchPartitionCount().hashCode()); 
        hashCode = prime * hashCode + ((getSearchInstanceCount() == null) ? 0 : getSearchInstanceCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DomainStatus == false) return false;
        DomainStatus other = (DomainStatus)obj;
        
        if (other.getDomainId() == null ^ this.getDomainId() == null) return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false) return false; 
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.isCreated() == null ^ this.isCreated() == null) return false;
        if (other.isCreated() != null && other.isCreated().equals(this.isCreated()) == false) return false; 
        if (other.isDeleted() == null ^ this.isDeleted() == null) return false;
        if (other.isDeleted() != null && other.isDeleted().equals(this.isDeleted()) == false) return false; 
        if (other.getNumSearchableDocs() == null ^ this.getNumSearchableDocs() == null) return false;
        if (other.getNumSearchableDocs() != null && other.getNumSearchableDocs().equals(this.getNumSearchableDocs()) == false) return false; 
        if (other.getDocService() == null ^ this.getDocService() == null) return false;
        if (other.getDocService() != null && other.getDocService().equals(this.getDocService()) == false) return false; 
        if (other.getSearchService() == null ^ this.getSearchService() == null) return false;
        if (other.getSearchService() != null && other.getSearchService().equals(this.getSearchService()) == false) return false; 
        if (other.isRequiresIndexDocuments() == null ^ this.isRequiresIndexDocuments() == null) return false;
        if (other.isRequiresIndexDocuments() != null && other.isRequiresIndexDocuments().equals(this.isRequiresIndexDocuments()) == false) return false; 
        if (other.isProcessing() == null ^ this.isProcessing() == null) return false;
        if (other.isProcessing() != null && other.isProcessing().equals(this.isProcessing()) == false) return false; 
        if (other.getSearchInstanceType() == null ^ this.getSearchInstanceType() == null) return false;
        if (other.getSearchInstanceType() != null && other.getSearchInstanceType().equals(this.getSearchInstanceType()) == false) return false; 
        if (other.getSearchPartitionCount() == null ^ this.getSearchPartitionCount() == null) return false;
        if (other.getSearchPartitionCount() != null && other.getSearchPartitionCount().equals(this.getSearchPartitionCount()) == false) return false; 
        if (other.getSearchInstanceCount() == null ^ this.getSearchInstanceCount() == null) return false;
        if (other.getSearchInstanceCount() != null && other.getSearchInstanceCount().equals(this.getSearchInstanceCount()) == false) return false; 
        return true;
    }
    
}
    