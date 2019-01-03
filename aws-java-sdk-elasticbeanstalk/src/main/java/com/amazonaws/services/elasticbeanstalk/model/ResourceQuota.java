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

/**
 * <p>
 * The AWS Elastic Beanstalk quota information for a single resource type in an AWS account. It reflects the resource's
 * limits for this account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ResourceQuota" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceQuota implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
     * </p>
     */
    private Integer maximum;

    /**
     * <p>
     * The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
     * </p>
     * 
     * @param maximum
     *        The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
     */

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
     * </p>
     * 
     * @return The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
     */

    public Integer getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
     * </p>
     * 
     * @param maximum
     *        The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceQuota withMaximum(Integer maximum) {
        setMaximum(maximum);
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
        if (getMaximum() != null)
            sb.append("Maximum: ").append(getMaximum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceQuota == false)
            return false;
        ResourceQuota other = (ResourceQuota) obj;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        return hashCode;
    }

    @Override
    public ResourceQuota clone() {
        try {
            return (ResourceQuota) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
