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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the streaming configuration of an <code>AppInstance</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AppInstanceStreamingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppInstanceStreamingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of data to be streamed.
     * </p>
     */
    private String appInstanceDataType;
    /**
     * <p>
     * The resource ARN.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The type of data to be streamed.
     * </p>
     * 
     * @param appInstanceDataType
     *        The type of data to be streamed.
     * @see AppInstanceDataType
     */

    public void setAppInstanceDataType(String appInstanceDataType) {
        this.appInstanceDataType = appInstanceDataType;
    }

    /**
     * <p>
     * The type of data to be streamed.
     * </p>
     * 
     * @return The type of data to be streamed.
     * @see AppInstanceDataType
     */

    public String getAppInstanceDataType() {
        return this.appInstanceDataType;
    }

    /**
     * <p>
     * The type of data to be streamed.
     * </p>
     * 
     * @param appInstanceDataType
     *        The type of data to be streamed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppInstanceDataType
     */

    public AppInstanceStreamingConfiguration withAppInstanceDataType(String appInstanceDataType) {
        setAppInstanceDataType(appInstanceDataType);
        return this;
    }

    /**
     * <p>
     * The type of data to be streamed.
     * </p>
     * 
     * @param appInstanceDataType
     *        The type of data to be streamed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppInstanceDataType
     */

    public AppInstanceStreamingConfiguration withAppInstanceDataType(AppInstanceDataType appInstanceDataType) {
        this.appInstanceDataType = appInstanceDataType.toString();
        return this;
    }

    /**
     * <p>
     * The resource ARN.
     * </p>
     * 
     * @param resourceArn
     *        The resource ARN.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The resource ARN.
     * </p>
     * 
     * @return The resource ARN.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The resource ARN.
     * </p>
     * 
     * @param resourceArn
     *        The resource ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceStreamingConfiguration withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getAppInstanceDataType() != null)
            sb.append("AppInstanceDataType: ").append(getAppInstanceDataType()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstanceStreamingConfiguration == false)
            return false;
        AppInstanceStreamingConfiguration other = (AppInstanceStreamingConfiguration) obj;
        if (other.getAppInstanceDataType() == null ^ this.getAppInstanceDataType() == null)
            return false;
        if (other.getAppInstanceDataType() != null && other.getAppInstanceDataType().equals(this.getAppInstanceDataType()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceDataType() == null) ? 0 : getAppInstanceDataType().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public AppInstanceStreamingConfiguration clone() {
        try {
            return (AppInstanceStreamingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AppInstanceStreamingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
