/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of key-value pairs to set for advanced control over Amazon Redshift Serverless.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ConfigParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of the parameter. The options are <code>datestyle</code>, <code>enable_user_activity_logging</code>,
     * <code>query_group</code>, <code>search_path</code>, and <code>max_query_execution_time</code>.
     * </p>
     */
    private String parameterKey;
    /**
     * <p>
     * The value of the parameter to set.
     * </p>
     */
    private String parameterValue;

    /**
     * <p>
     * The key of the parameter. The options are <code>datestyle</code>, <code>enable_user_activity_logging</code>,
     * <code>query_group</code>, <code>search_path</code>, and <code>max_query_execution_time</code>.
     * </p>
     * 
     * @param parameterKey
     *        The key of the parameter. The options are <code>datestyle</code>,
     *        <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     *        <code>max_query_execution_time</code>.
     */

    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The key of the parameter. The options are <code>datestyle</code>, <code>enable_user_activity_logging</code>,
     * <code>query_group</code>, <code>search_path</code>, and <code>max_query_execution_time</code>.
     * </p>
     * 
     * @return The key of the parameter. The options are <code>datestyle</code>,
     *         <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     *         <code>max_query_execution_time</code>.
     */

    public String getParameterKey() {
        return this.parameterKey;
    }

    /**
     * <p>
     * The key of the parameter. The options are <code>datestyle</code>, <code>enable_user_activity_logging</code>,
     * <code>query_group</code>, <code>search_path</code>, and <code>max_query_execution_time</code>.
     * </p>
     * 
     * @param parameterKey
     *        The key of the parameter. The options are <code>datestyle</code>,
     *        <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     *        <code>max_query_execution_time</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigParameter withParameterKey(String parameterKey) {
        setParameterKey(parameterKey);
        return this;
    }

    /**
     * <p>
     * The value of the parameter to set.
     * </p>
     * 
     * @param parameterValue
     *        The value of the parameter to set.
     */

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * The value of the parameter to set.
     * </p>
     * 
     * @return The value of the parameter to set.
     */

    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * <p>
     * The value of the parameter to set.
     * </p>
     * 
     * @param parameterValue
     *        The value of the parameter to set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigParameter withParameterValue(String parameterValue) {
        setParameterValue(parameterValue);
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
        if (getParameterKey() != null)
            sb.append("ParameterKey: ").append(getParameterKey()).append(",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: ").append(getParameterValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigParameter == false)
            return false;
        ConfigParameter other = (ConfigParameter) obj;
        if (other.getParameterKey() == null ^ this.getParameterKey() == null)
            return false;
        if (other.getParameterKey() != null && other.getParameterKey().equals(this.getParameterKey()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode());
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        return hashCode;
    }

    @Override
    public ConfigParameter clone() {
        try {
            return (ConfigParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.ConfigParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
