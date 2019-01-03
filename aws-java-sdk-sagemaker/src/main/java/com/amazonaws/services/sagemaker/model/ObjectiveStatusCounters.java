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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the number of training jobs that this hyperparameter tuning job launched, categorized by the status of
 * their objective metric. The objective metric status shows whether the final objective metric for the training job has
 * been evaluated by the tuning job and used in the hyperparameter tuning process.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ObjectiveStatusCounters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectiveStatusCounters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job and used
     * in the hyperparameter tuning process.
     * </p>
     */
    private Integer succeeded;
    /**
     * <p>
     * The number of training jobs that are in progress and pending evaluation of their final objective metric.
     * </p>
     */
    private Integer pending;
    /**
     * <p>
     * The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter tuning
     * process. This typically occurs when the training job failed or did not emit an objective metric.
     * </p>
     */
    private Integer failed;

    /**
     * <p>
     * The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job and used
     * in the hyperparameter tuning process.
     * </p>
     * 
     * @param succeeded
     *        The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job
     *        and used in the hyperparameter tuning process.
     */

    public void setSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * <p>
     * The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job and used
     * in the hyperparameter tuning process.
     * </p>
     * 
     * @return The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job
     *         and used in the hyperparameter tuning process.
     */

    public Integer getSucceeded() {
        return this.succeeded;
    }

    /**
     * <p>
     * The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job and used
     * in the hyperparameter tuning process.
     * </p>
     * 
     * @param succeeded
     *        The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job
     *        and used in the hyperparameter tuning process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectiveStatusCounters withSucceeded(Integer succeeded) {
        setSucceeded(succeeded);
        return this;
    }

    /**
     * <p>
     * The number of training jobs that are in progress and pending evaluation of their final objective metric.
     * </p>
     * 
     * @param pending
     *        The number of training jobs that are in progress and pending evaluation of their final objective metric.
     */

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    /**
     * <p>
     * The number of training jobs that are in progress and pending evaluation of their final objective metric.
     * </p>
     * 
     * @return The number of training jobs that are in progress and pending evaluation of their final objective metric.
     */

    public Integer getPending() {
        return this.pending;
    }

    /**
     * <p>
     * The number of training jobs that are in progress and pending evaluation of their final objective metric.
     * </p>
     * 
     * @param pending
     *        The number of training jobs that are in progress and pending evaluation of their final objective metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectiveStatusCounters withPending(Integer pending) {
        setPending(pending);
        return this;
    }

    /**
     * <p>
     * The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter tuning
     * process. This typically occurs when the training job failed or did not emit an objective metric.
     * </p>
     * 
     * @param failed
     *        The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter
     *        tuning process. This typically occurs when the training job failed or did not emit an objective metric.
     */

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter tuning
     * process. This typically occurs when the training job failed or did not emit an objective metric.
     * </p>
     * 
     * @return The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter
     *         tuning process. This typically occurs when the training job failed or did not emit an objective metric.
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter tuning
     * process. This typically occurs when the training job failed or did not emit an objective metric.
     * </p>
     * 
     * @param failed
     *        The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter
     *        tuning process. This typically occurs when the training job failed or did not emit an objective metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectiveStatusCounters withFailed(Integer failed) {
        setFailed(failed);
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
        if (getSucceeded() != null)
            sb.append("Succeeded: ").append(getSucceeded()).append(",");
        if (getPending() != null)
            sb.append("Pending: ").append(getPending()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectiveStatusCounters == false)
            return false;
        ObjectiveStatusCounters other = (ObjectiveStatusCounters) obj;
        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        return hashCode;
    }

    @Override
    public ObjectiveStatusCounters clone() {
        try {
            return (ObjectiveStatusCounters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ObjectiveStatusCountersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
