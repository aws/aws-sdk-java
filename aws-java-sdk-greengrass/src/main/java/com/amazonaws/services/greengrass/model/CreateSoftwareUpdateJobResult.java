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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSoftwareUpdateJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSoftwareUpdateJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The IoT Job ARN corresponding to this update. */
    private String iotJobArn;
    /** The IoT Job Id corresponding to this update. */
    private String iotJobId;

    /**
     * The IoT Job ARN corresponding to this update.
     * 
     * @param iotJobArn
     *        The IoT Job ARN corresponding to this update.
     */

    public void setIotJobArn(String iotJobArn) {
        this.iotJobArn = iotJobArn;
    }

    /**
     * The IoT Job ARN corresponding to this update.
     * 
     * @return The IoT Job ARN corresponding to this update.
     */

    public String getIotJobArn() {
        return this.iotJobArn;
    }

    /**
     * The IoT Job ARN corresponding to this update.
     * 
     * @param iotJobArn
     *        The IoT Job ARN corresponding to this update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSoftwareUpdateJobResult withIotJobArn(String iotJobArn) {
        setIotJobArn(iotJobArn);
        return this;
    }

    /**
     * The IoT Job Id corresponding to this update.
     * 
     * @param iotJobId
     *        The IoT Job Id corresponding to this update.
     */

    public void setIotJobId(String iotJobId) {
        this.iotJobId = iotJobId;
    }

    /**
     * The IoT Job Id corresponding to this update.
     * 
     * @return The IoT Job Id corresponding to this update.
     */

    public String getIotJobId() {
        return this.iotJobId;
    }

    /**
     * The IoT Job Id corresponding to this update.
     * 
     * @param iotJobId
     *        The IoT Job Id corresponding to this update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSoftwareUpdateJobResult withIotJobId(String iotJobId) {
        setIotJobId(iotJobId);
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
        if (getIotJobArn() != null)
            sb.append("IotJobArn: ").append(getIotJobArn()).append(",");
        if (getIotJobId() != null)
            sb.append("IotJobId: ").append(getIotJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSoftwareUpdateJobResult == false)
            return false;
        CreateSoftwareUpdateJobResult other = (CreateSoftwareUpdateJobResult) obj;
        if (other.getIotJobArn() == null ^ this.getIotJobArn() == null)
            return false;
        if (other.getIotJobArn() != null && other.getIotJobArn().equals(this.getIotJobArn()) == false)
            return false;
        if (other.getIotJobId() == null ^ this.getIotJobId() == null)
            return false;
        if (other.getIotJobId() != null && other.getIotJobId().equals(this.getIotJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIotJobArn() == null) ? 0 : getIotJobArn().hashCode());
        hashCode = prime * hashCode + ((getIotJobId() == null) ? 0 : getIotJobId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSoftwareUpdateJobResult clone() {
        try {
            return (CreateSoftwareUpdateJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
