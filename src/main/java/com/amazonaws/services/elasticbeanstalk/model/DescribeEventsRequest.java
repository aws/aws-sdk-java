/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeEvents(DescribeEventsRequest) DescribeEvents operation}.
 * <p>
 * Returns list of event descriptions matching criteria up to the last 6
 * weeks.
 * </p>
 * <p>
 * <b>NOTE:</b> This action returns the most recent 1,000 events from the
 * specified NextToken.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeEvents(DescribeEventsRequest)
 */
public class DescribeEventsRequest extends AmazonWebServiceRequest {

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those associated with this application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that are associated with this environment
     * configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this environment.
     */
    private String environmentId;

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * If specified, AWS Elastic Beanstalk restricts the described events to
     * include only those associated with this request ID.
     */
    private String requestId;

    /**
     * If specified, limits the events returned from this call to include
     * only those with the specified severity or higher.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     */
    private String severity;

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that occur on or after this time.
     */
    private java.util.Date startTime;

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that occur up to, but not including, the
     * <code>EndTime</code>.
     */
    private java.util.Date endTime;

    /**
     * Specifies the maximum number of events that can be returned, beginning
     * with the most recent event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxRecords;

    /**
     * Pagination token. If specified, the events return the next batch of
     * results.
     */
    private String nextToken;

    /**
     * Default constructor for a new DescribeEventsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeEventsRequest() {}
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those associated with this application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those associated with this application.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those associated with this application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those associated with this application.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to include only those associated with this application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to include only those associated with this application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this application version.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this application version.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this application version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this application version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }
    
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that are associated with this environment
     * configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that are associated with this environment
     *         configuration.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that are associated with this environment
     * configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that are associated with this environment
     *         configuration.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that are associated with this environment
     * configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that are associated with this environment
     *         configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this environment.
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this environment.
     */
    public String getEnvironmentId() {
        return environmentId;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this environment.
     *
     * @param environmentId If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this environment.
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentId If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this environment.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this environment.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those associated with this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those associated with this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the described events to
     * include only those associated with this request ID.
     *
     * @return If specified, AWS Elastic Beanstalk restricts the described events to
     *         include only those associated with this request ID.
     */
    public String getRequestId() {
        return requestId;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the described events to
     * include only those associated with this request ID.
     *
     * @param requestId If specified, AWS Elastic Beanstalk restricts the described events to
     *         include only those associated with this request ID.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the described events to
     * include only those associated with this request ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestId If specified, AWS Elastic Beanstalk restricts the described events to
     *         include only those associated with this request ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    
    
    /**
     * If specified, limits the events returned from this call to include
     * only those with the specified severity or higher.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @return If specified, limits the events returned from this call to include
     *         only those with the specified severity or higher.
     *
     * @see EventSeverity
     */
    public String getSeverity() {
        return severity;
    }
    
    /**
     * If specified, limits the events returned from this call to include
     * only those with the specified severity or higher.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @param severity If specified, limits the events returned from this call to include
     *         only those with the specified severity or higher.
     *
     * @see EventSeverity
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }
    
    /**
     * If specified, limits the events returned from this call to include
     * only those with the specified severity or higher.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @param severity If specified, limits the events returned from this call to include
     *         only those with the specified severity or higher.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see EventSeverity
     */
    public DescribeEventsRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that occur on or after this time.
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that occur on or after this time.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that occur on or after this time.
     *
     * @param startTime If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that occur on or after this time.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that occur on or after this time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that occur on or after this time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }
    
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that occur up to, but not including, the
     * <code>EndTime</code>.
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that occur up to, but not including, the
     *         <code>EndTime</code>.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that occur up to, but not including, the
     * <code>EndTime</code>.
     *
     * @param endTime If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that occur up to, but not including, the
     *         <code>EndTime</code>.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to those that occur up to, but not including, the
     * <code>EndTime</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to those that occur up to, but not including, the
     *         <code>EndTime</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }
    
    
    /**
     * Specifies the maximum number of events that can be returned, beginning
     * with the most recent event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Specifies the maximum number of events that can be returned, beginning
     *         with the most recent event.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * Specifies the maximum number of events that can be returned, beginning
     * with the most recent event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxRecords Specifies the maximum number of events that can be returned, beginning
     *         with the most recent event.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * Specifies the maximum number of events that can be returned, beginning
     * with the most recent event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxRecords Specifies the maximum number of events that can be returned, beginning
     *         with the most recent event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * Pagination token. If specified, the events return the next batch of
     * results.
     *
     * @return Pagination token. If specified, the events return the next batch of
     *         results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Pagination token. If specified, the events return the next batch of
     * results.
     *
     * @param nextToken Pagination token. If specified, the events return the next batch of
     *         results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Pagination token. If specified, the events return the next batch of
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Pagination token. If specified, the events return the next batch of
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("ApplicationName: " + applicationName + ", ");
        sb.append("VersionLabel: " + versionLabel + ", ");
        sb.append("TemplateName: " + templateName + ", ");
        sb.append("EnvironmentId: " + environmentId + ", ");
        sb.append("EnvironmentName: " + environmentName + ", ");
        sb.append("RequestId: " + requestId + ", ");
        sb.append("Severity: " + severity + ", ");
        sb.append("StartTime: " + startTime + ", ");
        sb.append("EndTime: " + endTime + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    