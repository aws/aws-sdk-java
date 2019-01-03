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

/**
 * <p>
 * The output for the <a>DescribeConfigurationRecorders</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorders"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationRecordersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list that contains the descriptions of the specified configuration recorders.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationRecorder> configurationRecorders;

    /**
     * <p>
     * A list that contains the descriptions of the specified configuration recorders.
     * </p>
     * 
     * @return A list that contains the descriptions of the specified configuration recorders.
     */

    public java.util.List<ConfigurationRecorder> getConfigurationRecorders() {
        if (configurationRecorders == null) {
            configurationRecorders = new com.amazonaws.internal.SdkInternalList<ConfigurationRecorder>();
        }
        return configurationRecorders;
    }

    /**
     * <p>
     * A list that contains the descriptions of the specified configuration recorders.
     * </p>
     * 
     * @param configurationRecorders
     *        A list that contains the descriptions of the specified configuration recorders.
     */

    public void setConfigurationRecorders(java.util.Collection<ConfigurationRecorder> configurationRecorders) {
        if (configurationRecorders == null) {
            this.configurationRecorders = null;
            return;
        }

        this.configurationRecorders = new com.amazonaws.internal.SdkInternalList<ConfigurationRecorder>(configurationRecorders);
    }

    /**
     * <p>
     * A list that contains the descriptions of the specified configuration recorders.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationRecorders(java.util.Collection)} or
     * {@link #withConfigurationRecorders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationRecorders
     *        A list that contains the descriptions of the specified configuration recorders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRecordersResult withConfigurationRecorders(ConfigurationRecorder... configurationRecorders) {
        if (this.configurationRecorders == null) {
            setConfigurationRecorders(new com.amazonaws.internal.SdkInternalList<ConfigurationRecorder>(configurationRecorders.length));
        }
        for (ConfigurationRecorder ele : configurationRecorders) {
            this.configurationRecorders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains the descriptions of the specified configuration recorders.
     * </p>
     * 
     * @param configurationRecorders
     *        A list that contains the descriptions of the specified configuration recorders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRecordersResult withConfigurationRecorders(java.util.Collection<ConfigurationRecorder> configurationRecorders) {
        setConfigurationRecorders(configurationRecorders);
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
        if (getConfigurationRecorders() != null)
            sb.append("ConfigurationRecorders: ").append(getConfigurationRecorders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationRecordersResult == false)
            return false;
        DescribeConfigurationRecordersResult other = (DescribeConfigurationRecordersResult) obj;
        if (other.getConfigurationRecorders() == null ^ this.getConfigurationRecorders() == null)
            return false;
        if (other.getConfigurationRecorders() != null && other.getConfigurationRecorders().equals(this.getConfigurationRecorders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationRecorders() == null) ? 0 : getConfigurationRecorders().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationRecordersResult clone() {
        try {
            return (DescribeConfigurationRecordersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
