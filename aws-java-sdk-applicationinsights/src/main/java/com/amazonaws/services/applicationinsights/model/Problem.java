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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a problem that is detected by correlating observations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/Problem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Problem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the problem.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the problem.
     * </p>
     */
    private String title;
    /**
     * <p>
     * A detailed analysis of the problem using machine learning.
     * </p>
     */
    private String insights;
    /**
     * <p>
     * The status of the problem.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The resource affected by the problem.
     * </p>
     */
    private String affectedResource;
    /**
     * <p>
     * The time when the problem started, in epoch seconds.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time when the problem ended, in epoch seconds.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A measure of the level of impact of the problem.
     * </p>
     */
    private String severityLevel;
    /**
     * <p>
     * The name of the resource group affected by the problem.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * Feedback provided by the user about the problem.
     * </p>
     */
    private java.util.Map<String, String> feedback;

    /**
     * <p>
     * The ID of the problem.
     * </p>
     * 
     * @param id
     *        The ID of the problem.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the problem.
     * </p>
     * 
     * @return The ID of the problem.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the problem.
     * </p>
     * 
     * @param id
     *        The ID of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Problem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the problem.
     * </p>
     * 
     * @param title
     *        The name of the problem.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The name of the problem.
     * </p>
     * 
     * @return The name of the problem.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The name of the problem.
     * </p>
     * 
     * @param title
     *        The name of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Problem withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * A detailed analysis of the problem using machine learning.
     * </p>
     * 
     * @param insights
     *        A detailed analysis of the problem using machine learning.
     */

    public void setInsights(String insights) {
        this.insights = insights;
    }

    /**
     * <p>
     * A detailed analysis of the problem using machine learning.
     * </p>
     * 
     * @return A detailed analysis of the problem using machine learning.
     */

    public String getInsights() {
        return this.insights;
    }

    /**
     * <p>
     * A detailed analysis of the problem using machine learning.
     * </p>
     * 
     * @param insights
     *        A detailed analysis of the problem using machine learning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Problem withInsights(String insights) {
        setInsights(insights);
        return this;
    }

    /**
     * <p>
     * The status of the problem.
     * </p>
     * 
     * @param status
     *        The status of the problem.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the problem.
     * </p>
     * 
     * @return The status of the problem.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the problem.
     * </p>
     * 
     * @param status
     *        The status of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Problem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the problem.
     * </p>
     * 
     * @param status
     *        The status of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Problem withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The resource affected by the problem.
     * </p>
     * 
     * @param affectedResource
     *        The resource affected by the problem.
     */

    public void setAffectedResource(String affectedResource) {
        this.affectedResource = affectedResource;
    }

    /**
     * <p>
     * The resource affected by the problem.
     * </p>
     * 
     * @return The resource affected by the problem.
     */

    public String getAffectedResource() {
        return this.affectedResource;
    }

    /**
     * <p>
     * The resource affected by the problem.
     * </p>
     * 
     * @param affectedResource
     *        The resource affected by the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Problem withAffectedResource(String affectedResource) {
        setAffectedResource(affectedResource);
        return this;
    }

    /**
     * <p>
     * The time when the problem started, in epoch seconds.
     * </p>
     * 
     * @param startTime
     *        The time when the problem started, in epoch seconds.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when the problem started, in epoch seconds.
     * </p>
     * 
     * @return The time when the problem started, in epoch seconds.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when the problem started, in epoch seconds.
     * </p>
     * 
     * @param startTime
     *        The time when the problem started, in epoch seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Problem withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time when the problem ended, in epoch seconds.
     * </p>
     * 
     * @param endTime
     *        The time when the problem ended, in epoch seconds.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time when the problem ended, in epoch seconds.
     * </p>
     * 
     * @return The time when the problem ended, in epoch seconds.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time when the problem ended, in epoch seconds.
     * </p>
     * 
     * @param endTime
     *        The time when the problem ended, in epoch seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Problem withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A measure of the level of impact of the problem.
     * </p>
     * 
     * @param severityLevel
     *        A measure of the level of impact of the problem.
     * @see SeverityLevel
     */

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    /**
     * <p>
     * A measure of the level of impact of the problem.
     * </p>
     * 
     * @return A measure of the level of impact of the problem.
     * @see SeverityLevel
     */

    public String getSeverityLevel() {
        return this.severityLevel;
    }

    /**
     * <p>
     * A measure of the level of impact of the problem.
     * </p>
     * 
     * @param severityLevel
     *        A measure of the level of impact of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityLevel
     */

    public Problem withSeverityLevel(String severityLevel) {
        setSeverityLevel(severityLevel);
        return this;
    }

    /**
     * <p>
     * A measure of the level of impact of the problem.
     * </p>
     * 
     * @param severityLevel
     *        A measure of the level of impact of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityLevel
     */

    public Problem withSeverityLevel(SeverityLevel severityLevel) {
        this.severityLevel = severityLevel.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource group affected by the problem.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group affected by the problem.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group affected by the problem.
     * </p>
     * 
     * @return The name of the resource group affected by the problem.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group affected by the problem.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group affected by the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Problem withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * Feedback provided by the user about the problem.
     * </p>
     * 
     * @return Feedback provided by the user about the problem.
     */

    public java.util.Map<String, String> getFeedback() {
        return feedback;
    }

    /**
     * <p>
     * Feedback provided by the user about the problem.
     * </p>
     * 
     * @param feedback
     *        Feedback provided by the user about the problem.
     */

    public void setFeedback(java.util.Map<String, String> feedback) {
        this.feedback = feedback;
    }

    /**
     * <p>
     * Feedback provided by the user about the problem.
     * </p>
     * 
     * @param feedback
     *        Feedback provided by the user about the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Problem withFeedback(java.util.Map<String, String> feedback) {
        setFeedback(feedback);
        return this;
    }

    public Problem addFeedbackEntry(String key, String value) {
        if (null == this.feedback) {
            this.feedback = new java.util.HashMap<String, String>();
        }
        if (this.feedback.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.feedback.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Feedback.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Problem clearFeedbackEntries() {
        this.feedback = null;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getInsights() != null)
            sb.append("Insights: ").append(getInsights()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAffectedResource() != null)
            sb.append("AffectedResource: ").append(getAffectedResource()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getSeverityLevel() != null)
            sb.append("SeverityLevel: ").append(getSeverityLevel()).append(",");
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
        if (getFeedback() != null)
            sb.append("Feedback: ").append(getFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Problem == false)
            return false;
        Problem other = (Problem) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getInsights() == null ^ this.getInsights() == null)
            return false;
        if (other.getInsights() != null && other.getInsights().equals(this.getInsights()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAffectedResource() == null ^ this.getAffectedResource() == null)
            return false;
        if (other.getAffectedResource() != null && other.getAffectedResource().equals(this.getAffectedResource()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getSeverityLevel() == null ^ this.getSeverityLevel() == null)
            return false;
        if (other.getSeverityLevel() != null && other.getSeverityLevel().equals(this.getSeverityLevel()) == false)
            return false;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        if (other.getFeedback() == null ^ this.getFeedback() == null)
            return false;
        if (other.getFeedback() != null && other.getFeedback().equals(this.getFeedback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getInsights() == null) ? 0 : getInsights().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAffectedResource() == null) ? 0 : getAffectedResource().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getSeverityLevel() == null) ? 0 : getSeverityLevel().hashCode());
        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        return hashCode;
    }

    @Override
    public Problem clone() {
        try {
            return (Problem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationinsights.model.transform.ProblemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
