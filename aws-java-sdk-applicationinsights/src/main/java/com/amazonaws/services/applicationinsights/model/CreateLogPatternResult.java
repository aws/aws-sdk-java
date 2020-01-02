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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateLogPattern"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLogPatternResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The successfully created log pattern.
     * </p>
     */
    private LogPattern logPattern;
    /**
     * <p>
     * The name of the resource group.
     * </p>
     */
    private String resourceGroupName;

    /**
     * <p>
     * The successfully created log pattern.
     * </p>
     * 
     * @param logPattern
     *        The successfully created log pattern.
     */

    public void setLogPattern(LogPattern logPattern) {
        this.logPattern = logPattern;
    }

    /**
     * <p>
     * The successfully created log pattern.
     * </p>
     * 
     * @return The successfully created log pattern.
     */

    public LogPattern getLogPattern() {
        return this.logPattern;
    }

    /**
     * <p>
     * The successfully created log pattern.
     * </p>
     * 
     * @param logPattern
     *        The successfully created log pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogPatternResult withLogPattern(LogPattern logPattern) {
        setLogPattern(logPattern);
        return this;
    }

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

    public CreateLogPatternResult withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
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
        if (getLogPattern() != null)
            sb.append("LogPattern: ").append(getLogPattern()).append(",");
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLogPatternResult == false)
            return false;
        CreateLogPatternResult other = (CreateLogPatternResult) obj;
        if (other.getLogPattern() == null ^ this.getLogPattern() == null)
            return false;
        if (other.getLogPattern() != null && other.getLogPattern().equals(this.getLogPattern()) == false)
            return false;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogPattern() == null) ? 0 : getLogPattern().hashCode());
        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        return hashCode;
    }

    @Override
    public CreateLogPatternResult clone() {
        try {
            return (CreateLogPatternResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
