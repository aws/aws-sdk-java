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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopInferenceExperiment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopInferenceExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the inference experiment to stop.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Array of key-value pairs, with names of variants mapped to actions. The possible actions are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Promote</code> - Promote the shadow variant to a production variant
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Remove</code> - Delete the variant
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Retain</code> - Keep the variant as it is
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> modelVariantActions;
    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant that you want to deploy after
     * the inference experiment stops. Each <code>ModelVariantConfig</code> describes the infrastructure configuration
     * for deploying the corresponding variant.
     * </p>
     */
    private java.util.List<ModelVariantConfig> desiredModelVariants;
    /**
     * <p>
     * The desired state of the experiment after stopping. The possible states are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The experiment completed successfully
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code>: The experiment was canceled
     * </p>
     * </li>
     * </ul>
     */
    private String desiredState;
    /**
     * <p>
     * The reason for stopping the experiment.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The name of the inference experiment to stop.
     * </p>
     * 
     * @param name
     *        The name of the inference experiment to stop.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the inference experiment to stop.
     * </p>
     * 
     * @return The name of the inference experiment to stop.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the inference experiment to stop.
     * </p>
     * 
     * @param name
     *        The name of the inference experiment to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceExperimentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Array of key-value pairs, with names of variants mapped to actions. The possible actions are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Promote</code> - Promote the shadow variant to a production variant
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Remove</code> - Delete the variant
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Retain</code> - Keep the variant as it is
     * </p>
     * </li>
     * </ul>
     * 
     * @return Array of key-value pairs, with names of variants mapped to actions. The possible actions are the
     *         following: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Promote</code> - Promote the shadow variant to a production variant
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Remove</code> - Delete the variant
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Retain</code> - Keep the variant as it is
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getModelVariantActions() {
        return modelVariantActions;
    }

    /**
     * <p>
     * Array of key-value pairs, with names of variants mapped to actions. The possible actions are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Promote</code> - Promote the shadow variant to a production variant
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Remove</code> - Delete the variant
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Retain</code> - Keep the variant as it is
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelVariantActions
     *        Array of key-value pairs, with names of variants mapped to actions. The possible actions are the
     *        following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Promote</code> - Promote the shadow variant to a production variant
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Remove</code> - Delete the variant
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Retain</code> - Keep the variant as it is
     *        </p>
     *        </li>
     */

    public void setModelVariantActions(java.util.Map<String, String> modelVariantActions) {
        this.modelVariantActions = modelVariantActions;
    }

    /**
     * <p>
     * Array of key-value pairs, with names of variants mapped to actions. The possible actions are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Promote</code> - Promote the shadow variant to a production variant
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Remove</code> - Delete the variant
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Retain</code> - Keep the variant as it is
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelVariantActions
     *        Array of key-value pairs, with names of variants mapped to actions. The possible actions are the
     *        following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Promote</code> - Promote the shadow variant to a production variant
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Remove</code> - Delete the variant
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Retain</code> - Keep the variant as it is
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceExperimentRequest withModelVariantActions(java.util.Map<String, String> modelVariantActions) {
        setModelVariantActions(modelVariantActions);
        return this;
    }

    /**
     * Add a single ModelVariantActions entry
     *
     * @see StopInferenceExperimentRequest#withModelVariantActions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceExperimentRequest addModelVariantActionsEntry(String key, String value) {
        if (null == this.modelVariantActions) {
            this.modelVariantActions = new java.util.HashMap<String, String>();
        }
        if (this.modelVariantActions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.modelVariantActions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ModelVariantActions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceExperimentRequest clearModelVariantActionsEntries() {
        this.modelVariantActions = null;
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant that you want to deploy after
     * the inference experiment stops. Each <code>ModelVariantConfig</code> describes the infrastructure configuration
     * for deploying the corresponding variant.
     * </p>
     * 
     * @return An array of <code>ModelVariantConfig</code> objects. There is one for each variant that you want to
     *         deploy after the inference experiment stops. Each <code>ModelVariantConfig</code> describes the
     *         infrastructure configuration for deploying the corresponding variant.
     */

    public java.util.List<ModelVariantConfig> getDesiredModelVariants() {
        return desiredModelVariants;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant that you want to deploy after
     * the inference experiment stops. Each <code>ModelVariantConfig</code> describes the infrastructure configuration
     * for deploying the corresponding variant.
     * </p>
     * 
     * @param desiredModelVariants
     *        An array of <code>ModelVariantConfig</code> objects. There is one for each variant that you want to deploy
     *        after the inference experiment stops. Each <code>ModelVariantConfig</code> describes the infrastructure
     *        configuration for deploying the corresponding variant.
     */

    public void setDesiredModelVariants(java.util.Collection<ModelVariantConfig> desiredModelVariants) {
        if (desiredModelVariants == null) {
            this.desiredModelVariants = null;
            return;
        }

        this.desiredModelVariants = new java.util.ArrayList<ModelVariantConfig>(desiredModelVariants);
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant that you want to deploy after
     * the inference experiment stops. Each <code>ModelVariantConfig</code> describes the infrastructure configuration
     * for deploying the corresponding variant.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDesiredModelVariants(java.util.Collection)} or {@link #withDesiredModelVariants(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param desiredModelVariants
     *        An array of <code>ModelVariantConfig</code> objects. There is one for each variant that you want to deploy
     *        after the inference experiment stops. Each <code>ModelVariantConfig</code> describes the infrastructure
     *        configuration for deploying the corresponding variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceExperimentRequest withDesiredModelVariants(ModelVariantConfig... desiredModelVariants) {
        if (this.desiredModelVariants == null) {
            setDesiredModelVariants(new java.util.ArrayList<ModelVariantConfig>(desiredModelVariants.length));
        }
        for (ModelVariantConfig ele : desiredModelVariants) {
            this.desiredModelVariants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant that you want to deploy after
     * the inference experiment stops. Each <code>ModelVariantConfig</code> describes the infrastructure configuration
     * for deploying the corresponding variant.
     * </p>
     * 
     * @param desiredModelVariants
     *        An array of <code>ModelVariantConfig</code> objects. There is one for each variant that you want to deploy
     *        after the inference experiment stops. Each <code>ModelVariantConfig</code> describes the infrastructure
     *        configuration for deploying the corresponding variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceExperimentRequest withDesiredModelVariants(java.util.Collection<ModelVariantConfig> desiredModelVariants) {
        setDesiredModelVariants(desiredModelVariants);
        return this;
    }

    /**
     * <p>
     * The desired state of the experiment after stopping. The possible states are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The experiment completed successfully
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code>: The experiment was canceled
     * </p>
     * </li>
     * </ul>
     * 
     * @param desiredState
     *        The desired state of the experiment after stopping. The possible states are the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code>: The experiment completed successfully
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelled</code>: The experiment was canceled
     *        </p>
     *        </li>
     * @see InferenceExperimentStopDesiredState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * The desired state of the experiment after stopping. The possible states are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The experiment completed successfully
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code>: The experiment was canceled
     * </p>
     * </li>
     * </ul>
     * 
     * @return The desired state of the experiment after stopping. The possible states are the following: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Completed</code>: The experiment completed successfully
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Cancelled</code>: The experiment was canceled
     *         </p>
     *         </li>
     * @see InferenceExperimentStopDesiredState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * The desired state of the experiment after stopping. The possible states are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The experiment completed successfully
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code>: The experiment was canceled
     * </p>
     * </li>
     * </ul>
     * 
     * @param desiredState
     *        The desired state of the experiment after stopping. The possible states are the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code>: The experiment completed successfully
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelled</code>: The experiment was canceled
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentStopDesiredState
     */

    public StopInferenceExperimentRequest withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * The desired state of the experiment after stopping. The possible states are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code>: The experiment completed successfully
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code>: The experiment was canceled
     * </p>
     * </li>
     * </ul>
     * 
     * @param desiredState
     *        The desired state of the experiment after stopping. The possible states are the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Completed</code>: The experiment completed successfully
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelled</code>: The experiment was canceled
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentStopDesiredState
     */

    public StopInferenceExperimentRequest withDesiredState(InferenceExperimentStopDesiredState desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * The reason for stopping the experiment.
     * </p>
     * 
     * @param reason
     *        The reason for stopping the experiment.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for stopping the experiment.
     * </p>
     * 
     * @return The reason for stopping the experiment.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for stopping the experiment.
     * </p>
     * 
     * @param reason
     *        The reason for stopping the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceExperimentRequest withReason(String reason) {
        setReason(reason);
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
        if (getModelVariantActions() != null)
            sb.append("ModelVariantActions: ").append(getModelVariantActions()).append(",");
        if (getDesiredModelVariants() != null)
            sb.append("DesiredModelVariants: ").append(getDesiredModelVariants()).append(",");
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopInferenceExperimentRequest == false)
            return false;
        StopInferenceExperimentRequest other = (StopInferenceExperimentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getModelVariantActions() == null ^ this.getModelVariantActions() == null)
            return false;
        if (other.getModelVariantActions() != null && other.getModelVariantActions().equals(this.getModelVariantActions()) == false)
            return false;
        if (other.getDesiredModelVariants() == null ^ this.getDesiredModelVariants() == null)
            return false;
        if (other.getDesiredModelVariants() != null && other.getDesiredModelVariants().equals(this.getDesiredModelVariants()) == false)
            return false;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getModelVariantActions() == null) ? 0 : getModelVariantActions().hashCode());
        hashCode = prime * hashCode + ((getDesiredModelVariants() == null) ? 0 : getDesiredModelVariants().hashCode());
        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public StopInferenceExperimentRequest clone() {
        return (StopInferenceExperimentRequest) super.clone();
    }

}
