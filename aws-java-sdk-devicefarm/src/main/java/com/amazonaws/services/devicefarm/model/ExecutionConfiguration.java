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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents configuration information about a test run, such as the execution timeout (in minutes).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ExecutionConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of minutes a test run will execute before it times out.
     * </p>
     */
    private Integer jobTimeoutMinutes;
    /**
     * <p>
     * True if account cleanup is enabled at the beginning of the test; otherwise, false.
     * </p>
     */
    private Boolean accountsCleanup;
    /**
     * <p>
     * True if app package cleanup is enabled at the beginning of the test; otherwise, false.
     * </p>
     */
    private Boolean appPackagesCleanup;
    /**
     * <p>
     * Set to true to enable video capture; otherwise, set to false. The default is true.
     * </p>
     */
    private Boolean videoCapture;
    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     */
    private Boolean skipAppResign;

    /**
     * <p>
     * The number of minutes a test run will execute before it times out.
     * </p>
     * 
     * @param jobTimeoutMinutes
     *        The number of minutes a test run will execute before it times out.
     */

    public void setJobTimeoutMinutes(Integer jobTimeoutMinutes) {
        this.jobTimeoutMinutes = jobTimeoutMinutes;
    }

    /**
     * <p>
     * The number of minutes a test run will execute before it times out.
     * </p>
     * 
     * @return The number of minutes a test run will execute before it times out.
     */

    public Integer getJobTimeoutMinutes() {
        return this.jobTimeoutMinutes;
    }

    /**
     * <p>
     * The number of minutes a test run will execute before it times out.
     * </p>
     * 
     * @param jobTimeoutMinutes
     *        The number of minutes a test run will execute before it times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionConfiguration withJobTimeoutMinutes(Integer jobTimeoutMinutes) {
        setJobTimeoutMinutes(jobTimeoutMinutes);
        return this;
    }

    /**
     * <p>
     * True if account cleanup is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param accountsCleanup
     *        True if account cleanup is enabled at the beginning of the test; otherwise, false.
     */

    public void setAccountsCleanup(Boolean accountsCleanup) {
        this.accountsCleanup = accountsCleanup;
    }

    /**
     * <p>
     * True if account cleanup is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if account cleanup is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean getAccountsCleanup() {
        return this.accountsCleanup;
    }

    /**
     * <p>
     * True if account cleanup is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param accountsCleanup
     *        True if account cleanup is enabled at the beginning of the test; otherwise, false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionConfiguration withAccountsCleanup(Boolean accountsCleanup) {
        setAccountsCleanup(accountsCleanup);
        return this;
    }

    /**
     * <p>
     * True if account cleanup is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if account cleanup is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean isAccountsCleanup() {
        return this.accountsCleanup;
    }

    /**
     * <p>
     * True if app package cleanup is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param appPackagesCleanup
     *        True if app package cleanup is enabled at the beginning of the test; otherwise, false.
     */

    public void setAppPackagesCleanup(Boolean appPackagesCleanup) {
        this.appPackagesCleanup = appPackagesCleanup;
    }

    /**
     * <p>
     * True if app package cleanup is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if app package cleanup is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean getAppPackagesCleanup() {
        return this.appPackagesCleanup;
    }

    /**
     * <p>
     * True if app package cleanup is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @param appPackagesCleanup
     *        True if app package cleanup is enabled at the beginning of the test; otherwise, false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionConfiguration withAppPackagesCleanup(Boolean appPackagesCleanup) {
        setAppPackagesCleanup(appPackagesCleanup);
        return this;
    }

    /**
     * <p>
     * True if app package cleanup is enabled at the beginning of the test; otherwise, false.
     * </p>
     * 
     * @return True if app package cleanup is enabled at the beginning of the test; otherwise, false.
     */

    public Boolean isAppPackagesCleanup() {
        return this.appPackagesCleanup;
    }

    /**
     * <p>
     * Set to true to enable video capture; otherwise, set to false. The default is true.
     * </p>
     * 
     * @param videoCapture
     *        Set to true to enable video capture; otherwise, set to false. The default is true.
     */

    public void setVideoCapture(Boolean videoCapture) {
        this.videoCapture = videoCapture;
    }

    /**
     * <p>
     * Set to true to enable video capture; otherwise, set to false. The default is true.
     * </p>
     * 
     * @return Set to true to enable video capture; otherwise, set to false. The default is true.
     */

    public Boolean getVideoCapture() {
        return this.videoCapture;
    }

    /**
     * <p>
     * Set to true to enable video capture; otherwise, set to false. The default is true.
     * </p>
     * 
     * @param videoCapture
     *        Set to true to enable video capture; otherwise, set to false. The default is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionConfiguration withVideoCapture(Boolean videoCapture) {
        setVideoCapture(videoCapture);
        return this;
    }

    /**
     * <p>
     * Set to true to enable video capture; otherwise, set to false. The default is true.
     * </p>
     * 
     * @return Set to true to enable video capture; otherwise, set to false. The default is true.
     */

    public Boolean isVideoCapture() {
        return this.videoCapture;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @param skipAppResign
     *        When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *        devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *        <p>
     *        For more information about how Device Farm re-signs your app(s), see <a
     *        href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *        FAQs</i>.
     */

    public void setSkipAppResign(Boolean skipAppResign) {
        this.skipAppResign = skipAppResign;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @return When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *         devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *         <p>
     *         For more information about how Device Farm re-signs your app(s), see <a
     *         href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *         FAQs</i>.
     */

    public Boolean getSkipAppResign() {
        return this.skipAppResign;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @param skipAppResign
     *        When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *        devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *        <p>
     *        For more information about how Device Farm re-signs your app(s), see <a
     *        href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *        FAQs</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionConfiguration withSkipAppResign(Boolean skipAppResign) {
        setSkipAppResign(skipAppResign);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @return When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *         devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *         <p>
     *         For more information about how Device Farm re-signs your app(s), see <a
     *         href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *         FAQs</i>.
     */

    public Boolean isSkipAppResign() {
        return this.skipAppResign;
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
        if (getJobTimeoutMinutes() != null)
            sb.append("JobTimeoutMinutes: ").append(getJobTimeoutMinutes()).append(",");
        if (getAccountsCleanup() != null)
            sb.append("AccountsCleanup: ").append(getAccountsCleanup()).append(",");
        if (getAppPackagesCleanup() != null)
            sb.append("AppPackagesCleanup: ").append(getAppPackagesCleanup()).append(",");
        if (getVideoCapture() != null)
            sb.append("VideoCapture: ").append(getVideoCapture()).append(",");
        if (getSkipAppResign() != null)
            sb.append("SkipAppResign: ").append(getSkipAppResign());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionConfiguration == false)
            return false;
        ExecutionConfiguration other = (ExecutionConfiguration) obj;
        if (other.getJobTimeoutMinutes() == null ^ this.getJobTimeoutMinutes() == null)
            return false;
        if (other.getJobTimeoutMinutes() != null && other.getJobTimeoutMinutes().equals(this.getJobTimeoutMinutes()) == false)
            return false;
        if (other.getAccountsCleanup() == null ^ this.getAccountsCleanup() == null)
            return false;
        if (other.getAccountsCleanup() != null && other.getAccountsCleanup().equals(this.getAccountsCleanup()) == false)
            return false;
        if (other.getAppPackagesCleanup() == null ^ this.getAppPackagesCleanup() == null)
            return false;
        if (other.getAppPackagesCleanup() != null && other.getAppPackagesCleanup().equals(this.getAppPackagesCleanup()) == false)
            return false;
        if (other.getVideoCapture() == null ^ this.getVideoCapture() == null)
            return false;
        if (other.getVideoCapture() != null && other.getVideoCapture().equals(this.getVideoCapture()) == false)
            return false;
        if (other.getSkipAppResign() == null ^ this.getSkipAppResign() == null)
            return false;
        if (other.getSkipAppResign() != null && other.getSkipAppResign().equals(this.getSkipAppResign()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobTimeoutMinutes() == null) ? 0 : getJobTimeoutMinutes().hashCode());
        hashCode = prime * hashCode + ((getAccountsCleanup() == null) ? 0 : getAccountsCleanup().hashCode());
        hashCode = prime * hashCode + ((getAppPackagesCleanup() == null) ? 0 : getAppPackagesCleanup().hashCode());
        hashCode = prime * hashCode + ((getVideoCapture() == null) ? 0 : getVideoCapture().hashCode());
        hashCode = prime * hashCode + ((getSkipAppResign() == null) ? 0 : getSkipAppResign().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionConfiguration clone() {
        try {
            return (ExecutionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.ExecutionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
