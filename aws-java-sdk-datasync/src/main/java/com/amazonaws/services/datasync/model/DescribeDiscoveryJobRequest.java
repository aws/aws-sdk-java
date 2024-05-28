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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeDiscoveryJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDiscoveryJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that you want information about.
     * </p>
     */
    private String discoveryJobArn;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that you want information about.
     * </p>
     * 
     * @param discoveryJobArn
     *        Specifies the Amazon Resource Name (ARN) of the discovery job that you want information about.
     */

    public void setDiscoveryJobArn(String discoveryJobArn) {
        this.discoveryJobArn = discoveryJobArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that you want information about.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the discovery job that you want information about.
     */

    public String getDiscoveryJobArn() {
        return this.discoveryJobArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that you want information about.
     * </p>
     * 
     * @param discoveryJobArn
     *        Specifies the Amazon Resource Name (ARN) of the discovery job that you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDiscoveryJobRequest withDiscoveryJobArn(String discoveryJobArn) {
        setDiscoveryJobArn(discoveryJobArn);
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
        if (getDiscoveryJobArn() != null)
            sb.append("DiscoveryJobArn: ").append(getDiscoveryJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDiscoveryJobRequest == false)
            return false;
        DescribeDiscoveryJobRequest other = (DescribeDiscoveryJobRequest) obj;
        if (other.getDiscoveryJobArn() == null ^ this.getDiscoveryJobArn() == null)
            return false;
        if (other.getDiscoveryJobArn() != null && other.getDiscoveryJobArn().equals(this.getDiscoveryJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiscoveryJobArn() == null) ? 0 : getDiscoveryJobArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDiscoveryJobRequest clone() {
        return (DescribeDiscoveryJobRequest) super.clone();
    }

}
