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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Simple Notification Service (Amazon SNS) topic or topics to notify in order to report job status.
 * </p>
 * <important>
 * <p>
 * To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
 * </p>
 * </important>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Notifications implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has
     * started to process the job.
     * </p>
     */
    private String progressing;
    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
     * </p>
     */
    private String completed;
    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
     * </p>
     */
    private String warning;
    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
     * </p>
     */
    private String error;

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has
     * started to process the job.
     * </p>
     * 
     * @param progressing
     *        The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder
     *        has started to process the job.
     */

    public void setProgressing(String progressing) {
        this.progressing = progressing;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has
     * started to process the job.
     * </p>
     * 
     * @return The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder
     *         has started to process the job.
     */

    public String getProgressing() {
        return this.progressing;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has
     * started to process the job.
     * </p>
     * 
     * @param progressing
     *        The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder
     *        has started to process the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notifications withProgressing(String progressing) {
        setProgressing(progressing);
        return this;
    }

    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
     * </p>
     * 
     * @param completed
     *        The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
     */

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
     * </p>
     * 
     * @return The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
     */

    public String getCompleted() {
        return this.completed;
    }

    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
     * </p>
     * 
     * @param completed
     *        The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notifications withCompleted(String completed) {
        setCompleted(completed);
        return this;
    }

    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
     * </p>
     * 
     * @param warning
     *        The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
     */

    public void setWarning(String warning) {
        this.warning = warning;
    }

    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
     * </p>
     * 
     * @return The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
     */

    public String getWarning() {
        return this.warning;
    }

    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
     * </p>
     * 
     * @param warning
     *        The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notifications withWarning(String warning) {
        setWarning(warning);
        return this;
    }

    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
     * </p>
     * 
     * @param error
     *        The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
     * </p>
     * 
     * @return The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
     * </p>
     * 
     * @param error
     *        The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notifications withError(String error) {
        setError(error);
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
        if (getProgressing() != null)
            sb.append("Progressing: ").append(getProgressing()).append(",");
        if (getCompleted() != null)
            sb.append("Completed: ").append(getCompleted()).append(",");
        if (getWarning() != null)
            sb.append("Warning: ").append(getWarning()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Notifications == false)
            return false;
        Notifications other = (Notifications) obj;
        if (other.getProgressing() == null ^ this.getProgressing() == null)
            return false;
        if (other.getProgressing() != null && other.getProgressing().equals(this.getProgressing()) == false)
            return false;
        if (other.getCompleted() == null ^ this.getCompleted() == null)
            return false;
        if (other.getCompleted() != null && other.getCompleted().equals(this.getCompleted()) == false)
            return false;
        if (other.getWarning() == null ^ this.getWarning() == null)
            return false;
        if (other.getWarning() != null && other.getWarning().equals(this.getWarning()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressing() == null) ? 0 : getProgressing().hashCode());
        hashCode = prime * hashCode + ((getCompleted() == null) ? 0 : getCompleted().hashCode());
        hashCode = prime * hashCode + ((getWarning() == null) ? 0 : getWarning().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public Notifications clone() {
        try {
            return (Notifications) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.NotificationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
