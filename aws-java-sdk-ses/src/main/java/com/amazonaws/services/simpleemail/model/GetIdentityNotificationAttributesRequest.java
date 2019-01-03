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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to return the notification attributes for a list of identities you verified with Amazon SES. For
 * information about Amazon SES notifications, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityNotificationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityNotificationAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of one or more identities. You can specify an identity by using its name or by using its Amazon Resource
     * Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> identities;

    /**
     * <p>
     * A list of one or more identities. You can specify an identity by using its name or by using its Amazon Resource
     * Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * 
     * @return A list of one or more identities. You can specify an identity by using its name or by using its Amazon
     *         Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     */

    public java.util.List<String> getIdentities() {
        if (identities == null) {
            identities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return identities;
    }

    /**
     * <p>
     * A list of one or more identities. You can specify an identity by using its name or by using its Amazon Resource
     * Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * 
     * @param identities
     *        A list of one or more identities. You can specify an identity by using its name or by using its Amazon
     *        Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     */

    public void setIdentities(java.util.Collection<String> identities) {
        if (identities == null) {
            this.identities = null;
            return;
        }

        this.identities = new com.amazonaws.internal.SdkInternalList<String>(identities);
    }

    /**
     * <p>
     * A list of one or more identities. You can specify an identity by using its name or by using its Amazon Resource
     * Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentities(java.util.Collection)} or {@link #withIdentities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param identities
     *        A list of one or more identities. You can specify an identity by using its name or by using its Amazon
     *        Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityNotificationAttributesRequest withIdentities(String... identities) {
        if (this.identities == null) {
            setIdentities(new com.amazonaws.internal.SdkInternalList<String>(identities.length));
        }
        for (String ele : identities) {
            this.identities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more identities. You can specify an identity by using its name or by using its Amazon Resource
     * Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * 
     * @param identities
     *        A list of one or more identities. You can specify an identity by using its name or by using its Amazon
     *        Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityNotificationAttributesRequest withIdentities(java.util.Collection<String> identities) {
        setIdentities(identities);
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
        if (getIdentities() != null)
            sb.append("Identities: ").append(getIdentities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityNotificationAttributesRequest == false)
            return false;
        GetIdentityNotificationAttributesRequest other = (GetIdentityNotificationAttributesRequest) obj;
        if (other.getIdentities() == null ^ this.getIdentities() == null)
            return false;
        if (other.getIdentities() != null && other.getIdentities().equals(this.getIdentities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        return hashCode;
    }

    @Override
    public GetIdentityNotificationAttributesRequest clone() {
        return (GetIdentityNotificationAttributesRequest) super.clone();
    }

}
