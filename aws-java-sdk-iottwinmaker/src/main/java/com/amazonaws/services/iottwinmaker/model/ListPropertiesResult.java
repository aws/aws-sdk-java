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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPropertiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects that contain information about the properties.
     * </p>
     */
    private java.util.List<PropertySummary> propertySummaries;
    /**
     * <p>
     * The string that specifies the next page of property results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects that contain information about the properties.
     * </p>
     * 
     * @return A list of objects that contain information about the properties.
     */

    public java.util.List<PropertySummary> getPropertySummaries() {
        return propertySummaries;
    }

    /**
     * <p>
     * A list of objects that contain information about the properties.
     * </p>
     * 
     * @param propertySummaries
     *        A list of objects that contain information about the properties.
     */

    public void setPropertySummaries(java.util.Collection<PropertySummary> propertySummaries) {
        if (propertySummaries == null) {
            this.propertySummaries = null;
            return;
        }

        this.propertySummaries = new java.util.ArrayList<PropertySummary>(propertySummaries);
    }

    /**
     * <p>
     * A list of objects that contain information about the properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertySummaries(java.util.Collection)} or {@link #withPropertySummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param propertySummaries
     *        A list of objects that contain information about the properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPropertiesResult withPropertySummaries(PropertySummary... propertySummaries) {
        if (this.propertySummaries == null) {
            setPropertySummaries(new java.util.ArrayList<PropertySummary>(propertySummaries.length));
        }
        for (PropertySummary ele : propertySummaries) {
            this.propertySummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about the properties.
     * </p>
     * 
     * @param propertySummaries
     *        A list of objects that contain information about the properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPropertiesResult withPropertySummaries(java.util.Collection<PropertySummary> propertySummaries) {
        setPropertySummaries(propertySummaries);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of property results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of property results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of property results.
     * </p>
     * 
     * @return The string that specifies the next page of property results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of property results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of property results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPropertiesResult withNextToken(String nextToken) {
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
        if (getPropertySummaries() != null)
            sb.append("PropertySummaries: ").append(getPropertySummaries()).append(",");
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

        if (obj instanceof ListPropertiesResult == false)
            return false;
        ListPropertiesResult other = (ListPropertiesResult) obj;
        if (other.getPropertySummaries() == null ^ this.getPropertySummaries() == null)
            return false;
        if (other.getPropertySummaries() != null && other.getPropertySummaries().equals(this.getPropertySummaries()) == false)
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

        hashCode = prime * hashCode + ((getPropertySummaries() == null) ? 0 : getPropertySummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPropertiesResult clone() {
        try {
            return (ListPropertiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
