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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeEmergencyContactSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEmergencyContactSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of email addresses that the DRT can use to contact you during a suspected attack.
     * </p>
     */
    private java.util.List<EmergencyContact> emergencyContactList;

    /**
     * <p>
     * A list of email addresses that the DRT can use to contact you during a suspected attack.
     * </p>
     * 
     * @return A list of email addresses that the DRT can use to contact you during a suspected attack.
     */

    public java.util.List<EmergencyContact> getEmergencyContactList() {
        return emergencyContactList;
    }

    /**
     * <p>
     * A list of email addresses that the DRT can use to contact you during a suspected attack.
     * </p>
     * 
     * @param emergencyContactList
     *        A list of email addresses that the DRT can use to contact you during a suspected attack.
     */

    public void setEmergencyContactList(java.util.Collection<EmergencyContact> emergencyContactList) {
        if (emergencyContactList == null) {
            this.emergencyContactList = null;
            return;
        }

        this.emergencyContactList = new java.util.ArrayList<EmergencyContact>(emergencyContactList);
    }

    /**
     * <p>
     * A list of email addresses that the DRT can use to contact you during a suspected attack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmergencyContactList(java.util.Collection)} or {@link #withEmergencyContactList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param emergencyContactList
     *        A list of email addresses that the DRT can use to contact you during a suspected attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEmergencyContactSettingsResult withEmergencyContactList(EmergencyContact... emergencyContactList) {
        if (this.emergencyContactList == null) {
            setEmergencyContactList(new java.util.ArrayList<EmergencyContact>(emergencyContactList.length));
        }
        for (EmergencyContact ele : emergencyContactList) {
            this.emergencyContactList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of email addresses that the DRT can use to contact you during a suspected attack.
     * </p>
     * 
     * @param emergencyContactList
     *        A list of email addresses that the DRT can use to contact you during a suspected attack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEmergencyContactSettingsResult withEmergencyContactList(java.util.Collection<EmergencyContact> emergencyContactList) {
        setEmergencyContactList(emergencyContactList);
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
        if (getEmergencyContactList() != null)
            sb.append("EmergencyContactList: ").append(getEmergencyContactList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEmergencyContactSettingsResult == false)
            return false;
        DescribeEmergencyContactSettingsResult other = (DescribeEmergencyContactSettingsResult) obj;
        if (other.getEmergencyContactList() == null ^ this.getEmergencyContactList() == null)
            return false;
        if (other.getEmergencyContactList() != null && other.getEmergencyContactList().equals(this.getEmergencyContactList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmergencyContactList() == null) ? 0 : getEmergencyContactList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEmergencyContactSettingsResult clone() {
        try {
            return (DescribeEmergencyContactSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
