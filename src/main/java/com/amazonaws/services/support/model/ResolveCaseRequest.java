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
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#resolveCase(ResolveCaseRequest) ResolveCase operation}.
 * <p>
 * Takes a <i>CaseId</i> and returns the initial state of the case along with the state of the case after the call to <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"> ResolveCase </a> completed.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#resolveCase(ResolveCaseRequest)
 */
public class ResolveCaseRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    private String caseId;

    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @return String that indicates the AWS Support caseID requested or returned in
     *         the call. The caseID is an alphanumeric string formatted as shown in
     *         this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    public String getCaseId() {
        return caseId;
    }
    
    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @param caseId String that indicates the AWS Support caseID requested or returned in
     *         the call. The caseID is an alphanumeric string formatted as shown in
     *         this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }
    
    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param caseId String that indicates the AWS Support caseID requested or returned in
     *         the call. The caseID is an alphanumeric string formatted as shown in
     *         this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResolveCaseRequest withCaseId(String caseId) {
        this.caseId = caseId;
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
        if (getCaseId() != null) sb.append("CaseId: " + getCaseId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResolveCaseRequest == false) return false;
        ResolveCaseRequest other = (ResolveCaseRequest)obj;
        
        if (other.getCaseId() == null ^ this.getCaseId() == null) return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false) return false; 
        return true;
    }
    
}
    