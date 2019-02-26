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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregatorSourcesStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationAggregatorSourcesStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     */
    private String configurationAggregatorName;
    /**
     * <p>
     * Filters the status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> updateStatus;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you specify 0, AWS
     * Config uses the default.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     */

    public void setConfigurationAggregatorName(String configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @return The name of the configuration aggregator.
     */

    public String getConfigurationAggregatorName() {
        return this.configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorSourcesStatusRequest withConfigurationAggregatorName(String configurationAggregatorName) {
        setConfigurationAggregatorName(configurationAggregatorName);
        return this;
    }

    /**
     * <p>
     * Filters the status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filters the status type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Valid value FAILED indicates errors while moving data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid value SUCCEEDED indicates the data was successfully moved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid value OUTDATED indicates the data is not the most recent.
     *         </p>
     *         </li>
     * @see AggregatedSourceStatusType
     */

    public java.util.List<String> getUpdateStatus() {
        if (updateStatus == null) {
            updateStatus = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return updateStatus;
    }

    /**
     * <p>
     * Filters the status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateStatus
     *        Filters the status type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Valid value FAILED indicates errors while moving data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value SUCCEEDED indicates the data was successfully moved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value OUTDATED indicates the data is not the most recent.
     *        </p>
     *        </li>
     * @see AggregatedSourceStatusType
     */

    public void setUpdateStatus(java.util.Collection<String> updateStatus) {
        if (updateStatus == null) {
            this.updateStatus = null;
            return;
        }

        this.updateStatus = new com.amazonaws.internal.SdkInternalList<String>(updateStatus);
    }

    /**
     * <p>
     * Filters the status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateStatus(java.util.Collection)} or {@link #withUpdateStatus(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param updateStatus
     *        Filters the status type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Valid value FAILED indicates errors while moving data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value SUCCEEDED indicates the data was successfully moved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value OUTDATED indicates the data is not the most recent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregatedSourceStatusType
     */

    public DescribeConfigurationAggregatorSourcesStatusRequest withUpdateStatus(String... updateStatus) {
        if (this.updateStatus == null) {
            setUpdateStatus(new com.amazonaws.internal.SdkInternalList<String>(updateStatus.length));
        }
        for (String ele : updateStatus) {
            this.updateStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateStatus
     *        Filters the status type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Valid value FAILED indicates errors while moving data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value SUCCEEDED indicates the data was successfully moved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value OUTDATED indicates the data is not the most recent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregatedSourceStatusType
     */

    public DescribeConfigurationAggregatorSourcesStatusRequest withUpdateStatus(java.util.Collection<String> updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * Filters the status type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Valid value FAILED indicates errors while moving data.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value SUCCEEDED indicates the data was successfully moved.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid value OUTDATED indicates the data is not the most recent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateStatus
     *        Filters the status type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Valid value FAILED indicates errors while moving data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value SUCCEEDED indicates the data was successfully moved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid value OUTDATED indicates the data is not the most recent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregatedSourceStatusType
     */

    public DescribeConfigurationAggregatorSourcesStatusRequest withUpdateStatus(AggregatedSourceStatusType... updateStatus) {
        com.amazonaws.internal.SdkInternalList<String> updateStatusCopy = new com.amazonaws.internal.SdkInternalList<String>(updateStatus.length);
        for (AggregatedSourceStatusType value : updateStatus) {
            updateStatusCopy.add(value.toString());
        }
        if (getUpdateStatus() == null) {
            setUpdateStatus(updateStatusCopy);
        } else {
            getUpdateStatus().addAll(updateStatusCopy);
        }
        return this;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @return The nextToken string returned on a previous page that you use to get the next page of results in a
     *         paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorSourcesStatusRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you specify 0, AWS
     * Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you specify
     *        0, AWS Config uses the default.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you specify 0, AWS
     * Config uses the default.
     * </p>
     * 
     * @return The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you
     *         specify 0, AWS Config uses the default.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you specify 0, AWS
     * Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you specify
     *        0, AWS Config uses the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationAggregatorSourcesStatusRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getConfigurationAggregatorName() != null)
            sb.append("ConfigurationAggregatorName: ").append(getConfigurationAggregatorName()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationAggregatorSourcesStatusRequest == false)
            return false;
        DescribeConfigurationAggregatorSourcesStatusRequest other = (DescribeConfigurationAggregatorSourcesStatusRequest) obj;
        if (other.getConfigurationAggregatorName() == null ^ this.getConfigurationAggregatorName() == null)
            return false;
        if (other.getConfigurationAggregatorName() != null && other.getConfigurationAggregatorName().equals(this.getConfigurationAggregatorName()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationAggregatorName() == null) ? 0 : getConfigurationAggregatorName().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationAggregatorSourcesStatusRequest clone() {
        return (DescribeConfigurationAggregatorSourcesStatusRequest) super.clone();
    }

}
