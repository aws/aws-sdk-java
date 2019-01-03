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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to retrieve a list of events for an environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those associated with
     * this application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this application
     * version.
     * </p>
     */
    private String versionLabel;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that are associated with this
     * environment configuration.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     * environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     * environment.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The ARN of the version of the custom platform.
     * </p>
     */
    private String platformArn;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the described events to include only those associated with this
     * request ID.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * If specified, limits the events returned from this call to include only those with the specified severity or
     * higher.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur on or after this
     * time.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur up to, but not
     * including, the <code>EndTime</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Specifies the maximum number of events that can be returned, beginning with the most recent event.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * Pagination token. If specified, the events return the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those associated with
     * this application.
     * </p>
     * 
     * @param applicationName
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those associated
     *        with this application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those associated with
     * this application.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those associated
     *         with this application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those associated with
     * this application.
     * </p>
     * 
     * @param applicationName
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those associated
     *        with this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this application
     * version.
     * </p>
     * 
     * @param versionLabel
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     *        application version.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this application
     * version.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     *         application version.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this application
     * version.
     * </p>
     * 
     * @param versionLabel
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     *        application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that are associated with this
     * environment configuration.
     * </p>
     * 
     * @param templateName
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that are associated with
     *        this environment configuration.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that are associated with this
     * environment configuration.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that are associated with
     *         this environment configuration.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that are associated with this
     * environment configuration.
     * </p>
     * 
     * @param templateName
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that are associated with
     *        this environment configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     * environment.
     * </p>
     * 
     * @param environmentId
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     *        environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     * environment.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     *         environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     * environment.
     * </p>
     * 
     * @param environmentId
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     * environment.
     * </p>
     * 
     * @param environmentName
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     *        environment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     * environment.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     *         environment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     * environment.
     * </p>
     * 
     * @param environmentName
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The ARN of the version of the custom platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the version of the custom platform.
     */

    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the version of the custom platform.
     * </p>
     * 
     * @return The ARN of the version of the custom platform.
     */

    public String getPlatformArn() {
        return this.platformArn;
    }

    /**
     * <p>
     * The ARN of the version of the custom platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the version of the custom platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the described events to include only those associated with this
     * request ID.
     * </p>
     * 
     * @param requestId
     *        If specified, AWS Elastic Beanstalk restricts the described events to include only those associated with
     *        this request ID.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the described events to include only those associated with this
     * request ID.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the described events to include only those associated with
     *         this request ID.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the described events to include only those associated with this
     * request ID.
     * </p>
     * 
     * @param requestId
     *        If specified, AWS Elastic Beanstalk restricts the described events to include only those associated with
     *        this request ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * If specified, limits the events returned from this call to include only those with the specified severity or
     * higher.
     * </p>
     * 
     * @param severity
     *        If specified, limits the events returned from this call to include only those with the specified severity
     *        or higher.
     * @see EventSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * If specified, limits the events returned from this call to include only those with the specified severity or
     * higher.
     * </p>
     * 
     * @return If specified, limits the events returned from this call to include only those with the specified severity
     *         or higher.
     * @see EventSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * If specified, limits the events returned from this call to include only those with the specified severity or
     * higher.
     * </p>
     * 
     * @param severity
     *        If specified, limits the events returned from this call to include only those with the specified severity
     *        or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSeverity
     */

    public DescribeEventsRequest withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * If specified, limits the events returned from this call to include only those with the specified severity or
     * higher.
     * </p>
     * 
     * @param severity
     *        If specified, limits the events returned from this call to include only those with the specified severity
     *        or higher.
     * @see EventSeverity
     */

    public void setSeverity(EventSeverity severity) {
        withSeverity(severity);
    }

    /**
     * <p>
     * If specified, limits the events returned from this call to include only those with the specified severity or
     * higher.
     * </p>
     * 
     * @param severity
     *        If specified, limits the events returned from this call to include only those with the specified severity
     *        or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSeverity
     */

    public DescribeEventsRequest withSeverity(EventSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur on or after this
     * time.
     * </p>
     * 
     * @param startTime
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur on or after
     *        this time.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur on or after this
     * time.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur on or after
     *         this time.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur on or after this
     * time.
     * </p>
     * 
     * @param startTime
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur on or after
     *        this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur up to, but not
     * including, the <code>EndTime</code>.
     * </p>
     * 
     * @param endTime
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur up to, but not
     *        including, the <code>EndTime</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur up to, but not
     * including, the <code>EndTime</code>.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur up to, but
     *         not including, the <code>EndTime</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur up to, but not
     * including, the <code>EndTime</code>.
     * </p>
     * 
     * @param endTime
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur up to, but not
     *        including, the <code>EndTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of events that can be returned, beginning with the most recent event.
     * </p>
     * 
     * @param maxRecords
     *        Specifies the maximum number of events that can be returned, beginning with the most recent event.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * Specifies the maximum number of events that can be returned, beginning with the most recent event.
     * </p>
     * 
     * @return Specifies the maximum number of events that can be returned, beginning with the most recent event.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * Specifies the maximum number of events that can be returned, beginning with the most recent event.
     * </p>
     * 
     * @param maxRecords
     *        Specifies the maximum number of events that can be returned, beginning with the most recent event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * Pagination token. If specified, the events return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If specified, the events return the next batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. If specified, the events return the next batch of results.
     * </p>
     * 
     * @return Pagination token. If specified, the events return the next batch of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. If specified, the events return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If specified, the events return the next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: ").append(getVersionLabel()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: ").append(getPlatformArn()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventsRequest == false)
            return false;
        DescribeEventsRequest other = (DescribeEventsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventsRequest clone() {
        return (DescribeEventsRequest) super.clone();
    }

}
