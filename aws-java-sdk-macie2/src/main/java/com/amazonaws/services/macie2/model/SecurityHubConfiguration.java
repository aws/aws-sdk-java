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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configuration settings that determine which findings are published to Security Hub automatically. For
 * information about how Macie publishes findings to Security Hub, see <a
 * href="https://docs.aws.amazon.com/macie/latest/user/securityhub-integration.html">Amazon Macie integration with
 * Security Hub</a> in the <i>Amazon Macie User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SecurityHubConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityHubConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to publish sensitive data findings to Security Hub. If you set this value to true, Amazon Macie
     * automatically publishes all sensitive data findings that weren't suppressed by a findings filter. The default
     * value is false.
     * </p>
     */
    private Boolean publishClassificationFindings;
    /**
     * <p>
     * Specifies whether to publish policy findings to Security Hub. If you set this value to true, Amazon Macie
     * automatically publishes all new and updated policy findings that weren't suppressed by a findings filter. The
     * default value is true.
     * </p>
     */
    private Boolean publishPolicyFindings;

    /**
     * <p>
     * Specifies whether to publish sensitive data findings to Security Hub. If you set this value to true, Amazon Macie
     * automatically publishes all sensitive data findings that weren't suppressed by a findings filter. The default
     * value is false.
     * </p>
     * 
     * @param publishClassificationFindings
     *        Specifies whether to publish sensitive data findings to Security Hub. If you set this value to true,
     *        Amazon Macie automatically publishes all sensitive data findings that weren't suppressed by a findings
     *        filter. The default value is false.
     */

    public void setPublishClassificationFindings(Boolean publishClassificationFindings) {
        this.publishClassificationFindings = publishClassificationFindings;
    }

    /**
     * <p>
     * Specifies whether to publish sensitive data findings to Security Hub. If you set this value to true, Amazon Macie
     * automatically publishes all sensitive data findings that weren't suppressed by a findings filter. The default
     * value is false.
     * </p>
     * 
     * @return Specifies whether to publish sensitive data findings to Security Hub. If you set this value to true,
     *         Amazon Macie automatically publishes all sensitive data findings that weren't suppressed by a findings
     *         filter. The default value is false.
     */

    public Boolean getPublishClassificationFindings() {
        return this.publishClassificationFindings;
    }

    /**
     * <p>
     * Specifies whether to publish sensitive data findings to Security Hub. If you set this value to true, Amazon Macie
     * automatically publishes all sensitive data findings that weren't suppressed by a findings filter. The default
     * value is false.
     * </p>
     * 
     * @param publishClassificationFindings
     *        Specifies whether to publish sensitive data findings to Security Hub. If you set this value to true,
     *        Amazon Macie automatically publishes all sensitive data findings that weren't suppressed by a findings
     *        filter. The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityHubConfiguration withPublishClassificationFindings(Boolean publishClassificationFindings) {
        setPublishClassificationFindings(publishClassificationFindings);
        return this;
    }

    /**
     * <p>
     * Specifies whether to publish sensitive data findings to Security Hub. If you set this value to true, Amazon Macie
     * automatically publishes all sensitive data findings that weren't suppressed by a findings filter. The default
     * value is false.
     * </p>
     * 
     * @return Specifies whether to publish sensitive data findings to Security Hub. If you set this value to true,
     *         Amazon Macie automatically publishes all sensitive data findings that weren't suppressed by a findings
     *         filter. The default value is false.
     */

    public Boolean isPublishClassificationFindings() {
        return this.publishClassificationFindings;
    }

    /**
     * <p>
     * Specifies whether to publish policy findings to Security Hub. If you set this value to true, Amazon Macie
     * automatically publishes all new and updated policy findings that weren't suppressed by a findings filter. The
     * default value is true.
     * </p>
     * 
     * @param publishPolicyFindings
     *        Specifies whether to publish policy findings to Security Hub. If you set this value to true, Amazon Macie
     *        automatically publishes all new and updated policy findings that weren't suppressed by a findings filter.
     *        The default value is true.
     */

    public void setPublishPolicyFindings(Boolean publishPolicyFindings) {
        this.publishPolicyFindings = publishPolicyFindings;
    }

    /**
     * <p>
     * Specifies whether to publish policy findings to Security Hub. If you set this value to true, Amazon Macie
     * automatically publishes all new and updated policy findings that weren't suppressed by a findings filter. The
     * default value is true.
     * </p>
     * 
     * @return Specifies whether to publish policy findings to Security Hub. If you set this value to true, Amazon Macie
     *         automatically publishes all new and updated policy findings that weren't suppressed by a findings filter.
     *         The default value is true.
     */

    public Boolean getPublishPolicyFindings() {
        return this.publishPolicyFindings;
    }

    /**
     * <p>
     * Specifies whether to publish policy findings to Security Hub. If you set this value to true, Amazon Macie
     * automatically publishes all new and updated policy findings that weren't suppressed by a findings filter. The
     * default value is true.
     * </p>
     * 
     * @param publishPolicyFindings
     *        Specifies whether to publish policy findings to Security Hub. If you set this value to true, Amazon Macie
     *        automatically publishes all new and updated policy findings that weren't suppressed by a findings filter.
     *        The default value is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityHubConfiguration withPublishPolicyFindings(Boolean publishPolicyFindings) {
        setPublishPolicyFindings(publishPolicyFindings);
        return this;
    }

    /**
     * <p>
     * Specifies whether to publish policy findings to Security Hub. If you set this value to true, Amazon Macie
     * automatically publishes all new and updated policy findings that weren't suppressed by a findings filter. The
     * default value is true.
     * </p>
     * 
     * @return Specifies whether to publish policy findings to Security Hub. If you set this value to true, Amazon Macie
     *         automatically publishes all new and updated policy findings that weren't suppressed by a findings filter.
     *         The default value is true.
     */

    public Boolean isPublishPolicyFindings() {
        return this.publishPolicyFindings;
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
        if (getPublishClassificationFindings() != null)
            sb.append("PublishClassificationFindings: ").append(getPublishClassificationFindings()).append(",");
        if (getPublishPolicyFindings() != null)
            sb.append("PublishPolicyFindings: ").append(getPublishPolicyFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityHubConfiguration == false)
            return false;
        SecurityHubConfiguration other = (SecurityHubConfiguration) obj;
        if (other.getPublishClassificationFindings() == null ^ this.getPublishClassificationFindings() == null)
            return false;
        if (other.getPublishClassificationFindings() != null
                && other.getPublishClassificationFindings().equals(this.getPublishClassificationFindings()) == false)
            return false;
        if (other.getPublishPolicyFindings() == null ^ this.getPublishPolicyFindings() == null)
            return false;
        if (other.getPublishPolicyFindings() != null && other.getPublishPolicyFindings().equals(this.getPublishPolicyFindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublishClassificationFindings() == null) ? 0 : getPublishClassificationFindings().hashCode());
        hashCode = prime * hashCode + ((getPublishPolicyFindings() == null) ? 0 : getPublishPolicyFindings().hashCode());
        return hashCode;
    }

    @Override
    public SecurityHubConfiguration clone() {
        try {
            return (SecurityHubConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SecurityHubConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
