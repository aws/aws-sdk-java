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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The error entry for Recommendation Resource exclusion. Each entry is a combination of Recommendation Resource ARN,
 * error code and error message
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/UpdateRecommendationResourceExclusionError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRecommendationResourceExclusionError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The error code
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     * 
     * @param arn
     *        The ARN of the Recommendation Resource
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     * 
     * @return The ARN of the Recommendation Resource
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     * 
     * @param arn
     *        The ARN of the Recommendation Resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommendationResourceExclusionError withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The error code
     * </p>
     * 
     * @param errorCode
     *        The error code
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code
     * </p>
     * 
     * @return The error code
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code
     * </p>
     * 
     * @param errorCode
     *        The error code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommendationResourceExclusionError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message
     * </p>
     * 
     * @param errorMessage
     *        The error message
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message
     * </p>
     * 
     * @return The error message
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message
     * </p>
     * 
     * @param errorMessage
     *        The error message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommendationResourceExclusionError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRecommendationResourceExclusionError == false)
            return false;
        UpdateRecommendationResourceExclusionError other = (UpdateRecommendationResourceExclusionError) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRecommendationResourceExclusionError clone() {
        try {
            return (UpdateRecommendationResourceExclusionError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.trustedadvisor.model.transform.UpdateRecommendationResourceExclusionErrorMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
