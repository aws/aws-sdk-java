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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFeatureGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFeatureGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the <code>FeatureGroup</code> you want described.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>). 2,500
     * <code>Features</code> are returned by default.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the <code>FeatureGroup</code> you want described.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the <code>FeatureGroup</code> you want described.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the <code>FeatureGroup</code> you want described.
     * </p>
     * 
     * @return The name of the <code>FeatureGroup</code> you want described.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the <code>FeatureGroup</code> you want described.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the <code>FeatureGroup</code> you want described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupRequest withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>). 2,500
     * <code>Features</code> are returned by default.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>). 2,500
     *        <code>Features</code> are returned by default.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>). 2,500
     * <code>Features</code> are returned by default.
     * </p>
     * 
     * @return A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>).
     *         2,500 <code>Features</code> are returned by default.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>). 2,500
     * <code>Features</code> are returned by default.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>). 2,500
     *        <code>Features</code> are returned by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFeatureGroupRequest == false)
            return false;
        DescribeFeatureGroupRequest other = (DescribeFeatureGroupRequest) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFeatureGroupRequest clone() {
        return (DescribeFeatureGroupRequest) super.clone();
    }

}
