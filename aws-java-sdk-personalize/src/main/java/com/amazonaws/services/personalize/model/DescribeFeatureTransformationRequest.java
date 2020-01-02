/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeFeatureTransformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFeatureTransformationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the feature transformation to describe.
     * </p>
     */
    private String featureTransformationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the feature transformation to describe.
     * </p>
     * 
     * @param featureTransformationArn
     *        The Amazon Resource Name (ARN) of the feature transformation to describe.
     */

    public void setFeatureTransformationArn(String featureTransformationArn) {
        this.featureTransformationArn = featureTransformationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the feature transformation to describe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the feature transformation to describe.
     */

    public String getFeatureTransformationArn() {
        return this.featureTransformationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the feature transformation to describe.
     * </p>
     * 
     * @param featureTransformationArn
     *        The Amazon Resource Name (ARN) of the feature transformation to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureTransformationRequest withFeatureTransformationArn(String featureTransformationArn) {
        setFeatureTransformationArn(featureTransformationArn);
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
        if (getFeatureTransformationArn() != null)
            sb.append("FeatureTransformationArn: ").append(getFeatureTransformationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFeatureTransformationRequest == false)
            return false;
        DescribeFeatureTransformationRequest other = (DescribeFeatureTransformationRequest) obj;
        if (other.getFeatureTransformationArn() == null ^ this.getFeatureTransformationArn() == null)
            return false;
        if (other.getFeatureTransformationArn() != null && other.getFeatureTransformationArn().equals(this.getFeatureTransformationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureTransformationArn() == null) ? 0 : getFeatureTransformationArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFeatureTransformationRequest clone() {
        return (DescribeFeatureTransformationRequest) super.clone();
    }

}
