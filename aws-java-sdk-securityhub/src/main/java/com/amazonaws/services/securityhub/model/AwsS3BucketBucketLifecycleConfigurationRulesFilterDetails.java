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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies the objects that a rule applies to.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for the filter.
     * </p>
     */
    private AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails predicate;

    /**
     * <p>
     * The configuration for the filter.
     * </p>
     * 
     * @param predicate
     *        The configuration for the filter.
     */

    public void setPredicate(AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails predicate) {
        this.predicate = predicate;
    }

    /**
     * <p>
     * The configuration for the filter.
     * </p>
     * 
     * @return The configuration for the filter.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails getPredicate() {
        return this.predicate;
    }

    /**
     * <p>
     * The configuration for the filter.
     * </p>
     * 
     * @param predicate
     *        The configuration for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails withPredicate(AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails predicate) {
        setPredicate(predicate);
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
        if (getPredicate() != null)
            sb.append("Predicate: ").append(getPredicate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails == false)
            return false;
        AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails other = (AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails) obj;
        if (other.getPredicate() == null ^ this.getPredicate() == null)
            return false;
        if (other.getPredicate() != null && other.getPredicate().equals(this.getPredicate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredicate() == null) ? 0 : getPredicate().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails clone() {
        try {
            return (AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketBucketLifecycleConfigurationRulesFilterDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
