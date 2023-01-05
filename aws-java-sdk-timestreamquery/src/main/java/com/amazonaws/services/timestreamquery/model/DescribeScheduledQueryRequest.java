/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeScheduledQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the scheduled query.
     * </p>
     */
    private String scheduledQueryArn;

    /**
     * <p>
     * The ARN of the scheduled query.
     * </p>
     * 
     * @param scheduledQueryArn
     *        The ARN of the scheduled query.
     */

    public void setScheduledQueryArn(String scheduledQueryArn) {
        this.scheduledQueryArn = scheduledQueryArn;
    }

    /**
     * <p>
     * The ARN of the scheduled query.
     * </p>
     * 
     * @return The ARN of the scheduled query.
     */

    public String getScheduledQueryArn() {
        return this.scheduledQueryArn;
    }

    /**
     * <p>
     * The ARN of the scheduled query.
     * </p>
     * 
     * @param scheduledQueryArn
     *        The ARN of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledQueryRequest withScheduledQueryArn(String scheduledQueryArn) {
        setScheduledQueryArn(scheduledQueryArn);
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
        if (getScheduledQueryArn() != null)
            sb.append("ScheduledQueryArn: ").append(getScheduledQueryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledQueryRequest == false)
            return false;
        DescribeScheduledQueryRequest other = (DescribeScheduledQueryRequest) obj;
        if (other.getScheduledQueryArn() == null ^ this.getScheduledQueryArn() == null)
            return false;
        if (other.getScheduledQueryArn() != null && other.getScheduledQueryArn().equals(this.getScheduledQueryArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledQueryArn() == null) ? 0 : getScheduledQueryArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduledQueryRequest clone() {
        return (DescribeScheduledQueryRequest) super.clone();
    }

}
