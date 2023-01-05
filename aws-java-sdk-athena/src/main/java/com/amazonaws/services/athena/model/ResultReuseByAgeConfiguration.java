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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies whether previous query results are reused, and if so, their maximum age.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ResultReuseByAgeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultReuseByAgeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * True if previous query results can be reused when the query is run; otherwise, false. The default is false.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specifies, in minutes, the maximum age of a previous query result that Athena should consider for reuse. The
     * default is 60.
     * </p>
     */
    private Integer maxAgeInMinutes;

    /**
     * <p>
     * True if previous query results can be reused when the query is run; otherwise, false. The default is false.
     * </p>
     * 
     * @param enabled
     *        True if previous query results can be reused when the query is run; otherwise, false. The default is
     *        false.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True if previous query results can be reused when the query is run; otherwise, false. The default is false.
     * </p>
     * 
     * @return True if previous query results can be reused when the query is run; otherwise, false. The default is
     *         false.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True if previous query results can be reused when the query is run; otherwise, false. The default is false.
     * </p>
     * 
     * @param enabled
     *        True if previous query results can be reused when the query is run; otherwise, false. The default is
     *        false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultReuseByAgeConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * True if previous query results can be reused when the query is run; otherwise, false. The default is false.
     * </p>
     * 
     * @return True if previous query results can be reused when the query is run; otherwise, false. The default is
     *         false.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies, in minutes, the maximum age of a previous query result that Athena should consider for reuse. The
     * default is 60.
     * </p>
     * 
     * @param maxAgeInMinutes
     *        Specifies, in minutes, the maximum age of a previous query result that Athena should consider for reuse.
     *        The default is 60.
     */

    public void setMaxAgeInMinutes(Integer maxAgeInMinutes) {
        this.maxAgeInMinutes = maxAgeInMinutes;
    }

    /**
     * <p>
     * Specifies, in minutes, the maximum age of a previous query result that Athena should consider for reuse. The
     * default is 60.
     * </p>
     * 
     * @return Specifies, in minutes, the maximum age of a previous query result that Athena should consider for reuse.
     *         The default is 60.
     */

    public Integer getMaxAgeInMinutes() {
        return this.maxAgeInMinutes;
    }

    /**
     * <p>
     * Specifies, in minutes, the maximum age of a previous query result that Athena should consider for reuse. The
     * default is 60.
     * </p>
     * 
     * @param maxAgeInMinutes
     *        Specifies, in minutes, the maximum age of a previous query result that Athena should consider for reuse.
     *        The default is 60.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultReuseByAgeConfiguration withMaxAgeInMinutes(Integer maxAgeInMinutes) {
        setMaxAgeInMinutes(maxAgeInMinutes);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getMaxAgeInMinutes() != null)
            sb.append("MaxAgeInMinutes: ").append(getMaxAgeInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultReuseByAgeConfiguration == false)
            return false;
        ResultReuseByAgeConfiguration other = (ResultReuseByAgeConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getMaxAgeInMinutes() == null ^ this.getMaxAgeInMinutes() == null)
            return false;
        if (other.getMaxAgeInMinutes() != null && other.getMaxAgeInMinutes().equals(this.getMaxAgeInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getMaxAgeInMinutes() == null) ? 0 : getMaxAgeInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public ResultReuseByAgeConfiguration clone() {
        try {
            return (ResultReuseByAgeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.ResultReuseByAgeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
