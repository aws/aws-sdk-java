/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about when an origin group fails over.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFrontDistributionOriginGroupFailover"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionOriginGroupFailover implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the status codes that cause an origin group to fail over.
     * </p>
     */
    private AwsCloudFrontDistributionOriginGroupFailoverStatusCodes statusCodes;

    /**
     * <p>
     * Information about the status codes that cause an origin group to fail over.
     * </p>
     * 
     * @param statusCodes
     *        Information about the status codes that cause an origin group to fail over.
     */

    public void setStatusCodes(AwsCloudFrontDistributionOriginGroupFailoverStatusCodes statusCodes) {
        this.statusCodes = statusCodes;
    }

    /**
     * <p>
     * Information about the status codes that cause an origin group to fail over.
     * </p>
     * 
     * @return Information about the status codes that cause an origin group to fail over.
     */

    public AwsCloudFrontDistributionOriginGroupFailoverStatusCodes getStatusCodes() {
        return this.statusCodes;
    }

    /**
     * <p>
     * Information about the status codes that cause an origin group to fail over.
     * </p>
     * 
     * @param statusCodes
     *        Information about the status codes that cause an origin group to fail over.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginGroupFailover withStatusCodes(AwsCloudFrontDistributionOriginGroupFailoverStatusCodes statusCodes) {
        setStatusCodes(statusCodes);
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
        if (getStatusCodes() != null)
            sb.append("StatusCodes: ").append(getStatusCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionOriginGroupFailover == false)
            return false;
        AwsCloudFrontDistributionOriginGroupFailover other = (AwsCloudFrontDistributionOriginGroupFailover) obj;
        if (other.getStatusCodes() == null ^ this.getStatusCodes() == null)
            return false;
        if (other.getStatusCodes() != null && other.getStatusCodes().equals(this.getStatusCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCodes() == null) ? 0 : getStatusCodes().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFrontDistributionOriginGroupFailover clone() {
        try {
            return (AwsCloudFrontDistributionOriginGroupFailover) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFrontDistributionOriginGroupFailoverMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
