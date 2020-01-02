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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AssociateTrialComponent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateTrialComponentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     */
    private String trialComponentArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     */
    private String trialArn;

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * 
     * @param trialComponentArn
     *        The ARN of the trial component.
     */

    public void setTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
    }

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * 
     * @return The ARN of the trial component.
     */

    public String getTrialComponentArn() {
        return this.trialComponentArn;
    }

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * 
     * @param trialComponentArn
     *        The ARN of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTrialComponentResult withTrialComponentArn(String trialComponentArn) {
        setTrialComponentArn(trialComponentArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @param trialArn
     *        The Amazon Resource Name (ARN) of the trial.
     */

    public void setTrialArn(String trialArn) {
        this.trialArn = trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trial.
     */

    public String getTrialArn() {
        return this.trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @param trialArn
     *        The Amazon Resource Name (ARN) of the trial.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTrialComponentResult withTrialArn(String trialArn) {
        setTrialArn(trialArn);
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
        if (getTrialComponentArn() != null)
            sb.append("TrialComponentArn: ").append(getTrialComponentArn()).append(",");
        if (getTrialArn() != null)
            sb.append("TrialArn: ").append(getTrialArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateTrialComponentResult == false)
            return false;
        AssociateTrialComponentResult other = (AssociateTrialComponentResult) obj;
        if (other.getTrialComponentArn() == null ^ this.getTrialComponentArn() == null)
            return false;
        if (other.getTrialComponentArn() != null && other.getTrialComponentArn().equals(this.getTrialComponentArn()) == false)
            return false;
        if (other.getTrialArn() == null ^ this.getTrialArn() == null)
            return false;
        if (other.getTrialArn() != null && other.getTrialArn().equals(this.getTrialArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialComponentArn() == null) ? 0 : getTrialComponentArn().hashCode());
        hashCode = prime * hashCode + ((getTrialArn() == null) ? 0 : getTrialArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateTrialComponentResult clone() {
        try {
            return (AssociateTrialComponentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
