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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DeleteFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     */
    private String flowName;
    /**
     * <p>
     * Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use.
     * </p>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @param flowName
     *        The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @return The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */

    public String getFlowName() {
        return this.flowName;
    }

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @param flowName
     *        The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowRequest withFlowName(String flowName) {
        setFlowName(flowName);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use.
     * </p>
     * 
     * @param forceDelete
     *        Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use.
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use.
     * </p>
     * 
     * @return Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use.
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use.
     * </p>
     * 
     * @param forceDelete
     *        Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use.
     * </p>
     * 
     * @return Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use.
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
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
        if (getFlowName() != null)
            sb.append("FlowName: ").append(getFlowName()).append(",");
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFlowRequest == false)
            return false;
        DeleteFlowRequest other = (DeleteFlowRequest) obj;
        if (other.getFlowName() == null ^ this.getFlowName() == null)
            return false;
        if (other.getFlowName() != null && other.getFlowName().equals(this.getFlowName()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowName() == null) ? 0 : getFlowName().hashCode());
        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFlowRequest clone() {
        return (DeleteFlowRequest) super.clone();
    }

}
