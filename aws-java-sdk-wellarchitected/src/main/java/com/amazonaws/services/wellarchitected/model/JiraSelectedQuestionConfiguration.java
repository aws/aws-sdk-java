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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Selected questions in the workload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/JiraSelectedQuestionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JiraSelectedQuestionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Selected pillars in the workload.
     * </p>
     */
    private java.util.List<SelectedPillar> selectedPillars;

    /**
     * <p>
     * Selected pillars in the workload.
     * </p>
     * 
     * @return Selected pillars in the workload.
     */

    public java.util.List<SelectedPillar> getSelectedPillars() {
        return selectedPillars;
    }

    /**
     * <p>
     * Selected pillars in the workload.
     * </p>
     * 
     * @param selectedPillars
     *        Selected pillars in the workload.
     */

    public void setSelectedPillars(java.util.Collection<SelectedPillar> selectedPillars) {
        if (selectedPillars == null) {
            this.selectedPillars = null;
            return;
        }

        this.selectedPillars = new java.util.ArrayList<SelectedPillar>(selectedPillars);
    }

    /**
     * <p>
     * Selected pillars in the workload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedPillars(java.util.Collection)} or {@link #withSelectedPillars(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param selectedPillars
     *        Selected pillars in the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraSelectedQuestionConfiguration withSelectedPillars(SelectedPillar... selectedPillars) {
        if (this.selectedPillars == null) {
            setSelectedPillars(new java.util.ArrayList<SelectedPillar>(selectedPillars.length));
        }
        for (SelectedPillar ele : selectedPillars) {
            this.selectedPillars.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Selected pillars in the workload.
     * </p>
     * 
     * @param selectedPillars
     *        Selected pillars in the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraSelectedQuestionConfiguration withSelectedPillars(java.util.Collection<SelectedPillar> selectedPillars) {
        setSelectedPillars(selectedPillars);
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
        if (getSelectedPillars() != null)
            sb.append("SelectedPillars: ").append(getSelectedPillars());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JiraSelectedQuestionConfiguration == false)
            return false;
        JiraSelectedQuestionConfiguration other = (JiraSelectedQuestionConfiguration) obj;
        if (other.getSelectedPillars() == null ^ this.getSelectedPillars() == null)
            return false;
        if (other.getSelectedPillars() != null && other.getSelectedPillars().equals(this.getSelectedPillars()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectedPillars() == null) ? 0 : getSelectedPillars().hashCode());
        return hashCode;
    }

    @Override
    public JiraSelectedQuestionConfiguration clone() {
        try {
            return (JiraSelectedQuestionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.JiraSelectedQuestionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
