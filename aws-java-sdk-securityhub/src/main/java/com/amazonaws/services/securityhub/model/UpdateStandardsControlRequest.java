/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateStandardsControl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStandardsControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the security standard control to enable or disable.
     * </p>
     */
    private String standardsControlArn;
    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     */
    private String controlStatus;
    /**
     * <p>
     * A description of the reason why you are disabling a security standard control.
     * </p>
     */
    private String disabledReason;

    /**
     * <p>
     * The ARN of the security standard control to enable or disable.
     * </p>
     * 
     * @param standardsControlArn
     *        The ARN of the security standard control to enable or disable.
     */

    public void setStandardsControlArn(String standardsControlArn) {
        this.standardsControlArn = standardsControlArn;
    }

    /**
     * <p>
     * The ARN of the security standard control to enable or disable.
     * </p>
     * 
     * @return The ARN of the security standard control to enable or disable.
     */

    public String getStandardsControlArn() {
        return this.standardsControlArn;
    }

    /**
     * <p>
     * The ARN of the security standard control to enable or disable.
     * </p>
     * 
     * @param standardsControlArn
     *        The ARN of the security standard control to enable or disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStandardsControlRequest withStandardsControlArn(String standardsControlArn) {
        setStandardsControlArn(standardsControlArn);
        return this;
    }

    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     * 
     * @param controlStatus
     *        The updated status of the security standard control.
     * @see ControlStatus
     */

    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
    }

    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     * 
     * @return The updated status of the security standard control.
     * @see ControlStatus
     */

    public String getControlStatus() {
        return this.controlStatus;
    }

    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     * 
     * @param controlStatus
     *        The updated status of the security standard control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlStatus
     */

    public UpdateStandardsControlRequest withControlStatus(String controlStatus) {
        setControlStatus(controlStatus);
        return this;
    }

    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     * 
     * @param controlStatus
     *        The updated status of the security standard control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlStatus
     */

    public UpdateStandardsControlRequest withControlStatus(ControlStatus controlStatus) {
        this.controlStatus = controlStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description of the reason why you are disabling a security standard control.
     * </p>
     * 
     * @param disabledReason
     *        A description of the reason why you are disabling a security standard control.
     */

    public void setDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
    }

    /**
     * <p>
     * A description of the reason why you are disabling a security standard control.
     * </p>
     * 
     * @return A description of the reason why you are disabling a security standard control.
     */

    public String getDisabledReason() {
        return this.disabledReason;
    }

    /**
     * <p>
     * A description of the reason why you are disabling a security standard control.
     * </p>
     * 
     * @param disabledReason
     *        A description of the reason why you are disabling a security standard control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStandardsControlRequest withDisabledReason(String disabledReason) {
        setDisabledReason(disabledReason);
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
        if (getStandardsControlArn() != null)
            sb.append("StandardsControlArn: ").append(getStandardsControlArn()).append(",");
        if (getControlStatus() != null)
            sb.append("ControlStatus: ").append(getControlStatus()).append(",");
        if (getDisabledReason() != null)
            sb.append("DisabledReason: ").append(getDisabledReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStandardsControlRequest == false)
            return false;
        UpdateStandardsControlRequest other = (UpdateStandardsControlRequest) obj;
        if (other.getStandardsControlArn() == null ^ this.getStandardsControlArn() == null)
            return false;
        if (other.getStandardsControlArn() != null && other.getStandardsControlArn().equals(this.getStandardsControlArn()) == false)
            return false;
        if (other.getControlStatus() == null ^ this.getControlStatus() == null)
            return false;
        if (other.getControlStatus() != null && other.getControlStatus().equals(this.getControlStatus()) == false)
            return false;
        if (other.getDisabledReason() == null ^ this.getDisabledReason() == null)
            return false;
        if (other.getDisabledReason() != null && other.getDisabledReason().equals(this.getDisabledReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsControlArn() == null) ? 0 : getStandardsControlArn().hashCode());
        hashCode = prime * hashCode + ((getControlStatus() == null) ? 0 : getControlStatus().hashCode());
        hashCode = prime * hashCode + ((getDisabledReason() == null) ? 0 : getDisabledReason().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStandardsControlRequest clone() {
        return (UpdateStandardsControlRequest) super.clone();
    }

}
