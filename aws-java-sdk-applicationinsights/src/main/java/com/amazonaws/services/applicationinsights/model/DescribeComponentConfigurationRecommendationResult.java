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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfigurationRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeComponentConfigurationRecommendationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The recommended configuration settings of the component. The value is the escaped JSON of the configuration.
     * </p>
     */
    private String componentConfiguration;

    /**
     * <p>
     * The recommended configuration settings of the component. The value is the escaped JSON of the configuration.
     * </p>
     * 
     * @param componentConfiguration
     *        The recommended configuration settings of the component. The value is the escaped JSON of the
     *        configuration.
     */

    public void setComponentConfiguration(String componentConfiguration) {
        this.componentConfiguration = componentConfiguration;
    }

    /**
     * <p>
     * The recommended configuration settings of the component. The value is the escaped JSON of the configuration.
     * </p>
     * 
     * @return The recommended configuration settings of the component. The value is the escaped JSON of the
     *         configuration.
     */

    public String getComponentConfiguration() {
        return this.componentConfiguration;
    }

    /**
     * <p>
     * The recommended configuration settings of the component. The value is the escaped JSON of the configuration.
     * </p>
     * 
     * @param componentConfiguration
     *        The recommended configuration settings of the component. The value is the escaped JSON of the
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComponentConfigurationRecommendationResult withComponentConfiguration(String componentConfiguration) {
        setComponentConfiguration(componentConfiguration);
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
        if (getComponentConfiguration() != null)
            sb.append("ComponentConfiguration: ").append(getComponentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeComponentConfigurationRecommendationResult == false)
            return false;
        DescribeComponentConfigurationRecommendationResult other = (DescribeComponentConfigurationRecommendationResult) obj;
        if (other.getComponentConfiguration() == null ^ this.getComponentConfiguration() == null)
            return false;
        if (other.getComponentConfiguration() != null && other.getComponentConfiguration().equals(this.getComponentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentConfiguration() == null) ? 0 : getComponentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeComponentConfigurationRecommendationResult clone() {
        try {
            return (DescribeComponentConfigurationRecommendationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
