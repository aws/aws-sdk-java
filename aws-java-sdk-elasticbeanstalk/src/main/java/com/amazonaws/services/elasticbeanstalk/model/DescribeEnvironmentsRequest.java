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
 * Request to describe one or more environments.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated
     * with this application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated
     * with this application version.
     * </p>
     */
    private String versionLabel;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the
     * specified IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> environmentIds;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the
     * specified names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> environmentNames;
    /**
     * <p>
     * Indicates whether to include deleted environments:
     * </p>
     * <p>
     * <code>true</code>: Environments that have been deleted after <code>IncludedDeletedBackTo</code> are displayed.
     * </p>
     * <p>
     * <code>false</code>: Do not include deleted environments.
     * </p>
     */
    private Boolean includeDeleted;
    /**
     * <p>
     * If specified when <code>IncludeDeleted</code> is set to <code>true</code>, then environments deleted after this
     * date are displayed.
     * </p>
     */
    private java.util.Date includedDeletedBackTo;
    /**
     * <p>
     * For a paginated request. Specify a maximum number of environments to include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available environments are retrieved in a single response.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All
     * other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated
     * with this application.
     * </p>
     * 
     * @param applicationName
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are
     *        associated with this application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated
     * with this application.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are
     *         associated with this application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated
     * with this application.
     * </p>
     * 
     * @param applicationName
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are
     *        associated with this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated
     * with this application version.
     * </p>
     * 
     * @param versionLabel
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are
     *        associated with this application version.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated
     * with this application version.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are
     *         associated with this application version.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated
     * with this application version.
     * </p>
     * 
     * @param versionLabel
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are
     *        associated with this application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsRequest withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the
     * specified IDs.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have
     *         the specified IDs.
     */

    public java.util.List<String> getEnvironmentIds() {
        if (environmentIds == null) {
            environmentIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return environmentIds;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the
     * specified IDs.
     * </p>
     * 
     * @param environmentIds
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have
     *        the specified IDs.
     */

    public void setEnvironmentIds(java.util.Collection<String> environmentIds) {
        if (environmentIds == null) {
            this.environmentIds = null;
            return;
        }

        this.environmentIds = new com.amazonaws.internal.SdkInternalList<String>(environmentIds);
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the
     * specified IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentIds(java.util.Collection)} or {@link #withEnvironmentIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param environmentIds
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have
     *        the specified IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsRequest withEnvironmentIds(String... environmentIds) {
        if (this.environmentIds == null) {
            setEnvironmentIds(new com.amazonaws.internal.SdkInternalList<String>(environmentIds.length));
        }
        for (String ele : environmentIds) {
            this.environmentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the
     * specified IDs.
     * </p>
     * 
     * @param environmentIds
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have
     *        the specified IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsRequest withEnvironmentIds(java.util.Collection<String> environmentIds) {
        setEnvironmentIds(environmentIds);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the
     * specified names.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have
     *         the specified names.
     */

    public java.util.List<String> getEnvironmentNames() {
        if (environmentNames == null) {
            environmentNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return environmentNames;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the
     * specified names.
     * </p>
     * 
     * @param environmentNames
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have
     *        the specified names.
     */

    public void setEnvironmentNames(java.util.Collection<String> environmentNames) {
        if (environmentNames == null) {
            this.environmentNames = null;
            return;
        }

        this.environmentNames = new com.amazonaws.internal.SdkInternalList<String>(environmentNames);
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the
     * specified names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentNames(java.util.Collection)} or {@link #withEnvironmentNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param environmentNames
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have
     *        the specified names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsRequest withEnvironmentNames(String... environmentNames) {
        if (this.environmentNames == null) {
            setEnvironmentNames(new com.amazonaws.internal.SdkInternalList<String>(environmentNames.length));
        }
        for (String ele : environmentNames) {
            this.environmentNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the
     * specified names.
     * </p>
     * 
     * @param environmentNames
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have
     *        the specified names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsRequest withEnvironmentNames(java.util.Collection<String> environmentNames) {
        setEnvironmentNames(environmentNames);
        return this;
    }

    /**
     * <p>
     * Indicates whether to include deleted environments:
     * </p>
     * <p>
     * <code>true</code>: Environments that have been deleted after <code>IncludedDeletedBackTo</code> are displayed.
     * </p>
     * <p>
     * <code>false</code>: Do not include deleted environments.
     * </p>
     * 
     * @param includeDeleted
     *        Indicates whether to include deleted environments:</p>
     *        <p>
     *        <code>true</code>: Environments that have been deleted after <code>IncludedDeletedBackTo</code> are
     *        displayed.
     *        </p>
     *        <p>
     *        <code>false</code>: Do not include deleted environments.
     */

    public void setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
    }

    /**
     * <p>
     * Indicates whether to include deleted environments:
     * </p>
     * <p>
     * <code>true</code>: Environments that have been deleted after <code>IncludedDeletedBackTo</code> are displayed.
     * </p>
     * <p>
     * <code>false</code>: Do not include deleted environments.
     * </p>
     * 
     * @return Indicates whether to include deleted environments:</p>
     *         <p>
     *         <code>true</code>: Environments that have been deleted after <code>IncludedDeletedBackTo</code> are
     *         displayed.
     *         </p>
     *         <p>
     *         <code>false</code>: Do not include deleted environments.
     */

    public Boolean getIncludeDeleted() {
        return this.includeDeleted;
    }

    /**
     * <p>
     * Indicates whether to include deleted environments:
     * </p>
     * <p>
     * <code>true</code>: Environments that have been deleted after <code>IncludedDeletedBackTo</code> are displayed.
     * </p>
     * <p>
     * <code>false</code>: Do not include deleted environments.
     * </p>
     * 
     * @param includeDeleted
     *        Indicates whether to include deleted environments:</p>
     *        <p>
     *        <code>true</code>: Environments that have been deleted after <code>IncludedDeletedBackTo</code> are
     *        displayed.
     *        </p>
     *        <p>
     *        <code>false</code>: Do not include deleted environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsRequest withIncludeDeleted(Boolean includeDeleted) {
        setIncludeDeleted(includeDeleted);
        return this;
    }

    /**
     * <p>
     * Indicates whether to include deleted environments:
     * </p>
     * <p>
     * <code>true</code>: Environments that have been deleted after <code>IncludedDeletedBackTo</code> are displayed.
     * </p>
     * <p>
     * <code>false</code>: Do not include deleted environments.
     * </p>
     * 
     * @return Indicates whether to include deleted environments:</p>
     *         <p>
     *         <code>true</code>: Environments that have been deleted after <code>IncludedDeletedBackTo</code> are
     *         displayed.
     *         </p>
     *         <p>
     *         <code>false</code>: Do not include deleted environments.
     */

    public Boolean isIncludeDeleted() {
        return this.includeDeleted;
    }

    /**
     * <p>
     * If specified when <code>IncludeDeleted</code> is set to <code>true</code>, then environments deleted after this
     * date are displayed.
     * </p>
     * 
     * @param includedDeletedBackTo
     *        If specified when <code>IncludeDeleted</code> is set to <code>true</code>, then environments deleted after
     *        this date are displayed.
     */

    public void setIncludedDeletedBackTo(java.util.Date includedDeletedBackTo) {
        this.includedDeletedBackTo = includedDeletedBackTo;
    }

    /**
     * <p>
     * If specified when <code>IncludeDeleted</code> is set to <code>true</code>, then environments deleted after this
     * date are displayed.
     * </p>
     * 
     * @return If specified when <code>IncludeDeleted</code> is set to <code>true</code>, then environments deleted
     *         after this date are displayed.
     */

    public java.util.Date getIncludedDeletedBackTo() {
        return this.includedDeletedBackTo;
    }

    /**
     * <p>
     * If specified when <code>IncludeDeleted</code> is set to <code>true</code>, then environments deleted after this
     * date are displayed.
     * </p>
     * 
     * @param includedDeletedBackTo
     *        If specified when <code>IncludeDeleted</code> is set to <code>true</code>, then environments deleted after
     *        this date are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsRequest withIncludedDeletedBackTo(java.util.Date includedDeletedBackTo) {
        setIncludedDeletedBackTo(includedDeletedBackTo);
        return this;
    }

    /**
     * <p>
     * For a paginated request. Specify a maximum number of environments to include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available environments are retrieved in a single response.
     * </p>
     * 
     * @param maxRecords
     *        For a paginated request. Specify a maximum number of environments to include in each response.</p>
     *        <p>
     *        If no <code>MaxRecords</code> is specified, all available environments are retrieved in a single response.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * For a paginated request. Specify a maximum number of environments to include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available environments are retrieved in a single response.
     * </p>
     * 
     * @return For a paginated request. Specify a maximum number of environments to include in each response.</p>
     *         <p>
     *         If no <code>MaxRecords</code> is specified, all available environments are retrieved in a single
     *         response.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * For a paginated request. Specify a maximum number of environments to include in each response.
     * </p>
     * <p>
     * If no <code>MaxRecords</code> is specified, all available environments are retrieved in a single response.
     * </p>
     * 
     * @param maxRecords
     *        For a paginated request. Specify a maximum number of environments to include in each response.</p>
     *        <p>
     *        If no <code>MaxRecords</code> is specified, all available environments are retrieved in a single response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All
     * other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     * 
     * @param nextToken
     *        For a paginated request. Specify a token from a previous response page to retrieve the next response page.
     *        All other parameter values must be identical to the ones specified in the initial request.</p>
     *        <p>
     *        If no <code>NextToken</code> is specified, the first page is retrieved.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All
     * other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     * 
     * @return For a paginated request. Specify a token from a previous response page to retrieve the next response
     *         page. All other parameter values must be identical to the ones specified in the initial request.</p>
     *         <p>
     *         If no <code>NextToken</code> is specified, the first page is retrieved.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All
     * other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     * 
     * @param nextToken
     *        For a paginated request. Specify a token from a previous response page to retrieve the next response page.
     *        All other parameter values must be identical to the ones specified in the initial request.</p>
     *        <p>
     *        If no <code>NextToken</code> is specified, the first page is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsRequest withNextToken(String nextToken) {
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
        if (getEnvironmentIds() != null)
            sb.append("EnvironmentIds: ").append(getEnvironmentIds()).append(",");
        if (getEnvironmentNames() != null)
            sb.append("EnvironmentNames: ").append(getEnvironmentNames()).append(",");
        if (getIncludeDeleted() != null)
            sb.append("IncludeDeleted: ").append(getIncludeDeleted()).append(",");
        if (getIncludedDeletedBackTo() != null)
            sb.append("IncludedDeletedBackTo: ").append(getIncludedDeletedBackTo()).append(",");
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

        if (obj instanceof DescribeEnvironmentsRequest == false)
            return false;
        DescribeEnvironmentsRequest other = (DescribeEnvironmentsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getEnvironmentIds() == null ^ this.getEnvironmentIds() == null)
            return false;
        if (other.getEnvironmentIds() != null && other.getEnvironmentIds().equals(this.getEnvironmentIds()) == false)
            return false;
        if (other.getEnvironmentNames() == null ^ this.getEnvironmentNames() == null)
            return false;
        if (other.getEnvironmentNames() != null && other.getEnvironmentNames().equals(this.getEnvironmentNames()) == false)
            return false;
        if (other.getIncludeDeleted() == null ^ this.getIncludeDeleted() == null)
            return false;
        if (other.getIncludeDeleted() != null && other.getIncludeDeleted().equals(this.getIncludeDeleted()) == false)
            return false;
        if (other.getIncludedDeletedBackTo() == null ^ this.getIncludedDeletedBackTo() == null)
            return false;
        if (other.getIncludedDeletedBackTo() != null && other.getIncludedDeletedBackTo().equals(this.getIncludedDeletedBackTo()) == false)
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
        hashCode = prime * hashCode + ((getEnvironmentIds() == null) ? 0 : getEnvironmentIds().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentNames() == null) ? 0 : getEnvironmentNames().hashCode());
        hashCode = prime * hashCode + ((getIncludeDeleted() == null) ? 0 : getIncludeDeleted().hashCode());
        hashCode = prime * hashCode + ((getIncludedDeletedBackTo() == null) ? 0 : getIncludedDeletedBackTo().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentsRequest clone() {
        return (DescribeEnvironmentsRequest) super.clone();
    }

}
