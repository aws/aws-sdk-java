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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The standard that you want to enable.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StandardsSubscriptionRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardsSubscriptionRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the standard that you want to enable.
     * </p>
     * <important>
     * <p>
     * In this release, Security Hub only supports the CIS AWS Foundations standard.
     * </p>
     * <p>
     * Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     * </p>
     * </important>
     */
    private String standardsArn;
    /** <p/> */
    private java.util.Map<String, String> standardsInput;

    /**
     * <p>
     * The ARN of the standard that you want to enable.
     * </p>
     * <important>
     * <p>
     * In this release, Security Hub only supports the CIS AWS Foundations standard.
     * </p>
     * <p>
     * Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     * </p>
     * </important>
     * 
     * @param standardsArn
     *        The ARN of the standard that you want to enable.</p> <important>
     *        <p>
     *        In this release, Security Hub only supports the CIS AWS Foundations standard.
     *        </p>
     *        <p>
     *        Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     *        </p>
     */

    public void setStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
    }

    /**
     * <p>
     * The ARN of the standard that you want to enable.
     * </p>
     * <important>
     * <p>
     * In this release, Security Hub only supports the CIS AWS Foundations standard.
     * </p>
     * <p>
     * Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     * </p>
     * </important>
     * 
     * @return The ARN of the standard that you want to enable.</p> <important>
     *         <p>
     *         In this release, Security Hub only supports the CIS AWS Foundations standard.
     *         </p>
     *         <p>
     *         Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     *         </p>
     */

    public String getStandardsArn() {
        return this.standardsArn;
    }

    /**
     * <p>
     * The ARN of the standard that you want to enable.
     * </p>
     * <important>
     * <p>
     * In this release, Security Hub only supports the CIS AWS Foundations standard.
     * </p>
     * <p>
     * Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     * </p>
     * </important>
     * 
     * @param standardsArn
     *        The ARN of the standard that you want to enable.</p> <important>
     *        <p>
     *        In this release, Security Hub only supports the CIS AWS Foundations standard.
     *        </p>
     *        <p>
     *        Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsSubscriptionRequest withStandardsArn(String standardsArn) {
        setStandardsArn(standardsArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Map<String, String> getStandardsInput() {
        return standardsInput;
    }

    /**
     * <p/>
     * 
     * @param standardsInput
     */

    public void setStandardsInput(java.util.Map<String, String> standardsInput) {
        this.standardsInput = standardsInput;
    }

    /**
     * <p/>
     * 
     * @param standardsInput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsSubscriptionRequest withStandardsInput(java.util.Map<String, String> standardsInput) {
        setStandardsInput(standardsInput);
        return this;
    }

    public StandardsSubscriptionRequest addStandardsInputEntry(String key, String value) {
        if (null == this.standardsInput) {
            this.standardsInput = new java.util.HashMap<String, String>();
        }
        if (this.standardsInput.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.standardsInput.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StandardsInput.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsSubscriptionRequest clearStandardsInputEntries() {
        this.standardsInput = null;
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
        if (getStandardsArn() != null)
            sb.append("StandardsArn: ").append(getStandardsArn()).append(",");
        if (getStandardsInput() != null)
            sb.append("StandardsInput: ").append(getStandardsInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardsSubscriptionRequest == false)
            return false;
        StandardsSubscriptionRequest other = (StandardsSubscriptionRequest) obj;
        if (other.getStandardsArn() == null ^ this.getStandardsArn() == null)
            return false;
        if (other.getStandardsArn() != null && other.getStandardsArn().equals(this.getStandardsArn()) == false)
            return false;
        if (other.getStandardsInput() == null ^ this.getStandardsInput() == null)
            return false;
        if (other.getStandardsInput() != null && other.getStandardsInput().equals(this.getStandardsInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsArn() == null) ? 0 : getStandardsArn().hashCode());
        hashCode = prime * hashCode + ((getStandardsInput() == null) ? 0 : getStandardsInput().hashCode());
        return hashCode;
    }

    @Override
    public StandardsSubscriptionRequest clone() {
        try {
            return (StandardsSubscriptionRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StandardsSubscriptionRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
