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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeCustomDomainAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomDomainAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The custom domain name for the custom domain association.
     * </p>
     */
    private String customDomainName;
    /**
     * <p>
     * The certificate Amazon Resource Name (ARN) for the custom domain association.
     * </p>
     */
    private String customDomainCertificateArn;
    /**
     * <p>
     * The maximum records setting for the associated custom domain.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * The marker for the custom domain association.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The custom domain name for the custom domain association.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name for the custom domain association.
     */

    public void setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
    }

    /**
     * <p>
     * The custom domain name for the custom domain association.
     * </p>
     * 
     * @return The custom domain name for the custom domain association.
     */

    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * <p>
     * The custom domain name for the custom domain association.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name for the custom domain association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomDomainAssociationsRequest withCustomDomainName(String customDomainName) {
        setCustomDomainName(customDomainName);
        return this;
    }

    /**
     * <p>
     * The certificate Amazon Resource Name (ARN) for the custom domain association.
     * </p>
     * 
     * @param customDomainCertificateArn
     *        The certificate Amazon Resource Name (ARN) for the custom domain association.
     */

    public void setCustomDomainCertificateArn(String customDomainCertificateArn) {
        this.customDomainCertificateArn = customDomainCertificateArn;
    }

    /**
     * <p>
     * The certificate Amazon Resource Name (ARN) for the custom domain association.
     * </p>
     * 
     * @return The certificate Amazon Resource Name (ARN) for the custom domain association.
     */

    public String getCustomDomainCertificateArn() {
        return this.customDomainCertificateArn;
    }

    /**
     * <p>
     * The certificate Amazon Resource Name (ARN) for the custom domain association.
     * </p>
     * 
     * @param customDomainCertificateArn
     *        The certificate Amazon Resource Name (ARN) for the custom domain association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomDomainAssociationsRequest withCustomDomainCertificateArn(String customDomainCertificateArn) {
        setCustomDomainCertificateArn(customDomainCertificateArn);
        return this;
    }

    /**
     * <p>
     * The maximum records setting for the associated custom domain.
     * </p>
     * 
     * @param maxRecords
     *        The maximum records setting for the associated custom domain.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum records setting for the associated custom domain.
     * </p>
     * 
     * @return The maximum records setting for the associated custom domain.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum records setting for the associated custom domain.
     * </p>
     * 
     * @param maxRecords
     *        The maximum records setting for the associated custom domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomDomainAssociationsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * The marker for the custom domain association.
     * </p>
     * 
     * @param marker
     *        The marker for the custom domain association.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the custom domain association.
     * </p>
     * 
     * @return The marker for the custom domain association.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the custom domain association.
     * </p>
     * 
     * @param marker
     *        The marker for the custom domain association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomDomainAssociationsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getCustomDomainName() != null)
            sb.append("CustomDomainName: ").append(getCustomDomainName()).append(",");
        if (getCustomDomainCertificateArn() != null)
            sb.append("CustomDomainCertificateArn: ").append(getCustomDomainCertificateArn()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCustomDomainAssociationsRequest == false)
            return false;
        DescribeCustomDomainAssociationsRequest other = (DescribeCustomDomainAssociationsRequest) obj;
        if (other.getCustomDomainName() == null ^ this.getCustomDomainName() == null)
            return false;
        if (other.getCustomDomainName() != null && other.getCustomDomainName().equals(this.getCustomDomainName()) == false)
            return false;
        if (other.getCustomDomainCertificateArn() == null ^ this.getCustomDomainCertificateArn() == null)
            return false;
        if (other.getCustomDomainCertificateArn() != null && other.getCustomDomainCertificateArn().equals(this.getCustomDomainCertificateArn()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDomainName() == null) ? 0 : getCustomDomainName().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainCertificateArn() == null) ? 0 : getCustomDomainCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomDomainAssociationsRequest clone() {
        return (DescribeCustomDomainAssociationsRequest) super.clone();
    }

}
