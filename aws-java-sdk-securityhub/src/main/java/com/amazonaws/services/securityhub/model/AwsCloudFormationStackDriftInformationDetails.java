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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the stack's conformity to its expected template configuration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFormationStackDriftInformationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFormationStackDriftInformationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected template configuration.
     * </p>
     */
    private String stackDriftStatus;

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected template configuration.
     * </p>
     * 
     * @param stackDriftStatus
     *        Status of the stack's actual configuration compared to its expected template configuration.
     */

    public void setStackDriftStatus(String stackDriftStatus) {
        this.stackDriftStatus = stackDriftStatus;
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected template configuration.
     * </p>
     * 
     * @return Status of the stack's actual configuration compared to its expected template configuration.
     */

    public String getStackDriftStatus() {
        return this.stackDriftStatus;
    }

    /**
     * <p>
     * Status of the stack's actual configuration compared to its expected template configuration.
     * </p>
     * 
     * @param stackDriftStatus
     *        Status of the stack's actual configuration compared to its expected template configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDriftInformationDetails withStackDriftStatus(String stackDriftStatus) {
        setStackDriftStatus(stackDriftStatus);
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
        if (getStackDriftStatus() != null)
            sb.append("StackDriftStatus: ").append(getStackDriftStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFormationStackDriftInformationDetails == false)
            return false;
        AwsCloudFormationStackDriftInformationDetails other = (AwsCloudFormationStackDriftInformationDetails) obj;
        if (other.getStackDriftStatus() == null ^ this.getStackDriftStatus() == null)
            return false;
        if (other.getStackDriftStatus() != null && other.getStackDriftStatus().equals(this.getStackDriftStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackDriftStatus() == null) ? 0 : getStackDriftStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFormationStackDriftInformationDetails clone() {
        try {
            return (AwsCloudFormationStackDriftInformationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFormationStackDriftInformationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
