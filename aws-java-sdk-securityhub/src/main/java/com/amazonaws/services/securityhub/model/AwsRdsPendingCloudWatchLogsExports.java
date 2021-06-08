/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies the log types to enable and disable.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsPendingCloudWatchLogsExports"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsPendingCloudWatchLogsExports implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of log types that are being enabled.
     * </p>
     */
    private java.util.List<String> logTypesToEnable;
    /**
     * <p>
     * A list of log types that are being disabled.
     * </p>
     */
    private java.util.List<String> logTypesToDisable;

    /**
     * <p>
     * A list of log types that are being enabled.
     * </p>
     * 
     * @return A list of log types that are being enabled.
     */

    public java.util.List<String> getLogTypesToEnable() {
        return logTypesToEnable;
    }

    /**
     * <p>
     * A list of log types that are being enabled.
     * </p>
     * 
     * @param logTypesToEnable
     *        A list of log types that are being enabled.
     */

    public void setLogTypesToEnable(java.util.Collection<String> logTypesToEnable) {
        if (logTypesToEnable == null) {
            this.logTypesToEnable = null;
            return;
        }

        this.logTypesToEnable = new java.util.ArrayList<String>(logTypesToEnable);
    }

    /**
     * <p>
     * A list of log types that are being enabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogTypesToEnable(java.util.Collection)} or {@link #withLogTypesToEnable(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param logTypesToEnable
     *        A list of log types that are being enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsPendingCloudWatchLogsExports withLogTypesToEnable(String... logTypesToEnable) {
        if (this.logTypesToEnable == null) {
            setLogTypesToEnable(new java.util.ArrayList<String>(logTypesToEnable.length));
        }
        for (String ele : logTypesToEnable) {
            this.logTypesToEnable.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of log types that are being enabled.
     * </p>
     * 
     * @param logTypesToEnable
     *        A list of log types that are being enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsPendingCloudWatchLogsExports withLogTypesToEnable(java.util.Collection<String> logTypesToEnable) {
        setLogTypesToEnable(logTypesToEnable);
        return this;
    }

    /**
     * <p>
     * A list of log types that are being disabled.
     * </p>
     * 
     * @return A list of log types that are being disabled.
     */

    public java.util.List<String> getLogTypesToDisable() {
        return logTypesToDisable;
    }

    /**
     * <p>
     * A list of log types that are being disabled.
     * </p>
     * 
     * @param logTypesToDisable
     *        A list of log types that are being disabled.
     */

    public void setLogTypesToDisable(java.util.Collection<String> logTypesToDisable) {
        if (logTypesToDisable == null) {
            this.logTypesToDisable = null;
            return;
        }

        this.logTypesToDisable = new java.util.ArrayList<String>(logTypesToDisable);
    }

    /**
     * <p>
     * A list of log types that are being disabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogTypesToDisable(java.util.Collection)} or {@link #withLogTypesToDisable(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param logTypesToDisable
     *        A list of log types that are being disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsPendingCloudWatchLogsExports withLogTypesToDisable(String... logTypesToDisable) {
        if (this.logTypesToDisable == null) {
            setLogTypesToDisable(new java.util.ArrayList<String>(logTypesToDisable.length));
        }
        for (String ele : logTypesToDisable) {
            this.logTypesToDisable.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of log types that are being disabled.
     * </p>
     * 
     * @param logTypesToDisable
     *        A list of log types that are being disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsPendingCloudWatchLogsExports withLogTypesToDisable(java.util.Collection<String> logTypesToDisable) {
        setLogTypesToDisable(logTypesToDisable);
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
        if (getLogTypesToEnable() != null)
            sb.append("LogTypesToEnable: ").append(getLogTypesToEnable()).append(",");
        if (getLogTypesToDisable() != null)
            sb.append("LogTypesToDisable: ").append(getLogTypesToDisable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsPendingCloudWatchLogsExports == false)
            return false;
        AwsRdsPendingCloudWatchLogsExports other = (AwsRdsPendingCloudWatchLogsExports) obj;
        if (other.getLogTypesToEnable() == null ^ this.getLogTypesToEnable() == null)
            return false;
        if (other.getLogTypesToEnable() != null && other.getLogTypesToEnable().equals(this.getLogTypesToEnable()) == false)
            return false;
        if (other.getLogTypesToDisable() == null ^ this.getLogTypesToDisable() == null)
            return false;
        if (other.getLogTypesToDisable() != null && other.getLogTypesToDisable().equals(this.getLogTypesToDisable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogTypesToEnable() == null) ? 0 : getLogTypesToEnable().hashCode());
        hashCode = prime * hashCode + ((getLogTypesToDisable() == null) ? 0 : getLogTypesToDisable().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsPendingCloudWatchLogsExports clone() {
        try {
            return (AwsRdsPendingCloudWatchLogsExports) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsPendingCloudWatchLogsExportsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
