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
 * The encryption configuration for the S3 bucket.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketServerSideEncryptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketServerSideEncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     */
    private java.util.List<AwsS3BucketServerSideEncryptionRule> rules;

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * 
     * @return The encryption rules that are applied to the S3 bucket.
     */

    public java.util.List<AwsS3BucketServerSideEncryptionRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * 
     * @param rules
     *        The encryption rules that are applied to the S3 bucket.
     */

    public void setRules(java.util.Collection<AwsS3BucketServerSideEncryptionRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<AwsS3BucketServerSideEncryptionRule>(rules);
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The encryption rules that are applied to the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketServerSideEncryptionConfiguration withRules(AwsS3BucketServerSideEncryptionRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<AwsS3BucketServerSideEncryptionRule>(rules.length));
        }
        for (AwsS3BucketServerSideEncryptionRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * 
     * @param rules
     *        The encryption rules that are applied to the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketServerSideEncryptionConfiguration withRules(java.util.Collection<AwsS3BucketServerSideEncryptionRule> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketServerSideEncryptionConfiguration == false)
            return false;
        AwsS3BucketServerSideEncryptionConfiguration other = (AwsS3BucketServerSideEncryptionConfiguration) obj;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketServerSideEncryptionConfiguration clone() {
        try {
            return (AwsS3BucketServerSideEncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketServerSideEncryptionConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
