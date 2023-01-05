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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information about an App Runner observability configuration resource.
 * </p>
 * <p>
 * This type contains limited information about an observability configuration. It includes only identification
 * information, without configuration details. It's returned by the <a>ListObservabilityConfigurations</a> action.
 * Complete configuration information is returned by the <a>CreateObservabilityConfiguration</a>,
 * <a>DescribeObservabilityConfiguration</a>, and <a>DeleteObservabilityConfiguration</a> actions using the
 * <a>ObservabilityConfiguration</a> type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ObservabilityConfigurationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObservabilityConfigurationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this observability configuration.
     * </p>
     */
    private String observabilityConfigurationArn;
    /**
     * <p>
     * The customer-provided observability configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     */
    private String observabilityConfigurationName;
    /**
     * <p>
     * The revision of this observability configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     * </p>
     */
    private Integer observabilityConfigurationRevision;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this observability configuration.
     * </p>
     * 
     * @param observabilityConfigurationArn
     *        The Amazon Resource Name (ARN) of this observability configuration.
     */

    public void setObservabilityConfigurationArn(String observabilityConfigurationArn) {
        this.observabilityConfigurationArn = observabilityConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this observability configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of this observability configuration.
     */

    public String getObservabilityConfigurationArn() {
        return this.observabilityConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this observability configuration.
     * </p>
     * 
     * @param observabilityConfigurationArn
     *        The Amazon Resource Name (ARN) of this observability configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObservabilityConfigurationSummary withObservabilityConfigurationArn(String observabilityConfigurationArn) {
        setObservabilityConfigurationArn(observabilityConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The customer-provided observability configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     * 
     * @param observabilityConfigurationName
     *        The customer-provided observability configuration name. It can be used in multiple revisions of a
     *        configuration.
     */

    public void setObservabilityConfigurationName(String observabilityConfigurationName) {
        this.observabilityConfigurationName = observabilityConfigurationName;
    }

    /**
     * <p>
     * The customer-provided observability configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     * 
     * @return The customer-provided observability configuration name. It can be used in multiple revisions of a
     *         configuration.
     */

    public String getObservabilityConfigurationName() {
        return this.observabilityConfigurationName;
    }

    /**
     * <p>
     * The customer-provided observability configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     * 
     * @param observabilityConfigurationName
     *        The customer-provided observability configuration name. It can be used in multiple revisions of a
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObservabilityConfigurationSummary withObservabilityConfigurationName(String observabilityConfigurationName) {
        setObservabilityConfigurationName(observabilityConfigurationName);
        return this;
    }

    /**
     * <p>
     * The revision of this observability configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     * </p>
     * 
     * @param observabilityConfigurationRevision
     *        The revision of this observability configuration. It's unique among all the active configurations (
     *        <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     */

    public void setObservabilityConfigurationRevision(Integer observabilityConfigurationRevision) {
        this.observabilityConfigurationRevision = observabilityConfigurationRevision;
    }

    /**
     * <p>
     * The revision of this observability configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     * </p>
     * 
     * @return The revision of this observability configuration. It's unique among all the active configurations (
     *         <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     */

    public Integer getObservabilityConfigurationRevision() {
        return this.observabilityConfigurationRevision;
    }

    /**
     * <p>
     * The revision of this observability configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     * </p>
     * 
     * @param observabilityConfigurationRevision
     *        The revision of this observability configuration. It's unique among all the active configurations (
     *        <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObservabilityConfigurationSummary withObservabilityConfigurationRevision(Integer observabilityConfigurationRevision) {
        setObservabilityConfigurationRevision(observabilityConfigurationRevision);
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
        if (getObservabilityConfigurationArn() != null)
            sb.append("ObservabilityConfigurationArn: ").append(getObservabilityConfigurationArn()).append(",");
        if (getObservabilityConfigurationName() != null)
            sb.append("ObservabilityConfigurationName: ").append(getObservabilityConfigurationName()).append(",");
        if (getObservabilityConfigurationRevision() != null)
            sb.append("ObservabilityConfigurationRevision: ").append(getObservabilityConfigurationRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObservabilityConfigurationSummary == false)
            return false;
        ObservabilityConfigurationSummary other = (ObservabilityConfigurationSummary) obj;
        if (other.getObservabilityConfigurationArn() == null ^ this.getObservabilityConfigurationArn() == null)
            return false;
        if (other.getObservabilityConfigurationArn() != null
                && other.getObservabilityConfigurationArn().equals(this.getObservabilityConfigurationArn()) == false)
            return false;
        if (other.getObservabilityConfigurationName() == null ^ this.getObservabilityConfigurationName() == null)
            return false;
        if (other.getObservabilityConfigurationName() != null
                && other.getObservabilityConfigurationName().equals(this.getObservabilityConfigurationName()) == false)
            return false;
        if (other.getObservabilityConfigurationRevision() == null ^ this.getObservabilityConfigurationRevision() == null)
            return false;
        if (other.getObservabilityConfigurationRevision() != null
                && other.getObservabilityConfigurationRevision().equals(this.getObservabilityConfigurationRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObservabilityConfigurationArn() == null) ? 0 : getObservabilityConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getObservabilityConfigurationName() == null) ? 0 : getObservabilityConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getObservabilityConfigurationRevision() == null) ? 0 : getObservabilityConfigurationRevision().hashCode());
        return hashCode;
    }

    @Override
    public ObservabilityConfigurationSummary clone() {
        try {
            return (ObservabilityConfigurationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.ObservabilityConfigurationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
