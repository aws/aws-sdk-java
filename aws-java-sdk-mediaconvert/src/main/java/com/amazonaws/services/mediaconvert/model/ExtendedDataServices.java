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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * If your source content has EIA-608 Line 21 Data Services, enable this feature to specify what MediaConvert does with
 * the Extended Data Services (XDS) packets. You can choose to pass through XDS packets, or remove them from the output.
 * For more information about XDS, see EIA-608 Line Data Services, section 9.5.1.5 05h Content Advisory.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ExtendedDataServices" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtendedDataServices implements Serializable, Cloneable, StructuredPojo {

    /**
     * The action to take on copy and redistribution control XDS packets. If you select PASSTHROUGH, packets will not be
     * changed. If you select STRIP, any packets will be removed in output captions.
     */
    private String copyProtectionAction;
    /**
     * The action to take on content advisory XDS packets. If you select PASSTHROUGH, packets will not be changed. If
     * you select STRIP, any packets will be removed in output captions.
     */
    private String vchipAction;

    /**
     * The action to take on copy and redistribution control XDS packets. If you select PASSTHROUGH, packets will not be
     * changed. If you select STRIP, any packets will be removed in output captions.
     * 
     * @param copyProtectionAction
     *        The action to take on copy and redistribution control XDS packets. If you select PASSTHROUGH, packets will
     *        not be changed. If you select STRIP, any packets will be removed in output captions.
     * @see CopyProtectionAction
     */

    public void setCopyProtectionAction(String copyProtectionAction) {
        this.copyProtectionAction = copyProtectionAction;
    }

    /**
     * The action to take on copy and redistribution control XDS packets. If you select PASSTHROUGH, packets will not be
     * changed. If you select STRIP, any packets will be removed in output captions.
     * 
     * @return The action to take on copy and redistribution control XDS packets. If you select PASSTHROUGH, packets
     *         will not be changed. If you select STRIP, any packets will be removed in output captions.
     * @see CopyProtectionAction
     */

    public String getCopyProtectionAction() {
        return this.copyProtectionAction;
    }

    /**
     * The action to take on copy and redistribution control XDS packets. If you select PASSTHROUGH, packets will not be
     * changed. If you select STRIP, any packets will be removed in output captions.
     * 
     * @param copyProtectionAction
     *        The action to take on copy and redistribution control XDS packets. If you select PASSTHROUGH, packets will
     *        not be changed. If you select STRIP, any packets will be removed in output captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyProtectionAction
     */

    public ExtendedDataServices withCopyProtectionAction(String copyProtectionAction) {
        setCopyProtectionAction(copyProtectionAction);
        return this;
    }

    /**
     * The action to take on copy and redistribution control XDS packets. If you select PASSTHROUGH, packets will not be
     * changed. If you select STRIP, any packets will be removed in output captions.
     * 
     * @param copyProtectionAction
     *        The action to take on copy and redistribution control XDS packets. If you select PASSTHROUGH, packets will
     *        not be changed. If you select STRIP, any packets will be removed in output captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyProtectionAction
     */

    public ExtendedDataServices withCopyProtectionAction(CopyProtectionAction copyProtectionAction) {
        this.copyProtectionAction = copyProtectionAction.toString();
        return this;
    }

    /**
     * The action to take on content advisory XDS packets. If you select PASSTHROUGH, packets will not be changed. If
     * you select STRIP, any packets will be removed in output captions.
     * 
     * @param vchipAction
     *        The action to take on content advisory XDS packets. If you select PASSTHROUGH, packets will not be
     *        changed. If you select STRIP, any packets will be removed in output captions.
     * @see VchipAction
     */

    public void setVchipAction(String vchipAction) {
        this.vchipAction = vchipAction;
    }

    /**
     * The action to take on content advisory XDS packets. If you select PASSTHROUGH, packets will not be changed. If
     * you select STRIP, any packets will be removed in output captions.
     * 
     * @return The action to take on content advisory XDS packets. If you select PASSTHROUGH, packets will not be
     *         changed. If you select STRIP, any packets will be removed in output captions.
     * @see VchipAction
     */

    public String getVchipAction() {
        return this.vchipAction;
    }

    /**
     * The action to take on content advisory XDS packets. If you select PASSTHROUGH, packets will not be changed. If
     * you select STRIP, any packets will be removed in output captions.
     * 
     * @param vchipAction
     *        The action to take on content advisory XDS packets. If you select PASSTHROUGH, packets will not be
     *        changed. If you select STRIP, any packets will be removed in output captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VchipAction
     */

    public ExtendedDataServices withVchipAction(String vchipAction) {
        setVchipAction(vchipAction);
        return this;
    }

    /**
     * The action to take on content advisory XDS packets. If you select PASSTHROUGH, packets will not be changed. If
     * you select STRIP, any packets will be removed in output captions.
     * 
     * @param vchipAction
     *        The action to take on content advisory XDS packets. If you select PASSTHROUGH, packets will not be
     *        changed. If you select STRIP, any packets will be removed in output captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VchipAction
     */

    public ExtendedDataServices withVchipAction(VchipAction vchipAction) {
        this.vchipAction = vchipAction.toString();
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
        if (getCopyProtectionAction() != null)
            sb.append("CopyProtectionAction: ").append(getCopyProtectionAction()).append(",");
        if (getVchipAction() != null)
            sb.append("VchipAction: ").append(getVchipAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtendedDataServices == false)
            return false;
        ExtendedDataServices other = (ExtendedDataServices) obj;
        if (other.getCopyProtectionAction() == null ^ this.getCopyProtectionAction() == null)
            return false;
        if (other.getCopyProtectionAction() != null && other.getCopyProtectionAction().equals(this.getCopyProtectionAction()) == false)
            return false;
        if (other.getVchipAction() == null ^ this.getVchipAction() == null)
            return false;
        if (other.getVchipAction() != null && other.getVchipAction().equals(this.getVchipAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyProtectionAction() == null) ? 0 : getCopyProtectionAction().hashCode());
        hashCode = prime * hashCode + ((getVchipAction() == null) ? 0 : getVchipAction().hashCode());
        return hashCode;
    }

    @Override
    public ExtendedDataServices clone() {
        try {
            return (ExtendedDataServices) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ExtendedDataServicesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
