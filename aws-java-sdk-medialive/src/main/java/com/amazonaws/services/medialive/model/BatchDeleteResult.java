/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for BatchDeleteResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchDelete" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** List of failed operations */
    private java.util.List<BatchFailedResultModel> failed;
    /** List of successful operations */
    private java.util.List<BatchSuccessfulResultModel> successful;

    /**
     * List of failed operations
     * 
     * @return List of failed operations
     */

    public java.util.List<BatchFailedResultModel> getFailed() {
        return failed;
    }

    /**
     * List of failed operations
     * 
     * @param failed
     *        List of failed operations
     */

    public void setFailed(java.util.Collection<BatchFailedResultModel> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }

        this.failed = new java.util.ArrayList<BatchFailedResultModel>(failed);
    }

    /**
     * List of failed operations
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailed(java.util.Collection)} or {@link #withFailed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failed
     *        List of failed operations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteResult withFailed(BatchFailedResultModel... failed) {
        if (this.failed == null) {
            setFailed(new java.util.ArrayList<BatchFailedResultModel>(failed.length));
        }
        for (BatchFailedResultModel ele : failed) {
            this.failed.add(ele);
        }
        return this;
    }

    /**
     * List of failed operations
     * 
     * @param failed
     *        List of failed operations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteResult withFailed(java.util.Collection<BatchFailedResultModel> failed) {
        setFailed(failed);
        return this;
    }

    /**
     * List of successful operations
     * 
     * @return List of successful operations
     */

    public java.util.List<BatchSuccessfulResultModel> getSuccessful() {
        return successful;
    }

    /**
     * List of successful operations
     * 
     * @param successful
     *        List of successful operations
     */

    public void setSuccessful(java.util.Collection<BatchSuccessfulResultModel> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new java.util.ArrayList<BatchSuccessfulResultModel>(successful);
    }

    /**
     * List of successful operations
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessful(java.util.Collection)} or {@link #withSuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param successful
     *        List of successful operations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteResult withSuccessful(BatchSuccessfulResultModel... successful) {
        if (this.successful == null) {
            setSuccessful(new java.util.ArrayList<BatchSuccessfulResultModel>(successful.length));
        }
        for (BatchSuccessfulResultModel ele : successful) {
            this.successful.add(ele);
        }
        return this;
    }

    /**
     * List of successful operations
     * 
     * @param successful
     *        List of successful operations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteResult withSuccessful(java.util.Collection<BatchSuccessfulResultModel> successful) {
        setSuccessful(successful);
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
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getSuccessful() != null)
            sb.append("Successful: ").append(getSuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteResult == false)
            return false;
        BatchDeleteResult other = (BatchDeleteResult) obj;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteResult clone() {
        try {
            return (BatchDeleteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
