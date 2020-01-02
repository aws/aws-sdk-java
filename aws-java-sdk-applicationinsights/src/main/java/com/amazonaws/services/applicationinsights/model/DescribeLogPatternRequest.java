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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeLogPattern"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLogPatternRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource group.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * The name of the log pattern set.
     * </p>
     */
    private String patternSetName;
    /**
     * <p>
     * The name of the log pattern.
     * </p>
     */
    private String patternName;

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @return The name of the resource group.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogPatternRequest withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the log pattern set.
     * </p>
     * 
     * @param patternSetName
     *        The name of the log pattern set.
     */

    public void setPatternSetName(String patternSetName) {
        this.patternSetName = patternSetName;
    }

    /**
     * <p>
     * The name of the log pattern set.
     * </p>
     * 
     * @return The name of the log pattern set.
     */

    public String getPatternSetName() {
        return this.patternSetName;
    }

    /**
     * <p>
     * The name of the log pattern set.
     * </p>
     * 
     * @param patternSetName
     *        The name of the log pattern set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogPatternRequest withPatternSetName(String patternSetName) {
        setPatternSetName(patternSetName);
        return this;
    }

    /**
     * <p>
     * The name of the log pattern.
     * </p>
     * 
     * @param patternName
     *        The name of the log pattern.
     */

    public void setPatternName(String patternName) {
        this.patternName = patternName;
    }

    /**
     * <p>
     * The name of the log pattern.
     * </p>
     * 
     * @return The name of the log pattern.
     */

    public String getPatternName() {
        return this.patternName;
    }

    /**
     * <p>
     * The name of the log pattern.
     * </p>
     * 
     * @param patternName
     *        The name of the log pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogPatternRequest withPatternName(String patternName) {
        setPatternName(patternName);
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
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
        if (getPatternSetName() != null)
            sb.append("PatternSetName: ").append(getPatternSetName()).append(",");
        if (getPatternName() != null)
            sb.append("PatternName: ").append(getPatternName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLogPatternRequest == false)
            return false;
        DescribeLogPatternRequest other = (DescribeLogPatternRequest) obj;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        if (other.getPatternSetName() == null ^ this.getPatternSetName() == null)
            return false;
        if (other.getPatternSetName() != null && other.getPatternSetName().equals(this.getPatternSetName()) == false)
            return false;
        if (other.getPatternName() == null ^ this.getPatternName() == null)
            return false;
        if (other.getPatternName() != null && other.getPatternName().equals(this.getPatternName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getPatternSetName() == null) ? 0 : getPatternSetName().hashCode());
        hashCode = prime * hashCode + ((getPatternName() == null) ? 0 : getPatternName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLogPatternRequest clone() {
        return (DescribeLogPatternRequest) super.clone();
    }

}
