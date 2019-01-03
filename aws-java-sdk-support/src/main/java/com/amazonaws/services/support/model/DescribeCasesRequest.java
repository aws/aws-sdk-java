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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> caseIdList;
    /**
     * <p>
     * The ID displayed for a case in the AWS Support Center user interface.
     * </p>
     */
    private String displayId;
    /**
     * <p>
     * The start date for a filtered date search on support case communications. Case communications are available for
     * 12 months after creation.
     * </p>
     */
    private String afterTime;
    /**
     * <p>
     * The end date for a filtered date search on support case communications. Case communications are available for 12
     * months after creation.
     * </p>
     */
    private String beforeTime;
    /**
     * <p>
     * Specifies whether resolved support cases should be included in the <a>DescribeCases</a> results. The default is
     * <i>false</i>.
     * </p>
     */
    private Boolean includeResolvedCases;
    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     */
    private String language;
    /**
     * <p>
     * Specifies whether communications should be included in the <a>DescribeCases</a> results. The default is
     * <i>true</i>.
     * </p>
     */
    private Boolean includeCommunications;

    /**
     * <p>
     * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
     * </p>
     * 
     * @return A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
     */

    public java.util.List<String> getCaseIdList() {
        if (caseIdList == null) {
            caseIdList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return caseIdList;
    }

    /**
     * <p>
     * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
     * </p>
     * 
     * @param caseIdList
     *        A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
     */

    public void setCaseIdList(java.util.Collection<String> caseIdList) {
        if (caseIdList == null) {
            this.caseIdList = null;
            return;
        }

        this.caseIdList = new com.amazonaws.internal.SdkInternalList<String>(caseIdList);
    }

    /**
     * <p>
     * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaseIdList(java.util.Collection)} or {@link #withCaseIdList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param caseIdList
     *        A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesRequest withCaseIdList(String... caseIdList) {
        if (this.caseIdList == null) {
            setCaseIdList(new com.amazonaws.internal.SdkInternalList<String>(caseIdList.length));
        }
        for (String ele : caseIdList) {
            this.caseIdList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
     * </p>
     * 
     * @param caseIdList
     *        A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesRequest withCaseIdList(java.util.Collection<String> caseIdList) {
        setCaseIdList(caseIdList);
        return this;
    }

    /**
     * <p>
     * The ID displayed for a case in the AWS Support Center user interface.
     * </p>
     * 
     * @param displayId
     *        The ID displayed for a case in the AWS Support Center user interface.
     */

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    /**
     * <p>
     * The ID displayed for a case in the AWS Support Center user interface.
     * </p>
     * 
     * @return The ID displayed for a case in the AWS Support Center user interface.
     */

    public String getDisplayId() {
        return this.displayId;
    }

    /**
     * <p>
     * The ID displayed for a case in the AWS Support Center user interface.
     * </p>
     * 
     * @param displayId
     *        The ID displayed for a case in the AWS Support Center user interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesRequest withDisplayId(String displayId) {
        setDisplayId(displayId);
        return this;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications. Case communications are available for
     * 12 months after creation.
     * </p>
     * 
     * @param afterTime
     *        The start date for a filtered date search on support case communications. Case communications are
     *        available for 12 months after creation.
     */

    public void setAfterTime(String afterTime) {
        this.afterTime = afterTime;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications. Case communications are available for
     * 12 months after creation.
     * </p>
     * 
     * @return The start date for a filtered date search on support case communications. Case communications are
     *         available for 12 months after creation.
     */

    public String getAfterTime() {
        return this.afterTime;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications. Case communications are available for
     * 12 months after creation.
     * </p>
     * 
     * @param afterTime
     *        The start date for a filtered date search on support case communications. Case communications are
     *        available for 12 months after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesRequest withAfterTime(String afterTime) {
        setAfterTime(afterTime);
        return this;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications. Case communications are available for 12
     * months after creation.
     * </p>
     * 
     * @param beforeTime
     *        The end date for a filtered date search on support case communications. Case communications are available
     *        for 12 months after creation.
     */

    public void setBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications. Case communications are available for 12
     * months after creation.
     * </p>
     * 
     * @return The end date for a filtered date search on support case communications. Case communications are available
     *         for 12 months after creation.
     */

    public String getBeforeTime() {
        return this.beforeTime;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications. Case communications are available for 12
     * months after creation.
     * </p>
     * 
     * @param beforeTime
     *        The end date for a filtered date search on support case communications. Case communications are available
     *        for 12 months after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesRequest withBeforeTime(String beforeTime) {
        setBeforeTime(beforeTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether resolved support cases should be included in the <a>DescribeCases</a> results. The default is
     * <i>false</i>.
     * </p>
     * 
     * @param includeResolvedCases
     *        Specifies whether resolved support cases should be included in the <a>DescribeCases</a> results. The
     *        default is <i>false</i>.
     */

    public void setIncludeResolvedCases(Boolean includeResolvedCases) {
        this.includeResolvedCases = includeResolvedCases;
    }

    /**
     * <p>
     * Specifies whether resolved support cases should be included in the <a>DescribeCases</a> results. The default is
     * <i>false</i>.
     * </p>
     * 
     * @return Specifies whether resolved support cases should be included in the <a>DescribeCases</a> results. The
     *         default is <i>false</i>.
     */

    public Boolean getIncludeResolvedCases() {
        return this.includeResolvedCases;
    }

    /**
     * <p>
     * Specifies whether resolved support cases should be included in the <a>DescribeCases</a> results. The default is
     * <i>false</i>.
     * </p>
     * 
     * @param includeResolvedCases
     *        Specifies whether resolved support cases should be included in the <a>DescribeCases</a> results. The
     *        default is <i>false</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesRequest withIncludeResolvedCases(Boolean includeResolvedCases) {
        setIncludeResolvedCases(includeResolvedCases);
        return this;
    }

    /**
     * <p>
     * Specifies whether resolved support cases should be included in the <a>DescribeCases</a> results. The default is
     * <i>false</i>.
     * </p>
     * 
     * @return Specifies whether resolved support cases should be included in the <a>DescribeCases</a> results. The
     *         default is <i>false</i>.
     */

    public Boolean isIncludeResolvedCases() {
        return this.includeResolvedCases;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @param nextToken
     *        A resumption point for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @return A resumption point for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * 
     * @param nextToken
     *        A resumption point for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return before paginating.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * 
     * @return The maximum number of results to return before paginating.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return before paginating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     * 
     * @param language
     *        The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English
     *        ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     * 
     * @return The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English
     *         ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     * 
     * @param language
     *        The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English
     *        ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesRequest withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * Specifies whether communications should be included in the <a>DescribeCases</a> results. The default is
     * <i>true</i>.
     * </p>
     * 
     * @param includeCommunications
     *        Specifies whether communications should be included in the <a>DescribeCases</a> results. The default is
     *        <i>true</i>.
     */

    public void setIncludeCommunications(Boolean includeCommunications) {
        this.includeCommunications = includeCommunications;
    }

    /**
     * <p>
     * Specifies whether communications should be included in the <a>DescribeCases</a> results. The default is
     * <i>true</i>.
     * </p>
     * 
     * @return Specifies whether communications should be included in the <a>DescribeCases</a> results. The default is
     *         <i>true</i>.
     */

    public Boolean getIncludeCommunications() {
        return this.includeCommunications;
    }

    /**
     * <p>
     * Specifies whether communications should be included in the <a>DescribeCases</a> results. The default is
     * <i>true</i>.
     * </p>
     * 
     * @param includeCommunications
     *        Specifies whether communications should be included in the <a>DescribeCases</a> results. The default is
     *        <i>true</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCasesRequest withIncludeCommunications(Boolean includeCommunications) {
        setIncludeCommunications(includeCommunications);
        return this;
    }

    /**
     * <p>
     * Specifies whether communications should be included in the <a>DescribeCases</a> results. The default is
     * <i>true</i>.
     * </p>
     * 
     * @return Specifies whether communications should be included in the <a>DescribeCases</a> results. The default is
     *         <i>true</i>.
     */

    public Boolean isIncludeCommunications() {
        return this.includeCommunications;
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
        if (getCaseIdList() != null)
            sb.append("CaseIdList: ").append(getCaseIdList()).append(",");
        if (getDisplayId() != null)
            sb.append("DisplayId: ").append(getDisplayId()).append(",");
        if (getAfterTime() != null)
            sb.append("AfterTime: ").append(getAfterTime()).append(",");
        if (getBeforeTime() != null)
            sb.append("BeforeTime: ").append(getBeforeTime()).append(",");
        if (getIncludeResolvedCases() != null)
            sb.append("IncludeResolvedCases: ").append(getIncludeResolvedCases()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getIncludeCommunications() != null)
            sb.append("IncludeCommunications: ").append(getIncludeCommunications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCasesRequest == false)
            return false;
        DescribeCasesRequest other = (DescribeCasesRequest) obj;
        if (other.getCaseIdList() == null ^ this.getCaseIdList() == null)
            return false;
        if (other.getCaseIdList() != null && other.getCaseIdList().equals(this.getCaseIdList()) == false)
            return false;
        if (other.getDisplayId() == null ^ this.getDisplayId() == null)
            return false;
        if (other.getDisplayId() != null && other.getDisplayId().equals(this.getDisplayId()) == false)
            return false;
        if (other.getAfterTime() == null ^ this.getAfterTime() == null)
            return false;
        if (other.getAfterTime() != null && other.getAfterTime().equals(this.getAfterTime()) == false)
            return false;
        if (other.getBeforeTime() == null ^ this.getBeforeTime() == null)
            return false;
        if (other.getBeforeTime() != null && other.getBeforeTime().equals(this.getBeforeTime()) == false)
            return false;
        if (other.getIncludeResolvedCases() == null ^ this.getIncludeResolvedCases() == null)
            return false;
        if (other.getIncludeResolvedCases() != null && other.getIncludeResolvedCases().equals(this.getIncludeResolvedCases()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getIncludeCommunications() == null ^ this.getIncludeCommunications() == null)
            return false;
        if (other.getIncludeCommunications() != null && other.getIncludeCommunications().equals(this.getIncludeCommunications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseIdList() == null) ? 0 : getCaseIdList().hashCode());
        hashCode = prime * hashCode + ((getDisplayId() == null) ? 0 : getDisplayId().hashCode());
        hashCode = prime * hashCode + ((getAfterTime() == null) ? 0 : getAfterTime().hashCode());
        hashCode = prime * hashCode + ((getBeforeTime() == null) ? 0 : getBeforeTime().hashCode());
        hashCode = prime * hashCode + ((getIncludeResolvedCases() == null) ? 0 : getIncludeResolvedCases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getIncludeCommunications() == null) ? 0 : getIncludeCommunications().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCasesRequest clone() {
        return (DescribeCasesRequest) super.clone();
    }

}
