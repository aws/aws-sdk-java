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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a warning that occurred during an Asset Bundle import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobWarning"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobWarning implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the resource that the warning occurred for.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A description of the warning that occurred during an Asset Bundle import job.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The ARN of the resource that the warning occurred for.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource that the warning occurred for.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the resource that the warning occurred for.
     * </p>
     * 
     * @return The ARN of the resource that the warning occurred for.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the resource that the warning occurred for.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource that the warning occurred for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobWarning withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A description of the warning that occurred during an Asset Bundle import job.
     * </p>
     * 
     * @param message
     *        A description of the warning that occurred during an Asset Bundle import job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the warning that occurred during an Asset Bundle import job.
     * </p>
     * 
     * @return A description of the warning that occurred during an Asset Bundle import job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the warning that occurred during an Asset Bundle import job.
     * </p>
     * 
     * @param message
     *        A description of the warning that occurred during an Asset Bundle import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobWarning withMessage(String message) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof AssetBundleImportJobWarning == false)
            return false;
        AssetBundleImportJobWarning other = (AssetBundleImportJobWarning) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobWarning clone() {
        try {
            return (AssetBundleImportJobWarning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobWarningMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
