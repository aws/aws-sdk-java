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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteAnalysisTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAnalysisTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * The identifier for the analysis template resource.
     * </p>
     */
    private String analysisTemplateIdentifier;

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @param membershipIdentifier
     *        The identifier for a membership resource.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @return The identifier for a membership resource.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @param membershipIdentifier
     *        The identifier for a membership resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnalysisTemplateRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier for the analysis template resource.
     * </p>
     * 
     * @param analysisTemplateIdentifier
     *        The identifier for the analysis template resource.
     */

    public void setAnalysisTemplateIdentifier(String analysisTemplateIdentifier) {
        this.analysisTemplateIdentifier = analysisTemplateIdentifier;
    }

    /**
     * <p>
     * The identifier for the analysis template resource.
     * </p>
     * 
     * @return The identifier for the analysis template resource.
     */

    public String getAnalysisTemplateIdentifier() {
        return this.analysisTemplateIdentifier;
    }

    /**
     * <p>
     * The identifier for the analysis template resource.
     * </p>
     * 
     * @param analysisTemplateIdentifier
     *        The identifier for the analysis template resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnalysisTemplateRequest withAnalysisTemplateIdentifier(String analysisTemplateIdentifier) {
        setAnalysisTemplateIdentifier(analysisTemplateIdentifier);
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
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getAnalysisTemplateIdentifier() != null)
            sb.append("AnalysisTemplateIdentifier: ").append(getAnalysisTemplateIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAnalysisTemplateRequest == false)
            return false;
        DeleteAnalysisTemplateRequest other = (DeleteAnalysisTemplateRequest) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getAnalysisTemplateIdentifier() == null ^ this.getAnalysisTemplateIdentifier() == null)
            return false;
        if (other.getAnalysisTemplateIdentifier() != null && other.getAnalysisTemplateIdentifier().equals(this.getAnalysisTemplateIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAnalysisTemplateIdentifier() == null) ? 0 : getAnalysisTemplateIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAnalysisTemplateRequest clone() {
        return (DeleteAnalysisTemplateRequest) super.clone();
    }

}
