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
package com.amazonaws.services.support.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#describeCases(DescribeCasesRequest) DescribeCases operation}.
 * <p>
 * This action returns a list of cases that you specify by passing one or more CaseIds. In addition, you can filter the cases by date by setting values
 * for the AfterTime and BeforeTime request parameters.
 * </p>
 * <p>
 * The response returns the following in JSON format:
 * </p>
 * <ol> <li>One or more <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"> CaseDetails </a> data types. </li>
 * <li>One or more <i>NextToken</i> objects, strings that specifies where to paginate the returned records represented by <i>CaseDetails</i> .</li>
 * </ol>
 *
 * @see com.amazonaws.services.support.AWSSupport#describeCases(DescribeCasesRequest)
 */
public class DescribeCasesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list of Strings comprising ID numbers for support cases you want
     * returned. The maximum number of cases is 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> caseIdList;

    /**
     * String that corresponds to the ID value displayed for a case in the
     * AWS Support Center user interface.
     */
    private String displayId;

    /**
     * Start date for a filtered date search on support case communications.
     */
    private String afterTime;

    /**
     * End date for a filtered date search on support case communications.
     */
    private String beforeTime;

    /**
     * Boolean that indicates whether or not resolved support cases should be
     * listed in the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"
     * title="DescribeCases">DescribeCases</a> search.
     */
    private Boolean includeResolvedCases;

    /**
     * Defines a resumption point for pagination.
     */
    private String nextToken;

    /**
     * Integer that sets the maximum number of results to return before
     * paginating.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     */
    private Integer maxResults;

    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     */
    private String language;

    /**
     * A list of Strings comprising ID numbers for support cases you want
     * returned. The maximum number of cases is 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return A list of Strings comprising ID numbers for support cases you want
     *         returned. The maximum number of cases is 100.
     */
    public java.util.List<String> getCaseIdList() {
        if (caseIdList == null) {
              caseIdList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              caseIdList.setAutoConstruct(true);
        }
        return caseIdList;
    }
    
    /**
     * A list of Strings comprising ID numbers for support cases you want
     * returned. The maximum number of cases is 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param caseIdList A list of Strings comprising ID numbers for support cases you want
     *         returned. The maximum number of cases is 100.
     */
    public void setCaseIdList(java.util.Collection<String> caseIdList) {
        if (caseIdList == null) {
            this.caseIdList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> caseIdListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(caseIdList.size());
        caseIdListCopy.addAll(caseIdList);
        this.caseIdList = caseIdListCopy;
    }
    
    /**
     * A list of Strings comprising ID numbers for support cases you want
     * returned. The maximum number of cases is 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param caseIdList A list of Strings comprising ID numbers for support cases you want
     *         returned. The maximum number of cases is 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesRequest withCaseIdList(String... caseIdList) {
        if (getCaseIdList() == null) setCaseIdList(new java.util.ArrayList<String>(caseIdList.length));
        for (String value : caseIdList) {
            getCaseIdList().add(value);
        }
        return this;
    }
    
    /**
     * A list of Strings comprising ID numbers for support cases you want
     * returned. The maximum number of cases is 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param caseIdList A list of Strings comprising ID numbers for support cases you want
     *         returned. The maximum number of cases is 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesRequest withCaseIdList(java.util.Collection<String> caseIdList) {
        if (caseIdList == null) {
            this.caseIdList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> caseIdListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(caseIdList.size());
            caseIdListCopy.addAll(caseIdList);
            this.caseIdList = caseIdListCopy;
        }

        return this;
    }

    /**
     * String that corresponds to the ID value displayed for a case in the
     * AWS Support Center user interface.
     *
     * @return String that corresponds to the ID value displayed for a case in the
     *         AWS Support Center user interface.
     */
    public String getDisplayId() {
        return displayId;
    }
    
    /**
     * String that corresponds to the ID value displayed for a case in the
     * AWS Support Center user interface.
     *
     * @param displayId String that corresponds to the ID value displayed for a case in the
     *         AWS Support Center user interface.
     */
    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }
    
    /**
     * String that corresponds to the ID value displayed for a case in the
     * AWS Support Center user interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param displayId String that corresponds to the ID value displayed for a case in the
     *         AWS Support Center user interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesRequest withDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }

    /**
     * Start date for a filtered date search on support case communications.
     *
     * @return Start date for a filtered date search on support case communications.
     */
    public String getAfterTime() {
        return afterTime;
    }
    
    /**
     * Start date for a filtered date search on support case communications.
     *
     * @param afterTime Start date for a filtered date search on support case communications.
     */
    public void setAfterTime(String afterTime) {
        this.afterTime = afterTime;
    }
    
    /**
     * Start date for a filtered date search on support case communications.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param afterTime Start date for a filtered date search on support case communications.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesRequest withAfterTime(String afterTime) {
        this.afterTime = afterTime;
        return this;
    }

    /**
     * End date for a filtered date search on support case communications.
     *
     * @return End date for a filtered date search on support case communications.
     */
    public String getBeforeTime() {
        return beforeTime;
    }
    
    /**
     * End date for a filtered date search on support case communications.
     *
     * @param beforeTime End date for a filtered date search on support case communications.
     */
    public void setBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
    }
    
    /**
     * End date for a filtered date search on support case communications.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param beforeTime End date for a filtered date search on support case communications.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesRequest withBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }

    /**
     * Boolean that indicates whether or not resolved support cases should be
     * listed in the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"
     * title="DescribeCases">DescribeCases</a> search.
     *
     * @return Boolean that indicates whether or not resolved support cases should be
     *         listed in the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"
     *         title="DescribeCases">DescribeCases</a> search.
     */
    public Boolean isIncludeResolvedCases() {
        return includeResolvedCases;
    }
    
    /**
     * Boolean that indicates whether or not resolved support cases should be
     * listed in the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"
     * title="DescribeCases">DescribeCases</a> search.
     *
     * @param includeResolvedCases Boolean that indicates whether or not resolved support cases should be
     *         listed in the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"
     *         title="DescribeCases">DescribeCases</a> search.
     */
    public void setIncludeResolvedCases(Boolean includeResolvedCases) {
        this.includeResolvedCases = includeResolvedCases;
    }
    
    /**
     * Boolean that indicates whether or not resolved support cases should be
     * listed in the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"
     * title="DescribeCases">DescribeCases</a> search.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeResolvedCases Boolean that indicates whether or not resolved support cases should be
     *         listed in the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"
     *         title="DescribeCases">DescribeCases</a> search.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesRequest withIncludeResolvedCases(Boolean includeResolvedCases) {
        this.includeResolvedCases = includeResolvedCases;
        return this;
    }

    /**
     * Boolean that indicates whether or not resolved support cases should be
     * listed in the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"
     * title="DescribeCases">DescribeCases</a> search.
     *
     * @return Boolean that indicates whether or not resolved support cases should be
     *         listed in the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"
     *         title="DescribeCases">DescribeCases</a> search.
     */
    public Boolean getIncludeResolvedCases() {
        return includeResolvedCases;
    }

    /**
     * Defines a resumption point for pagination.
     *
     * @return Defines a resumption point for pagination.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Defines a resumption point for pagination.
     *
     * @param nextToken Defines a resumption point for pagination.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Defines a resumption point for pagination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Defines a resumption point for pagination.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Integer that sets the maximum number of results to return before
     * paginating.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @return Integer that sets the maximum number of results to return before
     *         paginating.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * Integer that sets the maximum number of results to return before
     * paginating.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults Integer that sets the maximum number of results to return before
     *         paginating.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * Integer that sets the maximum number of results to return before
     * paginating.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults Integer that sets the maximum number of results to return before
     *         paginating.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     *
     * @return Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     */
    public String getLanguage() {
        return language;
    }
    
    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     *
     * @param language Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param language Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesRequest withLanguage(String language) {
        this.language = language;
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
        if (getCaseIdList() != null) sb.append("CaseIdList: " + getCaseIdList() + ",");
        if (getDisplayId() != null) sb.append("DisplayId: " + getDisplayId() + ",");
        if (getAfterTime() != null) sb.append("AfterTime: " + getAfterTime() + ",");
        if (getBeforeTime() != null) sb.append("BeforeTime: " + getBeforeTime() + ",");
        if (isIncludeResolvedCases() != null) sb.append("IncludeResolvedCases: " + isIncludeResolvedCases() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getLanguage() != null) sb.append("Language: " + getLanguage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCaseIdList() == null) ? 0 : getCaseIdList().hashCode()); 
        hashCode = prime * hashCode + ((getDisplayId() == null) ? 0 : getDisplayId().hashCode()); 
        hashCode = prime * hashCode + ((getAfterTime() == null) ? 0 : getAfterTime().hashCode()); 
        hashCode = prime * hashCode + ((getBeforeTime() == null) ? 0 : getBeforeTime().hashCode()); 
        hashCode = prime * hashCode + ((isIncludeResolvedCases() == null) ? 0 : isIncludeResolvedCases().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCasesRequest == false) return false;
        DescribeCasesRequest other = (DescribeCasesRequest)obj;
        
        if (other.getCaseIdList() == null ^ this.getCaseIdList() == null) return false;
        if (other.getCaseIdList() != null && other.getCaseIdList().equals(this.getCaseIdList()) == false) return false; 
        if (other.getDisplayId() == null ^ this.getDisplayId() == null) return false;
        if (other.getDisplayId() != null && other.getDisplayId().equals(this.getDisplayId()) == false) return false; 
        if (other.getAfterTime() == null ^ this.getAfterTime() == null) return false;
        if (other.getAfterTime() != null && other.getAfterTime().equals(this.getAfterTime()) == false) return false; 
        if (other.getBeforeTime() == null ^ this.getBeforeTime() == null) return false;
        if (other.getBeforeTime() != null && other.getBeforeTime().equals(this.getBeforeTime()) == false) return false; 
        if (other.isIncludeResolvedCases() == null ^ this.isIncludeResolvedCases() == null) return false;
        if (other.isIncludeResolvedCases() != null && other.isIncludeResolvedCases().equals(this.isIncludeResolvedCases()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getLanguage() == null ^ this.getLanguage() == null) return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false) return false; 
        return true;
    }
    
}
    