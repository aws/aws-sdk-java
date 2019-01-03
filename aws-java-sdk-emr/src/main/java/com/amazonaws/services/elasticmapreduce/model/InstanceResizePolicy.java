/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Custom policy for requesting termination protection or termination of specific instances when shrinking an instance
 * group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceResizePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceResizePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specific list of instances to be terminated when shrinking an instance group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instancesToTerminate;
    /**
     * <p>
     * Specific list of instances to be protected when shrinking an instance group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instancesToProtect;
    /**
     * <p>
     * Decommissioning timeout override for the specific list of instances to be terminated.
     * </p>
     */
    private Integer instanceTerminationTimeout;

    /**
     * <p>
     * Specific list of instances to be terminated when shrinking an instance group.
     * </p>
     * 
     * @return Specific list of instances to be terminated when shrinking an instance group.
     */

    public java.util.List<String> getInstancesToTerminate() {
        if (instancesToTerminate == null) {
            instancesToTerminate = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instancesToTerminate;
    }

    /**
     * <p>
     * Specific list of instances to be terminated when shrinking an instance group.
     * </p>
     * 
     * @param instancesToTerminate
     *        Specific list of instances to be terminated when shrinking an instance group.
     */

    public void setInstancesToTerminate(java.util.Collection<String> instancesToTerminate) {
        if (instancesToTerminate == null) {
            this.instancesToTerminate = null;
            return;
        }

        this.instancesToTerminate = new com.amazonaws.internal.SdkInternalList<String>(instancesToTerminate);
    }

    /**
     * <p>
     * Specific list of instances to be terminated when shrinking an instance group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstancesToTerminate(java.util.Collection)} or {@link #withInstancesToTerminate(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instancesToTerminate
     *        Specific list of instances to be terminated when shrinking an instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceResizePolicy withInstancesToTerminate(String... instancesToTerminate) {
        if (this.instancesToTerminate == null) {
            setInstancesToTerminate(new com.amazonaws.internal.SdkInternalList<String>(instancesToTerminate.length));
        }
        for (String ele : instancesToTerminate) {
            this.instancesToTerminate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specific list of instances to be terminated when shrinking an instance group.
     * </p>
     * 
     * @param instancesToTerminate
     *        Specific list of instances to be terminated when shrinking an instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceResizePolicy withInstancesToTerminate(java.util.Collection<String> instancesToTerminate) {
        setInstancesToTerminate(instancesToTerminate);
        return this;
    }

    /**
     * <p>
     * Specific list of instances to be protected when shrinking an instance group.
     * </p>
     * 
     * @return Specific list of instances to be protected when shrinking an instance group.
     */

    public java.util.List<String> getInstancesToProtect() {
        if (instancesToProtect == null) {
            instancesToProtect = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instancesToProtect;
    }

    /**
     * <p>
     * Specific list of instances to be protected when shrinking an instance group.
     * </p>
     * 
     * @param instancesToProtect
     *        Specific list of instances to be protected when shrinking an instance group.
     */

    public void setInstancesToProtect(java.util.Collection<String> instancesToProtect) {
        if (instancesToProtect == null) {
            this.instancesToProtect = null;
            return;
        }

        this.instancesToProtect = new com.amazonaws.internal.SdkInternalList<String>(instancesToProtect);
    }

    /**
     * <p>
     * Specific list of instances to be protected when shrinking an instance group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstancesToProtect(java.util.Collection)} or {@link #withInstancesToProtect(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instancesToProtect
     *        Specific list of instances to be protected when shrinking an instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceResizePolicy withInstancesToProtect(String... instancesToProtect) {
        if (this.instancesToProtect == null) {
            setInstancesToProtect(new com.amazonaws.internal.SdkInternalList<String>(instancesToProtect.length));
        }
        for (String ele : instancesToProtect) {
            this.instancesToProtect.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specific list of instances to be protected when shrinking an instance group.
     * </p>
     * 
     * @param instancesToProtect
     *        Specific list of instances to be protected when shrinking an instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceResizePolicy withInstancesToProtect(java.util.Collection<String> instancesToProtect) {
        setInstancesToProtect(instancesToProtect);
        return this;
    }

    /**
     * <p>
     * Decommissioning timeout override for the specific list of instances to be terminated.
     * </p>
     * 
     * @param instanceTerminationTimeout
     *        Decommissioning timeout override for the specific list of instances to be terminated.
     */

    public void setInstanceTerminationTimeout(Integer instanceTerminationTimeout) {
        this.instanceTerminationTimeout = instanceTerminationTimeout;
    }

    /**
     * <p>
     * Decommissioning timeout override for the specific list of instances to be terminated.
     * </p>
     * 
     * @return Decommissioning timeout override for the specific list of instances to be terminated.
     */

    public Integer getInstanceTerminationTimeout() {
        return this.instanceTerminationTimeout;
    }

    /**
     * <p>
     * Decommissioning timeout override for the specific list of instances to be terminated.
     * </p>
     * 
     * @param instanceTerminationTimeout
     *        Decommissioning timeout override for the specific list of instances to be terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceResizePolicy withInstanceTerminationTimeout(Integer instanceTerminationTimeout) {
        setInstanceTerminationTimeout(instanceTerminationTimeout);
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
        if (getInstancesToTerminate() != null)
            sb.append("InstancesToTerminate: ").append(getInstancesToTerminate()).append(",");
        if (getInstancesToProtect() != null)
            sb.append("InstancesToProtect: ").append(getInstancesToProtect()).append(",");
        if (getInstanceTerminationTimeout() != null)
            sb.append("InstanceTerminationTimeout: ").append(getInstanceTerminationTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceResizePolicy == false)
            return false;
        InstanceResizePolicy other = (InstanceResizePolicy) obj;
        if (other.getInstancesToTerminate() == null ^ this.getInstancesToTerminate() == null)
            return false;
        if (other.getInstancesToTerminate() != null && other.getInstancesToTerminate().equals(this.getInstancesToTerminate()) == false)
            return false;
        if (other.getInstancesToProtect() == null ^ this.getInstancesToProtect() == null)
            return false;
        if (other.getInstancesToProtect() != null && other.getInstancesToProtect().equals(this.getInstancesToProtect()) == false)
            return false;
        if (other.getInstanceTerminationTimeout() == null ^ this.getInstanceTerminationTimeout() == null)
            return false;
        if (other.getInstanceTerminationTimeout() != null && other.getInstanceTerminationTimeout().equals(this.getInstanceTerminationTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstancesToTerminate() == null) ? 0 : getInstancesToTerminate().hashCode());
        hashCode = prime * hashCode + ((getInstancesToProtect() == null) ? 0 : getInstancesToProtect().hashCode());
        hashCode = prime * hashCode + ((getInstanceTerminationTimeout() == null) ? 0 : getInstanceTerminationTimeout().hashCode());
        return hashCode;
    }

    @Override
    public InstanceResizePolicy clone() {
        try {
            return (InstanceResizePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceResizePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
