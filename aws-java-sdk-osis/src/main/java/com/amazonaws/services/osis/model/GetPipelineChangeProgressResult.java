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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineChangeProgress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPipelineChangeProgressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the change happening on the pipeline.
     * </p>
     */
    private java.util.List<ChangeProgressStatus> changeProgressStatuses;

    /**
     * <p>
     * The current status of the change happening on the pipeline.
     * </p>
     * 
     * @return The current status of the change happening on the pipeline.
     */

    public java.util.List<ChangeProgressStatus> getChangeProgressStatuses() {
        return changeProgressStatuses;
    }

    /**
     * <p>
     * The current status of the change happening on the pipeline.
     * </p>
     * 
     * @param changeProgressStatuses
     *        The current status of the change happening on the pipeline.
     */

    public void setChangeProgressStatuses(java.util.Collection<ChangeProgressStatus> changeProgressStatuses) {
        if (changeProgressStatuses == null) {
            this.changeProgressStatuses = null;
            return;
        }

        this.changeProgressStatuses = new java.util.ArrayList<ChangeProgressStatus>(changeProgressStatuses);
    }

    /**
     * <p>
     * The current status of the change happening on the pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeProgressStatuses(java.util.Collection)} or
     * {@link #withChangeProgressStatuses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param changeProgressStatuses
     *        The current status of the change happening on the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineChangeProgressResult withChangeProgressStatuses(ChangeProgressStatus... changeProgressStatuses) {
        if (this.changeProgressStatuses == null) {
            setChangeProgressStatuses(new java.util.ArrayList<ChangeProgressStatus>(changeProgressStatuses.length));
        }
        for (ChangeProgressStatus ele : changeProgressStatuses) {
            this.changeProgressStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current status of the change happening on the pipeline.
     * </p>
     * 
     * @param changeProgressStatuses
     *        The current status of the change happening on the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineChangeProgressResult withChangeProgressStatuses(java.util.Collection<ChangeProgressStatus> changeProgressStatuses) {
        setChangeProgressStatuses(changeProgressStatuses);
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
        if (getChangeProgressStatuses() != null)
            sb.append("ChangeProgressStatuses: ").append(getChangeProgressStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPipelineChangeProgressResult == false)
            return false;
        GetPipelineChangeProgressResult other = (GetPipelineChangeProgressResult) obj;
        if (other.getChangeProgressStatuses() == null ^ this.getChangeProgressStatuses() == null)
            return false;
        if (other.getChangeProgressStatuses() != null && other.getChangeProgressStatuses().equals(this.getChangeProgressStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeProgressStatuses() == null) ? 0 : getChangeProgressStatuses().hashCode());
        return hashCode;
    }

    @Override
    public GetPipelineChangeProgressResult clone() {
        try {
            return (GetPipelineChangeProgressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
