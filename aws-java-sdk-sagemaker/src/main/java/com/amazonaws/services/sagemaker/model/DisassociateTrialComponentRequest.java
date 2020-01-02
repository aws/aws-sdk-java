/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DisassociateTrialComponent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateTrialComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the component to disassociate from the trial.
     * </p>
     */
    private String trialComponentName;
    /**
     * <p>
     * The name of the trial to disassociate from.
     * </p>
     */
    private String trialName;

    /**
     * <p>
     * The name of the component to disassociate from the trial.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the component to disassociate from the trial.
     */

    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the component to disassociate from the trial.
     * </p>
     * 
     * @return The name of the component to disassociate from the trial.
     */

    public String getTrialComponentName() {
        return this.trialComponentName;
    }

    /**
     * <p>
     * The name of the component to disassociate from the trial.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the component to disassociate from the trial.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTrialComponentRequest withTrialComponentName(String trialComponentName) {
        setTrialComponentName(trialComponentName);
        return this;
    }

    /**
     * <p>
     * The name of the trial to disassociate from.
     * </p>
     * 
     * @param trialName
     *        The name of the trial to disassociate from.
     */

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial to disassociate from.
     * </p>
     * 
     * @return The name of the trial to disassociate from.
     */

    public String getTrialName() {
        return this.trialName;
    }

    /**
     * <p>
     * The name of the trial to disassociate from.
     * </p>
     * 
     * @param trialName
     *        The name of the trial to disassociate from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTrialComponentRequest withTrialName(String trialName) {
        setTrialName(trialName);
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
        if (getTrialComponentName() != null)
            sb.append("TrialComponentName: ").append(getTrialComponentName()).append(",");
        if (getTrialName() != null)
            sb.append("TrialName: ").append(getTrialName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateTrialComponentRequest == false)
            return false;
        DisassociateTrialComponentRequest other = (DisassociateTrialComponentRequest) obj;
        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
            return false;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateTrialComponentRequest clone() {
        return (DisassociateTrialComponentRequest) super.clone();
    }

}
