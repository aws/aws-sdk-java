/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Result message containing a list of configuration descriptions.
 * </p>
 */
public class DescribeApplicationVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include ones that are associated
     * with the specified application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * If specified, restricts the returned descriptions to only include ones that have the specified version labels.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> versionLabels;
    /**
     * <p>
     * Specify a maximum number of application versions to paginate in the request.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * Specify a next token to retrieve the next page in a paginated request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include ones that are associated
     * with the specified application.
     * </p>
     * 
     * @param applicationName
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include ones that are
     *        associated with the specified application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include ones that are associated
     * with the specified application.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include ones that are
     *         associated with the specified application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include ones that are associated
     * with the specified application.
     * </p>
     * 
     * @param applicationName
     *        If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include ones that are
     *        associated with the specified application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationVersionsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * If specified, restricts the returned descriptions to only include ones that have the specified version labels.
     * </p>
     * 
     * @return If specified, restricts the returned descriptions to only include ones that have the specified version
     *         labels.
     */

    public java.util.List<String> getVersionLabels() {
        if (versionLabels == null) {
            versionLabels = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return versionLabels;
    }

    /**
     * <p>
     * If specified, restricts the returned descriptions to only include ones that have the specified version labels.
     * </p>
     * 
     * @param versionLabels
     *        If specified, restricts the returned descriptions to only include ones that have the specified version
     *        labels.
     */

    public void setVersionLabels(java.util.Collection<String> versionLabels) {
        if (versionLabels == null) {
            this.versionLabels = null;
            return;
        }

        this.versionLabels = new com.amazonaws.internal.SdkInternalList<String>(versionLabels);
    }

    /**
     * <p>
     * If specified, restricts the returned descriptions to only include ones that have the specified version labels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionLabels(java.util.Collection)} or {@link #withVersionLabels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param versionLabels
     *        If specified, restricts the returned descriptions to only include ones that have the specified version
     *        labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationVersionsRequest withVersionLabels(String... versionLabels) {
        if (this.versionLabels == null) {
            setVersionLabels(new com.amazonaws.internal.SdkInternalList<String>(versionLabels.length));
        }
        for (String ele : versionLabels) {
            this.versionLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If specified, restricts the returned descriptions to only include ones that have the specified version labels.
     * </p>
     * 
     * @param versionLabels
     *        If specified, restricts the returned descriptions to only include ones that have the specified version
     *        labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationVersionsRequest withVersionLabels(java.util.Collection<String> versionLabels) {
        setVersionLabels(versionLabels);
        return this;
    }

    /**
     * <p>
     * Specify a maximum number of application versions to paginate in the request.
     * </p>
     * 
     * @param maxRecords
     *        Specify a maximum number of application versions to paginate in the request.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * Specify a maximum number of application versions to paginate in the request.
     * </p>
     * 
     * @return Specify a maximum number of application versions to paginate in the request.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * Specify a maximum number of application versions to paginate in the request.
     * </p>
     * 
     * @param maxRecords
     *        Specify a maximum number of application versions to paginate in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationVersionsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * Specify a next token to retrieve the next page in a paginated request.
     * </p>
     * 
     * @param nextToken
     *        Specify a next token to retrieve the next page in a paginated request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify a next token to retrieve the next page in a paginated request.
     * </p>
     * 
     * @return Specify a next token to retrieve the next page in a paginated request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify a next token to retrieve the next page in a paginated request.
     * </p>
     * 
     * @param nextToken
     *        Specify a next token to retrieve the next page in a paginated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getVersionLabels() != null)
            sb.append("VersionLabels: " + getVersionLabels() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationVersionsRequest == false)
            return false;
        DescribeApplicationVersionsRequest other = (DescribeApplicationVersionsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabels() == null ^ this.getVersionLabels() == null)
            return false;
        if (other.getVersionLabels() != null && other.getVersionLabels().equals(this.getVersionLabels()) == false)
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
        hashCode = prime * hashCode + ((getVersionLabels() == null) ? 0 : getVersionLabels().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationVersionsRequest clone() {
        return (DescribeApplicationVersionsRequest) super.clone();
    }
}
