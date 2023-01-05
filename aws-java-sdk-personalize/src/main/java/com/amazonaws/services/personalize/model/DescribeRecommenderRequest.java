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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeRecommender" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecommenderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender to describe.
     * </p>
     */
    private String recommenderArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender to describe.
     * </p>
     * 
     * @param recommenderArn
     *        The Amazon Resource Name (ARN) of the recommender to describe.
     */

    public void setRecommenderArn(String recommenderArn) {
        this.recommenderArn = recommenderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender to describe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recommender to describe.
     */

    public String getRecommenderArn() {
        return this.recommenderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender to describe.
     * </p>
     * 
     * @param recommenderArn
     *        The Amazon Resource Name (ARN) of the recommender to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommenderRequest withRecommenderArn(String recommenderArn) {
        setRecommenderArn(recommenderArn);
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
        if (getRecommenderArn() != null)
            sb.append("RecommenderArn: ").append(getRecommenderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecommenderRequest == false)
            return false;
        DescribeRecommenderRequest other = (DescribeRecommenderRequest) obj;
        if (other.getRecommenderArn() == null ^ this.getRecommenderArn() == null)
            return false;
        if (other.getRecommenderArn() != null && other.getRecommenderArn().equals(this.getRecommenderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommenderArn() == null) ? 0 : getRecommenderArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecommenderRequest clone() {
        return (DescribeRecommenderRequest) super.clone();
    }

}
