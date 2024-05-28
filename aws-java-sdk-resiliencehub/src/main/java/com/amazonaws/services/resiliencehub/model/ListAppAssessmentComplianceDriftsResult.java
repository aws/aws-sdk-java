/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessmentComplianceDrifts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppAssessmentComplianceDriftsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Indicates compliance drifts (recovery time objective (RTO) and recovery point objective (RPO)) detected for an
     * assessed entity.
     * </p>
     */
    private java.util.List<ComplianceDrift> complianceDrifts;
    /**
     * <p>
     * Token number of the next application to be checked for compliance and regulatory requirements from the list of
     * applications.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Indicates compliance drifts (recovery time objective (RTO) and recovery point objective (RPO)) detected for an
     * assessed entity.
     * </p>
     * 
     * @return Indicates compliance drifts (recovery time objective (RTO) and recovery point objective (RPO)) detected
     *         for an assessed entity.
     */

    public java.util.List<ComplianceDrift> getComplianceDrifts() {
        return complianceDrifts;
    }

    /**
     * <p>
     * Indicates compliance drifts (recovery time objective (RTO) and recovery point objective (RPO)) detected for an
     * assessed entity.
     * </p>
     * 
     * @param complianceDrifts
     *        Indicates compliance drifts (recovery time objective (RTO) and recovery point objective (RPO)) detected
     *        for an assessed entity.
     */

    public void setComplianceDrifts(java.util.Collection<ComplianceDrift> complianceDrifts) {
        if (complianceDrifts == null) {
            this.complianceDrifts = null;
            return;
        }

        this.complianceDrifts = new java.util.ArrayList<ComplianceDrift>(complianceDrifts);
    }

    /**
     * <p>
     * Indicates compliance drifts (recovery time objective (RTO) and recovery point objective (RPO)) detected for an
     * assessed entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceDrifts(java.util.Collection)} or {@link #withComplianceDrifts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param complianceDrifts
     *        Indicates compliance drifts (recovery time objective (RTO) and recovery point objective (RPO)) detected
     *        for an assessed entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentComplianceDriftsResult withComplianceDrifts(ComplianceDrift... complianceDrifts) {
        if (this.complianceDrifts == null) {
            setComplianceDrifts(new java.util.ArrayList<ComplianceDrift>(complianceDrifts.length));
        }
        for (ComplianceDrift ele : complianceDrifts) {
            this.complianceDrifts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates compliance drifts (recovery time objective (RTO) and recovery point objective (RPO)) detected for an
     * assessed entity.
     * </p>
     * 
     * @param complianceDrifts
     *        Indicates compliance drifts (recovery time objective (RTO) and recovery point objective (RPO)) detected
     *        for an assessed entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentComplianceDriftsResult withComplianceDrifts(java.util.Collection<ComplianceDrift> complianceDrifts) {
        setComplianceDrifts(complianceDrifts);
        return this;
    }

    /**
     * <p>
     * Token number of the next application to be checked for compliance and regulatory requirements from the list of
     * applications.
     * </p>
     * 
     * @param nextToken
     *        Token number of the next application to be checked for compliance and regulatory requirements from the
     *        list of applications.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token number of the next application to be checked for compliance and regulatory requirements from the list of
     * applications.
     * </p>
     * 
     * @return Token number of the next application to be checked for compliance and regulatory requirements from the
     *         list of applications.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token number of the next application to be checked for compliance and regulatory requirements from the list of
     * applications.
     * </p>
     * 
     * @param nextToken
     *        Token number of the next application to be checked for compliance and regulatory requirements from the
     *        list of applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentComplianceDriftsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getComplianceDrifts() != null)
            sb.append("ComplianceDrifts: ").append(getComplianceDrifts()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppAssessmentComplianceDriftsResult == false)
            return false;
        ListAppAssessmentComplianceDriftsResult other = (ListAppAssessmentComplianceDriftsResult) obj;
        if (other.getComplianceDrifts() == null ^ this.getComplianceDrifts() == null)
            return false;
        if (other.getComplianceDrifts() != null && other.getComplianceDrifts().equals(this.getComplianceDrifts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceDrifts() == null) ? 0 : getComplianceDrifts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppAssessmentComplianceDriftsResult clone() {
        try {
            return (ListAppAssessmentComplianceDriftsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
