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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateRetrainingScheduler"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRetrainingSchedulerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model whose retraining scheduler you want to update.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the nearest
     * UTC day.
     * </p>
     */
    private java.util.Date retrainingStartDate;
    /**
     * <p>
     * This parameter uses the <a href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> standard to set
     * the frequency at which you want retraining to occur in terms of Years, Months, and/or Days (note: other
     * parameters like Time are not currently supported). The minimum value is 30 days (P30D) and the maximum value is 1
     * year (P1Y). For example, the following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * P3M15D – Every 3 months and 15 days
     * </p>
     * </li>
     * <li>
     * <p>
     * P2M – Every 2 months
     * </p>
     * </li>
     * <li>
     * <p>
     * P150D – Every 150 days
     * </p>
     * </li>
     * </ul>
     */
    private String retrainingFrequency;
    /**
     * <p>
     * The number of past days of data that will be used for retraining.
     * </p>
     */
    private String lookbackWindow;
    /**
     * <p>
     * Indicates how the service will use new models. In <code>MANAGED</code> mode, new models will automatically be
     * used for inference if they have better performance than the current model. In <code>MANUAL</code> mode, the new
     * models will not be used <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/versioning-model.html#model-activation">until
     * they are manually activated</a>.
     * </p>
     */
    private String promoteMode;

    /**
     * <p>
     * The name of the model whose retraining scheduler you want to update.
     * </p>
     * 
     * @param modelName
     *        The name of the model whose retraining scheduler you want to update.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model whose retraining scheduler you want to update.
     * </p>
     * 
     * @return The name of the model whose retraining scheduler you want to update.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model whose retraining scheduler you want to update.
     * </p>
     * 
     * @param modelName
     *        The name of the model whose retraining scheduler you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRetrainingSchedulerRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the nearest
     * UTC day.
     * </p>
     * 
     * @param retrainingStartDate
     *        The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the
     *        nearest UTC day.
     */

    public void setRetrainingStartDate(java.util.Date retrainingStartDate) {
        this.retrainingStartDate = retrainingStartDate;
    }

    /**
     * <p>
     * The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the nearest
     * UTC day.
     * </p>
     * 
     * @return The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the
     *         nearest UTC day.
     */

    public java.util.Date getRetrainingStartDate() {
        return this.retrainingStartDate;
    }

    /**
     * <p>
     * The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the nearest
     * UTC day.
     * </p>
     * 
     * @param retrainingStartDate
     *        The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the
     *        nearest UTC day.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRetrainingSchedulerRequest withRetrainingStartDate(java.util.Date retrainingStartDate) {
        setRetrainingStartDate(retrainingStartDate);
        return this;
    }

    /**
     * <p>
     * This parameter uses the <a href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> standard to set
     * the frequency at which you want retraining to occur in terms of Years, Months, and/or Days (note: other
     * parameters like Time are not currently supported). The minimum value is 30 days (P30D) and the maximum value is 1
     * year (P1Y). For example, the following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * P3M15D – Every 3 months and 15 days
     * </p>
     * </li>
     * <li>
     * <p>
     * P2M – Every 2 months
     * </p>
     * </li>
     * <li>
     * <p>
     * P150D – Every 150 days
     * </p>
     * </li>
     * </ul>
     * 
     * @param retrainingFrequency
     *        This parameter uses the <a href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> standard
     *        to set the frequency at which you want retraining to occur in terms of Years, Months, and/or Days (note:
     *        other parameters like Time are not currently supported). The minimum value is 30 days (P30D) and the
     *        maximum value is 1 year (P1Y). For example, the following values are valid:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        P3M15D – Every 3 months and 15 days
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        P2M – Every 2 months
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        P150D – Every 150 days
     *        </p>
     *        </li>
     */

    public void setRetrainingFrequency(String retrainingFrequency) {
        this.retrainingFrequency = retrainingFrequency;
    }

    /**
     * <p>
     * This parameter uses the <a href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> standard to set
     * the frequency at which you want retraining to occur in terms of Years, Months, and/or Days (note: other
     * parameters like Time are not currently supported). The minimum value is 30 days (P30D) and the maximum value is 1
     * year (P1Y). For example, the following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * P3M15D – Every 3 months and 15 days
     * </p>
     * </li>
     * <li>
     * <p>
     * P2M – Every 2 months
     * </p>
     * </li>
     * <li>
     * <p>
     * P150D – Every 150 days
     * </p>
     * </li>
     * </ul>
     * 
     * @return This parameter uses the <a href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> standard
     *         to set the frequency at which you want retraining to occur in terms of Years, Months, and/or Days (note:
     *         other parameters like Time are not currently supported). The minimum value is 30 days (P30D) and the
     *         maximum value is 1 year (P1Y). For example, the following values are valid:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         P3M15D – Every 3 months and 15 days
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         P2M – Every 2 months
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         P150D – Every 150 days
     *         </p>
     *         </li>
     */

    public String getRetrainingFrequency() {
        return this.retrainingFrequency;
    }

    /**
     * <p>
     * This parameter uses the <a href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> standard to set
     * the frequency at which you want retraining to occur in terms of Years, Months, and/or Days (note: other
     * parameters like Time are not currently supported). The minimum value is 30 days (P30D) and the maximum value is 1
     * year (P1Y). For example, the following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * P3M15D – Every 3 months and 15 days
     * </p>
     * </li>
     * <li>
     * <p>
     * P2M – Every 2 months
     * </p>
     * </li>
     * <li>
     * <p>
     * P150D – Every 150 days
     * </p>
     * </li>
     * </ul>
     * 
     * @param retrainingFrequency
     *        This parameter uses the <a href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> standard
     *        to set the frequency at which you want retraining to occur in terms of Years, Months, and/or Days (note:
     *        other parameters like Time are not currently supported). The minimum value is 30 days (P30D) and the
     *        maximum value is 1 year (P1Y). For example, the following values are valid:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        P3M15D – Every 3 months and 15 days
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        P2M – Every 2 months
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        P150D – Every 150 days
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRetrainingSchedulerRequest withRetrainingFrequency(String retrainingFrequency) {
        setRetrainingFrequency(retrainingFrequency);
        return this;
    }

    /**
     * <p>
     * The number of past days of data that will be used for retraining.
     * </p>
     * 
     * @param lookbackWindow
     *        The number of past days of data that will be used for retraining.
     */

    public void setLookbackWindow(String lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
    }

    /**
     * <p>
     * The number of past days of data that will be used for retraining.
     * </p>
     * 
     * @return The number of past days of data that will be used for retraining.
     */

    public String getLookbackWindow() {
        return this.lookbackWindow;
    }

    /**
     * <p>
     * The number of past days of data that will be used for retraining.
     * </p>
     * 
     * @param lookbackWindow
     *        The number of past days of data that will be used for retraining.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRetrainingSchedulerRequest withLookbackWindow(String lookbackWindow) {
        setLookbackWindow(lookbackWindow);
        return this;
    }

    /**
     * <p>
     * Indicates how the service will use new models. In <code>MANAGED</code> mode, new models will automatically be
     * used for inference if they have better performance than the current model. In <code>MANUAL</code> mode, the new
     * models will not be used <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/versioning-model.html#model-activation">until
     * they are manually activated</a>.
     * </p>
     * 
     * @param promoteMode
     *        Indicates how the service will use new models. In <code>MANAGED</code> mode, new models will automatically
     *        be used for inference if they have better performance than the current model. In <code>MANUAL</code> mode,
     *        the new models will not be used <a href=
     *        "https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/versioning-model.html#model-activation">until
     *        they are manually activated</a>.
     * @see ModelPromoteMode
     */

    public void setPromoteMode(String promoteMode) {
        this.promoteMode = promoteMode;
    }

    /**
     * <p>
     * Indicates how the service will use new models. In <code>MANAGED</code> mode, new models will automatically be
     * used for inference if they have better performance than the current model. In <code>MANUAL</code> mode, the new
     * models will not be used <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/versioning-model.html#model-activation">until
     * they are manually activated</a>.
     * </p>
     * 
     * @return Indicates how the service will use new models. In <code>MANAGED</code> mode, new models will
     *         automatically be used for inference if they have better performance than the current model. In
     *         <code>MANUAL</code> mode, the new models will not be used <a
     *         href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/versioning-model.html#model-activation"
     *         >until they are manually activated</a>.
     * @see ModelPromoteMode
     */

    public String getPromoteMode() {
        return this.promoteMode;
    }

    /**
     * <p>
     * Indicates how the service will use new models. In <code>MANAGED</code> mode, new models will automatically be
     * used for inference if they have better performance than the current model. In <code>MANUAL</code> mode, the new
     * models will not be used <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/versioning-model.html#model-activation">until
     * they are manually activated</a>.
     * </p>
     * 
     * @param promoteMode
     *        Indicates how the service will use new models. In <code>MANAGED</code> mode, new models will automatically
     *        be used for inference if they have better performance than the current model. In <code>MANUAL</code> mode,
     *        the new models will not be used <a href=
     *        "https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/versioning-model.html#model-activation">until
     *        they are manually activated</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPromoteMode
     */

    public UpdateRetrainingSchedulerRequest withPromoteMode(String promoteMode) {
        setPromoteMode(promoteMode);
        return this;
    }

    /**
     * <p>
     * Indicates how the service will use new models. In <code>MANAGED</code> mode, new models will automatically be
     * used for inference if they have better performance than the current model. In <code>MANUAL</code> mode, the new
     * models will not be used <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/versioning-model.html#model-activation">until
     * they are manually activated</a>.
     * </p>
     * 
     * @param promoteMode
     *        Indicates how the service will use new models. In <code>MANAGED</code> mode, new models will automatically
     *        be used for inference if they have better performance than the current model. In <code>MANUAL</code> mode,
     *        the new models will not be used <a href=
     *        "https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/versioning-model.html#model-activation">until
     *        they are manually activated</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPromoteMode
     */

    public UpdateRetrainingSchedulerRequest withPromoteMode(ModelPromoteMode promoteMode) {
        this.promoteMode = promoteMode.toString();
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getRetrainingStartDate() != null)
            sb.append("RetrainingStartDate: ").append(getRetrainingStartDate()).append(",");
        if (getRetrainingFrequency() != null)
            sb.append("RetrainingFrequency: ").append(getRetrainingFrequency()).append(",");
        if (getLookbackWindow() != null)
            sb.append("LookbackWindow: ").append(getLookbackWindow()).append(",");
        if (getPromoteMode() != null)
            sb.append("PromoteMode: ").append(getPromoteMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRetrainingSchedulerRequest == false)
            return false;
        UpdateRetrainingSchedulerRequest other = (UpdateRetrainingSchedulerRequest) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getRetrainingStartDate() == null ^ this.getRetrainingStartDate() == null)
            return false;
        if (other.getRetrainingStartDate() != null && other.getRetrainingStartDate().equals(this.getRetrainingStartDate()) == false)
            return false;
        if (other.getRetrainingFrequency() == null ^ this.getRetrainingFrequency() == null)
            return false;
        if (other.getRetrainingFrequency() != null && other.getRetrainingFrequency().equals(this.getRetrainingFrequency()) == false)
            return false;
        if (other.getLookbackWindow() == null ^ this.getLookbackWindow() == null)
            return false;
        if (other.getLookbackWindow() != null && other.getLookbackWindow().equals(this.getLookbackWindow()) == false)
            return false;
        if (other.getPromoteMode() == null ^ this.getPromoteMode() == null)
            return false;
        if (other.getPromoteMode() != null && other.getPromoteMode().equals(this.getPromoteMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getRetrainingStartDate() == null) ? 0 : getRetrainingStartDate().hashCode());
        hashCode = prime * hashCode + ((getRetrainingFrequency() == null) ? 0 : getRetrainingFrequency().hashCode());
        hashCode = prime * hashCode + ((getLookbackWindow() == null) ? 0 : getLookbackWindow().hashCode());
        hashCode = prime * hashCode + ((getPromoteMode() == null) ? 0 : getPromoteMode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRetrainingSchedulerRequest clone() {
        return (UpdateRetrainingSchedulerRequest) super.clone();
    }

}
