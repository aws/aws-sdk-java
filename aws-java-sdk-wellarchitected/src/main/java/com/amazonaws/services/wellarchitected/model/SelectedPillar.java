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
 * The selected pillar.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/SelectedPillar" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectedPillar implements Serializable, Cloneable, StructuredPojo {

    private String pillarId;
    /**
     * <p>
     * Selected question IDs in the selected pillar.
     * </p>
     */
    private java.util.List<String> selectedQuestionIds;

    /**
     * @param pillarId
     */

    public void setPillarId(String pillarId) {
        this.pillarId = pillarId;
    }

    /**
     * @return
     */

    public String getPillarId() {
        return this.pillarId;
    }

    /**
     * @param pillarId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectedPillar withPillarId(String pillarId) {
        setPillarId(pillarId);
        return this;
    }

    /**
     * <p>
     * Selected question IDs in the selected pillar.
     * </p>
     * 
     * @return Selected question IDs in the selected pillar.
     */

    public java.util.List<String> getSelectedQuestionIds() {
        return selectedQuestionIds;
    }

    /**
     * <p>
     * Selected question IDs in the selected pillar.
     * </p>
     * 
     * @param selectedQuestionIds
     *        Selected question IDs in the selected pillar.
     */

    public void setSelectedQuestionIds(java.util.Collection<String> selectedQuestionIds) {
        if (selectedQuestionIds == null) {
            this.selectedQuestionIds = null;
            return;
        }

        this.selectedQuestionIds = new java.util.ArrayList<String>(selectedQuestionIds);
    }

    /**
     * <p>
     * Selected question IDs in the selected pillar.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedQuestionIds(java.util.Collection)} or {@link #withSelectedQuestionIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param selectedQuestionIds
     *        Selected question IDs in the selected pillar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectedPillar withSelectedQuestionIds(String... selectedQuestionIds) {
        if (this.selectedQuestionIds == null) {
            setSelectedQuestionIds(new java.util.ArrayList<String>(selectedQuestionIds.length));
        }
        for (String ele : selectedQuestionIds) {
            this.selectedQuestionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Selected question IDs in the selected pillar.
     * </p>
     * 
     * @param selectedQuestionIds
     *        Selected question IDs in the selected pillar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectedPillar withSelectedQuestionIds(java.util.Collection<String> selectedQuestionIds) {
        setSelectedQuestionIds(selectedQuestionIds);
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
        if (getPillarId() != null)
            sb.append("PillarId: ").append(getPillarId()).append(",");
        if (getSelectedQuestionIds() != null)
            sb.append("SelectedQuestionIds: ").append(getSelectedQuestionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectedPillar == false)
            return false;
        SelectedPillar other = (SelectedPillar) obj;
        if (other.getPillarId() == null ^ this.getPillarId() == null)
            return false;
        if (other.getPillarId() != null && other.getPillarId().equals(this.getPillarId()) == false)
            return false;
        if (other.getSelectedQuestionIds() == null ^ this.getSelectedQuestionIds() == null)
            return false;
        if (other.getSelectedQuestionIds() != null && other.getSelectedQuestionIds().equals(this.getSelectedQuestionIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPillarId() == null) ? 0 : getPillarId().hashCode());
        hashCode = prime * hashCode + ((getSelectedQuestionIds() == null) ? 0 : getSelectedQuestionIds().hashCode());
        return hashCode;
    }

    @Override
    public SelectedPillar clone() {
        try {
            return (SelectedPillar) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.SelectedPillarMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
