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
package com.amazonaws.services.pricing.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/DescribeServices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The code for the service whose information you want to retrieve, such as <code>AmazonEC2</code>. You can use the
     * <code>ServiceCode</code> to filter the results in a <code>GetProducts</code> call. To retrieve a list of all
     * services, leave this blank.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The format version that you want the response to be in.
     * </p>
     * <p>
     * Valid values are: <code>aws_v1</code>
     * </p>
     */
    private String formatVersion;
    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results that you want returned in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The code for the service whose information you want to retrieve, such as <code>AmazonEC2</code>. You can use the
     * <code>ServiceCode</code> to filter the results in a <code>GetProducts</code> call. To retrieve a list of all
     * services, leave this blank.
     * </p>
     * 
     * @param serviceCode
     *        The code for the service whose information you want to retrieve, such as <code>AmazonEC2</code>. You can
     *        use the <code>ServiceCode</code> to filter the results in a <code>GetProducts</code> call. To retrieve a
     *        list of all services, leave this blank.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code for the service whose information you want to retrieve, such as <code>AmazonEC2</code>. You can use the
     * <code>ServiceCode</code> to filter the results in a <code>GetProducts</code> call. To retrieve a list of all
     * services, leave this blank.
     * </p>
     * 
     * @return The code for the service whose information you want to retrieve, such as <code>AmazonEC2</code>. You can
     *         use the <code>ServiceCode</code> to filter the results in a <code>GetProducts</code> call. To retrieve a
     *         list of all services, leave this blank.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code for the service whose information you want to retrieve, such as <code>AmazonEC2</code>. You can use the
     * <code>ServiceCode</code> to filter the results in a <code>GetProducts</code> call. To retrieve a list of all
     * services, leave this blank.
     * </p>
     * 
     * @param serviceCode
     *        The code for the service whose information you want to retrieve, such as <code>AmazonEC2</code>. You can
     *        use the <code>ServiceCode</code> to filter the results in a <code>GetProducts</code> call. To retrieve a
     *        list of all services, leave this blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The format version that you want the response to be in.
     * </p>
     * <p>
     * Valid values are: <code>aws_v1</code>
     * </p>
     * 
     * @param formatVersion
     *        The format version that you want the response to be in.</p>
     *        <p>
     *        Valid values are: <code>aws_v1</code>
     */

    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    /**
     * <p>
     * The format version that you want the response to be in.
     * </p>
     * <p>
     * Valid values are: <code>aws_v1</code>
     * </p>
     * 
     * @return The format version that you want the response to be in.</p>
     *         <p>
     *         Valid values are: <code>aws_v1</code>
     */

    public String getFormatVersion() {
        return this.formatVersion;
    }

    /**
     * <p>
     * The format version that you want the response to be in.
     * </p>
     * <p>
     * Valid values are: <code>aws_v1</code>
     * </p>
     * 
     * @param formatVersion
     *        The format version that you want the response to be in.</p>
     *        <p>
     *        Valid values are: <code>aws_v1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesRequest withFormatVersion(String formatVersion) {
        setFormatVersion(formatVersion);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results that you want to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results that you want to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that you want returned in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that you want returned in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want returned in the response.
     * </p>
     * 
     * @return The maximum number of results that you want returned in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want returned in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that you want returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getFormatVersion() != null)
            sb.append("FormatVersion: ").append(getFormatVersion()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServicesRequest == false)
            return false;
        DescribeServicesRequest other = (DescribeServicesRequest) obj;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getFormatVersion() == null ^ this.getFormatVersion() == null)
            return false;
        if (other.getFormatVersion() != null && other.getFormatVersion().equals(this.getFormatVersion()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getFormatVersion() == null) ? 0 : getFormatVersion().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServicesRequest clone() {
        return (DescribeServicesRequest) super.clone();
    }

}
