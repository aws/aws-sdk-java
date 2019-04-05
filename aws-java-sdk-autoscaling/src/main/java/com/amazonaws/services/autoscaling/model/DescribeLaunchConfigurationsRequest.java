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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLaunchConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLaunchConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The launch configuration names. If you omit this parameter, all launch configurations are described.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> launchConfigurationNames;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The launch configuration names. If you omit this parameter, all launch configurations are described.
     * </p>
     * 
     * @return The launch configuration names. If you omit this parameter, all launch configurations are described.
     */

    public java.util.List<String> getLaunchConfigurationNames() {
        if (launchConfigurationNames == null) {
            launchConfigurationNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return launchConfigurationNames;
    }

    /**
     * <p>
     * The launch configuration names. If you omit this parameter, all launch configurations are described.
     * </p>
     * 
     * @param launchConfigurationNames
     *        The launch configuration names. If you omit this parameter, all launch configurations are described.
     */

    public void setLaunchConfigurationNames(java.util.Collection<String> launchConfigurationNames) {
        if (launchConfigurationNames == null) {
            this.launchConfigurationNames = null;
            return;
        }

        this.launchConfigurationNames = new com.amazonaws.internal.SdkInternalList<String>(launchConfigurationNames);
    }

    /**
     * <p>
     * The launch configuration names. If you omit this parameter, all launch configurations are described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchConfigurationNames(java.util.Collection)} or
     * {@link #withLaunchConfigurationNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param launchConfigurationNames
     *        The launch configuration names. If you omit this parameter, all launch configurations are described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchConfigurationsRequest withLaunchConfigurationNames(String... launchConfigurationNames) {
        if (this.launchConfigurationNames == null) {
            setLaunchConfigurationNames(new com.amazonaws.internal.SdkInternalList<String>(launchConfigurationNames.length));
        }
        for (String ele : launchConfigurationNames) {
            this.launchConfigurationNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The launch configuration names. If you omit this parameter, all launch configurations are described.
     * </p>
     * 
     * @param launchConfigurationNames
     *        The launch configuration names. If you omit this parameter, all launch configurations are described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchConfigurationsRequest withLaunchConfigurationNames(java.util.Collection<String> launchConfigurationNames) {
        setLaunchConfigurationNames(launchConfigurationNames);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call. The default value is <code>50</code> and the maximum
     *        value is <code>100</code>.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @return The maximum number of items to return with this call. The default value is <code>50</code> and the
     *         maximum value is <code>100</code>.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call. The default value is <code>50</code> and the maximum
     *        value is <code>100</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchConfigurationsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getLaunchConfigurationNames() != null)
            sb.append("LaunchConfigurationNames: ").append(getLaunchConfigurationNames()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLaunchConfigurationsRequest == false)
            return false;
        DescribeLaunchConfigurationsRequest other = (DescribeLaunchConfigurationsRequest) obj;
        if (other.getLaunchConfigurationNames() == null ^ this.getLaunchConfigurationNames() == null)
            return false;
        if (other.getLaunchConfigurationNames() != null && other.getLaunchConfigurationNames().equals(this.getLaunchConfigurationNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchConfigurationNames() == null) ? 0 : getLaunchConfigurationNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLaunchConfigurationsRequest clone() {
        return (DescribeLaunchConfigurationsRequest) super.clone();
    }

}
