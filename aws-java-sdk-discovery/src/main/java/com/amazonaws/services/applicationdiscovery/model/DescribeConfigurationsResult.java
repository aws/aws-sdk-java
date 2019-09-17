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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A key in the response map. The value is an array of data.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> configurations;

    /**
     * <p>
     * A key in the response map. The value is an array of data.
     * </p>
     * 
     * @return A key in the response map. The value is an array of data.
     */

    public java.util.List<java.util.Map<String, String>> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * A key in the response map. The value is an array of data.
     * </p>
     * 
     * @param configurations
     *        A key in the response map. The value is an array of data.
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
     * A key in the response map. The value is an array of data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        A key in the response map. The value is an array of data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationsResult withConfigurations(java.util.Map<String, String>... configurations) {
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
     * A key in the response map. The value is an array of data.
     * </p>
     * 
     * @param configurations
     *        A key in the response map. The value is an array of data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationsResult withConfigurations(java.util.Collection<java.util.Map<String, String>> configurations) {
        setConfigurations(configurations);
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
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationsResult == false)
            return false;
        DescribeConfigurationsResult other = (DescribeConfigurationsResult) obj;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationsResult clone() {
        try {
            return (DescribeConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
