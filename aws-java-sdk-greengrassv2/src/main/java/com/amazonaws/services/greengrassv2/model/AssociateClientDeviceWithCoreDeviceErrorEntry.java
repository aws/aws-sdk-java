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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an error that occurs from a request to associate a client device with a core device. The <a
 * href="https://docs.aws.amazon.com/greengrass/v2/APIReference/API_BatchAssociateClientDeviceWithCoreDevice.html"
 * >BatchAssociateClientDeviceWithCoreDevice</a> operation returns a list of these errors.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/AssociateClientDeviceWithCoreDeviceErrorEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateClientDeviceWithCoreDeviceErrorEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS IoT thing whose associate request failed.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The error code for the request.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A message that provides additional information about the error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The name of the AWS IoT thing whose associate request failed.
     * </p>
     * 
     * @param thingName
     *        The name of the AWS IoT thing whose associate request failed.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the AWS IoT thing whose associate request failed.
     * </p>
     * 
     * @return The name of the AWS IoT thing whose associate request failed.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the AWS IoT thing whose associate request failed.
     * </p>
     * 
     * @param thingName
     *        The name of the AWS IoT thing whose associate request failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateClientDeviceWithCoreDeviceErrorEntry withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The error code for the request.
     * </p>
     * 
     * @param code
     *        The error code for the request.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code for the request.
     * </p>
     * 
     * @return The error code for the request.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code for the request.
     * </p>
     * 
     * @param code
     *        The error code for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateClientDeviceWithCoreDeviceErrorEntry withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A message that provides additional information about the error.
     * </p>
     * 
     * @param message
     *        A message that provides additional information about the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that provides additional information about the error.
     * </p>
     * 
     * @return A message that provides additional information about the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that provides additional information about the error.
     * </p>
     * 
     * @param message
     *        A message that provides additional information about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateClientDeviceWithCoreDeviceErrorEntry withMessage(String message) {
        setMessage(message);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateClientDeviceWithCoreDeviceErrorEntry == false)
            return false;
        AssociateClientDeviceWithCoreDeviceErrorEntry other = (AssociateClientDeviceWithCoreDeviceErrorEntry) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public AssociateClientDeviceWithCoreDeviceErrorEntry clone() {
        try {
            return (AssociateClientDeviceWithCoreDeviceErrorEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.AssociateClientDeviceWithCoreDeviceErrorEntryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
