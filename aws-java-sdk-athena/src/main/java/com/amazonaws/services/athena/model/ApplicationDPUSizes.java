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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the application runtime IDs and their supported DPU sizes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ApplicationDPUSizes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationDPUSizes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the supported application runtime (for example, <code>Jupyter 1.0</code>).
     * </p>
     */
    private String applicationRuntimeId;
    /**
     * <p>
     * A list of the supported DPU sizes that the application runtime supports.
     * </p>
     */
    private java.util.List<Integer> supportedDPUSizes;

    /**
     * <p>
     * The name of the supported application runtime (for example, <code>Jupyter 1.0</code>).
     * </p>
     * 
     * @param applicationRuntimeId
     *        The name of the supported application runtime (for example, <code>Jupyter 1.0</code>).
     */

    public void setApplicationRuntimeId(String applicationRuntimeId) {
        this.applicationRuntimeId = applicationRuntimeId;
    }

    /**
     * <p>
     * The name of the supported application runtime (for example, <code>Jupyter 1.0</code>).
     * </p>
     * 
     * @return The name of the supported application runtime (for example, <code>Jupyter 1.0</code>).
     */

    public String getApplicationRuntimeId() {
        return this.applicationRuntimeId;
    }

    /**
     * <p>
     * The name of the supported application runtime (for example, <code>Jupyter 1.0</code>).
     * </p>
     * 
     * @param applicationRuntimeId
     *        The name of the supported application runtime (for example, <code>Jupyter 1.0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDPUSizes withApplicationRuntimeId(String applicationRuntimeId) {
        setApplicationRuntimeId(applicationRuntimeId);
        return this;
    }

    /**
     * <p>
     * A list of the supported DPU sizes that the application runtime supports.
     * </p>
     * 
     * @return A list of the supported DPU sizes that the application runtime supports.
     */

    public java.util.List<Integer> getSupportedDPUSizes() {
        return supportedDPUSizes;
    }

    /**
     * <p>
     * A list of the supported DPU sizes that the application runtime supports.
     * </p>
     * 
     * @param supportedDPUSizes
     *        A list of the supported DPU sizes that the application runtime supports.
     */

    public void setSupportedDPUSizes(java.util.Collection<Integer> supportedDPUSizes) {
        if (supportedDPUSizes == null) {
            this.supportedDPUSizes = null;
            return;
        }

        this.supportedDPUSizes = new java.util.ArrayList<Integer>(supportedDPUSizes);
    }

    /**
     * <p>
     * A list of the supported DPU sizes that the application runtime supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedDPUSizes(java.util.Collection)} or {@link #withSupportedDPUSizes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedDPUSizes
     *        A list of the supported DPU sizes that the application runtime supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDPUSizes withSupportedDPUSizes(Integer... supportedDPUSizes) {
        if (this.supportedDPUSizes == null) {
            setSupportedDPUSizes(new java.util.ArrayList<Integer>(supportedDPUSizes.length));
        }
        for (Integer ele : supportedDPUSizes) {
            this.supportedDPUSizes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the supported DPU sizes that the application runtime supports.
     * </p>
     * 
     * @param supportedDPUSizes
     *        A list of the supported DPU sizes that the application runtime supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDPUSizes withSupportedDPUSizes(java.util.Collection<Integer> supportedDPUSizes) {
        setSupportedDPUSizes(supportedDPUSizes);
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
        if (getApplicationRuntimeId() != null)
            sb.append("ApplicationRuntimeId: ").append(getApplicationRuntimeId()).append(",");
        if (getSupportedDPUSizes() != null)
            sb.append("SupportedDPUSizes: ").append(getSupportedDPUSizes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationDPUSizes == false)
            return false;
        ApplicationDPUSizes other = (ApplicationDPUSizes) obj;
        if (other.getApplicationRuntimeId() == null ^ this.getApplicationRuntimeId() == null)
            return false;
        if (other.getApplicationRuntimeId() != null && other.getApplicationRuntimeId().equals(this.getApplicationRuntimeId()) == false)
            return false;
        if (other.getSupportedDPUSizes() == null ^ this.getSupportedDPUSizes() == null)
            return false;
        if (other.getSupportedDPUSizes() != null && other.getSupportedDPUSizes().equals(this.getSupportedDPUSizes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationRuntimeId() == null) ? 0 : getApplicationRuntimeId().hashCode());
        hashCode = prime * hashCode + ((getSupportedDPUSizes() == null) ? 0 : getSupportedDPUSizes().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationDPUSizes clone() {
        try {
            return (ApplicationDPUSizes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.ApplicationDPUSizesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
