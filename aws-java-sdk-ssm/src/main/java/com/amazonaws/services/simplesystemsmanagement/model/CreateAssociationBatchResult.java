/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * 
 */
public class CreateAssociationBatchResult implements Serializable {

    /**
     * Information about the associations that succeeded.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AssociationDescription> successful;

    /**
     * Information about the associations that failed.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateAssociation> failed;

    /**
     * Information about the associations that succeeded.
     *
     * @return Information about the associations that succeeded.
     */
    public java.util.List<AssociationDescription> getSuccessful() {
        if (successful == null) {
              successful = new com.amazonaws.internal.ListWithAutoConstructFlag<AssociationDescription>();
              successful.setAutoConstruct(true);
        }
        return successful;
    }
    
    /**
     * Information about the associations that succeeded.
     *
     * @param successful Information about the associations that succeeded.
     */
    public void setSuccessful(java.util.Collection<AssociationDescription> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AssociationDescription> successfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AssociationDescription>(successful.size());
        successfulCopy.addAll(successful);
        this.successful = successfulCopy;
    }
    
    /**
     * Information about the associations that succeeded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful Information about the associations that succeeded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAssociationBatchResult withSuccessful(AssociationDescription... successful) {
        if (getSuccessful() == null) setSuccessful(new java.util.ArrayList<AssociationDescription>(successful.length));
        for (AssociationDescription value : successful) {
            getSuccessful().add(value);
        }
        return this;
    }
    
    /**
     * Information about the associations that succeeded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful Information about the associations that succeeded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAssociationBatchResult withSuccessful(java.util.Collection<AssociationDescription> successful) {
        if (successful == null) {
            this.successful = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AssociationDescription> successfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AssociationDescription>(successful.size());
            successfulCopy.addAll(successful);
            this.successful = successfulCopy;
        }

        return this;
    }

    /**
     * Information about the associations that failed.
     *
     * @return Information about the associations that failed.
     */
    public java.util.List<FailedCreateAssociation> getFailed() {
        if (failed == null) {
              failed = new com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateAssociation>();
              failed.setAutoConstruct(true);
        }
        return failed;
    }
    
    /**
     * Information about the associations that failed.
     *
     * @param failed Information about the associations that failed.
     */
    public void setFailed(java.util.Collection<FailedCreateAssociation> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateAssociation> failedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateAssociation>(failed.size());
        failedCopy.addAll(failed);
        this.failed = failedCopy;
    }
    
    /**
     * Information about the associations that failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failed Information about the associations that failed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAssociationBatchResult withFailed(FailedCreateAssociation... failed) {
        if (getFailed() == null) setFailed(new java.util.ArrayList<FailedCreateAssociation>(failed.length));
        for (FailedCreateAssociation value : failed) {
            getFailed().add(value);
        }
        return this;
    }
    
    /**
     * Information about the associations that failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failed Information about the associations that failed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAssociationBatchResult withFailed(java.util.Collection<FailedCreateAssociation> failed) {
        if (failed == null) {
            this.failed = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateAssociation> failedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateAssociation>(failed.size());
            failedCopy.addAll(failed);
            this.failed = failedCopy;
        }

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
        if (getSuccessful() != null) sb.append("Successful: " + getSuccessful() + ",");
        if (getFailed() != null) sb.append("Failed: " + getFailed() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateAssociationBatchResult == false) return false;
        CreateAssociationBatchResult other = (CreateAssociationBatchResult)obj;
        
        if (other.getSuccessful() == null ^ this.getSuccessful() == null) return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false) return false; 
        if (other.getFailed() == null ^ this.getFailed() == null) return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false) return false; 
        return true;
    }
    
}
    