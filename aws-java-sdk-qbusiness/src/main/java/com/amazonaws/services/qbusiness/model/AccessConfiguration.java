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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to configure access permissions for a document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/AccessConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>AccessControlList</code> objects.
     * </p>
     */
    private java.util.List<AccessControl> accessControls;
    /**
     * <p>
     * Describes the member relation within the <code>AccessControlList</code> object.
     * </p>
     */
    private String memberRelation;

    /**
     * <p>
     * A list of <code>AccessControlList</code> objects.
     * </p>
     * 
     * @return A list of <code>AccessControlList</code> objects.
     */

    public java.util.List<AccessControl> getAccessControls() {
        return accessControls;
    }

    /**
     * <p>
     * A list of <code>AccessControlList</code> objects.
     * </p>
     * 
     * @param accessControls
     *        A list of <code>AccessControlList</code> objects.
     */

    public void setAccessControls(java.util.Collection<AccessControl> accessControls) {
        if (accessControls == null) {
            this.accessControls = null;
            return;
        }

        this.accessControls = new java.util.ArrayList<AccessControl>(accessControls);
    }

    /**
     * <p>
     * A list of <code>AccessControlList</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessControls(java.util.Collection)} or {@link #withAccessControls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param accessControls
     *        A list of <code>AccessControlList</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessConfiguration withAccessControls(AccessControl... accessControls) {
        if (this.accessControls == null) {
            setAccessControls(new java.util.ArrayList<AccessControl>(accessControls.length));
        }
        for (AccessControl ele : accessControls) {
            this.accessControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>AccessControlList</code> objects.
     * </p>
     * 
     * @param accessControls
     *        A list of <code>AccessControlList</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessConfiguration withAccessControls(java.util.Collection<AccessControl> accessControls) {
        setAccessControls(accessControls);
        return this;
    }

    /**
     * <p>
     * Describes the member relation within the <code>AccessControlList</code> object.
     * </p>
     * 
     * @param memberRelation
     *        Describes the member relation within the <code>AccessControlList</code> object.
     * @see MemberRelation
     */

    public void setMemberRelation(String memberRelation) {
        this.memberRelation = memberRelation;
    }

    /**
     * <p>
     * Describes the member relation within the <code>AccessControlList</code> object.
     * </p>
     * 
     * @return Describes the member relation within the <code>AccessControlList</code> object.
     * @see MemberRelation
     */

    public String getMemberRelation() {
        return this.memberRelation;
    }

    /**
     * <p>
     * Describes the member relation within the <code>AccessControlList</code> object.
     * </p>
     * 
     * @param memberRelation
     *        Describes the member relation within the <code>AccessControlList</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberRelation
     */

    public AccessConfiguration withMemberRelation(String memberRelation) {
        setMemberRelation(memberRelation);
        return this;
    }

    /**
     * <p>
     * Describes the member relation within the <code>AccessControlList</code> object.
     * </p>
     * 
     * @param memberRelation
     *        Describes the member relation within the <code>AccessControlList</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberRelation
     */

    public AccessConfiguration withMemberRelation(MemberRelation memberRelation) {
        this.memberRelation = memberRelation.toString();
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
        if (getAccessControls() != null)
            sb.append("AccessControls: ").append(getAccessControls()).append(",");
        if (getMemberRelation() != null)
            sb.append("MemberRelation: ").append(getMemberRelation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessConfiguration == false)
            return false;
        AccessConfiguration other = (AccessConfiguration) obj;
        if (other.getAccessControls() == null ^ this.getAccessControls() == null)
            return false;
        if (other.getAccessControls() != null && other.getAccessControls().equals(this.getAccessControls()) == false)
            return false;
        if (other.getMemberRelation() == null ^ this.getMemberRelation() == null)
            return false;
        if (other.getMemberRelation() != null && other.getMemberRelation().equals(this.getMemberRelation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessControls() == null) ? 0 : getAccessControls().hashCode());
        hashCode = prime * hashCode + ((getMemberRelation() == null) ? 0 : getMemberRelation().hashCode());
        return hashCode;
    }

    @Override
    public AccessConfiguration clone() {
        try {
            return (AccessConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.AccessConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
