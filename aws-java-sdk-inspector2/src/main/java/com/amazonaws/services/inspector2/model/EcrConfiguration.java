/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The rescan duration configured for image pull date.
     * </p>
     */
    private String pullDateRescanDuration;
    /**
     * <p>
     * The rescan duration configured for image push date.
     * </p>
     */
    private String rescanDuration;

    /**
     * <p>
     * The rescan duration configured for image pull date.
     * </p>
     * 
     * @param pullDateRescanDuration
     *        The rescan duration configured for image pull date.
     * @see EcrPullDateRescanDuration
     */

    public void setPullDateRescanDuration(String pullDateRescanDuration) {
        this.pullDateRescanDuration = pullDateRescanDuration;
    }

    /**
     * <p>
     * The rescan duration configured for image pull date.
     * </p>
     * 
     * @return The rescan duration configured for image pull date.
     * @see EcrPullDateRescanDuration
     */

    public String getPullDateRescanDuration() {
        return this.pullDateRescanDuration;
    }

    /**
     * <p>
     * The rescan duration configured for image pull date.
     * </p>
     * 
     * @param pullDateRescanDuration
     *        The rescan duration configured for image pull date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcrPullDateRescanDuration
     */

    public EcrConfiguration withPullDateRescanDuration(String pullDateRescanDuration) {
        setPullDateRescanDuration(pullDateRescanDuration);
        return this;
    }

    /**
     * <p>
     * The rescan duration configured for image pull date.
     * </p>
     * 
     * @param pullDateRescanDuration
     *        The rescan duration configured for image pull date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcrPullDateRescanDuration
     */

    public EcrConfiguration withPullDateRescanDuration(EcrPullDateRescanDuration pullDateRescanDuration) {
        this.pullDateRescanDuration = pullDateRescanDuration.toString();
        return this;
    }

    /**
     * <p>
     * The rescan duration configured for image push date.
     * </p>
     * 
     * @param rescanDuration
     *        The rescan duration configured for image push date.
     * @see EcrRescanDuration
     */

    public void setRescanDuration(String rescanDuration) {
        this.rescanDuration = rescanDuration;
    }

    /**
     * <p>
     * The rescan duration configured for image push date.
     * </p>
     * 
     * @return The rescan duration configured for image push date.
     * @see EcrRescanDuration
     */

    public String getRescanDuration() {
        return this.rescanDuration;
    }

    /**
     * <p>
     * The rescan duration configured for image push date.
     * </p>
     * 
     * @param rescanDuration
     *        The rescan duration configured for image push date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcrRescanDuration
     */

    public EcrConfiguration withRescanDuration(String rescanDuration) {
        setRescanDuration(rescanDuration);
        return this;
    }

    /**
     * <p>
     * The rescan duration configured for image push date.
     * </p>
     * 
     * @param rescanDuration
     *        The rescan duration configured for image push date.
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
        if (getPullDateRescanDuration() != null)
            sb.append("PullDateRescanDuration: ").append(getPullDateRescanDuration()).append(",");
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
        if (other.getPullDateRescanDuration() == null ^ this.getPullDateRescanDuration() == null)
            return false;
        if (other.getPullDateRescanDuration() != null && other.getPullDateRescanDuration().equals(this.getPullDateRescanDuration()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getPullDateRescanDuration() == null) ? 0 : getPullDateRescanDuration().hashCode());
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
