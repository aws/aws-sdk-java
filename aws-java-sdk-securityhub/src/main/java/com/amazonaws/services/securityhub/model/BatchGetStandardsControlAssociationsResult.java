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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetStandardsControlAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetStandardsControlAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Provides the enablement status of a security control in a specified standard and other details for the control in
     * relation to the specified standard.
     * </p>
     */
    private java.util.List<StandardsControlAssociationDetail> standardsControlAssociationDetails;
    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) whose enablement status in a specified standard cannot be returned.
     * </p>
     */
    private java.util.List<UnprocessedStandardsControlAssociation> unprocessedAssociations;

    /**
     * <p>
     * Provides the enablement status of a security control in a specified standard and other details for the control in
     * relation to the specified standard.
     * </p>
     * 
     * @return Provides the enablement status of a security control in a specified standard and other details for the
     *         control in relation to the specified standard.
     */

    public java.util.List<StandardsControlAssociationDetail> getStandardsControlAssociationDetails() {
        return standardsControlAssociationDetails;
    }

    /**
     * <p>
     * Provides the enablement status of a security control in a specified standard and other details for the control in
     * relation to the specified standard.
     * </p>
     * 
     * @param standardsControlAssociationDetails
     *        Provides the enablement status of a security control in a specified standard and other details for the
     *        control in relation to the specified standard.
     */

    public void setStandardsControlAssociationDetails(java.util.Collection<StandardsControlAssociationDetail> standardsControlAssociationDetails) {
        if (standardsControlAssociationDetails == null) {
            this.standardsControlAssociationDetails = null;
            return;
        }

        this.standardsControlAssociationDetails = new java.util.ArrayList<StandardsControlAssociationDetail>(standardsControlAssociationDetails);
    }

    /**
     * <p>
     * Provides the enablement status of a security control in a specified standard and other details for the control in
     * relation to the specified standard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandardsControlAssociationDetails(java.util.Collection)} or
     * {@link #withStandardsControlAssociationDetails(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param standardsControlAssociationDetails
     *        Provides the enablement status of a security control in a specified standard and other details for the
     *        control in relation to the specified standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetStandardsControlAssociationsResult withStandardsControlAssociationDetails(
            StandardsControlAssociationDetail... standardsControlAssociationDetails) {
        if (this.standardsControlAssociationDetails == null) {
            setStandardsControlAssociationDetails(new java.util.ArrayList<StandardsControlAssociationDetail>(standardsControlAssociationDetails.length));
        }
        for (StandardsControlAssociationDetail ele : standardsControlAssociationDetails) {
            this.standardsControlAssociationDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the enablement status of a security control in a specified standard and other details for the control in
     * relation to the specified standard.
     * </p>
     * 
     * @param standardsControlAssociationDetails
     *        Provides the enablement status of a security control in a specified standard and other details for the
     *        control in relation to the specified standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetStandardsControlAssociationsResult withStandardsControlAssociationDetails(
            java.util.Collection<StandardsControlAssociationDetail> standardsControlAssociationDetails) {
        setStandardsControlAssociationDetails(standardsControlAssociationDetails);
        return this;
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) whose enablement status in a specified standard cannot be returned.
     * </p>
     * 
     * @return A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *         mix of both parameters) whose enablement status in a specified standard cannot be returned.
     */

    public java.util.List<UnprocessedStandardsControlAssociation> getUnprocessedAssociations() {
        return unprocessedAssociations;
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) whose enablement status in a specified standard cannot be returned.
     * </p>
     * 
     * @param unprocessedAssociations
     *        A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *        mix of both parameters) whose enablement status in a specified standard cannot be returned.
     */

    public void setUnprocessedAssociations(java.util.Collection<UnprocessedStandardsControlAssociation> unprocessedAssociations) {
        if (unprocessedAssociations == null) {
            this.unprocessedAssociations = null;
            return;
        }

        this.unprocessedAssociations = new java.util.ArrayList<UnprocessedStandardsControlAssociation>(unprocessedAssociations);
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) whose enablement status in a specified standard cannot be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAssociations(java.util.Collection)} or
     * {@link #withUnprocessedAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAssociations
     *        A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *        mix of both parameters) whose enablement status in a specified standard cannot be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetStandardsControlAssociationsResult withUnprocessedAssociations(UnprocessedStandardsControlAssociation... unprocessedAssociations) {
        if (this.unprocessedAssociations == null) {
            setUnprocessedAssociations(new java.util.ArrayList<UnprocessedStandardsControlAssociation>(unprocessedAssociations.length));
        }
        for (UnprocessedStandardsControlAssociation ele : unprocessedAssociations) {
            this.unprocessedAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) whose enablement status in a specified standard cannot be returned.
     * </p>
     * 
     * @param unprocessedAssociations
     *        A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *        mix of both parameters) whose enablement status in a specified standard cannot be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetStandardsControlAssociationsResult withUnprocessedAssociations(
            java.util.Collection<UnprocessedStandardsControlAssociation> unprocessedAssociations) {
        setUnprocessedAssociations(unprocessedAssociations);
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
        if (getStandardsControlAssociationDetails() != null)
            sb.append("StandardsControlAssociationDetails: ").append(getStandardsControlAssociationDetails()).append(",");
        if (getUnprocessedAssociations() != null)
            sb.append("UnprocessedAssociations: ").append(getUnprocessedAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetStandardsControlAssociationsResult == false)
            return false;
        BatchGetStandardsControlAssociationsResult other = (BatchGetStandardsControlAssociationsResult) obj;
        if (other.getStandardsControlAssociationDetails() == null ^ this.getStandardsControlAssociationDetails() == null)
            return false;
        if (other.getStandardsControlAssociationDetails() != null
                && other.getStandardsControlAssociationDetails().equals(this.getStandardsControlAssociationDetails()) == false)
            return false;
        if (other.getUnprocessedAssociations() == null ^ this.getUnprocessedAssociations() == null)
            return false;
        if (other.getUnprocessedAssociations() != null && other.getUnprocessedAssociations().equals(this.getUnprocessedAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsControlAssociationDetails() == null) ? 0 : getStandardsControlAssociationDetails().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedAssociations() == null) ? 0 : getUnprocessedAssociations().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetStandardsControlAssociationsResult clone() {
        try {
            return (BatchGetStandardsControlAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
