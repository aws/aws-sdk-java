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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object with the name of the retention configuration and the retention period in days. The object stores the
 * configuration for data retention in AWS Config.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/RetentionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetentionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the retention configuration object.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Number of days AWS Config stores your historical information.
     * </p>
     * <note>
     * <p>
     * Currently, only applicable to the configuration item history.
     * </p>
     * </note>
     */
    private Integer retentionPeriodInDays;

    /**
     * <p>
     * The name of the retention configuration object.
     * </p>
     * 
     * @param name
     *        The name of the retention configuration object.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the retention configuration object.
     * </p>
     * 
     * @return The name of the retention configuration object.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the retention configuration object.
     * </p>
     * 
     * @param name
     *        The name of the retention configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Number of days AWS Config stores your historical information.
     * </p>
     * <note>
     * <p>
     * Currently, only applicable to the configuration item history.
     * </p>
     * </note>
     * 
     * @param retentionPeriodInDays
     *        Number of days AWS Config stores your historical information.</p> <note>
     *        <p>
     *        Currently, only applicable to the configuration item history.
     *        </p>
     */

    public void setRetentionPeriodInDays(Integer retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
    }

    /**
     * <p>
     * Number of days AWS Config stores your historical information.
     * </p>
     * <note>
     * <p>
     * Currently, only applicable to the configuration item history.
     * </p>
     * </note>
     * 
     * @return Number of days AWS Config stores your historical information.</p> <note>
     *         <p>
     *         Currently, only applicable to the configuration item history.
     *         </p>
     */

    public Integer getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * <p>
     * Number of days AWS Config stores your historical information.
     * </p>
     * <note>
     * <p>
     * Currently, only applicable to the configuration item history.
     * </p>
     * </note>
     * 
     * @param retentionPeriodInDays
     *        Number of days AWS Config stores your historical information.</p> <note>
     *        <p>
     *        Currently, only applicable to the configuration item history.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionConfiguration withRetentionPeriodInDays(Integer retentionPeriodInDays) {
        setRetentionPeriodInDays(retentionPeriodInDays);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRetentionPeriodInDays() != null)
            sb.append("RetentionPeriodInDays: ").append(getRetentionPeriodInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetentionConfiguration == false)
            return false;
        RetentionConfiguration other = (RetentionConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRetentionPeriodInDays() == null ^ this.getRetentionPeriodInDays() == null)
            return false;
        if (other.getRetentionPeriodInDays() != null && other.getRetentionPeriodInDays().equals(this.getRetentionPeriodInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriodInDays() == null) ? 0 : getRetentionPeriodInDays().hashCode());
        return hashCode;
    }

    @Override
    public RetentionConfiguration clone() {
        try {
            return (RetentionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RetentionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
