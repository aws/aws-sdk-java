/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/BatchDisassociateClientDeviceFromCoreDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateClientDeviceFromCoreDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of client devices to disassociate.
     * </p>
     */
    private java.util.List<DisassociateClientDeviceFromCoreDeviceEntry> entries;
    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     */
    private String coreDeviceThingName;

    /**
     * <p>
     * The list of client devices to disassociate.
     * </p>
     * 
     * @return The list of client devices to disassociate.
     */

    public java.util.List<DisassociateClientDeviceFromCoreDeviceEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * The list of client devices to disassociate.
     * </p>
     * 
     * @param entries
     *        The list of client devices to disassociate.
     */

    public void setEntries(java.util.Collection<DisassociateClientDeviceFromCoreDeviceEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<DisassociateClientDeviceFromCoreDeviceEntry>(entries);
    }

    /**
     * <p>
     * The list of client devices to disassociate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        The list of client devices to disassociate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateClientDeviceFromCoreDeviceRequest withEntries(DisassociateClientDeviceFromCoreDeviceEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<DisassociateClientDeviceFromCoreDeviceEntry>(entries.length));
        }
        for (DisassociateClientDeviceFromCoreDeviceEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of client devices to disassociate.
     * </p>
     * 
     * @param entries
     *        The list of client devices to disassociate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateClientDeviceFromCoreDeviceRequest withEntries(java.util.Collection<DisassociateClientDeviceFromCoreDeviceEntry> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @param coreDeviceThingName
     *        The name of the core device. This is also the name of the AWS IoT thing.
     */

    public void setCoreDeviceThingName(String coreDeviceThingName) {
        this.coreDeviceThingName = coreDeviceThingName;
    }

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @return The name of the core device. This is also the name of the AWS IoT thing.
     */

    public String getCoreDeviceThingName() {
        return this.coreDeviceThingName;
    }

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @param coreDeviceThingName
     *        The name of the core device. This is also the name of the AWS IoT thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateClientDeviceFromCoreDeviceRequest withCoreDeviceThingName(String coreDeviceThingName) {
        setCoreDeviceThingName(coreDeviceThingName);
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries()).append(",");
        if (getCoreDeviceThingName() != null)
            sb.append("CoreDeviceThingName: ").append(getCoreDeviceThingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateClientDeviceFromCoreDeviceRequest == false)
            return false;
        BatchDisassociateClientDeviceFromCoreDeviceRequest other = (BatchDisassociateClientDeviceFromCoreDeviceRequest) obj;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        if (other.getCoreDeviceThingName() == null ^ this.getCoreDeviceThingName() == null)
            return false;
        if (other.getCoreDeviceThingName() != null && other.getCoreDeviceThingName().equals(this.getCoreDeviceThingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getCoreDeviceThingName() == null) ? 0 : getCoreDeviceThingName().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateClientDeviceFromCoreDeviceRequest clone() {
        return (BatchDisassociateClientDeviceFromCoreDeviceRequest) super.clone();
    }

}
