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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about all of the child workflow executions started by a Map Run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/MapRunExecutionCounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapRunExecutionCounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run, but haven't started executing yet.
     * </p>
     */
    private Long pending;
    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and are currently in-progress.
     * </p>
     */
    private Long running;
    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and have completed successfully.
     * </p>
     */
    private Long succeeded;
    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run, but have failed.
     * </p>
     */
    private Long failed;
    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and have timed out.
     * </p>
     */
    private Long timedOut;
    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and were running, but were either
     * stopped by the user or by Step Functions because the Map Run failed.
     * </p>
     */
    private Long aborted;
    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run.
     * </p>
     */
    private Long total;
    /**
     * <p>
     * Returns the count of child workflow executions whose results were written by <code>ResultWriter</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultwriter.html">ResultWriter</a> in
     * the <i>Step Functions Developer Guide</i>.
     * </p>
     */
    private Long resultsWritten;

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run, but haven't started executing yet.
     * </p>
     * 
     * @param pending
     *        The total number of child workflow executions that were started by a Map Run, but haven't started
     *        executing yet.
     */

    public void setPending(Long pending) {
        this.pending = pending;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run, but haven't started executing yet.
     * </p>
     * 
     * @return The total number of child workflow executions that were started by a Map Run, but haven't started
     *         executing yet.
     */

    public Long getPending() {
        return this.pending;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run, but haven't started executing yet.
     * </p>
     * 
     * @param pending
     *        The total number of child workflow executions that were started by a Map Run, but haven't started
     *        executing yet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunExecutionCounts withPending(Long pending) {
        setPending(pending);
        return this;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and are currently in-progress.
     * </p>
     * 
     * @param running
     *        The total number of child workflow executions that were started by a Map Run and are currently
     *        in-progress.
     */

    public void setRunning(Long running) {
        this.running = running;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and are currently in-progress.
     * </p>
     * 
     * @return The total number of child workflow executions that were started by a Map Run and are currently
     *         in-progress.
     */

    public Long getRunning() {
        return this.running;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and are currently in-progress.
     * </p>
     * 
     * @param running
     *        The total number of child workflow executions that were started by a Map Run and are currently
     *        in-progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunExecutionCounts withRunning(Long running) {
        setRunning(running);
        return this;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and have completed successfully.
     * </p>
     * 
     * @param succeeded
     *        The total number of child workflow executions that were started by a Map Run and have completed
     *        successfully.
     */

    public void setSucceeded(Long succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and have completed successfully.
     * </p>
     * 
     * @return The total number of child workflow executions that were started by a Map Run and have completed
     *         successfully.
     */

    public Long getSucceeded() {
        return this.succeeded;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and have completed successfully.
     * </p>
     * 
     * @param succeeded
     *        The total number of child workflow executions that were started by a Map Run and have completed
     *        successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunExecutionCounts withSucceeded(Long succeeded) {
        setSucceeded(succeeded);
        return this;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run, but have failed.
     * </p>
     * 
     * @param failed
     *        The total number of child workflow executions that were started by a Map Run, but have failed.
     */

    public void setFailed(Long failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run, but have failed.
     * </p>
     * 
     * @return The total number of child workflow executions that were started by a Map Run, but have failed.
     */

    public Long getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run, but have failed.
     * </p>
     * 
     * @param failed
     *        The total number of child workflow executions that were started by a Map Run, but have failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunExecutionCounts withFailed(Long failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and have timed out.
     * </p>
     * 
     * @param timedOut
     *        The total number of child workflow executions that were started by a Map Run and have timed out.
     */

    public void setTimedOut(Long timedOut) {
        this.timedOut = timedOut;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and have timed out.
     * </p>
     * 
     * @return The total number of child workflow executions that were started by a Map Run and have timed out.
     */

    public Long getTimedOut() {
        return this.timedOut;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and have timed out.
     * </p>
     * 
     * @param timedOut
     *        The total number of child workflow executions that were started by a Map Run and have timed out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunExecutionCounts withTimedOut(Long timedOut) {
        setTimedOut(timedOut);
        return this;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and were running, but were either
     * stopped by the user or by Step Functions because the Map Run failed.
     * </p>
     * 
     * @param aborted
     *        The total number of child workflow executions that were started by a Map Run and were running, but were
     *        either stopped by the user or by Step Functions because the Map Run failed.
     */

    public void setAborted(Long aborted) {
        this.aborted = aborted;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and were running, but were either
     * stopped by the user or by Step Functions because the Map Run failed.
     * </p>
     * 
     * @return The total number of child workflow executions that were started by a Map Run and were running, but were
     *         either stopped by the user or by Step Functions because the Map Run failed.
     */

    public Long getAborted() {
        return this.aborted;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run and were running, but were either
     * stopped by the user or by Step Functions because the Map Run failed.
     * </p>
     * 
     * @param aborted
     *        The total number of child workflow executions that were started by a Map Run and were running, but were
     *        either stopped by the user or by Step Functions because the Map Run failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunExecutionCounts withAborted(Long aborted) {
        setAborted(aborted);
        return this;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run.
     * </p>
     * 
     * @param total
     *        The total number of child workflow executions that were started by a Map Run.
     */

    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run.
     * </p>
     * 
     * @return The total number of child workflow executions that were started by a Map Run.
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total number of child workflow executions that were started by a Map Run.
     * </p>
     * 
     * @param total
     *        The total number of child workflow executions that were started by a Map Run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunExecutionCounts withTotal(Long total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * Returns the count of child workflow executions whose results were written by <code>ResultWriter</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultwriter.html">ResultWriter</a> in
     * the <i>Step Functions Developer Guide</i>.
     * </p>
     * 
     * @param resultsWritten
     *        Returns the count of child workflow executions whose results were written by <code>ResultWriter</code>.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultwriter.html"
     *        >ResultWriter</a> in the <i>Step Functions Developer Guide</i>.
     */

    public void setResultsWritten(Long resultsWritten) {
        this.resultsWritten = resultsWritten;
    }

    /**
     * <p>
     * Returns the count of child workflow executions whose results were written by <code>ResultWriter</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultwriter.html">ResultWriter</a> in
     * the <i>Step Functions Developer Guide</i>.
     * </p>
     * 
     * @return Returns the count of child workflow executions whose results were written by <code>ResultWriter</code>.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultwriter.html"
     *         >ResultWriter</a> in the <i>Step Functions Developer Guide</i>.
     */

    public Long getResultsWritten() {
        return this.resultsWritten;
    }

    /**
     * <p>
     * Returns the count of child workflow executions whose results were written by <code>ResultWriter</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultwriter.html">ResultWriter</a> in
     * the <i>Step Functions Developer Guide</i>.
     * </p>
     * 
     * @param resultsWritten
     *        Returns the count of child workflow executions whose results were written by <code>ResultWriter</code>.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/input-output-resultwriter.html"
     *        >ResultWriter</a> in the <i>Step Functions Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapRunExecutionCounts withResultsWritten(Long resultsWritten) {
        setResultsWritten(resultsWritten);
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
        if (getPending() != null)
            sb.append("Pending: ").append(getPending()).append(",");
        if (getRunning() != null)
            sb.append("Running: ").append(getRunning()).append(",");
        if (getSucceeded() != null)
            sb.append("Succeeded: ").append(getSucceeded()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getTimedOut() != null)
            sb.append("TimedOut: ").append(getTimedOut()).append(",");
        if (getAborted() != null)
            sb.append("Aborted: ").append(getAborted()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getResultsWritten() != null)
            sb.append("ResultsWritten: ").append(getResultsWritten());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapRunExecutionCounts == false)
            return false;
        MapRunExecutionCounts other = (MapRunExecutionCounts) obj;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        if (other.getRunning() == null ^ this.getRunning() == null)
            return false;
        if (other.getRunning() != null && other.getRunning().equals(this.getRunning()) == false)
            return false;
        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getTimedOut() == null ^ this.getTimedOut() == null)
            return false;
        if (other.getTimedOut() != null && other.getTimedOut().equals(this.getTimedOut()) == false)
            return false;
        if (other.getAborted() == null ^ this.getAborted() == null)
            return false;
        if (other.getAborted() != null && other.getAborted().equals(this.getAborted()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getResultsWritten() == null ^ this.getResultsWritten() == null)
            return false;
        if (other.getResultsWritten() != null && other.getResultsWritten().equals(this.getResultsWritten()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        hashCode = prime * hashCode + ((getRunning() == null) ? 0 : getRunning().hashCode());
        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getTimedOut() == null) ? 0 : getTimedOut().hashCode());
        hashCode = prime * hashCode + ((getAborted() == null) ? 0 : getAborted().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getResultsWritten() == null) ? 0 : getResultsWritten().hashCode());
        return hashCode;
    }

    @Override
    public MapRunExecutionCounts clone() {
        try {
            return (MapRunExecutionCounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.MapRunExecutionCountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
