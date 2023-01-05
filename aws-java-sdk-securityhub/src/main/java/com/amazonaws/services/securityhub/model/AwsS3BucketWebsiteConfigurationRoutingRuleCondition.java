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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The condition that must be met in order to apply the routing rule.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketWebsiteConfigurationRoutingRuleCondition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketWebsiteConfigurationRoutingRuleCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates to redirect the request if the HTTP error code matches this value.
     * </p>
     */
    private String httpErrorCodeReturnedEquals;
    /**
     * <p>
     * Indicates to redirect the request if the key prefix matches this value.
     * </p>
     */
    private String keyPrefixEquals;

    /**
     * <p>
     * Indicates to redirect the request if the HTTP error code matches this value.
     * </p>
     * 
     * @param httpErrorCodeReturnedEquals
     *        Indicates to redirect the request if the HTTP error code matches this value.
     */

    public void setHttpErrorCodeReturnedEquals(String httpErrorCodeReturnedEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
    }

    /**
     * <p>
     * Indicates to redirect the request if the HTTP error code matches this value.
     * </p>
     * 
     * @return Indicates to redirect the request if the HTTP error code matches this value.
     */

    public String getHttpErrorCodeReturnedEquals() {
        return this.httpErrorCodeReturnedEquals;
    }

    /**
     * <p>
     * Indicates to redirect the request if the HTTP error code matches this value.
     * </p>
     * 
     * @param httpErrorCodeReturnedEquals
     *        Indicates to redirect the request if the HTTP error code matches this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRuleCondition withHttpErrorCodeReturnedEquals(String httpErrorCodeReturnedEquals) {
        setHttpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals);
        return this;
    }

    /**
     * <p>
     * Indicates to redirect the request if the key prefix matches this value.
     * </p>
     * 
     * @param keyPrefixEquals
     *        Indicates to redirect the request if the key prefix matches this value.
     */

    public void setKeyPrefixEquals(String keyPrefixEquals) {
        this.keyPrefixEquals = keyPrefixEquals;
    }

    /**
     * <p>
     * Indicates to redirect the request if the key prefix matches this value.
     * </p>
     * 
     * @return Indicates to redirect the request if the key prefix matches this value.
     */

    public String getKeyPrefixEquals() {
        return this.keyPrefixEquals;
    }

    /**
     * <p>
     * Indicates to redirect the request if the key prefix matches this value.
     * </p>
     * 
     * @param keyPrefixEquals
     *        Indicates to redirect the request if the key prefix matches this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRuleCondition withKeyPrefixEquals(String keyPrefixEquals) {
        setKeyPrefixEquals(keyPrefixEquals);
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
        if (getHttpErrorCodeReturnedEquals() != null)
            sb.append("HttpErrorCodeReturnedEquals: ").append(getHttpErrorCodeReturnedEquals()).append(",");
        if (getKeyPrefixEquals() != null)
            sb.append("KeyPrefixEquals: ").append(getKeyPrefixEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketWebsiteConfigurationRoutingRuleCondition == false)
            return false;
        AwsS3BucketWebsiteConfigurationRoutingRuleCondition other = (AwsS3BucketWebsiteConfigurationRoutingRuleCondition) obj;
        if (other.getHttpErrorCodeReturnedEquals() == null ^ this.getHttpErrorCodeReturnedEquals() == null)
            return false;
        if (other.getHttpErrorCodeReturnedEquals() != null && other.getHttpErrorCodeReturnedEquals().equals(this.getHttpErrorCodeReturnedEquals()) == false)
            return false;
        if (other.getKeyPrefixEquals() == null ^ this.getKeyPrefixEquals() == null)
            return false;
        if (other.getKeyPrefixEquals() != null && other.getKeyPrefixEquals().equals(this.getKeyPrefixEquals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpErrorCodeReturnedEquals() == null) ? 0 : getHttpErrorCodeReturnedEquals().hashCode());
        hashCode = prime * hashCode + ((getKeyPrefixEquals() == null) ? 0 : getKeyPrefixEquals().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketWebsiteConfigurationRoutingRuleCondition clone() {
        try {
            return (AwsS3BucketWebsiteConfigurationRoutingRuleCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketWebsiteConfigurationRoutingRuleConditionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
