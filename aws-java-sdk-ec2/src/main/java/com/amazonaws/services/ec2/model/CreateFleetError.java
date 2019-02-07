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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the instances that could not be launched by the fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateFleetError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetError implements Serializable, Cloneable {

    /**
     * <p>
     * The launch templates and overrides that were used for launching the instances. Any parameters that you specify in
     * the Overrides override the same parameters in the launch template.
     * </p>
     */
    private LaunchTemplateAndOverridesResponse launchTemplateAndOverrides;
    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
     * </p>
     */
    private String lifecycle;
    /**
     * <p>
     * The error code that indicates why the instance could not be launched. For more information about error codes, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error Codes</a>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message that describes why the instance could not be launched. For more information about error
     * messages, see ee <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error
     * Codes</a>.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The launch templates and overrides that were used for launching the instances. Any parameters that you specify in
     * the Overrides override the same parameters in the launch template.
     * </p>
     * 
     * @param launchTemplateAndOverrides
     *        The launch templates and overrides that were used for launching the instances. Any parameters that you
     *        specify in the Overrides override the same parameters in the launch template.
     */

    public void setLaunchTemplateAndOverrides(LaunchTemplateAndOverridesResponse launchTemplateAndOverrides) {
        this.launchTemplateAndOverrides = launchTemplateAndOverrides;
    }

    /**
     * <p>
     * The launch templates and overrides that were used for launching the instances. Any parameters that you specify in
     * the Overrides override the same parameters in the launch template.
     * </p>
     * 
     * @return The launch templates and overrides that were used for launching the instances. Any parameters that you
     *         specify in the Overrides override the same parameters in the launch template.
     */

    public LaunchTemplateAndOverridesResponse getLaunchTemplateAndOverrides() {
        return this.launchTemplateAndOverrides;
    }

    /**
     * <p>
     * The launch templates and overrides that were used for launching the instances. Any parameters that you specify in
     * the Overrides override the same parameters in the launch template.
     * </p>
     * 
     * @param launchTemplateAndOverrides
     *        The launch templates and overrides that were used for launching the instances. Any parameters that you
     *        specify in the Overrides override the same parameters in the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetError withLaunchTemplateAndOverrides(LaunchTemplateAndOverridesResponse launchTemplateAndOverrides) {
        setLaunchTemplateAndOverrides(launchTemplateAndOverrides);
        return this;
    }

    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
     * </p>
     * 
     * @param lifecycle
     *        Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
     * @see InstanceLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
     * </p>
     * 
     * @return Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
     * @see InstanceLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
     * </p>
     * 
     * @param lifecycle
     *        Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceLifecycle
     */

    public CreateFleetError withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
     * </p>
     * 
     * @param lifecycle
     *        Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceLifecycle
     */

    public CreateFleetError withLifecycle(InstanceLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The error code that indicates why the instance could not be launched. For more information about error codes, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error Codes</a>.
     * </p>
     * 
     * @param errorCode
     *        The error code that indicates why the instance could not be launched. For more information about error
     *        codes, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error Codes</a>.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code that indicates why the instance could not be launched. For more information about error codes, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error Codes</a>.
     * </p>
     * 
     * @return The error code that indicates why the instance could not be launched. For more information about error
     *         codes, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error Codes</a>.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code that indicates why the instance could not be launched. For more information about error codes, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error Codes</a>.
     * </p>
     * 
     * @param errorCode
     *        The error code that indicates why the instance could not be launched. For more information about error
     *        codes, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error Codes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message that describes why the instance could not be launched. For more information about error
     * messages, see ee <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error
     * Codes</a>.
     * </p>
     * 
     * @param errorMessage
     *        The error message that describes why the instance could not be launched. For more information about error
     *        messages, see ee <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error Codes</a>.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message that describes why the instance could not be launched. For more information about error
     * messages, see ee <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error
     * Codes</a>.
     * </p>
     * 
     * @return The error message that describes why the instance could not be launched. For more information about error
     *         messages, see ee <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error Codes</a>.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message that describes why the instance could not be launched. For more information about error
     * messages, see ee <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error
     * Codes</a>.
     * </p>
     * 
     * @param errorMessage
     *        The error message that describes why the instance could not be launched. For more information about error
     *        messages, see ee <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html">Error Codes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetError withErrorMessage(String errorMessage) {
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
        if (getLaunchTemplateAndOverrides() != null)
            sb.append("LaunchTemplateAndOverrides: ").append(getLaunchTemplateAndOverrides()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
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

        if (obj instanceof CreateFleetError == false)
            return false;
        CreateFleetError other = (CreateFleetError) obj;
        if (other.getLaunchTemplateAndOverrides() == null ^ this.getLaunchTemplateAndOverrides() == null)
            return false;
        if (other.getLaunchTemplateAndOverrides() != null && other.getLaunchTemplateAndOverrides().equals(this.getLaunchTemplateAndOverrides()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
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

        hashCode = prime * hashCode + ((getLaunchTemplateAndOverrides() == null) ? 0 : getLaunchTemplateAndOverrides().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetError clone() {
        try {
            return (CreateFleetError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
