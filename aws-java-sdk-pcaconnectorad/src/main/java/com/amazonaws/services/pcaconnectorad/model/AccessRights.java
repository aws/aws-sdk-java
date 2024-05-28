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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Allow or deny permissions for an Active Directory group to enroll or autoenroll certificates for a template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/AccessRights" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessRights implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allow or deny an Active Directory group from autoenrolling certificates issued against a template. The Active
     * Directory group must be allowed to enroll to allow autoenrollment
     * </p>
     */
    private String autoEnroll;
    /**
     * <p>
     * Allow or deny an Active Directory group from enrolling certificates issued against a template.
     * </p>
     */
    private String enroll;

    /**
     * <p>
     * Allow or deny an Active Directory group from autoenrolling certificates issued against a template. The Active
     * Directory group must be allowed to enroll to allow autoenrollment
     * </p>
     * 
     * @param autoEnroll
     *        Allow or deny an Active Directory group from autoenrolling certificates issued against a template. The
     *        Active Directory group must be allowed to enroll to allow autoenrollment
     * @see AccessRight
     */

    public void setAutoEnroll(String autoEnroll) {
        this.autoEnroll = autoEnroll;
    }

    /**
     * <p>
     * Allow or deny an Active Directory group from autoenrolling certificates issued against a template. The Active
     * Directory group must be allowed to enroll to allow autoenrollment
     * </p>
     * 
     * @return Allow or deny an Active Directory group from autoenrolling certificates issued against a template. The
     *         Active Directory group must be allowed to enroll to allow autoenrollment
     * @see AccessRight
     */

    public String getAutoEnroll() {
        return this.autoEnroll;
    }

    /**
     * <p>
     * Allow or deny an Active Directory group from autoenrolling certificates issued against a template. The Active
     * Directory group must be allowed to enroll to allow autoenrollment
     * </p>
     * 
     * @param autoEnroll
     *        Allow or deny an Active Directory group from autoenrolling certificates issued against a template. The
     *        Active Directory group must be allowed to enroll to allow autoenrollment
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessRight
     */

    public AccessRights withAutoEnroll(String autoEnroll) {
        setAutoEnroll(autoEnroll);
        return this;
    }

    /**
     * <p>
     * Allow or deny an Active Directory group from autoenrolling certificates issued against a template. The Active
     * Directory group must be allowed to enroll to allow autoenrollment
     * </p>
     * 
     * @param autoEnroll
     *        Allow or deny an Active Directory group from autoenrolling certificates issued against a template. The
     *        Active Directory group must be allowed to enroll to allow autoenrollment
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessRight
     */

    public AccessRights withAutoEnroll(AccessRight autoEnroll) {
        this.autoEnroll = autoEnroll.toString();
        return this;
    }

    /**
     * <p>
     * Allow or deny an Active Directory group from enrolling certificates issued against a template.
     * </p>
     * 
     * @param enroll
     *        Allow or deny an Active Directory group from enrolling certificates issued against a template.
     * @see AccessRight
     */

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }

    /**
     * <p>
     * Allow or deny an Active Directory group from enrolling certificates issued against a template.
     * </p>
     * 
     * @return Allow or deny an Active Directory group from enrolling certificates issued against a template.
     * @see AccessRight
     */

    public String getEnroll() {
        return this.enroll;
    }

    /**
     * <p>
     * Allow or deny an Active Directory group from enrolling certificates issued against a template.
     * </p>
     * 
     * @param enroll
     *        Allow or deny an Active Directory group from enrolling certificates issued against a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessRight
     */

    public AccessRights withEnroll(String enroll) {
        setEnroll(enroll);
        return this;
    }

    /**
     * <p>
     * Allow or deny an Active Directory group from enrolling certificates issued against a template.
     * </p>
     * 
     * @param enroll
     *        Allow or deny an Active Directory group from enrolling certificates issued against a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessRight
     */

    public AccessRights withEnroll(AccessRight enroll) {
        this.enroll = enroll.toString();
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
        if (getAutoEnroll() != null)
            sb.append("AutoEnroll: ").append(getAutoEnroll()).append(",");
        if (getEnroll() != null)
            sb.append("Enroll: ").append(getEnroll());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessRights == false)
            return false;
        AccessRights other = (AccessRights) obj;
        if (other.getAutoEnroll() == null ^ this.getAutoEnroll() == null)
            return false;
        if (other.getAutoEnroll() != null && other.getAutoEnroll().equals(this.getAutoEnroll()) == false)
            return false;
        if (other.getEnroll() == null ^ this.getEnroll() == null)
            return false;
        if (other.getEnroll() != null && other.getEnroll().equals(this.getEnroll()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnroll() == null) ? 0 : getAutoEnroll().hashCode());
        hashCode = prime * hashCode + ((getEnroll() == null) ? 0 : getEnroll().hashCode());
        return hashCode;
    }

    @Override
    public AccessRights clone() {
        try {
            return (AccessRights) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.AccessRightsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
