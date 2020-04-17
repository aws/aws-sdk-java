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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteRuleVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRuleVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the detector that includes the rule version to delete.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The rule ID of the rule version to delete.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The rule version to delete.
     * </p>
     */
    private String ruleVersion;

    /**
     * <p>
     * The ID of the detector that includes the rule version to delete.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector that includes the rule version to delete.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector that includes the rule version to delete.
     * </p>
     * 
     * @return The ID of the detector that includes the rule version to delete.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the detector that includes the rule version to delete.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector that includes the rule version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRuleVersionRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The rule ID of the rule version to delete.
     * </p>
     * 
     * @param ruleId
     *        The rule ID of the rule version to delete.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The rule ID of the rule version to delete.
     * </p>
     * 
     * @return The rule ID of the rule version to delete.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The rule ID of the rule version to delete.
     * </p>
     * 
     * @param ruleId
     *        The rule ID of the rule version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRuleVersionRequest withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The rule version to delete.
     * </p>
     * 
     * @param ruleVersion
     *        The rule version to delete.
     */

    public void setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
    }

    /**
     * <p>
     * The rule version to delete.
     * </p>
     * 
     * @return The rule version to delete.
     */

    public String getRuleVersion() {
        return this.ruleVersion;
    }

    /**
     * <p>
     * The rule version to delete.
     * </p>
     * 
     * @param ruleVersion
     *        The rule version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRuleVersionRequest withRuleVersion(String ruleVersion) {
        setRuleVersion(ruleVersion);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getRuleVersion() != null)
            sb.append("RuleVersion: ").append(getRuleVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRuleVersionRequest == false)
            return false;
        DeleteRuleVersionRequest other = (DeleteRuleVersionRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getRuleVersion() == null ^ this.getRuleVersion() == null)
            return false;
        if (other.getRuleVersion() != null && other.getRuleVersion().equals(this.getRuleVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getRuleVersion() == null) ? 0 : getRuleVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRuleVersionRequest clone() {
        return (DeleteRuleVersionRequest) super.clone();
    }

}
