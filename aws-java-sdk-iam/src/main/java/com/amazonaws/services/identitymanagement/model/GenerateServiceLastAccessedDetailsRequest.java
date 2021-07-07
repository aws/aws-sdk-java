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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GenerateServiceLastAccessedDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateServiceLastAccessedDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when the
     * resource was last used in an attempt to access an Amazon Web Services service.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether you want to generate information about the
     * last attempt to access services or actions. If you specify service-level granularity, this operation generates
     * only service data. If you specify action-level granularity, it generates service and action data. If you don't
     * include this optional parameter, the operation generates service data.
     * </p>
     */
    private String granularity;

    /**
     * <p>
     * The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when the
     * resource was last used in an attempt to access an Amazon Web Services service.
     * </p>
     * 
     * @param arn
     *        The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when
     *        the resource was last used in an attempt to access an Amazon Web Services service.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when the
     * resource was last used in an attempt to access an Amazon Web Services service.
     * </p>
     * 
     * @return The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about
     *         when the resource was last used in an attempt to access an Amazon Web Services service.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when the
     * resource was last used in an attempt to access an Amazon Web Services service.
     * </p>
     * 
     * @param arn
     *        The ARN of the IAM resource (user, group, role, or managed policy) used to generate information about when
     *        the resource was last used in an attempt to access an Amazon Web Services service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateServiceLastAccessedDetailsRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether you want to generate information about the
     * last attempt to access services or actions. If you specify service-level granularity, this operation generates
     * only service data. If you specify action-level granularity, it generates service and action data. If you don't
     * include this optional parameter, the operation generates service data.
     * </p>
     * 
     * @param granularity
     *        The level of detail that you want to generate. You can specify whether you want to generate information
     *        about the last attempt to access services or actions. If you specify service-level granularity, this
     *        operation generates only service data. If you specify action-level granularity, it generates service and
     *        action data. If you don't include this optional parameter, the operation generates service data.
     * @see AccessAdvisorUsageGranularityType
     */

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether you want to generate information about the
     * last attempt to access services or actions. If you specify service-level granularity, this operation generates
     * only service data. If you specify action-level granularity, it generates service and action data. If you don't
     * include this optional parameter, the operation generates service data.
     * </p>
     * 
     * @return The level of detail that you want to generate. You can specify whether you want to generate information
     *         about the last attempt to access services or actions. If you specify service-level granularity, this
     *         operation generates only service data. If you specify action-level granularity, it generates service and
     *         action data. If you don't include this optional parameter, the operation generates service data.
     * @see AccessAdvisorUsageGranularityType
     */

    public String getGranularity() {
        return this.granularity;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether you want to generate information about the
     * last attempt to access services or actions. If you specify service-level granularity, this operation generates
     * only service data. If you specify action-level granularity, it generates service and action data. If you don't
     * include this optional parameter, the operation generates service data.
     * </p>
     * 
     * @param granularity
     *        The level of detail that you want to generate. You can specify whether you want to generate information
     *        about the last attempt to access services or actions. If you specify service-level granularity, this
     *        operation generates only service data. If you specify action-level granularity, it generates service and
     *        action data. If you don't include this optional parameter, the operation generates service data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessAdvisorUsageGranularityType
     */

    public GenerateServiceLastAccessedDetailsRequest withGranularity(String granularity) {
        setGranularity(granularity);
        return this;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether you want to generate information about the
     * last attempt to access services or actions. If you specify service-level granularity, this operation generates
     * only service data. If you specify action-level granularity, it generates service and action data. If you don't
     * include this optional parameter, the operation generates service data.
     * </p>
     * 
     * @param granularity
     *        The level of detail that you want to generate. You can specify whether you want to generate information
     *        about the last attempt to access services or actions. If you specify service-level granularity, this
     *        operation generates only service data. If you specify action-level granularity, it generates service and
     *        action data. If you don't include this optional parameter, the operation generates service data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessAdvisorUsageGranularityType
     */

    public GenerateServiceLastAccessedDetailsRequest withGranularity(AccessAdvisorUsageGranularityType granularity) {
        this.granularity = granularity.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getGranularity() != null)
            sb.append("Granularity: ").append(getGranularity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateServiceLastAccessedDetailsRequest == false)
            return false;
        GenerateServiceLastAccessedDetailsRequest other = (GenerateServiceLastAccessedDetailsRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        return hashCode;
    }

    @Override
    public GenerateServiceLastAccessedDetailsRequest clone() {
        return (GenerateServiceLastAccessedDetailsRequest) super.clone();
    }

}
