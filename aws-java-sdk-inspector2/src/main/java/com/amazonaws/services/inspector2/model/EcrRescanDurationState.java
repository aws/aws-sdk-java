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
 * Details about the state of your ECR re-scan duration settings. The ECR re-scan duration defines how long an ECR image
 * will be actively scanned by Amazon Inspector. When the number of days since an image was last pushed exceeds the
 * duration configured for image pull date, and the duration configured for image pull date, the monitoring state of
 * that image becomes <code>inactive</code> and all associated findings are scheduled for closure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/EcrRescanDurationState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcrRescanDurationState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rescan duration configured for image pull date.
     * </p>
     */
    private String pullDateRescanDuration;
    /**
     * <p>
     * The rescan duration configured for image push date.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     */
    private String rescanDuration;
    /**
     * <p>
     * The status of changes to the ECR automated re-scan duration.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A timestamp representing when the last time the ECR scan duration setting was changed.
     * </p>
     */
    private java.util.Date updatedAt;

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

    public EcrRescanDurationState withPullDateRescanDuration(String pullDateRescanDuration) {
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

    public EcrRescanDurationState withPullDateRescanDuration(EcrPullDateRescanDuration pullDateRescanDuration) {
        this.pullDateRescanDuration = pullDateRescanDuration.toString();
        return this;
    }

    /**
     * <p>
     * The rescan duration configured for image push date.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @param rescanDuration
     *        The rescan duration configured for image push date.
     * 
     *        <pre>
     * 
     *        <code> &lt;/p&gt; </code> @see EcrRescanDuration
     */

    public void setRescanDuration(String rescanDuration) {
        this.rescanDuration = rescanDuration;
    }

    /**
     * <p>
     * The rescan duration configured for image push date.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @return The rescan duration configured for image push date.
     * 
     *         <pre>
     * 
     *         <code> &lt;/p&gt; </code> @see EcrRescanDuration
     */

    public String getRescanDuration() {
        return this.rescanDuration;
    }

    /**
     * <p>
     * The rescan duration configured for image push date.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @param rescanDuration
     *        The rescan duration configured for image push date.
     * 
     *        <pre>
     * 
     *        <code> &lt;/p&gt; </code> @return Returns a reference to this object so that method calls can be chained
     *        together. @see EcrRescanDuration
     */

    public EcrRescanDurationState withRescanDuration(String rescanDuration) {
        setRescanDuration(rescanDuration);
        return this;
    }

    /**
     * <p>
     * The rescan duration configured for image push date.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @param rescanDuration
     *        The rescan duration configured for image push date.
     * 
     *        <pre>
     * 
     *        <code> &lt;/p&gt; </code> @return Returns a reference to this object so that method calls can be chained
     *        together. @see EcrRescanDuration
     */

    public EcrRescanDurationState withRescanDuration(EcrRescanDuration rescanDuration) {
        this.rescanDuration = rescanDuration.toString();
        return this;
    }

    /**
     * <p>
     * The status of changes to the ECR automated re-scan duration.
     * </p>
     * 
     * @param status
     *        The status of changes to the ECR automated re-scan duration.
     * @see EcrRescanDurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of changes to the ECR automated re-scan duration.
     * </p>
     * 
     * @return The status of changes to the ECR automated re-scan duration.
     * @see EcrRescanDurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of changes to the ECR automated re-scan duration.
     * </p>
     * 
     * @param status
     *        The status of changes to the ECR automated re-scan duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcrRescanDurationStatus
     */

    public EcrRescanDurationState withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of changes to the ECR automated re-scan duration.
     * </p>
     * 
     * @param status
     *        The status of changes to the ECR automated re-scan duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcrRescanDurationStatus
     */

    public EcrRescanDurationState withStatus(EcrRescanDurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp representing when the last time the ECR scan duration setting was changed.
     * </p>
     * 
     * @param updatedAt
     *        A timestamp representing when the last time the ECR scan duration setting was changed.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * A timestamp representing when the last time the ECR scan duration setting was changed.
     * </p>
     * 
     * @return A timestamp representing when the last time the ECR scan duration setting was changed.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * A timestamp representing when the last time the ECR scan duration setting was changed.
     * </p>
     * 
     * @param updatedAt
     *        A timestamp representing when the last time the ECR scan duration setting was changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcrRescanDurationState withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
            sb.append("RescanDuration: ").append(getRescanDuration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcrRescanDurationState == false)
            return false;
        EcrRescanDurationState other = (EcrRescanDurationState) obj;
        if (other.getPullDateRescanDuration() == null ^ this.getPullDateRescanDuration() == null)
            return false;
        if (other.getPullDateRescanDuration() != null && other.getPullDateRescanDuration().equals(this.getPullDateRescanDuration()) == false)
            return false;
        if (other.getRescanDuration() == null ^ this.getRescanDuration() == null)
            return false;
        if (other.getRescanDuration() != null && other.getRescanDuration().equals(this.getRescanDuration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullDateRescanDuration() == null) ? 0 : getPullDateRescanDuration().hashCode());
        hashCode = prime * hashCode + ((getRescanDuration() == null) ? 0 : getRescanDuration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public EcrRescanDurationState clone() {
        try {
            return (EcrRescanDurationState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.EcrRescanDurationStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
