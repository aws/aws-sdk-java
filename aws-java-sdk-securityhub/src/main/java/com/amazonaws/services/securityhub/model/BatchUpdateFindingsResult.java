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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateFindings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateFindingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of findings that were updated successfully.
     * </p>
     */
    private java.util.List<AwsSecurityFindingIdentifier> processedFindings;
    /**
     * <p>
     * The list of findings that were not updated.
     * </p>
     */
    private java.util.List<BatchUpdateFindingsUnprocessedFinding> unprocessedFindings;

    /**
     * <p>
     * The list of findings that were updated successfully.
     * </p>
     * 
     * @return The list of findings that were updated successfully.
     */

    public java.util.List<AwsSecurityFindingIdentifier> getProcessedFindings() {
        return processedFindings;
    }

    /**
     * <p>
     * The list of findings that were updated successfully.
     * </p>
     * 
     * @param processedFindings
     *        The list of findings that were updated successfully.
     */

    public void setProcessedFindings(java.util.Collection<AwsSecurityFindingIdentifier> processedFindings) {
        if (processedFindings == null) {
            this.processedFindings = null;
            return;
        }

        this.processedFindings = new java.util.ArrayList<AwsSecurityFindingIdentifier>(processedFindings);
    }

    /**
     * <p>
     * The list of findings that were updated successfully.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessedFindings(java.util.Collection)} or {@link #withProcessedFindings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param processedFindings
     *        The list of findings that were updated successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsResult withProcessedFindings(AwsSecurityFindingIdentifier... processedFindings) {
        if (this.processedFindings == null) {
            setProcessedFindings(new java.util.ArrayList<AwsSecurityFindingIdentifier>(processedFindings.length));
        }
        for (AwsSecurityFindingIdentifier ele : processedFindings) {
            this.processedFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of findings that were updated successfully.
     * </p>
     * 
     * @param processedFindings
     *        The list of findings that were updated successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsResult withProcessedFindings(java.util.Collection<AwsSecurityFindingIdentifier> processedFindings) {
        setProcessedFindings(processedFindings);
        return this;
    }

    /**
     * <p>
     * The list of findings that were not updated.
     * </p>
     * 
     * @return The list of findings that were not updated.
     */

    public java.util.List<BatchUpdateFindingsUnprocessedFinding> getUnprocessedFindings() {
        return unprocessedFindings;
    }

    /**
     * <p>
     * The list of findings that were not updated.
     * </p>
     * 
     * @param unprocessedFindings
     *        The list of findings that were not updated.
     */

    public void setUnprocessedFindings(java.util.Collection<BatchUpdateFindingsUnprocessedFinding> unprocessedFindings) {
        if (unprocessedFindings == null) {
            this.unprocessedFindings = null;
            return;
        }

        this.unprocessedFindings = new java.util.ArrayList<BatchUpdateFindingsUnprocessedFinding>(unprocessedFindings);
    }

    /**
     * <p>
     * The list of findings that were not updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedFindings(java.util.Collection)} or {@link #withUnprocessedFindings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedFindings
     *        The list of findings that were not updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsResult withUnprocessedFindings(BatchUpdateFindingsUnprocessedFinding... unprocessedFindings) {
        if (this.unprocessedFindings == null) {
            setUnprocessedFindings(new java.util.ArrayList<BatchUpdateFindingsUnprocessedFinding>(unprocessedFindings.length));
        }
        for (BatchUpdateFindingsUnprocessedFinding ele : unprocessedFindings) {
            this.unprocessedFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of findings that were not updated.
     * </p>
     * 
     * @param unprocessedFindings
     *        The list of findings that were not updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsResult withUnprocessedFindings(java.util.Collection<BatchUpdateFindingsUnprocessedFinding> unprocessedFindings) {
        setUnprocessedFindings(unprocessedFindings);
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
        if (getProcessedFindings() != null)
            sb.append("ProcessedFindings: ").append(getProcessedFindings()).append(",");
        if (getUnprocessedFindings() != null)
            sb.append("UnprocessedFindings: ").append(getUnprocessedFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateFindingsResult == false)
            return false;
        BatchUpdateFindingsResult other = (BatchUpdateFindingsResult) obj;
        if (other.getProcessedFindings() == null ^ this.getProcessedFindings() == null)
            return false;
        if (other.getProcessedFindings() != null && other.getProcessedFindings().equals(this.getProcessedFindings()) == false)
            return false;
        if (other.getUnprocessedFindings() == null ^ this.getUnprocessedFindings() == null)
            return false;
        if (other.getUnprocessedFindings() != null && other.getUnprocessedFindings().equals(this.getUnprocessedFindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessedFindings() == null) ? 0 : getProcessedFindings().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedFindings() == null) ? 0 : getUnprocessedFindings().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateFindingsResult clone() {
        try {
            return (BatchUpdateFindingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
