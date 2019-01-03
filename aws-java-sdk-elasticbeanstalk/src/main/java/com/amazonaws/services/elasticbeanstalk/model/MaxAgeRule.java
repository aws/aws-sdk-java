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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A lifecycle rule that deletes application versions after the specified number of days.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/MaxAgeRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaxAgeRule implements Serializable, Cloneable {

    /**
     * <p>
     * Specify <code>true</code> to apply the rule, or <code>false</code> to disable it.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specify the number of days to retain an application versions.
     * </p>
     */
    private Integer maxAgeInDays;
    /**
     * <p>
     * Set to <code>true</code> to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the
     * application version.
     * </p>
     */
    private Boolean deleteSourceFromS3;

    /**
     * <p>
     * Specify <code>true</code> to apply the rule, or <code>false</code> to disable it.
     * </p>
     * 
     * @param enabled
     *        Specify <code>true</code> to apply the rule, or <code>false</code> to disable it.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specify <code>true</code> to apply the rule, or <code>false</code> to disable it.
     * </p>
     * 
     * @return Specify <code>true</code> to apply the rule, or <code>false</code> to disable it.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specify <code>true</code> to apply the rule, or <code>false</code> to disable it.
     * </p>
     * 
     * @param enabled
     *        Specify <code>true</code> to apply the rule, or <code>false</code> to disable it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxAgeRule withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to apply the rule, or <code>false</code> to disable it.
     * </p>
     * 
     * @return Specify <code>true</code> to apply the rule, or <code>false</code> to disable it.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specify the number of days to retain an application versions.
     * </p>
     * 
     * @param maxAgeInDays
     *        Specify the number of days to retain an application versions.
     */

    public void setMaxAgeInDays(Integer maxAgeInDays) {
        this.maxAgeInDays = maxAgeInDays;
    }

    /**
     * <p>
     * Specify the number of days to retain an application versions.
     * </p>
     * 
     * @return Specify the number of days to retain an application versions.
     */

    public Integer getMaxAgeInDays() {
        return this.maxAgeInDays;
    }

    /**
     * <p>
     * Specify the number of days to retain an application versions.
     * </p>
     * 
     * @param maxAgeInDays
     *        Specify the number of days to retain an application versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxAgeRule withMaxAgeInDays(Integer maxAgeInDays) {
        setMaxAgeInDays(maxAgeInDays);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the
     * application version.
     * </p>
     * 
     * @param deleteSourceFromS3
     *        Set to <code>true</code> to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes
     *        the application version.
     */

    public void setDeleteSourceFromS3(Boolean deleteSourceFromS3) {
        this.deleteSourceFromS3 = deleteSourceFromS3;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the
     * application version.
     * </p>
     * 
     * @return Set to <code>true</code> to delete a version's source bundle from Amazon S3 when Elastic Beanstalk
     *         deletes the application version.
     */

    public Boolean getDeleteSourceFromS3() {
        return this.deleteSourceFromS3;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the
     * application version.
     * </p>
     * 
     * @param deleteSourceFromS3
     *        Set to <code>true</code> to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes
     *        the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaxAgeRule withDeleteSourceFromS3(Boolean deleteSourceFromS3) {
        setDeleteSourceFromS3(deleteSourceFromS3);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the
     * application version.
     * </p>
     * 
     * @return Set to <code>true</code> to delete a version's source bundle from Amazon S3 when Elastic Beanstalk
     *         deletes the application version.
     */

    public Boolean isDeleteSourceFromS3() {
        return this.deleteSourceFromS3;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getMaxAgeInDays() != null)
            sb.append("MaxAgeInDays: ").append(getMaxAgeInDays()).append(",");
        if (getDeleteSourceFromS3() != null)
            sb.append("DeleteSourceFromS3: ").append(getDeleteSourceFromS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaxAgeRule == false)
            return false;
        MaxAgeRule other = (MaxAgeRule) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getMaxAgeInDays() == null ^ this.getMaxAgeInDays() == null)
            return false;
        if (other.getMaxAgeInDays() != null && other.getMaxAgeInDays().equals(this.getMaxAgeInDays()) == false)
            return false;
        if (other.getDeleteSourceFromS3() == null ^ this.getDeleteSourceFromS3() == null)
            return false;
        if (other.getDeleteSourceFromS3() != null && other.getDeleteSourceFromS3().equals(this.getDeleteSourceFromS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getMaxAgeInDays() == null) ? 0 : getMaxAgeInDays().hashCode());
        hashCode = prime * hashCode + ((getDeleteSourceFromS3() == null) ? 0 : getDeleteSourceFromS3().hashCode());
        return hashCode;
    }

    @Override
    public MaxAgeRule clone() {
        try {
            return (MaxAgeRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
