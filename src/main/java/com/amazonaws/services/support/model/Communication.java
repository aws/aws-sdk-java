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


/**
 * <p>
 * Object that exposes the fields used by a communication for an AWS Support case.
 * </p>
 */
public class Communication implements Serializable {

    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    private String caseId;

    /**
     * Contains the text of the the commmunication between the customer and
     * AWS Support.
     */
    private String body;

    /**
     * Email address of the account that submitted the AWS Support case.
     */
    private String submittedBy;

    /**
     * Time the support case was created.
     */
    private String timeCreated;

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
    public Communication withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * Contains the text of the the commmunication between the customer and
     * AWS Support.
     *
     * @return Contains the text of the the commmunication between the customer and
     *         AWS Support.
     */
    public String getBody() {
        return body;
    }
    
    /**
     * Contains the text of the the commmunication between the customer and
     * AWS Support.
     *
     * @param body Contains the text of the the commmunication between the customer and
     *         AWS Support.
     */
    public void setBody(String body) {
        this.body = body;
    }
    
    /**
     * Contains the text of the the commmunication between the customer and
     * AWS Support.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param body Contains the text of the the commmunication between the customer and
     *         AWS Support.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Communication withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Email address of the account that submitted the AWS Support case.
     *
     * @return Email address of the account that submitted the AWS Support case.
     */
    public String getSubmittedBy() {
        return submittedBy;
    }
    
    /**
     * Email address of the account that submitted the AWS Support case.
     *
     * @param submittedBy Email address of the account that submitted the AWS Support case.
     */
    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }
    
    /**
     * Email address of the account that submitted the AWS Support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param submittedBy Email address of the account that submitted the AWS Support case.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Communication withSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * Time the support case was created.
     *
     * @return Time the support case was created.
     */
    public String getTimeCreated() {
        return timeCreated;
    }
    
    /**
     * Time the support case was created.
     *
     * @param timeCreated Time the support case was created.
     */
    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }
    
    /**
     * Time the support case was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeCreated Time the support case was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Communication withTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
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
        if (getCaseId() != null) sb.append("CaseId: " + getCaseId() + ",");
        if (getBody() != null) sb.append("Body: " + getBody() + ",");
        if (getSubmittedBy() != null) sb.append("SubmittedBy: " + getSubmittedBy() + ",");
        if (getTimeCreated() != null) sb.append("TimeCreated: " + getTimeCreated() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode()); 
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode()); 
        hashCode = prime * hashCode + ((getSubmittedBy() == null) ? 0 : getSubmittedBy().hashCode()); 
        hashCode = prime * hashCode + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Communication == false) return false;
        Communication other = (Communication)obj;
        
        if (other.getCaseId() == null ^ this.getCaseId() == null) return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false) return false; 
        if (other.getBody() == null ^ this.getBody() == null) return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false) return false; 
        if (other.getSubmittedBy() == null ^ this.getSubmittedBy() == null) return false;
        if (other.getSubmittedBy() != null && other.getSubmittedBy().equals(this.getSubmittedBy()) == false) return false; 
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null) return false;
        if (other.getTimeCreated() != null && other.getTimeCreated().equals(this.getTimeCreated()) == false) return false; 
        return true;
    }
    
}
    