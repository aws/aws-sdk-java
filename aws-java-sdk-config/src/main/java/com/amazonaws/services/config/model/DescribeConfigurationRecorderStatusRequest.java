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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>DescribeConfigurationRecorderStatus</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorderStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationRecorderStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name(s) of the configuration recorder. If the name is not specified, the action returns the current status of
     * all the configuration recorders associated with the account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configurationRecorderNames;

    /**
     * <p>
     * The name(s) of the configuration recorder. If the name is not specified, the action returns the current status of
     * all the configuration recorders associated with the account.
     * </p>
     * 
     * @return The name(s) of the configuration recorder. If the name is not specified, the action returns the current
     *         status of all the configuration recorders associated with the account.
     */

    public java.util.List<String> getConfigurationRecorderNames() {
        if (configurationRecorderNames == null) {
            configurationRecorderNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configurationRecorderNames;
    }

    /**
     * <p>
     * The name(s) of the configuration recorder. If the name is not specified, the action returns the current status of
     * all the configuration recorders associated with the account.
     * </p>
     * 
     * @param configurationRecorderNames
     *        The name(s) of the configuration recorder. If the name is not specified, the action returns the current
     *        status of all the configuration recorders associated with the account.
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
     * The name(s) of the configuration recorder. If the name is not specified, the action returns the current status of
     * all the configuration recorders associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationRecorderNames(java.util.Collection)} or
     * {@link #withConfigurationRecorderNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationRecorderNames
     *        The name(s) of the configuration recorder. If the name is not specified, the action returns the current
     *        status of all the configuration recorders associated with the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRecorderStatusRequest withConfigurationRecorderNames(String... configurationRecorderNames) {
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
     * The name(s) of the configuration recorder. If the name is not specified, the action returns the current status of
     * all the configuration recorders associated with the account.
     * </p>
     * 
     * @param configurationRecorderNames
     *        The name(s) of the configuration recorder. If the name is not specified, the action returns the current
     *        status of all the configuration recorders associated with the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRecorderStatusRequest withConfigurationRecorderNames(java.util.Collection<String> configurationRecorderNames) {
        setConfigurationRecorderNames(configurationRecorderNames);
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
        if (getConfigurationRecorderNames() != null)
            sb.append("ConfigurationRecorderNames: ").append(getConfigurationRecorderNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationRecorderStatusRequest == false)
            return false;
        DescribeConfigurationRecorderStatusRequest other = (DescribeConfigurationRecorderStatusRequest) obj;
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
    public DescribeConfigurationRecorderStatusRequest clone() {
        return (DescribeConfigurationRecorderStatusRequest) super.clone();
    }

}
