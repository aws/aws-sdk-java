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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>DescribeConfigurationRecorders</a> action.
 * </p>
 */
public class DescribeConfigurationRecordersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of configuration recorder names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configurationRecorderNames;

    /**
     * <p>
     * A list of configuration recorder names.
     * </p>
     * 
     * @return A list of configuration recorder names.
     */

    public java.util.List<String> getConfigurationRecorderNames() {
        if (configurationRecorderNames == null) {
            configurationRecorderNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configurationRecorderNames;
    }

    /**
     * <p>
     * A list of configuration recorder names.
     * </p>
     * 
     * @param configurationRecorderNames
     *        A list of configuration recorder names.
     */

    public void setConfigurationRecorderNames(java.util.Collection<String> configurationRecorderNames) {
        if (configurationRecorderNames == null) {
            this.configurationRecorderNames = null;
            return;
        }

        this.configurationRecorderNames = new com.amazonaws.internal.SdkInternalList<String>(configurationRecorderNames);
    }

    /**
     * <p>
     * A list of configuration recorder names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationRecorderNames(java.util.Collection)} or
     * {@link #withConfigurationRecorderNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationRecorderNames
     *        A list of configuration recorder names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRecordersRequest withConfigurationRecorderNames(String... configurationRecorderNames) {
        if (this.configurationRecorderNames == null) {
            setConfigurationRecorderNames(new com.amazonaws.internal.SdkInternalList<String>(configurationRecorderNames.length));
        }
        for (String ele : configurationRecorderNames) {
            this.configurationRecorderNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration recorder names.
     * </p>
     * 
     * @param configurationRecorderNames
     *        A list of configuration recorder names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRecordersRequest withConfigurationRecorderNames(java.util.Collection<String> configurationRecorderNames) {
        setConfigurationRecorderNames(configurationRecorderNames);
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
        if (getConfigurationRecorderNames() != null)
            sb.append("ConfigurationRecorderNames: " + getConfigurationRecorderNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationRecordersRequest == false)
            return false;
        DescribeConfigurationRecordersRequest other = (DescribeConfigurationRecordersRequest) obj;
        if (other.getConfigurationRecorderNames() == null ^ this.getConfigurationRecorderNames() == null)
            return false;
        if (other.getConfigurationRecorderNames() != null && other.getConfigurationRecorderNames().equals(this.getConfigurationRecorderNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationRecorderNames() == null) ? 0 : getConfigurationRecorderNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationRecordersRequest clone() {
        return (DescribeConfigurationRecordersRequest) super.clone();
    }
}
