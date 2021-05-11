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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The stages that an escalation plan or engagement plan engages contacts and contact methods in.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/Plan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Plan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
     * </p>
     */
    private java.util.List<Stage> stages;

    /**
     * <p>
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
     * </p>
     * 
     * @return A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
     */

    public java.util.List<Stage> getStages() {
        return stages;
    }

    /**
     * <p>
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
     * </p>
     * 
     * @param stages
     *        A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
     */

    public void setStages(java.util.Collection<Stage> stages) {
        if (stages == null) {
            this.stages = null;
            return;
        }

        this.stages = new java.util.ArrayList<Stage>(stages);
    }

    /**
     * <p>
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStages(java.util.Collection)} or {@link #withStages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stages
     *        A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plan withStages(Stage... stages) {
        if (this.stages == null) {
            setStages(new java.util.ArrayList<Stage>(stages.length));
        }
        for (Stage ele : stages) {
            this.stages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
     * </p>
     * 
     * @param stages
     *        A list of stages that the escalation plan or engagement plan uses to engage contacts and contact methods.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plan withStages(java.util.Collection<Stage> stages) {
        setStages(stages);
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
        if (getStages() != null)
            sb.append("Stages: ").append(getStages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Plan == false)
            return false;
        Plan other = (Plan) obj;
        if (other.getStages() == null ^ this.getStages() == null)
            return false;
        if (other.getStages() != null && other.getStages().equals(this.getStages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStages() == null) ? 0 : getStages().hashCode());
        return hashCode;
    }

    @Override
    public Plan clone() {
        try {
            return (Plan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.PlanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
