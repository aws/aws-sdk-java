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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for the <code>WorkflowDetail</code> data type. It is used by actions that trigger a workflow to begin
 * execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/WorkflowDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * </p>
     * <p>
     * To remove an associated workflow from a server, you can provide an empty <code>OnUpload</code> object, as in the
     * following example.
     * </p>
     * <p>
     * <code>aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}'</code>
     * </p>
     */
    private java.util.List<WorkflowDetail> onUpload;
    /**
     * <p>
     * A trigger that starts a workflow if a file is only partially uploaded. You can attach a workflow to a server that
     * executes whenever there is a partial upload.
     * </p>
     * <p>
     * A <i>partial upload</i> occurs when a file is open when the session disconnects.
     * </p>
     */
    private java.util.List<WorkflowDetail> onPartialUpload;

    /**
     * <p>
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * </p>
     * <p>
     * To remove an associated workflow from a server, you can provide an empty <code>OnUpload</code> object, as in the
     * following example.
     * </p>
     * <p>
     * <code>aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}'</code>
     * </p>
     * 
     * @return A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.</p>
     *         <p>
     *         To remove an associated workflow from a server, you can provide an empty <code>OnUpload</code> object, as
     *         in the following example.
     *         </p>
     *         <p>
     *         <code>aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}'</code>
     */

    public java.util.List<WorkflowDetail> getOnUpload() {
        return onUpload;
    }

    /**
     * <p>
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * </p>
     * <p>
     * To remove an associated workflow from a server, you can provide an empty <code>OnUpload</code> object, as in the
     * following example.
     * </p>
     * <p>
     * <code>aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}'</code>
     * </p>
     * 
     * @param onUpload
     *        A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.</p>
     *        <p>
     *        To remove an associated workflow from a server, you can provide an empty <code>OnUpload</code> object, as
     *        in the following example.
     *        </p>
     *        <p>
     *        <code>aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}'</code>
     */

    public void setOnUpload(java.util.Collection<WorkflowDetail> onUpload) {
        if (onUpload == null) {
            this.onUpload = null;
            return;
        }

        this.onUpload = new java.util.ArrayList<WorkflowDetail>(onUpload);
    }

    /**
     * <p>
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * </p>
     * <p>
     * To remove an associated workflow from a server, you can provide an empty <code>OnUpload</code> object, as in the
     * following example.
     * </p>
     * <p>
     * <code>aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}'</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnUpload(java.util.Collection)} or {@link #withOnUpload(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param onUpload
     *        A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.</p>
     *        <p>
     *        To remove an associated workflow from a server, you can provide an empty <code>OnUpload</code> object, as
     *        in the following example.
     *        </p>
     *        <p>
     *        <code>aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}'</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowDetails withOnUpload(WorkflowDetail... onUpload) {
        if (this.onUpload == null) {
            setOnUpload(new java.util.ArrayList<WorkflowDetail>(onUpload.length));
        }
        for (WorkflowDetail ele : onUpload) {
            this.onUpload.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * </p>
     * <p>
     * To remove an associated workflow from a server, you can provide an empty <code>OnUpload</code> object, as in the
     * following example.
     * </p>
     * <p>
     * <code>aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}'</code>
     * </p>
     * 
     * @param onUpload
     *        A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.</p>
     *        <p>
     *        To remove an associated workflow from a server, you can provide an empty <code>OnUpload</code> object, as
     *        in the following example.
     *        </p>
     *        <p>
     *        <code>aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}'</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowDetails withOnUpload(java.util.Collection<WorkflowDetail> onUpload) {
        setOnUpload(onUpload);
        return this;
    }

    /**
     * <p>
     * A trigger that starts a workflow if a file is only partially uploaded. You can attach a workflow to a server that
     * executes whenever there is a partial upload.
     * </p>
     * <p>
     * A <i>partial upload</i> occurs when a file is open when the session disconnects.
     * </p>
     * 
     * @return A trigger that starts a workflow if a file is only partially uploaded. You can attach a workflow to a
     *         server that executes whenever there is a partial upload.</p>
     *         <p>
     *         A <i>partial upload</i> occurs when a file is open when the session disconnects.
     */

    public java.util.List<WorkflowDetail> getOnPartialUpload() {
        return onPartialUpload;
    }

    /**
     * <p>
     * A trigger that starts a workflow if a file is only partially uploaded. You can attach a workflow to a server that
     * executes whenever there is a partial upload.
     * </p>
     * <p>
     * A <i>partial upload</i> occurs when a file is open when the session disconnects.
     * </p>
     * 
     * @param onPartialUpload
     *        A trigger that starts a workflow if a file is only partially uploaded. You can attach a workflow to a
     *        server that executes whenever there is a partial upload.</p>
     *        <p>
     *        A <i>partial upload</i> occurs when a file is open when the session disconnects.
     */

    public void setOnPartialUpload(java.util.Collection<WorkflowDetail> onPartialUpload) {
        if (onPartialUpload == null) {
            this.onPartialUpload = null;
            return;
        }

        this.onPartialUpload = new java.util.ArrayList<WorkflowDetail>(onPartialUpload);
    }

    /**
     * <p>
     * A trigger that starts a workflow if a file is only partially uploaded. You can attach a workflow to a server that
     * executes whenever there is a partial upload.
     * </p>
     * <p>
     * A <i>partial upload</i> occurs when a file is open when the session disconnects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnPartialUpload(java.util.Collection)} or {@link #withOnPartialUpload(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param onPartialUpload
     *        A trigger that starts a workflow if a file is only partially uploaded. You can attach a workflow to a
     *        server that executes whenever there is a partial upload.</p>
     *        <p>
     *        A <i>partial upload</i> occurs when a file is open when the session disconnects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowDetails withOnPartialUpload(WorkflowDetail... onPartialUpload) {
        if (this.onPartialUpload == null) {
            setOnPartialUpload(new java.util.ArrayList<WorkflowDetail>(onPartialUpload.length));
        }
        for (WorkflowDetail ele : onPartialUpload) {
            this.onPartialUpload.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A trigger that starts a workflow if a file is only partially uploaded. You can attach a workflow to a server that
     * executes whenever there is a partial upload.
     * </p>
     * <p>
     * A <i>partial upload</i> occurs when a file is open when the session disconnects.
     * </p>
     * 
     * @param onPartialUpload
     *        A trigger that starts a workflow if a file is only partially uploaded. You can attach a workflow to a
     *        server that executes whenever there is a partial upload.</p>
     *        <p>
     *        A <i>partial upload</i> occurs when a file is open when the session disconnects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowDetails withOnPartialUpload(java.util.Collection<WorkflowDetail> onPartialUpload) {
        setOnPartialUpload(onPartialUpload);
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
        if (getOnUpload() != null)
            sb.append("OnUpload: ").append(getOnUpload()).append(",");
        if (getOnPartialUpload() != null)
            sb.append("OnPartialUpload: ").append(getOnPartialUpload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowDetails == false)
            return false;
        WorkflowDetails other = (WorkflowDetails) obj;
        if (other.getOnUpload() == null ^ this.getOnUpload() == null)
            return false;
        if (other.getOnUpload() != null && other.getOnUpload().equals(this.getOnUpload()) == false)
            return false;
        if (other.getOnPartialUpload() == null ^ this.getOnPartialUpload() == null)
            return false;
        if (other.getOnPartialUpload() != null && other.getOnPartialUpload().equals(this.getOnPartialUpload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOnUpload() == null) ? 0 : getOnUpload().hashCode());
        hashCode = prime * hashCode + ((getOnPartialUpload() == null) ? 0 : getOnPartialUpload().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowDetails clone() {
        try {
            return (WorkflowDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.WorkflowDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
