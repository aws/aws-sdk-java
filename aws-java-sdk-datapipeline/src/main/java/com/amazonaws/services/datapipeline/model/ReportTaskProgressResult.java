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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the output of ReportTaskProgress.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskProgress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportTaskProgressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If true, the calling task runner should cancel processing of the task. The task runner does not need to call
     * <a>SetTaskStatus</a> for canceled tasks.
     * </p>
     */
    private Boolean canceled;

    /**
     * <p>
     * If true, the calling task runner should cancel processing of the task. The task runner does not need to call
     * <a>SetTaskStatus</a> for canceled tasks.
     * </p>
     * 
     * @param canceled
     *        If true, the calling task runner should cancel processing of the task. The task runner does not need to
     *        call <a>SetTaskStatus</a> for canceled tasks.
     */

    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }

    /**
     * <p>
     * If true, the calling task runner should cancel processing of the task. The task runner does not need to call
     * <a>SetTaskStatus</a> for canceled tasks.
     * </p>
     * 
     * @return If true, the calling task runner should cancel processing of the task. The task runner does not need to
     *         call <a>SetTaskStatus</a> for canceled tasks.
     */

    public Boolean getCanceled() {
        return this.canceled;
    }

    /**
     * <p>
     * If true, the calling task runner should cancel processing of the task. The task runner does not need to call
     * <a>SetTaskStatus</a> for canceled tasks.
     * </p>
     * 
     * @param canceled
     *        If true, the calling task runner should cancel processing of the task. The task runner does not need to
     *        call <a>SetTaskStatus</a> for canceled tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportTaskProgressResult withCanceled(Boolean canceled) {
        setCanceled(canceled);
        return this;
    }

    /**
     * <p>
     * If true, the calling task runner should cancel processing of the task. The task runner does not need to call
     * <a>SetTaskStatus</a> for canceled tasks.
     * </p>
     * 
     * @return If true, the calling task runner should cancel processing of the task. The task runner does not need to
     *         call <a>SetTaskStatus</a> for canceled tasks.
     */

    public Boolean isCanceled() {
        return this.canceled;
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
        if (getCanceled() != null)
            sb.append("Canceled: ").append(getCanceled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportTaskProgressResult == false)
            return false;
        ReportTaskProgressResult other = (ReportTaskProgressResult) obj;
        if (other.getCanceled() == null ^ this.getCanceled() == null)
            return false;
        if (other.getCanceled() != null && other.getCanceled().equals(this.getCanceled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanceled() == null) ? 0 : getCanceled().hashCode());
        return hashCode;
    }

    @Override
    public ReportTaskProgressResult clone() {
        try {
            return (ReportTaskProgressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
