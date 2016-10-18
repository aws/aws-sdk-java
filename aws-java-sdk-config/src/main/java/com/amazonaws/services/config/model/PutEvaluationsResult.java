/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class PutEvaluationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Requests that failed because of a client or server error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Evaluation> failedEvaluations;

    /**
     * <p>
     * Requests that failed because of a client or server error.
     * </p>
     * 
     * @return Requests that failed because of a client or server error.
     */

    public java.util.List<Evaluation> getFailedEvaluations() {
        if (failedEvaluations == null) {
            failedEvaluations = new com.amazonaws.internal.SdkInternalList<Evaluation>();
        }
        return failedEvaluations;
    }

    /**
     * <p>
     * Requests that failed because of a client or server error.
     * </p>
     * 
     * @param failedEvaluations
     *        Requests that failed because of a client or server error.
     */

    public void setFailedEvaluations(java.util.Collection<Evaluation> failedEvaluations) {
        if (failedEvaluations == null) {
            this.failedEvaluations = null;
            return;
        }

        this.failedEvaluations = new com.amazonaws.internal.SdkInternalList<Evaluation>(failedEvaluations);
    }

    /**
     * <p>
     * Requests that failed because of a client or server error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedEvaluations(java.util.Collection)} or {@link #withFailedEvaluations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param failedEvaluations
     *        Requests that failed because of a client or server error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEvaluationsResult withFailedEvaluations(Evaluation... failedEvaluations) {
        if (this.failedEvaluations == null) {
            setFailedEvaluations(new com.amazonaws.internal.SdkInternalList<Evaluation>(failedEvaluations.length));
        }
        for (Evaluation ele : failedEvaluations) {
            this.failedEvaluations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Requests that failed because of a client or server error.
     * </p>
     * 
     * @param failedEvaluations
     *        Requests that failed because of a client or server error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEvaluationsResult withFailedEvaluations(java.util.Collection<Evaluation> failedEvaluations) {
        setFailedEvaluations(failedEvaluations);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFailedEvaluations() != null)
            sb.append("FailedEvaluations: " + getFailedEvaluations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEvaluationsResult == false)
            return false;
        PutEvaluationsResult other = (PutEvaluationsResult) obj;
        if (other.getFailedEvaluations() == null ^ this.getFailedEvaluations() == null)
            return false;
        if (other.getFailedEvaluations() != null && other.getFailedEvaluations().equals(this.getFailedEvaluations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedEvaluations() == null) ? 0 : getFailedEvaluations().hashCode());
        return hashCode;
    }

    @Override
    public PutEvaluationsResult clone() {
        try {
            return (PutEvaluationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
