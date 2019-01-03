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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The current status of the search domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainStatus implements Serializable, Cloneable {

    private String domainId;

    private String domainName;

    private String aRN;
    /**
     * <p>
     * True if the search domain is created. It can take several minutes to initialize a domain when <a>CreateDomain</a>
     * is called. Newly created search domains are returned from <a>DescribeDomains</a> with a false value for Created
     * until domain creation is complete.
     * </p>
     */
    private Boolean created;
    /**
     * <p>
     * True if the search domain has been deleted. The system must clean up resources dedicated to the search domain
     * when <a>DeleteDomain</a> is called. Newly deleted search domains are returned from <a>DescribeDomains</a> with a
     * true value for IsDeleted for several minutes until resource cleanup is complete.
     * </p>
     */
    private Boolean deleted;
    /**
     * <p>
     * The service endpoint for updating documents in a search domain.
     * </p>
     */
    private ServiceEndpoint docService;
    /**
     * <p>
     * The service endpoint for requesting search results from a search domain.
     * </p>
     */
    private ServiceEndpoint searchService;
    /**
     * <p>
     * True if <a>IndexDocuments</a> needs to be called to activate the current domain configuration.
     * </p>
     */
    private Boolean requiresIndexDocuments;
    /**
     * <p>
     * True if processing is being done to activate the current domain configuration.
     * </p>
     */
    private Boolean processing;
    /**
     * <p>
     * The instance type that is being used to process search requests.
     * </p>
     */
    private String searchInstanceType;
    /**
     * <p>
     * The number of partitions across which the search index is spread.
     * </p>
     */
    private Integer searchPartitionCount;
    /**
     * <p>
     * The number of search instances that are available to process search requests.
     * </p>
     */
    private Integer searchInstanceCount;

    private Limits limits;

    /**
     * @param domainId
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * @return
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @param domainId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * @param domainName
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * @param aRN
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * @return
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * @param aRN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * True if the search domain is created. It can take several minutes to initialize a domain when <a>CreateDomain</a>
     * is called. Newly created search domains are returned from <a>DescribeDomains</a> with a false value for Created
     * until domain creation is complete.
     * </p>
     * 
     * @param created
     *        True if the search domain is created. It can take several minutes to initialize a domain when
     *        <a>CreateDomain</a> is called. Newly created search domains are returned from <a>DescribeDomains</a> with
     *        a false value for Created until domain creation is complete.
     */

    public void setCreated(Boolean created) {
        this.created = created;
    }

    /**
     * <p>
     * True if the search domain is created. It can take several minutes to initialize a domain when <a>CreateDomain</a>
     * is called. Newly created search domains are returned from <a>DescribeDomains</a> with a false value for Created
     * until domain creation is complete.
     * </p>
     * 
     * @return True if the search domain is created. It can take several minutes to initialize a domain when
     *         <a>CreateDomain</a> is called. Newly created search domains are returned from <a>DescribeDomains</a> with
     *         a false value for Created until domain creation is complete.
     */

    public Boolean getCreated() {
        return this.created;
    }

    /**
     * <p>
     * True if the search domain is created. It can take several minutes to initialize a domain when <a>CreateDomain</a>
     * is called. Newly created search domains are returned from <a>DescribeDomains</a> with a false value for Created
     * until domain creation is complete.
     * </p>
     * 
     * @param created
     *        True if the search domain is created. It can take several minutes to initialize a domain when
     *        <a>CreateDomain</a> is called. Newly created search domains are returned from <a>DescribeDomains</a> with
     *        a false value for Created until domain creation is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withCreated(Boolean created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * True if the search domain is created. It can take several minutes to initialize a domain when <a>CreateDomain</a>
     * is called. Newly created search domains are returned from <a>DescribeDomains</a> with a false value for Created
     * until domain creation is complete.
     * </p>
     * 
     * @return True if the search domain is created. It can take several minutes to initialize a domain when
     *         <a>CreateDomain</a> is called. Newly created search domains are returned from <a>DescribeDomains</a> with
     *         a false value for Created until domain creation is complete.
     */

    public Boolean isCreated() {
        return this.created;
    }

    /**
     * <p>
     * True if the search domain has been deleted. The system must clean up resources dedicated to the search domain
     * when <a>DeleteDomain</a> is called. Newly deleted search domains are returned from <a>DescribeDomains</a> with a
     * true value for IsDeleted for several minutes until resource cleanup is complete.
     * </p>
     * 
     * @param deleted
     *        True if the search domain has been deleted. The system must clean up resources dedicated to the search
     *        domain when <a>DeleteDomain</a> is called. Newly deleted search domains are returned from
     *        <a>DescribeDomains</a> with a true value for IsDeleted for several minutes until resource cleanup is
     *        complete.
     */

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * True if the search domain has been deleted. The system must clean up resources dedicated to the search domain
     * when <a>DeleteDomain</a> is called. Newly deleted search domains are returned from <a>DescribeDomains</a> with a
     * true value for IsDeleted for several minutes until resource cleanup is complete.
     * </p>
     * 
     * @return True if the search domain has been deleted. The system must clean up resources dedicated to the search
     *         domain when <a>DeleteDomain</a> is called. Newly deleted search domains are returned from
     *         <a>DescribeDomains</a> with a true value for IsDeleted for several minutes until resource cleanup is
     *         complete.
     */

    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * True if the search domain has been deleted. The system must clean up resources dedicated to the search domain
     * when <a>DeleteDomain</a> is called. Newly deleted search domains are returned from <a>DescribeDomains</a> with a
     * true value for IsDeleted for several minutes until resource cleanup is complete.
     * </p>
     * 
     * @param deleted
     *        True if the search domain has been deleted. The system must clean up resources dedicated to the search
     *        domain when <a>DeleteDomain</a> is called. Newly deleted search domains are returned from
     *        <a>DescribeDomains</a> with a true value for IsDeleted for several minutes until resource cleanup is
     *        complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withDeleted(Boolean deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * True if the search domain has been deleted. The system must clean up resources dedicated to the search domain
     * when <a>DeleteDomain</a> is called. Newly deleted search domains are returned from <a>DescribeDomains</a> with a
     * true value for IsDeleted for several minutes until resource cleanup is complete.
     * </p>
     * 
     * @return True if the search domain has been deleted. The system must clean up resources dedicated to the search
     *         domain when <a>DeleteDomain</a> is called. Newly deleted search domains are returned from
     *         <a>DescribeDomains</a> with a true value for IsDeleted for several minutes until resource cleanup is
     *         complete.
     */

    public Boolean isDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * The service endpoint for updating documents in a search domain.
     * </p>
     * 
     * @param docService
     *        The service endpoint for updating documents in a search domain.
     */

    public void setDocService(ServiceEndpoint docService) {
        this.docService = docService;
    }

    /**
     * <p>
     * The service endpoint for updating documents in a search domain.
     * </p>
     * 
     * @return The service endpoint for updating documents in a search domain.
     */

    public ServiceEndpoint getDocService() {
        return this.docService;
    }

    /**
     * <p>
     * The service endpoint for updating documents in a search domain.
     * </p>
     * 
     * @param docService
     *        The service endpoint for updating documents in a search domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withDocService(ServiceEndpoint docService) {
        setDocService(docService);
        return this;
    }

    /**
     * <p>
     * The service endpoint for requesting search results from a search domain.
     * </p>
     * 
     * @param searchService
     *        The service endpoint for requesting search results from a search domain.
     */

    public void setSearchService(ServiceEndpoint searchService) {
        this.searchService = searchService;
    }

    /**
     * <p>
     * The service endpoint for requesting search results from a search domain.
     * </p>
     * 
     * @return The service endpoint for requesting search results from a search domain.
     */

    public ServiceEndpoint getSearchService() {
        return this.searchService;
    }

    /**
     * <p>
     * The service endpoint for requesting search results from a search domain.
     * </p>
     * 
     * @param searchService
     *        The service endpoint for requesting search results from a search domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withSearchService(ServiceEndpoint searchService) {
        setSearchService(searchService);
        return this;
    }

    /**
     * <p>
     * True if <a>IndexDocuments</a> needs to be called to activate the current domain configuration.
     * </p>
     * 
     * @param requiresIndexDocuments
     *        True if <a>IndexDocuments</a> needs to be called to activate the current domain configuration.
     */

    public void setRequiresIndexDocuments(Boolean requiresIndexDocuments) {
        this.requiresIndexDocuments = requiresIndexDocuments;
    }

    /**
     * <p>
     * True if <a>IndexDocuments</a> needs to be called to activate the current domain configuration.
     * </p>
     * 
     * @return True if <a>IndexDocuments</a> needs to be called to activate the current domain configuration.
     */

    public Boolean getRequiresIndexDocuments() {
        return this.requiresIndexDocuments;
    }

    /**
     * <p>
     * True if <a>IndexDocuments</a> needs to be called to activate the current domain configuration.
     * </p>
     * 
     * @param requiresIndexDocuments
     *        True if <a>IndexDocuments</a> needs to be called to activate the current domain configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withRequiresIndexDocuments(Boolean requiresIndexDocuments) {
        setRequiresIndexDocuments(requiresIndexDocuments);
        return this;
    }

    /**
     * <p>
     * True if <a>IndexDocuments</a> needs to be called to activate the current domain configuration.
     * </p>
     * 
     * @return True if <a>IndexDocuments</a> needs to be called to activate the current domain configuration.
     */

    public Boolean isRequiresIndexDocuments() {
        return this.requiresIndexDocuments;
    }

    /**
     * <p>
     * True if processing is being done to activate the current domain configuration.
     * </p>
     * 
     * @param processing
     *        True if processing is being done to activate the current domain configuration.
     */

    public void setProcessing(Boolean processing) {
        this.processing = processing;
    }

    /**
     * <p>
     * True if processing is being done to activate the current domain configuration.
     * </p>
     * 
     * @return True if processing is being done to activate the current domain configuration.
     */

    public Boolean getProcessing() {
        return this.processing;
    }

    /**
     * <p>
     * True if processing is being done to activate the current domain configuration.
     * </p>
     * 
     * @param processing
     *        True if processing is being done to activate the current domain configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withProcessing(Boolean processing) {
        setProcessing(processing);
        return this;
    }

    /**
     * <p>
     * True if processing is being done to activate the current domain configuration.
     * </p>
     * 
     * @return True if processing is being done to activate the current domain configuration.
     */

    public Boolean isProcessing() {
        return this.processing;
    }

    /**
     * <p>
     * The instance type that is being used to process search requests.
     * </p>
     * 
     * @param searchInstanceType
     *        The instance type that is being used to process search requests.
     */

    public void setSearchInstanceType(String searchInstanceType) {
        this.searchInstanceType = searchInstanceType;
    }

    /**
     * <p>
     * The instance type that is being used to process search requests.
     * </p>
     * 
     * @return The instance type that is being used to process search requests.
     */

    public String getSearchInstanceType() {
        return this.searchInstanceType;
    }

    /**
     * <p>
     * The instance type that is being used to process search requests.
     * </p>
     * 
     * @param searchInstanceType
     *        The instance type that is being used to process search requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withSearchInstanceType(String searchInstanceType) {
        setSearchInstanceType(searchInstanceType);
        return this;
    }

    /**
     * <p>
     * The number of partitions across which the search index is spread.
     * </p>
     * 
     * @param searchPartitionCount
     *        The number of partitions across which the search index is spread.
     */

    public void setSearchPartitionCount(Integer searchPartitionCount) {
        this.searchPartitionCount = searchPartitionCount;
    }

    /**
     * <p>
     * The number of partitions across which the search index is spread.
     * </p>
     * 
     * @return The number of partitions across which the search index is spread.
     */

    public Integer getSearchPartitionCount() {
        return this.searchPartitionCount;
    }

    /**
     * <p>
     * The number of partitions across which the search index is spread.
     * </p>
     * 
     * @param searchPartitionCount
     *        The number of partitions across which the search index is spread.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withSearchPartitionCount(Integer searchPartitionCount) {
        setSearchPartitionCount(searchPartitionCount);
        return this;
    }

    /**
     * <p>
     * The number of search instances that are available to process search requests.
     * </p>
     * 
     * @param searchInstanceCount
     *        The number of search instances that are available to process search requests.
     */

    public void setSearchInstanceCount(Integer searchInstanceCount) {
        this.searchInstanceCount = searchInstanceCount;
    }

    /**
     * <p>
     * The number of search instances that are available to process search requests.
     * </p>
     * 
     * @return The number of search instances that are available to process search requests.
     */

    public Integer getSearchInstanceCount() {
        return this.searchInstanceCount;
    }

    /**
     * <p>
     * The number of search instances that are available to process search requests.
     * </p>
     * 
     * @param searchInstanceCount
     *        The number of search instances that are available to process search requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withSearchInstanceCount(Integer searchInstanceCount) {
        setSearchInstanceCount(searchInstanceCount);
        return this;
    }

    /**
     * @param limits
     */

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    /**
     * @return
     */

    public Limits getLimits() {
        return this.limits;
    }

    /**
     * @param limits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withLimits(Limits limits) {
        setLimits(limits);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDeleted() != null)
            sb.append("Deleted: ").append(getDeleted()).append(",");
        if (getDocService() != null)
            sb.append("DocService: ").append(getDocService()).append(",");
        if (getSearchService() != null)
            sb.append("SearchService: ").append(getSearchService()).append(",");
        if (getRequiresIndexDocuments() != null)
            sb.append("RequiresIndexDocuments: ").append(getRequiresIndexDocuments()).append(",");
        if (getProcessing() != null)
            sb.append("Processing: ").append(getProcessing()).append(",");
        if (getSearchInstanceType() != null)
            sb.append("SearchInstanceType: ").append(getSearchInstanceType()).append(",");
        if (getSearchPartitionCount() != null)
            sb.append("SearchPartitionCount: ").append(getSearchPartitionCount()).append(",");
        if (getSearchInstanceCount() != null)
            sb.append("SearchInstanceCount: ").append(getSearchInstanceCount()).append(",");
        if (getLimits() != null)
            sb.append("Limits: ").append(getLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainStatus == false)
            return false;
        DomainStatus other = (DomainStatus) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
            return false;
        if (other.getDocService() == null ^ this.getDocService() == null)
            return false;
        if (other.getDocService() != null && other.getDocService().equals(this.getDocService()) == false)
            return false;
        if (other.getSearchService() == null ^ this.getSearchService() == null)
            return false;
        if (other.getSearchService() != null && other.getSearchService().equals(this.getSearchService()) == false)
            return false;
        if (other.getRequiresIndexDocuments() == null ^ this.getRequiresIndexDocuments() == null)
            return false;
        if (other.getRequiresIndexDocuments() != null && other.getRequiresIndexDocuments().equals(this.getRequiresIndexDocuments()) == false)
            return false;
        if (other.getProcessing() == null ^ this.getProcessing() == null)
            return false;
        if (other.getProcessing() != null && other.getProcessing().equals(this.getProcessing()) == false)
            return false;
        if (other.getSearchInstanceType() == null ^ this.getSearchInstanceType() == null)
            return false;
        if (other.getSearchInstanceType() != null && other.getSearchInstanceType().equals(this.getSearchInstanceType()) == false)
            return false;
        if (other.getSearchPartitionCount() == null ^ this.getSearchPartitionCount() == null)
            return false;
        if (other.getSearchPartitionCount() != null && other.getSearchPartitionCount().equals(this.getSearchPartitionCount()) == false)
            return false;
        if (other.getSearchInstanceCount() == null ^ this.getSearchInstanceCount() == null)
            return false;
        if (other.getSearchInstanceCount() != null && other.getSearchInstanceCount().equals(this.getSearchInstanceCount()) == false)
            return false;
        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode + ((getDocService() == null) ? 0 : getDocService().hashCode());
        hashCode = prime * hashCode + ((getSearchService() == null) ? 0 : getSearchService().hashCode());
        hashCode = prime * hashCode + ((getRequiresIndexDocuments() == null) ? 0 : getRequiresIndexDocuments().hashCode());
        hashCode = prime * hashCode + ((getProcessing() == null) ? 0 : getProcessing().hashCode());
        hashCode = prime * hashCode + ((getSearchInstanceType() == null) ? 0 : getSearchInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSearchPartitionCount() == null) ? 0 : getSearchPartitionCount().hashCode());
        hashCode = prime * hashCode + ((getSearchInstanceCount() == null) ? 0 : getSearchInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        return hashCode;
    }

    @Override
    public DomainStatus clone() {
        try {
            return (DomainStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
