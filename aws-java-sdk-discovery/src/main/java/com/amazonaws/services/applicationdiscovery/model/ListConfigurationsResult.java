/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;

/**
 * 
 */
public class ListConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns configuration details, including the configuration ID, attribute names, and attribute values.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> configurations;
    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns configuration details, including the configuration ID, attribute names, and attribute values.
     * </p>
     * 
     * @return Returns configuration details, including the configuration ID, attribute names, and attribute values.
     */

    public java.util.List<java.util.Map<String, String>> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * Returns configuration details, including the configuration ID, attribute names, and attribute values.
     * </p>
     * 
     * @param configurations
     *        Returns configuration details, including the configuration ID, attribute names, and attribute values.
     */

    public void setConfigurations(java.util.Collection<java.util.Map<String, String>> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new java.util.ArrayList<java.util.Map<String, String>>(configurations);
    }

    /**
     * <p>
     * Returns configuration details, including the configuration ID, attribute names, and attribute values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        Returns configuration details, including the configuration ID, attribute names, and attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationsResult withConfigurations(java.util.Map<String, String>... configurations) {
        if (this.configurations == null) {
            setConfigurations(new java.util.ArrayList<java.util.Map<String, String>>(configurations.length));
        }
        for (java.util.Map<String, String> ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns configuration details, including the configuration ID, attribute names, and attribute values.
     * </p>
     * 
     * @param configurations
     *        Returns configuration details, including the configuration ID, attribute names, and attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationsResult withConfigurations(java.util.Collection<java.util.Map<String, String>> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The call returns a token. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     * 
     * @return The call returns a token. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The call returns a token. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The call returns a token. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationsResult == false)
            return false;
        ListConfigurationsResult other = (ListConfigurationsResult) obj;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationsResult clone() {
        try {
            return (ListConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
