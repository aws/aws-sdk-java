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
 * The output for the <a>DescribeConfigurationRecorderStatus</a> action, in JSON format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorderStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationRecorderStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list that contains status of the specified recorders.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationRecorderStatus> configurationRecordersStatus;

    /**
     * <p>
     * A list that contains status of the specified recorders.
     * </p>
     * 
     * @return A list that contains status of the specified recorders.
     */

    public java.util.List<ConfigurationRecorderStatus> getConfigurationRecordersStatus() {
        if (configurationRecordersStatus == null) {
            configurationRecordersStatus = new com.amazonaws.internal.SdkInternalList<ConfigurationRecorderStatus>();
        }
        return configurationRecordersStatus;
    }

    /**
     * <p>
     * A list that contains status of the specified recorders.
     * </p>
     * 
     * @param configurationRecordersStatus
     *        A list that contains status of the specified recorders.
     */

    public void setConfigurationRecordersStatus(java.util.Collection<ConfigurationRecorderStatus> configurationRecordersStatus) {
        if (configurationRecordersStatus == null) {
            this.configurationRecordersStatus = null;
            return;
        }

        this.configurationRecordersStatus = new com.amazonaws.internal.SdkInternalList<ConfigurationRecorderStatus>(configurationRecordersStatus);
    }

    /**
     * <p>
     * A list that contains status of the specified recorders.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationRecordersStatus(java.util.Collection)} or
     * {@link #withConfigurationRecordersStatus(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationRecordersStatus
     *        A list that contains status of the specified recorders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRecorderStatusResult withConfigurationRecordersStatus(ConfigurationRecorderStatus... configurationRecordersStatus) {
        if (this.configurationRecordersStatus == null) {
            setConfigurationRecordersStatus(new com.amazonaws.internal.SdkInternalList<ConfigurationRecorderStatus>(configurationRecordersStatus.length));
        }
        for (ConfigurationRecorderStatus ele : configurationRecordersStatus) {
            this.configurationRecordersStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains status of the specified recorders.
     * </p>
     * 
     * @param configurationRecordersStatus
     *        A list that contains status of the specified recorders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRecorderStatusResult withConfigurationRecordersStatus(
            java.util.Collection<ConfigurationRecorderStatus> configurationRecordersStatus) {
        setConfigurationRecordersStatus(configurationRecordersStatus);
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
        if (getConfigurationRecordersStatus() != null)
            sb.append("ConfigurationRecordersStatus: ").append(getConfigurationRecordersStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationRecorderStatusResult == false)
            return false;
        DescribeConfigurationRecorderStatusResult other = (DescribeConfigurationRecorderStatusResult) obj;
        if (other.getConfigurationRecordersStatus() == null ^ this.getConfigurationRecordersStatus() == null)
            return false;
        if (other.getConfigurationRecordersStatus() != null && other.getConfigurationRecordersStatus().equals(this.getConfigurationRecordersStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationRecordersStatus() == null) ? 0 : getConfigurationRecordersStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationRecorderStatusResult clone() {
        try {
            return (DescribeConfigurationRecorderStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
