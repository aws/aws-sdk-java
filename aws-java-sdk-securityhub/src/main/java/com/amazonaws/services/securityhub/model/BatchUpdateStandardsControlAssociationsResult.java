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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateStandardsControlAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateStandardsControlAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) whose enablement status in a specified standard couldn't be updated.
     * </p>
     */
    private java.util.List<UnprocessedStandardsControlAssociationUpdate> unprocessedAssociationUpdates;

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) whose enablement status in a specified standard couldn't be updated.
     * </p>
     * 
     * @return A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *         mix of both parameters) whose enablement status in a specified standard couldn't be updated.
     */

    public java.util.List<UnprocessedStandardsControlAssociationUpdate> getUnprocessedAssociationUpdates() {
        return unprocessedAssociationUpdates;
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) whose enablement status in a specified standard couldn't be updated.
     * </p>
     * 
     * @param unprocessedAssociationUpdates
     *        A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *        mix of both parameters) whose enablement status in a specified standard couldn't be updated.
     */

    public void setUnprocessedAssociationUpdates(java.util.Collection<UnprocessedStandardsControlAssociationUpdate> unprocessedAssociationUpdates) {
        if (unprocessedAssociationUpdates == null) {
            this.unprocessedAssociationUpdates = null;
            return;
        }

        this.unprocessedAssociationUpdates = new java.util.ArrayList<UnprocessedStandardsControlAssociationUpdate>(unprocessedAssociationUpdates);
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) whose enablement status in a specified standard couldn't be updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAssociationUpdates(java.util.Collection)} or
     * {@link #withUnprocessedAssociationUpdates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAssociationUpdates
     *        A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *        mix of both parameters) whose enablement status in a specified standard couldn't be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateStandardsControlAssociationsResult withUnprocessedAssociationUpdates(
            UnprocessedStandardsControlAssociationUpdate... unprocessedAssociationUpdates) {
        if (this.unprocessedAssociationUpdates == null) {
            setUnprocessedAssociationUpdates(new java.util.ArrayList<UnprocessedStandardsControlAssociationUpdate>(unprocessedAssociationUpdates.length));
        }
        for (UnprocessedStandardsControlAssociationUpdate ele : unprocessedAssociationUpdates) {
            this.unprocessedAssociationUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) whose enablement status in a specified standard couldn't be updated.
     * </p>
     * 
     * @param unprocessedAssociationUpdates
     *        A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *        mix of both parameters) whose enablement status in a specified standard couldn't be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateStandardsControlAssociationsResult withUnprocessedAssociationUpdates(
            java.util.Collection<UnprocessedStandardsControlAssociationUpdate> unprocessedAssociationUpdates) {
        setUnprocessedAssociationUpdates(unprocessedAssociationUpdates);
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
        if (getUnprocessedAssociationUpdates() != null)
            sb.append("UnprocessedAssociationUpdates: ").append(getUnprocessedAssociationUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateStandardsControlAssociationsResult == false)
            return false;
        BatchUpdateStandardsControlAssociationsResult other = (BatchUpdateStandardsControlAssociationsResult) obj;
        if (other.getUnprocessedAssociationUpdates() == null ^ this.getUnprocessedAssociationUpdates() == null)
            return false;
        if (other.getUnprocessedAssociationUpdates() != null
                && other.getUnprocessedAssociationUpdates().equals(this.getUnprocessedAssociationUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnprocessedAssociationUpdates() == null) ? 0 : getUnprocessedAssociationUpdates().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateStandardsControlAssociationsResult clone() {
        try {
            return (BatchUpdateStandardsControlAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
