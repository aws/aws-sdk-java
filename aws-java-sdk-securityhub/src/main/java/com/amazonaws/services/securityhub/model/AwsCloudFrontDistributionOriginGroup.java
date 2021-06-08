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
 * Information about an origin group for the distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFrontDistributionOriginGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionOriginGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides the criteria for an origin group to fail over.
     * </p>
     */
    private AwsCloudFrontDistributionOriginGroupFailover failoverCriteria;

    /**
     * <p>
     * Provides the criteria for an origin group to fail over.
     * </p>
     * 
     * @param failoverCriteria
     *        Provides the criteria for an origin group to fail over.
     */

    public void setFailoverCriteria(AwsCloudFrontDistributionOriginGroupFailover failoverCriteria) {
        this.failoverCriteria = failoverCriteria;
    }

    /**
     * <p>
     * Provides the criteria for an origin group to fail over.
     * </p>
     * 
     * @return Provides the criteria for an origin group to fail over.
     */

    public AwsCloudFrontDistributionOriginGroupFailover getFailoverCriteria() {
        return this.failoverCriteria;
    }

    /**
     * <p>
     * Provides the criteria for an origin group to fail over.
     * </p>
     * 
     * @param failoverCriteria
     *        Provides the criteria for an origin group to fail over.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginGroup withFailoverCriteria(AwsCloudFrontDistributionOriginGroupFailover failoverCriteria) {
        setFailoverCriteria(failoverCriteria);
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
        if (getFailoverCriteria() != null)
            sb.append("FailoverCriteria: ").append(getFailoverCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionOriginGroup == false)
            return false;
        AwsCloudFrontDistributionOriginGroup other = (AwsCloudFrontDistributionOriginGroup) obj;
        if (other.getFailoverCriteria() == null ^ this.getFailoverCriteria() == null)
            return false;
        if (other.getFailoverCriteria() != null && other.getFailoverCriteria().equals(this.getFailoverCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailoverCriteria() == null) ? 0 : getFailoverCriteria().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFrontDistributionOriginGroup clone() {
        try {
            return (AwsCloudFrontDistributionOriginGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFrontDistributionOriginGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
