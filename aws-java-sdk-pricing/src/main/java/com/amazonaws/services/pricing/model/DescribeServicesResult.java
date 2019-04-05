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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/DescribeServices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The service metadata for the service or services in the response.
     * </p>
     */
    private java.util.List<Service> services;
    /**
     * <p>
     * The format version of the response. For example, <code>aws_v1</code>.
     * </p>
     */
    private String formatVersion;
    /**
     * <p>
     * The pagination token for the next set of retreivable results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The service metadata for the service or services in the response.
     * </p>
     * 
     * @return The service metadata for the service or services in the response.
     */

    public java.util.List<Service> getServices() {
        return services;
    }

    /**
     * <p>
     * The service metadata for the service or services in the response.
     * </p>
     * 
     * @param services
     *        The service metadata for the service or services in the response.
     */

    public void setServices(java.util.Collection<Service> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<Service>(services);
    }

    /**
     * <p>
     * The service metadata for the service or services in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        The service metadata for the service or services in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesResult withServices(Service... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<Service>(services.length));
        }
        for (Service ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The service metadata for the service or services in the response.
     * </p>
     * 
     * @param services
     *        The service metadata for the service or services in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesResult withServices(java.util.Collection<Service> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * The format version of the response. For example, <code>aws_v1</code>.
     * </p>
     * 
     * @param formatVersion
     *        The format version of the response. For example, <code>aws_v1</code>.
     */

    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    /**
     * <p>
     * The format version of the response. For example, <code>aws_v1</code>.
     * </p>
     * 
     * @return The format version of the response. For example, <code>aws_v1</code>.
     */

    public String getFormatVersion() {
        return this.formatVersion;
    }

    /**
     * <p>
     * The format version of the response. For example, <code>aws_v1</code>.
     * </p>
     * 
     * @param formatVersion
     *        The format version of the response. For example, <code>aws_v1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesResult withFormatVersion(String formatVersion) {
        setFormatVersion(formatVersion);
        return this;
    }

    /**
     * <p>
     * The pagination token for the next set of retreivable results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next set of retreivable results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for the next set of retreivable results.
     * </p>
     * 
     * @return The pagination token for the next set of retreivable results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for the next set of retreivable results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next set of retreivable results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesResult withNextToken(String nextToken) {
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
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getFormatVersion() != null)
            sb.append("FormatVersion: ").append(getFormatVersion()).append(",");
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

        if (obj instanceof DescribeServicesResult == false)
            return false;
        DescribeServicesResult other = (DescribeServicesResult) obj;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getFormatVersion() == null ^ this.getFormatVersion() == null)
            return false;
        if (other.getFormatVersion() != null && other.getFormatVersion().equals(this.getFormatVersion()) == false)
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

        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getFormatVersion() == null) ? 0 : getFormatVersion().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServicesResult clone() {
        try {
            return (DescribeServicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
