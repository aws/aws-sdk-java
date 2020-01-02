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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action to send data from an MQTT message that triggered the rule to AWS IoT SiteWise asset properties.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotSiteWiseAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of asset property value entries.
     * </p>
     */
    private java.util.List<PutAssetPropertyValueEntry> putAssetPropertyValueEntries;
    /**
     * <p>
     * The ARN of the role that grants AWS IoT permission to send an asset property value to AWS IoTSiteWise. (
     * <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The trust policy can restrict access to
     * specific asset hierarchy paths.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * A list of asset property value entries.
     * </p>
     * 
     * @return A list of asset property value entries.
     */

    public java.util.List<PutAssetPropertyValueEntry> getPutAssetPropertyValueEntries() {
        return putAssetPropertyValueEntries;
    }

    /**
     * <p>
     * A list of asset property value entries.
     * </p>
     * 
     * @param putAssetPropertyValueEntries
     *        A list of asset property value entries.
     */

    public void setPutAssetPropertyValueEntries(java.util.Collection<PutAssetPropertyValueEntry> putAssetPropertyValueEntries) {
        if (putAssetPropertyValueEntries == null) {
            this.putAssetPropertyValueEntries = null;
            return;
        }

        this.putAssetPropertyValueEntries = new java.util.ArrayList<PutAssetPropertyValueEntry>(putAssetPropertyValueEntries);
    }

    /**
     * <p>
     * A list of asset property value entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPutAssetPropertyValueEntries(java.util.Collection)} or
     * {@link #withPutAssetPropertyValueEntries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param putAssetPropertyValueEntries
     *        A list of asset property value entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseAction withPutAssetPropertyValueEntries(PutAssetPropertyValueEntry... putAssetPropertyValueEntries) {
        if (this.putAssetPropertyValueEntries == null) {
            setPutAssetPropertyValueEntries(new java.util.ArrayList<PutAssetPropertyValueEntry>(putAssetPropertyValueEntries.length));
        }
        for (PutAssetPropertyValueEntry ele : putAssetPropertyValueEntries) {
            this.putAssetPropertyValueEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of asset property value entries.
     * </p>
     * 
     * @param putAssetPropertyValueEntries
     *        A list of asset property value entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseAction withPutAssetPropertyValueEntries(java.util.Collection<PutAssetPropertyValueEntry> putAssetPropertyValueEntries) {
        setPutAssetPropertyValueEntries(putAssetPropertyValueEntries);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants AWS IoT permission to send an asset property value to AWS IoTSiteWise. (
     * <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The trust policy can restrict access to
     * specific asset hierarchy paths.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants AWS IoT permission to send an asset property value to AWS IoTSiteWise. (
     *        <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The trust policy can restrict access to
     *        specific asset hierarchy paths.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants AWS IoT permission to send an asset property value to AWS IoTSiteWise. (
     * <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The trust policy can restrict access to
     * specific asset hierarchy paths.
     * </p>
     * 
     * @return The ARN of the role that grants AWS IoT permission to send an asset property value to AWS IoTSiteWise. (
     *         <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The trust policy can restrict access to
     *         specific asset hierarchy paths.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants AWS IoT permission to send an asset property value to AWS IoTSiteWise. (
     * <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The trust policy can restrict access to
     * specific asset hierarchy paths.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants AWS IoT permission to send an asset property value to AWS IoTSiteWise. (
     *        <code>"Action": "iotsitewise:BatchPutAssetPropertyValue"</code>). The trust policy can restrict access to
     *        specific asset hierarchy paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getPutAssetPropertyValueEntries() != null)
            sb.append("PutAssetPropertyValueEntries: ").append(getPutAssetPropertyValueEntries()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotSiteWiseAction == false)
            return false;
        IotSiteWiseAction other = (IotSiteWiseAction) obj;
        if (other.getPutAssetPropertyValueEntries() == null ^ this.getPutAssetPropertyValueEntries() == null)
            return false;
        if (other.getPutAssetPropertyValueEntries() != null && other.getPutAssetPropertyValueEntries().equals(this.getPutAssetPropertyValueEntries()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPutAssetPropertyValueEntries() == null) ? 0 : getPutAssetPropertyValueEntries().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public IotSiteWiseAction clone() {
        try {
            return (IotSiteWiseAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.IotSiteWiseActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
