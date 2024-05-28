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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateProblem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProblemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the problem.
     * </p>
     */
    private String problemId;
    /**
     * <p>
     * The status of the problem. Arguments can be passed for only problems that show a status of
     * <code>RECOVERING</code>.
     * </p>
     */
    private String updateStatus;
    /**
     * <p>
     * The visibility of a problem. When you pass a value of <code>IGNORED</code>, the problem is removed from the
     * default view, and all notifications for the problem are suspended. When <code>VISIBLE</code> is passed, the
     * <code>IGNORED</code> action is reversed.
     * </p>
     */
    private String visibility;

    /**
     * <p>
     * The ID of the problem.
     * </p>
     * 
     * @param problemId
     *        The ID of the problem.
     */

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    /**
     * <p>
     * The ID of the problem.
     * </p>
     * 
     * @return The ID of the problem.
     */

    public String getProblemId() {
        return this.problemId;
    }

    /**
     * <p>
     * The ID of the problem.
     * </p>
     * 
     * @param problemId
     *        The ID of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProblemRequest withProblemId(String problemId) {
        setProblemId(problemId);
        return this;
    }

    /**
     * <p>
     * The status of the problem. Arguments can be passed for only problems that show a status of
     * <code>RECOVERING</code>.
     * </p>
     * 
     * @param updateStatus
     *        The status of the problem. Arguments can be passed for only problems that show a status of
     *        <code>RECOVERING</code>.
     * @see UpdateStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The status of the problem. Arguments can be passed for only problems that show a status of
     * <code>RECOVERING</code>.
     * </p>
     * 
     * @return The status of the problem. Arguments can be passed for only problems that show a status of
     *         <code>RECOVERING</code>.
     * @see UpdateStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The status of the problem. Arguments can be passed for only problems that show a status of
     * <code>RECOVERING</code>.
     * </p>
     * 
     * @param updateStatus
     *        The status of the problem. Arguments can be passed for only problems that show a status of
     *        <code>RECOVERING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateStatus
     */

    public UpdateProblemRequest withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the problem. Arguments can be passed for only problems that show a status of
     * <code>RECOVERING</code>.
     * </p>
     * 
     * @param updateStatus
     *        The status of the problem. Arguments can be passed for only problems that show a status of
     *        <code>RECOVERING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateStatus
     */

    public UpdateProblemRequest withUpdateStatus(UpdateStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The visibility of a problem. When you pass a value of <code>IGNORED</code>, the problem is removed from the
     * default view, and all notifications for the problem are suspended. When <code>VISIBLE</code> is passed, the
     * <code>IGNORED</code> action is reversed.
     * </p>
     * 
     * @param visibility
     *        The visibility of a problem. When you pass a value of <code>IGNORED</code>, the problem is removed from
     *        the default view, and all notifications for the problem are suspended. When <code>VISIBLE</code> is
     *        passed, the <code>IGNORED</code> action is reversed.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of a problem. When you pass a value of <code>IGNORED</code>, the problem is removed from the
     * default view, and all notifications for the problem are suspended. When <code>VISIBLE</code> is passed, the
     * <code>IGNORED</code> action is reversed.
     * </p>
     * 
     * @return The visibility of a problem. When you pass a value of <code>IGNORED</code>, the problem is removed from
     *         the default view, and all notifications for the problem are suspended. When <code>VISIBLE</code> is
     *         passed, the <code>IGNORED</code> action is reversed.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of a problem. When you pass a value of <code>IGNORED</code>, the problem is removed from the
     * default view, and all notifications for the problem are suspended. When <code>VISIBLE</code> is passed, the
     * <code>IGNORED</code> action is reversed.
     * </p>
     * 
     * @param visibility
     *        The visibility of a problem. When you pass a value of <code>IGNORED</code>, the problem is removed from
     *        the default view, and all notifications for the problem are suspended. When <code>VISIBLE</code> is
     *        passed, the <code>IGNORED</code> action is reversed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public UpdateProblemRequest withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of a problem. When you pass a value of <code>IGNORED</code>, the problem is removed from the
     * default view, and all notifications for the problem are suspended. When <code>VISIBLE</code> is passed, the
     * <code>IGNORED</code> action is reversed.
     * </p>
     * 
     * @param visibility
     *        The visibility of a problem. When you pass a value of <code>IGNORED</code>, the problem is removed from
     *        the default view, and all notifications for the problem are suspended. When <code>VISIBLE</code> is
     *        passed, the <code>IGNORED</code> action is reversed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public UpdateProblemRequest withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
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
        if (getProblemId() != null)
            sb.append("ProblemId: ").append(getProblemId()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProblemRequest == false)
            return false;
        UpdateProblemRequest other = (UpdateProblemRequest) obj;
        if (other.getProblemId() == null ^ this.getProblemId() == null)
            return false;
        if (other.getProblemId() != null && other.getProblemId().equals(this.getProblemId()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProblemId() == null) ? 0 : getProblemId().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProblemRequest clone() {
        return (UpdateProblemRequest) super.clone();
    }

}
