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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that encapsulates, or contains, the media storage configuration properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/MappedResourceConfigurationListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MappedResourceConfigurationListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the associated resource for the kinesis video stream.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Video Stream resource, associated with the stream.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The type of the associated resource for the kinesis video stream.
     * </p>
     * 
     * @param type
     *        The type of the associated resource for the kinesis video stream.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the associated resource for the kinesis video stream.
     * </p>
     * 
     * @return The type of the associated resource for the kinesis video stream.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the associated resource for the kinesis video stream.
     * </p>
     * 
     * @param type
     *        The type of the associated resource for the kinesis video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappedResourceConfigurationListItem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Video Stream resource, associated with the stream.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the Kinesis Video Stream resource, associated with the stream.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Video Stream resource, associated with the stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Kinesis Video Stream resource, associated with the stream.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Video Stream resource, associated with the stream.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the Kinesis Video Stream resource, associated with the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappedResourceConfigurationListItem withARN(String aRN) {
        setARN(aRN);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MappedResourceConfigurationListItem == false)
            return false;
        MappedResourceConfigurationListItem other = (MappedResourceConfigurationListItem) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public MappedResourceConfigurationListItem clone() {
        try {
            return (MappedResourceConfigurationListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.MappedResourceConfigurationListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
