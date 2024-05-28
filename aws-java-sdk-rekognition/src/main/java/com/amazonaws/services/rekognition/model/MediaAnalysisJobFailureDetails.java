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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the error that resulted in failure of the job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaAnalysisJobFailureDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Error code for the failed job.
     * </p>
     */
    private String code;
    /**
     * <p>
     * Human readable error message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Error code for the failed job.
     * </p>
     * 
     * @param code
     *        Error code for the failed job.
     * @see MediaAnalysisJobFailureCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Error code for the failed job.
     * </p>
     * 
     * @return Error code for the failed job.
     * @see MediaAnalysisJobFailureCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * Error code for the failed job.
     * </p>
     * 
     * @param code
     *        Error code for the failed job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaAnalysisJobFailureCode
     */

    public MediaAnalysisJobFailureDetails withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Error code for the failed job.
     * </p>
     * 
     * @param code
     *        Error code for the failed job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaAnalysisJobFailureCode
     */

    public MediaAnalysisJobFailureDetails withCode(MediaAnalysisJobFailureCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * Human readable error message.
     * </p>
     * 
     * @param message
     *        Human readable error message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Human readable error message.
     * </p>
     * 
     * @return Human readable error message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Human readable error message.
     * </p>
     * 
     * @param message
     *        Human readable error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAnalysisJobFailureDetails withMessage(String message) {
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

        if (obj instanceof MediaAnalysisJobFailureDetails == false)
            return false;
        MediaAnalysisJobFailureDetails other = (MediaAnalysisJobFailureDetails) obj;
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

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public MediaAnalysisJobFailureDetails clone() {
        try {
            return (MediaAnalysisJobFailureDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.MediaAnalysisJobFailureDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
