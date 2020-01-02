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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a request to enable, modify, or disable an add-on for an Amazon Lightsail resource.
 * </p>
 * <note>
 * <p>
 * An additional cost may be associated with enabling add-ons. For more information, see the <a
 * href="https://aws.amazon.com/lightsail/pricing/">Lightsail pricing page</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AddOnRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddOnRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The add-on type.
     * </p>
     */
    private String addOnType;
    /**
     * <p>
     * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
     * </p>
     */
    private AutoSnapshotAddOnRequest autoSnapshotAddOnRequest;

    /**
     * <p>
     * The add-on type.
     * </p>
     * 
     * @param addOnType
     *        The add-on type.
     * @see AddOnType
     */

    public void setAddOnType(String addOnType) {
        this.addOnType = addOnType;
    }

    /**
     * <p>
     * The add-on type.
     * </p>
     * 
     * @return The add-on type.
     * @see AddOnType
     */

    public String getAddOnType() {
        return this.addOnType;
    }

    /**
     * <p>
     * The add-on type.
     * </p>
     * 
     * @param addOnType
     *        The add-on type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddOnType
     */

    public AddOnRequest withAddOnType(String addOnType) {
        setAddOnType(addOnType);
        return this;
    }

    /**
     * <p>
     * The add-on type.
     * </p>
     * 
     * @param addOnType
     *        The add-on type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddOnType
     */

    public AddOnRequest withAddOnType(AddOnType addOnType) {
        this.addOnType = addOnType.toString();
        return this;
    }

    /**
     * <p>
     * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
     * </p>
     * 
     * @param autoSnapshotAddOnRequest
     *        An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
     */

    public void setAutoSnapshotAddOnRequest(AutoSnapshotAddOnRequest autoSnapshotAddOnRequest) {
        this.autoSnapshotAddOnRequest = autoSnapshotAddOnRequest;
    }

    /**
     * <p>
     * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
     * </p>
     * 
     * @return An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
     */

    public AutoSnapshotAddOnRequest getAutoSnapshotAddOnRequest() {
        return this.autoSnapshotAddOnRequest;
    }

    /**
     * <p>
     * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
     * </p>
     * 
     * @param autoSnapshotAddOnRequest
     *        An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOnRequest withAutoSnapshotAddOnRequest(AutoSnapshotAddOnRequest autoSnapshotAddOnRequest) {
        setAutoSnapshotAddOnRequest(autoSnapshotAddOnRequest);
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
        if (getAddOnType() != null)
            sb.append("AddOnType: ").append(getAddOnType()).append(",");
        if (getAutoSnapshotAddOnRequest() != null)
            sb.append("AutoSnapshotAddOnRequest: ").append(getAutoSnapshotAddOnRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddOnRequest == false)
            return false;
        AddOnRequest other = (AddOnRequest) obj;
        if (other.getAddOnType() == null ^ this.getAddOnType() == null)
            return false;
        if (other.getAddOnType() != null && other.getAddOnType().equals(this.getAddOnType()) == false)
            return false;
        if (other.getAutoSnapshotAddOnRequest() == null ^ this.getAutoSnapshotAddOnRequest() == null)
            return false;
        if (other.getAutoSnapshotAddOnRequest() != null && other.getAutoSnapshotAddOnRequest().equals(this.getAutoSnapshotAddOnRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddOnType() == null) ? 0 : getAddOnType().hashCode());
        hashCode = prime * hashCode + ((getAutoSnapshotAddOnRequest() == null) ? 0 : getAutoSnapshotAddOnRequest().hashCode());
        return hashCode;
    }

    @Override
    public AddOnRequest clone() {
        try {
            return (AddOnRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AddOnRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
