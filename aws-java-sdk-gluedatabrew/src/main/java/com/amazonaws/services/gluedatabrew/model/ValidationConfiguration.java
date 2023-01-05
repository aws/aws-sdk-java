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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for data quality validation. Used to select the Rulesets and Validation Mode to be used in the profile
 * job. When ValidationConfiguration is null, the profile job will run without data quality validation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ValidationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ruleset to be validated in the profile job. The TargetArn of the selected
     * ruleset should be the same as the Amazon Resource Name (ARN) of the dataset that is associated with the profile
     * job.
     * </p>
     */
    private String rulesetArn;
    /**
     * <p>
     * Mode of data quality validation. Default mode is “CHECK_ALL” which verifies all rules defined in the selected
     * ruleset.
     * </p>
     */
    private String validationMode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ruleset to be validated in the profile job. The TargetArn of the selected
     * ruleset should be the same as the Amazon Resource Name (ARN) of the dataset that is associated with the profile
     * job.
     * </p>
     * 
     * @param rulesetArn
     *        The Amazon Resource Name (ARN) for the ruleset to be validated in the profile job. The TargetArn of the
     *        selected ruleset should be the same as the Amazon Resource Name (ARN) of the dataset that is associated
     *        with the profile job.
     */

    public void setRulesetArn(String rulesetArn) {
        this.rulesetArn = rulesetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ruleset to be validated in the profile job. The TargetArn of the selected
     * ruleset should be the same as the Amazon Resource Name (ARN) of the dataset that is associated with the profile
     * job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the ruleset to be validated in the profile job. The TargetArn of the
     *         selected ruleset should be the same as the Amazon Resource Name (ARN) of the dataset that is associated
     *         with the profile job.
     */

    public String getRulesetArn() {
        return this.rulesetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ruleset to be validated in the profile job. The TargetArn of the selected
     * ruleset should be the same as the Amazon Resource Name (ARN) of the dataset that is associated with the profile
     * job.
     * </p>
     * 
     * @param rulesetArn
     *        The Amazon Resource Name (ARN) for the ruleset to be validated in the profile job. The TargetArn of the
     *        selected ruleset should be the same as the Amazon Resource Name (ARN) of the dataset that is associated
     *        with the profile job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationConfiguration withRulesetArn(String rulesetArn) {
        setRulesetArn(rulesetArn);
        return this;
    }

    /**
     * <p>
     * Mode of data quality validation. Default mode is “CHECK_ALL” which verifies all rules defined in the selected
     * ruleset.
     * </p>
     * 
     * @param validationMode
     *        Mode of data quality validation. Default mode is “CHECK_ALL” which verifies all rules defined in the
     *        selected ruleset.
     * @see ValidationMode
     */

    public void setValidationMode(String validationMode) {
        this.validationMode = validationMode;
    }

    /**
     * <p>
     * Mode of data quality validation. Default mode is “CHECK_ALL” which verifies all rules defined in the selected
     * ruleset.
     * </p>
     * 
     * @return Mode of data quality validation. Default mode is “CHECK_ALL” which verifies all rules defined in the
     *         selected ruleset.
     * @see ValidationMode
     */

    public String getValidationMode() {
        return this.validationMode;
    }

    /**
     * <p>
     * Mode of data quality validation. Default mode is “CHECK_ALL” which verifies all rules defined in the selected
     * ruleset.
     * </p>
     * 
     * @param validationMode
     *        Mode of data quality validation. Default mode is “CHECK_ALL” which verifies all rules defined in the
     *        selected ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationMode
     */

    public ValidationConfiguration withValidationMode(String validationMode) {
        setValidationMode(validationMode);
        return this;
    }

    /**
     * <p>
     * Mode of data quality validation. Default mode is “CHECK_ALL” which verifies all rules defined in the selected
     * ruleset.
     * </p>
     * 
     * @param validationMode
     *        Mode of data quality validation. Default mode is “CHECK_ALL” which verifies all rules defined in the
     *        selected ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationMode
     */

    public ValidationConfiguration withValidationMode(ValidationMode validationMode) {
        this.validationMode = validationMode.toString();
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
        if (getRulesetArn() != null)
            sb.append("RulesetArn: ").append(getRulesetArn()).append(",");
        if (getValidationMode() != null)
            sb.append("ValidationMode: ").append(getValidationMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationConfiguration == false)
            return false;
        ValidationConfiguration other = (ValidationConfiguration) obj;
        if (other.getRulesetArn() == null ^ this.getRulesetArn() == null)
            return false;
        if (other.getRulesetArn() != null && other.getRulesetArn().equals(this.getRulesetArn()) == false)
            return false;
        if (other.getValidationMode() == null ^ this.getValidationMode() == null)
            return false;
        if (other.getValidationMode() != null && other.getValidationMode().equals(this.getValidationMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRulesetArn() == null) ? 0 : getRulesetArn().hashCode());
        hashCode = prime * hashCode + ((getValidationMode() == null) ? 0 : getValidationMode().hashCode());
        return hashCode;
    }

    @Override
    public ValidationConfiguration clone() {
        try {
            return (ValidationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.ValidationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
