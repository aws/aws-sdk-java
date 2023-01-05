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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the ECR automated re-scan duration setting for your environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/EcrConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcrConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon Inspector.
     * When the number of days since an image was last pushed exceeds the automated re-scan duration the monitoring
     * state of that image becomes <code>inactive</code> and all associated findings are scheduled for closure.
     * </p>
     */
    private String rescanDuration;

    /**
     * <p>
     * The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon Inspector.
     * When the number of days since an image was last pushed exceeds the automated re-scan duration the monitoring
     * state of that image becomes <code>inactive</code> and all associated findings are scheduled for closure.
     * </p>
     * 
     * @param rescanDuration
     *        The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon
     *        Inspector. When the number of days since an image was last pushed exceeds the automated re-scan duration
     *        the monitoring state of that image becomes <code>inactive</code> and all associated findings are scheduled
     *        for closure.
     * @see EcrRescanDuration
     */

    public void setRescanDuration(String rescanDuration) {
        this.rescanDuration = rescanDuration;
    }

    /**
     * <p>
     * The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon Inspector.
     * When the number of days since an image was last pushed exceeds the automated re-scan duration the monitoring
     * state of that image becomes <code>inactive</code> and all associated findings are scheduled for closure.
     * </p>
     * 
     * @return The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon
     *         Inspector. When the number of days since an image was last pushed exceeds the automated re-scan duration
     *         the monitoring state of that image becomes <code>inactive</code> and all associated findings are
     *         scheduled for closure.
     * @see EcrRescanDuration
     */

    public String getRescanDuration() {
        return this.rescanDuration;
    }

    /**
     * <p>
     * The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon Inspector.
     * When the number of days since an image was last pushed exceeds the automated re-scan duration the monitoring
     * state of that image becomes <code>inactive</code> and all associated findings are scheduled for closure.
     * </p>
     * 
     * @param rescanDuration
     *        The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon
     *        Inspector. When the number of days since an image was last pushed exceeds the automated re-scan duration
     *        the monitoring state of that image becomes <code>inactive</code> and all associated findings are scheduled
     *        for closure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcrRescanDuration
     */

    public EcrConfiguration withRescanDuration(String rescanDuration) {
        setRescanDuration(rescanDuration);
        return this;
    }

    /**
     * <p>
     * The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon Inspector.
     * When the number of days since an image was last pushed exceeds the automated re-scan duration the monitoring
     * state of that image becomes <code>inactive</code> and all associated findings are scheduled for closure.
     * </p>
     * 
     * @param rescanDuration
     *        The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon
     *        Inspector. When the number of days since an image was last pushed exceeds the automated re-scan duration
     *        the monitoring state of that image becomes <code>inactive</code> and all associated findings are scheduled
     *        for closure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcrRescanDuration
     */

    public EcrConfiguration withRescanDuration(EcrRescanDuration rescanDuration) {
        this.rescanDuration = rescanDuration.toString();
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
        if (getRescanDuration() != null)
            sb.append("RescanDuration: ").append(getRescanDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcrConfiguration == false)
            return false;
        EcrConfiguration other = (EcrConfiguration) obj;
        if (other.getRescanDuration() == null ^ this.getRescanDuration() == null)
            return false;
        if (other.getRescanDuration() != null && other.getRescanDuration().equals(this.getRescanDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRescanDuration() == null) ? 0 : getRescanDuration().hashCode());
        return hashCode;
    }

    @Override
    public EcrConfiguration clone() {
        try {
            return (EcrConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.EcrConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
