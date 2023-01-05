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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A value that indicates the AMI information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CustomDBEngineVersionAMI" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomDBEngineVersionAMI implements Serializable, Cloneable {

    /**
     * <p>
     * A value that indicates the ID of the AMI.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * A value that indicates the status of a custom engine version (CEV).
     * </p>
     */
    private String status;

    /**
     * <p>
     * A value that indicates the ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        A value that indicates the ID of the AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * A value that indicates the ID of the AMI.
     * </p>
     * 
     * @return A value that indicates the ID of the AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * A value that indicates the ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        A value that indicates the ID of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDBEngineVersionAMI withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * A value that indicates the status of a custom engine version (CEV).
     * </p>
     * 
     * @param status
     *        A value that indicates the status of a custom engine version (CEV).
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A value that indicates the status of a custom engine version (CEV).
     * </p>
     * 
     * @return A value that indicates the status of a custom engine version (CEV).
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A value that indicates the status of a custom engine version (CEV).
     * </p>
     * 
     * @param status
     *        A value that indicates the status of a custom engine version (CEV).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDBEngineVersionAMI withStatus(String status) {
        setStatus(status);
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomDBEngineVersionAMI == false)
            return false;
        CustomDBEngineVersionAMI other = (CustomDBEngineVersionAMI) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CustomDBEngineVersionAMI clone() {
        try {
            return (CustomDBEngineVersionAMI) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
