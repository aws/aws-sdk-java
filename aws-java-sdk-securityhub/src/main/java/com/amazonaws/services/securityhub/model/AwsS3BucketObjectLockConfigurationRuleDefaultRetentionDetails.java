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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The default S3 Object Lock retention mode and period that you want to apply to new objects placed in the specified
 * Amazon S3 bucket.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of days that you want to specify for the default retention period.
     * </p>
     */
    private Integer days;
    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The number of years that you want to specify for the default retention period.
     * </p>
     */
    private Integer years;

    /**
     * <p>
     * The number of days that you want to specify for the default retention period.
     * </p>
     * 
     * @param days
     *        The number of days that you want to specify for the default retention period.
     */

    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * The number of days that you want to specify for the default retention period.
     * </p>
     * 
     * @return The number of days that you want to specify for the default retention period.
     */

    public Integer getDays() {
        return this.days;
    }

    /**
     * <p>
     * The number of days that you want to specify for the default retention period.
     * </p>
     * 
     * @param days
     *        The number of days that you want to specify for the default retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails withDays(Integer days) {
        setDays(days);
        return this;
    }

    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     * </p>
     * 
     * @param mode
     *        The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     * </p>
     * 
     * @return The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     * </p>
     * 
     * @param mode
     *        The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The number of years that you want to specify for the default retention period.
     * </p>
     * 
     * @param years
     *        The number of years that you want to specify for the default retention period.
     */

    public void setYears(Integer years) {
        this.years = years;
    }

    /**
     * <p>
     * The number of years that you want to specify for the default retention period.
     * </p>
     * 
     * @return The number of years that you want to specify for the default retention period.
     */

    public Integer getYears() {
        return this.years;
    }

    /**
     * <p>
     * The number of years that you want to specify for the default retention period.
     * </p>
     * 
     * @param years
     *        The number of years that you want to specify for the default retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails withYears(Integer years) {
        setYears(years);
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
        if (getDays() != null)
            sb.append("Days: ").append(getDays()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getYears() != null)
            sb.append("Years: ").append(getYears());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails == false)
            return false;
        AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails other = (AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails) obj;
        if (other.getDays() == null ^ this.getDays() == null)
            return false;
        if (other.getDays() != null && other.getDays().equals(this.getDays()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getYears() == null ^ this.getYears() == null)
            return false;
        if (other.getYears() != null && other.getYears().equals(this.getYears()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getYears() == null) ? 0 : getYears().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails clone() {
        try {
            return (AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketObjectLockConfigurationRuleDefaultRetentionDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
