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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociationBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssociationBatchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the associations that succeeded.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AssociationDescription> successful;
    /**
     * <p>
     * Information about the associations that failed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FailedCreateAssociation> failed;

    /**
     * <p>
     * Information about the associations that succeeded.
     * </p>
     * 
     * @return Information about the associations that succeeded.
     */

    public java.util.List<AssociationDescription> getSuccessful() {
        if (successful == null) {
            successful = new com.amazonaws.internal.SdkInternalList<AssociationDescription>();
        }
        return successful;
    }

    /**
     * <p>
     * Information about the associations that succeeded.
     * </p>
     * 
     * @param successful
     *        Information about the associations that succeeded.
     */

    public void setSuccessful(java.util.Collection<AssociationDescription> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new com.amazonaws.internal.SdkInternalList<AssociationDescription>(successful);
    }

    /**
     * <p>
     * Information about the associations that succeeded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessful(java.util.Collection)} or {@link #withSuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param successful
     *        Information about the associations that succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationBatchResult withSuccessful(AssociationDescription... successful) {
        if (this.successful == null) {
            setSuccessful(new com.amazonaws.internal.SdkInternalList<AssociationDescription>(successful.length));
        }
        for (AssociationDescription ele : successful) {
            this.successful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associations that succeeded.
     * </p>
     * 
     * @param successful
     *        Information about the associations that succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationBatchResult withSuccessful(java.util.Collection<AssociationDescription> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * Information about the associations that failed.
     * </p>
     * 
     * @return Information about the associations that failed.
     */

    public java.util.List<FailedCreateAssociation> getFailed() {
        if (failed == null) {
            failed = new com.amazonaws.internal.SdkInternalList<FailedCreateAssociation>();
        }
        return failed;
    }

    /**
     * <p>
     * Information about the associations that failed.
     * </p>
     * 
     * @param failed
     *        Information about the associations that failed.
     */

    public void setFailed(java.util.Collection<FailedCreateAssociation> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }

        this.failed = new com.amazonaws.internal.SdkInternalList<FailedCreateAssociation>(failed);
    }

    /**
     * <p>
     * Information about the associations that failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailed(java.util.Collection)} or {@link #withFailed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failed
     *        Information about the associations that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationBatchResult withFailed(FailedCreateAssociation... failed) {
        if (this.failed == null) {
            setFailed(new com.amazonaws.internal.SdkInternalList<FailedCreateAssociation>(failed.length));
        }
        for (FailedCreateAssociation ele : failed) {
            this.failed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associations that failed.
     * </p>
     * 
     * @param failed
     *        Information about the associations that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationBatchResult withFailed(java.util.Collection<FailedCreateAssociation> failed) {
        setFailed(failed);
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
        if (getSuccessful() != null)
            sb.append("Successful: ").append(getSuccessful()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssociationBatchResult == false)
            return false;
        CreateAssociationBatchResult other = (CreateAssociationBatchResult) obj;
        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssociationBatchResult clone() {
        try {
            return (CreateAssociationBatchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
