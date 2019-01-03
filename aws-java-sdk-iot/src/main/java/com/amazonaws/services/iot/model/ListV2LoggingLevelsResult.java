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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListV2LoggingLevelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The logging configuration for a target.
     * </p>
     */
    private java.util.List<LogTargetConfiguration> logTargetConfigurations;
    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The logging configuration for a target.
     * </p>
     * 
     * @return The logging configuration for a target.
     */

    public java.util.List<LogTargetConfiguration> getLogTargetConfigurations() {
        return logTargetConfigurations;
    }

    /**
     * <p>
     * The logging configuration for a target.
     * </p>
     * 
     * @param logTargetConfigurations
     *        The logging configuration for a target.
     */

    public void setLogTargetConfigurations(java.util.Collection<LogTargetConfiguration> logTargetConfigurations) {
        if (logTargetConfigurations == null) {
            this.logTargetConfigurations = null;
            return;
        }

        this.logTargetConfigurations = new java.util.ArrayList<LogTargetConfiguration>(logTargetConfigurations);
    }

    /**
     * <p>
     * The logging configuration for a target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogTargetConfigurations(java.util.Collection)} or
     * {@link #withLogTargetConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param logTargetConfigurations
     *        The logging configuration for a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListV2LoggingLevelsResult withLogTargetConfigurations(LogTargetConfiguration... logTargetConfigurations) {
        if (this.logTargetConfigurations == null) {
            setLogTargetConfigurations(new java.util.ArrayList<LogTargetConfiguration>(logTargetConfigurations.length));
        }
        for (LogTargetConfiguration ele : logTargetConfigurations) {
            this.logTargetConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The logging configuration for a target.
     * </p>
     * 
     * @param logTargetConfigurations
     *        The logging configuration for a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListV2LoggingLevelsResult withLogTargetConfigurations(java.util.Collection<LogTargetConfiguration> logTargetConfigurations) {
        setLogTargetConfigurations(logTargetConfigurations);
        return this;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token used to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListV2LoggingLevelsResult withNextToken(String nextToken) {
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
        if (getLogTargetConfigurations() != null)
            sb.append("LogTargetConfigurations: ").append(getLogTargetConfigurations()).append(",");
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

        if (obj instanceof ListV2LoggingLevelsResult == false)
            return false;
        ListV2LoggingLevelsResult other = (ListV2LoggingLevelsResult) obj;
        if (other.getLogTargetConfigurations() == null ^ this.getLogTargetConfigurations() == null)
            return false;
        if (other.getLogTargetConfigurations() != null && other.getLogTargetConfigurations().equals(this.getLogTargetConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getLogTargetConfigurations() == null) ? 0 : getLogTargetConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListV2LoggingLevelsResult clone() {
        try {
            return (ListV2LoggingLevelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
