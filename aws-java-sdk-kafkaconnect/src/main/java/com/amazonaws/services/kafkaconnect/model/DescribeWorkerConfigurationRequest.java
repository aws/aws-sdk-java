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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeWorkerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkerConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration that you want to get information about.
     * </p>
     */
    private String workerConfigurationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration that you want to get information about.
     * </p>
     * 
     * @param workerConfigurationArn
     *        The Amazon Resource Name (ARN) of the worker configuration that you want to get information about.
     */

    public void setWorkerConfigurationArn(String workerConfigurationArn) {
        this.workerConfigurationArn = workerConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration that you want to get information about.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the worker configuration that you want to get information about.
     */

    public String getWorkerConfigurationArn() {
        return this.workerConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration that you want to get information about.
     * </p>
     * 
     * @param workerConfigurationArn
     *        The Amazon Resource Name (ARN) of the worker configuration that you want to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkerConfigurationRequest withWorkerConfigurationArn(String workerConfigurationArn) {
        setWorkerConfigurationArn(workerConfigurationArn);
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
        if (getWorkerConfigurationArn() != null)
            sb.append("WorkerConfigurationArn: ").append(getWorkerConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkerConfigurationRequest == false)
            return false;
        DescribeWorkerConfigurationRequest other = (DescribeWorkerConfigurationRequest) obj;
        if (other.getWorkerConfigurationArn() == null ^ this.getWorkerConfigurationArn() == null)
            return false;
        if (other.getWorkerConfigurationArn() != null && other.getWorkerConfigurationArn().equals(this.getWorkerConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkerConfigurationArn() == null) ? 0 : getWorkerConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkerConfigurationRequest clone() {
        return (DescribeWorkerConfigurationRequest) super.clone();
    }

}
