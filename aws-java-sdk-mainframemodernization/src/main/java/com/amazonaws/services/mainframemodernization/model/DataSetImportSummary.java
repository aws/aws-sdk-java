/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a summary of data set imports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DataSetImportSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetImportSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of data set imports that have failed.
     * </p>
     */
    private Integer failed;
    /**
     * <p>
     * The number of data set imports that are in progress.
     * </p>
     */
    private Integer inProgress;
    /**
     * <p>
     * The number of data set imports that are pending.
     * </p>
     */
    private Integer pending;
    /**
     * <p>
     * The number of data set imports that have succeeded.
     * </p>
     */
    private Integer succeeded;
    /**
     * <p>
     * The total number of data set imports.
     * </p>
     */
    private Integer total;

    /**
     * <p>
     * The number of data set imports that have failed.
     * </p>
     * 
     * @param failed
     *        The number of data set imports that have failed.
     */

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The number of data set imports that have failed.
     * </p>
     * 
     * @return The number of data set imports that have failed.
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * The number of data set imports that have failed.
     * </p>
     * 
     * @param failed
     *        The number of data set imports that have failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportSummary withFailed(Integer failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * The number of data set imports that are in progress.
     * </p>
     * 
     * @param inProgress
     *        The number of data set imports that are in progress.
     */

    public void setInProgress(Integer inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * <p>
     * The number of data set imports that are in progress.
     * </p>
     * 
     * @return The number of data set imports that are in progress.
     */

    public Integer getInProgress() {
        return this.inProgress;
    }

    /**
     * <p>
     * The number of data set imports that are in progress.
     * </p>
     * 
     * @param inProgress
     *        The number of data set imports that are in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportSummary withInProgress(Integer inProgress) {
        setInProgress(inProgress);
        return this;
    }

    /**
     * <p>
     * The number of data set imports that are pending.
     * </p>
     * 
     * @param pending
     *        The number of data set imports that are pending.
     */

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    /**
     * <p>
     * The number of data set imports that are pending.
     * </p>
     * 
     * @return The number of data set imports that are pending.
     */

    public Integer getPending() {
        return this.pending;
    }

    /**
     * <p>
     * The number of data set imports that are pending.
     * </p>
     * 
     * @param pending
     *        The number of data set imports that are pending.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportSummary withPending(Integer pending) {
        setPending(pending);
        return this;
    }

    /**
     * <p>
     * The number of data set imports that have succeeded.
     * </p>
     * 
     * @param succeeded
     *        The number of data set imports that have succeeded.
     */

    public void setSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * <p>
     * The number of data set imports that have succeeded.
     * </p>
     * 
     * @return The number of data set imports that have succeeded.
     */

    public Integer getSucceeded() {
        return this.succeeded;
    }

    /**
     * <p>
     * The number of data set imports that have succeeded.
     * </p>
     * 
     * @param succeeded
     *        The number of data set imports that have succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportSummary withSucceeded(Integer succeeded) {
        setSucceeded(succeeded);
        return this;
    }

    /**
     * <p>
     * The total number of data set imports.
     * </p>
     * 
     * @param total
     *        The total number of data set imports.
     */

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of data set imports.
     * </p>
     * 
     * @return The total number of data set imports.
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total number of data set imports.
     * </p>
     * 
     * @param total
     *        The total number of data set imports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportSummary withTotal(Integer total) {
        setTotal(total);
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
        if (getInProgress() != null)
            sb.append("InProgress: ").append(getInProgress()).append(",");
        if (getPending() != null)
            sb.append("Pending: ").append(getPending()).append(",");
        if (getSucceeded() != null)
            sb.append("Succeeded: ").append(getSucceeded()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetImportSummary == false)
            return false;
        DataSetImportSummary other = (DataSetImportSummary) obj;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getInProgress() == null ^ this.getInProgress() == null)
            return false;
        if (other.getInProgress() != null && other.getInProgress().equals(this.getInProgress()) == false)
            return false;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getInProgress() == null) ? 0 : getInProgress().hashCode());
        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public DataSetImportSummary clone() {
        try {
            return (DataSetImportSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.DataSetImportSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
