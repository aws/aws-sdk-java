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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateOutpost" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOutpostRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostId;

    private String name;

    private String description;
    /**
     * <p>
     * The type of hardware for this Outpost.
     * </p>
     */
    private String supportedHardwareType;

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID or the Amazon Resource Name (ARN) of the Outpost.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @return The ID or the Amazon Resource Name (ARN) of the Outpost.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID or the Amazon Resource Name (ARN) of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOutpostRequest withOutpostId(String outpostId) {
        setOutpostId(outpostId);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOutpostRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOutpostRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of hardware for this Outpost.
     * </p>
     * 
     * @param supportedHardwareType
     *        The type of hardware for this Outpost.
     * @see SupportedHardwareType
     */

    public void setSupportedHardwareType(String supportedHardwareType) {
        this.supportedHardwareType = supportedHardwareType;
    }

    /**
     * <p>
     * The type of hardware for this Outpost.
     * </p>
     * 
     * @return The type of hardware for this Outpost.
     * @see SupportedHardwareType
     */

    public String getSupportedHardwareType() {
        return this.supportedHardwareType;
    }

    /**
     * <p>
     * The type of hardware for this Outpost.
     * </p>
     * 
     * @param supportedHardwareType
     *        The type of hardware for this Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedHardwareType
     */

    public UpdateOutpostRequest withSupportedHardwareType(String supportedHardwareType) {
        setSupportedHardwareType(supportedHardwareType);
        return this;
    }

    /**
     * <p>
     * The type of hardware for this Outpost.
     * </p>
     * 
     * @param supportedHardwareType
     *        The type of hardware for this Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedHardwareType
     */

    public UpdateOutpostRequest withSupportedHardwareType(SupportedHardwareType supportedHardwareType) {
        this.supportedHardwareType = supportedHardwareType.toString();
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
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSupportedHardwareType() != null)
            sb.append("SupportedHardwareType: ").append(getSupportedHardwareType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOutpostRequest == false)
            return false;
        UpdateOutpostRequest other = (UpdateOutpostRequest) obj;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSupportedHardwareType() == null ^ this.getSupportedHardwareType() == null)
            return false;
        if (other.getSupportedHardwareType() != null && other.getSupportedHardwareType().equals(this.getSupportedHardwareType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSupportedHardwareType() == null) ? 0 : getSupportedHardwareType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOutpostRequest clone() {
        return (UpdateOutpostRequest) super.clone();
    }

}
