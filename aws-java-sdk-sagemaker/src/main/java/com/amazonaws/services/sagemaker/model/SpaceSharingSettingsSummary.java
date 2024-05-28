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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies summary information about the space sharing settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SpaceSharingSettingsSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpaceSharingSettingsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the sharing type of the space.
     * </p>
     */
    private String sharingType;

    /**
     * <p>
     * Specifies the sharing type of the space.
     * </p>
     * 
     * @param sharingType
     *        Specifies the sharing type of the space.
     * @see SharingType
     */

    public void setSharingType(String sharingType) {
        this.sharingType = sharingType;
    }

    /**
     * <p>
     * Specifies the sharing type of the space.
     * </p>
     * 
     * @return Specifies the sharing type of the space.
     * @see SharingType
     */

    public String getSharingType() {
        return this.sharingType;
    }

    /**
     * <p>
     * Specifies the sharing type of the space.
     * </p>
     * 
     * @param sharingType
     *        Specifies the sharing type of the space.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharingType
     */

    public SpaceSharingSettingsSummary withSharingType(String sharingType) {
        setSharingType(sharingType);
        return this;
    }

    /**
     * <p>
     * Specifies the sharing type of the space.
     * </p>
     * 
     * @param sharingType
     *        Specifies the sharing type of the space.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharingType
     */

    public SpaceSharingSettingsSummary withSharingType(SharingType sharingType) {
        this.sharingType = sharingType.toString();
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
        if (getSharingType() != null)
            sb.append("SharingType: ").append(getSharingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpaceSharingSettingsSummary == false)
            return false;
        SpaceSharingSettingsSummary other = (SpaceSharingSettingsSummary) obj;
        if (other.getSharingType() == null ^ this.getSharingType() == null)
            return false;
        if (other.getSharingType() != null && other.getSharingType().equals(this.getSharingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSharingType() == null) ? 0 : getSharingType().hashCode());
        return hashCode;
    }

    @Override
    public SpaceSharingSettingsSummary clone() {
        try {
            return (SpaceSharingSettingsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SpaceSharingSettingsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
