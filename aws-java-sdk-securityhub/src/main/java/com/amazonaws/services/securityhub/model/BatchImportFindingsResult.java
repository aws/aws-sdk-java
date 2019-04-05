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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchImportFindingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of findings that cannot be imported.
     * </p>
     */
    private Integer failedCount;
    /**
     * <p>
     * The number of findings that were successfully imported
     * </p>
     */
    private Integer successCount;
    /**
     * <p>
     * The list of the findings that cannot be imported.
     * </p>
     */
    private java.util.List<ImportFindingsError> failedFindings;

    /**
     * <p>
     * The number of findings that cannot be imported.
     * </p>
     * 
     * @param failedCount
     *        The number of findings that cannot be imported.
     */

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    /**
     * <p>
     * The number of findings that cannot be imported.
     * </p>
     * 
     * @return The number of findings that cannot be imported.
     */

    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * <p>
     * The number of findings that cannot be imported.
     * </p>
     * 
     * @param failedCount
     *        The number of findings that cannot be imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImportFindingsResult withFailedCount(Integer failedCount) {
        setFailedCount(failedCount);
        return this;
    }

    /**
     * <p>
     * The number of findings that were successfully imported
     * </p>
     * 
     * @param successCount
     *        The number of findings that were successfully imported
     */

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    /**
     * <p>
     * The number of findings that were successfully imported
     * </p>
     * 
     * @return The number of findings that were successfully imported
     */

    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * <p>
     * The number of findings that were successfully imported
     * </p>
     * 
     * @param successCount
     *        The number of findings that were successfully imported
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImportFindingsResult withSuccessCount(Integer successCount) {
        setSuccessCount(successCount);
        return this;
    }

    /**
     * <p>
     * The list of the findings that cannot be imported.
     * </p>
     * 
     * @return The list of the findings that cannot be imported.
     */

    public java.util.List<ImportFindingsError> getFailedFindings() {
        return failedFindings;
    }

    /**
     * <p>
     * The list of the findings that cannot be imported.
     * </p>
     * 
     * @param failedFindings
     *        The list of the findings that cannot be imported.
     */

    public void setFailedFindings(java.util.Collection<ImportFindingsError> failedFindings) {
        if (failedFindings == null) {
            this.failedFindings = null;
            return;
        }

        this.failedFindings = new java.util.ArrayList<ImportFindingsError>(failedFindings);
    }

    /**
     * <p>
     * The list of the findings that cannot be imported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedFindings(java.util.Collection)} or {@link #withFailedFindings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedFindings
     *        The list of the findings that cannot be imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImportFindingsResult withFailedFindings(ImportFindingsError... failedFindings) {
        if (this.failedFindings == null) {
            setFailedFindings(new java.util.ArrayList<ImportFindingsError>(failedFindings.length));
        }
        for (ImportFindingsError ele : failedFindings) {
            this.failedFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the findings that cannot be imported.
     * </p>
     * 
     * @param failedFindings
     *        The list of the findings that cannot be imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImportFindingsResult withFailedFindings(java.util.Collection<ImportFindingsError> failedFindings) {
        setFailedFindings(failedFindings);
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
        if (getFailedCount() != null)
            sb.append("FailedCount: ").append(getFailedCount()).append(",");
        if (getSuccessCount() != null)
            sb.append("SuccessCount: ").append(getSuccessCount()).append(",");
        if (getFailedFindings() != null)
            sb.append("FailedFindings: ").append(getFailedFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchImportFindingsResult == false)
            return false;
        BatchImportFindingsResult other = (BatchImportFindingsResult) obj;
        if (other.getFailedCount() == null ^ this.getFailedCount() == null)
            return false;
        if (other.getFailedCount() != null && other.getFailedCount().equals(this.getFailedCount()) == false)
            return false;
        if (other.getSuccessCount() == null ^ this.getSuccessCount() == null)
            return false;
        if (other.getSuccessCount() != null && other.getSuccessCount().equals(this.getSuccessCount()) == false)
            return false;
        if (other.getFailedFindings() == null ^ this.getFailedFindings() == null)
            return false;
        if (other.getFailedFindings() != null && other.getFailedFindings().equals(this.getFailedFindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedCount() == null) ? 0 : getFailedCount().hashCode());
        hashCode = prime * hashCode + ((getSuccessCount() == null) ? 0 : getSuccessCount().hashCode());
        hashCode = prime * hashCode + ((getFailedFindings() == null) ? 0 : getFailedFindings().hashCode());
        return hashCode;
    }

    @Override
    public BatchImportFindingsResult clone() {
        try {
            return (BatchImportFindingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
