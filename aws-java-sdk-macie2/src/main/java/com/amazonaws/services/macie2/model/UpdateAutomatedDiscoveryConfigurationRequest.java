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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateAutomatedDiscoveryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAutomatedDiscoveryConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new status of automated sensitive data discovery for the account. Valid values are: ENABLED, start or resume
     * automated sensitive data discovery activities for the account; and, DISABLED, stop performing automated sensitive
     * data discovery activities for the account.
     * </p>
     * <p>
     * When you enable automated sensitive data discovery for the first time, Amazon Macie uses default configuration
     * settings to determine which data sources to analyze and which managed data identifiers to use. To change these
     * settings, use the UpdateClassificationScope and UpdateSensitivityInspectionTemplate operations, respectively. If
     * you change the settings and subsequently disable the configuration, Amazon Macie retains your changes.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The new status of automated sensitive data discovery for the account. Valid values are: ENABLED, start or resume
     * automated sensitive data discovery activities for the account; and, DISABLED, stop performing automated sensitive
     * data discovery activities for the account.
     * </p>
     * <p>
     * When you enable automated sensitive data discovery for the first time, Amazon Macie uses default configuration
     * settings to determine which data sources to analyze and which managed data identifiers to use. To change these
     * settings, use the UpdateClassificationScope and UpdateSensitivityInspectionTemplate operations, respectively. If
     * you change the settings and subsequently disable the configuration, Amazon Macie retains your changes.
     * </p>
     * 
     * @param status
     *        The new status of automated sensitive data discovery for the account. Valid values are: ENABLED, start or
     *        resume automated sensitive data discovery activities for the account; and, DISABLED, stop performing
     *        automated sensitive data discovery activities for the account.</p>
     *        <p>
     *        When you enable automated sensitive data discovery for the first time, Amazon Macie uses default
     *        configuration settings to determine which data sources to analyze and which managed data identifiers to
     *        use. To change these settings, use the UpdateClassificationScope and UpdateSensitivityInspectionTemplate
     *        operations, respectively. If you change the settings and subsequently disable the configuration, Amazon
     *        Macie retains your changes.
     * @see AutomatedDiscoveryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The new status of automated sensitive data discovery for the account. Valid values are: ENABLED, start or resume
     * automated sensitive data discovery activities for the account; and, DISABLED, stop performing automated sensitive
     * data discovery activities for the account.
     * </p>
     * <p>
     * When you enable automated sensitive data discovery for the first time, Amazon Macie uses default configuration
     * settings to determine which data sources to analyze and which managed data identifiers to use. To change these
     * settings, use the UpdateClassificationScope and UpdateSensitivityInspectionTemplate operations, respectively. If
     * you change the settings and subsequently disable the configuration, Amazon Macie retains your changes.
     * </p>
     * 
     * @return The new status of automated sensitive data discovery for the account. Valid values are: ENABLED, start or
     *         resume automated sensitive data discovery activities for the account; and, DISABLED, stop performing
     *         automated sensitive data discovery activities for the account.</p>
     *         <p>
     *         When you enable automated sensitive data discovery for the first time, Amazon Macie uses default
     *         configuration settings to determine which data sources to analyze and which managed data identifiers to
     *         use. To change these settings, use the UpdateClassificationScope and UpdateSensitivityInspectionTemplate
     *         operations, respectively. If you change the settings and subsequently disable the configuration, Amazon
     *         Macie retains your changes.
     * @see AutomatedDiscoveryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The new status of automated sensitive data discovery for the account. Valid values are: ENABLED, start or resume
     * automated sensitive data discovery activities for the account; and, DISABLED, stop performing automated sensitive
     * data discovery activities for the account.
     * </p>
     * <p>
     * When you enable automated sensitive data discovery for the first time, Amazon Macie uses default configuration
     * settings to determine which data sources to analyze and which managed data identifiers to use. To change these
     * settings, use the UpdateClassificationScope and UpdateSensitivityInspectionTemplate operations, respectively. If
     * you change the settings and subsequently disable the configuration, Amazon Macie retains your changes.
     * </p>
     * 
     * @param status
     *        The new status of automated sensitive data discovery for the account. Valid values are: ENABLED, start or
     *        resume automated sensitive data discovery activities for the account; and, DISABLED, stop performing
     *        automated sensitive data discovery activities for the account.</p>
     *        <p>
     *        When you enable automated sensitive data discovery for the first time, Amazon Macie uses default
     *        configuration settings to determine which data sources to analyze and which managed data identifiers to
     *        use. To change these settings, use the UpdateClassificationScope and UpdateSensitivityInspectionTemplate
     *        operations, respectively. If you change the settings and subsequently disable the configuration, Amazon
     *        Macie retains your changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomatedDiscoveryStatus
     */

    public UpdateAutomatedDiscoveryConfigurationRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The new status of automated sensitive data discovery for the account. Valid values are: ENABLED, start or resume
     * automated sensitive data discovery activities for the account; and, DISABLED, stop performing automated sensitive
     * data discovery activities for the account.
     * </p>
     * <p>
     * When you enable automated sensitive data discovery for the first time, Amazon Macie uses default configuration
     * settings to determine which data sources to analyze and which managed data identifiers to use. To change these
     * settings, use the UpdateClassificationScope and UpdateSensitivityInspectionTemplate operations, respectively. If
     * you change the settings and subsequently disable the configuration, Amazon Macie retains your changes.
     * </p>
     * 
     * @param status
     *        The new status of automated sensitive data discovery for the account. Valid values are: ENABLED, start or
     *        resume automated sensitive data discovery activities for the account; and, DISABLED, stop performing
     *        automated sensitive data discovery activities for the account.</p>
     *        <p>
     *        When you enable automated sensitive data discovery for the first time, Amazon Macie uses default
     *        configuration settings to determine which data sources to analyze and which managed data identifiers to
     *        use. To change these settings, use the UpdateClassificationScope and UpdateSensitivityInspectionTemplate
     *        operations, respectively. If you change the settings and subsequently disable the configuration, Amazon
     *        Macie retains your changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomatedDiscoveryStatus
     */

    public UpdateAutomatedDiscoveryConfigurationRequest withStatus(AutomatedDiscoveryStatus status) {
        this.status = status.toString();
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

        if (obj instanceof UpdateAutomatedDiscoveryConfigurationRequest == false)
            return false;
        UpdateAutomatedDiscoveryConfigurationRequest other = (UpdateAutomatedDiscoveryConfigurationRequest) obj;
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAutomatedDiscoveryConfigurationRequest clone() {
        return (UpdateAutomatedDiscoveryConfigurationRequest) super.clone();
    }

}
